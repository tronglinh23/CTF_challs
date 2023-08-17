package i6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.x1;
import v3.a1;
import v3.m2;

/* loaded from: classes.dex */
public class k extends q0 {

    /* renamed from: i  reason: collision with root package name */
    public static final int f11219i = 65536;

    /* renamed from: j  reason: collision with root package name */
    public static final long f11220j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f11221k;

    /* renamed from: l  reason: collision with root package name */
    public static k f11222l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f11223m = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public boolean f11224f;

    /* renamed from: g  reason: collision with root package name */
    public k f11225g;

    /* renamed from: h  reason: collision with root package name */
    public long f11226h;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.e
        public final k c() throws InterruptedException {
            k kVar = k.f11222l;
            u4.l0.m(kVar);
            k kVar2 = kVar.f11225g;
            if (kVar2 == null) {
                long nanoTime = System.nanoTime();
                k.class.wait(k.f11220j);
                k kVar3 = k.f11222l;
                u4.l0.m(kVar3);
                if (kVar3.f11225g != null || System.nanoTime() - nanoTime < k.f11221k) {
                    return null;
                }
                return k.f11222l;
            }
            long y6 = kVar2.y(System.nanoTime());
            if (y6 > 0) {
                long j7 = y6 / x1.f13167e;
                k.class.wait(j7, (int) (y6 - (x1.f13167e * j7)));
                return null;
            }
            k kVar4 = k.f11222l;
            u4.l0.m(kVar4);
            kVar4.f11225g = kVar2.f11225g;
            kVar2.f11225g = null;
            return kVar2;
        }

