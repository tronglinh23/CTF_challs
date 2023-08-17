package u4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import v4.g;
/* loaded from: classes.dex */
public class u1 {
    public static int A(Object obj) {
        if (obj instanceof e0) {
            return ((e0) obj).e();
        }
        if (obj instanceof t4.a) {
            return 0;
        }
        if (obj instanceof t4.l) {
            return 1;
        }
        if (obj instanceof t4.p) {
            return 2;
        }
        if (obj instanceof t4.q) {
            return 3;
        }
        if (obj instanceof t4.r) {
            return 4;
        }
        if (obj instanceof t4.s) {
            return 5;
        }
        if (obj instanceof t4.t) {
            return 6;
        }
        if (obj instanceof t4.u) {
            return 7;
        }
        if (obj instanceof t4.v) {
            return 8;
        }
        if (obj instanceof t4.w) {
            return 9;
        }
        if (obj instanceof t4.b) {
            return 10;
        }
        if (obj instanceof t4.c) {
            return 11;
        }
        if (obj instanceof t4.d) {
            return 12;
        }
        if (obj instanceof t4.e) {
            return 13;
        }
        if (obj instanceof t4.f) {
            return 14;
        }
        if (obj instanceof t4.g) {
            return 15;
        }
        if (obj instanceof t4.h) {
            return 16;
        }
        if (obj instanceof t4.i) {
            return 17;
        }
        if (obj instanceof t4.j) {
            return 18;
        }
        if (obj instanceof t4.k) {
            return 19;
        }
        if (obj instanceof t4.m) {
            return 20;
        }
        if (obj instanceof t4.n) {
            return 21;
        }
        return obj instanceof t4.o ? 22 : -1;
    }

    public static boolean B(Object obj, int i7) {
        return (obj instanceof v3.v) && A(obj) == i7;
    }

    public static boolean C(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof v4.a) || (obj instanceof v4.b));
    }

    public static boolean D(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof v4.a) || (obj instanceof v4.c));
    }

    public static boolean E(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof v4.a) || (obj instanceof v4.d));
    }

    public static boolean F(Object obj) {
        return (obj instanceof List) && (!(obj instanceof v4.a) || (obj instanceof v4.e));
    }

    public static boolean G(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof v4.a) || (obj instanceof v4.f));
    }

    public static boolean H(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof v4.a) || (obj instanceof v4.g));
    }

    public static boolean I(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof v4.a) || (obj instanceof g.a));
    }

    public static boolean J(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof v4.a) || (obj instanceof v4.h));
    }

    public static <T extends Throwable> T K(T t6) {
        return (T) l0.B(t6, u1.class.getName());
    }

    public static ClassCastException L(ClassCastException classCastException) {
        throw ((ClassCastException) K(classCastException));
    }

    public static void M(Object obj, String str) {
        N((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void N(String str) {
        throw L(new ClassCastException(str));
    }

    public static Collection a(Object obj) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.b)) {
            M(obj, "kotlin.collections.MutableCollection");
        }
        return s(obj);
    }

    public static Collection b(Object obj, String str) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.b)) {
            N(str);
        }
        return s(obj);
    }

    public static Iterable c(Object obj) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.c)) {
            M(obj, "kotlin.collections.MutableIterable");
        }
        return t(obj);
    }

    public static Iterable d(Object obj, String str) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.c)) {
            N(str);
        }
        return t(obj);
    }

    public static Iterator e(Object obj) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.d)) {
            M(obj, "kotlin.collections.MutableIterator");
        }
        return u(obj);
    }

    public static Iterator f(Object obj, String str) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.d)) {
            N(str);
        }
        return u(obj);
    }

    public static List g(Object obj) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.e)) {
            M(obj, "kotlin.collections.MutableList");
        }
        return v(obj);
    }

    public static List h(Object obj, String str) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.e)) {
            N(str);
        }
        return v(obj);
    }

    public static ListIterator i(Object obj) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.f)) {
            M(obj, "kotlin.collections.MutableListIterator");
        }
        return w(obj);
    }

    public static ListIterator j(Object obj, String str) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.f)) {
            N(str);
        }
        return w(obj);
    }

    public static Map k(Object obj) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.g)) {
            M(obj, "kotlin.collections.MutableMap");
        }
        return x(obj);
    }

    public static Map l(Object obj, String str) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.g)) {
            N(str);
        }
        return x(obj);
    }

    public static Map.Entry m(Object obj) {
        if ((obj instanceof v4.a) && !(obj instanceof g.a)) {
            M(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return y(obj);
    }

    public static Map.Entry n(Object obj, String str) {
        if ((obj instanceof v4.a) && !(obj instanceof g.a)) {
            N(str);
        }
        return y(obj);
    }

    public static Set o(Object obj) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.h)) {
            M(obj, "kotlin.collections.MutableSet");
        }
        return z(obj);
    }

    public static Set p(Object obj, String str) {
        if ((obj instanceof v4.a) && !(obj instanceof v4.h)) {
            N(str);
        }
        return z(obj);
    }

    public static Object q(Object obj, int i7) {
        if (obj != null && !B(obj, i7)) {
            M(obj, "kotlin.jvm.functions.Function" + i7);
        }
        return obj;
    }

    public static Object r(Object obj, int i7, String str) {
        if (obj != null && !B(obj, i7)) {
            N(str);
        }
        return obj;
    }

    public static Collection s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e7) {
            throw L(e7);
        }
    }

    public static Iterable t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e7) {
            throw L(e7);
        }
    }

    public static Iterator u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e7) {
            throw L(e7);
        }
    }

    public static List v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e7) {
            throw L(e7);
        }
    }

    public static ListIterator w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e7) {
            throw L(e7);
        }
    }

    public static Map x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e7) {
            throw L(e7);
        }
    }

    public static Map.Entry y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e7) {
            throw L(e7);
        }
    }

    public static Set z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e7) {
            throw L(e7);
        }
    }
}
