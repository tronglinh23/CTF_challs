package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f13039a = AtomicLongFieldUpdater.newUpdater(i.class, "number");
    @n6.d
    private volatile /* synthetic */ long number = 1;

    public final long a() {
        return f13039a.incrementAndGet(this);
    }
}