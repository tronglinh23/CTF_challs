package k0;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import d.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f11518a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f11519b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f11520c = -2;

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public static int a(@d.o0 Context context, @d.o0 String str) {
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(@d.o0 Context context, @d.o0 String str, @d.q0 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(@d.o0 Context context, @d.o0 String str, int i7, int i8, @d.q0 String str2) {
        if (context.checkPermission(str, i7, i8) == -1) {
            return -1;
        }
        String f7 = i0.n.f(str);
        if (f7 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i8);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i8 && g1.n.a(context.getPackageName(), str2) ? i0.n.a(context, i8, f7, str2) : i0.n.e(context, f7, str2)) == 0 ? 0 : -2;
    }

    public static int d(@d.o0 Context context, @d.o0 String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}