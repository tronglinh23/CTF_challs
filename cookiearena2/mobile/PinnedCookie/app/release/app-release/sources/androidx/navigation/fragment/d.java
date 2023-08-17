package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.c1;
import androidx.lifecycle.i0;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.d;
import androidx.navigation.fragment.h;
import i0.k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import k2.a;
import kotlin.Metadata;
import kotlinx.coroutines.flow.t0;
import s2.d1;
import s2.e1;
import s2.g0;
import s2.g1;
import s2.t;
import s2.u0;
import t4.l;
import u4.d0;
import u4.l0;
import u4.l1;
import u4.n0;
import u4.r1;
import v3.k;
import v3.m2;
import v3.q1;
import x3.a1;
import x3.b0;
import x3.e0;
import x3.m1;
import x3.x;
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004DE*,B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u00100\u001a\u00020.¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J*\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0017J*\u0010!\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\tH\u0016J\n\u0010$\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0018H\u0016J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J$\u0010'\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002J\u001a\u0010)\u001a\u00020(2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0016018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u000204078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00160:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001b0>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006F"}, d2 = {"Landroidx/navigation/fragment/d;", "Ls2/d1;", "Landroidx/navigation/fragment/d$c;", "Ls2/g1;", "state", "Lv3/m2;", "f", "Landroidx/fragment/app/Fragment;", "fragment", "Ls2/t;", "entry", "p", "(Landroidx/fragment/app/Fragment;Ls2/t;Ls2/g1;)V", "popUpTo", "", "savedState", "j", "r", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "className", "Landroid/os/Bundle;", "args", "w", "", "entries", "Ls2/u0;", "navOptions", "Ls2/d1$a;", "navigatorExtras", "e", "backStackEntry", "g", "i", "h", "q", "x", "Landroidx/fragment/app/u0;", "s", "c", "Landroid/content/Context;", androidx.appcompat.widget.d.f1513o, "Landroidx/fragment/app/FragmentManager;", "", "I", "containerId", "", "Ljava/util/Set;", "savedIds", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/v;", "fragmentObserver", "Lkotlin/Function1;", "Lt4/l;", "fragmentViewObserver", "", "v", "()Ljava/util/Set;", "entriesToPop", "Lkotlinx/coroutines/flow/t0;", "u", "()Lkotlinx/coroutines/flow/t0;", "backStack", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,588:1\n1549#2:589\n1620#2,3:590\n518#2,7:596\n533#2,6:603\n31#3:593\n63#3,2:594\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n72#1:589\n72#1:590,3\n83#1:596,7\n115#1:603,6\n188#1:593\n188#1:594,2\n*E\n"})
@d1.b("fragment")
/* loaded from: classes.dex */
public class d extends d1<c> {
    @n6.d

    /* renamed from: j  reason: collision with root package name */
    public static final String f4887j = "FragmentNavigator";
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public static final String f4888k = "androidx-nav-fragment:navigator:savedIds";
    @n6.d

    /* renamed from: c  reason: collision with root package name and from kotlin metadata */
    public final Context context;
    @n6.d

    /* renamed from: d  reason: collision with root package name and from kotlin metadata */
    public final FragmentManager fragmentManager;

    /* renamed from: e  reason: collision with root package name and from kotlin metadata */
    public final int containerId;
    @n6.d

    /* renamed from: f  reason: collision with root package name and from kotlin metadata */
    public final Set<String> savedIds;
    @n6.d

    /* renamed from: g  reason: collision with root package name and from kotlin metadata */
    public final v fragmentObserver;
    @n6.d

    /* renamed from: h  reason: collision with root package name and from kotlin metadata */
    public final l<t, v> fragmentViewObserver;

    /* loaded from: classes.dex */
    public static final class a extends z0 {

        /* renamed from: d  reason: collision with root package name */
        public WeakReference<t4.a<m2>> f4895d;

        @Override // androidx.lifecycle.z0
        public void f() {
            super.f();
            t4.a<m2> aVar = h().get();
            if (aVar != null) {
                aVar.n();
            }
        }

