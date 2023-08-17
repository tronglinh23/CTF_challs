package g1;

import android.annotation.SuppressLint;
import android.util.SparseLongArray;
import d.w0;
import u4.l0;
import u4.r1;
import v3.m2;
import x3.s0;
import x3.t0;
@r1({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n103#1,4:127\n1#2:126\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n97#1:127,4\n*E\n"})
/* loaded from: classes.dex */
public final class g0 {

    /* loaded from: classes.dex */
    public static final class a extends s0 {

        /* renamed from: k  reason: collision with root package name */
        public int f10000k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ SparseLongArray f10001l;

        public a(SparseLongArray sparseLongArray) {
            this.f10001l = sparseLongArray;
        }

        @Override // x3.s0
        public int b() {
            SparseLongArray sparseLongArray = this.f10001l;
            int i7 = this.f10000k;
            this.f10000k = i7 + 1;
            return sparseLongArray.keyAt(i7);
        }

        public final int d() {
            return this.f10000k;
        }

        public final void f(int i7) {
            this.f10000k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10000k < this.f10001l.size();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends t0 {

        /* renamed from: k  reason: collision with root package name */
        public int f10002k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ SparseLongArray f10003l;

        public b(SparseLongArray sparseLongArray) {
            this.f10003l = sparseLongArray;
        }

        @Override // x3.t0
        public long b() {
            SparseLongArray sparseLongArray = this.f10003l;
            int i7 = this.f10002k;
            this.f10002k = i7 + 1;
            return sparseLongArray.valueAt(i7);
        }

        public final int d() {
            return this.f10002k;
        }

        public final void f(int i7) {
            this.f10002k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10002k < this.f10003l.size();
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final boolean a(@n6.d SparseLongArray sparseLongArray, int i7) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i7) >= 0;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final boolean b(@n6.d SparseLongArray sparseLongArray, int i7) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i7) >= 0;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final boolean c(@n6.d SparseLongArray sparseLongArray, long j7) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfValue(j7) >= 0;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final void d(@n6.d SparseLongArray sparseLongArray, @n6.d t4.p<? super Integer, ? super Long, m2> pVar) {
        l0.p(sparseLongArray, "<this>");
        l0.p(pVar, s2.t0.f16450f);
        int size = sparseLongArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            pVar.J(Integer.valueOf(sparseLongArray.keyAt(i7)), Long.valueOf(sparseLongArray.valueAt(i7)));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final long e(@n6.d SparseLongArray sparseLongArray, int i7, long j7) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.get(i7, j7);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final long f(@n6.d SparseLongArray sparseLongArray, int i7, @n6.d t4.a<Long> aVar) {
        l0.p(sparseLongArray, "<this>");
        l0.p(aVar, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i7);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : aVar.n().longValue();
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final int g(@n6.d SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final boolean h(@n6.d SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.size() == 0;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final boolean i(@n6.d SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.size() != 0;
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final s0 j(@n6.d SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return new a(sparseLongArray);
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final SparseLongArray k(@n6.d SparseLongArray sparseLongArray, @n6.d SparseLongArray sparseLongArray2) {
        l0.p(sparseLongArray, "<this>");
        l0.p(sparseLongArray2, "other");
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        l(sparseLongArray3, sparseLongArray);
        l(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final void l(@n6.d SparseLongArray sparseLongArray, @n6.d SparseLongArray sparseLongArray2) {
        l0.p(sparseLongArray, "<this>");
        l0.p(sparseLongArray2, "other");
        int size = sparseLongArray2.size();
        for (int i7 = 0; i7 < size; i7++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i7), sparseLongArray2.valueAt(i7));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final boolean m(@n6.d SparseLongArray sparseLongArray, int i7, long j7) {
        l0.p(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i7);
        if (indexOfKey < 0 || j7 != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final void n(@n6.d SparseLongArray sparseLongArray, int i7, long j7) {
        l0.p(sparseLongArray, "<this>");
        sparseLongArray.put(i7, j7);
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @w0(18)
    public static final t0 o(@n6.d SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return new b(sparseLongArray);
    }
}
