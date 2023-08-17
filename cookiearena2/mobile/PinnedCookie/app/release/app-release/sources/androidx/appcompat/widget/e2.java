package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import d.b1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1578a = "ViewUtils";

    /* renamed from: b  reason: collision with root package name */
    public static Method f1579b;
    @d.b1({b1.a.LIBRARY})
    @d.k(api = 27)

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f1580c;

    static {
        f1580c = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1579b = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f1579b.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1579b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(View view) {
        return androidx.core.view.u1.Z(view) == 1;
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
