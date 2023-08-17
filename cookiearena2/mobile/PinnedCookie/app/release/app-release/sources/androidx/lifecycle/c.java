package androidx.lifecycle;

import androidx.lifecycle.p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static c f4704c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final int f4705d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f4706e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f4707f = 2;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, a> f4708a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f4709b = new HashMap();

    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<p.a, List<b>> f4710a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, p.a> f4711b;

        public a(Map<b, p.a> map) {
            this.f4711b = map;
            for (Map.Entry<b, p.a> entry : map.entrySet()) {
                p.a value = entry.getValue();
                List<b> list = this.f4710a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4710a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void b(List<b> list, z zVar, p.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(zVar, aVar, obj);
                }
            }
        }

        public void a(z zVar, p.a aVar, Object obj) {
            b(this.f4710a.get(aVar), zVar, aVar, obj);
            b(this.f4710a.get(p.a.ON_ANY), zVar, aVar, obj);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f4712a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f4713b;

        public b(int i7, Method method) {
            this.f4712a = i7;
            this.f4713b = method;
            method.setAccessible(true);
        }

        public void a(z zVar, p.a aVar, Object obj) {
            try {
                int i7 = this.f4712a;
                if (i7 == 0) {
                    this.f4713b.invoke(obj, new Object[0]);
                } else if (i7 == 1) {
                    this.f4713b.invoke(obj, zVar);
                } else if (i7 != 2) {
                } else {
                    this.f4713b.invoke(obj, zVar, aVar);
                }
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException("Failed to call observer method", e8.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f4712a == bVar.f4712a && this.f4713b.getName().equals(bVar.f4713b.getName());
            }
            return false;
        }

        public int hashCode() {
            return (this.f4712a * 31) + this.f4713b.getName().hashCode();
        }
    }

    public final a a(Class<?> cls, @d.q0 Method[] methodArr) {
        int i7;
        a c7;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c7 = c(superclass)) != null) {
            hashMap.putAll(c7.f4711b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, p.a> entry : c(cls2).f4711b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            j0 j0Var = (j0) method.getAnnotation(j0.class);
            if (j0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else if (!z.class.isAssignableFrom(parameterTypes[0])) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i7 = 1;
                }
                p.a value = j0Var.value();
                if (parameterTypes.length > 1) {
                    if (!p.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != p.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i7, method), value, cls);
                z6 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f4708a.put(cls, aVar);
        this.f4709b.put(cls, Boolean.valueOf(z6));
        return aVar;
    }

    public final Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e7) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
        }
    }

    public a c(Class<?> cls) {
        a aVar = this.f4708a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.f4709b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b7 = b(cls);
        for (Method method : b7) {
            if (((j0) method.getAnnotation(j0.class)) != null) {
                a(cls, b7);
                return true;
            }
        }
        this.f4709b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map<b, p.a> map, b bVar, p.a aVar, Class<?> cls) {
        p.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f4713b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
