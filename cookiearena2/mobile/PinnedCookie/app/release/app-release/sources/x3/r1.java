package x3;

import v3.c2;
import v3.h2;
import v3.i2;
import v3.u1;
import v3.y1;
/* loaded from: classes.dex */
public final class r1 {
    @v3.t
    public static final int a(long[] jArr, int i7, int i8) {
        long m7 = c2.m(jArr, (i7 + i8) / 2);
        while (i7 <= i8) {
            while (Long.compareUnsigned(c2.m(jArr, i7), m7) < 0) {
                i7++;
            }
            while (Long.compareUnsigned(c2.m(jArr, i8), m7) > 0) {
                i8--;
            }
            if (i7 <= i8) {
                long m8 = c2.m(jArr, i7);
                c2.t(jArr, i7, c2.m(jArr, i8));
                c2.t(jArr, i8, m8);
                i7++;
                i8--;
            }
        }
        return i7;
    }

    @v3.t
    public static final int b(byte[] bArr, int i7, int i8) {
        int i9;
        byte m7 = u1.m(bArr, (i7 + i8) / 2);
        while (i7 <= i8) {
            while (true) {
                int m8 = u1.m(bArr, i7) & v3.t1.f17828n;
                i9 = m7 & v3.t1.f17828n;
                if (u4.l0.t(m8, i9) >= 0) {
                    break;
                }
                i7++;
            }
            while (u4.l0.t(u1.m(bArr, i8) & v3.t1.f17828n, i9) > 0) {
                i8--;
            }
            if (i7 <= i8) {
                byte m9 = u1.m(bArr, i7);
                u1.t(bArr, i7, u1.m(bArr, i8));
                u1.t(bArr, i8, m9);
                i7++;
                i8--;
            }
        }
        return i7;
    }

    @v3.t
    public static final int c(short[] sArr, int i7, int i8) {
        int i9;
        short m7 = i2.m(sArr, (i7 + i8) / 2);
        while (i7 <= i8) {
            while (true) {
                int m8 = i2.m(sArr, i7) & h2.f17796n;
                i9 = m7 & h2.f17796n;
                if (u4.l0.t(m8, i9) >= 0) {
                    break;
                }
                i7++;
            }
            while (u4.l0.t(i2.m(sArr, i8) & h2.f17796n, i9) > 0) {
                i8--;
            }
            if (i7 <= i8) {
                short m9 = i2.m(sArr, i7);
                i2.t(sArr, i7, i2.m(sArr, i8));
                i2.t(sArr, i8, m9);
                i7++;
                i8--;
            }
        }
        return i7;
    }

    @v3.t
    public static final int d(int[] iArr, int i7, int i8) {
        int m7 = y1.m(iArr, (i7 + i8) / 2);
        while (i7 <= i8) {
            while (Integer.compareUnsigned(y1.m(iArr, i7), m7) < 0) {
                i7++;
            }
            while (Integer.compareUnsigned(y1.m(iArr, i8), m7) > 0) {
                i8--;
            }
            if (i7 <= i8) {
                int m8 = y1.m(iArr, i7);
                y1.t(iArr, i7, y1.m(iArr, i8));
                y1.t(iArr, i8, m8);
                i7++;
                i8--;
            }
        }
        return i7;
    }

    @v3.t
    public static final void e(long[] jArr, int i7, int i8) {
        int a7 = a(jArr, i7, i8);
        int i9 = a7 - 1;
        if (i7 < i9) {
            e(jArr, i7, i9);
        }
        if (a7 < i8) {
            e(jArr, a7, i8);
        }
    }

    @v3.t
    public static final void f(byte[] bArr, int i7, int i8) {
        int b7 = b(bArr, i7, i8);
        int i9 = b7 - 1;
        if (i7 < i9) {
            f(bArr, i7, i9);
        }
        if (b7 < i8) {
            f(bArr, b7, i8);
        }
    }

    @v3.t
    public static final void g(short[] sArr, int i7, int i8) {
        int c7 = c(sArr, i7, i8);
        int i9 = c7 - 1;
        if (i7 < i9) {
            g(sArr, i7, i9);
        }
        if (c7 < i8) {
            g(sArr, c7, i8);
        }
    }

    @v3.t
    public static final void h(int[] iArr, int i7, int i8) {
        int d7 = d(iArr, i7, i8);
        int i9 = d7 - 1;
        if (i7 < i9) {
            h(iArr, i7, i9);
        }
        if (d7 < i8) {
            h(iArr, d7, i8);
        }
    }

    @v3.t
    public static final void i(@n6.d long[] jArr, int i7, int i8) {
        u4.l0.p(jArr, "array");
        e(jArr, i7, i8 - 1);
    }

    @v3.t
    public static final void j(@n6.d byte[] bArr, int i7, int i8) {
        u4.l0.p(bArr, "array");
        f(bArr, i7, i8 - 1);
    }

    @v3.t
    public static final void k(@n6.d short[] sArr, int i7, int i8) {
        u4.l0.p(sArr, "array");
        g(sArr, i7, i8 - 1);
    }

    @v3.t
    public static final void l(@n6.d int[] iArr, int i7, int i8) {
        u4.l0.p(iArr, "array");
        h(iArr, i7, i8 - 1);
    }
}
