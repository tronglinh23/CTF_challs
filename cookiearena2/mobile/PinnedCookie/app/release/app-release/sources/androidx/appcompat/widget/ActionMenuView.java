package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.y0;
import d.b1;
/* loaded from: classes.dex */
public class ActionMenuView extends y0 implements g.b, androidx.appcompat.view.menu.o {

    /* renamed from: n  reason: collision with root package name */
    public static final String f1265n = "ActionMenuView";

    /* renamed from: o  reason: collision with root package name */
    public static final int f1266o = 56;

    /* renamed from: p  reason: collision with root package name */
    public static final int f1267p = 4;

    /* renamed from: b  reason: collision with root package name */
    public androidx.appcompat.view.menu.g f1268b;

    /* renamed from: c  reason: collision with root package name */
    public Context f1269c;

    /* renamed from: d  reason: collision with root package name */
    public int f1270d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1271e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.appcompat.widget.c f1272f;

    /* renamed from: g  reason: collision with root package name */
    public n.a f1273g;

    /* renamed from: h  reason: collision with root package name */
    public g.a f1274h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1275i;

    /* renamed from: j  reason: collision with root package name */
    public int f1276j;

    /* renamed from: k  reason: collision with root package name */
    public int f1277k;

    /* renamed from: l  reason: collision with root package name */
    public int f1278l;

    /* renamed from: m  reason: collision with root package name */
    public e f1279m;

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b implements n.a {
        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(@d.o0 androidx.appcompat.view.menu.g gVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void onCloseMenu(@d.o0 androidx.appcompat.view.menu.g gVar, boolean z6) {
        }
    }

    /* loaded from: classes.dex */
    public static class c extends y0.b {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f1280a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f1281b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f1282c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f1283d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f1284e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1285f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f1280a = cVar.f1280a;
        }

        public c(int i7, int i8) {
            super(i7, i8);
            this.f1280a = false;
        }

        public c(int i7, int i8, boolean z6) {
            super(i7, i8);
            this.f1280a = z6;
        }
    }

