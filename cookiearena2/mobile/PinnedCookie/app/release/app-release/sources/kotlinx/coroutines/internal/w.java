package kotlinx.coroutines.internal;

import v3.m2;
/* loaded from: classes.dex */
public class w extends y {
    @Override // kotlinx.coroutines.internal.y
    public boolean N0() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.y
    @n6.e
    public y P0() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.y
    public /* bridge */ /* synthetic */ boolean Q0() {
        return ((Boolean) Z0()).booleanValue();
    }

    public final /* synthetic */ <T extends y> void X0(t4.l<? super T, m2> lVar) {
        for (y yVar = (y) I0(); !u4.l0.g(yVar, this); yVar = yVar.J0()) {
            u4.l0.y(3, "T");
            if (yVar instanceof y) {
                lVar.O(yVar);
            }
        }
    }

    public final boolean Y0() {
        return I0() == this;
    }

    @n6.d
    public final Void Z0() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    public final void a1() {
        y yVar = (y) I0();
        y yVar2 = this;
        while (!u4.l0.g(yVar, this)) {
            y J0 = yVar.J0();
            yVar.W0(yVar2, J0);
            yVar2 = yVar;
            yVar = J0;
        }
        W0(yVar2, (y) I0());
    }
}
