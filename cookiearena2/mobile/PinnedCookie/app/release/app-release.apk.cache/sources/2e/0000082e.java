package b1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import d.a1;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static Method f7163a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f7164b;

    @w0(23)
    /* loaded from: classes.dex */
    public static class a {
        @u
        @SuppressLint({"MissingPermission"})
        @a1("android.permission.READ_PHONE_STATE")
        @q0
        public static String a(TelephonyManager telephonyManager, int i7) {
            return telephonyManager.getDeviceId(i7);
        }
    }

    @w0(26)
    /* loaded from: classes.dex */
    public static class b {
        @u
        @SuppressLint({"MissingPermission"})
        @a1("android.permission.READ_PHONE_STATE")
        @q0
        public static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    @w0(30)
    /* renamed from: b1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0079c {
        @u
        public static int a(TelephonyManager telephonyManager) {
            int subscriptionId;
            subscriptionId = telephonyManager.getSubscriptionId();
            return subscriptionId;
        }
    }

    @a1("android.permission.READ_PHONE_STATE")
    @q0
    @SuppressLint({"MissingPermission"})
    public static String a(@o0 TelephonyManager telephonyManager) {
        return b.a(telephonyManager);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int b(@o0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0079c.a(telephonyManager);
        }
        try {
            if (f7164b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
                f7164b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f7164b.invoke(telephonyManager, new Object[0]);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}