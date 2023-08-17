package i6;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import v3.b1;
import v3.m2;
/* loaded from: classes.dex */
public final class g0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m f11189a = new m();

    /* renamed from: b  reason: collision with root package name */
    public boolean f11190b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11191c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11192d;
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public m0 f11193e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final m0 f11194f;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public final o0 f11195g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11196h;

    /* loaded from: classes.dex */
    public static final class a implements m0 {

        /* renamed from: k  reason: collision with root package name */
        public final q0 f11197k = new q0();

        public a() {
        }

        @Override // i6.m0
        @n6.d
        public q0 c() {
            return this.f11197k;
        }

        @Override // i6.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (g0.this.g()) {
                if (g0.this.k()) {
                    return;
                }
                m0 i7 = g0.this.i();
                if (i7 == null) {
                    if (g0.this.l() && g0.this.g().a1() > 0) {
                        throw new IOException("source is closed");
                    }
                    g0.this.o(true);
                    m g7 = g0.this.g();
                    if (g7 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    g7.notifyAll();
                    i7 = null;
                }
                m2 m2Var = m2.f17815a;
                if (i7 != null) {
                    g0 g0Var = g0.this;
                    q0 c7 = i7.c();
                    q0 c8 = g0Var.q().c();
                    long j7 = c7.j();
                    long a7 = q0.f11268e.a(c8.j(), c7.j());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    c7.i(a7, timeUnit);
                    if (!c7.f()) {
                        if (c8.f()) {
                            c7.e(c8.d());
                        }
                        try {
                            i7.close();
                            c7.i(j7, timeUnit);
                            if (c8.f()) {
                                c7.a();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            c7.i(j7, TimeUnit.NANOSECONDS);
                            if (c8.f()) {
                                c7.a();
                            }
                            throw th;
                        }
                    }
                    long d7 = c7.d();
                    if (c8.f()) {
                        c7.e(Math.min(c7.d(), c8.d()));
                    }
                    try {
                        i7.close();
                        c7.i(j7, timeUnit);
                        if (c8.f()) {
                            c7.e(d7);
                        }
                    } catch (Throwable th2) {
                        c7.i(j7, TimeUnit.NANOSECONDS);
                        if (c8.f()) {
                            c7.e(d7);
                        }
                        throw th2;
                    }
                }
            }
        }

        @Override // i6.m0, java.io.Flushable
        public void flush() {
            m0 i7;
            synchronized (g0.this.g()) {
                if ((!g0.this.k()) != true) {
                    throw new IllegalStateException("closed".toString());
                }
                if (g0.this.h()) {
                    throw new IOException("canceled");
                }
                i7 = g0.this.i();
                if (i7 == null) {
                    if (g0.this.l() && g0.this.g().a1() > 0) {
                        throw new IOException("source is closed");
                    }
                    i7 = null;
                }
                m2 m2Var = m2.f17815a;
            }
            if (i7 != null) {
                g0 g0Var = g0.this;
                q0 c7 = i7.c();
                q0 c8 = g0Var.q().c();
                long j7 = c7.j();
                long a7 = q0.f11268e.a(c8.j(), c7.j());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                c7.i(a7, timeUnit);
                if (!c7.f()) {
                    if (c8.f()) {
                        c7.e(c8.d());
                    }
                    try {
                        i7.flush();
                        c7.i(j7, timeUnit);
                        if (c8.f()) {
                            c7.a();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        c7.i(j7, TimeUnit.NANOSECONDS);
                        if (c8.f()) {
                            c7.a();
                        }
                        throw th;
                    }
                }
                long d7 = c7.d();
                if (c8.f()) {
                    c7.e(Math.min(c7.d(), c8.d()));
                }
                try {
                    i7.flush();
                    c7.i(j7, timeUnit);
                    if (c8.f()) {
                        c7.e(d7);
                    }
                } catch (Throwable th2) {
                    c7.i(j7, TimeUnit.NANOSECONDS);
                    if (c8.f()) {
                        c7.e(d7);
                    }
                    throw th2;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
            r1 = v3.m2.f17815a;
         */
        @Override // i6.m0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void w(@n6.d i6.m r13, long r14) {
            /*
                Method dump skipped, instructions count: 319
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i6.g0.a.w(i6.m, long):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements o0 {

        /* renamed from: k  reason: collision with root package name */
        public final q0 f11199k = new q0();

        public b() {
        }

        @Override // i6.o0
        @n6.d
        public q0 c() {
            return this.f11199k;
        }

        @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (g0.this.g()) {
                g0.this.p(true);
                m g7 = g0.this.g();
                if (g7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                g7.notifyAll();
                m2 m2Var = m2.f17815a;
            }
        }

        @Override // i6.o0
        public long l0(@n6.d m mVar, long j7) {
            u4.l0.p(mVar, "sink");
            synchronized (g0.this.g()) {
                if ((!g0.this.l()) == true) {
                    if (g0.this.h()) {
                        throw new IOException("canceled");
                    }
                    while (g0.this.g().a1() == 0) {
                        if (g0.this.k()) {
                            return -1L;
                        }
                        this.f11199k.k(g0.this.g());
                        if (g0.this.h()) {
                            throw new IOException("canceled");
                        }
                    }
                    long l02 = g0.this.g().l0(mVar, j7);
                    m g7 = g0.this.g();
                    if (g7 != null) {
                        g7.notifyAll();
                        return l02;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public g0(long j7) {
        this.f11196h = j7;
        if (j7 >= 1) {
            this.f11194f = new a();
            this.f11195g = new b();
            return;
        }
        throw new IllegalArgumentException(("maxBufferSize < 1: " + j7).toString());
    }

    @s4.h(name = "-deprecated_sink")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "sink", imports = {}))
    public final m0 a() {
        return this.f11194f;
    }

    @s4.h(name = "-deprecated_source")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "source", imports = {}))
    public final o0 b() {
        return this.f11195g;
    }

    public final void d() {
        synchronized (this.f11189a) {
            this.f11190b = true;
            this.f11189a.l();
            m mVar = this.f11189a;
            if (mVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
            mVar.notifyAll();
            m2 m2Var = m2.f17815a;
        }
    }

    public final void e(@n6.d m0 m0Var) throws IOException {
        boolean z6;
        m mVar;
        u4.l0.p(m0Var, "sink");
        while (true) {
            synchronized (this.f11189a) {
                if (!(this.f11193e == null)) {
                    throw new IllegalStateException("sink already folded".toString());
                }
                if (this.f11190b) {
                    this.f11193e = m0Var;
                    throw new IOException("canceled");
                } else if (this.f11189a.c0()) {
                    this.f11192d = true;
                    this.f11193e = m0Var;
                    return;
                } else {
                    z6 = this.f11191c;
                    mVar = new m();
                    m mVar2 = this.f11189a;
                    mVar.w(mVar2, mVar2.a1());
                    m mVar3 = this.f11189a;
                    if (mVar3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    mVar3.notifyAll();
                    m2 m2Var = m2.f17815a;
                }
            }
            try {
                m0Var.w(mVar, mVar.a1());
                if (z6) {
                    m0Var.close();
                } else {
                    m0Var.flush();
                }
            } catch (Throwable th) {
                synchronized (this.f11189a) {
                    this.f11192d = true;
                    m mVar4 = this.f11189a;
                    if (mVar4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    mVar4.notifyAll();
                    m2 m2Var2 = m2.f17815a;
                    throw th;
                }
            }
        }
    }

    public final void f(m0 m0Var, t4.l<? super m0, m2> lVar) {
        q0 c7 = m0Var.c();
        q0 c8 = q().c();
        long j7 = c7.j();
        long a7 = q0.f11268e.a(c8.j(), c7.j());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        c7.i(a7, timeUnit);
        if (!c7.f()) {
            if (c8.f()) {
                c7.e(c8.d());
            }
            try {
                lVar.O(m0Var);
                u4.i0.d(1);
                c7.i(j7, timeUnit);
                if (c8.f()) {
                    c7.a();
                }
                u4.i0.c(1);
                return;
            } catch (Throwable th) {
                u4.i0.d(1);
                c7.i(j7, TimeUnit.NANOSECONDS);
                if (c8.f()) {
                    c7.a();
                }
                u4.i0.c(1);
                throw th;
            }
        }
        long d7 = c7.d();
        if (c8.f()) {
            c7.e(Math.min(c7.d(), c8.d()));
        }
        try {
            lVar.O(m0Var);
            u4.i0.d(1);
            c7.i(j7, timeUnit);
            if (c8.f()) {
                c7.e(d7);
            }
            u4.i0.c(1);
        } catch (Throwable th2) {
            u4.i0.d(1);
            c7.i(j7, TimeUnit.NANOSECONDS);
            if (c8.f()) {
                c7.e(d7);
            }
            u4.i0.c(1);
            throw th2;
        }
    }

    @n6.d
    public final m g() {
        return this.f11189a;
    }

    public final boolean h() {
        return this.f11190b;
    }

    @n6.e
    public final m0 i() {
        return this.f11193e;
    }

    public final long j() {
        return this.f11196h;
    }

    public final boolean k() {
        return this.f11191c;
    }

    public final boolean l() {
        return this.f11192d;
    }

    public final void m(boolean z6) {
        this.f11190b = z6;
    }

    public final void n(@n6.e m0 m0Var) {
        this.f11193e = m0Var;
    }

    public final void o(boolean z6) {
        this.f11191c = z6;
    }

    public final void p(boolean z6) {
        this.f11192d = z6;
    }

    @s4.h(name = "sink")
    @n6.d
    public final m0 q() {
        return this.f11194f;
    }

    @s4.h(name = "source")
    @n6.d
    public final o0 r() {
        return this.f11195g;
    }
}
