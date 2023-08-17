package v1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v1.o;
/* loaded from: classes.dex */
public final class p extends v {

    /* loaded from: classes.dex */
    public static final class a extends b {
        public a f(int i7, int i8, ByteBuffer byteBuffer) {
            b(i7, i8, byteBuffer);
            return this;
        }

        public p g(int i7) {
            return h(new p(), i7);
        }

        public p h(p pVar, int i7) {
            return pVar.v(v.c(a(i7), this.f17637d), this.f17637d);
        }
    }

    public static void A(i iVar, int i7) {
        iVar.k(0, i7, 0);
    }

    public static int B(i iVar, int[] iArr) {
        iVar.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            iVar.n(iArr[length]);
        }
        return iVar.E();
    }

    public static int C(i iVar, int i7, int i8, int i9) {
        iVar.g0(3);
        z(iVar, i9);
        y(iVar, i8);
        A(iVar, i7);
        return D(iVar);
    }

    public static int D(i iVar) {
        return iVar.D();
    }

    public static void E(i iVar, int i7) {
        iVar.F(i7);
    }

    public static void F(i iVar, int i7) {
        iVar.J(i7);
    }

    public static p G(ByteBuffer byteBuffer) {
        return H(byteBuffer, new p());
    }

    public static p H(ByteBuffer byteBuffer, p pVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return pVar.v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void Q(i iVar, int i7) {
        iVar.h0(4, i7, 4);
    }

    public static void R(i iVar) {
        iVar.g0(3);
    }

    public static void u() {
        g.a();
    }

    public static void y(i iVar, int i7) {
        iVar.o(1, i7, 0);
    }

    public static void z(i iVar, int i7) {
        iVar.o(2, i7, 0);
    }

    public o I(int i7) {
        return J(new o(), i7);
    }

    public o J(o oVar, int i7) {
        int d7 = d(6);
        if (d7 != 0) {
            return oVar.v(b(l(d7) + (i7 * 4)), this.f17737b);
        }
        return null;
    }

    public int K() {
        int d7 = d(6);
        if (d7 != 0) {
            return o(d7);
        }
        return 0;
    }

    public o.a L() {
        return M(new o.a());
    }

    public o.a M(o.a aVar) {
        int d7 = d(6);
        if (d7 != 0) {
            return aVar.f(l(d7), 4, this.f17737b);
        }
        return null;
    }

    public String N() {
        int d7 = d(8);
        if (d7 != 0) {
            return h(d7 + this.f17736a);
        }
        return null;
    }

    public ByteBuffer O() {
        return m(8, 1);
    }

    public ByteBuffer P(ByteBuffer byteBuffer) {
        return n(byteBuffer, 8, 1);
    }

    public int S() {
        int d7 = d(4);
        if (d7 != 0) {
            return this.f17737b.getInt(d7 + this.f17736a);
        }
        return 0;
    }

    public p v(int i7, ByteBuffer byteBuffer) {
        w(i7, byteBuffer);
        return this;
    }

    public void w(int i7, ByteBuffer byteBuffer) {
        g(i7, byteBuffer);
    }
}
