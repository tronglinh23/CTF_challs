package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.b3;
import androidx.core.view.z2;
import d.b1;
import f.a;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class x1 implements l0 {

    /* renamed from: s  reason: collision with root package name */
    public static final String f1818s = "ToolbarWidgetWrapper";

    /* renamed from: t  reason: collision with root package name */
    public static final int f1819t = 3;

    /* renamed from: u  reason: collision with root package name */
    public static final long f1820u = 200;

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f1821a;

    /* renamed from: b  reason: collision with root package name */
    public int f1822b;

    /* renamed from: c  reason: collision with root package name */
    public View f1823c;

    /* renamed from: d  reason: collision with root package name */
    public Spinner f1824d;

    /* renamed from: e  reason: collision with root package name */
    public View f1825e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1826f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1827g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f1828h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1829i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1830j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1831k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1832l;

    /* renamed from: m  reason: collision with root package name */
    public Window.Callback f1833m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1834n;

    /* renamed from: o  reason: collision with root package name */
    public c f1835o;

    /* renamed from: p  reason: collision with root package name */
    public int f1836p;

    /* renamed from: q  reason: collision with root package name */
    public int f1837q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f1838r;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final androidx.appcompat.view.menu.a f1839b;

        public a() {
            this.f1839b = new androidx.appcompat.view.menu.a(x1.this.f1821a.getContext(), 0, 16908332, 0, 0, x1.this.f1830j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x1 x1Var = x1.this;
            Window.Callback callback = x1Var.f1833m;
            if (callback == null || !x1Var.f1834n) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1839b);
        }
    }

    /* loaded from: classes.dex */
    public class b extends b3 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1841a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1842b;

        public b(int i7) {
            this.f1842b = i7;
        }

        @Override // androidx.core.view.b3, androidx.core.view.a3
        public void a(View view) {
            this.f1841a = true;
        }

        @Override // androidx.core.view.b3, androidx.core.view.a3
        public void b(View view) {
            if (this.f1841a) {
                return;
            }
            x1.this.f1821a.setVisibility(this.f1842b);
        }

        @Override // androidx.core.view.b3, androidx.core.view.a3
        public void c(View view) {
            x1.this.f1821a.setVisibility(0);
        }
    }

    public x1(Toolbar toolbar, boolean z6) {
        this(toolbar, z6, a.k.f9221b, a.f.f9121v);
    }

    @Override // androidx.appcompat.widget.l0
    public void A(CharSequence charSequence) {
        this.f1831k = charSequence;
        if ((this.f1822b & 8) != 0) {
            this.f1821a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.l0
    public int B() {
        return this.f1822b;
    }

    @Override // androidx.appcompat.widget.l0
    public int C() {
        Spinner spinner = this.f1824d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.l0
    public void D(Drawable drawable) {
        if (this.f1838r != drawable) {
            this.f1838r = drawable;
            Y();
        }
    }

    @Override // androidx.appcompat.widget.l0
    public void E(SparseArray<Parcelable> sparseArray) {
        this.f1821a.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.l0
    public void F(int i7) {
        Spinner spinner = this.f1824d;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i7);
    }

    @Override // androidx.appcompat.widget.l0
    public Menu G() {
        return this.f1821a.getMenu();
    }

    @Override // androidx.appcompat.widget.l0
    public void H(int i7) {
        z(i7 == 0 ? null : g().getString(i7));
    }

    @Override // androidx.appcompat.widget.l0
    public boolean I() {
        return this.f1823c != null;
    }

    @Override // androidx.appcompat.widget.l0
    public int J() {
        return this.f1836p;
    }

    @Override // androidx.appcompat.widget.l0
    public void K(View view) {
        View view2 = this.f1825e;
        if (view2 != null && (this.f1822b & 16) != 0) {
            this.f1821a.removeView(view2);
        }
        this.f1825e = view;
        if (view == null || (this.f1822b & 16) == 0) {
            return;
        }
        this.f1821a.addView(view);
    }

    @Override // androidx.appcompat.widget.l0
    public void L(int i7) {
        z2 M = M(i7, 200L);
        if (M != null) {
            M.y();
        }
    }

    @Override // androidx.appcompat.widget.l0
    public z2 M(int i7, long j7) {
        return androidx.core.view.u1.g(this.f1821a).b(i7 == 0 ? 1.0f : 0.0f).s(j7).u(new b(i7));
    }

    @Override // androidx.appcompat.widget.l0
    public void N(int i7) {
        View view;
        int i8 = this.f1836p;
        if (i7 != i8) {
            if (i8 == 1) {
                Spinner spinner = this.f1824d;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.f1821a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f1824d);
                    }
                }
            } else if (i8 == 2 && (view = this.f1823c) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.f1821a;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.f1823c);
                }
            }
            this.f1836p = i7;
            if (i7 != 0) {
                if (i7 == 1) {
                    V();
                    this.f1821a.addView(this.f1824d, 0);
                } else if (i7 != 2) {
                    throw new IllegalArgumentException("Invalid navigation mode " + i7);
                } else {
                    View view2 = this.f1823c;
                    if (view2 != null) {
                        this.f1821a.addView(view2, 0);
                        Toolbar.g gVar = (Toolbar.g) this.f1823c.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
                        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
                        gVar.f715a = 8388691;
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.l0
    public void O() {
        Log.i(f1818s, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.l0
    public int P() {
        Spinner spinner = this.f1824d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.l0
    public void Q() {
        Log.i(f1818s, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.l0
    public void R(Drawable drawable) {
        this.f1828h = drawable;
        Y();
    }

    @Override // androidx.appcompat.widget.l0
    public void S(boolean z6) {
        this.f1821a.setCollapsible(z6);
    }

    @Override // androidx.appcompat.widget.l0
    public void T(int i7) {
        R(i7 != 0 ? g.a.b(g(), i7) : null);
    }

    public final int U() {
        if (this.f1821a.getNavigationIcon() != null) {
            this.f1838r = this.f1821a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public final void V() {
        if (this.f1824d == null) {
            this.f1824d = new b0(g(), null, a.b.f8902m);
            this.f1824d.setLayoutParams(new Toolbar.g(-2, -2, 8388627));
        }
    }

    public final void W(CharSequence charSequence) {
        this.f1830j = charSequence;
        if ((this.f1822b & 8) != 0) {
            this.f1821a.setTitle(charSequence);
            if (this.f1829i) {
                androidx.core.view.u1.E1(this.f1821a.getRootView(), charSequence);
            }
        }
    }

    public final void X() {
        if ((this.f1822b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1832l)) {
                this.f1821a.setNavigationContentDescription(this.f1837q);
            } else {
                this.f1821a.setNavigationContentDescription(this.f1832l);
            }
        }
    }

    public final void Y() {
        if ((this.f1822b & 4) == 0) {
            this.f1821a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1821a;
        Drawable drawable = this.f1828h;
        if (drawable == null) {
            drawable = this.f1838r;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void Z() {
        Drawable drawable;
        int i7 = this.f1822b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) != 0) {
            drawable = this.f1827g;
            if (drawable == null) {
                drawable = this.f1826f;
            }
        } else {
            drawable = this.f1826f;
        }
        this.f1821a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.l0
    public void a(Menu menu, n.a aVar) {
        if (this.f1835o == null) {
            c cVar = new c(this.f1821a.getContext());
            this.f1835o = cVar;
            cVar.h(a.g.f9149j);
        }
        this.f1835o.setCallback(aVar);
        this.f1821a.setMenu((androidx.appcompat.view.menu.g) menu, this.f1835o);
    }

    @Override // androidx.appcompat.widget.l0
    public int b() {
        return this.f1821a.getVisibility();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean c() {
        return this.f1821a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.l0
    public void collapseActionView() {
        this.f1821a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.l0
    public void d() {
        this.f1834n = true;
    }

    @Override // androidx.appcompat.widget.l0
    public boolean e() {
        return this.f1827g != null;
    }

    @Override // androidx.appcompat.widget.l0
    public boolean f() {
        return this.f1821a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.l0
    public Context g() {
        return this.f1821a.getContext();
    }

    @Override // androidx.appcompat.widget.l0
    public int getHeight() {
        return this.f1821a.getHeight();
    }

    @Override // androidx.appcompat.widget.l0
    public CharSequence getTitle() {
        return this.f1821a.getTitle();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean h() {
        return this.f1821a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean i() {
        return this.f1821a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean j() {
        return this.f1826f != null;
    }

    @Override // androidx.appcompat.widget.l0
    public boolean k() {
        return this.f1821a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.l0
    public void l(int i7) {
        if (i7 == this.f1837q) {
            return;
        }
        this.f1837q = i7;
        if (TextUtils.isEmpty(this.f1821a.getNavigationContentDescription())) {
            H(this.f1837q);
        }
    }

    @Override // androidx.appcompat.widget.l0
    public void m() {
        this.f1821a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.l0
    public void n(n.a aVar, g.a aVar2) {
        this.f1821a.setMenuCallbacks(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.l0
    public View o() {
        return this.f1825e;
    }

    @Override // androidx.appcompat.widget.l0
    public void p(j1 j1Var) {
        View view = this.f1823c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1821a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1823c);
            }
        }
        this.f1823c = j1Var;
        if (j1Var == null || this.f1836p != 2) {
            return;
        }
        this.f1821a.addView(j1Var, 0);
        Toolbar.g gVar = (Toolbar.g) this.f1823c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f715a = 8388691;
        j1Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.l0
    public ViewGroup q() {
        return this.f1821a;
    }

    @Override // androidx.appcompat.widget.l0
    public void r(boolean z6) {
    }

    @Override // androidx.appcompat.widget.l0
    public void s(Drawable drawable) {
        this.f1827g = drawable;
        Z();
    }

    @Override // androidx.appcompat.widget.l0
    public void setBackgroundDrawable(Drawable drawable) {
        androidx.core.view.u1.I1(this.f1821a, drawable);
    }

    @Override // androidx.appcompat.widget.l0
    public void setIcon(int i7) {
        setIcon(i7 != 0 ? g.a.b(g(), i7) : null);
    }

    @Override // androidx.appcompat.widget.l0
    public void setLogo(int i7) {
        s(i7 != 0 ? g.a.b(g(), i7) : null);
    }

    @Override // androidx.appcompat.widget.l0
    public void setTitle(CharSequence charSequence) {
        this.f1829i = true;
        W(charSequence);
    }

    @Override // androidx.appcompat.widget.l0
    public void setVisibility(int i7) {
        this.f1821a.setVisibility(i7);
    }

    @Override // androidx.appcompat.widget.l0
    public void setWindowCallback(Window.Callback callback) {
        this.f1833m = callback;
    }

    @Override // androidx.appcompat.widget.l0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1829i) {
            return;
        }
        W(charSequence);
    }

    @Override // androidx.appcompat.widget.l0
    public void t(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        V();
        this.f1824d.setAdapter(spinnerAdapter);
        this.f1824d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.l0
    public void u(SparseArray<Parcelable> sparseArray) {
        this.f1821a.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.l0
    public boolean v() {
        return this.f1821a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean w() {
        return this.f1821a.isTitleTruncated();
    }

    @Override // androidx.appcompat.widget.l0
    public void x(int i7) {
        View view;
        int i8 = this.f1822b ^ i7;
        this.f1822b = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    X();
                }
                Y();
            }
            if ((i8 & 3) != 0) {
                Z();
            }
            if ((i8 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    this.f1821a.setTitle(this.f1830j);
                    this.f1821a.setSubtitle(this.f1831k);
                } else {
                    this.f1821a.setTitle((CharSequence) null);
                    this.f1821a.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) == 0 || (view = this.f1825e) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                this.f1821a.addView(view);
            } else {
                this.f1821a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.l0
    public CharSequence y() {
        return this.f1821a.getSubtitle();
    }

    @Override // androidx.appcompat.widget.l0
    public void z(CharSequence charSequence) {
        this.f1832l = charSequence;
        X();
    }

    public x1(Toolbar toolbar, boolean z6, int i7, int i8) {
        Drawable drawable;
        this.f1836p = 0;
        this.f1837q = 0;
        this.f1821a = toolbar;
        this.f1830j = toolbar.getTitle();
        this.f1831k = toolbar.getSubtitle();
        this.f1829i = this.f1830j != null;
        this.f1828h = toolbar.getNavigationIcon();
        t1 G = t1.G(toolbar.getContext(), null, a.m.f9428a, a.b.f8860f, 0);
        this.f1838r = G.h(a.m.f9554q);
        if (z6) {
            CharSequence x6 = G.x(a.m.C);
            if (!TextUtils.isEmpty(x6)) {
                setTitle(x6);
            }
            CharSequence x7 = G.x(a.m.A);
            if (!TextUtils.isEmpty(x7)) {
                A(x7);
            }
            Drawable h7 = G.h(a.m.f9589v);
            if (h7 != null) {
                s(h7);
            }
            Drawable h8 = G.h(a.m.f9568s);
            if (h8 != null) {
                setIcon(h8);
            }
            if (this.f1828h == null && (drawable = this.f1838r) != null) {
                R(drawable);
            }
            x(G.o(a.m.f9516l, 0));
            int u6 = G.u(a.m.f9508k, 0);
            if (u6 != 0) {
                K(LayoutInflater.from(this.f1821a.getContext()).inflate(u6, (ViewGroup) this.f1821a, false));
                x(this.f1822b | 16);
            }
            int q6 = G.q(a.m.f9540o, 0);
            if (q6 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1821a.getLayoutParams();
                layoutParams.height = q6;
                this.f1821a.setLayoutParams(layoutParams);
            }
            int f7 = G.f(a.m.f9492i, -1);
            int f8 = G.f(a.m.f9460e, -1);
            if (f7 >= 0 || f8 >= 0) {
                this.f1821a.setContentInsetsRelative(Math.max(f7, 0), Math.max(f8, 0));
            }
            int u7 = G.u(a.m.D, 0);
            if (u7 != 0) {
                Toolbar toolbar2 = this.f1821a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), u7);
            }
            int u8 = G.u(a.m.B, 0);
            if (u8 != 0) {
                Toolbar toolbar3 = this.f1821a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), u8);
            }
            int u9 = G.u(a.m.f9603x, 0);
            if (u9 != 0) {
                this.f1821a.setPopupTheme(u9);
            }
        } else {
            this.f1822b = U();
        }
        G.I();
        l(i7);
        this.f1832l = this.f1821a.getNavigationContentDescription();
        this.f1821a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.l0
    public void setIcon(Drawable drawable) {
        this.f1826f = drawable;
        Z();
    }
}
