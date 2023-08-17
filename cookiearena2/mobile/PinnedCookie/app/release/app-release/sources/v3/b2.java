package v3;
@g1(version = "1.5")
@s4.f
@q2(markerClass = {t.class})
/* loaded from: classes.dex */
public final class b2 implements Comparable<b2> {
    @n6.d

    /* renamed from: l */
    public static final a f17766l = new a(null);

    /* renamed from: m */
    public static final long f17767m = 0;

    /* renamed from: n */
    public static final long f17768n = -1;

    /* renamed from: o */
    public static final int f17769o = 8;

    /* renamed from: p */
    public static final int f17770p = 64;

    /* renamed from: k */
    public final long f17771k;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public a() {
        }
    }

    @k4.g
    @a1
    public /* synthetic */ b2(long j7) {
        this.f17771k = j7;
    }

    @k4.f
    public static final long A(long j7) {
        return l(~j7);
    }

    @k4.f
    public static final long B(long j7, byte b7) {
        return l(j7 - l(b7 & 255));
    }

    @k4.f
    public static final long C(long j7, long j8) {
        return l(j7 - j8);
    }

    @k4.f
    public static final long D(long j7, int i7) {
        return l(j7 - l(i7 & 4294967295L));
    }

    @k4.f
    public static final long E(long j7, short s6) {
        return l(j7 - l(s6 & h6.g.f10414s));
    }

    @k4.f
    public static final byte F(long j7, byte b7) {
        return t1.l((byte) Long.remainderUnsigned(j7, l(b7 & 255)));
    }

    @k4.f
    public static final long G(long j7, long j8) {
        return Long.remainderUnsigned(j7, j8);
    }

    @k4.f
    public static final int H(long j7, int i7) {
        return x1.l((int) Long.remainderUnsigned(j7, l(i7 & 4294967295L)));
    }

    @k4.f
    public static final short I(long j7, short s6) {
        return h2.l((short) Long.remainderUnsigned(j7, l(s6 & h6.g.f10414s)));
    }

    @k4.f
    public static final long J(long j7, long j8) {
        return l(j7 | j8);
    }

    @k4.f
    public static final long K(long j7, byte b7) {
        return l(j7 + l(b7 & 255));
    }

    @k4.f
    public static final long L(long j7, long j8) {
        return l(j7 + j8);
    }

    @k4.f
    public static final long M(long j7, int i7) {
        return l(j7 + l(i7 & 4294967295L));
    }

    @k4.f
    public static final long N(long j7, short s6) {
        return l(j7 + l(s6 & h6.g.f10414s));
    }

    @k4.f
    public static final d5.a0 O(long j7, long j8) {
        return new d5.a0(j7, j8, null);
    }

    @g1(version = "1.7")
    @r
    @k4.f
    public static final d5.a0 P(long j7, long j8) {
        return d5.c0.X(j7, j8);
    }

    @k4.f
    public static final long Q(long j7, byte b7) {
        return Long.remainderUnsigned(j7, l(b7 & 255));
    }

    @k4.f
    public static final long R(long j7, long j8) {
        return p2.i(j7, j8);
    }

    @k4.f
    public static final long S(long j7, int i7) {
        return Long.remainderUnsigned(j7, l(i7 & 4294967295L));
    }

    @k4.f
    public static final long T(long j7, short s6) {
        return Long.remainderUnsigned(j7, l(s6 & h6.g.f10414s));
    }

    @k4.f
    public static final long U(long j7, int i7) {
        return l(j7 << i7);
    }

    @k4.f
    public static final long V(long j7, int i7) {
        return l(j7 >>> i7);
    }

    @k4.f
    public static final long W(long j7, byte b7) {
        return l(j7 * l(b7 & 255));
    }

    @k4.f
    public static final long X(long j7, long j8) {
        return l(j7 * j8);
    }

    @k4.f
    public static final long Y(long j7, int i7) {
        return l(j7 * l(i7 & 4294967295L));
    }

    @k4.f
    public static final long Z(long j7, short s6) {
        return l(j7 * l(s6 & h6.g.f10414s));
    }

    @k4.f
    public static final byte a0(long j7) {
        return (byte) j7;
    }

    @k4.f
    public static final double b0(long j7) {
        return p2.j(j7);
    }

    @k4.f
    public static final long c(long j7, long j8) {
        return l(j7 & j8);
    }

    @k4.f
    public static final float c0(long j7) {
        return (float) p2.j(j7);
    }

    public static final /* synthetic */ b2 d(long j7) {
        return new b2(j7);
    }

    @k4.f
    public static final int d0(long j7) {
        return (int) j7;
    }

    @k4.f
    public static final int e(long j7, byte b7) {
        return Long.compareUnsigned(j7, l(b7 & 255));
    }

    @k4.f
    public static final long e0(long j7) {
        return j7;
    }

    @k4.f
    public static final short f0(long j7) {
        return (short) j7;
    }

    @n6.d
    public static String g0(long j7) {
        return p2.k(j7);
    }

    @k4.f
    public static final byte h0(long j7) {
        return t1.l((byte) j7);
    }

    @k4.f
    public static int i(long j7, long j8) {
        return p2.g(j7, j8);
    }

    @k4.f
    public static final int i0(long j7) {
        return x1.l((int) j7);
    }

    @k4.f
    public static final int j(long j7, int i7) {
        return Long.compareUnsigned(j7, l(i7 & 4294967295L));
    }

    @k4.f
    public static final long j0(long j7) {
        return j7;
    }

    @k4.f
    public static final int k(long j7, short s6) {
        return Long.compareUnsigned(j7, l(s6 & h6.g.f10414s));
    }

    @k4.f
    public static final short k0(long j7) {
        return h2.l((short) j7);
    }

    @k4.g
    @a1
    public static long l(long j7) {
        return j7;
    }

    @k4.f
    public static final long m(long j7) {
        return l(j7 - 1);
    }

    @k4.f
    public static final long m0(long j7, long j8) {
        return l(j7 ^ j8);
    }

    @k4.f
    public static final long n(long j7, byte b7) {
        return Long.divideUnsigned(j7, l(b7 & 255));
    }

    @k4.f
    public static final long o(long j7, long j8) {
        return p2.h(j7, j8);
    }

    @k4.f
    public static final long p(long j7, int i7) {
        return Long.divideUnsigned(j7, l(i7 & 4294967295L));
    }

    @k4.f
    public static final long q(long j7, short s6) {
        return Long.divideUnsigned(j7, l(s6 & h6.g.f10414s));
    }

    public static boolean r(long j7, Object obj) {
        return (obj instanceof b2) && j7 == ((b2) obj).l0();
    }

    public static final boolean s(long j7, long j8) {
        return j7 == j8;
    }

    @k4.f
    public static final long t(long j7, byte b7) {
        return Long.divideUnsigned(j7, l(b7 & 255));
    }

    @k4.f
    public static final long u(long j7, long j8) {
        return Long.divideUnsigned(j7, j8);
    }

    @k4.f
    public static final long v(long j7, int i7) {
        return Long.divideUnsigned(j7, l(i7 & 4294967295L));
    }

    @k4.f
    public static final long w(long j7, short s6) {
        return Long.divideUnsigned(j7, l(s6 & h6.g.f10414s));
    }

    @a1
    public static /* synthetic */ void x() {
    }

    public static int y(long j7) {
        return Long.hashCode(j7);
    }

    @k4.f
    public static final long z(long j7) {
        return l(j7 + 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(b2 b2Var) {
        return p2.g(l0(), b2Var.l0());
    }

    public boolean equals(Object obj) {
        return r(this.f17771k, obj);
    }

    @k4.f
    public final int h(long j7) {
        return p2.g(l0(), j7);
    }

    public int hashCode() {
        return y(this.f17771k);
    }

    public final /* synthetic */ long l0() {
        return this.f17771k;
    }

    @n6.d
    public String toString() {
        return g0(this.f17771k);
    }
}
