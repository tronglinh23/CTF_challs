package i0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class p {

    @d.w0(18)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @d.u
        public static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final String f10789a = "BundleCompatBaseImpl";

        /* renamed from: b  reason: collision with root package name */
        public static Method f10790b;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f10791c;

        /* renamed from: d  reason: collision with root package name */
        public static Method f10792d;

        /* renamed from: e  reason: collision with root package name */
        public static boolean f10793e;

        public static IBinder a(Bundle bundle, String str) {
            if (!f10791c) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f10790b = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e7) {
                    Log.i(f10789a, "Failed to retrieve getIBinder method", e7);
                }
                f10791c = true;
            }
            Method method2 = f10790b;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e8) {
                    Log.i(f10789a, "Failed to invoke getIBinder via reflection", e8);
                    f10790b = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f10793e) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f10792d = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e7) {
                    Log.i(f10789a, "Failed to retrieve putIBinder method", e7);
                }
                f10793e = true;
            }
            Method method2 = f10792d;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e8) {
                    Log.i(f10789a, "Failed to invoke putIBinder via reflection", e8);
                    f10792d = null;
                }
            }
        }
    }

    @d.q0
    public static IBinder a(@d.o0 Bundle bundle, @d.q0 String str) {
        return a.a(bundle, str);
    }

    public static void b(@d.o0 Bundle bundle, @d.q0 String str, @d.q0 IBinder iBinder) {
        a.b(bundle, str, iBinder);
    }
}