        public final boolean d(k kVar) {
            synchronized (k.class) {
                for (k kVar2 = k.f11222l; kVar2 != null; kVar2 = kVar2.f11225g) {
                    if (kVar2.f11225g == kVar) {
                        kVar2.f11225g = kVar.f11225g;
                        kVar.f11225g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        public final void e(k kVar, long j7, boolean z6) {
            synchronized (k.class) {
                if (k.f11222l == null) {
                    k.f11222l = new k();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
                if (i7 != 0 && z6) {
                    kVar.f11226h = Math.min(j7, kVar.d() - nanoTime) + nanoTime;
                } else if (i7 != 0) {
                    kVar.f11226h = j7 + nanoTime;
                } else if (!z6) {
                    throw new AssertionError();
                } else {
                    kVar.f11226h = kVar.d();
                }
                long y6 = kVar.y(nanoTime);
                k kVar2 = k.f11222l;
                u4.l0.m(kVar2);
                while (kVar2.f11225g != null) {
                    k kVar3 = kVar2.f11225g;
                    u4.l0.m(kVar3);
                    if (y6 < kVar3.y(nanoTime)) {
                        break;
                    }
                    kVar2 = kVar2.f11225g;
                    u4.l0.m(kVar2);
                }
                kVar.f11225g = kVar2.f11225g;
                kVar2.f11225g = kVar;
                if (kVar2 == k.f11222l) {
                    k.class.notify();
                }
                m2 m2Var = m2.f17815a;
            }
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            k c7;
            while (true) {
                try {
                    synchronized (k.class) {
                        c7 = k.f11223m.c();
                        if (c7 == k.f11222l) {
                            k.f11222l = null;
                            return;
                        }
                        m2 m2Var = m2.f17815a;
                    }
                    if (c7 != null) {
                        c7.B();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements m0 {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ m0 f11228l;

        public c(m0 m0Var) {
            this.f11228l = m0Var;
        }

        @Override // i6.m0
        @n6.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public k c() {
            return k.this;
        }

        @Override // i6.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            k kVar = k.this;
            kVar.v();
            try {
                this.f11228l.close();
                m2 m2Var = m2.f17815a;
                if (kVar.w()) {
                    throw kVar.q(null);
                }
            } catch (IOException e7) {
                if (!kVar.w()) {
                    throw e7;
                }
                throw kVar.q(e7);
            } finally {
                kVar.w();
            }
        }

        @Override // i6.m0, java.io.Flushable
        public void flush() {
            k kVar = k.this;
            kVar.v();
            try {
                this.f11228l.flush();
                m2 m2Var = m2.f17815a;
                if (kVar.w()) {
                    throw kVar.q(null);
                }
            } catch (IOException e7) {
                if (!kVar.w()) {
                    throw e7;
                }
                throw kVar.q(e7);
            } finally {
                kVar.w();
            }
        }

        @n6.d
        public String toString() {
            return "AsyncTimeout.sink(" + this.f11228l + ')';
        }

        @Override // i6.m0
        public void w(@n6.d m mVar, long j7) {
            u4.l0.p(mVar, "source");
            j.e(mVar.a1(), 0L, j7);
            while (true) {
                long j8 = 0;
                if (j7 <= 0) {
                    return;
                }
                j0 j0Var = mVar.f11238k;
                u4.l0.m(j0Var);
                while (true) {
                    if (j8 >= 65536) {
                        break;
                    }
                    j8 += j0Var.f11214c - j0Var.f11213b;
                    if (j8 >= j7) {
                        j8 = j7;
                        break;
                    } else {
                        j0Var = j0Var.f11217f;
                        u4.l0.m(j0Var);
                    }
                }
                k kVar = k.this;
                kVar.v();
                try {
                    this.f11228l.w(mVar, j8);
                    m2 m2Var = m2.f17815a;
                    if (kVar.w()) {
                        throw kVar.q(null);
                    }
                    j7 -= j8;
                } catch (IOException e7) {
                    if (!kVar.w()) {
                        throw e7;
                    }
                    throw kVar.q(e7);
                } finally {
                    kVar.w();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements o0 {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o0 f11230l;

        public d(o0 o0Var) {
            this.f11230l = o0Var;
        }

        @Override // i6.o0
        @n6.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public k c() {
            return k.this;
        }

        @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            k kVar = k.this;
            kVar.v();
            try {
                this.f11230l.close();
                m2 m2Var = m2.f17815a;
                if (kVar.w()) {
                    throw kVar.q(null);
                }
            } catch (IOException e7) {
                if (!kVar.w()) {
                    throw e7;
                }
                throw kVar.q(e7);
            } finally {
                kVar.w();
            }
        }

        @Override // i6.o0
        public long l0(@n6.d m mVar, long j7) {
            u4.l0.p(mVar, "sink");
            k kVar = k.this;
            kVar.v();
            try {
                long l02 = this.f11230l.l0(mVar, j7);
                if (kVar.w()) {
                    throw kVar.q(null);
                }
                return l02;
            } catch (IOException e7) {
                if (kVar.w()) {
                    throw kVar.q(e7);
                }
                throw e7;
            } finally {
                kVar.w();
            }
        }

        @n6.d
        public String toString() {
            return "AsyncTimeout.source(" + this.f11230l + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f11220j = millis;
        f11221k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @n6.d
    public final o0 A(@n6.d o0 o0Var) {
        u4.l0.p(o0Var, "source");
        return new d(o0Var);
    }

    public void B() {
    }

    public final <T> T C(@n6.d t4.a<? extends T> aVar) {
        u4.l0.p(aVar, "block");
        v();
        try {
            try {
                T n7 = aVar.n();
                u4.i0.d(1);
                if (w()) {
                    throw q(null);
                }
                u4.i0.c(1);
                return n7;
            } catch (IOException e7) {
                if (w()) {
                    throw q(e7);
                }
                throw e7;
            }
        } catch (Throwable th) {
            u4.i0.d(1);
            w();
            u4.i0.c(1);
            throw th;
        }
    }

    @n6.d
    @a1
    public final IOException q(@n6.e IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        if ((!this.f11224f) != true) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long j7 = j();
        boolean f7 = f();
        if (j7 != 0 || f7) {
            this.f11224f = true;
            f11223m.e(this, j7, f7);
        }
    }

    public final boolean w() {
        if (this.f11224f) {
            this.f11224f = false;
            return f11223m.d(this);
        }
        return false;
    }

    @n6.d
    public IOException x(@n6.e IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long y(long j7) {
        return this.f11226h - j7;
    }

    @n6.d
    public final m0 z(@n6.d m0 m0Var) {
        u4.l0.p(m0Var, "sink");
        return new c(m0Var);
    }
}