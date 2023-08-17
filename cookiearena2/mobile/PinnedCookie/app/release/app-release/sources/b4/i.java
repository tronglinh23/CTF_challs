package b4;

import java.util.Comparator;
import u4.l0;
import v3.g1;
/* loaded from: classes.dex */
public class i extends h {
    @g1(version = "1.4")
    public static final <T> T A0(T t6, @n6.d T[] tArr, @n6.d Comparator<? super T> comparator) {
        l0.p(tArr, "other");
        l0.p(comparator, "comparator");
        for (T t7 : tArr) {
            if (comparator.compare(t6, t7) < 0) {
                t6 = t7;
            }
        }
        return t6;
    }

    @g1(version = "1.1")
    public static final <T> T B0(T t6, T t7, T t8, @n6.d Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return (T) C0(t6, C0(t7, t8, comparator), comparator);
    }

    @g1(version = "1.1")
    public static final <T> T C0(T t6, T t7, @n6.d Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return comparator.compare(t6, t7) <= 0 ? t6 : t7;
    }

    @g1(version = "1.4")
    public static final <T> T D0(T t6, @n6.d T[] tArr, @n6.d Comparator<? super T> comparator) {
        l0.p(tArr, "other");
        l0.p(comparator, "comparator");
        for (T t7 : tArr) {
            if (comparator.compare(t6, t7) > 0) {
                t6 = t7;
            }
        }
        return t6;
    }

    @g1(version = "1.1")
    public static final <T> T y0(T t6, T t7, T t8, @n6.d Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return (T) z0(t6, z0(t7, t8, comparator), comparator);
    }

    @g1(version = "1.1")
    public static final <T> T z0(T t6, T t7, @n6.d Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return comparator.compare(t6, t7) >= 0 ? t6 : t7;
    }
}
