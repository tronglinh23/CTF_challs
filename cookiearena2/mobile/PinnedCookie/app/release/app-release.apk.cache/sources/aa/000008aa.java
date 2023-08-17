package c0;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.e;
import b0.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class n implements Comparable<n> {
    public static final String N = "MotionPaths";
    public static final boolean O = false;
    public static final int P = 1;
    public static final int Q = 2;
    public static String[] R = {"position", "x", "y", "width", "height", "pathRotate"};
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;

    /* renamed from: m  reason: collision with root package name */
    public int f7518m;

    /* renamed from: z  reason: collision with root package name */
    public u.d f7531z;

    /* renamed from: k  reason: collision with root package name */
    public float f7516k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public int f7517l = 0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7519n = false;

    /* renamed from: o  reason: collision with root package name */
    public float f7520o = 0.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f7521p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    public float f7522q = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    public float f7523r = 0.0f;

    /* renamed from: s  reason: collision with root package name */
    public float f7524s = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    public float f7525t = 1.0f;

    /* renamed from: u  reason: collision with root package name */
    public float f7526u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    public float f7527v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    public float f7528w = 0.0f;

    /* renamed from: x  reason: collision with root package name */
    public float f7529x = 0.0f;

    /* renamed from: y  reason: collision with root package name */
    public float f7530y = 0.0f;
    public int A = 0;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public int I = -1;
    public LinkedHashMap<String, androidx.constraintlayout.widget.a> J = new LinkedHashMap<>();
    public int K = 0;
    public double[] L = new double[18];
    public double[] M = new double[18];

    public void c(HashMap<String, b0.d> splines, int mFramePosition) {
        for (String str : splines.keySet()) {
            b0.d dVar = splines.get(str);
            str.hashCode();
            char c7 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c7 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c7 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c7 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c7 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c7 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c7 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c7 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c7 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals(f.f7366l)) {
                        c7 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals(f.f7367m)) {
                        c7 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals(f.f7363i)) {
                        c7 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c7 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c7 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c7 = '\r';
                        break;
                    }
                    break;
            }
            switch (c7) {
                case 0:
                    dVar.g(mFramePosition, Float.isNaN(this.f7522q) ? 0.0f : this.f7522q);
                    break;
                case 1:
                    dVar.g(mFramePosition, Float.isNaN(this.f7523r) ? 0.0f : this.f7523r);
                    break;
                case 2:
                    dVar.g(mFramePosition, Float.isNaN(this.f7528w) ? 0.0f : this.f7528w);
                    break;
                case 3:
                    dVar.g(mFramePosition, Float.isNaN(this.f7529x) ? 0.0f : this.f7529x);
                    break;
                case 4:
                    dVar.g(mFramePosition, Float.isNaN(this.f7530y) ? 0.0f : this.f7530y);
                    break;
                case 5:
                    dVar.g(mFramePosition, Float.isNaN(this.H) ? 0.0f : this.H);
                    break;
                case 6:
                    dVar.g(mFramePosition, Float.isNaN(this.f7524s) ? 1.0f : this.f7524s);
                    break;
                case 7:
                    dVar.g(mFramePosition, Float.isNaN(this.f7525t) ? 1.0f : this.f7525t);
                    break;
                case '\b':
                    dVar.g(mFramePosition, Float.isNaN(this.f7526u) ? 0.0f : this.f7526u);
                    break;
                case '\t':
                    dVar.g(mFramePosition, Float.isNaN(this.f7527v) ? 0.0f : this.f7527v);
                    break;
                case '\n':
                    dVar.g(mFramePosition, Float.isNaN(this.f7521p) ? 0.0f : this.f7521p);
                    break;
                case 11:
                    dVar.g(mFramePosition, Float.isNaN(this.f7520o) ? 0.0f : this.f7520o);
                    break;
                case '\f':
                    dVar.g(mFramePosition, Float.isNaN(this.G) ? 0.0f : this.G);
                    break;
                case '\r':
                    dVar.g(mFramePosition, Float.isNaN(this.f7516k) ? 1.0f : this.f7516k);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.J.containsKey(str2)) {
                            androidx.constraintlayout.widget.a aVar = this.J.get(str2);
                            if (dVar instanceof d.b) {
                                ((d.b) dVar).n(mFramePosition, aVar);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + mFramePosition + ", value" + aVar.k() + dVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void d(View view) {
        this.f7518m = view.getVisibility();
        this.f7516k = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f7519n = false;
        this.f7520o = view.getElevation();
        this.f7521p = view.getRotation();
        this.f7522q = view.getRotationX();
        this.f7523r = view.getRotationY();
        this.f7524s = view.getScaleX();
        this.f7525t = view.getScaleY();
        this.f7526u = view.getPivotX();
        this.f7527v = view.getPivotY();
        this.f7528w = view.getTranslationX();
        this.f7529x = view.getTranslationY();
        this.f7530y = view.getTranslationZ();
    }

    public void e(e.a c7) {
        e.d dVar = c7.f2265c;
        int i7 = dVar.f2393c;
        this.f7517l = i7;
        int i8 = dVar.f2392b;
        this.f7518m = i8;
        this.f7516k = (i8 == 0 || i7 != 0) ? dVar.f2394d : 0.0f;
        e.C0032e c0032e = c7.f2268f;
        this.f7519n = c0032e.f2420m;
        this.f7520o = c0032e.f2421n;
        this.f7521p = c0032e.f2409b;
        this.f7522q = c0032e.f2410c;
        this.f7523r = c0032e.f2411d;
        this.f7524s = c0032e.f2412e;
        this.f7525t = c0032e.f2413f;
        this.f7526u = c0032e.f2414g;
        this.f7527v = c0032e.f2415h;
        this.f7528w = c0032e.f2417j;
        this.f7529x = c0032e.f2418k;
        this.f7530y = c0032e.f2419l;
        this.f7531z = u.d.c(c7.f2266d.f2380d);
        e.c cVar = c7.f2266d;
        this.G = cVar.f2385i;
        this.A = cVar.f2382f;
        this.I = cVar.f2378b;
        this.H = c7.f2265c.f2395e;
        for (String str : c7.f2269g.keySet()) {
            androidx.constraintlayout.widget.a aVar = c7.f2269g.get(str);
            if (aVar.n()) {
                this.J.put(str, aVar);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public int compareTo(n o6) {
        return Float.compare(this.B, o6.B);
    }

    public final boolean i(float a7, float b7) {
        return (Float.isNaN(a7) || Float.isNaN(b7)) ? Float.isNaN(a7) != Float.isNaN(b7) : Math.abs(a7 - b7) > 1.0E-6f;
    }

    public void j(n points, HashSet<String> keySet) {
        if (i(this.f7516k, points.f7516k)) {
            keySet.add("alpha");
        }
        if (i(this.f7520o, points.f7520o)) {
            keySet.add("elevation");
        }
        int i7 = this.f7518m;
        int i8 = points.f7518m;
        if (i7 != i8 && this.f7517l == 0 && (i7 == 0 || i8 == 0)) {
            keySet.add("alpha");
        }
        if (i(this.f7521p, points.f7521p)) {
            keySet.add(f.f7363i);
        }
        if (!Float.isNaN(this.G) || !Float.isNaN(points.G)) {
            keySet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.H) || !Float.isNaN(points.H)) {
            keySet.add("progress");
        }
        if (i(this.f7522q, points.f7522q)) {
            keySet.add("rotationX");
        }
        if (i(this.f7523r, points.f7523r)) {
            keySet.add("rotationY");
        }
        if (i(this.f7526u, points.f7526u)) {
            keySet.add(f.f7366l);
        }
        if (i(this.f7527v, points.f7527v)) {
            keySet.add(f.f7367m);
        }
        if (i(this.f7524s, points.f7524s)) {
            keySet.add("scaleX");
        }
        if (i(this.f7525t, points.f7525t)) {
            keySet.add("scaleY");
        }
        if (i(this.f7528w, points.f7528w)) {
            keySet.add("translationX");
        }
        if (i(this.f7529x, points.f7529x)) {
            keySet.add("translationY");
        }
        if (i(this.f7530y, points.f7530y)) {
            keySet.add("translationZ");
        }
    }

    public void k(n points, boolean[] mask, String[] custom) {
        mask[0] = mask[0] | i(this.B, points.B);
        mask[1] = mask[1] | i(this.C, points.C);
        mask[2] = mask[2] | i(this.D, points.D);
        mask[3] = mask[3] | i(this.E, points.E);
        mask[4] = i(this.F, points.F) | mask[4];
    }

    public void l(double[] data, int[] toUse) {
        float[] fArr = {this.B, this.C, this.D, this.E, this.F, this.f7516k, this.f7520o, this.f7521p, this.f7522q, this.f7523r, this.f7524s, this.f7525t, this.f7526u, this.f7527v, this.f7528w, this.f7529x, this.f7530y, this.G};
        int i7 = 0;
        for (int i8 : toUse) {
            if (i8 < 18) {
                data[i7] = fArr[r4];
                i7++;
            }
        }
    }

    public int m(String name, double[] value, int offset) {
        androidx.constraintlayout.widget.a aVar = this.J.get(name);
        if (aVar.p() == 1) {
            value[offset] = aVar.k();
            return 1;
        }
        int p6 = aVar.p();
        aVar.l(new float[p6]);
        int i7 = 0;
        while (i7 < p6) {
            value[offset] = r1[i7];
            i7++;
            offset++;
        }
        return p6;
    }

    public int n(String name) {
        return this.J.get(name).p();
    }

    public boolean o(String name) {
        return this.J.containsKey(name);
    }

    public void p(float x6, float y6, float w6, float h7) {
        this.C = x6;
        this.D = y6;
        this.E = w6;
        this.F = h7;
    }

    public void q(Rect rect, View view, int rotation, float prevous) {
        p(rect.left, rect.top, rect.width(), rect.height());
        d(view);
        this.f7526u = Float.NaN;
        this.f7527v = Float.NaN;
        if (rotation == 1) {
            this.f7521p = prevous - 90.0f;
        } else if (rotation != 2) {
        } else {
            this.f7521p = prevous + 90.0f;
        }
    }

    public void r(Rect cw, androidx.constraintlayout.widget.e constraintSet, int rotation, int viewId) {
        p(cw.left, cw.top, cw.width(), cw.height());
        e(constraintSet.q0(viewId));
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    if (rotation != 4) {
                        return;
                    }
                }
            }
            float f7 = this.f7521p + 90.0f;
            this.f7521p = f7;
            if (f7 > 180.0f) {
                this.f7521p = f7 - 360.0f;
                return;
            }
            return;
        }
        this.f7521p -= 90.0f;
    }

    public void s(View view) {
        p(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        d(view);
    }
}