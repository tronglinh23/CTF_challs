package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import d.b1;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class x0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final float f1807b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1808c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1809d;

    /* renamed from: e  reason: collision with root package name */
    public final View f1810e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f1811f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f1812g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1813h;

    /* renamed from: i  reason: collision with root package name */
    public int f1814i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f1815j = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = x0.this.f1810e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.e();
        }
    }

    public x0(View view) {
        this.f1810e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1807b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1808c = tapTimeout;
        this.f1809d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f7, float f8, float f9) {
        float f10 = -f9;
        return f7 >= f10 && f8 >= f10 && f7 < ((float) (view.getRight() - view.getLeft())) + f9 && f8 < ((float) (view.getBottom() - view.getTop())) + f9;
    }

    public final void a() {
        Runnable runnable = this.f1812g;
        if (runnable != null) {
            this.f1810e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1811f;
        if (runnable2 != null) {
            this.f1810e.removeCallbacks(runnable2);
        }
    }

    public abstract androidx.appcompat.view.menu.q b();

    public boolean c() {
        androidx.appcompat.view.menu.q b7 = b();
        if (b7 == null || b7.a()) {
            return true;
        }
        b7.show();
        return true;
    }

    public boolean d() {
        androidx.appcompat.view.menu.q b7 = b();
        if (b7 == null || !b7.a()) {
            return true;
        }
        b7.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f1810e;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1813h = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        s0 s0Var;
        View view = this.f1810e;
        androidx.appcompat.view.menu.q b7 = b();
        if (b7 == null || !b7.a() || (s0Var = (s0) b7.f()) == null || !s0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(s0Var, obtainNoHistory);
        boolean f7 = s0Var.f(obtainNoHistory, this.f1814i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return f7 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1810e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1814i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1807b
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1814i = r6
            java.lang.Runnable r6 = r5.f1811f
            if (r6 != 0) goto L52
            androidx.appcompat.widget.x0$a r6 = new androidx.appcompat.widget.x0$a
            r6.<init>()
            r5.f1811f = r6
        L52:
            java.lang.Runnable r6 = r5.f1811f
            int r1 = r5.f1808c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1812g
            if (r6 != 0) goto L65
            androidx.appcompat.widget.x0$b r6 = new androidx.appcompat.widget.x0$b
            r6.<init>()
            r5.f1812g = r6
        L65:
            java.lang.Runnable r6 = r5.f1812g
            int r1 = r5.f1809d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x0.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1815j);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1815j);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z6;
        boolean z7 = this.f1813h;
        if (z7) {
            z6 = f(motionEvent) || !d();
        } else {
            z6 = g(motionEvent) && c();
            if (z6) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1810e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1813h = z6;
        return z6 || z7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1813h = false;
        this.f1814i = -1;
        Runnable runnable = this.f1811f;
        if (runnable != null) {
            this.f1810e.removeCallbacks(runnable);
        }
    }
}
