package z4;

import androidx.cardview.widget.g;
import k4.f;
import v3.g1;
import v3.q2;
import v3.r;
/* loaded from: classes.dex */
public class d extends c {
    @g1(version = "1.2")
    @f
    public static final double A(double d7) {
        return Math.cos(d7);
    }

    @g1(version = "1.2")
    @f
    public static final double A0(double d7, double d8) {
        return Math.nextAfter(d7, d8);
    }

    @g1(version = "1.2")
    @f
    public static final float B(float f7) {
        return (float) Math.cos(f7);
    }

    @g1(version = "1.2")
    @f
    public static final float B0(float f7, float f8) {
        return Math.nextAfter(f7, f8);
    }

    @g1(version = "1.2")
    @f
    public static final double C(double d7) {
        return Math.cosh(d7);
    }

    @g1(version = "1.2")
    @f
    public static final double C0(double d7) {
        return Math.nextUp(d7);
    }

    @g1(version = "1.2")
    @f
    public static final float D(float f7) {
        return (float) Math.cosh(f7);
    }

    @g1(version = "1.2")
    @f
    public static final float D0(float f7) {
        return Math.nextUp(f7);
    }

    @g1(version = "1.2")
    @f
    public static final double E(double d7) {
        return Math.exp(d7);
    }

    @g1(version = "1.2")
    @f
    public static final double E0(double d7, double d8) {
        return Math.pow(d7, d8);
    }

    @g1(version = "1.2")
    @f
    public static final float F(float f7) {
        return (float) Math.exp(f7);
    }

    @g1(version = "1.2")
    @f
    public static final double F0(double d7, int i7) {
        return Math.pow(d7, i7);
    }

    @g1(version = "1.2")
    @f
    public static final double G(double d7) {
        return Math.expm1(d7);
    }

    @g1(version = "1.2")
    @f
    public static final float G0(float f7, float f8) {
        return (float) Math.pow(f7, f8);
    }

    @g1(version = "1.2")
    @f
    public static final float H(float f7) {
        return (float) Math.expm1(f7);
    }

    @g1(version = "1.2")
    @f
    public static final float H0(float f7, int i7) {
        return (float) Math.pow(f7, i7);
    }

    @g1(version = "1.2")
    @f
    public static final double I(double d7) {
        return Math.floor(d7);
    }

    @g1(version = "1.2")
    @f
    public static final double I0(double d7) {
        return Math.rint(d7);
    }

    @g1(version = "1.2")
    @f
    public static final float J(float f7) {
        return (float) Math.floor(f7);
    }

    @g1(version = "1.2")
    @f
    public static final float J0(float f7) {
        return (float) Math.rint(f7);
    }

    public static final double K(double d7) {
        return Math.abs(d7);
    }

    @g1(version = "1.2")
    public static final int K0(double d7) {
        if (Double.isNaN(d7)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d7 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d7 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d7);
    }

    public static final float L(float f7) {
        return Math.abs(f7);
    }

    @g1(version = "1.2")
    public static final int L0(float f7) {
        if (Float.isNaN(f7)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f7);
    }

    public static final int M(int i7) {
        return Math.abs(i7);
    }

    @g1(version = "1.2")
    public static final long M0(double d7) {
        if (Double.isNaN(d7)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d7);
    }

    public static final long N(long j7) {
        return Math.abs(j7);
    }

