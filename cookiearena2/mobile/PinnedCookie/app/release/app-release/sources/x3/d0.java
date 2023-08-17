package x3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
@u4.r1({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1963#2,14:169\n2333#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
/* loaded from: classes.dex */
public class d0 extends c0 {
    @n6.d
    public static final <R> List<R> a1(@n6.d Iterable<?> iterable, @n6.d Class<R> cls) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(cls, "klass");
        return (List) b1(iterable, new ArrayList(), cls);
    }

    @n6.d
    public static final <C extends Collection<? super R>, R> C b1(@n6.d Iterable<?> iterable, @n6.d C c7, @n6.d Class<R> cls) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(cls, "klass");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c7.add(obj);
            }
        }
        return c7;
    }

    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable c1(Iterable iterable) {
        u4.l0.p(iterable, "<this>");
        return e0.K3(iterable);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double d1(Iterable iterable) {
        u4.l0.p(iterable, "<this>");
        return e0.L3(iterable);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float e1(Iterable iterable) {
        u4.l0.p(iterable, "<this>");
        return e0.M3(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @v3.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T f1(Iterable<? extends T> iterable, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                R O = lVar.O(next);
                do {
                    T next2 = it.next();
                    R O2 = lVar.O(next2);
                    next = next;
                    if (O.compareTo(O2) < 0) {
                        O = O2;
                        next = next2;
                    }
                } while (it.hasNext());
            }
            return next;
        }
        return null;
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @v3.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object g1(Iterable iterable, Comparator comparator) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        return e0.Q3(iterable, comparator);
    }

    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable h1(Iterable iterable) {
        u4.l0.p(iterable, "<this>");
        return e0.c4(iterable);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double i1(Iterable iterable) {
        u4.l0.p(iterable, "<this>");
        return e0.d4(iterable);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float j1(Iterable iterable) {
        u4.l0.p(iterable, "<this>");
        return e0.e4(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    @v3.k(message = "Use minByOrNull instead.", replaceWith = @v3.b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T k1(Iterable<? extends T> iterable, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                R O = lVar.O(next);
                do {
                    T next2 = it.next();
                    R O2 = lVar.O(next2);
                    next = next;
                    if (O.compareTo(O2) > 0) {
                        O = O2;
                        next = next2;
                    }
                } while (it.hasNext());
            }
            return next;
        }
        return null;
    }

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @v3.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object l1(Iterable iterable, Comparator comparator) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        return e0.i4(iterable, comparator);
    }

    public static final <T> void m1(@n6.d List<T> list) {
        u4.l0.p(list, "<this>");
        Collections.reverse(list);
    }

    @s4.h(name = "sumOfBigDecimal")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> BigDecimal n1(Iterable<? extends T> iterable, t4.l<? super T, ? extends BigDecimal> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(lVar.O((T) it.next()));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @s4.h(name = "sumOfBigInteger")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> BigInteger o1(Iterable<? extends T> iterable, t4.l<? super T, ? extends BigInteger> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(lVar.O((T) it.next()));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @n6.d
    public static final <T extends Comparable<? super T>> SortedSet<T> p1(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return (SortedSet) e0.L5(iterable, new TreeSet());
    }

    @n6.d
    public static final <T> SortedSet<T> q1(@n6.d Iterable<? extends T> iterable, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        return (SortedSet) e0.L5(iterable, new TreeSet(comparator));
    }
}
