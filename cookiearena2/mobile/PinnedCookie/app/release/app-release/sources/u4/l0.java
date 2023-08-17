package u4;

import java.util.Arrays;
import v3.l2;
/* loaded from: classes.dex */
public class l0 {

    @v3.g1(version = "1.4")
    /* loaded from: classes.dex */
    public static class a {
    }

    public static <T extends Throwable> T A(T t6) {
        return (T) B(t6, l0.class.getName());
    }

    public static <T extends Throwable> T B(T t6, String str) {
        StackTraceElement[] stackTrace = t6.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i7 = i8;
            }
        }
        t6.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
        return t6;
    }

    public static String C(String str, Object obj) {
        return str + obj;
    }

    public static void D() {
        throw ((AssertionError) A(new AssertionError()));
    }

    public static void E(String str) {
        throw ((AssertionError) A(new AssertionError(str)));
    }

    public static void F() {
        throw ((IllegalArgumentException) A(new IllegalArgumentException()));
    }

    public static void G(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(str)));
    }

    public static void H() {
        throw ((IllegalStateException) A(new IllegalStateException()));
    }

    public static void I(String str) {
        throw ((IllegalStateException) A(new IllegalStateException(str)));
    }

    @v3.g1(version = "1.4")
    public static void J() {
        throw ((NullPointerException) A(new NullPointerException()));
    }

    @v3.g1(version = "1.4")
    public static void K(String str) {
        throw ((NullPointerException) A(new NullPointerException(str)));
    }

    public static void L() {
        throw ((v3.z) A(new v3.z()));
    }

    public static void M(String str) {
        throw ((v3.z) A(new v3.z(str)));
    }

    public static void N(String str) {
        throw ((IllegalArgumentException) A(new IllegalArgumentException(v(str))));
    }

    public static void O(String str) {
        throw ((NullPointerException) A(new NullPointerException(v(str))));
    }

    public static void P() {
        Q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void Q(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void R(String str) {
        throw ((l2) A(new l2(str)));
    }

    public static void S(String str) {
        R("lateinit property " + str + " has not been initialized");
    }

    @v3.g1(version = "1.1")
    public static boolean a(double d7, Double d8) {
        return d8 != null && d7 == d8.doubleValue();
    }

    @v3.g1(version = "1.1")
    public static boolean b(float f7, Float f8) {
        return f8 != null && f7 == f8.floatValue();
    }

    @v3.g1(version = "1.1")
    public static boolean c(Double d7, double d8) {
        return d7 != null && d7.doubleValue() == d8;
    }

    @v3.g1(version = "1.1")
    public static boolean d(Double d7, Double d8) {
        if (d7 == null) {
            if (d8 == null) {
                return true;
            }
        } else if (d8 != null && d7.doubleValue() == d8.doubleValue()) {
            return true;
        }
        return false;
    }

    @v3.g1(version = "1.1")
    public static boolean e(Float f7, float f8) {
        return f7 != null && f7.floatValue() == f8;
    }

    @v3.g1(version = "1.1")
    public static boolean f(Float f7, Float f8) {
        if (f7 == null) {
            if (f8 == null) {
                return true;
            }
        } else if (f8 != null && f7.floatValue() == f8.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException(str + " must not be null")));
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void j(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException("Field specified as non-null is null: " + str + "." + str2)));
    }

    public static void k(String str) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e7) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException("Class " + replace + " is not found. Please update the Kotlin runtime to the latest version", e7)));
        }
    }

    public static void l(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e7) {
            throw ((ClassNotFoundException) A(new ClassNotFoundException("Class " + replace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e7)));
        }
    }

    public static void m(Object obj) {
        if (obj == null) {
            J();
        }
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            K(str);
        }
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) A(new NullPointerException(str + " must not be null")));
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            O(str);
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            N(str);
        }
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) A(new IllegalStateException(str)));
        }
    }

    public static void s(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) A(new IllegalStateException("Method specified as non-null returned null: " + str + "." + str2)));
    }

    public static int t(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 == i8 ? 0 : 1;
    }

    public static int u(long j7, long j8) {
        int i7 = (j7 > j8 ? 1 : (j7 == j8 ? 0 : -1));
        if (i7 < 0) {
            return -1;
        }
        return i7 == 0 ? 0 : 1;
    }

    public static String v(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = l0.class.getName();
        int i7 = 0;
        while (!stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        while (stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        StackTraceElement stackTraceElement = stackTrace[i7];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void w() {
        P();
    }

    public static void x(String str) {
        Q(str);
    }

    public static void y(int i7, String str) {
        P();
    }

    public static void z(int i7, String str, String str2) {
        Q(str2);
    }
}
