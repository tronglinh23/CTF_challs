package n5;

import java.util.ArrayList;
import kotlinx.coroutines.internal.d1;
import kotlinx.coroutines.internal.r0;
import n5.c;
import v3.m2;
/* loaded from: classes.dex */
public class d0<E> extends a<E> {
    public d0(@n6.e t4.l<? super E, m2> lVar) {
        super(lVar);
    }

    @Override // n5.c
    public final boolean C() {
        return false;
    }

    @Override // n5.c
    public final boolean D() {
        return false;
    }

    @Override // n5.c
    @n6.d
    public Object H(E e7) {
        j0<?> O;
        do {
            Object H = super.H(e7);
            r0 r0Var = b.f13902d;
            if (H == r0Var) {
                return r0Var;
            }
            if (H != b.f13903e) {
                if (H instanceof w) {
                    return H;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + H).toString());
            }
            O = O(e7);
            if (O == null) {
                return r0Var;
            }
        } while (!(O instanceof w));
        return O;
    }

    @Override // n5.c
    @n6.d
    public Object I(E e7, @n6.d kotlinx.coroutines.selects.f<?> fVar) {
        Object L;
        while (true) {
            if (g0()) {
                L = super.I(e7, fVar);
            } else {
                L = fVar.L(h(e7));
                if (L == null) {
                    L = b.f13902d;
                }
            }
            if (L == kotlinx.coroutines.selects.g.d()) {
                return kotlinx.coroutines.selects.g.d();
            }
            r0 r0Var = b.f13902d;
            if (L == r0Var) {
                return r0Var;
            }
            if (L != b.f13903e && L != kotlinx.coroutines.internal.c.f12787b) {
                if (L instanceof w) {
                    return L;
                }
                throw new IllegalStateException(("Invalid result " + L).toString());
            }
        }
    }

    @Override // n5.a
    public final boolean h0() {
        return true;
    }

    @Override // n5.a
    public final boolean i0() {
        return true;
    }

    @Override // n5.a
    public void l0(@n6.d Object obj, @n6.d w<?> wVar) {
        d1 d1Var = null;
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                d1 d1Var2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    l0 l0Var = (l0) arrayList.get(size);
                    if (l0Var instanceof c.a) {
                        t4.l<E, m2> lVar = this.f13909k;
                        d1Var2 = lVar != null ? kotlinx.coroutines.internal.i0.c(lVar, ((c.a) l0Var).f13911n, d1Var2) : null;
                    } else {
                        l0Var.Z0(wVar);
                    }
                }
                d1Var = d1Var2;
            } else {
                l0 l0Var2 = (l0) obj;
                if (l0Var2 instanceof c.a) {
                    t4.l<E, m2> lVar2 = this.f13909k;
                    if (lVar2 != null) {
                        d1Var = kotlinx.coroutines.internal.i0.c(lVar2, ((c.a) l0Var2).f13911n, null);
                    }
                } else {
                    l0Var2.Z0(wVar);
                }
            }
        }
        if (d1Var != null) {
            throw d1Var;
        }
    }
}
