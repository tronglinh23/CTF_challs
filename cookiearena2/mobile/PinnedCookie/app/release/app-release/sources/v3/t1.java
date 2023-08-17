package v3;
@g1(version = "1.5")
@s4.f
@q2(markerClass = {t.class})
/* loaded from: classes.dex */
public final class t1 implements Comparable<t1> {
    @n6.d

    /* renamed from: l */
    public static final a f17826l = new a(null);

    /* renamed from: m */
    public static final byte f17827m = 0;

    /* renamed from: n */
    public static final byte f17828n = -1;

    /* renamed from: o */
    public static final int f17829o = 1;

    /* renamed from: p */
    public static final int f17830p = 8;

    /* renamed from: k */
    public final byte f17831k;

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
    public /* synthetic */ t1(byte b7) {
        this.f17831k = b7;
    }

    @k4.f
    public static final byte A(byte b7) {
        return l((byte) (~b7));
    }

    @k4.f
    public static final int B(byte b7, byte b8) {
        return x1.l(x1.l(b7 & f17828n) - x1.l(b8 & f17828n));
    }

    @k4.f
    public static final long C(byte b7, long j7) {
        return b2.l(b2.l(b7 & 255) - j7);
    }

    @k4.f
    public static final int D(byte b7, int i7) {
        return x1.l(x1.l(b7 & f17828n) - i7);
    }

    @k4.f
    public static final int E(byte b7, short s6) {
        return x1.l(x1.l(b7 & f17828n) - x1.l(s6 & h2.f17796n));
    }

    @k4.f
    public static final byte F(byte b7, byte b8) {
        return l((byte) Integer.remainderUnsigned(x1.l(b7 & f17828n), x1.l(b8 & f17828n)));
    }

    @k4.f
    public static final long G(byte b7, long j7) {
        return Long.remainderUnsigned(b2.l(b7 & 255), j7);
    }

    @k4.f
    public static final int H(byte b7, int i7) {
        return Integer.remainderUnsigned(x1.l(b7 & f17828n), i7);
    }

    @k4.f
    public static final short I(byte b7, short s6) {
        return h2.l((short) Integer.remainderUnsigned(x1.l(b7 & f17828n), x1.l(s6 & h2.f17796n)));
    }

    @k4.f
    public static final byte J(byte b7, byte b8) {
        return l((byte) (b7 | b8));
    }

    @k4.f
    public static final int K(byte b7, byte b8) {
        return x1.l(x1.l(b7 & f17828n) + x1.l(b8 & f17828n));
    }

    @k4.f
    public static final long L(byte b7, long j7) {
        return b2.l(b2.l(b7 & 255) + j7);
    }

    @k4.f
    public static final int M(byte b7, int i7) {
        return x1.l(x1.l(b7 & f17828n) + i7);
    }

    @k4.f
    public static final int N(byte b7, short s6) {
        return x1.l(x1.l(b7 & f17828n) + x1.l(s6 & h2.f17796n));
    }

    @k4.f
    public static final d5.x O(byte b7, byte b8) {
        return new d5.x(x1.l(b7 & f17828n), x1.l(b8 & f17828n), null);
    }

    @g1(version = "1.7")
    @r
    @k4.f
    public static final d5.x P(byte b7, byte b8) {
        return d5.c0.V(x1.l(b7 & f17828n), x1.l(b8 & f17828n));
    }

    @k4.f
    public static final int Q(byte b7, byte b8) {
        return Integer.remainderUnsigned(x1.l(b7 & f17828n), x1.l(b8 & f17828n));
    }

    @k4.f
    public static final long R(byte b7, long j7) {
        return Long.remainderUnsigned(b2.l(b7 & 255), j7);
    }

    @k4.f
    public static final int S(byte b7, int i7) {
        return Integer.remainderUnsigned(x1.l(b7 & f17828n), i7);
    }

    @k4.f
    public static final int T(byte b7, short s6) {
        return Integer.remainderUnsigned(x1.l(b7 & f17828n), x1.l(s6 & h2.f17796n));
    }

    @k4.f
    public static final int U(byte b7, byte b8) {
        return x1.l(x1.l(b7 & f17828n) * x1.l(b8 & f17828n));
    }

    @k4.f
    public static final long V(byte b7, long j7) {
        return b2.l(b2.l(b7 & 255) * j7);
    }

    @k4.f
    public static final int W(byte b7, int i7) {
        return x1.l(x1.l(b7 & f17828n) * i7);
    }

    @k4.f
    public static final int X(byte b7, short s6) {
        return x1.l(x1.l(b7 & f17828n) * x1.l(s6 & h2.f17796n));
    }

