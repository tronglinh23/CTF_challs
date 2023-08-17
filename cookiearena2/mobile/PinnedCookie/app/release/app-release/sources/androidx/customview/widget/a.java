package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.n;
import androidx.core.view.u1;
import androidx.customview.widget.b;
import d.q0;
import h1.f0;
import h1.o0;
import h1.p0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final b.a<f0> NODE_ADAPTER = new C0038a();
    private static final b.InterfaceC0039b<n<f0>, f0> SPARSE_VALUES_ADAPTER = new b();
    private final View mHost;
    private final AccessibilityManager mManager;
    private c mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* renamed from: androidx.customview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0038a implements b.a<f0> {
        @Override // androidx.customview.widget.b.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(f0 f0Var, Rect rect) {
            f0Var.s(rect);
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0039b<n<f0>, f0> {
        @Override // androidx.customview.widget.b.InterfaceC0039b
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public f0 a(n<f0> nVar, int i7) {
            return nVar.F(i7);
        }

        @Override // androidx.customview.widget.b.InterfaceC0039b
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public int b(n<f0> nVar) {
            return nVar.E();
        }
    }

    /* loaded from: classes.dex */
    public class c extends o0 {
        public c() {
        }

        @Override // h1.o0
        public f0 b(int i7) {
            return f0.K0(a.this.obtainAccessibilityNodeInfo(i7));
        }

        @Override // h1.o0
        public f0 d(int i7) {
            int i8 = i7 == 2 ? a.this.mAccessibilityFocusedVirtualViewId : a.this.mKeyboardFocusedVirtualViewId;
            if (i8 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i8);
        }

        @Override // h1.o0
        public boolean f(int i7, int i8, Bundle bundle) {
            return a.this.performAction(i7, i8, bundle);
        }
    }

    public a(@d.o0 View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (u1.V(view) == 0) {
            u1.R1(view, 1);
        }
    }

    public static Rect l(@d.o0 View view, int i7, @d.o0 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i7 == 17) {
            rect.set(width, 0, width, height);
        } else if (i7 == 33) {
            rect.set(0, height, width, height);
        } else if (i7 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    public static int n(int i7) {
        if (i7 != 19) {
            if (i7 != 21) {
                return i7 != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    public final boolean c(int i7) {
        if (this.mAccessibilityFocusedVirtualViewId == i7) {
            this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.mHost.invalidate();
            sendEventForVirtualView(i7, 65536);
            return true;
        }
        return false;
    }

    public final boolean clearKeyboardFocusForVirtualView(int i7) {
        if (this.mKeyboardFocusedVirtualViewId != i7) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i7, false);
        sendEventForVirtualView(i7, 8);
        return true;
    }

    public final boolean d() {
        int i7 = this.mKeyboardFocusedVirtualViewId;
        return i7 != Integer.MIN_VALUE && onPerformActionForVirtualView(i7, 16, null);
    }

    public final boolean dispatchHoverEvent(@d.o0 MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                s(virtualViewAt);
                return virtualViewAt != Integer.MIN_VALUE;
            } else if (action == 10 && this.mHoveredVirtualViewId != Integer.MIN_VALUE) {
                s(Integer.MIN_VALUE);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean dispatchKeyEvent(@d.o0 KeyEvent keyEvent) {
        int i7 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return o(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return o(1, null);
                }
                return false;
            }
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (keyEvent.hasNoModifiers()) {
                            int n7 = n(keyCode);
                            int repeatCount = keyEvent.getRepeatCount() + 1;
                            boolean z6 = false;
                            while (i7 < repeatCount && o(n7, null)) {
                                i7++;
                                z6 = true;
                            }
                            return z6;
                        }
                        return false;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                d();
                return true;
            }
            return false;
        }
        return false;
    }

    public final AccessibilityEvent e(int i7, int i8) {
        return i7 != -1 ? f(i7, i8) : g(i8);
    }

    public final AccessibilityEvent f(int i7, int i8) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i8);
        f0 obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i7);
        obtain.getText().add(obtainAccessibilityNodeInfo.W());
        obtain.setContentDescription(obtainAccessibilityNodeInfo.A());
        obtain.setScrollable(obtainAccessibilityNodeInfo.B0());
        obtain.setPassword(obtainAccessibilityNodeInfo.z0());
        obtain.setEnabled(obtainAccessibilityNodeInfo.s0());
        obtain.setChecked(obtainAccessibilityNodeInfo.m0());
        onPopulateEventForVirtualView(i7, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(obtainAccessibilityNodeInfo.w());
        p0.Y(obtain, this.mHost, i7);
        obtain.setPackageName(this.mHost.getContext().getPackageName());
        return obtain;
    }

    public final AccessibilityEvent g(int i7) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i7);
        this.mHost.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.a
    public o0 getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new c();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f7, float f8);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    @d.o0
    public final f0 h(int i7) {
        f0 H0 = f0.H0();
        H0.l1(true);
        H0.n1(true);
        H0.b1(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        H0.W0(rect);
        H0.X0(rect);
        H0.F1(this.mHost);
        onPopulateNodeForVirtualView(i7, H0);
        if (H0.W() == null && H0.A() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        H0.s(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int p6 = H0.p();
        if ((p6 & 64) == 0) {
            if ((p6 & 128) == 0) {
                H0.D1(this.mHost.getContext().getPackageName());
                H0.Q1(this.mHost, i7);
                if (this.mAccessibilityFocusedVirtualViewId == i7) {
                    H0.T0(true);
                    H0.a(128);
                } else {
                    H0.T0(false);
                    H0.a(64);
                }
                boolean z6 = this.mKeyboardFocusedVirtualViewId == i7;
                if (z6) {
                    H0.a(2);
                } else if (H0.t0()) {
                    H0.a(1);
                }
                H0.o1(z6);
                this.mHost.getLocationOnScreen(this.mTempGlobalRect);
                H0.t(this.mTempScreenRect);
                if (this.mTempScreenRect.equals(rect)) {
                    H0.s(this.mTempScreenRect);
                    if (H0.f10205b != -1) {
                        f0 H02 = f0.H0();
                        for (int i8 = H0.f10205b; i8 != -1; i8 = H02.f10205b) {
                            H02.G1(this.mHost, -1);
                            H02.W0(INVALID_PARENT_BOUNDS);
                            onPopulateNodeForVirtualView(i8, H02);
                            H02.s(this.mTempParentRect);
                            Rect rect2 = this.mTempScreenRect;
                            Rect rect3 = this.mTempParentRect;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        H02.N0();
                    }
                    this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                }
                if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
                    this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                    if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                        H0.X0(this.mTempScreenRect);
                        if (m(this.mTempScreenRect)) {
                            H0.e2(true);
                        }
                    }
                }
                return H0;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    @d.o0
    public final f0 i() {
        f0 I0 = f0.I0(this.mHost);
        u1.i1(this.mHost, I0);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (I0.v() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                I0.d(this.mHost, ((Integer) arrayList.get(i7)).intValue());
            }
            return I0;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i7) {
        invalidateVirtualView(i7, 0);
    }

    public final n<f0> j() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        n<f0> nVar = new n<>();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            nVar.u(arrayList.get(i7).intValue(), h(arrayList.get(i7).intValue()));
        }
        return nVar;
    }

    public final void k(int i7, Rect rect) {
        obtainAccessibilityNodeInfo(i7).s(rect);
    }

    public final boolean m(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean o(int i7, @q0 Rect rect) {
        f0 f0Var;
        n<f0> j7 = j();
        int i8 = this.mKeyboardFocusedVirtualViewId;
        f0 o6 = i8 == Integer.MIN_VALUE ? null : j7.o(i8);
        if (i7 == 1 || i7 == 2) {
            f0Var = (f0) androidx.customview.widget.b.d(j7, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, o6, i7, u1.Z(this.mHost) == 1, false);
        } else if (i7 != 17 && i7 != 33 && i7 != 66 && i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i9 = this.mKeyboardFocusedVirtualViewId;
            if (i9 != Integer.MIN_VALUE) {
                k(i9, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                l(this.mHost, i7, rect2);
            }
            f0Var = (f0) androidx.customview.widget.b.c(j7, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, o6, rect2, i7);
        }
        return requestKeyboardFocusForVirtualView(f0Var != null ? j7.t(j7.r(f0Var)) : Integer.MIN_VALUE);
    }

    @d.o0
    public f0 obtainAccessibilityNodeInfo(int i7) {
        return i7 == -1 ? i() : h(i7);
    }

    public final void onFocusChanged(boolean z6, int i7, @q0 Rect rect) {
        int i8 = this.mKeyboardFocusedVirtualViewId;
        if (i8 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i8);
        }
        if (z6) {
            o(i7, rect);
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, f0 f0Var) {
        super.onInitializeAccessibilityNodeInfo(view, f0Var);
        onPopulateNodeForHost(f0Var);
    }

    public abstract boolean onPerformActionForVirtualView(int i7, int i8, @q0 Bundle bundle);

    public void onPopulateEventForHost(@d.o0 AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i7, @d.o0 AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(@d.o0 f0 f0Var) {
    }

    public abstract void onPopulateNodeForVirtualView(int i7, @d.o0 f0 f0Var);

    public void onVirtualViewKeyboardFocusChanged(int i7, boolean z6) {
    }

    public final boolean p(int i7, int i8, Bundle bundle) {
        return i8 != 1 ? i8 != 2 ? i8 != 64 ? i8 != 128 ? onPerformActionForVirtualView(i7, i8, bundle) : c(i7) : r(i7) : clearKeyboardFocusForVirtualView(i7) : requestKeyboardFocusForVirtualView(i7);
    }

    public boolean performAction(int i7, int i8, Bundle bundle) {
        return i7 != -1 ? p(i7, i8, bundle) : q(i8, bundle);
    }

    public final boolean q(int i7, Bundle bundle) {
        return u1.l1(this.mHost, i7, bundle);
    }

    public final boolean r(int i7) {
        int i8;
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled() && (i8 = this.mAccessibilityFocusedVirtualViewId) != i7) {
            if (i8 != Integer.MIN_VALUE) {
                c(i8);
            }
            this.mAccessibilityFocusedVirtualViewId = i7;
            this.mHost.invalidate();
            sendEventForVirtualView(i7, 32768);
            return true;
        }
        return false;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i7) {
        int i8;
        if ((this.mHost.isFocused() || this.mHost.requestFocus()) && (i8 = this.mKeyboardFocusedVirtualViewId) != i7) {
            if (i8 != Integer.MIN_VALUE) {
                clearKeyboardFocusForVirtualView(i8);
            }
            if (i7 == Integer.MIN_VALUE) {
                return false;
            }
            this.mKeyboardFocusedVirtualViewId = i7;
            onVirtualViewKeyboardFocusChanged(i7, true);
            sendEventForVirtualView(i7, 8);
            return true;
        }
        return false;
    }

    public final void s(int i7) {
        int i8 = this.mHoveredVirtualViewId;
        if (i8 == i7) {
            return;
        }
        this.mHoveredVirtualViewId = i7;
        sendEventForVirtualView(i7, 128);
        sendEventForVirtualView(i8, 256);
    }

    public final boolean sendEventForVirtualView(int i7, int i8) {
        ViewParent parent;
        if (i7 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, e(i7, i8));
    }

    public final void invalidateVirtualView(int i7, int i8) {
        ViewParent parent;
        if (i7 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent e7 = e(i7, 2048);
        h1.b.i(e7, i8);
        parent.requestSendAccessibilityEvent(this.mHost, e7);
    }
}
