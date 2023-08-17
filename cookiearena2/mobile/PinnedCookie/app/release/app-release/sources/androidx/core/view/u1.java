package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.g3;
import androidx.core.view.h4;
import androidx.core.view.u1;
import d.b1;
import f0.a;
import h1.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class u1 {
    public static final int A = 1;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 16;
    public static final int G = 32;
    public static Field I = null;
    public static boolean J = false;
    public static Field K = null;
    public static boolean L = false;
    public static Method M = null;
    public static Method N = null;
    public static boolean O = false;
    public static WeakHashMap<View, String> P = null;
    public static Method R = null;
    public static Field S = null;
    public static ThreadLocal<Rect> U = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3797a = "ViewCompat";
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final int f3798b = 0;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f3799c = 1;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final int f3800d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f3801e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f3802f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f3803g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f3804h = 4;

    /* renamed from: i  reason: collision with root package name */
    public static final int f3805i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f3806j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f3807k = 2;
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public static final int f3808l = 0;
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    public static final int f3809m = 1;
    @Deprecated

    /* renamed from: n  reason: collision with root package name */
    public static final int f3810n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f3811o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f3812p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f3813q = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f3814r = 3;
    @Deprecated

    /* renamed from: s  reason: collision with root package name */
    public static final int f3815s = 16777215;
    @Deprecated

    /* renamed from: t  reason: collision with root package name */
    public static final int f3816t = -16777216;
    @Deprecated

    /* renamed from: u  reason: collision with root package name */
    public static final int f3817u = 16;
    @Deprecated

    /* renamed from: v  reason: collision with root package name */
    public static final int f3818v = 16777216;

    /* renamed from: w  reason: collision with root package name */
    public static final int f3819w = 0;

    /* renamed from: x  reason: collision with root package name */
    public static final int f3820x = 1;

    /* renamed from: y  reason: collision with root package name */
    public static final int f3821y = 2;

    /* renamed from: z  reason: collision with root package name */
    public static final int f3822z = 0;
    public static final AtomicInteger H = new AtomicInteger(1);
    public static WeakHashMap<View, z2> Q = null;
    public static boolean T = false;
    public static final int[] V = {a.e.f9689b, a.e.f9691c, a.e.f9713n, a.e.f9731y, a.e.B, a.e.C, a.e.D, a.e.E, a.e.F, a.e.G, a.e.f9693d, a.e.f9695e, a.e.f9697f, a.e.f9699g, a.e.f9701h, a.e.f9703i, a.e.f9705j, a.e.f9707k, a.e.f9709l, a.e.f9711m, a.e.f9715o, a.e.f9717p, a.e.f9719q, a.e.f9721r, a.e.f9723s, a.e.f9725t, a.e.f9727u, a.e.f9728v, a.e.f9729w, a.e.f9730x, a.e.f9732z, a.e.A};
    public static final m1 W = new m1() { // from class: androidx.core.view.t1
        @Override // androidx.core.view.m1
        public final k onReceiveContent(k kVar) {
            k c12;
            c12 = u1.c1(kVar);
            return c12;
        }
    };
    public static final e X = new e();

    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        public a(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        @Override // androidx.core.view.u1.f
        @d.w0(28)
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public Boolean d(@d.o0 View view) {
            return Boolean.valueOf(q.d(view));
        }

        @Override // androidx.core.view.u1.f
        @d.w0(28)
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public void e(@d.o0 View view, Boolean bool) {
            q.i(view, bool.booleanValue());
        }

        @Override // androidx.core.view.u1.f
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a0 {
    }

    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        public b(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        @Override // androidx.core.view.u1.f
        @d.w0(28)
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return q.b(view);
        }

        @Override // androidx.core.view.u1.f
        @d.w0(28)
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        @Override // androidx.core.view.u1.f
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b0 {
    }

    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        public c(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        @Override // androidx.core.view.u1.f
        @d.w0(30)
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return s.a(view);
        }

        @Override // androidx.core.view.u1.f
        @d.w0(30)
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            s.c(view, charSequence);
        }

        @Override // androidx.core.view.u1.f
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public static class c0 {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f3823d = new ArrayList<>();
        @d.q0

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f3824a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f3825b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f3826c = null;

        public static c0 a(View view) {
            c0 c0Var = (c0) view.getTag(a.e.f9714n0);
            if (c0Var == null) {
                c0 c0Var2 = new c0();
                view.setTag(a.e.f9714n0, c0Var2);
                return c0Var2;
            }
            return c0Var;
        }

        public static void h(View view) {
            ArrayList<WeakReference<View>> arrayList = f3823d;
            synchronized (arrayList) {
                Iterator<WeakReference<View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                f3823d.add(new WeakReference<>(view));
            }
        }

        public static void i(View view) {
            synchronized (f3823d) {
                int i7 = 0;
                while (true) {
                    ArrayList<WeakReference<View>> arrayList = f3823d;
                    if (i7 >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i7).get() == view) {
                        arrayList.remove(i7);
                        return;
                    }
                    i7++;
                }
            }
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c7 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c7 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c7));
                }
            }
            return c7 != null;
        }

        @d.q0
        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3824a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c7 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c7 != null) {
                            return c7;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.f3825b == null) {
                this.f3825b = new SparseArray<>();
            }
            return this.f3825b;
        }

        public final boolean e(@d.o0 View view, @d.o0 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.e.f9716o0);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((z) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f3826c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                this.f3826c = new WeakReference<>(keyEvent);
                SparseArray<WeakReference<View>> d7 = d();
                if (keyEvent.getAction() != 1 || (indexOfKey = d7.indexOfKey(keyEvent.getKeyCode())) < 0) {
                    weakReference = null;
                } else {
                    weakReference = d7.valueAt(indexOfKey);
                    d7.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = d7.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view = weakReference.get();
                    if (view != null && u1.O0(view)) {
                        e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3824a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f3823d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f3824a == null) {
                    this.f3824a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f3823d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f3824a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f3824a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        public d(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        @Override // androidx.core.view.u1.f
        @d.w0(28)
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        @Override // androidx.core.view.u1.f
        @d.w0(28)
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.u1.f
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f3827b = new WeakHashMap<>();

        @d.w0(19)
        public void a(View view) {
            this.f3827b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        @d.w0(19)
        public final void b(View view, boolean z6) {
            boolean z7 = view.isShown() && view.getWindowVisibility() == 0;
            if (z6 != z7) {
                u1.d1(view, z7 ? 16 : 32);
                this.f3827b.put(view, Boolean.valueOf(z7));
            }
        }

        @d.w0(19)
        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @d.w0(19)
        public void d(View view) {
            this.f3827b.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @d.w0(19)
        public final void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @d.w0(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f3827b.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @d.w0(19)
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f3828a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f3829b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3830c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3831d;

        public f(int i7, Class<T> cls, int i8) {
            this(i7, cls, 0, i8);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return true;
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= this.f3830c;
        }

        public abstract T d(View view);

        public abstract void e(View view, T t6);

        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (b()) {
                T t6 = (T) view.getTag(this.f3828a);
                if (this.f3829b.isInstance(t6)) {
                    return t6;
                }
                return null;
            }
            return null;
        }

        public void g(View view, T t6) {
            if (c()) {
                e(view, t6);
            } else if (b() && h(f(view), t6)) {
                u1.C(view);
                view.setTag(this.f3828a, t6);
                u1.d1(view, this.f3831d);
            }
        }

        public boolean h(T t6, T t7) {
            return !t7.equals(t6);
        }

        public f(int i7, Class<T> cls, int i8, int i9) {
            this.f3828a = i7;
            this.f3829b = cls;
            this.f3831d = i8;
            this.f3830c = i9;
        }
    }

    @d.w0(15)
    /* loaded from: classes.dex */
    public static class g {
        private g() {
        }

        @d.u
        public static boolean a(@d.o0 View view) {
            return view.hasOnClickListeners();
        }
    }

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class h {
        private h() {
        }

        @d.u
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @d.u
        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        @d.u
        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        @d.u
        public static int d(View view) {
            return view.getMinimumHeight();
        }

        @d.u
        public static int e(View view) {
            return view.getMinimumWidth();
        }

        @d.u
        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        @d.u
        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @d.u
        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        @d.u
        public static boolean i(View view) {
            return view.hasTransientState();
        }

        @d.u
        public static boolean j(View view, int i7, Bundle bundle) {
            return view.performAccessibilityAction(i7, bundle);
        }

        @d.u
        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        @d.u
        public static void l(View view, int i7, int i8, int i9, int i10) {
            view.postInvalidateOnAnimation(i7, i8, i9, i10);
        }

        @d.u
        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @d.u
        public static void n(View view, Runnable runnable, long j7) {
            view.postOnAnimationDelayed(runnable, j7);
        }

        @d.u
        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @d.u
        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        @d.u
        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @d.u
        public static void r(View view, boolean z6) {
            view.setHasTransientState(z6);
        }

        @d.u
        public static void s(View view, int i7) {
            view.setImportantForAccessibility(i7);
        }
    }

    @d.w0(17)
    /* loaded from: classes.dex */
    public static class i {
        private i() {
        }

        @d.u
        public static int a() {
            return View.generateViewId();
        }

        @d.u
        public static Display b(@d.o0 View view) {
            return view.getDisplay();
        }

        @d.u
        public static int c(View view) {
            return view.getLabelFor();
        }

        @d.u
        public static int d(View view) {
            return view.getLayoutDirection();
        }

        @d.u
        public static int e(View view) {
            return view.getPaddingEnd();
        }

        @d.u
        public static int f(View view) {
            return view.getPaddingStart();
        }

        @d.u
        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        @d.u
        public static void h(View view, int i7) {
            view.setLabelFor(i7);
        }

        @d.u
        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @d.u
        public static void j(View view, int i7) {
            view.setLayoutDirection(i7);
        }

        @d.u
        public static void k(View view, int i7, int i8, int i9, int i10) {
            view.setPaddingRelative(i7, i8, i9, i10);
        }
    }

    @d.w0(18)
    /* loaded from: classes.dex */
    public static class j {
        private j() {
        }

        @d.u
        public static Rect a(@d.o0 View view) {
            return view.getClipBounds();
        }

        @d.u
        public static boolean b(@d.o0 View view) {
            return view.isInLayout();
        }

        @d.u
        public static void c(@d.o0 View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class k {
        private k() {
        }

        @d.u
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @d.u
        public static boolean b(@d.o0 View view) {
            return view.isAttachedToWindow();
        }

        @d.u
        public static boolean c(@d.o0 View view) {
            return view.isLaidOut();
        }

        @d.u
        public static boolean d(@d.o0 View view) {
            return view.isLayoutDirectionResolved();
        }

        @d.u
        public static void e(ViewParent viewParent, View view, View view2, int i7) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i7);
        }

        @d.u
        public static void f(View view, int i7) {
            view.setAccessibilityLiveRegion(i7);
        }

        @d.u
        public static void g(AccessibilityEvent accessibilityEvent, int i7) {
            accessibilityEvent.setContentChangeTypes(i7);
        }
    }

    @d.w0(20)
    /* loaded from: classes.dex */
    public static class l {
        private l() {
        }

        @d.u
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @d.u
        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @d.u
        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class m {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public h4 f3832a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f3833b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ k1 f3834c;

            public a(View view, k1 k1Var) {
                this.f3833b = view;
                this.f3834c = k1Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                h4 L = h4.L(windowInsets, view);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 30) {
                    m.a(windowInsets, this.f3833b);
                    if (L.equals(this.f3832a)) {
                        return this.f3834c.onApplyWindowInsets(view, L).J();
                    }
                }
                this.f3832a = L;
                h4 onApplyWindowInsets = this.f3834c.onApplyWindowInsets(view, L);
                if (i7 >= 30) {
                    return onApplyWindowInsets.J();
                }
                u1.v1(view);
                return onApplyWindowInsets.J();
            }
        }

        private m() {
        }

        @d.u
        public static void a(@d.o0 WindowInsets windowInsets, @d.o0 View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(a.e.f9718p0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @d.u
        public static h4 b(@d.o0 View view, @d.o0 h4 h4Var, @d.o0 Rect rect) {
            WindowInsets J = h4Var.J();
            if (J != null) {
                return h4.L(view.computeSystemWindowInsets(J, rect), view);
            }
            rect.setEmpty();
            return h4Var;
        }

        @d.u
        public static boolean c(@d.o0 View view, float f7, float f8, boolean z6) {
            return view.dispatchNestedFling(f7, f8, z6);
        }

        @d.u
        public static boolean d(@d.o0 View view, float f7, float f8) {
            return view.dispatchNestedPreFling(f7, f8);
        }

        @d.u
        public static boolean e(View view, int i7, int i8, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i7, i8, iArr, iArr2);
        }

        @d.u
        public static boolean f(View view, int i7, int i8, int i9, int i10, int[] iArr) {
            return view.dispatchNestedScroll(i7, i8, i9, i10, iArr);
        }

        @d.u
        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        @d.u
        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        @d.u
        public static float i(View view) {
            return view.getElevation();
        }

        @d.u
        @d.q0
        public static h4 j(@d.o0 View view) {
            return h4.a.a(view);
        }

        @d.u
        public static String k(View view) {
            return view.getTransitionName();
        }

        @d.u
        public static float l(View view) {
            return view.getTranslationZ();
        }

        @d.u
        public static float m(@d.o0 View view) {
            return view.getZ();
        }

        @d.u
        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        @d.u
        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        @d.u
        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @d.u
        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @d.u
        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @d.u
        public static void s(View view, float f7) {
            view.setElevation(f7);
        }

        @d.u
        public static void t(View view, boolean z6) {
            view.setNestedScrollingEnabled(z6);
        }

        @d.u
        public static void u(@d.o0 View view, @d.q0 k1 k1Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(a.e.f9702h0, k1Var);
            }
            if (k1Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(a.e.f9718p0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, k1Var));
            }
        }

        @d.u
        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        @d.u
        public static void w(View view, float f7) {
            view.setTranslationZ(f7);
        }

        @d.u
        public static void x(@d.o0 View view, float f7) {
            view.setZ(f7);
        }

        @d.u
        public static boolean y(View view, int i7) {
            return view.startNestedScroll(i7);
        }

        @d.u
        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class n {
        private n() {
        }

        @d.q0
        public static h4 a(@d.o0 View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            h4 K = h4.K(rootWindowInsets);
            K.H(K);
            K.d(view.getRootView());
            return K;
        }

        @d.u
        public static int b(@d.o0 View view) {
            return view.getScrollIndicators();
        }

        @d.u
        public static void c(@d.o0 View view, int i7) {
            view.setScrollIndicators(i7);
        }

        @d.u
        public static void d(@d.o0 View view, int i7, int i8) {
            view.setScrollIndicators(i7, i8);
        }
    }

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class o {
        private o() {
        }

        @d.u
        public static void a(@d.o0 View view) {
            view.cancelDragAndDrop();
        }

        @d.u
        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @d.u
        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @d.u
        public static void d(@d.o0 View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @d.u
        public static boolean e(@d.o0 View view, @d.q0 ClipData clipData, @d.o0 View.DragShadowBuilder dragShadowBuilder, @d.q0 Object obj, int i7) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i7);
        }

        @d.u
        public static void f(@d.o0 View view, @d.o0 View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class p {
        private p() {
        }

        @d.u
        public static void a(@d.o0 View view, Collection<View> collection, int i7) {
            view.addKeyboardNavigationClusters(collection, i7);
        }

        @d.u
        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        @d.u
        public static int c(@d.o0 View view) {
            return view.getNextClusterForwardId();
        }

        @d.u
        public static boolean d(@d.o0 View view) {
            return view.hasExplicitFocusable();
        }

        @d.u
        public static boolean e(@d.o0 View view) {
            return view.isFocusedByDefault();
        }

        @d.u
        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        @d.u
        public static boolean g(@d.o0 View view) {
            return view.isKeyboardNavigationCluster();
        }

        @d.u
        public static View h(@d.o0 View view, View view2, int i7) {
            return view.keyboardNavigationClusterSearch(view2, i7);
        }

        @d.u
        public static boolean i(@d.o0 View view) {
            return view.restoreDefaultFocus();
        }

        @d.u
        public static void j(@d.o0 View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @d.u
        public static void k(@d.o0 View view, boolean z6) {
            view.setFocusedByDefault(z6);
        }

        @d.u
        public static void l(View view, int i7) {
            view.setImportantForAutofill(i7);
        }

        @d.u
        public static void m(@d.o0 View view, boolean z6) {
            view.setKeyboardNavigationCluster(z6);
        }

        @d.u
        public static void n(View view, int i7) {
            view.setNextClusterForwardId(i7);
        }

        @d.u
        public static void o(@d.o0 View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class q {
        private q() {
        }

        @d.u
        public static void a(@d.o0 View view, @d.o0 final z zVar) {
            androidx.collection.m mVar = (androidx.collection.m) view.getTag(a.e.f9716o0);
            if (mVar == null) {
                mVar = new androidx.collection.m();
                view.setTag(a.e.f9716o0, mVar);
            }
            Objects.requireNonNull(zVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.f2
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return u1.z.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            mVar.put(zVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @d.u
        public static CharSequence b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        @d.u
        public static boolean c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        @d.u
        public static boolean d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        @d.u
        public static void e(@d.o0 View view, @d.o0 z zVar) {
            View.OnUnhandledKeyEventListener a7;
            androidx.collection.m mVar = (androidx.collection.m) view.getTag(a.e.f9716o0);
            if (mVar == null || (a7 = b2.a(mVar.get(zVar))) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(a7);
        }

        @d.u
        public static <T> T f(View view, int i7) {
            View requireViewById;
            requireViewById = view.requireViewById(i7);
            return (T) requireViewById;
        }

        @d.u
        public static void g(View view, boolean z6) {
            view.setAccessibilityHeading(z6);
        }

        @d.u
        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @d.u
        public static void i(View view, boolean z6) {
            view.setScreenReaderFocusable(z6);
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class r {
        private r() {
        }

        @d.u
        public static View.AccessibilityDelegate a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        @d.u
        public static List<Rect> b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        @d.u
        public static void c(@d.o0 View view, @d.o0 Context context, @d.o0 int[] iArr, @d.q0 AttributeSet attributeSet, @d.o0 TypedArray typedArray, int i7, int i8) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i7, i8);
        }

        @d.u
        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class s {
        private s() {
        }

        @d.u
        public static CharSequence a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        @d.q0
        public static o5 b(@d.o0 View view) {
            WindowInsetsController windowInsetsController;
            windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return o5.l(windowInsetsController);
            }
            return null;
        }

        @d.u
        public static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @d.w0(31)
    /* loaded from: classes.dex */
    public static final class t {
        private t() {
        }

        @d.u
        @d.q0
        public static String[] a(@d.o0 View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        @d.u
        @d.q0
        public static androidx.core.view.k b(@d.o0 View view, @d.o0 androidx.core.view.k kVar) {
            ContentInfo performReceiveContent;
            ContentInfo l7 = kVar.l();
            performReceiveContent = view.performReceiveContent(l7);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == l7 ? kVar : androidx.core.view.k.m(performReceiveContent);
        }

        @d.u
        public static void c(@d.o0 View view, @d.q0 String[] strArr, @d.q0 l1 l1Var) {
            if (l1Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new y(l1Var));
            }
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface u {
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface v {
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface w {
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface x {
    }

    @d.w0(31)
    /* loaded from: classes.dex */
    public static final class y implements OnReceiveContentListener {
        @d.o0

        /* renamed from: a  reason: collision with root package name */
        public final l1 f3835a;

        public y(@d.o0 l1 l1Var) {
            this.f3835a = l1Var;
        }

        @Override // android.view.OnReceiveContentListener
        @d.q0
        public ContentInfo onReceiveContent(@d.o0 View view, @d.o0 ContentInfo contentInfo) {
            androidx.core.view.k m7 = androidx.core.view.k.m(contentInfo);
            androidx.core.view.k a7 = this.f3835a.a(view, m7);
            if (a7 == null) {
                return null;
            }
            return a7 == m7 ? contentInfo : a7.l();
        }
    }

    /* loaded from: classes.dex */
    public interface z {
        boolean onUnhandledKeyEvent(@d.o0 View view, @d.o0 KeyEvent keyEvent);
    }

    @Deprecated
    public u1() {
    }

    @d.k1
    public static boolean A(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c0.a(view).f(keyEvent);
    }

    public static float A0(@d.o0 View view) {
        return m.l(view);
    }

    public static f<Boolean> A1() {
        return new a(a.e.f9708k0, Boolean.class, 28);
    }

    @Deprecated
    public static void A2(View view, float f7) {
        view.setY(f7);
    }

    public static void B(@d.o0 View view) {
        C(view);
    }

    @d.q0
    @Deprecated
    public static o5 B0(@d.o0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return s.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return d3.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void B1(@d.o0 View view, @d.q0 androidx.core.view.a aVar) {
        if (aVar == null && (F(view) instanceof a.C0034a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.getBridge());
    }

    public static void B2(@d.o0 View view, float f7) {
        m.x(view, f7);
    }

    public static void C(@d.o0 View view) {
        androidx.core.view.a E2 = E(view);
        if (E2 == null) {
            E2 = new androidx.core.view.a();
        }
        B1(view, E2);
    }

    @Deprecated
    public static int C0(@d.o0 View view) {
        return h.g(view);
    }

    @d.k1
    public static void C1(@d.o0 View view, boolean z6) {
        b().g(view, Boolean.valueOf(z6));
    }

    public static boolean C2(@d.o0 View view, @d.q0 ClipData clipData, @d.o0 View.DragShadowBuilder dragShadowBuilder, @d.q0 Object obj, int i7) {
        return o.e(view, clipData, dragShadowBuilder, obj, i7);
    }

    public static int D() {
        return i.a();
    }

    @Deprecated
    public static float D0(View view) {
        return view.getX();
    }

    public static void D1(@d.o0 View view, int i7) {
        k.f(view, i7);
    }

    public static boolean D2(@d.o0 View view, int i7) {
        return m.y(view, i7);
    }

    @d.q0
    public static androidx.core.view.a E(@d.o0 View view) {
        View.AccessibilityDelegate F2 = F(view);
        if (F2 == null) {
            return null;
        }
        return F2 instanceof a.C0034a ? ((a.C0034a) F2).f3520a : new androidx.core.view.a(F2);
    }

    @Deprecated
    public static float E0(View view) {
        return view.getY();
    }

    @d.k1
    public static void E1(@d.o0 View view, @d.q0 CharSequence charSequence) {
        k1().g(view, charSequence);
        if (charSequence != null) {
            X.a(view);
        } else {
            X.d(view);
        }
    }

    public static boolean E2(@d.o0 View view, int i7, int i8) {
        if (view instanceof c1) {
            return ((c1) view).startNestedScroll(i7, i8);
        }
        if (i8 == 0) {
            return D2(view, i7);
        }
        return false;
    }

    @d.q0
    public static View.AccessibilityDelegate F(@d.o0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? r.a(view) : G(view);
    }

    public static float F0(@d.o0 View view) {
        return m.m(view);
    }

    @Deprecated
    public static void F1(View view, boolean z6) {
        view.setActivated(z6);
    }

    public static f<CharSequence> F2() {
        return new c(a.e.f9710l0, CharSequence.class, 64, 30);
    }

    @d.q0
    public static View.AccessibilityDelegate G(@d.o0 View view) {
        if (T) {
            return null;
        }
        if (S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                T = true;
                return null;
            }
        }
        try {
            Object obj = S.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            T = true;
            return null;
        }
    }

    public static boolean G0(@d.o0 View view) {
        return F(view) != null;
    }

    @Deprecated
    public static void G1(View view, @d.x(from = 0.0d, to = 1.0d) float f7) {
        view.setAlpha(f7);
    }

    public static void G2(@d.o0 View view) {
        m.z(view);
    }

    public static int H(@d.o0 View view) {
        return k.a(view);
    }

    public static boolean H0(@d.o0 View view) {
        return p.d(view);
    }

    public static void H1(@d.o0 View view, @d.q0 String... strArr) {
        p.j(view, strArr);
    }

    public static void H2(@d.o0 View view, int i7) {
        if (view instanceof c1) {
            ((c1) view).stopNestedScroll(i7);
        } else if (i7 == 0) {
            G2(view);
        }
    }

    @d.q0
    public static h1.o0 I(@d.o0 View view) {
        AccessibilityNodeProvider a7 = h.a(view);
        if (a7 != null) {
            return new h1.o0(a7);
        }
        return null;
    }

    public static boolean I0(@d.o0 View view) {
        return m.n(view);
    }

    public static void I1(@d.o0 View view, @d.q0 Drawable drawable) {
        h.q(view, drawable);
    }

    public static void I2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @d.q0
    @d.k1
    public static CharSequence J(@d.o0 View view) {
        return k1().f(view);
    }

    public static boolean J0(@d.o0 View view, int i7) {
        if (view instanceof c1) {
            ((c1) view).hasNestedScrollingParent(i7);
            return false;
        } else if (i7 == 0) {
            return I0(view);
        } else {
            return false;
        }
    }

    public static void J1(@d.o0 View view, @d.q0 ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    public static void J2(@d.o0 View view, @d.o0 View.DragShadowBuilder dragShadowBuilder) {
        o.f(view, dragShadowBuilder);
    }

    public static List<f0.a> K(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(a.e.f9694d0);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(a.e.f9694d0, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static boolean K0(@d.o0 View view) {
        return g.a(view);
    }

    public static void K1(@d.o0 View view, @d.q0 PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    @Deprecated
    public static float L(View view) {
        return view.getAlpha();
    }

    public static boolean L0(@d.o0 View view) {
        return h.h(view);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void L1(ViewGroup viewGroup, boolean z6) {
        if (R == null) {
            try {
                R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e7) {
                Log.e(f3797a, "Unable to find childrenDrawingOrderEnabled", e7);
            }
            R.setAccessible(true);
        }
        try {
            R.invoke(viewGroup, Boolean.valueOf(z6));
        } catch (IllegalAccessException e8) {
            Log.e(f3797a, "Unable to invoke childrenDrawingOrderEnabled", e8);
        } catch (IllegalArgumentException e9) {
            Log.e(f3797a, "Unable to invoke childrenDrawingOrderEnabled", e9);
        } catch (InvocationTargetException e10) {
            Log.e(f3797a, "Unable to invoke childrenDrawingOrderEnabled", e10);
        }
    }

    public static int M(View view, @d.o0 CharSequence charSequence) {
        List<f0.a> K2 = K(view);
        for (int i7 = 0; i7 < K2.size(); i7++) {
            if (TextUtils.equals(charSequence, K2.get(i7).c())) {
                return K2.get(i7).b();
            }
        }
        int i8 = -1;
        int i9 = 0;
        while (true) {
            int[] iArr = V;
            if (i9 >= iArr.length || i8 != -1) {
                break;
            }
            int i10 = iArr[i9];
            boolean z6 = true;
            for (int i11 = 0; i11 < K2.size(); i11++) {
                z6 &= K2.get(i11).b() != i10;
            }
            if (z6) {
                i8 = i10;
            }
            i9++;
        }
        return i8;
    }

    public static boolean M0(@d.o0 View view) {
        return h.i(view);
    }

    public static void M1(@d.o0 View view, @d.q0 Rect rect) {
        j.c(view, rect);
    }

    @d.q0
    public static ColorStateList N(@d.o0 View view) {
        return m.g(view);
    }

    @d.k1
    public static boolean N0(@d.o0 View view) {
        Boolean f7 = b().f(view);
        return f7 != null && f7.booleanValue();
    }

    public static void N1(@d.o0 View view, float f7) {
        m.s(view, f7);
    }

    @d.q0
    public static PorterDuff.Mode O(@d.o0 View view) {
        return m.h(view);
    }

    public static boolean O0(@d.o0 View view) {
        return k.b(view);
    }

    @Deprecated
    public static void O1(View view, boolean z6) {
        view.setFitsSystemWindows(z6);
    }

    @d.q0
    public static Rect P(@d.o0 View view) {
        return j.a(view);
    }

    public static boolean P0(@d.o0 View view) {
        return p.e(view);
    }

    public static void P1(@d.o0 View view, boolean z6) {
        p.k(view, z6);
    }

    @d.q0
    public static Display Q(@d.o0 View view) {
        return i.b(view);
    }

    public static boolean Q0(@d.o0 View view) {
        return m.o(view);
    }

    public static void Q1(@d.o0 View view, boolean z6) {
        h.r(view, z6);
    }

    public static float R(@d.o0 View view) {
        return m.i(view);
    }

    public static boolean R0(@d.o0 View view) {
        return p.f(view);
    }

    @d.k1
    public static void R1(@d.o0 View view, int i7) {
        h.s(view, i7);
    }

    public static Rect S() {
        if (U == null) {
            U = new ThreadLocal<>();
        }
        Rect rect = U.get();
        if (rect == null) {
            rect = new Rect();
            U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean S0(@d.o0 View view) {
        return j.b(view);
    }

    public static void S1(@d.o0 View view, int i7) {
        p.l(view, i7);
    }

    public static m1 T(@d.o0 View view) {
        return view instanceof m1 ? (m1) view : W;
    }

    public static boolean T0(@d.o0 View view) {
        return p.g(view);
    }

    public static void T1(@d.o0 View view, boolean z6) {
        p.m(view, z6);
    }

    public static boolean U(@d.o0 View view) {
        return h.b(view);
    }

    public static boolean U0(@d.o0 View view) {
        return k.c(view);
    }

    public static void U1(@d.o0 View view, @d.d0 int i7) {
        i.h(view, i7);
    }

    public static int V(@d.o0 View view) {
        return h.c(view);
    }

    public static boolean V0(@d.o0 View view) {
        return k.d(view);
    }

    public static void V1(@d.o0 View view, @d.q0 Paint paint) {
        i.i(view, paint);
    }

    @SuppressLint({"InlinedApi"})
    public static int W(@d.o0 View view) {
        return p.b(view);
    }

    public static boolean W0(@d.o0 View view) {
        return m.p(view);
    }

    @Deprecated
    public static void W1(View view, int i7, Paint paint) {
        view.setLayerType(i7, paint);
    }

    public static int X(@d.o0 View view) {
        return i.c(view);
    }

    @Deprecated
    public static boolean X0(View view) {
        return view.isOpaque();
    }

    public static void X1(@d.o0 View view, int i7) {
        i.j(view, i7);
    }

    @Deprecated
    public static int Y(View view) {
        return view.getLayerType();
    }

    public static boolean Y0(@d.o0 View view) {
        return i.g(view);
    }

    public static void Y1(@d.o0 View view, boolean z6) {
        m.t(view, z6);
    }

    public static int Z(@d.o0 View view) {
        return i.d(view);
    }

    @d.k1
    public static boolean Z0(@d.o0 View view) {
        Boolean f7 = A1().f(view);
        return f7 != null && f7.booleanValue();
    }

    public static void Z1(@d.o0 View view, int i7) {
        p.n(view, i7);
    }

    @d.q0
    @Deprecated
    public static Matrix a0(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static void a1(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void a2(@d.o0 View view, @d.q0 k1 k1Var) {
        m.u(view, k1Var);
    }

    public static f<Boolean> b() {
        return new d(a.e.f9698f0, Boolean.class, 28);
    }

    @Deprecated
    public static int b0(View view) {
        return view.getMeasuredHeightAndState();
    }

    @d.q0
    public static View b1(@d.o0 View view, @d.q0 View view2, int i7) {
        return p.h(view, view2, i7);
    }

    public static void b2(@d.o0 View view, @d.q0 String[] strArr, @d.q0 l1 l1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            t.c(view, strArr, l1Var);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z6 = false;
        if (l1Var != null) {
            g1.s.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                } else if (strArr[i7].startsWith("*")) {
                    z6 = true;
                    break;
                } else {
                    i7++;
                }
            }
            g1.s.b(!z6, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(a.e.f9706j0, strArr);
        view.setTag(a.e.f9704i0, l1Var);
    }

    public static int c(@d.o0 View view, @d.o0 CharSequence charSequence, @d.o0 h1.q0 q0Var) {
        int M2 = M(view, charSequence);
        if (M2 != -1) {
            d(view, new f0.a(M2, charSequence, q0Var));
        }
        return M2;
    }

    @Deprecated
    public static int c0(View view) {
        return view.getMeasuredState();
    }

    public static /* synthetic */ androidx.core.view.k c1(androidx.core.view.k kVar) {
        return kVar;
    }

    @Deprecated
    public static void c2(View view, int i7) {
        view.setOverScrollMode(i7);
    }

    public static void d(@d.o0 View view, @d.o0 f0.a aVar) {
        C(view);
        s1(aVar.b(), view);
        K(view).add(aVar);
        d1(view, 0);
    }

    @Deprecated
    public static int d0(View view) {
        return view.getMeasuredWidthAndState();
    }

    @d.w0(19)
    public static void d1(View view, int i7) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z6 = J(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (H(view) != 0 || z6) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z6 ? 32 : 2048);
                k.g(obtain, i7);
                if (z6) {
                    obtain.getText().add(J(view));
                    x2(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i7 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i7);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(J(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i7);
                } catch (AbstractMethodError e7) {
                    Log.e(f3797a, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e7);
                }
            }
        }
    }

    public static void d2(@d.o0 View view, @d.u0 int i7, @d.u0 int i8, @d.u0 int i9, @d.u0 int i10) {
        i.k(view, i7, i8, i9, i10);
    }

    public static void e(@d.o0 View view, @d.o0 Collection<View> collection, int i7) {
        p.a(view, collection, i7);
    }

    public static int e0(@d.o0 View view) {
        return h.d(view);
    }

    public static void e1(@d.o0 View view, int i7) {
        view.offsetLeftAndRight(i7);
    }

    @Deprecated
    public static void e2(View view, float f7) {
        view.setPivotX(f7);
    }

    public static void f(@d.o0 View view, @d.o0 z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            q.a(view, zVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(a.e.f9716o0);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(a.e.f9716o0, arrayList);
        }
        arrayList.add(zVar);
        if (arrayList.size() == 1) {
            c0.h(view);
        }
    }

    public static int f0(@d.o0 View view) {
        return h.e(view);
    }

    public static void f1(@d.o0 View view, int i7) {
        view.offsetTopAndBottom(i7);
    }

    @Deprecated
    public static void f2(View view, float f7) {
        view.setPivotY(f7);
    }

    @d.o0
    public static z2 g(@d.o0 View view) {
        if (Q == null) {
            Q = new WeakHashMap<>();
        }
        z2 z2Var = Q.get(view);
        if (z2Var == null) {
            z2 z2Var2 = new z2(view);
            Q.put(view, z2Var2);
            return z2Var2;
        }
        return z2Var;
    }

    public static int g0(@d.o0 View view) {
        return p.c(view);
    }

    @d.o0
    public static h4 g1(@d.o0 View view, @d.o0 h4 h4Var) {
        WindowInsets J2 = h4Var.J();
        if (J2 != null) {
            WindowInsets b7 = l.b(view, J2);
            if (!b7.equals(J2)) {
                return h4.L(b7, view);
            }
        }
        return h4Var;
    }

    public static void g2(@d.o0 View view, @d.q0 o1 o1Var) {
        o.d(view, (PointerIcon) (o1Var != null ? o1Var.b() : null));
    }

    public static void h() {
        try {
            M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e7) {
            Log.e(f3797a, "Couldn't find method", e7);
        }
        O = true;
    }

    @d.q0
    public static String[] h0(@d.o0 View view) {
        return Build.VERSION.SDK_INT >= 31 ? t.a(view) : (String[]) view.getTag(a.e.f9706j0);
    }

    @Deprecated
    public static void h1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void h2(View view, float f7) {
        view.setRotation(f7);
    }

    @Deprecated
    public static boolean i(View view, int i7) {
        return view.canScrollHorizontally(i7);
    }

    @Deprecated
    public static int i0(View view) {
        return view.getOverScrollMode();
    }

    public static void i1(@d.o0 View view, @d.o0 h1.f0 f0Var) {
        view.onInitializeAccessibilityNodeInfo(f0Var.f2());
    }

    @Deprecated
    public static void i2(View view, float f7) {
        view.setRotationX(f7);
    }

    @Deprecated
    public static boolean j(View view, int i7) {
        return view.canScrollVertically(i7);
    }

    @d.u0
    public static int j0(@d.o0 View view) {
        return i.e(view);
    }

    @Deprecated
    public static void j1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void j2(View view, float f7) {
        view.setRotationY(f7);
    }

    public static void k(@d.o0 View view) {
        o.a(view);
    }

    @d.u0
    public static int k0(@d.o0 View view) {
        return i.f(view);
    }

    public static f<CharSequence> k1() {
        return new b(a.e.f9700g0, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static void k2(View view, boolean z6) {
        view.setSaveFromParentEnabled(z6);
    }

    @Deprecated
    public static int l(int i7, int i8) {
        return View.combineMeasuredStates(i7, i8);
    }

    @d.q0
    public static ViewParent l0(@d.o0 View view) {
        return h.f(view);
    }

    public static boolean l1(@d.o0 View view, int i7, @d.q0 Bundle bundle) {
        return h.j(view, i7, bundle);
    }

    @Deprecated
    public static void l2(View view, float f7) {
        view.setScaleX(f7);
    }

    public static void m(View view, int i7) {
        view.offsetLeftAndRight(i7);
        if (view.getVisibility() == 0) {
            I2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                I2((View) parent);
            }
        }
    }

    @Deprecated
    public static float m0(View view) {
        return view.getPivotX();
    }

    @d.q0
    public static androidx.core.view.k m1(@d.o0 View view, @d.o0 androidx.core.view.k kVar) {
        if (Log.isLoggable(f3797a, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(kVar);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, kVar);
        }
        l1 l1Var = (l1) view.getTag(a.e.f9704i0);
        if (l1Var != null) {
            androidx.core.view.k a7 = l1Var.a(view, kVar);
            if (a7 == null) {
                return null;
            }
            return T(view).onReceiveContent(a7);
        }
        return T(view).onReceiveContent(kVar);
    }

    @Deprecated
    public static void m2(View view, float f7) {
        view.setScaleY(f7);
    }

    public static void n(View view, int i7) {
        view.offsetTopAndBottom(i7);
        if (view.getVisibility() == 0) {
            I2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                I2((View) parent);
            }
        }
    }

    @Deprecated
    public static float n0(View view) {
        return view.getPivotY();
    }

    public static void n1(@d.o0 View view) {
        h.k(view);
    }

    @d.k1
    public static void n2(@d.o0 View view, boolean z6) {
        A1().g(view, Boolean.valueOf(z6));
    }

    @d.o0
    public static h4 o(@d.o0 View view, @d.o0 h4 h4Var, @d.o0 Rect rect) {
        return m.b(view, h4Var, rect);
    }

    @d.q0
    public static h4 o0(@d.o0 View view) {
        return n.a(view);
    }

    public static void o1(@d.o0 View view, int i7, int i8, int i9, int i10) {
        h.l(view, i7, i8, i9, i10);
    }

    public static void o2(@d.o0 View view, int i7) {
        n.c(view, i7);
    }

    @d.o0
    public static h4 p(@d.o0 View view, @d.o0 h4 h4Var) {
        WindowInsets J2 = h4Var.J();
        if (J2 != null) {
            WindowInsets a7 = l.a(view, J2);
            if (!a7.equals(J2)) {
                return h4.L(a7, view);
            }
        }
        return h4Var;
    }

    @Deprecated
    public static float p0(View view) {
        return view.getRotation();
    }

    public static void p1(@d.o0 View view, @d.o0 Runnable runnable) {
        h.m(view, runnable);
    }

    public static void p2(@d.o0 View view, int i7, int i8) {
        n.d(view, i7, i8);
    }

    public static void q(@d.o0 View view) {
        o.b(view);
    }

    @Deprecated
    public static float q0(View view) {
        return view.getRotationX();
    }

    @SuppressLint({"LambdaLast"})
    public static void q1(@d.o0 View view, @d.o0 Runnable runnable, long j7) {
        h.n(view, runnable, j7);
    }

    @d.k1
    public static void q2(@d.o0 View view, @d.q0 CharSequence charSequence) {
        F2().g(view, charSequence);
    }

    public static boolean r(@d.o0 View view, float f7, float f8, boolean z6) {
        return m.c(view, f7, f8, z6);
    }

    @Deprecated
    public static float r0(View view) {
        return view.getRotationY();
    }

    public static void r1(@d.o0 View view, int i7) {
        s1(i7, view);
        d1(view, 0);
    }

    public static void r2(@d.o0 View view, @d.o0 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.d(view, list);
        }
    }

    public static boolean s(@d.o0 View view, float f7, float f8) {
        return m.d(view, f7, f8);
    }

    @Deprecated
    public static float s0(View view) {
        return view.getScaleX();
    }

    public static void s1(int i7, View view) {
        List<f0.a> K2 = K(view);
        for (int i8 = 0; i8 < K2.size(); i8++) {
            if (K2.get(i8).b() == i7) {
                K2.remove(i8);
                return;
            }
        }
    }

    public static void s2(@d.o0 View view, @d.q0 CharSequence charSequence) {
        p.o(view, charSequence);
    }

    public static boolean t(@d.o0 View view, int i7, int i8, @d.q0 int[] iArr, @d.q0 int[] iArr2) {
        return m.e(view, i7, i8, iArr, iArr2);
    }

    @Deprecated
    public static float t0(View view) {
        return view.getScaleY();
    }

    public static void t1(@d.o0 View view, @d.o0 z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            q.e(view, zVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(a.e.f9716o0);
        if (arrayList != null) {
            arrayList.remove(zVar);
            if (arrayList.size() == 0) {
                c0.i(view);
            }
        }
    }

    public static void t2(@d.o0 View view, @d.q0 String str) {
        m.v(view, str);
    }

    public static boolean u(@d.o0 View view, int i7, int i8, @d.q0 int[] iArr, @d.q0 int[] iArr2, int i9) {
        if (view instanceof c1) {
            return ((c1) view).dispatchNestedPreScroll(i7, i8, iArr, iArr2, i9);
        }
        if (i9 == 0) {
            return t(view, i7, i8, iArr, iArr2);
        }
        return false;
    }

    public static int u0(@d.o0 View view) {
        return n.b(view);
    }

    public static void u1(@d.o0 View view, @d.o0 f0.a aVar, @d.q0 CharSequence charSequence, @d.q0 h1.q0 q0Var) {
        if (q0Var == null && charSequence == null) {
            r1(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, q0Var));
        }
    }

    @Deprecated
    public static void u2(View view, float f7) {
        view.setTranslationX(f7);
    }

    public static void v(@d.o0 View view, int i7, int i8, int i9, int i10, @d.q0 int[] iArr, int i11, @d.o0 int[] iArr2) {
        if (view instanceof d1) {
            ((d1) view).dispatchNestedScroll(i7, i8, i9, i10, iArr, i11, iArr2);
        } else {
            x(view, i7, i8, i9, i10, iArr, i11);
        }
    }

    @d.q0
    @d.k1
    public static CharSequence v0(@d.o0 View view) {
        return F2().f(view);
    }

    public static void v1(@d.o0 View view) {
        l.c(view);
    }

    @Deprecated
    public static void v2(View view, float f7) {
        view.setTranslationY(f7);
    }

    public static boolean w(@d.o0 View view, int i7, int i8, int i9, int i10, @d.q0 int[] iArr) {
        return m.f(view, i7, i8, i9, i10, iArr);
    }

    @d.o0
    public static List<Rect> w0(@d.o0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? r.b(view) : Collections.emptyList();
    }

    @d.o0
    public static <T extends View> T w1(@d.o0 View view, @d.d0 int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) q.f(view, i7);
        }
        T t6 = (T) view.findViewById(i7);
        if (t6 != null) {
            return t6;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void w2(@d.o0 View view, float f7) {
        m.w(view, f7);
    }

    public static boolean x(@d.o0 View view, int i7, int i8, int i9, int i10, @d.q0 int[] iArr, int i11) {
        if (view instanceof c1) {
            return ((c1) view).dispatchNestedScroll(i7, i8, i9, i10, iArr, i11);
        }
        if (i11 == 0) {
            return w(view, i7, i8, i9, i10, iArr);
        }
        return false;
    }

    @d.q0
    public static String x0(@d.o0 View view) {
        return m.k(view);
    }

    @Deprecated
    public static int x1(int i7, int i8, int i9) {
        return View.resolveSizeAndState(i7, i8, i9);
    }

    public static void x2(View view) {
        if (V(view) == 0) {
            R1(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (V((View) parent) == 4) {
                R1(view, 2);
                return;
            }
        }
    }

    public static void y(@d.o0 View view) {
        o.c(view);
    }

    @Deprecated
    public static float y0(View view) {
        return view.getTranslationX();
    }

    public static boolean y1(@d.o0 View view) {
        return p.i(view);
    }

    public static void y2(@d.o0 View view, @d.q0 g3.b bVar) {
        g3.h(view, bVar);
    }

    @d.k1
    public static boolean z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c0.a(view).b(view, keyEvent);
    }

    @Deprecated
    public static float z0(View view) {
        return view.getTranslationY();
    }

    public static void z1(@d.o0 View view, @SuppressLint({"ContextFirst"}) @d.o0 Context context, @d.o0 int[] iArr, @d.q0 AttributeSet attributeSet, @d.o0 TypedArray typedArray, int i7, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.c(view, context, iArr, attributeSet, typedArray, i7, i8);
        }
    }

    @Deprecated
    public static void z2(View view, float f7) {
        view.setX(f7);
    }
}
