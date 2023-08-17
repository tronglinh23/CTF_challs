package i6;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import v3.b1;
/* loaded from: classes.dex */
public final class u implements m0 {

    /* renamed from: k  reason: collision with root package name */
    public final h0 f11283k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final Deflater f11284l;

    /* renamed from: m  reason: collision with root package name */
    public final q f11285m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11286n;

    /* renamed from: o  reason: collision with root package name */
    public final CRC32 f11287o;

    public u(@n6.d m0 m0Var) {
        u4.l0.p(m0Var, "sink");
        h0 h0Var = new h0(m0Var);
        this.f11283k = h0Var;
        Deflater deflater = new Deflater(-1, true);
        this.f11284l = deflater;
        this.f11285m = new q((n) h0Var, deflater);
        this.f11287o = new CRC32();
        m mVar = h0Var.f11201k;
        mVar.F(8075);
        mVar.e0(8);
        mVar.e0(0);
        mVar.J(0);
        mVar.e0(0);
        mVar.e0(0);
    }

    @s4.h(name = "-deprecated_deflater")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "deflater", imports = {}))
    public final Deflater a() {
        return this.f11284l;
    }

    @s4.h(name = "deflater")
    @n6.d
    public final Deflater b() {
        return this.f11284l;
    }

    @Override // i6.m0
    @n6.d
    public q0 c() {
        return this.f11283k.c();
    }

    @Override // i6.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f11286n) {
            return;
        }
        try {
            this.f11285m.b();
            e();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f11284l.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f11283k.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f11286n = true;
        if (th != null) {
            throw th;
        }
    }

    public final void d(m mVar, long j7) {
        j0 j0Var = mVar.f11238k;
        u4.l0.m(j0Var);
        while (j7 > 0) {
            int min = (int) Math.min(j7, j0Var.f11214c - j0Var.f11213b);
            this.f11287o.update(j0Var.f11212a, j0Var.f11213b, min);
            j7 -= min;
            j0Var = j0Var.f11217f;
            u4.l0.m(j0Var);
        }
    }

    public final void e() {
        this.f11283k.a0((int) this.f11287o.getValue());
        this.f11283k.a0((int) this.f11284l.getBytesRead());
    }

    @Override // i6.m0, java.io.Flushable
    public void flush() throws IOException {
        this.f11285m.flush();
    }

    @Override // i6.m0
    public void w(@n6.d m mVar, long j7) throws IOException {
        u4.l0.p(mVar, "source");
        int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        } else if (i7 == 0) {
        } else {
            d(mVar, j7);
            this.f11285m.w(mVar, j7);
        }
    }
}
