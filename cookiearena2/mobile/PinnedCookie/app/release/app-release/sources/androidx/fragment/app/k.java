package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.n1;
import androidx.core.view.t2;
import androidx.core.view.u1;
import androidx.fragment.app.f1;
import androidx.fragment.app.k;
import androidx.fragment.app.s;
import i0.w3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import u4.r1;
import v3.q1;
import z0.j;
@r1({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,877:1\n288#2,2:878\n533#2,6:880\n819#2:886\n847#2,2:887\n766#2:889\n857#2,2:890\n1789#2,3:892\n819#2:895\n847#2,2:896\n1855#2,2:898\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n47#1:878,2\n53#1:880,6\n312#1:886\n312#1:887,2\n315#1:889\n315#1:890,2\n317#1:892,3\n629#1:895\n629#1:896,2\n632#1:898,2\n*E\n"})
/* loaded from: classes.dex */
public final class k extends f1 {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f4402c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4403d;
        @n6.e

        /* renamed from: e  reason: collision with root package name */
        public s.a f4404e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@n6.d f1.c cVar, @n6.d z0.j jVar, boolean z6) {
            super(cVar, jVar);
            u4.l0.p(cVar, "operation");
            u4.l0.p(jVar, "signal");
            this.f4402c = z6;
        }

        @n6.e
        public final s.a e(@n6.d Context context) {
            u4.l0.p(context, "context");
            if (this.f4403d) {
                return this.f4404e;
            }
            s.a b7 = s.b(context, b().h(), b().g() == f1.c.b.VISIBLE, this.f4402c);
            this.f4404e = b7;
            this.f4403d = true;
            return b7;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final f1.c f4405a;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public final z0.j f4406b;

        public b(@n6.d f1.c cVar, @n6.d z0.j jVar) {
            u4.l0.p(cVar, "operation");
            u4.l0.p(jVar, "signal");
            this.f4405a = cVar;
            this.f4406b = jVar;
        }

        public final void a() {
            this.f4405a.f(this.f4406b);
        }

        @n6.d
        public final f1.c b() {
            return this.f4405a;
        }

        @n6.d
        public final z0.j c() {
            return this.f4406b;
        }

        public final boolean d() {
            f1.c.b bVar;
            f1.c.b.a aVar = f1.c.b.f4372k;
            View view = this.f4405a.h().mView;
            u4.l0.o(view, "operation.fragment.mView");
            f1.c.b a7 = aVar.a(view);
            f1.c.b g7 = this.f4405a.g();
            return a7 == g7 || !(a7 == (bVar = f1.c.b.VISIBLE) || g7 == bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b {
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public final Object f4407c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4408d;
        @n6.e

        /* renamed from: e  reason: collision with root package name */
        public final Object f4409e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@n6.d f1.c cVar, @n6.d z0.j jVar, boolean z6, boolean z7) {
            super(cVar, jVar);
            Object returnTransition;
            u4.l0.p(cVar, "operation");
            u4.l0.p(jVar, "signal");
            f1.c.b g7 = cVar.g();
            f1.c.b bVar = f1.c.b.VISIBLE;
            if (g7 == bVar) {
                Fragment h7 = cVar.h();
                returnTransition = z6 ? h7.getReenterTransition() : h7.getEnterTransition();
            } else {
                Fragment h8 = cVar.h();
                returnTransition = z6 ? h8.getReturnTransition() : h8.getExitTransition();
            }
            this.f4407c = returnTransition;
            this.f4408d = cVar.g() == bVar ? z6 ? cVar.h().getAllowReturnTransitionOverlap() : cVar.h().getAllowEnterTransitionOverlap() : true;
            this.f4409e = z7 ? z6 ? cVar.h().getSharedElementReturnTransition() : cVar.h().getSharedElementEnterTransition() : null;
        }

        @n6.e
        public final y0 e() {
            y0 f7 = f(this.f4407c);
            y0 f8 = f(this.f4409e);
            if (f7 == null || f8 == null || f7 == f8) {
                return f7 == null ? f8 : f7;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().h() + " returned Transition " + this.f4407c + " which uses a different Transition  type than its shared element transition " + this.f4409e).toString());
        }

        public final y0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            y0 y0Var = w0.f4562b;
            if (y0Var == null || !y0Var.e(obj)) {
                y0 y0Var2 = w0.f4563c;
                if (y0Var2 == null || !y0Var2.e(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().h() + " is not a valid framework Transition or AndroidX Transition");
                }
                return y0Var2;
            }
            return y0Var;
        }

        @n6.e
        public final Object g() {
            return this.f4409e;
        }

        @n6.e
        public final Object h() {
            return this.f4407c;
        }

        public final boolean i() {
            return this.f4409e != null;
        }

        public final boolean j() {
            return this.f4408d;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends u4.n0 implements t4.l<Map.Entry<String, View>, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Collection<String> f4410l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Collection<String> collection) {
            super(1);
            this.f4410l = collection;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d Map.Entry<String, View> entry) {
            u4.l0.p(entry, "entry");
            return Boolean.valueOf(x3.e0.R1(this.f4410l, u1.x0(entry.getValue())));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f4412b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f4413c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ f1.c f4414d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f4415e;

        public e(View view, boolean z6, f1.c cVar, a aVar) {
            this.f4412b = view;
            this.f4413c = z6;
            this.f4414d = cVar;
            this.f4415e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@n6.d Animator animator) {
            u4.l0.p(animator, "anim");
            k.this.q().endViewTransition(this.f4412b);
            if (this.f4413c) {
                f1.c.b g7 = this.f4414d.g();
                View view = this.f4412b;
                u4.l0.o(view, "viewToAnimate");
                g7.d(view);
            }
            this.f4415e.a();
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(this.f4414d);
                sb.append(" has ended.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f1.c f4416a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k f4417b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f4418c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f4419d;

        public f(f1.c cVar, k kVar, View view, a aVar) {
            this.f4416a = cVar;
            this.f4417b = kVar;
            this.f4418c = view;
            this.f4419d = aVar;
        }

        public static final void b(k kVar, View view, a aVar) {
            u4.l0.p(kVar, "this$0");
            u4.l0.p(aVar, "$animationInfo");
            kVar.q().endViewTransition(view);
            aVar.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@n6.d Animation animation) {
            u4.l0.p(animation, "animation");
            ViewGroup q6 = this.f4417b.q();
            final k kVar = this.f4417b;
            final View view = this.f4418c;
            final a aVar = this.f4419d;
            q6.post(new Runnable() { // from class: androidx.fragment.app.l
                @Override // java.lang.Runnable
                public final void run() {
                    k.f.b(k.this, view, aVar);
                }
            });
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f4416a);
                sb.append(" has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@n6.d Animation animation) {
            u4.l0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@n6.d Animation animation) {
            u4.l0.p(animation, "animation");
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f4416a);
                sb.append(" has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@n6.d ViewGroup viewGroup) {
        super(viewGroup);
        u4.l0.p(viewGroup, "container");
    }

    public static final void F(List list, f1.c cVar, k kVar) {
        u4.l0.p(list, "$awaitingContainerChanges");
        u4.l0.p(cVar, "$operation");
        u4.l0.p(kVar, "this$0");
        if (list.contains(cVar)) {
            list.remove(cVar);
            kVar.D(cVar);
        }
    }

    public static final void J(Animator animator, f1.c cVar) {
        u4.l0.p(cVar, "$operation");
        animator.end();
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animator from operation ");
            sb.append(cVar);
            sb.append(" has been canceled.");
        }
    }

    public static final void K(View view, k kVar, a aVar, f1.c cVar) {
        u4.l0.p(kVar, "this$0");
        u4.l0.p(aVar, "$animationInfo");
        u4.l0.p(cVar, "$operation");
        view.clearAnimation();
        kVar.q().endViewTransition(view);
        aVar.a();
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animation from operation ");
            sb.append(cVar);
            sb.append(" has been cancelled.");
        }
    }

    public static final void M(y0 y0Var, View view, Rect rect) {
        u4.l0.p(y0Var, "$impl");
        u4.l0.p(rect, "$lastInEpicenterRect");
        y0Var.h(view, rect);
    }

    public static final void N(ArrayList arrayList) {
        u4.l0.p(arrayList, "$transitioningViews");
        w0.e(arrayList, 4);
    }

    public static final void O(c cVar, f1.c cVar2) {
        u4.l0.p(cVar, "$transitionInfo");
        u4.l0.p(cVar2, "$operation");
        cVar.a();
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Transition for operation ");
            sb.append(cVar2);
            sb.append(" has completed");
        }
    }

    public static final void P(f1.c cVar, f1.c cVar2, boolean z6, androidx.collection.a aVar) {
        u4.l0.p(aVar, "$lastInViews");
        w0.a(cVar.h(), cVar2.h(), z6, aVar, false);
    }

    public final void D(f1.c cVar) {
        View view = cVar.h().mView;
        f1.c.b g7 = cVar.g();
        u4.l0.o(view, "view");
        g7.d(view);
    }

    public final void E(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (t2.c(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                u4.l0.o(childAt, "child");
                E(arrayList, childAt);
            }
        }
    }

    public final void G(Map<String, View> map, View view) {
        String x02 = u1.x0(view);
        if (x02 != null) {
            map.put(x02, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt.getVisibility() == 0) {
                    u4.l0.o(childAt, "child");
                    G(map, childAt);
                }
            }
        }
    }

    public final void H(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Set<Map.Entry<String, View>> entrySet = aVar.entrySet();
        u4.l0.o(entrySet, "entries");
        x3.b0.N0(entrySet, new d(collection));
    }

    public final void I(List<a> list, List<f1.c> list2, boolean z6, Map<f1.c, Boolean> map) {
        Context context = q().getContext();
        ArrayList<a> arrayList = new ArrayList();
        boolean z7 = false;
        for (a aVar : list) {
            if (aVar.d()) {
                aVar.a();
            } else {
                u4.l0.o(context, "context");
                s.a e7 = aVar.e(context);
                if (e7 == null) {
                    aVar.a();
                } else {
                    final Animator animator = e7.f4494b;
                    if (animator == null) {
                        arrayList.add(aVar);
                    } else {
                        final f1.c b7 = aVar.b();
                        Fragment h7 = b7.h();
                        if (u4.l0.g(map.get(b7), Boolean.TRUE)) {
                            if (FragmentManager.X0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Ignoring Animator set on ");
                                sb.append(h7);
                                sb.append(" as this Fragment was involved in a Transition.");
                            }
                            aVar.a();
                        } else {
                            boolean z8 = b7.g() == f1.c.b.GONE;
                            if (z8) {
                                list2.remove(b7);
                            }
                            View view = h7.mView;
                            q().startViewTransition(view);
                            animator.addListener(new e(view, z8, b7, aVar));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.X0(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Animator from operation ");
                                sb2.append(b7);
                                sb2.append(" has started.");
                            }
                            aVar.c().d(new j.b() { // from class: androidx.fragment.app.i
                                @Override // z0.j.b
                                public final void onCancel() {
                                    k.J(animator, b7);
                                }
                            });
                            z7 = true;
                        }
                    }
                }
            }
        }
        for (final a aVar2 : arrayList) {
            final f1.c b8 = aVar2.b();
            Fragment h8 = b8.h();
            if (z6) {
                if (FragmentManager.X0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Ignoring Animation set on ");
                    sb3.append(h8);
                    sb3.append(" as Animations cannot run alongside Transitions.");
                }
                aVar2.a();
            } else if (z7) {
                if (FragmentManager.X0(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Ignoring Animation set on ");
                    sb4.append(h8);
                    sb4.append(" as Animations cannot run alongside Animators.");
                }
                aVar2.a();
            } else {
                final View view2 = h8.mView;
                u4.l0.o(context, "context");
                s.a e8 = aVar2.e(context);
                if (e8 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Animation animation = e8.f4493a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (b8.g() != f1.c.b.REMOVED) {
                    view2.startAnimation(animation);
                    aVar2.a();
                } else {
                    q().startViewTransition(view2);
                    s.b bVar = new s.b(animation, q(), view2);
                    bVar.setAnimationListener(new f(b8, this, view2, aVar2));
                    view2.startAnimation(bVar);
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Animation from operation ");
                        sb5.append(b8);
                        sb5.append(" has started.");
                    }
                }
                aVar2.c().d(new j.b() { // from class: androidx.fragment.app.j
                    @Override // z0.j.b
                    public final void onCancel() {
                        k.K(view2, this, aVar2, b8);
                    }
                });
            }
        }
    }

    public final Map<f1.c, Boolean> L(List<c> list, List<f1.c> list2, final boolean z6, final f1.c cVar, final f1.c cVar2) {
        View view;
        Object obj;
        Object obj2;
        View view2;
        Object obj3;
        LinkedHashMap linkedHashMap;
        Object obj4;
        f1.c cVar3;
        final ArrayList<View> arrayList;
        View view3;
        final y0 y0Var;
        androidx.collection.a aVar;
        Rect rect;
        y0 y0Var2;
        ArrayList<String> arrayList2;
        View view4;
        final Rect rect2;
        final View view5;
        k kVar = this;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : list) {
            if (!((c) obj5).d()) {
                arrayList3.add(obj5);
            }
        }
        ArrayList<c> arrayList4 = new ArrayList();
        for (Object obj6 : arrayList3) {
            if (((c) obj6).e() != null) {
                arrayList4.add(obj6);
            }
        }
        y0 y0Var3 = null;
        for (c cVar4 : arrayList4) {
            y0 e7 = cVar4.e();
            if (!(y0Var3 == null || e7 == y0Var3)) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cVar4.b().h() + " returned Transition " + cVar4.h() + " which uses a different Transition type than other Fragments.").toString());
            }
            y0Var3 = e7;
        }
        if (y0Var3 == null) {
            for (c cVar5 : list) {
                linkedHashMap2.put(cVar5.b(), Boolean.FALSE);
                cVar5.a();
            }
            return linkedHashMap2;
        }
        View view6 = new View(q().getContext());
        Rect rect3 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        androidx.collection.a aVar2 = new androidx.collection.a();
        View view7 = null;
        Object obj7 = null;
        boolean z7 = false;
        for (c cVar6 : list) {
            if (!cVar6.i() || cVar == null || cVar2 == null) {
                y0Var = y0Var3;
                aVar = aVar2;
                rect = rect3;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                linkedHashMap2 = linkedHashMap2;
                view7 = view7;
            } else {
                obj7 = y0Var3.w(y0Var3.f(cVar6.g()));
                ArrayList<String> sharedElementSourceNames = cVar2.h().getSharedElementSourceNames();
                u4.l0.o(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = cVar.h().getSharedElementSourceNames();
                u4.l0.o(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = cVar.h().getSharedElementTargetNames();
                View view8 = view7;
                u4.l0.o(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                View view9 = view6;
                int i7 = 0;
                while (i7 < size) {
                    int i8 = size;
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i7));
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i7));
                    }
                    i7++;
                    size = i8;
                }
                ArrayList<String> sharedElementTargetNames2 = cVar2.h().getSharedElementTargetNames();
                u4.l0.o(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                v3.u0 a7 = !z6 ? q1.a(cVar.h().getExitTransitionCallback(), cVar2.h().getEnterTransitionCallback()) : q1.a(cVar.h().getEnterTransitionCallback(), cVar2.h().getExitTransitionCallback());
                w3 w3Var = (w3) a7.a();
                w3 w3Var2 = (w3) a7.b();
                int size2 = sharedElementSourceNames.size();
                int i9 = 0;
                while (i9 < size2) {
                    aVar2.put(sharedElementSourceNames.get(i9), sharedElementTargetNames2.get(i9));
                    i9++;
                    size2 = size2;
                    rect3 = rect3;
                }
                Rect rect4 = rect3;
                if (FragmentManager.X0(2)) {
                    Iterator<String> it = sharedElementTargetNames2.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        Iterator<String> it2 = it;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Name: ");
                        sb.append(next);
                        it = it2;
                    }
                    Iterator<String> it3 = sharedElementSourceNames.iterator();
                    while (it3.hasNext()) {
                        String next2 = it3.next();
                        Iterator<String> it4 = it3;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Name: ");
                        sb2.append(next2);
                        it3 = it4;
                    }
                }
                androidx.collection.a aVar3 = new androidx.collection.a();
                View view10 = cVar.h().mView;
                u4.l0.o(view10, "firstOut.fragment.mView");
                kVar.G(aVar3, view10);
                aVar3.s(sharedElementSourceNames);
                if (w3Var != null) {
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Executing exit callback for operation ");
                        sb3.append(cVar);
                    }
                    w3Var.d(sharedElementSourceNames, aVar3);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i10 = size3 - 1;
                            String str = sharedElementSourceNames.get(size3);
                            View view11 = (View) aVar3.get(str);
                            if (view11 == null) {
                                aVar2.remove(str);
                                y0Var2 = y0Var3;
                            } else {
                                y0Var2 = y0Var3;
                                if (!u4.l0.g(str, u1.x0(view11))) {
                                    aVar2.put(u1.x0(view11), (String) aVar2.remove(str));
                                }
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size3 = i10;
                            y0Var3 = y0Var2;
                        }
                    } else {
                        y0Var2 = y0Var3;
                    }
                } else {
                    y0Var2 = y0Var3;
                    aVar2.s(aVar3.keySet());
                }
                final androidx.collection.a aVar4 = new androidx.collection.a();
                View view12 = cVar2.h().mView;
                u4.l0.o(view12, "lastIn.fragment.mView");
                kVar.G(aVar4, view12);
                aVar4.s(sharedElementTargetNames2);
                aVar4.s(aVar2.values());
                if (w3Var2 != null) {
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Executing enter callback for operation ");
                        sb4.append(cVar2);
                    }
                    w3Var2.d(sharedElementTargetNames2, aVar4);
                    int size4 = sharedElementTargetNames2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i11 = size4 - 1;
                            String str2 = sharedElementTargetNames2.get(size4);
                            View view13 = (View) aVar4.get(str2);
                            if (view13 == null) {
                                u4.l0.o(str2, "name");
                                String b7 = w0.b(aVar2, str2);
                                if (b7 != null) {
                                    aVar2.remove(b7);
                                }
                                arrayList2 = sharedElementTargetNames2;
                            } else {
                                arrayList2 = sharedElementTargetNames2;
                                if (!u4.l0.g(str2, u1.x0(view13))) {
                                    u4.l0.o(str2, "name");
                                    String b8 = w0.b(aVar2, str2);
                                    if (b8 != null) {
                                        aVar2.put(b8, u1.x0(view13));
                                    }
                                }
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size4 = i11;
                            sharedElementTargetNames2 = arrayList2;
                        }
                    } else {
                        arrayList2 = sharedElementTargetNames2;
                    }
                } else {
                    arrayList2 = sharedElementTargetNames2;
                    w0.d(aVar2, aVar4);
                }
                Set keySet = aVar2.keySet();
                u4.l0.o(keySet, "sharedElementNameMapping.keys");
                kVar.H(aVar3, keySet);
                Collection values = aVar2.values();
                u4.l0.o(values, "sharedElementNameMapping.values");
                kVar.H(aVar4, values);
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    view7 = view8;
                    linkedHashMap2 = linkedHashMap3;
                    view6 = view9;
                    y0Var3 = y0Var2;
                    rect3 = rect4;
                    obj7 = null;
                } else {
                    w0.a(cVar2.h(), cVar.h(), z6, aVar3, true);
                    n1.a(q(), new Runnable() { // from class: androidx.fragment.app.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            k.P(f1.c.this, cVar, z6, aVar4);
                        }
                    });
                    arrayList5.addAll(aVar3.values());
                    if ((!sharedElementSourceNames.isEmpty()) == true) {
                        view4 = (View) aVar3.get(sharedElementSourceNames.get(0));
                        y0Var = y0Var2;
                        y0Var.r(obj7, view4);
                    } else {
                        y0Var = y0Var2;
                        view4 = view8;
                    }
                    arrayList6.addAll(aVar4.values());
                    if (!(!arrayList2.isEmpty()) == true || (view5 = (View) aVar4.get(arrayList2.get(0))) == null) {
                        rect2 = rect4;
                    } else {
                        rect2 = rect4;
                        n1.a(q(), new Runnable() { // from class: androidx.fragment.app.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                k.M(y0.this, view5, rect2);
                            }
                        });
                        z7 = true;
                    }
                    view6 = view9;
                    y0Var.u(obj7, view6, arrayList5);
                    aVar = aVar2;
                    ArrayList<View> arrayList7 = arrayList6;
                    rect = rect2;
                    y0Var.p(obj7, null, null, null, null, obj7, arrayList7);
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap3.put(cVar, bool);
                    linkedHashMap3.put(cVar2, bool);
                    view7 = view4;
                    arrayList6 = arrayList7;
                    arrayList5 = arrayList5;
                    linkedHashMap2 = linkedHashMap3;
                }
            }
            aVar2 = aVar;
            y0Var3 = y0Var;
            rect3 = rect;
        }
        y0 y0Var4 = y0Var3;
        View view14 = view7;
        androidx.collection.a aVar5 = aVar2;
        ArrayList<View> arrayList8 = arrayList6;
        ArrayList<View> arrayList9 = arrayList5;
        Rect rect5 = rect3;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        ArrayList arrayList10 = new ArrayList();
        Iterator<c> it5 = list.iterator();
        Object obj8 = null;
        Object obj9 = null;
        while (it5.hasNext()) {
            c next3 = it5.next();
            if (next3.d()) {
                linkedHashMap4.put(next3.b(), Boolean.FALSE);
                next3.a();
            } else {
                Object f7 = y0Var4.f(next3.h());
                f1.c b9 = next3.b();
                boolean z8 = obj7 != null && (b9 == cVar || b9 == cVar2);
                if (f7 != null) {
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    ArrayList<View> arrayList11 = new ArrayList<>();
                    Iterator<c> it6 = it5;
                    View view15 = b9.h().mView;
                    Object obj10 = obj7;
                    u4.l0.o(view15, "operation.fragment.mView");
                    kVar.E(arrayList11, view15);
                    if (z8) {
                        if (b9 == cVar) {
                            arrayList11.removeAll(x3.e0.V5(arrayList9));
                        } else {
                            arrayList11.removeAll(x3.e0.V5(arrayList8));
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        y0Var4.a(f7, view6);
                        view2 = view6;
                        cVar3 = b9;
                        obj2 = obj8;
                        obj3 = obj9;
                        arrayList = arrayList11;
                        view = view14;
                        linkedHashMap = linkedHashMap5;
                        obj = obj10;
                        obj4 = f7;
                    } else {
                        y0Var4.b(f7, arrayList11);
                        view = view14;
                        obj = obj10;
                        obj2 = obj8;
                        view2 = view6;
                        obj3 = obj9;
                        linkedHashMap = linkedHashMap5;
                        y0Var4.p(f7, f7, arrayList11, null, null, null, null);
                        if (b9.g() == f1.c.b.GONE) {
                            cVar3 = b9;
                            list2.remove(cVar3);
                            arrayList = arrayList11;
                            ArrayList<View> arrayList12 = new ArrayList<>(arrayList);
                            arrayList12.remove(cVar3.h().mView);
                            obj4 = f7;
                            y0Var4.o(obj4, cVar3.h().mView, arrayList12);
                            n1.a(q(), new Runnable() { // from class: androidx.fragment.app.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    k.N(arrayList);
                                }
                            });
                        } else {
                            obj4 = f7;
                            cVar3 = b9;
                            arrayList = arrayList11;
                        }
                    }
                    if (cVar3.g() == f1.c.b.VISIBLE) {
                        arrayList10.addAll(arrayList);
                        if (z7) {
                            y0Var4.q(obj4, rect5);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        y0Var4.r(obj4, view3);
                    }
                    linkedHashMap.put(cVar3, Boolean.TRUE);
                    if (next3.j()) {
                        obj9 = y0Var4.k(obj3, obj4, null);
                        obj8 = obj2;
                        linkedHashMap4 = linkedHashMap;
                        view14 = view3;
                        obj7 = obj;
                        view6 = view2;
                        kVar = this;
                    } else {
                        obj8 = y0Var4.k(obj2, obj4, null);
                        kVar = this;
                        linkedHashMap4 = linkedHashMap;
                        obj9 = obj3;
                        view14 = view3;
                        obj7 = obj;
                        view6 = view2;
                    }
                    it5 = it6;
                } else if (!z8) {
                    linkedHashMap4.put(b9, Boolean.FALSE);
                    next3.a();
                }
            }
        }
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        Object obj11 = obj7;
        Object j7 = y0Var4.j(obj9, obj8, obj11);
        if (j7 == null) {
            return linkedHashMap6;
        }
        ArrayList<c> arrayList13 = new ArrayList();
        for (Object obj12 : list) {
            if (!((c) obj12).d()) {
                arrayList13.add(obj12);
            }
        }
        for (final c cVar7 : arrayList13) {
            Object h7 = cVar7.h();
            final f1.c b10 = cVar7.b();
            boolean z9 = obj11 != null && (b10 == cVar || b10 == cVar2);
            if (h7 != null || z9) {
                if (u1.U0(q())) {
                    y0Var4.s(cVar7.b().h(), j7, cVar7.c(), new Runnable() { // from class: androidx.fragment.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            k.O(k.c.this, b10);
                        }
                    });
                } else {
                    if (FragmentManager.X0(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("SpecialEffectsController: Container ");
                        sb5.append(q());
                        sb5.append(" has not been laid out. Completing operation ");
                        sb5.append(b10);
                    }
                    cVar7.a();
                }
            }
        }
        if (u1.U0(q())) {
            w0.e(arrayList10, 4);
            ArrayList<String> l7 = y0Var4.l(arrayList8);
            if (FragmentManager.X0(2)) {
                Iterator<View> it7 = arrayList9.iterator();
                while (it7.hasNext()) {
                    View next4 = it7.next();
                    u4.l0.o(next4, "sharedElementFirstOutViews");
                    View view16 = next4;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("View: ");
                    sb6.append(view16);
                    sb6.append(" Name: ");
                    sb6.append(u1.x0(view16));
                }
                Iterator<View> it8 = arrayList8.iterator();
                while (it8.hasNext()) {
                    View next5 = it8.next();
                    u4.l0.o(next5, "sharedElementLastInViews");
                    View view17 = next5;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("View: ");
                    sb7.append(view17);
                    sb7.append(" Name: ");
                    sb7.append(u1.x0(view17));
                }
            }
            y0Var4.c(q(), j7);
            y0Var4.t(q(), arrayList9, arrayList8, l7, aVar5);
            w0.e(arrayList10, 0);
            y0Var4.v(obj11, arrayList9, arrayList8);
            return linkedHashMap6;
        }
        return linkedHashMap6;
    }

    public final void Q(List<? extends f1.c> list) {
        Fragment h7 = ((f1.c) x3.e0.k3(list)).h();
        for (f1.c cVar : list) {
            cVar.h().mAnimationInfo.f4186c = h7.mAnimationInfo.f4186c;
            cVar.h().mAnimationInfo.f4187d = h7.mAnimationInfo.f4187d;
            cVar.h().mAnimationInfo.f4188e = h7.mAnimationInfo.f4188e;
            cVar.h().mAnimationInfo.f4189f = h7.mAnimationInfo.f4189f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // androidx.fragment.app.f1
    public void j(@n6.d List<? extends f1.c> list, boolean z6) {
        f1.c cVar;
        ?? r22;
        u4.l0.p(list, "operations");
        Iterator it = list.iterator();
        while (true) {
            cVar = null;
            if (!it.hasNext()) {
                r22 = 0;
                break;
            }
            r22 = it.next();
            f1.c cVar2 = (f1.c) r22;
            f1.c.b.a aVar = f1.c.b.f4372k;
            View view = cVar2.h().mView;
            u4.l0.o(view, "operation.fragment.mView");
            f1.c.b a7 = aVar.a(view);
            f1.c.b bVar = f1.c.b.VISIBLE;
            if (a7 == bVar && cVar2.g() != bVar) {
                break;
            }
        }
        f1.c cVar3 = r22;
        ListIterator<? extends f1.c> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            f1.c previous = listIterator.previous();
            f1.c cVar4 = previous;
            f1.c.b.a aVar2 = f1.c.b.f4372k;
            View view2 = cVar4.h().mView;
            u4.l0.o(view2, "operation.fragment.mView");
            f1.c.b a8 = aVar2.a(view2);
            f1.c.b bVar2 = f1.c.b.VISIBLE;
            if (a8 != bVar2 && cVar4.g() == bVar2) {
                cVar = previous;
                break;
            }
        }
        f1.c cVar5 = cVar;
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Executing operations from ");
            sb.append(cVar3);
            sb.append(" to ");
            sb.append(cVar5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List<f1.c> T5 = x3.e0.T5(list);
        Q(list);
        Iterator<? extends f1.c> it2 = list.iterator();
        while (it2.hasNext()) {
            final f1.c next = it2.next();
            z0.j jVar = new z0.j();
            next.l(jVar);
            arrayList.add(new a(next, jVar, z6));
            z0.j jVar2 = new z0.j();
            next.l(jVar2);
            arrayList2.add(new c(next, jVar2, z6, !z6 ? next != cVar5 : next != cVar3));
            next.c(new Runnable() { // from class: androidx.fragment.app.d
                @Override // java.lang.Runnable
                public final void run() {
                    k.F(T5, next, this);
                }
            });
        }
        Map<f1.c, Boolean> L = L(arrayList2, T5, z6, cVar3, cVar5);
        I(arrayList, T5, L.containsValue(Boolean.TRUE), L);
        Iterator<f1.c> it3 = T5.iterator();
        while (it3.hasNext()) {
            D(it3.next());
        }
        T5.clear();
        if (FragmentManager.X0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Completed executing operations from ");
            sb2.append(cVar3);
            sb2.append(" to ");
            sb2.append(cVar5);
        }
    }
}
