package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a3;
import androidx.core.view.z2;
import f.a;
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: j  reason: collision with root package name */
    public static final int f1411j = 200;

    /* renamed from: b  reason: collision with root package name */
    public final b f1412b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1413c;

    /* renamed from: d  reason: collision with root package name */
    public ActionMenuView f1414d;

    /* renamed from: e  reason: collision with root package name */
    public c f1415e;

    /* renamed from: f  reason: collision with root package name */
    public int f1416f;

    /* renamed from: g  reason: collision with root package name */
    public z2 f1417g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1418h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1419i;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0025a implements Runnable {
        public RunnableC0025a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.o();
        }
    }

    /* loaded from: classes.dex */
    public class b implements a3 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1421a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1422b;

        public b() {
        }

        @Override // androidx.core.view.a3
        public void a(View view) {
            this.f1421a = true;
        }

        @Override // androidx.core.view.a3
        public void b(View view) {
            if (this.f1421a) {
                return;
            }
            a aVar = a.this;
            aVar.f1417g = null;
            a.super.setVisibility(this.f1422b);
        }

        @Override // androidx.core.view.a3
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1421a = false;
        }

        public b d(z2 z2Var, int i7) {
            a.this.f1417g = z2Var;
            this.f1422b = i7;
            return this;
        }
    }

    public a(@d.o0 Context context) {
        this(context, null);
    }

    public static int k(int i7, int i8, boolean z6) {
        return z6 ? i7 - i8 : i7 + i8;
    }

    public void c(int i7) {
        n(i7, 200L).y();
    }

    public boolean d() {
        return i() && getVisibility() == 0;
    }

    public void e() {
        c cVar = this.f1415e;
        if (cVar != null) {
            cVar.q();
        }
    }

    public boolean f() {
        c cVar = this.f1415e;
        if (cVar != null) {
            return cVar.t();
        }
        return false;
    }

    public boolean g() {
        c cVar = this.f1415e;
        if (cVar != null) {
            return cVar.v();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.f1417g != null ? this.f1412b.f1422b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1416f;
    }

    public boolean h() {
        c cVar = this.f1415e;
        if (cVar != null) {
            return cVar.w();
        }
        return false;
    }

    public boolean i() {
        c cVar = this.f1415e;
        return cVar != null && cVar.x();
    }

    public int j(View view, int i7, int i8, int i9) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i8);
        return Math.max(0, (i7 - view.getMeasuredWidth()) - i9);
    }

    public int l(View view, int i7, int i8, int i9, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i8 + ((i9 - measuredHeight) / 2);
        if (z6) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    public void m() {
        post(new RunnableC0025a());
    }

    public z2 n(int i7, long j7) {
        z2 z2Var = this.f1417g;
        if (z2Var != null) {
            z2Var.d();
        }
        if (i7 != 0) {
            z2 b7 = androidx.core.view.u1.g(this).b(0.0f);
            b7.s(j7);
            b7.u(this.f1412b.d(b7, i7));
            return b7;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        z2 b8 = androidx.core.view.u1.g(this).b(1.0f);
        b8.s(j7);
        b8.u(this.f1412b.d(b8, i7));
        return b8;
    }

    public boolean o() {
        c cVar = this.f1415e;
        if (cVar != null) {
            return cVar.F();
        }
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.m.f9428a, a.b.f8860f, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(a.m.f9540o, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1415e;
        if (cVar != null) {
            cVar.y(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1419i = false;
        }
        if (!this.f1419i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1419i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1419i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1418h = false;
        }
        if (!this.f1418h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1418h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1418h = false;
        }
        return true;
    }

    public void setContentHeight(int i7) {
        this.f1416f = i7;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            z2 z2Var = this.f1417g;
            if (z2Var != null) {
                z2Var.d();
            }
            super.setVisibility(i7);
        }
    }

    public a(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f1412b = new b();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(a.b.f8842c, typedValue, true) && typedValue.resourceId != 0) {
            this.f1413c = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1413c = context;
        }
    }
}
