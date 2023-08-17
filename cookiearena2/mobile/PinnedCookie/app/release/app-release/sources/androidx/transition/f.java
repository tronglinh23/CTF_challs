package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static Method f6525a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f6526b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f6527c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(@d.o0 Canvas canvas, boolean z6) {
        Method method;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            if (z6) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i7 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        } else {
            if (!f6527c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f6525a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    f6526b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f6527c = true;
            }
            if (z6) {
                try {
                    Method method2 = f6525a;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException(e7.getCause());
                }
            }
            if (z6 || (method = f6526b) == null) {
                return;
            }
            method.invoke(canvas, new Object[0]);
        }
    }
}
