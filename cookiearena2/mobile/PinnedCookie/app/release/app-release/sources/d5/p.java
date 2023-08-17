package d5;
/* loaded from: classes.dex */
public final class p implements r<Double> {

    /* renamed from: k  reason: collision with root package name */
    public final double f8510k;

    /* renamed from: l  reason: collision with root package name */
    public final double f8511l;

    public p(double d7, double d8) {
        this.f8510k = d7;
        this.f8511l = d8;
    }

    @Override // d5.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return c(((Number) comparable).doubleValue());
    }

    public boolean c(double d7) {
        return d7 >= this.f8510k && d7 < this.f8511l;
    }

    @Override // d5.r
    @n6.d
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public Double d() {
        return Double.valueOf(this.f8511l);
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof p) {
            if (!isEmpty() || !((p) obj).isEmpty()) {
                p pVar = (p) obj;
                if (!(this.f8510k == pVar.f8510k)) {
                    return false;
                }
                if (!(this.f8511l == pVar.f8511l)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // d5.r
    @n6.d
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public Double b() {
        return Double.valueOf(this.f8510k);
    }

    public final boolean g(double d7, double d8) {
        return d7 <= d8;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f8510k) * 31) + Double.hashCode(this.f8511l);
    }

    @Override // d5.r
    public boolean isEmpty() {
        return this.f8510k >= this.f8511l;
    }

    @n6.d
    public String toString() {
        return this.f8510k + "..<" + this.f8511l;
    }
}
