package g1;

import android.util.SparseArray;
import java.util.Iterator;
import s2.t0;
import u4.l0;
import u4.r1;
import v3.m2;
import x3.s0;
@r1({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,94:1\n76#1,4:95\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n72#1:95,4\n*E\n"})
/* loaded from: classes.dex */
public final class d0 {

    /* loaded from: classes.dex */
    public static final class a extends s0 {

        /* renamed from: k  reason: collision with root package name */
        public int f9987k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ SparseArray<T> f9988l;

        public a(SparseArray<T> sparseArray) {
            this.f9988l = sparseArray;
        }

        @Override // x3.s0
        public int b() {
            SparseArray<T> sparseArray = this.f9988l;
            int i7 = this.f9987k;
            this.f9987k = i7 + 1;
            return sparseArray.keyAt(i7);
        }

        public final int d() {
            return this.f9987k;
        }

        public final void f(int i7) {
            this.f9987k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9987k < this.f9988l.size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public int f9989k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ SparseArray<T> f9990l;

        public b(SparseArray<T> sparseArray) {
            this.f9990l = sparseArray;
        }

        public final int a() {
            return this.f9989k;
        }

        public final void b(int i7) {
            this.f9989k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9989k < this.f9990l.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.f9990l;
            int i7 = this.f9989k;
            this.f9989k = i7 + 1;
            return sparseArray.valueAt(i7);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@n6.d SparseArray<T> sparseArray, int i7) {
        l0.p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i7) >= 0;
    }

    public static final <T> boolean b(@n6.d SparseArray<T> sparseArray, int i7) {
        l0.p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i7) >= 0;
    }

    public static final <T> boolean c(@n6.d SparseArray<T> sparseArray, T t6) {
        l0.p(sparseArray, "<this>");
        return sparseArray.indexOfValue(t6) >= 0;
    }

    public static final <T> void d(@n6.d SparseArray<T> sparseArray, @n6.d t4.p<? super Integer, ? super T, m2> pVar) {
        l0.p(sparseArray, "<this>");
        l0.p(pVar, t0.f16450f);
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            pVar.J(Integer.valueOf(sparseArray.keyAt(i7)), sparseArray.valueAt(i7));
        }
    }

    public static final <T> T e(@n6.d SparseArray<T> sparseArray, int i7, T t6) {
        l0.p(sparseArray, "<this>");
        T t7 = sparseArray.get(i7);
        return t7 == null ? t6 : t7;
    }

    public static final <T> T f(@n6.d SparseArray<T> sparseArray, int i7, @n6.d t4.a<? extends T> aVar) {
        l0.p(sparseArray, "<this>");
        l0.p(aVar, "defaultValue");
        T t6 = sparseArray.get(i7);
        return t6 == null ? aVar.n() : t6;
    }

    public static final <T> int g(@n6.d SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean h(@n6.d SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    public static final <T> boolean i(@n6.d SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    @n6.d
    public static final <T> s0 j(@n6.d SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return new a(sparseArray);
    }

    @n6.d
    public static final <T> SparseArray<T> k(@n6.d SparseArray<T> sparseArray, @n6.d SparseArray<T> sparseArray2) {
        l0.p(sparseArray, "<this>");
        l0.p(sparseArray2, "other");
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        l(sparseArray3, sparseArray);
        l(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void l(@n6.d SparseArray<T> sparseArray, @n6.d SparseArray<T> sparseArray2) {
        l0.p(sparseArray, "<this>");
        l0.p(sparseArray2, "other");
        int size = sparseArray2.size();
        for (int i7 = 0; i7 < size; i7++) {
            sparseArray.put(sparseArray2.keyAt(i7), sparseArray2.valueAt(i7));
        }
    }

    public static final <T> boolean m(@n6.d SparseArray<T> sparseArray, int i7, T t6) {
        l0.p(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i7);
        if (indexOfKey < 0 || !l0.g(t6, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void n(@n6.d SparseArray<T> sparseArray, int i7, T t6) {
        l0.p(sparseArray, "<this>");
        sparseArray.put(i7, t6);
    }

    @n6.d
    public static final <T> Iterator<T> o(@n6.d SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return new b(sparseArray);
    }
}
