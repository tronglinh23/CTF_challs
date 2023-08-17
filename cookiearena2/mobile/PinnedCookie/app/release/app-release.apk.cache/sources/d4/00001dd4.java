package y0;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import d.a1;
import d.b1;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f18711a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f18712b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f18713c = 3;

    @w0(16)
    /* renamed from: y0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0266a {
        @a1("android.permission.ACCESS_NETWORK_STATE")
        @u
        public static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    @w0(24)
    /* loaded from: classes.dex */
    public static class b {
        @u
        public static int a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    @a1("android.permission.ACCESS_NETWORK_STATE")
    @q0
    @SuppressLint({"ReferencesDeprecated"})
    public static NetworkInfo a(@o0 ConnectivityManager connectivityManager, @o0 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int b(@o0 ConnectivityManager connectivityManager) {
        return b.a(connectivityManager);
    }

    @a1("android.permission.ACCESS_NETWORK_STATE")
    public static boolean c(@o0 ConnectivityManager connectivityManager) {
        return C0266a.a(connectivityManager);
    }
}