package i6;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* loaded from: classes.dex */
public final class q implements m0 {

    /* renamed from: k  reason: collision with root package name */
    public boolean f11264k;

    /* renamed from: l  reason: collision with root package name */
    public final n f11265l;

    /* renamed from: m  reason: collision with root package name */
    public final Deflater f11266m;

    public q(@n6.d n nVar, @n6.d Deflater deflater) {
        u4.l0.p(nVar, "sink");
        u4.l0.p(deflater, "deflater");
        this.f11265l = nVar;
        this.f11266m = deflater;
    }

    @IgnoreJRERequirement
    public final void a(boolean z6) {
        j0 d12;
        int deflate;
        m j7 = this.f11265l.j();
        while (true) {
            d12 = j7.d1(1);
            if (z6) {
                Deflater deflater = this.f11266m;
                byte[] bArr = d12.f11212a;
                int i7 = d12.f11214c;
                deflate = deflater.deflate(bArr, i7, 8192 - i7, 2);
            } else {
                Deflater deflater2 = this.f11266m;
                byte[] bArr2 = d12.f11212a;
                int i8 = d12.f11214c;
                deflate = deflater2.deflate(bArr2, i8, 8192 - i8);
            }
            if (deflate > 0) {
                d12.f11214c += deflate;
                j7.W0(j7.a1() + deflate);
                this.f11265l.u0();
            } else if (this.f11266m.needsInput()) {
                break;
            }
        }
        if (d12.f11213b == d12.f11214c) {
            j7.f11238k = d12.b();
            k0.d(d12);
        }
    }

    public final void b() {
        this.f11266m.finish();
        a(false);
    }

    @Override // i6.m0
    @n6.d
    public q0 c() {
        return this.f11265l.c();
    }

    @Override // i6.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f11264k) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f11266m.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f11265l.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f11264k = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // i6.m0, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f11265l.flush();
    }

    @n6.d
    public String toString() {
        return "DeflaterSink(" + this.f11265l + ')';
    }

    @Override // i6.m0
    public void w(@n6.d m mVar, long j7) throws IOException {
        u4.l0.p(mVar, "source");
        j.e(mVar.a1(), 0L, j7);
        while (j7 > 0) {
            j0 j0Var = mVar.f11238k;
            u4.l0.m(j0Var);
            int min = (int) Math.min(j7, j0Var.f11214c - j0Var.f11213b);
            this.f11266m.setInput(j0Var.f11212a, j0Var.f11213b, min);
            a(false);
            long j8 = min;
            mVar.W0(mVar.a1() - j8);
            int i7 = j0Var.f11213b + min;
            j0Var.f11213b = i7;
            if (i7 == j0Var.f11214c) {
                mVar.f11238k = j0Var.b();
                k0.d(j0Var);
            }
            j7 -= j8;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@n6.d m0 m0Var, @n6.d Deflater deflater) {
        this(a0.c(m0Var), deflater);
        u4.l0.p(m0Var, "sink");
        u4.l0.p(deflater, "deflater");
    }
}
