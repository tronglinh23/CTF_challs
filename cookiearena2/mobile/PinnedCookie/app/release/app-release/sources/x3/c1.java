package x3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import v3.m2;
@u4.r1({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n96#1,5:595\n111#1,5:600\n152#1,3:605\n143#1:608\n215#1:609\n216#1:611\n144#1:612\n215#1:613\n216#1:615\n1#2:610\n1#2:614\n1940#3,14:616\n1963#3,14:630\n2310#3,14:644\n2333#3,14:658\n1864#3,3:672\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n76#1:595,5\n89#1:600,5\n125#1:605,3\n135#1:608\n135#1:609\n135#1:611\n135#1:612\n143#1:613\n143#1:615\n135#1:610\n230#1:616,14\n241#1:630,14\n390#1:644,14\n401#1:658,14\n574#1:672,3\n*E\n"})
/* loaded from: classes.dex */
public class c1 extends b1 {
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V> Float A1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.O((Object) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V, R> R B1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((Object) it.next());
            while (it.hasNext()) {
                R O = lVar.O((Object) it.next());
                if (comparator.compare(obj, O) > 0) {
                    obj = O;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V, R> R C1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((Object) it.next());
            while (it.hasNext()) {
                R O = lVar.O((Object) it.next());
                if (comparator.compare(obj, O) > 0) {
                    obj = (Object) O;
                }
            }
            return obj;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <K, V> Map.Entry<K, V> D1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        u4.l0.p(map, "<this>");
        u4.l0.p(comparator, "comparator");
        return (Map.Entry) e0.i4(map.entrySet(), comparator);
    }

    @s4.h(name = "minWithOrThrow")
    @v3.g1(version = "1.7")
    @k4.f
    public static final <K, V> Map.Entry<K, V> E1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        u4.l0.p(map, "<this>");
        u4.l0.p(comparator, "comparator");
        return (Map.Entry) e0.j4(map.entrySet(), comparator);
    }

    public static final <K, V> boolean F1(@n6.d Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V> boolean G1(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (lVar.O(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <K, V, M extends Map<? extends K, ? extends V>> M H1(@n6.d M m7, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, m2> lVar) {
        u4.l0.p(m7, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        Iterator<Map.Entry<K, V>> it = m7.entrySet().iterator();
        while (it.hasNext()) {
            lVar.O(it.next());
        }
        return m7;
    }

    @v3.g1(version = "1.4")
    @n6.d
    public static final <K, V, M extends Map<? extends K, ? extends V>> M I1(@n6.d M m7, @n6.d t4.p<? super Integer, ? super Map.Entry<? extends K, ? extends V>, m2> pVar) {
        u4.l0.p(m7, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int i7 = 0;
        for (Object obj : m7.entrySet()) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                w.W();
            }
            pVar.J(Integer.valueOf(i7), obj);
            i7 = i8;
        }
        return m7;
    }

    @n6.d
    public static final <K, V> List<v3.u0<K, V>> J1(@n6.d Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        if (map.size() == 0) {
            return w.E();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<? extends K, ? extends V> next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new v3.u0(next.getKey(), next.getValue()));
                do {
                    Map.Entry<? extends K, ? extends V> next2 = it.next();
                    arrayList.add(new v3.u0(next2.getKey(), next2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
            return v.k(new v3.u0(next.getKey(), next.getValue()));
        }
        return w.E();
    }

    public static final <K, V> boolean P0(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!lVar.O(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean Q0(@n6.d Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        return !map.isEmpty();
    }

    public static final <K, V> boolean R0(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (lVar.O(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @k4.f
    public static final <K, V> Iterable<Map.Entry<K, V>> S0(Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        return map.entrySet();
    }

    @n6.d
    public static final <K, V> f5.m<Map.Entry<K, V>> T0(@n6.d Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        return e0.v1(map.entrySet());
    }

    @k4.f
    public static final <K, V> int U0(Map<? extends K, ? extends V> map) {
        u4.l0.p(map, "<this>");
        return map.size();
    }

    public static final <K, V> int V0(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "predicate");
        int i7 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (lVar.O(it.next()).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @v3.g1(version = "1.5")
    @k4.f
    public static final <K, V, R> R W0(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        R r6;
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                r6 = null;
                break;
            }
            r6 = lVar.O(it.next());
            if (r6 != null) {
                break;
            }
        }
        if (r6 != null) {
            return r6;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @v3.g1(version = "1.5")
    @k4.f
    public static final <K, V, R> R X0(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R O = lVar.O(it.next());
            if (O != null) {
                return O;
            }
        }
        return null;
    }

    @n6.d
    public static final <K, V, R> List<R> Y0(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            b0.o0(arrayList, lVar.O(it.next()));
        }
        return arrayList;
    }

    @s4.h(name = "flatMapSequence")
    @v3.g1(version = "1.4")
    @v3.t0
    @n6.d
    public static final <K, V, R> List<R> Z0(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends f5.m<? extends R>> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            b0.n0(arrayList, lVar.O(it.next()));
        }
        return arrayList;
    }

    @s4.h(name = "flatMapSequenceTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @n6.d
    public static final <K, V, R, C extends Collection<? super R>> C a1(@n6.d Map<? extends K, ? extends V> map, @n6.d C c7, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends f5.m<? extends R>> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            b0.n0(c7, lVar.O(it.next()));
        }
        return c7;
    }

    @n6.d
    public static final <K, V, R, C extends Collection<? super R>> C b1(@n6.d Map<? extends K, ? extends V> map, @n6.d C c7, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            b0.o0(c7, lVar.O(it.next()));
        }
        return c7;
    }

    @k4.e
    public static final <K, V> void c1(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, m2> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            lVar.O(it.next());
        }
    }

    @n6.d
    public static final <K, V, R> List<R> d1(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.O(it.next()));
        }
        return arrayList;
    }

    @n6.d
    public static final <K, V, R> List<R> e1(@n6.d Map<? extends K, ? extends V> map, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R O = lVar.O(it.next());
            if (O != null) {
                arrayList.add(O);
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <K, V, R, C extends Collection<? super R>> C f1(@n6.d Map<? extends K, ? extends V> map, @n6.d C c7, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R O = lVar.O(it.next());
            if (O != null) {
                c7.add(O);
            }
        }
        return c7;
    }

    @n6.d
    public static final <K, V, R, C extends Collection<? super R>> C g1(@n6.d Map<? extends K, ? extends V> map, @n6.d C c7, @n6.d t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            c7.add(lVar.O(it.next()));
        }
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @k4.f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> h1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Object obj;
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R O = lVar.O(obj2);
                do {
                    Object obj3 = (Object) it.next();
                    R O2 = lVar.O(obj3);
                    obj2 = obj2;
                    if (O.compareTo(O2) < 0) {
                        O = O2;
                        obj2 = (Object) obj3;
                    }
                } while (it.hasNext());
            }
            obj = obj2;
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @s4.h(name = "maxByOrThrow")
    @v3.g1(version = "1.7")
    @k4.f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> i1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (Object) it.next();
            if (it.hasNext()) {
                R O = lVar.O(obj);
                do {
                    Object obj2 = (Object) it.next();
                    R O2 = lVar.O(obj2);
                    if (O.compareTo(O2) < 0) {
                        obj = (Object) obj2;
                        O = O2;
                    }
                } while (it.hasNext());
            }
            return (Map.Entry) obj;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V> double j1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.O((Object) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V> float k1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, lVar.O((Object) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V, R extends Comparable<? super R>> R l1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R O = lVar.O((Object) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((Object) it.next());
                if (O.compareTo(O2) < 0) {
                    O = O2;
                }
            }
            return O;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V, R extends Comparable<? super R>> R m1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R O = lVar.O((Object) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((Object) it.next());
                if (O.compareTo(O2) < 0) {
                    O = O2;
                }
            }
            return O;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V> Double n1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.O((Object) it.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V> Float o1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, lVar.O((Object) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V, R> R p1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((Object) it.next());
            while (it.hasNext()) {
                R O = lVar.O((Object) it.next());
                if (comparator.compare(obj, O) < 0) {
                    obj = O;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V, R> R q1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((Object) it.next());
            while (it.hasNext()) {
                R O = lVar.O((Object) it.next());
                if (comparator.compare(obj, O) < 0) {
                    obj = (Object) O;
                }
            }
            return obj;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <K, V> Map.Entry<K, V> r1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        u4.l0.p(map, "<this>");
        u4.l0.p(comparator, "comparator");
        return (Map.Entry) e0.Q3(map.entrySet(), comparator);
    }

    @s4.h(name = "maxWithOrThrow")
    @v3.g1(version = "1.7")
    @k4.f
    public static final <K, V> Map.Entry<K, V> s1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        u4.l0.p(map, "<this>");
        u4.l0.p(comparator, "comparator");
        return (Map.Entry) e0.R3(map.entrySet(), comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @k4.f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> t1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Object obj;
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R O = lVar.O(obj2);
                do {
                    Object obj3 = (Object) it.next();
                    R O2 = lVar.O(obj3);
                    obj2 = obj2;
                    if (O.compareTo(O2) > 0) {
                        O = O2;
                        obj2 = (Object) obj3;
                    }
                } while (it.hasNext());
            }
            obj = obj2;
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @s4.h(name = "minByOrThrow")
    @v3.g1(version = "1.7")
    @k4.f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> u1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (Object) it.next();
            if (it.hasNext()) {
                R O = lVar.O(obj);
                do {
                    Object obj2 = (Object) it.next();
                    R O2 = lVar.O(obj2);
                    if (O.compareTo(O2) > 0) {
                        obj = (Object) obj2;
                        O = O2;
                    }
                } while (it.hasNext());
            }
            return (Map.Entry) obj;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V> double v1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.O((Object) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V> float w1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.O((Object) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V, R extends Comparable<? super R>> R x1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R O = lVar.O((Object) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((Object) it.next());
                if (O.compareTo(O2) > 0) {
                    O = O2;
                }
            }
            return O;
        }
        throw new NoSuchElementException();
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V, R extends Comparable<? super R>> R y1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R O = lVar.O((Object) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((Object) it.next());
                if (O.compareTo(O2) > 0) {
                    O = O2;
                }
            }
            return O;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <K, V> Double z1(Map<? extends K, ? extends V> map, t4.l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        u4.l0.p(map, "<this>");
        u4.l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.O((Object) it.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }
}
