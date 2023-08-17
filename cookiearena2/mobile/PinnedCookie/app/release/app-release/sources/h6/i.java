package h6;

import i6.m;
import i6.n;
import i6.p;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import u4.l0;
/* loaded from: classes.dex */
public final class i implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    public final m f10435k;

    /* renamed from: l  reason: collision with root package name */
    public final m f10436l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10437m;

    /* renamed from: n  reason: collision with root package name */
    public a f10438n;

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f10439o;

    /* renamed from: p  reason: collision with root package name */
    public final m.a f10440p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f10441q;
    @n6.d

    /* renamed from: r  reason: collision with root package name */
    public final n f10442r;
    @n6.d

    /* renamed from: s  reason: collision with root package name */
    public final Random f10443s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f10444t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f10445u;

    /* renamed from: v  reason: collision with root package name */
    public final long f10446v;

    public i(boolean z6, @n6.d n nVar, @n6.d Random random, boolean z7, boolean z8, long j7) {
        l0.p(nVar, "sink");
        l0.p(random, "random");
        this.f10441q = z6;
        this.f10442r = nVar;
        this.f10443s = random;
        this.f10444t = z7;
        this.f10445u = z8;
        this.f10446v = j7;
        this.f10435k = new m();
        this.f10436l = nVar.j();
        this.f10439o = z6 ? new byte[4] : null;
        this.f10440p = z6 ? new m.a() : null;
    }

    @n6.d
    public final Random a() {
        return this.f10443s;
    }

    @n6.d
    public final n b() {
        return this.f10442r;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar = this.f10438n;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void d(int i7, @n6.e p pVar) throws IOException {
        p pVar2 = p.f11251o;
        if (i7 != 0 || pVar != null) {
            if (i7 != 0) {
                g.f10418w.d(i7);
            }
            m mVar = new m();
            mVar.F(i7);
            if (pVar != null) {
                mVar.K(pVar);
            }
            pVar2 = mVar.x();
        }
        try {
            e(8, pVar2);
        } finally {
            this.f10437m = true;
        }
    }

    public final void e(int i7, p pVar) throws IOException {
        if (this.f10437m) {
            throw new IOException("closed");
        }
        int c02 = pVar.c0();
        if (!(((long) c02) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.f10436l.e0(i7 | 128);
        if (this.f10441q) {
            this.f10436l.e0(c02 | 128);
            Random random = this.f10443s;
            byte[] bArr = this.f10439o;
            l0.m(bArr);
            random.nextBytes(bArr);
            this.f10436l.k0(this.f10439o);
            if (c02 > 0) {
                long a12 = this.f10436l.a1();
                this.f10436l.K(pVar);
                m mVar = this.f10436l;
                m.a aVar = this.f10440p;
                l0.m(aVar);
                mVar.C0(aVar);
                this.f10440p.e(a12);
                g.f10418w.c(this.f10440p, this.f10439o);
                this.f10440p.close();
            }
        } else {
            this.f10436l.e0(c02);
            this.f10436l.K(pVar);
        }
        this.f10442r.flush();
    }

    public final void f(int i7, @n6.d p pVar) throws IOException {
        l0.p(pVar, "data");
        if (this.f10437m) {
            throw new IOException("closed");
        }
        this.f10435k.K(pVar);
        int i8 = i7 | 128;
        if (this.f10444t && pVar.c0() >= this.f10446v) {
            a aVar = this.f10438n;
            if (aVar == null) {
                aVar = new a(this.f10445u);
                this.f10438n = aVar;
            }
            aVar.a(this.f10435k);
            i8 |= 64;
        }
        long a12 = this.f10435k.a1();
        this.f10436l.e0(i8);
        int i9 = this.f10441q ? 128 : 0;
        if (a12 <= 125) {
            this.f10436l.e0(((int) a12) | i9);
        } else if (a12 <= g.f10414s) {
            this.f10436l.e0(i9 | g.f10413r);
            this.f10436l.F((int) a12);
        } else {
            this.f10436l.e0(i9 | 127);
            this.f10436l.F0(a12);
        }
        if (this.f10441q) {
            Random random = this.f10443s;
            byte[] bArr = this.f10439o;
            l0.m(bArr);
            random.nextBytes(bArr);
            this.f10436l.k0(this.f10439o);
            if (a12 > 0) {
                m mVar = this.f10435k;
                m.a aVar2 = this.f10440p;
                l0.m(aVar2);
                mVar.C0(aVar2);
                this.f10440p.e(0L);
                g.f10418w.c(this.f10440p, this.f10439o);
                this.f10440p.close();
            }
        }
        this.f10436l.w(this.f10435k, a12);
        this.f10442r.D();
    }

    public final void h(@n6.d p pVar) throws IOException {
        l0.p(pVar, "payload");
        e(9, pVar);
    }

    public final void i(@n6.d p pVar) throws IOException {
        l0.p(pVar, "payload");
        e(10, pVar);
    }
}
