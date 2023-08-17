package d5;

import d5.v;
import d5.y;
import java.util.NoSuchElementException;
import u4.l0;
import v3.b2;
import v3.g1;
import v3.h2;
import v3.q2;
import v3.t1;
import v3.x1;
/* loaded from: classes.dex */
public class c0 {
    @g1(version = "1.7")
    public static final int A(@n6.d v vVar) {
        l0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            throw new NoSuchElementException("Progression " + vVar + " is empty.");
        }
        return vVar.i();
    }

    @g1(version = "1.7")
    public static final long B(@n6.d y yVar) {
        l0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            throw new NoSuchElementException("Progression " + yVar + " is empty.");
        }
        return yVar.i();
    }

    @g1(version = "1.7")
    @n6.e
    public static final x1 C(@n6.d v vVar) {
        l0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return x1.d(vVar.i());
    }

    @g1(version = "1.7")
    @n6.e
    public static final b2 D(@n6.d y yVar) {
        l0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return b2.d(yVar.i());
    }

    @g1(version = "1.7")
    public static final int E(@n6.d v vVar) {
        l0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            throw new NoSuchElementException("Progression " + vVar + " is empty.");
        }
        return vVar.j();
    }

    @g1(version = "1.7")
    public static final long F(@n6.d y yVar) {
        l0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            throw new NoSuchElementException("Progression " + yVar + " is empty.");
        }
        return yVar.j();
    }

    @g1(version = "1.7")
    @n6.e
    public static final x1 G(@n6.d v vVar) {
        l0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return x1.d(vVar.j());
    }

    @g1(version = "1.7")
    @n6.e
    public static final b2 H(@n6.d y yVar) {
        l0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return b2.d(yVar.j());
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final int I(x xVar) {
        l0.p(xVar, "<this>");
        return J(xVar, b5.f.f7260k);
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int J(@n6.d x xVar, @n6.d b5.f fVar) {
        l0.p(xVar, "<this>");
        l0.p(fVar, "random");
        try {
            return b5.h.h(fVar, xVar);
        } catch (IllegalArgumentException e7) {
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final long K(a0 a0Var) {
        l0.p(a0Var, "<this>");
        return L(a0Var, b5.f.f7260k);
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final long L(@n6.d a0 a0Var, @n6.d b5.f fVar) {
        l0.p(a0Var, "<this>");
        l0.p(fVar, "random");
        try {
            return b5.h.l(fVar, a0Var);
        } catch (IllegalArgumentException e7) {
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.r.class, v3.t.class})
    public static final x1 M(x xVar) {
        l0.p(xVar, "<this>");
        return N(xVar, b5.f.f7260k);
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.r.class, v3.t.class})
    public static final x1 N(@n6.d x xVar, @n6.d b5.f fVar) {
        l0.p(xVar, "<this>");
        l0.p(fVar, "random");
        if (xVar.isEmpty()) {
            return null;
        }
        return x1.d(b5.h.h(fVar, xVar));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.r.class, v3.t.class})
    public static final b2 O(a0 a0Var) {
        l0.p(a0Var, "<this>");
        return P(a0Var, b5.f.f7260k);
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.r.class, v3.t.class})
    public static final b2 P(@n6.d a0 a0Var, @n6.d b5.f fVar) {
        l0.p(a0Var, "<this>");
        l0.p(fVar, "random");
        if (a0Var.isEmpty()) {
            return null;
        }
        return b2.d(b5.h.l(fVar, a0Var));
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final v Q(@n6.d v vVar) {
        l0.p(vVar, "<this>");
        return v.f8514n.a(vVar.j(), vVar.i(), -vVar.k());
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final y R(@n6.d y yVar) {
        l0.p(yVar, "<this>");
        return y.f8524n.a(yVar.j(), yVar.i(), -yVar.k());
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final v S(@n6.d v vVar, int i7) {
        l0.p(vVar, "<this>");
        t.a(i7 > 0, Integer.valueOf(i7));
        v.a aVar = v.f8514n;
        int i8 = vVar.i();
        int j7 = vVar.j();
        if (vVar.k() <= 0) {
            i7 = -i7;
        }
        return aVar.a(i8, j7, i7);
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final y T(@n6.d y yVar, long j7) {
        l0.p(yVar, "<this>");
        t.a(j7 > 0, Long.valueOf(j7));
        y.a aVar = y.f8524n;
        long i7 = yVar.i();
        long j8 = yVar.j();
        if (yVar.k() <= 0) {
            j7 = -j7;
        }
        return aVar.a(i7, j8, j7);
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final x U(short s6, short s7) {
        return l0.t(s7 & h2.f17796n, 0) <= 0 ? x.f8522o.a() : new x(x1.l(s6 & h2.f17796n), x1.l(x1.l(r3) - 1), null);
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final x V(int i7, int i8) {
        return Integer.compareUnsigned(i8, 0) <= 0 ? x.f8522o.a() : new x(i7, x1.l(i8 - 1), null);
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final x W(byte b7, byte b8) {
        return l0.t(b8 & t1.f17828n, 0) <= 0 ? x.f8522o.a() : new x(x1.l(b7 & t1.f17828n), x1.l(x1.l(r3) - 1), null);
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final a0 X(long j7, long j8) {
        return Long.compareUnsigned(j8, 0L) <= 0 ? a0.f8474o.a() : new a0(j7, b2.l(j8 - b2.l(1 & 4294967295L)), null);
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final short a(short s6, short s7) {
        return l0.t(s6 & h2.f17796n, 65535 & s7) < 0 ? s7 : s6;
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int b(int i7, int i8) {
        return Integer.compareUnsigned(i7, i8) < 0 ? i8 : i7;
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final byte c(byte b7, byte b8) {
        return l0.t(b7 & t1.f17828n, b8 & t1.f17828n) < 0 ? b8 : b7;
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final long d(long j7, long j8) {
        return Long.compareUnsigned(j7, j8) < 0 ? j8 : j7;
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final short e(short s6, short s7) {
        return l0.t(s6 & h2.f17796n, 65535 & s7) > 0 ? s7 : s6;
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int f(int i7, int i8) {
        return Integer.compareUnsigned(i7, i8) > 0 ? i8 : i7;
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final byte g(byte b7, byte b8) {
        return l0.t(b7 & t1.f17828n, b8 & t1.f17828n) > 0 ? b8 : b7;
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final long h(long j7, long j8) {
        return Long.compareUnsigned(j7, j8) > 0 ? j8 : j7;
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final long i(long j7, @n6.d g<b2> gVar) {
        l0.p(gVar, "range");
        if (gVar instanceof f) {
            return ((b2) u.M(b2.d(j7), (f) gVar)).l0();
        }
        if (!gVar.isEmpty()) {
            return Long.compareUnsigned(j7, gVar.b().l0()) < 0 ? gVar.b().l0() : Long.compareUnsigned(j7, gVar.g().l0()) > 0 ? gVar.g().l0() : j7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final short j(short s6, short s7, short s8) {
        int i7 = s7 & h2.f17796n;
        int i8 = s8 & h2.f17796n;
        if (l0.t(i7, i8) <= 0) {
            int i9 = 65535 & s6;
            return l0.t(i9, i7) < 0 ? s7 : l0.t(i9, i8) > 0 ? s8 : s6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) h2.e0(s8)) + " is less than minimum " + ((Object) h2.e0(s7)) + '.');
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int k(int i7, int i8, int i9) {
        if (Integer.compareUnsigned(i8, i9) <= 0) {
            return Integer.compareUnsigned(i7, i8) < 0 ? i8 : Integer.compareUnsigned(i7, i9) > 0 ? i9 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) x1.g0(i9)) + " is less than minimum " + ((Object) x1.g0(i8)) + '.');
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final byte l(byte b7, byte b8, byte b9) {
        int i7 = b8 & t1.f17828n;
        int i8 = b9 & t1.f17828n;
        if (l0.t(i7, i8) <= 0) {
            int i9 = b7 & t1.f17828n;
            return l0.t(i9, i7) < 0 ? b8 : l0.t(i9, i8) > 0 ? b9 : b7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) t1.e0(b9)) + " is less than minimum " + ((Object) t1.e0(b8)) + '.');
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final long m(long j7, long j8, long j9) {
        if (Long.compareUnsigned(j8, j9) <= 0) {
            return Long.compareUnsigned(j7, j8) < 0 ? j8 : Long.compareUnsigned(j7, j9) > 0 ? j9 : j7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) b2.g0(j9)) + " is less than minimum " + ((Object) b2.g0(j8)) + '.');
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int n(int i7, @n6.d g<x1> gVar) {
        l0.p(gVar, "range");
        if (gVar instanceof f) {
            return ((x1) u.M(x1.d(i7), (f) gVar)).l0();
        }
        if (!gVar.isEmpty()) {
            return Integer.compareUnsigned(i7, gVar.b().l0()) < 0 ? gVar.b().l0() : Integer.compareUnsigned(i7, gVar.g().l0()) > 0 ? gVar.g().l0() : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final boolean o(@n6.d x xVar, byte b7) {
        l0.p(xVar, "$this$contains");
        return xVar.m(x1.l(b7 & t1.f17828n));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final boolean p(a0 a0Var, b2 b2Var) {
        l0.p(a0Var, "$this$contains");
        return b2Var != null && a0Var.m(b2Var.l0());
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final boolean q(@n6.d a0 a0Var, int i7) {
        l0.p(a0Var, "$this$contains");
        return a0Var.m(b2.l(i7 & 4294967295L));
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final boolean r(@n6.d a0 a0Var, byte b7) {
        l0.p(a0Var, "$this$contains");
        return a0Var.m(b2.l(b7 & 255));
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final boolean s(@n6.d x xVar, short s6) {
        l0.p(xVar, "$this$contains");
        return xVar.m(x1.l(s6 & h2.f17796n));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final boolean t(x xVar, x1 x1Var) {
        l0.p(xVar, "$this$contains");
        return x1Var != null && xVar.m(x1Var.l0());
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final boolean u(@n6.d x xVar, long j7) {
        l0.p(xVar, "$this$contains");
        return b2.l(j7 >>> 32) == 0 && xVar.m(x1.l((int) j7));
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final boolean v(@n6.d a0 a0Var, short s6) {
        l0.p(a0Var, "$this$contains");
        return a0Var.m(b2.l(s6 & h6.g.f10414s));
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final v w(short s6, short s7) {
        return v.f8514n.a(x1.l(s6 & h2.f17796n), x1.l(s7 & h2.f17796n), -1);
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final v x(int i7, int i8) {
        return v.f8514n.a(i7, i8, -1);
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final v y(byte b7, byte b8) {
        return v.f8514n.a(x1.l(b7 & t1.f17828n), x1.l(b8 & t1.f17828n), -1);
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.t.class})
    public static final y z(long j7, long j8) {
        return y.f8524n.a(j7, j8, -1L);
    }
}
