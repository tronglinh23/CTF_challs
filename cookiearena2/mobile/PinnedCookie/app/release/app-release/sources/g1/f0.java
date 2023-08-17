package g1;

import android.util.SparseIntArray;
import s2.t0;
import u4.l0;
import u4.r1;
import v3.m2;
import x3.s0;
@r1({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"})
/* loaded from: classes.dex */
public final class f0 {

    /* loaded from: classes.dex */
    public static final class a extends s0 {

        /* renamed from: k  reason: collision with root package name */
        public int f9995k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ SparseIntArray f9996l;

        public a(SparseIntArray sparseIntArray) {
            this.f9996l = sparseIntArray;
        }

        @Override // x3.s0
        public int b() {
            SparseIntArray sparseIntArray = this.f9996l;
            int i7 = this.f9995k;
            this.f9995k = i7 + 1;
            return sparseIntArray.keyAt(i7);
        }

        public final int d() {
            return this.f9995k;
        }

        public final void f(int i7) {
            this.f9995k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9995k < this.f9996l.size();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends s0 {

        /* renamed from: k  reason: collision with root package name */
        public int f9997k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ SparseIntArray f9998l;

        public b(SparseIntArray sparseIntArray) {
            this.f9998l = sparseIntArray;
        }

        @Override // x3.s0
        public int b() {
            SparseIntArray sparseIntArray = this.f9998l;
            int i7 = this.f9997k;
            this.f9997k = i7 + 1;
            return sparseIntArray.valueAt(i7);
        }

        public final int d() {
            return this.f9997k;
        }

        public final void f(int i7) {
            this.f9997k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9997k < this.f9998l.size();
        }
    }

    public static final boolean a(@n6.d SparseIntArray sparseIntArray, int i7) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i7) >= 0;
    }

    public static final boolean b(@n6.d SparseIntArray sparseIntArray, int i7) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i7) >= 0;
    }

    public static final boolean c(@n6.d SparseIntArray sparseIntArray, int i7) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfValue(i7) >= 0;
    }

    public static final void d(@n6.d SparseIntArray sparseIntArray, @n6.d t4.p<? super Integer, ? super Integer, m2> pVar) {
        l0.p(sparseIntArray, "<this>");
        l0.p(pVar, t0.f16450f);
        int size = sparseIntArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            pVar.J(Integer.valueOf(sparseIntArray.keyAt(i7)), Integer.valueOf(sparseIntArray.valueAt(i7)));
        }
    }

    public static final int e(@n6.d SparseIntArray sparseIntArray, int i7, int i8) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.get(i7, i8);
    }

    public static final int f(@n6.d SparseIntArray sparseIntArray, int i7, @n6.d t4.a<Integer> aVar) {
        l0.p(sparseIntArray, "<this>");
        l0.p(aVar, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i7);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : aVar.n().intValue();
    }

    public static final int g(@n6.d SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    public static final boolean h(@n6.d SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.size() == 0;
    }

    public static final boolean i(@n6.d SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.size() != 0;
    }

    @n6.d
    public static final s0 j(@n6.d SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return new a(sparseIntArray);
    }

    @n6.d
    public static final SparseIntArray k(@n6.d SparseIntArray sparseIntArray, @n6.d SparseIntArray sparseIntArray2) {
        l0.p(sparseIntArray, "<this>");
        l0.p(sparseIntArray2, "other");
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        l(sparseIntArray3, sparseIntArray);
        l(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void l(@n6.d SparseIntArray sparseIntArray, @n6.d SparseIntArray sparseIntArray2) {
        l0.p(sparseIntArray, "<this>");
        l0.p(sparseIntArray2, "other");
        int size = sparseIntArray2.size();
        for (int i7 = 0; i7 < size; i7++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i7), sparseIntArray2.valueAt(i7));
        }
    }

    public static final boolean m(@n6.d SparseIntArray sparseIntArray, int i7, int i8) {
        l0.p(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i7);
        if (indexOfKey < 0 || i8 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void n(@n6.d SparseIntArray sparseIntArray, int i7, int i8) {
        l0.p(sparseIntArray, "<this>");
        sparseIntArray.put(i7, i8);
    }

    @n6.d
    public static final s0 o(@n6.d SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return new b(sparseIntArray);
    }
}
