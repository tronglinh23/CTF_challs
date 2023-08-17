package x3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
@u4.r1({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n205#1:209\n205#1:210\n205#1:211\n1#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:209\n176#1:210\n189#1:211\n*E\n"})
/* loaded from: classes.dex */
public final class i1<T> extends c<T> implements RandomAccess {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final Object[] f18311l;

    /* renamed from: m  reason: collision with root package name */
    public final int f18312m;

    /* renamed from: n  reason: collision with root package name */
    public int f18313n;

    /* renamed from: o  reason: collision with root package name */
    public int f18314o;

    @u4.r1({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,207:1\n205#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:208\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a extends b<T> {

        /* renamed from: m  reason: collision with root package name */
        public int f18315m;

        /* renamed from: n  reason: collision with root package name */
        public int f18316n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ i1<T> f18317o;

        public a(i1<T> i1Var) {
            this.f18317o = i1Var;
            this.f18315m = i1Var.size();
            this.f18316n = i1Var.f18313n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x3.b
        public void a() {
            if (this.f18315m == 0) {
                b();
                return;
            }
            d(this.f18317o.f18311l[this.f18316n]);
            this.f18316n = (this.f18316n + 1) % this.f18317o.f18312m;
            this.f18315m--;
        }
    }

    public i1(@n6.d Object[] objArr, int i7) {
        u4.l0.p(objArr, "buffer");
        this.f18311l = objArr;
        if (i7 >= 0) {
            if (i7 <= objArr.length) {
                this.f18312m = objArr.length;
                this.f18314o = i7;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i7 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i7).toString());
    }

    @Override // x3.c, x3.a
    public int a() {
        return this.f18314o;
    }

    public final void g(T t6) {
        if (k()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f18311l[(this.f18313n + size()) % this.f18312m] = t6;
        this.f18314o = size() + 1;
    }

    @Override // x3.c, java.util.List
    public T get(int i7) {
        c.f18278k.b(i7, size());
        return (T) this.f18311l[(this.f18313n + i7) % this.f18312m];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public final i1<T> i(int i7) {
        Object[] array;
        int i8 = this.f18312m;
        int B = d5.u.B(i8 + (i8 >> 1) + 1, i7);
        if (this.f18313n == 0) {
            array = Arrays.copyOf(this.f18311l, B);
            u4.l0.o(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[B]);
        }
        return new i1<>(array, size());
    }

    @Override // x3.c, x3.a, java.util.Collection, java.lang.Iterable
    @n6.d
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final int j(int i7, int i8) {
        return (i7 + i8) % this.f18312m;
    }

    public final boolean k() {
        return size() == this.f18312m;
    }

    public final void l(int i7) {
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i7).toString());
        }
        if (!(i7 <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i7 + ", size = " + size()).toString());
        } else if (i7 > 0) {
            int i8 = this.f18313n;
            int i9 = (i8 + i7) % this.f18312m;
            if (i8 > i9) {
                o.n2(this.f18311l, null, i8, this.f18312m);
                o.n2(this.f18311l, null, 0, i9);
            } else {
                o.n2(this.f18311l, null, i8, i9);
            }
            this.f18313n = i9;
            this.f18314o = size() - i7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x3.a, java.util.Collection
    @n6.d
    public <T> T[] toArray(@n6.d T[] tArr) {
        u4.l0.p(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            u4.l0.o(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = this.f18313n; i8 < size && i9 < this.f18312m; i9++) {
            tArr[i8] = this.f18311l[i9];
            i8++;
        }
        while (i8 < size) {
            tArr[i8] = this.f18311l[i7];
            i8++;
            i7++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public i1(int i7) {
        this(new Object[i7], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x3.a, java.util.Collection
    @n6.d
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
