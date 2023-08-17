package r5;

import i6.d0;
import i6.o0;
import i6.p;
import i6.q0;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import u4.l0;
/* loaded from: classes.dex */
public final class z implements Closeable {
    @n6.d

    /* renamed from: s  reason: collision with root package name */
    public static final i6.d0 f16113s;

    /* renamed from: t  reason: collision with root package name */
    public static final a f16114t = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public final i6.p f16115k;

    /* renamed from: l  reason: collision with root package name */
    public final i6.p f16116l;

    /* renamed from: m  reason: collision with root package name */
    public int f16117m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16118n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16119o;

    /* renamed from: p  reason: collision with root package name */
    public c f16120p;

    /* renamed from: q  reason: collision with root package name */
    public final i6.o f16121q;
    @n6.d

    /* renamed from: r  reason: collision with root package name */
    public final String f16122r;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        public final i6.d0 a() {
            return z.f16113s;
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Closeable {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final u f16123k;
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public final i6.o f16124l;

        public b(@n6.d u uVar, @n6.d i6.o oVar) {
            l0.p(uVar, "headers");
            l0.p(oVar, y0.c.f18717e);
            this.f16123k = uVar;
            this.f16124l = oVar;
        }

        @s4.h(name = y0.c.f18717e)
        @n6.d
        public final i6.o a() {
            return this.f16124l;
        }

        @s4.h(name = "headers")
        @n6.d
        public final u b() {
            return this.f16123k;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f16124l.close();
        }
    }

    /* loaded from: classes.dex */
    public final class c implements o0 {

        /* renamed from: k  reason: collision with root package name */
        public final q0 f16125k = new q0();

        public c() {
        }

        @Override // i6.o0
        @n6.d
        public q0 c() {
            return this.f16125k;
        }

        @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (l0.g(z.this.f16120p, this)) {
                z.this.f16120p = null;
            }
        }

        @Override // i6.o0
        public long l0(@n6.d i6.m mVar, long j7) {
            l0.p(mVar, "sink");
            if (!(j7 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            } else if (l0.g(z.this.f16120p, this)) {
                q0 c7 = z.this.f16121q.c();
                q0 q0Var = this.f16125k;
                long j8 = c7.j();
                long a7 = q0.f11268e.a(q0Var.j(), c7.j());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                c7.i(a7, timeUnit);
                if (!c7.f()) {
                    if (q0Var.f()) {
                        c7.e(q0Var.d());
                    }
                    try {
                        long i7 = z.this.i(j7);
                        long l02 = i7 == 0 ? -1L : z.this.f16121q.l0(mVar, i7);
                        c7.i(j8, timeUnit);
                        if (q0Var.f()) {
                            c7.a();
                        }
                        return l02;
                    } catch (Throwable th) {
                        c7.i(j8, TimeUnit.NANOSECONDS);
                        if (q0Var.f()) {
                            c7.a();
                        }
                        throw th;
                    }
                }
                long d7 = c7.d();
                if (q0Var.f()) {
                    c7.e(Math.min(c7.d(), q0Var.d()));
                }
                try {
                    long i8 = z.this.i(j7);
                    long l03 = i8 == 0 ? -1L : z.this.f16121q.l0(mVar, i8);
                    c7.i(j8, timeUnit);
                    if (q0Var.f()) {
                        c7.e(d7);
                    }
                    return l03;
                } catch (Throwable th2) {
                    c7.i(j8, TimeUnit.NANOSECONDS);
                    if (q0Var.f()) {
                        c7.e(d7);
                    }
                    throw th2;
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    static {
        d0.a aVar = i6.d0.f11169n;
        p.a aVar2 = i6.p.f11252p;
        f16113s = aVar.d(aVar2.l("\r\n"), aVar2.l("--"), aVar2.l(" "), aVar2.l("\t"));
    }

    public z(@n6.d i6.o oVar, @n6.d String str) throws IOException {
        l0.p(oVar, "source");
        l0.p(str, "boundary");
        this.f16121q = oVar;
        this.f16122r = str;
        this.f16115k = new i6.m().H0("--").H0(str).x();
        this.f16116l = new i6.m().H0("\r\n--").H0(str).x();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f16118n) {
            return;
        }
        this.f16118n = true;
        this.f16120p = null;
        this.f16121q.close();
    }

    @s4.h(name = "boundary")
    @n6.d
    public final String h() {
        return this.f16122r;
    }

    public final long i(long j7) {
        this.f16121q.G0(this.f16116l.c0());
        long r6 = this.f16121q.j().r(this.f16116l);
        return r6 == -1 ? Math.min(j7, (this.f16121q.j().a1() - this.f16116l.c0()) + 1) : Math.min(j7, r6);
    }

    @n6.e
    public final b k() throws IOException {
        if ((!this.f16118n) != true) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f16119o) {
            return null;
        }
        if (this.f16117m == 0 && this.f16121q.n0(0L, this.f16115k)) {
            this.f16121q.skip(this.f16115k.c0());
        } else {
            while (true) {
                long i7 = i(8192L);
                if (i7 == 0) {
                    break;
                }
                this.f16121q.skip(i7);
            }
            this.f16121q.skip(this.f16116l.c0());
        }
        boolean z6 = false;
        while (true) {
            int g02 = this.f16121q.g0(f16113s);
            if (g02 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (g02 == 0) {
                this.f16117m++;
                u b7 = new z5.a(this.f16121q).b();
                c cVar = new c();
                this.f16120p = cVar;
                return new b(b7, i6.a0.d(cVar));
            } else if (g02 == 1) {
                if (z6) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.f16117m != 0) {
                    this.f16119o = true;
                    return null;
                }
                throw new ProtocolException("expected at least 1 part");
            } else if (g02 == 2 || g02 == 3) {
                z6 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(@n6.d r5.g0 r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            u4.l0.p(r3, r0)
            i6.o r0 = r3.I()
            r5.x r3 = r3.k()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.i(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.z.<init>(r5.g0):void");
    }
}
