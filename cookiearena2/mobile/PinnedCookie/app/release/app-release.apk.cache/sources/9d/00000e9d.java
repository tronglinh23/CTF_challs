package d5;

import v3.b2;
import v3.g1;
import v3.q2;

@g1(version = "1.5")
@q2(markerClass = {v3.t.class})
/* loaded from: classes.dex */
public final class a0 extends y implements g<b2>, r<b2> {
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final a f8474o = new a(null);
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public static final a0 f8475p = new a0(-1, 0, null);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final a0 a() {
            return a0.f8475p;
        }

        public a() {
        }
    }

    public /* synthetic */ a0(long j7, long j8, u4.w wVar) {
        this(j7, j8);
    }

    @g1(version = "1.7")
    @v3.r
    @v3.k(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void o() {
    }

    @Override // d5.g, d5.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return m(((b2) comparable).l0());
    }

    @Override // d5.g, d5.r
    public /* bridge */ /* synthetic */ Comparable b() {
        return b2.d(q());
    }

    @Override // d5.r
    public /* bridge */ /* synthetic */ b2 d() {
        return b2.d(n());
    }

    @Override // d5.y
    public boolean equals(@n6.e Object obj) {
        if (obj instanceof a0) {
            if (!isEmpty() || !((a0) obj).isEmpty()) {
                a0 a0Var = (a0) obj;
                if (i() != a0Var.i() || j() != a0Var.j()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // d5.g
    public /* bridge */ /* synthetic */ b2 g() {
        return b2.d(p());
    }

    @Override // d5.y
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) b2.l(i() ^ b2.l(i() >>> 32))) * 31) + ((int) b2.l(j() ^ b2.l(j() >>> 32)));
    }

    @Override // d5.y, d5.g, d5.r
    public boolean isEmpty() {
        return Long.compareUnsigned(i(), j()) > 0;
    }

    public boolean m(long j7) {
        return Long.compareUnsigned(i(), j7) <= 0 && Long.compareUnsigned(j7, j()) <= 0;
    }

    public long n() {
        if (j() != -1) {
            return b2.l(j() + b2.l(1 & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    public long p() {
        return j();
    }

    public long q() {
        return i();
    }

    @Override // d5.y
    @n6.d
    public String toString() {
        return ((Object) b2.g0(i())) + ".." + ((Object) b2.g0(j()));
    }

    public a0(long j7, long j8) {
        super(j7, j8, 1L, null);
    }
}