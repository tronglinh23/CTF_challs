package u4;

/* loaded from: classes.dex */
public abstract class c1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f17405a;

    /* renamed from: b  reason: collision with root package name */
    public int f17406b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final T[] f17407c;

    public c1(int i7) {
        this.f17405a = i7;
        this.f17407c = (T[]) new Object[i7];
    }

    public static /* synthetic */ void d() {
    }

    public final void a(@n6.d T t6) {
        l0.p(t6, "spreadArgument");
        T[] tArr = this.f17407c;
        int i7 = this.f17406b;
        this.f17406b = i7 + 1;
        tArr[i7] = t6;
    }

    public final int b() {
        return this.f17406b;
    }

    public abstract int c(@n6.d T t6);

    public final void e(int i7) {
        this.f17406b = i7;
    }

    public final int f() {
        int i7 = 0;
        x3.s0 it = new d5.l(0, this.f17405a - 1).iterator();
        while (it.hasNext()) {
            T t6 = this.f17407c[it.b()];
            i7 += t6 != null ? c(t6) : 1;
        }
        return i7;
    }

    @n6.d
    public final T g(@n6.d T t6, @n6.d T t7) {
        l0.p(t6, androidx.lifecycle.r0.f4811g);
        l0.p(t7, "result");
        x3.s0 it = new d5.l(0, this.f17405a - 1).iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            int b7 = it.b();
            T t8 = this.f17407c[b7];
            if (t8 != null) {
                if (i7 < b7) {
                    int i9 = b7 - i7;
                    System.arraycopy(t6, i7, t7, i8, i9);
                    i8 += i9;
                }
                int c7 = c(t8);
                System.arraycopy(t8, 0, t7, i8, c7);
                i8 += c7;
                i7 = b7 + 1;
            }
        }
        int i10 = this.f17405a;
        if (i7 < i10) {
            System.arraycopy(t6, i7, t7, i8, i10 - i7);
        }
        return t7;
    }
}