package f5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.b1;
import v3.g1;
import v3.t0;
@r1({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1415#2,14:173\n1821#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
/* loaded from: classes.dex */
public class t extends s {

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.l<Object, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Class<R> f9875l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<R> cls) {
            super(1);
            this.f9875l = cls;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.e Object obj) {
            return Boolean.valueOf(this.f9875l.isInstance(obj));
        }
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object A(m mVar, Comparator comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        return u.I1(mVar, comparator);
    }

    @v3.k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable B(m mVar) {
        l0.p(mVar, "<this>");
        return u.U1(mVar);
    }

    @g1(version = "1.1")
    @v3.k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double C(m mVar) {
        l0.p(mVar, "<this>");
        return u.V1(mVar);
    }

    @g1(version = "1.1")
    @v3.k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float D(m mVar) {
        l0.p(mVar, "<this>");
        return u.W1(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    @v3.k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T E(m<? extends T> mVar, t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object F(m mVar, Comparator comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        return u.a2(mVar, comparator);
    }

    @s4.h(name = "sumOfBigDecimal")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> BigDecimal G(m<? extends T> mVar, t4.l<? super T, ? extends BigDecimal> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(lVar.O((T) it.next()));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @s4.h(name = "sumOfBigInteger")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> BigInteger H(m<? extends T> mVar, t4.l<? super T, ? extends BigInteger> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(lVar.O((T) it.next()));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @n6.d
    public static final <T extends Comparable<? super T>> SortedSet<T> I(@n6.d m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return (SortedSet) u.a3(mVar, new TreeSet());
    }

    @n6.d
    public static final <T> SortedSet<T> J(@n6.d m<? extends T> mVar, @n6.d Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        return (SortedSet) u.a3(mVar, new TreeSet(comparator));
    }

    @n6.d
    public static final <R> m<R> u(@n6.d m<?> mVar, @n6.d Class<R> cls) {
        l0.p(mVar, "<this>");
        l0.p(cls, "klass");
        m<R> p02 = u.p0(mVar, new a(cls));
        l0.n(p02, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return p02;
    }

    @n6.d
    public static final <C extends Collection<? super R>, R> C v(@n6.d m<?> mVar, @n6.d C c7, @n6.d Class<R> cls) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(cls, "klass");
        for (Object obj : mVar) {
            if (cls.isInstance(obj)) {
                c7.add(obj);
            }
        }
        return c7;
    }

    @v3.k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable w(m mVar) {
        l0.p(mVar, "<this>");
        return u.C1(mVar);
    }

    @g1(version = "1.1")
    @v3.k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double x(m mVar) {
        l0.p(mVar, "<this>");
        return u.D1(mVar);
    }

    @g1(version = "1.1")
    @v3.k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float y(m mVar) {
        l0.p(mVar, "<this>");
        return u.E1(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T z(m<? extends T> mVar, t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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
}
