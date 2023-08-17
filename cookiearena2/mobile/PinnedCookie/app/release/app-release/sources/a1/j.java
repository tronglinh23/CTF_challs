package a1;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import d.b0;
import d.b1;
import d.l1;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes.dex */
public class j {

    /* renamed from: i  reason: collision with root package name */
    public static final int f142i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f143j = 0;
    @b0("mLock")

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f145b;
    @b0("mLock")

    /* renamed from: c  reason: collision with root package name */
    public Handler f146c;

    /* renamed from: f  reason: collision with root package name */
    public final int f149f;

    /* renamed from: g  reason: collision with root package name */
    public final int f150g;

    /* renamed from: h  reason: collision with root package name */
    public final String f151h;

    /* renamed from: a  reason: collision with root package name */
    public final Object f144a = new Object();

    /* renamed from: e  reason: collision with root package name */
    public Handler.Callback f148e = new a();
    @b0("mLock")

    /* renamed from: d  reason: collision with root package name */
    public int f147d = 0;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 0) {
                j.this.c();
                return true;
            } else if (i7 != 1) {
                return true;
            } else {
                j.this.d((Runnable) message.obj);
                return true;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Callable f153k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Handler f154l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ d f155m;

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Object f157k;

            public a(Object obj) {
                this.f157k = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f155m.a(this.f157k);
            }
        }

        public b(Callable callable, Handler handler, d dVar) {
            this.f153k = callable;
            this.f154l = handler;
            this.f155m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f153k.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f154l.post(new a(obj));
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f159k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Callable f160l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ ReentrantLock f161m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f162n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Condition f163o;

        public c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f159k = atomicReference;
            this.f160l = callable;
            this.f161m = reentrantLock;
            this.f162n = atomicBoolean;
            this.f163o = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f159k.set(this.f160l.call());
            } catch (Exception unused) {
            }
            this.f161m.lock();
            try {
                this.f162n.set(false);
                this.f163o.signal();
            } finally {
                this.f161m.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t6);
    }

    public j(String str, int i7, int i8) {
        this.f151h = str;
        this.f150g = i7;
        this.f149f = i8;
    }

    @l1
    public int a() {
        int i7;
        synchronized (this.f144a) {
            i7 = this.f147d;
        }
        return i7;
    }

    @l1
    public boolean b() {
        boolean z6;
        synchronized (this.f144a) {
            z6 = this.f145b != null;
        }
        return z6;
    }

    public void c() {
        synchronized (this.f144a) {
            if (this.f146c.hasMessages(1)) {
                return;
            }
            this.f145b.quit();
            this.f145b = null;
            this.f146c = null;
        }
    }

    public void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f144a) {
            this.f146c.removeMessages(0);
            Handler handler = this.f146c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f149f);
        }
    }

    public final void e(Runnable runnable) {
        synchronized (this.f144a) {
            if (this.f145b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f151h, this.f150g);
                this.f145b = handlerThread;
                handlerThread.start();
                this.f146c = new Handler(this.f145b.getLooper(), this.f148e);
                this.f147d++;
            }
            this.f146c.removeMessages(0);
            Handler handler = this.f146c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, a1.b.a(), dVar));
    }

    public <T> T g(Callable<T> callable, int i7) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new c(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (atomicBoolean.get()) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(i7);
                do {
                    try {
                        nanos = newCondition.awaitNanos(nanos);
                    } catch (InterruptedException unused) {
                    }
                    if (!atomicBoolean.get()) {
                        return (T) atomicReference.get();
                    }
                } while (nanos > 0);
                throw new InterruptedException("timeout");
            }
            return (T) atomicReference.get();
        } finally {
            reentrantLock.unlock();
        }
    }
}
