package androidx.collection;

import d.o0;
import d.q0;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class m<K, V> {

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f1982n = false;

    /* renamed from: o  reason: collision with root package name */
    public static final String f1983o = "ArrayMap";

    /* renamed from: p  reason: collision with root package name */
    public static final boolean f1984p = true;

    /* renamed from: q  reason: collision with root package name */
    public static final int f1985q = 4;

    /* renamed from: r  reason: collision with root package name */
    public static final int f1986r = 10;
    @q0

    /* renamed from: s  reason: collision with root package name */
    public static Object[] f1987s;

    /* renamed from: t  reason: collision with root package name */
    public static int f1988t;
    @q0

    /* renamed from: u  reason: collision with root package name */
    public static Object[] f1989u;

    /* renamed from: v  reason: collision with root package name */
    public static int f1990v;

    /* renamed from: k  reason: collision with root package name */
    public int[] f1991k;

    /* renamed from: l  reason: collision with root package name */
    public Object[] f1992l;

    /* renamed from: m  reason: collision with root package name */
    public int f1993m;

    public m() {
        this.f1991k = g.f1940a;
        this.f1992l = g.f1942c;
        this.f1993m = 0;
    }

    private void a(int i7) {
        if (i7 == 8) {
            synchronized (m.class) {
                Object[] objArr = f1989u;
                if (objArr != null) {
                    this.f1992l = objArr;
                    f1989u = (Object[]) objArr[0];
                    this.f1991k = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1990v--;
                    return;
                }
            }
        } else if (i7 == 4) {
            synchronized (m.class) {
                Object[] objArr2 = f1987s;
                if (objArr2 != null) {
                    this.f1992l = objArr2;
                    f1987s = (Object[]) objArr2[0];
                    this.f1991k = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1988t--;
                    return;
                }
            }
        }
        this.f1991k = new int[i7];
        this.f1992l = new Object[i7 << 1];
    }

    public static int b(int[] iArr, int i7, int i8) {
        try {
            return g.a(iArr, i7, i8);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void d(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (m.class) {
                if (f1990v < 10) {
                    objArr[0] = f1989u;
                    objArr[1] = iArr;
                    for (int i8 = (i7 << 1) - 1; i8 >= 2; i8--) {
                        objArr[i8] = null;
                    }
                    f1989u = objArr;
                    f1990v++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (m.class) {
                if (f1988t < 10) {
                    objArr[0] = f1987s;
                    objArr[1] = iArr;
                    for (int i9 = (i7 << 1) - 1; i9 >= 2; i9--) {
                        objArr[i9] = null;
                    }
                    f1987s = objArr;
                    f1988t++;
                }
            }
        }
    }

    public void c(int i7) {
        int i8 = this.f1993m;
        int[] iArr = this.f1991k;
        if (iArr.length < i7) {
            Object[] objArr = this.f1992l;
            a(i7);
            if (this.f1993m > 0) {
                System.arraycopy(iArr, 0, this.f1991k, 0, i8);
                System.arraycopy(objArr, 0, this.f1992l, 0, i8 << 1);
            }
            d(iArr, objArr, i8);
        }
        if (this.f1993m != i8) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i7 = this.f1993m;
        if (i7 > 0) {
            int[] iArr = this.f1991k;
            Object[] objArr = this.f1992l;
            this.f1991k = g.f1940a;
            this.f1992l = g.f1942c;
            this.f1993m = 0;
            d(iArr, objArr, i7);
        }
        if (this.f1993m > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@q0 Object obj) {
        return g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (size() != mVar.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f1993m; i7++) {
                try {
                    K k7 = k(i7);
                    V o6 = o(i7);
                    Object obj2 = mVar.get(k7);
                    if (o6 == null) {
                        if (obj2 != null || !mVar.containsKey(k7)) {
                            return false;
                        }
                    } else if (!o6.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i8 = 0; i8 < this.f1993m; i8++) {
                try {
                    K k8 = k(i8);
                    V o7 = o(i8);
                    Object obj3 = map.get(k8);
                    if (o7 == null) {
                        if (obj3 != null || !map.containsKey(k8)) {
                            return false;
                        }
                    } else if (!o7.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj, int i7) {
        int i8 = this.f1993m;
        if (i8 == 0) {
            return -1;
        }
        int b7 = b(this.f1991k, i8, i7);
        if (b7 >= 0 && !obj.equals(this.f1992l[b7 << 1])) {
            int i9 = b7 + 1;
            while (i9 < i8 && this.f1991k[i9] == i7) {
                if (obj.equals(this.f1992l[i9 << 1])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = b7 - 1; i10 >= 0 && this.f1991k[i10] == i7; i10--) {
                if (obj.equals(this.f1992l[i10 << 1])) {
                    return i10;
                }
            }
            return ~i9;
        }
        return b7;
    }

    public int g(@q0 Object obj) {
        return obj == null ? i() : f(obj, obj.hashCode());
    }

    @q0
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v6) {
        int g7 = g(obj);
        return g7 >= 0 ? (V) this.f1992l[(g7 << 1) + 1] : v6;
    }

    public int hashCode() {
        int[] iArr = this.f1991k;
        Object[] objArr = this.f1992l;
        int i7 = this.f1993m;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            i10 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return i10;
    }

    public int i() {
        int i7 = this.f1993m;
        if (i7 == 0) {
            return -1;
        }
        int b7 = b(this.f1991k, i7, 0);
        if (b7 >= 0 && this.f1992l[b7 << 1] != null) {
            int i8 = b7 + 1;
            while (i8 < i7 && this.f1991k[i8] == 0) {
                if (this.f1992l[i8 << 1] == null) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = b7 - 1; i9 >= 0 && this.f1991k[i9] == 0; i9--) {
                if (this.f1992l[i9 << 1] == null) {
                    return i9;
                }
            }
            return ~i8;
        }
        return b7;
    }

    public boolean isEmpty() {
        return this.f1993m <= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Object obj) {
        int i7 = this.f1993m * 2;
        Object[] objArr = this.f1992l;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public K k(int i7) {
        return (K) this.f1992l[i7 << 1];
    }

    public void l(@o0 m<? extends K, ? extends V> mVar) {
        int i7 = mVar.f1993m;
        c(this.f1993m + i7);
        if (this.f1993m != 0) {
            for (int i8 = 0; i8 < i7; i8++) {
                put(mVar.k(i8), mVar.o(i8));
            }
        } else if (i7 > 0) {
            System.arraycopy(mVar.f1991k, 0, this.f1991k, 0, i7);
            System.arraycopy(mVar.f1992l, 0, this.f1992l, 0, i7 << 1);
            this.f1993m = i7;
        }
    }

    public V m(int i7) {
        Object[] objArr = this.f1992l;
        int i8 = i7 << 1;
        V v6 = (V) objArr[i8 + 1];
        int i9 = this.f1993m;
        int i10 = 0;
        if (i9 <= 1) {
            d(this.f1991k, objArr, i9);
            this.f1991k = g.f1940a;
            this.f1992l = g.f1942c;
        } else {
            int i11 = i9 - 1;
            int[] iArr = this.f1991k;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i7 < i11) {
                    int i12 = i7 + 1;
                    int i13 = i11 - i7;
                    System.arraycopy(iArr, i12, iArr, i7, i13);
                    Object[] objArr2 = this.f1992l;
                    System.arraycopy(objArr2, i12 << 1, objArr2, i8, i13 << 1);
                }
                Object[] objArr3 = this.f1992l;
                int i14 = i11 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                a(i9 > 8 ? i9 + (i9 >> 1) : 8);
                if (i9 != this.f1993m) {
                    throw new ConcurrentModificationException();
                }
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f1991k, 0, i7);
                    System.arraycopy(objArr, 0, this.f1992l, 0, i8);
                }
                if (i7 < i11) {
                    int i15 = i7 + 1;
                    int i16 = i11 - i7;
                    System.arraycopy(iArr, i15, this.f1991k, i7, i16);
                    System.arraycopy(objArr, i15 << 1, this.f1992l, i8, i16 << 1);
                }
            }
            i10 = i11;
        }
        if (i9 == this.f1993m) {
            this.f1993m = i10;
            return v6;
        }
        throw new ConcurrentModificationException();
    }

    public V n(int i7, V v6) {
        int i8 = (i7 << 1) + 1;
        Object[] objArr = this.f1992l;
        V v7 = (V) objArr[i8];
        objArr[i8] = v6;
        return v7;
    }

    public V o(int i7) {
        return (V) this.f1992l[(i7 << 1) + 1];
    }

    @q0
    public V put(K k7, V v6) {
        int i7;
        int f7;
        int i8 = this.f1993m;
        if (k7 == null) {
            f7 = i();
            i7 = 0;
        } else {
            int hashCode = k7.hashCode();
            i7 = hashCode;
            f7 = f(k7, hashCode);
        }
        if (f7 >= 0) {
            int i9 = (f7 << 1) + 1;
            Object[] objArr = this.f1992l;
            V v7 = (V) objArr[i9];
            objArr[i9] = v6;
            return v7;
        }
        int i10 = ~f7;
        int[] iArr = this.f1991k;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            Object[] objArr2 = this.f1992l;
            a(i11);
            if (i8 != this.f1993m) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1991k;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1992l, 0, objArr2.length);
            }
            d(iArr, objArr2, i8);
        }
        if (i10 < i8) {
            int[] iArr3 = this.f1991k;
            int i12 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i12, i8 - i10);
            Object[] objArr3 = this.f1992l;
            System.arraycopy(objArr3, i10 << 1, objArr3, i12 << 1, (this.f1993m - i10) << 1);
        }
        int i13 = this.f1993m;
        if (i8 == i13) {
            int[] iArr4 = this.f1991k;
            if (i10 < iArr4.length) {
                iArr4[i10] = i7;
                Object[] objArr4 = this.f1992l;
                int i14 = i10 << 1;
                objArr4[i14] = k7;
                objArr4[i14 + 1] = v6;
                this.f1993m = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @q0
    public V putIfAbsent(K k7, V v6) {
        V v7 = get(k7);
        return v7 == null ? put(k7, v6) : v7;
    }

    @q0
    public V remove(Object obj) {
        int g7 = g(obj);
        if (g7 >= 0) {
            return m(g7);
        }
        return null;
    }

    @q0
    public V replace(K k7, V v6) {
        int g7 = g(k7);
        if (g7 >= 0) {
            return n(g7, v6);
        }
        return null;
    }

    public int size() {
        return this.f1993m;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1993m * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f1993m; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            K k7 = k(i7);
            if (k7 != this) {
                sb.append(k7);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V o6 = o(i7);
            if (o6 != this) {
                sb.append(o6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int g7 = g(obj);
        if (g7 >= 0) {
            V o6 = o(g7);
            if (obj2 == o6 || (obj2 != null && obj2.equals(o6))) {
                m(g7);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k7, V v6, V v7) {
        int g7 = g(k7);
        if (g7 >= 0) {
            V o6 = o(g7);
            if (o6 == v6 || (v6 != null && v6.equals(o6))) {
                n(g7, v7);
                return true;
            }
            return false;
        }
        return false;
    }

    public m(int i7) {
        if (i7 == 0) {
            this.f1991k = g.f1940a;
            this.f1992l = g.f1942c;
        } else {
            a(i7);
        }
        this.f1993m = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(m<K, V> mVar) {
        this();
        if (mVar != 0) {
            l(mVar);
        }
    }
}
