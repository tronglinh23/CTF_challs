package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.i;
import androidx.window.layout.p;
import d.l1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import u4.l0;
import v3.m2;
/* loaded from: classes.dex */
public final class p implements r {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7100d = false;
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public static volatile p f7101e = null;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public static final String f7103g = "WindowServer";
    @d.b0("globalLock")
    @n6.e
    @l1

    /* renamed from: a  reason: collision with root package name */
    public i f7104a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<c> f7105b = new CopyOnWriteArrayList<>();
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final a f7099c = new a(null);
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final ReentrantLock f7102f = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final p a(@n6.d Context context) {
            l0.p(context, "context");
            if (p.f7101e == null) {
                ReentrantLock reentrantLock = p.f7102f;
                reentrantLock.lock();
                try {
                    if (p.f7101e == null) {
                        p.f7101e = new p(p.f7099c.b(context));
                    }
                    m2 m2Var = m2.f17815a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            p pVar = p.f7101e;
            l0.m(pVar);
            return pVar;
        }

        @n6.e
        public final i b(@n6.d Context context) {
            l0.p(context, "context");
            try {
                if (c(SidecarCompat.f7029f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.a()) {
                        return sidecarCompat;
                    }
                    return null;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        @l1
        public final boolean c(@n6.e t3.i iVar) {
            return iVar != null && iVar.compareTo(t3.i.f16847p.c()) >= 0;
        }

        @l1
        public final void d() {
            p.f7101e = null;
        }

        public a() {
        }
    }

    @l1
    /* loaded from: classes.dex */
    public final class b implements i.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7106a;

        public b(p pVar) {
            l0.p(pVar, "this$0");
            this.f7106a = pVar;
        }

        @Override // androidx.window.layout.i.a
        @SuppressLint({"SyntheticAccessor"})
        public void a(@n6.d Activity activity, @n6.d w wVar) {
            l0.p(activity, androidx.appcompat.widget.d.f1516r);
            l0.p(wVar, "newLayout");
            Iterator<c> it = this.f7106a.h().iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (l0.g(next.d(), activity)) {
                    next.b(wVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final Activity f7107a;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public final Executor f7108b;
        @n6.d

        /* renamed from: c  reason: collision with root package name */
        public final g1.e<w> f7109c;
        @n6.e

        /* renamed from: d  reason: collision with root package name */
        public w f7110d;

        public c(@n6.d Activity activity, @n6.d Executor executor, @n6.d g1.e<w> eVar) {
            l0.p(activity, androidx.appcompat.widget.d.f1516r);
            l0.p(executor, "executor");
            l0.p(eVar, "callback");
            this.f7107a = activity;
            this.f7108b = executor;
            this.f7109c = eVar;
        }

        public static final void c(c cVar, w wVar) {
            l0.p(cVar, "this$0");
            l0.p(wVar, "$newLayoutInfo");
            cVar.f7109c.accept(wVar);
        }

        public final void b(@n6.d final w wVar) {
            l0.p(wVar, "newLayoutInfo");
            this.f7110d = wVar;
            this.f7108b.execute(new Runnable() { // from class: androidx.window.layout.q
                @Override // java.lang.Runnable
                public final void run() {
                    p.c.c(p.c.this, wVar);
                }
            });
        }

        @n6.d
        public final Activity d() {
            return this.f7107a;
        }

        @n6.d
        public final g1.e<w> e() {
            return this.f7109c;
        }

        @n6.e
        public final w f() {
            return this.f7110d;
        }

        public final void g(@n6.e w wVar) {
            this.f7110d = wVar;
        }
    }

    @l1
    public p(@n6.e i iVar) {
        this.f7104a = iVar;
        i iVar2 = this.f7104a;
        if (iVar2 == null) {
            return;
        }
        iVar2.c(new b(this));
    }

    @l1
    public static /* synthetic */ void i() {
    }

    @Override // androidx.window.layout.r
    public void a(@n6.d g1.e<w> eVar) {
        l0.p(eVar, "callback");
        synchronized (f7102f) {
            if (g() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<c> it = h().iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.e() == eVar) {
                    l0.o(next, "callbackWrapper");
                    arrayList.add(next);
                }
            }
            h().removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                f(((c) it2.next()).d());
            }
            m2 m2Var = m2.f17815a;
        }
    }

    @Override // androidx.window.layout.r
    public void b(@n6.d Activity activity, @n6.d Executor executor, @n6.d g1.e<w> eVar) {
        w wVar;
        Object obj;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        l0.p(executor, "executor");
        l0.p(eVar, "callback");
        ReentrantLock reentrantLock = f7102f;
        reentrantLock.lock();
        try {
            i g7 = g();
            if (g7 == null) {
                eVar.accept(new w(x3.w.E()));
                return;
            }
            boolean j7 = j(activity);
            c cVar = new c(activity, executor, eVar);
            h().add(cVar);
            if (j7) {
                Iterator<T> it = h().iterator();
                while (true) {
                    wVar = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (l0.g(activity, ((c) obj).d())) {
                        break;
                    }
                }
                c cVar2 = (c) obj;
                if (cVar2 != null) {
                    wVar = cVar2.f();
                }
                if (wVar != null) {
                    cVar.b(wVar);
                }
            } else {
                g7.b(activity);
            }
            m2 m2Var = m2.f17815a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @d.b0("sLock")
    public final void f(Activity activity) {
        i iVar;
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f7105b;
        boolean z6 = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (l0.g(((c) it.next()).d(), activity)) {
                    z6 = true;
                    break;
                }
            }
        }
        if (z6 || (iVar = this.f7104a) == null) {
            return;
        }
        iVar.d(activity);
    }

    @n6.e
    public final i g() {
        return this.f7104a;
    }

    @n6.d
    public final CopyOnWriteArrayList<c> h() {
        return this.f7105b;
    }

    public final boolean j(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f7105b;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (l0.g(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }

    public final void k(@n6.e i iVar) {
        this.f7104a = iVar;
    }
}
