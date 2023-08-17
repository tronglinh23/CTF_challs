package x3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
@u4.r1({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
/* loaded from: classes.dex */
public class o0 extends n0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @v3.g1(version = "1.1")
    @n6.d
    public static final <T, K, R> Map<K, R> c(@n6.d l0<T, ? extends K> l0Var, @n6.d t4.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(rVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b7 = l0Var.b();
        while (b7.hasNext()) {
            ?? next = b7.next();
            Object obj = (K) l0Var.a(next);
            Object obj2 = (Object) linkedHashMap.get(obj);
            linkedHashMap.put(obj, rVar.l0(obj, obj2, next, Boolean.valueOf(obj2 == 0 && !linkedHashMap.containsKey(obj))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @v3.g1(version = "1.1")
    @n6.d
    public static final <T, K, R, M extends Map<? super K, R>> M d(@n6.d l0<T, ? extends K> l0Var, @n6.d M m7, @n6.d t4.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(rVar, "operation");
        Iterator<T> b7 = l0Var.b();
        while (b7.hasNext()) {
            ?? next = b7.next();
            Object a7 = l0Var.a(next);
            Object obj = (Object) m7.get(a7);
            m7.put(a7, rVar.l0(a7, obj, next, Boolean.valueOf(obj == 0 && !m7.containsKey(a7))));
        }
        return m7;
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <T, K, M extends Map<? super K, Integer>> M e(@n6.d l0<T, ? extends K> l0Var, @n6.d M m7) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(m7, "destination");
        Iterator<T> b7 = l0Var.b();
        while (b7.hasNext()) {
            K a7 = l0Var.a(b7.next());
            Object obj = m7.get(a7);
            if (obj == null && !m7.containsKey(a7)) {
                obj = 0;
            }
            m7.put(a7, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m7;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @v3.g1(version = "1.1")
    @n6.d
    public static final <T, K, R> Map<K, R> f(@n6.d l0<T, ? extends K> l0Var, R r6, @n6.d t4.p<? super R, ? super T, ? extends R> pVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(pVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b7 = l0Var.b();
        while (b7.hasNext()) {
            ?? next = b7.next();
            K a7 = l0Var.a(next);
            Object obj = (Object) linkedHashMap.get(a7);
            if (obj == null && !linkedHashMap.containsKey(a7)) {
                obj = (Object) r6;
            }
            linkedHashMap.put(a7, pVar.J(obj, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @v3.g1(version = "1.1")
    @n6.d
    public static final <T, K, R> Map<K, R> g(@n6.d l0<T, ? extends K> l0Var, @n6.d t4.p<? super K, ? super T, ? extends R> pVar, @n6.d t4.q<? super K, ? super R, ? super T, ? extends R> qVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(pVar, "initialValueSelector");
        u4.l0.p(qVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b7 = l0Var.b();
        while (b7.hasNext()) {
            ?? next = b7.next();
            Object obj = (K) l0Var.a(next);
            R r6 = (Object) linkedHashMap.get(obj);
            if (r6 == null && !linkedHashMap.containsKey(obj)) {
                r6 = pVar.J(obj, next);
            }
            linkedHashMap.put(obj, qVar.I(obj, r6, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @v3.g1(version = "1.1")
    @n6.d
    public static final <T, K, R, M extends Map<? super K, R>> M h(@n6.d l0<T, ? extends K> l0Var, @n6.d M m7, R r6, @n6.d t4.p<? super R, ? super T, ? extends R> pVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(pVar, "operation");
        Iterator<T> b7 = l0Var.b();
        while (b7.hasNext()) {
            ?? next = b7.next();
            K a7 = l0Var.a(next);
            Object obj = (Object) m7.get(a7);
            if (obj == null && !m7.containsKey(a7)) {
                obj = (Object) r6;
            }
            m7.put(a7, pVar.J(obj, next));
        }
        return m7;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @v3.g1(version = "1.1")
    @n6.d
    public static final <T, K, R, M extends Map<? super K, R>> M i(@n6.d l0<T, ? extends K> l0Var, @n6.d M m7, @n6.d t4.p<? super K, ? super T, ? extends R> pVar, @n6.d t4.q<? super K, ? super R, ? super T, ? extends R> qVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(pVar, "initialValueSelector");
        u4.l0.p(qVar, "operation");
        Iterator<T> b7 = l0Var.b();
        while (b7.hasNext()) {
            ?? next = b7.next();
            Object a7 = l0Var.a(next);
            R r6 = (Object) m7.get(a7);
            if (r6 == null && !m7.containsKey(a7)) {
                r6 = pVar.J(a7, next);
            }
            m7.put(a7, qVar.I(a7, r6, next));
        }
        return m7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.1")
    @n6.d
    public static final <S, T extends S, K> Map<K, S> j(@n6.d l0<T, ? extends K> l0Var, @n6.d t4.q<? super K, ? super S, ? super T, ? extends S> qVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(qVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b7 = l0Var.b();
        while (b7.hasNext()) {
            S s6 = (Object) b7.next();
            Object obj = (Object) l0Var.a(s6);
            Object obj2 = (Object) linkedHashMap.get(obj);
            if (!(obj2 == 0 && !linkedHashMap.containsKey(obj))) {
                s6 = qVar.I(obj, obj2, s6);
            }
            linkedHashMap.put(obj, s6);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.1")
    @n6.d
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@n6.d l0<T, ? extends K> l0Var, @n6.d M m7, @n6.d t4.q<? super K, ? super S, ? super T, ? extends S> qVar) {
        u4.l0.p(l0Var, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(qVar, "operation");
        Iterator b7 = l0Var.b();
        while (b7.hasNext()) {
            S s6 = (Object) b7.next();
            Object obj = (Object) l0Var.a(s6);
            Object obj2 = (Object) m7.get(obj);
            if (!(obj2 == 0 && !m7.containsKey(obj))) {
                s6 = qVar.I(obj, obj2, s6);
            }
            m7.put(obj, s6);
        }
        return m7;
    }
}
