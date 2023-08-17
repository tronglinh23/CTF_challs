package x3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import v3.m2;
import v3.q2;

@u4.r1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n394#1:473\n1#2:472\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n388#1:473\n*E\n"})
/* loaded from: classes.dex */
public class w extends v {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Incorrect field signature: TK; */
    @u4.r1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,471:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> extends u4.n0 implements t4.l<T, Integer> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, K> f18391l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Comparable f18392m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lt4/l<-TT;+TK;>;TK;)V */
        public a(t4.l lVar, Comparable comparable) {
            super(1);
            this.f18391l = lVar;
            this.f18392m = comparable;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Integer O(T t6) {
            return Integer.valueOf(b4.g.l((Comparable) this.f18391l.O(t6), this.f18392m));
        }
    }

    public static /* synthetic */ int A(List list, Comparable comparable, int i7, int i8, t4.l lVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = list.size();
        }
        return t(list, i7, i8, new a(lVar, comparable));
    }

    @v3.g1(version = "1.6")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <E> List<E> B(int i7, @v3.b t4.l<? super List<E>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        List j7 = v.j(i7);
        lVar.O(j7);
        return v.a(j7);
    }

    @v3.g1(version = "1.6")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <E> List<E> C(@v3.b t4.l<? super List<E>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        List i7 = v.i();
        lVar.O(i7);
        return v.a(i7);
    }

    @k4.f
    public static final <T> boolean D(Collection<? extends T> collection, Collection<? extends T> collection2) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(collection2, "elements");
        return collection.containsAll(collection2);
    }

    @n6.d
    public static final <T> List<T> E() {
        return h0.f18305k;
    }

    @n6.d
    public static final d5.l F(@n6.d Collection<?> collection) {
        u4.l0.p(collection, "<this>");
        return new d5.l(0, collection.size() - 1);
    }

    public static final <T> int G(@n6.d List<? extends T> list) {
        u4.l0.p(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lt4/a<+TR;>;)TR; */
    @v3.g1(version = "1.3")
    @k4.f
    public static final Object H(Collection collection, t4.a aVar) {
        u4.l0.p(aVar, "defaultValue");
        return collection.isEmpty() ? aVar.n() : collection;
    }

    @k4.f
    public static final <T> boolean I(Collection<? extends T> collection) {
        u4.l0.p(collection, "<this>");
        return !collection.isEmpty();
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final <T> boolean J(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @k4.f
    public static final <T> List<T> K() {
        return E();
    }

    @n6.d
    public static final <T> List<T> L(@n6.d T... tArr) {
        u4.l0.p(tArr, "elements");
        return tArr.length > 0 ? o.t(tArr) : E();
    }

    @n6.d
    public static final <T> List<T> M(@n6.e T t6) {
        return t6 != null ? v.k(t6) : E();
    }

    @n6.d
    public static final <T> List<T> N(@n6.d T... tArr) {
        u4.l0.p(tArr, "elements");
        return p.ub(tArr);
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <T> List<T> O() {
        return new ArrayList();
    }

    @n6.d
    public static final <T> List<T> P(@n6.d T... tArr) {
        u4.l0.p(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new j(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T> List<T> Q(@n6.d List<? extends T> list) {
        u4.l0.p(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : v.k(list.get(0)) : E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <T> Collection<T> R(Collection<? extends T> collection) {
        return collection == 0 ? E() : collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <T> List<T> S(List<? extends T> list) {
        return list == 0 ? E() : list;
    }

    public static final void T(int i7, int i8, int i9) {
        if (i8 > i9) {
            throw new IllegalArgumentException("fromIndex (" + i8 + ") is greater than toIndex (" + i9 + ").");
        } else if (i8 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i8 + ") is less than zero.");
        } else if (i9 <= i7) {
        } else {
            throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is greater than size (" + i7 + ").");
        }
    }

    @v3.g1(version = "1.3")
    @n6.d
    public static final <T> List<T> U(@n6.d Iterable<? extends T> iterable, @n6.d b5.f fVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(fVar, "random");
        List<T> S5 = e0.S5(iterable);
        e0.Z4(S5, fVar);
        return S5;
    }

    @v3.g1(version = "1.3")
    @v3.a1
    public static final void V() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @v3.g1(version = "1.3")
    @v3.a1
    public static final void W() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <T> List<T> o(int i7, t4.l<? super Integer, ? extends T> lVar) {
        u4.l0.p(lVar, "init");
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add(lVar.O(Integer.valueOf(i8)));
        }
        return arrayList;
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <T> List<T> p(int i7, t4.l<? super Integer, ? extends T> lVar) {
        u4.l0.p(lVar, "init");
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add(lVar.O(Integer.valueOf(i8)));
        }
        return arrayList;
    }

    @v3.g1(version = "1.1")
    @k4.f
    public static final <T> ArrayList<T> q() {
        return new ArrayList<>();
    }

    @n6.d
    public static final <T> ArrayList<T> r(@n6.d T... tArr) {
        u4.l0.p(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new j(tArr, true));
    }

    @n6.d
    public static final <T> Collection<T> s(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return new j(tArr, false);
    }

    public static final <T> int t(@n6.d List<? extends T> list, int i7, int i8, @n6.d t4.l<? super T, Integer> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "comparison");
        T(list.size(), i7, i8);
        int i9 = i8 - 1;
        while (i7 <= i9) {
            int i10 = (i7 + i9) >>> 1;
            int intValue = lVar.O((T) list.get(i10)).intValue();
            if (intValue < 0) {
                i7 = i10 + 1;
            } else if (intValue <= 0) {
                return i10;
            } else {
                i9 = i10 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static final <T extends Comparable<? super T>> int u(@n6.d List<? extends T> list, @n6.e T t6, int i7, int i8) {
        u4.l0.p(list, "<this>");
        T(list.size(), i7, i8);
        int i9 = i8 - 1;
        while (i7 <= i9) {
            int i10 = (i7 + i9) >>> 1;
            int l7 = b4.g.l(list.get(i10), t6);
            if (l7 < 0) {
                i7 = i10 + 1;
            } else if (l7 <= 0) {
                return i10;
            } else {
                i9 = i10 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static final <T> int v(@n6.d List<? extends T> list, T t6, @n6.d Comparator<? super T> comparator, int i7, int i8) {
        u4.l0.p(list, "<this>");
        u4.l0.p(comparator, "comparator");
        T(list.size(), i7, i8);
        int i9 = i8 - 1;
        while (i7 <= i9) {
            int i10 = (i7 + i9) >>> 1;
            int compare = comparator.compare((T) list.get(i10), t6);
            if (compare < 0) {
                i7 = i10 + 1;
            } else if (compare <= 0) {
                return i10;
            } else {
                i9 = i10 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static /* synthetic */ int w(List list, int i7, int i8, t4.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = list.size();
        }
        return t(list, i7, i8, lVar);
    }

    public static /* synthetic */ int x(List list, Comparable comparable, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = list.size();
        }
        return u(list, comparable, i7, i8);
    }

    public static /* synthetic */ int y(List list, Object obj, Comparator comparator, int i7, int i8, int i9, Object obj2) {
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = list.size();
        }
        return v(list, obj, comparator, i7, i8);
    }

    public static final <T, K extends Comparable<? super K>> int z(@n6.d List<? extends T> list, @n6.e K k7, int i7, int i8, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "selector");
        return t(list, i7, i8, new a(lVar, k7));
    }
}