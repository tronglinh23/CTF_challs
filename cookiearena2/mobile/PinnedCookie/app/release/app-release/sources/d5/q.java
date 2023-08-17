package d5;
/* loaded from: classes.dex */
public final class q implements r<Float> {

    /* renamed from: k  reason: collision with root package name */
    public final float f8512k;

    /* renamed from: l  reason: collision with root package name */
    public final float f8513l;

    public q(float f7, float f8) {
        this.f8512k = f7;
        this.f8513l = f8;
    }

    @Override // d5.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return c(((Number) comparable).floatValue());
    }

    public boolean c(float f7) {
        return f7 >= this.f8512k && f7 < this.f8513l;
    }

    @Override // d5.r
    @n6.d
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public Float d() {
        return Float.valueOf(this.f8513l);
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof q) {
            if (!isEmpty() || !((q) obj).isEmpty()) {
                q qVar = (q) obj;
                if (!(this.f8512k == qVar.f8512k)) {
                    return false;
                }
                if (!(this.f8513l == qVar.f8513l)) {
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
    public Float b() {
        return Float.valueOf(this.f8512k);
    }

    public final boolean g(float f7, float f8) {
        return f7 <= f8;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f8512k) * 31) + Float.hashCode(this.f8513l);
    }

    @Override // d5.r
    public boolean isEmpty() {
        return this.f8512k >= this.f8513l;
    }

    @n6.d
    public String toString() {
        return this.f8512k + "..<" + this.f8513l;
    }
}
