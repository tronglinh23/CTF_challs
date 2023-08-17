package b5;

import d5.a0;
import d5.x;
import u4.l0;
import u4.r1;
import v3.b2;
import v3.g1;
import v3.q2;
import v3.t;
import v3.u1;
import v3.x1;
@r1({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* loaded from: classes.dex */
public final class h {
    public static final void a(int i7, int i8) {
        if (!(Integer.compareUnsigned(i8, i7) > 0)) {
            throw new IllegalArgumentException(g.c(x1.d(i7), x1.d(i8)).toString());
        }
    }

    public static final void b(long j7, long j8) {
        if (!(Long.compareUnsigned(j8, j7) > 0)) {
            throw new IllegalArgumentException(g.c(b2.d(j7), b2.d(j8)).toString());
        }
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final byte[] c(@n6.d f fVar, int i7) {
        l0.p(fVar, "<this>");
        return u1.f(fVar.d(i7));
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final byte[] d(@n6.d f fVar, @n6.d byte[] bArr) {
        l0.p(fVar, "$this$nextUBytes");
        l0.p(bArr, "array");
        fVar.e(bArr);
        return bArr;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final byte[] e(@n6.d f fVar, @n6.d byte[] bArr, int i7, int i8) {
        l0.p(fVar, "$this$nextUBytes");
        l0.p(bArr, "array");
        fVar.f(bArr, i7, i8);
        return bArr;
    }

    public static /* synthetic */ byte[] f(f fVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = u1.o(bArr);
        }
        return e(fVar, bArr, i7, i8);
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final int g(@n6.d f fVar) {
        l0.p(fVar, "<this>");
        return x1.l(fVar.l());
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final int h(@n6.d f fVar, @n6.d x xVar) {
        l0.p(fVar, "<this>");
        l0.p(xVar, "range");
        if (!xVar.isEmpty()) {
            return Integer.compareUnsigned(xVar.j(), -1) < 0 ? i(fVar, xVar.i(), x1.l(xVar.j() + 1)) : Integer.compareUnsigned(xVar.i(), 0) > 0 ? x1.l(i(fVar, x1.l(xVar.i() - 1), xVar.j()) + 1) : g(fVar);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + xVar);
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final int i(@n6.d f fVar, int i7, int i8) {
        l0.p(fVar, "$this$nextUInt");
        a(i7, i8);
        return x1.l(fVar.n(i7 ^ Integer.MIN_VALUE, i8 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final int j(@n6.d f fVar, int i7) {
        l0.p(fVar, "$this$nextUInt");
        return i(fVar, 0, i7);
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final long k(@n6.d f fVar) {
        l0.p(fVar, "<this>");
        return b2.l(fVar.o());
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final long l(@n6.d f fVar, @n6.d a0 a0Var) {
        l0.p(fVar, "<this>");
        l0.p(a0Var, "range");
        if (a0Var.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + a0Var);
        } else if (Long.compareUnsigned(a0Var.j(), -1L) < 0) {
            return n(fVar, a0Var.i(), b2.l(a0Var.j() + b2.l(1 & 4294967295L)));
        } else {
            if (Long.compareUnsigned(a0Var.i(), 0L) > 0) {
                long j7 = 1 & 4294967295L;
                return b2.l(n(fVar, b2.l(a0Var.i() - b2.l(j7)), a0Var.j()) + b2.l(j7));
            }
            return k(fVar);
        }
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final long m(@n6.d f fVar, long j7) {
        l0.p(fVar, "$this$nextULong");
        return n(fVar, 0L, j7);
    }

    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final long n(@n6.d f fVar, long j7, long j8) {
        l0.p(fVar, "$this$nextULong");
        b(j7, j8);
        return b2.l(fVar.q(j7 ^ Long.MIN_VALUE, j8 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
