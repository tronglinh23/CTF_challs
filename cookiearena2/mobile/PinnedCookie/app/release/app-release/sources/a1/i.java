package a1;

import android.os.Handler;
import android.os.Process;
import d.g0;
import d.o0;
import g1.s;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class i {

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public String f132a;

        /* renamed from: b  reason: collision with root package name */
        public int f133b;

        /* renamed from: a1.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0004a extends Thread {

            /* renamed from: k  reason: collision with root package name */
            public final int f134k;

            public C0004a(Runnable runnable, String str, int i7) {
                super(runnable, str);
                this.f134k = i7;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f134k);
                super.run();
            }
        }

        public a(@o0 String str, int i7) {
            this.f132a = str;
            this.f133b = i7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0004a(runnable, this.f132a, this.f133b);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Executor {

        /* renamed from: k  reason: collision with root package name */
        public final Handler f135k;

        public b(@o0 Handler handler) {
            this.f135k = (Handler) s.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            if (this.f135k.post((Runnable) s.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f135k + " is shutting down");
        }
    }

    /* loaded from: classes.dex */
    public static class c<T> implements Runnable {
        @o0

        /* renamed from: k  reason: collision with root package name */
        public Callable<T> f136k;
        @o0

        /* renamed from: l  reason: collision with root package name */
        public g1.e<T> f137l;
        @o0

        /* renamed from: m  reason: collision with root package name */
        public Handler f138m;

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ g1.e f139k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ Object f140l;

            public a(g1.e eVar, Object obj) {
                this.f139k = eVar;
                this.f140l = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f139k.accept(this.f140l);
            }
        }

        public c(@o0 Handler handler, @o0 Callable<T> callable, @o0 g1.e<T> eVar) {
            this.f136k = callable;
            this.f137l = eVar;
            this.f138m = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t6;
            try {
                t6 = this.f136k.call();
            } catch (Exception unused) {
                t6 = null;
            }
            this.f138m.post(new a(this.f137l, t6));
        }
    }

    public static ThreadPoolExecutor a(@o0 String str, int i7, @g0(from = 0) int i8) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i8, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i7));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(@o0 Handler handler) {
        return new b(handler);
    }

    public static <T> void c(@o0 Executor executor, @o0 Callable<T> callable, @o0 g1.e<T> eVar) {
        executor.execute(new c(a1.b.a(), callable, eVar));
    }

    public static <T> T d(@o0 ExecutorService executorService, @o0 Callable<T> callable, @g0(from = 0) int i7) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i7, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw e7;
        } catch (ExecutionException e8) {
            throw new RuntimeException(e8);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
