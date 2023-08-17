package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.u1;
import d.g0;
import d.o0;
import d.q0;
import d.u0;
import java.util.Arrays;
/* loaded from: classes.dex */
public class d {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    public static final int F = 8;
    public static final int G = 15;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    public static final int K = 20;
    public static final int L = 256;
    public static final int M = 600;
    public static final Interpolator N = new a();

    /* renamed from: x  reason: collision with root package name */
    public static final String f3925x = "ViewDragHelper";

    /* renamed from: y  reason: collision with root package name */
    public static final int f3926y = -1;

    /* renamed from: z  reason: collision with root package name */
    public static final int f3927z = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f3928a;

    /* renamed from: b  reason: collision with root package name */
    public int f3929b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f3931d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f3932e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f3933f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f3934g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f3935h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f3936i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f3937j;

    /* renamed from: k  reason: collision with root package name */
    public int f3938k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f3939l;

    /* renamed from: m  reason: collision with root package name */
    public float f3940m;

    /* renamed from: n  reason: collision with root package name */
    public float f3941n;

    /* renamed from: o  reason: collision with root package name */
    public int f3942o;

    /* renamed from: p  reason: collision with root package name */
    public final int f3943p;

    /* renamed from: q  reason: collision with root package name */
    public int f3944q;

    /* renamed from: r  reason: collision with root package name */
    public OverScroller f3945r;

    /* renamed from: s  reason: collision with root package name */
    public final c f3946s;

    /* renamed from: t  reason: collision with root package name */
    public View f3947t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3948u;

    /* renamed from: v  reason: collision with root package name */
    public final ViewGroup f3949v;

    /* renamed from: c  reason: collision with root package name */
    public int f3930c = -1;

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f3950w = new b();

    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.R(0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public int clampViewPositionHorizontal(@o0 View view, int i7, int i8) {
            return 0;
        }

        public int clampViewPositionVertical(@o0 View view, int i7, int i8) {
            return 0;
        }

        public int getOrderedChildIndex(int i7) {
            return i7;
        }

        public int getViewHorizontalDragRange(@o0 View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@o0 View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i7, int i8) {
        }

        public boolean onEdgeLock(int i7) {
            return false;
        }

        public void onEdgeTouched(int i7, int i8) {
        }

        public void onViewCaptured(@o0 View view, int i7) {
        }

        public void onViewDragStateChanged(int i7) {
        }

        public void onViewPositionChanged(@o0 View view, int i7, int i8, @u0 int i9, @u0 int i10) {
        }

        public void onViewReleased(@o0 View view, float f7, float f8) {
        }

        public abstract boolean tryCaptureView(@o0 View view, int i7);
    }

    public d(@o0 Context context, @o0 ViewGroup viewGroup, @o0 c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3949v = viewGroup;
        this.f3946s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i7 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3943p = i7;
        this.f3942o = i7;
        this.f3929b = viewConfiguration.getScaledTouchSlop();
        this.f3940m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3941n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3945r = new OverScroller(context, N);
    }

    public static d p(@o0 ViewGroup viewGroup, float f7, @o0 c cVar) {
        d q6 = q(viewGroup, cVar);
        q6.f3929b = (int) (q6.f3929b * (1.0f / f7));
        return q6;
    }

    public static d q(@o0 ViewGroup viewGroup, @o0 c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    @u0
    public int A() {
        return this.f3943p;
    }

    @u0
    public int B() {
        return this.f3942o;
    }

    public final int C(int i7, int i8) {
        int i9 = i7 < this.f3949v.getLeft() + this.f3942o ? 1 : 0;
        if (i8 < this.f3949v.getTop() + this.f3942o) {
            i9 |= 4;
        }
        if (i7 > this.f3949v.getRight() - this.f3942o) {
            i9 |= 2;
        }
        return i8 > this.f3949v.getBottom() - this.f3942o ? i9 | 8 : i9;
    }

    public float D() {
        return this.f3941n;
    }

    @u0
    public int E() {
        return this.f3929b;
    }

    public int F() {
        return this.f3928a;
    }

    public boolean G(int i7, int i8) {
        return L(this.f3947t, i7, i8);
    }

    public boolean H(int i7) {
        int length = this.f3935h.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (I(i7, i8)) {
                return true;
            }
        }
        return false;
    }

