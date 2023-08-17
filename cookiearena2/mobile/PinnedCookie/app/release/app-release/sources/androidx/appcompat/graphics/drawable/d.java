package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.g;
import com.google.android.material.color.utilities.Contrast;
import d.b1;
import d.l;
import d.x;
import f.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public class d extends Drawable {

    /* renamed from: m  reason: collision with root package name */
    public static final int f1003m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f1004n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f1005o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f1006p = 3;

    /* renamed from: q  reason: collision with root package name */
    public static final float f1007q = (float) Math.toRadians(45.0d);

    /* renamed from: a  reason: collision with root package name */
    public final Paint f1008a;

    /* renamed from: b  reason: collision with root package name */
    public float f1009b;

    /* renamed from: c  reason: collision with root package name */
    public float f1010c;

    /* renamed from: d  reason: collision with root package name */
    public float f1011d;

    /* renamed from: e  reason: collision with root package name */
    public float f1012e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1013f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f1014g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1015h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1016i;

    /* renamed from: j  reason: collision with root package name */
    public float f1017j;

    /* renamed from: k  reason: collision with root package name */
    public float f1018k;

    /* renamed from: l  reason: collision with root package name */
    public int f1019l;

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public d(Context context) {
        Paint paint = new Paint();
        this.f1008a = paint;
        this.f1014g = new Path();
        this.f1016i = false;
        this.f1019l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, a.m.C3, a.b.f8915o1, a.l.f9395v1);
        p(obtainStyledAttributes.getColor(a.m.G3, 0));
        o(obtainStyledAttributes.getDimension(a.m.K3, 0.0f));
        s(obtainStyledAttributes.getBoolean(a.m.J3, true));
        r(Math.round(obtainStyledAttributes.getDimension(a.m.I3, 0.0f)));
        this.f1015h = obtainStyledAttributes.getDimensionPixelSize(a.m.H3, 0);
        this.f1010c = Math.round(obtainStyledAttributes.getDimension(a.m.F3, 0.0f));
        this.f1009b = Math.round(obtainStyledAttributes.getDimension(a.m.D3, 0.0f));
        this.f1011d = obtainStyledAttributes.getDimension(a.m.E3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float k(float f7, float f8, float f9) {
        return f7 + ((f8 - f7) * f9);
    }

    public float a() {
        return this.f1009b;
    }

    public float b() {
        return this.f1011d;
    }

    public float c() {
        return this.f1010c;
    }

    public float d() {
        return this.f1008a.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i7 = this.f1019l;
        boolean z6 = false;
        if (i7 != 0 && (i7 == 1 || (i7 == 3 ? q0.c.f(this) == 0 : q0.c.f(this) == 1))) {
            z6 = true;
        }
        float f7 = this.f1009b;
        float k7 = k(this.f1010c, (float) Math.sqrt(f7 * f7 * 2.0f), this.f1017j);
        float k8 = k(this.f1010c, this.f1011d, this.f1017j);
        float round = Math.round(k(0.0f, this.f1018k, this.f1017j));
        float k9 = k(0.0f, f1007q, this.f1017j);
        float k10 = k(z6 ? 0.0f : -180.0f, z6 ? 180.0f : 0.0f, this.f1017j);
        double d7 = k7;
        double d8 = k9;
        boolean z7 = z6;
        float round2 = (float) Math.round(Math.cos(d8) * d7);
        float round3 = (float) Math.round(d7 * Math.sin(d8));
        this.f1014g.rewind();
        float k11 = k(this.f1012e + this.f1008a.getStrokeWidth(), -this.f1018k, this.f1017j);
        float f8 = (-k8) / 2.0f;
        this.f1014g.moveTo(f8 + round, 0.0f);
        this.f1014g.rLineTo(k8 - (round * 2.0f), 0.0f);
        this.f1014g.moveTo(f8, k11);
        this.f1014g.rLineTo(round2, round3);
        this.f1014g.moveTo(f8, -k11);
        this.f1014g.rLineTo(round2, -round3);
        this.f1014g.close();
        canvas.save();
        float strokeWidth = this.f1008a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f1012e);
        if (this.f1013f) {
            canvas.rotate(k10 * (this.f1016i ^ z7 ? -1 : 1));
        } else if (z7) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f1014g, this.f1008a);
        canvas.restore();
    }

    @l
    public int e() {
        return this.f1008a.getColor();
    }

    public int f() {
        return this.f1019l;
    }

    public float g() {
        return this.f1012e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1015h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1015h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f1008a;
    }

    @x(from = g.f1896q, to = Contrast.RATIO_MIN)
    public float i() {
        return this.f1017j;
    }

    public boolean j() {
        return this.f1013f;
    }

    public void l(float f7) {
        if (this.f1009b != f7) {
            this.f1009b = f7;
            invalidateSelf();
        }
    }

    public void m(float f7) {
        if (this.f1011d != f7) {
            this.f1011d = f7;
            invalidateSelf();
        }
    }

    public void n(float f7) {
        if (this.f1010c != f7) {
            this.f1010c = f7;
            invalidateSelf();
        }
    }

    public void o(float f7) {
        if (this.f1008a.getStrokeWidth() != f7) {
            this.f1008a.setStrokeWidth(f7);
            this.f1018k = (float) ((f7 / 2.0f) * Math.cos(f1007q));
            invalidateSelf();
        }
    }

    public void p(@l int i7) {
        if (i7 != this.f1008a.getColor()) {
            this.f1008a.setColor(i7);
            invalidateSelf();
        }
    }

    public void q(int i7) {
        if (i7 != this.f1019l) {
            this.f1019l = i7;
            invalidateSelf();
        }
    }

    public void r(float f7) {
        if (f7 != this.f1012e) {
            this.f1012e = f7;
            invalidateSelf();
        }
    }

    public void s(boolean z6) {
        if (this.f1013f != z6) {
            this.f1013f = z6;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (i7 != this.f1008a.getAlpha()) {
            this.f1008a.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1008a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@x(from = 0.0d, to = 1.0d) float f7) {
        if (this.f1017j != f7) {
            this.f1017j = f7;
            invalidateSelf();
        }
    }

    public void t(boolean z6) {
        if (this.f1016i != z6) {
            this.f1016i = z6;
            invalidateSelf();
        }
    }
}
