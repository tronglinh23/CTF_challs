package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.b;
import d.b1;
import d.x;
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: k  reason: collision with root package name */
    public static final float f4006k = 10000.0f;

    /* renamed from: l  reason: collision with root package name */
    public static final float f4007l = 1500.0f;

    /* renamed from: m  reason: collision with root package name */
    public static final float f4008m = 200.0f;

    /* renamed from: n  reason: collision with root package name */
    public static final float f4009n = 50.0f;

    /* renamed from: o  reason: collision with root package name */
    public static final float f4010o = 0.2f;

    /* renamed from: p  reason: collision with root package name */
    public static final float f4011p = 0.5f;

    /* renamed from: q  reason: collision with root package name */
    public static final float f4012q = 0.75f;

    /* renamed from: r  reason: collision with root package name */
    public static final float f4013r = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    public static final double f4014s = 62.5d;

    /* renamed from: t  reason: collision with root package name */
    public static final double f4015t = Double.MAX_VALUE;

    /* renamed from: a  reason: collision with root package name */
    public double f4016a;

    /* renamed from: b  reason: collision with root package name */
    public double f4017b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4018c;

    /* renamed from: d  reason: collision with root package name */
    public double f4019d;

    /* renamed from: e  reason: collision with root package name */
    public double f4020e;

    /* renamed from: f  reason: collision with root package name */
    public double f4021f;

    /* renamed from: g  reason: collision with root package name */
    public double f4022g;

    /* renamed from: h  reason: collision with root package name */
    public double f4023h;

    /* renamed from: i  reason: collision with root package name */
    public double f4024i;

    /* renamed from: j  reason: collision with root package name */
    public final b.p f4025j;

    public h() {
        this.f4016a = Math.sqrt(1500.0d);
        this.f4017b = 0.5d;
        this.f4018c = false;
        this.f4024i = Double.MAX_VALUE;
        this.f4025j = new b.p();
    }

    @Override // androidx.dynamicanimation.animation.f
    @b1({b1.a.LIBRARY})
    public boolean a(float f7, float f8) {
        return ((double) Math.abs(f8)) < this.f4020e && ((double) Math.abs(f7 - d())) < this.f4019d;
    }

    @Override // androidx.dynamicanimation.animation.f
    @b1({b1.a.LIBRARY})
    public float b(float f7, float f8) {
        float d7 = f7 - d();
        double d8 = this.f4016a;
        return (float) (((-(d8 * d8)) * d7) - (((d8 * 2.0d) * this.f4017b) * f8));
    }

    public float c() {
        return (float) this.f4017b;
    }

    public float d() {
        return (float) this.f4024i;
    }

    public float e() {
        double d7 = this.f4016a;
        return (float) (d7 * d7);
    }

    public final void f() {
        if (this.f4018c) {
            return;
        }
        if (this.f4024i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d7 = this.f4017b;
        if (d7 > 1.0d) {
            double d8 = this.f4016a;
            this.f4021f = ((-d7) * d8) + (d8 * Math.sqrt((d7 * d7) - 1.0d));
            double d9 = this.f4017b;
            double d10 = this.f4016a;
            this.f4022g = ((-d9) * d10) - (d10 * Math.sqrt((d9 * d9) - 1.0d));
        } else if (d7 >= androidx.cardview.widget.g.f1896q && d7 < 1.0d) {
            this.f4023h = this.f4016a * Math.sqrt(1.0d - (d7 * d7));
        }
        this.f4018c = true;
    }

    public h g(@x(from = 0.0d) float f7) {
        if (f7 >= 0.0f) {
            this.f4017b = f7;
            this.f4018c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public h h(float f7) {
        this.f4024i = f7;
        return this;
    }

    public h i(@x(from = 0.0d, fromInclusive = false) float f7) {
        if (f7 > 0.0f) {
            this.f4016a = Math.sqrt(f7);
            this.f4018c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public void j(double d7) {
        double abs = Math.abs(d7);
        this.f4019d = abs;
        this.f4020e = abs * 62.5d;
    }

    public b.p k(double d7, double d8, long j7) {
        double cos;
        double d9;
        f();
        double d10 = j7 / 1000.0d;
        double d11 = d7 - this.f4024i;
        double d12 = this.f4017b;
        if (d12 > 1.0d) {
            double d13 = this.f4022g;
            double d14 = this.f4021f;
            double d15 = d11 - (((d13 * d11) - d8) / (d13 - d14));
            double d16 = ((d11 * d13) - d8) / (d13 - d14);
            d9 = (Math.pow(2.718281828459045d, d13 * d10) * d15) + (Math.pow(2.718281828459045d, this.f4021f * d10) * d16);
            double d17 = this.f4022g;
            double pow = d15 * d17 * Math.pow(2.718281828459045d, d17 * d10);
            double d18 = this.f4021f;
            cos = pow + (d16 * d18 * Math.pow(2.718281828459045d, d18 * d10));
        } else if (d12 == 1.0d) {
            double d19 = this.f4016a;
            double d20 = d8 + (d19 * d11);
            double d21 = d11 + (d20 * d10);
            d9 = Math.pow(2.718281828459045d, (-d19) * d10) * d21;
            double pow2 = d21 * Math.pow(2.718281828459045d, (-this.f4016a) * d10);
            double d22 = this.f4016a;
            cos = (d20 * Math.pow(2.718281828459045d, (-d22) * d10)) + (pow2 * (-d22));
        } else {
            double d23 = 1.0d / this.f4023h;
            double d24 = this.f4016a;
            double d25 = d23 * ((d12 * d24 * d11) + d8);
            double pow3 = Math.pow(2.718281828459045d, (-d12) * d24 * d10) * ((Math.cos(this.f4023h * d10) * d11) + (Math.sin(this.f4023h * d10) * d25));
            double d26 = this.f4016a;
            double d27 = this.f4017b;
            double d28 = (-d26) * pow3 * d27;
            double pow4 = Math.pow(2.718281828459045d, (-d27) * d26 * d10);
            double d29 = this.f4023h;
            double sin = (-d29) * d11 * Math.sin(d29 * d10);
            double d30 = this.f4023h;
            cos = d28 + (pow4 * (sin + (d25 * d30 * Math.cos(d30 * d10))));
            d9 = pow3;
        }
        b.p pVar = this.f4025j;
        pVar.f3997a = (float) (d9 + this.f4024i);
        pVar.f3998b = (float) cos;
        return pVar;
    }

    public h(float f7) {
        this.f4016a = Math.sqrt(1500.0d);
        this.f4017b = 0.5d;
        this.f4018c = false;
        this.f4024i = Double.MAX_VALUE;
        this.f4025j = new b.p();
        this.f4024i = f7;
    }
}
