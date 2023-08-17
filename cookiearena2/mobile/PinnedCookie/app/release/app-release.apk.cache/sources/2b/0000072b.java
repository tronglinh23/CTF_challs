package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.q0;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends j0 {

    /* renamed from: k  reason: collision with root package name */
    public static final String f6595k = "android:changeImageTransform:matrix";

    /* renamed from: l  reason: collision with root package name */
    public static final String f6596l = "android:changeImageTransform:bounds";

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f6597m = {f6595k, f6596l};

    /* renamed from: n  reason: collision with root package name */
    public static final TypeEvaluator<Matrix> f6598n = new a();

    /* renamed from: o  reason: collision with root package name */
    public static final Property<ImageView, Matrix> f6599o = new b(Matrix.class, "animatedTransform");

    /* loaded from: classes.dex */
    public class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f7, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<ImageView, Matrix> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            w.a(imageView, matrix);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6600a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f6600a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6600a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public i() {
    }

    @d.o0
    public static Matrix A(@d.o0 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i7 = c.f6600a[imageView.getScaleType().ordinal()];
        return i7 != 1 ? i7 != 2 ? new Matrix(imageView.getImageMatrix()) : z(imageView) : D(imageView);
    }

    public static Matrix D(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    public static Matrix z(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f7 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f8 = intrinsicHeight;
        float max = Math.max(width / f7, height / f8);
        int round = Math.round((width - (f7 * max)) / 2.0f);
        int round2 = Math.round((height - (f8 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    public final ObjectAnimator B(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f6599o, (TypeEvaluator) new q0.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @d.o0
    public final ObjectAnimator C(@d.o0 ImageView imageView) {
        Property<ImageView, Matrix> property = f6599o;
        TypeEvaluator<Matrix> typeEvaluator = f6598n;
        Matrix matrix = x.f6819a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    @Override // androidx.transition.j0
    public void captureEndValues(@d.o0 r0 r0Var) {
        captureValues(r0Var);
    }

    @Override // androidx.transition.j0
    public void captureStartValues(@d.o0 r0 r0Var) {
        captureValues(r0Var);
    }

    public final void captureValues(r0 r0Var) {
        View view = r0Var.f6757b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = r0Var.f6756a;
            map.put(f6596l, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put(f6595k, A(imageView));
        }
    }

    @Override // androidx.transition.j0
    @d.q0
    public Animator createAnimator(@d.o0 ViewGroup viewGroup, @d.q0 r0 r0Var, @d.q0 r0 r0Var2) {
        if (r0Var == null || r0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) r0Var.f6756a.get(f6596l);
        Rect rect2 = (Rect) r0Var2.f6756a.get(f6596l);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) r0Var.f6756a.get(f6595k);
        Matrix matrix2 = (Matrix) r0Var2.f6756a.get(f6595k);
        boolean z6 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z6) {
            return null;
        }
        ImageView imageView = (ImageView) r0Var2.f6757b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return C(imageView);
        }
        if (matrix == null) {
            matrix = x.f6819a;
        }
        if (matrix2 == null) {
            matrix2 = x.f6819a;
        }
        f6599o.set(imageView, matrix);
        return B(imageView, matrix, matrix2);
    }

    @Override // androidx.transition.j0
    @d.o0
    public String[] getTransitionProperties() {
        return f6597m;
    }

    public i(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}