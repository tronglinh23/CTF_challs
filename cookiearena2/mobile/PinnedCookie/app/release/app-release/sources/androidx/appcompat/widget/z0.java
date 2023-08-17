package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import d.b1;
import f.a;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class z0 implements androidx.appcompat.view.menu.q {
    public static final String H = "ListPopupWindow";
    public static final boolean I = false;
    public static final int J = 250;
    public static Method K = null;
    public static Method L = null;
    public static Method M = null;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = -1;
    public static final int Q = -2;
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = 2;
    public final f A;
    public Runnable B;
    public final Handler C;
    public final Rect D;
    public Rect E;
    public boolean F;
    public PopupWindow G;

    /* renamed from: b  reason: collision with root package name */
    public Context f1846b;

    /* renamed from: c  reason: collision with root package name */
    public ListAdapter f1847c;

    /* renamed from: d  reason: collision with root package name */
    public s0 f1848d;

    /* renamed from: e  reason: collision with root package name */
    public int f1849e;

    /* renamed from: f  reason: collision with root package name */
    public int f1850f;

    /* renamed from: g  reason: collision with root package name */
    public int f1851g;

    /* renamed from: h  reason: collision with root package name */
    public int f1852h;

    /* renamed from: i  reason: collision with root package name */
    public int f1853i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1854j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1855k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1856l;

    /* renamed from: m  reason: collision with root package name */
    public int f1857m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1858n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1859o;

    /* renamed from: p  reason: collision with root package name */
    public int f1860p;

    /* renamed from: q  reason: collision with root package name */
    public View f1861q;

    /* renamed from: r  reason: collision with root package name */
    public int f1862r;

    /* renamed from: s  reason: collision with root package name */
    public DataSetObserver f1863s;

    /* renamed from: t  reason: collision with root package name */
    public View f1864t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f1865u;

    /* renamed from: v  reason: collision with root package name */
    public AdapterView.OnItemClickListener f1866v;

    /* renamed from: w  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f1867w;

    /* renamed from: x  reason: collision with root package name */
    public final j f1868x;

    /* renamed from: y  reason: collision with root package name */
    public final i f1869y;

    /* renamed from: z  reason: collision with root package name */
    public final h f1870z;

    /* loaded from: classes.dex */
    public class a extends x0 {
        public a(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.x0
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public z0 b() {
            return z0.this;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t6 = z0.this.t();
            if (t6 == null || t6.getWindowToken() == null) {
                return;
            }
            z0.this.show();
        }
    }

    /* loaded from: classes.dex */
    public class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i7, long j7) {
            s0 s0Var;
            if (i7 == -1 || (s0Var = z0.this.f1848d) == null) {
                return;
            }
            s0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static int a(PopupWindow popupWindow, View view, int i7, boolean z6) {
            return popupWindow.getMaxAvailableHeight(view, i7, z6);
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @d.u
        public static void b(PopupWindow popupWindow, boolean z6) {
            popupWindow.setIsClippedToScreen(z6);
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z0.this.q();
        }
    }

    /* loaded from: classes.dex */
    public class g extends DataSetObserver {
        public g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (z0.this.a()) {
                z0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            z0.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class h implements AbsListView.OnScrollListener {
        public h() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i7, int i8, int i9) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i7) {
            if (i7 != 1 || z0.this.I() || z0.this.G.getContentView() == null) {
                return;
            }
            z0 z0Var = z0.this;
            z0Var.C.removeCallbacks(z0Var.f1868x);
            z0.this.f1868x.run();
        }
    }

    /* loaded from: classes.dex */
    public class i implements View.OnTouchListener {
        public i() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = z0.this.G) != null && popupWindow.isShowing() && x6 >= 0 && x6 < z0.this.G.getWidth() && y6 >= 0 && y6 < z0.this.G.getHeight()) {
                z0 z0Var = z0.this;
                z0Var.C.postDelayed(z0Var.f1868x, 250L);
                return false;
            } else if (action == 1) {
                z0 z0Var2 = z0.this;
                z0Var2.C.removeCallbacks(z0Var2.f1868x);
                return false;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s0 s0Var = z0.this.f1848d;
            if (s0Var == null || !androidx.core.view.u1.O0(s0Var) || z0.this.f1848d.getCount() <= z0.this.f1848d.getChildCount()) {
                return;
            }
            int childCount = z0.this.f1848d.getChildCount();
            z0 z0Var = z0.this;
            if (childCount <= z0Var.f1860p) {
                z0Var.G.setInputMethodMode(2);
                z0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                K = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(H, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(H, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public z0(@d.o0 Context context) {
        this(context, null, a.b.Z1);
    }

    public static boolean G(int i7) {
        return i7 == 66 || i7 == 23;
    }

    @d.q0
    public Object A() {
        if (a()) {
            return this.f1848d.getSelectedItem();
        }
        return null;
    }

    public long B() {
        if (a()) {
            return this.f1848d.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int C() {
        if (a()) {
            return this.f1848d.getSelectedItemPosition();
        }
        return -1;
    }

    @d.q0
    public View D() {
        if (a()) {
            return this.f1848d.getSelectedView();
        }
        return null;
    }

    public int E() {
        return this.G.getSoftInputMode();
    }

    public int F() {
        return this.f1850f;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean H() {
        return this.f1858n;
    }

    public boolean I() {
        return this.G.getInputMethodMode() == 2;
    }

    public boolean J() {
        return this.F;
    }

    public boolean K(int i7, @d.o0 KeyEvent keyEvent) {
        int i8;
        int i9;
        if (a() && i7 != 62 && (this.f1848d.getSelectedItemPosition() >= 0 || !G(i7))) {
            int selectedItemPosition = this.f1848d.getSelectedItemPosition();
            boolean z6 = !this.G.isAboveAnchor();
            ListAdapter listAdapter = this.f1847c;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                i8 = areAllItemsEnabled ? 0 : this.f1848d.d(0, true);
                i9 = areAllItemsEnabled ? listAdapter.getCount() - 1 : this.f1848d.d(listAdapter.getCount() - 1, false);
            } else {
                i8 = Integer.MAX_VALUE;
                i9 = Integer.MIN_VALUE;
            }
            if ((z6 && i7 == 19 && selectedItemPosition <= i8) || (!z6 && i7 == 20 && selectedItemPosition >= i9)) {
                q();
                this.G.setInputMethodMode(1);
                show();
                return true;
            }
            this.f1848d.setListSelectionHidden(false);
            if (this.f1848d.onKeyDown(i7, keyEvent)) {
                this.G.setInputMethodMode(2);
                this.f1848d.requestFocusFromTouch();
                show();
                if (i7 == 19 || i7 == 20 || i7 == 23 || i7 == 66) {
                    return true;
                }
            } else if (z6 && i7 == 20) {
                if (selectedItemPosition == i9) {
                    return true;
                }
            } else if (!z6 && i7 == 19 && selectedItemPosition == i8) {
                return true;
            }
        }
        return false;
    }

    public boolean L(int i7, @d.o0 KeyEvent keyEvent) {
        if (i7 == 4 && a()) {
            View view = this.f1864t;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
                    return false;
                }
                dismiss();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean M(int i7, @d.o0 KeyEvent keyEvent) {
        if (!a() || this.f1848d.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.f1848d.onKeyUp(i7, keyEvent);
        if (onKeyUp && G(i7)) {
            dismiss();
        }
        return onKeyUp;
    }

    public boolean N(int i7) {
        if (a()) {
            if (this.f1866v != null) {
                s0 s0Var = this.f1848d;
                this.f1866v.onItemClick(s0Var, s0Var.getChildAt(i7 - s0Var.getFirstVisiblePosition()), i7, s0Var.getAdapter().getItemId(i7));
                return true;
            }
            return true;
        }
        return false;
    }

    public void O() {
        this.C.post(this.B);
    }

    public final void P() {
        View view = this.f1861q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1861q);
            }
        }
    }

    public void Q(@d.q0 View view) {
        this.f1864t = view;
    }

    public void R(@d.g1 int i7) {
        this.G.setAnimationStyle(i7);
    }

    public void S(int i7) {
        Drawable background = this.G.getBackground();
        if (background == null) {
            l0(i7);
            return;
        }
        background.getPadding(this.D);
        Rect rect = this.D;
        this.f1850f = rect.left + rect.right + i7;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void T(boolean z6) {
        this.f1858n = z6;
    }

    public void U(int i7) {
        this.f1857m = i7;
    }

    public void V(@d.q0 Rect rect) {
        this.E = rect != null ? new Rect(rect) : null;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void W(boolean z6) {
        this.f1859o = z6;
    }

    public void X(int i7) {
        if (i7 < 0 && -2 != i7 && -1 != i7) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f1849e = i7;
    }

    public void Y(int i7) {
        this.G.setInputMethodMode(i7);
    }

    public void Z(int i7) {
        this.f1860p = i7;
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean a() {
        return this.G.isShowing();
    }

    public void a0(Drawable drawable) {
        this.f1865u = drawable;
    }

    public int b() {
        return this.f1851g;
    }

    public void b0(boolean z6) {
        this.F = z6;
        this.G.setFocusable(z6);
    }

    public void c0(@d.q0 PopupWindow.OnDismissListener onDismissListener) {
        this.G.setOnDismissListener(onDismissListener);
    }

    public void d0(@d.q0 AdapterView.OnItemClickListener onItemClickListener) {
        this.f1866v = onItemClickListener;
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        this.G.dismiss();
        P();
        this.G.setContentView(null);
        this.f1848d = null;
        this.C.removeCallbacks(this.f1868x);
    }

    @d.q0
    public Drawable e() {
        return this.G.getBackground();
    }

    public void e0(@d.q0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1867w = onItemSelectedListener;
    }

    @Override // androidx.appcompat.view.menu.q
    @d.q0
    public ListView f() {
        return this.f1848d;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void f0(boolean z6) {
        this.f1856l = true;
        this.f1855k = z6;
    }

    public final void g0(boolean z6) {
        if (Build.VERSION.SDK_INT > 28) {
            e.b(this.G, z6);
            return;
        }
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(z6));
            } catch (Exception unused) {
                Log.i(H, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void h(int i7) {
        this.f1852h = i7;
        this.f1854j = true;
    }

    public void h0(int i7) {
        this.f1862r = i7;
    }

    public void i0(@d.q0 View view) {
        boolean a7 = a();
        if (a7) {
            P();
        }
        this.f1861q = view;
        if (a7) {
            show();
        }
    }

    public void j(int i7) {
        this.f1851g = i7;
    }

    public void j0(int i7) {
        s0 s0Var = this.f1848d;
        if (!a() || s0Var == null) {
            return;
        }
        s0Var.setListSelectionHidden(false);
        s0Var.setSelection(i7);
        if (s0Var.getChoiceMode() != 0) {
            s0Var.setItemChecked(i7, true);
        }
    }

    public void k0(int i7) {
        this.G.setSoftInputMode(i7);
    }

    public int l() {
        if (this.f1854j) {
            return this.f1852h;
        }
        return 0;
    }

    public void l0(int i7) {
        this.f1850f = i7;
    }

    public void m0(int i7) {
        this.f1853i = i7;
    }

    public void o(@d.q0 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1863s;
        if (dataSetObserver == null) {
            this.f1863s = new g();
        } else {
            ListAdapter listAdapter2 = this.f1847c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1847c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1863s);
        }
        s0 s0Var = this.f1848d;
        if (s0Var != null) {
            s0Var.setAdapter(this.f1847c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p() {
        int i7;
        int i8;
        int makeMeasureSpec;
        int i9;
        if (this.f1848d == null) {
            Context context = this.f1846b;
            this.B = new b();
            s0 s6 = s(context, !this.F);
            this.f1848d = s6;
            Drawable drawable = this.f1865u;
            if (drawable != null) {
                s6.setSelector(drawable);
            }
            this.f1848d.setAdapter(this.f1847c);
            this.f1848d.setOnItemClickListener(this.f1866v);
            this.f1848d.setFocusable(true);
            this.f1848d.setFocusableInTouchMode(true);
            this.f1848d.setOnItemSelectedListener(new c());
            this.f1848d.setOnScrollListener(this.f1870z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1867w;
            if (onItemSelectedListener != null) {
                this.f1848d.setOnItemSelectedListener(onItemSelectedListener);
            }
            s0 s0Var = this.f1848d;
            View view = this.f1861q;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i10 = this.f1862r;
                if (i10 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(s0Var, layoutParams);
                } else if (i10 != 1) {
                    Log.e(H, "Invalid hint position " + this.f1862r);
                } else {
                    linearLayout.addView(s0Var, layoutParams);
                    linearLayout.addView(view);
                }
                int i11 = this.f1850f;
                if (i11 >= 0) {
                    i9 = Integer.MIN_VALUE;
                } else {
                    i11 = 0;
                    i9 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i11, i9), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i7 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                s0Var = linearLayout;
            } else {
                i7 = 0;
            }
            this.G.setContentView(s0Var);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.G.getContentView();
            View view2 = this.f1861q;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i7 = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i7 = 0;
            }
        }
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            Rect rect = this.D;
            int i12 = rect.top;
            i8 = rect.bottom + i12;
            if (!this.f1854j) {
                this.f1852h = -i12;
            }
        } else {
            this.D.setEmpty();
            i8 = 0;
        }
        int y6 = y(t(), this.f1852h, this.G.getInputMethodMode() == 2);
        if (this.f1858n || this.f1849e == -1) {
            return y6 + i8;
        }
        int i13 = this.f1850f;
        if (i13 == -2) {
            int i14 = this.f1846b.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.D;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i13 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else {
            int i15 = this.f1846b.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.D;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - (rect3.left + rect3.right), 1073741824);
        }
        int e7 = this.f1848d.e(makeMeasureSpec, 0, -1, y6 - i7, -1);
        if (e7 > 0) {
            i7 += i8 + this.f1848d.getPaddingTop() + this.f1848d.getPaddingBottom();
        }
        return e7 + i7;
    }

    public void q() {
        s0 s0Var = this.f1848d;
        if (s0Var != null) {
            s0Var.setListSelectionHidden(true);
            s0Var.requestLayout();
        }
    }

    public View.OnTouchListener r(View view) {
        return new a(view);
    }

    @d.o0
    public s0 s(Context context, boolean z6) {
        return new s0(context, z6);
    }

    public void setBackgroundDrawable(@d.q0 Drawable drawable) {
        this.G.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.q
    public void show() {
        int p6 = p();
        boolean I2 = I();
        k1.t.d(this.G, this.f1853i);
        if (this.G.isShowing()) {
            if (androidx.core.view.u1.O0(t())) {
                int i7 = this.f1850f;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = t().getWidth();
                }
                int i8 = this.f1849e;
                if (i8 == -1) {
                    if (!I2) {
                        p6 = -1;
                    }
                    if (I2) {
                        this.G.setWidth(this.f1850f == -1 ? -1 : 0);
                        this.G.setHeight(0);
                    } else {
                        this.G.setWidth(this.f1850f == -1 ? -1 : 0);
                        this.G.setHeight(-1);
                    }
                } else if (i8 != -2) {
                    p6 = i8;
                }
                this.G.setOutsideTouchable((this.f1859o || this.f1858n) ? false : true);
                this.G.update(t(), this.f1851g, this.f1852h, i7 < 0 ? -1 : i7, p6 < 0 ? -1 : p6);
                return;
            }
            return;
        }
        int i9 = this.f1850f;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = t().getWidth();
        }
        int i10 = this.f1849e;
        if (i10 == -1) {
            p6 = -1;
        } else if (i10 != -2) {
            p6 = i10;
        }
        this.G.setWidth(i9);
        this.G.setHeight(p6);
        g0(true);
        this.G.setOutsideTouchable((this.f1859o || this.f1858n) ? false : true);
        this.G.setTouchInterceptor(this.f1869y);
        if (this.f1856l) {
            k1.t.c(this.G, this.f1855k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = M;
            if (method != null) {
                try {
                    method.invoke(this.G, this.E);
                } catch (Exception e7) {
                    Log.e(H, "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            e.a(this.G, this.E);
        }
        k1.t.e(this.G, t(), this.f1851g, this.f1852h, this.f1857m);
        this.f1848d.setSelection(-1);
        if (!this.F || this.f1848d.isInTouchMode()) {
            q();
        }
        if (this.F) {
            return;
        }
        this.C.post(this.A);
    }

    @d.q0
    public View t() {
        return this.f1864t;
    }

    @d.g1
    public int u() {
        return this.G.getAnimationStyle();
    }

    @d.q0
    public Rect v() {
        if (this.E != null) {
            return new Rect(this.E);
        }
        return null;
    }

    public int w() {
        return this.f1849e;
    }

    public int x() {
        return this.G.getInputMethodMode();
    }

    public final int y(View view, int i7, boolean z6) {
        return d.a(this.G, view, i7, z6);
    }

    public int z() {
        return this.f1862r;
    }

    public z0(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.Z1);
    }

    public z0(@d.o0 Context context, @d.q0 AttributeSet attributeSet, @d.f int i7) {
        this(context, attributeSet, i7, 0);
    }

    public z0(@d.o0 Context context, @d.q0 AttributeSet attributeSet, @d.f int i7, @d.g1 int i8) {
        this.f1849e = -2;
        this.f1850f = -2;
        this.f1853i = androidx.core.view.o1.f3749e;
        this.f1857m = 0;
        this.f1858n = false;
        this.f1859o = false;
        this.f1860p = Integer.MAX_VALUE;
        this.f1862r = 0;
        this.f1868x = new j();
        this.f1869y = new i();
        this.f1870z = new h();
        this.A = new f();
        this.D = new Rect();
        this.f1846b = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.f9433a4, i7, i8);
        this.f1851g = obtainStyledAttributes.getDimensionPixelOffset(a.m.f9441b4, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(a.m.f9449c4, 0);
        this.f1852h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1854j = true;
        }
        obtainStyledAttributes.recycle();
        u uVar = new u(context, attributeSet, i7, i8);
        this.G = uVar;
        uVar.setInputMethodMode(1);
    }
}
