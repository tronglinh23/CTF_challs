package h6;

import androidx.core.view.o1;
import h6.h;
import i5.b0;
import i6.n;
import i6.o;
import i6.p;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import r5.c0;
import r5.d0;
import r5.f0;
import r5.j0;
import r5.k0;
import r5.r;
import u4.k1;
import u4.l0;
import u4.w;
import v3.m2;
import x3.v;
/* loaded from: classes.dex */
public final class e implements j0, h.a {
    public static final long A = 16777216;
    public static final long B = 60000;
    public static final long C = 1024;
    public static final b D = new b(null);

    /* renamed from: z  reason: collision with root package name */
    public static final List<c0> f10334z = v.k(c0.HTTP_1_1);

    /* renamed from: a  reason: collision with root package name */
    public final String f10335a;

    /* renamed from: b  reason: collision with root package name */
    public r5.e f10336b;

    /* renamed from: c  reason: collision with root package name */
    public w5.a f10337c;

    /* renamed from: d  reason: collision with root package name */
    public h6.h f10338d;

    /* renamed from: e  reason: collision with root package name */
    public i f10339e;

    /* renamed from: f  reason: collision with root package name */
    public w5.c f10340f;

    /* renamed from: g  reason: collision with root package name */
    public String f10341g;

    /* renamed from: h  reason: collision with root package name */
    public d f10342h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayDeque<p> f10343i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayDeque<Object> f10344j;

    /* renamed from: k  reason: collision with root package name */
    public long f10345k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10346l;

    /* renamed from: m  reason: collision with root package name */
    public int f10347m;

    /* renamed from: n  reason: collision with root package name */
    public String f10348n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10349o;

    /* renamed from: p  reason: collision with root package name */
    public int f10350p;

    /* renamed from: q  reason: collision with root package name */
    public int f10351q;

    /* renamed from: r  reason: collision with root package name */
    public int f10352r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10353s;

    /* renamed from: t  reason: collision with root package name */
    public final d0 f10354t;
    @n6.d

    /* renamed from: u  reason: collision with root package name */
    public final k0 f10355u;

    /* renamed from: v  reason: collision with root package name */
    public final Random f10356v;

    /* renamed from: w  reason: collision with root package name */
    public final long f10357w;

    /* renamed from: x  reason: collision with root package name */
    public h6.f f10358x;

    /* renamed from: y  reason: collision with root package name */
    public long f10359y;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f10360a;
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public final p f10361b;

        /* renamed from: c  reason: collision with root package name */
        public final long f10362c;

        public a(int i7, @n6.e p pVar, long j7) {
            this.f10360a = i7;
            this.f10361b = pVar;
            this.f10362c = j7;
        }

        public final long a() {
            return this.f10362c;
        }

        public final int b() {
            return this.f10360a;
        }

