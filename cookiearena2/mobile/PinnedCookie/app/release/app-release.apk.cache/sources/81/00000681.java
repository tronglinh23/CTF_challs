package androidx.recyclerview.widget;

import d.o0;
import d.q0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: classes.dex */
public class c0<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final int f5247j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f5248k = 10;

    /* renamed from: l  reason: collision with root package name */
    public static final int f5249l = 10;

    /* renamed from: m  reason: collision with root package name */
    public static final int f5250m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f5251n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f5252o = 4;

    /* renamed from: a  reason: collision with root package name */
    public T[] f5253a;

    /* renamed from: b  reason: collision with root package name */
    public T[] f5254b;

    /* renamed from: c  reason: collision with root package name */
    public int f5255c;

    /* renamed from: d  reason: collision with root package name */
    public int f5256d;

    /* renamed from: e  reason: collision with root package name */
    public int f5257e;

    /* renamed from: f  reason: collision with root package name */
    public b f5258f;

    /* renamed from: g  reason: collision with root package name */
    public a f5259g;

    /* renamed from: h  reason: collision with root package name */
    public int f5260h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<T> f5261i;

    /* loaded from: classes.dex */
    public static class a<T2> extends b<T2> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T2> f5262a;

        /* renamed from: b  reason: collision with root package name */
        public final f f5263b;

        public a(b<T2> bVar) {
            this.f5262a = bVar;
            this.f5263b = new f(bVar);
        }

        @Override // androidx.recyclerview.widget.t
        public void a(int i7, int i8) {
            this.f5263b.a(i7, i8);
        }

        @Override // androidx.recyclerview.widget.t
        public void b(int i7, int i8) {
            this.f5263b.b(i7, i8);
        }

        @Override // androidx.recyclerview.widget.t
        public void c(int i7, int i8) {
            this.f5263b.c(i7, i8);
        }

        @Override // androidx.recyclerview.widget.c0.b, java.util.Comparator
        public int compare(T2 t22, T2 t23) {
            return this.f5262a.compare(t22, t23);
        }

        @Override // androidx.recyclerview.widget.c0.b, androidx.recyclerview.widget.t
        public void d(int i7, int i8, Object obj) {
            this.f5263b.d(i7, i8, obj);
        }

        @Override // androidx.recyclerview.widget.c0.b
        public boolean e(T2 t22, T2 t23) {
            return this.f5262a.e(t22, t23);
        }

        @Override // androidx.recyclerview.widget.c0.b
        public boolean f(T2 t22, T2 t23) {
            return this.f5262a.f(t22, t23);
        }

        @Override // androidx.recyclerview.widget.c0.b
        @q0
        public Object g(T2 t22, T2 t23) {
            return this.f5262a.g(t22, t23);
        }

        @Override // androidx.recyclerview.widget.c0.b
        public void h(int i7, int i8) {
            this.f5263b.d(i7, i8, null);
        }

        public void i() {
            this.f5263b.e();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<T2> implements Comparator<T2>, t {
        @Override // java.util.Comparator
        public abstract int compare(T2 t22, T2 t23);

        public void d(int i7, int i8, Object obj) {
            h(i7, i8);
        }

        public abstract boolean e(T2 t22, T2 t23);

        public abstract boolean f(T2 t22, T2 t23);

        @q0
        public Object g(T2 t22, T2 t23) {
            return null;
        }

        public abstract void h(int i7, int i8);
    }

    public c0(@o0 Class<T> cls, @o0 b<T> bVar) {
        this(cls, bVar, 10);
    }

    public final void A(@o0 T[] tArr) {
        boolean z6 = !(this.f5258f instanceof a);
        if (z6) {
            h();
        }
        this.f5255c = 0;
        this.f5256d = this.f5260h;
        this.f5254b = this.f5253a;
        this.f5257e = 0;
        int D = D(tArr);
        this.f5253a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f5261i, D));
        while (true) {
            int i7 = this.f5257e;
            if (i7 >= D && this.f5255c >= this.f5256d) {
                break;
            }
            int i8 = this.f5255c;
            int i9 = this.f5256d;
            if (i8 >= i9) {
                int i10 = D - i7;
                System.arraycopy(tArr, i7, this.f5253a, i7, i10);
                this.f5257e += i10;
                this.f5260h += i10;
                this.f5258f.c(i7, i10);
                break;
            } else if (i7 >= D) {
                int i11 = i9 - i8;
                this.f5260h -= i11;
                this.f5258f.a(i7, i11);
                break;
            } else {
                T t6 = this.f5254b[i8];
                T t7 = tArr[i7];
                int compare = this.f5258f.compare(t6, t7);
                if (compare < 0) {
                    B();
                } else if (compare > 0) {
                    z(t7);
                } else if (this.f5258f.f(t6, t7)) {
                    T[] tArr2 = this.f5253a;
                    int i12 = this.f5257e;
                    tArr2[i12] = t7;
                    this.f5255c++;
                    this.f5257e = i12 + 1;
                    if (!this.f5258f.e(t6, t7)) {
                        b bVar = this.f5258f;
                        bVar.d(this.f5257e - 1, 1, bVar.g(t6, t7));
                    }
                } else {
                    B();
                    z(t7);
                }
            }
        }
        this.f5254b = null;
        if (z6) {
            k();
        }
    }

    public final void B() {
        this.f5260h--;
        this.f5255c++;
        this.f5258f.a(this.f5257e, 1);
    }

    public int C() {
        return this.f5260h;
    }

    public final int D(@o0 T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f5258f);
        int i7 = 0;
        int i8 = 1;
        for (int i9 = 1; i9 < tArr.length; i9++) {
            T t6 = tArr[i9];
            if (this.f5258f.compare(tArr[i7], t6) == 0) {
                int m7 = m(t6, tArr, i7, i8);
                if (m7 != -1) {
                    tArr[m7] = t6;
                } else {
                    if (i8 != i9) {
                        tArr[i8] = t6;
                    }
                    i8++;
                }
            } else {
                if (i8 != i9) {
                    tArr[i8] = t6;
                }
                i7 = i8;
                i8++;
            }
        }
        return i8;
    }

    public final void E() {
        if (this.f5254b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public void F(int i7, T t6) {
        E();
        T n7 = n(i7);
        boolean z6 = n7 == t6 || !this.f5258f.e(n7, t6);
        if (n7 != t6 && this.f5258f.compare(n7, t6) == 0) {
            this.f5253a[i7] = t6;
            if (z6) {
                b bVar = this.f5258f;
                bVar.d(i7, 1, bVar.g(n7, t6));
                return;
            }
            return;
        }
        if (z6) {
            b bVar2 = this.f5258f;
            bVar2.d(i7, 1, bVar2.g(n7, t6));
        }
        v(i7, false);
        int b7 = b(t6, false);
        if (i7 != b7) {
            this.f5258f.b(i7, b7);
        }
    }

    public int a(T t6) {
        E();
        return b(t6, true);
    }

    public final int b(T t6, boolean z6) {
        int l7 = l(t6, this.f5253a, 0, this.f5260h, 1);
        if (l7 == -1) {
            l7 = 0;
        } else if (l7 < this.f5260h) {
            T t7 = this.f5253a[l7];
            if (this.f5258f.f(t7, t6)) {
                if (this.f5258f.e(t7, t6)) {
                    this.f5253a[l7] = t6;
                    return l7;
                }
                this.f5253a[l7] = t6;
                b bVar = this.f5258f;
                bVar.d(l7, 1, bVar.g(t7, t6));
                return l7;
            }
        }
        g(l7, t6);
        if (z6) {
            this.f5258f.c(l7, 1);
        }
        return l7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(@o0 Collection<T> collection) {
        e(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f5261i, collection.size())), true);
    }

    public void d(@o0 T... tArr) {
        e(tArr, false);
    }

    public void e(@o0 T[] tArr, boolean z6) {
        E();
        if (tArr.length == 0) {
            return;
        }
        if (z6) {
            f(tArr);
        } else {
            f(j(tArr));
        }
    }

    public final void f(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int D = D(tArr);
        if (this.f5260h != 0) {
            q(tArr, D);
            return;
        }
        this.f5253a = tArr;
        this.f5260h = D;
        this.f5258f.c(0, D);
    }

    public final void g(int i7, T t6) {
        int i8 = this.f5260h;
        if (i7 > i8) {
            throw new IndexOutOfBoundsException("cannot add item to " + i7 + " because size is " + this.f5260h);
        }
        T[] tArr = this.f5253a;
        if (i8 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f5261i, tArr.length + 10));
            System.arraycopy(this.f5253a, 0, tArr2, 0, i7);
            tArr2[i7] = t6;
            System.arraycopy(this.f5253a, i7, tArr2, i7 + 1, this.f5260h - i7);
            this.f5253a = tArr2;
        } else {
            System.arraycopy(tArr, i7, tArr, i7 + 1, i8 - i7);
            this.f5253a[i7] = t6;
        }
        this.f5260h++;
    }

    public void h() {
        E();
        b bVar = this.f5258f;
        if (bVar instanceof a) {
            return;
        }
        if (this.f5259g == null) {
            this.f5259g = new a(bVar);
        }
        this.f5258f = this.f5259g;
    }

    public void i() {
        E();
        int i7 = this.f5260h;
        if (i7 == 0) {
            return;
        }
        Arrays.fill(this.f5253a, 0, i7, (Object) null);
        this.f5260h = 0;
        this.f5258f.a(0, i7);
    }

    public final T[] j(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f5261i, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    public void k() {
        E();
        b bVar = this.f5258f;
        if (bVar instanceof a) {
            ((a) bVar).i();
        }
        b bVar2 = this.f5258f;
        a aVar = this.f5259g;
        if (bVar2 == aVar) {
            this.f5258f = aVar.f5262a;
        }
    }

    public final int l(T t6, T[] tArr, int i7, int i8, int i9) {
        while (i7 < i8) {
            int i10 = (i7 + i8) / 2;
            T t7 = tArr[i10];
            int compare = this.f5258f.compare(t7, t6);
            if (compare < 0) {
                i7 = i10 + 1;
            } else if (compare == 0) {
                if (this.f5258f.f(t7, t6)) {
                    return i10;
                }
                int p6 = p(t6, i10, i7, i8);
                return (i9 == 1 && p6 == -1) ? i10 : p6;
            } else {
                i8 = i10;
            }
        }
        if (i9 == 1) {
            return i7;
        }
        return -1;
    }

    public final int m(T t6, T[] tArr, int i7, int i8) {
        while (i7 < i8) {
            if (this.f5258f.f(tArr[i7], t6)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public T n(int i7) throws IndexOutOfBoundsException {
        int i8;
        if (i7 < this.f5260h && i7 >= 0) {
            T[] tArr = this.f5254b;
            return (tArr == null || i7 < (i8 = this.f5257e)) ? this.f5253a[i7] : tArr[(i7 - i8) + this.f5255c];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i7 + " but size is " + this.f5260h);
    }

    public int o(T t6) {
        if (this.f5254b != null) {
            int l7 = l(t6, this.f5253a, 0, this.f5257e, 4);
            if (l7 != -1) {
                return l7;
            }
            int l8 = l(t6, this.f5254b, this.f5255c, this.f5256d, 4);
            if (l8 != -1) {
                return (l8 - this.f5255c) + this.f5257e;
            }
            return -1;
        }
        return l(t6, this.f5253a, 0, this.f5260h, 4);
    }

    public final int p(T t6, int i7, int i8, int i9) {
        T t7;
        for (int i10 = i7 - 1; i10 >= i8; i10--) {
            T t8 = this.f5253a[i10];
            if (this.f5258f.compare(t8, t6) != 0) {
                break;
            } else if (this.f5258f.f(t8, t6)) {
                return i10;
            }
        }
        do {
            i7++;
            if (i7 >= i9) {
                return -1;
            }
            t7 = this.f5253a[i7];
            if (this.f5258f.compare(t7, t6) != 0) {
                return -1;
            }
        } while (!this.f5258f.f(t7, t6));
        return i7;
    }

    public final void q(T[] tArr, int i7) {
        boolean z6 = !(this.f5258f instanceof a);
        if (z6) {
            h();
        }
        this.f5254b = this.f5253a;
        int i8 = 0;
        this.f5255c = 0;
        int i9 = this.f5260h;
        this.f5256d = i9;
        this.f5253a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f5261i, i9 + i7 + 10));
        this.f5257e = 0;
        while (true) {
            int i10 = this.f5255c;
            int i11 = this.f5256d;
            if (i10 >= i11 && i8 >= i7) {
                break;
            } else if (i10 == i11) {
                int i12 = i7 - i8;
                System.arraycopy(tArr, i8, this.f5253a, this.f5257e, i12);
                int i13 = this.f5257e + i12;
                this.f5257e = i13;
                this.f5260h += i12;
                this.f5258f.c(i13 - i12, i12);
                break;
            } else if (i8 == i7) {
                int i14 = i11 - i10;
                System.arraycopy(this.f5254b, i10, this.f5253a, this.f5257e, i14);
                this.f5257e += i14;
                break;
            } else {
                T t6 = this.f5254b[i10];
                T t7 = tArr[i8];
                int compare = this.f5258f.compare(t6, t7);
                if (compare > 0) {
                    T[] tArr2 = this.f5253a;
                    int i15 = this.f5257e;
                    int i16 = i15 + 1;
                    this.f5257e = i16;
                    tArr2[i15] = t7;
                    this.f5260h++;
                    i8++;
                    this.f5258f.c(i16 - 1, 1);
                } else if (compare == 0 && this.f5258f.f(t6, t7)) {
                    T[] tArr3 = this.f5253a;
                    int i17 = this.f5257e;
                    this.f5257e = i17 + 1;
                    tArr3[i17] = t7;
                    i8++;
                    this.f5255c++;
                    if (!this.f5258f.e(t6, t7)) {
                        b bVar = this.f5258f;
                        bVar.d(this.f5257e - 1, 1, bVar.g(t6, t7));
                    }
                } else {
                    T[] tArr4 = this.f5253a;
                    int i18 = this.f5257e;
                    this.f5257e = i18 + 1;
                    tArr4[i18] = t6;
                    this.f5255c++;
                }
            }
        }
        this.f5254b = null;
        if (z6) {
            k();
        }
    }

    public void r(int i7) {
        E();
        T n7 = n(i7);
        v(i7, false);
        int b7 = b(n7, false);
        if (i7 != b7) {
            this.f5258f.b(i7, b7);
        }
    }

    public boolean s(T t6) {
        E();
        return t(t6, true);
    }

    public final boolean t(T t6, boolean z6) {
        int l7 = l(t6, this.f5253a, 0, this.f5260h, 2);
        if (l7 == -1) {
            return false;
        }
        v(l7, z6);
        return true;
    }

    public T u(int i7) {
        E();
        T n7 = n(i7);
        v(i7, true);
        return n7;
    }

    public final void v(int i7, boolean z6) {
        T[] tArr = this.f5253a;
        System.arraycopy(tArr, i7 + 1, tArr, i7, (this.f5260h - i7) - 1);
        int i8 = this.f5260h - 1;
        this.f5260h = i8;
        this.f5253a[i8] = null;
        if (z6) {
            this.f5258f.a(i7, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(@o0 Collection<T> collection) {
        y(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f5261i, collection.size())), true);
    }

    public void x(@o0 T... tArr) {
        y(tArr, false);
    }

    public void y(@o0 T[] tArr, boolean z6) {
        E();
        if (z6) {
            A(tArr);
        } else {
            A(j(tArr));
        }
    }

    public final void z(T t6) {
        T[] tArr = this.f5253a;
        int i7 = this.f5257e;
        tArr[i7] = t6;
        int i8 = i7 + 1;
        this.f5257e = i8;
        this.f5260h++;
        this.f5258f.c(i8 - 1, 1);
    }

    public c0(@o0 Class<T> cls, @o0 b<T> bVar, int i7) {
        this.f5261i = cls;
        this.f5253a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i7));
        this.f5258f = bVar;
        this.f5260h = 0;
    }
}