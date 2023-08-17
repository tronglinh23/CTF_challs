package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6747a = 1048576;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f6748b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f6749c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f6750d;

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<Matrix> {

        /* renamed from: a  reason: collision with root package name */
        public final float[] f6751a = new float[9];

        /* renamed from: b  reason: collision with root package name */
        public final float[] f6752b = new float[9];

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f6753c = new Matrix();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f7, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f6751a);
            matrix2.getValues(this.f6752b);
            for (int i7 = 0; i7 < 9; i7++) {
                float[] fArr = this.f6752b;
                float f8 = fArr[i7];
                float f9 = this.f6751a[i7];
                fArr[i7] = f9 + ((f8 - f9) * f7);
            }
            this.f6753c.setValues(this.f6752b);
            return this.f6753c;
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f6748b = true;
        f6749c = true;
        f6750d = i7 >= 28;
    }

    public static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        e1.j(view, matrix);
        e1.k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b7 = b(view, matrix, rectF, viewGroup);
        if (b7 != null) {
            imageView.setImageBitmap(b7);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    public static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z6;
        boolean z7;
        int i7;
        ViewGroup viewGroup2;
        if (f6748b) {
            z6 = !view.isAttachedToWindow();
            z7 = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z6 = false;
            z7 = false;
        }
        boolean z8 = f6749c;
        Bitmap bitmap = null;
        if (!z8 || !z6) {
            i7 = 0;
            viewGroup2 = null;
        } else if (!z7) {
            return null;
        } else {
            viewGroup2 = (ViewGroup) view.getParent();
            i7 = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int round3 = Math.round(round * min);
            int round4 = Math.round(round2 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f6750d) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z8 && z6) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i7);
        }
        return bitmap;
    }

    public static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}