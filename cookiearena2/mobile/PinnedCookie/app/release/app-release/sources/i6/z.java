package i6;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class z implements o0 {

    /* renamed from: k  reason: collision with root package name */
    public final InputStream f11303k;

    /* renamed from: l  reason: collision with root package name */
    public final q0 f11304l;

    public z(@n6.d InputStream inputStream, @n6.d q0 q0Var) {
        u4.l0.p(inputStream, "input");
        u4.l0.p(q0Var, "timeout");
        this.f11303k = inputStream;
        this.f11304l = q0Var;
    }

    @Override // i6.o0
    @n6.d
    public q0 c() {
        return this.f11304l;
    }

    @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11303k.close();
    }

    @Override // i6.o0
    public long l0(@n6.d m mVar, long j7) {
        u4.l0.p(mVar, "sink");
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (i7 == 0) {
            return 0L;
        }
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        try {
            this.f11304l.h();
            j0 d12 = mVar.d1(1);
            int read = this.f11303k.read(d12.f11212a, d12.f11214c, (int) Math.min(j7, 8192 - d12.f11214c));
            if (read != -1) {
                d12.f11214c += read;
                long j8 = read;
                mVar.W0(mVar.a1() + j8);
                return j8;
            } else if (d12.f11213b == d12.f11214c) {
                mVar.f11238k = d12.b();
                k0.d(d12);
                return -1L;
            } else {
                return -1L;
            }
        } catch (AssertionError e7) {
            if (a0.e(e7)) {
                throw new IOException(e7);
            }
            throw e7;
        }
    }

    @n6.d
    public String toString() {
        return "source(" + this.f11303k + ')';
    }
}
