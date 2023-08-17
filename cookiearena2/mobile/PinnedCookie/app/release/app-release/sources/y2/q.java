package y2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import d.b1;
import d.d0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import s2.g0;
import s2.w;
import u4.l0;
import u4.r1;
import y2.d;
@r1({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,728:1\n1229#2,2:729\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI\n*L\n726#1:729,2\n*E\n"})
/* loaded from: classes.dex */
public final class q {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final q f18787a = new q();
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final String f18788b = "NavigationUI";

    @r1({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$12\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,728:1\n56#2,4:729\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$12\n*L\n710#1:729,4\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a implements w.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference<NavigationBarView> f18789a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ w f18790b;

        public a(WeakReference<NavigationBarView> weakReference, w wVar) {
            this.f18789a = weakReference;
            this.f18790b = wVar;
        }

        @Override // s2.w.c
        public void a(@n6.d w wVar, @n6.d g0 g0Var, @n6.e Bundle bundle) {
            l0.p(wVar, "controller");
            l0.p(g0Var, "destination");
            NavigationBarView navigationBarView = this.f18789a.get();
            if (navigationBarView == null) {
                this.f18790b.N0(this);
            } else if (!(g0Var instanceof s2.i)) {
                Menu menu = navigationBarView.getMenu();
                l0.o(menu, "view.menu");
                int size = menu.size();
                for (int i7 = 0; i7 < size; i7++) {
                    MenuItem item = menu.getItem(i7);
                    l0.h(item, "getItem(index)");
                    if (q.h(g0Var, item.getItemId())) {
                        item.setChecked(true);
                    }
                }
            }
        }
    }

    @r1({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$4\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,728:1\n56#2,4:729\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$4\n*L\n506#1:729,4\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b implements w.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference<NavigationView> f18791a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ w f18792b;

        public b(WeakReference<NavigationView> weakReference, w wVar) {
            this.f18791a = weakReference;
            this.f18792b = wVar;
        }

        @Override // s2.w.c
        public void a(@n6.d w wVar, @n6.d g0 g0Var, @n6.e Bundle bundle) {
            l0.p(wVar, "controller");
            l0.p(g0Var, "destination");
            NavigationView navigationView = this.f18791a.get();
            if (navigationView == null) {
                this.f18792b.N0(this);
            } else if (!(g0Var instanceof s2.i)) {
                Menu menu = navigationView.getMenu();
                l0.o(menu, "view.menu");
                int size = menu.size();
                for (int i7 = 0; i7 < size; i7++) {
                    MenuItem item = menu.getItem(i7);
                    l0.h(item, "getItem(index)");
                    item.setChecked(q.h(g0Var, item.getItemId()));
                }
            }
        }
    }

    @r1({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$7\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,728:1\n56#2,4:729\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$7\n*L\n580#1:729,4\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c implements w.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference<NavigationView> f18793a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ w f18794b;

        public c(WeakReference<NavigationView> weakReference, w wVar) {
            this.f18793a = weakReference;
            this.f18794b = wVar;
        }

        @Override // s2.w.c
        public void a(@n6.d w wVar, @n6.d g0 g0Var, @n6.e Bundle bundle) {
            l0.p(wVar, "controller");
            l0.p(g0Var, "destination");
            NavigationView navigationView = this.f18793a.get();
            if (navigationView == null) {
                this.f18794b.N0(this);
            } else if (!(g0Var instanceof s2.i)) {
                Menu menu = navigationView.getMenu();
                l0.o(menu, "view.menu");
                int size = menu.size();
                for (int i7 = 0; i7 < size; i7++) {
                    MenuItem item = menu.getItem(i7);
                    l0.h(item, "getItem(index)");
                    item.setChecked(q.h(g0Var, item.getItemId()));
                }
            }
        }
    }

    @r1({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$9\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,728:1\n56#2,4:729\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$9\n*L\n652#1:729,4\n*E\n"})
    /* loaded from: classes.dex */
    public static final class d implements w.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference<NavigationBarView> f18795a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ w f18796b;

        public d(WeakReference<NavigationBarView> weakReference, w wVar) {
            this.f18795a = weakReference;
            this.f18796b = wVar;
        }

        @Override // s2.w.c
        public void a(@n6.d w wVar, @n6.d g0 g0Var, @n6.e Bundle bundle) {
            l0.p(wVar, "controller");
            l0.p(g0Var, "destination");
            NavigationBarView navigationBarView = this.f18795a.get();
            if (navigationBarView == null) {
                this.f18796b.N0(this);
            } else if (!(g0Var instanceof s2.i)) {
                Menu menu = navigationBarView.getMenu();
                l0.o(menu, "view.menu");
                int size = menu.size();
                for (int i7 = 0; i7 < size; i7++) {
                    MenuItem item = menu.getItem(i7);
                    l0.h(item, "getItem(index)");
                    if (q.h(g0Var, item.getItemId())) {
                        item.setChecked(true);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void A(Toolbar toolbar, w wVar, y2.d dVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            dVar = new d.a(wVar.P()).a();
        }
        s(toolbar, wVar, dVar);
    }

    public static /* synthetic */ void B(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, w wVar, y2.d dVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            dVar = new d.a(wVar.P()).a();
        }
        v(collapsingToolbarLayout, toolbar, wVar, dVar);
    }

    public static final void C(w wVar, y2.d dVar, View view) {
        l0.p(wVar, "$navController");
        l0.p(dVar, "$configuration");
        j(wVar, dVar);
    }

    public static final void D(w wVar, y2.d dVar, View view) {
        l0.p(wVar, "$navController");
        l0.p(dVar, "$configuration");
        j(wVar, dVar);
    }

    public static final boolean E(w wVar, NavigationView navigationView, MenuItem menuItem) {
        l0.p(wVar, "$navController");
        l0.p(navigationView, "$navigationView");
        l0.p(menuItem, "item");
        boolean k7 = k(menuItem, wVar);
        if (k7) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof androidx.customview.widget.c) {
                ((androidx.customview.widget.c) parent).close();
            } else {
                BottomSheetBehavior<?> g7 = g(navigationView);
                if (g7 != null) {
                    g7.setState(5);
                }
            }
        }
        return k7;
    }

    public static final boolean F(w wVar, boolean z6, NavigationView navigationView, MenuItem menuItem) {
        l0.p(wVar, "$navController");
        l0.p(navigationView, "$navigationView");
        l0.p(menuItem, "item");
        boolean l7 = l(menuItem, wVar, z6);
        if (l7) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof androidx.customview.widget.c) {
                ((androidx.customview.widget.c) parent).close();
            } else {
                BottomSheetBehavior<?> g7 = g(navigationView);
                if (g7 != null) {
                    g7.setState(5);
                }
            }
        }
        return l7;
    }

    public static final boolean G(w wVar, MenuItem menuItem) {
        l0.p(wVar, "$navController");
        l0.p(menuItem, "item");
        return k(menuItem, wVar);
    }

    public static final boolean H(w wVar, boolean z6, MenuItem menuItem) {
        l0.p(wVar, "$navController");
        l0.p(menuItem, "item");
        return l(menuItem, wVar, z6);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @s4.m
    @n6.e
    public static final BottomSheetBehavior<?> g(@n6.d View view) {
        l0.p(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f7 = ((CoordinatorLayout.g) layoutParams).f();
            if (f7 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f7;
            }
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return g((View) parent);
        }
        return null;
    }

    @s4.m
    public static final boolean h(@n6.d g0 g0Var, @d0 int i7) {
        boolean z6;
        l0.p(g0Var, "<this>");
        Iterator<g0> it = g0.f16312t.c(g0Var).iterator();
        do {
            z6 = false;
            if (!it.hasNext()) {
                return false;
            }
            if (it.next().r() == i7) {
                z6 = true;
            }
        } while (!z6);
        return true;
    }

    @s4.m
    public static final boolean i(@n6.d w wVar, @n6.e androidx.customview.widget.c cVar) {
        l0.p(wVar, "navController");
        return j(wVar, new d.a(wVar.P()).d(cVar).a());
    }

    @s4.m
    public static final boolean j(@n6.d w wVar, @n6.d y2.d dVar) {
        l0.p(wVar, "navController");
        l0.p(dVar, "configuration");
        androidx.customview.widget.c c7 = dVar.c();
        g0 N = wVar.N();
        if (c7 != null && N != null && dVar.e(N)) {
            c7.open();
            return true;
        } else if (wVar.w0()) {
            return true;
        } else {
            d.b b7 = dVar.b();
            if (b7 != null) {
                return b7.b();
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
        if (h(r0, r5.getItemId()) == true) goto L16;
     */
    @s4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean k(@n6.d android.view.MenuItem r5, @n6.d s2.w r6) {
        /*
            java.lang.String r0 = "item"
            u4.l0.p(r5, r0)
            java.lang.String r0 = "navController"
            u4.l0.p(r6, r0)
            s2.u0$a r0 = new s2.u0$a
            r0.<init>()
            r1 = 1
            s2.u0$a r0 = r0.d(r1)
            s2.u0$a r0 = r0.m(r1)
            s2.g0 r2 = r6.N()
            u4.l0.m(r2)
            s2.k0 r2 = r2.u()
            u4.l0.m(r2)
            int r3 = r5.getItemId()
            s2.g0 r2 = r2.S(r3)
            boolean r2 = r2 instanceof s2.d.b
            if (r2 == 0) goto L4a
            int r2 = y2.t.a.f18797a
            s2.u0$a r2 = r0.b(r2)
            int r3 = y2.t.a.f18798b
            s2.u0$a r2 = r2.c(r3)
            int r3 = y2.t.a.f18799c
            s2.u0$a r2 = r2.e(r3)
            int r3 = y2.t.a.f18800d
            r2.f(r3)
            goto L61
        L4a:
            int r2 = y2.t.b.f18801a
            s2.u0$a r2 = r0.b(r2)
            int r3 = y2.t.b.f18802b
            s2.u0$a r2 = r2.c(r3)
            int r3 = y2.t.b.f18803c
            s2.u0$a r2 = r2.e(r3)
            int r3 = y2.t.b.f18804d
            r2.f(r3)
        L61:
            int r2 = r5.getOrder()
            r3 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r3
            r3 = 0
            if (r2 != 0) goto L7c
            s2.k0$a r2 = s2.k0.f16370z
            s2.k0 r4 = r6.P()
            s2.g0 r2 = r2.a(r4)
            int r2 = r2.r()
            r0.h(r2, r3, r1)
        L7c:
            s2.u0 r0 = r0.a()
            int r2 = r5.getItemId()     // Catch: java.lang.IllegalArgumentException -> L9c
            r4 = 0
            r6.d0(r2, r4, r0)     // Catch: java.lang.IllegalArgumentException -> L9c
            s2.g0 r0 = r6.N()     // Catch: java.lang.IllegalArgumentException -> L9c
            if (r0 == 0) goto L99
            int r2 = r5.getItemId()     // Catch: java.lang.IllegalArgumentException -> L9c
            boolean r5 = h(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L9c
            if (r5 != r1) goto L99
            goto L9a
        L99:
            r1 = r3
        L9a:
            r3 = r1
            goto Lcd
        L9c:
            r0 = move-exception
            s2.g0$b r1 = s2.g0.f16312t
            android.content.Context r2 = r6.J()
            int r5 = r5.getItemId()
            java.lang.String r5 = r1.b(r2, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Ignoring onNavDestinationSelected for MenuItem "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " as it cannot be found from the current destination "
            r1.append(r5)
            s2.g0 r5 = r6.N()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = "NavigationUI"
            android.util.Log.i(r6, r5, r0)
        Lcd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.q.k(android.view.MenuItem, s2.w):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
        if (h(r9, r7.getItemId()) == true) goto L18;
     */
    @s4.m
    @y2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean l(@n6.d android.view.MenuItem r7, @n6.d s2.w r8, boolean r9) {
        /*
            java.lang.String r0 = "item"
            u4.l0.p(r7, r0)
            java.lang.String r0 = "navController"
            u4.l0.p(r8, r0)
            r0 = 1
            r9 = r9 ^ r0
            if (r9 == 0) goto Ld2
            s2.u0$a r9 = new s2.u0$a
            r9.<init>()
            s2.u0$a r9 = r9.d(r0)
            s2.g0 r1 = r8.N()
            u4.l0.m(r1)
            s2.k0 r1 = r1.u()
            u4.l0.m(r1)
            int r2 = r7.getItemId()
            s2.g0 r1 = r1.S(r2)
            boolean r1 = r1 instanceof s2.d.b
            if (r1 == 0) goto L49
            int r1 = y2.t.a.f18797a
            s2.u0$a r1 = r9.b(r1)
            int r2 = y2.t.a.f18798b
            s2.u0$a r1 = r1.c(r2)
            int r2 = y2.t.a.f18799c
            s2.u0$a r1 = r1.e(r2)
            int r2 = y2.t.a.f18800d
            r1.f(r2)
            goto L60
        L49:
            int r1 = y2.t.b.f18801a
            s2.u0$a r1 = r9.b(r1)
            int r2 = y2.t.b.f18802b
            s2.u0$a r1 = r1.c(r2)
            int r2 = y2.t.b.f18803c
            s2.u0$a r1 = r1.e(r2)
            int r2 = y2.t.b.f18804d
            r1.f(r2)
        L60:
            int r1 = r7.getOrder()
            r2 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 & r2
            if (r1 != 0) goto L7f
            s2.k0$a r1 = s2.k0.f16370z
            s2.k0 r2 = r8.P()
            s2.g0 r1 = r1.a(r2)
            int r2 = r1.r()
            r3 = 0
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r9
            s2.u0.a.k(r1, r2, r3, r4, r5, r6)
        L7f:
            s2.u0 r9 = r9.a()
            r1 = 0
            int r2 = r7.getItemId()     // Catch: java.lang.IllegalArgumentException -> La0
            r3 = 0
            r8.d0(r2, r3, r9)     // Catch: java.lang.IllegalArgumentException -> La0
            s2.g0 r9 = r8.N()     // Catch: java.lang.IllegalArgumentException -> La0
            if (r9 == 0) goto L9d
            int r2 = r7.getItemId()     // Catch: java.lang.IllegalArgumentException -> La0
            boolean r7 = h(r9, r2)     // Catch: java.lang.IllegalArgumentException -> La0
            if (r7 != r0) goto L9d
            goto L9e
        L9d:
            r0 = r1
        L9e:
            r1 = r0
            goto Ld1
        La0:
            r9 = move-exception
            s2.g0$b r0 = s2.g0.f16312t
            android.content.Context r2 = r8.J()
            int r7 = r7.getItemId()
            java.lang.String r7 = r0.b(r2, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Ignoring onNavDestinationSelected for MenuItem "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = " as it cannot be found from the current destination "
            r0.append(r7)
            s2.g0 r7 = r8.N()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "NavigationUI"
            android.util.Log.i(r8, r7, r9)
        Ld1:
            return r1
        Ld2:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.q.l(android.view.MenuItem, s2.w, boolean):boolean");
    }

    @s4.i
    @s4.m
    public static final void m(@n6.d AppCompatActivity appCompatActivity, @n6.d w wVar) {
        l0.p(appCompatActivity, androidx.appcompat.widget.d.f1516r);
        l0.p(wVar, "navController");
        p(appCompatActivity, wVar, null, 4, null);
    }

    @s4.m
    public static final void n(@n6.d AppCompatActivity appCompatActivity, @n6.d w wVar, @n6.e androidx.customview.widget.c cVar) {
        l0.p(appCompatActivity, androidx.appcompat.widget.d.f1516r);
        l0.p(wVar, "navController");
        o(appCompatActivity, wVar, new d.a(wVar.P()).d(cVar).a());
    }

    @s4.i
    @s4.m
    public static final void o(@n6.d AppCompatActivity appCompatActivity, @n6.d w wVar, @n6.d y2.d dVar) {
        l0.p(appCompatActivity, androidx.appcompat.widget.d.f1516r);
        l0.p(wVar, "navController");
        l0.p(dVar, "configuration");
        wVar.s(new y2.b(appCompatActivity, dVar));
    }

    public static /* synthetic */ void p(AppCompatActivity appCompatActivity, w wVar, y2.d dVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            dVar = new d.a(wVar.P()).a();
        }
        o(appCompatActivity, wVar, dVar);
    }

    @s4.i
    @s4.m
    public static final void q(@n6.d Toolbar toolbar, @n6.d w wVar) {
        l0.p(toolbar, "toolbar");
        l0.p(wVar, "navController");
        A(toolbar, wVar, null, 4, null);
    }

    @s4.m
    public static final void r(@n6.d Toolbar toolbar, @n6.d w wVar, @n6.e androidx.customview.widget.c cVar) {
        l0.p(toolbar, "toolbar");
        l0.p(wVar, "navController");
        s(toolbar, wVar, new d.a(wVar.P()).d(cVar).a());
    }

    @s4.i
    @s4.m
    public static final void s(@n6.d Toolbar toolbar, @n6.d final w wVar, @n6.d final y2.d dVar) {
        l0.p(toolbar, "toolbar");
        l0.p(wVar, "navController");
        l0.p(dVar, "configuration");
        wVar.s(new v(toolbar, dVar));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: y2.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.C(w.this, dVar, view);
            }
        });
    }

    @s4.i
    @s4.m
    public static final void t(@n6.d CollapsingToolbarLayout collapsingToolbarLayout, @n6.d Toolbar toolbar, @n6.d w wVar) {
        l0.p(collapsingToolbarLayout, "collapsingToolbarLayout");
        l0.p(toolbar, "toolbar");
        l0.p(wVar, "navController");
        B(collapsingToolbarLayout, toolbar, wVar, null, 8, null);
    }

    @s4.m
    public static final void u(@n6.d CollapsingToolbarLayout collapsingToolbarLayout, @n6.d Toolbar toolbar, @n6.d w wVar, @n6.e androidx.customview.widget.c cVar) {
        l0.p(collapsingToolbarLayout, "collapsingToolbarLayout");
        l0.p(toolbar, "toolbar");
        l0.p(wVar, "navController");
        v(collapsingToolbarLayout, toolbar, wVar, new d.a(wVar.P()).d(cVar).a());
    }

    @s4.i
    @s4.m
    public static final void v(@n6.d CollapsingToolbarLayout collapsingToolbarLayout, @n6.d Toolbar toolbar, @n6.d final w wVar, @n6.d final y2.d dVar) {
        l0.p(collapsingToolbarLayout, "collapsingToolbarLayout");
        l0.p(toolbar, "toolbar");
        l0.p(wVar, "navController");
        l0.p(dVar, "configuration");
        wVar.s(new h(collapsingToolbarLayout, toolbar, dVar));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: y2.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.D(w.this, dVar, view);
            }
        });
    }

    @s4.m
    public static final void w(@n6.d NavigationBarView navigationBarView, @n6.d final w wVar) {
        l0.p(navigationBarView, "navigationBarView");
        l0.p(wVar, "navController");
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: y2.m
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean G;
                G = q.G(w.this, menuItem);
                return G;
            }
        });
        wVar.s(new d(new WeakReference(navigationBarView), wVar));
    }

    @s4.m
    @r
    public static final void x(@n6.d NavigationBarView navigationBarView, @n6.d final w wVar, final boolean z6) {
        l0.p(navigationBarView, "navigationBarView");
        l0.p(wVar, "navController");
        if ((!z6) != true) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: y2.p
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean H;
                H = q.H(w.this, z6, menuItem);
                return H;
            }
        });
        wVar.s(new a(new WeakReference(navigationBarView), wVar));
    }

    @s4.m
    public static final void y(@n6.d final NavigationView navigationView, @n6.d final w wVar) {
        l0.p(navigationView, "navigationView");
        l0.p(wVar, "navController");
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: y2.n
            @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean E;
                E = q.E(w.this, navigationView, menuItem);
                return E;
            }
        });
        wVar.s(new b(new WeakReference(navigationView), wVar));
    }

    @s4.m
    @r
    public static final void z(@n6.d final NavigationView navigationView, @n6.d final w wVar, final boolean z6) {
        l0.p(navigationView, "navigationView");
        l0.p(wVar, "navController");
        if ((!z6) != true) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: y2.k
            @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean F;
                F = q.F(w.this, z6, navigationView, menuItem);
                return F;
            }
        });
        wVar.s(new c(new WeakReference(navigationView), wVar));
    }
}
