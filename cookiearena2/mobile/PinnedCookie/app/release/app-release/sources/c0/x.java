package c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.k;
import androidx.core.widget.NestedScrollView;
import c0.s;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class x {
    public static final String G = "TouchResponse";
    public static final boolean H = false;
    public static final int I = 1000;
    public static final float J = 1.0E-7f;
    public static final float[][] K = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] L = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 3;
    public static final int Q = 4;
    public static final int R = 5;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = 4;
    public static final int X = 5;
    public static final int Y = 6;
    public static final int Z = 1;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f7785a0 = 2;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f7786b0 = 4;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f7787c0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f7788d0 = 1;
    public float A;
    public float B;
    public float C;
    public float D;
    public int E;
    public int F;

    /* renamed from: a  reason: collision with root package name */
    public int f7789a;

    /* renamed from: b  reason: collision with root package name */
    public int f7790b;

    /* renamed from: c  reason: collision with root package name */
    public int f7791c;

    /* renamed from: d  reason: collision with root package name */
    public int f7792d;

    /* renamed from: e  reason: collision with root package name */
    public int f7793e;

    /* renamed from: f  reason: collision with root package name */
    public int f7794f;

    /* renamed from: g  reason: collision with root package name */
    public float f7795g;

    /* renamed from: h  reason: collision with root package name */
    public float f7796h;

    /* renamed from: i  reason: collision with root package name */
    public float f7797i;

    /* renamed from: j  reason: collision with root package name */
    public float f7798j;

    /* renamed from: k  reason: collision with root package name */
    public int f7799k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7800l;

    /* renamed from: m  reason: collision with root package name */
    public float f7801m;

    /* renamed from: n  reason: collision with root package name */
    public float f7802n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7803o;

    /* renamed from: p  reason: collision with root package name */
    public float[] f7804p;

    /* renamed from: q  reason: collision with root package name */
    public int[] f7805q;

    /* renamed from: r  reason: collision with root package name */
    public float f7806r;

    /* renamed from: s  reason: collision with root package name */
    public float f7807s;

    /* renamed from: t  reason: collision with root package name */
    public final s f7808t;

    /* renamed from: u  reason: collision with root package name */
    public float f7809u;

    /* renamed from: v  reason: collision with root package name */
    public float f7810v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7811w;

    /* renamed from: x  reason: collision with root package name */
    public float f7812x;

    /* renamed from: y  reason: collision with root package name */
    public int f7813y;

    /* renamed from: z  reason: collision with root package name */
    public float f7814z;

    /* loaded from: classes.dex */
    public class a implements View.OnTouchListener {
        public a(final x this$0) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements NestedScrollView.c {
        public b(final x this$0) {
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView v6, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
        }
    }

    public x(Context context, s layout, XmlPullParser parser) {
        this.f7789a = 0;
        this.f7790b = 0;
        this.f7791c = 0;
        this.f7792d = -1;
        this.f7793e = -1;
        this.f7794f = -1;
        this.f7795g = 0.5f;
        this.f7796h = 0.5f;
        this.f7797i = 0.5f;
        this.f7798j = 0.5f;
        this.f7799k = -1;
        this.f7800l = false;
        this.f7801m = 0.0f;
        this.f7802n = 1.0f;
        this.f7803o = false;
        this.f7804p = new float[2];
        this.f7805q = new int[2];
        this.f7809u = 4.0f;
        this.f7810v = 1.2f;
        this.f7811w = true;
        this.f7812x = 1.0f;
        this.f7813y = 0;
        this.f7814z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.f7808t = layout;
        c(context, Xml.asAttributeSet(parser));
    }

    public void A(float lastTouchX, float lastTouchY) {
        this.f7806r = lastTouchX;
        this.f7807s = lastTouchY;
    }

    public void B(float acceleration) {
        this.f7810v = acceleration;
    }

    public void C(float velocity) {
        this.f7809u = velocity;
    }

    public void D(boolean rtl) {
        if (rtl) {
            float[][] fArr = L;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = K;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = L;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = K;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = K[this.f7789a];
        this.f7796h = fArr5[0];
        this.f7795g = fArr5[1];
        int i7 = this.f7790b;
        float[][] fArr6 = L;
        if (i7 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i7];
        this.f7801m = fArr7[0];
        this.f7802n = fArr7[1];
    }

    public void E(float x6, float y6) {
        this.f7796h = x6;
        this.f7795g = y6;
    }

    public void F(int touchUpMode) {
        this.f7791c = touchUpMode;
    }

    public void G(float lastTouchX, float lastTouchY) {
        this.f7806r = lastTouchX;
        this.f7807s = lastTouchY;
        this.f7803o = false;
    }

    public void H() {
        View view;
        int i7 = this.f7792d;
        if (i7 != -1) {
            view = this.f7808t.findViewById(i7);
            if (view == null) {
                Log.e(G, "cannot find TouchAnchorId @id/" + c.i(this.f7808t.getContext(), this.f7792d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a(this));
            nestedScrollView.setOnScrollChangeListener(new b(this));
        }
    }

    public float a(float dx, float dy) {
        return (dx * this.f7801m) + (dy * this.f7802n);
    }

    public final void b(TypedArray a7) {
        int indexCount = a7.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = a7.getIndex(i7);
            if (index == k.m.Qk) {
                this.f7792d = a7.getResourceId(index, this.f7792d);
            } else if (index == k.m.Rk) {
                int i8 = a7.getInt(index, this.f7789a);
                this.f7789a = i8;
                float[] fArr = K[i8];
                this.f7796h = fArr[0];
                this.f7795g = fArr[1];
            } else if (index == k.m.Bk) {
                int i9 = a7.getInt(index, this.f7790b);
                this.f7790b = i9;
                float[][] fArr2 = L;
                if (i9 < fArr2.length) {
                    float[] fArr3 = fArr2[i9];
                    this.f7801m = fArr3[0];
                    this.f7802n = fArr3[1];
                } else {
                    this.f7802n = Float.NaN;
                    this.f7801m = Float.NaN;
                    this.f7800l = true;
                }
            } else if (index == k.m.Gk) {
                this.f7809u = a7.getFloat(index, this.f7809u);
            } else if (index == k.m.Fk) {
                this.f7810v = a7.getFloat(index, this.f7810v);
            } else if (index == k.m.Hk) {
                this.f7811w = a7.getBoolean(index, this.f7811w);
            } else if (index == k.m.Ck) {
                this.f7812x = a7.getFloat(index, this.f7812x);
            } else if (index == k.m.Dk) {
                this.f7814z = a7.getFloat(index, this.f7814z);
            } else if (index == k.m.Sk) {
                this.f7793e = a7.getResourceId(index, this.f7793e);
            } else if (index == k.m.Jk) {
                this.f7791c = a7.getInt(index, this.f7791c);
            } else if (index == k.m.Ik) {
                this.f7813y = a7.getInteger(index, 0);
            } else if (index == k.m.Ek) {
                this.f7794f = a7.getResourceId(index, 0);
            } else if (index == k.m.Kk) {
                this.f7799k = a7.getResourceId(index, this.f7799k);
            } else if (index == k.m.Mk) {
                this.A = a7.getFloat(index, this.A);
            } else if (index == k.m.Nk) {
                this.B = a7.getFloat(index, this.B);
            } else if (index == k.m.Ok) {
                this.C = a7.getFloat(index, this.C);
            } else if (index == k.m.Pk) {
                this.D = a7.getFloat(index, this.D);
            } else if (index == k.m.Lk) {
                this.E = a7.getInt(index, this.E);
            } else if (index == k.m.Ak) {
                this.F = a7.getInt(index, this.F);
            }
        }
    }

    public final void c(Context context, AttributeSet attrs) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k.m.zk);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public int d() {
        return this.f7792d;
    }

    public int e() {
        return this.F;
    }

    public int f() {
        return this.f7813y;
    }

    public RectF g(ViewGroup layout, RectF rect) {
        View findViewById;
        int i7 = this.f7794f;
        if (i7 == -1 || (findViewById = layout.findViewById(i7)) == null) {
            return null;
        }
        rect.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rect;
    }

    public int h() {
        return this.f7794f;
    }

    public float i() {
        return this.f7810v;
    }

    public float j() {
        return this.f7809u;
    }

    public boolean k() {
        return this.f7811w;
    }

    public float l(float dx, float dy) {
        this.f7808t.Y(this.f7792d, this.f7808t.getProgress(), this.f7796h, this.f7795g, this.f7804p);
        float f7 = this.f7801m;
        if (f7 != 0.0f) {
            float[] fArr = this.f7804p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (dx * f7) / fArr[0];
        }
        float[] fArr2 = this.f7804p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (dy * this.f7802n) / fArr2[1];
    }

    public int m() {
        return this.E;
    }

    public float n() {
        return this.A;
    }

    public float o() {
        return this.B;
    }

    public float p() {
        return this.C;
    }

    public float q() {
        return this.D;
    }

    public RectF r(ViewGroup layout, RectF rect) {
        View findViewById;
        int i7 = this.f7793e;
        if (i7 == -1 || (findViewById = layout.findViewById(i7)) == null) {
            return null;
        }
        rect.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rect;
    }

    public int s() {
        return this.f7793e;
    }

    public boolean t() {
        return this.f7803o;
    }

    public String toString() {
        if (Float.isNaN(this.f7801m)) {
            return f.f7363i;
        }
        return this.f7801m + " , " + this.f7802n;
    }

    public void u(MotionEvent event, s.i velocityTracker, int currentState, u motionScene) {
        int i7;
        if (this.f7800l) {
            v(event, velocityTracker, currentState, motionScene);
            return;
        }
        velocityTracker.c(event);
        int action = event.getAction();
        if (action == 0) {
            this.f7806r = event.getRawX();
            this.f7807s = event.getRawY();
            this.f7803o = false;
        } else if (action == 1) {
            this.f7803o = false;
            velocityTracker.g(1000);
            float e7 = velocityTracker.e();
            float d7 = velocityTracker.d();
            float progress = this.f7808t.getProgress();
            int i8 = this.f7792d;
            if (i8 != -1) {
                this.f7808t.Y(i8, progress, this.f7796h, this.f7795g, this.f7804p);
            } else {
                float min = Math.min(this.f7808t.getWidth(), this.f7808t.getHeight());
                float[] fArr = this.f7804p;
                fArr[1] = this.f7802n * min;
                fArr[0] = min * this.f7801m;
            }
            float f7 = this.f7801m;
            float[] fArr2 = this.f7804p;
            float f8 = f7 != 0.0f ? e7 / fArr2[0] : d7 / fArr2[1];
            float f9 = !Float.isNaN(f8) ? (f8 / 3.0f) + progress : progress;
            if (f9 == 0.0f || f9 == 1.0f || (i7 = this.f7791c) == 3) {
                if (0.0f >= f9 || 1.0f <= f9) {
                    this.f7808t.setState(s.m.FINISHED);
                    return;
                }
                return;
            }
            float f10 = ((double) f9) < 0.5d ? 0.0f : 1.0f;
            if (i7 == 6) {
                if (progress + f8 < 0.0f) {
                    f8 = Math.abs(f8);
                }
                f10 = 1.0f;
            }
            if (this.f7791c == 7) {
                if (progress + f8 > 1.0f) {
                    f8 = -Math.abs(f8);
                }
                f10 = 0.0f;
            }
            this.f7808t.z0(this.f7791c, f10, f8);
            if (0.0f >= progress || 1.0f <= progress) {
                this.f7808t.setState(s.m.FINISHED);
            }
        } else if (action != 2) {
        } else {
            float rawY = event.getRawY() - this.f7807s;
            float rawX = event.getRawX() - this.f7806r;
            if (Math.abs((this.f7801m * rawX) + (this.f7802n * rawY)) > this.f7814z || this.f7803o) {
                float progress2 = this.f7808t.getProgress();
                if (!this.f7803o) {
                    this.f7803o = true;
                    this.f7808t.setProgress(progress2);
                }
                int i9 = this.f7792d;
                if (i9 != -1) {
                    this.f7808t.Y(i9, progress2, this.f7796h, this.f7795g, this.f7804p);
                } else {
                    float min2 = Math.min(this.f7808t.getWidth(), this.f7808t.getHeight());
                    float[] fArr3 = this.f7804p;
                    fArr3[1] = this.f7802n * min2;
                    fArr3[0] = min2 * this.f7801m;
                }
                float f11 = this.f7801m;
                float[] fArr4 = this.f7804p;
                if (Math.abs(((f11 * fArr4[0]) + (this.f7802n * fArr4[1])) * this.f7812x) < 0.01d) {
                    float[] fArr5 = this.f7804p;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                float max = Math.max(Math.min(progress2 + (this.f7801m != 0.0f ? rawX / this.f7804p[0] : rawY / this.f7804p[1]), 1.0f), 0.0f);
                if (this.f7791c == 6) {
                    max = Math.max(max, 0.01f);
                }
                if (this.f7791c == 7) {
                    max = Math.min(max, 0.99f);
                }
                float progress3 = this.f7808t.getProgress();
                if (max != progress3) {
                    int i10 = (progress3 > 0.0f ? 1 : (progress3 == 0.0f ? 0 : -1));
                    if (i10 == 0 || progress3 == 1.0f) {
                        this.f7808t.R(i10 == 0);
                    }
                    this.f7808t.setProgress(max);
                    velocityTracker.g(1000);
                    this.f7808t.f7584e = this.f7801m != 0.0f ? velocityTracker.e() / this.f7804p[0] : velocityTracker.d() / this.f7804p[1];
                } else {
                    this.f7808t.f7584e = 0.0f;
                }
                this.f7806r = event.getRawX();
                this.f7807s = event.getRawY();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(android.view.MotionEvent r24, c0.s.i r25, int r26, c0.u r27) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.x.v(android.view.MotionEvent, c0.s$i, int, c0.u):void");
    }

    public void w(float dx, float dy) {
        float progress = this.f7808t.getProgress();
        if (!this.f7803o) {
            this.f7803o = true;
            this.f7808t.setProgress(progress);
        }
        this.f7808t.Y(this.f7792d, progress, this.f7796h, this.f7795g, this.f7804p);
        float f7 = this.f7801m;
        float[] fArr = this.f7804p;
        if (Math.abs((f7 * fArr[0]) + (this.f7802n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f7804p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f8 = this.f7801m;
        float max = Math.max(Math.min(progress + (f8 != 0.0f ? (dx * f8) / this.f7804p[0] : (dy * this.f7802n) / this.f7804p[1]), 1.0f), 0.0f);
        if (max != this.f7808t.getProgress()) {
            this.f7808t.setProgress(max);
        }
    }

    public void x(float dx, float dy) {
        this.f7803o = false;
        float progress = this.f7808t.getProgress();
        this.f7808t.Y(this.f7792d, progress, this.f7796h, this.f7795g, this.f7804p);
        float f7 = this.f7801m;
        float[] fArr = this.f7804p;
        float f8 = f7 != 0.0f ? (dx * f7) / fArr[0] : (dy * this.f7802n) / fArr[1];
        if (!Float.isNaN(f8)) {
            progress += f8 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z6 = progress != 1.0f;
            int i7 = this.f7791c;
            if ((i7 != 3) && z6) {
                this.f7808t.z0(i7, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f8);
            }
        }
    }

    public void y(int id) {
        this.f7792d = id;
    }

    public void z(int autoCompleteMode) {
        this.F = autoCompleteMode;
    }

    public x(s layout, v onSwipe) {
        this.f7789a = 0;
        this.f7790b = 0;
        this.f7791c = 0;
        this.f7792d = -1;
        this.f7793e = -1;
        this.f7794f = -1;
        this.f7795g = 0.5f;
        this.f7796h = 0.5f;
        this.f7797i = 0.5f;
        this.f7798j = 0.5f;
        this.f7799k = -1;
        this.f7800l = false;
        this.f7801m = 0.0f;
        this.f7802n = 1.0f;
        this.f7803o = false;
        this.f7804p = new float[2];
        this.f7805q = new int[2];
        this.f7809u = 4.0f;
        this.f7810v = 1.2f;
        this.f7811w = true;
        this.f7812x = 1.0f;
        this.f7813y = 0;
        this.f7814z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.f7808t = layout;
        this.f7792d = onSwipe.q();
        int r6 = onSwipe.r();
        this.f7789a = r6;
        if (r6 != -1) {
            float[] fArr = K[r6];
            this.f7796h = fArr[0];
            this.f7795g = fArr[1];
        }
        int b7 = onSwipe.b();
        this.f7790b = b7;
        float[][] fArr2 = L;
        if (b7 < fArr2.length) {
            float[] fArr3 = fArr2[b7];
            this.f7801m = fArr3[0];
            this.f7802n = fArr3[1];
        } else {
            this.f7802n = Float.NaN;
            this.f7801m = Float.NaN;
            this.f7800l = true;
        }
        this.f7809u = onSwipe.g();
        this.f7810v = onSwipe.f();
        this.f7811w = onSwipe.h();
        this.f7812x = onSwipe.c();
        this.f7814z = onSwipe.d();
        this.f7793e = onSwipe.s();
        this.f7791c = onSwipe.j();
        this.f7813y = onSwipe.i();
        this.f7794f = onSwipe.e();
        this.f7799k = onSwipe.k();
        this.E = onSwipe.l();
        this.A = onSwipe.m();
        this.B = onSwipe.n();
        this.C = onSwipe.o();
        this.D = onSwipe.p();
        this.F = onSwipe.a();
    }
}
