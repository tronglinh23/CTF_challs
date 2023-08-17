package i6;

import java.io.OutputStream;
/* loaded from: classes.dex */
public final class e0 implements m0 {

    /* renamed from: k  reason: collision with root package name */
    public final OutputStream f11173k;

    /* renamed from: l  reason: collision with root package name */
    public final q0 f11174l;

    public e0(@n6.d OutputStream outputStream, @n6.d q0 q0Var) {
        u4.l0.p(outputStream, "out");
        u4.l0.p(q0Var, "timeout");
        this.f11173k = outputStream;
        this.f11174l = q0Var;
    }

    @Override // i6.m0
    @n6.d
    public q0 c() {
        return this.f11174l;
    }

    @Override // i6.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11173k.close();
    }

    @Override // i6.m0, java.io.Flushable
    public void flush() {
        this.f11173k.flush();
    }

    @n6.d
    public String toString() {
        return "sink(" + this.f11173k + ')';
    }

    @Override // i6.m0
    public void w(@n6.d m mVar, long j7) {
        u4.l0.p(mVar, "source");
        j.e(mVar.a1(), 0L, j7);
        while (j7 > 0) {
            this.f11174l.h();
            j0 j0Var = mVar.f11238k;
            u4.l0.m(j0Var);
            int min = (int) Math.min(j7, j0Var.f11214c - j0Var.f11213b);
            this.f11173k.write(j0Var.f11212a, j0Var.f11213b, min);
            j0Var.f11213b += min;
            long j8 = min;
            j7 -= j8;
            mVar.W0(mVar.a1() - j8);
            if (j0Var.f11213b == j0Var.f11214c) {
                mVar.f11238k = j0Var.b();
                k0.d(j0Var);
            }
        }
    }
}
