package r5;

import c6.j;
import i6.m0;
import i6.o0;
import i6.p;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import r5.d0;
import r5.f0;
import r5.u;
import u4.l0;
import u4.t1;
import u5.d;
import v3.b1;
import v3.m2;
import x3.l1;
/* loaded from: classes.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: q  reason: collision with root package name */
    public static final int f15751q = 201105;

    /* renamed from: r  reason: collision with root package name */
    public static final int f15752r = 0;

    /* renamed from: s  reason: collision with root package name */
    public static final int f15753s = 1;

    /* renamed from: t  reason: collision with root package name */
    public static final int f15754t = 2;

    /* renamed from: u  reason: collision with root package name */
    public static final b f15755u = new b(null);
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final u5.d f15756k;

    /* renamed from: l  reason: collision with root package name */
    public int f15757l;

    /* renamed from: m  reason: collision with root package name */
    public int f15758m;

    /* renamed from: n  reason: collision with root package name */
    public int f15759n;

    /* renamed from: o  reason: collision with root package name */
    public int f15760o;

    /* renamed from: p  reason: collision with root package name */
    public int f15761p;

    /* loaded from: classes.dex */
    public static final class a extends g0 {

        /* renamed from: m  reason: collision with root package name */
        public final i6.o f15762m;
        @n6.d

        /* renamed from: n  reason: collision with root package name */
        public final d.C0251d f15763n;

        /* renamed from: o  reason: collision with root package name */
        public final String f15764o;

        /* renamed from: p  reason: collision with root package name */
        public final String f15765p;

        /* renamed from: r5.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0230a extends i6.s {

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ o0 f15767m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0230a(o0 o0Var, o0 o0Var2) {
                super(o0Var2);
                this.f15767m = o0Var;
            }

            @Override // i6.s, i6.o0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                a.this.O().close();
                super.close();
            }
        }

        public a(@n6.d d.C0251d c0251d, @n6.e String str, @n6.e String str2) {
            l0.p(c0251d, "snapshot");
            this.f15763n = c0251d;
            this.f15764o = str;
            this.f15765p = str2;
            o0 d7 = c0251d.d(1);
            this.f15762m = i6.a0.d(new C0230a(d7, d7));
        }

        @Override // r5.g0
        @n6.d
        public i6.o I() {
            return this.f15762m;
        }

        @n6.d
        public final d.C0251d O() {
            return this.f15763n;
        }

        @Override // r5.g0
        public long i() {
            String str = this.f15765p;
            if (str != null) {
                return s5.d.e0(str, -1L);
            }
            return -1L;
        }

        @Override // r5.g0
        @n6.e
        public x k() {
            String str = this.f15764o;
            if (str != null) {
                return x.f16088i.d(str);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public final boolean a(@n6.d f0 f0Var) {
            l0.p(f0Var, "$this$hasVaryAll");
            return d(f0Var.d0()).contains("*");
        }

        @n6.d
        @s4.m
        public final String b(@n6.d v vVar) {
            l0.p(vVar, "url");
            return i6.p.f11252p.l(vVar.toString()).P().w();
        }

        public final int c(@n6.d i6.o oVar) throws IOException {
            l0.p(oVar, "source");
            try {
                long v02 = oVar.v0();
                String T = oVar.T();
                if (v02 >= 0 && v02 <= Integer.MAX_VALUE) {
                    if (!(T.length() > 0)) {
                        return (int) v02;
                    }
                }
                throw new IOException("expected an int but was \"" + v02 + T + i5.h0.f11093b);
            } catch (NumberFormatException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        public final Set<String> d(u uVar) {
            int size = uVar.size();
            TreeSet treeSet = null;
            for (int i7 = 0; i7 < size; i7++) {
                if (i5.b0.L1("Vary", uVar.i(i7), true)) {
                    String o6 = uVar.o(i7);
                    if (treeSet == null) {
                        treeSet = new TreeSet(i5.b0.T1(t1.f17486a));
                    }
                    for (String str : i5.c0.T4(o6, new char[]{','}, false, 0, 6, null)) {
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        treeSet.add(i5.c0.F5(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : l1.k();
        }

        public final u e(u uVar, u uVar2) {
            Set<String> d7 = d(uVar2);
            if (d7.isEmpty()) {
                return s5.d.f16652b;
            }
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i7 = 0; i7 < size; i7++) {
                String i8 = uVar.i(i7);
                if (d7.contains(i8)) {
                    aVar.b(i8, uVar.o(i7));
                }
            }
            return aVar.i();
        }

        @n6.d
        public final u f(@n6.d f0 f0Var) {
            l0.p(f0Var, "$this$varyHeaders");
            f0 w02 = f0Var.w0();
            l0.m(w02);
            return e(w02.O0().k(), f0Var.d0());
        }

        public final boolean g(@n6.d f0 f0Var, @n6.d u uVar, @n6.d d0 d0Var) {
            l0.p(f0Var, "cachedResponse");
            l0.p(uVar, "cachedRequest");
            l0.p(d0Var, "newRequest");
            Set<String> d7 = d(f0Var.d0());
            if ((d7 instanceof Collection) && d7.isEmpty()) {
                return true;
            }
            for (String str : d7) {
                if ((!l0.g(uVar.p(str), d0Var.j(str))) != false) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class d implements u5.b {

        /* renamed from: a  reason: collision with root package name */
        public final m0 f15781a;

        /* renamed from: b  reason: collision with root package name */
        public final m0 f15782b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15783c;

        /* renamed from: d  reason: collision with root package name */
        public final d.b f15784d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ c f15785e;

        /* loaded from: classes.dex */
        public static final class a extends i6.r {
            public a(m0 m0Var) {
                super(m0Var);
            }

            @Override // i6.r, i6.m0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (d.this.f15785e) {
                    if (d.this.d()) {
                        return;
                    }
                    d.this.e(true);
                    c cVar = d.this.f15785e;
                    cVar.Q(cVar.l() + 1);
                    super.close();
                    d.this.f15784d.b();
                }
            }
        }

        public d(@n6.d c cVar, d.b bVar) {
            l0.p(bVar, "editor");
            this.f15785e = cVar;
            this.f15784d = bVar;
            m0 f7 = bVar.f(1);
            this.f15781a = f7;
            this.f15782b = new a(f7);
        }

        @Override // u5.b
        @n6.d
        public m0 a() {
            return this.f15782b;
        }

        @Override // u5.b
        public void b() {
            synchronized (this.f15785e) {
                if (this.f15783c) {
                    return;
                }
                this.f15783c = true;
                c cVar = this.f15785e;
                cVar.O(cVar.k() + 1);
                s5.d.l(this.f15781a);
                try {
                    this.f15784d.a();
                } catch (IOException unused) {
                }
            }
        }

        public final boolean d() {
            return this.f15783c;
        }

        public final void e(boolean z6) {
            this.f15783c = z6;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Iterator<String>, v4.d {

        /* renamed from: k  reason: collision with root package name */
        public final Iterator<d.C0251d> f15787k;

        /* renamed from: l  reason: collision with root package name */
        public String f15788l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f15789m;

        public e() {
            this.f15787k = c.this.i().b1();
        }

        @Override // java.util.Iterator
        @n6.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public String next() {
            if (hasNext()) {
                String str = this.f15788l;
                l0.m(str);
                this.f15788l = null;
                this.f15789m = true;
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f15788l != null) {
                return true;
            }
            this.f15789m = false;
            while (this.f15787k.hasNext()) {
                try {
                    d.C0251d next = this.f15787k.next();
                    this.f15788l = i6.a0.d(next.d(0)).T();
                    n4.c.a(next, null);
                    return true;
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f15789m) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            this.f15787k.remove();
        }
    }

    public c(@n6.d File file, long j7, @n6.d b6.a aVar) {
        l0.p(file, "directory");
        l0.p(aVar, "fileSystem");
        this.f15756k = new u5.d(aVar, file, f15751q, 2, j7, w5.d.f18228h);
    }

    @n6.d
    @s4.m
    public static final String u(@n6.d v vVar) {
        return f15755u.b(vVar);
    }

    public final long A() {
        return this.f15756k.q0();
    }

    public final synchronized int C() {
        return this.f15759n;
    }

    @n6.e
    public final u5.b E(@n6.d f0 f0Var) {
        d.b bVar;
        l0.p(f0Var, "response");
        String m7 = f0Var.O0().m();
        if (y5.f.f18865a.a(f0Var.O0().m())) {
            try {
                I(f0Var.O0());
            } catch (IOException unused) {
            }
            return null;
        } else if ((!l0.g(m7, "GET")) == true) {
            return null;
        } else {
            b bVar2 = f15755u;
            if (bVar2.a(f0Var)) {
                return null;
            }
            C0231c c0231c = new C0231c(f0Var);
            try {
                bVar = u5.d.R(this.f15756k, bVar2.b(f0Var.O0().q()), 0L, 2, null);
                if (bVar != null) {
                    try {
                        c0231c.f(bVar);
                        return new d(this, bVar);
                    } catch (IOException unused2) {
                        b(bVar);
                        return null;
                    }
                }
                return null;
            } catch (IOException unused3) {
                bVar = null;
            }
        }
    }

    public final void I(@n6.d d0 d0Var) throws IOException {
        l0.p(d0Var, "request");
        this.f15756k.V0(f15755u.b(d0Var.q()));
    }

    public final synchronized int L() {
        return this.f15761p;
    }

    public final void O(int i7) {
        this.f15758m = i7;
    }

    public final void Q(int i7) {
        this.f15757l = i7;
    }

    public final long R() throws IOException {
        return this.f15756k.a1();
    }

    public final synchronized void S() {
        this.f15760o++;
    }

    public final synchronized void X(@n6.d u5.c cVar) {
        l0.p(cVar, "cacheStrategy");
        this.f15761p++;
        if (cVar.b() != null) {
            this.f15759n++;
        } else if (cVar.a() != null) {
            this.f15760o++;
        }
    }

    public final void Z(@n6.d f0 f0Var, @n6.d f0 f0Var2) {
        d.b bVar;
        l0.p(f0Var, "cached");
        l0.p(f0Var2, "network");
        C0231c c0231c = new C0231c(f0Var2);
        g0 A = f0Var.A();
        if (A == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        try {
            bVar = ((a) A).O().a();
            if (bVar != null) {
                try {
                    c0231c.f(bVar);
                    bVar.b();
                } catch (IOException unused) {
                    b(bVar);
                }
            }
        } catch (IOException unused2) {
            bVar = null;
        }
    }

    @s4.h(name = "-deprecated_directory")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "directory", imports = {}))
    public final File a() {
        return this.f15756k.d0();
    }

    public final void b(d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15756k.close();
    }

    public final void d() throws IOException {
        this.f15756k.L();
    }

    @n6.d
    public final Iterator<String> d0() throws IOException {
        return new e();
    }

    @s4.h(name = "directory")
    @n6.d
    public final File e() {
        return this.f15756k.d0();
    }

    public final void f() throws IOException {
        this.f15756k.S();
    }

    public final synchronized int f0() {
        return this.f15758m;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f15756k.flush();
    }

    @n6.e
    public final f0 h(@n6.d d0 d0Var) {
        l0.p(d0Var, "request");
        try {
            d.C0251d X = this.f15756k.X(f15755u.b(d0Var.q()));
            if (X != null) {
                try {
                    C0231c c0231c = new C0231c(X.d(0));
                    f0 d7 = c0231c.d(X);
                    if (c0231c.b(d0Var, d7)) {
                        return d7;
                    }
                    g0 A = d7.A();
                    if (A != null) {
                        s5.d.l(A);
                    }
                    return null;
                } catch (IOException unused) {
                    s5.d.l(X);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @n6.d
    public final u5.d i() {
        return this.f15756k;
    }

    public final int k() {
        return this.f15758m;
    }

    public final int l() {
        return this.f15757l;
    }

    public final synchronized int m() {
        return this.f15760o;
    }

    public final void p() throws IOException {
        this.f15756k.z0();
    }

    public final synchronized int p0() {
        return this.f15757l;
    }

    public final boolean t() {
        return this.f15756k.C0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@n6.d File file, long j7) {
        this(file, j7, b6.a.f7272a);
        l0.p(file, "directory");
    }

    /* renamed from: r5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0231c {

        /* renamed from: k  reason: collision with root package name */
        public static final String f15768k;

        /* renamed from: l  reason: collision with root package name */
        public static final String f15769l;

        /* renamed from: m  reason: collision with root package name */
        public static final a f15770m = new a(null);

        /* renamed from: a  reason: collision with root package name */
        public final String f15771a;

        /* renamed from: b  reason: collision with root package name */
        public final u f15772b;

        /* renamed from: c  reason: collision with root package name */
        public final String f15773c;

        /* renamed from: d  reason: collision with root package name */
        public final c0 f15774d;

        /* renamed from: e  reason: collision with root package name */
        public final int f15775e;

        /* renamed from: f  reason: collision with root package name */
        public final String f15776f;

        /* renamed from: g  reason: collision with root package name */
        public final u f15777g;

        /* renamed from: h  reason: collision with root package name */
        public final t f15778h;

        /* renamed from: i  reason: collision with root package name */
        public final long f15779i;

        /* renamed from: j  reason: collision with root package name */
        public final long f15780j;

        /* renamed from: r5.c$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(u4.w wVar) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            j.a aVar = c6.j.f8005e;
            sb.append(aVar.g().i());
            sb.append("-Sent-Millis");
            f15768k = sb.toString();
            f15769l = aVar.g().i() + "-Received-Millis";
        }

        public C0231c(@n6.d o0 o0Var) throws IOException {
            i0 i0Var;
            l0.p(o0Var, "rawSource");
            try {
                i6.o d7 = i6.a0.d(o0Var);
                this.f15771a = d7.T();
                this.f15773c = d7.T();
                u.a aVar = new u.a();
                int c7 = c.f15755u.c(d7);
                for (int i7 = 0; i7 < c7; i7++) {
                    aVar.f(d7.T());
                }
                this.f15772b = aVar.i();
                y5.k b7 = y5.k.f18886h.b(d7.T());
                this.f15774d = b7.f18887a;
                this.f15775e = b7.f18888b;
                this.f15776f = b7.f18889c;
                u.a aVar2 = new u.a();
                int c8 = c.f15755u.c(d7);
                for (int i8 = 0; i8 < c8; i8++) {
                    aVar2.f(d7.T());
                }
                String str = f15768k;
                String j7 = aVar2.j(str);
                String str2 = f15769l;
                String j8 = aVar2.j(str2);
                aVar2.l(str);
                aVar2.l(str2);
                this.f15779i = j7 != null ? Long.parseLong(j7) : 0L;
                this.f15780j = j8 != null ? Long.parseLong(j8) : 0L;
                this.f15777g = aVar2.i();
                if (a()) {
                    String T = d7.T();
                    if (!(T.length() > 0)) {
                        i b8 = i.f15951s1.b(d7.T());
                        List<Certificate> c9 = c(d7);
                        List<Certificate> c10 = c(d7);
                        if (!d7.c0()) {
                            i0Var = i0.f15973r.a(d7.T());
                        } else {
                            i0Var = i0.SSL_3_0;
                        }
                        this.f15778h = t.f16037e.c(i0Var, b8, c9, c10);
                    } else {
                        throw new IOException("expected \"\" but was \"" + T + i5.h0.f11093b);
                    }
                } else {
                    this.f15778h = null;
                }
            } finally {
                o0Var.close();
            }
        }

        public final boolean a() {
            return i5.b0.v2(this.f15771a, "https://", false, 2, null);
        }

        public final boolean b(@n6.d d0 d0Var, @n6.d f0 f0Var) {
            l0.p(d0Var, "request");
            l0.p(f0Var, "response");
            return l0.g(this.f15771a, d0Var.q().toString()) && l0.g(this.f15773c, d0Var.m()) && c.f15755u.g(f0Var, this.f15772b, d0Var);
        }

        public final List<Certificate> c(i6.o oVar) throws IOException {
            int c7 = c.f15755u.c(oVar);
            if (c7 == -1) {
                return x3.w.E();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c7);
                for (int i7 = 0; i7 < c7; i7++) {
                    String T = oVar.T();
                    i6.m mVar = new i6.m();
                    i6.p h7 = i6.p.f11252p.h(T);
                    l0.m(h7);
                    mVar.K(h7);
                    arrayList.add(certificateFactory.generateCertificate(mVar.S0()));
                }
                return arrayList;
            } catch (CertificateException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        @n6.d
        public final f0 d(@n6.d d.C0251d c0251d) {
            l0.p(c0251d, "snapshot");
            String d7 = this.f15777g.d("Content-Type");
            String d8 = this.f15777g.d("Content-Length");
            return new f0.a().E(new d0.a().B(this.f15771a).p(this.f15773c, null).o(this.f15772b).b()).B(this.f15774d).g(this.f15775e).y(this.f15776f).w(this.f15777g).b(new a(c0251d, d7, d8)).u(this.f15778h).F(this.f15779i).C(this.f15780j).c();
        }

        public final void e(i6.n nVar, List<? extends Certificate> list) throws IOException {
            try {
                nVar.J0(list.size()).e0(10);
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    byte[] encoded = list.get(i7).getEncoded();
                    p.a aVar = i6.p.f11252p;
                    l0.o(encoded, "bytes");
                    nVar.H0(p.a.p(aVar, encoded, 0, 0, 3, null).h()).e0(10);
                }
            } catch (CertificateEncodingException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        public final void f(@n6.d d.b bVar) throws IOException {
            l0.p(bVar, "editor");
            i6.n c7 = i6.a0.c(bVar.f(0));
            try {
                c7.H0(this.f15771a).e0(10);
                c7.H0(this.f15773c).e0(10);
                c7.J0(this.f15772b.size()).e0(10);
                int size = this.f15772b.size();
                for (int i7 = 0; i7 < size; i7++) {
                    c7.H0(this.f15772b.i(i7)).H0(": ").H0(this.f15772b.o(i7)).e0(10);
                }
                c7.H0(new y5.k(this.f15774d, this.f15775e, this.f15776f).toString()).e0(10);
                c7.J0(this.f15777g.size() + 2).e0(10);
                int size2 = this.f15777g.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    c7.H0(this.f15777g.i(i8)).H0(": ").H0(this.f15777g.o(i8)).e0(10);
                }
                c7.H0(f15768k).H0(": ").J0(this.f15779i).e0(10);
                c7.H0(f15769l).H0(": ").J0(this.f15780j).e0(10);
                if (a()) {
                    c7.e0(10);
                    t tVar = this.f15778h;
                    l0.m(tVar);
                    c7.H0(tVar.g().e()).e0(10);
                    e(c7, this.f15778h.m());
                    e(c7, this.f15778h.k());
                    c7.H0(this.f15778h.o().e()).e0(10);
                }
                m2 m2Var = m2.f17815a;
                n4.c.a(c7, null);
            } finally {
            }
        }

        public C0231c(@n6.d f0 f0Var) {
            l0.p(f0Var, "response");
            this.f15771a = f0Var.O0().q().toString();
            this.f15772b = c.f15755u.f(f0Var);
            this.f15773c = f0Var.O0().m();
            this.f15774d = f0Var.I0();
            this.f15775e = f0Var.L();
            this.f15776f = f0Var.q0();
            this.f15777g = f0Var.d0();
            this.f15778h = f0Var.Q();
            this.f15779i = f0Var.T0();
            this.f15780j = f0Var.M0();
        }
    }
}
