package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* loaded from: classes.dex */
public class v {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1802c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f1803a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f1804b;

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class a {
        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i7) {
            layerDrawable2.setLayerGravity(i7, layerDrawable.getLayerGravity(i7));
            layerDrawable2.setLayerWidth(i7, layerDrawable.getLayerWidth(i7));
            layerDrawable2.setLayerHeight(i7, layerDrawable.getLayerHeight(i7));
            layerDrawable2.setLayerInsetLeft(i7, layerDrawable.getLayerInsetLeft(i7));
            layerDrawable2.setLayerInsetRight(i7, layerDrawable.getLayerInsetRight(i7));
            layerDrawable2.setLayerInsetTop(i7, layerDrawable.getLayerInsetTop(i7));
            layerDrawable2.setLayerInsetBottom(i7, layerDrawable.getLayerInsetBottom(i7));
            layerDrawable2.setLayerInsetStart(i7, layerDrawable.getLayerInsetStart(i7));
            layerDrawable2.setLayerInsetEnd(i7, layerDrawable.getLayerInsetEnd(i7));
        }
    }

    public v(ProgressBar progressBar) {
        this.f1803a = progressBar;
    }

    public final Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    public Bitmap b() {
        return this.f1804b;
    }

    public void c(AttributeSet attributeSet, int i7) {
        t1 G = t1.G(this.f1803a.getContext(), attributeSet, f1802c, i7, 0);
        Drawable i8 = G.i(0);
        if (i8 != null) {
            this.f1803a.setIndeterminateDrawable(e(i8));
        }
        Drawable i9 = G.i(1);
        if (i9 != null) {
            this.f1803a.setProgressDrawable(d(i9, false));
        }
        G.I();
    }

    @d.l1
    public Drawable d(Drawable drawable, boolean z6) {
        if (drawable instanceof q0.o) {
            q0.o oVar = (q0.o) drawable;
            Drawable b7 = oVar.b();
            if (b7 != null) {
                oVar.a(d(b7, z6));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i7 = 0; i7 < numberOfLayers; i7++) {
                int id = layerDrawable.getId(i7);
                drawableArr[i7] = d(layerDrawable.getDrawable(i7), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i8 = 0; i8 < numberOfLayers; i8++) {
                layerDrawable2.setId(i8, layerDrawable.getId(i8));
                a.a(layerDrawable, layerDrawable2, i8);
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1804b == null) {
                this.f1804b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z6 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i7 = 0; i7 < numberOfFrames; i7++) {
                Drawable d7 = d(animationDrawable.getFrame(i7), true);
                d7.setLevel(10000);
                animationDrawable2.addFrame(d7, animationDrawable.getDuration(i7));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }
}
