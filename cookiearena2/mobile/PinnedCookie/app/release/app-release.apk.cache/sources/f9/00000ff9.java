package g1;

import android.text.TextUtils;
import d.b1;
import d.o0;
import d.q0;
import java.util.Locale;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class s {
    public static void a(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z6, @o0 Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z6, @o0 String str, @o0 Object... objArr) {
        if (!z6) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static float d(float f7, @o0 String str) {
        if (Float.isNaN(f7)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        } else if (Float.isInfinite(f7)) {
            throw new IllegalArgumentException(str + " must not be infinite");
        } else {
            return f7;
        }
    }

    public static double e(double d7, double d8, double d9, @o0 String str) {
        if (d7 >= d8) {
            if (d7 <= d9) {
                return d7;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d8), Double.valueOf(d9)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d8), Double.valueOf(d9)));
    }

    public static float f(float f7, float f8, float f9, @o0 String str) {
        if (f7 >= f8) {
            if (f7 <= f9) {
                return f7;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f8), Float.valueOf(f9)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f8), Float.valueOf(f9)));
    }

    public static int g(int i7, int i8, int i9, @o0 String str) {
        if (i7 >= i8) {
            if (i7 <= i9) {
                return i7;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    public static long h(long j7, long j8, long j9, @o0 String str) {
        if (j7 >= j8) {
            if (j7 <= j9) {
                return j7;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j8), Long.valueOf(j9)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j8), Long.valueOf(j9)));
    }

    @d.g0(from = 0)
    public static int i(int i7) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException();
    }

    @d.g0(from = 0)
    public static int j(int i7, @q0 String str) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException(str);
    }

    public static int k(int i7, int i8) {
        if ((i7 & i8) == i7) {
            return i7;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i7) + ", but only 0x" + Integer.toHexString(i8) + " are allowed");
    }

    @o0
    public static <T> T l(@q0 T t6) {
        t6.getClass();
        return t6;
    }

    @o0
    public static <T> T m(@q0 T t6, @o0 Object obj) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void n(boolean z6) {
        o(z6, null);
    }

    public static void o(boolean z6, @q0 String str) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }

    @o0
    public static <T extends CharSequence> T p(@q0 T t6) {
        if (TextUtils.isEmpty(t6)) {
            throw new IllegalArgumentException();
        }
        return t6;
    }

    @o0
    public static <T extends CharSequence> T q(@q0 T t6, @o0 Object obj) {
        if (TextUtils.isEmpty(t6)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t6;
    }

    @o0
    public static <T extends CharSequence> T r(@q0 T t6, @o0 String str, @o0 Object... objArr) {
        if (TextUtils.isEmpty(t6)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t6;
    }
}