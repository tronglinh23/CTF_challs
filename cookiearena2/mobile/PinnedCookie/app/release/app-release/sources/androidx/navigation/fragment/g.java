package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.q0;
import androidx.lifecycle.e1;
import androidx.navigation.fragment.d;
import androidx.navigation.fragment.g;
import androidx.navigation.fragment.h;
import androidx.savedstate.a;
import d.b1;
import d.n0;
import kotlin.Metadata;
import s2.c1;
import s2.d1;
import s2.j1;
import s2.r0;
import s4.i;
import s4.m;
import u4.l0;
import u4.r1;
import u4.w;
import v3.d0;
import v3.f0;
import v3.k;
import v3.m2;
import v3.q1;
@r1({"SMAP\nNavHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,407:1\n181#2,2:408\n1#3:410\n232#4,3:411\n232#4,3:414\n*S KotlinDebug\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n*L\n210#1:408,2\n283#1:411,3\n291#1:414,3\n*E\n"})
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b5\u00106J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0015J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0015J\u0010\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010H\u0015J&\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0007H\u0017J\b\u0010 \u001a\u00020\u0005H\u0016R\u001b\u0010\u000b\u001a\u00020\n8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00068"}, d2 = {"Landroidx/navigation/fragment/g;", "Landroidx/fragment/app/Fragment;", "Ls2/q0;", "Landroid/content/Context;", "context", "Lv3/m2;", "onAttach", "Landroid/os/Bundle;", q0.f4467h, "onCreate", "Ls2/r0;", "navHostController", "t", "Ls2/w;", "navController", "s", "Ls2/d1;", "Landroidx/navigation/fragment/d$c;", "o", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroid/util/AttributeSet;", "attrs", "onInflate", "outState", "onSaveInstanceState", "onDestroyView", "b", "Lv3/d0;", "r", "()Ls2/r0;", "c", "Landroid/view/View;", "viewParent", "", androidx.appcompat.widget.d.f1513o, "I", "graphId", "", "e", "Z", "defaultNavHost", "a", "()Ls2/w;", "q", "()I", "containerId", "<init>", "()V", "f", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class g extends Fragment implements s2.q0 {
    @n6.d

    /* renamed from: f  reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    @b1({b1.a.LIBRARY_GROUP})
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public static final String f4911g = "android-support-nav:fragment:graphId";
    @b1({b1.a.LIBRARY_GROUP})
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public static final String f4912h = "android-support-nav:fragment:startDestinationArgs";
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public static final String f4913i = "android-support-nav:fragment:navControllerState";
    @n6.d

    /* renamed from: j  reason: collision with root package name */
    public static final String f4914j = "android-support-nav:fragment:defaultHost";
    @n6.d

    /* renamed from: b  reason: collision with root package name and from kotlin metadata */
    public final d0 navHostController = f0.b(new b());
    @n6.e

    /* renamed from: c  reason: collision with root package name and from kotlin metadata */
    public View viewParent;

    /* renamed from: d  reason: collision with root package name and from kotlin metadata */
    public int graphId;

    /* renamed from: e  reason: collision with root package name and from kotlin metadata */
    public boolean defaultNavHost;

    /* renamed from: androidx.navigation.fragment.g$a  reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public static /* synthetic */ g c(Companion companion, int i7, Bundle bundle, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                bundle = null;
            }
            return companion.b(i7, bundle);
        }

        @n6.d
        @i
        @m
        public final g a(@n0 int i7) {
            return c(this, i7, null, 2, null);
        }

        @n6.d
        @i
        @m
        public final g b(@n0 int i7, @n6.e Bundle bundle) {
            Bundle bundle2;
            if (i7 != 0) {
                bundle2 = new Bundle();
                bundle2.putInt(g.f4911g, i7);
            } else {
                bundle2 = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putBundle(g.f4912h, bundle);
            }
            g gVar = new g();
            if (bundle2 != null) {
                gVar.setArguments(bundle2);
            }
            return gVar;
        }

        @n6.d
        @m
        public final s2.w d(@n6.d Fragment fragment) {
            Dialog dialog;
            Window window;
            l0.p(fragment, "fragment");
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
                if (fragment2 instanceof g) {
                    return ((g) fragment2).r();
                }
                Fragment O0 = fragment2.getParentFragmentManager().O0();
                if (O0 instanceof g) {
                    return ((g) O0).r();
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return c1.k(view);
            }
            View view2 = null;
            androidx.fragment.app.m mVar = fragment instanceof androidx.fragment.app.m ? (androidx.fragment.app.m) fragment : null;
            if (mVar != null && (dialog = mVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
                view2 = window.getDecorView();
            }
            if (view2 != null) {
                return c1.k(view2);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }

        public Companion() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.a<r0> {
        public b() {
            super(0);
        }

        public static final Bundle g(r0 r0Var) {
            l0.p(r0Var, "$this_apply");
            Bundle R0 = r0Var.R0();
            if (R0 == null) {
                Bundle bundle = Bundle.EMPTY;
                l0.o(bundle, "EMPTY");
                return bundle;
            }
            return R0;
        }

        public static final Bundle h(g gVar) {
            l0.p(gVar, "this$0");
            if (gVar.graphId != 0) {
                return z0.i.b(q1.a(g.f4911g, Integer.valueOf(gVar.graphId)));
            }
            Bundle bundle = Bundle.EMPTY;
            l0.o(bundle, "{\n                    Bu…e.EMPTY\n                }");
            return bundle;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final r0 n() {
            Context context = g.this.getContext();
            if (context != null) {
                l0.o(context, "checkNotNull(context) {\n…nt is attached\"\n        }");
                final r0 r0Var = new r0(context);
                final g gVar = g.this;
                r0Var.X0(gVar);
                e1 viewModelStore = gVar.getViewModelStore();
                l0.o(viewModelStore, "viewModelStore");
                r0Var.a1(viewModelStore);
                gVar.t(r0Var);
                Bundle b7 = gVar.getSavedStateRegistry().b(g.f4913i);
                if (b7 != null) {
                    r0Var.O0(b7);
                }
                gVar.getSavedStateRegistry().j(g.f4913i, new a.c() { // from class: v2.h
                    @Override // androidx.savedstate.a.c
                    public final Bundle a() {
                        Bundle g7;
                        g7 = g.b.g(r0.this);
                        return g7;
                    }
                });
                Bundle b8 = gVar.getSavedStateRegistry().b(g.f4911g);
                if (b8 != null) {
                    gVar.graphId = b8.getInt(g.f4911g);
                }
                gVar.getSavedStateRegistry().j(g.f4911g, new a.c() { // from class: v2.i
                    @Override // androidx.savedstate.a.c
                    public final Bundle a() {
                        Bundle h7;
                        h7 = g.b.h(androidx.navigation.fragment.g.this);
                        return h7;
                    }
                });
                if (gVar.graphId != 0) {
                    r0Var.S0(gVar.graphId);
                } else {
                    Bundle arguments = gVar.getArguments();
                    int i7 = arguments != null ? arguments.getInt(g.f4911g) : 0;
                    Bundle bundle = arguments != null ? arguments.getBundle(g.f4912h) : null;
                    if (i7 != 0) {
                        r0Var.T0(i7, bundle);
                    }
                }
                return r0Var;
            }
            throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
        }
    }

    @n6.d
    @i
    @m
    public static final g m(@n0 int i7) {
        return INSTANCE.a(i7);
    }

    @n6.d
    @i
    @m
    public static final g n(@n0 int i7, @n6.e Bundle bundle) {
        return INSTANCE.b(i7, bundle);
    }

    @n6.d
    @m
    public static final s2.w p(@n6.d Fragment fragment) {
        return INSTANCE.d(fragment);
    }

    @Override // s2.q0
    @n6.d
    public final s2.w a() {
        return r();
    }

    @n6.d
    @k(message = "Use {@link #onCreateNavController(NavController)}")
    public d1<? extends d.c> o() {
        Context requireContext = requireContext();
        l0.o(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        l0.o(childFragmentManager, q0.f4469j);
        return new d(requireContext, childFragmentManager, q());
    }

    @Override // androidx.fragment.app.Fragment
    @d.i
    public void onAttach(@n6.d Context context) {
        l0.p(context, "context");
        super.onAttach(context);
        if (this.defaultNavHost) {
            getParentFragmentManager().u().P(this).q();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @d.i
    public void onCreate(@n6.e Bundle bundle) {
        r();
        if (bundle != null && bundle.getBoolean(f4914j, false)) {
            this.defaultNavHost = true;
            getParentFragmentManager().u().P(this).q();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @n6.e
    public View onCreateView(@n6.d LayoutInflater inflater, @n6.e ViewGroup container, @n6.e Bundle savedInstanceState) {
        l0.p(inflater, "inflater");
        Context context = inflater.getContext();
        l0.o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(q());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && c1.k(view) == r()) {
            c1.n(view, null);
        }
        this.viewParent = null;
    }

    @Override // androidx.fragment.app.Fragment
    @d.i
    public void onInflate(@n6.d Context context, @n6.d AttributeSet attributeSet, @n6.e Bundle bundle) {
        l0.p(context, "context");
        l0.p(attributeSet, "attrs");
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.c.f16366g);
        l0.o(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(j1.c.f16367h, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        m2 m2Var = m2.f17815a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.d.f4929e);
        l0.o(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(h.d.f4930f, false)) {
            this.defaultNavHost = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @d.i
    public void onSaveInstanceState(@n6.d Bundle bundle) {
        l0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.defaultNavHost) {
            bundle.putBoolean(f4914j, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@n6.d View view, @n6.e Bundle bundle) {
        l0.p(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        c1.n(view, r());
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            l0.n(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.viewParent = view2;
            l0.m(view2);
            if (view2.getId() == getId()) {
                View view3 = this.viewParent;
                l0.m(view3);
                c1.n(view3, r());
            }
        }
    }

    public final int q() {
        int id = getId();
        return (id == 0 || id == -1) ? h.c.f4922a : id;
    }

    @n6.d
    public final r0 r() {
        return (r0) this.navHostController.getValue();
    }

    @d.i
    @k(message = "Override {@link #onCreateNavHostController(NavHostController)} to gain\n      access to the full {@link NavHostController} that is created by this NavHostFragment.")
    public void s(@n6.d s2.w wVar) {
        l0.p(wVar, "navController");
        s2.e1 S = wVar.S();
        Context requireContext = requireContext();
        l0.o(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        l0.o(childFragmentManager, q0.f4469j);
        S.c(new DialogFragmentNavigator(requireContext, childFragmentManager));
        wVar.S().c(o());
    }

    @d.i
    public void t(@n6.d r0 r0Var) {
        l0.p(r0Var, "navHostController");
        s(r0Var);
    }
}
