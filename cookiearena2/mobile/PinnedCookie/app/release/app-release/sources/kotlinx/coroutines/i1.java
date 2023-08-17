package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class i1<T> extends kotlinx.coroutines.internal.n0<T> {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12754n = AtomicIntegerFieldUpdater.newUpdater(i1.class, "_decision");
    @n6.d
    private volatile /* synthetic */ int _decision;

    public i1(@n6.d e4.g gVar, @n6.d e4.d<? super T> dVar) {
        super(gVar, dVar);
        this._decision = 0;
    }

    @Override // kotlinx.coroutines.internal.n0, kotlinx.coroutines.a
    public void H1(@n6.e Object obj) {
        if (O1()) {
            return;
        }
        kotlinx.coroutines.internal.m.g(g4.c.d(this.f12831m), k0.a(obj, this.f12831m), null, 2, null);
    }

    @n6.e
    public final Object N1() {
        if (P1()) {
            return g4.d.h();
        }
        Object o6 = w2.o(V0());
        if (o6 instanceof e0) {
            throw ((e0) o6).f11961a;
        }
        return o6;
    }

    public final boolean O1() {
        do {
            int i7 = this._decision;
            if (i7 != 0) {
                if (i7 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f12754n.compareAndSet(this, 0, 2));
        return true;
    }

    public final boolean P1() {
        do {
            int i7 = this._decision;
            if (i7 != 0) {
                if (i7 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f12754n.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.n0, kotlinx.coroutines.v2
    public void j0(@n6.e Object obj) {
        H1(obj);
    }
}