    public boolean I(int i7, int i8) {
        return J(i8) && (i7 & this.f3935h[i8]) != 0;
    }

    public boolean J(int i7) {
        return ((1 << i7) & this.f3938k) != 0;
    }

    public final boolean K(int i7) {
        if (J(i7)) {
            return true;
        }
        Log.e(f3925x, "Ignoring pointerId=" + i7 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean L(@q0 View view, int i7, int i8) {
        return view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom();
    }

    public void M(@o0 MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.f3939l == null) {
            this.f3939l = VelocityTracker.obtain();
        }
        this.f3939l.addMovement(motionEvent);
        int i8 = 0;
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View v6 = v((int) x6, (int) y6);
            P(x6, y6, pointerId);
            Y(v6, pointerId);
            int i9 = this.f3935h[pointerId];
            int i10 = this.f3944q;
            if ((i9 & i10) != 0) {
                this.f3946s.onEdgeTouched(i9 & i10, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f3928a == 1) {
                N();
            }
            c();
        } else if (actionMasked == 2) {
            if (this.f3928a == 1) {
                if (K(this.f3930c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3930c);
                    float x7 = motionEvent.getX(findPointerIndex);
                    float y7 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f3933f;
                    int i11 = this.f3930c;
                    int i12 = (int) (x7 - fArr[i11]);
                    int i13 = (int) (y7 - this.f3934g[i11]);
                    t(this.f3947t.getLeft() + i12, this.f3947t.getTop() + i13, i12, i13);
                    Q(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i8 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i8);
                if (K(pointerId2)) {
                    float x8 = motionEvent.getX(i8);
                    float y8 = motionEvent.getY(i8);
                    float f7 = x8 - this.f3931d[pointerId2];
                    float f8 = y8 - this.f3932e[pointerId2];
                    O(f7, f8, pointerId2);
                    if (this.f3928a != 1) {
                        View v7 = v((int) x8, (int) y8);
                        if (h(v7, f7, f8) && Y(v7, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i8++;
            }
            Q(motionEvent);
        } else if (actionMasked == 3) {
            if (this.f3928a == 1) {
                r(0.0f, 0.0f);
            }
            c();
        } else if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x9 = motionEvent.getX(actionIndex);
            float y9 = motionEvent.getY(actionIndex);
            P(x9, y9, pointerId3);
            if (this.f3928a != 0) {
                if (G((int) x9, (int) y9)) {
                    Y(this.f3947t, pointerId3);
                    return;
                }
                return;
            }
            Y(v((int) x9, (int) y9), pointerId3);
            int i14 = this.f3935h[pointerId3];
            int i15 = this.f3944q;
            if ((i14 & i15) != 0) {
                this.f3946s.onEdgeTouched(i14 & i15, pointerId3);
            }
        } else if (actionMasked != 6) {
        } else {
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            if (this.f3928a == 1 && pointerId4 == this.f3930c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i8 >= pointerCount2) {
                        i7 = -1;
                        break;
                    }
                    int pointerId5 = motionEvent.getPointerId(i8);
                    if (pointerId5 != this.f3930c) {
                        View v8 = v((int) motionEvent.getX(i8), (int) motionEvent.getY(i8));
                        View view = this.f3947t;
                        if (v8 == view && Y(view, pointerId5)) {
                            i7 = this.f3930c;
                            break;
                        }
                    }
                    i8++;
                }
                if (i7 == -1) {
                    N();
                }
            }
            l(pointerId4);
        }
    }

    public final void N() {
        this.f3939l.computeCurrentVelocity(1000, this.f3940m);
        r(i(this.f3939l.getXVelocity(this.f3930c), this.f3941n, this.f3940m), i(this.f3939l.getYVelocity(this.f3930c), this.f3941n, this.f3940m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.d$c] */
    public final void O(float f7, float f8, int i7) {
        boolean e7 = e(f7, f8, i7, 1);
        boolean z6 = e7;
        if (e(f8, f7, i7, 4)) {
            z6 = e7 | true;
        }
        boolean z7 = z6;
        if (e(f7, f8, i7, 2)) {
            z7 = (z6 ? 1 : 0) | true;
        }
        ?? r02 = z7;
        if (e(f8, f7, i7, 8)) {
            r02 = (z7 ? 1 : 0) | true;
        }
        if (r02 != 0) {
            int[] iArr = this.f3936i;
            iArr[i7] = iArr[i7] | r02;
            this.f3946s.onEdgeDragStarted(r02, i7);
        }
    }

    public final void P(float f7, float f8, int i7) {
        u(i7);
        float[] fArr = this.f3931d;
        this.f3933f[i7] = f7;
        fArr[i7] = f7;
        float[] fArr2 = this.f3932e;
        this.f3934g[i7] = f8;
        fArr2[i7] = f8;
        this.f3935h[i7] = C((int) f7, (int) f8);
        this.f3938k |= 1 << i7;
    }

    public final void Q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (K(pointerId)) {
                float x6 = motionEvent.getX(i7);
                float y6 = motionEvent.getY(i7);
                this.f3933f[pointerId] = x6;
                this.f3934g[pointerId] = y6;
            }
        }
    }

    public void R(int i7) {
        this.f3949v.removeCallbacks(this.f3950w);
        if (this.f3928a != i7) {
            this.f3928a = i7;
            this.f3946s.onViewDragStateChanged(i7);
            if (this.f3928a == 0) {
                this.f3947t = null;
            }
        }
    }

    public void S(@u0 @g0(from = 0) int i7) {
        this.f3942o = i7;
    }

    public void T(int i7) {
        this.f3944q = i7;
    }

    public void U(float f7) {
        this.f3941n = f7;
    }

    public boolean V(int i7, int i8) {
        if (this.f3948u) {
            return x(i7, i8, (int) this.f3939l.getXVelocity(this.f3930c), (int) this.f3939l.getYVelocity(this.f3930c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean W(@d.o0 android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.d.W(android.view.MotionEvent):boolean");
    }

    public boolean X(@o0 View view, int i7, int i8) {
        this.f3947t = view;
        this.f3930c = -1;
        boolean x6 = x(i7, i8, 0, 0);
        if (!x6 && this.f3928a == 0 && this.f3947t != null) {
            this.f3947t = null;
        }
        return x6;
    }

    public boolean Y(View view, int i7) {
        if (view == this.f3947t && this.f3930c == i7) {
            return true;
        }
        if (view == null || !this.f3946s.tryCaptureView(view, i7)) {
            return false;
        }
        this.f3930c = i7;
        d(view, i7);
        return true;
    }

    public void a() {
        c();
        if (this.f3928a == 2) {
            int currX = this.f3945r.getCurrX();
            int currY = this.f3945r.getCurrY();
            this.f3945r.abortAnimation();
            int currX2 = this.f3945r.getCurrX();
            int currY2 = this.f3945r.getCurrY();
            this.f3946s.onViewPositionChanged(this.f3947t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        R(0);
    }

    public boolean b(@o0 View view, boolean z6, int i7, int i8, int i9, int i10) {
        int i11;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i12 = i9 + scrollX;
                if (i12 >= childAt.getLeft() && i12 < childAt.getRight() && (i11 = i10 + scrollY) >= childAt.getTop() && i11 < childAt.getBottom() && b(childAt, true, i7, i8, i12 - childAt.getLeft(), i11 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z6 && (view.canScrollHorizontally(-i7) || view.canScrollVertically(-i8));
    }

    public void c() {
        this.f3930c = -1;
        k();
        VelocityTracker velocityTracker = this.f3939l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3939l = null;
        }
    }

    public void d(@o0 View view, int i7) {
        if (view.getParent() == this.f3949v) {
            this.f3947t = view;
            this.f3930c = i7;
            this.f3946s.onViewCaptured(view, i7);
            R(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f3949v + ")");
    }

    public final boolean e(float f7, float f8, int i7, int i8) {
        float abs = Math.abs(f7);
        float abs2 = Math.abs(f8);
        if ((this.f3935h[i7] & i8) != i8 || (this.f3944q & i8) == 0 || (this.f3937j[i7] & i8) == i8 || (this.f3936i[i7] & i8) == i8) {
            return false;
        }
        int i9 = this.f3929b;
        if (abs > i9 || abs2 > i9) {
            if (abs >= abs2 * 0.5f || !this.f3946s.onEdgeLock(i8)) {
                return (this.f3936i[i7] & i8) == 0 && abs > ((float) this.f3929b);
            }
            int[] iArr = this.f3937j;
            iArr[i7] = iArr[i7] | i8;
            return false;
        }
        return false;
    }

    public boolean f(int i7) {
        int length = this.f3931d.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (g(i7, i8)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i7, int i8) {
        if (J(i8)) {
            boolean z6 = (i7 & 1) == 1;
            boolean z7 = (i7 & 2) == 2;
            float f7 = this.f3933f[i8] - this.f3931d[i8];
            float f8 = this.f3934g[i8] - this.f3932e[i8];
            if (!z6 || !z7) {
                return z6 ? Math.abs(f7) > ((float) this.f3929b) : z7 && Math.abs(f8) > ((float) this.f3929b);
            }
            int i9 = this.f3929b;
            return (f7 * f7) + (f8 * f8) > ((float) (i9 * i9));
        }
        return false;
    }

    public final boolean h(View view, float f7, float f8) {
        if (view == null) {
            return false;
        }
        boolean z6 = this.f3946s.getViewHorizontalDragRange(view) > 0;
        boolean z7 = this.f3946s.getViewVerticalDragRange(view) > 0;
        if (!z6 || !z7) {
            return z6 ? Math.abs(f7) > ((float) this.f3929b) : z7 && Math.abs(f8) > ((float) this.f3929b);
        }
        int i7 = this.f3929b;
        return (f7 * f7) + (f8 * f8) > ((float) (i7 * i7));
    }

    public final float i(float f7, float f8, float f9) {
        float abs = Math.abs(f7);
        if (abs < f8) {
            return 0.0f;
        }
        return abs > f9 ? f7 > 0.0f ? f9 : -f9 : f7;
    }

    public final int j(int i7, int i8, int i9) {
        int abs = Math.abs(i7);
        if (abs < i8) {
            return 0;
        }
        return abs > i9 ? i7 > 0 ? i9 : -i9 : i7;
    }

    public final void k() {
        float[] fArr = this.f3931d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f3932e, 0.0f);
        Arrays.fill(this.f3933f, 0.0f);
        Arrays.fill(this.f3934g, 0.0f);
        Arrays.fill(this.f3935h, 0);
        Arrays.fill(this.f3936i, 0);
        Arrays.fill(this.f3937j, 0);
        this.f3938k = 0;
    }

    public final void l(int i7) {
        if (this.f3931d == null || !J(i7)) {
            return;
        }
        this.f3931d[i7] = 0.0f;
        this.f3932e[i7] = 0.0f;
        this.f3933f[i7] = 0.0f;
        this.f3934g[i7] = 0.0f;
        this.f3935h[i7] = 0;
        this.f3936i[i7] = 0;
        this.f3937j[i7] = 0;
        this.f3938k = (~(1 << i7)) & this.f3938k;
    }

    public final int m(int i7, int i8, int i9) {
        if (i7 == 0) {
            return 0;
        }
        int width = this.f3949v.getWidth();
        float f7 = width / 2;
        float s6 = f7 + (s(Math.min(1.0f, Math.abs(i7) / width)) * f7);
        int abs = Math.abs(i8);
        return Math.min(abs > 0 ? Math.round(Math.abs(s6 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / i9) + 1.0f) * 256.0f), 600);
    }

    public final int n(View view, int i7, int i8, int i9, int i10) {
        float f7;
        float f8;
        float f9;
        float f10;
        int j7 = j(i9, (int) this.f3941n, (int) this.f3940m);
        int j8 = j(i10, (int) this.f3941n, (int) this.f3940m);
        int abs = Math.abs(i7);
        int abs2 = Math.abs(i8);
        int abs3 = Math.abs(j7);
        int abs4 = Math.abs(j8);
        int i11 = abs3 + abs4;
        int i12 = abs + abs2;
        if (j7 != 0) {
            f7 = abs3;
            f8 = i11;
        } else {
            f7 = abs;
            f8 = i12;
        }
        float f11 = f7 / f8;
        if (j8 != 0) {
            f9 = abs4;
            f10 = i11;
        } else {
            f9 = abs2;
            f10 = i12;
        }
        return (int) ((m(i7, j7, this.f3946s.getViewHorizontalDragRange(view)) * f11) + (m(i8, j8, this.f3946s.getViewVerticalDragRange(view)) * (f9 / f10)));
    }

    public boolean o(boolean z6) {
        if (this.f3928a == 2) {
            boolean computeScrollOffset = this.f3945r.computeScrollOffset();
            int currX = this.f3945r.getCurrX();
            int currY = this.f3945r.getCurrY();
            int left = currX - this.f3947t.getLeft();
            int top = currY - this.f3947t.getTop();
            if (left != 0) {
                u1.e1(this.f3947t, left);
            }
            if (top != 0) {
                u1.f1(this.f3947t, top);
            }
            if (left != 0 || top != 0) {
                this.f3946s.onViewPositionChanged(this.f3947t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3945r.getFinalX() && currY == this.f3945r.getFinalY()) {
                this.f3945r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z6) {
                    this.f3949v.post(this.f3950w);
                } else {
                    R(0);
                }
            }
        }
        return this.f3928a == 2;
    }

    public final void r(float f7, float f8) {
        this.f3948u = true;
        this.f3946s.onViewReleased(this.f3947t, f7, f8);
        this.f3948u = false;
        if (this.f3928a == 1) {
            R(0);
        }
    }

    public final float s(float f7) {
        return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
    }

    public final void t(int i7, int i8, int i9, int i10) {
        int left = this.f3947t.getLeft();
        int top = this.f3947t.getTop();
        if (i9 != 0) {
            i7 = this.f3946s.clampViewPositionHorizontal(this.f3947t, i7, i9);
            u1.e1(this.f3947t, i7 - left);
        }
        int i11 = i7;
        if (i10 != 0) {
            i8 = this.f3946s.clampViewPositionVertical(this.f3947t, i8, i10);
            u1.f1(this.f3947t, i8 - top);
        }
        int i12 = i8;
        if (i9 == 0 && i10 == 0) {
            return;
        }
        this.f3946s.onViewPositionChanged(this.f3947t, i11, i12, i11 - left, i12 - top);
    }

    public final void u(int i7) {
        float[] fArr = this.f3931d;
        if (fArr == null || fArr.length <= i7) {
            int i8 = i7 + 1;
            float[] fArr2 = new float[i8];
            float[] fArr3 = new float[i8];
            float[] fArr4 = new float[i8];
            float[] fArr5 = new float[i8];
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3932e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3933f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3934g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3935h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3936i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3937j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3931d = fArr2;
            this.f3932e = fArr3;
            this.f3933f = fArr4;
            this.f3934g = fArr5;
            this.f3935h = iArr;
            this.f3936i = iArr2;
            this.f3937j = iArr3;
        }
    }

    @q0
    public View v(int i7, int i8) {
        for (int childCount = this.f3949v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f3949v.getChildAt(this.f3946s.getOrderedChildIndex(childCount));
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i8 >= childAt.getTop() && i8 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void w(int i7, int i8, int i9, int i10) {
        if (!this.f3948u) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f3945r.fling(this.f3947t.getLeft(), this.f3947t.getTop(), (int) this.f3939l.getXVelocity(this.f3930c), (int) this.f3939l.getYVelocity(this.f3930c), i7, i9, i8, i10);
        R(2);
    }

    public final boolean x(int i7, int i8, int i9, int i10) {
        int left = this.f3947t.getLeft();
        int top = this.f3947t.getTop();
        int i11 = i7 - left;
        int i12 = i8 - top;
        if (i11 == 0 && i12 == 0) {
            this.f3945r.abortAnimation();
            R(0);
            return false;
        }
        this.f3945r.startScroll(left, top, i11, i12, n(this.f3947t, i11, i12, i9, i10));
        R(2);
        return true;
    }

    public int y() {
        return this.f3930c;
    }

    @q0
    public View z() {
        return this.f3947t;
    }
}
