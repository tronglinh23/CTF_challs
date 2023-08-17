package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class v {
    public static final int a(@n6.d AtomicInteger atomicInteger) {
        return atomicInteger.get();
    }

    public static final void b(@n6.d AtomicInteger atomicInteger, int i7) {
        atomicInteger.set(i7);
    }
}