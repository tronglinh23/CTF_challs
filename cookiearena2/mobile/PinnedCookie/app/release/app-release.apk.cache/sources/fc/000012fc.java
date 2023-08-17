package k0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import d.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class u0 {
    @d.b1({b1.a.LIBRARY})

    /* renamed from: a  reason: collision with root package name */
    public static final String f11515a = "PackageManagerCompat";
    @SuppressLint({"ActionValue"})

    /* renamed from: b  reason: collision with root package name */
    public static final String f11516b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(@d.o0 Context context) {
            boolean isAutoRevokeWhitelisted;
            isAutoRevokeWhitelisted = context.getPackageManager().isAutoRevokeWhitelisted();
            return !isAutoRevokeWhitelisted;
        }
    }

    @d.b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    @d.b1({b1.a.LIBRARY})
    public static boolean a(@d.o0 PackageManager packageManager) {
        int i7 = Build.VERSION.SDK_INT;
        boolean z6 = i7 >= 30;
        boolean z7 = i7 < 30;
        boolean z8 = b(packageManager) != null;
        if (z6) {
            return true;
        }
        return z7 && z8;
    }

    @d.b1({b1.a.LIBRARY})
    @d.q0
    public static String b(@d.o0 PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(f11516b).setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @d.o0
    public static ListenableFuture<Integer> c(@d.o0 Context context) {
        p.e<Integer> u6 = p.e.u();
        if (!z0.d1.a(context)) {
            u6.p(0);
            Log.e(f11515a, "User is in locked direct boot mode");
            return u6;
        } else if (!a(context.getPackageManager())) {
            u6.p(1);
            return u6;
        } else {
            int i7 = context.getApplicationInfo().targetSdkVersion;
            if (i7 < 30) {
                u6.p(0);
                Log.e(f11515a, "Target SDK version below API 30");
                return u6;
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 31) {
                if (a.a(context)) {
                    u6.p(Integer.valueOf(i7 >= 31 ? 5 : 4));
                } else {
                    u6.p(2);
                }
                return u6;
            } else if (i8 == 30) {
                u6.p(Integer.valueOf(a.a(context) ? 4 : 2));
                return u6;
            } else {
                final a1 a1Var = new a1(context);
                u6.addListener(new Runnable() { // from class: k0.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        a1.this.b();
                    }
                }, Executors.newSingleThreadExecutor());
                a1Var.a(u6);
                return u6;
            }
        }
    }
}