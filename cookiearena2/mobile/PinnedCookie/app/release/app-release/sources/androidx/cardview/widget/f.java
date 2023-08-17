package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import d.q0;
import d.w0;
@w0(21)
/* loaded from: classes.dex */
public class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f1885a;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f1887c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f1888d;

    /* renamed from: e  reason: collision with root package name */
    public float f1889e;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f1892h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f1893i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f1894j;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1890f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1891g = true;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f1895k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f1886b = new Paint(5);

    public f(ColorStateList colorStateList, float f7) {
        this.f1885a = f7;
        e(colorStateList);
        this.f1887c = new RectF();
        this.f1888d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f1892h;
    }

    public float c() {
        return this.f1889e;
    }

    public float d() {
        return this.f1885a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z6;
        Paint paint = this.f1886b;
        if (this.f1893i == null || paint.getColorFilter() != null) {
            z6 = false;
        } else {
            paint.setColorFilter(this.f1893i);
            z6 = true;
        }
        RectF rectF = this.f1887c;
        float f7 = this.f1885a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (z6) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1892h = colorStateList;
        this.f1886b.setColor(colorStateList.getColorForState(getState(), this.f1892h.getDefaultColor()));
    }

    public void f(@q0 ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f7, boolean z6, boolean z7) {
        if (f7 == this.f1889e && this.f1890f == z6 && this.f1891g == z7) {
            return;
        }
        this.f1889e = f7;
        this.f1890f = z6;
        this.f1891g = z7;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1888d, this.f1885a);
    }

    public void h(float f7) {
        if (f7 == this.f1885a) {
            return;
        }
        this.f1885a = f7;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1887c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1888d.set(rect);
        if (this.f1890f) {
            this.f1888d.inset((int) Math.ceil(g.c(this.f1889e, this.f1885a, this.f1891g)), (int) Math.ceil(g.d(this.f1889e, this.f1885a, this.f1891g)));
            this.f1887c.set(this.f1888d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1894j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1892h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1892h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z6 = colorForState != this.f1886b.getColor();
        if (z6) {
            this.f1886b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1894j;
        if (colorStateList2 == null || (mode = this.f1895k) == null) {
            return z6;
        }
        this.f1893i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f1886b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1886b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1894j = colorStateList;
        this.f1893i = a(colorStateList, this.f1895k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1895k = mode;
        this.f1893i = a(this.f1894j, mode);
        invalidateSelf();
    }
}
