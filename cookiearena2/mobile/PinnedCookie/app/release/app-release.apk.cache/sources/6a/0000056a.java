package androidx.lifecycle;

import androidx.lifecycle.p;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/z;", "source", "Landroidx/lifecycle/p$a;", i0.k0.I0, "Lv3/m2;", androidx.appcompat.widget.d.f1513o, "", "Landroidx/lifecycle/m;", "k", "[Landroidx/lifecycle/m;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/m;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements v {
    @n6.d

    /* renamed from: k  reason: collision with root package name and from kotlin metadata */
    public final m[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(@n6.d m[] mVarArr) {
        u4.l0.p(mVarArr, "generatedAdapters");
        this.generatedAdapters = mVarArr;
    }

    @Override // androidx.lifecycle.v
    public void d(@n6.d z zVar, @n6.d p.a aVar) {
        u4.l0.p(zVar, "source");
        u4.l0.p(aVar, i0.k0.I0);
        g0 g0Var = new g0();
        for (m mVar : this.generatedAdapters) {
            mVar.a(zVar, aVar, false, g0Var);
        }
        for (m mVar2 : this.generatedAdapters) {
            mVar2.a(zVar, aVar, true, g0Var);
        }
    }
}