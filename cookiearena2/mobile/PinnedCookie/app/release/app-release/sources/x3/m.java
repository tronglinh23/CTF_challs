package x3;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
@u4.r1({"SMAP\nArraysJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,61:1\n26#2:62\n*S KotlinDebug\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n18#1:62\n*E\n"})
/* loaded from: classes.dex */
public class m {
    @n6.d
    public static final <T> T[] a(@n6.d T[] tArr, int i7) {
        u4.l0.p(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i7);
        u4.l0.n(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    @s4.h(name = "contentDeepHashCode")
    @v3.g1(version = "1.3")
    @v3.a1
    public static final <T> int b(@n6.e T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @v3.g1(version = "1.3")
    public static final void c(int i7, int i8) {
        if (i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + i8 + ").");
    }

    public static final /* synthetic */ <T> T[] d(T[] tArr) {
        if (tArr == null) {
            u4.l0.y(0, "T?");
            return (T[]) new Object[0];
        }
        return tArr;
    }

    @k4.f
    public static final String e(byte[] bArr, Charset charset) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(charset, "charset");
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] f(Collection<? extends T> collection) {
        u4.l0.p(collection, "<this>");
        u4.l0.y(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
