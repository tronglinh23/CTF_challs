package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.k;
import c0.p;
import c0.s;
import c0.u;
import d.w0;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b extends p {
    public static final boolean I = false;
    public static final String J = "Carousel";
    public static final int K = 1;
    public static final int L = 2;
    public int A;
    public int B;
    public int C;
    public float D;
    public int E;
    public int F;
    public int G;
    public Runnable H;

    /* renamed from: o  reason: collision with root package name */
    public InterfaceC0001b f9o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<View> f10p;

    /* renamed from: q  reason: collision with root package name */
    public int f11q;

    /* renamed from: r  reason: collision with root package name */
    public int f12r;

    /* renamed from: s  reason: collision with root package name */
    public s f13s;

    /* renamed from: t  reason: collision with root package name */
    public int f14t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15u;

    /* renamed from: v  reason: collision with root package name */
    public int f16v;

    /* renamed from: w  reason: collision with root package name */
    public int f17w;

    /* renamed from: x  reason: collision with root package name */
    public int f18x;

    /* renamed from: y  reason: collision with root package name */
    public int f19y;

    /* renamed from: z  reason: collision with root package name */
    public float f20z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a0.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0000a implements Runnable {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ float f22k;

            public RunnableC0000a(final float val$v) {
                this.f22k = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f13s.z0(5, 1.0f, this.f22k);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f13s.setProgress(0.0f);
            b.this.a0();
            b.this.f9o.b(b.this.f12r);
            float velocity = b.this.f13s.getVelocity();
            if (b.this.C != 2 || velocity <= b.this.D || b.this.f12r >= b.this.f9o.count() - 1) {
                return;
            }
            float f7 = velocity * b.this.f20z;
            if (b.this.f12r != 0 || b.this.f11q <= b.this.f12r) {
                if (b.this.f12r != b.this.f9o.count() - 1 || b.this.f11q >= b.this.f12r) {
                    b.this.f13s.post(new RunnableC0000a(f7));
                }
            }
        }
    }

    /* renamed from: a0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0001b {
        void a(View view, int index);

        void b(int index);

        int count();
    }

    public b(Context context) {
        super(context);
        this.f9o = null;
        this.f10p = new ArrayList<>();
        this.f11q = 0;
        this.f12r = 0;
        this.f14t = -1;
        this.f15u = false;
        this.f16v = -1;
        this.f17w = -1;
        this.f18x = -1;
        this.f19y = -1;
        this.f20z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X() {
        this.f13s.setTransitionDuration(this.F);
        if (this.E < this.f12r) {
            this.f13s.F0(this.f18x, this.F);
        } else {
            this.f13s.F0(this.f19y, this.F);
        }
    }

    public final void T(boolean enable) {
        Iterator<u.b> it = this.f13s.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().Q(enable);
        }
    }

    public final boolean U(int transitionID, boolean enable) {
        s sVar;
        u.b d02;
        if (transitionID == -1 || (sVar = this.f13s) == null || (d02 = sVar.d0(transitionID)) == null || enable == d02.K()) {
            return false;
        }
        d02.Q(enable);
        return true;
    }

    public final void V(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k.m.G3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.J3) {
                    this.f14t = obtainStyledAttributes.getResourceId(index, this.f14t);
                } else if (index == k.m.H3) {
                    this.f16v = obtainStyledAttributes.getResourceId(index, this.f16v);
                } else if (index == k.m.K3) {
                    this.f17w = obtainStyledAttributes.getResourceId(index, this.f17w);
                } else if (index == k.m.I3) {
                    this.B = obtainStyledAttributes.getInt(index, this.B);
                } else if (index == k.m.N3) {
                    this.f18x = obtainStyledAttributes.getResourceId(index, this.f18x);
                } else if (index == k.m.M3) {
                    this.f19y = obtainStyledAttributes.getResourceId(index, this.f19y);
                } else if (index == k.m.P3) {
                    this.f20z = obtainStyledAttributes.getFloat(index, this.f20z);
                } else if (index == k.m.O3) {
                    this.C = obtainStyledAttributes.getInt(index, this.C);
                } else if (index == k.m.Q3) {
                    this.D = obtainStyledAttributes.getFloat(index, this.D);
                } else if (index == k.m.L3) {
                    this.f15u = obtainStyledAttributes.getBoolean(index, this.f15u);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void W(int index) {
        this.f12r = Math.max(0, Math.min(getCount() - 1, index));
        Y();
    }

    public void Y() {
        int size = this.f10p.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = this.f10p.get(i7);
            if (this.f9o.count() == 0) {
                c0(view, this.B);
            } else {
                c0(view, 0);
            }
        }
        this.f13s.r0();
        a0();
    }

    public void Z(int index, int delay) {
        this.E = Math.max(0, Math.min(getCount() - 1, index));
        int max = Math.max(0, delay);
        this.F = max;
        this.f13s.setTransitionDuration(max);
        if (index < this.f12r) {
            this.f13s.F0(this.f18x, this.F);
        } else {
            this.f13s.F0(this.f19y, this.F);
        }
    }

    public final void a0() {
        InterfaceC0001b interfaceC0001b = this.f9o;
        if (interfaceC0001b == null || this.f13s == null || interfaceC0001b.count() == 0) {
            return;
        }
        int size = this.f10p.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = this.f10p.get(i7);
            int i8 = (this.f12r + i7) - this.A;
            if (this.f15u) {
                if (i8 < 0) {
                    int i9 = this.B;
                    if (i9 != 4) {
                        c0(view, i9);
                    } else {
                        c0(view, 0);
                    }
                    if (i8 % this.f9o.count() == 0) {
                        this.f9o.a(view, 0);
                    } else {
                        InterfaceC0001b interfaceC0001b2 = this.f9o;
                        interfaceC0001b2.a(view, interfaceC0001b2.count() + (i8 % this.f9o.count()));
                    }
                } else if (i8 >= this.f9o.count()) {
                    if (i8 == this.f9o.count()) {
                        i8 = 0;
                    } else if (i8 > this.f9o.count()) {
                        i8 %= this.f9o.count();
                    }
                    int i10 = this.B;
                    if (i10 != 4) {
                        c0(view, i10);
                    } else {
                        c0(view, 0);
                    }
                    this.f9o.a(view, i8);
                } else {
                    c0(view, 0);
                    this.f9o.a(view, i8);
                }
            } else if (i8 < 0) {
                c0(view, this.B);
            } else if (i8 >= this.f9o.count()) {
                c0(view, this.B);
            } else {
                c0(view, 0);
                this.f9o.a(view, i8);
            }
        }
        int i11 = this.E;
        if (i11 != -1 && i11 != this.f12r) {
            this.f13s.post(new Runnable() { // from class: a0.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.X();
                }
            });
        } else if (i11 == this.f12r) {
            this.E = -1;
        }
        if (this.f16v == -1 || this.f17w == -1) {
            Log.w(J, "No backward or forward transitions defined for Carousel!");
        } else if (!this.f15u) {
            int count = this.f9o.count();
            if (this.f12r == 0) {
                U(this.f16v, false);
            } else {
                U(this.f16v, true);
                this.f13s.setTransition(this.f16v);
            }
            if (this.f12r == count - 1) {
                U(this.f17w, false);
                return;
            }
            U(this.f17w, true);
            this.f13s.setTransition(this.f17w);
        }
    }

    public final boolean b0(int constraintSetId, View view, int visibility) {
        e.a k02;
        androidx.constraintlayout.widget.e Z = this.f13s.Z(constraintSetId);
        if (Z == null || (k02 = Z.k0(view.getId())) == null) {
            return false;
        }
        k02.f2265c.f2393c = 1;
        view.setVisibility(visibility);
        return true;
    }

    public final boolean c0(View view, int visibility) {
        s sVar = this.f13s;
        if (sVar == null) {
            return false;
        }
        boolean z6 = false;
        for (int i7 : sVar.getConstraintSetIds()) {
            z6 |= b0(i7, view, visibility);
        }
        return z6;
    }

    @Override // c0.p, c0.s.l
    public void d(s motionLayout, int startId, int endId, float progress) {
        this.G = startId;
    }

    public int getCount() {
        InterfaceC0001b interfaceC0001b = this.f9o;
        if (interfaceC0001b != null) {
            return interfaceC0001b.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f12r;
    }

    @Override // c0.p, c0.s.l
    public void h(s motionLayout, int currentId) {
        int i7 = this.f12r;
        this.f11q = i7;
        if (currentId == this.f19y) {
            this.f12r = i7 + 1;
        } else if (currentId == this.f18x) {
            this.f12r = i7 - 1;
        }
        if (this.f15u) {
            if (this.f12r >= this.f9o.count()) {
                this.f12r = 0;
            }
            if (this.f12r < 0) {
                this.f12r = this.f9o.count() - 1;
            }
        } else {
            if (this.f12r >= this.f9o.count()) {
                this.f12r = this.f9o.count() - 1;
            }
            if (this.f12r < 0) {
                this.f12r = 0;
            }
        }
        if (this.f11q != this.f12r) {
            this.f13s.post(this.H);
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @w0(api = 17)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof s) {
            s sVar = (s) getParent();
            for (int i7 = 0; i7 < this.f2142c; i7++) {
                int i8 = this.f2141b[i7];
                View viewById = sVar.getViewById(i8);
                if (this.f14t == i8) {
                    this.A = i7;
                }
                this.f10p.add(viewById);
            }
            this.f13s = sVar;
            if (this.C == 2) {
                u.b d02 = sVar.d0(this.f17w);
                if (d02 != null) {
                    d02.U(5);
                }
                u.b d03 = this.f13s.d0(this.f16v);
                if (d03 != null) {
                    d03.U(5);
                }
            }
            a0();
        }
    }

    public void setAdapter(InterfaceC0001b adapter) {
        this.f9o = adapter;
    }

    public b(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f9o = null;
        this.f10p = new ArrayList<>();
        this.f11q = 0;
        this.f12r = 0;
        this.f14t = -1;
        this.f15u = false;
        this.f16v = -1;
        this.f17w = -1;
        this.f18x = -1;
        this.f19y = -1;
        this.f20z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new a();
        V(context, attrs);
    }

    public b(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f9o = null;
        this.f10p = new ArrayList<>();
        this.f11q = 0;
        this.f12r = 0;
        this.f14t = -1;
        this.f15u = false;
        this.f16v = -1;
        this.f17w = -1;
        this.f18x = -1;
        this.f19y = -1;
        this.f20z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new a();
        V(context, attrs);
    }
}
