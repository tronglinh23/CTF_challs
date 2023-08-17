package androidx.lifecycle;

import k2.a;

@s4.h(name = "ViewModelProviderGetKt")
/* loaded from: classes.dex */
public final class d1 {
    @n6.d
    public static final k2.a a(@n6.d f1 f1Var) {
        u4.l0.p(f1Var, "owner");
        return f1Var instanceof o ? ((o) f1Var).getDefaultViewModelCreationExtras() : a.C0139a.f11626b;
    }

    @d.l0
    public static final /* synthetic */ <VM extends z0> VM b(c1 c1Var) {
        u4.l0.p(c1Var, "<this>");
        u4.l0.y(4, "VM");
        return (VM) c1Var.a(z0.class);
    }
}