package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.m;
import d.w0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    public static final long f3952g = 10;

    /* renamed from: h  reason: collision with root package name */
    public static final ThreadLocal<a> f3953h = new ThreadLocal<>();

    /* renamed from: d  reason: collision with root package name */
    public c f3957d;

    /* renamed from: a  reason: collision with root package name */
    public final m<b, Long> f3954a = new m<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f3955b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final C0040a f3956c = new C0040a();

    /* renamed from: e  reason: collision with root package name */
    public long f3958e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3959f = false;

    /* renamed from: androidx.dynamicanimation.animation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0040a {
        public C0040a() {
        }

        public void a() {
            a.this.f3958e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f3958e);
            if (a.this.f3955b.size() > 0) {
                a.this.f().a();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(long j7);
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final C0040a f3961a;

        public c(C0040a c0040a) {
            this.f3961a = c0040a;
        }

        public abstract void a();
    }

    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f3962b;

        /* renamed from: c  reason: collision with root package name */
        public final Handler f3963c;

        /* renamed from: d  reason: collision with root package name */
        public long f3964d;

        /* renamed from: androidx.dynamicanimation.animation.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0041a implements Runnable {
            public RunnableC0041a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f3964d = SystemClock.uptimeMillis();
                d.this.f3961a.a();
            }
        }

        public d(C0040a c0040a) {
            super(c0040a);
            this.f3964d = -1L;
            this.f3962b = new RunnableC0041a();
            this.f3963c = new Handler(Looper.myLooper());
        }

        @Override // androidx.dynamicanimation.animation.a.c
        public void a() {
            this.f3963c.postDelayed(this.f3962b, Math.max(10 - (SystemClock.uptimeMillis() - this.f3964d), 0L));
        }
    }

    @w0(16)
    /* loaded from: classes.dex */
    public static class e extends c {

        /* renamed from: b  reason: collision with root package name */
        public final Choreographer f3966b;

        /* renamed from: c  reason: collision with root package name */
        public final Choreographer.FrameCallback f3967c;

        /* renamed from: androidx.dynamicanimation.animation.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class ChoreographerFrameCallbackC0042a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0042a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j7) {
                e.this.f3961a.a();
            }
        }

        public e(C0040a c0040a) {
            super(c0040a);
            this.f3966b = Choreographer.getInstance();
            this.f3967c = new ChoreographerFrameCallbackC0042a();
        }

        @Override // androidx.dynamicanimation.animation.a.c
        public void a() {
            this.f3966b.postFrameCallback(this.f3967c);
        }
    }

    public static long d() {
        ThreadLocal<a> threadLocal = f3953h;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f3958e;
    }

    public static a e() {
        ThreadLocal<a> threadLocal = f3953h;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    public void a(b bVar, long j7) {
        if (this.f3955b.size() == 0) {
            f().a();
        }
        if (!this.f3955b.contains(bVar)) {
            this.f3955b.add(bVar);
        }
        if (j7 > 0) {
            this.f3954a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j7));
        }
    }

    public final void b() {
        if (this.f3959f) {
            for (int size = this.f3955b.size() - 1; size >= 0; size--) {
                if (this.f3955b.get(size) == null) {
                    this.f3955b.remove(size);
                }
            }
            this.f3959f = false;
        }
    }

    public void c(long j7) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i7 = 0; i7 < this.f3955b.size(); i7++) {
            b bVar = this.f3955b.get(i7);
            if (bVar != null && g(bVar, uptimeMillis)) {
                bVar.a(j7);
            }
        }
        b();
    }

    public c f() {
        if (this.f3957d == null) {
            this.f3957d = new e(this.f3956c);
        }
        return this.f3957d;
    }

    public final boolean g(b bVar, long j7) {
        Long l7 = this.f3954a.get(bVar);
        if (l7 == null) {
            return true;
        }
        if (l7.longValue() < j7) {
            this.f3954a.remove(bVar);
            return true;
        }
        return false;
    }

    public void h(b bVar) {
        this.f3954a.remove(bVar);
        int indexOf = this.f3955b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f3955b.set(indexOf, null);
            this.f3959f = true;
        }
    }

    public void i(c cVar) {
        this.f3957d = cVar;
    }
}