package s2;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import s2.d1;
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J*\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Ls2/o0;", "Ls2/d1;", "Ls2/k0;", "l", "", "Ls2/t;", "entries", "Ls2/u0;", "navOptions", "Ls2/d1$a;", "navigatorExtras", "Lv3/m2;", "e", "entry", "n", "Ls2/e1;", "c", "Ls2/e1;", "navigatorProvider", "Lkotlinx/coroutines/flow/t0;", p0.x0.f14590b, "()Lkotlinx/coroutines/flow/t0;", "backStack", "<init>", "(Ls2/e1;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@d1.b(i0.k0.F0)
/* loaded from: classes.dex */
public class o0 extends d1<k0> {
    @n6.d

    /* renamed from: c  reason: collision with root package name and from kotlin metadata */
    public final e1 navigatorProvider;

    public o0(@n6.d e1 e1Var) {
        u4.l0.p(e1Var, "navigatorProvider");
        this.navigatorProvider = e1Var;
    }

    @Override // s2.d1
    public void e(@n6.d List<t> list, @n6.e u0 u0Var, @n6.e d1.a aVar) {
        u4.l0.p(list, "entries");
        Iterator<t> it = list.iterator();
        while (it.hasNext()) {
            n(it.next(), u0Var, aVar);
        }
    }

    @Override // s2.d1
    @n6.d
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public k0 a() {
        return new k0(this);
    }

    @n6.d
    public final kotlinx.coroutines.flow.t0<List<t>> m() {
        return b().b();
    }

    public final void n(t tVar, u0 u0Var, d1.a aVar) {
        g0 e7 = tVar.e();
        u4.l0.n(e7, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        k0 k0Var = (k0) e7;
        Bundle c7 = tVar.c();
        int a02 = k0Var.a0();
        String b02 = k0Var.b0();
        if (!((a02 == 0 && b02 == null) ? false : true)) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + k0Var.o()).toString());
        }
        g0 V = b02 != null ? k0Var.V(b02, false) : k0Var.T(a02, false);
        if (V != null) {
            this.navigatorProvider.f(V.t()).e(x3.v.k(b().a(V, V.g(c7))), u0Var, aVar);
            return;
        }
        throw new IllegalArgumentException("navigation destination " + k0Var.Y() + " is not a direct child of this NavGraph");
    }
}