        @n6.e
        public final p c() {
            return this.f10361b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f10363a;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public final p f10364b;

        public c(int i7, @n6.d p pVar) {
            l0.p(pVar, "data");
            this.f10363a = i7;
            this.f10364b = pVar;
        }

        @n6.d
        public final p a() {
            return this.f10364b;
        }

        public final int b() {
            return this.f10363a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d implements Closeable {

        /* renamed from: k  reason: collision with root package name */
        public final boolean f10365k;
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public final o f10366l;
        @n6.d

        /* renamed from: m  reason: collision with root package name */
        public final n f10367m;

        public d(boolean z6, @n6.d o oVar, @n6.d n nVar) {
            l0.p(oVar, "source");
            l0.p(nVar, "sink");
            this.f10365k = z6;
            this.f10366l = oVar;
            this.f10367m = nVar;
        }

        public final boolean a() {
            return this.f10365k;
        }

        @n6.d
        public final n b() {
            return this.f10367m;
        }

        @n6.d
        public final o d() {
            return this.f10366l;
        }
    }

    /* renamed from: h6.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0123e extends w5.a {
        public C0123e() {
            super(e.this.f10341g + " writer", false, 2, null);
        }

        @Override // w5.a
        public long f() {
            try {
                return e.this.H() ? 0L : -1L;
            } catch (IOException e7) {
                e.this.u(e7, null);
                return -1L;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements r5.f {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d0 f10370b;

        public f(d0 d0Var) {
            this.f10370b = d0Var;
        }

        @Override // r5.f
        public void a(@n6.d r5.e eVar, @n6.d f0 f0Var) {
            l0.p(eVar, i0.k0.E0);
            l0.p(f0Var, "response");
            x5.c O = f0Var.O();
            try {
                e.this.r(f0Var, O);
                l0.m(O);
                d m7 = O.m();
                h6.f a7 = h6.f.f10389h.a(f0Var.d0());
                e.this.f10358x = a7;
                if (!e.this.x(a7)) {
                    synchronized (e.this) {
                        e.this.f10344j.clear();
                        e.this.c(o1.f3756l, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    e.this.w(s5.d.f16659i + " WebSocket " + this.f10370b.q().V(), m7);
                    e.this.v().f(e.this, f0Var);
                    e.this.y();
                } catch (Exception e7) {
                    e.this.u(e7, null);
                }
            } catch (IOException e8) {
                if (O != null) {
                    O.v();
                }
                e.this.u(e8, f0Var);
                s5.d.l(f0Var);
            }
        }

        @Override // r5.f
        public void b(@n6.d r5.e eVar, @n6.d IOException iOException) {
            l0.p(eVar, i0.k0.E0);
            l0.p(iOException, "e");
            e.this.u(iOException, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends w5.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f10371e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f10372f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ e f10373g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f10374h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ d f10375i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ h6.f f10376j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, long j7, e eVar, String str3, d dVar, h6.f fVar) {
            super(str2, false, 2, null);
            this.f10371e = str;
            this.f10372f = j7;
            this.f10373g = eVar;
            this.f10374h = str3;
            this.f10375i = dVar;
            this.f10376j = fVar;
        }

        @Override // w5.a
        public long f() {
            this.f10373g.I();
            return this.f10372f;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends w5.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f10377e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ boolean f10378f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ e f10379g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ i f10380h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ p f10381i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ k1.h f10382j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ k1.f f10383k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ k1.h f10384l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ k1.h f10385m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ k1.h f10386n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ k1.h f10387o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z6, String str2, boolean z7, e eVar, i iVar, p pVar, k1.h hVar, k1.f fVar, k1.h hVar2, k1.h hVar3, k1.h hVar4, k1.h hVar5) {
            super(str2, z7);
            this.f10377e = str;
            this.f10378f = z6;
            this.f10379g = eVar;
            this.f10380h = iVar;
            this.f10381i = pVar;
            this.f10382j = hVar;
            this.f10383k = fVar;
            this.f10384l = hVar2;
            this.f10385m = hVar3;
            this.f10386n = hVar4;
            this.f10387o = hVar5;
        }

        @Override // w5.a
        public long f() {
            this.f10379g.cancel();
            return -1L;
        }
    }

    public e(@n6.d w5.d dVar, @n6.d d0 d0Var, @n6.d k0 k0Var, @n6.d Random random, long j7, @n6.e h6.f fVar, long j8) {
        l0.p(dVar, "taskRunner");
        l0.p(d0Var, "originalRequest");
        l0.p(k0Var, "listener");
        l0.p(random, "random");
        this.f10354t = d0Var;
        this.f10355u = k0Var;
        this.f10356v = random;
        this.f10357w = j7;
        this.f10358x = fVar;
        this.f10359y = j8;
        this.f10340f = dVar.j();
        this.f10343i = new ArrayDeque<>();
        this.f10344j = new ArrayDeque<>();
        this.f10347m = -1;
        if (!l0.g("GET", d0Var.m())) {
            throw new IllegalArgumentException(("Request must be GET: " + d0Var.m()).toString());
        }
        p.a aVar = p.f11252p;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        m2 m2Var = m2.f17815a;
        this.f10335a = p.a.p(aVar, bArr, 0, 0, 3, null).h();
    }

    public final boolean A() throws IOException {
        try {
            h6.h hVar = this.f10338d;
            l0.m(hVar);
            hVar.b();
            return this.f10347m == -1;
        } catch (Exception e7) {
            u(e7, null);
            return false;
        }
    }

    public final synchronized int B() {
        return this.f10351q;
    }

    public final synchronized int C() {
        return this.f10352r;
    }

    public final void D() {
        if (!s5.d.f16658h || Thread.holdsLock(this)) {
            w5.a aVar = this.f10337c;
            if (aVar != null) {
                w5.c.p(this.f10340f, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final synchronized boolean E(p pVar, int i7) {
        if (!this.f10349o && !this.f10346l) {
            if (this.f10345k + pVar.c0() > A) {
                c(1001, null);
                return false;
            }
            this.f10345k += pVar.c0();
            this.f10344j.add(new c(i7, pVar));
            D();
            return true;
        }
        return false;
    }

    public final synchronized int F() {
        return this.f10350p;
    }

    public final void G() throws InterruptedException {
        this.f10340f.u();
        this.f10340f.l().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb A[Catch: all -> 0x01af, TRY_ENTER, TryCatch #4 {all -> 0x01af, blocks: (B:30:0x00fb, B:32:0x0106, B:35:0x0110, B:36:0x0120, B:38:0x012f, B:43:0x0134, B:44:0x013b, B:45:0x013c, B:48:0x0142, B:37:0x0121), top: B:92:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106 A[Catch: all -> 0x01af, TryCatch #4 {all -> 0x01af, blocks: (B:30:0x00fb, B:32:0x0106, B:35:0x0110, B:36:0x0120, B:38:0x012f, B:43:0x0134, B:44:0x013b, B:45:0x013c, B:48:0x0142, B:37:0x0121), top: B:92:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [h6.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [u4.k1$h] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [h6.e$d, T] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, h6.h] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, h6.i] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [i6.p] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.e.H():boolean");
    }

    public final void I() {
        synchronized (this) {
            if (this.f10349o) {
                return;
            }
            i iVar = this.f10339e;
            if (iVar != null) {
                int i7 = this.f10353s ? this.f10350p : -1;
                this.f10350p++;
                this.f10353s = true;
                m2 m2Var = m2.f17815a;
                if (i7 == -1) {
                    try {
                        iVar.h(p.f11251o);
                        return;
                    } catch (IOException e7) {
                        u(e7, null);
                        return;
                    }
                }
                u(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f10357w + "ms (after " + (i7 - 1) + " successful ping/pongs)"), null);
            }
        }
    }

    @Override // r5.j0
    @n6.d
    public d0 a() {
        return this.f10354t;
    }

    @Override // h6.h.a
    public void b(@n6.d p pVar) throws IOException {
        l0.p(pVar, "bytes");
        this.f10355u.d(this, pVar);
    }

    @Override // r5.j0
    public boolean c(int i7, @n6.e String str) {
        return s(i7, str, B);
    }

    @Override // r5.j0
    public void cancel() {
        r5.e eVar = this.f10336b;
        l0.m(eVar);
        eVar.cancel();
    }

    @Override // r5.j0
    public boolean d(@n6.d String str) {
        l0.p(str, "text");
        return E(p.f11252p.l(str), 1);
    }

    @Override // r5.j0
    public synchronized long e() {
        return this.f10345k;
    }

    @Override // r5.j0
    public boolean f(@n6.d p pVar) {
        l0.p(pVar, "bytes");
        return E(pVar, 2);
    }

    @Override // h6.h.a
    public synchronized void g(@n6.d p pVar) {
        l0.p(pVar, "payload");
        if (!this.f10349o && (!this.f10346l || !this.f10344j.isEmpty())) {
            this.f10343i.add(pVar);
            D();
            this.f10351q++;
        }
    }

    @Override // h6.h.a
    public synchronized void h(@n6.d p pVar) {
        l0.p(pVar, "payload");
        this.f10352r++;
        this.f10353s = false;
    }

    @Override // h6.h.a
    public void i(@n6.d String str) throws IOException {
        l0.p(str, "text");
        this.f10355u.e(this, str);
    }

    @Override // h6.h.a
    public void j(int i7, @n6.d String str) {
        d dVar;
        h6.h hVar;
        i iVar;
        l0.p(str, "reason");
        boolean z6 = true;
        if (!(i7 != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.f10347m != -1) {
                z6 = false;
            }
            if (!z6) {
                throw new IllegalStateException("already closed".toString());
            }
            this.f10347m = i7;
            this.f10348n = str;
            dVar = null;
            if (this.f10346l && this.f10344j.isEmpty()) {
                d dVar2 = this.f10342h;
                this.f10342h = null;
                hVar = this.f10338d;
                this.f10338d = null;
                iVar = this.f10339e;
                this.f10339e = null;
                this.f10340f.u();
                dVar = dVar2;
            } else {
                hVar = null;
                iVar = null;
            }
            m2 m2Var = m2.f17815a;
        }
        try {
            this.f10355u.b(this, i7, str);
            if (dVar != null) {
                this.f10355u.a(this, i7, str);
            }
        } finally {
            if (dVar != null) {
                s5.d.l(dVar);
            }
            if (hVar != null) {
                s5.d.l(hVar);
            }
            if (iVar != null) {
                s5.d.l(iVar);
            }
        }
    }

    public final void q(long j7, @n6.d TimeUnit timeUnit) throws InterruptedException {
        l0.p(timeUnit, "timeUnit");
        this.f10340f.l().await(j7, timeUnit);
    }

    public final void r(@n6.d f0 f0Var, @n6.e x5.c cVar) throws IOException {
        l0.p(f0Var, "response");
        if (f0Var.L() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + f0Var.L() + ' ' + f0Var.q0() + '\'');
        }
        String X = f0.X(f0Var, "Connection", null, 2, null);
        if (!b0.L1("Upgrade", X, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + X + '\'');
        }
        String X2 = f0.X(f0Var, "Upgrade", null, 2, null);
        if (!b0.L1("websocket", X2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + X2 + '\'');
        }
        String X3 = f0.X(f0Var, "Sec-WebSocket-Accept", null, 2, null);
        String h7 = p.f11252p.l(this.f10335a + h6.g.f10396a).Z().h();
        if ((!l0.g(h7, X3)) != true) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + h7 + "' but was '" + X3 + '\'');
    }

    public final synchronized boolean s(int i7, @n6.e String str, long j7) {
        p pVar;
        h6.g.f10418w.d(i7);
        if (str != null) {
            pVar = p.f11252p.l(str);
            if (!(((long) pVar.c0()) <= 123)) {
                throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
            }
        } else {
            pVar = null;
        }
        if (!this.f10349o && !this.f10346l) {
            this.f10346l = true;
            this.f10344j.add(new a(i7, pVar, j7));
            D();
            return true;
        }
        return false;
    }

    public final void t(@n6.d r5.b0 b0Var) {
        l0.p(b0Var, "client");
        if (this.f10354t.i(h6.f.f10388g) != null) {
            u(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        r5.b0 f7 = b0Var.f0().r(r.f16028a).f0(f10334z).f();
        d0 b7 = this.f10354t.n().n("Upgrade", "websocket").n("Connection", "Upgrade").n("Sec-WebSocket-Key", this.f10335a).n("Sec-WebSocket-Version", "13").n(h6.f.f10388g, "permessage-deflate").b();
        x5.e eVar = new x5.e(f7, b7, true);
        this.f10336b = eVar;
        l0.m(eVar);
        eVar.d(new f(b7));
    }

    public final void u(@n6.d Exception exc, @n6.e f0 f0Var) {
        l0.p(exc, "e");
        synchronized (this) {
            if (this.f10349o) {
                return;
            }
            this.f10349o = true;
            d dVar = this.f10342h;
            this.f10342h = null;
            h6.h hVar = this.f10338d;
            this.f10338d = null;
            i iVar = this.f10339e;
            this.f10339e = null;
            this.f10340f.u();
            m2 m2Var = m2.f17815a;
            try {
                this.f10355u.c(this, exc, f0Var);
            } finally {
                if (dVar != null) {
                    s5.d.l(dVar);
                }
                if (hVar != null) {
                    s5.d.l(hVar);
                }
                if (iVar != null) {
                    s5.d.l(iVar);
                }
            }
        }
    }

    @n6.d
    public final k0 v() {
        return this.f10355u;
    }

    public final void w(@n6.d String str, @n6.d d dVar) throws IOException {
        l0.p(str, "name");
        l0.p(dVar, "streams");
        h6.f fVar = this.f10358x;
        l0.m(fVar);
        synchronized (this) {
            this.f10341g = str;
            this.f10342h = dVar;
            this.f10339e = new i(dVar.a(), dVar.b(), this.f10356v, fVar.f10390a, fVar.i(dVar.a()), this.f10359y);
            this.f10337c = new C0123e();
            long j7 = this.f10357w;
            if (j7 != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j7);
                String str2 = str + " ping";
                this.f10340f.n(new g(str2, str2, nanos, this, str, dVar, fVar), nanos);
            }
            if ((!this.f10344j.isEmpty()) != false) {
                D();
            }
            m2 m2Var = m2.f17815a;
        }
        this.f10338d = new h6.h(dVar.a(), dVar.d(), this, fVar.f10390a, fVar.i(!dVar.a()));
    }

    public final boolean x(h6.f fVar) {
        if (!fVar.f10395f && fVar.f10391b == null) {
            Integer num = fVar.f10393d;
            if (num != null) {
                int intValue = num.intValue();
                return 8 <= intValue && 15 >= intValue;
            }
            return true;
        }
        return false;
    }

    public final void y() throws IOException {
        while (this.f10347m == -1) {
            h6.h hVar = this.f10338d;
            l0.m(hVar);
            hVar.b();
        }
    }

    public final synchronized boolean z(@n6.d p pVar) {
        l0.p(pVar, "payload");
        if (!this.f10349o && (!this.f10346l || !this.f10344j.isEmpty())) {
            this.f10343i.add(pVar);
            D();
            return true;
        }
        return false;
    }
}
