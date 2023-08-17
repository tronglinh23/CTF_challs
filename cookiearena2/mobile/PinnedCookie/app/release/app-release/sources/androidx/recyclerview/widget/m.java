package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.l0;
import androidx.core.view.u1;
import androidx.recyclerview.widget.RecyclerView;
import c3.a;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class m extends RecyclerView.n implements RecyclerView.q {
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 4;
    public static final int H = 8;
    public static final int I = 16;
    public static final int J = 32;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 2;
    public static final int O = 4;
    public static final int P = 8;
    public static final String Q = "ItemTouchHelper";
    public static final boolean R = false;
    public static final int S = -1;
    public static final int T = 8;
    public static final int U = 255;
    public static final int V = 65280;
    public static final int W = 16711680;
    public static final int X = 1000;
    public g A;
    public Rect C;
    public long D;

    /* renamed from: d  reason: collision with root package name */
    public float f5514d;

    /* renamed from: e  reason: collision with root package name */
    public float f5515e;

    /* renamed from: f  reason: collision with root package name */
    public float f5516f;

    /* renamed from: g  reason: collision with root package name */
    public float f5517g;

    /* renamed from: h  reason: collision with root package name */
    public float f5518h;

    /* renamed from: i  reason: collision with root package name */
    public float f5519i;

    /* renamed from: j  reason: collision with root package name */
    public float f5520j;

    /* renamed from: k  reason: collision with root package name */
    public float f5521k;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public f f5523m;

    /* renamed from: o  reason: collision with root package name */
    public int f5525o;

    /* renamed from: q  reason: collision with root package name */
    public int f5527q;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f5528r;

    /* renamed from: t  reason: collision with root package name */
    public VelocityTracker f5530t;

    /* renamed from: u  reason: collision with root package name */
    public List<RecyclerView.f0> f5531u;

    /* renamed from: v  reason: collision with root package name */
    public List<Integer> f5532v;

    /* renamed from: z  reason: collision with root package name */
    public l0 f5536z;

    /* renamed from: a  reason: collision with root package name */
    public final List<View> f5511a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final float[] f5512b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView.f0 f5513c = null;

    /* renamed from: l  reason: collision with root package name */
    public int f5522l = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f5524n = 0;

    /* renamed from: p  reason: collision with root package name */
    public List<h> f5526p = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f5529s = new a();

    /* renamed from: w  reason: collision with root package name */
    public RecyclerView.j f5533w = null;

    /* renamed from: x  reason: collision with root package name */
    public View f5534x = null;

    /* renamed from: y  reason: collision with root package name */
    public int f5535y = -1;
    public final RecyclerView.s B = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            if (mVar.f5513c == null || !mVar.y()) {
                return;
            }
            m mVar2 = m.this;
            RecyclerView.f0 f0Var = mVar2.f5513c;
            if (f0Var != null) {
                mVar2.t(f0Var);
            }
            m mVar3 = m.this;
            mVar3.f5528r.removeCallbacks(mVar3.f5529s);
            u1.p1(m.this.f5528r, this);
        }
    }

    /* loaded from: classes.dex */
    public class b implements RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean a(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
            int findPointerIndex;
            h m7;
            m.this.f5536z.b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m.this.f5522l = motionEvent.getPointerId(0);
                m.this.f5514d = motionEvent.getX();
                m.this.f5515e = motionEvent.getY();
                m.this.u();
                m mVar = m.this;
                if (mVar.f5513c == null && (m7 = mVar.m(motionEvent)) != null) {
                    m mVar2 = m.this;
                    mVar2.f5514d -= m7.f5565j;
                    mVar2.f5515e -= m7.f5566k;
                    mVar2.l(m7.f5560e, true);
                    if (m.this.f5511a.remove(m7.f5560e.itemView)) {
                        m mVar3 = m.this;
                        mVar3.f5523m.c(mVar3.f5528r, m7.f5560e);
                    }
                    m.this.z(m7.f5560e, m7.f5561f);
                    m mVar4 = m.this;
                    mVar4.G(motionEvent, mVar4.f5525o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                m mVar5 = m.this;
                mVar5.f5522l = -1;
                mVar5.z(null, 0);
            } else {
                int i7 = m.this.f5522l;
                if (i7 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i7)) >= 0) {
                    m.this.i(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = m.this.f5530t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return m.this.f5513c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void c(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
            m.this.f5536z.b(motionEvent);
            VelocityTracker velocityTracker = m.this.f5530t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (m.this.f5522l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(m.this.f5522l);
            if (findPointerIndex >= 0) {
                m.this.i(actionMasked, motionEvent, findPointerIndex);
            }
            m mVar = m.this;
            RecyclerView.f0 f0Var = mVar.f5513c;
            if (f0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        mVar.G(motionEvent, mVar.f5525o, findPointerIndex);
                        m.this.t(f0Var);
                        m mVar2 = m.this;
                        mVar2.f5528r.removeCallbacks(mVar2.f5529s);
                        m.this.f5529s.run();
                        m.this.f5528r.invalidate();
                        return;
                    }
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    m mVar3 = m.this;
                    if (pointerId == mVar3.f5522l) {
                        mVar3.f5522l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        m mVar4 = m.this;
                        mVar4.G(motionEvent, mVar4.f5525o, actionIndex);
                        return;
                    }
                    return;
                } else {
                    VelocityTracker velocityTracker2 = mVar.f5530t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
            }
            m.this.z(null, 0);
            m.this.f5522l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void e(boolean z6) {
            if (z6) {
                m.this.z(null, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends h {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ int f5539o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f5540p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.f0 f0Var, int i7, int i8, float f7, float f8, float f9, float f10, int i9, RecyclerView.f0 f0Var2) {
            super(f0Var, i7, i8, f7, f8, f9, f10);
            this.f5539o = i9;
            this.f5540p = f0Var2;
        }

        @Override // androidx.recyclerview.widget.m.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f5567l) {
                return;
            }
            if (this.f5539o <= 0) {
                m mVar = m.this;
                mVar.f5523m.c(mVar.f5528r, this.f5540p);
            } else {
                m.this.f5511a.add(this.f5540p.itemView);
                this.f5564i = true;
                int i7 = this.f5539o;
                if (i7 > 0) {
                    m.this.v(this, i7);
                }
            }
            m mVar2 = m.this;
            View view = mVar2.f5534x;
            View view2 = this.f5540p.itemView;
            if (view == view2) {
                mVar2.x(view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ h f5542k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f5543l;

        public d(h hVar, int i7) {
            this.f5542k = hVar;
            this.f5543l = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = m.this.f5528r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            h hVar = this.f5542k;
            if (hVar.f5567l || hVar.f5560e.getAdapterPosition() == -1) {
                return;
            }
            RecyclerView.l itemAnimator = m.this.f5528r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.r(null)) && !m.this.r()) {
                m.this.f5523m.D(this.f5542k.f5560e, this.f5543l);
            } else {
                m.this.f5528r.post(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements RecyclerView.j {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public int a(int i7, int i8) {
            m mVar = m.this;
            View view = mVar.f5534x;
            if (view == null) {
                return i8;
            }
            int i9 = mVar.f5535y;
            if (i9 == -1) {
                i9 = mVar.f5528r.indexOfChild(view);
                m.this.f5535y = i9;
            }
            return i8 == i7 + (-1) ? i9 : i8 < i9 ? i8 : i8 + 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: b  reason: collision with root package name */
        public static final int f5546b = 200;

        /* renamed from: c  reason: collision with root package name */
        public static final int f5547c = 250;

        /* renamed from: d  reason: collision with root package name */
        public static final int f5548d = 3158064;

        /* renamed from: e  reason: collision with root package name */
        public static final int f5549e = 789516;

        /* renamed from: f  reason: collision with root package name */
        public static final Interpolator f5550f = new a();

        /* renamed from: g  reason: collision with root package name */
        public static final Interpolator f5551g = new b();

        /* renamed from: h  reason: collision with root package name */
        public static final long f5552h = 2000;

        /* renamed from: a  reason: collision with root package name */
        public int f5553a = -1;

        /* loaded from: classes.dex */
        public static class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f7) {
                return f7 * f7 * f7 * f7 * f7;
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

        public static int e(int i7, int i8) {
            int i9;
            int i10 = i7 & f5549e;
            if (i10 == 0) {
                return i7;
            }
            int i11 = i7 & (~i10);
            if (i8 == 0) {
                i9 = i10 << 2;
            } else {
                int i12 = i10 << 1;
                i11 |= (-789517) & i12;
                i9 = (i12 & f5549e) << 2;
            }
            return i11 | i9;
        }

        @o0
        public static n i() {
            return o.f5573a;
        }

        public static int u(int i7, int i8) {
            return i8 << (i7 * 8);
        }

        public static int v(int i7, int i8) {
            return u(2, i7) | u(1, i8) | u(0, i8 | i7);
        }

        public abstract boolean A(@o0 RecyclerView recyclerView, @o0 RecyclerView.f0 f0Var, @o0 RecyclerView.f0 f0Var2);

        public void B(@o0 RecyclerView recyclerView, @o0 RecyclerView.f0 f0Var, int i7, @o0 RecyclerView.f0 f0Var2, int i8, int i9, int i10) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).prepareForDrop(f0Var.itemView, f0Var2.itemView, i9, i10);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(f0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i8);
                }
                if (layoutManager.getDecoratedRight(f0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i8);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(f0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i8);
                }
                if (layoutManager.getDecoratedBottom(f0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i8);
                }
            }
        }

        public void C(@q0 RecyclerView.f0 f0Var, int i7) {
            if (f0Var != null) {
                o.f5573a.b(f0Var.itemView);
            }
        }

        public abstract void D(@o0 RecyclerView.f0 f0Var, int i7);

        public boolean a(@o0 RecyclerView recyclerView, @o0 RecyclerView.f0 f0Var, @o0 RecyclerView.f0 f0Var2) {
            return true;
        }

        public RecyclerView.f0 b(@o0 RecyclerView.f0 f0Var, @o0 List<RecyclerView.f0> list, int i7, int i8) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i7 + f0Var.itemView.getWidth();
            int height = i8 + f0Var.itemView.getHeight();
            int left2 = i7 - f0Var.itemView.getLeft();
            int top2 = i8 - f0Var.itemView.getTop();
            int size = list.size();
            RecyclerView.f0 f0Var2 = null;
            int i9 = -1;
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.f0 f0Var3 = list.get(i10);
                if (left2 > 0 && (right = f0Var3.itemView.getRight() - width) < 0 && f0Var3.itemView.getRight() > f0Var.itemView.getRight() && (abs4 = Math.abs(right)) > i9) {
                    f0Var2 = f0Var3;
                    i9 = abs4;
                }
                if (left2 < 0 && (left = f0Var3.itemView.getLeft() - i7) > 0 && f0Var3.itemView.getLeft() < f0Var.itemView.getLeft() && (abs3 = Math.abs(left)) > i9) {
                    f0Var2 = f0Var3;
                    i9 = abs3;
                }
                if (top2 < 0 && (top = f0Var3.itemView.getTop() - i8) > 0 && f0Var3.itemView.getTop() < f0Var.itemView.getTop() && (abs2 = Math.abs(top)) > i9) {
                    f0Var2 = f0Var3;
                    i9 = abs2;
                }
                if (top2 > 0 && (bottom = f0Var3.itemView.getBottom() - height) < 0 && f0Var3.itemView.getBottom() > f0Var.itemView.getBottom() && (abs = Math.abs(bottom)) > i9) {
                    f0Var2 = f0Var3;
                    i9 = abs;
                }
            }
            return f0Var2;
        }

        public void c(@o0 RecyclerView recyclerView, @o0 RecyclerView.f0 f0Var) {
            o.f5573a.a(f0Var.itemView);
        }

        public int d(int i7, int i8) {
            int i9;
            int i10 = i7 & f5548d;
            if (i10 == 0) {
                return i7;
            }
            int i11 = i7 & (~i10);
            if (i8 == 0) {
                i9 = i10 >> 2;
            } else {
                int i12 = i10 >> 1;
                i11 |= (-3158065) & i12;
                i9 = (i12 & f5548d) >> 2;
            }
            return i11 | i9;
        }

        public final int f(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return d(l(recyclerView, f0Var), u1.Z(recyclerView));
        }

        public long g(@o0 RecyclerView recyclerView, int i7, float f7, float f8) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i7 == 8 ? 200L : 250L : i7 == 8 ? itemAnimator.o() : itemAnimator.p();
        }

        public int h() {
            return 0;
        }

        public final int j(RecyclerView recyclerView) {
            if (this.f5553a == -1) {
                this.f5553a = recyclerView.getResources().getDimensionPixelSize(a.c.f7855k);
            }
            return this.f5553a;
        }

        public float k(@o0 RecyclerView.f0 f0Var) {
            return 0.5f;
        }

        public abstract int l(@o0 RecyclerView recyclerView, @o0 RecyclerView.f0 f0Var);

        public float m(float f7) {
            return f7;
        }

        public float n(@o0 RecyclerView.f0 f0Var) {
            return 0.5f;
        }

        public float o(float f7) {
            return f7;
        }

        public boolean p(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return (f(recyclerView, f0Var) & m.W) != 0;
        }

        public boolean q(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return (f(recyclerView, f0Var) & 65280) != 0;
        }

        public int r(@o0 RecyclerView recyclerView, int i7, int i8, int i9, long j7) {
            int signum = (int) (((int) (((int) Math.signum(i8)) * j(recyclerView) * f5551g.getInterpolation(Math.min(1.0f, (Math.abs(i8) * 1.0f) / i7)))) * f5550f.getInterpolation(j7 <= f5552h ? ((float) j7) / 2000.0f : 1.0f));
            return signum == 0 ? i8 > 0 ? 1 : -1 : signum;
        }

        public boolean s() {
            return true;
        }

        public boolean t() {
            return true;
        }

        public void w(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 RecyclerView.f0 f0Var, float f7, float f8, int i7, boolean z6) {
            o.f5573a.d(canvas, recyclerView, f0Var.itemView, f7, f8, i7, z6);
        }

        public void x(@o0 Canvas canvas, @o0 RecyclerView recyclerView, RecyclerView.f0 f0Var, float f7, float f8, int i7, boolean z6) {
            o.f5573a.c(canvas, recyclerView, f0Var.itemView, f7, f8, i7, z6);
        }

        public void y(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, List<h> list, int i7, float f7, float f8) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                h hVar = list.get(i8);
                hVar.e();
                int save = canvas.save();
                w(canvas, recyclerView, hVar.f5560e, hVar.f5565j, hVar.f5566k, hVar.f5561f, false);
                canvas.restoreToCount(save);
            }
            if (f0Var != null) {
                int save2 = canvas.save();
                w(canvas, recyclerView, f0Var, f7, f8, i7, true);
                canvas.restoreToCount(save2);
            }
        }

        public void z(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, List<h> list, int i7, float f7, float f8) {
            int size = list.size();
            boolean z6 = false;
            for (int i8 = 0; i8 < size; i8++) {
                h hVar = list.get(i8);
                int save = canvas.save();
                x(canvas, recyclerView, hVar.f5560e, hVar.f5565j, hVar.f5566k, hVar.f5561f, false);
                canvas.restoreToCount(save);
            }
            if (f0Var != null) {
                int save2 = canvas.save();
                x(canvas, recyclerView, f0Var, f7, f8, i7, true);
                canvas.restoreToCount(save2);
            }
            for (int i9 = size - 1; i9 >= 0; i9--) {
                h hVar2 = list.get(i9);
                boolean z7 = hVar2.f5568m;
                if (z7 && !hVar2.f5564i) {
                    list.remove(i9);
                } else if (!z7) {
                    z6 = true;
                }
            }
            if (z6) {
                recyclerView.invalidate();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5554a = true;

        public g() {
        }

        public void a() {
            this.f5554a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View n7;
            RecyclerView.f0 childViewHolder;
            if (!this.f5554a || (n7 = m.this.n(motionEvent)) == null || (childViewHolder = m.this.f5528r.getChildViewHolder(n7)) == null) {
                return;
            }
            m mVar = m.this;
            if (mVar.f5523m.p(mVar.f5528r, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i7 = m.this.f5522l;
                if (pointerId == i7) {
                    int findPointerIndex = motionEvent.findPointerIndex(i7);
                    float x6 = motionEvent.getX(findPointerIndex);
                    float y6 = motionEvent.getY(findPointerIndex);
                    m mVar2 = m.this;
                    mVar2.f5514d = x6;
                    mVar2.f5515e = y6;
                    mVar2.f5519i = 0.0f;
                    mVar2.f5518h = 0.0f;
                    if (mVar2.f5523m.t()) {
                        m.this.z(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final float f5556a;

        /* renamed from: b  reason: collision with root package name */
        public final float f5557b;

        /* renamed from: c  reason: collision with root package name */
        public final float f5558c;

        /* renamed from: d  reason: collision with root package name */
        public final float f5559d;

        /* renamed from: e  reason: collision with root package name */
        public final RecyclerView.f0 f5560e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5561f;

        /* renamed from: g  reason: collision with root package name */
        public final ValueAnimator f5562g;

        /* renamed from: h  reason: collision with root package name */
        public final int f5563h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5564i;

        /* renamed from: j  reason: collision with root package name */
        public float f5565j;

        /* renamed from: k  reason: collision with root package name */
        public float f5566k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5567l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5568m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f5569n;

        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public h(RecyclerView.f0 f0Var, int i7, int i8, float f7, float f8, float f9, float f10) {
            this.f5561f = i8;
            this.f5563h = i7;
            this.f5560e = f0Var;
            this.f5556a = f7;
            this.f5557b = f8;
            this.f5558c = f9;
            this.f5559d = f10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f5562g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(f0Var.itemView);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f5562g.cancel();
        }

        public void b(long j7) {
            this.f5562g.setDuration(j7);
        }

        public void c(float f7) {
            this.f5569n = f7;
        }

        public void d() {
            this.f5560e.setIsRecyclable(false);
            this.f5562g.start();
        }

        public void e() {
            float f7 = this.f5556a;
            float f8 = this.f5558c;
            if (f7 == f8) {
                this.f5565j = this.f5560e.itemView.getTranslationX();
            } else {
                this.f5565j = f7 + (this.f5569n * (f8 - f7));
            }
            float f9 = this.f5557b;
            float f10 = this.f5559d;
            if (f9 == f10) {
                this.f5566k = this.f5560e.itemView.getTranslationY();
            } else {
                this.f5566k = f9 + (this.f5569n * (f10 - f9));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f5568m) {
                this.f5560e.setIsRecyclable(true);
            }
            this.f5568m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i extends f {

        /* renamed from: i  reason: collision with root package name */
        public int f5571i;

        /* renamed from: j  reason: collision with root package name */
        public int f5572j;

        public i(int i7, int i8) {
            this.f5571i = i8;
            this.f5572j = i7;
        }

        public int E(@o0 RecyclerView recyclerView, @o0 RecyclerView.f0 f0Var) {
            return this.f5572j;
        }

        public int F(@o0 RecyclerView recyclerView, @o0 RecyclerView.f0 f0Var) {
            return this.f5571i;
        }

        public void G(int i7) {
            this.f5572j = i7;
        }

        public void H(int i7) {
            this.f5571i = i7;
        }

        @Override // androidx.recyclerview.widget.m.f
        public int l(@o0 RecyclerView recyclerView, @o0 RecyclerView.f0 f0Var) {
            return f.v(E(recyclerView, f0Var), F(recyclerView, f0Var));
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        void prepareForDrop(@o0 View view, @o0 View view2, int i7, int i8);
    }

    public m(@o0 f fVar) {
        this.f5523m = fVar;
    }

    public static boolean s(View view, float f7, float f8, float f9, float f10) {
        return f7 >= f9 && f7 <= f9 + ((float) view.getWidth()) && f8 >= f10 && f8 <= f10 + ((float) view.getHeight());
    }

    public final void A() {
        this.f5527q = ViewConfiguration.get(this.f5528r.getContext()).getScaledTouchSlop();
        this.f5528r.addItemDecoration(this);
        this.f5528r.addOnItemTouchListener(this.B);
        this.f5528r.addOnChildAttachStateChangeListener(this);
        C();
    }

    public void B(@o0 RecyclerView.f0 f0Var) {
        if (!this.f5523m.p(this.f5528r, f0Var)) {
            Log.e(Q, "Start drag has been called but dragging is not enabled");
        } else if (f0Var.itemView.getParent() != this.f5528r) {
            Log.e(Q, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            u();
            this.f5519i = 0.0f;
            this.f5518h = 0.0f;
            z(f0Var, 2);
        }
    }

    public final void C() {
        this.A = new g();
        this.f5536z = new l0(this.f5528r.getContext(), this.A);
    }

    public void D(@o0 RecyclerView.f0 f0Var) {
        if (!this.f5523m.q(this.f5528r, f0Var)) {
            Log.e(Q, "Start swipe has been called but swiping is not enabled");
        } else if (f0Var.itemView.getParent() != this.f5528r) {
            Log.e(Q, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
        } else {
            u();
            this.f5519i = 0.0f;
            this.f5518h = 0.0f;
            z(f0Var, 1);
        }
    }

    public final void E() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.f5536z != null) {
            this.f5536z = null;
        }
    }

    public final int F(RecyclerView.f0 f0Var) {
        if (this.f5524n == 2) {
            return 0;
        }
        int l7 = this.f5523m.l(this.f5528r, f0Var);
        int d7 = (this.f5523m.d(l7, u1.Z(this.f5528r)) & 65280) >> 8;
        if (d7 == 0) {
            return 0;
        }
        int i7 = (l7 & 65280) >> 8;
        if (Math.abs(this.f5518h) > Math.abs(this.f5519i)) {
            int h7 = h(f0Var, d7);
            if (h7 > 0) {
                return (i7 & h7) == 0 ? f.e(h7, u1.Z(this.f5528r)) : h7;
            }
            int j7 = j(f0Var, d7);
            if (j7 > 0) {
                return j7;
            }
        } else {
            int j8 = j(f0Var, d7);
            if (j8 > 0) {
                return j8;
            }
            int h8 = h(f0Var, d7);
            if (h8 > 0) {
                return (i7 & h8) == 0 ? f.e(h8, u1.Z(this.f5528r)) : h8;
            }
        }
        return 0;
    }

    public void G(MotionEvent motionEvent, int i7, int i8) {
        float x6 = motionEvent.getX(i8);
        float y6 = motionEvent.getY(i8);
        float f7 = x6 - this.f5514d;
        this.f5518h = f7;
        this.f5519i = y6 - this.f5515e;
        if ((i7 & 4) == 0) {
            this.f5518h = Math.max(0.0f, f7);
        }
        if ((i7 & 8) == 0) {
            this.f5518h = Math.min(0.0f, this.f5518h);
        }
        if ((i7 & 1) == 0) {
            this.f5519i = Math.max(0.0f, this.f5519i);
        }
        if ((i7 & 2) == 0) {
            this.f5519i = Math.min(0.0f, this.f5519i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(@o0 View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d(@o0 View view) {
        x(view);
        RecyclerView.f0 childViewHolder = this.f5528r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.f0 f0Var = this.f5513c;
        if (f0Var != null && childViewHolder == f0Var) {
            z(null, 0);
            return;
        }
        l(childViewHolder, false);
        if (this.f5511a.remove(childViewHolder.itemView)) {
            this.f5523m.c(this.f5528r, childViewHolder);
        }
    }

    public final void f() {
    }

    public void g(@q0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5528r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            k();
        }
        this.f5528r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f5516f = resources.getDimension(a.c.f7857m);
            this.f5517g = resources.getDimension(a.c.f7856l);
            A();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        rect.setEmpty();
    }

    public final int h(RecyclerView.f0 f0Var, int i7) {
        if ((i7 & 12) != 0) {
            int i8 = this.f5518h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f5530t;
            if (velocityTracker != null && this.f5522l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f5523m.o(this.f5517g));
                float xVelocity = this.f5530t.getXVelocity(this.f5522l);
                float yVelocity = this.f5530t.getYVelocity(this.f5522l);
                int i9 = xVelocity <= 0.0f ? 4 : 8;
                float abs = Math.abs(xVelocity);
                if ((i9 & i7) != 0 && i8 == i9 && abs >= this.f5523m.m(this.f5516f) && abs > Math.abs(yVelocity)) {
                    return i9;
                }
            }
            float width = this.f5528r.getWidth() * this.f5523m.n(f0Var);
            if ((i7 & i8) == 0 || Math.abs(this.f5518h) <= width) {
                return 0;
            }
            return i8;
        }
        return 0;
    }

    public void i(int i7, MotionEvent motionEvent, int i8) {
        RecyclerView.f0 p6;
        int f7;
        if (this.f5513c != null || i7 != 2 || this.f5524n == 2 || !this.f5523m.s() || this.f5528r.getScrollState() == 1 || (p6 = p(motionEvent)) == null || (f7 = (this.f5523m.f(this.f5528r, p6) & 65280) >> 8) == 0) {
            return;
        }
        float x6 = motionEvent.getX(i8);
        float y6 = motionEvent.getY(i8);
        float f8 = x6 - this.f5514d;
        float f9 = y6 - this.f5515e;
        float abs = Math.abs(f8);
        float abs2 = Math.abs(f9);
        int i9 = this.f5527q;
        if (abs >= i9 || abs2 >= i9) {
            if (abs > abs2) {
                if (f8 < 0.0f && (f7 & 4) == 0) {
                    return;
                }
                if (f8 > 0.0f && (f7 & 8) == 0) {
                    return;
                }
            } else if (f9 < 0.0f && (f7 & 1) == 0) {
                return;
            } else {
                if (f9 > 0.0f && (f7 & 2) == 0) {
                    return;
                }
            }
            this.f5519i = 0.0f;
            this.f5518h = 0.0f;
            this.f5522l = motionEvent.getPointerId(0);
            z(p6, 1);
        }
    }

    public final int j(RecyclerView.f0 f0Var, int i7) {
        if ((i7 & 3) != 0) {
            int i8 = this.f5519i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f5530t;
            if (velocityTracker != null && this.f5522l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f5523m.o(this.f5517g));
                float xVelocity = this.f5530t.getXVelocity(this.f5522l);
                float yVelocity = this.f5530t.getYVelocity(this.f5522l);
                int i9 = yVelocity <= 0.0f ? 1 : 2;
                float abs = Math.abs(yVelocity);
                if ((i9 & i7) != 0 && i9 == i8 && abs >= this.f5523m.m(this.f5516f) && abs > Math.abs(xVelocity)) {
                    return i9;
                }
            }
            float height = this.f5528r.getHeight() * this.f5523m.n(f0Var);
            if ((i7 & i8) == 0 || Math.abs(this.f5519i) <= height) {
                return 0;
            }
            return i8;
        }
        return 0;
    }

    public final void k() {
        this.f5528r.removeItemDecoration(this);
        this.f5528r.removeOnItemTouchListener(this.B);
        this.f5528r.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f5526p.size() - 1; size >= 0; size--) {
            this.f5523m.c(this.f5528r, this.f5526p.get(0).f5560e);
        }
        this.f5526p.clear();
        this.f5534x = null;
        this.f5535y = -1;
        w();
        E();
    }

    public void l(RecyclerView.f0 f0Var, boolean z6) {
        for (int size = this.f5526p.size() - 1; size >= 0; size--) {
            h hVar = this.f5526p.get(size);
            if (hVar.f5560e == f0Var) {
                hVar.f5567l |= z6;
                if (!hVar.f5568m) {
                    hVar.a();
                }
                this.f5526p.remove(size);
                return;
            }
        }
    }

    public h m(MotionEvent motionEvent) {
        if (this.f5526p.isEmpty()) {
            return null;
        }
        View n7 = n(motionEvent);
        for (int size = this.f5526p.size() - 1; size >= 0; size--) {
            h hVar = this.f5526p.get(size);
            if (hVar.f5560e.itemView == n7) {
                return hVar;
            }
        }
        return null;
    }

    public View n(MotionEvent motionEvent) {
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        RecyclerView.f0 f0Var = this.f5513c;
        if (f0Var != null) {
            View view = f0Var.itemView;
            if (s(view, x6, y6, this.f5520j + this.f5518h, this.f5521k + this.f5519i)) {
                return view;
            }
        }
        for (int size = this.f5526p.size() - 1; size >= 0; size--) {
            h hVar = this.f5526p.get(size);
            View view2 = hVar.f5560e.itemView;
            if (s(view2, x6, y6, hVar.f5565j, hVar.f5566k)) {
                return view2;
            }
        }
        return this.f5528r.findChildViewUnder(x6, y6);
    }

    public final List<RecyclerView.f0> o(RecyclerView.f0 f0Var) {
        RecyclerView.f0 f0Var2 = f0Var;
        List<RecyclerView.f0> list = this.f5531u;
        if (list == null) {
            this.f5531u = new ArrayList();
            this.f5532v = new ArrayList();
        } else {
            list.clear();
            this.f5532v.clear();
        }
        int h7 = this.f5523m.h();
        int round = Math.round(this.f5520j + this.f5518h) - h7;
        int round2 = Math.round(this.f5521k + this.f5519i) - h7;
        int i7 = h7 * 2;
        int width = f0Var2.itemView.getWidth() + round + i7;
        int height = f0Var2.itemView.getHeight() + round2 + i7;
        int i8 = (round + width) / 2;
        int i9 = (round2 + height) / 2;
        RecyclerView.o layoutManager = this.f5528r.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = layoutManager.getChildAt(i10);
            if (childAt != f0Var2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.f0 childViewHolder = this.f5528r.getChildViewHolder(childAt);
                if (this.f5523m.a(this.f5528r, this.f5513c, childViewHolder)) {
                    int abs = Math.abs(i8 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int abs2 = Math.abs(i9 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i11 = (abs * abs) + (abs2 * abs2);
                    int size = this.f5531u.size();
                    int i12 = 0;
                    for (int i13 = 0; i13 < size && i11 > this.f5532v.get(i13).intValue(); i13++) {
                        i12++;
                    }
                    this.f5531u.add(i12, childViewHolder);
                    this.f5532v.add(i12, Integer.valueOf(i11));
                }
            }
            i10++;
            f0Var2 = f0Var;
        }
        return this.f5531u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        float f7;
        float f8;
        this.f5535y = -1;
        if (this.f5513c != null) {
            q(this.f5512b);
            float[] fArr = this.f5512b;
            float f9 = fArr[0];
            f8 = fArr[1];
            f7 = f9;
        } else {
            f7 = 0.0f;
            f8 = 0.0f;
        }
        this.f5523m.y(canvas, recyclerView, this.f5513c, this.f5526p, this.f5524n, f7, f8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        float f7;
        float f8;
        if (this.f5513c != null) {
            q(this.f5512b);
            float[] fArr = this.f5512b;
            float f9 = fArr[0];
            f8 = fArr[1];
            f7 = f9;
        } else {
            f7 = 0.0f;
            f8 = 0.0f;
        }
        this.f5523m.z(canvas, recyclerView, this.f5513c, this.f5526p, this.f5524n, f7, f8);
    }

    public final RecyclerView.f0 p(MotionEvent motionEvent) {
        View n7;
        RecyclerView.o layoutManager = this.f5528r.getLayoutManager();
        int i7 = this.f5522l;
        if (i7 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i7);
        float x6 = motionEvent.getX(findPointerIndex) - this.f5514d;
        float y6 = motionEvent.getY(findPointerIndex) - this.f5515e;
        float abs = Math.abs(x6);
        float abs2 = Math.abs(y6);
        int i8 = this.f5527q;
        if (abs >= i8 || abs2 >= i8) {
            if (abs <= abs2 || !layoutManager.canScrollHorizontally()) {
                if ((abs2 <= abs || !layoutManager.canScrollVertically()) && (n7 = n(motionEvent)) != null) {
                    return this.f5528r.getChildViewHolder(n7);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void q(float[] fArr) {
        if ((this.f5525o & 12) != 0) {
            fArr[0] = (this.f5520j + this.f5518h) - this.f5513c.itemView.getLeft();
        } else {
            fArr[0] = this.f5513c.itemView.getTranslationX();
        }
        if ((this.f5525o & 3) != 0) {
            fArr[1] = (this.f5521k + this.f5519i) - this.f5513c.itemView.getTop();
        } else {
            fArr[1] = this.f5513c.itemView.getTranslationY();
        }
    }

    public boolean r() {
        int size = this.f5526p.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!this.f5526p.get(i7).f5568m) {
                return true;
            }
        }
        return false;
    }

    public void t(RecyclerView.f0 f0Var) {
        if (!this.f5528r.isLayoutRequested() && this.f5524n == 2) {
            float k7 = this.f5523m.k(f0Var);
            int i7 = (int) (this.f5520j + this.f5518h);
            int i8 = (int) (this.f5521k + this.f5519i);
            if (Math.abs(i8 - f0Var.itemView.getTop()) >= f0Var.itemView.getHeight() * k7 || Math.abs(i7 - f0Var.itemView.getLeft()) >= f0Var.itemView.getWidth() * k7) {
                List<RecyclerView.f0> o6 = o(f0Var);
                if (o6.size() == 0) {
                    return;
                }
                RecyclerView.f0 b7 = this.f5523m.b(f0Var, o6, i7, i8);
                if (b7 == null) {
                    this.f5531u.clear();
                    this.f5532v.clear();
                    return;
                }
                int adapterPosition = b7.getAdapterPosition();
                int adapterPosition2 = f0Var.getAdapterPosition();
                if (this.f5523m.A(this.f5528r, f0Var, b7)) {
                    this.f5523m.B(this.f5528r, f0Var, adapterPosition2, b7, adapterPosition, i7, i8);
                }
            }
        }
    }

    public void u() {
        VelocityTracker velocityTracker = this.f5530t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f5530t = VelocityTracker.obtain();
    }

    public void v(h hVar, int i7) {
        this.f5528r.post(new d(hVar, i7));
    }

    public final void w() {
        VelocityTracker velocityTracker = this.f5530t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5530t = null;
        }
    }

    public void x(View view) {
        if (view == this.f5534x) {
            this.f5534x = null;
            if (this.f5533w != null) {
                this.f5528r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r1 > 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean y() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.y():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(@d.q0 androidx.recyclerview.widget.RecyclerView.f0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.z(androidx.recyclerview.widget.RecyclerView$f0, int):void");
    }
}
