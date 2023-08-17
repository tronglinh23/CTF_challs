package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.z;
import androidx.navigation.fragment.DialogFragmentNavigator;
import androidx.navigation.fragment.h;
import i0.k0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.flow.t0;
import s2.d1;
import s2.e1;
import s2.g0;
import s2.g1;
import s2.i;
import s2.t;
import s2.u0;
import u4.l0;
import u4.r1;
import u4.u1;
import x3.e0;
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001&\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000234B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b0\u00101J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J*\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0003H\u0002R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00180)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00065"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator;", "Ls2/d1;", "Landroidx/navigation/fragment/DialogFragmentNavigator$b;", "Ls2/t;", "popUpTo", "", "savedState", "Lv3/m2;", "j", "n", "", "entries", "Ls2/u0;", "navOptions", "Ls2/d1$a;", "navigatorExtras", "e", "backStackEntry", "g", "Ls2/g1;", "state", "f", "entry", "q", "Landroidx/fragment/app/m;", "o", "Landroid/content/Context;", "c", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", androidx.appcompat.widget.d.f1513o, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "", "Ljava/util/Set;", "restoredTagsAwaitingAttach", "androidx/navigation/fragment/DialogFragmentNavigator$observer$1", "Landroidx/navigation/fragment/DialogFragmentNavigator$observer$1;", "observer", "", "Ljava/util/Map;", "transitioningFragments", "Lkotlinx/coroutines/flow/t0;", "p", "()Lkotlinx/coroutines/flow/t0;", "backStack", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "h", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@d1.b("dialog")
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends d1<b> {
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public static final String f4870i = "DialogFragmentNavigator";
    @n6.d

    /* renamed from: c  reason: collision with root package name and from kotlin metadata */
    public final Context context;
    @n6.d

    /* renamed from: d  reason: collision with root package name and from kotlin metadata */
    public final FragmentManager fragmentManager;
    @n6.d

    /* renamed from: e  reason: collision with root package name and from kotlin metadata */
    public final Set<String> restoredTagsAwaitingAttach;
    @n6.d

    /* renamed from: f  reason: collision with root package name and from kotlin metadata */
    public final DialogFragmentNavigator$observer$1 observer;
    @n6.d

    /* renamed from: g  reason: collision with root package name and from kotlin metadata */
    public final Map<String, m> transitioningFragments;

    @g0.a(m.class)
    @r1({"SMAP\nDialogFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,304:1\n1#2:305\n232#3,3:306\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n*L\n271#1:306,3\n*E\n"})
    /* loaded from: classes.dex */
    public static class b extends g0 implements i {
        @n6.e

        /* renamed from: v  reason: collision with root package name */
        public String f4876v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@n6.d d1<? extends b> d1Var) {
            super(d1Var);
            l0.p(d1Var, "fragmentNavigator");
        }

        @Override // s2.g0
        @d.i
        public void C(@n6.d Context context, @n6.d AttributeSet attributeSet) {
            l0.p(context, "context");
            l0.p(attributeSet, "attrs");
            super.C(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, h.d.f4925a);
            l0.o(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(h.d.f4926b);
            if (string != null) {
                P(string);
            }
            obtainAttributes.recycle();
        }

        @n6.d
        public final String O() {
            String str = this.f4876v;
            if (str != null) {
                l0.n(str, "null cannot be cast to non-null type kotlin.String");
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set".toString());
        }

        @n6.d
        public final b P(@n6.d String str) {
            l0.p(str, "className");
            this.f4876v = str;
            return this;
        }

        @Override // s2.g0
        public boolean equals(@n6.e Object obj) {
            return obj != null && (obj instanceof b) && super.equals(obj) && l0.g(this.f4876v, ((b) obj).f4876v);
        }

        @Override // s2.g0
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f4876v;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@n6.d e1 e1Var) {
            this(e1Var.e(DialogFragmentNavigator.class));
            l0.p(e1Var, "navigatorProvider");
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.navigation.fragment.DialogFragmentNavigator$observer$1] */
    public DialogFragmentNavigator(@n6.d Context context, @n6.d FragmentManager fragmentManager) {
        l0.p(context, "context");
        l0.p(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new v() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$observer$1

            /* loaded from: classes.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f4878a;

                static {
                    int[] iArr = new int[p.a.values().length];
                    try {
                        iArr[p.a.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[p.a.ON_RESUME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[p.a.ON_STOP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[p.a.ON_DESTROY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f4878a = iArr;
                }
            }

            @Override // androidx.lifecycle.v
            public void d(@n6.d z zVar, @n6.d p.a aVar) {
                g1 b7;
                g1 b8;
                g1 b9;
                g1 b10;
                g1 b11;
                g1 b12;
                g1 b13;
                l0.p(zVar, "source");
                l0.p(aVar, k0.I0);
                int i7 = a.f4878a[aVar.ordinal()];
                boolean z6 = true;
                if (i7 == 1) {
                    m mVar = (m) zVar;
                    b7 = DialogFragmentNavigator.this.b();
                    List<t> value = b7.b().getValue();
                    if (!(value instanceof Collection) || !value.isEmpty()) {
                        Iterator<T> it = value.iterator();
                        while (it.hasNext()) {
                            if (l0.g(((t) it.next()).f(), mVar.getTag())) {
                                break;
                            }
                        }
                    }
                    z6 = false;
                    if (z6) {
                        return;
                    }
                    mVar.dismiss();
                    return;
                }
                Object obj = null;
                if (i7 == 2) {
                    m mVar2 = (m) zVar;
                    b8 = DialogFragmentNavigator.this.b();
                    for (Object obj2 : b8.c().getValue()) {
                        if (l0.g(((t) obj2).f(), mVar2.getTag())) {
                            obj = obj2;
                        }
                    }
                    t tVar = (t) obj;
                    if (tVar != null) {
                        b9 = DialogFragmentNavigator.this.b();
                        b9.e(tVar);
                    }
                } else if (i7 != 3) {
                    if (i7 != 4) {
                        return;
                    }
                    m mVar3 = (m) zVar;
                    b12 = DialogFragmentNavigator.this.b();
                    for (Object obj3 : b12.c().getValue()) {
                        if (l0.g(((t) obj3).f(), mVar3.getTag())) {
                            obj = obj3;
                        }
                    }
                    t tVar2 = (t) obj;
                    if (tVar2 != null) {
                        b13 = DialogFragmentNavigator.this.b();
                        b13.e(tVar2);
                    }
                    mVar3.getLifecycle().d(this);
                } else {
                    m mVar4 = (m) zVar;
                    if (mVar4.requireDialog().isShowing()) {
                        return;
                    }
                    b10 = DialogFragmentNavigator.this.b();
                    List<t> value2 = b10.b().getValue();
                    ListIterator<t> listIterator = value2.listIterator(value2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        Object previous = listIterator.previous();
                        if (l0.g(((t) previous).f(), mVar4.getTag())) {
                            obj = previous;
                            break;
                        }
                    }
                    t tVar3 = (t) obj;
                    if (!l0.g(e0.q3(value2), tVar3)) {
                        Log.i(DialogFragmentNavigator.f4870i, "Dialog " + mVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                    }
                    if (tVar3 != null) {
                        b11 = DialogFragmentNavigator.this.b();
                        b11.i(tVar3, false);
                    }
                }
            }
        };
        this.transitioningFragments = new LinkedHashMap();
    }

    public static final void r(DialogFragmentNavigator dialogFragmentNavigator, FragmentManager fragmentManager, Fragment fragment) {
        l0.p(dialogFragmentNavigator, "this$0");
        l0.p(fragmentManager, "<anonymous parameter 0>");
        l0.p(fragment, "childFragment");
        Set<String> set = dialogFragmentNavigator.restoredTagsAwaitingAttach;
        if (u1.a(set).remove(fragment.getTag())) {
            fragment.getLifecycle().a(dialogFragmentNavigator.observer);
        }
        Map<String, m> map = dialogFragmentNavigator.transitioningFragments;
        u1.k(map).remove(fragment.getTag());
    }

    @Override // s2.d1
    public void e(@n6.d List<t> list, @n6.e u0 u0Var, @n6.e d1.a aVar) {
        l0.p(list, "entries");
        if (this.fragmentManager.e1()) {
            Log.i(f4870i, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<t> it = list.iterator();
        while (it.hasNext()) {
            q(it.next());
        }
    }

    @Override // s2.d1
    public void f(@n6.d g1 g1Var) {
        p lifecycle;
        l0.p(g1Var, "state");
        super.f(g1Var);
        for (t tVar : g1Var.b().getValue()) {
            m mVar = (m) this.fragmentManager.s0(tVar.f());
            if (mVar == null || (lifecycle = mVar.getLifecycle()) == null) {
                this.restoredTagsAwaitingAttach.add(tVar.f());
            } else {
                lifecycle.a(this.observer);
            }
        }
        this.fragmentManager.o(new androidx.fragment.app.l0() { // from class: v2.a
            @Override // androidx.fragment.app.l0
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                DialogFragmentNavigator.r(DialogFragmentNavigator.this, fragmentManager, fragment);
            }
        });
    }

    @Override // s2.d1
    public void g(@n6.d t tVar) {
        l0.p(tVar, "backStackEntry");
        if (this.fragmentManager.e1()) {
            Log.i(f4870i, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        m mVar = this.transitioningFragments.get(tVar.f());
        if (mVar == null) {
            Fragment s02 = this.fragmentManager.s0(tVar.f());
            mVar = s02 instanceof m ? (m) s02 : null;
        }
        if (mVar != null) {
            mVar.getLifecycle().d(this.observer);
            mVar.dismiss();
        }
        o(tVar).show(this.fragmentManager, tVar.f());
        b().g(tVar);
    }

    @Override // s2.d1
    public void j(@n6.d t tVar, boolean z6) {
        l0.p(tVar, "popUpTo");
        if (this.fragmentManager.e1()) {
            Log.i(f4870i, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<t> value = b().b().getValue();
        Iterator it = e0.S4(value.subList(value.indexOf(tVar), value.size())).iterator();
        while (it.hasNext()) {
            Fragment s02 = this.fragmentManager.s0(((t) it.next()).f());
            if (s02 != null) {
                ((m) s02).dismiss();
            }
        }
        b().i(tVar, z6);
    }

    @Override // s2.d1
    @n6.d
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    public final m o(t entry) {
        g0 e7 = entry.e();
        l0.n(e7, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        b bVar = (b) e7;
        String O = bVar.O();
        if (O.charAt(0) == '.') {
            O = this.context.getPackageName() + O;
        }
        Fragment a7 = this.fragmentManager.H0().a(this.context.getClassLoader(), O);
        l0.o(a7, "fragmentManager.fragment…ader, className\n        )");
        if (m.class.isAssignableFrom(a7.getClass())) {
            m mVar = (m) a7;
            mVar.setArguments(entry.c());
            mVar.getLifecycle().a(this.observer);
            this.transitioningFragments.put(entry.f(), mVar);
            return mVar;
        }
        throw new IllegalArgumentException(("Dialog destination " + bVar.O() + " is not an instance of DialogFragment").toString());
    }

    @n6.d
    public final t0<List<t>> p() {
        return b().b();
    }

    public final void q(t tVar) {
        o(tVar).show(this.fragmentManager, tVar.f());
        b().l(tVar);
    }
}
