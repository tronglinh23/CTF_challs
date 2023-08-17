package d5;

import v3.g1;

/* loaded from: classes.dex */
public final class o extends m implements g<Long>, r<Long> {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final a f8508o = new a(null);
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public static final o f8509p = new o(1, 0);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final o a() {
            return o.f8509p;
        }

        public a() {
        }
    }

    public o(long j7, long j8) {
        super(j7, j8, 1L);
    }

    @g1(version = "1.7")
    @v3.r
    @v3.k(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void p() {
    }

    @Override // d5.g, d5.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return n(((Number) comparable).longValue());
    }

    @Override // d5.m
    public boolean equals(@n6.e Object obj) {
        if (obj instanceof o) {
            if (!isEmpty() || !((o) obj).isEmpty()) {
                o oVar = (o) obj;
                if (i() != oVar.i() || j() != oVar.j()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // d5.m
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (i() ^ (i() >>> 32))) + (j() ^ (j() >>> 32)));
    }

    @Override // d5.m, d5.g, d5.r
    public boolean isEmpty() {
        return i() > j();
    }

    public boolean n(long j7) {
        return i() <= j7 && j7 <= j();
    }

    @Override // d5.r
    @n6.d
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public Long d() {
        if (j() != Long.MAX_VALUE) {
            return Long.valueOf(j() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // d5.g
    @n6.d
    /* renamed from: q  reason: merged with bridge method [inline-methods] */
    public Long g() {
        return Long.valueOf(j());
    }

    @Override // d5.g, d5.r
    @n6.d
    /* renamed from: r  reason: merged with bridge method [inline-methods] */
    public Long b() {
        return Long.valueOf(i());
    }

    @Override // d5.m
    @n6.d
    public String toString() {
        return i() + ".." + j();
    }
}