package androidx.lifecycle;

import kotlinx.coroutines.m1;
/* loaded from: classes.dex */
public final class k0 extends kotlinx.coroutines.o0 {
    @n6.d
    @s4.e

    /* renamed from: m  reason: collision with root package name */
    public final j f4762m = new j();

    @Override // kotlinx.coroutines.o0
    public void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        u4.l0.p(gVar, "context");
        u4.l0.p(runnable, "block");
        this.f4762m.c(gVar, runnable);
    }

    @Override // kotlinx.coroutines.o0
    public boolean X0(@n6.d e4.g gVar) {
        u4.l0.p(gVar, "context");
        if (m1.e().a1().X0(gVar)) {
            return true;
        }
        return !this.f4762m.b();
    }
}
