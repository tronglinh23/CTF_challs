package androidx.lifecycle;

import android.app.Application;
import d.b1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
@d.b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public final class w0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f4849a = x3.w.L(Application.class, r0.class);
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f4850b = x3.v.k(r0.class);

    public static final /* synthetic */ List a() {
        return f4849a;
    }

    public static final /* synthetic */ List b() {
        return f4850b;
    }

    @n6.e
    public static final <T> Constructor<T> c(@n6.d Class<T> cls, @n6.d List<? extends Class<?>> list) {
        u4.l0.p(cls, "modelClass");
        u4.l0.p(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        u4.l0.o(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            u4.l0.o(parameterTypes, "constructor.parameterTypes");
            List kz = x3.p.kz(parameterTypes);
            if (u4.l0.g(list, kz)) {
                u4.l0.n(constructor2, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor2;
            } else if (list.size() == kz.size() && kz.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends z0> T d(@n6.d Class<T> cls, @n6.d Constructor<T> constructor, @n6.d Object... objArr) {
        u4.l0.p(cls, "modelClass");
        u4.l0.p(constructor, "constructor");
        u4.l0.p(objArr, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e9.getCause());
        }
    }
}
