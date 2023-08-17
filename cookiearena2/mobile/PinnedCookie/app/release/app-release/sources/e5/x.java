package e5;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import u4.h0;
import u4.l0;
import u4.r1;
@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
@v3.r
/* loaded from: classes.dex */
public final class x implements ParameterizedType, y {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f8801a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final Type f8802b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final Type[] f8803c;

    /* loaded from: classes.dex */
    public /* synthetic */ class a extends h0 implements t4.l<Type, String> {

        /* renamed from: t  reason: collision with root package name */
        public static final a f8804t = new a();

        public a() {
            super(1, b0.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: C0  reason: merged with bridge method [inline-methods] */
        public final String O(@n6.d Type type) {
            String j7;
            l0.p(type, "p0");
            j7 = b0.j(type);
            return j7;
        }
    }

    public x(@n6.d Class<?> cls, @n6.e Type type, @n6.d List<? extends Type> list) {
        l0.p(cls, "rawType");
        l0.p(list, "typeArguments");
        this.f8801a = cls;
        this.f8802b = type;
        this.f8803c = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (l0.g(this.f8801a, parameterizedType.getRawType()) && l0.g(this.f8802b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @n6.d
    public Type[] getActualTypeArguments() {
        return this.f8803c;
    }

    @Override // java.lang.reflect.ParameterizedType
    @n6.e
    public Type getOwnerType() {
        return this.f8802b;
    }

    @Override // java.lang.reflect.ParameterizedType
    @n6.d
    public Type getRawType() {
        return this.f8801a;
    }

    @Override // java.lang.reflect.Type, e5.y
    @n6.d
    public String getTypeName() {
        String j7;
        String j8;
        StringBuilder sb = new StringBuilder();
        Type type = this.f8802b;
        if (type != null) {
            j8 = b0.j(type);
            sb.append(j8);
            sb.append("$");
            sb.append(this.f8801a.getSimpleName());
        } else {
            j7 = b0.j(this.f8801a);
            sb.append(j7);
        }
        Type[] typeArr = this.f8803c;
        if ((!(typeArr.length == 0)) != false) {
            x3.p.lh(typeArr, sb, (r14 & 2) != 0 ? ", " : null, (r14 & 4) != 0 ? "" : "<", (r14 & 8) == 0 ? ">" : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : a.f8804t);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f8801a.hashCode();
        Type type = this.f8802b;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @n6.d
    public String toString() {
        return getTypeName();
    }
}
