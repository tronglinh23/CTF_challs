package androidx.lifecycle;

import d.b1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f4731b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f4732c = 2;
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f4730a = new d0();
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final Map<Class<?>, Integer> f4733d = new HashMap();
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final Map<Class<?>, List<Constructor<? extends m>>> f4734e = new HashMap();

    @n6.d
    @s4.m
    public static final String c(@n6.d String str) {
        u4.l0.p(str, "className");
        return i5.b0.l2(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    @n6.d
    @s4.m
    public static final v f(@n6.d Object obj) {
        u4.l0.p(obj, "object");
        boolean z6 = obj instanceof v;
        boolean z7 = obj instanceof h;
        if (z6 && z7) {
            return new DefaultLifecycleObserverAdapter((h) obj, (v) obj);
        }
        if (z7) {
            return new DefaultLifecycleObserverAdapter((h) obj, null);
        }
        if (z6) {
            return (v) obj;
        }
        Class<?> cls = obj.getClass();
        d0 d0Var = f4730a;
        if (d0Var.d(cls) == 2) {
            List<Constructor<? extends m>> list = f4734e.get(cls);
            u4.l0.m(list);
            List<Constructor<? extends m>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(d0Var.a(list2.get(0), obj));
            }
            int size = list2.size();
            m[] mVarArr = new m[size];
            for (int i7 = 0; i7 < size; i7++) {
                mVarArr[i7] = f4730a.a(list2.get(i7), obj);
            }
            return new CompositeGeneratedAdaptersObserver(mVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    public final m a(Constructor<? extends m> constructor, Object obj) {
        try {
            m newInstance = constructor.newInstance(obj);
            u4.l0.o(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    public final Constructor<? extends m> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            u4.l0.o(name, "fullPackage");
            if (!(name.length() == 0)) {
                u4.l0.o(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                u4.l0.o(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            u4.l0.o(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c7 = c(canonicalName);
            if (!(name.length() == 0)) {
                c7 = name + '.' + c7;
            }
            Class<?> cls2 = Class.forName(c7);
            u4.l0.n(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f4733d;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g7 = g(cls);
        map.put(cls, Integer.valueOf(g7));
        return g7;
    }

    public final boolean e(Class<?> cls) {
        return cls != null && y.class.isAssignableFrom(cls);
    }

    public final int g(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends m> b7 = b(cls);
        if (b7 != null) {
            f4734e.put(cls, x3.v.k(b7));
            return 2;
        } else if (c.f4704c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (e(superclass)) {
                u4.l0.o(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends m>> list = f4734e.get(superclass);
                u4.l0.m(list);
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            u4.l0.o(interfaces, "klass.interfaces");
            for (Class<?> cls2 : interfaces) {
                if (e(cls2)) {
                    u4.l0.o(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends m>> list2 = f4734e.get(cls2);
                    u4.l0.m(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList != null) {
                f4734e.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}
