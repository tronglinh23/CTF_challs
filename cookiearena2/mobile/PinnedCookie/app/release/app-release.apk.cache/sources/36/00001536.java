package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class f {
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public static final Method f12801a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f12801a = method;
    }

    public static /* synthetic */ void a() {
    }

    @n6.d
    public static final <E> Set<E> b(int i7) {
        return Collections.newSetFromMap(new IdentityHashMap(i7));
    }

    public static final boolean c(@n6.d Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f12801a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @n6.d
    public static final <E> List<E> d() {
        return new CopyOnWriteArrayList();
    }

    public static final <T> T e(@n6.d ReentrantLock reentrantLock, @n6.d t4.a<? extends T> aVar) {
        reentrantLock.lock();
        try {
            return aVar.n();
        } finally {
            u4.i0.d(1);
            reentrantLock.unlock();
            u4.i0.c(1);
        }
    }
}