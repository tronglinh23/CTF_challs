package androidx.lifecycle;

import androidx.lifecycle.p;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final int f4610k = -1;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f4611l = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f4612a;

    /* renamed from: b  reason: collision with root package name */
    public m.b<i0<? super T>, LiveData<T>.c> f4613b;

    /* renamed from: c  reason: collision with root package name */
    public int f4614c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4615d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f4616e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f4617f;

    /* renamed from: g  reason: collision with root package name */
    public int f4618g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4619h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4620i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f4621j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements v {
        @d.o0

        /* renamed from: o  reason: collision with root package name */
        public final z f4622o;

        public LifecycleBoundObserver(@d.o0 z zVar, i0<? super T> i0Var) {
            super(i0Var);
            this.f4622o = zVar;
        }

        @Override // androidx.lifecycle.v
        public void d(@d.o0 z zVar, @d.o0 p.a aVar) {
            p.b b7 = this.f4622o.getLifecycle().b();
            if (b7 == p.b.DESTROYED) {
                LiveData.this.p(this.f4626k);
                return;
            }
            p.b bVar = null;
            while (bVar != b7) {
                h(k());
                bVar = b7;
                b7 = this.f4622o.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public void i() {
            this.f4622o.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean j(z zVar) {
            return this.f4622o == zVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return this.f4622o.getLifecycle().b().d(p.b.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f4612a) {
                obj = LiveData.this.f4617f;
                LiveData.this.f4617f = LiveData.f4611l;
            }
            LiveData.this.r(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(i0<? super T> i0Var) {
            super(i0Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: k  reason: collision with root package name */
        public final i0<? super T> f4626k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4627l;

        /* renamed from: m  reason: collision with root package name */
        public int f4628m = -1;

        public c(i0<? super T> i0Var) {
            this.f4626k = i0Var;
        }

        public void h(boolean z6) {
            if (z6 == this.f4627l) {
                return;
            }
            this.f4627l = z6;
            LiveData.this.c(z6 ? 1 : -1);
            if (this.f4627l) {
                LiveData.this.e(this);
            }
        }

        public void i() {
        }

        public boolean j(z zVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData(T t6) {
        this.f4612a = new Object();
        this.f4613b = new m.b<>();
        this.f4614c = 0;
        this.f4617f = f4611l;
        this.f4621j = new a();
        this.f4616e = t6;
        this.f4618g = 0;
    }

    public static void b(String str) {
        if (l.c.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    @d.l0
    public void c(int i7) {
        int i8 = this.f4614c;
        this.f4614c = i7 + i8;
        if (this.f4615d) {
            return;
        }
        this.f4615d = true;
        while (true) {
            try {
                int i9 = this.f4614c;
                if (i8 == i9) {
                    return;
                }
                boolean z6 = i8 == 0 && i9 > 0;
                boolean z7 = i8 > 0 && i9 == 0;
                if (z6) {
                    m();
                } else if (z7) {
                    n();
                }
                i8 = i9;
            } finally {
                this.f4615d = false;
            }
        }
    }

    public final void d(LiveData<T>.c cVar) {
        if (cVar.f4627l) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i7 = cVar.f4628m;
            int i8 = this.f4618g;
            if (i7 >= i8) {
                return;
            }
            cVar.f4628m = i8;
            cVar.f4626k.b((Object) this.f4616e);
        }
    }

    public void e(@d.q0 LiveData<T>.c cVar) {
        if (this.f4619h) {
            this.f4620i = true;
            return;
        }
        this.f4619h = true;
        do {
            this.f4620i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                m.b<i0<? super T>, LiveData<T>.c>.d e7 = this.f4613b.e();
                while (e7.hasNext()) {
                    d((c) e7.next().getValue());
                    if (this.f4620i) {
                        break;
                    }
                }
            }
        } while (this.f4620i);
        this.f4619h = false;
    }

    @d.q0
    public T f() {
        T t6 = (T) this.f4616e;
        if (t6 != f4611l) {
            return t6;
        }
        return null;
    }

    public int g() {
        return this.f4618g;
    }

    public boolean h() {
        return this.f4614c > 0;
    }

    public boolean i() {
        return this.f4613b.size() > 0;
    }

    public boolean j() {
        return this.f4616e != f4611l;
    }

    @d.l0
    public void k(@d.o0 z zVar, @d.o0 i0<? super T> i0Var) {
        b("observe");
        if (zVar.getLifecycle().b() == p.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(zVar, i0Var);
        LiveData<T>.c h7 = this.f4613b.h(i0Var, lifecycleBoundObserver);
        if (h7 != null && !h7.j(zVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (h7 != null) {
            return;
        }
        zVar.getLifecycle().a(lifecycleBoundObserver);
    }

    @d.l0
    public void l(@d.o0 i0<? super T> i0Var) {
        b("observeForever");
        b bVar = new b(i0Var);
        LiveData<T>.c h7 = this.f4613b.h(i0Var, bVar);
        if (h7 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (h7 != null) {
            return;
        }
        bVar.h(true);
    }

    public void m() {
    }

    public void n() {
    }

    public void o(T t6) {
        boolean z6;
        synchronized (this.f4612a) {
            z6 = this.f4617f == f4611l;
            this.f4617f = t6;
        }
        if (z6) {
            l.c.h().d(this.f4621j);
        }
    }

    @d.l0
    public void p(@d.o0 i0<? super T> i0Var) {
        b("removeObserver");
        LiveData<T>.c i7 = this.f4613b.i(i0Var);
        if (i7 == null) {
            return;
        }
        i7.i();
        i7.h(false);
    }

    @d.l0
    public void q(@d.o0 z zVar) {
        b("removeObservers");
        Iterator<Map.Entry<i0<? super T>, LiveData<T>.c>> it = this.f4613b.iterator();
        while (it.hasNext()) {
            Map.Entry<i0<? super T>, LiveData<T>.c> next = it.next();
            if (next.getValue().j(zVar)) {
                p(next.getKey());
            }
        }
    }

    @d.l0
    public void r(T t6) {
        b("setValue");
        this.f4618g++;
        this.f4616e = t6;
        e(null);
    }

    public LiveData() {
        this.f4612a = new Object();
        this.f4613b = new m.b<>();
        this.f4614c = 0;
        Object obj = f4611l;
        this.f4617f = obj;
        this.f4621j = new a();
        this.f4616e = obj;
        this.f4618g = -1;
    }
}