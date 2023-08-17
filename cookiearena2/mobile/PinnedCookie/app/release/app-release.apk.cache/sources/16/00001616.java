package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class w3 {
    public static /* synthetic */ Thread a(int i7, String str, AtomicInteger atomicInteger, Runnable runnable) {
        return c(i7, str, atomicInteger, runnable);
    }

    @g1
    @n6.d
    public static final z1 b(final int i7, @n6.d final String str) {
        if (i7 >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return b2.d(Executors.newScheduledThreadPool(i7, new ThreadFactory() { // from class: kotlinx.coroutines.v3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return w3.a(i7, str, atomicInteger, runnable);
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i7 + " specified").toString());
    }

    public static final Thread c(int i7, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i7 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    @g1
    @n6.d
    public static final z1 d(@n6.d String str) {
        return b(1, str);
    }
}