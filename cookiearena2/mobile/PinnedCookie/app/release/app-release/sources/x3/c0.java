package x3;

import java.util.List;
/* loaded from: classes.dex */
public class c0 extends b0 {
    @n6.d
    public static final <T> List<T> W0(@n6.d List<? extends T> list) {
        u4.l0.p(list, "<this>");
        return new h1(list);
    }

    @s4.h(name = "asReversedMutable")
    @n6.d
    public static final <T> List<T> X0(@n6.d List<T> list) {
        u4.l0.p(list, "<this>");
        return new g1(list);
    }

    public static final int Y0(List<?> list, int i7) {
        if (new d5.l(0, w.G(list)).n(i7)) {
            return w.G(list) - i7;
        }
        throw new IndexOutOfBoundsException("Element index " + i7 + " must be in range [" + new d5.l(0, w.G(list)) + "].");
    }

    public static final int Z0(List<?> list, int i7) {
        if (new d5.l(0, list.size()).n(i7)) {
            return list.size() - i7;
        }
        throw new IndexOutOfBoundsException("Position index " + i7 + " must be in range [" + new d5.l(0, list.size()) + "].");
    }
}
