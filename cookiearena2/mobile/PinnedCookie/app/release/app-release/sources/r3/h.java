package r3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.u1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import d.b1;
import d.g0;
import d.o0;
import d.q0;
import d.u0;
import d.w0;
import h1.f0;
import h1.q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import q3.a;
/* loaded from: classes.dex */
public final class h extends ViewGroup {
    public static final int A = -1;
    public static boolean B = true;

    /* renamed from: v  reason: collision with root package name */
    public static final int f15644v = 0;

    /* renamed from: w  reason: collision with root package name */
    public static final int f15645w = 1;

    /* renamed from: x  reason: collision with root package name */
    public static final int f15646x = 0;

    /* renamed from: y  reason: collision with root package name */
    public static final int f15647y = 1;

    /* renamed from: z  reason: collision with root package name */
    public static final int f15648z = 2;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f15649b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f15650c;

    /* renamed from: d  reason: collision with root package name */
    public r3.b f15651d;

    /* renamed from: e  reason: collision with root package name */
    public int f15652e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15653f;

    /* renamed from: g  reason: collision with root package name */
    public RecyclerView.i f15654g;

    /* renamed from: h  reason: collision with root package name */
    public LinearLayoutManager f15655h;

    /* renamed from: i  reason: collision with root package name */
    public int f15656i;

    /* renamed from: j  reason: collision with root package name */
    public Parcelable f15657j;

    /* renamed from: k  reason: collision with root package name */
    public RecyclerView f15658k;

    /* renamed from: l  reason: collision with root package name */
    public x f15659l;

    /* renamed from: m  reason: collision with root package name */
    public r3.g f15660m;

    /* renamed from: n  reason: collision with root package name */
    public r3.b f15661n;

    /* renamed from: o  reason: collision with root package name */
    public r3.d f15662o;

    /* renamed from: p  reason: collision with root package name */
    public r3.f f15663p;

    /* renamed from: q  reason: collision with root package name */
    public RecyclerView.l f15664q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f15665r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f15666s;

    /* renamed from: t  reason: collision with root package name */
    public int f15667t;

    /* renamed from: u  reason: collision with root package name */
    public e f15668u;

    /* loaded from: classes.dex */
    public class a extends g {
        public a() {
            super(null);
        }

