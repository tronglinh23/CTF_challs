package g1;

import android.annotation.SuppressLint;
import android.util.LongSparseArray;
import d.w0;
import java.util.Iterator;
import u4.l0;
import u4.r1;
import v3.m2;
import x3.t0;

@r1({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n1#1,132:1\n104#1,4:133\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n98#1:133,4\n*E\n"})
/* loaded from: classes.dex */
public final class l {

    /* loaded from: classes.dex */
    public static final class a extends t0 {

        /* renamed from: k  reason: collision with root package name */
        public int f10013k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ LongSparseArray<T> f10014l;

        public a(LongSparseArray<T> longSparseArray) {
            this.f10014l = longSparseArray;
        }

        @Override // x3.t0
        @SuppressLint({"ClassVerificationFailure"})
        public long b() {
            LongSparseArray<T> longSparseArray = this.f10014l;
            int i7 = this.f10013k;
            this.f10013k = i7 + 1;
            return longSparseArray.keyAt(i7);
        }

        public final int d() {
            return this.f10013k;
        }

        public final void f(int i7) {
            this.f10013k = i7;
        }

        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            return this.f10013k < this.f10014l.size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public int f10015k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ LongSparseArray<T> f10016l;

        public b(LongSparseArray<T> longSparseArray) {
            this.f10016l = longSparseArray;
        }

        public final int a() {
            return this.f10015k;
        }

        public final void b(int i7) {
            this.f10015k = i7;
        }

        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public boolean hasNext() {
            return this.f10015k < this.f10016l.size();
        }

        @Override // java.util.Iterator
        @SuppressLint({"ClassVerificationFailure"})
        public T next() {
            LongSparseArray<T> longSparseArray = this.f10016l;
            int i7 = this.f10015k;
            this.f10015k = i7 + 1;
            return longSparseArray.valueAt(i7);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> boolean a(@n6.d LongSparseArray<T> longSparseArray, long j7) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j7) >= 0;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> boolean b(@n6.d LongSparseArray<T> longSparseArray, long j7) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j7) >= 0;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> boolean c(@n6.d LongSparseArray<T> longSparseArray, T t6) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(t6) >= 0;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> void d(@n6.d LongSparseArray<T> longSparseArray, @n6.d t4.p<? super Long, ? super T, m2> pVar) {
        l0.p(longSparseArray, "<this>");
        l0.p(pVar, s2.t0.f16450f);
        int size = longSparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            pVar.J(Long.valueOf(longSparseArray.keyAt(i7)), longSparseArray.valueAt(i7));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> T e(@n6.d LongSparseArray<T> longSparseArray, long j7, T t6) {
        l0.p(longSparseArray, "<this>");
        T t7 = longSparseArray.get(j7);
        return t7 == null ? t6 : t7;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> T f(@n6.d LongSparseArray<T> longSparseArray, long j7, @n6.d t4.a<? extends T> aVar) {
        l0.p(longSparseArray, "<this>");
        l0.p(aVar, "defaultValue");
        T t6 = longSparseArray.get(j7);
        return t6 == null ? aVar.n() : t6;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> int g(@n6.d LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> boolean h(@n6.d LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> boolean i(@n6.d LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.size() != 0;
    }

    @n6.d
    @w0(16)
    public static final <T> t0 j(@n6.d LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return new a(longSparseArray);
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> LongSparseArray<T> k(@n6.d LongSparseArray<T> longSparseArray, @n6.d LongSparseArray<T> longSparseArray2) {
        l0.p(longSparseArray, "<this>");
        l0.p(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        l(longSparseArray3, longSparseArray);
        l(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    @w0(16)
    public static final <T> void l(@n6.d LongSparseArray<T> longSparseArray, @n6.d LongSparseArray<T> longSparseArray2) {
        l0.p(longSparseArray, "<this>");
        l0.p(longSparseArray2, "other");
        int size = longSparseArray2.size();
        for (int i7 = 0; i7 < size; i7++) {
            longSparseArray.put(longSparseArray2.keyAt(i7), longSparseArray2.valueAt(i7));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> boolean m(@n6.d LongSparseArray<T> longSparseArray, long j7, T t6) {
        l0.p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j7);
        if (indexOfKey < 0 || !l0.g(t6, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(16)
    public static final <T> void n(@n6.d LongSparseArray<T> longSparseArray, long j7, T t6) {
        l0.p(longSparseArray, "<this>");
        longSparseArray.put(j7, t6);
    }

    @n6.d
    @w0(16)
    public static final <T> Iterator<T> o(@n6.d LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return new b(longSparseArray);
    }
}