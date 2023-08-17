package kotlinx.coroutines.internal;

import kotlinx.coroutines.n2;
/* loaded from: classes.dex */
public class n0<T> extends kotlinx.coroutines.a<T> implements h4.e {
    @n6.d
    @s4.e

    /* renamed from: m  reason: collision with root package name */
    public final e4.d<T> f12831m;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(@n6.d e4.g gVar, @n6.d e4.d<? super T> dVar) {
        super(gVar, true, true);
        this.f12831m = dVar;
    }

    @Override // kotlinx.coroutines.a
    public void H1(@n6.e Object obj) {
        e4.d<T> dVar = this.f12831m;
        dVar.D(kotlinx.coroutines.k0.a(obj, dVar));
    }

    @n6.e
    public final n2 M1() {
        kotlinx.coroutines.w S0 = S0();
        if (S0 != null) {
            return S0.getParent();
        }
        return null;
    }

    @Override // kotlinx.coroutines.v2
    public final boolean b1() {
        return true;
    }

    @Override // kotlinx.coroutines.v2
    public void j0(@n6.e Object obj) {
        m.g(g4.c.d(this.f12831m), kotlinx.coroutines.k0.a(obj, this.f12831m), null, 2, null);
    }

    @Override // h4.e
    @n6.e
    public final StackTraceElement k0() {
        return null;
    }

    @Override // h4.e
    @n6.e
    public final h4.e v() {
        e4.d<T> dVar = this.f12831m;
        if (dVar instanceof h4.e) {
            return (h4.e) dVar;
        }
        return null;
    }
}
