package a6;

import a6.h;
import i6.a0;
import i6.o;
import i6.p;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import u4.k1;
import u4.l0;
import u4.w;
import v3.m2;
import w5.c;
/* loaded from: classes.dex */
public final class f implements Closeable {
    public static final int N = 16777216;
    @n6.d
    public static final m O;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 1000000000;
    public static final c T = new c(null);
    public long A;
    public long B;
    public long C;
    @n6.d
    public final m D;
    @n6.d
    public m E;
    public long F;
    public long G;
    public long H;
    public long I;
    @n6.d
    public final Socket J;
    @n6.d
    public final a6.j K;
    @n6.d
    public final e L;
    public final Set<Integer> M;

    /* renamed from: k */
    public final boolean f304k;
    @n6.d

    /* renamed from: l */
    public final d f305l;
    @n6.d

    /* renamed from: m */
    public final Map<Integer, a6.i> f306m;
    @n6.d

    /* renamed from: n */
    public final String f307n;

    /* renamed from: o */
    public int f308o;

    /* renamed from: p */
    public int f309p;

    /* renamed from: q */
    public boolean f310q;

    /* renamed from: r */
    public final w5.d f311r;

    /* renamed from: s */
    public final w5.c f312s;

    /* renamed from: t */
    public final w5.c f313t;

    /* renamed from: u */
    public final w5.c f314u;

    /* renamed from: v */
    public final a6.l f315v;

    /* renamed from: w */
    public long f316w;

    /* renamed from: x */
    public long f317x;

    /* renamed from: y */
    public long f318y;

    /* renamed from: z */
    public long f319z;

    /* loaded from: classes.dex */
    public static final class a extends w5.a {

        /* renamed from: e */
        public final /* synthetic */ String f320e;

        /* renamed from: f */
        public final /* synthetic */ f f321f;

        /* renamed from: g */
        public final /* synthetic */ long f322g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, f fVar, long j7) {
            super(str2, false, 2, null);
            this.f320e = str;
            this.f321f = fVar;
            this.f322g = j7;
        }

        @Override // w5.a
        public long f() {
            boolean z6;
            synchronized (this.f321f) {
                if (this.f321f.f317x < this.f321f.f316w) {
                    z6 = true;
                } else {
                    this.f321f.f316w++;
                    z6 = false;
                }
            }
            if (z6) {
                this.f321f.S(null);
                return -1L;
            }
            this.f321f.v1(false, 1, 0);
            return this.f322g;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @n6.d

        /* renamed from: a */
        public Socket f323a;
        @n6.d

        /* renamed from: b */
        public String f324b;
        @n6.d

        /* renamed from: c */
        public o f325c;
        @n6.d

        /* renamed from: d */
        public i6.n f326d;
        @n6.d

        /* renamed from: e */
        public d f327e;
        @n6.d

        /* renamed from: f */
        public a6.l f328f;

        /* renamed from: g */
        public int f329g;

        /* renamed from: h */
        public boolean f330h;
        @n6.d

        /* renamed from: i */
        public final w5.d f331i;

        public b(boolean z6, @n6.d w5.d dVar) {
            l0.p(dVar, "taskRunner");
            this.f330h = z6;
            this.f331i = dVar;
            this.f327e = d.f332a;
            this.f328f = a6.l.f471a;
        }

        public static /* synthetic */ b z(b bVar, Socket socket, String str, o oVar, i6.n nVar, int i7, Object obj) throws IOException {
            if ((i7 & 2) != 0) {
                str = s5.d.O(socket);
            }
            if ((i7 & 4) != 0) {
                oVar = a0.d(a0.n(socket));
            }
            if ((i7 & 8) != 0) {
                nVar = a0.c(a0.i(socket));
            }
            return bVar.y(socket, str, oVar, nVar);
        }

        @n6.d
        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f330h;
        }

        @n6.d
        public final String c() {
            String str = this.f324b;
            if (str == null) {
                l0.S("connectionName");
            }
            return str;
        }

        @n6.d
        public final d d() {
            return this.f327e;
        }

        public final int e() {
            return this.f329g;
        }

        @n6.d
        public final a6.l f() {
            return this.f328f;
        }

        @n6.d
        public final i6.n g() {
            i6.n nVar = this.f326d;
            if (nVar == null) {
                l0.S("sink");
            }
            return nVar;
        }

        @n6.d
        public final Socket h() {
            Socket socket = this.f323a;
            if (socket == null) {
                l0.S("socket");
            }
            return socket;
        }

        @n6.d
        public final o i() {
            o oVar = this.f325c;
            if (oVar == null) {
                l0.S("source");
            }
            return oVar;
        }

        @n6.d
        public final w5.d j() {
            return this.f331i;
        }

        @n6.d
        public final b k(@n6.d d dVar) {
            l0.p(dVar, "listener");
            this.f327e = dVar;
            return this;
        }

        @n6.d
        public final b l(int i7) {
            this.f329g = i7;
            return this;
        }

