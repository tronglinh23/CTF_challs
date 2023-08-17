package x3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import v3.m2;
@u4.r1({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* loaded from: classes.dex */
public class v {
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final <E> List<E> a(@n6.d List<E> list) {
        u4.l0.p(list, "builder");
        return ((y3.b) list).k();
    }

    @v3.g1(version = "1.3")
    @k4.f
    @v3.a1
    public static final <E> List<E> b(int i7, t4.l<? super List<E>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        List j7 = j(i7);
        lVar.O(j7);
        return a(j7);
    }

    @v3.g1(version = "1.3")
    @k4.f
    @v3.a1
    public static final <E> List<E> c(t4.l<? super List<E>, m2> lVar) {
        u4.l0.p(lVar, "builderAction");
        List i7 = i();
        lVar.O(i7);
        return a(i7);
    }

    @v3.g1(version = "1.3")
    @k4.f
    @v3.a1
    public static final int d(int i7) {
        if (i7 < 0) {
            if (!k4.m.a(1, 3, 0)) {
                throw new ArithmeticException("Count overflow has happened.");
            }
            w.V();
        }
        return i7;
    }

    @v3.g1(version = "1.3")
    @k4.f
    @v3.a1
    public static final int e(int i7) {
        if (i7 < 0) {
            if (!k4.m.a(1, 3, 0)) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            w.W();
        }
        return i7;
    }

    @k4.f
    public static final Object[] f(Collection<?> collection) {
        u4.l0.p(collection, "collection");
        return u4.v.a(collection);
    }

    @k4.f
    public static final <T> T[] g(Collection<?> collection, T[] tArr) {
        u4.l0.p(collection, "collection");
        u4.l0.p(tArr, "array");
        return (T[]) u4.v.b(collection, tArr);
    }

    @n6.d
    public static final <T> Object[] h(@n6.d T[] tArr, boolean z6) {
        u4.l0.p(tArr, "<this>");
        if (z6 && u4.l0.g(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        u4.l0.o(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final <E> List<E> i() {
        return new y3.b();
    }

    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final <E> List<E> j(int i7) {
        return new y3.b(i7);
    }

    @n6.d
    public static final <T> List<T> k(T t6) {
        List<T> singletonList = Collections.singletonList(t6);
        u4.l0.o(singletonList, "singletonList(element)");
        return singletonList;
    }

    @v3.g1(version = "1.2")
    @n6.d
    public static final <T> List<T> l(@n6.d Iterable<? extends T> iterable) {
        u4.l0.p(iterable, "<this>");
        List<T> S5 = e0.S5(iterable);
        Collections.shuffle(S5);
        return S5;
    }

    @v3.g1(version = "1.2")
    @n6.d
    public static final <T> List<T> m(@n6.d Iterable<? extends T> iterable, @n6.d Random random) {
        u4.l0.p(iterable, "<this>");
        u4.l0.p(random, "random");
        List<T> S5 = e0.S5(iterable);
        Collections.shuffle(S5, random);
        return S5;
    }

    @k4.f
    public static final <T> List<T> n(Enumeration<T> enumeration) {
        u4.l0.p(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        u4.l0.o(list, "list(this)");
        return list;
    }
}
