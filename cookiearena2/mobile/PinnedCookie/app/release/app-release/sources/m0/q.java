package m0;

import d.o0;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: k  reason: collision with root package name */
    public static final q f13470k = k(b.f13422c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a  reason: collision with root package name */
    public final float f13471a;

    /* renamed from: b  reason: collision with root package name */
    public final float f13472b;

    /* renamed from: c  reason: collision with root package name */
    public final float f13473c;

    /* renamed from: d  reason: collision with root package name */
    public final float f13474d;

    /* renamed from: e  reason: collision with root package name */
    public final float f13475e;

    /* renamed from: f  reason: collision with root package name */
    public final float f13476f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f13477g;

    /* renamed from: h  reason: collision with root package name */
    public final float f13478h;

    /* renamed from: i  reason: collision with root package name */
    public final float f13479i;

    /* renamed from: j  reason: collision with root package name */
    public final float f13480j;

    public q(float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr, float f13, float f14, float f15) {
        this.f13476f = f7;
        this.f13471a = f8;
        this.f13472b = f9;
        this.f13473c = f10;
        this.f13474d = f11;
        this.f13475e = f12;
        this.f13477g = fArr;
        this.f13478h = f13;
        this.f13479i = f14;
        this.f13480j = f15;
    }

    @o0
    public static q k(@o0 float[] fArr, float f7, float f8, float f9, boolean z6) {
        float[][] fArr2 = b.f13420a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = f11 + (fArr3[1] * f12);
        float f14 = fArr[2];
        float f15 = f13 + (fArr3[2] * f14);
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[0] * f10) + (fArr4[1] * f12) + (fArr4[2] * f14);
        float[] fArr5 = fArr2[2];
        float f17 = (f10 * fArr5[0]) + (f12 * fArr5[1]) + (f14 * fArr5[2]);
        float f18 = (f9 / 10.0f) + 0.8f;
        float d7 = ((double) f18) >= 0.9d ? b.d(0.59f, 0.69f, (f18 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f18 - 0.8f) * 10.0f);
        float exp = z6 ? 1.0f : (1.0f - (((float) Math.exp(((-f7) - 42.0f) / 92.0f)) * 0.2777778f)) * f18;
        double d8 = exp;
        if (d8 > 1.0d) {
            exp = 1.0f;
        } else if (d8 < androidx.cardview.widget.g.f1896q) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp};
        float f19 = 1.0f / ((5.0f * f7) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float cbrt = (f20 * f7) + (0.1f * f21 * f21 * ((float) Math.cbrt(f7 * 5.0d)));
        float h7 = b.h(f8) / fArr[1];
        double d9 = h7;
        float sqrt = ((float) Math.sqrt(d9)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d9, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f17) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f16) / 100.0d, 0.42d), pow2};
        float f22 = fArr7[0];
        float f23 = fArr7[1];
        return new q(h7, ((((f22 * 400.0f) / (f22 + 27.13f)) * 2.0f) + ((f23 * 400.0f) / (f23 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, d7, f18, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float a() {
        return this.f13471a;
    }

    public float b() {
        return this.f13474d;
    }

    public float c() {
        return this.f13478h;
    }

    public float d() {
        return this.f13479i;
    }

    public float e() {
        return this.f13476f;
    }

    public float f() {
        return this.f13472b;
    }

    public float g() {
        return this.f13475e;
    }

    public float h() {
        return this.f13473c;
    }

    @o0
    public float[] i() {
        return this.f13477g;
    }

    public float j() {
        return this.f13480j;
    }
}
