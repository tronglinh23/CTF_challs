package e5;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import u4.l0;
@v3.r
/* loaded from: classes.dex */
public final class a implements GenericArrayType, y {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Type f8775a;

    public a(@n6.d Type type) {
        l0.p(type, "elementType");
        this.f8775a = type;
    }

    public boolean equals(@n6.e Object obj) {
        return (obj instanceof GenericArrayType) && l0.g(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @n6.d
    public Type getGenericComponentType() {
        return this.f8775a;
    }

    @Override // java.lang.reflect.Type, e5.y
    @n6.d
    public String getTypeName() {
        String j7;
        StringBuilder sb = new StringBuilder();
        j7 = b0.j(this.f8775a);
        sb.append(j7);
        sb.append(r5.v.f16052o);
        return sb.toString();
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @n6.d
    public String toString() {
        return getTypeName();
    }
}
