package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class x3 implements t4.l<Throwable, v3.m2> {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13172n = AtomicIntegerFieldUpdater.newUpdater(x3.class, "_state");
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final n2 f13173k;
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public p1 f13175m;
    @n6.d
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: l  reason: collision with root package name */
    public final Thread f13174l = Thread.currentThread();

    public x3(@n6.d n2 n2Var) {
        this.f13173k = n2Var;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
        f(th);
        return v3.m2.f17815a;
    }

    public final void b() {
        while (true) {
            int i7 = this._state;
            if (i7 != 0) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        d(i7);
                        throw new v3.y();
                    }
                }
            } else if (f13172n.compareAndSet(this, i7, 1)) {
                p1 p1Var = this.f13175m;
                if (p1Var != null) {
                    p1Var.j();
                    return;
                }
                return;
            }
        }
    }

    public final Void d(int i7) {
        throw new IllegalStateException(("Illegal state " + i7).toString());
    }

    public void f(@n6.e Throwable th) {
        int i7;
        do {
            i7 = this._state;
            if (i7 != 0) {
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                    return;
                }
                d(i7);
                throw new v3.y();
            }
        } while (!f13172n.compareAndSet(this, i7, 2));
        this.f13174l.interrupt();
        this._state = 3;
    }

    public final void g() {
        int i7;
        this.f13175m = this.f13173k.p0(true, true, this);
        do {
            i7 = this._state;
            if (i7 != 0) {
                if (i7 == 2 || i7 == 3) {
                    return;
                }
                d(i7);
                throw new v3.y();
            }
        } while (!f13172n.compareAndSet(this, i7, 0));
    }
}
