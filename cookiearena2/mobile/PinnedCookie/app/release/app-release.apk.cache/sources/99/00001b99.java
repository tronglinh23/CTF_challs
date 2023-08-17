package u4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@s4.h(name = "CollectionToArray")
@r1({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,82:1\n57#1,22:83\n57#1,22:105\n26#2:127\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n19#1:83,22\n31#1:105,22\n14#1:127\n*E\n"})
/* loaded from: classes.dex */
public final class v {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f17494a = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    public static final int f17495b = 2147483645;

    @s4.h(name = "toArray")
    @n6.d
    public static final Object[] a(@n6.d Collection<?> collection) {
        l0.p(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    objArr[i7] = it.next();
                    if (i8 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i9 = ((i8 * 3) + 1) >>> 1;
                        if (i9 <= i8) {
                            i9 = f17495b;
                            if (i8 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i9);
                        l0.o(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i8);
                        l0.o(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i7 = i8;
                }
            }
        }
        return f17494a;
    }

    @s4.h(name = "toArray")
    @n6.d
    public static final Object[] b(@n6.d Collection<?> collection, @n6.e Object[] objArr) {
        Object[] objArr2;
        l0.p(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i7 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            l0.n(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i8 = i7 + 1;
            objArr2[i7] = it.next();
            if (i8 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i9 = ((i8 * 3) + 1) >>> 1;
                if (i9 <= i8) {
                    i9 = f17495b;
                    if (i8 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i9);
                l0.o(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i8] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i8);
                l0.o(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i7 = i8;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final Object[] c(Collection<?> collection, t4.a<Object[]> aVar, t4.l<? super Integer, Object[]> lVar, t4.p<? super Object[], ? super Integer, Object[]> pVar) {
        int size = collection.size();
        if (size == 0) {
            return aVar.n();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return aVar.n();
        }
        Object[] O = lVar.O(Integer.valueOf(size));
        int i7 = 0;
        ?? r32 = O;
        while (true) {
            int i8 = i7 + 1;
            r32[i7] = it.next();
            if (i8 >= r32.length) {
                if (!it.hasNext()) {
                    return r32;
                }
                int i9 = ((i8 * 3) + 1) >>> 1;
                if (i9 <= i8) {
                    i9 = f17495b;
                    if (i8 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                r32 = Arrays.copyOf((Object[]) r32, i9);
                l0.o(r32, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                return pVar.J(r32, Integer.valueOf(i8));
            }
            i7 = i8;
            r32 = r32;
        }
    }
}