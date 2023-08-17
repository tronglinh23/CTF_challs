package z0;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class v0 {

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Object f19039a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public static Method f19040b;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f19041c;

        @SuppressLint({"PrivateApi"})
        public static boolean a(int i7) {
            try {
                synchronized (f19039a) {
                    if (!f19041c) {
                        f19041c = true;
                        f19040b = Class.forName("android.os.UserId").getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f19040b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i7));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            return true;
        }
    }

    @d.w0(17)
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final Object f19042a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public static Method f19043b;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f19044c;

        @SuppressLint({"DiscouragedPrivateApi"})
        public static boolean a(int i7) {
            try {
                synchronized (f19042a) {
                    if (!f19044c) {
                        f19044c = true;
                        f19043b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f19043b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i7));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            return true;
        }
    }

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(int i7) {
            return Process.isApplicationUid(i7);
        }
    }

    public static boolean a(int i7) {
        return c.a(i7);
    }
}
