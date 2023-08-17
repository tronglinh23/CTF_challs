package u;

import java.util.Arrays;
/* loaded from: classes.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    public static final String f16898c = "cubic(0.4, 0.0, 0.2, 1)";

    /* renamed from: d  reason: collision with root package name */
    public static final String f16899d = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* renamed from: e  reason: collision with root package name */
    public static final String f16900e = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* renamed from: f  reason: collision with root package name */
    public static final String f16901f = "cubic(1, 1, 0, 0)";

    /* renamed from: g  reason: collision with root package name */
    public static final String f16902g = "cubic(0.36, 0, 0.66, -0.56)";

    /* renamed from: h  reason: collision with root package name */
    public static final String f16903h = "cubic(0.34, 1.56, 0.64, 1)";

    /* renamed from: m  reason: collision with root package name */
    public static final String f16908m = "anticipate";

    /* renamed from: n  reason: collision with root package name */
    public static final String f16909n = "overshoot";

    /* renamed from: a  reason: collision with root package name */
    public String f16911a = "identity";

    /* renamed from: b  reason: collision with root package name */
    public static d f16897b = new d();

    /* renamed from: k  reason: collision with root package name */
    public static final String f16906k = "standard";

    /* renamed from: j  reason: collision with root package name */
    public static final String f16905j = "accelerate";

    /* renamed from: i  reason: collision with root package name */
    public static final String f16904i = "decelerate";

    /* renamed from: l  reason: collision with root package name */
    public static final String f16907l = "linear";

    /* renamed from: o  reason: collision with root package name */
    public static String[] f16910o = {f16906k, f16905j, f16904i, f16907l};

    public static d c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new q(str);
        }
        if (str.startsWith("Schlick")) {
            return new n(str);
        }
        char c7 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals(f16905j)) {
                    c7 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals(f16904i)) {
                    c7 = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals(f16908m)) {
                    c7 = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals(f16907l)) {
                    c7 = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals(f16909n)) {
                    c7 = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals(f16906k)) {
                    c7 = 5;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                return new a(f16899d);
            case 1:
                return new a(f16900e);
            case 2:
                return new a(f16902g);
            case 3:
                return new a(f16901f);
            case 4:
                return new a(f16903h);
            case 5:
                return new a(f16898c);
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f16910o));
                return f16897b;
        }
    }

    public double a(double d7) {
        return d7;
    }

    public double b(double d7) {
        return 1.0d;
    }

    public String toString() {
        return this.f16911a;
    }

    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: t  reason: collision with root package name */
        public static double f16912t = 0.01d;

        /* renamed from: u  reason: collision with root package name */
        public static double f16913u = 1.0E-4d;

        /* renamed from: p  reason: collision with root package name */
        public double f16914p;

        /* renamed from: q  reason: collision with root package name */
        public double f16915q;

        /* renamed from: r  reason: collision with root package name */
        public double f16916r;

        /* renamed from: s  reason: collision with root package name */
        public double f16917s;

        public a(String str) {
            this.f16911a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f16914p = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i7 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i7);
            this.f16915q = Double.parseDouble(str.substring(i7, indexOf3).trim());
            int i8 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i8);
            this.f16916r = Double.parseDouble(str.substring(i8, indexOf4).trim());
            int i9 = indexOf4 + 1;
            this.f16917s = Double.parseDouble(str.substring(i9, str.indexOf(41, i9)).trim());
        }

        @Override // u.d
        public double a(double d7) {
            if (d7 <= androidx.cardview.widget.g.f1896q) {
                return androidx.cardview.widget.g.f1896q;
            }
            if (d7 >= 1.0d) {
                return 1.0d;
            }
            double d8 = 0.5d;
            double d9 = 0.5d;
            while (d8 > f16912t) {
                d8 *= 0.5d;
                d9 = f(d9) < d7 ? d9 + d8 : d9 - d8;
            }
            double d10 = d9 - d8;
            double f7 = f(d10);
            double d11 = d9 + d8;
            double f8 = f(d11);
            double g7 = g(d10);
            return (((g(d11) - g7) * (d7 - f7)) / (f8 - f7)) + g7;
        }

        @Override // u.d
        public double b(double d7) {
            double d8 = 0.5d;
            double d9 = 0.5d;
            while (d8 > f16913u) {
                d8 *= 0.5d;
                d9 = f(d9) < d7 ? d9 + d8 : d9 - d8;
            }
            double d10 = d9 - d8;
            double d11 = d9 + d8;
            return (g(d11) - g(d10)) / (f(d11) - f(d10));
        }

        public final double d(double d7) {
            double d8 = 1.0d - d7;
            double d9 = this.f16914p;
            double d10 = this.f16916r;
            return (d8 * 3.0d * d8 * d9) + (d8 * 6.0d * d7 * (d10 - d9)) + (3.0d * d7 * d7 * (1.0d - d10));
        }

        public final double e(double d7) {
            double d8 = 1.0d - d7;
            double d9 = this.f16915q;
            double d10 = this.f16917s;
            return (d8 * 3.0d * d8 * d9) + (d8 * 6.0d * d7 * (d10 - d9)) + (3.0d * d7 * d7 * (1.0d - d10));
        }

        public final double f(double d7) {
            double d8 = 1.0d - d7;
            double d9 = 3.0d * d8;
            return (this.f16914p * d8 * d9 * d7) + (this.f16916r * d9 * d7 * d7) + (d7 * d7 * d7);
        }

        public final double g(double d7) {
            double d8 = 1.0d - d7;
            double d9 = 3.0d * d8;
            return (this.f16915q * d8 * d9 * d7) + (this.f16917s * d9 * d7 * d7) + (d7 * d7 * d7);
        }

        public void h(double d7, double d8, double d9, double d10) {
            this.f16914p = d7;
            this.f16915q = d8;
            this.f16916r = d9;
            this.f16917s = d10;
        }

        public a(double d7, double d8, double d9, double d10) {
            h(d7, d8, d9, d10);
        }
    }
}
