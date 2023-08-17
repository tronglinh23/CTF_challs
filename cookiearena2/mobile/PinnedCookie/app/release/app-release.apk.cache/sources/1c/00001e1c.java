package y3;

import java.util.Arrays;
import java.util.List;
import u4.l0;
import u4.r1;

@r1({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
/* loaded from: classes.dex */
public final class c {
    @n6.d
    public static final <E> E[] d(int i7) {
        if (i7 >= 0) {
            return (E[]) new Object[i7];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @n6.d
    public static final <T> T[] e(@n6.d T[] tArr, int i7) {
        l0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i7);
        l0.o(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    public static final <E> void f(@n6.d E[] eArr, int i7) {
        l0.p(eArr, "<this>");
        eArr[i7] = null;
    }

    public static final <E> void g(@n6.d E[] eArr, int i7, int i8) {
        l0.p(eArr, "<this>");
        while (i7 < i8) {
            f(eArr, i7);
            i7++;
        }
    }

    public static final <T> boolean h(T[] tArr, int i7, int i8, List<?> list) {
        if (i8 != list.size()) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!l0.g(tArr[i7 + i9], list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public static final <T> int i(T[] tArr, int i7, int i8) {
        int i9 = 1;
        for (int i10 = 0; i10 < i8; i10++) {
            T t6 = tArr[i7 + i10];
            i9 = (i9 * 31) + (t6 != null ? t6.hashCode() : 0);
        }
        return i9;
    }

    public static final <T> String j(T[] tArr, int i7, int i8) {
        StringBuilder sb = new StringBuilder((i8 * 3) + 2);
        sb.append("[");
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(tArr[i7 + i9]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }
}