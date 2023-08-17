package d5;

/* loaded from: classes.dex */
public final class e implements f<Float> {

    /* renamed from: k  reason: collision with root package name */
    public final float f8484k;

    /* renamed from: l  reason: collision with root package name */
    public final float f8485l;

    public e(float f7, float f8) {
        this.f8484k = f7;
        this.f8485l = f8;
    }

    @Override // d5.f, d5.g, d5.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return c(((Number) comparable).floatValue());
    }

    public boolean c(float f7) {
        return f7 >= this.f8484k && f7 <= this.f8485l;
    }

    @Override // d5.g
    @n6.d
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public Float g() {
        return Float.valueOf(this.f8485l);
    }

    @Override // d5.g, d5.r
    @n6.d
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public Float b() {
        return Float.valueOf(this.f8484k);
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (!(this.f8484k == eVar.f8484k)) {
                    return false;
                }
                if (!(this.f8485l == eVar.f8485l)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ boolean f(Float f7, Float f8) {
        return h(f7.floatValue(), f8.floatValue());
    }

    public boolean h(float f7, float f8) {
        return f7 <= f8;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f8484k) * 31) + Float.hashCode(this.f8485l);
    }

    @Override // d5.f, d5.g, d5.r
    public boolean isEmpty() {
        return this.f8484k > this.f8485l;
    }

    @n6.d
    public String toString() {
        return this.f8484k + ".." + this.f8485l;
    }
}