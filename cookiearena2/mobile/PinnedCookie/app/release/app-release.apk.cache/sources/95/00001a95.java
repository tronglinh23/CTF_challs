package s4;

import java.lang.annotation.Annotation;
import u.v;
import u4.l0;
import u4.l1;
import v3.b1;
import v3.g1;

@h(name = "JvmClassMappingKt")
/* loaded from: classes.dex */
public final class a {
    @n6.d
    public static final <T extends Annotation> e5.d<? extends T> a(@n6.d T t6) {
        l0.p(t6, "<this>");
        Class<? extends Annotation> annotationType = t6.annotationType();
        l0.o(annotationType, "this as java.lang.annota…otation).annotationType()");
        e5.d<? extends T> i7 = i(annotationType);
        l0.n(i7, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return i7;
    }

    public static final <E extends Enum<E>> Class<E> b(Enum<E> r12) {
        l0.p(r12, "<this>");
        Class<E> declaringClass = r12.getDeclaringClass();
        l0.o(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        return declaringClass;
    }

    @g1(version = "1.7")
    @k4.f
    public static /* synthetic */ void c(Enum r02) {
    }

    @h(name = "getJavaClass")
    @n6.d
    public static final <T> Class<T> d(@n6.d e5.d<T> dVar) {
        l0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((u4.t) dVar).n();
        l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    @n6.d
    public static final <T> Class<T> e(@n6.d T t6) {
        l0.p(t6, "<this>");
        Class<T> cls = (Class<T>) t6.getClass();
        l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    public static /* synthetic */ void f(e5.d dVar) {
    }

    @n6.d
    public static final <T> Class<T> g(@n6.d e5.d<T> dVar) {
        l0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((u4.t) dVar).n();
        if (!cls.isPrimitive()) {
            l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(v.b.f17141f)) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(v.b.f17138c)) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    @n6.e
    public static final <T> Class<T> h(@n6.d e5.d<T> dVar) {
        l0.p(dVar, "<this>");
        Class<T> cls = (Class<T>) ((u4.t) dVar).n();
        if (cls.isPrimitive()) {
            l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    @h(name = "getKotlinClass")
    @n6.d
    public static final <T> e5.d<T> i(@n6.d Class<T> cls) {
        l0.p(cls, "<this>");
        return l1.d(cls);
    }

    @h(name = "getRuntimeClassOfKClassInstance")
    @n6.d
    public static final <T> Class<e5.d<T>> j(@n6.d e5.d<T> dVar) {
        l0.p(dVar, "<this>");
        Class<e5.d<T>> cls = (Class<e5.d<T>>) dVar.getClass();
        l0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @v3.k(level = v3.m.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @b1(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(e5.d dVar) {
    }

    public static final /* synthetic */ boolean l(Object[] objArr) {
        l0.p(objArr, "<this>");
        l0.y(4, "T");
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}