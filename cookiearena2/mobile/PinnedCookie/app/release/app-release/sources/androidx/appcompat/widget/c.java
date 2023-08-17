package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import f.a;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.b implements b.a {
    public static final String F = "ActionMenuPresenter";
    public a A;
    public RunnableC0026c B;
    public b C;
    public final f D;
    public int E;

    /* renamed from: l  reason: collision with root package name */
    public d f1477l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f1478m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1479n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1480o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1481p;

    /* renamed from: q  reason: collision with root package name */
    public int f1482q;

    /* renamed from: r  reason: collision with root package name */
    public int f1483r;

    /* renamed from: s  reason: collision with root package name */
    public int f1484s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1485t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1486u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1487v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1488w;

    /* renamed from: x  reason: collision with root package name */
    public int f1489x;

    /* renamed from: y  reason: collision with root package name */
    public final SparseBooleanArray f1490y;

    /* renamed from: z  reason: collision with root package name */
    public e f1491z;

    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.m {
        public a(Context context, androidx.appcompat.view.menu.s sVar, View view) {
            super(context, sVar, view, false, a.b.G);
            if (!((androidx.appcompat.view.menu.j) sVar.getItem()).o()) {
                View view2 = c.this.f1477l;
                h(view2 == null ? (View) c.this.f1082j : view2);
            }
            a(c.this.D);
        }

        @Override // androidx.appcompat.view.menu.m
        public void g() {
            c cVar = c.this;
            cVar.A = null;
            cVar.E = 0;
            super.g();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.q a() {
            a aVar = c.this.A;
            if (aVar != null) {
                return aVar.e();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0026c implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public e f1494k;

        public RunnableC0026c(e eVar) {
            this.f1494k = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f1076d != null) {
                c.this.f1076d.changeMenuMode();
            }
            View view = (View) c.this.f1082j;
            if (view != null && view.getWindowToken() != null && this.f1494k.o()) {
                c.this.f1491z = this.f1494k;
            }
            c.this.B = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends s implements ActionMenuView.a {

        /* loaded from: classes.dex */
        public class a extends x0 {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ c f1497k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, c cVar) {
                super(view);
                this.f1497k = cVar;
            }

            @Override // androidx.appcompat.widget.x0
            public androidx.appcompat.view.menu.q b() {
                e eVar = c.this.f1491z;
                if (eVar == null) {
                    return null;
                }
                return eVar.e();
            }

            @Override // androidx.appcompat.widget.x0
            public boolean c() {
                c.this.F();
                return true;
            }

            @Override // androidx.appcompat.widget.x0
            public boolean d() {
                c cVar = c.this;
                if (cVar.B != null) {
                    return false;
                }
                cVar.t();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, a.b.F);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            y1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.F();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i7, int i8, int i9, int i10) {
            boolean frame = super.setFrame(i7, i8, i9, i10);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                q0.c.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.m {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z6) {
            super(context, gVar, view, z6, a.b.G);
            j(8388613);
            a(c.this.D);
        }

        @Override // androidx.appcompat.view.menu.m
        public void g() {
            if (c.this.f1076d != null) {
                c.this.f1076d.close();
            }
            c.this.f1491z = null;
            super.g();
        }
    }

    /* loaded from: classes.dex */
    public class f implements n.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(@d.o0 androidx.appcompat.view.menu.g gVar) {
            if (gVar == c.this.f1076d) {
                return false;
            }
            c.this.E = ((androidx.appcompat.view.menu.s) gVar).getItem().getItemId();
            n.a f7 = c.this.f();
            if (f7 != null) {
                return f7.a(gVar);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void onCloseMenu(@d.o0 androidx.appcompat.view.menu.g gVar, boolean z6) {
            if (gVar instanceof androidx.appcompat.view.menu.s) {
                gVar.getRootMenu().close(false);
            }
            n.a f7 = c.this.f();
            if (f7 != null) {
                f7.onCloseMenu(gVar, z6);
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public int f1501k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i7) {
                return new g[i7];
            }
        }

        public g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f1501k);
        }

        public g(Parcel parcel) {
            this.f1501k = parcel.readInt();
        }
    }

    public c(Context context) {
        super(context, a.j.f9197d, a.j.f9196c);
        this.f1490y = new SparseBooleanArray();
        this.D = new f();
    }

    public void A(int i7) {
        this.f1484s = i7;
        this.f1485t = true;
    }

    public void B(ActionMenuView actionMenuView) {
        this.f1082j = actionMenuView;
        actionMenuView.initialize(this.f1076d);
    }

    public void C(Drawable drawable) {
        d dVar = this.f1477l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1479n = true;
        this.f1478m = drawable;
    }

    public void D(boolean z6) {
        this.f1480o = z6;
        this.f1481p = true;
    }

    public void E(int i7, boolean z6) {
        this.f1482q = i7;
        this.f1486u = z6;
        this.f1487v = true;
    }

    public boolean F() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f1480o || w() || (gVar = this.f1076d) == null || this.f1082j == null || this.B != null || gVar.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC0026c runnableC0026c = new RunnableC0026c(new e(this.f1075c, this.f1076d, this.f1477l, true));
        this.B = runnableC0026c;
        ((View) this.f1082j).post(runnableC0026c);
        return true;
    }

    @Override // androidx.core.view.b.a
    public void a(boolean z6) {
        if (z6) {
            super.onSubMenuSelected(null);
            return;
        }
        androidx.appcompat.view.menu.g gVar = this.f1076d;
        if (gVar != null) {
            gVar.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.b
    public void c(androidx.appcompat.view.menu.j jVar, o.a aVar) {
        aVar.initialize(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1082j);
        if (this.C == null) {
            this.C = new b();
        }
        actionMenuItemView.setPopupCallback(this.C);
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean e(ViewGroup viewGroup, int i7) {
        if (viewGroup.getChildAt(i7) == this.f1477l) {
            return false;
        }
        return super.e(viewGroup, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        ArrayList<androidx.appcompat.view.menu.j> arrayList;
        int i7;
        int i8;
        int i9;
        boolean z6;
        int i10;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f1076d;
        View view = null;
        ?? r32 = 0;
        if (gVar != null) {
            arrayList = gVar.getVisibleItems();
            i7 = arrayList.size();
        } else {
            arrayList = null;
            i7 = 0;
        }
        int i11 = cVar.f1484s;
        int i12 = cVar.f1483r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1082j;
        boolean z7 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i7; i15++) {
            androidx.appcompat.view.menu.j jVar = arrayList.get(i15);
            if (jVar.d()) {
                i13++;
            } else if (jVar.q()) {
                i14++;
            } else {
                z7 = true;
            }
            if (cVar.f1488w && jVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (cVar.f1480o && (z7 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = cVar.f1490y;
        sparseBooleanArray.clear();
        if (cVar.f1486u) {
            int i17 = cVar.f1489x;
            i9 = i12 / i17;
            i8 = i17 + ((i12 % i17) / i9);
        } else {
            i8 = 0;
            i9 = 0;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i7) {
            androidx.appcompat.view.menu.j jVar2 = arrayList.get(i18);
            if (jVar2.d()) {
                View g7 = cVar.g(jVar2, view, viewGroup);
                if (cVar.f1486u) {
                    i9 -= ActionMenuView.q(g7, i8, i9, makeMeasureSpec, r32);
                } else {
                    g7.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = g7.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.x(true);
                z6 = r32;
                i10 = i7;
            } else if (jVar2.q()) {
                int groupId2 = jVar2.getGroupId();
                boolean z8 = sparseBooleanArray.get(groupId2);
                boolean z9 = (i16 > 0 || z8) && i12 > 0 && (!cVar.f1486u || i9 > 0);
                boolean z10 = z9;
                i10 = i7;
                if (z9) {
                    View g8 = cVar.g(jVar2, null, viewGroup);
                    if (cVar.f1486u) {
                        int q6 = ActionMenuView.q(g8, i8, i9, makeMeasureSpec, 0);
                        i9 -= q6;
                        if (q6 == 0) {
                            z10 = false;
                        }
                    } else {
                        g8.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z11 = z10;
                    int measuredWidth2 = g8.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z9 = z11 & (!cVar.f1486u ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z9 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z8) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        androidx.appcompat.view.menu.j jVar3 = arrayList.get(i20);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.o()) {
                                i16++;
                            }
                            jVar3.x(false);
                        }
                    }
                }
                if (z9) {
                    i16--;
                }
                jVar2.x(z9);
                z6 = false;
            } else {
                z6 = r32;
                i10 = i7;
                jVar2.x(z6);
            }
            i18++;
            r32 = z6;
            i7 = i10;
            view = null;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public View g(androidx.appcompat.view.menu.j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.m()) {
            actionView = super.g(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public androidx.appcompat.view.menu.o getMenuView(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.o oVar = this.f1082j;
        androidx.appcompat.view.menu.o menuView = super.getMenuView(viewGroup);
        if (oVar != menuView) {
            ((ActionMenuView) menuView).setPresenter(this);
        }
        return menuView;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean i(int i7, androidx.appcompat.view.menu.j jVar) {
        return jVar.o();
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void initForMenu(@d.o0 Context context, @d.q0 androidx.appcompat.view.menu.g gVar) {
        super.initForMenu(context, gVar);
        Resources resources = context.getResources();
        j.a b7 = j.a.b(context);
        if (!this.f1481p) {
            this.f1480o = b7.h();
        }
        if (!this.f1487v) {
            this.f1482q = b7.c();
        }
        if (!this.f1485t) {
            this.f1484s = b7.d();
        }
        int i7 = this.f1482q;
        if (this.f1480o) {
            if (this.f1477l == null) {
                d dVar = new d(this.f1074b);
                this.f1477l = dVar;
                if (this.f1479n) {
                    dVar.setImageDrawable(this.f1478m);
                    this.f1478m = null;
                    this.f1479n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1477l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.f1477l.getMeasuredWidth();
        } else {
            this.f1477l = null;
        }
        this.f1483r = i7;
        this.f1489x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void onCloseMenu(androidx.appcompat.view.menu.g gVar, boolean z6) {
        q();
        super.onCloseMenu(gVar, z6);
    }

    @Override // androidx.appcompat.view.menu.n
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i7;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i7 = ((g) parcelable).f1501k) > 0 && (findItem = this.f1076d.findItem(i7)) != null) {
            onSubMenuSelected((androidx.appcompat.view.menu.s) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable onSaveInstanceState() {
        g gVar = new g();
        gVar.f1501k = this.E;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.s sVar) {
        boolean z6 = false;
        if (sVar.hasVisibleItems()) {
            androidx.appcompat.view.menu.s sVar2 = sVar;
            while (sVar2.getParentMenu() != this.f1076d) {
                sVar2 = (androidx.appcompat.view.menu.s) sVar2.getParentMenu();
            }
            View r6 = r(sVar2.getItem());
            if (r6 == null) {
                return false;
            }
            this.E = sVar.getItem().getItemId();
            int size = sVar.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                MenuItem item = sVar.getItem(i7);
                if (item.isVisible() && item.getIcon() != null) {
                    z6 = true;
                    break;
                }
                i7++;
            }
            a aVar = new a(this.f1075c, sVar, r6);
            this.A = aVar;
            aVar.i(z6);
            this.A.l();
            super.onSubMenuSelected(sVar);
            return true;
        }
        return false;
    }

    public boolean q() {
        return t() | u();
    }

    public final View r(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1082j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof o.a) && ((o.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable s() {
        d dVar = this.f1477l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1479n) {
            return this.f1478m;
        }
        return null;
    }

    public boolean t() {
        androidx.appcompat.view.menu.o oVar;
        RunnableC0026c runnableC0026c = this.B;
        if (runnableC0026c != null && (oVar = this.f1082j) != null) {
            ((View) oVar).removeCallbacks(runnableC0026c);
            this.B = null;
            return true;
        }
        e eVar = this.f1491z;
        if (eVar != null) {
            eVar.dismiss();
            return true;
        }
        return false;
    }

    public boolean u() {
        a aVar = this.A;
        if (aVar != null) {
            aVar.dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z6) {
        super.updateMenuView(z6);
        ((View) this.f1082j).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f1076d;
        boolean z7 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.j> actionItems = gVar.getActionItems();
            int size = actionItems.size();
            for (int i7 = 0; i7 < size; i7++) {
                androidx.core.view.b b7 = actionItems.get(i7).b();
                if (b7 != null) {
                    b7.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f1076d;
        ArrayList<androidx.appcompat.view.menu.j> nonActionItems = gVar2 != null ? gVar2.getNonActionItems() : null;
        if (this.f1480o && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z7 = !nonActionItems.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z7 = true;
            }
        }
        if (z7) {
            if (this.f1477l == null) {
                this.f1477l = new d(this.f1074b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1477l.getParent();
            if (viewGroup != this.f1082j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1477l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1082j;
                actionMenuView.addView(this.f1477l, actionMenuView.k());
            }
        } else {
            d dVar = this.f1477l;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                androidx.appcompat.view.menu.o oVar = this.f1082j;
                if (parent == oVar) {
                    ((ViewGroup) oVar).removeView(this.f1477l);
                }
            }
        }
        ((ActionMenuView) this.f1082j).setOverflowReserved(this.f1480o);
    }

    public boolean v() {
        return this.B != null || w();
    }

    public boolean w() {
        e eVar = this.f1491z;
        return eVar != null && eVar.f();
    }

    public boolean x() {
        return this.f1480o;
    }

    public void y(Configuration configuration) {
        if (!this.f1485t) {
            this.f1484s = j.a.b(this.f1075c).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f1076d;
        if (gVar != null) {
            gVar.onItemsChanged(true);
        }
    }

    public void z(boolean z6) {
        this.f1488w = z6;
    }
}
