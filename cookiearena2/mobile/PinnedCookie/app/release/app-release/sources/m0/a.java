package m0;

import d.o0;
import d.q0;
import d.x;
import p0.p0;
/* loaded from: classes.dex */
public class a {

    /* renamed from: j  reason: collision with root package name */
    public static final float f13407j = 0.2f;

    /* renamed from: k  reason: collision with root package name */
    public static final float f13408k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public static final float f13409l = 0.4f;

    /* renamed from: m  reason: collision with root package name */
    public static final float f13410m = 0.01f;

    /* renamed from: a  reason: collision with root package name */
    public final float f13411a;

    /* renamed from: b  reason: collision with root package name */
    public final float f13412b;

    /* renamed from: c  reason: collision with root package name */
    public final float f13413c;

    /* renamed from: d  reason: collision with root package name */
    public final float f13414d;

    /* renamed from: e  reason: collision with root package name */
    public final float f13415e;

    /* renamed from: f  reason: collision with root package name */
    public final float f13416f;

    /* renamed from: g  reason: collision with root package name */
    public final float f13417g;

    /* renamed from: h  reason: collision with root package name */
    public final float f13418h;

    /* renamed from: i  reason: collision with root package name */
    public final float f13419i;

    public a(float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f13411a = f7;
        this.f13412b = f8;
        this.f13413c = f9;
        this.f13414d = f10;
        this.f13415e = f11;
        this.f13416f = f12;
        this.f13417g = f13;
        this.f13418h = f14;
        this.f13419i = f15;
    }

    @q0
    public static a b(@x(from = 0.0d, to = 360.0d) float f7, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f8, @x(from = 0.0d, to = 100.0d) float f9) {
        float f10 = 100.0f;
        float f11 = 1000.0f;
        float f12 = 0.0f;
        a aVar = null;
        float f13 = 1000.0f;
        while (Math.abs(f12 - f10) > 0.01f) {
            float f14 = ((f10 - f12) / 2.0f) + f12;
            int s6 = e(f14, f8, f7).s();
            float b7 = b.b(s6);
            float abs = Math.abs(f9 - b7);
            if (abs < 0.2f) {
                a c7 = c(s6);
                float a7 = c7.a(e(c7.k(), c7.i(), f7));
                if (a7 <= 1.0f) {
                    aVar = c7;
                    f11 = abs;
                    f13 = a7;
                }
            }
            if (f11 == 0.0f && f13 == 0.0f) {
                break;
            } else if (b7 < f9) {
                f12 = f14;
            } else {
                f10 = f14;
            }
        }
        return aVar;
    }

    @o0
    public static a c(@d.l int i7) {
        return d(i7, q.f13470k);
    }

