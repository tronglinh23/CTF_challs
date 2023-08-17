package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.u1;
import androidx.recyclerview.widget.RecyclerView;
import d.l1;
import d.o0;
import d.q0;
@l1
/* loaded from: classes.dex */
public class k extends RecyclerView.n implements RecyclerView.s {
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int N = 500;
    public static final int O = 1500;
    public static final int P = 1200;
    public static final int Q = 500;
    public static final int R = 255;
    public static final int[] S = {16842919};
    public static final int[] T = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.t C;

    /* renamed from: a  reason: collision with root package name */
    public final int f5465a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5466b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f5467c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f5468d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5469e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5470f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f5471g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f5472h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5473i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5474j;
    @l1

    /* renamed from: k  reason: collision with root package name */
    public int f5475k;
    @l1

    /* renamed from: l  reason: collision with root package name */
    public int f5476l;
    @l1

    /* renamed from: m  reason: collision with root package name */
    public float f5477m;
    @l1

    /* renamed from: n  reason: collision with root package name */
    public int f5478n;
    @l1

    /* renamed from: o  reason: collision with root package name */
    public int f5479o;
    @l1

    /* renamed from: p  reason: collision with root package name */
    public float f5480p;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f5483s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f5490z;

    /* renamed from: q  reason: collision with root package name */
    public int f5481q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f5482r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5484t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5485u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f5486v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f5487w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f5488x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f5489y = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.q(500);
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            k.this.D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5493a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5493a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5493a) {
                this.f5493a = false;
            } else if (((Float) k.this.f5490z.getAnimatedValue()).floatValue() == 0.0f) {
                k kVar = k.this;
                kVar.A = 0;
                kVar.A(0);
            } else {
                k kVar2 = k.this;
                kVar2.A = 2;
                kVar2.x();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            k.this.f5467c.setAlpha(floatValue);
            k.this.f5468d.setAlpha(floatValue);
            k.this.x();
        }
    }

    public k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i8, int i9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5490z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f5467c = stateListDrawable;
        this.f5468d = drawable;
        this.f5471g = stateListDrawable2;
        this.f5472h = drawable2;
        this.f5469e = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f5470f = Math.max(i7, drawable.getIntrinsicWidth());
        this.f5473i = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.f5474j = Math.max(i7, drawable2.getIntrinsicWidth());
        this.f5465a = i8;
        this.f5466b = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        f(recyclerView);
    }

    public void A(int i7) {
        if (i7 == 2 && this.f5486v != 2) {
            this.f5467c.setState(S);
            g();
        }
        if (i7 == 0) {
            x();
        } else {
            C();
        }
        if (this.f5486v == 2 && i7 != 2) {
            this.f5467c.setState(T);
            y(P);
        } else if (i7 == 1) {
            y(O);
        }
        this.f5486v = i7;
    }

    public final void B() {
        this.f5483s.addItemDecoration(this);
        this.f5483s.addOnItemTouchListener(this);
        this.f5483s.addOnScrollListener(this.C);
    }

    public void C() {
        int i7 = this.A;
        if (i7 != 0) {
            if (i7 != 3) {
                return;
            }
            this.f5490z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f5490z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f5490z.setDuration(500L);
        this.f5490z.setStartDelay(0L);
        this.f5490z.start();
    }

    public void D(int i7, int i8) {
        int computeVerticalScrollRange = this.f5483s.computeVerticalScrollRange();
        int i9 = this.f5482r;
        this.f5484t = computeVerticalScrollRange - i9 > 0 && i9 >= this.f5465a;
        int computeHorizontalScrollRange = this.f5483s.computeHorizontalScrollRange();
        int i10 = this.f5481q;
        boolean z6 = computeHorizontalScrollRange - i10 > 0 && i10 >= this.f5465a;
        this.f5485u = z6;
        boolean z7 = this.f5484t;
        if (!z7 && !z6) {
            if (this.f5486v != 0) {
                A(0);
                return;
            }
            return;
        }
        if (z7) {
            float f7 = i9;
            this.f5476l = (int) ((f7 * (i8 + (f7 / 2.0f))) / computeVerticalScrollRange);
            this.f5475k = Math.min(i9, (i9 * i9) / computeVerticalScrollRange);
        }
        if (this.f5485u) {
            float f8 = i10;
            this.f5479o = (int) ((f8 * (i7 + (f8 / 2.0f))) / computeHorizontalScrollRange);
            this.f5478n = Math.min(i10, (i10 * i10) / computeHorizontalScrollRange);
        }
        int i11 = this.f5486v;
        if (i11 == 0 || i11 == 1) {
            A(1);
        }
    }

    public final void E(float f7) {
        int[] n7 = n();
        float max = Math.max(n7[0], Math.min(n7[1], f7));
        if (Math.abs(this.f5476l - max) < 2.0f) {
            return;
        }
        int z6 = z(this.f5477m, max, n7, this.f5483s.computeVerticalScrollRange(), this.f5483s.computeVerticalScrollOffset(), this.f5482r);
        if (z6 != 0) {
            this.f5483s.scrollBy(0, z6);
        }
        this.f5477m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
        int i7 = this.f5486v;
        if (i7 == 1) {
            boolean v6 = v(motionEvent.getX(), motionEvent.getY());
            boolean u6 = u(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!v6 && !u6) {
                return false;
            }
            if (u6) {
                this.f5487w = 1;
                this.f5480p = (int) motionEvent.getX();
            } else if (v6) {
                this.f5487w = 2;
                this.f5477m = (int) motionEvent.getY();
            }
            A(2);
        } else if (i7 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
        if (this.f5486v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean v6 = v(motionEvent.getX(), motionEvent.getY());
            boolean u6 = u(motionEvent.getX(), motionEvent.getY());
            if (v6 || u6) {
                if (u6) {
                    this.f5487w = 1;
                    this.f5480p = (int) motionEvent.getX();
                } else if (v6) {
                    this.f5487w = 2;
                    this.f5477m = (int) motionEvent.getY();
                }
                A(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f5486v == 2) {
            this.f5477m = 0.0f;
            this.f5480p = 0.0f;
            A(1);
            this.f5487w = 0;
        } else if (motionEvent.getAction() == 2 && this.f5486v == 2) {
            C();
            if (this.f5487w == 1) {
                r(motionEvent.getX());
            }
            if (this.f5487w == 2) {
                E(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void e(boolean z6) {
    }

    public void f(@q0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5483s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            h();
        }
        this.f5483s = recyclerView;
        if (recyclerView != null) {
            B();
        }
    }

    public final void g() {
        this.f5483s.removeCallbacks(this.B);
    }

    public final void h() {
        this.f5483s.removeItemDecoration(this);
        this.f5483s.removeOnItemTouchListener(this);
        this.f5483s.removeOnScrollListener(this.C);
        g();
    }

    public final void i(Canvas canvas) {
        int i7 = this.f5482r;
        int i8 = this.f5473i;
        int i9 = this.f5479o;
        int i10 = this.f5478n;
        this.f5471g.setBounds(0, 0, i10, i8);
        this.f5472h.setBounds(0, 0, this.f5481q, this.f5474j);
        canvas.translate(0.0f, i7 - i8);
        this.f5472h.draw(canvas);
        canvas.translate(i9 - (i10 / 2), 0.0f);
        this.f5471g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public final void j(Canvas canvas) {
        int i7 = this.f5481q;
        int i8 = this.f5469e;
        int i9 = i7 - i8;
        int i10 = this.f5476l;
        int i11 = this.f5475k;
        int i12 = i10 - (i11 / 2);
        this.f5467c.setBounds(0, 0, i8, i11);
        this.f5468d.setBounds(0, 0, this.f5470f, this.f5482r);
        if (!t()) {
            canvas.translate(i9, 0.0f);
            this.f5468d.draw(canvas);
            canvas.translate(0.0f, i12);
            this.f5467c.draw(canvas);
            canvas.translate(-i9, -i12);
            return;
        }
        this.f5468d.draw(canvas);
        canvas.translate(this.f5469e, i12);
        canvas.scale(-1.0f, 1.0f);
        this.f5467c.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.f5469e, -i12);
    }

    public final int[] k() {
        int[] iArr = this.f5489y;
        int i7 = this.f5466b;
        iArr[0] = i7;
        iArr[1] = this.f5481q - i7;
        return iArr;
    }

    @l1
    public Drawable l() {
        return this.f5471g;
    }

    @l1
    public Drawable m() {
        return this.f5472h;
    }

    public final int[] n() {
        int[] iArr = this.f5488x;
        int i7 = this.f5466b;
        iArr[0] = i7;
        iArr[1] = this.f5482r - i7;
        return iArr;
    }

    @l1
    public Drawable o() {
        return this.f5467c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        if (this.f5481q != this.f5483s.getWidth() || this.f5482r != this.f5483s.getHeight()) {
            this.f5481q = this.f5483s.getWidth();
            this.f5482r = this.f5483s.getHeight();
            A(0);
        } else if (this.A != 0) {
            if (this.f5484t) {
                j(canvas);
            }
            if (this.f5485u) {
                i(canvas);
            }
        }
    }

    @l1
    public Drawable p() {
        return this.f5468d;
    }

    @l1
    public void q(int i7) {
        int i8 = this.A;
        if (i8 == 1) {
            this.f5490z.cancel();
        } else if (i8 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f5490z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f5490z.setDuration(i7);
        this.f5490z.start();
    }

    public final void r(float f7) {
        int[] k7 = k();
        float max = Math.max(k7[0], Math.min(k7[1], f7));
        if (Math.abs(this.f5479o - max) < 2.0f) {
            return;
        }
        int z6 = z(this.f5480p, max, k7, this.f5483s.computeHorizontalScrollRange(), this.f5483s.computeHorizontalScrollOffset(), this.f5481q);
        if (z6 != 0) {
            this.f5483s.scrollBy(z6, 0);
        }
        this.f5480p = max;
    }

    public boolean s() {
        return this.f5486v == 2;
    }

    public final boolean t() {
        return u1.Z(this.f5483s) == 1;
    }

    @l1
    public boolean u(float f7, float f8) {
        if (f8 >= this.f5482r - this.f5473i) {
            int i7 = this.f5479o;
            int i8 = this.f5478n;
            if (f7 >= i7 - (i8 / 2) && f7 <= i7 + (i8 / 2)) {
                return true;
            }
        }
        return false;
    }

    @l1
    public boolean v(float f7, float f8) {
        if (!t() ? f7 >= this.f5481q - this.f5469e : f7 <= this.f5469e / 2) {
            int i7 = this.f5476l;
            int i8 = this.f5475k;
            if (f8 >= i7 - (i8 / 2) && f8 <= i7 + (i8 / 2)) {
                return true;
            }
        }
        return false;
    }

    @l1
    public boolean w() {
        return this.f5486v == 1;
    }

    public void x() {
        this.f5483s.invalidate();
    }

    public final void y(int i7) {
        g();
        this.f5483s.postDelayed(this.B, i7);
    }

    public final int z(float f7, float f8, int[] iArr, int i7, int i8, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 == 0) {
            return 0;
        }
        int i11 = i7 - i9;
        int i12 = (int) (((f8 - f7) / i10) * i11);
        int i13 = i8 + i12;
        if (i13 >= i11 || i13 < 0) {
            return 0;
        }
        return i12;
    }
}
