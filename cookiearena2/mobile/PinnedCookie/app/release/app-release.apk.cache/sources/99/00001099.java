package h4;

import java.lang.reflect.Method;
import u4.l0;
import u4.r1;

@r1({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes.dex */
public final class i {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final i f10314a = new i();
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final a f10315b = new a(null, null, null);
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public static a f10316c;

    /* loaded from: classes.dex */
    public static final class a {
        @s4.e
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public final Method f10317a;
        @s4.e
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public final Method f10318b;
        @s4.e
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public final Method f10319c;

        public a(@n6.e Method method, @n6.e Method method2, @n6.e Method method3) {
            this.f10317a = method;
            this.f10318b = method2;
            this.f10319c = method3;
        }
    }

    public final a a(h4.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f10316c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f10315b;
            f10316c = aVar3;
            return aVar3;
        }
    }

    @n6.e
    public final String b(@n6.d h4.a aVar) {
        l0.p(aVar, "continuation");
        a aVar2 = f10316c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f10315b) {
            return null;
        }
        Method method = aVar2.f10317a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f10318b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f10319c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}