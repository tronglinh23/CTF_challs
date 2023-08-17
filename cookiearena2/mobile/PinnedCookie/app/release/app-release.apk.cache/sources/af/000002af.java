package androidx.collection;

import d.o0;
import d.q0;

/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: o  reason: collision with root package name */
    public static final Object f1943o = new Object();

    /* renamed from: k  reason: collision with root package name */
    public boolean f1944k;

    /* renamed from: l  reason: collision with root package name */
    public long[] f1945l;

    /* renamed from: m  reason: collision with root package name */
    public Object[] f1946m;

    /* renamed from: n  reason: collision with root package name */
    public int f1947n;

    public h() {
        this(10);
    }

    @q0
    public E A(long j7, E e7) {
        int q6 = q(j7);
        if (q6 >= 0) {
            Object[] objArr = this.f1946m;
            E e8 = (E) objArr[q6];
            objArr[q6] = e7;
            return e8;
        }
        return null;
    }

    public boolean B(long j7, E e7, E e8) {
        int q6 = q(j7);
        if (q6 >= 0) {
            Object obj = this.f1946m[q6];
            if (obj == e7 || (e7 != null && e7.equals(obj))) {
                this.f1946m[q6] = e8;
                return true;
            }
            return false;
        }
        return false;
    }

    public void C(int i7, E e7) {
        if (this.f1944k) {
            n();
        }
        this.f1946m[i7] = e7;
    }

    public int D() {
        if (this.f1944k) {
            n();
        }
        return this.f1947n;
    }

    public E E(int i7) {
        if (this.f1944k) {
            n();
        }
        return (E) this.f1946m[i7];
    }

    public void e(long j7, E e7) {
        int i7 = this.f1947n;
        if (i7 != 0 && j7 <= this.f1945l[i7 - 1]) {
            u(j7, e7);
            return;
        }
        if (this.f1944k && i7 >= this.f1945l.length) {
            n();
        }
        int i8 = this.f1947n;
        if (i8 >= this.f1945l.length) {
            int f7 = g.f(i8 + 1);
            long[] jArr = new long[f7];
            Object[] objArr = new Object[f7];
            long[] jArr2 = this.f1945l;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1946m;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1945l = jArr;
            this.f1946m = objArr;
        }
        this.f1945l[i8] = j7;
        this.f1946m[i8] = e7;
        this.f1947n = i8 + 1;
    }

    public void g() {
        int i7 = this.f1947n;
        Object[] objArr = this.f1946m;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f1947n = 0;
        this.f1944k = false;
    }

    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f1945l = (long[]) this.f1945l.clone();
            hVar.f1946m = (Object[]) this.f1946m.clone();
            return hVar;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public boolean k(long j7) {
        return q(j7) >= 0;
    }

    public boolean l(E e7) {
        return r(e7) >= 0;
    }

    @Deprecated
    public void m(long j7) {
        x(j7);
    }

    public final void n() {
        int i7 = this.f1947n;
        long[] jArr = this.f1945l;
        Object[] objArr = this.f1946m;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f1943o) {
                if (i9 != i8) {
                    jArr[i8] = jArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f1944k = false;
        this.f1947n = i8;
    }

    @q0
    public E o(long j7) {
        return p(j7, null);
    }

    public E p(long j7, E e7) {
        E e8;
        int b7 = g.b(this.f1945l, this.f1947n, j7);
        return (b7 < 0 || (e8 = (E) this.f1946m[b7]) == f1943o) ? e7 : e8;
    }

    public int q(long j7) {
        if (this.f1944k) {
            n();
        }
        return g.b(this.f1945l, this.f1947n, j7);
    }

    public int r(E e7) {
        if (this.f1944k) {
            n();
        }
        for (int i7 = 0; i7 < this.f1947n; i7++) {
            if (this.f1946m[i7] == e7) {
                return i7;
            }
        }
        return -1;
    }

    public boolean s() {
        return D() == 0;
    }

    public long t(int i7) {
        if (this.f1944k) {
            n();
        }
        return this.f1945l[i7];
    }

    public String toString() {
        if (D() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1947n * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f1947n; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(t(i7));
            sb.append('=');
            E E = E(i7);
            if (E != this) {
                sb.append(E);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void u(long j7, E e7) {
        int b7 = g.b(this.f1945l, this.f1947n, j7);
        if (b7 >= 0) {
            this.f1946m[b7] = e7;
            return;
        }
        int i7 = ~b7;
        int i8 = this.f1947n;
        if (i7 < i8) {
            Object[] objArr = this.f1946m;
            if (objArr[i7] == f1943o) {
                this.f1945l[i7] = j7;
                objArr[i7] = e7;
                return;
            }
        }
        if (this.f1944k && i8 >= this.f1945l.length) {
            n();
            i7 = ~g.b(this.f1945l, this.f1947n, j7);
        }
        int i9 = this.f1947n;
        if (i9 >= this.f1945l.length) {
            int f7 = g.f(i9 + 1);
            long[] jArr = new long[f7];
            Object[] objArr2 = new Object[f7];
            long[] jArr2 = this.f1945l;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1946m;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1945l = jArr;
            this.f1946m = objArr2;
        }
        int i10 = this.f1947n;
        if (i10 - i7 != 0) {
            long[] jArr3 = this.f1945l;
            int i11 = i7 + 1;
            System.arraycopy(jArr3, i7, jArr3, i11, i10 - i7);
            Object[] objArr4 = this.f1946m;
            System.arraycopy(objArr4, i7, objArr4, i11, this.f1947n - i7);
        }
        this.f1945l[i7] = j7;
        this.f1946m[i7] = e7;
        this.f1947n++;
    }

    public void v(@o0 h<? extends E> hVar) {
        int D = hVar.D();
        for (int i7 = 0; i7 < D; i7++) {
            u(hVar.t(i7), hVar.E(i7));
        }
    }

    @q0
    public E w(long j7, E e7) {
        E o6 = o(j7);
        if (o6 == null) {
            u(j7, e7);
        }
        return o6;
    }

    public void x(long j7) {
        int b7 = g.b(this.f1945l, this.f1947n, j7);
        if (b7 >= 0) {
            Object[] objArr = this.f1946m;
            Object obj = objArr[b7];
            Object obj2 = f1943o;
            if (obj != obj2) {
                objArr[b7] = obj2;
                this.f1944k = true;
            }
        }
    }

    public boolean y(long j7, Object obj) {
        int q6 = q(j7);
        if (q6 >= 0) {
            E E = E(q6);
            if (obj == E || (obj != null && obj.equals(E))) {
                z(q6);
                return true;
            }
            return false;
        }
        return false;
    }

    public void z(int i7) {
        Object[] objArr = this.f1946m;
        Object obj = objArr[i7];
        Object obj2 = f1943o;
        if (obj != obj2) {
            objArr[i7] = obj2;
            this.f1944k = true;
        }
    }

    public h(int i7) {
        this.f1944k = false;
        if (i7 == 0) {
            this.f1945l = g.f1941b;
            this.f1946m = g.f1942c;
            return;
        }
        int f7 = g.f(i7);
        this.f1945l = new long[f7];
        this.f1946m = new Object[f7];
    }
}