    @g1(version = "1.2")
    public static final long N0(float f7) {
        return M0(f7);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void O(double d7) {
    }

    @g1(version = "1.2")
    @f
    public static final double O0(double d7) {
        return Math.signum(d7);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void P(float f7) {
    }

    @g1(version = "1.2")
    @f
    public static final float P0(float f7) {
        return Math.signum(f7);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void Q(int i7) {
    }

    @g1(version = "1.2")
    @f
    public static final double Q0(double d7) {
        return Math.sin(d7);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void R(long j7) {
    }

    @g1(version = "1.2")
    @f
    public static final float R0(float f7) {
        return (float) Math.sin(f7);
    }

    public static final double S(double d7) {
        return Math.signum(d7);
    }

    @g1(version = "1.2")
    @f
    public static final double S0(double d7) {
        return Math.sinh(d7);
    }

    public static final float T(float f7) {
        return Math.signum(f7);
    }

    @g1(version = "1.2")
    @f
    public static final float T0(float f7) {
        return (float) Math.sinh(f7);
    }

    public static final int U(int i7) {
        if (i7 < 0) {
            return -1;
        }
        return i7 > 0 ? 1 : 0;
    }

    @g1(version = "1.2")
    @f
    public static final double U0(double d7) {
        return Math.sqrt(d7);
    }

    public static final int V(long j7) {
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (i7 < 0) {
            return -1;
        }
        return i7 > 0 ? 1 : 0;
    }

    @g1(version = "1.2")
    @f
    public static final float V0(float f7) {
        return (float) Math.sqrt(f7);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void W(double d7) {
    }

    @g1(version = "1.2")
    @f
    public static final double W0(double d7) {
        return Math.tan(d7);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void X(float f7) {
    }

    @g1(version = "1.2")
    @f
    public static final float X0(float f7) {
        return (float) Math.tan(f7);
    }

    @g1(version = "1.2")
    public static /* synthetic */ void Y(int i7) {
    }

    @g1(version = "1.2")
    @f
    public static final double Y0(double d7) {
        return Math.tanh(d7);
    }

    @g1(version = "1.2")
    public static /* synthetic */ void Z(long j7) {
    }

    @g1(version = "1.2")
    @f
    public static final float Z0(float f7) {
        return (float) Math.tanh(f7);
    }

    public static final double a0(double d7) {
        return Math.ulp(d7);
    }

    @g1(version = "1.2")
    public static final double a1(double d7) {
        return (Double.isNaN(d7) || Double.isInfinite(d7)) ? d7 : d7 > g.f1896q ? Math.floor(d7) : Math.ceil(d7);
    }

    public static final float b0(float f7) {
        return Math.ulp(f7);
    }

    @g1(version = "1.2")
    public static final float b1(float f7) {
        if (Float.isNaN(f7) || Float.isInfinite(f7)) {
            return f7;
        }
        return (float) (f7 > 0.0f ? Math.floor(f7) : Math.ceil(f7));
    }

    @g1(version = "1.2")
    @f
    public static final double c(double d7, double d8) {
        return Math.IEEEremainder(d7, d8);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void c0(double d7) {
    }

    @g1(version = "1.2")
    @f
    public static final double c1(double d7, double d8) {
        return Math.copySign(d7, d8);
    }

    @g1(version = "1.2")
    @f
    public static final float d(float f7, float f8) {
        return (float) Math.IEEEremainder(f7, f8);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void d0(float f7) {
    }

    @g1(version = "1.2")
    @f
    public static final double d1(double d7, int i7) {
        return Math.copySign(d7, i7);
    }

    @g1(version = "1.2")
    @f
    public static final double e(double d7) {
        return Math.abs(d7);
    }

    @g1(version = "1.2")
    @f
    public static final double e0(double d7, double d8) {
        return Math.hypot(d7, d8);
    }

    @g1(version = "1.2")
    @f
    public static final float e1(float f7, float f8) {
        return Math.copySign(f7, f8);
    }

    @g1(version = "1.2")
    @f
    public static final float f(float f7) {
        return Math.abs(f7);
    }

    @g1(version = "1.2")
    @f
    public static final float f0(float f7, float f8) {
        return (float) Math.hypot(f7, f8);
    }

    @g1(version = "1.2")
    @f
    public static final float f1(float f7, int i7) {
        return Math.copySign(f7, i7);
    }

    @g1(version = "1.2")
    @f
    public static final int g(int i7) {
        return Math.abs(i7);
    }

    @g1(version = "1.2")
    @f
    public static final double g0(double d7) {
        return Math.log(d7);
    }

    @g1(version = "1.2")
    @f
    public static final long h(long j7) {
        return Math.abs(j7);
    }

    @g1(version = "1.2")
    @f
    public static final float h0(float f7) {
        return (float) Math.log(f7);
    }

    @g1(version = "1.2")
    @f
    public static final double i(double d7) {
        return Math.acos(d7);
    }

    @g1(version = "1.2")
    @f
    public static final double i0(double d7) {
        return Math.log1p(d7);
    }

    @g1(version = "1.2")
    @f
    public static final float j(float f7) {
        return (float) Math.acos(f7);
    }

    @g1(version = "1.2")
    @f
    public static final float j0(float f7) {
        return (float) Math.log1p(f7);
    }

    @g1(version = "1.2")
    public static final double k(double d7) {
        if (d7 < 1.0d) {
            return Double.NaN;
        }
        if (d7 > a.f19059f) {
            return Math.log(d7) + a.f19055b;
        }
        double d8 = 1;
        double d9 = d7 - d8;
        if (d9 >= a.f19058e) {
            return Math.log(d7 + Math.sqrt((d7 * d7) - d8));
        }
        double sqrt = Math.sqrt(d9);
        if (sqrt >= a.f19057d) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return sqrt * Math.sqrt(2.0d);
    }

    @g1(version = "1.2")
    public static final double k0(double d7, double d8) {
        if (d8 > g.f1896q) {
            if (d8 == 1.0d) {
                return Double.NaN;
            }
            return Math.log(d7) / Math.log(d8);
        }
        return Double.NaN;
    }

    @g1(version = "1.2")
    @f
    public static final float l(float f7) {
        return (float) k(f7);
    }

    @g1(version = "1.2")
    public static final float l0(float f7, float f8) {
        if (f8 > 0.0f) {
            if (f8 == 1.0f) {
                return Float.NaN;
            }
            return (float) (Math.log(f7) / Math.log(f8));
        }
        return Float.NaN;
    }

    @g1(version = "1.2")
    @f
    public static final double m(double d7) {
        return Math.asin(d7);
    }

    @g1(version = "1.2")
    @f
    public static final double m0(double d7) {
        return Math.log10(d7);
    }

    @g1(version = "1.2")
    @f
    public static final float n(float f7) {
        return (float) Math.asin(f7);
    }

    @g1(version = "1.2")
    @f
    public static final float n0(float f7) {
        return (float) Math.log10(f7);
    }

    @g1(version = "1.2")
    public static final double o(double d7) {
        double d8 = a.f19058e;
        if (d7 < d8) {
            return d7 <= (-d8) ? -o(-d7) : Math.abs(d7) >= a.f19057d ? d7 - (((d7 * d7) * d7) / 6) : d7;
        } else if (d7 > a.f19060g) {
            if (d7 > a.f19059f) {
                return Math.log(d7) + a.f19055b;
            }
            double d9 = d7 * 2;
            return Math.log(d9 + (1 / d9));
        } else {
            return Math.log(d7 + Math.sqrt((d7 * d7) + 1));
        }
    }

    @g1(version = "1.2")
    public static final double o0(double d7) {
        return Math.log(d7) / a.f19055b;
    }

    @g1(version = "1.2")
    @f
    public static final float p(float f7) {
        return (float) o(f7);
    }

    @g1(version = "1.2")
    public static final float p0(float f7) {
        return (float) (Math.log(f7) / a.f19055b);
    }

    @g1(version = "1.2")
    @f
    public static final double q(double d7) {
        return Math.atan(d7);
    }

    @g1(version = "1.2")
    @f
    public static final double q0(double d7, double d8) {
        return Math.max(d7, d8);
    }

    @g1(version = "1.2")
    @f
    public static final float r(float f7) {
        return (float) Math.atan(f7);
    }

    @g1(version = "1.2")
    @f
    public static final float r0(float f7, float f8) {
        return Math.max(f7, f8);
    }

    @g1(version = "1.2")
    @f
    public static final double s(double d7, double d8) {
        return Math.atan2(d7, d8);
    }

    @g1(version = "1.2")
    @f
    public static final int s0(int i7, int i8) {
        return Math.max(i7, i8);
    }

    @g1(version = "1.2")
    @f
    public static final float t(float f7, float f8) {
        return (float) Math.atan2(f7, f8);
    }

    @g1(version = "1.2")
    @f
    public static final long t0(long j7, long j8) {
        return Math.max(j7, j8);
    }

    @g1(version = "1.2")
    public static final double u(double d7) {
        if (Math.abs(d7) < a.f19058e) {
            return Math.abs(d7) > a.f19057d ? d7 + (((d7 * d7) * d7) / 3) : d7;
        }
        double d8 = 1;
        return Math.log((d8 + d7) / (d8 - d7)) / 2;
    }

    @g1(version = "1.2")
    @f
    public static final double u0(double d7, double d8) {
        return Math.min(d7, d8);
    }

    @g1(version = "1.2")
    @f
    public static final float v(float f7) {
        return (float) u(f7);
    }

    @g1(version = "1.2")
    @f
    public static final float v0(float f7, float f8) {
        return Math.min(f7, f8);
    }

    @g1(version = "1.8")
    @f
    @q2(markerClass = {r.class})
    public static final double w(double d7) {
        return Math.cbrt(d7);
    }

    @g1(version = "1.2")
    @f
    public static final int w0(int i7, int i8) {
        return Math.min(i7, i8);
    }

    @g1(version = "1.8")
    @f
    @q2(markerClass = {r.class})
    public static final float x(float f7) {
        return (float) Math.cbrt(f7);
    }

    @g1(version = "1.2")
    @f
    public static final long x0(long j7, long j8) {
        return Math.min(j7, j8);
    }

    @g1(version = "1.2")
    @f
    public static final double y(double d7) {
        return Math.ceil(d7);
    }

    @g1(version = "1.2")
    @f
    public static final double y0(double d7) {
        return Math.nextAfter(d7, Double.NEGATIVE_INFINITY);
    }

    @g1(version = "1.2")
    @f
    public static final float z(float f7) {
        return (float) Math.ceil(f7);
    }

    @g1(version = "1.2")
    @f
    public static final float z0(float f7) {
        return Math.nextAfter(f7, Double.NEGATIVE_INFINITY);
    }
}
