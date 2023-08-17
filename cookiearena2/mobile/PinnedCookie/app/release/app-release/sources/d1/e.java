package d1;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.util.Log;
import d.o0;
import d.q0;
import d.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8309a = "ICUCompat";

    /* renamed from: b  reason: collision with root package name */
    public static Method f8310b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f8311c;

    @w0(21)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    @w0(24)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @d.u
        public static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @d.u
        public static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f8311c;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException e7) {
            Log.w(f8309a, e7);
        } catch (InvocationTargetException e8) {
            Log.w(f8309a, e8);
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static String b(String str) {
        try {
            Method method = f8310b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e7) {
            Log.w(f8309a, e7);
        } catch (InvocationTargetException e8) {
            Log.w(f8309a, e8);
        }
        return null;
    }

    @q0
    public static String c(@o0 Locale locale) {
        return b.c(b.a(b.b(locale)));
    }
}
