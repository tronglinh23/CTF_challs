package b4;

import java.util.Comparator;
import t4.p;
import u4.l0;
import u4.r1;
/* loaded from: classes.dex */
public class g {

    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, Comparable<?>> f7231a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t4.l<? super T, ? extends Comparable<?>> lVar) {
            this.f7231a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            t4.l<T, Comparable<?>> lVar = this.f7231a;
            return g.l(lVar.O(t6), lVar.O(t7));
        }
    }

    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f7232a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, K> f7233b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Comparator<? super K> comparator, t4.l<? super T, ? extends K> lVar) {
            this.f7232a = comparator;
            this.f7233b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            Comparator<? super K> comparator = this.f7232a;
            t4.l<T, K> lVar = this.f7233b;
            return comparator.compare(lVar.O(t6), lVar.O(t7));
        }
    }

    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, Comparable<?>> f7234a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(t4.l<? super T, ? extends Comparable<?>> lVar) {
            this.f7234a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            t4.l<T, Comparable<?>> lVar = this.f7234a;
            return g.l(lVar.O(t7), lVar.O(t6));
        }
    }

    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class d<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f7235a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, K> f7236b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Comparator<? super K> comparator, t4.l<? super T, ? extends K> lVar) {
            this.f7235a = comparator;
            this.f7236b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            Comparator<? super K> comparator = this.f7235a;
            t4.l<T, K> lVar = this.f7236b;
            return comparator.compare(lVar.O(t7), lVar.O(t6));
        }
    }

    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class e<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f7237a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, Comparable<?>> f7238b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<T> comparator, t4.l<? super T, ? extends Comparable<?>> lVar) {
            this.f7237a = comparator;
            this.f7238b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            int compare = this.f7237a.compare(t6, t7);
            if (compare != 0) {
                return compare;
            }
            t4.l<T, Comparable<?>> lVar = this.f7238b;
            return g.l(lVar.O(t6), lVar.O(t7));
        }
    }

    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class f<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f7239a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f7240b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, K> f7241c;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Comparator<T> comparator, Comparator<? super K> comparator2, t4.l<? super T, ? extends K> lVar) {
            this.f7239a = comparator;
            this.f7240b = comparator2;
            this.f7241c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            int compare = this.f7239a.compare(t6, t7);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f7240b;
            t4.l<T, K> lVar = this.f7241c;
            return comparator.compare(lVar.O(t6), lVar.O(t7));
        }
    }

    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: b4.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0080g<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f7242a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, Comparable<?>> f7243b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0080g(Comparator<T> comparator, t4.l<? super T, ? extends Comparable<?>> lVar) {
            this.f7242a = comparator;
            this.f7243b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            int compare = this.f7242a.compare(t6, t7);
            if (compare != 0) {
                return compare;
            }
            t4.l<T, Comparable<?>> lVar = this.f7243b;
            return g.l(lVar.O(t7), lVar.O(t6));
        }
    }

    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class h<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f7244a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f7245b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, K> f7246c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Comparator<T> comparator, Comparator<? super K> comparator2, t4.l<? super T, ? extends K> lVar) {
            this.f7244a = comparator;
            this.f7245b = comparator2;
            this.f7246c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            int compare = this.f7244a.compare(t6, t7);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f7245b;
            t4.l<T, K> lVar = this.f7246c;
            return comparator.compare(lVar.O(t7), lVar.O(t6));
        }
    }

    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class i<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f7247a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p<T, T, Integer> f7248b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
            this.f7247a = comparator;
            this.f7248b = pVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            int compare = this.f7247a.compare(t6, t7);
            return compare != 0 ? compare : this.f7248b.J(t6, t7).intValue();
        }
    }

    public static final int A(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        l0.p(comparator, "$this_then");
        l0.p(comparator2, "$comparator");
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj, obj2);
    }

    @k4.f
    public static final <T, K> Comparator<T> B(Comparator<T> comparator, Comparator<? super K> comparator2, t4.l<? super T, ? extends K> lVar) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        l0.p(lVar, "selector");
        return new f(comparator, comparator2, lVar);
    }

    @k4.f
    public static final <T> Comparator<T> C(Comparator<T> comparator, t4.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(comparator, "<this>");
        l0.p(lVar, "selector");
        return new e(comparator, lVar);
    }

    @k4.f
    public static final <T, K> Comparator<T> D(Comparator<T> comparator, Comparator<? super K> comparator2, t4.l<? super T, ? extends K> lVar) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        l0.p(lVar, "selector");
        return new h(comparator, comparator2, lVar);
    }

    @k4.f
    public static final <T> Comparator<T> E(Comparator<T> comparator, t4.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(comparator, "<this>");
        l0.p(lVar, "selector");
        return new C0080g(comparator, lVar);
    }

    @k4.f
    public static final <T> Comparator<T> F(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
        l0.p(comparator, "<this>");
        l0.p(pVar, "comparison");
        return new i(comparator, pVar);
    }

    @n6.d
    public static final <T> Comparator<T> G(@n6.d final Comparator<T> comparator, @n6.d final Comparator<? super T> comparator2) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        return new Comparator() { // from class: b4.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int H;
                H = g.H(comparator, comparator2, obj, obj2);
                return H;
            }
        };
    }

    public static final int H(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        l0.p(comparator, "$this_thenDescending");
        l0.p(comparator2, "$comparator");
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj2, obj);
    }

    @k4.f
    public static final <T, K> Comparator<T> f(Comparator<? super K> comparator, t4.l<? super T, ? extends K> lVar) {
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        return new b(comparator, lVar);
    }

    @k4.f
    public static final <T> Comparator<T> g(t4.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, "selector");
        return new a(lVar);
    }

    @n6.d
    public static final <T> Comparator<T> h(@n6.d final t4.l<? super T, ? extends Comparable<?>>... lVarArr) {
        l0.p(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return new Comparator() { // from class: b4.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i7;
                    i7 = g.i(lVarArr, obj, obj2);
                    return i7;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final int i(t4.l[] lVarArr, Object obj, Object obj2) {
        l0.p(lVarArr, "$selectors");
        return p(obj, obj2, lVarArr);
    }

    @k4.f
    public static final <T, K> Comparator<T> j(Comparator<? super K> comparator, t4.l<? super T, ? extends K> lVar) {
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        return new d(comparator, lVar);
    }

    @k4.f
    public static final <T> Comparator<T> k(t4.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, "selector");
        return new c(lVar);
    }

    public static final <T extends Comparable<?>> int l(@n6.e T t6, @n6.e T t7) {
        if (t6 == t7) {
            return 0;
        }
        if (t6 == null) {
            return -1;
        }
        if (t7 == null) {
            return 1;
        }
        return t6.compareTo(t7);
    }

    @k4.f
    public static final <T, K> int m(T t6, T t7, Comparator<? super K> comparator, t4.l<? super T, ? extends K> lVar) {
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        return comparator.compare((K) lVar.O(t6), (K) lVar.O(t7));
    }

    @k4.f
    public static final <T> int n(T t6, T t7, t4.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, "selector");
        return l(lVar.O(t6), lVar.O(t7));
    }

    public static final <T> int o(T t6, T t7, @n6.d t4.l<? super T, ? extends Comparable<?>>... lVarArr) {
        l0.p(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return p(t6, t7, lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final <T> int p(T t6, T t7, t4.l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (t4.l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int l7 = l(lVar.O(t6), lVar.O(t7));
            if (l7 != 0) {
                return l7;
            }
        }
        return 0;
    }

    @n6.d
    public static final <T extends Comparable<? super T>> Comparator<T> q() {
        j jVar = j.f7249a;
        l0.n(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return jVar;
    }

    @k4.f
    public static final <T extends Comparable<? super T>> Comparator<T> r() {
        return s(q());
    }

    @n6.d
    public static final <T> Comparator<T> s(@n6.d final Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return new Comparator() { // from class: b4.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int t6;
                t6 = g.t(comparator, obj, obj2);
                return t6;
            }
        };
    }

    public static final int t(Comparator comparator, Object obj, Object obj2) {
        l0.p(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @k4.f
    public static final <T extends Comparable<? super T>> Comparator<T> u() {
        return v(q());
    }

    @n6.d
    public static final <T> Comparator<T> v(@n6.d final Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return new Comparator() { // from class: b4.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w6;
                w6 = g.w(comparator, obj, obj2);
                return w6;
            }
        };
    }

    public static final int w(Comparator comparator, Object obj, Object obj2) {
        l0.p(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @n6.d
    public static final <T extends Comparable<? super T>> Comparator<T> x() {
        k kVar = k.f7250a;
        l0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return kVar;
    }

    @n6.d
    public static final <T> Comparator<T> y(@n6.d Comparator<T> comparator) {
        l0.p(comparator, "<this>");
        if (comparator instanceof l) {
            return ((l) comparator).a();
        }
        Comparator<T> comparator2 = j.f7249a;
        if (l0.g(comparator, comparator2)) {
            k kVar = k.f7250a;
            l0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return kVar;
        }
        if (l0.g(comparator, k.f7250a)) {
            l0.n(comparator2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            comparator2 = new l<>(comparator);
        }
        return comparator2;
    }

    @n6.d
    public static final <T> Comparator<T> z(@n6.d final Comparator<T> comparator, @n6.d final Comparator<? super T> comparator2) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        return new Comparator() { // from class: b4.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A;
                A = g.A(comparator, comparator2, obj, obj2);
                return A;
            }
        };
    }
}
