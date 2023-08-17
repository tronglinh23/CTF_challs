package j6;

import i6.h0;
import i6.m;
import i6.m0;
import i6.n;
import i6.o0;
import i6.p;
import i6.q0;
import java.io.EOFException;
import u.v;
import u4.l0;
/* loaded from: classes.dex */
public final class c {
    public static final void a(@n6.d h0 h0Var) {
        l0.p(h0Var, "$this$commonClose");
        if (h0Var.f11202l) {
            return;
        }
        try {
            if (h0Var.f11201k.a1() > 0) {
                m0 m0Var = h0Var.f11203m;
                m mVar = h0Var.f11201k;
                m0Var.w(mVar, mVar.a1());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            h0Var.f11203m.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        h0Var.f11202l = true;
        if (th != null) {
            throw th;
        }
    }

    @n6.d
    public static final n b(@n6.d h0 h0Var) {
        l0.p(h0Var, "$this$commonEmit");
        if ((!h0Var.f11202l) == true) {
            long a12 = h0Var.f11201k.a1();
            if (a12 > 0) {
                h0Var.f11203m.w(h0Var.f11201k, a12);
            }
            return h0Var;
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n c(@n6.d h0 h0Var) {
        l0.p(h0Var, "$this$commonEmitCompleteSegments");
        if ((!h0Var.f11202l) == true) {
            long p6 = h0Var.f11201k.p();
            if (p6 > 0) {
                h0Var.f11203m.w(h0Var.f11201k, p6);
            }
            return h0Var;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final void d(@n6.d h0 h0Var) {
        l0.p(h0Var, "$this$commonFlush");
        if ((!h0Var.f11202l) != true) {
            throw new IllegalStateException("closed".toString());
        }
        if (h0Var.f11201k.a1() > 0) {
            m0 m0Var = h0Var.f11203m;
            m mVar = h0Var.f11201k;
            m0Var.w(mVar, mVar.a1());
        }
        h0Var.f11203m.flush();
    }

    @n6.d
    public static final q0 e(@n6.d h0 h0Var) {
        l0.p(h0Var, "$this$commonTimeout");
        return h0Var.f11203m.c();
    }

    @n6.d
    public static final String f(@n6.d h0 h0Var) {
        l0.p(h0Var, "$this$commonToString");
        return "buffer(" + h0Var.f11203m + ')';
    }

    @n6.d
    public static final n g(@n6.d h0 h0Var, @n6.d p pVar) {
        l0.p(h0Var, "$this$commonWrite");
        l0.p(pVar, "byteString");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.K(pVar);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n h(@n6.d h0 h0Var, @n6.d p pVar, int i7, int i8) {
        l0.p(h0Var, "$this$commonWrite");
        l0.p(pVar, "byteString");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.M(pVar, i7, i8);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n i(@n6.d h0 h0Var, @n6.d o0 o0Var, long j7) {
        l0.p(h0Var, "$this$commonWrite");
        l0.p(o0Var, "source");
        while (j7 > 0) {
            long l02 = o0Var.l0(h0Var.f11201k, j7);
            if (l02 == -1) {
                throw new EOFException();
            }
            j7 -= l02;
            h0Var.u0();
        }
        return h0Var;
    }

    @n6.d
    public static final n j(@n6.d h0 h0Var, @n6.d byte[] bArr) {
        l0.p(h0Var, "$this$commonWrite");
        l0.p(bArr, "source");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.k0(bArr);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n k(@n6.d h0 h0Var, @n6.d byte[] bArr, int i7, int i8) {
        l0.p(h0Var, "$this$commonWrite");
        l0.p(bArr, "source");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.n(bArr, i7, i8);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final void l(@n6.d h0 h0Var, @n6.d m mVar, long j7) {
        l0.p(h0Var, "$this$commonWrite");
        l0.p(mVar, "source");
        if ((!h0Var.f11202l) != true) {
            throw new IllegalStateException("closed".toString());
        }
        h0Var.f11201k.w(mVar, j7);
        h0Var.u0();
    }

    public static final long m(@n6.d h0 h0Var, @n6.d o0 o0Var) {
        l0.p(h0Var, "$this$commonWriteAll");
        l0.p(o0Var, "source");
        long j7 = 0;
        while (true) {
            long l02 = o0Var.l0(h0Var.f11201k, 8192);
            if (l02 == -1) {
                return j7;
            }
            j7 += l02;
            h0Var.u0();
        }
    }

    @n6.d
    public static final n n(@n6.d h0 h0Var, int i7) {
        l0.p(h0Var, "$this$commonWriteByte");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.e0(i7);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n o(@n6.d h0 h0Var, long j7) {
        l0.p(h0Var, "$this$commonWriteDecimalLong");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.J0(j7);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n p(@n6.d h0 h0Var, long j7) {
        l0.p(h0Var, "$this$commonWriteHexadecimalUnsignedLong");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.v(j7);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n q(@n6.d h0 h0Var, int i7) {
        l0.p(h0Var, "$this$commonWriteInt");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.J(i7);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n r(@n6.d h0 h0Var, int i7) {
        l0.p(h0Var, "$this$commonWriteIntLe");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.a0(i7);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n s(@n6.d h0 h0Var, long j7) {
        l0.p(h0Var, "$this$commonWriteLong");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.F0(j7);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n t(@n6.d h0 h0Var, long j7) {
        l0.p(h0Var, "$this$commonWriteLongLe");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.P(j7);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n u(@n6.d h0 h0Var, int i7) {
        l0.p(h0Var, "$this$commonWriteShort");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.F(i7);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n v(@n6.d h0 h0Var, int i7) {
        l0.p(h0Var, "$this$commonWriteShortLe");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.B0(i7);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n w(@n6.d h0 h0Var, @n6.d String str) {
        l0.p(h0Var, "$this$commonWriteUtf8");
        l0.p(str, v.b.f17140e);
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.H0(str);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n x(@n6.d h0 h0Var, @n6.d String str, int i7, int i8) {
        l0.p(h0Var, "$this$commonWriteUtf8");
        l0.p(str, v.b.f17140e);
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.s(str, i7, i8);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @n6.d
    public static final n y(@n6.d h0 h0Var, int i7) {
        l0.p(h0Var, "$this$commonWriteUtf8CodePoint");
        if ((!h0Var.f11202l) == true) {
            h0Var.f11201k.H(i7);
            return h0Var.u0();
        }
        throw new IllegalStateException("closed".toString());
    }
}
