package p2;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import d.b1;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class d<Params, Progress, Result> {

    /* renamed from: p  reason: collision with root package name */
    public static final String f14618p = "AsyncTask";

    /* renamed from: q  reason: collision with root package name */
    public static final int f14619q = 5;

    /* renamed from: r  reason: collision with root package name */
    public static final int f14620r = 128;

    /* renamed from: s  reason: collision with root package name */
    public static final int f14621s = 1;

    /* renamed from: t  reason: collision with root package name */
    public static final ThreadFactory f14622t;

    /* renamed from: u  reason: collision with root package name */
    public static final BlockingQueue<Runnable> f14623u;

    /* renamed from: v  reason: collision with root package name */
    public static final Executor f14624v;

    /* renamed from: w  reason: collision with root package name */
    public static final int f14625w = 1;

    /* renamed from: x  reason: collision with root package name */
    public static final int f14626x = 2;

    /* renamed from: y  reason: collision with root package name */
    public static f f14627y;

    /* renamed from: z  reason: collision with root package name */
    public static volatile Executor f14628z;

    /* renamed from: k  reason: collision with root package name */
    public final h<Params, Result> f14629k;

    /* renamed from: l  reason: collision with root package name */
    public final FutureTask<Result> f14630l;

    /* renamed from: m  reason: collision with root package name */
    public volatile g f14631m = g.PENDING;

    /* renamed from: n  reason: collision with root package name */
    public final AtomicBoolean f14632n = new AtomicBoolean();

    /* renamed from: o  reason: collision with root package name */
    public final AtomicBoolean f14633o = new AtomicBoolean();

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f14634a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f14634a.getAndIncrement());
        }
    }

    /* loaded from: classes.dex */
    public class b extends h<Params, Result> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            d.this.f14633o.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b(this.f14644a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                d.this.r(get());
            } catch (InterruptedException e7) {
                Log.w(d.f14618p, e7);
            } catch (CancellationException unused) {
                d.this.r(null);
            } catch (ExecutionException e8) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e8.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: p2.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0207d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14637a;

        static {
            int[] iArr = new int[g.values().length];
            f14637a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14637a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d f14638a;

        /* renamed from: b  reason: collision with root package name */
        public final Data[] f14639b;

        public e(d dVar, Data... dataArr) {
            this.f14638a = dVar;
            this.f14639b = dataArr;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i7 = message.what;
            if (i7 == 1) {
                eVar.f14638a.f(eVar.f14639b[0]);
            } else if (i7 != 2) {
            } else {
                eVar.f14638a.p(eVar.f14639b);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes.dex */
    public static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        public Params[] f14644a;
    }

    static {
        a aVar = new a();
        f14622t = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f14623u = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f14624v = threadPoolExecutor;
        f14628z = threadPoolExecutor;
    }

    public d() {
        b bVar = new b();
        this.f14629k = bVar;
        this.f14630l = new c(bVar);
    }

    public static void d(Runnable runnable) {
        f14628z.execute(runnable);
    }

    public static Handler i() {
        f fVar;
        synchronized (d.class) {
            if (f14627y == null) {
                f14627y = new f();
            }
            fVar = f14627y;
        }
        return fVar;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public static void t(Executor executor) {
        f14628z = executor;
    }

    public final boolean a(boolean z6) {
        this.f14632n.set(true);
        return this.f14630l.cancel(z6);
    }

    public abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Params... paramsArr) {
        return e(f14628z, paramsArr);
    }

    public final d<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.f14631m == g.PENDING) {
            this.f14631m = g.RUNNING;
            o();
            this.f14629k.f14644a = paramsArr;
            executor.execute(this.f14630l);
            return this;
        }
        int i7 = C0207d.f14637a[this.f14631m.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("We should never reach this state");
            }
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("Cannot execute task: the task is already running.");
    }

    public void f(Result result) {
        if (k()) {
            m(result);
        } else {
            n(result);
        }
        this.f14631m = g.FINISHED;
    }

    public final Result g() throws InterruptedException, ExecutionException {
        return this.f14630l.get();
    }

    public final Result h(long j7, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f14630l.get(j7, timeUnit);
    }

    public final g j() {
        return this.f14631m;
    }

    public final boolean k() {
        return this.f14632n.get();
    }

    public void l() {
    }

    public void m(Result result) {
        l();
    }

    public void n(Result result) {
    }

    public void o() {
    }

    public void p(Progress... progressArr) {
    }

    public Result q(Result result) {
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public void r(Result result) {
        if (this.f14633o.get()) {
            return;
        }
        q(result);
    }

    public final void s(Progress... progressArr) {
        if (k()) {
            return;
        }
        i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
    }
}