package g1;

import d.o0;
import d.q0;
import d.w0;
import java.util.Objects;

/* loaded from: classes.dex */
public class n {

    @w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @d.u
        public static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    public static boolean a(@q0 Object obj, @q0 Object obj2) {
        return a.a(obj, obj2);
    }

    public static int b(@q0 Object... objArr) {
        return a.b(objArr);
    }

    public static int c(@q0 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @o0
    public static <T> T d(@q0 T t6) {
        t6.getClass();
        return t6;
    }

    @o0
    public static <T> T e(@q0 T t6, @o0 String str) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(str);
    }

    @q0
    public static String f(@q0 Object obj, @q0 String str) {
        return obj != null ? obj.toString() : str;
    }
}