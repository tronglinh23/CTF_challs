package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class l2 extends p2 {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12903p = AtomicIntegerFieldUpdater.newUpdater(l2.class, "_invoked");
    @n6.d
    private volatile /* synthetic */ int _invoked = 0;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final t4.l<Throwable, v3.m2> f12904o;

    /* JADX WARN: Multi-variable type inference failed */
    public l2(@n6.d t4.l<? super Throwable, v3.m2> lVar) {
        this.f12904o = lVar;
    }

    @Override // t4.l
    public /* bridge */ /* synthetic */ v3.m2 O(Throwable th) {
        X0(th);
        return v3.m2.f17815a;
    }

    @Override // kotlinx.coroutines.g0
    public void X0(@n6.e Throwable th) {
        if (f12903p.compareAndSet(this, 0, 1)) {
            this.f12904o.O(th);
        }
    }
}
