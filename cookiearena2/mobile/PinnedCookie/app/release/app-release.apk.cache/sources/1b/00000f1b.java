package e5;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u4.h0;
import u4.l0;
import u4.m0;
import u4.r1;
import v3.g1;
import v3.j0;
import x3.e0;

@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
/* loaded from: classes.dex */
public final class b0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8777a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8777a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b extends h0 implements t4.l<Class<?>, Class<?>> {

        /* renamed from: t  reason: collision with root package name */
        public static final b f8778t = new b();

        public b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // t4.l
        /* renamed from: C0  reason: merged with bridge method [inline-methods] */
        public final Class<?> O(@n6.d Class<?> cls) {
            l0.p(cls, "p0");
            return cls.getComponentType();
        }
    }

    @v3.r
    public static final Type c(s sVar, boolean z6) {
        g N = sVar.N();
        if (N instanceof t) {
            return new a0((t) N);
        }
        if (!(N instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + sVar);
        }
        d dVar = (d) N;
        Class g7 = z6 ? s4.a.g(dVar) : s4.a.d(dVar);
        List<u> f7 = sVar.f();
        if (f7.isEmpty()) {
            return g7;
        }
        if (g7.isArray()) {
            if (g7.getComponentType().isPrimitive()) {
                return g7;
            }
            u uVar = (u) e0.f5(f7);
            if (uVar == null) {
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + sVar);
            }
            v a7 = uVar.a();
            s b7 = uVar.b();
            int i7 = a7 == null ? -1 : a.f8777a[a7.ordinal()];
            if (i7 == -1 || i7 == 1) {
                return g7;
            }
            if (i7 == 2 || i7 == 3) {
                l0.m(b7);
                Type d7 = d(b7, false, 1, null);
                return d7 instanceof Class ? g7 : new e5.a(d7);
            }
            throw new j0();
        }
        return e(g7, f7);
    }

    public static /* synthetic */ Type d(s sVar, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        return c(sVar, z6);
    }

    @v3.r
    public static final Type e(Class<?> cls, List<u> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(x3.x.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((u) it.next()));
            }
            return new x(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(x3.x.Y(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((u) it2.next()));
            }
            return new x(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e7 = e(declaringClass, list.subList(length, list.size()));
            List<u> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(x3.x.Y(subList, 10));
            Iterator<T> it3 = subList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(g((u) it3.next()));
            }
            return new x(cls, e7, arrayList3);
        }
    }

    @n6.d
    public static final Type f(@n6.d s sVar) {
        Type u02;
        l0.p(sVar, "<this>");
        return (!(sVar instanceof m0) || (u02 = ((m0) sVar).u0()) == null) ? d(sVar, false, 1, null) : u02;
    }

    public static final Type g(u uVar) {
        v h7 = uVar.h();
        if (h7 == null) {
            return c0.f8779c.a();
        }
        s g7 = uVar.g();
        l0.m(g7);
        int i7 = a.f8777a[h7.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    return new c0(c(g7, true), null);
                }
                throw new j0();
            }
            return c(g7, true);
        }
        return new c0(null, c(g7, true));
    }

    @g1(version = "1.4")
    @v3.r
    @k4.h
    public static /* synthetic */ void h(s sVar) {
    }

    @v3.r
    public static /* synthetic */ void i(u uVar) {
    }

    public static final String j(Type type) {
        String name;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                f5.m l7 = f5.s.l(type, b.f8778t);
                name = ((Class) f5.u.f1(l7)).getName() + i5.b0.h2(r5.v.f16052o, f5.u.g0(l7));
            } else {
                name = cls.getName();
            }
            l0.o(name, "{\n        if (type.isArr…   } else type.name\n    }");
            return name;
        }
        return type.toString();
    }
}