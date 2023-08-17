package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.i2;
import kotlinx.coroutines.o0;
/* loaded from: classes.dex */
public final class p extends o0 {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final p f13012m = new p();

    @Override // kotlinx.coroutines.o0
    public void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        d.f12980s.c1(runnable, o.f13011j, false);
    }

    @Override // kotlinx.coroutines.o0
    @i2
    public void W0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        d.f12980s.c1(runnable, o.f13011j, true);
    }
}