        @n6.d
        public final b m(@n6.d a6.l lVar) {
            l0.p(lVar, "pushObserver");
            this.f328f = lVar;
            return this;
        }

        public final void n(boolean z6) {
            this.f330h = z6;
        }

        public final void o(@n6.d String str) {
            l0.p(str, "<set-?>");
            this.f324b = str;
        }

        public final void p(@n6.d d dVar) {
            l0.p(dVar, "<set-?>");
            this.f327e = dVar;
        }

        public final void q(int i7) {
            this.f329g = i7;
        }

        public final void r(@n6.d a6.l lVar) {
            l0.p(lVar, "<set-?>");
            this.f328f = lVar;
        }

        public final void s(@n6.d i6.n nVar) {
            l0.p(nVar, "<set-?>");
            this.f326d = nVar;
        }

        public final void t(@n6.d Socket socket) {
            l0.p(socket, "<set-?>");
            this.f323a = socket;
        }

        public final void u(@n6.d o oVar) {
            l0.p(oVar, "<set-?>");
            this.f325c = oVar;
        }

        @n6.d
        @s4.i
        public final b v(@n6.d Socket socket) throws IOException {
            return z(this, socket, null, null, null, 14, null);
        }

        @n6.d
        @s4.i
        public final b w(@n6.d Socket socket, @n6.d String str) throws IOException {
            return z(this, socket, str, null, null, 12, null);
        }

        @n6.d
        @s4.i
        public final b x(@n6.d Socket socket, @n6.d String str, @n6.d o oVar) throws IOException {
            return z(this, socket, str, oVar, null, 8, null);
        }

