package l0;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import d.b1;
import d.o0;
import d.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class k {

    @w0(28)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static int a(PermissionInfo permissionInfo) {
            int protection;
            protection = permissionInfo.getProtection();
            return protection;
        }

        @d.u
        public static int b(PermissionInfo permissionInfo) {
            int protectionFlags;
            protectionFlags = permissionInfo.getProtectionFlags();
            return protectionFlags;
        }
    }

    @b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    @SuppressLint({"UniqueConstants"})
    @b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    @SuppressLint({"WrongConstant"})
    public static int a(@o0 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.a(permissionInfo) : permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(@o0 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.b(permissionInfo) : permissionInfo.protectionLevel & (-16);
    }
}