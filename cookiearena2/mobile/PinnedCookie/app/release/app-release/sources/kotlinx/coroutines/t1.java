package kotlinx.coroutines;

import androidx.appcompat.graphics.drawable.a;
/* loaded from: classes.dex */
public abstract class t1 extends o0 {

    /* renamed from: m  reason: collision with root package name */
    public long f13113m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13114n;
    @n6.e

    /* renamed from: o  reason: collision with root package name */
    public kotlinx.coroutines.internal.a<j1<?>> f13115o;

    public static /* synthetic */ void b1(t1 t1Var, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        t1Var.a1(z6);
    }

    public static /* synthetic */ void g1(t1 t1Var, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        t1Var.f1(z6);
    }

    @Override // kotlinx.coroutines.o0
    @n6.d
    public final o0 Y0(int i7) {
        kotlinx.coroutines.internal.t.a(i7);
        return this;
    }

    public final void a1(boolean z6) {
        long c12 = this.f13113m - c1(z6);
        this.f13113m = c12;
        if (c12 <= 0 && this.f13114n) {
            n1();
        }
    }

    public final long c1(boolean z6) {
        if (z6) {
            return a.c.M;
        }
        return 1L;
    }

    public final boolean d() {
        return this.f13113m > 0;
    }

    public final void d1(@n6.d j1<?> j1Var) {
        kotlinx.coroutines.internal.a<j1<?>> aVar = this.f13115o;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f13115o = aVar;
        }
        aVar.a(j1Var);
    }

    public long e1() {
        kotlinx.coroutines.internal.a<j1<?>> aVar = this.f13115o;
        return (aVar == null || aVar.d()) ? Long.MAX_VALUE : 0L;
    }

    public final void f1(boolean z6) {
        this.f13113m += c1(z6);
        if (z6) {
            return;
        }
        this.f13114n = true;
    }

    public boolean h1() {
        return j1();
    }

    public final boolean i1() {
        return this.f13113m >= c1(true);
    }

    public final boolean j1() {
        kotlinx.coroutines.internal.a<j1<?>> aVar = this.f13115o;
        if (aVar != null) {
            return aVar.d();
        }
        return true;
    }

    public long k1() {
        return !l1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean l1() {
        j1<?> e7;
        kotlinx.coroutines.internal.a<j1<?>> aVar = this.f13115o;
        if (aVar == null || (e7 = aVar.e()) == null) {
            return false;
        }
        e7.run();
        return true;
    }

    public boolean m1() {
        return false;
    }

    public void n1() {
    }
}