        @n6.d
        @s4.i
        public final b y(@n6.d Socket socket, @n6.d String str, @n6.d o oVar, @n6.d i6.n nVar) throws IOException {
            String str2;
            l0.p(socket, "socket");
            l0.p(str, "peerName");
            l0.p(oVar, "source");
            l0.p(nVar, "sink");
            this.f323a = socket;
            if (this.f330h) {
                str2 = s5.d.f16659i + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            this.f324b = str2;
            this.f325c = oVar;
            this.f326d = nVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        @n6.d
        public final m a() {
            return f.O;
        }

        public /* synthetic */ c(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: b */
        public static final b f333b = new b(null);
        @n6.d
        @s4.e

        /* renamed from: a */
        public static final d f332a = new a();

        /* loaded from: classes.dex */
        public static final class a extends d {
            @Override // a6.f.d
            public void f(@n6.d a6.i iVar) throws IOException {
                l0.p(iVar, "stream");
                iVar.d(a6.b.REFUSED_STREAM, null);
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

        public void e(@n6.d f fVar, @n6.d m mVar) {
            l0.p(fVar, a6.g.f398i);
            l0.p(mVar, "settings");
        }

        public abstract void f(@n6.d a6.i iVar) throws IOException;
    }

    /* loaded from: classes.dex */
    public final class e implements h.c, t4.a<m2> {
        @n6.d

        /* renamed from: k */
        public final a6.h f334k;

        /* renamed from: l */
        public final /* synthetic */ f f335l;

        /* loaded from: classes.dex */
        public static final class a extends w5.a {

            /* renamed from: e */
            public final /* synthetic */ String f336e;

            /* renamed from: f */
            public final /* synthetic */ boolean f337f;

            /* renamed from: g */
            public final /* synthetic */ e f338g;

            /* renamed from: h */
            public final /* synthetic */ k1.h f339h;

            /* renamed from: i */
            public final /* synthetic */ boolean f340i;

            /* renamed from: j */
            public final /* synthetic */ m f341j;

            /* renamed from: k */
            public final /* synthetic */ k1.g f342k;

            /* renamed from: l */
            public final /* synthetic */ k1.h f343l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z6, String str2, boolean z7, e eVar, k1.h hVar, boolean z8, m mVar, k1.g gVar, k1.h hVar2) {
                super(str2, z7);
                this.f336e = str;
                this.f337f = z6;
                this.f338g = eVar;
                this.f339h = hVar;
                this.f340i = z8;
                this.f341j = mVar;
                this.f342k = gVar;
                this.f343l = hVar2;
            }

            @Override // w5.a
            public long f() {
                this.f338g.f335l.f0().e(this.f338g.f335l, (m) this.f339h.f17436k);
                return -1L;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends w5.a {

            /* renamed from: e */
            public final /* synthetic */ String f344e;

            /* renamed from: f */
            public final /* synthetic */ boolean f345f;

            /* renamed from: g */
            public final /* synthetic */ a6.i f346g;

            /* renamed from: h */
            public final /* synthetic */ e f347h;

            /* renamed from: i */
            public final /* synthetic */ a6.i f348i;

            /* renamed from: j */
            public final /* synthetic */ int f349j;

            /* renamed from: k */
            public final /* synthetic */ List f350k;

            /* renamed from: l */
            public final /* synthetic */ boolean f351l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z6, String str2, boolean z7, a6.i iVar, e eVar, a6.i iVar2, int i7, List list, boolean z8) {
                super(str2, z7);
                this.f344e = str;
                this.f345f = z6;
                this.f346g = iVar;
                this.f347h = eVar;
                this.f348i = iVar2;
                this.f349j = i7;
                this.f350k = list;
                this.f351l = z8;
            }

            @Override // w5.a
            public long f() {
                try {
                    this.f347h.f335l.f0().f(this.f346g);
                    return -1L;
                } catch (IOException e7) {
                    c6.j.f8005e.g().m("Http2Connection.Listener failure for " + this.f347h.f335l.Z(), 4, e7);
                    try {
                        this.f346g.d(a6.b.PROTOCOL_ERROR, e7);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends w5.a {

            /* renamed from: e */
            public final /* synthetic */ String f352e;

            /* renamed from: f */
            public final /* synthetic */ boolean f353f;

            /* renamed from: g */
            public final /* synthetic */ e f354g;

            /* renamed from: h */
            public final /* synthetic */ int f355h;

            /* renamed from: i */
            public final /* synthetic */ int f356i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z6, String str2, boolean z7, e eVar, int i7, int i8) {
                super(str2, z7);
                this.f352e = str;
                this.f353f = z6;
                this.f354g = eVar;
                this.f355h = i7;
                this.f356i = i8;
            }

            @Override // w5.a
            public long f() {
                this.f354g.f335l.v1(true, this.f355h, this.f356i);
                return -1L;
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends w5.a {

            /* renamed from: e */
            public final /* synthetic */ String f357e;

            /* renamed from: f */
            public final /* synthetic */ boolean f358f;

            /* renamed from: g */
            public final /* synthetic */ e f359g;

            /* renamed from: h */
            public final /* synthetic */ boolean f360h;

            /* renamed from: i */
            public final /* synthetic */ m f361i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z6, String str2, boolean z7, e eVar, boolean z8, m mVar) {
                super(str2, z7);
                this.f357e = str;
                this.f358f = z6;
                this.f359g = eVar;
                this.f360h = z8;
                this.f361i = mVar;
            }

            @Override // w5.a
            public long f() {
                this.f359g.v(this.f360h, this.f361i);
                return -1L;
            }
        }

        public e(@n6.d f fVar, a6.h hVar) {
            l0.p(hVar, "reader");
            this.f335l = fVar;
            this.f334k = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [a6.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [a6.h, java.io.Closeable] */
        public void A() {
            a6.b bVar;
            a6.b bVar2 = a6.b.INTERNAL_ERROR;
            IOException e7 = null;
            try {
                try {
                    this.f334k.d(this);
                    do {
                    } while (this.f334k.b(false, this));
                    a6.b bVar3 = a6.b.NO_ERROR;
                    try {
                        this.f335l.R(bVar3, a6.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e8) {
                        e7 = e8;
                        a6.b bVar4 = a6.b.PROTOCOL_ERROR;
                        f fVar = this.f335l;
                        fVar.R(bVar4, bVar4, e7);
                        bVar = fVar;
                        bVar2 = this.f334k;
                        s5.d.l(bVar2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f335l.R(bVar, bVar2, e7);
                    s5.d.l(this.f334k);
                    throw th;
                }
            } catch (IOException e9) {
                e7 = e9;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                this.f335l.R(bVar, bVar2, e7);
                s5.d.l(this.f334k);
                throw th;
            }
            bVar2 = this.f334k;
            s5.d.l(bVar2);
        }

        @Override // a6.h.c
        public void b(boolean z6, int i7, @n6.d o oVar, int i8) throws IOException {
            l0.p(oVar, "source");
            if (this.f335l.f1(i7)) {
                this.f335l.a1(i7, oVar, i8, z6);
                return;
            }
            a6.i M0 = this.f335l.M0(i7);
            if (M0 == null) {
                this.f335l.y1(i7, a6.b.PROTOCOL_ERROR);
                long j7 = i8;
                this.f335l.r1(j7);
                oVar.skip(j7);
                return;
            }
            M0.y(oVar, i8);
            if (z6) {
                M0.z(s5.d.f16652b, true);
            }
        }

        @Override // a6.h.c
        public void d(int i7, @n6.d String str, @n6.d p pVar, @n6.d String str2, int i8, long j7) {
            l0.p(str, "origin");
            l0.p(pVar, "protocol");
            l0.p(str2, a6.g.f399j);
        }

        @Override // a6.h.c
        public void f(int i7, @n6.d a6.b bVar, @n6.d p pVar) {
            int i8;
            a6.i[] iVarArr;
            l0.p(bVar, "errorCode");
            l0.p(pVar, "debugData");
            pVar.c0();
            synchronized (this.f335l) {
                Object[] array = this.f335l.O0().values().toArray(new a6.i[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                iVarArr = (a6.i[]) array;
                this.f335l.f310q = true;
                m2 m2Var = m2.f17815a;
            }
            for (a6.i iVar : iVarArr) {
                if (iVar.k() > i7 && iVar.v()) {
                    iVar.A(a6.b.REFUSED_STREAM);
                    this.f335l.g1(iVar.k());
                }
            }
        }

        @Override // a6.h.c
        public void g() {
        }

        @Override // a6.h.c
        public void h(int i7, @n6.d a6.b bVar) {
            l0.p(bVar, "errorCode");
            if (this.f335l.f1(i7)) {
                this.f335l.d1(i7, bVar);
                return;
            }
            a6.i g12 = this.f335l.g1(i7);
            if (g12 != null) {
                g12.A(bVar);
            }
        }

        @Override // a6.h.c
        public void j(boolean z6, int i7, int i8) {
            if (!z6) {
                w5.c cVar = this.f335l.f312s;
                String str = this.f335l.Z() + " ping";
                cVar.n(new c(str, true, str, true, this, i7, i8), 0L);
                return;
            }
            synchronized (this.f335l) {
                if (i7 == 1) {
                    this.f335l.f317x++;
                } else if (i7 != 2) {
                    if (i7 == 3) {
                        this.f335l.B++;
                        f fVar = this.f335l;
                        if (fVar == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                        }
                        fVar.notifyAll();
                    }
                    m2 m2Var = m2.f17815a;
                } else {
                    this.f335l.f319z++;
                }
            }
        }

        @Override // a6.h.c
        public void k(int i7, int i8, int i9, boolean z6) {
        }

        @Override // a6.h.c
        public void l(boolean z6, int i7, int i8, @n6.d List<a6.c> list) {
            l0.p(list, "headerBlock");
            if (this.f335l.f1(i7)) {
                this.f335l.b1(i7, list, z6);
                return;
            }
            synchronized (this.f335l) {
                a6.i M0 = this.f335l.M0(i7);
                if (M0 != null) {
                    m2 m2Var = m2.f17815a;
                    M0.z(s5.d.X(list), z6);
                } else if (this.f335l.f310q) {
                } else {
                    if (i7 <= this.f335l.d0()) {
                        return;
                    }
                    if (i7 % 2 == this.f335l.p0() % 2) {
                        return;
                    }
                    a6.i iVar = new a6.i(i7, this.f335l, false, z6, s5.d.X(list));
                    this.f335l.i1(i7);
                    this.f335l.O0().put(Integer.valueOf(i7), iVar);
                    w5.c j7 = this.f335l.f311r.j();
                    String str = this.f335l.Z() + '[' + i7 + "] onStream";
                    j7.n(new b(str, true, str, true, iVar, this, M0, i7, list, z6), 0L);
                }
            }
        }

        @Override // t4.a
        public /* bridge */ /* synthetic */ m2 n() {
            A();
            return m2.f17815a;
        }

        @Override // a6.h.c
        public void o(int i7, long j7) {
            if (i7 != 0) {
                a6.i M0 = this.f335l.M0(i7);
                if (M0 != null) {
                    synchronized (M0) {
                        M0.a(j7);
                        m2 m2Var = m2.f17815a;
                    }
                    return;
                }
                return;
            }
            synchronized (this.f335l) {
                f fVar = this.f335l;
                fVar.I = fVar.T0() + j7;
                f fVar2 = this.f335l;
                if (fVar2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                fVar2.notifyAll();
                m2 m2Var2 = m2.f17815a;
            }
        }

        @Override // a6.h.c
        public void q(int i7, int i8, @n6.d List<a6.c> list) {
            l0.p(list, "requestHeaders");
            this.f335l.c1(i8, list);
        }

        @Override // a6.h.c
        public void r(boolean z6, @n6.d m mVar) {
            l0.p(mVar, "settings");
            w5.c cVar = this.f335l.f312s;
            String str = this.f335l.Z() + " applyAndAckSettings";
            cVar.n(new d(str, true, str, true, this, z6, mVar), 0L);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:6|7|(1:9)(1:54)|10|(2:15|(10:17|18|19|20|21|22|23|24|25|26)(2:51|52))|53|18|19|20|21|22|23|24|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x00d6, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x00d7, code lost:
            r21.f335l.S(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, a6.m] */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void v(boolean r22, @n6.d a6.m r23) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a6.f.e.v(boolean, a6.m):void");
        }

        @n6.d
        public final a6.h x() {
            return this.f334k;
        }
    }

    /* renamed from: a6.f$f */
    /* loaded from: classes.dex */
    public static final class C0011f extends w5.a {

        /* renamed from: e */
        public final /* synthetic */ String f362e;

        /* renamed from: f */
        public final /* synthetic */ boolean f363f;

        /* renamed from: g */
        public final /* synthetic */ f f364g;

        /* renamed from: h */
        public final /* synthetic */ int f365h;

        /* renamed from: i */
        public final /* synthetic */ i6.m f366i;

        /* renamed from: j */
        public final /* synthetic */ int f367j;

        /* renamed from: k */
        public final /* synthetic */ boolean f368k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0011f(String str, boolean z6, String str2, boolean z7, f fVar, int i7, i6.m mVar, int i8, boolean z8) {
            super(str2, z7);
            this.f362e = str;
            this.f363f = z6;
            this.f364g = fVar;
            this.f365h = i7;
            this.f366i = mVar;
            this.f367j = i8;
            this.f368k = z8;
        }

        @Override // w5.a
        public long f() {
            try {
                boolean d7 = this.f364g.f315v.d(this.f365h, this.f366i, this.f367j, this.f368k);
                if (d7) {
                    this.f364g.V0().t(this.f365h, a6.b.CANCEL);
                }
                if (d7 || this.f368k) {
                    synchronized (this.f364g) {
                        this.f364g.M.remove(Integer.valueOf(this.f365h));
                    }
                    return -1L;
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends w5.a {

        /* renamed from: e */
        public final /* synthetic */ String f369e;

        /* renamed from: f */
        public final /* synthetic */ boolean f370f;

        /* renamed from: g */
        public final /* synthetic */ f f371g;

        /* renamed from: h */
        public final /* synthetic */ int f372h;

        /* renamed from: i */
        public final /* synthetic */ List f373i;

        /* renamed from: j */
        public final /* synthetic */ boolean f374j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z6, String str2, boolean z7, f fVar, int i7, List list, boolean z8) {
            super(str2, z7);
            this.f369e = str;
            this.f370f = z6;
            this.f371g = fVar;
            this.f372h = i7;
            this.f373i = list;
            this.f374j = z8;
        }

        @Override // w5.a
        public long f() {
            boolean b7 = this.f371g.f315v.b(this.f372h, this.f373i, this.f374j);
            if (b7) {
                try {
                    this.f371g.V0().t(this.f372h, a6.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (b7 || this.f374j) {
                synchronized (this.f371g) {
                    this.f371g.M.remove(Integer.valueOf(this.f372h));
                }
                return -1L;
            }
            return -1L;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends w5.a {

        /* renamed from: e */
        public final /* synthetic */ String f375e;

        /* renamed from: f */
        public final /* synthetic */ boolean f376f;

        /* renamed from: g */
        public final /* synthetic */ f f377g;

        /* renamed from: h */
        public final /* synthetic */ int f378h;

        /* renamed from: i */
        public final /* synthetic */ List f379i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z6, String str2, boolean z7, f fVar, int i7, List list) {
            super(str2, z7);
            this.f375e = str;
            this.f376f = z6;
            this.f377g = fVar;
            this.f378h = i7;
            this.f379i = list;
        }

        @Override // w5.a
        public long f() {
            if (this.f377g.f315v.a(this.f378h, this.f379i)) {
                try {
                    this.f377g.V0().t(this.f378h, a6.b.CANCEL);
                    synchronized (this.f377g) {
                        this.f377g.M.remove(Integer.valueOf(this.f378h));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
            return -1L;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends w5.a {

        /* renamed from: e */
        public final /* synthetic */ String f380e;

        /* renamed from: f */
        public final /* synthetic */ boolean f381f;

        /* renamed from: g */
        public final /* synthetic */ f f382g;

        /* renamed from: h */
        public final /* synthetic */ int f383h;

        /* renamed from: i */
        public final /* synthetic */ a6.b f384i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z6, String str2, boolean z7, f fVar, int i7, a6.b bVar) {
            super(str2, z7);
            this.f380e = str;
            this.f381f = z6;
            this.f382g = fVar;
            this.f383h = i7;
            this.f384i = bVar;
        }

        @Override // w5.a
        public long f() {
            this.f382g.f315v.c(this.f383h, this.f384i);
            synchronized (this.f382g) {
                this.f382g.M.remove(Integer.valueOf(this.f383h));
                m2 m2Var = m2.f17815a;
            }
            return -1L;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends w5.a {

        /* renamed from: e */
        public final /* synthetic */ String f385e;

        /* renamed from: f */
        public final /* synthetic */ boolean f386f;

        /* renamed from: g */
        public final /* synthetic */ f f387g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z6, String str2, boolean z7, f fVar) {
            super(str2, z7);
            this.f385e = str;
            this.f386f = z6;
            this.f387g = fVar;
        }

        @Override // w5.a
        public long f() {
            this.f387g.v1(false, 2, 0);
            return -1L;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends w5.a {

        /* renamed from: e */
        public final /* synthetic */ String f388e;

        /* renamed from: f */
        public final /* synthetic */ boolean f389f;

        /* renamed from: g */
        public final /* synthetic */ f f390g;

        /* renamed from: h */
        public final /* synthetic */ int f391h;

        /* renamed from: i */
        public final /* synthetic */ a6.b f392i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z6, String str2, boolean z7, f fVar, int i7, a6.b bVar) {
            super(str2, z7);
            this.f388e = str;
            this.f389f = z6;
            this.f390g = fVar;
            this.f391h = i7;
            this.f392i = bVar;
        }

        @Override // w5.a
        public long f() {
            try {
                this.f390g.x1(this.f391h, this.f392i);
                return -1L;
            } catch (IOException e7) {
                this.f390g.S(e7);
                return -1L;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends w5.a {

        /* renamed from: e */
        public final /* synthetic */ String f393e;

        /* renamed from: f */
        public final /* synthetic */ boolean f394f;

        /* renamed from: g */
        public final /* synthetic */ f f395g;

        /* renamed from: h */
        public final /* synthetic */ int f396h;

        /* renamed from: i */
        public final /* synthetic */ long f397i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z6, String str2, boolean z7, f fVar, int i7, long j7) {
            super(str2, z7);
            this.f393e = str;
            this.f394f = z6;
            this.f395g = fVar;
            this.f396h = i7;
            this.f397i = j7;
        }

        @Override // w5.a
        public long f() {
            try {
                this.f395g.V0().A(this.f396h, this.f397i);
                return -1L;
            } catch (IOException e7) {
                this.f395g.S(e7);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.k(7, 65535);
        mVar.k(5, 16384);
        O = mVar;
    }

    public f(@n6.d b bVar) {
        l0.p(bVar, "builder");
        boolean b7 = bVar.b();
        this.f304k = b7;
        this.f305l = bVar.d();
        this.f306m = new LinkedHashMap();
        String c7 = bVar.c();
        this.f307n = c7;
        this.f309p = bVar.b() ? 3 : 2;
        w5.d j7 = bVar.j();
        this.f311r = j7;
        w5.c j8 = j7.j();
        this.f312s = j8;
        this.f313t = j7.j();
        this.f314u = j7.j();
        this.f315v = bVar.f();
        m mVar = new m();
        if (bVar.b()) {
            mVar.k(7, 16777216);
        }
        m2 m2Var = m2.f17815a;
        this.D = mVar;
        this.E = O;
        this.I = r2.e();
        this.J = bVar.h();
        this.K = new a6.j(bVar.g(), b7);
        this.L = new e(this, new a6.h(bVar.i(), b7));
        this.M = new LinkedHashSet();
        if (bVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.e());
            String str = c7 + " ping";
            j8.n(new a(str, str, this, nanos), nanos);
        }
    }

    public static /* synthetic */ void q1(f fVar, boolean z6, w5.d dVar, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            z6 = true;
        }
        if ((i7 & 2) != 0) {
            dVar = w5.d.f18228h;
        }
        fVar.p1(z6, dVar);
    }

    public final long C0() {
        return this.F;
    }

    @n6.d
    public final e E0() {
        return this.L;
    }

    @n6.d
    public final Socket I0() {
        return this.J;
    }

    @n6.e
    public final synchronized a6.i M0(int i7) {
        return this.f306m.get(Integer.valueOf(i7));
    }

    @n6.d
    public final Map<Integer, a6.i> O0() {
        return this.f306m;
    }

    public final synchronized void Q() throws InterruptedException {
        while (this.B < this.A) {
            wait();
        }
    }

    public final void R(@n6.d a6.b bVar, @n6.d a6.b bVar2, @n6.e IOException iOException) {
        int i7;
        a6.i[] iVarArr;
        l0.p(bVar, "connectionCode");
        l0.p(bVar2, "streamCode");
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
        try {
            m1(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if ((!this.f306m.isEmpty()) == true) {
                Object[] array = this.f306m.values().toArray(new a6.i[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                iVarArr = (a6.i[]) array;
                this.f306m.clear();
            } else {
                iVarArr = null;
            }
            m2 m2Var = m2.f17815a;
        }
        if (iVarArr != null) {
            for (a6.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.K.close();
        } catch (IOException unused3) {
        }
        try {
            this.J.close();
        } catch (IOException unused4) {
        }
        this.f312s.u();
        this.f313t.u();
        this.f314u.u();
    }

    public final void S(IOException iOException) {
        a6.b bVar = a6.b.PROTOCOL_ERROR;
        R(bVar, bVar, iOException);
    }

    public final long T0() {
        return this.I;
    }

    public final long U0() {
        return this.H;
    }

    @n6.d
    public final a6.j V0() {
        return this.K;
    }

    public final synchronized boolean W0(long j7) {
        if (this.f310q) {
            return false;
        }
        if (this.f319z < this.f318y) {
            if (j7 >= this.C) {
                return false;
            }
        }
        return true;
    }

    public final boolean X() {
        return this.f304k;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0048 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:48:0x0006, B:67:0x0053, B:69:0x0056, B:70:0x005c, B:72:0x0061, B:77:0x006f, B:78:0x007a, B:49:0x0007, B:51:0x000e, B:52:0x0013, B:54:0x0017, B:56:0x002a, B:58:0x0032, B:63:0x0042, B:65:0x0048, B:66:0x0051, B:79:0x007b, B:80:0x0080), top: B:87:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a6.i X0(int r11, java.util.List<a6.c> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            a6.j r7 = r10.K
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L84
            int r0 = r10.f309p     // Catch: java.lang.Throwable -> L81
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            a6.b r0 = a6.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L81
            r10.m1(r0)     // Catch: java.lang.Throwable -> L81
        L13:
            boolean r0 = r10.f310q     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L7b
            int r8 = r10.f309p     // Catch: java.lang.Throwable -> L81
            int r0 = r8 + 2
            r10.f309p = r0     // Catch: java.lang.Throwable -> L81
            a6.i r9 = new a6.i     // Catch: java.lang.Throwable -> L81
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L81
            r0 = 1
            if (r13 == 0) goto L41
            long r1 = r10.H     // Catch: java.lang.Throwable -> L81
            long r3 = r10.I     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L41
            long r1 = r9.t()     // Catch: java.lang.Throwable -> L81
            long r3 = r9.s()     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L3f
            goto L41
        L3f:
            r13 = 0
            goto L42
        L41:
            r13 = r0
        L42:
            boolean r1 = r9.w()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L51
            java.util.Map<java.lang.Integer, a6.i> r1 = r10.f306m     // Catch: java.lang.Throwable -> L81
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L81
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L81
        L51:
            v3.m2 r1 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 != 0) goto L5c
            a6.j r11 = r10.K     // Catch: java.lang.Throwable -> L84
            r11.k(r6, r8, r12)     // Catch: java.lang.Throwable -> L84
            goto L66
        L5c:
            boolean r1 = r10.f304k     // Catch: java.lang.Throwable -> L84
            r0 = r0 ^ r1
            if (r0 == 0) goto L6f
            a6.j r0 = r10.K     // Catch: java.lang.Throwable -> L84
            r0.p(r11, r8, r12)     // Catch: java.lang.Throwable -> L84
        L66:
            monitor-exit(r7)
            if (r13 == 0) goto L6e
            a6.j r11 = r10.K
            r11.flush()
        L6e:
            return r9
        L6f:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L84
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L84
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L84
            throw r12     // Catch: java.lang.Throwable -> L84
        L7b:
            a6.a r11 = new a6.a     // Catch: java.lang.Throwable -> L81
            r11.<init>()     // Catch: java.lang.Throwable -> L81
            throw r11     // Catch: java.lang.Throwable -> L81
        L81:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            throw r11     // Catch: java.lang.Throwable -> L84
        L84:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.f.X0(int, java.util.List, boolean):a6.i");
    }

    @n6.d
    public final a6.i Y0(@n6.d List<a6.c> list, boolean z6) throws IOException {
        l0.p(list, "requestHeaders");
        return X0(0, list, z6);
    }

    @n6.d
    public final String Z() {
        return this.f307n;
    }

    public final synchronized int Z0() {
        return this.f306m.size();
    }

    public final void a1(int i7, @n6.d o oVar, int i8, boolean z6) throws IOException {
        l0.p(oVar, "source");
        i6.m mVar = new i6.m();
        long j7 = i8;
        oVar.G0(j7);
        oVar.l0(mVar, j7);
        w5.c cVar = this.f313t;
        String str = this.f307n + '[' + i7 + "] onData";
        cVar.n(new C0011f(str, true, str, true, this, i7, mVar, i8, z6), 0L);
    }

    public final void b1(int i7, @n6.d List<a6.c> list, boolean z6) {
        l0.p(list, "requestHeaders");
        w5.c cVar = this.f313t;
        String str = this.f307n + '[' + i7 + "] onHeaders";
        cVar.n(new g(str, true, str, true, this, i7, list, z6), 0L);
    }

    public final void c1(int i7, @n6.d List<a6.c> list) {
        l0.p(list, "requestHeaders");
        synchronized (this) {
            if (this.M.contains(Integer.valueOf(i7))) {
                y1(i7, a6.b.PROTOCOL_ERROR);
                return;
            }
            this.M.add(Integer.valueOf(i7));
            w5.c cVar = this.f313t;
            String str = this.f307n + '[' + i7 + "] onRequest";
            cVar.n(new h(str, true, str, true, this, i7, list), 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        R(a6.b.NO_ERROR, a6.b.CANCEL, null);
    }

    public final int d0() {
        return this.f308o;
    }

    public final void d1(int i7, @n6.d a6.b bVar) {
        l0.p(bVar, "errorCode");
        w5.c cVar = this.f313t;
        String str = this.f307n + '[' + i7 + "] onReset";
        cVar.n(new i(str, true, str, true, this, i7, bVar), 0L);
    }

    @n6.d
    public final a6.i e1(int i7, @n6.d List<a6.c> list, boolean z6) throws IOException {
        l0.p(list, "requestHeaders");
        if ((!this.f304k) == true) {
            return X0(i7, list, z6);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    @n6.d
    public final d f0() {
        return this.f305l;
    }

    public final boolean f1(int i7) {
        return i7 != 0 && (i7 & 1) == 0;
    }

    public final void flush() throws IOException {
        this.K.flush();
    }

    @n6.e
    public final synchronized a6.i g1(int i7) {
        a6.i remove;
        remove = this.f306m.remove(Integer.valueOf(i7));
        notifyAll();
        return remove;
    }

    public final void h1() {
        synchronized (this) {
            long j7 = this.f319z;
            long j8 = this.f318y;
            if (j7 < j8) {
                return;
            }
            this.f318y = j8 + 1;
            this.C = System.nanoTime() + ((long) S);
            m2 m2Var = m2.f17815a;
            w5.c cVar = this.f312s;
            String str = this.f307n + " ping";
            cVar.n(new j(str, true, str, true, this), 0L);
        }
    }

    public final void i1(int i7) {
        this.f308o = i7;
    }

    public final void j1(int i7) {
        this.f309p = i7;
    }

    public final void k1(@n6.d m mVar) {
        l0.p(mVar, "<set-?>");
        this.E = mVar;
    }

    public final void l1(@n6.d m mVar) throws IOException {
        l0.p(mVar, "settings");
        synchronized (this.K) {
            synchronized (this) {
                if (this.f310q) {
                    throw new a6.a();
                }
                this.D.j(mVar);
                m2 m2Var = m2.f17815a;
            }
            this.K.u(mVar);
        }
    }

    public final void m1(@n6.d a6.b bVar) throws IOException {
        l0.p(bVar, "statusCode");
        synchronized (this.K) {
            synchronized (this) {
                if (this.f310q) {
                    return;
                }
                this.f310q = true;
                int i7 = this.f308o;
                m2 m2Var = m2.f17815a;
                this.K.i(i7, bVar, s5.d.f16651a);
            }
        }
    }

    @s4.i
    public final void n1() throws IOException {
        q1(this, false, null, 3, null);
    }

    @s4.i
    public final void o1(boolean z6) throws IOException {
        q1(this, z6, null, 2, null);
    }

    public final int p0() {
        return this.f309p;
    }

    @s4.i
    public final void p1(boolean z6, @n6.d w5.d dVar) throws IOException {
        l0.p(dVar, "taskRunner");
        if (z6) {
            this.K.b();
            this.K.u(this.D);
            if (this.D.e() != 65535) {
                this.K.A(0, r7 - 65535);
            }
        }
        w5.c j7 = dVar.j();
        String str = this.f307n;
        j7.n(new c.b(this.L, str, true, str, true), 0L);
    }

    @n6.d
    public final m q0() {
        return this.D;
    }

    public final synchronized void r1(long j7) {
        long j8 = this.F + j7;
        this.F = j8;
        long j9 = j8 - this.G;
        if (j9 >= this.D.e() / 2) {
            z1(0, j9);
            this.G += j9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0031, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0033, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.K.l());
        r6 = r2;
        r8.H += r6;
        r4 = v3.m2.f17815a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s1(int r9, boolean r10, @n6.e i6.m r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            a6.j r12 = r8.K
            r12.d(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6c
            monitor-enter(r8)
        L12:
            long r4 = r8.H     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            long r6 = r8.I     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L32
            java.util.Map<java.lang.Integer, a6.i> r2 = r8.f306m     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            throw r9     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
        L32:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L5b
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L5b
            a6.j r4 = r8.K     // Catch: java.lang.Throwable -> L5b
            int r4 = r4.l()     // Catch: java.lang.Throwable -> L5b
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L5b
            long r4 = r8.H     // Catch: java.lang.Throwable -> L5b
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L5b
            long r4 = r4 + r6
            r8.H = r4     // Catch: java.lang.Throwable -> L5b
            v3.m2 r4 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r8)
            long r12 = r12 - r6
            a6.j r4 = r8.K
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.d(r5, r9, r11, r2)
            goto Ld
        L5b:
            r9 = move-exception
            goto L6a
        L5d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5b
            r9.interrupt()     // Catch: java.lang.Throwable -> L5b
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5b
            r9.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r9     // Catch: java.lang.Throwable -> L5b
        L6a:
            monitor-exit(r8)
            throw r9
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.f.s1(int, boolean, i6.m, long):void");
    }

    public final void t1(int i7, boolean z6, @n6.d List<a6.c> list) throws IOException {
        l0.p(list, "alternating");
        this.K.k(z6, i7, list);
    }

    public final void u1() throws InterruptedException {
        synchronized (this) {
            this.A++;
        }
        v1(false, 3, 1330343787);
    }

    public final void v1(boolean z6, int i7, int i8) {
        try {
            this.K.m(z6, i7, i8);
        } catch (IOException e7) {
            S(e7);
        }
    }

    @n6.d
    public final m w0() {
        return this.E;
    }

    public final void w1() throws InterruptedException {
        u1();
        Q();
    }

    public final void x1(int i7, @n6.d a6.b bVar) throws IOException {
        l0.p(bVar, "statusCode");
        this.K.t(i7, bVar);
    }

    public final void y1(int i7, @n6.d a6.b bVar) {
        l0.p(bVar, "errorCode");
        w5.c cVar = this.f312s;
        String str = this.f307n + '[' + i7 + "] writeSynReset";
        cVar.n(new k(str, true, str, true, this, i7, bVar), 0L);
    }

    public final long z0() {
        return this.G;
    }

    public final void z1(int i7, long j7) {
        w5.c cVar = this.f312s;
        String str = this.f307n + '[' + i7 + "] windowUpdate";
        cVar.n(new l(str, true, str, true, this, i7, j7), 0L);
    }
}
