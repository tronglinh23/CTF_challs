package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@d.w0(21)
/* loaded from: classes.dex */
public class s implements q {

    /* renamed from: c  reason: collision with root package name */
    public static final String f6766c = "GhostViewApi21";

    /* renamed from: d  reason: collision with root package name */
    public static Class<?> f6767d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f6768e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f6769f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f6770g;

    /* renamed from: h  reason: collision with root package name */
    public static Method f6771h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f6772i;

    /* renamed from: b  reason: collision with root package name */
    public final View f6773b;

    public s(@d.o0 View view) {
        this.f6773b = view;
    }

    public static q b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = f6769f;
        if (method != null) {
            try {
                return new s((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e7) {
                throw new RuntimeException(e7.getCause());
            }
        }
        return null;
    }

    public static void c() {
        if (f6770g) {
            return;
        }
        try {
            d();
            Method declaredMethod = f6767d.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f6769f = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e7) {
            Log.i(f6766c, "Failed to retrieve addGhost method", e7);
        }
        f6770g = true;
    }

    public static void d() {
        if (f6768e) {
            return;
        }
        try {
            f6767d = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e7) {
            Log.i(f6766c, "Failed to retrieve GhostView class", e7);
        }
        f6768e = true;
    }

    public static void e() {
        if (f6772i) {
            return;
        }
        try {
            d();
            Method declaredMethod = f6767d.getDeclaredMethod("removeGhost", View.class);
            f6771h = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e7) {
            Log.i(f6766c, "Failed to retrieve removeGhost method", e7);
        }
        f6772i = true;
    }

    public static void f(View view) {
        e();
        Method method = f6771h;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e7) {
                throw new RuntimeException(e7.getCause());
            }
        }
    }

    @Override // androidx.transition.q
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.q
    public void setVisibility(int i7) {
        this.f6773b.setVisibility(i7);
    }
}