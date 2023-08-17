package b0;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import c0.s;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class d extends u.o {

    /* renamed from: g  reason: collision with root package name */
    public static final String f7145g = "ViewSpline";

    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setAlpha(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d {

        /* renamed from: h  reason: collision with root package name */
        public String f7146h;

        /* renamed from: i  reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.a> f7147i;

        /* renamed from: j  reason: collision with root package name */
        public float[] f7148j;

        public b(String attribute, SparseArray<androidx.constraintlayout.widget.a> attrList) {
            this.f7146h = attribute.split(",")[1];
            this.f7147i = attrList;
        }

        @Override // u.o
        public void g(int position, float value) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // u.o
        public void j(int curveType) {
            int size = this.f7147i.size();
            int p6 = this.f7147i.valueAt(0).p();
            double[] dArr = new double[size];
            this.f7148j = new float[p6];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, p6);
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.f7147i.keyAt(i7);
                androidx.constraintlayout.widget.a valueAt = this.f7147i.valueAt(i7);
                dArr[i7] = keyAt * 0.01d;
                valueAt.l(this.f7148j);
                int i8 = 0;
                while (true) {
                    if (i8 < this.f7148j.length) {
                        dArr2[i7][i8] = r6[i8];
                        i8++;
                    }
                }
            }
            this.f17019a = u.b.a(curveType, dArr, dArr2);
        }

        @Override // b0.d
        public void m(View view, float t6) {
            this.f17019a.e(t6, this.f7148j);
            b0.a.b(this.f7147i.valueAt(0), view, this.f7148j);
        }

        public void n(int position, androidx.constraintlayout.widget.a value) {
            this.f7147i.append(position, value);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setElevation(a(t6));
        }
    }

    /* renamed from: b0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0077d extends d {
        @Override // b0.d
        public void m(View view, float t6) {
        }

        public void n(View view, float t6, double dx, double dy) {
            view.setRotation(a(t6) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setPivotX(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class f extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setPivotY(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class g extends d {

        /* renamed from: h  reason: collision with root package name */
        public boolean f7149h = false;

        @Override // b0.d
        public void m(View view, float t6) {
            Method method;
            if (view instanceof s) {
                ((s) view).setProgress(a(t6));
            } else if (this.f7149h) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f7149h = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(t6)));
                    } catch (IllegalAccessException e7) {
                        Log.e(d.f7145g, "unable to setProgress", e7);
                    } catch (InvocationTargetException e8) {
                        Log.e(d.f7145g, "unable to setProgress", e8);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setRotation(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class i extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setRotationX(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class j extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setRotationY(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class k extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setScaleX(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class l extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setScaleY(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class m extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setTranslationX(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class n extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setTranslationY(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class o extends d {
        @Override // b0.d
        public void m(View view, float t6) {
            view.setTranslationZ(a(t6));
        }
    }

    public static d k(String str, SparseArray<androidx.constraintlayout.widget.a> attrList) {
        return new b(str, attrList);
    }

    public static d l(String str) {
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
            case -797520672:
                if (str.equals(c0.f.f7374t)) {
                    c7 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals(c0.f.f7366l)) {
                    c7 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals(c0.f.f7367m)) {
                    c7 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(c0.f.f7363i)) {
                    c7 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c7 = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c7 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c7 = 15;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case '\b':
                return new a();
            case '\t':
                return new e();
            case '\n':
                return new f();
            case 11:
                return new h();
            case '\f':
                return new c();
            case '\r':
                return new C0077d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float t6);
}