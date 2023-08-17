package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.g1;
import d.b1;
import f.a;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final String f1690b = "AppCompatDrawableManag";

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f1691c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final PorterDuff.Mode f1692d = PorterDuff.Mode.SRC_IN;

    /* renamed from: e  reason: collision with root package name */
    public static l f1693e;

    /* renamed from: a  reason: collision with root package name */
    public g1 f1694a;

    /* loaded from: classes.dex */
    public class a implements g1.f {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f1695a = {a.f.f9128y0, a.f.f9124w0, a.f.f9079a};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1696b = {a.f.f9127y, a.f.f9094h0, a.f.F, a.f.A, a.f.B, a.f.E, a.f.D};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f1697c = {a.f.f9122v0, a.f.f9126x0, a.f.f9113r, a.f.f9114r0, a.f.f9116s0, a.f.f9118t0, a.f.f9120u0};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f1698d = {a.f.X, a.f.f9109p, a.f.W};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f1699e = {a.f.f9110p0, a.f.f9130z0};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f1700f = {a.f.f9085d, a.f.f9097j, a.f.f9087e, a.f.f9099k};

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[RETURN] */
        @Override // androidx.appcompat.widget.g1.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(@d.o0 android.content.Context r8, int r9, @d.o0 android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.l.a()
                int[] r1 = r7.f1695a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = f.a.b.H0
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f1697c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = f.a.b.F0
                goto L11
            L20:
                int[] r1 = r7.f1698d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = f.a.f.L
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = f.a.f.f9117t
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = androidx.appcompat.widget.q0.a(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = androidx.appcompat.widget.o1.d(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.l.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.g1.f
        public PorterDuff.Mode b(int i7) {
            if (i7 == a.f.f9106n0) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.g1.f
        public Drawable c(@d.o0 g1 g1Var, @d.o0 Context context, int i7) {
            if (i7 == a.f.f9111q) {
                return new LayerDrawable(new Drawable[]{g1Var.j(context, a.f.f9109p), g1Var.j(context, a.f.f9113r)});
            }
            if (i7 == a.f.Z) {
                return l(g1Var, context, a.e.f9042h0);
            }
            if (i7 == a.f.Y) {
                return l(g1Var, context, a.e.f9044i0);
            }
            if (i7 == a.f.f9080a0) {
                return l(g1Var, context, a.e.f9046j0);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.g1.f
        public ColorStateList d(@d.o0 Context context, int i7) {
            if (i7 == a.f.f9119u) {
                return g.a.a(context, a.d.f9017v);
            }
            if (i7 == a.f.f9108o0) {
                return g.a.a(context, a.d.f9023y);
            }
            if (i7 == a.f.f9106n0) {
                return k(context);
            }
            if (i7 == a.f.f9095i) {
                return j(context);
            }
            if (i7 == a.f.f9083c) {
                return g(context);
            }
            if (i7 == a.f.f9093h) {
                return i(context);
            }
            if (i7 == a.f.f9098j0 || i7 == a.f.f9100k0) {
                return g.a.a(context, a.d.f9021x);
            }
            if (f(this.f1696b, i7)) {
                return o1.f(context, a.b.H0);
            }
            if (f(this.f1699e, i7)) {
                return g.a.a(context, a.d.f9015u);
            }
            if (f(this.f1700f, i7)) {
                return g.a.a(context, a.d.f9013t);
            }
            if (i7 == a.f.f9092g0) {
                return g.a.a(context, a.d.f9019w);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.g1.f
        public boolean e(@d.o0 Context context, int i7, @d.o0 Drawable drawable) {
            if (i7 == a.f.f9096i0) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(16908288), o1.d(context, a.b.H0), l.f1692d);
                m(layerDrawable.findDrawableByLayerId(16908303), o1.d(context, a.b.H0), l.f1692d);
                m(layerDrawable.findDrawableByLayerId(16908301), o1.d(context, a.b.F0), l.f1692d);
                return true;
            } else if (i7 == a.f.Z || i7 == a.f.Y || i7 == a.f.f9080a0) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), o1.c(context, a.b.H0), l.f1692d);
                m(layerDrawable2.findDrawableByLayerId(16908303), o1.d(context, a.b.F0), l.f1692d);
                m(layerDrawable2.findDrawableByLayerId(16908301), o1.d(context, a.b.F0), l.f1692d);
                return true;
            } else {
                return false;
            }
        }

        public final boolean f(int[] iArr, int i7) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(@d.o0 Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(@d.o0 Context context, @d.l int i7) {
            int d7 = o1.d(context, a.b.G0);
            return new ColorStateList(new int[][]{o1.f1735c, o1.f1738f, o1.f1736d, o1.f1742j}, new int[]{o1.c(context, a.b.E0), p0.p0.t(d7, i7), p0.p0.t(d7, i7), i7});
        }

        public final ColorStateList i(@d.o0 Context context) {
            return h(context, o1.d(context, a.b.C0));
        }

        public final ColorStateList j(@d.o0 Context context) {
            return h(context, o1.d(context, a.b.E0));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList f7 = o1.f(context, a.b.L0);
            if (f7 == null || !f7.isStateful()) {
                iArr[0] = o1.f1735c;
                iArr2[0] = o1.c(context, a.b.L0);
                iArr[1] = o1.f1739g;
                iArr2[1] = o1.d(context, a.b.F0);
                iArr[2] = o1.f1742j;
                iArr2[2] = o1.d(context, a.b.L0);
            } else {
                int[] iArr3 = o1.f1735c;
                iArr[0] = iArr3;
                iArr2[0] = f7.getColorForState(iArr3, 0);
                iArr[1] = o1.f1739g;
                iArr2[1] = o1.d(context, a.b.F0);
                iArr[2] = o1.f1742j;
                iArr2[2] = f7.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(@d.o0 g1 g1Var, @d.o0 Context context, @d.q int i7) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
            Drawable j7 = g1Var.j(context, a.f.f9102l0);
            Drawable j8 = g1Var.j(context, a.f.f9104m0);
            if ((j7 instanceof BitmapDrawable) && j7.getIntrinsicWidth() == dimensionPixelSize && j7.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j7;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j7.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j7.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j8 instanceof BitmapDrawable) && j8.getIntrinsicWidth() == dimensionPixelSize && j8.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j8;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j8.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j8.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i7, PorterDuff.Mode mode) {
            if (q0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = l.f1692d;
            }
            drawable.setColorFilter(l.e(i7, mode));
        }
    }

    public static synchronized l b() {
        l lVar;
        synchronized (l.class) {
            if (f1693e == null) {
                i();
            }
            lVar = f1693e;
        }
        return lVar;
    }

    public static synchronized PorterDuffColorFilter e(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter l7;
        synchronized (l.class) {
            l7 = g1.l(i7, mode);
        }
        return l7;
    }

    public static synchronized void i() {
        synchronized (l.class) {
            if (f1693e == null) {
                l lVar = new l();
                f1693e = lVar;
                lVar.f1694a = g1.h();
                f1693e.f1694a.u(new a());
            }
        }
    }

    public static void j(Drawable drawable, r1 r1Var, int[] iArr) {
        g1.w(drawable, r1Var, iArr);
    }

    public synchronized Drawable c(@d.o0 Context context, @d.v int i7) {
        return this.f1694a.j(context, i7);
    }

    public synchronized Drawable d(@d.o0 Context context, @d.v int i7, boolean z6) {
        return this.f1694a.k(context, i7, z6);
    }

    public synchronized ColorStateList f(@d.o0 Context context, @d.v int i7) {
        return this.f1694a.m(context, i7);
    }

    public synchronized void g(@d.o0 Context context) {
        this.f1694a.s(context);
    }

    public synchronized Drawable h(@d.o0 Context context, @d.o0 d2 d2Var, @d.v int i7) {
        return this.f1694a.t(context, d2Var, i7);
    }

    public boolean k(@d.o0 Context context, @d.v int i7, @d.o0 Drawable drawable) {
        return this.f1694a.x(context, i7, drawable);
    }
}
