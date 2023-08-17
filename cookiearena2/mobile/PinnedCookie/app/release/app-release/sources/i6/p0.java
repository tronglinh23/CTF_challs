package i6;

import java.io.IOException;
import java.io.InterruptedIOException;
import kotlinx.coroutines.x1;
import v3.m2;
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public long f11256a;

    /* renamed from: b  reason: collision with root package name */
    public long f11257b;

    /* renamed from: c  reason: collision with root package name */
    public long f11258c;

    /* renamed from: d  reason: collision with root package name */
    public long f11259d;

    /* loaded from: classes.dex */
    public static final class a extends r {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ m0 f11261m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var, m0 m0Var2) {
            super(m0Var2);
            this.f11261m = m0Var;
        }

        @Override // i6.r, i6.m0
        public void w(@n6.d m mVar, long j7) throws IOException {
            u4.l0.p(mVar, "source");
            while (j7 > 0) {
                try {
                    long j8 = p0.this.j(j7);
                    super.w(mVar, j8);
                    j7 -= j8;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends s {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ o0 f11263m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o0 o0Var, o0 o0Var2) {
            super(o0Var2);
            this.f11263m = o0Var;
        }

        @Override // i6.s, i6.o0
        public long l0(@n6.d m mVar, long j7) {
            u4.l0.p(mVar, "sink");
            try {
                return super.l0(mVar, p0.this.j(j7));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    public p0(long j7) {
        this.f11259d = j7;
        this.f11257b = 8192L;
        this.f11258c = 262144L;
    }

    public static /* synthetic */ void e(p0 p0Var, long j7, long j8, long j9, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j8 = p0Var.f11257b;
        }
        long j10 = j8;
        if ((i7 & 4) != 0) {
            j9 = p0Var.f11258c;
        }
        p0Var.d(j7, j10, j9);
    }

    public final long a(long j7, long j8) {
        if (this.f11256a == 0) {
            return j8;
        }
        long max = Math.max(this.f11259d - j7, 0L);
        long g7 = this.f11258c - g(max);
        if (g7 >= j8) {
            this.f11259d = j7 + max + f(j8);
            return j8;
        }
        long j9 = this.f11257b;
        if (g7 >= j9) {
            this.f11259d = j7 + f(this.f11258c);
            return g7;
        }
        long min = Math.min(j9, j8);
        long f7 = max + f(min - this.f11258c);
        if (f7 == 0) {
            this.f11259d = j7 + f(this.f11258c);
            return min;
        }
        return -f7;
    }

    @s4.i
    public final void b(long j7) {
        e(this, j7, 0L, 0L, 6, null);
    }

    @s4.i
    public final void c(long j7, long j8) {
        e(this, j7, j8, 0L, 4, null);
    }

    @s4.i
    public final void d(long j7, long j8, long j9) {
        synchronized (this) {
            if (!(j7 >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(j8 > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(j9 >= j8)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f11256a = j7;
            this.f11257b = j8;
            this.f11258c = j9;
            notifyAll();
            m2 m2Var = m2.f17815a;
        }
    }

    public final long f(long j7) {
        return (j7 * 1000000000) / this.f11256a;
    }

    public final long g(long j7) {
        return (j7 * this.f11256a) / 1000000000;
    }

    @n6.d
    public final m0 h(@n6.d m0 m0Var) {
        u4.l0.p(m0Var, "sink");
        return new a(m0Var, m0Var);
    }

    @n6.d
    public final o0 i(@n6.d o0 o0Var) {
        u4.l0.p(o0Var, "source");
        return new b(o0Var, o0Var);
    }

    public final long j(long j7) {
        long a7;
        if (j7 > 0) {
            synchronized (this) {
                while (true) {
                    a7 = a(System.nanoTime(), j7);
                    if (a7 < 0) {
                        k(-a7);
                    }
                }
            }
            return a7;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void k(long j7) {
        long j8 = j7 / x1.f13167e;
        wait(j8, (int) (j7 - (x1.f13167e * j8)));
    }

    public p0() {
        this(System.nanoTime());
    }
}
