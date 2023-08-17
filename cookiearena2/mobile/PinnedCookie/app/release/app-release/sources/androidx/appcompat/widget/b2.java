package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.q2;
import d.b1;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: l  reason: collision with root package name */
    public static final String f1461l = "TooltipCompatHandler";

    /* renamed from: m  reason: collision with root package name */
    public static final long f1462m = 2500;

    /* renamed from: n  reason: collision with root package name */
    public static final long f1463n = 15000;

    /* renamed from: o  reason: collision with root package name */
    public static final long f1464o = 3000;

    /* renamed from: p  reason: collision with root package name */
    public static b2 f1465p;

    /* renamed from: q  reason: collision with root package name */
    public static b2 f1466q;

    /* renamed from: b  reason: collision with root package name */
    public final View f1467b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f1468c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1469d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f1470e = new Runnable() { // from class: androidx.appcompat.widget.z1
        @Override // java.lang.Runnable
        public final void run() {
            b2.this.e();
        }
    };

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f1471f = new Runnable() { // from class: androidx.appcompat.widget.a2
        @Override // java.lang.Runnable
        public final void run() {
            b2.this.d();
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public int f1472g;

    /* renamed from: h  reason: collision with root package name */
    public int f1473h;

    /* renamed from: i  reason: collision with root package name */
    public c2 f1474i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1475j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1476k;

    public b2(View view, CharSequence charSequence) {
        this.f1467b = view;
        this.f1468c = charSequence;
        this.f1469d = q2.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    public static void g(b2 b2Var) {
        b2 b2Var2 = f1465p;
        if (b2Var2 != null) {
            b2Var2.b();
        }
        f1465p = b2Var;
        if (b2Var != null) {
            b2Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        b2 b2Var = f1465p;
        if (b2Var != null && b2Var.f1467b == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new b2(view, charSequence);
            return;
        }
        b2 b2Var2 = f1466q;
        if (b2Var2 != null && b2Var2.f1467b == view) {
            b2Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void b() {
        this.f1467b.removeCallbacks(this.f1470e);
    }

    public final void c() {
        this.f1476k = true;
    }

    public void d() {
        if (f1466q == this) {
            f1466q = null;
            c2 c2Var = this.f1474i;
            if (c2Var != null) {
                c2Var.c();
                this.f1474i = null;
                c();
                this.f1467b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(f1461l, "sActiveHandler.mPopup == null");
            }
        }
        if (f1465p == this) {
            g(null);
        }
        this.f1467b.removeCallbacks(this.f1471f);
    }

    public final void f() {
        this.f1467b.postDelayed(this.f1470e, ViewConfiguration.getLongPressTimeout());
    }

    public void i(boolean z6) {
        long longPressTimeout;
        long j7;
        long j8;
        if (androidx.core.view.u1.O0(this.f1467b)) {
            g(null);
            b2 b2Var = f1466q;
            if (b2Var != null) {
                b2Var.d();
            }
            f1466q = this;
            this.f1475j = z6;
            c2 c2Var = new c2(this.f1467b.getContext());
            this.f1474i = c2Var;
            c2Var.e(this.f1467b, this.f1472g, this.f1473h, this.f1475j, this.f1468c);
            this.f1467b.addOnAttachStateChangeListener(this);
            if (this.f1475j) {
                j8 = f1462m;
            } else {
                if ((androidx.core.view.u1.C0(this.f1467b) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = f1464o;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = f1463n;
                }
                j8 = j7 - longPressTimeout;
            }
            this.f1467b.removeCallbacks(this.f1471f);
            this.f1467b.postDelayed(this.f1471f, j8);
        }
    }

    public final boolean j(MotionEvent motionEvent) {
        int x6 = (int) motionEvent.getX();
        int y6 = (int) motionEvent.getY();
        if (this.f1476k || Math.abs(x6 - this.f1472g) > this.f1469d || Math.abs(y6 - this.f1473h) > this.f1469d) {
            this.f1472g = x6;
            this.f1473h = y6;
            this.f1476k = false;
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1474i == null || !this.f1475j) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1467b.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    c();
                    d();
                }
            } else if (this.f1467b.isEnabled() && this.f1474i == null && j(motionEvent)) {
                g(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1472g = view.getWidth() / 2;
        this.f1473h = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
