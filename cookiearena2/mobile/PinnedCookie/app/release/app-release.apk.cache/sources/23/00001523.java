package kotlinx.coroutines.internal;

/* loaded from: classes.dex */
public class a<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public Object[] f12756a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    public int f12757b;

    /* renamed from: c  reason: collision with root package name */
    public int f12758c;

    public final void a(@n6.d T t6) {
        Object[] objArr = this.f12756a;
        int i7 = this.f12758c;
        objArr[i7] = t6;
        int length = (objArr.length - 1) & (i7 + 1);
        this.f12758c = length;
        if (length == this.f12757b) {
            c();
        }
    }

    public final void b() {
        this.f12757b = 0;
        this.f12758c = 0;
        this.f12756a = new Object[this.f12756a.length];
    }

    public final void c() {
        Object[] objArr = this.f12756a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        x3.o.l1(objArr, objArr2, 0, this.f12757b, 0, 10, null);
        Object[] objArr3 = this.f12756a;
        int length2 = objArr3.length;
        int i7 = this.f12757b;
        x3.o.l1(objArr3, objArr2, length2 - i7, 0, i7, 4, null);
        this.f12756a = objArr2;
        this.f12757b = 0;
        this.f12758c = length;
    }

    public final boolean d() {
        return this.f12757b == this.f12758c;
    }

    @n6.e
    public final T e() {
        int i7 = this.f12757b;
        if (i7 == this.f12758c) {
            return null;
        }
        Object[] objArr = this.f12756a;
        T t6 = (T) objArr[i7];
        objArr[i7] = null;
        this.f12757b = (i7 + 1) & (objArr.length - 1);
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}