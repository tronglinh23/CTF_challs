package z0;

import android.os.UserHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@d.w0(17)
/* loaded from: classes.dex */
public class c1 {
    @d.q0

    /* renamed from: a  reason: collision with root package name */
    public static Method f19014a;
    @d.q0

    /* renamed from: b  reason: collision with root package name */
    public static Constructor<UserHandle> f19015b;

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @d.o0
        public static UserHandle a(int i7) {
            return UserHandle.getUserHandleForUid(i7);
        }
    }

    public static Method a() throws NoSuchMethodException {
        if (f19014a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f19014a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f19014a;
    }

    public static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (f19015b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f19015b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f19015b;
    }

    @d.o0
    public static UserHandle c(int i7) {
        return a.a(i7);
    }
}