    @o0
    public static a d(@d.l int i7, @o0 q qVar) {
        float[] f7 = b.f(i7);
        float[][] fArr = b.f13420a;
        float f8 = f7[0];
        float[] fArr2 = fArr[0];
        float f9 = fArr2[0] * f8;
        float f10 = f7[1];
        float f11 = f9 + (fArr2[1] * f10);
        float f12 = f7[2];
        float f13 = f11 + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[0] * f8) + (fArr3[1] * f10) + (fArr3[2] * f12);
        float[] fArr4 = fArr[2];
        float f15 = (f8 * fArr4[0]) + (f10 * fArr4[1]) + (f12 * fArr4[2]);
        float f16 = qVar.i()[0] * f13;
        float f17 = qVar.i()[1] * f14;
        float f18 = qVar.i()[2] * f15;
        float pow = (float) Math.pow((qVar.c() * Math.abs(f16)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((qVar.c() * Math.abs(f17)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((qVar.c() * Math.abs(f18)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d7 = signum3;
        float f19 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d7)) / 11.0f;
        float f20 = ((float) ((signum + signum2) - (d7 * 2.0d))) / 9.0f;
        float f21 = signum2 * 20.0f;
        float f22 = (((signum * 20.0f) + f21) + (21.0f * signum3)) / 20.0f;
        float f23 = (((signum * 40.0f) + f21) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f24 = atan2;
        float f25 = (3.1415927f * f24) / 180.0f;
        float pow4 = ((float) Math.pow((f23 * qVar.f()) / qVar.a(), qVar.b() * qVar.j())) * 100.0f;
        float d8 = qVar.d() * (4.0f / qVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (qVar.a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, qVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f24) < 20.14d ? 360.0f + f24 : f24) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * qVar.g()) * qVar.h()) * ((float) Math.sqrt((f19 * f19) + (f20 * f20)))) / (f22 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float d9 = pow5 * qVar.d();
        float sqrt = ((float) Math.sqrt((r3 * qVar.b()) / (qVar.a() + 4.0f))) * 50.0f;
        float f26 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d9) + 1.0f)) * 43.85965f;
        double d10 = f25;
        return new a(f24, pow5, pow4, d8, d9, sqrt, f26, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    @o0
    public static a e(@x(from = 0.0d, to = 100.0d) float f7, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f8, @x(from = 0.0d, to = 360.0d) float f9) {
        return f(f7, f8, f9, q.f13470k);
    }

    @o0
    public static a f(@x(from = 0.0d, to = 100.0d) float f7, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f8, @x(from = 0.0d, to = 360.0d) float f9, q qVar) {
        float b7 = (4.0f / qVar.b()) * ((float) Math.sqrt(f7 / 100.0d)) * (qVar.a() + 4.0f) * qVar.d();
        float d7 = f8 * qVar.d();
        float sqrt = ((float) Math.sqrt(((f8 / ((float) Math.sqrt(r4))) * qVar.b()) / (qVar.a() + 4.0f))) * 50.0f;
        float f10 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float log = ((float) Math.log((d7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f9) / 180.0f;
        return new a(f9, f8, f7, b7, d7, sqrt, f10, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    public static int p(@x(from = 0.0d, to = 360.0d) float f7, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f8, @x(from = 0.0d, to = 100.0d) float f9) {
        return q(f7, f8, f9, q.f13470k);
    }

    @d.l
    public static int q(@x(from = 0.0d, to = 360.0d) float f7, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f8, @x(from = 0.0d, to = 100.0d) float f9, @o0 q qVar) {
        if (f8 < 1.0d || Math.round(f9) <= androidx.cardview.widget.g.f1896q || Math.round(f9) >= 100.0d) {
            return b.a(f9);
        }
        float min = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
        a aVar = null;
        boolean z6 = true;
        float f10 = 0.0f;
        float f11 = f8;
        while (Math.abs(f10 - f8) >= 0.4f) {
            a b7 = b(min, f11, f9);
            if (!z6) {
                if (b7 == null) {
                    f8 = f11;
                } else {
                    f10 = f11;
                    aVar = b7;
                }
                f11 = ((f8 - f10) / 2.0f) + f10;
            } else if (b7 != null) {
                return b7.r(qVar);
            } else {
                f11 = ((f8 - f10) / 2.0f) + f10;
                z6 = false;
            }
        }
        return aVar == null ? b.a(f9) : aVar.r(qVar);
    }

    public float a(@o0 a aVar) {
        float l7 = l() - aVar.l();
        float g7 = g() - aVar.g();
        float h7 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((l7 * l7) + (g7 * g7) + (h7 * h7)), 0.63d) * 1.41d);
    }

    @x(from = u4.x.f17517e, fromInclusive = false, to = u4.x.f17516d, toInclusive = false)
    public float g() {
        return this.f13418h;
    }

    @x(from = u4.x.f17517e, fromInclusive = false, to = u4.x.f17516d, toInclusive = false)
    public float h() {
        return this.f13419i;
    }

    @x(from = androidx.cardview.widget.g.f1896q, to = u4.x.f17516d, toInclusive = false)
    public float i() {
        return this.f13412b;
    }

    @x(from = androidx.cardview.widget.g.f1896q, to = 360.0d, toInclusive = false)
    public float j() {
        return this.f13411a;
    }

    @x(from = androidx.cardview.widget.g.f1896q, to = p0.f14557b)
    public float k() {
        return this.f13413c;
    }

    @x(from = androidx.cardview.widget.g.f1896q, to = p0.f14557b)
    public float l() {
        return this.f13417g;
    }

    @x(from = androidx.cardview.widget.g.f1896q, to = u4.x.f17516d, toInclusive = false)
    public float m() {
        return this.f13415e;
    }

    @x(from = androidx.cardview.widget.g.f1896q, to = u4.x.f17516d, toInclusive = false)
    public float n() {
        return this.f13414d;
    }

    @x(from = androidx.cardview.widget.g.f1896q, to = u4.x.f17516d, toInclusive = false)
    public float o() {
        return this.f13416f;
    }

    @d.l
    public int r(@o0 q qVar) {
        float pow = (float) Math.pow(((((double) i()) == androidx.cardview.widget.g.f1896q || ((double) k()) == androidx.cardview.widget.g.f1896q) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, qVar.e()), 0.73d), 1.1111111111111112d);
        double j7 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j7) + 3.8d)) * 0.25f;
        float a7 = qVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / qVar.b()) / qVar.j()));
        float g7 = cos * 3846.1538f * qVar.g() * qVar.h();
        float f7 = a7 / qVar.f();
        float sin = (float) Math.sin(j7);
        float cos2 = (float) Math.cos(j7);
        float f8 = (((0.305f + f7) * 23.0f) * pow) / (((g7 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f9 = cos2 * f8;
        float f10 = f8 * sin;
        float f11 = f7 * 460.0f;
        float f12 = (((451.0f * f9) + f11) + (288.0f * f10)) / 1403.0f;
        float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
        float signum = Math.signum(f12) * (100.0f / qVar.c()) * ((float) Math.pow((float) Math.max((double) androidx.cardview.widget.g.f1896q, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
        float signum2 = Math.signum(f13) * (100.0f / qVar.c()) * ((float) Math.pow((float) Math.max((double) androidx.cardview.widget.g.f1896q, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
        float signum3 = Math.signum(((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f) * (100.0f / qVar.c()) * ((float) Math.pow((float) Math.max((double) androidx.cardview.widget.g.f1896q, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f14 = signum / qVar.i()[0];
        float f15 = signum2 / qVar.i()[1];
        float f16 = signum3 / qVar.i()[2];
        float[][] fArr = b.f13421b;
        float[] fArr2 = fArr[0];
        float f17 = (fArr2[0] * f14) + (fArr2[1] * f15) + (fArr2[2] * f16);
        float[] fArr3 = fArr[1];
        float f18 = (fArr3[0] * f14) + (fArr3[1] * f15) + (fArr3[2] * f16);
        float[] fArr4 = fArr[2];
        return p0.g(f17, f18, (f14 * fArr4[0]) + (f15 * fArr4[1]) + (f16 * fArr4[2]));
    }

    @d.l
    public int s() {
        return r(q.f13470k);
    }
}
