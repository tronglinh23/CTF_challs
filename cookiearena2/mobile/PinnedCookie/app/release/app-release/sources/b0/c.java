package b0;

import android.util.Log;
import android.view.View;
import c0.s;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class c extends u.h {

    /* renamed from: i  reason: collision with root package name */
    public static final String f7141i = "ViewOscillator";

    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // b0.c
        public void m(View view, float t6) {
            view.setAlpha(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends c {

        /* renamed from: j  reason: collision with root package name */
        public float[] f7142j = new float[1];

        /* renamed from: k  reason: collision with root package name */
        public androidx.constraintlayout.widget.a f7143k;

        @Override // u.h
        public void e(Object custom) {
            this.f7143k = (androidx.constraintlayout.widget.a) custom;
        }

        @Override // b0.c
        public void m(View view, float t6) {
            this.f7142j[0] = a(t6);
            b0.a.b(this.f7143k, view, this.f7142j);
        }
    }

    /* renamed from: b0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0076c extends c {
        @Override // b0.c
        public void m(View view, float t6) {
            view.setElevation(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // b0.c
        public void m(View view, float t6) {
        }

        public void n(View view, float t6, double dx, double dy) {
            view.setRotation(a(t6) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends c {

        /* renamed from: j  reason: collision with root package name */
        public boolean f7144j = false;

        @Override // b0.c
        public void m(View view, float t6) {
            Method method;
            if (view instanceof s) {
                ((s) view).setProgress(a(t6));
            } else if (this.f7144j) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f7144j = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(t6)));
                    } catch (IllegalAccessException e7) {
                        Log.e(c.f7141i, "unable to setProgress", e7);
                    } catch (InvocationTargetException e8) {
                        Log.e(c.f7141i, "unable to setProgress", e8);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends c {
        @Override // b0.c
        public void m(View view, float t6) {
            view.setRotation(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class g extends c {
        @Override // b0.c
        public void m(View view, float t6) {
            view.setRotationX(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class h extends c {
        @Override // b0.c
        public void m(View view, float t6) {
            view.setRotationY(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class i extends c {
        @Override // b0.c
        public void m(View view, float t6) {
            view.setScaleX(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class j extends c {
        @Override // b0.c
        public void m(View view, float t6) {
            view.setScaleY(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class k extends c {
        @Override // b0.c
        public void m(View view, float t6) {
            view.setTranslationX(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class l extends c {
        @Override // b0.c
        public void m(View view, float t6) {
            view.setTranslationY(a(t6));
        }
    }

    /* loaded from: classes.dex */
    public static class m extends c {
        @Override // b0.c
        public void m(View view, float t6) {
            view.setTranslationZ(a(t6));
        }
    }

    public static c l(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
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
            case -40300674:
                if (str.equals(c0.f.f7363i)) {
                    c7 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c7 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c7 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c7 = '\r';
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case '\b':
                return new a();
            case '\t':
                return new f();
            case '\n':
                return new C0076c();
            case 11:
                return new d();
            case '\f':
                return new a();
            case '\r':
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float t6);
}
