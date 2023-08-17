package d5;

/* loaded from: classes.dex */
public final class d implements f<Double> {

    /* renamed from: k  reason: collision with root package name */
    public final double f8482k;

    /* renamed from: l  reason: collision with root package name */
    public final double f8483l;

    public d(double d7, double d8) {
        this.f8482k = d7;
        this.f8483l = d8;
    }

    @Override // d5.f, d5.g, d5.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return c(((Number) comparable).doubleValue());
    }

    public boolean c(double d7) {
        return d7 >= this.f8482k && d7 <= this.f8483l;
    }

    @Override // d5.g
    @n6.d
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public Double g() {
        return Double.valueOf(this.f8483l);
    }

    @Override // d5.g, d5.r
    @n6.d
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public Double b() {
        return Double.valueOf(this.f8482k);
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (!(this.f8482k == dVar.f8482k)) {
                    return false;
                }
                if (!(this.f8483l == dVar.f8483l)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ boolean f(Double d7, Double d8) {
        return h(d7.doubleValue(), d8.doubleValue());
    }

    public boolean h(double d7, double d8) {
        return d7 <= d8;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f8482k) * 31) + Double.hashCode(this.f8483l);
    }

    @Override // d5.f, d5.g, d5.r
    public boolean isEmpty() {
        return this.f8482k > this.f8483l;
    }

    @n6.d
    public String toString() {
        return this.f8482k + ".." + this.f8483l;
    }
}