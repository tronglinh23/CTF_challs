package d5;

import v3.g1;

/* loaded from: classes.dex */
public final class l extends j implements g<Integer>, r<Integer> {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final a f8498o = new a(null);
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public static final l f8499p = new l(1, 0);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final l a() {
            return l.f8499p;
        }

        public a() {
        }
    }

    public l(int i7, int i8) {
        super(i7, i8, 1);
    }

    @g1(version = "1.7")
    @v3.r
    @v3.k(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void p() {
    }

    @Override // d5.g, d5.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return n(((Number) comparable).intValue());
    }

    @Override // d5.j
    public boolean equals(@n6.e Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (i() != lVar.i() || j() != lVar.j()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // d5.j
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (i() * 31) + j();
    }

    @Override // d5.j, d5.g, d5.r
    public boolean isEmpty() {
        return i() > j();
    }

    public boolean n(int i7) {
        return i() <= i7 && i7 <= j();
    }

    @Override // d5.r
    @n6.d
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public Integer d() {
        if (j() != Integer.MAX_VALUE) {
            return Integer.valueOf(j() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // d5.g
    @n6.d
    /* renamed from: q  reason: merged with bridge method [inline-methods] */
    public Integer g() {
        return Integer.valueOf(j());
    }

    @Override // d5.g, d5.r
    @n6.d
    /* renamed from: r  reason: merged with bridge method [inline-methods] */
    public Integer b() {
        return Integer.valueOf(i());
    }

    @Override // d5.j
    @n6.d
    public String toString() {
        return i() + ".." + j();
    }
}