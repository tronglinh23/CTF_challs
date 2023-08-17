package x3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class a0 extends z {
    @v3.g1(version = "1.2")
    @k4.f
    public static final <T> void g0(List<T> list, T t6) {
        u4.l0.p(list, "<this>");
        Collections.fill(list, t6);
    }

    @v3.g1(version = "1.2")
    @k4.f
    public static final <T> void h0(List<T> list) {
        u4.l0.p(list, "<this>");
        Collections.shuffle(list);
    }

    @v3.g1(version = "1.2")
    @k4.f
    public static final <T> void i0(List<T> list, Random random) {
        u4.l0.p(list, "<this>");
        u4.l0.p(random, "random");
        Collections.shuffle(list, random);
    }

    public static final <T extends Comparable<? super T>> void j0(@n6.d List<T> list) {
        u4.l0.p(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String, u4.w] */
    @v3.k(level = v3.m.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @v3.b1(expression = "this.sortWith(comparator)", imports = {}))
    @k4.f
    public static final <T> void k0(List<T> list, Comparator<? super T> comparator) {
        u4.l0.p(list, "<this>");
        u4.l0.p(comparator, "comparator");
        ?? r22 = 0;
        throw new v3.k0(r22, 1, r22);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String, u4.w] */
    @v3.k(level = v3.m.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @v3.b1(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @k4.f
    public static final <T> void l0(List<T> list, t4.p<? super T, ? super T, Integer> pVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(pVar, "comparison");
        ?? r22 = 0;
        throw new v3.k0(r22, 1, r22);
    }

    public static final <T> void m0(@n6.d List<T> list, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(list, "<this>");
        u4.l0.p(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}