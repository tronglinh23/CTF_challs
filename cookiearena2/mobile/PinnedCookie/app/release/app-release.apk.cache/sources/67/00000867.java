package b5;

import d5.l;
import java.io.Serializable;
import k4.m;
import u4.l0;
import u4.r1;
import u4.w;
import v3.g1;

@r1({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
@g1(version = "1.3")
/* loaded from: classes.dex */
public abstract class f {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public static final a f7260k = new a(null);
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final f f7261l = m.f11768a.b();

    /* loaded from: classes.dex */
    public static final class a extends f implements Serializable {

        /* renamed from: b5.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0081a implements Serializable {
            @n6.d

            /* renamed from: k  reason: collision with root package name */
            public static final C0081a f7262k = new C0081a();

            /* renamed from: l  reason: collision with root package name */
            public static final long f7263l = 0;

            public final Object a() {
                return f.f7260k;
            }
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @Override // b5.f
        public int b(int i7) {
            return f.f7261l.b(i7);
        }

        @Override // b5.f
        public boolean c() {
            return f.f7261l.c();
        }

        @Override // b5.f
        @n6.d
        public byte[] d(int i7) {
            return f.f7261l.d(i7);
        }

        @Override // b5.f
        @n6.d
        public byte[] e(@n6.d byte[] bArr) {
            l0.p(bArr, "array");
            return f.f7261l.e(bArr);
        }

        @Override // b5.f
        @n6.d
        public byte[] f(@n6.d byte[] bArr, int i7, int i8) {
            l0.p(bArr, "array");
            return f.f7261l.f(bArr, i7, i8);
        }

        @Override // b5.f
        public double h() {
            return f.f7261l.h();
        }

        @Override // b5.f
        public double i(double d7) {
            return f.f7261l.i(d7);
        }

        @Override // b5.f
        public double j(double d7, double d8) {
            return f.f7261l.j(d7, d8);
        }

        @Override // b5.f
        public float k() {
            return f.f7261l.k();
        }

        @Override // b5.f
        public int l() {
            return f.f7261l.l();
        }

        @Override // b5.f
        public int m(int i7) {
            return f.f7261l.m(i7);
        }

        @Override // b5.f
        public int n(int i7, int i8) {
            return f.f7261l.n(i7, i8);
        }

        @Override // b5.f
        public long o() {
            return f.f7261l.o();
        }

        @Override // b5.f
        public long p(long j7) {
            return f.f7261l.p(j7);
        }

        @Override // b5.f
        public long q(long j7, long j8) {
            return f.f7261l.q(j7, j8);
        }

        public final Object r() {
            return C0081a.f7262k;
        }

        public a() {
        }
    }

    public static /* synthetic */ byte[] g(f fVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i7 = 0;
            }
            if ((i9 & 4) != 0) {
                i8 = bArr.length;
            }
            return fVar.f(bArr, i7, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int b(int i7);

    public boolean c() {
        return b(1) != 0;
    }

    @n6.d
    public byte[] d(int i7) {
        return e(new byte[i7]);
    }

    @n6.d
    public byte[] e(@n6.d byte[] bArr) {
        l0.p(bArr, "array");
        return f(bArr, 0, bArr.length);
    }

    @n6.d
    public byte[] f(@n6.d byte[] bArr, int i7, int i8) {
        l0.p(bArr, "array");
        if (!(new l(0, bArr.length).n(i7) && new l(0, bArr.length).n(i8))) {
            throw new IllegalArgumentException(("fromIndex (" + i7 + ") or toIndex (" + i8 + ") are out of range: 0.." + bArr.length + '.').toString());
        }
        if (!(i7 <= i8)) {
            throw new IllegalArgumentException(("fromIndex (" + i7 + ") must be not greater than toIndex (" + i8 + ").").toString());
        }
        int i9 = (i8 - i7) / 4;
        for (int i10 = 0; i10 < i9; i10++) {
            int l7 = l();
            bArr[i7] = (byte) l7;
            bArr[i7 + 1] = (byte) (l7 >>> 8);
            bArr[i7 + 2] = (byte) (l7 >>> 16);
            bArr[i7 + 3] = (byte) (l7 >>> 24);
            i7 += 4;
        }
        int i11 = i8 - i7;
        int b7 = b(i11 * 8);
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i7 + i12] = (byte) (b7 >>> (i12 * 8));
        }
        return bArr;
    }

    public double h() {
        return e.d(b(26), b(27));
    }

    public double i(double d7) {
        return j(androidx.cardview.widget.g.f1896q, d7);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double j(double r7, double r9) {
        /*
            r6 = this;
            b5.g.d(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L1b
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L2b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r3 = r4
        L2c:
            if (r3 == 0) goto L3d
            double r0 = r6.h()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            double r7 = r7 + r0
            goto L43
        L3d:
            double r2 = r6.h()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L43:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L4d
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L4d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.f.j(double, double):double");
    }

    public float k() {
        return b(24) / 1.6777216E7f;
    }

    public int l() {
        return b(32);
    }

    public int m(int i7) {
        return n(0, i7);
    }

    public int n(int i7, int i8) {
        int l7;
        int i9;
        int i10;
        int l8;
        boolean z6;
        g.e(i7, i8);
        int i11 = i8 - i7;
        if (i11 > 0 || i11 == Integer.MIN_VALUE) {
            if (((-i11) & i11) == i11) {
                i10 = b(g.g(i11));
                return i7 + i10;
            }
            do {
                l7 = l() >>> 1;
                i9 = l7 % i11;
            } while ((l7 - i9) + (i11 - 1) < 0);
            i10 = i9;
            return i7 + i10;
        }
        do {
            l8 = l();
            z6 = false;
            if (i7 <= l8 && l8 < i8) {
                z6 = true;
            }
        } while (!z6);
        return l8;
    }

    public long o() {
        return (l() << 32) + l();
    }

    public long p(long j7) {
        return q(0L, j7);
    }

    public long q(long j7, long j8) {
        long o6;
        boolean z6;
        long o7;
        long j9;
        long j10;
        int l7;
        g.f(j7, j8);
        long j11 = j8 - j7;
        if (j11 > 0) {
            if (((-j11) & j11) == j11) {
                int i7 = (int) j11;
                int i8 = (int) (j11 >>> 32);
                if (i7 != 0) {
                    l7 = b(g.g(i7));
                } else if (i8 != 1) {
                    j10 = (b(g.g(i8)) << 32) + (l() & 4294967295L);
                    return j7 + j10;
                } else {
                    l7 = l();
                }
                j10 = l7 & 4294967295L;
                return j7 + j10;
            }
            do {
                o7 = o() >>> 1;
                j9 = o7 % j11;
            } while ((o7 - j9) + (j11 - 1) < 0);
            j10 = j9;
            return j7 + j10;
        }
        do {
            o6 = o();
            z6 = false;
            if (j7 <= o6 && o6 < j8) {
                z6 = true;
            }
        } while (!z6);
        return o6;
    }
}