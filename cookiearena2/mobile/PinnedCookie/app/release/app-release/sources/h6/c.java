package h6;

import i6.m;
import i6.o0;
import i6.y;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import u4.l0;
/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    public final m f10329k;

    /* renamed from: l  reason: collision with root package name */
    public final Inflater f10330l;

    /* renamed from: m  reason: collision with root package name */
    public final y f10331m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f10332n;

    public c(boolean z6) {
        this.f10332n = z6;
        m mVar = new m();
        this.f10329k = mVar;
        Inflater inflater = new Inflater(true);
        this.f10330l = inflater;
        this.f10331m = new y((o0) mVar, inflater);
    }

    public final void a(@n6.d m mVar) throws IOException {
        l0.p(mVar, "buffer");
        if (!(this.f10329k.a1() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f10332n) {
            this.f10330l.reset();
        }
        this.f10329k.B(mVar);
        this.f10329k.J(65535);
        long bytesRead = this.f10330l.getBytesRead() + this.f10329k.a1();
        do {
            this.f10331m.a(mVar, Long.MAX_VALUE);
        } while (this.f10330l.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10331m.close();
    }
}
