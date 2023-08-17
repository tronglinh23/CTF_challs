package n5;

import kotlinx.coroutines.r0;
import n5.m0;
import v3.m2;
/* loaded from: classes.dex */
public final class f0<E> extends o<E> implements g0<E> {
    public f0(@n6.d e4.g gVar, @n6.d n<E> nVar) {
        super(gVar, nVar, true, true);
    }

    @Override // kotlinx.coroutines.a
    public void J1(@n6.d Throwable th, boolean z6) {
        if (M1().b(th) || z6) {
            return;
        }
        r0.b(g(), th);
    }

    @Override // kotlinx.coroutines.a
    /* renamed from: N1  reason: merged with bridge method [inline-methods] */
    public void K1(@n6.d m2 m2Var) {
        m0.a.a(M1(), null, 1, null);
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.v2, kotlinx.coroutines.n2
    public boolean d() {
        return super.d();
    }

    @Override // n5.g0
    public /* bridge */ /* synthetic */ m0 m() {
        return m();
    }
}