    @k4.f
    public static final byte Y(byte b7) {
        return b7;
    }

    @k4.f
    public static final double Z(byte b7) {
        return b7 & f17828n;
    }

    @k4.f
    public static final float a0(byte b7) {
        return b7 & f17828n;
    }

    @k4.f
    public static final int b0(byte b7) {
        return b7 & f17828n;
    }

    @k4.f
    public static final byte c(byte b7, byte b8) {
        return l((byte) (b7 & b8));
    }

    @k4.f
    public static final long c0(byte b7) {
        return b7 & 255;
    }

    public static final /* synthetic */ t1 d(byte b7) {
        return new t1(b7);
    }

    @k4.f
    public static final short d0(byte b7) {
        return (short) (b7 & 255);
    }

    @n6.d
    public static String e0(byte b7) {
        return String.valueOf(b7 & f17828n);
    }

    @k4.f
    public static final byte f0(byte b7) {
        return b7;
    }

    @k4.f
    public static final int g0(byte b7) {
        return x1.l(b7 & f17828n);
    }

    @k4.f
    public static int h(byte b7, byte b8) {
        return u4.l0.t(b7 & f17828n, b8 & f17828n);
    }

    @k4.f
    public static final long h0(byte b7) {
        return b2.l(b7 & 255);
    }

    @k4.f
    public static final int i(byte b7, long j7) {
        return Long.compareUnsigned(b2.l(b7 & 255), j7);
    }

    @k4.f
    public static final short i0(byte b7) {
        return h2.l((short) (b7 & 255));
    }

    @k4.f
    public static final int j(byte b7, int i7) {
        return Integer.compareUnsigned(x1.l(b7 & f17828n), i7);
    }

    @k4.f
    public static final int k(byte b7, short s6) {
        return u4.l0.t(b7 & f17828n, s6 & h2.f17796n);
    }

    @k4.f
    public static final byte k0(byte b7, byte b8) {
        return l((byte) (b7 ^ b8));
    }

    @k4.g
    @a1
    public static byte l(byte b7) {
        return b7;
    }

    @k4.f
    public static final byte m(byte b7) {
        return l((byte) (b7 - 1));
    }

    @k4.f
    public static final int n(byte b7, byte b8) {
        return Integer.divideUnsigned(x1.l(b7 & f17828n), x1.l(b8 & f17828n));
    }

    @k4.f
    public static final long o(byte b7, long j7) {
        return Long.divideUnsigned(b2.l(b7 & 255), j7);
    }

    @k4.f
    public static final int p(byte b7, int i7) {
        return Integer.divideUnsigned(x1.l(b7 & f17828n), i7);
    }

    @k4.f
    public static final int q(byte b7, short s6) {
        return Integer.divideUnsigned(x1.l(b7 & f17828n), x1.l(s6 & h2.f17796n));
    }

    public static boolean r(byte b7, Object obj) {
        return (obj instanceof t1) && b7 == ((t1) obj).j0();
    }

    public static final boolean s(byte b7, byte b8) {
        return b7 == b8;
    }

    @k4.f
    public static final int t(byte b7, byte b8) {
        return Integer.divideUnsigned(x1.l(b7 & f17828n), x1.l(b8 & f17828n));
    }

    @k4.f
    public static final long u(byte b7, long j7) {
        return Long.divideUnsigned(b2.l(b7 & 255), j7);
    }

    @k4.f
    public static final int v(byte b7, int i7) {
        return Integer.divideUnsigned(x1.l(b7 & f17828n), i7);
    }

    @k4.f
    public static final int w(byte b7, short s6) {
        return Integer.divideUnsigned(x1.l(b7 & f17828n), x1.l(s6 & h2.f17796n));
    }

    @a1
    public static /* synthetic */ void x() {
    }

    public static int y(byte b7) {
        return Byte.hashCode(b7);
    }

    @k4.f
    public static final byte z(byte b7) {
        return l((byte) (b7 + 1));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(t1 t1Var) {
        return u4.l0.t(j0() & f17828n, t1Var.j0() & f17828n);
    }

    @k4.f
    public final int e(byte b7) {
        return u4.l0.t(j0() & f17828n, b7 & f17828n);
    }

    public boolean equals(Object obj) {
        return r(this.f17831k, obj);
    }

    public int hashCode() {
        return y(this.f17831k);
    }

    public final /* synthetic */ byte j0() {
        return this.f17831k;
    }

    @n6.d
    public String toString() {
        return e0(this.f17831k);
    }
}
