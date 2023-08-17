package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import u4.l0;
import v3.m2;

/* loaded from: classes.dex */
public final class j implements r {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f7056a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f7057b;
    @n6.d
    @d.b0("lock")

    /* renamed from: c  reason: collision with root package name */
    public final Map<Activity, a> f7058c;
    @n6.d
    @d.b0("lock")

    /* renamed from: d  reason: collision with root package name */
    public final Map<g1.e<w>, Activity> f7059d;

    @SuppressLint({"NewApi"})
    /* loaded from: classes.dex */
    public static final class a implements Consumer<WindowLayoutInfo> {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final Activity f7060k;
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public final ReentrantLock f7061l;
        @d.b0("lock")
        @n6.e

        /* renamed from: m  reason: collision with root package name */
        public w f7062m;
        @n6.d
        @d.b0("lock")

        /* renamed from: n  reason: collision with root package name */
        public final Set<g1.e<w>> f7063n;

        public a(@n6.d Activity activity) {
            l0.p(activity, androidx.appcompat.widget.d.f1516r);
            this.f7060k = activity;
            this.f7061l = new ReentrantLock();
            this.f7063n = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public void accept(@n6.d WindowLayoutInfo windowLayoutInfo) {
            l0.p(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.f7061l;
            reentrantLock.lock();
            try {
                this.f7062m = k.f7064a.b(this.f7060k, windowLayoutInfo);
                Iterator<T> it = this.f7063n.iterator();
                while (it.hasNext()) {
                    ((g1.e) it.next()).accept(this.f7062m);
                }
                m2 m2Var = m2.f17815a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(@n6.d g1.e<w> eVar) {
            l0.p(eVar, "listener");
            ReentrantLock reentrantLock = this.f7061l;
            reentrantLock.lock();
            try {
                w wVar = this.f7062m;
                if (wVar != null) {
                    eVar.accept(wVar);
                }
                this.f7063n.add(eVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean c() {
            return this.f7063n.isEmpty();
        }

        public final void d(@n6.d g1.e<w> eVar) {
            l0.p(eVar, "listener");
            ReentrantLock reentrantLock = this.f7061l;
            reentrantLock.lock();
            try {
                this.f7063n.remove(eVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public j(@n6.d WindowLayoutComponent windowLayoutComponent) {
        l0.p(windowLayoutComponent, "component");
        this.f7056a = windowLayoutComponent;
        this.f7057b = new ReentrantLock();
        this.f7058c = new LinkedHashMap();
        this.f7059d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.r
    public void a(@n6.d g1.e<w> eVar) {
        l0.p(eVar, "callback");
        ReentrantLock reentrantLock = this.f7057b;
        reentrantLock.lock();
        try {
            Activity activity = this.f7059d.get(eVar);
            if (activity == null) {
                return;
            }
            a aVar = this.f7058c.get(activity);
            if (aVar == null) {
                return;
            }
            aVar.d(eVar);
            if (aVar.c()) {
                this.f7056a.removeWindowLayoutInfoListener(aVar);
            }
            m2 m2Var = m2.f17815a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.r
    public void b(@n6.d Activity activity, @n6.d Executor executor, @n6.d g1.e<w> eVar) {
        m2 m2Var;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        l0.p(executor, "executor");
        l0.p(eVar, "callback");
        ReentrantLock reentrantLock = this.f7057b;
        reentrantLock.lock();
        try {
            a aVar = this.f7058c.get(activity);
            if (aVar == null) {
                m2Var = null;
            } else {
                aVar.b(eVar);
                this.f7059d.put(eVar, activity);
                m2Var = m2.f17815a;
            }
            if (m2Var == null) {
                a aVar2 = new a(activity);
                this.f7058c.put(activity, aVar2);
                this.f7059d.put(eVar, activity);
                aVar2.b(eVar);
                this.f7056a.addWindowLayoutInfoListener(activity, aVar2);
            }
            m2 m2Var2 = m2.f17815a;
        } finally {
            reentrantLock.unlock();
        }
    }
}