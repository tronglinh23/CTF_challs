package androidx.lifecycle;

import androidx.lifecycle.p;
import i0.x2;
import kotlin.Metadata;
import u4.r1;
@r1({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/v;", "Landroidx/savedstate/a;", "registry", "Landroidx/lifecycle/p;", "lifecycle", "Lv3/m2;", "h", "Landroidx/lifecycle/z;", "source", "Landroidx/lifecycle/p$a;", i0.k0.I0, androidx.appcompat.widget.d.f1513o, "", "k", "Ljava/lang/String;", x2.f10960j, "Landroidx/lifecycle/r0;", "l", "Landroidx/lifecycle/r0;", "i", "()Landroidx/lifecycle/r0;", "handle", "", "<set-?>", p0.x0.f14590b, "Z", "j", "()Z", "isAttached", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/r0;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleController implements v {
    @n6.d

    /* renamed from: k  reason: collision with root package name and from kotlin metadata */
    public final String key;
    @n6.d

    /* renamed from: l  reason: collision with root package name and from kotlin metadata */
    public final r0 handle;

    /* renamed from: m  reason: collision with root package name and from kotlin metadata */
    public boolean isAttached;

    public SavedStateHandleController(@n6.d String str, @n6.d r0 r0Var) {
        u4.l0.p(str, x2.f10960j);
        u4.l0.p(r0Var, "handle");
        this.key = str;
        this.handle = r0Var;
    }

    @Override // androidx.lifecycle.v
    public void d(@n6.d z zVar, @n6.d p.a aVar) {
        u4.l0.p(zVar, "source");
        u4.l0.p(aVar, i0.k0.I0);
        if (aVar == p.a.ON_DESTROY) {
            this.isAttached = false;
            zVar.getLifecycle().d(this);
        }
    }

    public final void h(@n6.d androidx.savedstate.a aVar, @n6.d p pVar) {
        u4.l0.p(aVar, "registry");
        u4.l0.p(pVar, "lifecycle");
        if ((!this.isAttached) != true) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.isAttached = true;
        pVar.a(this);
        aVar.j(this.key, this.handle.o());
    }

    @n6.d
    /* renamed from: i  reason: from getter */
    public final r0 getHandle() {
        return this.handle;
    }

    /* renamed from: j  reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }
}
