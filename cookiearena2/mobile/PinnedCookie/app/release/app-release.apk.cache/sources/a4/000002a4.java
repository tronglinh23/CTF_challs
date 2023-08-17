package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import d.q0;
import o.a;

/* loaded from: classes.dex */
public class g extends Drawable {

    /* renamed from: q  reason: collision with root package name */
    public static final double f1896q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r  reason: collision with root package name */
    public static final float f1897r = 1.5f;

    /* renamed from: s  reason: collision with root package name */
    public static a f1898s;

    /* renamed from: a  reason: collision with root package name */
    public final int f1899a;

    /* renamed from: c  reason: collision with root package name */
    public Paint f1901c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f1902d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f1903e;

    /* renamed from: f  reason: collision with root package name */
    public float f1904f;

    /* renamed from: g  reason: collision with root package name */
    public Path f1905g;

    /* renamed from: h  reason: collision with root package name */
    public float f1906h;

    /* renamed from: i  reason: collision with root package name */
    public float f1907i;

    /* renamed from: j  reason: collision with root package name */
    public float f1908j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f1909k;

    /* renamed from: m  reason: collision with root package name */
    public final int f1911m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1912n;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1910l = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1913o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1914p = false;

    /* renamed from: b  reason: collision with root package name */
    public Paint f1900b = new Paint(5);

    /* loaded from: classes.dex */
    public interface a {
        void a(Canvas canvas, RectF rectF, float f7, Paint paint);
    }

