package u;

/* loaded from: classes.dex */
public class n extends d {

    /* renamed from: s  reason: collision with root package name */
    public static final boolean f17014s = false;

    /* renamed from: p  reason: collision with root package name */
    public double f17015p;

    /* renamed from: q  reason: collision with root package name */
    public double f17016q;

    /* renamed from: r  reason: collision with root package name */
    public double f17017r;

    public n(String str) {
        this.f16911a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f17015p = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i7 = indexOf2 + 1;
        this.f17016q = Double.parseDouble(str.substring(i7, str.indexOf(44, i7)).trim());
    }

    @Override // u.d
    public double a(double d7) {
        return e(d7);
    }

    @Override // u.d
    public double b(double d7) {
        return d(d7);
    }

    public final double d(double d7) {
        double d8 = this.f17016q;
        if (d7 < d8) {
            double d9 = this.f17015p;
            return ((d9 * d8) * d8) / ((((d8 - d7) * d9) + d7) * ((d9 * (d8 - d7)) + d7));
        }
        double d10 = this.f17015p;
        return (((d8 - 1.0d) * d10) * (d8 - 1.0d)) / (((((-d10) * (d8 - d7)) - d7) + 1.0d) * ((((-d10) * (d8 - d7)) - d7) + 1.0d));
    }

    public final double e(double d7) {
        double d8 = this.f17016q;
        return d7 < d8 ? (d8 * d7) / (d7 + (this.f17015p * (d8 - d7))) : ((1.0d - d8) * (d7 - 1.0d)) / ((1.0d - d7) - (this.f17015p * (d8 - d7)));
    }
}