package c0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import b0.c;
import b0.d;
import b0.f;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o {
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 3;
    public static final int R = 4;
    public static final int S = 5;
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final int X = 4;
    public static final int Y = 5;
    public static final int Z = 6;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f7532a0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f7533b0 = 2;

    /* renamed from: c0  reason: collision with root package name */
    public static final String f7534c0 = "MotionController";

    /* renamed from: d0  reason: collision with root package name */
    public static final boolean f7535d0 = false;

    /* renamed from: e0  reason: collision with root package name */
    public static final boolean f7536e0 = false;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f7537f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f7538g0 = 1;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f7539h0 = 2;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f7540i0 = 3;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f7541j0 = 4;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f7542k0 = 5;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f7543l0 = -1;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f7544m0 = -2;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f7545n0 = -3;
    public HashMap<String, b0.f> B;
    public HashMap<String, b0.d> C;
    public HashMap<String, b0.c> D;
    public m[] E;
    public int F;
    public int G;
    public View H;
    public int I;
    public float J;
    public Interpolator K;
    public boolean L;
    public String[] M;

    /* renamed from: b  reason: collision with root package name */
    public View f7547b;

    /* renamed from: c  reason: collision with root package name */
    public int f7548c;

    /* renamed from: e  reason: collision with root package name */
    public String f7550e;

    /* renamed from: k  reason: collision with root package name */
    public u.b[] f7556k;

    /* renamed from: l  reason: collision with root package name */
    public u.b f7557l;

    /* renamed from: p  reason: collision with root package name */
    public float f7561p;

    /* renamed from: q  reason: collision with root package name */
    public float f7562q;

    /* renamed from: r  reason: collision with root package name */
    public int[] f7563r;

    /* renamed from: s  reason: collision with root package name */
    public double[] f7564s;

    /* renamed from: t  reason: collision with root package name */
    public double[] f7565t;

    /* renamed from: u  reason: collision with root package name */
    public String[] f7566u;

    /* renamed from: v  reason: collision with root package name */
    public int[] f7567v;

    /* renamed from: a  reason: collision with root package name */
    public Rect f7546a = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public boolean f7549d = false;

    /* renamed from: f  reason: collision with root package name */
    public int f7551f = -1;

    /* renamed from: g  reason: collision with root package name */
    public t f7552g = new t();

    /* renamed from: h  reason: collision with root package name */
    public t f7553h = new t();

    /* renamed from: i  reason: collision with root package name */
    public n f7554i = new n();

    /* renamed from: j  reason: collision with root package name */
    public n f7555j = new n();

    /* renamed from: m  reason: collision with root package name */
    public float f7558m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f7559n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    public float f7560o = 1.0f;

    /* renamed from: w  reason: collision with root package name */
    public int f7568w = 4;

    /* renamed from: x  reason: collision with root package name */
    public float[] f7569x = new float[4];

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<t> f7570y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public float[] f7571z = new float[1];
    public ArrayList<f> A = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u.d f7572a;

        public a(final u.d val$easing) {
            this.f7572a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v6) {
            return (float) this.f7572a.a(v6);
        }
    }

    public o(View view) {
        int i7 = f.f7360f;
        this.F = i7;
        this.G = i7;
        this.H = null;
        this.I = i7;
        this.J = Float.NaN;
        this.K = null;
        this.L = false;
        Z(view);
    }

    public static Interpolator v(Context context, int type, String interpolatorString, int id) {
        if (type != -2) {
            if (type != -1) {
                if (type != 0) {
                    if (type != 1) {
                        if (type != 2) {
                            if (type != 4) {
                                if (type != 5) {
                                    return null;
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(u.d.c(interpolatorString));
        }
        return AnimationUtils.loadInterpolator(context, id);
    }

    public double[] A(double position) {
        this.f7556k[0].d(position, this.f7564s);
        u.b bVar = this.f7557l;
        if (bVar != null) {
            double[] dArr = this.f7564s;
            if (dArr.length > 0) {
                bVar.d(position, dArr);
            }
        }
        return this.f7564s;
    }

    public k B(int layoutWidth, int layoutHeight, float x6, float y6) {
        RectF rectF = new RectF();
        t tVar = this.f7552g;
        float f7 = tVar.f7686o;
        rectF.left = f7;
        float f8 = tVar.f7687p;
        rectF.top = f8;
        rectF.right = f7 + tVar.f7688q;
        rectF.bottom = f8 + tVar.f7689r;
        RectF rectF2 = new RectF();
        t tVar2 = this.f7553h;
        float f9 = tVar2.f7686o;
        rectF2.left = f9;
        float f10 = tVar2.f7687p;
        rectF2.top = f10;
        rectF2.right = f9 + tVar2.f7688q;
        rectF2.bottom = f10 + tVar2.f7689r;
        Iterator<f> it = this.A.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next instanceof k) {
                k kVar = (k) next;
                if (kVar.r(layoutWidth, layoutHeight, rectF, rectF2, x6, y6)) {
                    return kVar;
                }
            }
        }
        return null;
    }

    public void C(float position, int width, int height, float locationX, float locationY, float[] mAnchorDpDt) {
        float j7 = j(position, this.f7571z);
        HashMap<String, b0.d> hashMap = this.C;
        b0.d dVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, b0.d> hashMap2 = this.C;
        b0.d dVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, b0.d> hashMap3 = this.C;
        b0.d dVar3 = hashMap3 == null ? null : hashMap3.get(f.f7363i);
        HashMap<String, b0.d> hashMap4 = this.C;
        b0.d dVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, b0.d> hashMap5 = this.C;
        b0.d dVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, b0.c> hashMap6 = this.D;
        b0.c cVar = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, b0.c> hashMap7 = this.D;
        b0.c cVar2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, b0.c> hashMap8 = this.D;
        b0.c cVar3 = hashMap8 == null ? null : hashMap8.get(f.f7363i);
        HashMap<String, b0.c> hashMap9 = this.D;
        b0.c cVar4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, b0.c> hashMap10 = this.D;
        b0.c cVar5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        u.x xVar = new u.x();
        xVar.b();
        xVar.d(dVar3, j7);
        xVar.h(dVar, dVar2, j7);
        xVar.f(dVar4, dVar5, j7);
        xVar.c(cVar3, j7);
        xVar.g(cVar, cVar2, j7);
        xVar.e(cVar4, cVar5, j7);
        u.b bVar = this.f7557l;
        if (bVar != null) {
            double[] dArr = this.f7564s;
            if (dArr.length > 0) {
                double d7 = j7;
                bVar.d(d7, dArr);
                this.f7557l.g(d7, this.f7565t);
                this.f7552g.x(locationX, locationY, mAnchorDpDt, this.f7563r, this.f7565t, this.f7564s);
            }
            xVar.a(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        int i7 = 0;
        if (this.f7556k == null) {
            t tVar = this.f7553h;
            float f7 = tVar.f7686o;
            t tVar2 = this.f7552g;
            float f8 = f7 - tVar2.f7686o;
            b0.c cVar6 = cVar5;
            float f9 = tVar.f7687p - tVar2.f7687p;
            b0.c cVar7 = cVar4;
            float f10 = (tVar.f7688q - tVar2.f7688q) + f8;
            float f11 = (tVar.f7689r - tVar2.f7689r) + f9;
            mAnchorDpDt[0] = (f8 * (1.0f - locationX)) + (f10 * locationX);
            mAnchorDpDt[1] = (f9 * (1.0f - locationY)) + (f11 * locationY);
            xVar.b();
            xVar.d(dVar3, j7);
            xVar.h(dVar, dVar2, j7);
            xVar.f(dVar4, dVar5, j7);
            xVar.c(cVar3, j7);
            xVar.g(cVar, cVar2, j7);
            xVar.e(cVar7, cVar6, j7);
            xVar.a(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        double j8 = j(j7, this.f7571z);
        this.f7556k[0].g(j8, this.f7565t);
        this.f7556k[0].d(j8, this.f7564s);
        float f12 = this.f7571z[0];
        while (true) {
            double[] dArr2 = this.f7565t;
            if (i7 >= dArr2.length) {
                this.f7552g.x(locationX, locationY, mAnchorDpDt, this.f7563r, dArr2, this.f7564s);
                xVar.a(locationX, locationY, width, height, mAnchorDpDt);
                return;
            }
            dArr2[i7] = dArr2[i7] * f12;
            i7++;
        }
    }

    public final float D() {
        char c7;
        float f7;
        float[] fArr = new float[2];
        float f8 = 1.0f / 99;
        double d7 = 0.0d;
        double d8 = 0.0d;
        float f9 = 0.0f;
        int i7 = 0;
        while (i7 < 100) {
            float f10 = i7 * f8;
            double d9 = f10;
            u.d dVar = this.f7552g.f7682k;
            Iterator<t> it = this.f7570y.iterator();
            float f11 = Float.NaN;
            float f12 = 0.0f;
            while (it.hasNext()) {
                t next = it.next();
                u.d dVar2 = next.f7682k;
                if (dVar2 != null) {
                    float f13 = next.f7684m;
                    if (f13 < f10) {
                        dVar = dVar2;
                        f12 = f13;
                    } else if (Float.isNaN(f11)) {
                        f11 = next.f7684m;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d9 = (((float) dVar.a((f10 - f12) / r17)) * (f11 - f12)) + f12;
            }
            this.f7556k[0].d(d9, this.f7564s);
            float f14 = f9;
            int i8 = i7;
            this.f7552g.l(d9, this.f7563r, this.f7564s, fArr, 0);
            if (i8 > 0) {
                c7 = 0;
                f7 = (float) (f14 + Math.hypot(d8 - fArr[1], d7 - fArr[0]));
            } else {
                c7 = 0;
                f7 = f14;
            }
            d7 = fArr[c7];
            i7 = i8 + 1;
            f9 = f7;
            d8 = fArr[1];
        }
        return f9;
    }

    public float E() {
        return this.f7552g.f7689r;
    }

    public float F() {
        return this.f7552g.f7688q;
    }

    public float G() {
        return this.f7552g.f7686o;
    }

    public float H() {
        return this.f7552g.f7687p;
    }

    public int I() {
        return this.G;
    }

    public View J() {
        return this.f7547b;
    }

    public final void K(t point) {
        if (Collections.binarySearch(this.f7570y, point) == 0) {
            Log.e("MotionController", " KeyPath position \"" + point.f7685n + "\" outside of range");
        }
        this.f7570y.add((-r0) - 1, point);
    }

    public boolean L(View child, float global_position, long time, u.g keyCache) {
        f.d dVar;
        boolean z6;
        int i7;
        double d7;
        float j7 = j(global_position, null);
        int i8 = this.I;
        if (i8 != f.f7360f) {
            float f7 = 1.0f / i8;
            float floor = ((float) Math.floor(j7 / f7)) * f7;
            float f8 = (j7 % f7) / f7;
            if (!Float.isNaN(this.J)) {
                f8 = (f8 + this.J) % 1.0f;
            }
            Interpolator interpolator = this.K;
            j7 = ((interpolator != null ? interpolator.getInterpolation(f8) : ((double) f8) > 0.5d ? 1.0f : 0.0f) * f7) + floor;
        }
        float f9 = j7;
        HashMap<String, b0.d> hashMap = this.C;
        if (hashMap != null) {
            Iterator<b0.d> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().m(child, f9);
            }
        }
        HashMap<String, b0.f> hashMap2 = this.B;
        if (hashMap2 != null) {
            f.d dVar2 = null;
            boolean z7 = false;
            for (b0.f fVar : hashMap2.values()) {
                if (fVar instanceof f.d) {
                    dVar2 = (f.d) fVar;
                } else {
                    z7 |= fVar.j(child, f9, time, keyCache);
                }
            }
            z6 = z7;
            dVar = dVar2;
        } else {
            dVar = null;
            z6 = false;
        }
        u.b[] bVarArr = this.f7556k;
        if (bVarArr != null) {
            double d8 = f9;
            bVarArr[0].d(d8, this.f7564s);
            this.f7556k[0].g(d8, this.f7565t);
            u.b bVar = this.f7557l;
            if (bVar != null) {
                double[] dArr = this.f7564s;
                if (dArr.length > 0) {
                    bVar.d(d8, dArr);
                    this.f7557l.g(d8, this.f7565t);
                }
            }
            if (this.L) {
                d7 = d8;
            } else {
                d7 = d8;
                this.f7552g.y(f9, child, this.f7563r, this.f7564s, this.f7565t, null, this.f7549d);
                this.f7549d = false;
            }
            if (this.G != f.f7360f) {
                if (this.H == null) {
                    this.H = ((View) child.getParent()).findViewById(this.G);
                }
                if (this.H != null) {
                    float top = (r1.getTop() + this.H.getBottom()) / 2.0f;
                    float left = (this.H.getLeft() + this.H.getRight()) / 2.0f;
                    if (child.getRight() - child.getLeft() > 0 && child.getBottom() - child.getTop() > 0) {
                        child.setPivotX(left - child.getLeft());
                        child.setPivotY(top - child.getTop());
                    }
                }
            }
            HashMap<String, b0.d> hashMap3 = this.C;
            if (hashMap3 != null) {
                for (b0.d dVar3 : hashMap3.values()) {
                    if (dVar3 instanceof d.C0077d) {
                        double[] dArr2 = this.f7565t;
                        if (dArr2.length > 1) {
                            ((d.C0077d) dVar3).n(child, f9, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.f7565t;
                i7 = 1;
                z6 |= dVar.k(child, keyCache, f9, time, dArr3[0], dArr3[1]);
            } else {
                i7 = 1;
            }
            int i9 = i7;
            while (true) {
                u.b[] bVarArr2 = this.f7556k;
                if (i9 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i9].e(d7, this.f7569x);
                b0.a.b(this.f7552g.f7696y.get(this.f7566u[i9 - 1]), child, this.f7569x);
                i9++;
            }
            n nVar = this.f7554i;
            if (nVar.f7517l == 0) {
                if (f9 <= 0.0f) {
                    child.setVisibility(nVar.f7518m);
                } else if (f9 >= 1.0f) {
                    child.setVisibility(this.f7555j.f7518m);
                } else if (this.f7555j.f7518m != nVar.f7518m) {
                    child.setVisibility(0);
                }
            }
            if (this.E != null) {
                int i10 = 0;
                while (true) {
                    m[] mVarArr = this.E;
                    if (i10 >= mVarArr.length) {
                        break;
                    }
                    mVarArr[i10].A(f9, child);
                    i10++;
                }
            }
        } else {
            i7 = 1;
            t tVar = this.f7552g;
            float f10 = tVar.f7686o;
            t tVar2 = this.f7553h;
            float f11 = f10 + ((tVar2.f7686o - f10) * f9);
            float f12 = tVar.f7687p;
            float f13 = f12 + ((tVar2.f7687p - f12) * f9);
            float f14 = tVar.f7688q;
            float f15 = tVar2.f7688q;
            float f16 = tVar.f7689r;
            float f17 = tVar2.f7689r;
            float f18 = f11 + 0.5f;
            int i11 = (int) f18;
            float f19 = f13 + 0.5f;
            int i12 = (int) f19;
            int i13 = (int) (f18 + ((f15 - f14) * f9) + f14);
            int i14 = (int) (f19 + ((f17 - f16) * f9) + f16);
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            if (f15 != f14 || f17 != f16 || this.f7549d) {
                child.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                this.f7549d = false;
            }
            child.layout(i11, i12, i13, i14);
        }
        HashMap<String, b0.c> hashMap4 = this.D;
        if (hashMap4 != null) {
            for (b0.c cVar : hashMap4.values()) {
                if (cVar instanceof c.d) {
                    double[] dArr4 = this.f7565t;
                    ((c.d) cVar).n(child, f9, dArr4[0], dArr4[i7]);
                } else {
                    cVar.m(child, f9);
                }
            }
        }
        return z6;
    }

    public String M() {
        return this.f7547b.getContext().getResources().getResourceEntryName(this.f7547b.getId());
    }

    public void N(View view, k key, float x6, float y6, String[] attribute, float[] value) {
        RectF rectF = new RectF();
        t tVar = this.f7552g;
        float f7 = tVar.f7686o;
        rectF.left = f7;
        float f8 = tVar.f7687p;
        rectF.top = f8;
        rectF.right = f7 + tVar.f7688q;
        rectF.bottom = f8 + tVar.f7689r;
        RectF rectF2 = new RectF();
        t tVar2 = this.f7553h;
        float f9 = tVar2.f7686o;
        rectF2.left = f9;
        float f10 = tVar2.f7687p;
        rectF2.top = f10;
        rectF2.right = f9 + tVar2.f7688q;
        rectF2.bottom = f10 + tVar2.f7689r;
        key.s(view, rectF, rectF2, x6, y6, attribute, value);
    }

    public final void O(t motionPaths) {
        motionPaths.w((int) this.f7547b.getX(), (int) this.f7547b.getY(), this.f7547b.getWidth(), this.f7547b.getHeight());
    }

    public void P() {
        this.f7549d = true;
    }

    public void Q(Rect rect, Rect out, int rotation, int preHeight, int preWidth) {
        if (rotation == 1) {
            int i7 = rect.left + rect.right;
            out.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            out.top = preWidth - ((i7 + rect.height()) / 2);
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
        } else if (rotation == 2) {
            int i8 = rect.left + rect.right;
            out.left = preHeight - (((rect.top + rect.bottom) + rect.width()) / 2);
            out.top = (i8 - rect.height()) / 2;
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
        } else if (rotation == 3) {
            int i9 = rect.left + rect.right;
            out.left = ((rect.height() / 2) + rect.top) - (i9 / 2);
            out.top = preWidth - ((i9 + rect.height()) / 2);
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
        } else if (rotation != 4) {
        } else {
            int i10 = rect.left + rect.right;
            out.left = preHeight - (((rect.bottom + rect.top) + rect.width()) / 2);
            out.top = (i10 - rect.height()) / 2;
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
        }
    }

    public void R(View v6) {
        t tVar = this.f7552g;
        tVar.f7684m = 0.0f;
        tVar.f7685n = 0.0f;
        this.L = true;
        tVar.w(v6.getX(), v6.getY(), v6.getWidth(), v6.getHeight());
        this.f7553h.w(v6.getX(), v6.getY(), v6.getWidth(), v6.getHeight());
        this.f7554i.s(v6);
        this.f7555j.s(v6);
    }

    public void S(int debugMode) {
        this.f7552g.f7683l = debugMode;
    }

    public void T(Rect cw, androidx.constraintlayout.widget.e constraintSet, int parentWidth, int parentHeight) {
        int i7 = constraintSet.f2259d;
        if (i7 != 0) {
            Q(cw, this.f7546a, i7, parentWidth, parentHeight);
            cw = this.f7546a;
        }
        t tVar = this.f7553h;
        tVar.f7684m = 1.0f;
        tVar.f7685n = 1.0f;
        O(tVar);
        this.f7553h.w(cw.left, cw.top, cw.width(), cw.height());
        this.f7553h.c(constraintSet.q0(this.f7548c));
        this.f7555j.r(cw, constraintSet, i7, this.f7548c);
    }

    public void U(int arc) {
        this.F = arc;
    }

    public void V(View v6) {
        t tVar = this.f7552g;
        tVar.f7684m = 0.0f;
        tVar.f7685n = 0.0f;
        tVar.w(v6.getX(), v6.getY(), v6.getWidth(), v6.getHeight());
        this.f7554i.s(v6);
    }

    public void W(Rect cw, androidx.constraintlayout.widget.e constraintSet, int parentWidth, int parentHeight) {
        int i7 = constraintSet.f2259d;
        if (i7 != 0) {
            Q(cw, this.f7546a, i7, parentWidth, parentHeight);
        }
        t tVar = this.f7552g;
        tVar.f7684m = 0.0f;
        tVar.f7685n = 0.0f;
        O(tVar);
        this.f7552g.w(cw.left, cw.top, cw.width(), cw.height());
        e.a q02 = constraintSet.q0(this.f7548c);
        this.f7552g.c(q02);
        this.f7558m = q02.f2266d.f2383g;
        this.f7554i.r(cw, constraintSet, i7, this.f7548c);
        this.G = q02.f2268f.f2416i;
        e.c cVar = q02.f2266d;
        this.I = cVar.f2387k;
        this.J = cVar.f2386j;
        Context context = this.f7547b.getContext();
        e.c cVar2 = q02.f2266d;
        this.K = v(context, cVar2.f2389m, cVar2.f2388l, cVar2.f2390n);
    }

    public void X(b0.e rect, View v6, int rotation, int preWidth, int preHeight) {
        t tVar = this.f7552g;
        tVar.f7684m = 0.0f;
        tVar.f7685n = 0.0f;
        Rect rect2 = new Rect();
        if (rotation == 1) {
            int i7 = rect.f7151b + rect.f7153d;
            rect2.left = ((rect.f7152c + rect.f7154e) - rect.c()) / 2;
            rect2.top = preWidth - ((i7 + rect.b()) / 2);
            rect2.right = rect2.left + rect.c();
            rect2.bottom = rect2.top + rect.b();
        } else if (rotation == 2) {
            int i8 = rect.f7151b + rect.f7153d;
            rect2.left = preHeight - (((rect.f7152c + rect.f7154e) + rect.c()) / 2);
            rect2.top = (i8 - rect.b()) / 2;
            rect2.right = rect2.left + rect.c();
            rect2.bottom = rect2.top + rect.b();
        }
        this.f7552g.w(rect2.left, rect2.top, rect2.width(), rect2.height());
        this.f7554i.q(rect2, v6, rotation, rect.f7150a);
    }

    public void Y(int transformPivotTarget) {
        this.G = transformPivotTarget;
        this.H = null;
    }

    public void Z(View view) {
        this.f7547b = view;
        this.f7548c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f7550e = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    public void a(f key) {
        this.A.add(key);
    }

    public void a0(int parentWidth, int parentHeight, float transitionDuration, long currentTime) {
        ArrayList arrayList;
        String[] strArr;
        androidx.constraintlayout.widget.a aVar;
        b0.f i7;
        androidx.constraintlayout.widget.a aVar2;
        Integer num;
        b0.d l7;
        androidx.constraintlayout.widget.a aVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i8 = this.F;
        if (i8 != f.f7360f) {
            this.f7552g.f7692u = i8;
        }
        this.f7554i.j(this.f7555j, hashSet2);
        ArrayList<f> arrayList2 = this.A;
        if (arrayList2 != null) {
            Iterator<f> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                f next = it.next();
                if (next instanceof j) {
                    j jVar = (j) next;
                    K(new t(parentWidth, parentHeight, jVar, this.f7552g, this.f7553h));
                    int i9 = jVar.D;
                    if (i9 != f.f7360f) {
                        this.f7551f = i9;
                    }
                } else if (next instanceof h) {
                    next.d(hashSet3);
                } else if (next instanceof l) {
                    next.d(hashSet);
                } else if (next instanceof m) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((m) next);
                } else {
                    next.i(hashMap);
                    next.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i10 = 0;
        if (arrayList != null) {
            this.E = (m[]) arrayList.toArray(new m[0]);
        }
        char c7 = 1;
        if (!hashSet2.isEmpty()) {
            this.C = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<f> it3 = this.A.iterator();
                    while (it3.hasNext()) {
                        f next3 = it3.next();
                        HashMap<String, androidx.constraintlayout.widget.a> hashMap2 = next3.f7385e;
                        if (hashMap2 != null && (aVar3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.f7381a, aVar3);
                        }
                    }
                    l7 = b0.d.k(next2, sparseArray);
                } else {
                    l7 = b0.d.l(next2);
                }
                if (l7 != null) {
                    l7.i(next2);
                    this.C.put(next2, l7);
                }
            }
            ArrayList<f> arrayList3 = this.A;
            if (arrayList3 != null) {
                Iterator<f> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    f next4 = it4.next();
                    if (next4 instanceof g) {
                        next4.a(this.C);
                    }
                }
            }
            this.f7554i.c(this.C, 0);
            this.f7555j.c(this.C, 100);
            for (String str2 : this.C.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                b0.d dVar = this.C.get(str2);
                if (dVar != null) {
                    dVar.j(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.B == null) {
                this.B = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.B.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<f> it6 = this.A.iterator();
                        while (it6.hasNext()) {
                            f next6 = it6.next();
                            HashMap<String, androidx.constraintlayout.widget.a> hashMap3 = next6.f7385e;
                            if (hashMap3 != null && (aVar2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.f7381a, aVar2);
                            }
                        }
                        i7 = b0.f.h(next5, sparseArray2);
                    } else {
                        i7 = b0.f.i(next5, currentTime);
                    }
                    if (i7 != null) {
                        i7.e(next5);
                        this.B.put(next5, i7);
                    }
                }
            }
            ArrayList<f> arrayList4 = this.A;
            if (arrayList4 != null) {
                Iterator<f> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    f next7 = it7.next();
                    if (next7 instanceof l) {
                        ((l) next7).W(this.B);
                    }
                }
            }
            for (String str4 : this.B.keySet()) {
                this.B.get(str4).f(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int i11 = 2;
        int size = this.f7570y.size() + 2;
        t[] tVarArr = new t[size];
        tVarArr[0] = this.f7552g;
        tVarArr[size - 1] = this.f7553h;
        if (this.f7570y.size() > 0 && this.f7551f == -1) {
            this.f7551f = 0;
        }
        Iterator<t> it8 = this.f7570y.iterator();
        int i12 = 1;
        while (it8.hasNext()) {
            tVarArr[i12] = it8.next();
            i12++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f7553h.f7696y.keySet()) {
            if (this.f7552g.f7696y.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f7566u = strArr2;
        this.f7567v = new int[strArr2.length];
        int i13 = 0;
        while (true) {
            strArr = this.f7566u;
            if (i13 >= strArr.length) {
                break;
            }
            String str6 = strArr[i13];
            this.f7567v[i13] = 0;
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    break;
                }
                if (tVarArr[i14].f7696y.containsKey(str6) && (aVar = tVarArr[i14].f7696y.get(str6)) != null) {
                    int[] iArr = this.f7567v;
                    iArr[i13] = iArr[i13] + aVar.p();
                    break;
                }
                i14++;
            }
            i13++;
        }
        boolean z6 = tVarArr[0].f7692u != f.f7360f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i15 = 1; i15 < size; i15++) {
            tVarArr[i15].i(tVarArr[i15 - 1], zArr, this.f7566u, z6);
        }
        int i16 = 0;
        for (int i17 = 1; i17 < length; i17++) {
            if (zArr[i17]) {
                i16++;
            }
        }
        this.f7563r = new int[i16];
        int max = Math.max(2, i16);
        this.f7564s = new double[max];
        this.f7565t = new double[max];
        int i18 = 0;
        for (int i19 = 1; i19 < length; i19++) {
            if (zArr[i19]) {
                this.f7563r[i18] = i19;
                i18++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, size, this.f7563r.length);
        double[] dArr2 = new double[size];
        for (int i20 = 0; i20 < size; i20++) {
            tVarArr[i20].j(dArr[i20], this.f7563r);
            dArr2[i20] = tVarArr[i20].f7684m;
        }
        int i21 = 0;
        while (true) {
            int[] iArr2 = this.f7563r;
            if (i21 >= iArr2.length) {
                break;
            }
            if (iArr2[i21] < t.P.length) {
                String str7 = t.P[this.f7563r[i21]] + " [";
                for (int i22 = 0; i22 < size; i22++) {
                    str7 = str7 + dArr[i22][i21];
                }
            }
            i21++;
        }
        this.f7556k = new u.b[this.f7566u.length + 1];
        int i23 = 0;
        while (true) {
            String[] strArr3 = this.f7566u;
            if (i23 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i23];
            int i24 = i10;
            int i25 = i24;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i24 < size) {
                if (tVarArr[i24].r(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i11];
                        iArr3[c7] = tVarArr[i24].p(str8);
                        iArr3[i10] = size;
                        dArr4 = (double[][]) Array.newInstance(Double.TYPE, iArr3);
                    }
                    t tVar = tVarArr[i24];
                    dArr3[i25] = tVar.f7684m;
                    tVar.o(str8, dArr4[i25], 0);
                    i25++;
                }
                i24++;
                i11 = 2;
                i10 = 0;
                c7 = 1;
            }
            i23++;
            this.f7556k[i23] = u.b.a(this.f7551f, Arrays.copyOf(dArr3, i25), (double[][]) Arrays.copyOf(dArr4, i25));
            i11 = 2;
            i10 = 0;
            c7 = 1;
        }
        this.f7556k[0] = u.b.a(this.f7551f, dArr2, dArr);
        if (tVarArr[0].f7692u != f.f7360f) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, size, 2);
            for (int i26 = 0; i26 < size; i26++) {
                iArr4[i26] = tVarArr[i26].f7692u;
                dArr5[i26] = r8.f7684m;
                double[] dArr7 = dArr6[i26];
                dArr7[0] = r8.f7686o;
                dArr7[1] = r8.f7687p;
            }
            this.f7557l = u.b.b(iArr4, dArr5, dArr6);
        }
        this.D = new HashMap<>();
        if (this.A != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f7 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                b0.c l8 = b0.c.l(next8);
                if (l8 != null) {
                    if (l8.k() && Float.isNaN(f7)) {
                        f7 = D();
                    }
                    l8.i(next8);
                    this.D.put(next8, l8);
                }
            }
            Iterator<f> it10 = this.A.iterator();
            while (it10.hasNext()) {
                f next9 = it10.next();
                if (next9 instanceof h) {
                    ((h) next9).a0(this.D);
                }
            }
            Iterator<b0.c> it11 = this.D.values().iterator();
            while (it11.hasNext()) {
                it11.next().j(f7);
            }
        }
    }

    public void b(ArrayList<f> list) {
        this.A.addAll(list);
    }

    public void b0(o motionController) {
        this.f7552g.z(motionController, motionController.f7552g);
        this.f7553h.z(motionController, motionController.f7553h);
    }

    public void c(float[] bounds, int pointCount) {
        float f7 = 1.0f / ((float) (pointCount - 1));
        HashMap<String, b0.d> hashMap = this.C;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, b0.d> hashMap2 = this.C;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, b0.c> hashMap3 = this.D;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, b0.c> hashMap4 = this.D;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i7 = 0; i7 < pointCount; i7++) {
            float f8 = i7 * f7;
            float f9 = this.f7560o;
            float f10 = 0.0f;
            if (f9 != 1.0f) {
                float f11 = this.f7559n;
                if (f8 < f11) {
                    f8 = 0.0f;
                }
                if (f8 > f11 && f8 < 1.0d) {
                    f8 = Math.min((f8 - f11) * f9, 1.0f);
                }
            }
            double d7 = f8;
            u.d dVar = this.f7552g.f7682k;
            Iterator<t> it = this.f7570y.iterator();
            float f12 = Float.NaN;
            while (it.hasNext()) {
                t next = it.next();
                u.d dVar2 = next.f7682k;
                if (dVar2 != null) {
                    float f13 = next.f7684m;
                    if (f13 < f8) {
                        dVar = dVar2;
                        f10 = f13;
                    } else if (Float.isNaN(f12)) {
                        f12 = next.f7684m;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                d7 = (((float) dVar.a((f8 - f10) / r12)) * (f12 - f10)) + f10;
            }
            this.f7556k[0].d(d7, this.f7564s);
            u.b bVar = this.f7557l;
            if (bVar != null) {
                double[] dArr = this.f7564s;
                if (dArr.length > 0) {
                    bVar.d(d7, dArr);
                }
            }
            this.f7552g.k(this.f7563r, this.f7564s, bounds, i7 * 2);
        }
    }

    public int d(float[] keyBounds, int[] mode) {
        if (keyBounds != null) {
            double[] h7 = this.f7556k[0].h();
            if (mode != null) {
                Iterator<t> it = this.f7570y.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    mode[i7] = it.next().f7697z;
                    i7++;
                }
            }
            int i8 = 0;
            for (double d7 : h7) {
                this.f7556k[0].d(d7, this.f7564s);
                this.f7552g.k(this.f7563r, this.f7564s, keyBounds, i8);
                i8 += 2;
            }
            return i8 / 2;
        }
        return 0;
    }

    public int e(float[] keyFrames, int[] mode) {
        if (keyFrames != null) {
            double[] h7 = this.f7556k[0].h();
            if (mode != null) {
                Iterator<t> it = this.f7570y.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    mode[i7] = it.next().f7697z;
                    i7++;
                }
            }
            int i8 = 0;
            for (int i9 = 0; i9 < h7.length; i9++) {
                this.f7556k[0].d(h7[i9], this.f7564s);
                this.f7552g.l(h7[i9], this.f7563r, this.f7564s, keyFrames, i8);
                i8 += 2;
            }
            return i8 / 2;
        }
        return 0;
    }

    public void f(float[] points, int pointCount) {
        double d7;
        float f7 = 1.0f;
        float f8 = 1.0f / ((float) (pointCount - 1));
        HashMap<String, b0.d> hashMap = this.C;
        b0.d dVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, b0.d> hashMap2 = this.C;
        b0.d dVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, b0.c> hashMap3 = this.D;
        b0.c cVar = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, b0.c> hashMap4 = this.D;
        b0.c cVar2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i7 = 0;
        while (i7 < pointCount) {
            float f9 = i7 * f8;
            float f10 = this.f7560o;
            float f11 = 0.0f;
            if (f10 != f7) {
                float f12 = this.f7559n;
                if (f9 < f12) {
                    f9 = 0.0f;
                }
                if (f9 > f12 && f9 < 1.0d) {
                    f9 = Math.min((f9 - f12) * f10, f7);
                }
            }
            float f13 = f9;
            double d8 = f13;
            u.d dVar3 = this.f7552g.f7682k;
            Iterator<t> it = this.f7570y.iterator();
            float f14 = Float.NaN;
            while (it.hasNext()) {
                t next = it.next();
                u.d dVar4 = next.f7682k;
                double d9 = d8;
                if (dVar4 != null) {
                    float f15 = next.f7684m;
                    if (f15 < f13) {
                        f11 = f15;
                        dVar3 = dVar4;
                    } else if (Float.isNaN(f14)) {
                        f14 = next.f7684m;
                    }
                }
                d8 = d9;
            }
            double d10 = d8;
            if (dVar3 != null) {
                if (Float.isNaN(f14)) {
                    f14 = 1.0f;
                }
                d7 = (((float) dVar3.a((f13 - f11) / r16)) * (f14 - f11)) + f11;
            } else {
                d7 = d10;
            }
            this.f7556k[0].d(d7, this.f7564s);
            u.b bVar = this.f7557l;
            if (bVar != null) {
                double[] dArr = this.f7564s;
                if (dArr.length > 0) {
                    bVar.d(d7, dArr);
                }
            }
            int i8 = i7 * 2;
            int i9 = i7;
            this.f7552g.l(d7, this.f7563r, this.f7564s, points, i8);
            if (cVar != null) {
                points[i8] = points[i8] + cVar.a(f13);
            } else if (dVar != null) {
                points[i8] = points[i8] + dVar.a(f13);
            }
            if (cVar2 != null) {
                int i10 = i8 + 1;
                points[i10] = points[i10] + cVar2.a(f13);
            } else if (dVar2 != null) {
                int i11 = i8 + 1;
                points[i11] = points[i11] + dVar2.a(f13);
            }
            i7 = i9 + 1;
            f7 = 1.0f;
        }
    }

    public void g(float p6, float[] path, int offset) {
        this.f7556k[0].d(j(p6, null), this.f7564s);
        this.f7552g.q(this.f7563r, this.f7564s, path, offset);
    }

    public void h(float[] path, int pointCount) {
        float f7 = 1.0f / ((float) (pointCount - 1));
        for (int i7 = 0; i7 < pointCount; i7++) {
            this.f7556k[0].d(j(i7 * f7, null), this.f7564s);
            this.f7552g.q(this.f7563r, this.f7564s, path, i7 * 8);
        }
    }

    public void i(boolean start) {
        if (!"button".equals(c.k(this.f7547b)) || this.E == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            m[] mVarArr = this.E;
            if (i7 >= mVarArr.length) {
                return;
            }
            mVarArr[i7].A(start ? -100.0f : 100.0f, this.f7547b);
            i7++;
        }
    }

    public final float j(float position, float[] velocity) {
        float f7 = 0.0f;
        if (velocity != null) {
            velocity[0] = 1.0f;
        } else {
            float f8 = this.f7560o;
            if (f8 != 1.0d) {
                float f9 = this.f7559n;
                if (position < f9) {
                    position = 0.0f;
                }
                if (position > f9 && position < 1.0d) {
                    position = Math.min((position - f9) * f8, 1.0f);
                }
            }
        }
        u.d dVar = this.f7552g.f7682k;
        Iterator<t> it = this.f7570y.iterator();
        float f10 = Float.NaN;
        while (it.hasNext()) {
            t next = it.next();
            u.d dVar2 = next.f7682k;
            if (dVar2 != null) {
                float f11 = next.f7684m;
                if (f11 < position) {
                    dVar = dVar2;
                    f7 = f11;
                } else if (Float.isNaN(f10)) {
                    f10 = next.f7684m;
                }
            }
        }
        if (dVar != null) {
            float f12 = (Float.isNaN(f10) ? 1.0f : f10) - f7;
            double d7 = (position - f7) / f12;
            position = (((float) dVar.a(d7)) * f12) + f7;
            if (velocity != null) {
                velocity[0] = (float) dVar.b(d7);
            }
        }
        return position;
    }

    public int k() {
        return this.f7552g.f7693v;
    }

    public int l(String attributeType, float[] points, int pointCount) {
        b0.d dVar = this.C.get(attributeType);
        if (dVar == null) {
            return -1;
        }
        for (int i7 = 0; i7 < points.length; i7++) {
            points[i7] = dVar.a(i7 / (points.length - 1));
        }
        return points.length;
    }

    public void m(double p6, float[] pos, float[] vel) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f7556k[0].d(p6, dArr);
        this.f7556k[0].g(p6, dArr2);
        Arrays.fill(vel, 0.0f);
        this.f7552g.m(p6, this.f7563r, dArr, pos, dArr2, vel);
    }

    public float n() {
        return this.f7561p;
    }

    public float o() {
        return this.f7562q;
    }

    public void p(float position, float locationX, float locationY, float[] mAnchorDpDt) {
        double[] dArr;
        float j7 = j(position, this.f7571z);
        u.b[] bVarArr = this.f7556k;
        int i7 = 0;
        if (bVarArr == null) {
            t tVar = this.f7553h;
            float f7 = tVar.f7686o;
            t tVar2 = this.f7552g;
            float f8 = f7 - tVar2.f7686o;
            float f9 = tVar.f7687p - tVar2.f7687p;
            float f10 = (tVar.f7688q - tVar2.f7688q) + f8;
            float f11 = (tVar.f7689r - tVar2.f7689r) + f9;
            mAnchorDpDt[0] = (f8 * (1.0f - locationX)) + (f10 * locationX);
            mAnchorDpDt[1] = (f9 * (1.0f - locationY)) + (f11 * locationY);
            return;
        }
        double d7 = j7;
        bVarArr[0].g(d7, this.f7565t);
        this.f7556k[0].d(d7, this.f7564s);
        float f12 = this.f7571z[0];
        while (true) {
            dArr = this.f7565t;
            if (i7 >= dArr.length) {
                break;
            }
            dArr[i7] = dArr[i7] * f12;
            i7++;
        }
        u.b bVar = this.f7557l;
        if (bVar == null) {
            this.f7552g.x(locationX, locationY, mAnchorDpDt, this.f7563r, dArr, this.f7564s);
            return;
        }
        double[] dArr2 = this.f7564s;
        if (dArr2.length > 0) {
            bVar.d(d7, dArr2);
            this.f7557l.g(d7, this.f7565t);
            this.f7552g.x(locationX, locationY, mAnchorDpDt, this.f7563r, this.f7565t, this.f7564s);
        }
    }

    public int q() {
        int i7 = this.f7552g.f7683l;
        Iterator<t> it = this.f7570y.iterator();
        while (it.hasNext()) {
            i7 = Math.max(i7, it.next().f7683l);
        }
        return Math.max(i7, this.f7553h.f7683l);
    }

    public float r() {
        return this.f7553h.f7689r;
    }

    public float s() {
        return this.f7553h.f7688q;
    }

    public float t() {
        return this.f7553h.f7686o;
    }

    public String toString() {
        return " start: x: " + this.f7552g.f7686o + " y: " + this.f7552g.f7687p + " end: x: " + this.f7553h.f7686o + " y: " + this.f7553h.f7687p;
    }

    public float u() {
        return this.f7553h.f7687p;
    }

    public t w(int i7) {
        return this.f7570y.get(i7);
    }

    public int x(int type, int[] info) {
        float[] fArr = new float[2];
        Iterator<f> it = this.A.iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            f next = it.next();
            int i9 = next.f7384d;
            if (i9 == type || type != -1) {
                info[i8] = 0;
                int i10 = i8 + 1;
                info[i10] = i9;
                int i11 = i10 + 1;
                int i12 = next.f7381a;
                info[i11] = i12;
                double d7 = i12 / 100.0f;
                this.f7556k[0].d(d7, this.f7564s);
                this.f7552g.l(d7, this.f7563r, this.f7564s, fArr, 0);
                int i13 = i11 + 1;
                info[i13] = Float.floatToIntBits(fArr[0]);
                int i14 = i13 + 1;
                info[i14] = Float.floatToIntBits(fArr[1]);
                if (next instanceof j) {
                    j jVar = (j) next;
                    int i15 = i14 + 1;
                    info[i15] = jVar.O;
                    int i16 = i15 + 1;
                    info[i16] = Float.floatToIntBits(jVar.K);
                    i14 = i16 + 1;
                    info[i14] = Float.floatToIntBits(jVar.L);
                }
                int i17 = i14 + 1;
                info[i8] = i17 - i8;
                i7++;
                i8 = i17;
            }
        }
        return i7;
    }

    public float y(int type, float x6, float y6) {
        t tVar = this.f7553h;
        float f7 = tVar.f7686o;
        t tVar2 = this.f7552g;
        float f8 = tVar2.f7686o;
        float f9 = f7 - f8;
        float f10 = tVar.f7687p;
        float f11 = tVar2.f7687p;
        float f12 = f10 - f11;
        float f13 = f8 + (tVar2.f7688q / 2.0f);
        float f14 = f11 + (tVar2.f7689r / 2.0f);
        float hypot = (float) Math.hypot(f9, f12);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f15 = x6 - f13;
        float f16 = y6 - f14;
        if (((float) Math.hypot(f15, f16)) == 0.0f) {
            return 0.0f;
        }
        float f17 = (f15 * f9) + (f16 * f12);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            if (type != 5) {
                                return 0.0f;
                            }
                            return f16 / f12;
                        }
                        return f15 / f12;
                    }
                    return f16 / f9;
                }
                return f15 / f9;
            }
            return (float) Math.sqrt((hypot * hypot) - (f17 * f17));
        }
        return f17 / hypot;
    }

    public int z(int[] type, float[] pos) {
        Iterator<f> it = this.A.iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            f next = it.next();
            int i9 = next.f7381a;
            type[i7] = (next.f7384d * 1000) + i9;
            double d7 = i9 / 100.0f;
            this.f7556k[0].d(d7, this.f7564s);
            this.f7552g.l(d7, this.f7563r, this.f7564s, pos, i8);
            i8 += 2;
            i7++;
        }
        return i7;
    }
}
