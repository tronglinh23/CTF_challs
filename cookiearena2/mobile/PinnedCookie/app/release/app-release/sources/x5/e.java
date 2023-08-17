package x5;

import i0.k0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import r5.b0;
import r5.d0;
import r5.f0;
import r5.p;
import r5.r;
import r5.v;
import u4.l0;
import v3.m2;
/* loaded from: classes.dex */
public final class e implements r5.e {
    @n6.d
    public final d0 A;
    public final boolean B;

    /* renamed from: k  reason: collision with root package name */
    public final h f18430k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final r f18431l;

    /* renamed from: m  reason: collision with root package name */
    public final c f18432m;

    /* renamed from: n  reason: collision with root package name */
    public final AtomicBoolean f18433n;

    /* renamed from: o  reason: collision with root package name */
    public Object f18434o;

    /* renamed from: p  reason: collision with root package name */
    public d f18435p;
    @n6.e

    /* renamed from: q  reason: collision with root package name */
    public f f18436q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f18437r;
    @n6.e

    /* renamed from: s  reason: collision with root package name */
    public x5.c f18438s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f18439t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f18440u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f18441v;

    /* renamed from: w  reason: collision with root package name */
    public volatile boolean f18442w;

    /* renamed from: x  reason: collision with root package name */
    public volatile x5.c f18443x;
    @n6.e

    /* renamed from: y  reason: collision with root package name */
    public volatile f f18444y;
    @n6.d

    /* renamed from: z  reason: collision with root package name */
    public final b0 f18445z;

    /* loaded from: classes.dex */
    public final class a implements Runnable {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public volatile AtomicInteger f18446k;

        /* renamed from: l  reason: collision with root package name */
        public final r5.f f18447l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ e f18448m;

        public a(@n6.d e eVar, r5.f fVar) {
            l0.p(fVar, "responseCallback");
            this.f18448m = eVar;
            this.f18447l = fVar;
            this.f18446k = new AtomicInteger(0);
        }

