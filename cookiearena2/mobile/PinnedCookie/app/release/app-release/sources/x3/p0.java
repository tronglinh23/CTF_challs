package x3;
/* loaded from: classes.dex */
public final class p0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f18381a;

    /* renamed from: b  reason: collision with root package name */
    public final T f18382b;

    public p0(int i7, T t6) {
        this.f18381a = i7;
        this.f18382b = t6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p0 d(p0 p0Var, int i7, Object obj, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            i7 = p0Var.f18381a;
        }
        if ((i8 & 2) != 0) {
            obj = p0Var.f18382b;
        }
        return p0Var.c(i7, obj);
    }

    public final int a() {
        return this.f18381a;
    }

    public final T b() {
        return this.f18382b;
    }

    @n6.d
    public final p0<T> c(int i7, T t6) {
        return new p0<>(i7, t6);
    }

    public final int e() {
        return this.f18381a;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            return this.f18381a == p0Var.f18381a && u4.l0.g(this.f18382b, p0Var.f18382b);
        }
        return false;
    }

    public final T f() {
        return this.f18382b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f18381a) * 31;
        T t6 = this.f18382b;
        return hashCode + (t6 == null ? 0 : t6.hashCode());
    }

    @n6.d
    public String toString() {
        return "IndexedValue(index=" + this.f18381a + ", value=" + this.f18382b + ')';
    }
}
