package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.internal.b1;
import v3.m2;
@i2
/* loaded from: classes.dex */
public class a1<T extends b1 & Comparable<? super T>> {
    @n6.d
    private volatile /* synthetic */ int _size = 0;
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public T[] f12760a;

    @v3.a1
    public final void a(@n6.d T t6) {
        t6.d(this);
        T[] j7 = j();
        int g7 = g();
        o(g7 + 1);
        j7[g7] = t6;
        t6.c(g7);
        q(g7);
    }

    public final void b(@n6.d T t6) {
        synchronized (this) {
            a(t6);
            m2 m2Var = m2.f17815a;
        }
    }

    public final boolean c(@n6.d T t6, @n6.d t4.l<? super T, Boolean> lVar) {
        boolean z6;
        synchronized (this) {
            try {
                if (lVar.O(f()).booleanValue()) {
                    a(t6);
                    z6 = true;
                } else {
                    z6 = false;
                }
                u4.i0.d(1);
            } catch (Throwable th) {
                u4.i0.d(1);
                u4.i0.c(1);
                throw th;
            }
        }
        u4.i0.c(1);
        return z6;
    }

    public final void d() {
        synchronized (this) {
            T[] tArr = this.f12760a;
            if (tArr != null) {
                x3.o.w2(tArr, null, 0, 0, 6, null);
            }
            this._size = 0;
            m2 m2Var = m2.f17815a;
        }
    }

    @n6.e
    public final T e(@n6.d t4.l<? super T, Boolean> lVar) {
        T t6;
        synchronized (this) {
            int g7 = g();
            int i7 = 0;
            while (true) {
                if (i7 >= g7) {
                    break;
                }
                T[] tArr = this.f12760a;
                t6 = tArr != null ? tArr[i7] : null;
                u4.l0.m(t6);
                if (lVar.O(t6).booleanValue()) {
                    break;
                }
                i7++;
            }
        }
        return t6;
    }

    @n6.e
    @v3.a1
    public final T f() {
        T[] tArr = this.f12760a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int g() {
        return this._size;
    }

    public final boolean h() {
        return g() == 0;
    }

    @n6.e
    public final T i() {
        T f7;
        synchronized (this) {
            f7 = f();
        }
        return f7;
    }

    public final T[] j() {
        T[] tArr = this.f12760a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new b1[4];
            this.f12760a = tArr2;
            return tArr2;
        } else if (g() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, g() * 2);
            u4.l0.o(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((b1[]) copyOf);
            this.f12760a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    public final boolean k(@n6.d T t6) {
        boolean z6;
        synchronized (this) {
            if (t6.e() == null) {
                z6 = false;
            } else {
                l(t6.h());
                z6 = true;
            }
        }
        return z6;
    }

    @n6.d
    @v3.a1
    public final T l(int i7) {
        T[] tArr = this.f12760a;
        u4.l0.m(tArr);
        o(g() - 1);
        if (i7 < g()) {
            r(i7, g());
            int i8 = (i7 - 1) / 2;
            if (i7 > 0) {
                T t6 = tArr[i7];
                u4.l0.m(t6);
                T t7 = tArr[i8];
                u4.l0.m(t7);
                if (((Comparable) t6).compareTo(t7) < 0) {
                    r(i7, i8);
                    q(i8);
                }
            }
            p(i7);
        }
        T t8 = tArr[g()];
        u4.l0.m(t8);
        t8.d(null);
        t8.c(-1);
        tArr[g()] = null;
        return t8;
    }

    @n6.e
    public final T m(@n6.d t4.l<? super T, Boolean> lVar) {
        synchronized (this) {
            try {
                T f7 = f();
                if (f7 == null) {
                    u4.i0.d(2);
                    u4.i0.c(2);
                    return null;
                }
                T l7 = lVar.O(f7).booleanValue() ? l(0) : null;
                u4.i0.d(1);
                u4.i0.c(1);
                return l7;
            } catch (Throwable th) {
                u4.i0.d(1);
                u4.i0.c(1);
                throw th;
            }
        }
    }

    @n6.e
    public final T n() {
        T l7;
        synchronized (this) {
            l7 = g() > 0 ? l(0) : null;
        }
        return l7;
    }

    public final void o(int i7) {
        this._size = i7;
    }

    public final void p(int i7) {
        while (true) {
            int i8 = (i7 * 2) + 1;
            if (i8 >= g()) {
                return;
            }
            T[] tArr = this.f12760a;
            u4.l0.m(tArr);
            int i9 = i8 + 1;
            if (i9 < g()) {
                T t6 = tArr[i9];
                u4.l0.m(t6);
                T t7 = tArr[i8];
                u4.l0.m(t7);
                if (((Comparable) t6).compareTo(t7) < 0) {
                    i8 = i9;
                }
            }
            T t8 = tArr[i7];
            u4.l0.m(t8);
            T t9 = tArr[i8];
            u4.l0.m(t9);
            if (((Comparable) t8).compareTo(t9) <= 0) {
                return;
            }
            r(i7, i8);
            i7 = i8;
        }
    }

    public final void q(int i7) {
        while (i7 > 0) {
            T[] tArr = this.f12760a;
            u4.l0.m(tArr);
            int i8 = (i7 - 1) / 2;
            T t6 = tArr[i8];
            u4.l0.m(t6);
            T t7 = tArr[i7];
            u4.l0.m(t7);
            if (((Comparable) t6).compareTo(t7) <= 0) {
                return;
            }
            r(i7, i8);
            i7 = i8;
        }
    }

    public final void r(int i7, int i8) {
        T[] tArr = this.f12760a;
        u4.l0.m(tArr);
        T t6 = tArr[i8];
        u4.l0.m(t6);
        T t7 = tArr[i7];
        u4.l0.m(t7);
        tArr[i7] = t6;
        tArr[i8] = t7;
        t6.c(i7);
        t7.c(i8);
    }
}