        @n6.d
        public final WeakReference<t4.a<m2>> h() {
            WeakReference<t4.a<m2>> weakReference = this.f4895d;
            if (weakReference != null) {
                return weakReference;
            }
            l0.S("completeTransition");
            return null;
        }

        public final void i(@n6.d WeakReference<t4.a<m2>> weakReference) {
            l0.p(weakReference, "<set-?>");
            this.f4895d = weakReference;
        }
    }

    @g0.a(Fragment.class)
    @r1({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,588:1\n232#2,3:589\n1#3:592\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n*L\n456#1:589,3\n*E\n"})
    /* loaded from: classes.dex */
    public static class c extends g0 {
        @n6.e

        /* renamed from: v  reason: collision with root package name */
        public String f4896v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@n6.d d1<? extends c> d1Var) {
            super(d1Var);
            l0.p(d1Var, "fragmentNavigator");
        }

        @Override // s2.g0
        @d.i
        public void C(@n6.d Context context, @n6.d AttributeSet attributeSet) {
            l0.p(context, "context");
            l0.p(attributeSet, "attrs");
            super.C(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, h.d.f4927c);
            l0.o(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(h.d.f4928d);
            if (string != null) {
                P(string);
            }
            m2 m2Var = m2.f17815a;
            obtainAttributes.recycle();
        }

        @n6.d
        public final String O() {
            String str = this.f4896v;
            if (str != null) {
                l0.n(str, "null cannot be cast to non-null type kotlin.String");
                return str;
            }
            throw new IllegalStateException("Fragment class was not set".toString());
        }

        @n6.d
        public final c P(@n6.d String str) {
            l0.p(str, "className");
            this.f4896v = str;
            return this;
        }

        @Override // s2.g0
        public boolean equals(@n6.e Object obj) {
            return obj != null && (obj instanceof c) && super.equals(obj) && l0.g(this.f4896v, ((c) obj).f4896v);
        }

        @Override // s2.g0
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f4896v;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // s2.g0
        @n6.d
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f4896v;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String sb2 = sb.toString();
            l0.o(sb2, "sb.toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(@n6.d e1 e1Var) {
            this(e1Var.e(d.class));
            l0.p(e1Var, "navigatorProvider");
        }
    }

    /* renamed from: androidx.navigation.fragment.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0058d implements d1.a {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap<View, String> f4897a;

        /* renamed from: androidx.navigation.fragment.d$d$a */
        /* loaded from: classes.dex */
        public static final class a {
            @n6.d

            /* renamed from: a  reason: collision with root package name */
            public final LinkedHashMap<View, String> f4898a = new LinkedHashMap<>();

            @n6.d
            public final a a(@n6.d View view, @n6.d String str) {
                l0.p(view, "sharedElement");
                l0.p(str, "name");
                this.f4898a.put(view, str);
                return this;
            }

            @n6.d
            public final a b(@n6.d Map<View, String> map) {
                l0.p(map, "sharedElements");
                for (Map.Entry<View, String> entry : map.entrySet()) {
                    a(entry.getKey(), entry.getValue());
                }
                return this;
            }

            @n6.d
            public final C0058d c() {
                return new C0058d(this.f4898a);
            }
        }

        public C0058d(@n6.d Map<View, String> map) {
            l0.p(map, "sharedElements");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this.f4897a = linkedHashMap;
            linkedHashMap.putAll(map);
        }

        @n6.d
        public final Map<View, String> a() {
            return a1.F0(this.f4897a);
        }
    }

    @r1({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$attachClearViewModel$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,588:1\n1855#2,2:589\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$attachClearViewModel$1\n*L\n194#1:589,2\n*E\n"})
    /* loaded from: classes.dex */
    public static final class e extends n0 implements t4.a<m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t f4899l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ g1 f4900m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t tVar, g1 g1Var) {
            super(0);
            this.f4899l = tVar;
            this.f4900m = g1Var;
        }

        public final void b() {
            g1 g1Var = this.f4900m;
            Iterator<T> it = g1Var.c().getValue().iterator();
            while (it.hasNext()) {
                g1Var.e((t) it.next());
            }
        }

        @Override // t4.a
        public /* bridge */ /* synthetic */ m2 n() {
            b();
            return m2.f17815a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends n0 implements l<k2.a, a> {

        /* renamed from: l  reason: collision with root package name */
        public static final f f4901l = new f();

        public f() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final a O(@n6.d k2.a aVar) {
            l0.p(aVar, "$this$initializer");
            return new a();
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends n0 implements l<z, m2> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Fragment f4903m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ t f4904n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, t tVar) {
            super(1);
            this.f4903m = fragment;
            this.f4904n = tVar;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(z zVar) {
            b(zVar);
            return m2.f17815a;
        }

        public final void b(z zVar) {
            if (zVar == null || e0.R1(d.this.v(), this.f4903m.getTag())) {
                return;
            }
            p lifecycle = this.f4903m.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.b().d(p.b.CREATED)) {
                lifecycle.a((y) d.this.fragmentViewObserver.O(this.f4904n));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends n0 implements l<t, v> {
        public h() {
            super(1);
        }

        public static final void f(d dVar, t tVar, z zVar, p.a aVar) {
            l0.p(dVar, "this$0");
            l0.p(tVar, "$entry");
            l0.p(zVar, "<anonymous parameter 0>");
            l0.p(aVar, k0.I0);
            if (aVar == p.a.ON_RESUME && dVar.b().b().getValue().contains(tVar)) {
                dVar.b().e(tVar);
            }
            if (aVar != p.a.ON_DESTROY || dVar.b().b().getValue().contains(tVar)) {
                return;
            }
            dVar.b().e(tVar);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public final v O(@n6.d final t tVar) {
            l0.p(tVar, "entry");
            final d dVar = d.this;
            return new v() { // from class: v2.f
                @Override // androidx.lifecycle.v
                public final void d(z zVar, p.a aVar) {
                    d.h.f(androidx.navigation.fragment.d.this, tVar, zVar, aVar);
                }
            };
        }
    }

    @r1({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$onAttach$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,588:1\n533#2,6:589\n533#2,6:596\n1#3:595\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$onAttach$2\n*L\n133#1:589,6\n139#1:596,6\n*E\n"})
    /* loaded from: classes.dex */
    public static final class i implements FragmentManager.p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1 f4906a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f4907b;

        public i(g1 g1Var, d dVar) {
            this.f4906a = g1Var;
            this.f4907b = dVar;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public void a(@n6.d Fragment fragment, boolean z6) {
            Object obj;
            l0.p(fragment, "fragment");
            List z42 = e0.z4(this.f4906a.b().getValue(), this.f4906a.c().getValue());
            ListIterator listIterator = z42.listIterator(z42.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (l0.g(((t) obj).f(), fragment.getTag())) {
                    break;
                }
            }
            t tVar = (t) obj;
            if (!z6 && tVar == null) {
                throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            } else if (tVar != null) {
                this.f4907b.p(fragment, tVar, this.f4906a);
                if (z6 && this.f4907b.v().isEmpty() && fragment.isRemoving()) {
                    this.f4906a.i(tVar, false);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public void b() {
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public void c(@n6.d Fragment fragment, boolean z6) {
            t tVar;
            l0.p(fragment, "fragment");
            if (z6) {
                List<t> value = this.f4906a.b().getValue();
                ListIterator<t> listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        tVar = null;
                        break;
                    }
                    tVar = listIterator.previous();
                    if (l0.g(tVar.f(), fragment.getTag())) {
                        break;
                    }
                }
                t tVar2 = tVar;
                if (tVar2 != null) {
                    this.f4906a.j(tVar2);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements i0, d0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f4908a;

        public j(l lVar) {
            l0.p(lVar, "function");
            this.f4908a = lVar;
        }

        @Override // u4.d0
        @n6.d
        public final v3.v<?> a() {
            return this.f4908a;
        }

        @Override // androidx.lifecycle.i0
        public final /* synthetic */ void b(Object obj) {
            this.f4908a.O(obj);
        }

        public final boolean equals(@n6.e Object obj) {
            if ((obj instanceof i0) && (obj instanceof d0)) {
                return l0.g(a(), ((d0) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public d(@n6.d Context context, @n6.d FragmentManager fragmentManager, int i7) {
        l0.p(context, "context");
        l0.p(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i7;
        this.savedIds = new LinkedHashSet();
        this.fragmentObserver = new v() { // from class: v2.d
            @Override // androidx.lifecycle.v
            public final void d(z zVar, p.a aVar) {
                androidx.navigation.fragment.d.t(androidx.navigation.fragment.d.this, zVar, aVar);
            }
        };
        this.fragmentViewObserver = new h();
    }

    public static final void t(d dVar, z zVar, p.a aVar) {
        l0.p(dVar, "this$0");
        l0.p(zVar, "source");
        l0.p(aVar, k0.I0);
        if (aVar == p.a.ON_DESTROY) {
            Fragment fragment = (Fragment) zVar;
            Object obj = null;
            for (Object obj2 : dVar.b().c().getValue()) {
                if (l0.g(((t) obj2).f(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            t tVar = (t) obj;
            if (tVar == null || dVar.b().b().getValue().contains(tVar)) {
                return;
            }
            dVar.b().e(tVar);
        }
    }

    public static final void y(g1 g1Var, d dVar, FragmentManager fragmentManager, Fragment fragment) {
        t tVar;
        l0.p(g1Var, "$state");
        l0.p(dVar, "this$0");
        l0.p(fragmentManager, "<anonymous parameter 0>");
        l0.p(fragment, "fragment");
        List<t> value = g1Var.b().getValue();
        ListIterator<t> listIterator = value.listIterator(value.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                tVar = null;
                break;
            }
            tVar = listIterator.previous();
            if (l0.g(tVar.f(), fragment.getTag())) {
                break;
            }
        }
        t tVar2 = tVar;
        if (tVar2 != null) {
            dVar.q(tVar2, fragment);
            dVar.p(fragment, tVar2, g1Var);
        }
    }

    @Override // s2.d1
    public void e(@n6.d List<t> list, @n6.e u0 u0Var, @n6.e d1.a aVar) {
        l0.p(list, "entries");
        if (this.fragmentManager.e1()) {
            Log.i(f4887j, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<t> it = list.iterator();
        while (it.hasNext()) {
            x(it.next(), u0Var, aVar);
        }
    }

    @Override // s2.d1
    public void f(@n6.d final g1 g1Var) {
        l0.p(g1Var, "state");
        super.f(g1Var);
        this.fragmentManager.o(new androidx.fragment.app.l0() { // from class: v2.e
            @Override // androidx.fragment.app.l0
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                androidx.navigation.fragment.d.y(g1.this, this, fragmentManager, fragment);
            }
        });
        this.fragmentManager.p(new i(g1Var, this));
    }

    @Override // s2.d1
    public void g(@n6.d t tVar) {
        l0.p(tVar, "backStackEntry");
        if (this.fragmentManager.e1()) {
            Log.i(f4887j, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.u0 s6 = s(tVar, null);
        if (b().b().getValue().size() > 1) {
            this.fragmentManager.v1(tVar.f(), 1);
            s6.o(tVar.f());
        }
        s6.q();
        b().f(tVar);
    }

    @Override // s2.d1
    public void h(@n6.d Bundle bundle) {
        l0.p(bundle, "savedState");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f4888k);
        if (stringArrayList != null) {
            this.savedIds.clear();
            b0.o0(this.savedIds, stringArrayList);
        }
    }

    @Override // s2.d1
    @n6.e
    public Bundle i() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return z0.i.b(q1.a(f4888k, new ArrayList(this.savedIds)));
    }

    @Override // s2.d1
    public void j(@n6.d t tVar, boolean z6) {
        l0.p(tVar, "popUpTo");
        if (this.fragmentManager.e1()) {
            Log.i(f4887j, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<t> value = b().b().getValue();
        List<t> subList = value.subList(value.indexOf(tVar), value.size());
        if (z6) {
            t tVar2 = (t) e0.w2(value);
            for (t tVar3 : e0.S4(subList)) {
                if (l0.g(tVar3, tVar2)) {
                    Log.i(f4887j, "FragmentManager cannot save the state of the initial destination " + tVar3);
                } else {
                    this.fragmentManager.S1(tVar3.f());
                    this.savedIds.add(tVar3.f());
                }
            }
        } else {
            this.fragmentManager.v1(tVar.f(), 1);
        }
        b().i(tVar, z6);
    }

    public final void p(@n6.d Fragment fragment, @n6.d t entry, @n6.d g1 state) {
        l0.p(fragment, "fragment");
        l0.p(entry, "entry");
        l0.p(state, "state");
        androidx.lifecycle.e1 viewModelStore = fragment.getViewModelStore();
        l0.o(viewModelStore, "fragment.viewModelStore");
        k2.c cVar = new k2.c();
        cVar.a(l1.d(a.class), f.f4901l);
        ((a) new c1(viewModelStore, cVar.b(), a.C0139a.f11626b).a(a.class)).i(new WeakReference<>(new e(entry, state)));
    }

    public final void q(t tVar, Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().k(fragment, new j(new g(fragment, tVar)));
        fragment.getLifecycle().a(this.fragmentObserver);
    }

    @Override // s2.d1
    @n6.d
    /* renamed from: r  reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this);
    }

    public final androidx.fragment.app.u0 s(t entry, u0 navOptions) {
        g0 e7 = entry.e();
        l0.n(e7, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle c7 = entry.c();
        String O = ((c) e7).O();
        if (O.charAt(0) == '.') {
            O = this.context.getPackageName() + O;
        }
        Fragment a7 = this.fragmentManager.H0().a(this.context.getClassLoader(), O);
        l0.o(a7, "fragmentManager.fragment…t.classLoader, className)");
        a7.setArguments(c7);
        androidx.fragment.app.u0 u6 = this.fragmentManager.u();
        l0.o(u6, "fragmentManager.beginTransaction()");
        int a8 = navOptions != null ? navOptions.a() : -1;
        int b7 = navOptions != null ? navOptions.b() : -1;
        int c8 = navOptions != null ? navOptions.c() : -1;
        int d7 = navOptions != null ? navOptions.d() : -1;
        if (a8 != -1 || b7 != -1 || c8 != -1 || d7 != -1) {
            if (a8 == -1) {
                a8 = 0;
            }
            if (b7 == -1) {
                b7 = 0;
            }
            if (c8 == -1) {
                c8 = 0;
            }
            u6.N(a8, b7, c8, d7 != -1 ? d7 : 0);
        }
        u6.D(this.containerId, a7, entry.f());
        u6.P(a7);
        u6.Q(true);
        return u6;
    }

    @n6.d
    public final t0<List<t>> u() {
        return b().b();
    }

    @n6.d
    public final Set<String> v() {
        Set y6 = m1.y(b().c().getValue(), e0.V5(b().b().getValue()));
        ArrayList arrayList = new ArrayList(x.Y(y6, 10));
        Iterator it = y6.iterator();
        while (it.hasNext()) {
            arrayList.add(((t) it.next()).f());
        }
        return e0.V5(arrayList);
    }

    @n6.d
    @k(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    public Fragment w(@n6.d Context context, @n6.d FragmentManager fragmentManager, @n6.d String className, @n6.e Bundle args) {
        l0.p(context, "context");
        l0.p(fragmentManager, "fragmentManager");
        l0.p(className, "className");
        Fragment a7 = fragmentManager.H0().a(context.getClassLoader(), className);
        l0.o(a7, "fragmentManager.fragment…t.classLoader, className)");
        return a7;
    }

    public final void x(t tVar, u0 u0Var, d1.a aVar) {
        boolean isEmpty = b().b().getValue().isEmpty();
        if (u0Var != null && !isEmpty && u0Var.k() && this.savedIds.remove(tVar.f())) {
            this.fragmentManager.K1(tVar.f());
            b().l(tVar);
            return;
        }
        androidx.fragment.app.u0 s6 = s(tVar, u0Var);
        if (!isEmpty) {
            s6.o(tVar.f());
        }
        if (aVar instanceof C0058d) {
            for (Map.Entry<View, String> entry : ((C0058d) aVar).a().entrySet()) {
                s6.n(entry.getKey(), entry.getValue());
            }
        }
        s6.q();
        b().l(tVar);
    }
}
