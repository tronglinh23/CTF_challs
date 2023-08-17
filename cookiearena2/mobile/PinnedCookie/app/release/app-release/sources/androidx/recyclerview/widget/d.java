package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.i;
import d.o0;
import d.q0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class d<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final Executor f5264h = new c();

    /* renamed from: a  reason: collision with root package name */
    public final t f5265a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.recyclerview.widget.c<T> f5266b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f5267c;

    /* renamed from: d  reason: collision with root package name */
    public final List<b<T>> f5268d;
    @q0

    /* renamed from: e  reason: collision with root package name */
    public List<T> f5269e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public List<T> f5270f;

    /* renamed from: g  reason: collision with root package name */
    public int f5271g;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ List f5272k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ List f5273l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ int f5274m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ Runnable f5275n;

        /* renamed from: androidx.recyclerview.widget.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0063a extends i.b {
            public C0063a() {
            }

            @Override // androidx.recyclerview.widget.i.b
            public boolean a(int i7, int i8) {
                Object obj = a.this.f5272k.get(i7);
                Object obj2 = a.this.f5273l.get(i8);
                if (obj == null || obj2 == null) {
                    if (obj == null && obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }
                return d.this.f5266b.b().a(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.i.b
            public boolean b(int i7, int i8) {
                Object obj = a.this.f5272k.get(i7);
                Object obj2 = a.this.f5273l.get(i8);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f5266b.b().b(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.i.b
            @q0
            public Object c(int i7, int i8) {
                Object obj = a.this.f5272k.get(i7);
                Object obj2 = a.this.f5273l.get(i8);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f5266b.b().c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.i.b
            public int d() {
                return a.this.f5273l.size();
            }

            @Override // androidx.recyclerview.widget.i.b
            public int e() {
                return a.this.f5272k.size();
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ i.c f5278k;

            public b(i.c cVar) {
                this.f5278k = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f5271g == aVar.f5274m) {
                    dVar.c(aVar.f5273l, this.f5278k, aVar.f5275n);
                }
            }
        }

        public a(List list, List list2, int i7, Runnable runnable) {
            this.f5272k = list;
            this.f5273l = list2;
            this.f5274m = i7;
            this.f5275n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f5267c.execute(new b(i.a(new C0063a())));
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(@o0 List<T> list, @o0 List<T> list2);
    }

    /* loaded from: classes.dex */
    public static class c implements Executor {

        /* renamed from: k  reason: collision with root package name */
        public final Handler f5280k = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            this.f5280k.post(runnable);
        }
    }

    public d(@o0 RecyclerView.g gVar, @o0 i.d<T> dVar) {
        this(new androidx.recyclerview.widget.b(gVar), new c.a(dVar).a());
    }

    public void a(@o0 b<T> bVar) {
        this.f5268d.add(bVar);
    }

    @o0
    public List<T> b() {
        return this.f5270f;
    }

    public void c(@o0 List<T> list, @o0 i.c cVar, @q0 Runnable runnable) {
        List<T> list2 = this.f5270f;
        this.f5269e = list;
        this.f5270f = Collections.unmodifiableList(list);
        cVar.f(this.f5265a);
        d(list2, runnable);
    }

    public final void d(@o0 List<T> list, @q0 Runnable runnable) {
        Iterator<b<T>> it = this.f5268d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f5270f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void e(@o0 b<T> bVar) {
        this.f5268d.remove(bVar);
    }

    public void f(@q0 List<T> list) {
        g(list, null);
    }

    public void g(@q0 List<T> list, @q0 Runnable runnable) {
        int i7 = this.f5271g + 1;
        this.f5271g = i7;
        List<T> list2 = this.f5269e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f5270f;
        if (list == null) {
            int size = list2.size();
            this.f5269e = null;
            this.f5270f = Collections.emptyList();
            this.f5265a.a(0, size);
            d(list3, runnable);
        } else if (list2 != null) {
            this.f5266b.a().execute(new a(list2, list, i7, runnable));
        } else {
            this.f5269e = list;
            this.f5270f = Collections.unmodifiableList(list);
            this.f5265a.c(0, list.size());
            d(list3, runnable);
        }
    }

    public d(@o0 t tVar, @o0 androidx.recyclerview.widget.c<T> cVar) {
        this.f5268d = new CopyOnWriteArrayList();
        this.f5270f = Collections.emptyList();
        this.f5265a = tVar;
        this.f5266b = cVar;
        if (cVar.c() != null) {
            this.f5267c = cVar.c();
        } else {
            this.f5267c = f5264h;
        }
    }
}
