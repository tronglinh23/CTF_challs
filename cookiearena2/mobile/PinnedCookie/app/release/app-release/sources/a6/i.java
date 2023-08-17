package a6;

import i6.m0;
import i6.o;
import i6.o0;
import i6.q0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import r5.u;
import u4.l0;
import u4.w;
import v3.m2;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: o  reason: collision with root package name */
    public static final long f427o = 16384;

    /* renamed from: p  reason: collision with root package name */
    public static final a f428p = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public long f429a;

    /* renamed from: b  reason: collision with root package name */
    public long f430b;

    /* renamed from: c  reason: collision with root package name */
    public long f431c;

    /* renamed from: d  reason: collision with root package name */
    public long f432d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<u> f433e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f434f;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public final c f435g;
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public final b f436h;
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public final d f437i;
    @n6.d

    /* renamed from: j  reason: collision with root package name */
    public final d f438j;
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public a6.b f439k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public IOException f440l;

    /* renamed from: m  reason: collision with root package name */
    public final int f441m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final f f442n;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class c implements o0 {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final i6.m f448k = new i6.m();
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public final i6.m f449l = new i6.m();
        @n6.e

        /* renamed from: m  reason: collision with root package name */
        public u f450m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f451n;

        /* renamed from: o  reason: collision with root package name */
        public final long f452o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f453p;

        public c(long j7, boolean z6) {
            this.f452o = j7;
            this.f453p = z6;
        }

        public final boolean a() {
            return this.f451n;
        }

        public final boolean b() {
            return this.f453p;
        }

        @Override // i6.o0
        @n6.d
        public q0 c() {
            return i.this.n();
        }

        @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long a12;
            synchronized (i.this) {
                this.f451n = true;
                a12 = this.f449l.a1();
                this.f449l.l();
                i iVar = i.this;
                if (iVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                iVar.notifyAll();
                m2 m2Var = m2.f17815a;
            }
            if (a12 > 0) {
                m(a12);
            }
            i.this.b();
        }

        @n6.d
        public final i6.m d() {
            return this.f449l;
        }

        @n6.d
        public final i6.m e() {
            return this.f448k;
        }

        @n6.e
        public final u f() {
            return this.f450m;
        }

        public final void h(@n6.d o oVar, long j7) throws IOException {
            boolean z6;
            boolean z7;
            boolean z8;
            long j8;
            l0.p(oVar, "source");
            i iVar = i.this;
            if (s5.d.f16658h && Thread.holdsLock(iVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(iVar);
                throw new AssertionError(sb.toString());
            }
            while (j7 > 0) {
                synchronized (i.this) {
                    z6 = this.f453p;
                    z7 = true;
                    z8 = this.f449l.a1() + j7 > this.f452o;
                    m2 m2Var = m2.f17815a;
                }
                if (z8) {
                    oVar.skip(j7);
                    i.this.f(a6.b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z6) {
                    oVar.skip(j7);
                    return;
                } else {
                    long l02 = oVar.l0(this.f448k, j7);
                    if (l02 == -1) {
                        throw new EOFException();
                    }
                    j7 -= l02;
                    synchronized (i.this) {
                        if (this.f451n) {
                            j8 = this.f448k.a1();
                            this.f448k.l();
                        } else {
                            if (this.f449l.a1() != 0) {
                                z7 = false;
                            }
                            this.f449l.B(this.f448k);
                            if (z7) {
                                i iVar2 = i.this;
                                if (iVar2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                                iVar2.notifyAll();
                            }
                            j8 = 0;
                        }
                    }
                    if (j8 > 0) {
                        m(j8);
                    }
                }
            }
        }

        public final void i(boolean z6) {
            this.f451n = z6;
        }

        public final void k(boolean z6) {
            this.f453p = z6;
        }

        public final void l(@n6.e u uVar) {
            this.f450m = uVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // i6.o0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long l0(@n6.d i6.m r18, long r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a6.i.c.l0(i6.m, long):long");
        }

        public final void m(long j7) {
            i iVar = i.this;
            if (!s5.d.f16658h || !Thread.holdsLock(iVar)) {
                i.this.h().r1(j7);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public final class d extends i6.k {
        public d() {
        }

        @Override // i6.k
        public void B() {
            i.this.f(a6.b.CANCEL);
            i.this.h().h1();
        }

        public final void D() throws IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // i6.k
        @n6.d
        public IOException x(@n6.e IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public i(int i7, @n6.d f fVar, boolean z6, boolean z7, @n6.e u uVar) {
        l0.p(fVar, g.f398i);
        this.f441m = i7;
        this.f442n = fVar;
        this.f432d = fVar.w0().e();
        ArrayDeque<u> arrayDeque = new ArrayDeque<>();
        this.f433e = arrayDeque;
        this.f435g = new c(fVar.q0().e(), z7);
        this.f436h = new b(z6);
        this.f437i = new d();
        this.f438j = new d();
        if (uVar == null) {
            if (!v()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else if ((!v()) != true) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else {
            arrayDeque.add(uVar);
        }
    }

    public final synchronized void A(@n6.d a6.b bVar) {
        l0.p(bVar, "errorCode");
        if (this.f439k == null) {
            this.f439k = bVar;
            notifyAll();
        }
    }

    public final void B(@n6.e a6.b bVar) {
        this.f439k = bVar;
    }

    public final void C(@n6.e IOException iOException) {
        this.f440l = iOException;
    }

    public final void D(long j7) {
        this.f430b = j7;
    }

    public final void E(long j7) {
        this.f429a = j7;
    }

    public final void F(long j7) {
        this.f432d = j7;
    }

    public final void G(long j7) {
        this.f431c = j7;
    }

    @n6.d
    public final synchronized u H() throws IOException {
        u removeFirst;
        this.f437i.v();
        while (this.f433e.isEmpty() && this.f439k == null) {
            J();
        }
        this.f437i.D();
        if ((!this.f433e.isEmpty()) != true) {
            IOException iOException = this.f440l;
            if (iOException != null) {
                throw iOException;
            }
            a6.b bVar = this.f439k;
            l0.m(bVar);
            throw new n(bVar);
        }
        removeFirst = this.f433e.removeFirst();
        l0.o(removeFirst, "headersQueue.removeFirst()");
        return removeFirst;
    }

    @n6.d
    public final synchronized u I() throws IOException {
        u f7;
        if (this.f439k != null) {
            IOException iOException = this.f440l;
            if (iOException != null) {
                throw iOException;
            }
            a6.b bVar = this.f439k;
            l0.m(bVar);
            throw new n(bVar);
        }
        if (!(this.f435g.b() && this.f435g.e().c0() && this.f435g.d().c0())) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        f7 = this.f435g.f();
        if (f7 == null) {
            f7 = s5.d.f16652b;
        }
        return f7;
    }

    public final void J() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void K(@n6.d List<a6.c> list, boolean z6, boolean z7) throws IOException {
        boolean z8;
        l0.p(list, "responseHeaders");
        if (s5.d.f16658h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            this.f434f = true;
            if (z6) {
                this.f436h.h(true);
            }
            m2 m2Var = m2.f17815a;
        }
        if (!z7) {
            synchronized (this.f442n) {
                z8 = this.f442n.U0() >= this.f442n.T0();
            }
            z7 = z8;
        }
        this.f442n.t1(this.f441m, z6, list);
        if (z7) {
            this.f442n.flush();
        }
    }

    @n6.d
    public final q0 L() {
        return this.f438j;
    }

    public final void a(long j7) {
        this.f432d += j7;
        if (j7 > 0) {
            notifyAll();
        }
    }

    public final void b() throws IOException {
        boolean z6;
        boolean w6;
        if (s5.d.f16658h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            z6 = !this.f435g.b() && this.f435g.a() && (this.f436h.d() || this.f436h.b());
            w6 = w();
            m2 m2Var = m2.f17815a;
        }
        if (z6) {
            d(a6.b.CANCEL, null);
        } else if (w6) {
        } else {
            this.f442n.g1(this.f441m);
        }
    }

    public final void c() throws IOException {
        if (this.f436h.b()) {
            throw new IOException("stream closed");
        }
        if (this.f436h.d()) {
            throw new IOException("stream finished");
        }
        if (this.f439k != null) {
            IOException iOException = this.f440l;
            if (iOException != null) {
                throw iOException;
            }
            a6.b bVar = this.f439k;
            l0.m(bVar);
            throw new n(bVar);
        }
    }

    public final void d(@n6.d a6.b bVar, @n6.e IOException iOException) throws IOException {
        l0.p(bVar, "rstStatusCode");
        if (e(bVar, iOException)) {
            this.f442n.x1(this.f441m, bVar);
        }
    }

    public final boolean e(a6.b bVar, IOException iOException) {
        if (s5.d.f16658h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            if (this.f439k != null) {
                return false;
            }
            if (this.f435g.b() && this.f436h.d()) {
                return false;
            }
            this.f439k = bVar;
            this.f440l = iOException;
            notifyAll();
            m2 m2Var = m2.f17815a;
            this.f442n.g1(this.f441m);
            return true;
        }
    }

    public final void f(@n6.d a6.b bVar) {
        l0.p(bVar, "errorCode");
        if (e(bVar, null)) {
            this.f442n.y1(this.f441m, bVar);
        }
    }

    public final void g(@n6.d u uVar) {
        l0.p(uVar, "trailers");
        synchronized (this) {
            boolean z6 = true;
            if ((!this.f436h.d()) != true) {
                throw new IllegalStateException("already finished".toString());
            }
            if (uVar.size() == 0) {
                z6 = false;
            }
            if (!z6) {
                throw new IllegalArgumentException("trailers.size() == 0".toString());
            }
            this.f436h.i(uVar);
            m2 m2Var = m2.f17815a;
        }
    }

    @n6.d
    public final f h() {
        return this.f442n;
    }

    @n6.e
    public final synchronized a6.b i() {
        return this.f439k;
    }

    @n6.e
    public final IOException j() {
        return this.f440l;
    }

    public final int k() {
        return this.f441m;
    }

    public final long l() {
        return this.f430b;
    }

    public final long m() {
        return this.f429a;
    }

    @n6.d
    public final d n() {
        return this.f437i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    @n6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i6.m0 o() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f434f     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.v()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            v3.m2 r0 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            a6.i$b r0 = r2.f436h
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.i.o():i6.m0");
    }

    @n6.d
    public final b p() {
        return this.f436h;
    }

    @n6.d
    public final o0 q() {
        return this.f435g;
    }

    @n6.d
    public final c r() {
        return this.f435g;
    }

    public final long s() {
        return this.f432d;
    }

    public final long t() {
        return this.f431c;
    }

    @n6.d
    public final d u() {
        return this.f438j;
    }

    public final boolean v() {
        return this.f442n.X() == ((this.f441m & 1) == 1);
    }

    public final synchronized boolean w() {
        if (this.f439k != null) {
            return false;
        }
        if ((this.f435g.b() || this.f435g.a()) && (this.f436h.d() || this.f436h.b())) {
            if (this.f434f) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public final q0 x() {
        return this.f437i;
    }

    public final void y(@n6.d o oVar, int i7) throws IOException {
        l0.p(oVar, "source");
        if (!s5.d.f16658h || !Thread.holdsLock(this)) {
            this.f435g.h(oVar, i7);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:10:0x003d, B:14:0x0045, B:17:0x0054, B:18:0x0059, B:15:0x004b), top: B:26:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(@n6.d r5.u r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            u4.l0.p(r3, r0)
            boolean r0 = s5.d.f16658h
            if (r0 == 0) goto L3c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L3c
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            u4.l0.o(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3c:
            monitor-enter(r2)
            boolean r0 = r2.f434f     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            if (r0 == 0) goto L4b
            if (r4 != 0) goto L45
            goto L4b
        L45:
            a6.i$c r0 = r2.f435g     // Catch: java.lang.Throwable -> L6d
            r0.l(r3)     // Catch: java.lang.Throwable -> L6d
            goto L52
        L4b:
            r2.f434f = r1     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque<r5.u> r0 = r2.f433e     // Catch: java.lang.Throwable -> L6d
            r0.add(r3)     // Catch: java.lang.Throwable -> L6d
        L52:
            if (r4 == 0) goto L59
            a6.i$c r3 = r2.f435g     // Catch: java.lang.Throwable -> L6d
            r3.k(r1)     // Catch: java.lang.Throwable -> L6d
        L59:
            boolean r3 = r2.w()     // Catch: java.lang.Throwable -> L6d
            r2.notifyAll()     // Catch: java.lang.Throwable -> L6d
            v3.m2 r4 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r2)
            if (r3 != 0) goto L6c
            a6.f r3 = r2.f442n
            int r4 = r2.f441m
            r3.g1(r4)
        L6c:
            return
        L6d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.i.z(r5.u, boolean):void");
    }

    /* loaded from: classes.dex */
    public final class b implements m0 {

        /* renamed from: k  reason: collision with root package name */
        public final i6.m f443k;
        @n6.e

        /* renamed from: l  reason: collision with root package name */
        public u f444l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f445m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f446n;

        public b(boolean z6) {
            this.f446n = z6;
            this.f443k = new i6.m();
        }

        public final void a(boolean z6) throws IOException {
            long min;
            boolean z7;
            synchronized (i.this) {
                i.this.u().v();
                while (i.this.t() >= i.this.s() && !this.f446n && !this.f445m && i.this.i() == null) {
                    i.this.J();
                }
                i.this.u().D();
                i.this.c();
                min = Math.min(i.this.s() - i.this.t(), this.f443k.a1());
                i iVar = i.this;
                iVar.G(iVar.t() + min);
                z7 = z6 && min == this.f443k.a1() && i.this.i() == null;
                m2 m2Var = m2.f17815a;
            }
            i.this.u().v();
            try {
                i.this.h().s1(i.this.k(), z7, this.f443k, min);
            } finally {
                i.this.u().D();
            }
        }

        public final boolean b() {
            return this.f445m;
        }

        @Override // i6.m0
        @n6.d
        public q0 c() {
            return i.this.u();
        }

        @Override // i6.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i iVar = i.this;
            if (s5.d.f16658h && Thread.holdsLock(iVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(iVar);
                throw new AssertionError(sb.toString());
            }
            synchronized (i.this) {
                if (this.f445m) {
                    return;
                }
                boolean z6 = i.this.i() == null;
                m2 m2Var = m2.f17815a;
                if (!i.this.p().f446n) {
                    boolean z7 = this.f443k.a1() > 0;
                    if (this.f444l != null) {
                        while (this.f443k.a1() > 0) {
                            a(false);
                        }
                        f h7 = i.this.h();
                        int k7 = i.this.k();
                        u uVar = this.f444l;
                        l0.m(uVar);
                        h7.t1(k7, z6, s5.d.W(uVar));
                    } else if (z7) {
                        while (this.f443k.a1() > 0) {
                            a(true);
                        }
                    } else if (z6) {
                        i.this.h().s1(i.this.k(), true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f445m = true;
                    m2 m2Var2 = m2.f17815a;
                }
                i.this.h().flush();
                i.this.b();
            }
        }

        public final boolean d() {
            return this.f446n;
        }

        @n6.e
        public final u e() {
            return this.f444l;
        }

        public final void f(boolean z6) {
            this.f445m = z6;
        }

        @Override // i6.m0, java.io.Flushable
        public void flush() throws IOException {
            i iVar = i.this;
            if (s5.d.f16658h && Thread.holdsLock(iVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(iVar);
                throw new AssertionError(sb.toString());
            }
            synchronized (i.this) {
                i.this.c();
                m2 m2Var = m2.f17815a;
            }
            while (this.f443k.a1() > 0) {
                a(false);
                i.this.h().flush();
            }
        }

        public final void h(boolean z6) {
            this.f446n = z6;
        }

        public final void i(@n6.e u uVar) {
            this.f444l = uVar;
        }

        @Override // i6.m0
        public void w(@n6.d i6.m mVar, long j7) throws IOException {
            l0.p(mVar, "source");
            i iVar = i.this;
            if (!s5.d.f16658h || !Thread.holdsLock(iVar)) {
                this.f443k.w(mVar, j7);
                while (this.f443k.a1() >= i.f427o) {
                    a(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }

        public /* synthetic */ b(i iVar, boolean z6, int i7, w wVar) {
            this((i7 & 1) != 0 ? false : z6);
        }
    }
}
