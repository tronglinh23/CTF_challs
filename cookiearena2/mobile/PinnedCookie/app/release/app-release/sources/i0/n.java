package i0;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final int f10752a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f10753b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10754c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f10755d = 3;

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static int a(AppOpsManager appOpsManager, String str, int i7, String str2) {
            return appOpsManager.noteOp(str, i7, str2);
        }

        @d.u
        public static int b(AppOpsManager appOpsManager, String str, int i7, String str2) {
            return appOpsManager.noteOpNoThrow(str, i7, str2);
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @d.u
        public static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @d.u
        public static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @d.u
        public static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static int a(@d.q0 AppOpsManager appOpsManager, @d.o0 String str, int i7, @d.o0 String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i7, str2);
        }

        @d.u
        @d.o0
        public static String b(@d.o0 Context context) {
            String opPackageName;
            opPackageName = context.getOpPackageName();
            return opPackageName;
        }

        @d.u
        @d.q0
        public static AppOpsManager c(@d.o0 Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(@d.o0 Context context, int i7, @d.o0 String str, @d.o0 String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager c7 = c.c(context);
            int a7 = c.a(c7, str, Binder.getCallingUid(), str2);
            return a7 != 0 ? a7 : c.a(c7, str, i7, c.b(context));
        }
        return e(context, str, str2);
    }

    public static int b(@d.o0 Context context, @d.o0 String str, int i7, @d.o0 String str2) {
        return a.a((AppOpsManager) context.getSystemService("appops"), str, i7, str2);
    }

    public static int c(@d.o0 Context context, @d.o0 String str, int i7, @d.o0 String str2) {
        return a.b((AppOpsManager) context.getSystemService("appops"), str, i7, str2);
    }

    public static int d(@d.o0 Context context, @d.o0 String str, @d.o0 String str2) {
        return b.b((AppOpsManager) b.a(context, AppOpsManager.class), str, str2);
    }

    public static int e(@d.o0 Context context, @d.o0 String str, @d.o0 String str2) {
        return b.c((AppOpsManager) b.a(context, AppOpsManager.class), str, str2);
    }

    @d.q0
    public static String f(@d.o0 String str) {
        return b.d(str);
    }
}
