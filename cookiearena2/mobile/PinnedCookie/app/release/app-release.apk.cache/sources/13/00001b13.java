package u;

/* loaded from: classes.dex */
public class s implements r {

    /* renamed from: p  reason: collision with root package name */
    public static final float f17046p = 1.0E-5f;

    /* renamed from: a  reason: collision with root package name */
    public float f17047a;

    /* renamed from: b  reason: collision with root package name */
    public float f17048b;

    /* renamed from: c  reason: collision with root package name */
    public float f17049c;

    /* renamed from: d  reason: collision with root package name */
    public float f17050d;

    /* renamed from: e  reason: collision with root package name */
    public float f17051e;

    /* renamed from: f  reason: collision with root package name */
    public float f17052f;

    /* renamed from: g  reason: collision with root package name */
    public float f17053g;

    /* renamed from: h  reason: collision with root package name */
    public float f17054h;

    /* renamed from: i  reason: collision with root package name */
    public float f17055i;

    /* renamed from: j  reason: collision with root package name */
    public int f17056j;

    /* renamed from: k  reason: collision with root package name */
    public String f17057k;

    /* renamed from: m  reason: collision with root package name */
    public float f17059m;

    /* renamed from: n  reason: collision with root package name */
    public float f17060n;

    /* renamed from: l  reason: collision with root package name */
    public boolean f17058l = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f17061o = false;

    @Override // u.r
    public float a() {
        return this.f17058l ? -d(this.f17060n) : d(this.f17060n);
    }

