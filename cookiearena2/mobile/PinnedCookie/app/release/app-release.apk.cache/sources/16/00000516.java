package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.u1;
import androidx.fragment.app.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import u4.r1;
import v3.m2;
import x1.a;
import z0.j;

@r1({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
/* loaded from: classes.dex */
public abstract class f1 {
    @n6.d

    /* renamed from: f */
    public static final a f4354f = new a(null);
    @n6.d

    /* renamed from: a */
    public final ViewGroup f4355a;
    @n6.d

    /* renamed from: b */
    public final List<c> f4356b;
    @n6.d

    /* renamed from: c */
    public final List<c> f4357c;

    /* renamed from: d */
    public boolean f4358d;

    /* renamed from: e */
    public boolean f4359e;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        @s4.m
        public final f1 a(@n6.d ViewGroup viewGroup, @n6.d FragmentManager fragmentManager) {
            u4.l0.p(viewGroup, "container");
            u4.l0.p(fragmentManager, "fragmentManager");
            h1 P0 = fragmentManager.P0();
            u4.l0.o(P0, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, P0);
        }

        @n6.d
        @s4.m
        public final f1 b(@n6.d ViewGroup viewGroup, @n6.d h1 h1Var) {
            u4.l0.p(viewGroup, "container");
            u4.l0.p(h1Var, "factory");
            Object tag = viewGroup.getTag(a.c.f18265b);
            if (tag instanceof f1) {
                return (f1) tag;
            }
            f1 a7 = h1Var.a(viewGroup);
            u4.l0.o(a7, "factory.createController(container)");
            viewGroup.setTag(a.c.f18265b, a7);
            return a7;
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends c {
        @n6.d

        /* renamed from: h */
        public final q0 f4360h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(@n6.d androidx.fragment.app.f1.c.b r3, @n6.d androidx.fragment.app.f1.c.a r4, @n6.d androidx.fragment.app.q0 r5, @n6.d z0.j r6) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                u4.l0.p(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                u4.l0.p(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                u4.l0.p(r5, r0)
                java.lang.String r0 = "cancellationSignal"
                u4.l0.p(r6, r0)
                androidx.fragment.app.Fragment r0 = r5.k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                u4.l0.o(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.f4360h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f1.b.<init>(androidx.fragment.app.f1$c$b, androidx.fragment.app.f1$c$a, androidx.fragment.app.q0, z0.j):void");
        }

        @Override // androidx.fragment.app.f1.c
        public void e() {
            super.e();
            this.f4360h.m();
        }

        @Override // androidx.fragment.app.f1.c
        public void n() {
            if (i() != c.a.ADDING) {
                if (i() == c.a.REMOVING) {
                    Fragment k7 = this.f4360h.k();
                    u4.l0.o(k7, "fragmentStateManager.fragment");
                    View requireView = k7.requireView();
                    u4.l0.o(requireView, "fragment.requireView()");
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Clearing focus ");
                        sb.append(requireView.findFocus());
                        sb.append(" on view ");
                        sb.append(requireView);
                        sb.append(" for Fragment ");
                        sb.append(k7);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment k8 = this.f4360h.k();
            u4.l0.o(k8, "fragmentStateManager.fragment");
            View findFocus = k8.mView.findFocus();
            if (findFocus != null) {
                k8.setFocusedView(findFocus);
                if (FragmentManager.X0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("requestFocus: Saved focused view ");
                    sb2.append(findFocus);
                    sb2.append(" for Fragment ");
                    sb2.append(k8);
                }
            }
            View requireView2 = h().requireView();
            u4.l0.o(requireView2, "this.fragment.requireView()");
            if (requireView2.getParent() == null) {
                this.f4360h.b();
                requireView2.setAlpha(0.0f);
            }
            if ((requireView2.getAlpha() == 0.0f) && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(k8.getPostOnViewCreatedAlpha());
        }
    }

    @r1({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    /* loaded from: classes.dex */
    public static class c {
        @n6.d

        /* renamed from: a */
        public b f4361a;
        @n6.d

        /* renamed from: b */
        public a f4362b;
        @n6.d

        /* renamed from: c */
        public final Fragment f4363c;
        @n6.d

        /* renamed from: d */
        public final List<Runnable> f4364d;
        @n6.d

        /* renamed from: e */
        public final Set<z0.j> f4365e;

        /* renamed from: f */
        public boolean f4366f;

        /* renamed from: g */
        public boolean f4367g;

        /* loaded from: classes.dex */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes.dex */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;
            
            @n6.d

            /* renamed from: k */
            public static final a f4372k = new a(null);

            /* loaded from: classes.dex */
            public static final class a {
                public /* synthetic */ a(u4.w wVar) {
                    this();
                }

                @n6.d
                public final b a(@n6.d View view) {
                    u4.l0.p(view, "<this>");
                    return (((view.getAlpha() > 0.0f ? 1 : (view.getAlpha() == 0.0f ? 0 : -1)) == 0) && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                @n6.d
                @s4.m
                public final b b(int i7) {
                    if (i7 != 0) {
                        if (i7 != 4) {
                            if (i7 == 8) {
                                return b.GONE;
                            }
                            throw new IllegalArgumentException("Unknown visibility " + i7);
                        }
                        return b.INVISIBLE;
                    }
                    return b.VISIBLE;
                }

                public a() {
                }
            }

            /* renamed from: androidx.fragment.app.f1$c$b$b */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0046b {

                /* renamed from: a */
                public static final /* synthetic */ int[] f4378a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f4378a = iArr;
                }
            }

            @n6.d
            @s4.m
            public static final b e(int i7) {
                return f4372k.b(i7);
            }

            public final void d(@n6.d View view) {
                u4.l0.p(view, "view");
                int i7 = C0046b.f4378a[ordinal()];
                if (i7 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.X0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i7 == 2) {
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i7 == 3) {
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: Setting view ");
                        sb3.append(view);
                        sb3.append(" to GONE");
                    }
                    view.setVisibility(8);
                } else if (i7 != 4) {
                } else {
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SpecialEffectsController: Setting view ");
                        sb4.append(view);
                        sb4.append(" to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        /* renamed from: androidx.fragment.app.f1$c$c */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0047c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f4379a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4379a = iArr;
            }
        }

        public c(@n6.d b bVar, @n6.d a aVar, @n6.d Fragment fragment, @n6.d z0.j jVar) {
            u4.l0.p(bVar, "finalState");
            u4.l0.p(aVar, "lifecycleImpact");
            u4.l0.p(fragment, "fragment");
            u4.l0.p(jVar, "cancellationSignal");
            this.f4361a = bVar;
            this.f4362b = aVar;
            this.f4363c = fragment;
            this.f4364d = new ArrayList();
            this.f4365e = new LinkedHashSet();
            jVar.d(new j.b() { // from class: androidx.fragment.app.g1
                @Override // z0.j.b
                public final void onCancel() {
                    f1.c.a(f1.c.this);
                }
            });
        }

        public static /* synthetic */ void a(c cVar) {
            b(cVar);
        }

        public static final void b(c cVar) {
            u4.l0.p(cVar, "this$0");
            cVar.d();
        }

        public final void c(@n6.d Runnable runnable) {
            u4.l0.p(runnable, "listener");
            this.f4364d.add(runnable);
        }

        public final void d() {
            if (this.f4366f) {
                return;
            }
            this.f4366f = true;
            if (this.f4365e.isEmpty()) {
                e();
                return;
            }
            Iterator it = x3.e0.U5(this.f4365e).iterator();
            while (it.hasNext()) {
                ((z0.j) it.next()).a();
            }
        }

        @d.i
        public void e() {
            if (this.f4367g) {
                return;
            }
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
            }
            this.f4367g = true;
            Iterator<T> it = this.f4364d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(@n6.d z0.j jVar) {
            u4.l0.p(jVar, "signal");
            if (this.f4365e.remove(jVar) && this.f4365e.isEmpty()) {
                e();
            }
        }

        @n6.d
        public final b g() {
            return this.f4361a;
        }

        @n6.d
        public final Fragment h() {
            return this.f4363c;
        }

        @n6.d
        public final a i() {
            return this.f4362b;
        }

        public final boolean j() {
            return this.f4366f;
        }

        public final boolean k() {
            return this.f4367g;
        }

        public final void l(@n6.d z0.j jVar) {
            u4.l0.p(jVar, "signal");
            n();
            this.f4365e.add(jVar);
        }

        public final void m(@n6.d b bVar, @n6.d a aVar) {
            u4.l0.p(bVar, "finalState");
            u4.l0.p(aVar, "lifecycleImpact");
            int i7 = C0047c.f4379a[aVar.ordinal()];
            if (i7 == 1) {
                if (this.f4361a == b.REMOVED) {
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: For fragment ");
                        sb.append(this.f4363c);
                        sb.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        sb.append(this.f4362b);
                        sb.append(" to ADDING.");
                    }
                    this.f4361a = b.VISIBLE;
                    this.f4362b = a.ADDING;
                }
            } else if (i7 == 2) {
                if (FragmentManager.X0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.f4363c);
                    sb2.append(" mFinalState = ");
                    sb2.append(this.f4361a);
                    sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb2.append(this.f4362b);
                    sb2.append(" to REMOVING.");
                }
                this.f4361a = b.REMOVED;
                this.f4362b = a.REMOVING;
            } else if (i7 == 3 && this.f4361a != b.REMOVED) {
                if (FragmentManager.X0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.f4363c);
                    sb3.append(" mFinalState = ");
                    sb3.append(this.f4361a);
                    sb3.append(" -> ");
                    sb3.append(bVar);
                    sb3.append('.');
                }
                this.f4361a = bVar;
            }
        }

        public void n() {
        }

        public final void o(@n6.d b bVar) {
            u4.l0.p(bVar, "<set-?>");
            this.f4361a = bVar;
        }

        public final void p(@n6.d a aVar) {
            u4.l0.p(aVar, "<set-?>");
            this.f4362b = aVar;
        }

        @n6.d
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f4361a + " lifecycleImpact = " + this.f4362b + " fragment = " + this.f4363c + '}';
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4380a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4380a = iArr;
        }
    }

    public f1(@n6.d ViewGroup viewGroup) {
        u4.l0.p(viewGroup, "container");
        this.f4355a = viewGroup;
        this.f4356b = new ArrayList();
        this.f4357c = new ArrayList();
    }

    public static /* synthetic */ void a(f1 f1Var, b bVar) {
        e(f1Var, bVar);
    }

    public static /* synthetic */ void b(f1 f1Var, b bVar) {
        d(f1Var, bVar);
    }

    public static final void d(f1 f1Var, b bVar) {
        u4.l0.p(f1Var, "this$0");
        u4.l0.p(bVar, "$operation");
        if (f1Var.f4356b.contains(bVar)) {
            c.b g7 = bVar.g();
            View view = bVar.h().mView;
            u4.l0.o(view, "operation.fragment.mView");
            g7.d(view);
        }
    }

    public static final void e(f1 f1Var, b bVar) {
        u4.l0.p(f1Var, "this$0");
        u4.l0.p(bVar, "$operation");
        f1Var.f4356b.remove(bVar);
        f1Var.f4357c.remove(bVar);
    }

    @n6.d
    @s4.m
    public static final f1 r(@n6.d ViewGroup viewGroup, @n6.d FragmentManager fragmentManager) {
        return f4354f.a(viewGroup, fragmentManager);
    }

    @n6.d
    @s4.m
    public static final f1 s(@n6.d ViewGroup viewGroup, @n6.d h1 h1Var) {
        return f4354f.b(viewGroup, h1Var);
    }

    public final void c(c.b bVar, c.a aVar, q0 q0Var) {
        synchronized (this.f4356b) {
            z0.j jVar = new z0.j();
            Fragment k7 = q0Var.k();
            u4.l0.o(k7, "fragmentStateManager.fragment");
            c l7 = l(k7);
            if (l7 != null) {
                l7.m(bVar, aVar);
                return;
            }
            final b bVar2 = new b(bVar, aVar, q0Var, jVar);
            this.f4356b.add(bVar2);
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.d1
                @Override // java.lang.Runnable
                public final void run() {
                    f1.b(f1.this, bVar2);
                }
            });
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.e1
                @Override // java.lang.Runnable
                public final void run() {
                    f1.a(f1.this, bVar2);
                }
            });
            m2 m2Var = m2.f17815a;
        }
    }

    public final void f(@n6.d c.b bVar, @n6.d q0 q0Var) {
        u4.l0.p(bVar, "finalState");
        u4.l0.p(q0Var, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(q0Var.k());
        }
        c(bVar, c.a.ADDING, q0Var);
    }

    public final void g(@n6.d q0 q0Var) {
        u4.l0.p(q0Var, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(q0Var.k());
        }
        c(c.b.GONE, c.a.NONE, q0Var);
    }

    public final void h(@n6.d q0 q0Var) {
        u4.l0.p(q0Var, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(q0Var.k());
        }
        c(c.b.REMOVED, c.a.REMOVING, q0Var);
    }

    public final void i(@n6.d q0 q0Var) {
        u4.l0.p(q0Var, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(q0Var.k());
        }
        c(c.b.VISIBLE, c.a.NONE, q0Var);
    }

    public abstract void j(@n6.d List<c> list, boolean z6);

    public final void k() {
        if (this.f4359e) {
            return;
        }
        if (!u1.O0(this.f4355a)) {
            n();
            this.f4358d = false;
            return;
        }
        synchronized (this.f4356b) {
            if ((!this.f4356b.isEmpty()) != false) {
                List<c> T5 = x3.e0.T5(this.f4357c);
                this.f4357c.clear();
                for (c cVar : T5) {
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Cancelling operation ");
                        sb.append(cVar);
                    }
                    cVar.d();
                    if (!cVar.k()) {
                        this.f4357c.add(cVar);
                    }
                }
                u();
                List<c> T52 = x3.e0.T5(this.f4356b);
                this.f4356b.clear();
                this.f4357c.addAll(T52);
                FragmentManager.X0(2);
                Iterator<c> it = T52.iterator();
                while (it.hasNext()) {
                    it.next().n();
                }
                j(T52, this.f4358d);
                this.f4358d = false;
                FragmentManager.X0(2);
            }
            m2 m2Var = m2.f17815a;
        }
    }

    public final c l(Fragment fragment) {
        Object obj;
        Iterator<T> it = this.f4356b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c cVar = (c) obj;
            if (u4.l0.g(cVar.h(), fragment) && !cVar.j()) {
                break;
            }
        }
        return (c) obj;
    }

    public final c m(Fragment fragment) {
        Object obj;
        Iterator<T> it = this.f4357c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c cVar = (c) obj;
            if (u4.l0.g(cVar.h(), fragment) && !cVar.j()) {
                break;
            }
        }
        return (c) obj;
    }

    public final void n() {
        FragmentManager.X0(2);
        boolean O0 = u1.O0(this.f4355a);
        synchronized (this.f4356b) {
            u();
            Iterator<c> it = this.f4356b.iterator();
            while (it.hasNext()) {
                it.next().n();
            }
            for (c cVar : x3.e0.T5(this.f4357c)) {
                if (FragmentManager.X0(2)) {
                    String str = O0 ? "" : "Container " + this.f4355a + " is not attached to window. ";
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(str);
                    sb.append("Cancelling running operation ");
                    sb.append(cVar);
                }
                cVar.d();
            }
            for (c cVar2 : x3.e0.T5(this.f4356b)) {
                if (FragmentManager.X0(2)) {
                    String str2 = O0 ? "" : "Container " + this.f4355a + " is not attached to window. ";
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(str2);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(cVar2);
                }
                cVar2.d();
            }
            m2 m2Var = m2.f17815a;
        }
    }

    public final void o() {
        if (this.f4359e) {
            FragmentManager.X0(2);
            this.f4359e = false;
            k();
        }
    }

    @n6.e
    public final c.a p(@n6.d q0 q0Var) {
        u4.l0.p(q0Var, "fragmentStateManager");
        Fragment k7 = q0Var.k();
        u4.l0.o(k7, "fragmentStateManager.fragment");
        c l7 = l(k7);
        c.a i7 = l7 != null ? l7.i() : null;
        c m7 = m(k7);
        c.a i8 = m7 != null ? m7.i() : null;
        int i9 = i7 == null ? -1 : d.f4380a[i7.ordinal()];
        return (i9 == -1 || i9 == 1) ? i8 : i7;
    }

    @n6.d
    public final ViewGroup q() {
        return this.f4355a;
    }

    public final void t() {
        c cVar;
        synchronized (this.f4356b) {
            u();
            List<c> list = this.f4356b;
            ListIterator<c> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    cVar = null;
                    break;
                }
                cVar = listIterator.previous();
                c cVar2 = cVar;
                c.b.a aVar = c.b.f4372k;
                View view = cVar2.h().mView;
                u4.l0.o(view, "operation.fragment.mView");
                c.b a7 = aVar.a(view);
                c.b g7 = cVar2.g();
                c.b bVar = c.b.VISIBLE;
                if (g7 == bVar && a7 != bVar) {
                    break;
                }
            }
            c cVar3 = cVar;
            Fragment h7 = cVar3 != null ? cVar3.h() : null;
            this.f4359e = h7 != null ? h7.isPostponed() : false;
            m2 m2Var = m2.f17815a;
        }
    }

    public final void u() {
        for (c cVar : this.f4356b) {
            if (cVar.i() == c.a.ADDING) {
                View requireView = cVar.h().requireView();
                u4.l0.o(requireView, "fragment.requireView()");
                cVar.m(c.b.f4372k.b(requireView.getVisibility()), c.a.NONE);
            }
        }
    }

    public final void v(boolean z6) {
        this.f4358d = z6;
    }
}