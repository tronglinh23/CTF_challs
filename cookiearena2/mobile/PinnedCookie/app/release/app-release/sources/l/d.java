package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d.b1;
import d.o0;
import d.q0;
import d.w0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class d extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13195a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f13196b = Executors.newFixedThreadPool(4, new a());
    @q0

    /* renamed from: c  reason: collision with root package name */
    public volatile Handler f13197c;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: c  reason: collision with root package name */
        public static final String f13198c = "arch_disk_io_";

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f13199a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(f13198c + this.f13199a.getAndIncrement());
            return thread;
        }
    }

    @w0(28)
    /* loaded from: classes.dex */
    public static class b {
        @o0
        public static Handler a(@o0 Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    @o0
    public static Handler e(@o0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // l.f
    public void a(@o0 Runnable runnable) {
        this.f13196b.execute(runnable);
    }

    @Override // l.f
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // l.f
    public void d(@o0 Runnable runnable) {
        if (this.f13197c == null) {
            synchronized (this.f13195a) {
                if (this.f13197c == null) {
                    this.f13197c = e(Looper.getMainLooper());
                }
            }
        }
        this.f13197c.post(runnable);
    }
}
