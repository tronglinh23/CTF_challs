package p3;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.appcompat.widget.g0;
import androidx.core.view.h4;
import androidx.core.view.k1;
import androidx.core.view.u1;
import d.o0;
import d.q0;
import d.u0;
import d.v;
import h1.f0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class d extends ViewGroup {
    public static final int A0 = 0;
    public static final int B0 = 1;
    public static final int C0 = 2;

    /* renamed from: j0  reason: collision with root package name */
    public static final String f14679j0 = "ViewPager";

    /* renamed from: k0  reason: collision with root package name */
    public static final boolean f14680k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    public static final boolean f14681l0 = false;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f14682m0 = 1;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f14683n0 = 600;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f14684o0 = 25;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f14685p0 = 16;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f14686q0 = 400;

    /* renamed from: u0  reason: collision with root package name */
    public static final int f14690u0 = -1;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f14691v0 = 2;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f14692w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f14693x0 = 1;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f14694y0 = 2;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public VelocityTracker J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public long P;
    public EdgeEffect Q;
    public EdgeEffect R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public List<j> W;

    /* renamed from: a0  reason: collision with root package name */
    public j f14696a0;

    /* renamed from: b  reason: collision with root package name */
    public int f14697b;

    /* renamed from: b0  reason: collision with root package name */
    public j f14698b0;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<f> f14699c;

    /* renamed from: c0  reason: collision with root package name */
    public List<i> f14700c0;

    /* renamed from: d  reason: collision with root package name */
    public final f f14701d;

    /* renamed from: d0  reason: collision with root package name */
    public k f14702d0;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f14703e;

    /* renamed from: e0  reason: collision with root package name */
    public int f14704e0;

    /* renamed from: f  reason: collision with root package name */
    public p3.a f14705f;

    /* renamed from: f0  reason: collision with root package name */
    public int f14706f0;

    /* renamed from: g  reason: collision with root package name */
    public int f14707g;

    /* renamed from: g0  reason: collision with root package name */
    public ArrayList<View> f14708g0;

    /* renamed from: h  reason: collision with root package name */
    public int f14709h;

    /* renamed from: h0  reason: collision with root package name */
    public final Runnable f14710h0;

    /* renamed from: i  reason: collision with root package name */
    public Parcelable f14711i;

    /* renamed from: i0  reason: collision with root package name */
    public int f14712i0;

    /* renamed from: j  reason: collision with root package name */
    public ClassLoader f14713j;

    /* renamed from: k  reason: collision with root package name */
    public Scroller f14714k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14715l;

    /* renamed from: m  reason: collision with root package name */
    public l f14716m;

    /* renamed from: n  reason: collision with root package name */
    public int f14717n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f14718o;

    /* renamed from: p  reason: collision with root package name */
    public int f14719p;

    /* renamed from: q  reason: collision with root package name */
    public int f14720q;

    /* renamed from: r  reason: collision with root package name */
    public float f14721r;

    /* renamed from: s  reason: collision with root package name */
    public float f14722s;

    /* renamed from: t  reason: collision with root package name */
    public int f14723t;

    /* renamed from: u  reason: collision with root package name */
    public int f14724u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f14725v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f14726w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f14727x;

    /* renamed from: y  reason: collision with root package name */
    public int f14728y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f14729z;

    /* renamed from: r0  reason: collision with root package name */
    public static final int[] f14687r0 = {16842931};

    /* renamed from: s0  reason: collision with root package name */
    public static final Comparator<f> f14688s0 = new a();

    /* renamed from: t0  reason: collision with root package name */
    public static final Interpolator f14689t0 = new b();

    /* renamed from: z0  reason: collision with root package name */
    public static final o f14695z0 = new o();

    /* loaded from: classes.dex */
    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f14734b - fVar2.f14734b;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.setScrollState(0);
            d.this.J();
        }
    }

    /* renamed from: p3.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0209d implements k1 {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f14731a = new Rect();

        public C0209d() {
        }

        @Override // androidx.core.view.k1
        public h4 onApplyWindowInsets(View view, h4 h4Var) {
            h4 g12 = u1.g1(view, h4Var);
            if (g12.A()) {
                return g12;
            }
            Rect rect = this.f14731a;
            rect.left = g12.p();
            rect.top = g12.r();
            rect.right = g12.q();
            rect.bottom = g12.o();
            int childCount = d.this.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                h4 p6 = u1.p(d.this.getChildAt(i7), g12);
                rect.left = Math.min(p6.p(), rect.left);
                rect.top = Math.min(p6.r(), rect.top);
                rect.right = Math.min(p6.q(), rect.right);
                rect.bottom = Math.min(p6.o(), rect.bottom);
            }
            return g12.D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Object f14733a;

        /* renamed from: b  reason: collision with root package name */
        public int f14734b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f14735c;

        /* renamed from: d  reason: collision with root package name */
        public float f14736d;

        /* renamed from: e  reason: collision with root package name */
        public float f14737e;
    }

    /* loaded from: classes.dex */
    public class h extends androidx.core.view.a {
        public h() {
        }

        public final boolean c() {
            p3.a aVar = d.this.f14705f;
            return aVar != null && aVar.e() > 1;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            p3.a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(d.class.getName());
            accessibilityEvent.setScrollable(c());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = d.this.f14705f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.e());
            accessibilityEvent.setFromIndex(d.this.f14707g);
            accessibilityEvent.setToIndex(d.this.f14707g);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, f0 f0Var) {
            super.onInitializeAccessibilityNodeInfo(view, f0Var);
            f0Var.b1(d.class.getName());
            f0Var.M1(c());
            if (d.this.canScrollHorizontally(1)) {
                f0Var.a(4096);
            }
            if (d.this.canScrollHorizontally(-1)) {
                f0Var.a(8192);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            if (super.performAccessibilityAction(view, i7, bundle)) {
                return true;
            }
            if (i7 == 4096) {
                if (d.this.canScrollHorizontally(1)) {
                    d dVar = d.this;
                    dVar.setCurrentItem(dVar.f14707g + 1);
                    return true;
                }
                return false;
            } else if (i7 == 8192 && d.this.canScrollHorizontally(-1)) {
                d dVar2 = d.this;
                dVar2.setCurrentItem(dVar2.f14707g - 1);
                return true;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void onAdapterChanged(@o0 d dVar, @q0 p3.a aVar, @q0 p3.a aVar2);
    }

    /* loaded from: classes.dex */
    public interface j {
        void onPageScrollStateChanged(int i7);

        void onPageScrolled(int i7, float f7, @u0 int i8);

        void onPageSelected(int i7);
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(@o0 View view, float f7);
    }

    /* loaded from: classes.dex */
    public class l extends DataSetObserver {
        public l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            d.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            d.this.j();
        }
    }

    /* loaded from: classes.dex */
    public static class m extends o1.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public int f14746k;

        /* renamed from: l  reason: collision with root package name */
        public Parcelable f14747l;

        /* renamed from: m  reason: collision with root package name */
        public ClassLoader f14748m;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i7) {
                return new m[i7];
            }
        }

        public m(@o0 Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f14746k + "}";
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f14746k);
            parcel.writeParcelable(this.f14747l, i7);
        }

        public m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f14746k = parcel.readInt();
            this.f14747l = parcel.readParcelable(classLoader);
            this.f14748m = classLoader;
        }
    }

    /* loaded from: classes.dex */
    public static class n implements j {
        @Override // p3.d.j
        public void onPageScrollStateChanged(int i7) {
        }

        @Override // p3.d.j
        public void onPageScrolled(int i7, float f7, int i8) {
        }

        @Override // p3.d.j
        public void onPageSelected(int i7) {
        }
    }

    /* loaded from: classes.dex */
    public static class o implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z6 = gVar.f14738a;
            return z6 != gVar2.f14738a ? z6 ? 1 : -1 : gVar.f14742e - gVar2.f14742e;
        }
    }

    public d(@o0 Context context) {
        super(context);
        this.f14699c = new ArrayList<>();
        this.f14701d = new f();
        this.f14703e = new Rect();
        this.f14709h = -1;
        this.f14711i = null;
        this.f14713j = null;
        this.f14721r = -3.4028235E38f;
        this.f14722s = Float.MAX_VALUE;
        this.f14728y = 1;
        this.I = -1;
        this.S = true;
        this.T = false;
        this.f14710h0 = new c();
        this.f14712i0 = 0;
        z();
    }

    public static boolean A(@o0 View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z6) {
        if (this.f14726w != z6) {
            this.f14726w = z6;
        }
    }

    public boolean B() {
        return this.O;
    }

    public final boolean C(float f7, float f8) {
        return (f7 < ((float) this.C) && f8 > 0.0f) || (f7 > ((float) (getWidth() - this.C)) && f8 < 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @d.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.V
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            p3.d$g r9 = (p3.d.g) r9
            boolean r10 = r9.f14738a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f14739b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.l(r13, r14, r15)
            p3.d$k r13 = r12.f14702d0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            p3.d$g r0 = (p3.d.g) r0
            boolean r0 = r0.f14738a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            p3.d$k r3 = r12.f14702d0
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.U = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.d.D(int, float, int):void");
    }

    public final void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i7);
            this.I = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean F() {
        int i7 = this.f14707g;
        if (i7 > 0) {
            S(i7 - 1, true);
            return true;
        }
        return false;
    }

    public boolean G() {
        p3.a aVar = this.f14705f;
        if (aVar == null || this.f14707g >= aVar.e() - 1) {
            return false;
        }
        S(this.f14707g + 1, true);
        return true;
    }

    public final boolean H(int i7) {
        if (this.f14699c.size() == 0) {
            if (this.S) {
                return false;
            }
            this.U = false;
            D(0, 0.0f, 0);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f x6 = x();
        int clientWidth = getClientWidth();
        int i8 = this.f14717n;
        int i9 = clientWidth + i8;
        float f7 = clientWidth;
        int i10 = x6.f14734b;
        float f8 = ((i7 / f7) - x6.f14737e) / (x6.f14736d + (i8 / f7));
        this.U = false;
        D(i10, f8, (int) (i9 * f8));
        if (this.U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean I(float f7) {
        boolean z6;
        boolean z7;
        float f8 = this.E - f7;
        this.E = f7;
        float scrollX = getScrollX() + f8;
        float clientWidth = getClientWidth();
        float f9 = this.f14721r * clientWidth;
        float f10 = this.f14722s * clientWidth;
        boolean z8 = false;
        f fVar = this.f14699c.get(0);
        ArrayList<f> arrayList = this.f14699c;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f14734b != 0) {
            f9 = fVar.f14737e * clientWidth;
            z6 = false;
        } else {
            z6 = true;
        }
        if (fVar2.f14734b != this.f14705f.e() - 1) {
            f10 = fVar2.f14737e * clientWidth;
            z7 = false;
        } else {
            z7 = true;
        }
        if (scrollX < f9) {
            if (z6) {
                this.Q.onPull(Math.abs(f9 - scrollX) / clientWidth);
                z8 = true;
            }
            scrollX = f9;
        } else if (scrollX > f10) {
            if (z7) {
                this.R.onPull(Math.abs(scrollX - f10) / clientWidth);
                z8 = true;
            }
            scrollX = f10;
        }
        int i7 = (int) scrollX;
        this.E += scrollX - i7;
        scrollTo(i7, getScrollY());
        H(i7);
        return z8;
    }

    public void J() {
        K(this.f14707g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(int r18) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.d.K(int):void");
    }

    public final void L(int i7, int i8, int i9, int i10) {
        if (i8 > 0 && !this.f14699c.isEmpty()) {
            if (!this.f14714k.isFinished()) {
                this.f14714k.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i8 - getPaddingLeft()) - getPaddingRight()) + i10)) * (((i7 - getPaddingLeft()) - getPaddingRight()) + i9)), getScrollY());
            return;
        }
        f y6 = y(this.f14707g);
        int min = (int) ((y6 != null ? Math.min(y6.f14737e, this.f14722s) : 0.0f) * ((i7 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            i(false);
            scrollTo(min, getScrollY());
        }
    }

    public final void M() {
        int i7 = 0;
        while (i7 < getChildCount()) {
            if (!((g) getChildAt(i7).getLayoutParams()).f14738a) {
                removeViewAt(i7);
                i7--;
            }
            i7++;
        }
    }

    public void N(@o0 i iVar) {
        List<i> list = this.f14700c0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void O(@o0 j jVar) {
        List<j> list = this.W;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public final void P(boolean z6) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z6);
        }
    }

    public final boolean Q() {
        this.I = -1;
        q();
        this.Q.onRelease();
        this.R.onRelease();
        return this.Q.isFinished() || this.R.isFinished();
    }

    public final void R(int i7, boolean z6, int i8, boolean z7) {
        f y6 = y(i7);
        int clientWidth = y6 != null ? (int) (getClientWidth() * Math.max(this.f14721r, Math.min(y6.f14737e, this.f14722s))) : 0;
        if (z6) {
            Z(clientWidth, 0, i8);
            if (z7) {
                m(i7);
                return;
            }
            return;
        }
        if (z7) {
            m(i7);
        }
        i(false);
        scrollTo(clientWidth, 0);
        H(clientWidth);
    }

    public void S(int i7, boolean z6) {
        this.f14727x = false;
        T(i7, z6, false);
    }

    public void T(int i7, boolean z6, boolean z7) {
        U(i7, z6, z7, 0);
    }

    public void U(int i7, boolean z6, boolean z7, int i8) {
        p3.a aVar = this.f14705f;
        if (aVar == null || aVar.e() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z7 || this.f14707g != i7 || this.f14699c.size() == 0) {
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 >= this.f14705f.e()) {
                i7 = this.f14705f.e() - 1;
            }
            int i9 = this.f14728y;
            int i10 = this.f14707g;
            if (i7 > i10 + i9 || i7 < i10 - i9) {
                for (int i11 = 0; i11 < this.f14699c.size(); i11++) {
                    this.f14699c.get(i11).f14735c = true;
                }
            }
            boolean z8 = this.f14707g != i7;
            if (!this.S) {
                K(i7);
                R(i7, z6, i8, z8);
                return;
            }
            this.f14707g = i7;
            if (z8) {
                m(i7);
            }
            requestLayout();
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public j V(j jVar) {
        j jVar2 = this.f14698b0;
        this.f14698b0 = jVar;
        return jVar2;
    }

    public void W(boolean z6, @q0 k kVar) {
        X(z6, kVar, 2);
    }

    public void X(boolean z6, @q0 k kVar, int i7) {
        boolean z7 = kVar != null;
        boolean z8 = z7 != (this.f14702d0 != null);
        this.f14702d0 = kVar;
        setChildrenDrawingOrderEnabled(z7);
        if (z7) {
            this.f14706f0 = z6 ? 2 : 1;
            this.f14704e0 = i7;
        } else {
            this.f14706f0 = 0;
        }
        if (z8) {
            J();
        }
    }

    public void Y(int i7, int i8) {
        Z(i7, i8, 0);
    }

    public void Z(int i7, int i8, int i9) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f14714k;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f14715l ? this.f14714k.getCurrX() : this.f14714k.getStartX();
            this.f14714k.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i10 = scrollX;
        int scrollY = getScrollY();
        int i11 = i7 - i10;
        int i12 = i8 - scrollY;
        if (i11 == 0 && i12 == 0) {
            i(false);
            J();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i13 = clientWidth / 2;
        float f7 = clientWidth;
        float f8 = i13;
        float o6 = f8 + (o(Math.min(1.0f, (Math.abs(i11) * 1.0f) / f7)) * f8);
        int abs = Math.abs(i9);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(o6 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i11) / ((f7 * this.f14705f.h(this.f14707g)) + this.f14717n)) + 1.0f) * 100.0f), 600);
        this.f14715l = false;
        this.f14714k.startScroll(i10, scrollY, i11, i12, min);
        u1.n1(this);
    }

    public f a(int i7, int i8) {
        f fVar = new f();
        fVar.f14734b = i7;
        fVar.f14733a = this.f14705f.j(this, i7);
        fVar.f14736d = this.f14705f.h(i7);
        if (i8 < 0 || i8 >= this.f14699c.size()) {
            this.f14699c.add(fVar);
        } else {
            this.f14699c.add(i8, fVar);
        }
        return fVar;
    }

    public final void a0() {
        if (this.f14706f0 != 0) {
            ArrayList<View> arrayList = this.f14708g0;
            if (arrayList == null) {
                this.f14708g0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.f14708g0.add(getChildAt(i7));
            }
            Collections.sort(this.f14708g0, f14695z0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i7, int i8) {
        f w6;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() == 0 && (w6 = w(childAt)) != null && w6.f14734b == this.f14707g) {
                    childAt.addFocusables(arrayList, i7, i8);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i8 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f w6;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (w6 = w(childAt)) != null && w6.f14734b == this.f14707g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean A = gVar.f14738a | A(view);
        gVar.f14738a = A;
        if (!this.f14725v) {
            super.addView(view, i7, layoutParams);
        } else if (A) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            gVar.f14741d = true;
            addViewInLayout(view, i7, layoutParams);
        }
    }

    public void b(@o0 i iVar) {
        if (this.f14700c0 == null) {
            this.f14700c0 = new ArrayList();
        }
        this.f14700c0.add(iVar);
    }

    public void c(@o0 j jVar) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        this.W.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i7) {
        if (this.f14705f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i7 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f14721r)) : i7 > 0 && scrollX < ((int) (((float) clientWidth) * this.f14722s));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f14715l = true;
        if (this.f14714k.isFinished() || !this.f14714k.computeScrollOffset()) {
            i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f14714k.getCurrX();
        int currY = this.f14714k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!H(currX)) {
                this.f14714k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        u1.n1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L69
        Lb:
            if (r0 == 0) goto L69
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L69:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lba
            if (r3 == r0) goto Lba
            if (r7 != r5) goto L9a
            android.graphics.Rect r1 = r6.f14703e
            android.graphics.Rect r1 = r6.u(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f14703e
            android.graphics.Rect r2 = r6.u(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 < r2) goto L94
            boolean r0 = r6.F()
            goto L98
        L94:
            boolean r0 = r3.requestFocus()
        L98:
            r2 = r0
            goto Lcd
        L9a:
            if (r7 != r4) goto Lcd
            android.graphics.Rect r1 = r6.f14703e
            android.graphics.Rect r1 = r6.u(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f14703e
            android.graphics.Rect r2 = r6.u(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lb5
            if (r1 > r2) goto Lb5
            boolean r0 = r6.G()
            goto L98
        Lb5:
            boolean r0 = r3.requestFocus()
            goto L98
        Lba:
            if (r7 == r5) goto Lc9
            if (r7 != r1) goto Lbf
            goto Lc9
        Lbf:
            if (r7 == r4) goto Lc4
            r0 = 2
            if (r7 != r0) goto Lcd
        Lc4:
            boolean r2 = r6.G()
            goto Lcd
        Lc9:
            boolean r2 = r6.F()
        Lcd:
            if (r2 == 0) goto Ld6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.d.d(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f w6;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (w6 = w(childAt)) != null && w6.f14734b == this.f14707g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        p3.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z6 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f14705f) != null && aVar.e() > 1)) {
            if (!this.Q.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f14721r * width);
                this.Q.setSize(height, width);
                z6 = false | this.Q.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.R.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f14722s + 1.0f)) * width2);
                this.R.setSize(height2, width2);
                z6 |= this.R.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.Q.finish();
            this.R.finish();
        }
        if (z6) {
            u1.n1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14718o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e() {
        if (this.f14729z) {
            return false;
        }
        this.O = true;
        setScrollState(1);
        this.E = 0.0f;
        this.G = 0.0f;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker == null) {
            this.J = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.J.addMovement(obtain);
        obtain.recycle();
        this.P = uptimeMillis;
        return true;
    }

    public final void f(f fVar, int i7, f fVar2) {
        int i8;
        int i9;
        f fVar3;
        f fVar4;
        int e7 = this.f14705f.e();
        int clientWidth = getClientWidth();
        float f7 = clientWidth > 0 ? this.f14717n / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i10 = fVar2.f14734b;
            int i11 = fVar.f14734b;
            if (i10 < i11) {
                float f8 = fVar2.f14737e + fVar2.f14736d + f7;
                int i12 = i10 + 1;
                int i13 = 0;
                while (i12 <= fVar.f14734b && i13 < this.f14699c.size()) {
                    f fVar5 = this.f14699c.get(i13);
                    while (true) {
                        fVar4 = fVar5;
                        if (i12 <= fVar4.f14734b || i13 >= this.f14699c.size() - 1) {
                            break;
                        }
                        i13++;
                        fVar5 = this.f14699c.get(i13);
                    }
                    while (i12 < fVar4.f14734b) {
                        f8 += this.f14705f.h(i12) + f7;
                        i12++;
                    }
                    fVar4.f14737e = f8;
                    f8 += fVar4.f14736d + f7;
                    i12++;
                }
            } else if (i10 > i11) {
                int size = this.f14699c.size() - 1;
                float f9 = fVar2.f14737e;
                while (true) {
                    i10--;
                    if (i10 < fVar.f14734b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f14699c.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i10 >= fVar3.f14734b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f14699c.get(size);
                    }
                    while (i10 > fVar3.f14734b) {
                        f9 -= this.f14705f.h(i10) + f7;
                        i10--;
                    }
                    f9 -= fVar3.f14736d + f7;
                    fVar3.f14737e = f9;
                }
            }
        }
        int size2 = this.f14699c.size();
        float f10 = fVar.f14737e;
        int i14 = fVar.f14734b;
        int i15 = i14 - 1;
        this.f14721r = i14 == 0 ? f10 : -3.4028235E38f;
        int i16 = e7 - 1;
        this.f14722s = i14 == i16 ? (fVar.f14736d + f10) - 1.0f : Float.MAX_VALUE;
        int i17 = i7 - 1;
        while (i17 >= 0) {
            f fVar7 = this.f14699c.get(i17);
            while (true) {
                i9 = fVar7.f14734b;
                if (i15 <= i9) {
                    break;
                }
                f10 -= this.f14705f.h(i15) + f7;
                i15--;
            }
            f10 -= fVar7.f14736d + f7;
            fVar7.f14737e = f10;
            if (i9 == 0) {
                this.f14721r = f10;
            }
            i17--;
            i15--;
        }
        float f11 = fVar.f14737e + fVar.f14736d + f7;
        int i18 = fVar.f14734b + 1;
        int i19 = i7 + 1;
        while (i19 < size2) {
            f fVar8 = this.f14699c.get(i19);
            while (true) {
                i8 = fVar8.f14734b;
                if (i18 >= i8) {
                    break;
                }
                f11 += this.f14705f.h(i18) + f7;
                i18++;
            }
            if (i8 == i16) {
                this.f14722s = (fVar8.f14736d + f11) - 1.0f;
            }
            fVar8.f14737e = f11;
            f11 += fVar8.f14736d + f7;
            i19++;
            i18++;
        }
        this.T = false;
    }

    public boolean g(View view, boolean z6, int i7, int i8, int i9) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i11 = i8 + scrollX;
                if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && (i10 = i9 + scrollY) >= childAt.getTop() && i10 < childAt.getBottom() && g(childAt, true, i7, i11 - childAt.getLeft(), i10 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z6 && view.canScrollHorizontally(-i7);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @q0
    public p3.a getAdapter() {
        return this.f14705f;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i8) {
        if (this.f14706f0 == 2) {
            i8 = (i7 - 1) - i8;
        }
        return ((g) this.f14708g0.get(i8).getLayoutParams()).f14743f;
    }

    public int getCurrentItem() {
        return this.f14707g;
    }

    public int getOffscreenPageLimit() {
        return this.f14728y;
    }

    public int getPageMargin() {
        return this.f14717n;
    }

    public void h() {
        List<j> list = this.W;
        if (list != null) {
            list.clear();
        }
    }

    public final void i(boolean z6) {
        boolean z7 = this.f14712i0 == 2;
        if (z7) {
            setScrollingCacheEnabled(false);
            if ((!this.f14714k.isFinished()) != false) {
                this.f14714k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f14714k.getCurrX();
                int currY = this.f14714k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        H(currX);
                    }
                }
            }
        }
        this.f14727x = false;
        for (int i7 = 0; i7 < this.f14699c.size(); i7++) {
            f fVar = this.f14699c.get(i7);
            if (fVar.f14735c) {
                fVar.f14735c = false;
                z7 = true;
            }
        }
        if (z7) {
            if (z6) {
                u1.p1(this, this.f14710h0);
            } else {
                this.f14710h0.run();
            }
        }
    }

    public void j() {
        int e7 = this.f14705f.e();
        this.f14697b = e7;
        boolean z6 = this.f14699c.size() < (this.f14728y * 2) + 1 && this.f14699c.size() < e7;
        int i7 = this.f14707g;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < this.f14699c.size()) {
            f fVar = this.f14699c.get(i8);
            int f7 = this.f14705f.f(fVar.f14733a);
            if (f7 != -1) {
                if (f7 == -2) {
                    this.f14699c.remove(i8);
                    i8--;
                    if (!z7) {
                        this.f14705f.t(this);
                        z7 = true;
                    }
                    this.f14705f.b(this, fVar.f14734b, fVar.f14733a);
                    int i9 = this.f14707g;
                    if (i9 == fVar.f14734b) {
                        i7 = Math.max(0, Math.min(i9, e7 - 1));
                    }
                } else {
                    int i10 = fVar.f14734b;
                    if (i10 != f7) {
                        if (i10 == this.f14707g) {
                            i7 = f7;
                        }
                        fVar.f14734b = f7;
                    }
                }
                z6 = true;
            }
            i8++;
        }
        if (z7) {
            this.f14705f.d(this);
        }
        Collections.sort(this.f14699c, f14688s0);
        if (z6) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                g gVar = (g) getChildAt(i11).getLayoutParams();
                if (!gVar.f14738a) {
                    gVar.f14740c = 0.0f;
                }
            }
            T(i7, false, true);
            requestLayout();
        }
    }

    public final int k(int i7, float f7, int i8, int i9) {
        if (Math.abs(i9) <= this.M || Math.abs(i8) <= this.K) {
            i7 += (int) (f7 + (i7 >= this.f14707g ? 0.4f : 0.6f));
        } else if (i8 <= 0) {
            i7++;
        }
        if (this.f14699c.size() > 0) {
            return Math.max(this.f14699c.get(0).f14734b, Math.min(i7, this.f14699c.get(r4.size() - 1).f14734b));
        }
        return i7;
    }

    public final void l(int i7, float f7, int i8) {
        j jVar = this.f14696a0;
        if (jVar != null) {
            jVar.onPageScrolled(i7, f7, i8);
        }
        List<j> list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                j jVar2 = this.W.get(i9);
                if (jVar2 != null) {
                    jVar2.onPageScrolled(i7, f7, i8);
                }
            }
        }
        j jVar3 = this.f14698b0;
        if (jVar3 != null) {
            jVar3.onPageScrolled(i7, f7, i8);
        }
    }

    public final void m(int i7) {
        j jVar = this.f14696a0;
        if (jVar != null) {
            jVar.onPageSelected(i7);
        }
        List<j> list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                j jVar2 = this.W.get(i8);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i7);
                }
            }
        }
        j jVar3 = this.f14698b0;
        if (jVar3 != null) {
            jVar3.onPageSelected(i7);
        }
    }

    public final void n(int i7) {
        j jVar = this.f14696a0;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i7);
        }
        List<j> list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                j jVar2 = this.W.get(i8);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i7);
                }
            }
        }
        j jVar3 = this.f14698b0;
        if (jVar3 != null) {
            jVar3.onPageScrollStateChanged(i7);
        }
    }

    public float o(float f7) {
        return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f14710h0);
        Scroller scroller = this.f14714k;
        if (scroller != null && !scroller.isFinished()) {
            this.f14714k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i7;
        float f7;
        float f8;
        super.onDraw(canvas);
        if (this.f14717n <= 0 || this.f14718o == null || this.f14699c.size() <= 0 || this.f14705f == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f9 = this.f14717n / width;
        int i8 = 0;
        f fVar = this.f14699c.get(0);
        float f10 = fVar.f14737e;
        int size = this.f14699c.size();
        int i9 = fVar.f14734b;
        int i10 = this.f14699c.get(size - 1).f14734b;
        while (i9 < i10) {
            while (true) {
                i7 = fVar.f14734b;
                if (i9 <= i7 || i8 >= size) {
                    break;
                }
                i8++;
                fVar = this.f14699c.get(i8);
            }
            if (i9 == i7) {
                float f11 = fVar.f14737e;
                float f12 = fVar.f14736d;
                f7 = (f11 + f12) * width;
                f10 = f11 + f12 + f9;
            } else {
                float h7 = this.f14705f.h(i9);
                f7 = (f10 + h7) * width;
                f10 += h7 + f9;
            }
            if (this.f14717n + f7 > scrollX) {
                f8 = f9;
                this.f14718o.setBounds(Math.round(f7), this.f14719p, Math.round(this.f14717n + f7), this.f14720q);
                this.f14718o.draw(canvas);
            } else {
                f8 = f9;
            }
            if (f7 > scrollX + r2) {
                return;
            }
            i9++;
            f9 = f8;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            Q();
            return false;
        }
        if (action != 0) {
            if (this.f14729z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x6 = motionEvent.getX();
            this.G = x6;
            this.E = x6;
            float y6 = motionEvent.getY();
            this.H = y6;
            this.F = y6;
            this.I = motionEvent.getPointerId(0);
            this.A = false;
            this.f14715l = true;
            this.f14714k.computeScrollOffset();
            if (this.f14712i0 != 2 || Math.abs(this.f14714k.getFinalX() - this.f14714k.getCurrX()) <= this.N) {
                i(false);
                this.f14729z = false;
            } else {
                this.f14714k.abortAnimation();
                this.f14727x = false;
                J();
                this.f14729z = true;
                P(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i7 = this.I;
            if (i7 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i7);
                float x7 = motionEvent.getX(findPointerIndex);
                float f7 = x7 - this.E;
                float abs = Math.abs(f7);
                float y7 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y7 - this.H);
                int i8 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                if (i8 != 0 && !C(this.E, f7) && g(this, false, (int) f7, (int) x7, (int) y7)) {
                    this.E = x7;
                    this.F = y7;
                    this.A = true;
                    return false;
                }
                int i9 = this.D;
                if (abs > i9 && abs * 0.5f > abs2) {
                    this.f14729z = true;
                    P(true);
                    setScrollState(1);
                    float f8 = this.G;
                    float f9 = this.D;
                    this.E = i8 > 0 ? f8 + f9 : f8 - f9;
                    this.F = y7;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i9) {
                    this.A = true;
                }
                if (this.f14729z && I(x7)) {
                    u1.n1(this);
                }
            }
        } else if (action == 6) {
            E(motionEvent);
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.f14729z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.d.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        g gVar;
        g gVar2;
        int i9;
        setMeasuredDimension(View.getDefaultSize(0, i7), View.getDefaultSize(0, i8));
        int measuredWidth = getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            boolean z6 = true;
            int i11 = 1073741824;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f14738a) {
                int i12 = gVar2.f14739b;
                int i13 = i12 & 7;
                int i14 = i12 & g0.f1602o;
                boolean z7 = i14 == 48 || i14 == 80;
                if (i13 != 3 && i13 != 5) {
                    z6 = false;
                }
                int i15 = Integer.MIN_VALUE;
                if (z7) {
                    i9 = Integer.MIN_VALUE;
                    i15 = 1073741824;
                } else {
                    i9 = z6 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i16 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i16 != -2) {
                    if (i16 == -1) {
                        i16 = paddingLeft;
                    }
                    i15 = 1073741824;
                } else {
                    i16 = paddingLeft;
                }
                int i17 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i17 == -2) {
                    i17 = measuredHeight;
                    i11 = i9;
                } else if (i17 == -1) {
                    i17 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, i15), View.MeasureSpec.makeMeasureSpec(i17, i11));
                if (z7) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z6) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i10++;
        }
        this.f14723t = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f14724u = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f14725v = true;
        J();
        this.f14725v = false;
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f14738a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f14740c), 1073741824), this.f14724u);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int i8;
        int i9;
        int i10;
        f w6;
        int childCount = getChildCount();
        if ((i7 & 2) != 0) {
            i9 = childCount;
            i8 = 0;
            i10 = 1;
        } else {
            i8 = childCount - 1;
            i9 = -1;
            i10 = -1;
        }
        while (i8 != i9) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 0 && (w6 = w(childAt)) != null && w6.f14734b == this.f14707g && childAt.requestFocus(i7, rect)) {
                return true;
            }
            i8 += i10;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        p3.a aVar = this.f14705f;
        if (aVar != null) {
            aVar.n(mVar.f14747l, mVar.f14748m);
            T(mVar.f14746k, false, true);
            return;
        }
        this.f14709h = mVar.f14746k;
        this.f14711i = mVar.f14747l;
        this.f14713j = mVar.f14748m;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f14746k = this.f14707g;
        p3.a aVar = this.f14705f;
        if (aVar != null) {
            mVar.f14747l = aVar.o();
        }
        return mVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 != i9) {
            int i11 = this.f14717n;
            L(i7, i9, i11, i11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        p3.a aVar;
        if (this.O) {
            return true;
        }
        boolean z6 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f14705f) == null || aVar.e() == 0) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f14714k.abortAnimation();
            this.f14727x = false;
            J();
            float x6 = motionEvent.getX();
            this.G = x6;
            this.E = x6;
            float y6 = motionEvent.getY();
            this.H = y6;
            this.F = y6;
            this.I = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f14729z) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.I);
                    if (findPointerIndex == -1) {
                        z6 = Q();
                    } else {
                        float x7 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x7 - this.E);
                        float y7 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y7 - this.F);
                        if (abs > this.D && abs > abs2) {
                            this.f14729z = true;
                            P(true);
                            float f7 = this.G;
                            this.E = x7 - f7 > 0.0f ? f7 + this.D : f7 - this.D;
                            this.F = y7;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f14729z) {
                    z6 = false | I(motionEvent.getX(motionEvent.findPointerIndex(this.I)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.E = motionEvent.getX(actionIndex);
                    this.I = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    E(motionEvent);
                    this.E = motionEvent.getX(motionEvent.findPointerIndex(this.I));
                }
            } else if (this.f14729z) {
                R(this.f14707g, true, 0, false);
                z6 = Q();
            }
        } else if (this.f14729z) {
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int xVelocity = (int) velocityTracker.getXVelocity(this.I);
            this.f14727x = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f x8 = x();
            float f8 = clientWidth;
            U(k(x8.f14734b, ((scrollX / f8) - x8.f14737e) / (x8.f14736d + (this.f14717n / f8)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.I)) - this.G)), true, true, xVelocity);
            z6 = Q();
        }
        if (z6) {
            u1.n1(this);
        }
        return true;
    }

    public final void p(boolean z6) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setLayerType(z6 ? this.f14704e0 : 0, null);
        }
    }

    public final void q() {
        this.f14729z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
    }

    public void r() {
        if (!this.O) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f14705f != null) {
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int xVelocity = (int) velocityTracker.getXVelocity(this.I);
            this.f14727x = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f x6 = x();
            U(k(x6.f14734b, ((scrollX / clientWidth) - x6.f14737e) / x6.f14736d, xVelocity, (int) (this.E - this.G)), true, true, xVelocity);
        }
        q();
        this.O = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f14725v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public boolean s(@o0 KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? F() : d(17);
            } else if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? G() : d(66);
            } else if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return d(1);
                }
            }
        }
        return false;
    }

    public void setAdapter(@q0 p3.a aVar) {
        p3.a aVar2 = this.f14705f;
        if (aVar2 != null) {
            aVar2.r(null);
            this.f14705f.t(this);
            for (int i7 = 0; i7 < this.f14699c.size(); i7++) {
                f fVar = this.f14699c.get(i7);
                this.f14705f.b(this, fVar.f14734b, fVar.f14733a);
            }
            this.f14705f.d(this);
            this.f14699c.clear();
            M();
            this.f14707g = 0;
            scrollTo(0, 0);
        }
        p3.a aVar3 = this.f14705f;
        this.f14705f = aVar;
        this.f14697b = 0;
        if (aVar != null) {
            if (this.f14716m == null) {
                this.f14716m = new l();
            }
            this.f14705f.r(this.f14716m);
            this.f14727x = false;
            boolean z6 = this.S;
            this.S = true;
            this.f14697b = this.f14705f.e();
            if (this.f14709h >= 0) {
                this.f14705f.n(this.f14711i, this.f14713j);
                T(this.f14709h, false, true);
                this.f14709h = -1;
                this.f14711i = null;
                this.f14713j = null;
            } else if (z6) {
                requestLayout();
            } else {
                J();
            }
        }
        List<i> list = this.f14700c0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f14700c0.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f14700c0.get(i8).onAdapterChanged(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i7) {
        this.f14727x = false;
        T(i7, !this.S, false);
    }

    public void setOffscreenPageLimit(int i7) {
        if (i7 < 1) {
            Log.w(f14679j0, "Requested offscreen page limit " + i7 + " too small; defaulting to 1");
            i7 = 1;
        }
        if (i7 != this.f14728y) {
            this.f14728y = i7;
            J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f14696a0 = jVar;
    }

    public void setPageMargin(int i7) {
        int i8 = this.f14717n;
        this.f14717n = i7;
        int width = getWidth();
        L(width, width, i7, i8);
        requestLayout();
    }

    public void setPageMarginDrawable(@q0 Drawable drawable) {
        this.f14718o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i7) {
        if (this.f14712i0 == i7) {
            return;
        }
        this.f14712i0 = i7;
        if (this.f14702d0 != null) {
            p(i7 != 0);
        }
        n(i7);
    }

    public void t(float f7) {
        if (!this.O) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f14705f == null) {
            return;
        }
        this.E += f7;
        float scrollX = getScrollX() - f7;
        float clientWidth = getClientWidth();
        float f8 = this.f14721r * clientWidth;
        float f9 = this.f14722s * clientWidth;
        f fVar = this.f14699c.get(0);
        f fVar2 = this.f14699c.get(r4.size() - 1);
        if (fVar.f14734b != 0) {
            f8 = fVar.f14737e * clientWidth;
        }
        if (fVar2.f14734b != this.f14705f.e() - 1) {
            f9 = fVar2.f14737e * clientWidth;
        }
        if (scrollX < f8) {
            scrollX = f8;
        } else if (scrollX > f9) {
            scrollX = f9;
        }
        int i7 = (int) scrollX;
        this.E += scrollX - i7;
        scrollTo(i7, getScrollY());
        H(i7);
        MotionEvent obtain = MotionEvent.obtain(this.P, SystemClock.uptimeMillis(), 2, this.E, 0.0f, 0);
        this.J.addMovement(obtain);
        obtain.recycle();
    }

    public final Rect u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public f v(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return w(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14718o;
    }

    public f w(View view) {
        for (int i7 = 0; i7 < this.f14699c.size(); i7++) {
            f fVar = this.f14699c.get(i7);
            if (this.f14705f.k(view, fVar.f14733a)) {
                return fVar;
            }
        }
        return null;
    }

    public final f x() {
        int i7;
        int clientWidth = getClientWidth();
        float f7 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f8 = clientWidth > 0 ? this.f14717n / clientWidth : 0.0f;
        int i8 = 0;
        boolean z6 = true;
        f fVar = null;
        int i9 = -1;
        float f9 = 0.0f;
        while (i8 < this.f14699c.size()) {
            f fVar2 = this.f14699c.get(i8);
            if (!z6 && fVar2.f14734b != (i7 = i9 + 1)) {
                fVar2 = this.f14701d;
                fVar2.f14737e = f7 + f9 + f8;
                fVar2.f14734b = i7;
                fVar2.f14736d = this.f14705f.h(i7);
                i8--;
            }
            f fVar3 = fVar2;
            f7 = fVar3.f14737e;
            float f10 = fVar3.f14736d + f7 + f8;
            if (!z6 && scrollX < f7) {
                return fVar;
            }
            if (scrollX < f10 || i8 == this.f14699c.size() - 1) {
                return fVar3;
            }
            int i10 = fVar3.f14734b;
            float f11 = fVar3.f14736d;
            i8++;
            z6 = false;
            i9 = i10;
            f9 = f11;
            fVar = fVar3;
        }
        return fVar;
    }

    public f y(int i7) {
        for (int i8 = 0; i8 < this.f14699c.size(); i8++) {
            f fVar = this.f14699c.get(i8);
            if (fVar.f14734b == i7) {
                return fVar;
            }
        }
        return null;
    }

    public void z() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f14714k = new Scroller(context, f14689t0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
        this.K = (int) (400.0f * f7);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new EdgeEffect(context);
        this.R = new EdgeEffect(context);
        this.M = (int) (25.0f * f7);
        this.N = (int) (2.0f * f7);
        this.B = (int) (f7 * 16.0f);
        u1.B1(this, new h());
        if (u1.V(this) == 0) {
            u1.R1(this, 1);
        }
        u1.a2(this, new C0209d());
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f14738a;

        /* renamed from: b  reason: collision with root package name */
        public int f14739b;

        /* renamed from: c  reason: collision with root package name */
        public float f14740c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f14741d;

        /* renamed from: e  reason: collision with root package name */
        public int f14742e;

        /* renamed from: f  reason: collision with root package name */
        public int f14743f;

        public g() {
            super(-1, -1);
            this.f14740c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14740c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f14687r0);
            this.f14739b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(@v int i7) {
        setPageMarginDrawable(k0.d.i(getContext(), i7));
    }

    public d(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14699c = new ArrayList<>();
        this.f14701d = new f();
        this.f14703e = new Rect();
        this.f14709h = -1;
        this.f14711i = null;
        this.f14713j = null;
        this.f14721r = -3.4028235E38f;
        this.f14722s = Float.MAX_VALUE;
        this.f14728y = 1;
        this.I = -1;
        this.S = true;
        this.T = false;
        this.f14710h0 = new c();
        this.f14712i0 = 0;
        z();
    }
}
