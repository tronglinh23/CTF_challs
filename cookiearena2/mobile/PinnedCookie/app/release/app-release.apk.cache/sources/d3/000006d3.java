package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class u<T> implements e0<T> {

    /* loaded from: classes.dex */
    public class a implements e0.b<T> {

        /* renamed from: f  reason: collision with root package name */
        public static final int f5594f = 1;

        /* renamed from: g  reason: collision with root package name */
        public static final int f5595g = 2;

        /* renamed from: h  reason: collision with root package name */
        public static final int f5596h = 3;

        /* renamed from: a  reason: collision with root package name */
        public final c f5597a = new c();

        /* renamed from: b  reason: collision with root package name */
        public final Handler f5598b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        public Runnable f5599c = new RunnableC0065a();

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e0.b f5600d;

        /* renamed from: androidx.recyclerview.widget.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0065a implements Runnable {
            public RunnableC0065a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d a7 = a.this.f5597a.a();
                while (a7 != null) {
                    int i7 = a7.f5618b;
                    if (i7 == 1) {
                        a.this.f5600d.a(a7.f5619c, a7.f5620d);
                    } else if (i7 == 2) {
                        a.this.f5600d.b(a7.f5619c, (f0.a) a7.f5624h);
                    } else if (i7 != 3) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + a7.f5618b);
                    } else {
                        a.this.f5600d.c(a7.f5619c, a7.f5620d);
                    }
                    a7 = a.this.f5597a.a();
                }
            }
        }

        public a(e0.b bVar) {
            this.f5600d = bVar;
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void a(int i7, int i8) {
            d(d.a(1, i7, i8));
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void b(int i7, f0.a<T> aVar) {
            d(d.c(2, i7, aVar));
        }

        @Override // androidx.recyclerview.widget.e0.b
        public void c(int i7, int i8) {
            d(d.a(3, i7, i8));
        }

        public final void d(d dVar) {
            this.f5597a.c(dVar);
            this.f5598b.post(this.f5599c);
        }
    }

    /* loaded from: classes.dex */
    public class b implements e0.a<T> {

        /* renamed from: g  reason: collision with root package name */
        public static final int f5603g = 1;

        /* renamed from: h  reason: collision with root package name */
        public static final int f5604h = 2;

        /* renamed from: i  reason: collision with root package name */
        public static final int f5605i = 3;

        /* renamed from: j  reason: collision with root package name */
        public static final int f5606j = 4;

        /* renamed from: a  reason: collision with root package name */
        public final c f5607a = new c();

        /* renamed from: b  reason: collision with root package name */
        public final Executor f5608b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: c  reason: collision with root package name */
        public AtomicBoolean f5609c = new AtomicBoolean(false);

        /* renamed from: d  reason: collision with root package name */
        public Runnable f5610d = new a();

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e0.a f5611e;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    d a7 = b.this.f5607a.a();
                    if (a7 == null) {
                        b.this.f5609c.set(false);
                        return;
                    }
                    int i7 = a7.f5618b;
                    if (i7 == 1) {
                        b.this.f5607a.b(1);
                        b.this.f5611e.d(a7.f5619c);
                    } else if (i7 == 2) {
                        b.this.f5607a.b(2);
                        b.this.f5607a.b(3);
                        b.this.f5611e.b(a7.f5619c, a7.f5620d, a7.f5621e, a7.f5622f, a7.f5623g);
                    } else if (i7 == 3) {
                        b.this.f5611e.c(a7.f5619c, a7.f5620d);
                    } else if (i7 != 4) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + a7.f5618b);
                    } else {
                        b.this.f5611e.a((f0.a) a7.f5624h);
                    }
                }
            }
        }

        public b(e0.a aVar) {
            this.f5611e = aVar;
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void a(f0.a<T> aVar) {
            f(d.c(4, 0, aVar));
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void b(int i7, int i8, int i9, int i10, int i11) {
            g(d.b(2, i7, i8, i9, i10, i11, null));
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void c(int i7, int i8) {
            f(d.a(3, i7, i8));
        }

        @Override // androidx.recyclerview.widget.e0.a
        public void d(int i7) {
            g(d.c(1, i7, null));
        }

        public final void e() {
            if (this.f5609c.compareAndSet(false, true)) {
                this.f5608b.execute(this.f5610d);
            }
        }

        public final void f(d dVar) {
            this.f5607a.c(dVar);
            e();
        }

        public final void g(d dVar) {
            this.f5607a.d(dVar);
            e();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public d f5614a;

        public synchronized d a() {
            d dVar = this.f5614a;
            if (dVar == null) {
                return null;
            }
            this.f5614a = dVar.f5617a;
            return dVar;
        }

        public synchronized void b(int i7) {
            d dVar;
            while (true) {
                dVar = this.f5614a;
                if (dVar == null || dVar.f5618b != i7) {
                    break;
                }
                this.f5614a = dVar.f5617a;
                dVar.d();
            }
            if (dVar != null) {
                d dVar2 = dVar.f5617a;
                while (dVar2 != null) {
                    d dVar3 = dVar2.f5617a;
                    if (dVar2.f5618b == i7) {
                        dVar.f5617a = dVar3;
                        dVar2.d();
                    } else {
                        dVar = dVar2;
                    }
                    dVar2 = dVar3;
                }
            }
        }

        public synchronized void c(d dVar) {
            d dVar2 = this.f5614a;
            if (dVar2 == null) {
                this.f5614a = dVar;
                return;
            }
            while (true) {
                d dVar3 = dVar2.f5617a;
                if (dVar3 == null) {
                    dVar2.f5617a = dVar;
                    return;
                }
                dVar2 = dVar3;
            }
        }

        public synchronized void d(d dVar) {
            dVar.f5617a = this.f5614a;
            this.f5614a = dVar;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: i  reason: collision with root package name */
        public static d f5615i;

        /* renamed from: j  reason: collision with root package name */
        public static final Object f5616j = new Object();

        /* renamed from: a  reason: collision with root package name */
        public d f5617a;

        /* renamed from: b  reason: collision with root package name */
        public int f5618b;

        /* renamed from: c  reason: collision with root package name */
        public int f5619c;

        /* renamed from: d  reason: collision with root package name */
        public int f5620d;

        /* renamed from: e  reason: collision with root package name */
        public int f5621e;

        /* renamed from: f  reason: collision with root package name */
        public int f5622f;

        /* renamed from: g  reason: collision with root package name */
        public int f5623g;

        /* renamed from: h  reason: collision with root package name */
        public Object f5624h;

        public static d a(int i7, int i8, int i9) {
            return b(i7, i8, i9, 0, 0, 0, null);
        }

        public static d b(int i7, int i8, int i9, int i10, int i11, int i12, Object obj) {
            d dVar;
            synchronized (f5616j) {
                dVar = f5615i;
                if (dVar == null) {
                    dVar = new d();
                } else {
                    f5615i = dVar.f5617a;
                    dVar.f5617a = null;
                }
                dVar.f5618b = i7;
                dVar.f5619c = i8;
                dVar.f5620d = i9;
                dVar.f5621e = i10;
                dVar.f5622f = i11;
                dVar.f5623g = i12;
                dVar.f5624h = obj;
            }
            return dVar;
        }

        public static d c(int i7, int i8, Object obj) {
            return b(i7, i8, 0, 0, 0, 0, obj);
        }

        public void d() {
            this.f5617a = null;
            this.f5623g = 0;
            this.f5622f = 0;
            this.f5621e = 0;
            this.f5620d = 0;
            this.f5619c = 0;
            this.f5618b = 0;
            this.f5624h = null;
            synchronized (f5616j) {
                d dVar = f5615i;
                if (dVar != null) {
                    this.f5617a = dVar;
                }
                f5615i = this;
            }
        }
    }

    @Override // androidx.recyclerview.widget.e0
    public e0.a<T> a(e0.a<T> aVar) {
        return new b(aVar);
    }

    @Override // androidx.recyclerview.widget.e0
    public e0.b<T> b(e0.b<T> bVar) {
        return new a(bVar);
    }
}