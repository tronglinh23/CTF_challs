package androidx.lifecycle;

import androidx.lifecycle.p;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/z;", "source", "Landroidx/lifecycle/p$a;", i0.k0.I0, "Lv3/m2;", androidx.appcompat.widget.d.f1513o, "Landroidx/lifecycle/t0;", "k", "Landroidx/lifecycle/t0;", "provider", "<init>", "(Landroidx/lifecycle/t0;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements v {
    @n6.d

    /* renamed from: k  reason: collision with root package name and from kotlin metadata */
    public final t0 provider;

    public SavedStateHandleAttacher(@n6.d t0 t0Var) {
        u4.l0.p(t0Var, "provider");
        this.provider = t0Var;
    }

    @Override // androidx.lifecycle.v
    public void d(@n6.d z zVar, @n6.d p.a aVar) {
        u4.l0.p(zVar, "source");
        u4.l0.p(aVar, i0.k0.I0);
        if (aVar == p.a.ON_CREATE) {
            zVar.getLifecycle().d(this);
            this.provider.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
