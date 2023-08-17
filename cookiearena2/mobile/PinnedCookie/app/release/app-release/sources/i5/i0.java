package i5;

import u4.l0;
import v3.b2;
import v3.g1;
import v3.h2;
import v3.p2;
import v3.q2;
import v3.t1;
import v3.x1;
@s4.h(name = "UStringsKt")
/* loaded from: classes.dex */
public final class i0 {
    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final String a(long j7, int i7) {
        return p2.l(j7, d.a(i7));
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final String b(byte b7, int i7) {
        String num = Integer.toString(b7 & t1.f17828n, d.a(i7));
        l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final String c(int i7, int i8) {
        String l7 = Long.toString(i7 & 4294967295L, d.a(i8));
        l0.o(l7, "toString(this, checkRadix(radix))");
        return l7;
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final String d(short s6, int i7) {
        String num = Integer.toString(s6 & h2.f17796n, d.a(i7));
        l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final byte e(@n6.d String str) {
        l0.p(str, "<this>");
        t1 g7 = g(str);
        if (g7 != null) {
            return g7.j0();
        }
        a0.V0(str);
        throw new v3.y();
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final byte f(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        t1 h7 = h(str, i7);
        if (h7 != null) {
            return h7.j0();
        }
        a0.V0(str);
        throw new v3.y();
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.t.class})
    public static final t1 g(@n6.d String str) {
        l0.p(str, "<this>");
        return h(str, 10);
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.t.class})
    public static final t1 h(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        x1 l7 = l(str, i7);
        if (l7 != null) {
            int l02 = l7.l0();
            if (Integer.compareUnsigned(l02, x1.l(255)) > 0) {
                return null;
            }
            return t1.d(t1.l((byte) l02));
        }
        return null;
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int i(@n6.d String str) {
        l0.p(str, "<this>");
        x1 k7 = k(str);
        if (k7 != null) {
            return k7.l0();
        }
        a0.V0(str);
        throw new v3.y();
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int j(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        x1 l7 = l(str, i7);
        if (l7 != null) {
            return l7.l0();
        }
        a0.V0(str);
        throw new v3.y();
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.t.class})
    public static final x1 k(@n6.d String str) {
        l0.p(str, "<this>");
        return l(str, 10);
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.t.class})
    public static final x1 l(@n6.d String str, int i7) {
        int i8;
        l0.p(str, "<this>");
        d.a(i7);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        if (l0.t(charAt, 48) < 0) {
            i8 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i8 = 0;
        }
        int l7 = x1.l(i7);
        int i10 = 119304647;
        while (i8 < length) {
            int b7 = d.b(str.charAt(i8), i7);
            if (b7 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i9, i10) > 0) {
                if (i10 == 119304647) {
                    i10 = Integer.divideUnsigned(-1, l7);
                    if (Integer.compareUnsigned(i9, i10) > 0) {
                    }
                }
                return null;
            }
            int l8 = x1.l(i9 * l7);
            int l9 = x1.l(x1.l(b7) + l8);
            if (Integer.compareUnsigned(l9, l8) < 0) {
                return null;
            }
            i8++;
            i9 = l9;
        }
        return x1.d(i9);
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final long m(@n6.d String str) {
        l0.p(str, "<this>");
        b2 o6 = o(str);
        if (o6 != null) {
            return o6.l0();
        }
        a0.V0(str);
        throw new v3.y();
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final long n(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        b2 p6 = p(str, i7);
        if (p6 != null) {
            return p6.l0();
        }
        a0.V0(str);
        throw new v3.y();
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.t.class})
    public static final b2 o(@n6.d String str) {
        l0.p(str, "<this>");
        return p(str, 10);
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.t.class})
    public static final b2 p(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        d.a(i7);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char charAt = str.charAt(0);
        if (l0.t(charAt, 48) < 0) {
            i8 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long l7 = b2.l(i7);
        long j7 = 0;
        long j8 = 512409557603043100L;
        while (i8 < length) {
            if (d.b(str.charAt(i8), i7) < 0) {
                return null;
            }
            if (Long.compareUnsigned(j7, j8) > 0) {
                if (j8 == 512409557603043100L) {
                    j8 = Long.divideUnsigned(-1L, l7);
                    if (Long.compareUnsigned(j7, j8) > 0) {
                    }
                }
                return null;
            }
            long l8 = b2.l(j7 * l7);
            long l9 = b2.l(b2.l(x1.l(r13) & 4294967295L) + l8);
            if (Long.compareUnsigned(l9, l8) < 0) {
                return null;
            }
            i8++;
            j7 = l9;
        }
        return b2.d(j7);
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final short q(@n6.d String str) {
        l0.p(str, "<this>");
        h2 s6 = s(str);
        if (s6 != null) {
            return s6.j0();
        }
        a0.V0(str);
        throw new v3.y();
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final short r(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        h2 t6 = t(str, i7);
        if (t6 != null) {
            return t6.j0();
        }
        a0.V0(str);
        throw new v3.y();
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.t.class})
    public static final h2 s(@n6.d String str) {
        l0.p(str, "<this>");
        return t(str, 10);
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.t.class})
    public static final h2 t(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        x1 l7 = l(str, i7);
        if (l7 != null) {
            int l02 = l7.l0();
            if (Integer.compareUnsigned(l02, x1.l(65535)) > 0) {
                return null;
            }
            return h2.d(h2.l((short) l02));
        }
        return null;
    }
}