    public g(Resources resources, ColorStateList colorStateList, float f7, float f8, float f9) {
        this.f1911m = resources.getColor(a.b.f14241d);
        this.f1912n = resources.getColor(a.b.f14240c);
        this.f1899a = resources.getDimensionPixelSize(a.c.f14242a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f1901c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1904f = (int) (f7 + 0.5f);
        this.f1903e = new RectF();
        Paint paint2 = new Paint(this.f1901c);
        this.f1902d = paint2;
        paint2.setAntiAlias(false);
        s(f8, f9);
    }

    public static float c(float f7, float f8, boolean z6) {
        return z6 ? (float) (f7 + ((1.0d - f1896q) * f8)) : f7;
    }

    public static float d(float f7, float f8, boolean z6) {
        return z6 ? (float) ((f7 * 1.5f) + ((1.0d - f1896q) * f8)) : f7 * 1.5f;
    }

    public final void a(Rect rect) {
        float f7 = this.f1906h;
        float f8 = 1.5f * f7;
        this.f1903e.set(rect.left + f7, rect.top + f8, rect.right - f7, rect.bottom - f8);
        b();
    }

    public final void b() {
        float f7 = this.f1904f;
        RectF rectF = new RectF(-f7, -f7, f7, f7);
        RectF rectF2 = new RectF(rectF);
        float f8 = this.f1907i;
        rectF2.inset(-f8, -f8);
        Path path = this.f1905g;
        if (path == null) {
            this.f1905g = new Path();
        } else {
            path.reset();
        }
        this.f1905g.setFillType(Path.FillType.EVEN_ODD);
        this.f1905g.moveTo(-this.f1904f, 0.0f);
        this.f1905g.rLineTo(-this.f1907i, 0.0f);
        this.f1905g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1905g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1905g.close();
        float f9 = this.f1904f;
        float f10 = f9 / (this.f1907i + f9);
        Paint paint = this.f1901c;
        float f11 = this.f1904f + this.f1907i;
        int i7 = this.f1911m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f11, new int[]{i7, i7, this.f1912n}, new float[]{0.0f, f10, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1902d;
        float f12 = this.f1904f;
        float f13 = this.f1907i;
        int i8 = this.f1911m;
        paint2.setShader(new LinearGradient(0.0f, (-f12) + f13, 0.0f, (-f12) - f13, new int[]{i8, i8, this.f1912n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1902d.setAntiAlias(false);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1910l) {
            a(getBounds());
            this.f1910l = false;
        }
        canvas.translate(0.0f, this.f1908j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f1908j) / 2.0f);
        f1898s.a(canvas, this.f1903e, this.f1904f, this.f1900b);
    }

    public final void e(Canvas canvas) {
        float f7 = this.f1904f;
        float f8 = (-f7) - this.f1907i;
        float f9 = f7 + this.f1899a + (this.f1908j / 2.0f);
        float f10 = f9 * 2.0f;
        boolean z6 = this.f1903e.width() - f10 > 0.0f;
        boolean z7 = this.f1903e.height() - f10 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1903e;
        canvas.translate(rectF.left + f9, rectF.top + f9);
        canvas.drawPath(this.f1905g, this.f1901c);
        if (z6) {
            canvas.drawRect(0.0f, f8, this.f1903e.width() - f10, -this.f1904f, this.f1902d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1903e;
        canvas.translate(rectF2.right - f9, rectF2.bottom - f9);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1905g, this.f1901c);
        if (z6) {
            canvas.drawRect(0.0f, f8, this.f1903e.width() - f10, (-this.f1904f) + this.f1907i, this.f1902d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1903e;
        canvas.translate(rectF3.left + f9, rectF3.bottom - f9);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1905g, this.f1901c);
        if (z7) {
            canvas.drawRect(0.0f, f8, this.f1903e.height() - f10, -this.f1904f, this.f1902d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1903e;
        canvas.translate(rectF4.right - f9, rectF4.top + f9);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1905g, this.f1901c);
        if (z7) {
            canvas.drawRect(0.0f, f8, this.f1903e.height() - f10, -this.f1904f, this.f1902d);
        }
        canvas.restoreToCount(save4);
    }

    public ColorStateList f() {
        return this.f1909k;
    }

    public float g() {
        return this.f1904f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.f1906h, this.f1904f, this.f1913o));
        int ceil2 = (int) Math.ceil(c(this.f1906h, this.f1904f, this.f1913o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public void h(Rect rect) {
        getPadding(rect);
    }

    public float i() {
        return this.f1906h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1909k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public float j() {
        float f7 = this.f1906h;
        return (Math.max(f7, this.f1904f + this.f1899a + ((f7 * 1.5f) / 2.0f)) * 2.0f) + (((this.f1906h * 1.5f) + this.f1899a) * 2.0f);
    }

    public float k() {
        float f7 = this.f1906h;
        return (Math.max(f7, this.f1904f + this.f1899a + (f7 / 2.0f)) * 2.0f) + ((this.f1906h + this.f1899a) * 2.0f);
    }

    public float l() {
        return this.f1908j;
    }

    public void m(boolean z6) {
        this.f1913o = z6;
        invalidateSelf();
    }

    public final void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1909k = colorStateList;
        this.f1900b.setColor(colorStateList.getColorForState(getState(), this.f1909k.getDefaultColor()));
    }

    public void o(@q0 ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1910l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1909k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1900b.getColor() == colorForState) {
            return false;
        }
        this.f1900b.setColor(colorForState);
        this.f1910l = true;
        invalidateSelf();
        return true;
    }

    public void p(float f7) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f7 + ". Must be >= 0");
        }
        float f8 = (int) (f7 + 0.5f);
        if (this.f1904f == f8) {
            return;
        }
        this.f1904f = f8;
        this.f1910l = true;
        invalidateSelf();
    }

    public void q(float f7) {
        s(this.f1908j, f7);
    }

    public void r(float f7) {
        s(f7, this.f1906h);
    }

    public final void s(float f7, float f8) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f7 + ". Must be >= 0");
        } else if (f8 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f8 + ". Must be >= 0");
        } else {
            float t6 = t(f7);
            float t7 = t(f8);
            if (t6 > t7) {
                if (!this.f1914p) {
                    this.f1914p = true;
                }
                t6 = t7;
            }
            if (this.f1908j == t6 && this.f1906h == t7) {
                return;
            }
            this.f1908j = t6;
            this.f1906h = t7;
            this.f1907i = (int) ((t6 * 1.5f) + this.f1899a + 0.5f);
            this.f1910l = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f1900b.setAlpha(i7);
        this.f1901c.setAlpha(i7);
        this.f1902d.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1900b.setColorFilter(colorFilter);
    }

    public final int t(float f7) {
        int i7 = (int) (f7 + 0.5f);
        return i7 % 2 == 1 ? i7 - 1 : i7;
    }
}