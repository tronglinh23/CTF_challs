package i6;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class y implements o0 {

    /* renamed from: k  reason: collision with root package name */
    public int f11299k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11300l;

    /* renamed from: m  reason: collision with root package name */
    public final o f11301m;

    /* renamed from: n  reason: collision with root package name */
    public final Inflater f11302n;

    public y(@n6.d o oVar, @n6.d Inflater inflater) {
        u4.l0.p(oVar, "source");
        u4.l0.p(inflater, "inflater");
        this.f11301m = oVar;
        this.f11302n = inflater;
    }

    public final long a(@n6.d m mVar, long j7) throws IOException {
        u4.l0.p(mVar, "sink");
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        } else if ((!this.f11300l) == true) {
            if (i7 == 0) {
                return 0L;
            }
            try {
                j0 d12 = mVar.d1(1);
                int min = (int) Math.min(j7, 8192 - d12.f11214c);
                b();
                int inflate = this.f11302n.inflate(d12.f11212a, d12.f11214c, min);
                d();
                if (inflate > 0) {
                    d12.f11214c += inflate;
                    long j8 = inflate;
                    mVar.W0(mVar.a1() + j8);
                    return j8;
                }
                if (d12.f11213b == d12.f11214c) {
                    mVar.f11238k = d12.b();
                    k0.d(d12);
                }
                return 0L;
            } catch (DataFormatException e7) {
                throw new IOException(e7);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final boolean b() throws IOException {
        if (this.f11302n.needsInput()) {
            if (this.f11301m.c0()) {
                return true;
            }
            j0 j0Var = this.f11301m.j().f11238k;
            u4.l0.m(j0Var);
            int i7 = j0Var.f11214c;
            int i8 = j0Var.f11213b;
            int i9 = i7 - i8;
            this.f11299k = i9;
            this.f11302n.setInput(j0Var.f11212a, i8, i9);
            return false;
        }
        return false;
    }

    @Override // i6.o0
    @n6.d
    public q0 c() {
        return this.f11301m.c();
    }

    @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f11300l) {
            return;
        }
        this.f11302n.end();
        this.f11300l = true;
        this.f11301m.close();
    }

    public final void d() {
        int i7 = this.f11299k;
        if (i7 == 0) {
            return;
        }
        int remaining = i7 - this.f11302n.getRemaining();
        this.f11299k -= remaining;
        this.f11301m.skip(remaining);
    }

    @Override // i6.o0
    public long l0(@n6.d m mVar, long j7) throws IOException {
        u4.l0.p(mVar, "sink");
        do {
            long a7 = a(mVar, j7);
            if (a7 > 0) {
                return a7;
            }
            if (this.f11302n.finished() || this.f11302n.needsDictionary()) {
                return -1L;
            }
        } while (!this.f11301m.c0());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(@n6.d o0 o0Var, @n6.d Inflater inflater) {
        this(a0.d(o0Var), inflater);
        u4.l0.p(o0Var, "source");
        u4.l0.p(inflater, "inflater");
    }
}