        public final void a(@n6.d ExecutorService executorService) {
            l0.p(executorService, "executorService");
            p V = this.f18448m.q().V();
            if (s5.d.f16658h && Thread.holdsLock(V)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(V);
                throw new AssertionError(sb.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e7) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e7);
                    this.f18448m.A(interruptedIOException);
                    this.f18447l.b(this.f18448m, interruptedIOException);
                    this.f18448m.q().V().h(this);
                }
            } catch (Throwable th) {
                this.f18448m.q().V().h(this);
                throw th;
            }
        }

        @n6.d
        public final e b() {
            return this.f18448m;
        }

        @n6.d
        public final AtomicInteger c() {
            return this.f18446k;
        }

        @n6.d
        public final String d() {
            return this.f18448m.w().q().F();
        }

        @n6.d
        public final d0 e() {
            return this.f18448m.w();
        }

        public final void f(@n6.d a aVar) {
            l0.p(aVar, "other");
            this.f18446k = aVar.f18446k;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            Throwable th;
            IOException e7;
            p V;
            String str = "OkHttp " + this.f18448m.B();
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                this.f18448m.f18432m.v();
                try {
                    z6 = true;
                } catch (IOException e8) {
                    z6 = false;
                    e7 = e8;
                } catch (Throwable th2) {
                    z6 = false;
                    th = th2;
                }
                try {
                    this.f18447l.a(this.f18448m, this.f18448m.x());
                    V = this.f18448m.q().V();
                } catch (IOException e9) {
                    e7 = e9;
                    if (z6) {
                        c6.j.f8005e.g().m("Callback failure for " + this.f18448m.I(), 4, e7);
                    } else {
                        this.f18447l.b(this.f18448m, e7);
                    }
                    V = this.f18448m.q().V();
                    V.h(this);
                } catch (Throwable th3) {
                    th = th3;
                    this.f18448m.cancel();
                    if (!z6) {
                        IOException iOException = new IOException("canceled due to " + th);
                        v3.p.a(iOException, th);
                        this.f18447l.b(this.f18448m, iOException);
                    }
                    throw th;
                }
                V.h(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends WeakReference<e> {
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public final Object f18449a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@n6.d e eVar, @n6.e Object obj) {
            super(eVar);
            l0.p(eVar, "referent");
            this.f18449a = obj;
        }

        @n6.e
        public final Object a() {
            return this.f18449a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends i6.k {
        public c() {
        }

        @Override // i6.k
        public void B() {
            e.this.cancel();
        }
    }

    public e(@n6.d b0 b0Var, @n6.d d0 d0Var, boolean z6) {
        l0.p(b0Var, "client");
        l0.p(d0Var, "originalRequest");
        this.f18445z = b0Var;
        this.A = d0Var;
        this.B = z6;
        this.f18430k = b0Var.S().c();
        this.f18431l = b0Var.X().a(this);
        c cVar = new c();
        cVar.i(b0Var.O(), TimeUnit.MILLISECONDS);
        m2 m2Var = m2.f17815a;
        this.f18432m = cVar;
        this.f18433n = new AtomicBoolean();
        this.f18441v = true;
    }

    @n6.e
    public final IOException A(@n6.e IOException iOException) {
        boolean z6;
        synchronized (this) {
            z6 = false;
            if (this.f18441v) {
                this.f18441v = false;
                if (!this.f18439t && !this.f18440u) {
                    z6 = true;
                }
            }
            m2 m2Var = m2.f17815a;
        }
        return z6 ? k(iOException) : iOException;
    }

    @n6.d
    public final String B() {
        return this.A.q().V();
    }

    @n6.e
    public final Socket C() {
        f fVar = this.f18436q;
        l0.m(fVar);
        if (s5.d.f16658h && !Thread.holdsLock(fVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(fVar);
            throw new AssertionError(sb.toString());
        }
        List<Reference<e>> u6 = fVar.u();
        Iterator<Reference<e>> it = u6.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (l0.g(it.next().get(), this)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 != -1) {
            u6.remove(i7);
            this.f18436q = null;
            if (u6.isEmpty()) {
                fVar.I(System.nanoTime());
                if (this.f18430k.c(fVar)) {
                    return fVar.d();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean D() {
        d dVar = this.f18435p;
        l0.m(dVar);
        return dVar.e();
    }

    public final void E(@n6.e f fVar) {
        this.f18444y = fVar;
    }

    @Override // r5.e
    @n6.d
    /* renamed from: F  reason: merged with bridge method [inline-methods] */
    public i6.k c() {
        return this.f18432m;
    }

    public final void G() {
        if ((!this.f18437r) != true) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f18437r = true;
        this.f18432m.w();
    }

    public final <E extends IOException> E H(E e7) {
        if (!this.f18437r && this.f18432m.w()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (e7 != null) {
                interruptedIOException.initCause(e7);
            }
            return interruptedIOException;
        }
        return e7;
    }

    public final String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(i() ? "canceled " : "");
        sb.append(this.B ? "web socket" : k0.E0);
        sb.append(" to ");
        sb.append(B());
        return sb.toString();
    }

    @Override // r5.e
    @n6.d
    public d0 a() {
        return this.A;
    }

    @Override // r5.e
    public void cancel() {
        if (this.f18442w) {
            return;
        }
        this.f18442w = true;
        x5.c cVar = this.f18443x;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f18444y;
        if (fVar != null) {
            fVar.k();
        }
        this.f18431l.g(this);
    }

    @Override // r5.e
    public void d(@n6.d r5.f fVar) {
        l0.p(fVar, "responseCallback");
        if (!this.f18433n.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        l();
        this.f18445z.V().c(new a(this, fVar));
    }

    @Override // r5.e
    @n6.d
    public f0 f() {
        if (this.f18433n.compareAndSet(false, true)) {
            this.f18432m.v();
            l();
            try {
                this.f18445z.V().d(this);
                return x();
            } finally {
                this.f18445z.V().i(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @Override // r5.e
    public boolean h() {
        return this.f18433n.get();
    }

    @Override // r5.e
    public boolean i() {
        return this.f18442w;
    }

    public final void j(@n6.d f fVar) {
        l0.p(fVar, a6.g.f398i);
        if (!s5.d.f16658h || Thread.holdsLock(fVar)) {
            if (!(this.f18436q == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f18436q = fVar;
            fVar.u().add(new b(this, this.f18434o));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(fVar);
        throw new AssertionError(sb.toString());
    }

    public final <E extends IOException> E k(E e7) {
        Socket C;
        boolean z6 = s5.d.f16658h;
        if (z6 && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        f fVar = this.f18436q;
        if (fVar != null) {
            if (z6 && Thread.holdsLock(fVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread2 = Thread.currentThread();
                l0.o(currentThread2, "Thread.currentThread()");
                sb2.append(currentThread2.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(fVar);
                throw new AssertionError(sb2.toString());
            }
            synchronized (fVar) {
                C = C();
            }
            if (this.f18436q == null) {
                if (C != null) {
                    s5.d.n(C);
                }
                this.f18431l.l(this, fVar);
            } else {
                if (!(C == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e8 = (E) H(e7);
        if (e7 != null) {
            r rVar = this.f18431l;
            l0.m(e8);
            rVar.e(this, e8);
        } else {
            this.f18431l.d(this);
        }
        return e8;
    }

    public final void l() {
        this.f18434o = c6.j.f8005e.g().k("response.body().close()");
        this.f18431l.f(this);
    }

    @Override // r5.e
    @n6.d
    /* renamed from: m  reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this.f18445z, this.A, this.B);
    }

    public final r5.a n(v vVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        r5.g gVar;
        if (vVar.G()) {
            sSLSocketFactory = this.f18445z.o0();
            hostnameVerifier = this.f18445z.b0();
            gVar = this.f18445z.Q();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new r5.a(vVar.F(), vVar.N(), this.f18445z.W(), this.f18445z.n0(), sSLSocketFactory, hostnameVerifier, gVar, this.f18445z.j0(), this.f18445z.i0(), this.f18445z.h0(), this.f18445z.T(), this.f18445z.k0());
    }

    public final void o(@n6.d d0 d0Var, boolean z6) {
        l0.p(d0Var, "request");
        if (!(this.f18438s == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if ((!this.f18440u) != true) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if ((!this.f18439t) != true) {
                throw new IllegalStateException("Check failed.".toString());
            }
            m2 m2Var = m2.f17815a;
        }
        if (z6) {
            this.f18435p = new d(this.f18430k, n(d0Var.q()), this, this.f18431l);
        }
    }

    public final void p(boolean z6) {
        x5.c cVar;
        synchronized (this) {
            if (!this.f18441v) {
                throw new IllegalStateException("released".toString());
            }
            m2 m2Var = m2.f17815a;
        }
        if (z6 && (cVar = this.f18443x) != null) {
            cVar.d();
        }
        this.f18438s = null;
    }

    @n6.d
    public final b0 q() {
        return this.f18445z;
    }

    @n6.e
    public final f r() {
        return this.f18436q;
    }

    @n6.e
    public final f s() {
        return this.f18444y;
    }

    @n6.d
    public final r t() {
        return this.f18431l;
    }

    public final boolean u() {
        return this.B;
    }

    @n6.e
    public final x5.c v() {
        return this.f18438s;
    }

    @n6.d
    public final d0 w() {
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    @n6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r5.f0 x() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.b0 r0 = r11.f18445z
            java.util.List r0 = r0.c0()
            x3.b0.o0(r2, r0)
            y5.j r0 = new y5.j
            r5.b0 r1 = r11.f18445z
            r0.<init>(r1)
            r2.add(r0)
            y5.a r0 = new y5.a
            r5.b0 r1 = r11.f18445z
            r5.n r1 = r1.U()
            r0.<init>(r1)
            r2.add(r0)
            u5.a r0 = new u5.a
            r5.b0 r1 = r11.f18445z
            r5.c r1 = r1.N()
            r0.<init>(r1)
            r2.add(r0)
            x5.a r0 = x5.a.f18398b
            r2.add(r0)
            boolean r0 = r11.B
            if (r0 != 0) goto L46
            r5.b0 r0 = r11.f18445z
            java.util.List r0 = r0.e0()
            x3.b0.o0(r2, r0)
        L46:
            y5.b r0 = new y5.b
            boolean r1 = r11.B
            r0.<init>(r1)
            r2.add(r0)
            y5.g r9 = new y5.g
            r3 = 0
            r4 = 0
            r5.d0 r5 = r11.A
            r5.b0 r0 = r11.f18445z
            int r6 = r0.R()
            r5.b0 r0 = r11.f18445z
            int r7 = r0.l0()
            r5.b0 r0 = r11.f18445z
            int r8 = r0.q0()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            r5.d0 r2 = r11.A     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            r5.f0 r2 = r9.h(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r11.i()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r11.A(r0)
            return r2
        L7f:
            s5.d.l(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto La1
        L8c:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.A(r1)     // Catch: java.lang.Throwable -> L9d
            if (r1 != 0) goto L9c
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L9d
            throw r1     // Catch: java.lang.Throwable -> L9d
        L9c:
            throw r1     // Catch: java.lang.Throwable -> L9d
        L9d:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        La1:
            if (r1 != 0) goto La6
            r11.A(r0)
        La6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.e.x():r5.f0");
    }

    @n6.d
    public final x5.c y(@n6.d y5.g gVar) {
        l0.p(gVar, "chain");
        synchronized (this) {
            if (!this.f18441v) {
                throw new IllegalStateException("released".toString());
            }
            if ((!this.f18440u) != true) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if ((!this.f18439t) != true) {
                throw new IllegalStateException("Check failed.".toString());
            }
            m2 m2Var = m2.f17815a;
        }
        d dVar = this.f18435p;
        l0.m(dVar);
        x5.c cVar = new x5.c(this, this.f18431l, dVar, dVar.a(this.f18445z, gVar));
        this.f18438s = cVar;
        this.f18443x = cVar;
        synchronized (this) {
            this.f18439t = true;
            this.f18440u = true;
        }
        if (this.f18442w) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043, B:14:0x001d), top: B:47:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043, B:14:0x001d), top: B:47:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <E extends java.io.IOException> E z(@n6.d x5.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            u4.l0.p(r3, r0)
            x5.c r0 = r2.f18443x
            boolean r3 = u4.l0.g(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L10
            return r6
        L10:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L1b
            boolean r1 = r2.f18439t     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L21
            goto L1b
        L19:
            r3 = move-exception
            goto L5a
        L1b:
            if (r5 == 0) goto L42
            boolean r1 = r2.f18440u     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L42
        L21:
            if (r4 == 0) goto L25
            r2.f18439t = r3     // Catch: java.lang.Throwable -> L19
        L25:
            if (r5 == 0) goto L29
            r2.f18440u = r3     // Catch: java.lang.Throwable -> L19
        L29:
            boolean r4 = r2.f18439t     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L33
            boolean r5 = r2.f18440u     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L33
            r5 = r0
            goto L34
        L33:
            r5 = r3
        L34:
            if (r4 != 0) goto L3f
            boolean r4 = r2.f18440u     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            boolean r4 = r2.f18441v     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            goto L40
        L3f:
            r0 = r3
        L40:
            r3 = r5
            goto L43
        L42:
            r0 = r3
        L43:
            v3.m2 r4 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r3 == 0) goto L52
            r3 = 0
            r2.f18443x = r3
            x5.f r3 = r2.f18436q
            if (r3 == 0) goto L52
            r3.z()
        L52:
            if (r0 == 0) goto L59
            java.io.IOException r3 = r2.k(r6)
            return r3
        L59:
            return r6
        L5a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.e.z(x5.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }
}
