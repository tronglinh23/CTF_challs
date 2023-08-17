package e5;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u4.l0;
import u4.r1;
import v3.k0;
@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,3:232\n37#3,2:235\n26#4:237\n26#4:238\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n134#1:237\n137#1:238\n*E\n"})
@v3.r
/* loaded from: classes.dex */
public final class a0 implements TypeVariable<GenericDeclaration>, y {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final t f8776a;

    public a0(@n6.d t tVar) {
        l0.p(tVar, "typeParameter");
        this.f8776a = tVar;
    }

    @n6.e
    public final <T extends Annotation> T a(@n6.d Class<T> cls) {
        l0.p(cls, "annotationClass");
        return null;
    }

    @n6.d
    public final Annotation[] b() {
        return new Annotation[0];
    }

    @n6.d
    public final Annotation[] c() {
        return new Annotation[0];
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (l0.g(getName(), typeVariable.getName()) && l0.g(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    @n6.d
    public Type[] getBounds() {
        Type c7;
        List<s> upperBounds = this.f8776a.getUpperBounds();
        ArrayList arrayList = new ArrayList(x3.x.Y(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            c7 = b0.c((s) it.next(), true);
            arrayList.add(c7);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @n6.d
    public GenericDeclaration getGenericDeclaration() {
        throw new k0("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f8776a));
    }

    @Override // java.lang.reflect.TypeVariable
    @n6.d
    public String getName() {
        return this.f8776a.getName();
    }

    @Override // java.lang.reflect.Type, e5.y
    @n6.d
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @n6.d
    public String toString() {
        return getTypeName();
    }
}
