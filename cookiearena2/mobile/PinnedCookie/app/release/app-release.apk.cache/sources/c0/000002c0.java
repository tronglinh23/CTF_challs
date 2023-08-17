package androidx.collection;

import d.o0;
import d.q0;

/* loaded from: classes.dex */
public class n<E> implements Cloneable {

    /* renamed from: o  reason: collision with root package name */
    public static final Object f1994o = new Object();

    /* renamed from: k  reason: collision with root package name */
    public boolean f1995k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f1996l;

    /* renamed from: m  reason: collision with root package name */
    public Object[] f1997m;

    /* renamed from: n  reason: collision with root package name */
    public int f1998n;

    public n() {
        this(10);
    }

    public void A(int i7, int i8) {
        int min = Math.min(this.f1998n, i8 + i7);
        while (i7 < min) {
            z(i7);
            i7++;
        }
    }

    @q0
    public E B(int i7, E e7) {
        int q6 = q(i7);
        if (q6 >= 0) {
            Object[] objArr = this.f1997m;
            E e8 = (E) objArr[q6];
            objArr[q6] = e7;
            return e8;
        }
        return null;
    }

    public boolean C(int i7, E e7, E e8) {
        int q6 = q(i7);
        if (q6 >= 0) {
            Object obj = this.f1997m[q6];
            if (obj == e7 || (e7 != null && e7.equals(obj))) {
                this.f1997m[q6] = e8;
                return true;
            }
            return false;
        }
        return false;
    }

    public void D(int i7, E e7) {
        if (this.f1995k) {
            n();
        }
        this.f1997m[i7] = e7;
    }

    public int E() {
        if (this.f1995k) {
            n();
        }
        return this.f1998n;
    }

    public E F(int i7) {
        if (this.f1995k) {
            n();
        }
        return (E) this.f1997m[i7];
    }

    public void e(int i7, E e7) {
        int i8 = this.f1998n;
        if (i8 != 0 && i7 <= this.f1996l[i8 - 1]) {
            u(i7, e7);
            return;
        }
        if (this.f1995k && i8 >= this.f1996l.length) {
            n();
        }
        int i9 = this.f1998n;
        if (i9 >= this.f1996l.length) {
            int e8 = g.e(i9 + 1);
            int[] iArr = new int[e8];
            Object[] objArr = new Object[e8];
            int[] iArr2 = this.f1996l;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1997m;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1996l = iArr;
            this.f1997m = objArr;
        }
        this.f1996l[i9] = i7;
        this.f1997m[i9] = e7;
        this.f1998n = i9 + 1;
    }

    public void g() {
        int i7 = this.f1998n;
        Object[] objArr = this.f1997m;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f1998n = 0;
        this.f1995k = false;
    }

    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public n<E> clone() {
        try {
            n<E> nVar = (n) super.clone();
            nVar.f1996l = (int[]) this.f1996l.clone();
            nVar.f1997m = (Object[]) this.f1997m.clone();
            return nVar;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public boolean k(int i7) {
        return q(i7) >= 0;
    }

    public boolean l(E e7) {
        return r(e7) >= 0;
    }

    @Deprecated
    public void m(int i7) {
        x(i7);
    }

    public final void n() {
        int i7 = this.f1998n;
        int[] iArr = this.f1996l;
        Object[] objArr = this.f1997m;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f1994o) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f1995k = false;
        this.f1998n = i8;
    }

    @q0
    public E o(int i7) {
        return p(i7, null);
    }

    public E p(int i7, E e7) {
        E e8;
        int a7 = g.a(this.f1996l, this.f1998n, i7);
        return (a7 < 0 || (e8 = (E) this.f1997m[a7]) == f1994o) ? e7 : e8;
    }

    public int q(int i7) {
        if (this.f1995k) {
            n();
        }
        return g.a(this.f1996l, this.f1998n, i7);
    }

    public int r(E e7) {
        if (this.f1995k) {
            n();
        }
        for (int i7 = 0; i7 < this.f1998n; i7++) {
            if (this.f1997m[i7] == e7) {
                return i7;
            }
        }
        return -1;
    }

    public boolean s() {
        return E() == 0;
    }

    public int t(int i7) {
        if (this.f1995k) {
            n();
        }
        return this.f1996l[i7];
    }

    public String toString() {
        if (E() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1998n * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f1998n; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(t(i7));
            sb.append('=');
            E F = F(i7);
            if (F != this) {
                sb.append(F);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void u(int i7, E e7) {
        int a7 = g.a(this.f1996l, this.f1998n, i7);
        if (a7 >= 0) {
            this.f1997m[a7] = e7;
            return;
        }
        int i8 = ~a7;
        int i9 = this.f1998n;
        if (i8 < i9) {
            Object[] objArr = this.f1997m;
            if (objArr[i8] == f1994o) {
                this.f1996l[i8] = i7;
                objArr[i8] = e7;
                return;
            }
        }
        if (this.f1995k && i9 >= this.f1996l.length) {
            n();
            i8 = ~g.a(this.f1996l, this.f1998n, i7);
        }
        int i10 = this.f1998n;
        if (i10 >= this.f1996l.length) {
            int e8 = g.e(i10 + 1);
            int[] iArr = new int[e8];
            Object[] objArr2 = new Object[e8];
            int[] iArr2 = this.f1996l;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1997m;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1996l = iArr;
            this.f1997m = objArr2;
        }
        int i11 = this.f1998n;
        if (i11 - i8 != 0) {
            int[] iArr3 = this.f1996l;
            int i12 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i12, i11 - i8);
            Object[] objArr4 = this.f1997m;
            System.arraycopy(objArr4, i8, objArr4, i12, this.f1998n - i8);
        }
        this.f1996l[i8] = i7;
        this.f1997m[i8] = e7;
        this.f1998n++;
    }

    public void v(@o0 n<? extends E> nVar) {
        int E = nVar.E();
        for (int i7 = 0; i7 < E; i7++) {
            u(nVar.t(i7), nVar.F(i7));
        }
    }

    @q0
    public E w(int i7, E e7) {
        E o6 = o(i7);
        if (o6 == null) {
            u(i7, e7);
        }
        return o6;
    }

    public void x(int i7) {
        int a7 = g.a(this.f1996l, this.f1998n, i7);
        if (a7 >= 0) {
            Object[] objArr = this.f1997m;
            Object obj = objArr[a7];
            Object obj2 = f1994o;
            if (obj != obj2) {
                objArr[a7] = obj2;
                this.f1995k = true;
            }
        }
    }

    public boolean y(int i7, Object obj) {
        int q6 = q(i7);
        if (q6 >= 0) {
            E F = F(q6);
            if (obj == F || (obj != null && obj.equals(F))) {
                z(q6);
                return true;
            }
            return false;
        }
        return false;
    }

    public void z(int i7) {
        Object[] objArr = this.f1997m;
        Object obj = objArr[i7];
        Object obj2 = f1994o;
        if (obj != obj2) {
            objArr[i7] = obj2;
            this.f1995k = true;
        }
    }

    public n(int i7) {
        this.f1995k = false;
        if (i7 == 0) {
            this.f1996l = g.f1940a;
            this.f1997m = g.f1942c;
            return;
        }
        int e7 = g.e(i7);
        this.f1996l = new int[e7];
        this.f1997m = new Object[e7];
    }
}