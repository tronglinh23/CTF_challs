package g1;

import android.util.SparseBooleanArray;
import s2.t0;
import u4.l0;
import u4.r1;
import v3.m2;
import x3.s0;
@r1({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n77#1,4:97\n1#2:96\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n73#1:97,4\n*E\n"})
/* loaded from: classes.dex */
public final class e0 {

    /* loaded from: classes.dex */
    public static final class a extends s0 {

        /* renamed from: k  reason: collision with root package name */
        public int f9991k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ SparseBooleanArray f9992l;

        public a(SparseBooleanArray sparseBooleanArray) {
            this.f9992l = sparseBooleanArray;
        }

        @Override // x3.s0
        public int b() {
            SparseBooleanArray sparseBooleanArray = this.f9992l;
            int i7 = this.f9991k;
            this.f9991k = i7 + 1;
            return sparseBooleanArray.keyAt(i7);
        }

        public final int d() {
            return this.f9991k;
        }

        public final void f(int i7) {
            this.f9991k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9991k < this.f9992l.size();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x3.r {

        /* renamed from: k  reason: collision with root package name */
        public int f9993k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ SparseBooleanArray f9994l;

        public b(SparseBooleanArray sparseBooleanArray) {
            this.f9994l = sparseBooleanArray;
        }

        @Override // x3.r
        public boolean b() {
            SparseBooleanArray sparseBooleanArray = this.f9994l;
            int i7 = this.f9993k;
            this.f9993k = i7 + 1;
            return sparseBooleanArray.valueAt(i7);
        }

        public final int d() {
            return this.f9993k;
        }

        public final void f(int i7) {
            this.f9993k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9993k < this.f9994l.size();
        }
    }

    public static final boolean a(@n6.d SparseBooleanArray sparseBooleanArray, int i7) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i7) >= 0;
    }

    public static final boolean b(@n6.d SparseBooleanArray sparseBooleanArray, int i7) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i7) >= 0;
    }

    public static final boolean c(@n6.d SparseBooleanArray sparseBooleanArray, boolean z6) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfValue(z6) >= 0;
    }

    public static final void d(@n6.d SparseBooleanArray sparseBooleanArray, @n6.d t4.p<? super Integer, ? super Boolean, m2> pVar) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(pVar, t0.f16450f);
        int size = sparseBooleanArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            pVar.J(Integer.valueOf(sparseBooleanArray.keyAt(i7)), Boolean.valueOf(sparseBooleanArray.valueAt(i7)));
        }
    }

    public static final boolean e(@n6.d SparseBooleanArray sparseBooleanArray, int i7, boolean z6) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(i7, z6);
    }

    public static final boolean f(@n6.d SparseBooleanArray sparseBooleanArray, int i7, @n6.d t4.a<Boolean> aVar) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(aVar, "defaultValue");
        int indexOfKey = sparseBooleanArray.indexOfKey(i7);
        return indexOfKey >= 0 ? sparseBooleanArray.valueAt(indexOfKey) : aVar.n().booleanValue();
    }

    public static final int g(@n6.d SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }

    public static final boolean h(@n6.d SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean i(@n6.d SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() != 0;
    }

    @n6.d
    public static final s0 j(@n6.d SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return new a(sparseBooleanArray);
    }

    @n6.d
    public static final SparseBooleanArray k(@n6.d SparseBooleanArray sparseBooleanArray, @n6.d SparseBooleanArray sparseBooleanArray2) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(sparseBooleanArray2, "other");
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        l(sparseBooleanArray3, sparseBooleanArray);
        l(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void l(@n6.d SparseBooleanArray sparseBooleanArray, @n6.d SparseBooleanArray sparseBooleanArray2) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(sparseBooleanArray2, "other");
        int size = sparseBooleanArray2.size();
        for (int i7 = 0; i7 < size; i7++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i7), sparseBooleanArray2.valueAt(i7));
        }
    }

    public static final boolean m(@n6.d SparseBooleanArray sparseBooleanArray, int i7, boolean z6) {
        l0.p(sparseBooleanArray, "<this>");
        int indexOfKey = sparseBooleanArray.indexOfKey(i7);
        if (indexOfKey < 0 || z6 != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i7);
        return true;
    }

    public static final void n(@n6.d SparseBooleanArray sparseBooleanArray, int i7, boolean z6) {
        l0.p(sparseBooleanArray, "<this>");
        sparseBooleanArray.put(i7, z6);
    }

    @n6.d
    public static final x3.r o(@n6.d SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return new b(sparseBooleanArray);
    }
}