    /* loaded from: classes.dex */
    public class d implements g.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean onMenuItemSelected(@d.o0 androidx.appcompat.view.menu.g gVar, @d.o0 MenuItem menuItem) {
            e eVar = ActionMenuView.this.f1279m;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void onMenuModeChange(@d.o0 androidx.appcompat.view.menu.g gVar) {
            g.a aVar = ActionMenuView.this.f1274h;
            if (aVar != null) {
                aVar.onMenuModeChange(gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@d.o0 Context context) {
        this(context, null);
    }

    public static int q(View view, int i7, int i8, int i9, int i10) {
        int i11;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9) - i10, View.MeasureSpec.getMode(i9));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z6 = actionMenuItemView != null && actionMenuItemView.d();
        if (i8 > 0) {
            i11 = 2;
            if (!z6 || i8 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i12 = measuredWidth / i7;
                if (measuredWidth % i7 != 0) {
                    i12++;
                }
                if (!z6 || i12 >= 2) {
                    i11 = i12;
                }
                cVar.f1283d = cVar.f1280a && z6;
                cVar.f1281b = i11;
                view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i11, 1073741824), makeMeasureSpec);
                return i11;
            }
        }
        i11 = 0;
        cVar.f1283d = cVar.f1280a && z6;
        cVar.f1281b = i11;
        view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i11, 1073741824), makeMeasureSpec);
        return i11;
    }

    @Override // androidx.appcompat.view.menu.g.b
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean a(androidx.appcompat.view.menu.j jVar) {
        return this.f1268b.performItemAction(jVar, 0);
    }

    @Override // androidx.appcompat.widget.y0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void g() {
        androidx.appcompat.widget.c cVar = this.f1272f;
        if (cVar != null) {
            cVar.q();
        }
    }

    public Menu getMenu() {
        if (this.f1268b == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.f1268b = gVar;
            gVar.setCallback(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f1272f = cVar;
            cVar.D(true);
            androidx.appcompat.widget.c cVar2 = this.f1272f;
            n.a aVar = this.f1273g;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.setCallback(aVar);
            this.f1268b.addMenuPresenter(this.f1272f, this.f1269c);
            this.f1272f.B(this);
        }
        return this.f1268b;
    }

    @d.q0
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1272f.s();
    }

    public int getPopupTheme() {
        return this.f1270d;
    }

    @Override // androidx.appcompat.view.menu.o
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.y0, android.view.ViewGroup
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.y0, android.view.ViewGroup
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.view.menu.o
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void initialize(androidx.appcompat.view.menu.g gVar) {
        this.f1268b = gVar;
    }

    @Override // androidx.appcompat.widget.y0, android.view.ViewGroup
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return generateDefaultLayoutParams();
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public c k() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f1280a = true;
        return generateDefaultLayoutParams;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean l(int i7) {
        boolean z6 = false;
        if (i7 == 0) {
            return false;
        }
        View childAt = getChildAt(i7 - 1);
        View childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof a)) {
            z6 = false | ((a) childAt).a();
        }
        return (i7 <= 0 || !(childAt2 instanceof a)) ? z6 : z6 | ((a) childAt2).b();
    }

    public boolean m() {
        androidx.appcompat.widget.c cVar = this.f1272f;
        return cVar != null && cVar.t();
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean n() {
        androidx.appcompat.widget.c cVar = this.f1272f;
        return cVar != null && cVar.v();
    }

    public boolean o() {
        androidx.appcompat.widget.c cVar = this.f1272f;
        return cVar != null && cVar.w();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f1272f;
        if (cVar != null) {
            cVar.updateMenuView(false);
            if (this.f1272f.w()) {
                this.f1272f.t();
                this.f1272f.F();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // androidx.appcompat.widget.y0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int width;
        int i11;
        if (!this.f1275i) {
            super.onLayout(z6, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i9 - i7;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean b7 = e2.b(this);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1280a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b7) {
                        i11 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i11 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i11 = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(i11, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    l(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int max = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (b7) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1280a) {
                    int i22 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1280a) {
                int i25 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = i25 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.y0, android.view.View
    public void onMeasure(int i7, int i8) {
        androidx.appcompat.view.menu.g gVar;
        boolean z6 = this.f1275i;
        boolean z7 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.f1275i = z7;
        if (z6 != z7) {
            this.f1276j = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f1275i && (gVar = this.f1268b) != null && size != this.f1276j) {
            this.f1276j = size;
            gVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.f1275i && childCount > 0) {
            r(i7, i8);
            return;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            c cVar = (c) getChildAt(i9).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i7, i8);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean p() {
        return this.f1271e;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v14 */
    public final void r(int i7, int i8) {
        int i9;
        int i10;
        boolean z6;
        int i11;
        int i12;
        boolean z7;
        boolean z8;
        int i13;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.f1277k;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int i19 = 0;
        int i20 = 0;
        boolean z9 = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        long j7 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            int i24 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z10 = childAt instanceof ActionMenuItemView;
                int i25 = i21 + 1;
                if (z10) {
                    int i26 = this.f1278l;
                    i13 = i25;
                    r14 = 0;
                    childAt.setPadding(i26, 0, i26, 0);
                } else {
                    i13 = i25;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1285f = r14;
                cVar.f1282c = r14;
                cVar.f1281b = r14;
                cVar.f1283d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f1284e = z10 && ((ActionMenuItemView) childAt).d();
                int q6 = q(childAt, i18, cVar.f1280a ? 1 : i16, childMeasureSpec, paddingTop);
                i22 = Math.max(i22, q6);
                if (cVar.f1283d) {
                    i23++;
                }
                if (cVar.f1280a) {
                    z9 = true;
                }
                i16 -= q6;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (q6 == 1) {
                    j7 |= 1 << i20;
                    i19 = i19;
                }
                i21 = i13;
            }
            i20++;
            size2 = i24;
        }
        int i27 = size2;
        boolean z11 = z9 && i21 == 2;
        boolean z12 = false;
        while (i23 > 0 && i16 > 0) {
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            long j8 = 0;
            while (i30 < childCount) {
                boolean z13 = z12;
                c cVar2 = (c) getChildAt(i30).getLayoutParams();
                int i31 = i19;
                if (cVar2.f1283d) {
                    int i32 = cVar2.f1281b;
                    if (i32 < i28) {
                        j8 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        i29++;
                        j8 |= 1 << i30;
                    }
                }
                i30++;
                i19 = i31;
                z12 = z13;
            }
            z6 = z12;
            i11 = i19;
            j7 |= j8;
            if (i29 > i16) {
                i9 = mode;
                i10 = i14;
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount) {
                View childAt2 = getChildAt(i34);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i35 = i14;
                int i36 = mode;
                long j9 = 1 << i34;
                if ((j8 & j9) == 0) {
                    if (cVar3.f1281b == i33) {
                        j7 |= j9;
                    }
                    z8 = z11;
                } else {
                    if (z11 && cVar3.f1284e && i16 == 1) {
                        int i37 = this.f1278l;
                        z8 = z11;
                        childAt2.setPadding(i37 + i18, 0, i37, 0);
                    } else {
                        z8 = z11;
                    }
                    cVar3.f1281b++;
                    cVar3.f1285f = true;
                    i16--;
                }
                i34++;
                mode = i36;
                i14 = i35;
                z11 = z8;
            }
            i19 = i11;
            z12 = true;
        }
        i9 = mode;
        i10 = i14;
        z6 = z12;
        i11 = i19;
        boolean z14 = !z9 && i21 == 1;
        if (i16 <= 0 || j7 == 0 || (i16 >= i21 - 1 && !z14 && i22 <= 1)) {
            i12 = 0;
            z7 = z6;
        } else {
            float bitCount = Long.bitCount(j7);
            if (z14) {
                i12 = 0;
            } else {
                i12 = 0;
                if ((j7 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1284e) {
                    bitCount -= 0.5f;
                }
                int i38 = childCount - 1;
                if ((j7 & (1 << i38)) != 0 && !((c) getChildAt(i38).getLayoutParams()).f1284e) {
                    bitCount -= 0.5f;
                }
            }
            int i39 = bitCount > 0.0f ? (int) ((i16 * i18) / bitCount) : i12;
            z7 = z6;
            for (int i40 = i12; i40 < childCount; i40++) {
                if ((j7 & (1 << i40)) != 0) {
                    View childAt3 = getChildAt(i40);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1282c = i39;
                        cVar4.f1285f = true;
                        if (i40 == 0 && !cVar4.f1284e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i39) / 2;
                        }
                        z7 = true;
                    } else if (cVar4.f1280a) {
                        cVar4.f1282c = i39;
                        cVar4.f1285f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i39) / 2;
                        z7 = true;
                    } else {
                        if (i40 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i39 / 2;
                        }
                        if (i40 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i39 / 2;
                        }
                    }
                }
            }
        }
        if (z7) {
            for (int i41 = i12; i41 < childCount; i41++) {
                View childAt4 = getChildAt(i41);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1285f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1281b * i18) + cVar5.f1282c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, i9 != 1073741824 ? i11 : i27);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.g s() {
        return this.f1268b;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f1272f.z(z6);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f1279m = eVar;
    }

    public void setOverflowIcon(@d.q0 Drawable drawable) {
        getMenu();
        this.f1272f.C(drawable);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z6) {
        this.f1271e = z6;
    }

    public void setPopupTheme(@d.g1 int i7) {
        if (this.f1270d != i7) {
            this.f1270d = i7;
            if (i7 == 0) {
                this.f1269c = getContext();
            } else {
                this.f1269c = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    @d.b1({b1.a.LIBRARY})
    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f1272f = cVar;
        cVar.B(this);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void t(n.a aVar, g.a aVar2) {
        this.f1273g = aVar;
        this.f1274h = aVar2;
    }

    public boolean u() {
        androidx.appcompat.widget.c cVar = this.f1272f;
        return cVar != null && cVar.F();
    }

    public ActionMenuView(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f1277k = (int) (56.0f * f7);
        this.f1278l = (int) (f7 * 4.0f);
        this.f1269c = context;
        this.f1270d = 0;
    }
}
