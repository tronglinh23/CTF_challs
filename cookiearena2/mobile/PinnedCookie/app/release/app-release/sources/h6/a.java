package h6;

import i6.m;
import i6.m0;
import i6.p;
import i6.q;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import u4.l0;
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    public final m f10323k;

    /* renamed from: l  reason: collision with root package name */
    public final Deflater f10324l;

    /* renamed from: m  reason: collision with root package name */
    public final q f10325m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f10326n;

    public a(boolean z6) {
        this.f10326n = z6;
        m mVar = new m();
        this.f10323k = mVar;
        Deflater deflater = new Deflater(-1, true);
        this.f10324l = deflater;
        this.f10325m = new q((m0) mVar, deflater);
    }

    public final void a(@n6.d m mVar) throws IOException {
        p pVar;
        l0.p(mVar, "buffer");
        if (!(this.f10323k.a1() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f10326n) {
            this.f10324l.reset();
        }
        this.f10325m.w(mVar, mVar.a1());
        this.f10325m.flush();
        m mVar2 = this.f10323k;
        pVar = b.f10327a;
        if (b(mVar2, pVar)) {
            long a12 = this.f10323k.a1() - 4;
            m.a E0 = m.E0(this.f10323k, null, 1, null);
            try {
                E0.d(a12);
                n4.c.a(E0, null);
            } finally {
            }
        } else {
            this.f10323k.e0(0);
        }
        m mVar3 = this.f10323k;
        mVar.w(mVar3, mVar3.a1());
    }

    public final boolean b(m mVar, p pVar) {
        return mVar.n0(mVar.a1() - pVar.c0(), pVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10325m.close();
    }
}
