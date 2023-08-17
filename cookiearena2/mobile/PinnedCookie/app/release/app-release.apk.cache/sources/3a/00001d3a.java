package x3;

import b4.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import v3.b2;
import v3.m2;
import v3.q2;
import v3.x1;

@u4.r1({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3683:1\n288#1,2:3684\n518#1,7:3686\n533#1,6:3693\n857#1,2:3700\n788#1:3702\n1864#1,2:3703\n789#1,2:3705\n1866#1:3707\n791#1:3708\n1864#1,3:3709\n809#1,2:3712\n847#1,2:3714\n1253#1,4:3720\n1222#1,4:3724\n1238#1,4:3728\n1285#1,4:3732\n1446#1,5:3736\n1461#1,5:3741\n1502#1,3:3746\n1505#1,3:3756\n1520#1,3:3759\n1523#1,3:3769\n1620#1,3:3786\n1590#1,4:3789\n1579#1:3793\n1864#1,2:3794\n1866#1:3797\n1580#1:3798\n1864#1,3:3799\n1611#1:3802\n1855#1:3803\n1856#1:3805\n1612#1:3806\n1855#1,2:3807\n1864#1,3:3809\n2847#1,3:3812\n2850#1,6:3816\n2872#1,3:3822\n2875#1,7:3826\n857#1,2:3833\n819#1:3835\n847#1,2:3836\n819#1:3838\n847#1,2:3839\n819#1:3841\n847#1,2:3842\n3405#1,8:3848\n3433#1,7:3856\n3464#1,10:3863\n1#2:3699\n1#2:3796\n1#2:3804\n1#2:3815\n1#2:3825\n37#3,2:3716\n37#3,2:3718\n361#4,7:3749\n361#4,7:3762\n361#4,7:3772\n361#4,7:3779\n32#5,2:3844\n32#5,2:3846\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n167#1:3684,2\n177#1:3686,7\n187#1:3693,6\n766#1:3700,2\n777#1:3702\n777#1:3703,2\n777#1:3705,2\n777#1:3707\n777#1:3708\n788#1:3709,3\n800#1:3712,2\n819#1:3714,2\n1180#1:3720,4\n1195#1:3724,4\n1209#1:3728,4\n1272#1:3732,4\n1360#1:3736,5\n1373#1:3741,5\n1477#1:3746,3\n1477#1:3756,3\n1490#1:3759,3\n1490#1:3769,3\n1549#1:3786,3\n1559#1:3789,4\n1569#1:3793\n1569#1:3794,2\n1569#1:3797\n1569#1:3798\n1579#1:3799,3\n1603#1:3802\n1603#1:3803\n1603#1:3805\n1603#1:3806\n1611#1:3807,2\n2645#1:3809,3\n2949#1:3812,3\n2949#1:3816,6\n2967#1:3822,3\n2967#1:3826,7\n3143#1:3833,2\n3151#1:3835\n3151#1:3836,2\n3161#1:3838\n3161#1:3839,2\n3171#1:3841\n3171#1:3842,2\n3394#1:3848,8\n3422#1:3856,7\n3451#1:3863,10\n1569#1:3796\n1603#1:3804\n2949#1:3815\n2967#1:3825\n1032#1:3716,2\n1075#1:3718,2\n1477#1:3749,7\n1490#1:3762,7\n1504#1:3772,7\n1522#1:3779,7\n3339#1:3844,2\n3381#1:3846,2\n*E\n"})
/* loaded from: classes.dex */
public class e0 extends d0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @u4.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,680:1\n3524#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> implements f5.m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterable f18296a;

        public a(Iterable iterable) {
            this.f18296a = iterable;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            return this.f18296a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> extends u4.n0 implements t4.l<Integer, T> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f18297l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i7) {
            super(1);
            this.f18297l = i7;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ Object O(Integer num) {
            return b(num.intValue());
        }

        public final T b(int i7) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f18297l + '.');
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    @u4.r1({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n*L\n1#1,3683:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c<K, T> implements l0<T, K> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterable<T> f18298a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, K> f18299b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Iterable<? extends T> iterable, t4.l<? super T, ? extends K> lVar) {
            this.f18298a = iterable;
            this.f18299b = lVar;
        }

        @Override // x3.l0
        public K a(T t6) {
            return this.f18299b.O(t6);
        }

        @Override // x3.l0
        @n6.d
        public Iterator<T> b() {
            return this.f18298a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class d<T> extends u4.n0 implements t4.a<Iterator<? extends T>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Iterable<T> f18300l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Iterable<? extends T> iterable) {
            super(0);
            this.f18300l = iterable;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<T> n() {
            return this.f18300l.iterator();
        }
    }

    @n6.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M A1(@n6.d Iterable<? extends T> iterable, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            m7.put(lVar.O(obj), lVar2.O(obj));
        }
        return m7;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @n6.e
    public static final <T> T A2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        for (T t6 : iterable) {
            if (lVar.O(t6).booleanValue()) {
                return t6;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @v3.g1(version = "1.4")
    @n6.e
    public static final <T, R extends Comparable<? super R>> T A3(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends R> lVar) {
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
                return (T) next;
            }
            return next;
        }
        return null;
    }

    @n6.d
    public static final <T> List<T> A4(@n6.d Collection<? extends T> collection, T t6) {
        u4.l0.p(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t6);
        return arrayList;
    }

    @s4.h(name = "sumOfLong")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> long A5(Iterable<? extends T> iterable, t4.l<? super T, Long> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        long j7 = 0;
        while (it.hasNext()) {
            j7 += lVar.O((T) it.next()).longValue();
        }
        return j7;
    }

    @n6.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M B1(@n6.d Iterable<? extends T> iterable, @n6.d M m7, @n6.d t4.l<? super T, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            v3.u0<? extends K, ? extends V> O = lVar.O((T) it.next());
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @n6.e
    public static final <T> T B2(@n6.d List<? extends T> list) {
        u4.l0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @s4.h(name = "maxByOrThrow")
    @v3.g1(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T B3(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends R> lVar) {
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
                return (T) next;
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @n6.d
    public static final <T> List<T> B4(@n6.d Collection<? extends T> collection, @n6.d T[] tArr) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(tArr, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + tArr.length);
        arrayList.addAll(collection);
        b0.p0(arrayList, tArr);
        return arrayList;
    }

    @s4.h(name = "sumOfShort")
    public static final int B5(@n6.d Iterable<Short> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += it.next().shortValue();
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.3")
    @n6.d
    public static final <K, V> Map<K, V> C1(@n6.d Iterable<? extends K> iterable, @n6.d t4.l<? super K, ? extends V> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(x.Y(iterable, 10)), 16));
        Iterator<? extends K> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (K) it.next();
            linkedHashMap.put(obj, lVar.O(obj));
        }
        return linkedHashMap;
    }

    @n6.d
    public static final <T, R> List<R> C2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            b0.o0(arrayList, lVar.O((T) it.next()));
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> double C3(Iterable<? extends T> iterable, t4.l<? super T, Double> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.O((T) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @k4.f
    public static final <T> List<T> C4(Iterable<? extends T> iterable, T t6) {
        u4.l0.p(iterable, "<this>");
        return w4(iterable, t6);
    }

    @s4.h(name = "sumOfUInt")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final <T> int C5(Iterable<? extends T> iterable, t4.l<? super T, x1> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        int l7 = x1.l(0);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            l7 = x1.l(l7 + lVar.O((T) it.next()).l0());
        }
        return l7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.3")
    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M D1(@n6.d Iterable<? extends K> iterable, @n6.d M m7, @n6.d t4.l<? super K, ? extends V> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "valueSelector");
        Iterator<? extends K> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (K) it.next();
            m7.put(obj, lVar.O(obj));
        }
        return m7;
    }

    @s4.h(name = "flatMapIndexedIterable")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> List<R> D2(Iterable<? extends T> iterable, t4.p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            b0.o0(arrayList, pVar.J(Integer.valueOf(i7), obj));
            i7 = i8;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> float D3(Iterable<? extends T> iterable, t4.l<? super T, Float> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, lVar.O((T) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @k4.f
    public static final <T> List<T> D4(Collection<? extends T> collection, T t6) {
        u4.l0.p(collection, "<this>");
        return A4(collection, t6);
    }

    @s4.h(name = "sumOfULong")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final <T> long D5(Iterable<? extends T> iterable, t4.l<? super T, b2> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            l7 = b2.l(l7 + lVar.O((T) it.next()).l0());
        }
        return l7;
    }

    @s4.h(name = "averageOfByte")
    public static final double E1(@n6.d Iterable<Byte> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().byteValue();
            i7++;
            if (i7 < 0) {
                w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R, C extends Collection<? super R>> C E2(Iterable<? extends T> iterable, C c7, t4.p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            b0.o0(c7, pVar.J(Integer.valueOf(i7), obj));
            i7 = i8;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R E3(Iterable<? extends T> iterable, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R O = lVar.O((T) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((T) it.next());
                if (O.compareTo(O2) < 0) {
                    O = O2;
                }
            }
            return O;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final <T> T E4(Collection<? extends T> collection) {
        u4.l0.p(collection, "<this>");
        return (T) F4(collection, b5.f.f7260k);
    }

    @n6.d
    public static final <T> List<T> E5(@n6.d Iterable<? extends T> iterable, int i7) {
        u4.l0.p(iterable, "<this>");
        int i8 = 0;
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return w.E();
        } else {
            if (iterable instanceof Collection) {
                if (i7 >= ((Collection) iterable).size()) {
                    return Q5(iterable);
                }
                if (i7 == 1) {
                    return v.k(u2(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i7);
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return w.Q(arrayList);
        }
    }

    @s4.h(name = "averageOfDouble")
    public static final double F1(@n6.d Iterable<Double> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().doubleValue();
            i7++;
            if (i7 < 0) {
                w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @s4.h(name = "flatMapIndexedSequence")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> List<R> F2(Iterable<? extends T> iterable, t4.p<? super Integer, ? super T, ? extends f5.m<? extends R>> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            b0.n0(arrayList, pVar.J(Integer.valueOf(i7), obj));
            i7 = i8;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R F3(Iterable<? extends T> iterable, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R O = lVar.O((T) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((T) it.next());
                if (O.compareTo(O2) < 0) {
                    O = O2;
                }
            }
            return O;
        }
        return null;
    }

    @v3.g1(version = "1.3")
    public static final <T> T F4(@n6.d Collection<? extends T> collection, @n6.d b5.f fVar) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(fVar, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) b2(collection, fVar.m(collection.size()));
    }

    @n6.d
    public static final <T> List<T> F5(@n6.d List<? extends T> list, int i7) {
        u4.l0.p(list, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return w.E();
        } else {
            int size = list.size();
            if (i7 >= size) {
                return Q5(list);
            }
            if (i7 == 1) {
                return v.k(k3(list));
            }
            ArrayList arrayList = new ArrayList(i7);
            if (list instanceof RandomAccess) {
                for (int i8 = size - i7; i8 < size; i8++) {
                    arrayList.add(list.get(i8));
                }
            } else {
                ListIterator<? extends T> listIterator = list.listIterator(size - i7);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    @s4.h(name = "averageOfFloat")
    public static final double G1(@n6.d Iterable<Float> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().floatValue();
            i7++;
            if (i7 < 0) {
                w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @s4.h(name = "flatMapIndexedSequenceTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R, C extends Collection<? super R>> C G2(Iterable<? extends T> iterable, C c7, t4.p<? super Integer, ? super T, ? extends f5.m<? extends R>> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            b0.n0(c7, pVar.J(Integer.valueOf(i7), obj));
            i7 = i8;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> Double G3(Iterable<? extends T> iterable, t4.l<? super T, Double> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.O((T) it.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <T> T G4(Collection<? extends T> collection) {
        u4.l0.p(collection, "<this>");
        return (T) H4(collection, b5.f.f7260k);
    }

    @n6.d
    public static final <T> List<T> G5(@n6.d List<? extends T> list, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "predicate");
        if (list.isEmpty()) {
            return w.E();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!lVar.O((T) listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return w.E();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return Q5(list);
    }

    @s4.h(name = "averageOfInt")
    public static final double H1(@n6.d Iterable<Integer> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().intValue();
            i7++;
            if (i7 < 0) {
                w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @s4.h(name = "flatMapSequence")
    @v3.g1(version = "1.4")
    @v3.t0
    @n6.d
    public static final <T, R> List<R> H2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends f5.m<? extends R>> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            b0.n0(arrayList, lVar.O((T) it.next()));
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> Float H3(Iterable<? extends T> iterable, t4.l<? super T, Float> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, lVar.O((T) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final <T> T H4(@n6.d Collection<? extends T> collection, @n6.d b5.f fVar) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(fVar, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) b2(collection, fVar.m(collection.size()));
    }

    @n6.d
    public static final <T> List<T> H5(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (!lVar.O(obj).booleanValue()) {
                break;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @s4.h(name = "averageOfLong")
    public static final double I1(@n6.d Iterable<Long> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().longValue();
            i7++;
            if (i7 < 0) {
                w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @s4.h(name = "flatMapSequenceTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @n6.d
    public static final <T, R, C extends Collection<? super R>> C I2(@n6.d Iterable<? extends T> iterable, @n6.d C c7, @n6.d t4.l<? super T, ? extends f5.m<? extends R>> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            b0.n0(c7, lVar.O((T) it.next()));
        }
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> R I3(Iterable<? extends T> iterable, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((T) it.next());
            while (it.hasNext()) {
                R O = lVar.O((T) it.next());
                if (comparator.compare(obj, O) < 0) {
                    obj = O;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final <S, T extends S> S I4(@n6.d Iterable<? extends T> iterable, @n6.d t4.p<? super S, ? super T, ? extends S> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S next = it.next();
            while (it.hasNext()) {
                next = pVar.J(next, (T) it.next());
            }
            return (S) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    @n6.d
    public static final boolean[] I5(@n6.d Collection<Boolean> collection) {
        u4.l0.p(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            zArr[i7] = it.next().booleanValue();
            i7++;
        }
        return zArr;
    }

    @s4.h(name = "averageOfShort")
    public static final double J1(@n6.d Iterable<Short> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().shortValue();
            i7++;
            if (i7 < 0) {
                w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C J2(@n6.d Iterable<? extends T> iterable, @n6.d C c7, @n6.d t4.l<? super T, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            b0.o0(c7, lVar.O((T) it.next()));
        }
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> R J3(Iterable<? extends T> iterable, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((T) it.next());
            while (it.hasNext()) {
                R O = lVar.O((T) it.next());
                if (comparator.compare(obj, O) < 0) {
                    obj = O;
                }
            }
            return (R) obj;
        }
        return null;
    }

    public static final <S, T extends S> S J4(@n6.d Iterable<? extends T> iterable, @n6.d t4.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(qVar, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S next = it.next();
            int i7 = 1;
            while (it.hasNext()) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    w.W();
                }
                next = qVar.I(Integer.valueOf(i7), next, (T) it.next());
                i7 = i8;
            }
            return (S) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    @n6.d
    public static final byte[] J5(@n6.d Collection<Byte> collection) {
        u4.l0.p(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            bArr[i7] = it.next().byteValue();
            i7++;
        }
        return bArr;
    }

    @v3.g1(version = "1.2")
    @n6.d
    public static final <T> List<List<T>> K1(@n6.d Iterable<? extends T> iterable, int i7) {
        u4.l0.p(iterable, "<this>");
        return Y5(iterable, i7, i7, true);
    }

    public static final <T, R> R K2(@n6.d Iterable<? extends T> iterable, R r6, @n6.d t4.p<? super R, ? super T, ? extends R> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r6 = pVar.J(r6, (T) it.next());
        }
        return r6;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <T extends Comparable<? super T>> T K3(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <S, T extends S> S K4(@n6.d Iterable<? extends T> iterable, @n6.d t4.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(qVar, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S next = it.next();
            int i7 = 1;
            while (it.hasNext()) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    w.W();
                }
                next = qVar.I(Integer.valueOf(i7), next, (T) it.next());
                i7 = i8;
            }
            return (S) next;
        }
        return null;
    }

    @n6.d
    public static final char[] K5(@n6.d Collection<Character> collection) {
        u4.l0.p(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            cArr[i7] = it.next().charValue();
            i7++;
        }
        return cArr;
    }

    @v3.g1(version = "1.2")
    @n6.d
    public static final <T, R> List<R> L1(@n6.d Iterable<? extends T> iterable, int i7, @n6.d t4.l<? super List<? extends T>, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "transform");
        return Z5(iterable, i7, i7, true, lVar);
    }

    public static final <T, R> R L2(@n6.d Iterable<? extends T> iterable, R r6, @n6.d t4.q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(qVar, "operation");
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            r6 = qVar.I(Integer.valueOf(i7), r6, obj);
            i7 = i8;
        }
        return r6;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Double L3(@n6.d Iterable<Double> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final <S, T extends S> S L4(@n6.d Iterable<? extends T> iterable, @n6.d t4.p<? super S, ? super T, ? extends S> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S next = it.next();
            while (it.hasNext()) {
                next = pVar.J(next, (T) it.next());
            }
            return (S) next;
        }
        return null;
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C L5(@n6.d Iterable<? extends T> iterable, @n6.d C c7) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c7.add(it.next());
        }
        return c7;
    }

    @k4.f
    public static final <T> T M1(List<? extends T> list) {
        u4.l0.p(list, "<this>");
        return list.get(0);
    }

    public static final <T, R> R M2(@n6.d List<? extends T> list, R r6, @n6.d t4.p<? super T, ? super R, ? extends R> pVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(pVar, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r6 = pVar.J((T) listIterator.previous(), r6);
            }
        }
        return r6;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Float M3(@n6.d Iterable<Float> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    public static final <S, T extends S> S M4(@n6.d List<? extends T> list, @n6.d t4.p<? super T, ? super S, ? extends S> pVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(pVar, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (listIterator.hasPrevious()) {
            S previous = listIterator.previous();
            while (listIterator.hasPrevious()) {
                previous = pVar.J((T) listIterator.previous(), previous);
            }
            return (S) previous;
        }
        throw new UnsupportedOperationException("Empty list can't be reduced.");
    }

    @n6.d
    public static final double[] M5(@n6.d Collection<Double> collection) {
        u4.l0.p(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            dArr[i7] = it.next().doubleValue();
            i7++;
        }
        return dArr;
    }

    @k4.f
    public static final <T> T N1(List<? extends T> list) {
        u4.l0.p(list, "<this>");
        return list.get(1);
    }

    public static final <T, R> R N2(@n6.d List<? extends T> list, R r6, @n6.d t4.q<? super Integer, ? super T, ? super R, ? extends R> qVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(qVar, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r6 = qVar.I(Integer.valueOf(listIterator.previousIndex()), (T) listIterator.previous(), r6);
            }
        }
        return r6;
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    public static final double N3(@n6.d Iterable<Double> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final <S, T extends S> S N4(@n6.d List<? extends T> list, @n6.d t4.q<? super Integer, ? super T, ? super S, ? extends S> qVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(qVar, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (listIterator.hasPrevious()) {
            S previous = listIterator.previous();
            while (listIterator.hasPrevious()) {
                previous = qVar.I(Integer.valueOf(listIterator.previousIndex()), (T) listIterator.previous(), previous);
            }
            return (S) previous;
        }
        throw new UnsupportedOperationException("Empty list can't be reduced.");
    }

    @n6.d
    public static final float[] N5(@n6.d Collection<Float> collection) {
        u4.l0.p(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            fArr[i7] = it.next().floatValue();
            i7++;
        }
        return fArr;
    }

    @k4.f
    public static final <T> T O1(List<? extends T> list) {
        u4.l0.p(list, "<this>");
        return list.get(2);
    }

    @k4.e
    public static final <T> void O2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, m2> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            lVar.O((T) it.next());
        }
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    public static final float O3(@n6.d Iterable<Float> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <S, T extends S> S O4(@n6.d List<? extends T> list, @n6.d t4.q<? super Integer, ? super T, ? super S, ? extends S> qVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(qVar, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (listIterator.hasPrevious()) {
            S previous = listIterator.previous();
            while (listIterator.hasPrevious()) {
                previous = qVar.I(Integer.valueOf(listIterator.previousIndex()), (T) listIterator.previous(), previous);
            }
            return (S) previous;
        }
        return null;
    }

    @n6.d
    public static final <T> HashSet<T> O5(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return (HashSet) L5(iterable, new HashSet(z0.j(x.Y(iterable, 12))));
    }

    @k4.f
    public static final <T> T P1(List<? extends T> list) {
        u4.l0.p(list, "<this>");
        return list.get(3);
    }

    public static final <T> void P2(@n6.d Iterable<? extends T> iterable, @n6.d t4.p<? super Integer, ? super T, m2> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            pVar.J(Integer.valueOf(i7), obj);
            i7 = i8;
        }
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    @n6.d
    public static final <T extends Comparable<? super T>> T P3(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final <S, T extends S> S P4(@n6.d List<? extends T> list, @n6.d t4.p<? super T, ? super S, ? extends S> pVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(pVar, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (listIterator.hasPrevious()) {
            S previous = listIterator.previous();
            while (listIterator.hasPrevious()) {
                previous = pVar.J((T) listIterator.previous(), previous);
            }
            return (S) previous;
        }
        return null;
    }

    @n6.d
    public static final int[] P5(@n6.d Collection<Integer> collection) {
        u4.l0.p(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = it.next().intValue();
            i7++;
        }
        return iArr;
    }

    @k4.f
    public static final <T> T Q1(List<? extends T> list) {
        u4.l0.p(list, "<this>");
        return list.get(4);
    }

    @k4.f
    public static final <T> T Q2(List<? extends T> list, int i7, t4.l<? super Integer, ? extends T> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > w.G(list)) ? lVar.O(Integer.valueOf(i7)) : list.get(i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @n6.e
    public static final <T> T Q3(@n6.d Iterable<? extends T> iterable, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) < 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T> Iterable<T> Q4(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    @n6.d
    public static final <T> List<T> Q5(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return T5(collection);
                }
                return v.k(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return w.E();
        }
        return w.Q(S5(iterable));
    }

    public static final <T> boolean R1(@n6.d Iterable<? extends T> iterable, T t6) {
        u4.l0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t6) : X2(iterable, t6) >= 0;
    }

    @n6.e
    public static final <T> T R2(@n6.d List<? extends T> list, int i7) {
        u4.l0.p(list, "<this>");
        if (i7 < 0 || i7 > w.G(list)) {
            return null;
        }
        return list.get(i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @s4.h(name = "maxWithOrThrow")
    @v3.g1(version = "1.7")
    public static final <T> T R3(@n6.d Iterable<? extends T> iterable, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) < 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T> List<T> R4(@n6.d List<? extends T> list) {
        u4.l0.p(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    @n6.d
    public static final long[] R5(@n6.d Collection<Long> collection) {
        u4.l0.p(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            jArr[i7] = it.next().longValue();
            i7++;
        }
        return jArr;
    }

    public static final <T> int S1(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            it.next();
            i7++;
            if (i7 < 0) {
                w.V();
            }
        }
        return i7;
    }

    @n6.d
    public static final <T, K> Map<K, List<T>> S2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K O = lVar.O(obj);
            Object obj2 = linkedHashMap.get(O);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(O, obj2);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @v3.g1(version = "1.4")
    @n6.e
    public static final <T, R extends Comparable<? super R>> T S3(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends R> lVar) {
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
                return (T) next;
            }
            return next;
        }
        return null;
    }

    @n6.d
    public static final <T> List<T> S4(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (!(iterable instanceof Collection) || ((Collection) iterable).size() > 1) {
            List<T> S5 = S5(iterable);
            d0.m1(S5);
            return S5;
        }
        return Q5(iterable);
    }

    @n6.d
    public static final <T> List<T> S5(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return iterable instanceof Collection ? T5((Collection) iterable) : (List) L5(iterable, new ArrayList());
    }

    public static final <T> int T1(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        int i7 = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (lVar.O((T) it.next()).booleanValue() && (i7 = i7 + 1) < 0) {
                w.V();
            }
        }
        return i7;
    }

    @n6.d
    public static final <T, K, V> Map<K, List<V>> T2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K O = lVar.O(obj);
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @s4.h(name = "minByOrThrow")
    @v3.g1(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T T3(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends R> lVar) {
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
                return (T) next;
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @n6.d
    public static final <T, R> List<R> T4(@n6.d Iterable<? extends T> iterable, R r6, @n6.d t4.p<? super R, ? super T, ? extends R> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "operation");
        int Y = x.Y(iterable, 9);
        if (Y == 0) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(Y + 1);
        arrayList.add(r6);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r6 = pVar.J(r6, (T) it.next());
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.d
    public static final <T> List<T> T5(@n6.d Collection<? extends T> collection) {
        u4.l0.p(collection, "<this>");
        return new ArrayList(collection);
    }

    @k4.f
    public static final <T> int U1(Collection<? extends T> collection) {
        u4.l0.p(collection, "<this>");
        return collection.size();
    }

    @n6.d
    public static final <T, K, M extends Map<? super K, List<T>>> M U2(@n6.d Iterable<? extends T> iterable, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K O = lVar.O(obj);
            Object obj2 = m7.get(O);
            if (obj2 == null) {
                obj2 = new ArrayList();
                m7.put(O, obj2);
            }
            ((List) obj2).add(obj);
        }
        return m7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> double U3(Iterable<? extends T> iterable, t4.l<? super T, Double> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.O((T) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @n6.d
    public static final <T, R> List<R> U4(@n6.d Iterable<? extends T> iterable, R r6, @n6.d t4.q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(qVar, "operation");
        int Y = x.Y(iterable, 9);
        if (Y == 0) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(Y + 1);
        arrayList.add(r6);
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            r6 = qVar.I(Integer.valueOf(i7), r6, (T) it.next());
            arrayList.add(r6);
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final <T> Set<T> U5(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) L5(iterable, new LinkedHashSet());
    }

    @n6.d
    public static final <T> List<T> V1(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return Q5(U5(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T, K, V, M extends Map<? super K, List<V>>> M V2(@n6.d Iterable<? extends T> iterable, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K O = lVar.O(obj);
            Object obj2 = m7.get(O);
            if (obj2 == null) {
                obj2 = new ArrayList();
                m7.put(O, obj2);
            }
            ((List) obj2).add(lVar2.O(obj));
        }
        return m7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> float V3(Iterable<? extends T> iterable, t4.l<? super T, Float> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.O((T) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <S, T extends S> List<S> V4(@n6.d Iterable<? extends T> iterable, @n6.d t4.p<? super S, ? super T, ? extends S> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S next = it.next();
            ArrayList arrayList = new ArrayList(x.Y(iterable, 10));
            arrayList.add(next);
            while (it.hasNext()) {
                next = pVar.J(next, (T) it.next());
                arrayList.add(next);
            }
            return arrayList;
        }
        return w.E();
    }

    @n6.d
    public static final <T> Set<T> V5(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return (Set) L5(iterable, new LinkedHashSet(z0.j(collection.size())));
                }
                return k1.f(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return l1.k();
        }
        return l1.r((Set) L5(iterable, new LinkedHashSet()));
    }

    @n6.d
    public static final <T, K> List<T> W1(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (hashSet.add(lVar.O(obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <T, K> l0<T, K> W2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "keySelector");
        return new c(iterable, lVar);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R W3(Iterable<? extends T> iterable, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R O = lVar.O((T) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((T) it.next());
                if (O.compareTo(O2) > 0) {
                    O = O2;
                }
            }
            return O;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @n6.d
    public static final <S, T extends S> List<S> W4(@n6.d Iterable<? extends T> iterable, @n6.d t4.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(qVar, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S next = it.next();
            ArrayList arrayList = new ArrayList(x.Y(iterable, 10));
            arrayList.add(next);
            int i7 = 1;
            while (it.hasNext()) {
                next = qVar.I(Integer.valueOf(i7), next, (T) it.next());
                arrayList.add(next);
                i7++;
            }
            return arrayList;
        }
        return w.E();
    }

    @n6.d
    public static final short[] W5(@n6.d Collection<Short> collection) {
        u4.l0.p(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            sArr[i7] = it.next().shortValue();
            i7++;
        }
        return sArr;
    }

    @n6.d
    public static final <T> List<T> X1(@n6.d Iterable<? extends T> iterable, int i7) {
        ArrayList arrayList;
        u4.l0.p(iterable, "<this>");
        int i8 = 0;
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return Q5(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i7;
                if (size <= 0) {
                    return w.E();
                }
                if (size == 1) {
                    return v.k(i3(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i7 < size2) {
                            arrayList.add(((List) iterable).get(i7));
                            i7++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i7);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (T t6 : iterable) {
                if (i8 >= i7) {
                    arrayList.add(t6);
                } else {
                    i8++;
                }
            }
            return w.Q(arrayList);
        }
    }

    public static final <T> int X2(@n6.d Iterable<? extends T> iterable, T t6) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t6);
        }
        int i7 = 0;
        for (T t7 : iterable) {
            if (i7 < 0) {
                w.W();
            }
            if (u4.l0.g(t6, t7)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R X3(Iterable<? extends T> iterable, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            R O = lVar.O((T) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((T) it.next());
                if (O.compareTo(O2) > 0) {
                    O = O2;
                }
            }
            return O;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <T, R> List<R> X4(@n6.d Iterable<? extends T> iterable, R r6, @n6.d t4.p<? super R, ? super T, ? extends R> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "operation");
        int Y = x.Y(iterable, 9);
        if (Y == 0) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(Y + 1);
        arrayList.add(r6);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r6 = pVar.J(r6, (T) it.next());
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.d
    public static final <T> Set<T> X5(@n6.d Iterable<? extends T> iterable, @n6.d Iterable<? extends T> iterable2) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(iterable2, "other");
        Set<T> U5 = U5(iterable);
        b0.o0(U5, iterable2);
        return U5;
    }

    @n6.d
    public static final <T> List<T> Y1(@n6.d List<? extends T> list, int i7) {
        u4.l0.p(list, "<this>");
        if (i7 >= 0) {
            return E5(list, d5.u.u(list.size() - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    public static final <T> int Y2(@n6.d List<? extends T> list, T t6) {
        u4.l0.p(list, "<this>");
        return list.indexOf(t6);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> Double Y3(Iterable<? extends T> iterable, t4.l<? super T, Double> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.O((T) it.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @v3.g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <T, R> List<R> Y4(@n6.d Iterable<? extends T> iterable, R r6, @n6.d t4.q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(qVar, "operation");
        int Y = x.Y(iterable, 9);
        if (Y == 0) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(Y + 1);
        arrayList.add(r6);
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            r6 = qVar.I(Integer.valueOf(i7), r6, (T) it.next());
            arrayList.add(r6);
            i7++;
        }
        return arrayList;
    }

    @v3.g1(version = "1.2")
    @n6.d
    public static final <T> List<List<T>> Y5(@n6.d Iterable<? extends T> iterable, int i7, int i8, boolean z6) {
        int B;
        u4.l0.p(iterable, "<this>");
        o1.a(i7, i8);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b7 = o1.b(iterable.iterator(), i7, i8, z6, false);
            while (b7.hasNext()) {
                arrayList.add((List) b7.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i8) + (size % i8 == 0 ? 0 : 1));
        int i9 = 0;
        while (true) {
            if (!(i9 >= 0 && i9 < size) || ((B = d5.u.B(i7, size - i9)) < i7 && !z6)) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(B);
            for (int i10 = 0; i10 < B; i10++) {
                arrayList3.add(list.get(i10 + i9));
            }
            arrayList2.add(arrayList3);
            i9 += i8;
        }
        return arrayList2;
    }

    @n6.d
    public static final <T> List<T> Z1(@n6.d List<? extends T> list, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!lVar.O((T) listIterator.previous()).booleanValue()) {
                    return E5(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return w.E();
    }

    public static final <T> int Z2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (i7 < 0) {
                w.W();
            }
            if (lVar.O(obj).booleanValue()) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> Float Z3(Iterable<? extends T> iterable, t4.l<? super T, Float> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.O((T) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    @v3.g1(version = "1.3")
    public static final <T> void Z4(@n6.d List<T> list, @n6.d b5.f fVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(fVar, "random");
        for (int G = w.G(list); G > 0; G--) {
            int m7 = fVar.m(G + 1);
            list.set(m7, list.set(G, list.get(m7)));
        }
    }

    @v3.g1(version = "1.2")
    @n6.d
    public static final <T, R> List<R> Z5(@n6.d Iterable<? extends T> iterable, int i7, int i8, boolean z6, @n6.d t4.l<? super List<? extends T>, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "transform");
        o1.a(i7, i8);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b7 = o1.b(iterable.iterator(), i7, i8, z6, true);
            while (b7.hasNext()) {
                arrayList.add(lVar.O((List) b7.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i8) + (size % i8 == 0 ? 0 : 1));
        d1 d1Var = new d1(list);
        int i9 = 0;
        while (true) {
            if (!(i9 >= 0 && i9 < size)) {
                break;
            }
            int B = d5.u.B(i7, size - i9);
            if (!z6 && B < i7) {
                break;
            }
            d1Var.b(i9, B + i9);
            arrayList2.add(lVar.O(d1Var));
            i9 += i8;
        }
        return arrayList2;
    }

    @n6.d
    public static final <T> List<T> a2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (z6) {
                arrayList.add(obj);
            } else if (!lVar.O(obj).booleanValue()) {
                arrayList.add(obj);
                z6 = true;
            }
        }
        return arrayList;
    }

    public static final <T> int a3(@n6.d List<? extends T> list, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (lVar.O((T) it.next()).booleanValue()) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> R a4(Iterable<? extends T> iterable, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((T) it.next());
            while (it.hasNext()) {
                R O = lVar.O((T) it.next());
                if (comparator.compare(obj, O) > 0) {
                    obj = O;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    public static final <T> T a5(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) c5((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static /* synthetic */ List a6(Iterable iterable, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return Y5(iterable, i7, i8, z6);
    }

    public static final <T> T b2(@n6.d Iterable<? extends T> iterable, int i7) {
        u4.l0.p(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i7) : (T) d2(iterable, i7, new b(i7));
    }

    public static final <T> int b3(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        int i7 = -1;
        int i8 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (i8 < 0) {
                w.W();
            }
            if (lVar.O(obj).booleanValue()) {
                i7 = i8;
            }
            i8++;
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> R b4(Iterable<? extends T> iterable, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((T) it.next());
            while (it.hasNext()) {
                R O = lVar.O((T) it.next());
                if (comparator.compare(obj, O) > 0) {
                    obj = O;
                }
            }
            return (R) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T b5(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        T t6 = null;
        boolean z6 = false;
        for (T t7 : iterable) {
            if (lVar.O(t7).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z6 = true;
                t6 = t7;
            }
        }
        if (z6) {
            return t6;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ List b6(Iterable iterable, int i7, int i8, boolean z6, t4.l lVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return Z5(iterable, i7, i8, z6, lVar);
    }

    @k4.f
    public static final <T> T c2(List<? extends T> list, int i7) {
        u4.l0.p(list, "<this>");
        return list.get(i7);
    }

    public static final <T> int c3(@n6.d List<? extends T> list, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (lVar.O((T) listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <T extends Comparable<? super T>> T c4(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static final <T> T c5(@n6.d List<? extends T> list) {
        u4.l0.p(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    @n6.d
    public static final <T> Iterable<p0<T>> c6(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return new q0(new d(iterable));
    }

    public static final <T> T d2(@n6.d Iterable<? extends T> iterable, int i7, @n6.d t4.l<? super Integer, ? extends T> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i7 < 0 || i7 > w.G(list)) ? lVar.O(Integer.valueOf(i7)) : (T) list.get(i7);
        } else if (i7 < 0) {
            return lVar.O(Integer.valueOf(i7));
        } else {
            int i8 = 0;
            for (T t6 : iterable) {
                int i9 = i8 + 1;
                if (i7 == i8) {
                    return t6;
                }
                i8 = i9;
            }
            return lVar.O(Integer.valueOf(i7));
        }
    }

    @n6.d
    public static final <T> Set<T> d3(@n6.d Iterable<? extends T> iterable, @n6.d Iterable<? extends T> iterable2) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(iterable2, "other");
        Set<T> U5 = U5(iterable);
        b0.P0(U5, iterable2);
        return U5;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Double d4(@n6.d Iterable<Double> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @n6.e
    public static final <T> T d5(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                return null;
            }
            return next;
        }
        return null;
    }

    @n6.d
    public static final <T, R> List<v3.u0<T, R>> d6(@n6.d Iterable<? extends T> iterable, @n6.d Iterable<? extends R> iterable2) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), x.Y(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(v3.q1.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    @k4.f
    public static final <T> T e2(List<? extends T> list, int i7, t4.l<? super Integer, ? extends T> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > w.G(list)) ? lVar.O(Integer.valueOf(i7)) : list.get(i7);
    }

    @n6.d
    public static final <T, A extends Appendable> A e3(@n6.d Iterable<? extends T> iterable, @n6.d A a7, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super T, ? extends CharSequence> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(a7, "buffer");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (T t6 : iterable) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            i5.t.b(a7, t6, lVar);
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Float e4(@n6.d Iterable<Float> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.e
    public static final <T> T e5(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        boolean z6 = false;
        T t6 = null;
        for (T t7 : iterable) {
            if (lVar.O(t7).booleanValue()) {
                if (z6) {
                    return null;
                }
                z6 = true;
                t6 = t7;
            }
        }
        if (z6) {
            return t6;
        }
        return null;
    }

    @n6.d
    public static final <T, R, V> List<V> e6(@n6.d Iterable<? extends T> iterable, @n6.d Iterable<? extends R> iterable2, @n6.d t4.p<? super T, ? super R, ? extends V> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(iterable2, "other");
        u4.l0.p(pVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), x.Y(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(pVar.J((T) it.next(), (R) it2.next()));
        }
        return arrayList;
    }

    @n6.e
    public static final <T> T f2(@n6.d Iterable<? extends T> iterable, int i7) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) R2((List) iterable, i7);
        }
        if (i7 < 0) {
            return null;
        }
        int i8 = 0;
        for (T t6 : iterable) {
            int i9 = i8 + 1;
            if (i7 == i8) {
                return t6;
            }
            i8 = i9;
        }
        return null;
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    public static final double f4(@n6.d Iterable<Double> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @n6.e
    public static final <T> T f5(@n6.d List<? extends T> list) {
        u4.l0.p(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @n6.d
    public static final <T, R> List<v3.u0<T, R>> f6(@n6.d Iterable<? extends T> iterable, @n6.d R[] rArr) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(rArr, "other");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i7 = 0;
        for (T t6 : iterable) {
            if (i7 >= length) {
                break;
            }
            arrayList.add(v3.q1.a(t6, rArr[i7]));
            i7++;
        }
        return arrayList;
    }

    @k4.f
    public static final <T> T g2(List<? extends T> list, int i7) {
        u4.l0.p(list, "<this>");
        return (T) R2(list, i7);
    }

    @n6.d
    public static final <T> String g3(@n6.d Iterable<? extends T> iterable, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super T, ? extends CharSequence> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        String sb = ((StringBuilder) e3(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        u4.l0.o(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    public static final float g4(@n6.d Iterable<Float> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @n6.d
    public static final <T> List<T> g5(@n6.d List<? extends T> list, @n6.d d5.l lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? w.E() : Q5(list.subList(lVar.b().intValue(), lVar.g().intValue() + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T, R, V> List<V> g6(@n6.d Iterable<? extends T> iterable, @n6.d R[] rArr, @n6.d t4.p<? super T, ? super R, ? extends V> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(rArr, "other");
        u4.l0.p(pVar, "transform");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (i7 >= length) {
                break;
            }
            arrayList.add(pVar.J(obj, rArr[i7]));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final <T> List<T> h2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (lVar.O(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String h3(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return g3(iterable, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    @n6.d
    public static final <T extends Comparable<? super T>> T h4(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @n6.d
    public static final <T> List<T> h5(@n6.d List<? extends T> list, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(list, "<this>");
        u4.l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    @v3.g1(version = "1.2")
    @n6.d
    public static final <T> List<v3.u0<T, T>> h6(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                arrayList.add(v3.q1.a(next, next2));
                next = next2;
            }
            return arrayList;
        }
        return w.E();
    }

    @n6.d
    public static final <T> List<T> i2(@n6.d Iterable<? extends T> iterable, @n6.d t4.p<? super Integer, ? super T, Boolean> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            if (pVar.J(Integer.valueOf(i7), obj).booleanValue()) {
                arrayList.add(obj);
            }
            i7 = i8;
        }
        return arrayList;
    }

    public static final <T> T i3(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) k3((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @n6.e
    public static final <T> T i4(@n6.d Iterable<? extends T> iterable, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) > 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void i5(@n6.d List<T> list, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "selector");
        if (list.size() > 1) {
            a0.m0(list, new g.a(lVar));
        }
    }

    @v3.g1(version = "1.2")
    @n6.d
    public static final <T, R> List<R> i6(@n6.d Iterable<? extends T> iterable, @n6.d t4.p<? super T, ? super T, ? extends R> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                arrayList.add(pVar.J(next, next2));
                next = (Object) next2;
            }
            return arrayList;
        }
        return w.E();
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C j2(@n6.d Iterable<? extends T> iterable, @n6.d C c7, @n6.d t4.p<? super Integer, ? super T, Boolean> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            if (pVar.J(Integer.valueOf(i7), obj).booleanValue()) {
                c7.add(obj);
            }
            i7 = i8;
        }
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T j3(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        T t6 = null;
        boolean z6 = false;
        for (T t7 : iterable) {
            if (lVar.O(t7).booleanValue()) {
                z6 = true;
                t6 = t7;
            }
        }
        if (z6) {
            return t6;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @s4.h(name = "minWithOrThrow")
    @v3.g1(version = "1.7")
    public static final <T> T j4(@n6.d Iterable<? extends T> iterable, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) > 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    public static final <T, R extends Comparable<? super R>> void j5(@n6.d List<T> list, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "selector");
        if (list.size() > 1) {
            a0.m0(list, new g.c(lVar));
        }
    }

    public static final /* synthetic */ <R> List<R> k2(Iterable<?> iterable) {
        u4.l0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            u4.l0.y(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T k3(@n6.d List<? extends T> list) {
        u4.l0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(w.G(list));
    }

    @n6.d
    public static final <T> List<T> k4(@n6.d Iterable<? extends T> iterable, @n6.d f5.m<? extends T> mVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(mVar, "elements");
        List c32 = f5.u.c3(mVar);
        if (c32.isEmpty()) {
            return Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t6 : iterable) {
            if (!c32.contains(t6)) {
                arrayList.add(t6);
            }
        }
        return arrayList;
    }

    public static final <T extends Comparable<? super T>> void k5(@n6.d List<T> list) {
        u4.l0.p(list, "<this>");
        a0.m0(list, b4.g.x());
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C l2(Iterable<?> iterable, C c7) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        for (Object obj : iterable) {
            u4.l0.y(3, "R");
            if (obj instanceof Object) {
                c7.add(obj);
            }
        }
        return c7;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public static final <T> T l3(@n6.d List<? extends T> list, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (lVar.O(previous).booleanValue()) {
                return previous;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @n6.d
    public static final <T> List<T> l4(@n6.d Iterable<? extends T> iterable, @n6.d Iterable<? extends T> iterable2) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(iterable2, "elements");
        Collection q02 = b0.q0(iterable2);
        if (q02.isEmpty()) {
            return Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t6 : iterable) {
            if (!q02.contains(t6)) {
                arrayList.add(t6);
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <T extends Comparable<? super T>> List<T> l5(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> S5 = S5(iterable);
            a0.j0(S5);
            return S5;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q5(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        o.v4((Comparable[]) array);
        return o.t(array);
    }

    @n6.d
    public static final <T> List<T> m2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (!lVar.O(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> int m3(@n6.d Iterable<? extends T> iterable, T t6) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t6);
        }
        int i7 = -1;
        int i8 = 0;
        for (T t7 : iterable) {
            if (i8 < 0) {
                w.W();
            }
            if (u4.l0.g(t6, t7)) {
                i7 = i8;
            }
            i8++;
        }
        return i7;
    }

    @n6.d
    public static final <T> List<T> m4(@n6.d Iterable<? extends T> iterable, T t6) {
        u4.l0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList(x.Y(iterable, 10));
        boolean z6 = false;
        for (T t7 : iterable) {
            boolean z7 = true;
            if (!z6 && u4.l0.g(t7, t6)) {
                z6 = true;
                z7 = false;
            }
            if (z7) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <T, R extends Comparable<? super R>> List<T> m5(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        return p5(iterable, new g.a(lVar));
    }

    @n6.d
    public static final <T> List<T> n2(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return (List) o2(iterable, new ArrayList());
    }

    public static final <T> int n3(@n6.d List<? extends T> list, T t6) {
        u4.l0.p(list, "<this>");
        return list.lastIndexOf(t6);
    }

    @n6.d
    public static final <T> List<T> n4(@n6.d Iterable<? extends T> iterable, @n6.d T[] tArr) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(tArr, "elements");
        if (tArr.length == 0) {
            return Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t6 : iterable) {
            if (!p.T8(tArr, t6)) {
                arrayList.add(t6);
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <T, R extends Comparable<? super R>> List<T> n5(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        return p5(iterable, new g.c(lVar));
    }

    @n6.d
    public static final <C extends Collection<? super T>, T> C o2(@n6.d Iterable<? extends T> iterable, @n6.d C c7) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        for (T t6 : iterable) {
            if (t6 != null) {
                c7.add(t6);
            }
        }
        return c7;
    }

    @n6.e
    public static final <T> T o3(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        return null;
    }

    @k4.f
    public static final <T> List<T> o4(Iterable<? extends T> iterable, T t6) {
        u4.l0.p(iterable, "<this>");
        return m4(iterable, t6);
    }

    @n6.d
    public static final <T extends Comparable<? super T>> List<T> o5(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return p5(iterable, b4.g.x());
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C p2(@n6.d Iterable<? extends T> iterable, @n6.d C c7, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (!lVar.O(obj).booleanValue()) {
                c7.add(obj);
            }
        }
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.e
    public static final <T> T p3(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        T t6 = null;
        for (T t7 : iterable) {
            if (lVar.O(t7).booleanValue()) {
                t6 = t7;
            }
        }
        return t6;
    }

    public static final <T> boolean p4(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T> List<T> p5(@n6.d Iterable<? extends T> iterable, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> S5 = S5(iterable);
            a0.m0(S5, comparator);
            return S5;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q5(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        o.I4(array, comparator);
        return o.t(array);
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C q2(@n6.d Iterable<? extends T> iterable, @n6.d C c7, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (lVar.O(obj).booleanValue()) {
                c7.add(obj);
            }
        }
        return c7;
    }

    @n6.e
    public static final <T> T q3(@n6.d List<? extends T> list) {
        u4.l0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> boolean q4(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (lVar.O((T) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public static final <T> Set<T> q5(@n6.d Iterable<? extends T> iterable, @n6.d Iterable<? extends T> iterable2) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(iterable2, "other");
        Set<T> U5 = U5(iterable);
        b0.F0(U5, iterable2);
        return U5;
    }

    public static final <T> boolean r1(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!lVar.O((T) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @k4.f
    public static final <T> T r2(Iterable<? extends T> iterable, t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        for (T t6 : iterable) {
            if (lVar.O(t6).booleanValue()) {
                return t6;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @n6.e
    public static final <T> T r3(@n6.d List<? extends T> list, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (lVar.O(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <T, C extends Iterable<? extends T>> C r4(@n6.d C c7, @n6.d t4.l<? super T, m2> lVar) {
        u4.l0.p(c7, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        Iterator<T> it = c7.iterator();
        while (it.hasNext()) {
            lVar.O(it.next());
        }
        return c7;
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final <T> int r5(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Integer> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += lVar.O((T) it.next()).intValue();
        }
        return i7;
    }

    public static final <T> boolean s1(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <T> T s2(Iterable<? extends T> iterable, t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        T t6 = null;
        for (T t7 : iterable) {
            if (lVar.O(t7).booleanValue()) {
                t6 = t7;
            }
        }
        return t6;
    }

    @n6.d
    public static final <T, R> List<R> s3(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(x.Y(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.O((T) it.next()));
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @n6.d
    public static final <T, C extends Iterable<? extends T>> C s4(@n6.d C c7, @n6.d t4.p<? super Integer, ? super T, m2> pVar) {
        u4.l0.p(c7, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int i7 = 0;
        for (T t6 : c7) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            pVar.J(Integer.valueOf(i7), t6);
            i7 = i8;
        }
        return c7;
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final <T> double s5(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Double> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        while (it.hasNext()) {
            d7 += lVar.O((T) it.next()).doubleValue();
        }
        return d7;
    }

    public static final <T> boolean t1(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (lVar.O((T) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @k4.f
    public static final <T> T t2(List<? extends T> list, t4.l<? super T, Boolean> lVar) {
        u4.l0.p(list, "<this>");
        u4.l0.p(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (lVar.O(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @n6.d
    public static final <T, R> List<R> t3(@n6.d Iterable<? extends T> iterable, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(x.Y(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            arrayList.add(pVar.J(Integer.valueOf(i7), obj));
            i7 = i8;
        }
        return arrayList;
    }

    @n6.d
    public static final <T> v3.u0<List<T>, List<T>> t4(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (lVar.O(obj).booleanValue()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new v3.u0<>(arrayList, arrayList2);
    }

    @s4.h(name = "sumOfByte")
    public static final int t5(@n6.d Iterable<Byte> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += it.next().byteValue();
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <T> Iterable<T> u1(Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return iterable;
    }

    public static final <T> T u2(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) w2((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @n6.d
    public static final <T, R> List<R> u3(@n6.d Iterable<? extends T> iterable, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            R J = pVar.J(Integer.valueOf(i7), obj);
            if (J != null) {
                arrayList.add(J);
            }
            i7 = i8;
        }
        return arrayList;
    }

    @n6.d
    public static final <T> List<T> u4(@n6.d Iterable<? extends T> iterable, @n6.d f5.m<? extends T> mVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(mVar, "elements");
        ArrayList arrayList = new ArrayList();
        b0.o0(arrayList, iterable);
        b0.n0(arrayList, mVar);
        return arrayList;
    }

    @s4.h(name = "sumOfDouble")
    public static final double u5(@n6.d Iterable<Double> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        while (it.hasNext()) {
            d7 += it.next().doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final <T> f5.m<T> v1(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        return new a(iterable);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T v2(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "predicate");
        for (T t6 : iterable) {
            if (lVar.O(t6).booleanValue()) {
                return t6;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C v3(@n6.d Iterable<? extends T> iterable, @n6.d C c7, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            R J = pVar.J(Integer.valueOf(i7), obj);
            if (J != null) {
                c7.add(J);
            }
            i7 = i8;
        }
        return c7;
    }

    @n6.d
    public static final <T> List<T> v4(@n6.d Iterable<? extends T> iterable, @n6.d Iterable<? extends T> iterable2) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(iterable2, "elements");
        if (iterable instanceof Collection) {
            return z4((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        b0.o0(arrayList, iterable);
        b0.o0(arrayList, iterable2);
        return arrayList;
    }

    @s4.h(name = "sumOfDouble")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> double v5(Iterable<? extends T> iterable, t4.l<? super T, Double> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        while (it.hasNext()) {
            d7 += lVar.O((T) it.next()).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final <T, K, V> Map<K, V> w1(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(x.Y(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            v3.u0<? extends K, ? extends V> O = lVar.O((T) it.next());
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    public static final <T> T w2(@n6.d List<? extends T> list) {
        u4.l0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C w3(@n6.d Iterable<? extends T> iterable, @n6.d C c7, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            c7.add(pVar.J(Integer.valueOf(i7), obj));
            i7 = i8;
        }
        return c7;
    }

    @n6.d
    public static final <T> List<T> w4(@n6.d Iterable<? extends T> iterable, T t6) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return A4((Collection) iterable, t6);
        }
        ArrayList arrayList = new ArrayList();
        b0.o0(arrayList, iterable);
        arrayList.add(t6);
        return arrayList;
    }

    @s4.h(name = "sumOfFloat")
    public static final float w5(@n6.d Iterable<Float> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            f7 += it.next().floatValue();
        }
        return f7;
    }

    @n6.d
    public static final <T, K> Map<K, T> x1(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(x.Y(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            linkedHashMap.put(lVar.O(obj), obj);
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.5")
    @k4.f
    public static final <T, R> R x2(Iterable<? extends T> iterable, t4.l<? super T, ? extends R> lVar) {
        R r6;
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                r6 = null;
                break;
            }
            r6 = lVar.O((T) it.next());
            if (r6 != null) {
                break;
            }
        }
        if (r6 != null) {
            return r6;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @n6.d
    public static final <T, R> List<R> x3(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R O = lVar.O((T) it.next());
            if (O != null) {
                arrayList.add(O);
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <T> List<T> x4(@n6.d Iterable<? extends T> iterable, @n6.d T[] tArr) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(tArr, "elements");
        if (iterable instanceof Collection) {
            return B4((Collection) iterable, tArr);
        }
        ArrayList arrayList = new ArrayList();
        b0.o0(arrayList, iterable);
        b0.p0(arrayList, tArr);
        return arrayList;
    }

    @s4.h(name = "sumOfInt")
    public static final int x5(@n6.d Iterable<Integer> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += it.next().intValue();
        }
        return i7;
    }

    @n6.d
    public static final <T, K, V> Map<K, V> y1(@n6.d Iterable<? extends T> iterable, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(x.Y(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            linkedHashMap.put(lVar.O(obj), lVar2.O(obj));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.5")
    @k4.f
    public static final <T, R> R y2(Iterable<? extends T> iterable, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R O = lVar.O((T) it.next());
            if (O != null) {
                return O;
            }
        }
        return null;
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C y3(@n6.d Iterable<? extends T> iterable, @n6.d C c7, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R O = lVar.O((T) it.next());
            if (O != null) {
                c7.add(O);
            }
        }
        return c7;
    }

    @n6.d
    public static final <T> List<T> y4(@n6.d Collection<? extends T> collection, @n6.d f5.m<? extends T> mVar) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(mVar, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        b0.n0(arrayList, mVar);
        return arrayList;
    }

    @s4.h(name = "sumOfInt")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> int y5(Iterable<? extends T> iterable, t4.l<? super T, Integer> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += lVar.O((T) it.next()).intValue();
        }
        return i7;
    }

    @n6.d
    public static final <T, K, M extends Map<? super K, ? super T>> M z1(@n6.d Iterable<? extends T> iterable, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            m7.put(lVar.O(obj), obj);
        }
        return m7;
    }

    @n6.e
    public static final <T> T z2(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C z3(@n6.d Iterable<? extends T> iterable, @n6.d C c7, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c7.add(lVar.O((T) it.next()));
        }
        return c7;
    }

    @n6.d
    public static final <T> List<T> z4(@n6.d Collection<? extends T> collection, @n6.d Iterable<? extends T> iterable) {
        u4.l0.p(collection, "<this>");
        u4.l0.p(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            b0.o0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @s4.h(name = "sumOfLong")
    public static final long z5(@n6.d Iterable<Long> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long j7 = 0;
        while (it.hasNext()) {
            j7 += it.next().longValue();
        }
        return j7;
    }
}