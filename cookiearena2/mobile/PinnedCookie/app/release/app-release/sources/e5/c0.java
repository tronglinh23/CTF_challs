package e5;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import u4.l0;
import u4.r1;
@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n26#2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n*L\n163#1:231\n*E\n"})
@v3.r
/* loaded from: classes.dex */
public final class c0 implements WildcardType, y {
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final a f8779c = new a(null);
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final c0 f8780d = new c0(null, null);
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final Type f8781a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final Type f8782b;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final c0 a() {
            return c0.f8780d;
        }

        public a() {
        }
    }

    public c0(@n6.e Type type, @n6.e Type type2) {
        this.f8781a = type;
        this.f8782b = type2;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @n6.d
    public Type[] getLowerBounds() {
        Type type = this.f8782b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, e5.y
    @n6.d
    public String getTypeName() {
        String j7;
        String j8;
        if (this.f8782b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("? super ");
            j8 = b0.j(this.f8782b);
            sb.append(j8);
            return sb.toString();
        }
        Type type = this.f8781a;
        if (type == null || l0.g(type, Object.class)) {
            return "?";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("? extends ");
        j7 = b0.j(this.f8781a);
        sb2.append(j7);
        return sb2.toString();
    }

    @Override // java.lang.reflect.WildcardType
    @n6.d
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f8781a;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @n6.d
    public String toString() {
        return getTypeName();
    }
}
