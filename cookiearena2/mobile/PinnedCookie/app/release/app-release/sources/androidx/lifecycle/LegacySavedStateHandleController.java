package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final LegacySavedStateHandleController f4601a = new LegacySavedStateHandleController();
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final String f4602b = "androidx.lifecycle.savedstate.vm.tag";

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0066a {
        @Override // androidx.savedstate.a.InterfaceC0066a
        public void a(@n6.d e3.d dVar) {
            u4.l0.p(dVar, "owner");
            if (!(dVar instanceof f1)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            e1 viewModelStore = ((f1) dVar).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = dVar.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                z0 b7 = viewModelStore.b(it.next());
                u4.l0.m(b7);
                LegacySavedStateHandleController.a(b7, savedStateRegistry, dVar.getLifecycle());
            }
            if ((!viewModelStore.c().isEmpty()) == true) {
                savedStateRegistry.k(a.class);
            }
        }
    }

    @s4.m
    public static final void a(@n6.d z0 z0Var, @n6.d androidx.savedstate.a aVar, @n6.d p pVar) {
        u4.l0.p(z0Var, "viewModel");
        u4.l0.p(aVar, "registry");
        u4.l0.p(pVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) z0Var.e("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.getIsAttached()) {
            return;
        }
        savedStateHandleController.h(aVar, pVar);
        f4601a.c(aVar, pVar);
    }

    @n6.d
    @s4.m
    public static final SavedStateHandleController b(@n6.d androidx.savedstate.a aVar, @n6.d p pVar, @n6.e String str, @n6.e Bundle bundle) {
        u4.l0.p(aVar, "registry");
        u4.l0.p(pVar, "lifecycle");
        u4.l0.m(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, r0.f4810f.a(aVar.b(str), bundle));
        savedStateHandleController.h(aVar, pVar);
        f4601a.c(aVar, pVar);
        return savedStateHandleController;
    }

    public final void c(final androidx.savedstate.a aVar, final p pVar) {
        p.b b7 = pVar.b();
        if (b7 == p.b.INITIALIZED || b7.d(p.b.STARTED)) {
            aVar.k(a.class);
        } else {
            pVar.a(new v() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.v
                public void d(@n6.d z zVar, @n6.d p.a aVar2) {
                    u4.l0.p(zVar, "source");
                    u4.l0.p(aVar2, i0.k0.I0);
                    if (aVar2 == p.a.ON_START) {
                        p.this.d(this);
                        aVar.k(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
