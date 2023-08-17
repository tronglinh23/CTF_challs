package q0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public abstract class l extends Drawable {

    /* renamed from: n  reason: collision with root package name */
    public static final int f15123n = 3;

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f15124a;

    /* renamed from: b  reason: collision with root package name */
    public int f15125b;

    /* renamed from: e  reason: collision with root package name */
    public final BitmapShader f15128e;

    /* renamed from: g  reason: collision with root package name */
    public float f15130g;

    /* renamed from: k  reason: collision with root package name */
    public boolean f15134k;

    /* renamed from: l  reason: collision with root package name */
    public int f15135l;

    /* renamed from: m  reason: collision with root package name */
    public int f15136m;

    /* renamed from: c  reason: collision with root package name */
    public int f15126c = 119;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f15127d = new Paint(3);

    /* renamed from: f  reason: collision with root package name */
    public final Matrix f15129f = new Matrix();

    /* renamed from: h  reason: collision with root package name */
    public final Rect f15131h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public final RectF f15132i = new RectF();

    /* renamed from: j  reason: collision with root package name */
    public boolean f15133j = true;

    public l(Resources resources, Bitmap bitmap) {
        this.f15125b = 160;
        if (resources != null) {
            this.f15125b = resources.getDisplayMetrics().densityDpi;
        }
        this.f15124a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f15128e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f15136m = -1;
        this.f15135l = -1;
        this.f15128e = null;
    }

    public static boolean j(float f7) {
        return f7 > 0.05f;
    }

    public final void a() {
        this.f15135l = this.f15124a.getScaledWidth(this.f15125b);
        this.f15136m = this.f15124a.getScaledHeight(this.f15125b);
    }

    @q0
    public final Bitmap b() {
        return this.f15124a;
    }

    public float c() {
        return this.f15130g;
    }

    public int d() {
        return this.f15126c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Bitmap bitmap = this.f15124a;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.f15127d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f15131h, this.f15127d);
            return;
        }
        RectF rectF = this.f15132i;
        float f7 = this.f15130g;
        canvas.drawRoundRect(rectF, f7, f7, this.f15127d);
    }

    @o0
    public final Paint e() {
        return this.f15127d;
    }

    public void f(int i7, int i8, int i9, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.f15127d.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15127d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f15127d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15136m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f15135l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f15126c != 119 || this.f15134k || (bitmap = this.f15124a) == null || bitmap.hasAlpha() || this.f15127d.getAlpha() < 255 || j(this.f15130g)) ? -3 : -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.f15134k;
    }

    public void k(boolean z6) {
        this.f15127d.setAntiAlias(z6);
        invalidateSelf();
    }

    public void l(boolean z6) {
        this.f15134k = z6;
        this.f15133j = true;
        if (!z6) {
            m(0.0f);
            return;
        }
        s();
        this.f15127d.setShader(this.f15128e);
        invalidateSelf();
    }

    public void m(float f7) {
        if (this.f15130g == f7) {
            return;
        }
        this.f15134k = false;
        if (j(f7)) {
            this.f15127d.setShader(this.f15128e);
        } else {
            this.f15127d.setShader(null);
        }
        this.f15130g = f7;
        invalidateSelf();
    }

    public void n(int i7) {
        if (this.f15126c != i7) {
            this.f15126c = i7;
            this.f15133j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z6) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@o0 Rect rect) {
        super.onBoundsChange(rect);
        if (this.f15134k) {
            s();
        }
        this.f15133j = true;
    }

    public void p(int i7) {
        if (this.f15125b != i7) {
            if (i7 == 0) {
                i7 = 160;
            }
            this.f15125b = i7;
            if (this.f15124a != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(@o0 Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(@o0 DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    public final void s() {
        this.f15130g = Math.min(this.f15136m, this.f15135l) / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (i7 != this.f15127d.getAlpha()) {
            this.f15127d.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15127d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z6) {
        this.f15127d.setDither(z6);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z6) {
        this.f15127d.setFilterBitmap(z6);
        invalidateSelf();
    }

    public void t() {
        if (this.f15133j) {
            if (this.f15134k) {
                int min = Math.min(this.f15135l, this.f15136m);
                f(this.f15126c, min, min, getBounds(), this.f15131h);
                int min2 = Math.min(this.f15131h.width(), this.f15131h.height());
                this.f15131h.inset(Math.max(0, (this.f15131h.width() - min2) / 2), Math.max(0, (this.f15131h.height() - min2) / 2));
                this.f15130g = min2 * 0.5f;
            } else {
                f(this.f15126c, this.f15135l, this.f15136m, getBounds(), this.f15131h);
            }
            this.f15132i.set(this.f15131h);
            if (this.f15128e != null) {
                Matrix matrix = this.f15129f;
                RectF rectF = this.f15132i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f15129f.preScale(this.f15132i.width() / this.f15124a.getWidth(), this.f15132i.height() / this.f15124a.getHeight());
                this.f15128e.setLocalMatrix(this.f15129f);
                this.f15127d.setShader(this.f15128e);
            }
            this.f15133j = false;
        }
    }
}
