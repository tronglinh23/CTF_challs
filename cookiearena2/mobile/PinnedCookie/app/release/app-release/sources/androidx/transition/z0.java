package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f6820a = true;

    /* renamed from: b  reason: collision with root package name */
    public static Method f6821b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f6822c;

    public static int a(@d.o0 ViewGroup viewGroup, int i7) {
        int childDrawingOrder;
        if (Build.VERSION.SDK_INT >= 29) {
            childDrawingOrder = viewGroup.getChildDrawingOrder(i7);
            return childDrawingOrder;
        }
        if (!f6822c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f6821b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f6822c = true;
        }
        Method method = f6821b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i7))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i7;
    }

    public static w0 b(@d.o0 ViewGroup viewGroup) {
        return new v0(viewGroup);
    }

    @SuppressLint({"NewApi"})
    @d.w0(18)
    public static void c(@d.o0 ViewGroup viewGroup, boolean z6) {
        if (f6820a) {
            try {
                viewGroup.suppressLayout(z6);
            } catch (NoSuchMethodError unused) {
                f6820a = false;
            }
        }
    }

    public static void d(@d.o0 ViewGroup viewGroup, boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z6);
        } else {
            c(viewGroup, z6);
        }
    }
}
