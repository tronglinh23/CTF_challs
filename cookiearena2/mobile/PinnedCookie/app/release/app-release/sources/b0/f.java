package b0;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import c0.s;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u.t;
/* loaded from: classes.dex */
public abstract class f extends t {

    /* renamed from: p  reason: collision with root package name */
    public static final String f7155p = "ViewTimeCycle";

    /* loaded from: classes.dex */
    public static class a extends f {
        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            view.setAlpha(g(t6, time, view, cache));
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: q  reason: collision with root package name */
        public String f7156q;

        /* renamed from: r  reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.a> f7157r;

        /* renamed from: s  reason: collision with root package name */
        public SparseArray<float[]> f7158s = new SparseArray<>();

        /* renamed from: t  reason: collision with root package name */
        public float[] f7159t;

        /* renamed from: u  reason: collision with root package name */
        public float[] f7160u;

        public b(String attribute, SparseArray<androidx.constraintlayout.widget.a> attrList) {
            this.f7156q = attribute.split(",")[1];
            this.f7157r = attrList;
        }

        @Override // u.t
        public void c(int position, float value, float period, int shape, float offset) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // u.t
        public void f(int curveType) {
            int size = this.f7157r.size();
            int p6 = this.f7157r.valueAt(0).p();
            double[] dArr = new double[size];
            int i7 = p6 + 2;
            this.f7159t = new float[i7];
            this.f7160u = new float[p6];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i7);
            for (int i8 = 0; i8 < size; i8++) {
                int keyAt = this.f7157r.keyAt(i8);
                androidx.constraintlayout.widget.a valueAt = this.f7157r.valueAt(i8);
                float[] valueAt2 = this.f7158s.valueAt(i8);
                dArr[i8] = keyAt * 0.01d;
                valueAt.l(this.f7159t);
                int i9 = 0;
                while (true) {
                    if (i9 < this.f7159t.length) {
                        dArr2[i8][i9] = r8[i9];
                        i9++;
                    }
                }
                double[] dArr3 = dArr2[i8];
                dArr3[p6] = valueAt2[0];
                dArr3[p6 + 1] = valueAt2[1];
            }
            this.f17067a = u.b.a(curveType, dArr, dArr2);
        }

        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            this.f17067a.e(t6, this.f7159t);
            float[] fArr = this.f7159t;
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            long j7 = time - this.f17075i;
            if (Float.isNaN(this.f17076j)) {
                float a7 = cache.a(view, this.f7156q, 0);
                this.f17076j = a7;
                if (Float.isNaN(a7)) {
                    this.f17076j = 0.0f;
                }
            }
            float f9 = (float) ((this.f17076j + ((j7 * 1.0E-9d) * f7)) % 1.0d);
            this.f17076j = f9;
            this.f17075i = time;
            float a8 = a(f9);
            this.f17074h = false;
            int i7 = 0;
            while (true) {
                float[] fArr2 = this.f7160u;
                if (i7 >= fArr2.length) {
                    break;
                }
                boolean z6 = this.f17074h;
                float f10 = this.f7159t[i7];
                this.f17074h = z6 | (((double) f10) != androidx.cardview.widget.g.f1896q);
                fArr2[i7] = (f10 * a8) + f8;
                i7++;
            }
            b0.a.b(this.f7157r.valueAt(0), view, this.f7160u);
            if (f7 != 0.0f) {
                this.f17074h = true;
            }
            return this.f17074h;
        }

        public void k(int position, androidx.constraintlayout.widget.a value, float period, int shape, float offset) {
            this.f7157r.append(position, value);
            this.f7158s.append(position, new float[]{period, offset});
            this.f17068b = Math.max(this.f17068b, shape);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {
        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            view.setElevation(g(t6, time, view, cache));
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {
        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            return this.f17074h;
        }

        public boolean k(View view, u.g cache, float t6, long time, double dx, double dy) {
            view.setRotation(g(t6, time, view, cache) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: q  reason: collision with root package name */
        public boolean f7161q = false;

        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            Method method;
            if (view instanceof s) {
                ((s) view).setProgress(g(t6, time, view, cache));
            } else if (this.f7161q) {
                return false;
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f7161q = true;
                    method = null;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(g(t6, time, view, cache)));
                    } catch (IllegalAccessException e7) {
                        Log.e(f.f7155p, "unable to setProgress", e7);
                    } catch (InvocationTargetException e8) {
                        Log.e(f.f7155p, "unable to setProgress", e8);
                    }
                }
            }
            return this.f17074h;
        }
    }

    /* renamed from: b0.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0078f extends f {
        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            view.setRotation(g(t6, time, view, cache));
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {
        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            view.setRotationX(g(t6, time, view, cache));
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends f {
        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            view.setRotationY(g(t6, time, view, cache));
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends f {
        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            view.setScaleX(g(t6, time, view, cache));
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends f {
        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            view.setScaleY(g(t6, time, view, cache));
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class k extends f {
        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            view.setTranslationX(g(t6, time, view, cache));
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class l extends f {
        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            view.setTranslationY(g(t6, time, view, cache));
            return this.f17074h;
        }
    }

    /* loaded from: classes.dex */
    public static class m extends f {
        @Override // b0.f
        public boolean j(View view, float t6, long time, u.g cache) {
            view.setTranslationZ(g(t6, time, view, cache));
            return this.f17074h;
        }
    }

    public static f h(String str, SparseArray<androidx.constraintlayout.widget.a> attrList) {
        return new b(str, attrList);
    }

    public static f i(String str, long currentTime) {
        f gVar;
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
            case -40300674:
                if (str.equals(c0.f.f7363i)) {
                    c7 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c7 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c7 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c7 = 11;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                gVar = new g();
                break;
            case 1:
                gVar = new h();
                break;
            case 2:
                gVar = new k();
                break;
            case 3:
                gVar = new l();
                break;
            case 4:
                gVar = new m();
                break;
            case 5:
                gVar = new e();
                break;
            case 6:
                gVar = new i();
                break;
            case 7:
                gVar = new j();
                break;
            case '\b':
                gVar = new C0078f();
                break;
            case '\t':
                gVar = new c();
                break;
            case '\n':
                gVar = new d();
                break;
            case 11:
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.d(currentTime);
        return gVar;
    }

    public float g(float pos, long time, View view, u.g cache) {
        this.f17067a.e(pos, this.f17073g);
        float[] fArr = this.f17073g;
        float f7 = fArr[1];
        int i7 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i7 == 0) {
            this.f17074h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f17076j)) {
            float a7 = cache.a(view, this.f17072f, 0);
            this.f17076j = a7;
            if (Float.isNaN(a7)) {
                this.f17076j = 0.0f;
            }
        }
        float f8 = (float) ((this.f17076j + (((time - this.f17075i) * 1.0E-9d) * f7)) % 1.0d);
        this.f17076j = f8;
        cache.b(view, this.f17072f, 0, f8);
        this.f17075i = time;
        float f9 = this.f17073g[0];
        float a8 = (a(this.f17076j) * f9) + this.f17073g[2];
        this.f17074h = (f9 == 0.0f && i7 == 0) ? false : true;
        return a8;
    }

    public abstract boolean j(View view, float t6, long time, u.g cache);
}
