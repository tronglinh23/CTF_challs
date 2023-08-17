package kotlinx.coroutines.internal;

import kotlinx.coroutines.c2;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.p1;
import v3.m2;
/* loaded from: classes.dex */
public final class s extends kotlinx.coroutines.o0 implements Runnable, kotlinx.coroutines.e1 {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final kotlinx.coroutines.o0 f12844m;

    /* renamed from: n  reason: collision with root package name */
    public final int f12845n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e1 f12846o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public final a0<Runnable> f12847p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public final Object f12848q;
    private volatile int runningWorkers;

    public s(@n6.d kotlinx.coroutines.o0 o0Var, int i7) {
        this.f12844m = o0Var;
        this.f12845n = i7;
        kotlinx.coroutines.e1 e1Var = o0Var instanceof kotlinx.coroutines.e1 ? (kotlinx.coroutines.e1) o0Var : null;
        this.f12846o = e1Var == null ? kotlinx.coroutines.b1.a() : e1Var;
        this.f12847p = new a0<>(false);
        this.f12848q = new Object();
    }

    @Override // kotlinx.coroutines.e1
    @v3.k(level = v3.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @n6.e
    public Object O0(long j7, @n6.d e4.d<? super m2> dVar) {
        return this.f12846o.O0(j7, dVar);
    }

    @Override // kotlinx.coroutines.o0
    public void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        if (a1(runnable) || !c1()) {
            return;
        }
        this.f12844m.V0(this, this);
    }

    @Override // kotlinx.coroutines.o0
    @i2
    public void W0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        if (a1(runnable) || !c1()) {
            return;
        }
        this.f12844m.W0(this, this);
    }

    @Override // kotlinx.coroutines.o0
    @c2
    @n6.d
    public kotlinx.coroutines.o0 Y0(int i7) {
        t.a(i7);
        return i7 >= this.f12845n ? this : super.Y0(i7);
    }

    public final boolean a1(Runnable runnable) {
        this.f12847p.a(runnable);
        return this.runningWorkers >= this.f12845n;
    }

    public final void b1(Runnable runnable, t4.a<m2> aVar) {
        if (!a1(runnable) && c1()) {
            aVar.n();
        }
    }

    public final boolean c1() {
        synchronized (this.f12848q) {
            if (this.runningWorkers >= this.f12845n) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // kotlinx.coroutines.e1
    public void m(long j7, @n6.d kotlinx.coroutines.q<? super m2> qVar) {
        this.f12846o.m(j7, qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.f12848q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.f12847p.c() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = v3.m2.f17815a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.internal.a0<java.lang.Runnable> r2 = r4.f12847p
            java.lang.Object r2 = r2.g()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            e4.i r3 = e4.i.f8770k
            kotlinx.coroutines.r0.b(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.o0 r2 = r4.f12844m
            boolean r2 = r2.X0(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.o0 r0 = r4.f12844m
            r0.V0(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f12848q
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.a0<java.lang.Runnable> r2 = r4.f12847p     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            v3.m2 r2 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.s.run():void");
    }

    @Override // kotlinx.coroutines.e1
    @n6.d
    public p1 z0(long j7, @n6.d Runnable runnable, @n6.d e4.g gVar) {
        return this.f12846o.z0(j7, runnable, gVar);
    }
}
