package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.z2;
import d.b1;
import f.a;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1223k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1224l;

    /* renamed from: m  reason: collision with root package name */
    public View f1225m;

    /* renamed from: n  reason: collision with root package name */
    public View f1226n;

    /* renamed from: o  reason: collision with root package name */
    public View f1227o;

    /* renamed from: p  reason: collision with root package name */
    public LinearLayout f1228p;

    /* renamed from: q  reason: collision with root package name */
    public TextView f1229q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f1230r;

    /* renamed from: s  reason: collision with root package name */
    public int f1231s;

    /* renamed from: t  reason: collision with root package name */
    public int f1232t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1233u;

    /* renamed from: v  reason: collision with root package name */
    public int f1234v;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j.b f1235b;

        public a(j.b bVar) {
            this.f1235b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1235b.a();
        }
    }

    public ActionBarContextView(@d.o0 Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void c(int i7) {
        super.c(i7);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // androidx.appcompat.widget.a
    public boolean f() {
        c cVar = this.f1415e;
        if (cVar != null) {
            return cVar.t();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1224l;
    }

    public CharSequence getTitle() {
        return this.f1223k;
    }

    @Override // androidx.appcompat.widget.a
    public boolean h() {
        c cVar = this.f1415e;
        if (cVar != null) {
            return cVar.w();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ z2 n(int i7, long j7) {
        return super.n(i7, j7);
    }

    @Override // androidx.appcompat.widget.a
    public boolean o() {
        c cVar = this.f1415e;
        if (cVar != null) {
            return cVar.F();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1415e;
        if (cVar != null) {
            cVar.t();
            this.f1415e.u();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        boolean b7 = e2.b(this);
        int paddingRight = b7 ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1225m;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1225m.getLayoutParams();
            int i11 = b7 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = b7 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int k7 = androidx.appcompat.widget.a.k(paddingRight, i11, b7);
            paddingRight = androidx.appcompat.widget.a.k(k7 + l(this.f1225m, k7, paddingTop, paddingTop2, b7), i12, b7);
        }
        int i13 = paddingRight;
        LinearLayout linearLayout = this.f1228p;
        if (linearLayout != null && this.f1227o == null && linearLayout.getVisibility() != 8) {
            i13 += l(this.f1228p, i13, paddingTop, paddingTop2, b7);
        }
        int i14 = i13;
        View view2 = this.f1227o;
        if (view2 != null) {
            l(view2, i14, paddingTop, paddingTop2, b7);
        }
        int paddingLeft = b7 ? getPaddingLeft() : (i9 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1414d;
        if (actionMenuView != null) {
            l(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i7);
            int i9 = this.f1416f;
            if (i9 <= 0) {
                i9 = View.MeasureSpec.getSize(i8);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i10 = i9 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
            View view = this.f1225m;
            if (view != null) {
                int j7 = j(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1225m.getLayoutParams();
                paddingLeft = j7 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1414d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = j(this.f1414d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1228p;
            if (linearLayout != null && this.f1227o == null) {
                if (this.f1233u) {
                    this.f1228p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1228p.getMeasuredWidth();
                    boolean z6 = measuredWidth <= paddingLeft;
                    if (z6) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1228p.setVisibility(z6 ? 0 : 8);
                } else {
                    paddingLeft = j(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1227o;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i11 = layoutParams.width;
                int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i11 >= 0) {
                    paddingLeft = Math.min(i11, paddingLeft);
                }
                int i13 = layoutParams.height;
                int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
                if (i13 >= 0) {
                    i10 = Math.min(i13, i10);
                }
                this.f1227o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i10, i14));
            }
            if (this.f1416f > 0) {
                setMeasuredDimension(size, i9);
                return;
            }
            int childCount = getChildCount();
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i15) {
                    i15 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i15);
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        if (this.f1225m == null) {
            t();
        }
    }

    public void q(j.b bVar) {
        View view = this.f1225m;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1234v, (ViewGroup) this, false);
            this.f1225m = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1225m);
        }
        View findViewById = this.f1225m.findViewById(a.g.f9155m);
        this.f1226n = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.c();
        c cVar = this.f1415e;
        if (cVar != null) {
            cVar.q();
        }
        c cVar2 = new c(getContext());
        this.f1415e = cVar2;
        cVar2.D(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.addMenuPresenter(this.f1415e, this.f1413c);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1415e.getMenuView(this);
        this.f1414d = actionMenuView;
        androidx.core.view.u1.I1(actionMenuView, null);
        addView(this.f1414d, layoutParams);
    }

    public final void r() {
        if (this.f1228p == null) {
            LayoutInflater.from(getContext()).inflate(a.j.f9194a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1228p = linearLayout;
            this.f1229q = (TextView) linearLayout.findViewById(a.g.f9143g);
            this.f1230r = (TextView) this.f1228p.findViewById(a.g.f9141f);
            if (this.f1231s != 0) {
                this.f1229q.setTextAppearance(getContext(), this.f1231s);
            }
            if (this.f1232t != 0) {
                this.f1230r.setTextAppearance(getContext(), this.f1232t);
            }
        }
        this.f1229q.setText(this.f1223k);
        this.f1230r.setText(this.f1224l);
        boolean z6 = !TextUtils.isEmpty(this.f1223k);
        boolean z7 = !TextUtils.isEmpty(this.f1224l);
        int i7 = 0;
        this.f1230r.setVisibility(z7 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1228p;
        if (!z6 && !z7) {
            i7 = 8;
        }
        linearLayout2.setVisibility(i7);
        if (this.f1228p.getParent() == null) {
            addView(this.f1228p);
        }
    }

    public boolean s() {
        return this.f1233u;
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i7) {
        this.f1416f = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1227o;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1227o = view;
        if (view != null && (linearLayout = this.f1228p) != null) {
            removeView(linearLayout);
            this.f1228p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1224l = charSequence;
        r();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1223k = charSequence;
        r();
        androidx.core.view.u1.E1(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f1233u) {
            requestLayout();
        }
        this.f1233u = z6;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t() {
        removeAllViews();
        this.f1227o = null;
        this.f1414d = null;
        this.f1415e = null;
        View view = this.f1226n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public ActionBarContextView(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.C);
    }

    public ActionBarContextView(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        t1 G = t1.G(context, attributeSet, a.m.J, i7, 0);
        androidx.core.view.u1.I1(this, G.h(a.m.K));
        this.f1231s = G.u(a.m.P, 0);
        this.f1232t = G.u(a.m.O, 0);
        this.f1416f = G.q(a.m.N, 0);
        this.f1234v = G.u(a.m.M, a.j.f9199f);
        G.I();
    }
}
