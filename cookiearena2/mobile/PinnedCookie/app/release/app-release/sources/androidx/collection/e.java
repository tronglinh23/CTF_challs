package androidx.collection;
/* loaded from: classes.dex */
public final class e<E> {

    /* renamed from: a  reason: collision with root package name */
    public E[] f1932a;

    /* renamed from: b  reason: collision with root package name */
    public int f1933b;

    /* renamed from: c  reason: collision with root package name */
    public int f1934c;

    /* renamed from: d  reason: collision with root package name */
    public int f1935d;

    public e() {
        this(8);
    }

    public void a(E e7) {
        int i7 = (this.f1933b - 1) & this.f1935d;
        this.f1933b = i7;
        this.f1932a[i7] = e7;
        if (i7 == this.f1934c) {
            d();
        }
    }

    public void b(E e7) {
        E[] eArr = this.f1932a;
        int i7 = this.f1934c;
        eArr[i7] = e7;
        int i8 = this.f1935d & (i7 + 1);
        this.f1934c = i8;
        if (i8 == this.f1933b) {
            d();
        }
    }

    public void c() {
        l(m());
    }

    public final void d() {
        E[] eArr = this.f1932a;
        int length = eArr.length;
        int i7 = this.f1933b;
        int i8 = length - i7;
        int i9 = length << 1;
        if (i9 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i9];
        System.arraycopy(eArr, i7, eArr2, 0, i8);
        System.arraycopy(this.f1932a, 0, eArr2, i8, this.f1933b);
        this.f1932a = eArr2;
        this.f1933b = 0;
        this.f1934c = length;
        this.f1935d = i9 - 1;
    }

    public E e(int i7) {
        if (i7 < 0 || i7 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1932a[this.f1935d & (this.f1933b + i7)];
    }

    public E f() {
        int i7 = this.f1933b;
        if (i7 != this.f1934c) {
            return this.f1932a[i7];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E g() {
        int i7 = this.f1933b;
        int i8 = this.f1934c;
        if (i7 != i8) {
            return this.f1932a[(i8 - 1) & this.f1935d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        return this.f1933b == this.f1934c;
    }

    public E i() {
        int i7 = this.f1933b;
        if (i7 != this.f1934c) {
            E[] eArr = this.f1932a;
            E e7 = eArr[i7];
            eArr[i7] = null;
            this.f1933b = (i7 + 1) & this.f1935d;
            return e7;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E j() {
        int i7 = this.f1933b;
        int i8 = this.f1934c;
        if (i7 != i8) {
            int i9 = this.f1935d & (i8 - 1);
            E[] eArr = this.f1932a;
            E e7 = eArr[i9];
            eArr[i9] = null;
            this.f1934c = i9;
            return e7;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void k(int i7) {
        int i8;
        if (i7 <= 0) {
            return;
        }
        if (i7 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i9 = this.f1934c;
        int i10 = i7 < i9 ? i9 - i7 : 0;
        int i11 = i10;
        while (true) {
            i8 = this.f1934c;
            if (i11 >= i8) {
                break;
            }
            this.f1932a[i11] = null;
            i11++;
        }
        int i12 = i8 - i10;
        int i13 = i7 - i12;
        this.f1934c = i8 - i12;
        if (i13 > 0) {
            int length = this.f1932a.length;
            this.f1934c = length;
            int i14 = length - i13;
            for (int i15 = i14; i15 < this.f1934c; i15++) {
                this.f1932a[i15] = null;
            }
            this.f1934c = i14;
        }
    }

    public void l(int i7) {
        if (i7 <= 0) {
            return;
        }
        if (i7 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f1932a.length;
        int i8 = this.f1933b;
        if (i7 < length - i8) {
            length = i8 + i7;
        }
        while (i8 < length) {
            this.f1932a[i8] = null;
            i8++;
        }
        int i9 = this.f1933b;
        int i10 = length - i9;
        int i11 = i7 - i10;
        this.f1933b = this.f1935d & (i9 + i10);
        if (i11 > 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                this.f1932a[i12] = null;
            }
            this.f1933b = i11;
        }
    }

    public int m() {
        return (this.f1934c - this.f1933b) & this.f1935d;
    }

    public e(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i7 <= 1073741824) {
            i7 = Integer.bitCount(i7) != 1 ? Integer.highestOneBit(i7 - 1) << 1 : i7;
            this.f1935d = i7 - 1;
            this.f1932a = (E[]) new Object[i7];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
}
