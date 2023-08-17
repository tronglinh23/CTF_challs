package d6;

import java.lang.reflect.Method;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f8551d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Method f8552a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f8553b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f8554c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        public final j a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new j(method, method3, method2);
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public j(@n6.e Method method, @n6.e Method method2, @n6.e Method method3) {
        this.f8552a = method;
        this.f8553b = method2;
        this.f8554c = method3;
    }

    @n6.e
    public final Object a(@n6.d String str) {
        l0.p(str, "closer");
        Method method = this.f8552a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f8553b;
                l0.m(method2);
                method2.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(@n6.e Object obj) {
        if (obj != null) {
            try {
                Method method = this.f8554c;
                l0.m(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}
