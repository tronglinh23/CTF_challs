package k1;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.u1;
import d.o0;
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int A = 1;
    public static final int B = 315;
    public static final int C = 1575;
    public static final float D = Float.MAX_VALUE;
    public static final float E = 0.2f;
    public static final float F = 1.0f;
    public static final int G = ViewConfiguration.getTapTimeout();
    public static final int H = 500;
    public static final int I = 500;

    /* renamed from: s  reason: collision with root package name */
    public static final float f11531s = 0.0f;

    /* renamed from: t  reason: collision with root package name */
    public static final float f11532t = Float.MAX_VALUE;

    /* renamed from: u  reason: collision with root package name */
    public static final float f11533u = 0.0f;

    /* renamed from: v  reason: collision with root package name */
    public static final int f11534v = 0;

    /* renamed from: w  reason: collision with root package name */
    public static final int f11535w = 1;

    /* renamed from: x  reason: collision with root package name */
    public static final int f11536x = 2;

    /* renamed from: y  reason: collision with root package name */
    public static final int f11537y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final int f11538z = 1;

    /* renamed from: d  reason: collision with root package name */
    public final View f11541d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f11542e;

    /* renamed from: h  reason: collision with root package name */
    public int f11545h;

    /* renamed from: i  reason: collision with root package name */
    public int f11546i;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11550m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11551n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11552o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11553p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11554q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11555r;

    /* renamed from: b  reason: collision with root package name */
    public final C0137a f11539b = new C0137a();

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f11540c = new AccelerateInterpolator();

    /* renamed from: f  reason: collision with root package name */
    public float[] f11543f = {0.0f, 0.0f};

    /* renamed from: g  reason: collision with root package name */
    public float[] f11544g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j  reason: collision with root package name */
    public float[] f11547j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    public float[] f11548k = {0.0f, 0.0f};

    /* renamed from: l  reason: collision with root package name */
    public float[] f11549l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: k1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0137a {

        /* renamed from: a  reason: collision with root package name */
        public int f11556a;

        /* renamed from: b  reason: collision with root package name */
        public int f11557b;

        /* renamed from: c  reason: collision with root package name */
        public float f11558c;

        /* renamed from: d  reason: collision with root package name */
        public float f11559d;

        /* renamed from: j  reason: collision with root package name */
        public float f11565j;

        /* renamed from: k  reason: collision with root package name */
        public int f11566k;

        /* renamed from: e  reason: collision with root package name */
        public long f11560e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        public long f11564i = -1;

        /* renamed from: f  reason: collision with root package name */
        public long f11561f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f11562g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f11563h = 0;

        public void a() {
            if (this.f11561f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g7 = g(e(currentAnimationTimeMillis));
            long j7 = currentAnimationTimeMillis - this.f11561f;
            this.f11561f = currentAnimationTimeMillis;
            float f7 = ((float) j7) * g7;
            this.f11562g = (int) (this.f11558c * f7);
            this.f11563h = (int) (f7 * this.f11559d);
        }

        public int b() {
            return this.f11562g;
        }

        public int c() {
            return this.f11563h;
        }

        public int d() {
            float f7 = this.f11558c;
            return (int) (f7 / Math.abs(f7));
        }

        public final float e(long j7) {
            long j8 = this.f11560e;
            if (j7 < j8) {
                return 0.0f;
            }
            long j9 = this.f11564i;
            if (j9 < 0 || j7 < j9) {
                return a.e(((float) (j7 - j8)) / this.f11556a, 0.0f, 1.0f) * 0.5f;
            }
            float f7 = this.f11565j;
            return (1.0f - f7) + (f7 * a.e(((float) (j7 - j9)) / this.f11566k, 0.0f, 1.0f));
        }

        public int f() {
            float f7 = this.f11559d;
            return (int) (f7 / Math.abs(f7));
        }

        public final float g(float f7) {
            return ((-4.0f) * f7 * f7) + (f7 * 4.0f);
        }

        public boolean h() {
            return this.f11564i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f11564i + ((long) this.f11566k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f11566k = a.f((int) (currentAnimationTimeMillis - this.f11560e), 0, this.f11557b);
            this.f11565j = e(currentAnimationTimeMillis);
            this.f11564i = currentAnimationTimeMillis;
        }

        public void j(int i7) {
            this.f11557b = i7;
        }

        public void k(int i7) {
            this.f11556a = i7;
        }

        public void l(float f7, float f8) {
            this.f11558c = f7;
            this.f11559d = f8;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f11560e = currentAnimationTimeMillis;
            this.f11564i = -1L;
            this.f11561f = currentAnimationTimeMillis;
            this.f11565j = 0.5f;
            this.f11562g = 0;
            this.f11563h = 0;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f11553p) {
                if (aVar.f11551n) {
                    aVar.f11551n = false;
                    aVar.f11539b.m();
                }
                C0137a c0137a = a.this.f11539b;
                if (c0137a.h() || !a.this.x()) {
                    a.this.f11553p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f11552o) {
                    aVar2.f11552o = false;
                    aVar2.c();
                }
                c0137a.a();
                a.this.l(c0137a.b(), c0137a.c());
                u1.p1(a.this.f11541d, this);
            }
        }
    }

    public a(@o0 View view) {
        this.f11541d = view;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = (int) ((1575.0f * f7) + 0.5f);
        r(f8, f8);
        float f9 = (int) ((f7 * 315.0f) + 0.5f);
        s(f9, f9);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(0.2f, 0.2f);
        w(1.0f, 1.0f);
        m(G);
        u(500);
        t(500);
    }

    public static float e(float f7, float f8, float f9) {
        return f7 > f9 ? f9 : f7 < f8 ? f8 : f7;
    }

    public static int f(int i7, int i8, int i9) {
        return i7 > i9 ? i9 : i7 < i8 ? i8 : i7;
    }

    public abstract boolean a(int i7);

    public abstract boolean b(int i7);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f11541d.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i7, float f7, float f8, float f9) {
        float h7 = h(this.f11543f[i7], f8, this.f11544g[i7], f7);
        int i8 = (h7 > 0.0f ? 1 : (h7 == 0.0f ? 0 : -1));
        if (i8 == 0) {
            return 0.0f;
        }
        float f10 = this.f11547j[i7];
        float f11 = this.f11548k[i7];
        float f12 = this.f11549l[i7];
        float f13 = f10 * f9;
        return i8 > 0 ? e(h7 * f13, f11, f12) : -e((-h7) * f13, f11, f12);
    }

    public final float g(float f7, float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f11545h;
        if (i7 == 0 || i7 == 1) {
            if (f7 < f8) {
                if (f7 >= 0.0f) {
                    return 1.0f - (f7 / f8);
                }
                if (this.f11553p && i7 == 1) {
                    return 1.0f;
                }
            }
        } else if (i7 == 2 && f7 < 0.0f) {
            return f7 / (-f8);
        }
        return 0.0f;
    }

    public final float h(float f7, float f8, float f9, float f10) {
        float interpolation;
        float e7 = e(f7 * f8, 0.0f, f9);
        float g7 = g(f8 - f10, e7) - g(f10, e7);
        if (g7 < 0.0f) {
            interpolation = -this.f11540c.getInterpolation(-g7);
        } else if (g7 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f11540c.getInterpolation(g7);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public boolean i() {
        return this.f11554q;
    }

    public boolean j() {
        return this.f11555r;
    }

    public final void k() {
        if (this.f11551n) {
            this.f11553p = false;
        } else {
            this.f11539b.i();
        }
    }

    public abstract void l(int i7, int i8);

    @o0
    public a m(int i7) {
        this.f11546i = i7;
        return this;
    }

    @o0
    public a n(int i7) {
        this.f11545h = i7;
        return this;
    }

    public a o(boolean z6) {
        if (this.f11554q && !z6) {
            k();
        }
        this.f11554q = z6;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f11554q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.k()
            goto L58
        L1a:
            r5.f11552o = r2
            r5.f11550m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f11541d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f11541d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            k1.a$a r7 = r5.f11539b
            r7.l(r0, r6)
            boolean r6 = r5.f11553p
            if (r6 != 0) goto L58
            boolean r6 = r5.x()
            if (r6 == 0) goto L58
            r5.y()
        L58:
            boolean r6 = r5.f11555r
            if (r6 == 0) goto L61
            boolean r6 = r5.f11553p
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(boolean z6) {
        this.f11555r = z6;
        return this;
    }

    @o0
    public a q(float f7, float f8) {
        float[] fArr = this.f11544g;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    @o0
    public a r(float f7, float f8) {
        float[] fArr = this.f11549l;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    @o0
    public a s(float f7, float f8) {
        float[] fArr = this.f11548k;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    @o0
    public a t(int i7) {
        this.f11539b.j(i7);
        return this;
    }

    @o0
    public a u(int i7) {
        this.f11539b.k(i7);
        return this;
    }

    @o0
    public a v(float f7, float f8) {
        float[] fArr = this.f11543f;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    @o0
    public a w(float f7, float f8) {
        float[] fArr = this.f11547j;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    public boolean x() {
        C0137a c0137a = this.f11539b;
        int f7 = c0137a.f();
        int d7 = c0137a.d();
        return (f7 != 0 && b(f7)) || (d7 != 0 && a(d7));
    }

    public final void y() {
        int i7;
        if (this.f11542e == null) {
            this.f11542e = new b();
        }
        this.f11553p = true;
        this.f11551n = true;
        if (this.f11550m || (i7 = this.f11546i) <= 0) {
            this.f11542e.run();
        } else {
            u1.q1(this.f11541d, this.f11542e, i7);
        }
        this.f11550m = true;
    }
}
