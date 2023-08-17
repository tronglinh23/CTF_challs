package a6;

import a6.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class j implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    public final i6.m f458k;

    /* renamed from: l  reason: collision with root package name */
    public int f459l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f460m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final d.b f461n;

    /* renamed from: o  reason: collision with root package name */
    public final i6.n f462o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f463p;

    /* renamed from: r  reason: collision with root package name */
    public static final a f457r = new a(null);

    /* renamed from: q  reason: collision with root package name */
    public static final Logger f456q = Logger.getLogger(e.class.getName());

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public j(@n6.d i6.n nVar, boolean z6) {
        l0.p(nVar, "sink");
        this.f462o = nVar;
        this.f463p = z6;
        i6.m mVar = new i6.m();
        this.f458k = mVar;
        this.f459l = 16384;
        this.f461n = new d.b(0, false, mVar, 3, null);
    }

    public final synchronized void A(int i7, long j7) throws IOException {
        if (this.f460m) {
            throw new IOException("closed");
        }
        if (!(j7 != 0 && j7 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j7).toString());
        }
        f(i7, 4, 8, 0);
        this.f462o.J((int) j7);
        this.f462o.flush();
    }

    public final void C(int i7, long j7) throws IOException {
        while (j7 > 0) {
            long min = Math.min(this.f459l, j7);
            j7 -= min;
            f(i7, (int) min, 9, j7 == 0 ? 4 : 0);
            this.f462o.w(this.f458k, min);
        }
    }

    public final synchronized void a(@n6.d m mVar) throws IOException {
        l0.p(mVar, "peerSettings");
        if (this.f460m) {
            throw new IOException("closed");
        }
        this.f459l = mVar.g(this.f459l);
        if (mVar.d() != -1) {
            this.f461n.e(mVar.d());
        }
        f(0, 0, 4, 1);
        this.f462o.flush();
    }

    public final synchronized void b() throws IOException {
        if (this.f460m) {
            throw new IOException("closed");
        }
        if (this.f463p) {
            Logger logger = f456q;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(s5.d.v(">> CONNECTION " + e.f280a.w(), new Object[0]));
            }
            this.f462o.K(e.f280a);
            this.f462o.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f460m = true;
        this.f462o.close();
    }

    public final synchronized void d(boolean z6, int i7, @n6.e i6.m mVar, int i8) throws IOException {
        if (this.f460m) {
            throw new IOException("closed");
        }
        e(i7, z6 ? 1 : 0, mVar, i8);
    }

    public final void e(int i7, int i8, @n6.e i6.m mVar, int i9) throws IOException {
        f(i7, i9, 0, i8);
        if (i9 > 0) {
            i6.n nVar = this.f462o;
            l0.m(mVar);
            nVar.w(mVar, i9);
        }
    }

    public final void f(int i7, int i8, int i9, int i10) throws IOException {
        Logger logger = f456q;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.f303x.c(false, i7, i8, i9, i10));
        }
        if (!(i8 <= this.f459l)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f459l + ": " + i8).toString());
        }
        if (!((((int) 2147483648L) & i7) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + i7).toString());
        }
        s5.d.k0(this.f462o, i8);
        this.f462o.e0(i9 & 255);
        this.f462o.e0(i10 & 255);
        this.f462o.J(i7 & Integer.MAX_VALUE);
    }

    public final synchronized void flush() throws IOException {
        if (this.f460m) {
            throw new IOException("closed");
        }
        this.f462o.flush();
    }

    @n6.d
    public final d.b h() {
        return this.f461n;
    }

    public final synchronized void i(int i7, @n6.d b bVar, @n6.d byte[] bArr) throws IOException {
        l0.p(bVar, "errorCode");
        l0.p(bArr, "debugData");
        if (this.f460m) {
            throw new IOException("closed");
        }
        if (!(bVar.c() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        f(0, bArr.length + 8, 7, 0);
        this.f462o.J(i7);
        this.f462o.J(bVar.c());
        if ((!(bArr.length == 0)) != false) {
            this.f462o.k0(bArr);
        }
        this.f462o.flush();
    }

    public final synchronized void k(boolean z6, int i7, @n6.d List<c> list) throws IOException {
        l0.p(list, "headerBlock");
        if (this.f460m) {
            throw new IOException("closed");
        }
        this.f461n.g(list);
        long a12 = this.f458k.a1();
        long min = Math.min(this.f459l, a12);
        int i8 = (a12 > min ? 1 : (a12 == min ? 0 : -1));
        int i9 = i8 == 0 ? 4 : 0;
        if (z6) {
            i9 |= 1;
        }
        f(i7, (int) min, 1, i9);
        this.f462o.w(this.f458k, min);
        if (i8 > 0) {
            C(i7, a12 - min);
        }
    }

    public final int l() {
        return this.f459l;
    }

    public final synchronized void m(boolean z6, int i7, int i8) throws IOException {
        if (this.f460m) {
            throw new IOException("closed");
        }
        f(0, 8, 6, z6 ? 1 : 0);
        this.f462o.J(i7);
        this.f462o.J(i8);
        this.f462o.flush();
    }

    public final synchronized void p(int i7, int i8, @n6.d List<c> list) throws IOException {
        l0.p(list, "requestHeaders");
        if (this.f460m) {
            throw new IOException("closed");
        }
        this.f461n.g(list);
        long a12 = this.f458k.a1();
        int min = (int) Math.min(this.f459l - 4, a12);
        int i9 = min + 4;
        long j7 = min;
        int i10 = (a12 > j7 ? 1 : (a12 == j7 ? 0 : -1));
        f(i7, i9, 5, i10 == 0 ? 4 : 0);
        this.f462o.J(i8 & Integer.MAX_VALUE);
        this.f462o.w(this.f458k, j7);
        if (i10 > 0) {
            C(i7, a12 - j7);
        }
    }

    public final synchronized void t(int i7, @n6.d b bVar) throws IOException {
        l0.p(bVar, "errorCode");
        if (this.f460m) {
            throw new IOException("closed");
        }
        if (!(bVar.c() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        f(i7, 4, 3, 0);
        this.f462o.J(bVar.c());
        this.f462o.flush();
    }

    public final synchronized void u(@n6.d m mVar) throws IOException {
        l0.p(mVar, "settings");
        if (this.f460m) {
            throw new IOException("closed");
        }
        int i7 = 0;
        f(0, mVar.l() * 6, 4, 0);
        while (i7 < 10) {
            if (mVar.i(i7)) {
                this.f462o.F(i7 != 4 ? i7 != 7 ? i7 : 4 : 3);
                this.f462o.J(mVar.b(i7));
            }
            i7++;
        }
        this.f462o.flush();
    }
}
