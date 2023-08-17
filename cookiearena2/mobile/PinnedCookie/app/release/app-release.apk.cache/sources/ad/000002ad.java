package androidx.collection;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int[] f1936a;

    /* renamed from: b  reason: collision with root package name */
    public int f1937b;

    /* renamed from: c  reason: collision with root package name */
    public int f1938c;

    /* renamed from: d  reason: collision with root package name */
    public int f1939d;

    public f() {
        this(8);
    }

    public void a(int i7) {
        int i8 = (this.f1937b - 1) & this.f1939d;
        this.f1937b = i8;
        this.f1936a[i8] = i7;
        if (i8 == this.f1938c) {
            d();
        }
    }

    public void b(int i7) {
        int[] iArr = this.f1936a;
        int i8 = this.f1938c;
        iArr[i8] = i7;
        int i9 = this.f1939d & (i8 + 1);
        this.f1938c = i9;
        if (i9 == this.f1937b) {
            d();
        }
    }

    public void c() {
        this.f1938c = this.f1937b;
    }

    public final void d() {
        int[] iArr = this.f1936a;
        int length = iArr.length;
        int i7 = this.f1937b;
        int i8 = length - i7;
        int i9 = length << 1;
        if (i9 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i9];
        System.arraycopy(iArr, i7, iArr2, 0, i8);
        System.arraycopy(this.f1936a, 0, iArr2, i8, this.f1937b);
        this.f1936a = iArr2;
        this.f1937b = 0;
        this.f1938c = length;
        this.f1939d = i9 - 1;
    }

    public int e(int i7) {
        if (i7 < 0 || i7 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1936a[this.f1939d & (this.f1937b + i7)];
    }

    public int f() {
        int i7 = this.f1937b;
        if (i7 != this.f1938c) {
            return this.f1936a[i7];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int g() {
        int i7 = this.f1937b;
        int i8 = this.f1938c;
        if (i7 != i8) {
            return this.f1936a[(i8 - 1) & this.f1939d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        return this.f1937b == this.f1938c;
    }

    public int i() {
        int i7 = this.f1937b;
        if (i7 != this.f1938c) {
            int i8 = this.f1936a[i7];
            this.f1937b = (i7 + 1) & this.f1939d;
            return i8;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int j() {
        int i7 = this.f1937b;
        int i8 = this.f1938c;
        if (i7 != i8) {
            int i9 = this.f1939d & (i8 - 1);
            int i10 = this.f1936a[i9];
            this.f1938c = i9;
            return i10;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void k(int i7) {
        if (i7 <= 0) {
            return;
        }
        if (i7 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f1938c = this.f1939d & (this.f1938c - i7);
    }

    public void l(int i7) {
        if (i7 <= 0) {
            return;
        }
        if (i7 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f1937b = this.f1939d & (this.f1937b + i7);
    }

    public int m() {
        return (this.f1938c - this.f1937b) & this.f1939d;
    }

    public f(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i7 <= 1073741824) {
            i7 = Integer.bitCount(i7) != 1 ? Integer.highestOneBit(i7 - 1) << 1 : i7;
            this.f1939d = i7 - 1;
            this.f1936a = new int[i7];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
}