    @Override // u.r
    public String b(String str, float f7) {
        String str2 = str + " ===== " + this.f17057k + "\n";
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        sb.append(this.f17058l ? "backwards" : "forward ");
        sb.append(" time = ");
        sb.append(f7);
        sb.append("  stages ");
        sb.append(this.f17056j);
        sb.append("\n");
        String str3 = sb.toString() + str + " dur " + this.f17050d + " vel " + this.f17047a + " pos " + this.f17053g + "\n";
        if (this.f17056j > 1) {
            str3 = str3 + str + " dur " + this.f17051e + " vel " + this.f17048b + " pos " + this.f17054h + "\n";
        }
        if (this.f17056j > 2) {
            str3 = str3 + str + " dur " + this.f17052f + " vel " + this.f17049c + " pos " + this.f17055i + "\n";
        }
        float f8 = this.f17050d;
        if (f7 <= f8) {
            return str3 + str + "stage 0\n";
        }
        int i7 = this.f17056j;
        if (i7 == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f9 = f7 - f8;
        float f10 = this.f17051e;
        if (f9 < f10) {
            return str3 + str + " stage 1\n";
        } else if (i7 == 2) {
            return str3 + str + "end stage 1\n";
        } else if (f9 - f10 < this.f17052f) {
            return str3 + str + " stage 2\n";
        } else {
            return str3 + str + " end stage 2\n";
        }
    }

    @Override // u.r
    public boolean c() {
        return a() < 1.0E-5f && Math.abs(this.f17055i - this.f17060n) < 1.0E-5f;
    }

    @Override // u.r
    public float d(float f7) {
        float f8 = this.f17050d;
        if (f7 <= f8) {
            float f9 = this.f17047a;
            return f9 + (((this.f17048b - f9) * f7) / f8);
        }
        int i7 = this.f17056j;
        if (i7 == 1) {
            return 0.0f;
        }
        float f10 = f7 - f8;
        float f11 = this.f17051e;
        if (f10 < f11) {
            float f12 = this.f17048b;
            return f12 + (((this.f17049c - f12) * f10) / f11);
        } else if (i7 == 2) {
            return this.f17054h;
        } else {
            float f13 = f10 - f11;
            float f14 = this.f17052f;
            if (f13 < f14) {
                float f15 = this.f17049c;
                return f15 - ((f13 * f15) / f14);
            }
            return this.f17055i;
        }
    }

    public final float e(float f7) {
        this.f17061o = false;
        float f8 = this.f17050d;
        if (f7 <= f8) {
            float f9 = this.f17047a;
            return (f9 * f7) + ((((this.f17048b - f9) * f7) * f7) / (f8 * 2.0f));
        }
        int i7 = this.f17056j;
        if (i7 == 1) {
            return this.f17053g;
        }
        float f10 = f7 - f8;
        float f11 = this.f17051e;
        if (f10 < f11) {
            float f12 = this.f17053g;
            float f13 = this.f17048b;
            return f12 + (f13 * f10) + ((((this.f17049c - f13) * f10) * f10) / (f11 * 2.0f));
        } else if (i7 == 2) {
            return this.f17054h;
        } else {
            float f14 = f10 - f11;
            float f15 = this.f17052f;
            if (f14 > f15) {
                this.f17061o = true;
                return this.f17055i;
            }
            float f16 = this.f17054h;
            float f17 = this.f17049c;
            return (f16 + (f17 * f14)) - (((f17 * f14) * f14) / (f15 * 2.0f));
        }
    }

    public void f(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f17061o = false;
        this.f17059m = f7;
        boolean z6 = f7 > f8;
        this.f17058l = z6;
        if (z6) {
            g(-f9, f7 - f8, f11, f12, f10);
        } else {
            g(f9, f8 - f7, f11, f12, f10);
        }
    }

    public final void g(float f7, float f8, float f9, float f10, float f11) {
        this.f17061o = false;
        if (f7 == 0.0f) {
            f7 = 1.0E-4f;
        }
        this.f17047a = f7;
        float f12 = f7 / f9;
        float f13 = (f12 * f7) / 2.0f;
        if (f7 < 0.0f) {
            float sqrt = (float) Math.sqrt((f8 - ((((-f7) / f9) * f7) / 2.0f)) * f9);
            if (sqrt < f10) {
                this.f17057k = "backward accelerate, decelerate";
                this.f17056j = 2;
                this.f17047a = f7;
                this.f17048b = sqrt;
                this.f17049c = 0.0f;
                float f14 = (sqrt - f7) / f9;
                this.f17050d = f14;
                this.f17051e = sqrt / f9;
                this.f17053g = ((f7 + sqrt) * f14) / 2.0f;
                this.f17054h = f8;
                this.f17055i = f8;
                return;
            }
            this.f17057k = "backward accelerate cruse decelerate";
            this.f17056j = 3;
            this.f17047a = f7;
            this.f17048b = f10;
            this.f17049c = f10;
            float f15 = (f10 - f7) / f9;
            this.f17050d = f15;
            float f16 = f10 / f9;
            this.f17052f = f16;
            float f17 = ((f7 + f10) * f15) / 2.0f;
            float f18 = (f16 * f10) / 2.0f;
            this.f17051e = ((f8 - f17) - f18) / f10;
            this.f17053g = f17;
            this.f17054h = f8 - f18;
            this.f17055i = f8;
        } else if (f13 >= f8) {
            this.f17057k = "hard stop";
            this.f17056j = 1;
            this.f17047a = f7;
            this.f17048b = 0.0f;
            this.f17053g = f8;
            this.f17050d = (2.0f * f8) / f7;
        } else {
            float f19 = f8 - f13;
            float f20 = f19 / f7;
            if (f20 + f12 < f11) {
                this.f17057k = "cruse decelerate";
                this.f17056j = 2;
                this.f17047a = f7;
                this.f17048b = f7;
                this.f17049c = 0.0f;
                this.f17053g = f19;
                this.f17054h = f8;
                this.f17050d = f20;
                this.f17051e = f12;
                return;
            }
            float sqrt2 = (float) Math.sqrt((f9 * f8) + ((f7 * f7) / 2.0f));
            float f21 = (sqrt2 - f7) / f9;
            this.f17050d = f21;
            float f22 = sqrt2 / f9;
            this.f17051e = f22;
            if (sqrt2 < f10) {
                this.f17057k = "accelerate decelerate";
                this.f17056j = 2;
                this.f17047a = f7;
                this.f17048b = sqrt2;
                this.f17049c = 0.0f;
                this.f17050d = f21;
                this.f17051e = f22;
                this.f17053g = ((f7 + sqrt2) * f21) / 2.0f;
                this.f17054h = f8;
                return;
            }
            this.f17057k = "accelerate cruse decelerate";
            this.f17056j = 3;
            this.f17047a = f7;
            this.f17048b = f10;
            this.f17049c = f10;
            float f23 = (f10 - f7) / f9;
            this.f17050d = f23;
            float f24 = f10 / f9;
            this.f17052f = f24;
            float f25 = ((f7 + f10) * f23) / 2.0f;
            float f26 = (f24 * f10) / 2.0f;
            this.f17051e = ((f8 - f25) - f26) / f10;
            this.f17053g = f25;
            this.f17054h = f8 - f26;
            this.f17055i = f8;
        }
    }

    @Override // u.r
    public float getInterpolation(float f7) {
        float e7 = e(f7);
        this.f17060n = f7;
        return this.f17058l ? this.f17059m - e7 : this.f17059m + e7;
    }
}