package androidx.collection;

import d.o0;
import d.q0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class c<E> implements Collection<E>, Set<E> {

    /* renamed from: o  reason: collision with root package name */
    public static final boolean f1917o = false;

    /* renamed from: p  reason: collision with root package name */
    public static final String f1918p = "ArraySet";

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f1919q = new int[0];

    /* renamed from: r  reason: collision with root package name */
    public static final Object[] f1920r = new Object[0];

    /* renamed from: s  reason: collision with root package name */
    public static final int f1921s = 4;

    /* renamed from: t  reason: collision with root package name */
    public static final int f1922t = 10;
    @q0

    /* renamed from: u  reason: collision with root package name */
    public static Object[] f1923u;

    /* renamed from: v  reason: collision with root package name */
    public static int f1924v;
    @q0

    /* renamed from: w  reason: collision with root package name */
    public static Object[] f1925w;

    /* renamed from: x  reason: collision with root package name */
    public static int f1926x;

    /* renamed from: k  reason: collision with root package name */
    public int[] f1927k;

    /* renamed from: l  reason: collision with root package name */
    public Object[] f1928l;

    /* renamed from: m  reason: collision with root package name */
    public int f1929m;

    /* renamed from: n  reason: collision with root package name */
    public l<E, E> f1930n;

    /* loaded from: classes.dex */
    public class a extends l<E, E> {
        public a() {
        }

        @Override // androidx.collection.l
        public void a() {
            c.this.clear();
        }

        @Override // androidx.collection.l
        public Object b(int i7, int i8) {
            return c.this.f1928l[i7];
        }

        @Override // androidx.collection.l
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.l
        public int d() {
            return c.this.f1929m;
        }

        @Override // androidx.collection.l
        public int e(Object obj) {
            return c.this.indexOf(obj);
        }

        @Override // androidx.collection.l
        public int f(Object obj) {
            return c.this.indexOf(obj);
        }

        @Override // androidx.collection.l
        public void g(E e7, E e8) {
            c.this.add(e7);
        }

        @Override // androidx.collection.l
        public void h(int i7) {
            c.this.j(i7);
        }

        @Override // androidx.collection.l
        public E i(int i7, E e7) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public c() {
        this(0);
    }

    public static void e(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f1926x < 10) {
                    objArr[0] = f1925w;
                    objArr[1] = iArr;
                    for (int i8 = i7 - 1; i8 >= 2; i8--) {
                        objArr[i8] = null;
                    }
                    f1925w = objArr;
                    f1926x++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f1924v < 10) {
                    objArr[0] = f1923u;
                    objArr[1] = iArr;
                    for (int i9 = i7 - 1; i9 >= 2; i9--) {
                        objArr[i9] = null;
                    }
                    f1923u = objArr;
                    f1924v++;
                }
            }
        }
    }

    public void a(@o0 c<? extends E> cVar) {
        int i7 = cVar.f1929m;
        d(this.f1929m + i7);
        if (this.f1929m != 0) {
            for (int i8 = 0; i8 < i7; i8++) {
                add(cVar.k(i8));
            }
        } else if (i7 > 0) {
            System.arraycopy(cVar.f1927k, 0, this.f1927k, 0, i7);
            System.arraycopy(cVar.f1928l, 0, this.f1928l, 0, i7);
            this.f1929m = i7;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@q0 E e7) {
        int i7;
        int g7;
        if (e7 == null) {
            g7 = h();
            i7 = 0;
        } else {
            int hashCode = e7.hashCode();
            i7 = hashCode;
            g7 = g(e7, hashCode);
        }
        if (g7 >= 0) {
            return false;
        }
        int i8 = ~g7;
        int i9 = this.f1929m;
        int[] iArr = this.f1927k;
        if (i9 >= iArr.length) {
            int i10 = 8;
            if (i9 >= 8) {
                i10 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f1928l;
            b(i10);
            int[] iArr2 = this.f1927k;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1928l, 0, objArr.length);
            }
            e(iArr, objArr, this.f1929m);
        }
        int i11 = this.f1929m;
        if (i8 < i11) {
            int[] iArr3 = this.f1927k;
            int i12 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i12, i11 - i8);
            Object[] objArr2 = this.f1928l;
            System.arraycopy(objArr2, i8, objArr2, i12, this.f1929m - i8);
        }
        this.f1927k[i8] = i7;
        this.f1928l[i8] = e7;
        this.f1929m++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@o0 Collection<? extends E> collection) {
        d(this.f1929m + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= add(it.next());
        }
        return z6;
    }

    public final void b(int i7) {
        if (i7 == 8) {
            synchronized (c.class) {
                Object[] objArr = f1925w;
                if (objArr != null) {
                    this.f1928l = objArr;
                    f1925w = (Object[]) objArr[0];
                    this.f1927k = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1926x--;
                    return;
                }
            }
        } else if (i7 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f1923u;
                if (objArr2 != null) {
                    this.f1928l = objArr2;
                    f1923u = (Object[]) objArr2[0];
                    this.f1927k = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1924v--;
                    return;
                }
            }
        }
        this.f1927k = new int[i7];
        this.f1928l = new Object[i7];
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i7 = this.f1929m;
        if (i7 != 0) {
            e(this.f1927k, this.f1928l, i7);
            this.f1927k = f1919q;
            this.f1928l = f1920r;
            this.f1929m = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@q0 Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@o0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void d(int i7) {
        int[] iArr = this.f1927k;
        if (iArr.length < i7) {
            Object[] objArr = this.f1928l;
            b(i7);
            int i8 = this.f1929m;
            if (i8 > 0) {
                System.arraycopy(iArr, 0, this.f1927k, 0, i8);
                System.arraycopy(objArr, 0, this.f1928l, 0, this.f1929m);
            }
            e(iArr, objArr, this.f1929m);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f1929m; i7++) {
                try {
                    if (!set.contains(k(i7))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final l<E, E> f() {
        if (this.f1930n == null) {
            this.f1930n = new a();
        }
        return this.f1930n;
    }

    public final int g(Object obj, int i7) {
        int i8 = this.f1929m;
        if (i8 == 0) {
            return -1;
        }
        int a7 = g.a(this.f1927k, i8, i7);
        if (a7 >= 0 && !obj.equals(this.f1928l[a7])) {
            int i9 = a7 + 1;
            while (i9 < i8 && this.f1927k[i9] == i7) {
                if (obj.equals(this.f1928l[i9])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = a7 - 1; i10 >= 0 && this.f1927k[i10] == i7; i10--) {
                if (obj.equals(this.f1928l[i10])) {
                    return i10;
                }
            }
            return ~i9;
        }
        return a7;
    }

    public final int h() {
        int i7 = this.f1929m;
        if (i7 == 0) {
            return -1;
        }
        int a7 = g.a(this.f1927k, i7, 0);
        if (a7 >= 0 && this.f1928l[a7] != null) {
            int i8 = a7 + 1;
            while (i8 < i7 && this.f1927k[i8] == 0) {
                if (this.f1928l[i8] == null) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = a7 - 1; i9 >= 0 && this.f1927k[i9] == 0; i9--) {
                if (this.f1928l[i9] == null) {
                    return i9;
                }
            }
            return ~i8;
        }
        return a7;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1927k;
        int i7 = this.f1929m;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    public boolean i(@o0 c<? extends E> cVar) {
        int i7 = cVar.f1929m;
        int i8 = this.f1929m;
        for (int i9 = 0; i9 < i7; i9++) {
            remove(cVar.k(i9));
        }
        return i8 != this.f1929m;
    }

    public int indexOf(@q0 Object obj) {
        return obj == null ? h() : g(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1929m <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return f().m().iterator();
    }

    public E j(int i7) {
        Object[] objArr = this.f1928l;
        E e7 = (E) objArr[i7];
        int i8 = this.f1929m;
        if (i8 <= 1) {
            e(this.f1927k, objArr, i8);
            this.f1927k = f1919q;
            this.f1928l = f1920r;
            this.f1929m = 0;
        } else {
            int[] iArr = this.f1927k;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                int i9 = i8 - 1;
                this.f1929m = i9;
                if (i7 < i9) {
                    int i10 = i7 + 1;
                    System.arraycopy(iArr, i10, iArr, i7, i9 - i7);
                    Object[] objArr2 = this.f1928l;
                    System.arraycopy(objArr2, i10, objArr2, i7, this.f1929m - i7);
                }
                this.f1928l[this.f1929m] = null;
            } else {
                b(i8 > 8 ? i8 + (i8 >> 1) : 8);
                this.f1929m--;
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f1927k, 0, i7);
                    System.arraycopy(objArr, 0, this.f1928l, 0, i7);
                }
                int i11 = this.f1929m;
                if (i7 < i11) {
                    int i12 = i7 + 1;
                    System.arraycopy(iArr, i12, this.f1927k, i7, i11 - i7);
                    System.arraycopy(objArr, i12, this.f1928l, i7, this.f1929m - i7);
                }
            }
        }
        return e7;
    }

    @q0
    public E k(int i7) {
        return (E) this.f1928l[i7];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@q0 Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            j(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@o0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= remove(it.next());
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@o0 Collection<?> collection) {
        boolean z6 = false;
        for (int i7 = this.f1929m - 1; i7 >= 0; i7--) {
            if (!collection.contains(this.f1928l[i7])) {
                j(i7);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1929m;
    }

    @Override // java.util.Collection, java.util.Set
    @o0
    public Object[] toArray() {
        int i7 = this.f1929m;
        Object[] objArr = new Object[i7];
        System.arraycopy(this.f1928l, 0, objArr, 0, i7);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1929m * 14);
        sb.append('{');
        for (int i7 = 0; i7 < this.f1929m; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            E k7 = k(i7);
            if (k7 != this) {
                sb.append(k7);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public c(int i7) {
        if (i7 == 0) {
            this.f1927k = f1919q;
            this.f1928l = f1920r;
        } else {
            b(i7);
        }
        this.f1929m = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @o0
    public <T> T[] toArray(@o0 T[] tArr) {
        if (tArr.length < this.f1929m) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1929m));
        }
        System.arraycopy(this.f1928l, 0, tArr, 0, this.f1929m);
        int length = tArr.length;
        int i7 = this.f1929m;
        if (length > i7) {
            tArr[i7] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@q0 c<E> cVar) {
        this();
        if (cVar != 0) {
            a(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@q0 Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }
}