        @Override // r3.h.g, androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            h hVar = h.this;
            hVar.f15653f = true;
            hVar.f15660m.l();
        }
    }

    /* loaded from: classes.dex */
    public class b extends j {
        public b() {
        }

        @Override // r3.h.j
        public void onPageScrollStateChanged(int i7) {
            if (i7 == 0) {
                h.this.y();
            }
        }

        @Override // r3.h.j
        public void onPageSelected(int i7) {
            h hVar = h.this;
            if (hVar.f15652e != i7) {
                hVar.f15652e = i7;
                hVar.f15668u.q();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends j {
        public c() {
        }

        @Override // r3.h.j
        public void onPageSelected(int i7) {
            h.this.clearFocus();
            if (h.this.hasFocus()) {
                h.this.f15658k.requestFocus(2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements RecyclerView.q {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void b(@o0 View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) pVar).width != -1 || ((ViewGroup.MarginLayoutParams) pVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void d(@o0 View view) {
        }
    }

    /* loaded from: classes.dex */
    public abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int i7) {
            return false;
        }

        public boolean c(int i7, Bundle bundle) {
            return false;
        }

        public boolean d() {
            return false;
        }

        public void e(@q0 RecyclerView.g<?> gVar) {
        }

        public void f(@q0 RecyclerView.g<?> gVar) {
        }

        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        public void h(@o0 r3.b bVar, @o0 RecyclerView recyclerView) {
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void j(@o0 f0 f0Var) {
        }

        public boolean k(int i7) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean l(int i7, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void m() {
        }

        public CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        public void o(@o0 AccessibilityEvent accessibilityEvent) {
        }

        public void p() {
        }

        public void q() {
        }

        public void r() {
        }

        public void s() {
        }

        public /* synthetic */ e(h hVar, a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class f extends e {
        public f() {
            super(h.this, null);
        }

        @Override // r3.h.e
        public boolean b(int i7) {
            return (i7 == 8192 || i7 == 4096) && !h.this.l();
        }

        @Override // r3.h.e
        public boolean d() {
            return true;
        }

        @Override // r3.h.e
        public void j(@o0 f0 f0Var) {
            if (h.this.l()) {
                return;
            }
            f0Var.P0(f0.a.f10221s);
            f0Var.P0(f0.a.f10220r);
            f0Var.M1(false);
        }

        @Override // r3.h.e
        public boolean k(int i7) {
            if (b(i7)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // r3.h.e
        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g extends RecyclerView.i {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i7, int i8) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i7, int i8) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i7, int i8, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i7, int i8) {
            onChanged();
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i7, int i8, @q0 Object obj) {
            onChanged();
        }
    }

    /* renamed from: r3.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0227h extends LinearLayoutManager {
        public C0227h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@o0 RecyclerView.c0 c0Var, @o0 int[] iArr) {
            int offscreenPageLimit = h.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(c0Var, iArr);
                return;
            }
            int pageSize = h.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onInitializeAccessibilityNodeInfo(@o0 RecyclerView.w wVar, @o0 RecyclerView.c0 c0Var, @o0 f0 f0Var) {
            super.onInitializeAccessibilityNodeInfo(wVar, c0Var, f0Var);
            h.this.f15668u.j(f0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean performAccessibilityAction(@o0 RecyclerView.w wVar, @o0 RecyclerView.c0 c0Var, int i7, @q0 Bundle bundle) {
            return h.this.f15668u.b(i7) ? h.this.f15668u.k(i7) : super.performAccessibilityAction(wVar, c0Var, i7, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean requestChildRectangleOnScreen(@o0 RecyclerView recyclerView, @o0 View view, @o0 Rect rect, boolean z6, boolean z7) {
            return false;
        }
    }

    @g0(from = i6.p.f11250n)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface i {
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void onPageScrollStateChanged(int i7) {
        }

        public void onPageScrolled(int i7, float f7, @u0 int i8) {
        }

        public void onPageSelected(int i7) {
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface k {
    }

    /* loaded from: classes.dex */
    public class l extends e {

        /* renamed from: b  reason: collision with root package name */
        public final h1.q0 f15676b;

        /* renamed from: c  reason: collision with root package name */
        public final h1.q0 f15677c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView.i f15678d;

        /* loaded from: classes.dex */
        public class a implements h1.q0 {
            public a() {
            }

            @Override // h1.q0
            public boolean perform(@o0 View view, @q0 q0.a aVar) {
                l.this.v(((h) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements h1.q0 {
            public b() {
            }

            @Override // h1.q0
            public boolean perform(@o0 View view, @d.q0 q0.a aVar) {
                l.this.v(((h) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class c extends g {
            public c() {
                super(null);
            }

            @Override // r3.h.g, androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                l.this.w();
            }
        }

        public l() {
            super(h.this, null);
            this.f15676b = new a();
            this.f15677c = new b();
        }

        @Override // r3.h.e
        public boolean a() {
            return true;
        }

        @Override // r3.h.e
        public boolean c(int i7, Bundle bundle) {
            return i7 == 8192 || i7 == 4096;
        }

        @Override // r3.h.e
        public void e(@d.q0 RecyclerView.g<?> gVar) {
            w();
            if (gVar != null) {
                gVar.registerAdapterDataObserver(this.f15678d);
            }
        }

        @Override // r3.h.e
        public void f(@d.q0 RecyclerView.g<?> gVar) {
            if (gVar != null) {
                gVar.unregisterAdapterDataObserver(this.f15678d);
            }
        }

        @Override // r3.h.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // r3.h.e
        public void h(@o0 r3.b bVar, @o0 RecyclerView recyclerView) {
            u1.R1(recyclerView, 2);
            this.f15678d = new c();
            if (u1.V(h.this) == 0) {
                u1.R1(h.this, 1);
            }
        }

        @Override // r3.h.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            u(accessibilityNodeInfo);
        }

        @Override // r3.h.e
        public boolean l(int i7, Bundle bundle) {
            if (c(i7, bundle)) {
                v(i7 == 8192 ? h.this.getCurrentItem() - 1 : h.this.getCurrentItem() + 1);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // r3.h.e
        public void m() {
            w();
        }

        @Override // r3.h.e
        public void o(@o0 AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(h.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // r3.h.e
        public void p() {
            w();
        }

        @Override // r3.h.e
        public void q() {
            w();
        }

        @Override // r3.h.e
        public void r() {
            w();
        }

        @Override // r3.h.e
        public void s() {
            w();
        }

        public final void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i7;
            int i8;
            if (h.this.getAdapter() == null) {
                i7 = 0;
                i8 = 0;
            } else if (h.this.getOrientation() == 1) {
                i7 = h.this.getAdapter().getItemCount();
                i8 = 0;
            } else {
                i8 = h.this.getAdapter().getItemCount();
                i7 = 0;
            }
            f0.g2(accessibilityNodeInfo).d1(f0.d.f(i7, i8, false, 0));
        }

        public final void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.g adapter = h.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !h.this.l()) {
                return;
            }
            if (h.this.f15652e > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (h.this.f15652e < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        public void v(int i7) {
            if (h.this.l()) {
                h.this.t(i7, true);
            }
        }

        public void w() {
            int itemCount;
            h hVar = h.this;
            u1.r1(hVar, 16908360);
            u1.r1(hVar, 16908361);
            u1.r1(hVar, 16908358);
            u1.r1(hVar, 16908359);
            if (h.this.getAdapter() == null || (itemCount = h.this.getAdapter().getItemCount()) == 0 || !h.this.l()) {
                return;
            }
            if (h.this.getOrientation() != 0) {
                if (h.this.f15652e < itemCount - 1) {
                    u1.u1(hVar, new f0.a(16908359, null), null, this.f15676b);
                }
                if (h.this.f15652e > 0) {
                    u1.u1(hVar, new f0.a(16908358, null), null, this.f15677c);
                    return;
                }
                return;
            }
            boolean k7 = h.this.k();
            int i7 = k7 ? 16908360 : 16908361;
            int i8 = k7 ? 16908361 : 16908360;
            if (h.this.f15652e < itemCount - 1) {
                u1.u1(hVar, new f0.a(i7, null), null, this.f15676b);
            }
            if (h.this.f15652e > 0) {
                u1.u1(hVar, new f0.a(i8, null), null, this.f15677c);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface m {
        void a(@o0 View view, float f7);
    }

    /* loaded from: classes.dex */
    public class n extends x {
        public n() {
        }

        @Override // androidx.recyclerview.widget.x, androidx.recyclerview.widget.b0
        @d.q0
        public View h(RecyclerView.o oVar) {
            if (h.this.j()) {
                return null;
            }
            return super.h(oVar);
        }
    }

    /* loaded from: classes.dex */
    public class o extends RecyclerView {
        public o(@o0 Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @w0(23)
        public CharSequence getAccessibilityClassName() {
            return h.this.f15668u.d() ? h.this.f15668u.n() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@o0 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(h.this.f15652e);
            accessibilityEvent.setToIndex(h.this.f15652e);
            h.this.f15668u.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return h.this.l() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return h.this.l() && super.onTouchEvent(motionEvent);
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface q {
    }

    /* loaded from: classes.dex */
    public static class r implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final int f15688k;

        /* renamed from: l  reason: collision with root package name */
        public final RecyclerView f15689l;

        public r(int i7, RecyclerView recyclerView) {
            this.f15688k = i7;
            this.f15689l = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15689l.smoothScrollToPosition(this.f15688k);
        }
    }

    public h(@o0 Context context) {
        super(context);
        this.f15649b = new Rect();
        this.f15650c = new Rect();
        this.f15651d = new r3.b(3);
        this.f15653f = false;
        this.f15654g = new a();
        this.f15656i = -1;
        this.f15664q = null;
        this.f15665r = false;
        this.f15666s = true;
        this.f15667t = -1;
        h(context, null);
    }

    public void a(@o0 RecyclerView.n nVar) {
        this.f15658k.addItemDecoration(nVar);
    }

    public void b(@o0 RecyclerView.n nVar, int i7) {
        this.f15658k.addItemDecoration(nVar, i7);
    }

    public boolean c() {
        return this.f15662o.b();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i7) {
        return this.f15658k.canScrollHorizontally(i7);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i7) {
        return this.f15658k.canScrollVertically(i7);
    }

    public boolean d() {
        return this.f15662o.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof p) {
            int i7 = ((p) parcelable).f15685k;
            sparseArray.put(this.f15658k.getId(), sparseArray.get(i7));
            sparseArray.remove(i7);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        r();
    }

    public final RecyclerView.q e() {
        return new d();
    }

    public boolean f(@u0 @SuppressLint({"SupportAnnotationUsage"}) float f7) {
        return this.f15662o.e(f7);
    }

    @o0
    public RecyclerView.n g(int i7) {
        return this.f15658k.getItemDecorationAt(i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    @w0(23)
    public CharSequence getAccessibilityClassName() {
        return this.f15668u.a() ? this.f15668u.g() : super.getAccessibilityClassName();
    }

    @d.q0
    public RecyclerView.g getAdapter() {
        return this.f15658k.getAdapter();
    }

    public int getCurrentItem() {
        return this.f15652e;
    }

    public int getItemDecorationCount() {
        return this.f15658k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f15667t;
    }

    public int getOrientation() {
        return this.f15655h.getOrientation();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f15658k;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f15660m.f();
    }

    public final void h(Context context, AttributeSet attributeSet) {
        this.f15668u = B ? new l() : new f();
        o oVar = new o(context);
        this.f15658k = oVar;
        oVar.setId(u1.D());
        this.f15658k.setDescendantFocusability(131072);
        C0227h c0227h = new C0227h(context);
        this.f15655h = c0227h;
        this.f15658k.setLayoutManager(c0227h);
        this.f15658k.setScrollingTouchSlop(1);
        u(context, attributeSet);
        this.f15658k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f15658k.addOnChildAttachStateChangeListener(e());
        r3.g gVar = new r3.g(this);
        this.f15660m = gVar;
        this.f15662o = new r3.d(this, gVar, this.f15658k);
        n nVar = new n();
        this.f15659l = nVar;
        nVar.b(this.f15658k);
        this.f15658k.addOnScrollListener(this.f15660m);
        r3.b bVar = new r3.b(3);
        this.f15661n = bVar;
        this.f15660m.p(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f15661n.a(bVar2);
        this.f15661n.a(cVar);
        this.f15668u.h(this.f15661n, this.f15658k);
        this.f15661n.a(this.f15651d);
        r3.f fVar = new r3.f(this.f15655h);
        this.f15663p = fVar;
        this.f15661n.a(fVar);
        RecyclerView recyclerView = this.f15658k;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    public void i() {
        this.f15658k.invalidateItemDecorations();
    }

    public boolean j() {
        return this.f15662o.f();
    }

    public boolean k() {
        return this.f15655h.getLayoutDirection() == 1;
    }

    public boolean l() {
        return this.f15666s;
    }

    public final void m(@d.q0 RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.f15654g);
        }
    }

    public void n(@o0 j jVar) {
        this.f15651d.a(jVar);
    }

    public void o(@o0 RecyclerView.n nVar) {
        this.f15658k.removeItemDecoration(nVar);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f15668u.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int measuredWidth = this.f15658k.getMeasuredWidth();
        int measuredHeight = this.f15658k.getMeasuredHeight();
        this.f15649b.left = getPaddingLeft();
        this.f15649b.right = (i9 - i7) - getPaddingRight();
        this.f15649b.top = getPaddingTop();
        this.f15649b.bottom = (i10 - i8) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f15649b, this.f15650c);
        RecyclerView recyclerView = this.f15658k;
        Rect rect = this.f15650c;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f15653f) {
            y();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        measureChild(this.f15658k, i7, i8);
        int measuredWidth = this.f15658k.getMeasuredWidth();
        int measuredHeight = this.f15658k.getMeasuredHeight();
        int measuredState = this.f15658k.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i7, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i8, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.getSuperState());
        this.f15656i = pVar.f15686l;
        this.f15657j = pVar.f15687m;
    }

    @Override // android.view.View
    @d.q0
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f15685k = this.f15658k.getId();
        int i7 = this.f15656i;
        if (i7 == -1) {
            i7 = this.f15652e;
        }
        pVar.f15686l = i7;
        Parcelable parcelable = this.f15657j;
        if (parcelable != null) {
            pVar.f15687m = parcelable;
        } else {
            RecyclerView.g adapter = this.f15658k.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                pVar.f15687m = ((androidx.viewpager2.adapter.b) adapter).a();
            }
        }
        return pVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(h.class.getSimpleName() + " does not support direct child views");
    }

    public void p(int i7) {
        this.f15658k.removeItemDecorationAt(i7);
    }

    @Override // android.view.View
    @w0(16)
    public boolean performAccessibilityAction(int i7, Bundle bundle) {
        return this.f15668u.c(i7, bundle) ? this.f15668u.l(i7, bundle) : super.performAccessibilityAction(i7, bundle);
    }

    public void q() {
        if (this.f15663p.a() == null) {
            return;
        }
        double e7 = this.f15660m.e();
        int i7 = (int) e7;
        float f7 = (float) (e7 - i7);
        this.f15663p.onPageScrolled(i7, f7, Math.round(getPageSize() * f7));
    }

    public final void r() {
        RecyclerView.g adapter;
        if (this.f15656i == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f15657j;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                ((androidx.viewpager2.adapter.b) adapter).b(parcelable);
            }
            this.f15657j = null;
        }
        int max = Math.max(0, Math.min(this.f15656i, adapter.getItemCount() - 1));
        this.f15652e = max;
        this.f15656i = -1;
        this.f15658k.scrollToPosition(max);
        this.f15668u.m();
    }

    public void s(int i7, boolean z6) {
        if (j()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        t(i7, z6);
    }

    public void setAdapter(@d.q0 RecyclerView.g gVar) {
        RecyclerView.g adapter = this.f15658k.getAdapter();
        this.f15668u.f(adapter);
        w(adapter);
        this.f15658k.setAdapter(gVar);
        this.f15652e = 0;
        r();
        this.f15668u.e(gVar);
        m(gVar);
    }

    public void setCurrentItem(int i7) {
        s(i7, true);
    }

    @Override // android.view.View
    @w0(17)
    public void setLayoutDirection(int i7) {
        super.setLayoutDirection(i7);
        this.f15668u.p();
    }

    public void setOffscreenPageLimit(int i7) {
        if (i7 < 1 && i7 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f15667t = i7;
        this.f15658k.requestLayout();
    }

    public void setOrientation(int i7) {
        this.f15655h.setOrientation(i7);
        this.f15668u.r();
    }

    public void setPageTransformer(@d.q0 m mVar) {
        if (mVar != null) {
            if (!this.f15665r) {
                this.f15664q = this.f15658k.getItemAnimator();
                this.f15665r = true;
            }
            this.f15658k.setItemAnimator(null);
        } else if (this.f15665r) {
            this.f15658k.setItemAnimator(this.f15664q);
            this.f15664q = null;
            this.f15665r = false;
        }
        if (mVar == this.f15663p.a()) {
            return;
        }
        this.f15663p.b(mVar);
        q();
    }

    public void setUserInputEnabled(boolean z6) {
        this.f15666s = z6;
        this.f15668u.s();
    }

    public void t(int i7, boolean z6) {
        RecyclerView.g adapter = getAdapter();
        if (adapter == null) {
            if (this.f15656i != -1) {
                this.f15656i = Math.max(i7, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i7, 0), adapter.getItemCount() - 1);
            if (min == this.f15652e && this.f15660m.i()) {
                return;
            }
            int i8 = this.f15652e;
            if (min == i8 && z6) {
                return;
            }
            double d7 = i8;
            this.f15652e = min;
            this.f15668u.q();
            if (!this.f15660m.i()) {
                d7 = this.f15660m.e();
            }
            this.f15660m.n(min, z6);
            if (!z6) {
                this.f15658k.scrollToPosition(min);
                return;
            }
            double d8 = min;
            if (Math.abs(d8 - d7) <= 3.0d) {
                this.f15658k.smoothScrollToPosition(min);
                return;
            }
            this.f15658k.scrollToPosition(d8 > d7 ? min - 3 : min + 3);
            RecyclerView recyclerView = this.f15658k;
            recyclerView.post(new r(min, recyclerView));
        }
    }

    public final void u(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f15287c0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, a.j.f15287c0, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(a.j.f15289d0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void v() {
        View h7 = this.f15659l.h(this.f15655h);
        if (h7 == null) {
            return;
        }
        int[] c7 = this.f15659l.c(this.f15655h, h7);
        int i7 = c7[0];
        if (i7 == 0 && c7[1] == 0) {
            return;
        }
        this.f15658k.smoothScrollBy(i7, c7[1]);
    }

    public final void w(@d.q0 RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.unregisterAdapterDataObserver(this.f15654g);
        }
    }

    public void x(@o0 j jVar) {
        this.f15651d.b(jVar);
    }

    public void y() {
        x xVar = this.f15659l;
        if (xVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View h7 = xVar.h(this.f15655h);
        if (h7 == null) {
            return;
        }
        int position = this.f15655h.getPosition(h7);
        if (position != this.f15652e && getScrollState() == 0) {
            this.f15661n.onPageSelected(position);
        }
        this.f15653f = false;
    }

    /* loaded from: classes.dex */
    public static class p extends View.BaseSavedState {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public int f15685k;

        /* renamed from: l  reason: collision with root package name */
        public int f15686l;

        /* renamed from: m  reason: collision with root package name */
        public Parcelable f15687m;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i7) {
                return new p[i7];
            }
        }

        @w0(24)
        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        public final void a(Parcel parcel, ClassLoader classLoader) {
            this.f15685k = parcel.readInt();
            this.f15686l = parcel.readInt();
            this.f15687m = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f15685k);
            parcel.writeInt(this.f15686l);
            parcel.writeParcelable(this.f15687m, i7);
        }

        public p(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public h(@o0 Context context, @d.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15649b = new Rect();
        this.f15650c = new Rect();
        this.f15651d = new r3.b(3);
        this.f15653f = false;
        this.f15654g = new a();
        this.f15656i = -1;
        this.f15664q = null;
        this.f15665r = false;
        this.f15666s = true;
        this.f15667t = -1;
        h(context, attributeSet);
    }

    public h(@o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f15649b = new Rect();
        this.f15650c = new Rect();
        this.f15651d = new r3.b(3);
        this.f15653f = false;
        this.f15654g = new a();
        this.f15656i = -1;
        this.f15664q = null;
        this.f15665r = false;
        this.f15666s = true;
        this.f15667t = -1;
        h(context, attributeSet);
    }

    @w0(21)
    public h(@o0 Context context, @d.q0 AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f15649b = new Rect();
        this.f15650c = new Rect();
        this.f15651d = new r3.b(3);
        this.f15653f = false;
        this.f15654g = new a();
        this.f15656i = -1;
        this.f15664q = null;
        this.f15665r = false;
        this.f15666s = true;
        this.f15667t = -1;
        h(context, attributeSet);
    }
}
