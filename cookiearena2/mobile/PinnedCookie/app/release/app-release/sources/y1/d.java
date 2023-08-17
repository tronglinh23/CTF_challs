package y1;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import d.b1;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import u4.l0;
import u4.w;
import x3.a1;
import x3.e0;
import x3.l1;
import y1.d;
/* loaded from: classes.dex */
public final class d {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final String f18729b = "FragmentStrictMode";
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final d f18728a = new d();
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static c f18730c = c.f18742e;

    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(@n6.d n nVar);
    }

    /* loaded from: classes.dex */
    public static final class c {
        @n6.d

        /* renamed from: d  reason: collision with root package name */
        public static final b f18741d = new b(null);
        @n6.d
        @s4.e

        /* renamed from: e  reason: collision with root package name */
        public static final c f18742e = new c(l1.k(), null, a1.z());
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final Set<a> f18743a;
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public final b f18744b;
        @n6.d

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, Set<Class<? extends n>>> f18745c;

        /* loaded from: classes.dex */
        public static final class a {
            @n6.e

            /* renamed from: b  reason: collision with root package name */
            public b f18747b;
            @n6.d

            /* renamed from: a  reason: collision with root package name */
            public final Set<a> f18746a = new LinkedHashSet();
            @n6.d

            /* renamed from: c  reason: collision with root package name */
            public final Map<String, Set<Class<? extends n>>> f18748c = new LinkedHashMap();

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a a(@n6.d Class<? extends Fragment> cls, @n6.d Class<? extends n> cls2) {
                l0.p(cls, "fragmentClass");
                l0.p(cls2, "violationClass");
                String name = cls.getName();
                l0.o(name, "fragmentClassString");
                return b(name, cls2);
            }

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a b(@n6.d String str, @n6.d Class<? extends n> cls) {
                l0.p(str, "fragmentClass");
                l0.p(cls, "violationClass");
                Set<Class<? extends n>> set = this.f18748c.get(str);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                set.add(cls);
                this.f18748c.put(str, set);
                return this;
            }

            @n6.d
            public final c c() {
                if (this.f18747b == null && !this.f18746a.contains(a.PENALTY_DEATH)) {
                    m();
                }
                return new c(this.f18746a, this.f18747b, this.f18748c);
            }

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a d() {
                this.f18746a.add(a.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a e() {
                this.f18746a.add(a.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a f() {
                this.f18746a.add(a.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a g() {
                this.f18746a.add(a.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a h() {
                this.f18746a.add(a.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a i() {
                this.f18746a.add(a.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a j() {
                this.f18746a.add(a.DETECT_WRONG_NESTED_HIERARCHY);
                return this;
            }

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a k() {
                this.f18746a.add(a.PENALTY_DEATH);
                return this;
            }

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a l(@n6.d b bVar) {
                l0.p(bVar, "listener");
                this.f18747b = bVar;
                return this;
            }

            @n6.d
            @SuppressLint({"BuilderSetStyle"})
            public final a m() {
                this.f18746a.add(a.PENALTY_LOG);
                return this;
            }
        }

        /* loaded from: classes.dex */
        public static final class b {
            public /* synthetic */ b(w wVar) {
                this();
            }

            public b() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(@n6.d Set<? extends a> set, @n6.e b bVar, @n6.d Map<String, ? extends Set<Class<? extends n>>> map) {
            l0.p(set, "flags");
            l0.p(map, "allowedViolations");
            this.f18743a = set;
            this.f18744b = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends n>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f18745c = linkedHashMap;
        }

        @n6.d
        public final Set<a> a() {
            return this.f18743a;
        }

        @n6.e
        public final b b() {
            return this.f18744b;
        }

        @n6.d
        public final Map<String, Set<Class<? extends n>>> c() {
            return this.f18745c;
        }
    }

    public static final void f(c cVar, n nVar) {
        l0.p(cVar, "$policy");
        l0.p(nVar, "$violation");
        cVar.b().a(nVar);
    }

    public static final void g(String str, n nVar) {
        l0.p(nVar, "$violation");
        Log.e(f18729b, "Policy violation with PENALTY_DEATH in " + str, nVar);
        throw nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.LIBRARY})
    @s4.m
    public static final void i(@n6.d Fragment fragment, @n6.d String str) {
        l0.p(fragment, "fragment");
        l0.p(str, "previousFragmentId");
        y1.a aVar = new y1.a(fragment, str);
        d dVar = f18728a;
        dVar.h(aVar);
        c d7 = dVar.d(fragment);
        if (d7.a().contains(a.DETECT_FRAGMENT_REUSE) && dVar.v(d7, fragment.getClass(), aVar.getClass())) {
            dVar.e(d7, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.LIBRARY})
    @s4.m
    public static final void j(@n6.d Fragment fragment, @n6.e ViewGroup viewGroup) {
        l0.p(fragment, "fragment");
        e eVar = new e(fragment, viewGroup);
        d dVar = f18728a;
        dVar.h(eVar);
        c d7 = dVar.d(fragment);
        if (d7.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && dVar.v(d7, fragment.getClass(), eVar.getClass())) {
            dVar.e(d7, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.LIBRARY})
    @s4.m
    public static final void k(@n6.d Fragment fragment) {
        l0.p(fragment, "fragment");
        f fVar = new f(fragment);
        d dVar = f18728a;
        dVar.h(fVar);
        c d7 = dVar.d(fragment);
        if (d7.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && dVar.v(d7, fragment.getClass(), fVar.getClass())) {
            dVar.e(d7, fVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.LIBRARY})
    @s4.m
    public static final void l(@n6.d Fragment fragment) {
        l0.p(fragment, "fragment");
        g gVar = new g(fragment);
        d dVar = f18728a;
        dVar.h(gVar);
        c d7 = dVar.d(fragment);
        if (d7.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.v(d7, fragment.getClass(), gVar.getClass())) {
            dVar.e(d7, gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.LIBRARY})
    @s4.m
    public static final void m(@n6.d Fragment fragment) {
        l0.p(fragment, "fragment");
        h hVar = new h(fragment);
        d dVar = f18728a;
        dVar.h(hVar);
        c d7 = dVar.d(fragment);
        if (d7.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.v(d7, fragment.getClass(), hVar.getClass())) {
            dVar.e(d7, hVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.LIBRARY})
    @s4.m
    public static final void o(@n6.d Fragment fragment) {
        l0.p(fragment, "fragment");
        j jVar = new j(fragment);
        d dVar = f18728a;
        dVar.h(jVar);
        c d7 = dVar.d(fragment);
        if (d7.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && dVar.v(d7, fragment.getClass(), jVar.getClass())) {
            dVar.e(d7, jVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.LIBRARY})
    @s4.m
    public static final void p(@n6.d Fragment fragment, @n6.d Fragment fragment2, int i7) {
        l0.p(fragment, "violatingFragment");
        l0.p(fragment2, "targetFragment");
        k kVar = new k(fragment, fragment2, i7);
        d dVar = f18728a;
        dVar.h(kVar);
        c d7 = dVar.d(fragment);
        if (d7.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.v(d7, fragment.getClass(), kVar.getClass())) {
            dVar.e(d7, kVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.LIBRARY})
    @s4.m
    public static final void q(@n6.d Fragment fragment, boolean z6) {
        l0.p(fragment, "fragment");
        l lVar = new l(fragment, z6);
        d dVar = f18728a;
        dVar.h(lVar);
        c d7 = dVar.d(fragment);
        if (d7.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && dVar.v(d7, fragment.getClass(), lVar.getClass())) {
            dVar.e(d7, lVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.LIBRARY})
    @s4.m
    public static final void r(@n6.d Fragment fragment, @n6.d ViewGroup viewGroup) {
        l0.p(fragment, "fragment");
        l0.p(viewGroup, "container");
        o oVar = new o(fragment, viewGroup);
        d dVar = f18728a;
        dVar.h(oVar);
        c d7 = dVar.d(fragment);
        if (d7.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && dVar.v(d7, fragment.getClass(), oVar.getClass())) {
            dVar.e(d7, oVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.LIBRARY})
    @s4.m
    public static final void s(@n6.d Fragment fragment, @n6.d Fragment fragment2, int i7) {
        l0.p(fragment, "fragment");
        l0.p(fragment2, "expectedParentFragment");
        p pVar = new p(fragment, fragment2, i7);
        d dVar = f18728a;
        dVar.h(pVar);
        c d7 = dVar.d(fragment);
        if (d7.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && dVar.v(d7, fragment.getClass(), pVar.getClass())) {
            dVar.e(d7, pVar);
        }
    }

    @n6.d
    public final c c() {
        return f18730c;
    }

    public final c d(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                l0.o(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.Q0() != null) {
                    c Q0 = parentFragmentManager.Q0();
                    l0.m(Q0);
                    return Q0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f18730c;
    }

    public final void e(final c cVar, final n nVar) {
        Fragment a7 = nVar.a();
        final String name = a7.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Policy violation in ");
            sb.append(name);
        }
        if (cVar.b() != null) {
            t(a7, new Runnable() { // from class: y1.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.f(d.c.this, nVar);
                }
            });
        }
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            t(a7, new Runnable() { // from class: y1.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.g(name, nVar);
                }
            });
        }
    }

    public final void h(n nVar) {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("StrictMode violation in ");
            sb.append(nVar.a().getClass().getName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d.l1
    public final void n(@n6.d n nVar) {
        l0.p(nVar, "violation");
        h(nVar);
        Fragment a7 = nVar.a();
        c d7 = d(a7);
        if (v(d7, a7.getClass(), nVar.getClass())) {
            e(d7, nVar);
        }
    }

    public final void t(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler l7 = fragment.getParentFragmentManager().K0().l();
        l0.o(l7, "fragment.parentFragmentManager.host.handler");
        if (l0.g(l7.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            l7.post(runnable);
        }
    }

    public final void u(@n6.d c cVar) {
        l0.p(cVar, "<set-?>");
        f18730c = cVar;
    }

    public final boolean v(c cVar, Class<? extends Fragment> cls, Class<? extends n> cls2) {
        Set<Class<? extends n>> set = cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (l0.g(cls2.getSuperclass(), n.class) || !e0.R1(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
