package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.transition.d0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class r1 {

    /* renamed from: b  reason: collision with root package name */
    public static final String f6759b = "ViewUtilsBase";

    /* renamed from: c  reason: collision with root package name */
    public static Method f6760c = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f6761d = false;

    /* renamed from: e  reason: collision with root package name */
    public static Field f6762e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f6763f = false;

    /* renamed from: g  reason: collision with root package name */
    public static final int f6764g = 12;

    /* renamed from: a  reason: collision with root package name */
    public float[] f6765a;

    public void a(@d.o0 View view) {
        if (view.getVisibility() == 0) {
            view.setTag(d0.g.Y0, null);
        }
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    public final void b() {
        if (f6761d) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f6760c = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e7) {
            Log.i(f6759b, "Failed to retrieve setFrame method", e7);
        }
        f6761d = true;
    }

    public float c(@d.o0 View view) {
        Float f7 = (Float) view.getTag(d0.g.Y0);
        return f7 != null ? view.getAlpha() / f7.floatValue() : view.getAlpha();
    }

    public void d(@d.o0 View view) {
        if (view.getTag(d0.g.Y0) == null) {
            view.setTag(d0.g.Y0, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(@d.o0 View view, @d.q0 Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f6765a;
        if (fArr == null) {
            fArr = new float[9];
            this.f6765a = fArr;
        }
        matrix.getValues(fArr);
        float f7 = fArr[3];
        float sqrt = ((float) Math.sqrt(1.0f - (f7 * f7))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f7, sqrt));
        float f8 = fArr[0] / sqrt;
        float f9 = fArr[4] / sqrt;
        float f10 = fArr[2];
        float f11 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        view.setRotation(degrees);
        view.setScaleX(f8);
        view.setScaleY(f9);
    }

    public void f(@d.o0 View view, int i7, int i8, int i9, int i10) {
        b();
        Method method = f6760c;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e7) {
                throw new RuntimeException(e7.getCause());
            }
        }
    }

    public void g(@d.o0 View view, float f7) {
        Float f8 = (Float) view.getTag(d0.g.Y0);
        if (f8 != null) {
            view.setAlpha(f8.floatValue() * f7);
        } else {
            view.setAlpha(f7);
        }
    }

    public void h(@d.o0 View view, int i7) {
        if (!f6763f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6762e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f6759b, "fetchViewFlagsField: ");
            }
            f6763f = true;
        }
        Field field = f6762e;
        if (field != null) {
            try {
                f6762e.setInt(view, i7 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(@d.o0 View view, @d.o0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            i((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void j(@d.o0 View view, @d.o0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            j((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
