package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.k;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.q0;
import androidx.fragment.app.u0;
import androidx.lifecycle.z;
import androidx.navigation.fragment.g;
import androidx.navigation.fragment.h;
import d.i;
import h3.b;
import kotlin.Metadata;
import p0.x0;
import s2.j1;
import u4.l0;
import u4.r1;
import v3.m2;
@r1({"SMAP\nAbstractListDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,256:1\n232#2,3:257\n28#3,12:260\n65#4,4:272\n37#4:276\n53#4:277\n71#4,2:278\n*S KotlinDebug\n*F\n+ 1 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n*L\n110#1:257,3\n172#1:260,12\n179#1:272,4\n179#1:276\n179#1:277\n179#1:278,2\n*E\n"})
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0016\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006H\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010*\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Landroidx/navigation/fragment/a;", "Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/os/Bundle;", q0.f4467h, "Lv3/m2;", "onInflate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "o", "Landroidx/navigation/fragment/g;", "n", "view", "onViewCreated", "p", "onViewStateRestored", "outState", "onSaveInstanceState", "Landroidx/activity/k;", "b", "Landroidx/activity/k;", "onBackPressedCallback", "c", "Landroidx/navigation/fragment/g;", "_detailPaneNavHostFragment", "", androidx.appcompat.widget.d.f1513o, "I", "graphId", "Lh3/b;", x0.f14590b, "()Lh3/b;", "slidingPaneLayout", "l", "()Landroidx/navigation/fragment/g;", "detailPaneNavHostFragment", "<init>", "()V", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class a extends Fragment {
    @n6.e

    /* renamed from: b  reason: collision with root package name and from kotlin metadata */
    public k onBackPressedCallback;
    @n6.e

    /* renamed from: c  reason: collision with root package name and from kotlin metadata */
    public g _detailPaneNavHostFragment;

    /* renamed from: d  reason: collision with root package name and from kotlin metadata */
    public int graphId;

    /* renamed from: androidx.navigation.fragment.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0057a extends k implements b.f {
        @n6.d

        /* renamed from: d  reason: collision with root package name */
        public final h3.b f4882d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0057a(@n6.d h3.b bVar) {
            super(true);
            l0.p(bVar, "slidingPaneLayout");
            this.f4882d = bVar;
            bVar.a(this);
        }

        @Override // h3.b.f
        public void a(@n6.d View view, float f7) {
            l0.p(view, "panel");
        }

        @Override // h3.b.f
        public void b(@n6.d View view) {
            l0.p(view, "panel");
            i(true);
        }

        @Override // h3.b.f
        public void c(@n6.d View view) {
            l0.p(view, "panel");
            i(false);
        }

        @Override // androidx.activity.k
        public void e() {
            this.f4882d.d();
        }
    }

    @r1({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n*L\n1#1,384:1\n69#2:385\n70#2:389\n180#3,3:386\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h3.b f4884b;

        public b(h3.b bVar) {
            this.f4884b = bVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@n6.d View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            l0.q(view, "view");
            view.removeOnLayoutChangeListener(this);
            k kVar = a.this.onBackPressedCallback;
            l0.m(kVar);
            kVar.i(this.f4884b.o() && this.f4884b.isOpen());
        }
    }

    @n6.d
    public final g l() {
        g gVar = this._detailPaneNavHostFragment;
        if (gVar != null) {
            l0.n(gVar, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            return gVar;
        }
        throw new IllegalStateException(("Fragment " + this + " was called before onCreateView().").toString());
    }

    @n6.d
    public final h3.b m() {
        View requireView = requireView();
        l0.n(requireView, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout");
        return (h3.b) requireView;
    }

    @n6.d
    public g n() {
        int i7 = this.graphId;
        return i7 != 0 ? g.Companion.c(g.INSTANCE, i7, null, 2, null) : new g();
    }

    @n6.d
    public abstract View o(@n6.d LayoutInflater inflater, @n6.e ViewGroup container, @n6.e Bundle savedInstanceState);

    @Override // androidx.fragment.app.Fragment
    @i
    @n6.d
    public final View onCreateView(@n6.d LayoutInflater inflater, @n6.e ViewGroup container, @n6.e Bundle savedInstanceState) {
        g n7;
        l0.p(inflater, "inflater");
        if (savedInstanceState != null) {
            this.graphId = savedInstanceState.getInt(g.f4911g);
        }
        h3.b bVar = new h3.b(inflater.getContext());
        bVar.setId(h.c.f4924c);
        View o6 = o(inflater, bVar, savedInstanceState);
        if (!l0.g(o6, bVar) && !l0.g(o6.getParent(), bVar)) {
            bVar.addView(o6);
        }
        Context context = inflater.getContext();
        l0.o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(h.c.f4923b);
        b.e eVar = new b.e(inflater.getContext().getResources().getDimensionPixelSize(h.b.f4921a), -1);
        eVar.f10303a = 1.0f;
        bVar.addView(fragmentContainerView, eVar);
        Fragment r02 = getChildFragmentManager().r0(h.c.f4923b);
        if (r02 != null) {
            n7 = (g) r02;
        } else {
            n7 = n();
            FragmentManager childFragmentManager = getChildFragmentManager();
            l0.o(childFragmentManager, q0.f4469j);
            u0 u6 = childFragmentManager.u();
            l0.o(u6, "beginTransaction()");
            u6.Q(true);
            u6.f(h.c.f4923b, n7);
            u6.q();
        }
        this._detailPaneNavHostFragment = n7;
        this.onBackPressedCallback = new C0057a(bVar);
        if (!u1.U0(bVar) || bVar.isLayoutRequested()) {
            bVar.addOnLayoutChangeListener(new b(bVar));
        } else {
            k kVar = this.onBackPressedCallback;
            l0.m(kVar);
            kVar.i(bVar.o() && bVar.isOpen());
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        z viewLifecycleOwner = getViewLifecycleOwner();
        k kVar2 = this.onBackPressedCallback;
        l0.m(kVar2);
        onBackPressedDispatcher.c(viewLifecycleOwner, kVar2);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    @i
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
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public void onSaveInstanceState(@n6.d Bundle bundle) {
        l0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        int i7 = this.graphId;
        if (i7 != 0) {
            bundle.putInt(g.f4911g, i7);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public final void onViewCreated(@n6.d View view, @n6.e Bundle bundle) {
        l0.p(view, "view");
        super.onViewCreated(view, bundle);
        View childAt = m().getChildAt(0);
        l0.o(childAt, "listPaneView");
        p(childAt, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public void onViewStateRestored(@n6.e Bundle bundle) {
        super.onViewStateRestored(bundle);
        k kVar = this.onBackPressedCallback;
        l0.m(kVar);
        kVar.i(m().o() && m().isOpen());
    }

    public void p(@n6.d View view, @n6.e Bundle bundle) {
        l0.p(view, "view");
    }
}
