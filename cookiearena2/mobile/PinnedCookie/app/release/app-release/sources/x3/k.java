package x3;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import v3.m2;
import v3.q2;
@v3.g1(version = "1.4")
@u4.r1({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,583:1\n467#1,51:586\n467#1,51:637\n37#2,2:584\n26#3:688\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:586,51\n464#1:637,51\n47#1:584,2\n562#1:688\n*E\n"})
@q2(markerClass = {v3.r.class})
/* loaded from: classes.dex */
public final class k<E> extends f<E> {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final a f18322n = new a(null);
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final Object[] f18323o = new Object[0];

    /* renamed from: p  reason: collision with root package name */
    public static final int f18324p = 2147483639;

    /* renamed from: q  reason: collision with root package name */
    public static final int f18325q = 10;

    /* renamed from: k  reason: collision with root package name */
    public int f18326k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public Object[] f18327l;

    /* renamed from: m  reason: collision with root package name */
    public int f18328m;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public final int a(int i7, int i8) {
            int i9 = i7 + (i7 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - k.f18324p > 0) {
                if (i8 > 2147483639) {
                    return Integer.MAX_VALUE;
                }
                return k.f18324p;
            }
            return i9;
        }

        public a() {
        }
    }

    public k(int i7) {
        Object[] objArr;
        if (i7 == 0) {
            objArr = f18323o;
        } else if (i7 > 0) {
            objArr = new Object[i7];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i7);
        }
        this.f18327l = objArr;
    }

    @n6.d
    public final Object[] A() {
        return toArray();
    }

    @n6.d
    public final <T> T[] B(@n6.d T[] tArr) {
        u4.l0.p(tArr, "array");
        return (T[]) toArray(tArr);
    }

    @Override // x3.f
    public int a() {
        return this.f18328m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e7) {
        f(e7);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@n6.d Collection<? extends E> collection) {
        u4.l0.p(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        k(size() + collection.size());
        g(v(this.f18326k + size()), collection);
        return true;
    }

    @Override // x3.f
    public E b(int i7) {
        c.f18278k.b(i7, size());
        if (i7 == w.G(this)) {
            return y();
        }
        if (i7 == 0) {
            return w();
        }
        int v6 = v(this.f18326k + i7);
        E e7 = (E) this.f18327l[v6];
        if (i7 < (size() >> 1)) {
            int i8 = this.f18326k;
            if (v6 >= i8) {
                Object[] objArr = this.f18327l;
                o.c1(objArr, objArr, i8 + 1, i8, v6);
            } else {
                Object[] objArr2 = this.f18327l;
                o.c1(objArr2, objArr2, 1, 0, v6);
                Object[] objArr3 = this.f18327l;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i9 = this.f18326k;
                o.c1(objArr3, objArr3, i9 + 1, i9, objArr3.length - 1);
            }
            Object[] objArr4 = this.f18327l;
            int i10 = this.f18326k;
            objArr4[i10] = null;
            this.f18326k = o(i10);
        } else {
            int v7 = v(this.f18326k + w.G(this));
            if (v6 <= v7) {
                Object[] objArr5 = this.f18327l;
                o.c1(objArr5, objArr5, v6, v6 + 1, v7 + 1);
            } else {
                Object[] objArr6 = this.f18327l;
                o.c1(objArr6, objArr6, v6, v6 + 1, objArr6.length);
                Object[] objArr7 = this.f18327l;
                objArr7[objArr7.length - 1] = objArr7[0];
                o.c1(objArr7, objArr7, 0, 1, v7 + 1);
            }
            this.f18327l[v7] = null;
        }
        this.f18328m = size() - 1;
        return e7;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int v6 = v(this.f18326k + size());
        int i7 = this.f18326k;
        if (i7 < v6) {
            o.n2(this.f18327l, null, i7, v6);
        } else if ((!isEmpty()) != false) {
            Object[] objArr = this.f18327l;
            o.n2(objArr, null, this.f18326k, objArr.length);
            o.n2(this.f18327l, null, 0, v6);
        }
        this.f18326k = 0;
        this.f18328m = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(E e7) {
        k(size() + 1);
        int j7 = j(this.f18326k);
        this.f18326k = j7;
        this.f18327l[j7] = e7;
        this.f18328m = size() + 1;
    }

    public final void f(E e7) {
        k(size() + 1);
        this.f18327l[v(this.f18326k + size())] = e7;
        this.f18328m = size() + 1;
    }

    public final void g(int i7, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f18327l.length;
        while (i7 < length && it.hasNext()) {
            this.f18327l[i7] = it.next();
            i7++;
        }
        int i8 = this.f18326k;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f18327l[i9] = it.next();
        }
        this.f18328m = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i7) {
        c.f18278k.b(i7, size());
        return (E) this.f18327l[v(this.f18326k + i7)];
    }

    public final void i(int i7) {
        Object[] objArr = new Object[i7];
        Object[] objArr2 = this.f18327l;
        o.c1(objArr2, objArr, 0, this.f18326k, objArr2.length);
        Object[] objArr3 = this.f18327l;
        int length = objArr3.length;
        int i8 = this.f18326k;
        o.c1(objArr3, objArr, length - i8, 0, i8);
        this.f18326k = 0;
        this.f18327l = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i7;
        int v6 = v(this.f18326k + size());
        int i8 = this.f18326k;
        if (i8 < v6) {
            while (i8 < v6) {
                if (u4.l0.g(obj, this.f18327l[i8])) {
                    i7 = this.f18326k;
                } else {
                    i8++;
                }
            }
            return -1;
        } else if (i8 < v6) {
            return -1;
        } else {
            int length = this.f18327l.length;
            while (true) {
                if (i8 >= length) {
                    for (int i9 = 0; i9 < v6; i9++) {
                        if (u4.l0.g(obj, this.f18327l[i9])) {
                            i8 = i9 + this.f18327l.length;
                            i7 = this.f18326k;
                        }
                    }
                    return -1;
                } else if (u4.l0.g(obj, this.f18327l[i8])) {
                    i7 = this.f18326k;
                    break;
                } else {
                    i8++;
                }
            }
        }
        return i8 - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int j(int i7) {
        return i7 == 0 ? p.Xe(this.f18327l) : i7 - 1;
    }

    public final void k(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f18327l;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f18323o) {
            this.f18327l = new Object[d5.u.u(i7, 10)];
        } else {
            i(f18322n.a(objArr.length, i7));
        }
    }

    public final boolean l(t4.l<? super E, Boolean> lVar) {
        int v6;
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty()) {
            if ((this.f18327l.length == 0 ? 1 : null) == null) {
                int v7 = v(this.f18326k + size());
                int i7 = this.f18326k;
                if (i7 < v7) {
                    v6 = i7;
                    while (i7 < v7) {
                        Object obj = this.f18327l[i7];
                        if (lVar.O(obj).booleanValue()) {
                            this.f18327l[v6] = obj;
                            v6++;
                        } else {
                            z6 = true;
                        }
                        i7++;
                    }
                    o.n2(this.f18327l, null, v6, v7);
                } else {
                    int length = this.f18327l.length;
                    boolean z7 = false;
                    int i8 = i7;
                    while (i7 < length) {
                        Object[] objArr = this.f18327l;
                        Object obj2 = objArr[i7];
                        objArr[i7] = null;
                        if (lVar.O(obj2).booleanValue()) {
                            this.f18327l[i8] = obj2;
                            i8++;
                        } else {
                            z7 = true;
                        }
                        i7++;
                    }
                    v6 = v(i8);
                    for (int i9 = 0; i9 < v7; i9++) {
                        Object[] objArr2 = this.f18327l;
                        Object obj3 = objArr2[i9];
                        objArr2[i9] = null;
                        if (lVar.O(obj3).booleanValue()) {
                            this.f18327l[v6] = obj3;
                            v6 = o(v6);
                        } else {
                            z7 = true;
                        }
                    }
                    z6 = z7;
                }
                if (z6) {
                    this.f18328m = u(v6 - this.f18326k);
                }
            }
        }
        return z6;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int Xe;
        int i7;
        int v6 = v(this.f18326k + size());
        int i8 = this.f18326k;
        if (i8 < v6) {
            Xe = v6 - 1;
            if (i8 <= Xe) {
                while (!u4.l0.g(obj, this.f18327l[Xe])) {
                    if (Xe != i8) {
                        Xe--;
                    }
                }
                i7 = this.f18326k;
                return Xe - i7;
            }
            return -1;
        }
        if (i8 > v6) {
            int i9 = v6 - 1;
            while (true) {
                if (-1 >= i9) {
                    Xe = p.Xe(this.f18327l);
                    int i10 = this.f18326k;
                    if (i10 <= Xe) {
                        while (!u4.l0.g(obj, this.f18327l[Xe])) {
                            if (Xe != i10) {
                                Xe--;
                            }
                        }
                        i7 = this.f18326k;
                    }
                } else if (u4.l0.g(obj, this.f18327l[i9])) {
                    Xe = i9 + this.f18327l.length;
                    i7 = this.f18326k;
                    break;
                } else {
                    i9--;
                }
            }
        }
        return -1;
    }

    public final E m() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f18327l[this.f18326k];
    }

    @n6.e
    public final E n() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f18327l[this.f18326k];
    }

    public final int o(int i7) {
        if (i7 == p.Xe(this.f18327l)) {
            return 0;
        }
        return i7 + 1;
    }

    @k4.f
    public final E p(int i7) {
        return (E) this.f18327l[i7];
    }

    @k4.f
    public final int q(int i7) {
        return v(this.f18326k + i7);
    }

    public final void r(@n6.d t4.p<? super Integer, ? super Object[], m2> pVar) {
        int i7;
        u4.l0.p(pVar, "structure");
        pVar.J(Integer.valueOf((isEmpty() || (i7 = this.f18326k) < v(this.f18326k + size())) ? this.f18326k : i7 - this.f18327l.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@n6.d Collection<? extends Object> collection) {
        int v6;
        u4.l0.p(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty()) {
            if ((this.f18327l.length == 0 ? 1 : null) == null) {
                int v7 = v(this.f18326k + size());
                int i7 = this.f18326k;
                if (i7 < v7) {
                    v6 = i7;
                    while (i7 < v7) {
                        Object obj = this.f18327l[i7];
                        if ((!collection.contains(obj)) == true) {
                            this.f18327l[v6] = obj;
                            v6++;
                        } else {
                            z6 = true;
                        }
                        i7++;
                    }
                    o.n2(this.f18327l, null, v6, v7);
                } else {
                    int length = this.f18327l.length;
                    boolean z7 = false;
                    int i8 = i7;
                    while (i7 < length) {
                        Object[] objArr = this.f18327l;
                        Object obj2 = objArr[i7];
                        objArr[i7] = null;
                        if ((!collection.contains(obj2)) == true) {
                            this.f18327l[i8] = obj2;
                            i8++;
                        } else {
                            z7 = true;
                        }
                        i7++;
                    }
                    v6 = v(i8);
                    for (int i9 = 0; i9 < v7; i9++) {
                        Object[] objArr2 = this.f18327l;
                        Object obj3 = objArr2[i9];
                        objArr2[i9] = null;
                        if ((!collection.contains(obj3)) == true) {
                            this.f18327l[v6] = obj3;
                            v6 = o(v6);
                        } else {
                            z7 = true;
                        }
                    }
                    z6 = z7;
                }
                if (z6) {
                    this.f18328m = u(v6 - this.f18326k);
                }
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@n6.d Collection<? extends Object> collection) {
        int v6;
        u4.l0.p(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty()) {
            if ((this.f18327l.length == 0 ? 1 : null) == null) {
                int v7 = v(this.f18326k + size());
                int i7 = this.f18326k;
                if (i7 < v7) {
                    v6 = i7;
                    while (i7 < v7) {
                        Object obj = this.f18327l[i7];
                        if (collection.contains(obj)) {
                            this.f18327l[v6] = obj;
                            v6++;
                        } else {
                            z6 = true;
                        }
                        i7++;
                    }
                    o.n2(this.f18327l, null, v6, v7);
                } else {
                    int length = this.f18327l.length;
                    boolean z7 = false;
                    int i8 = i7;
                    while (i7 < length) {
                        Object[] objArr = this.f18327l;
                        Object obj2 = objArr[i7];
                        objArr[i7] = null;
                        if (collection.contains(obj2)) {
                            this.f18327l[i8] = obj2;
                            i8++;
                        } else {
                            z7 = true;
                        }
                        i7++;
                    }
                    v6 = v(i8);
                    for (int i9 = 0; i9 < v7; i9++) {
                        Object[] objArr2 = this.f18327l;
                        Object obj3 = objArr2[i9];
                        objArr2[i9] = null;
                        if (collection.contains(obj3)) {
                            this.f18327l[v6] = obj3;
                            v6 = o(v6);
                        } else {
                            z7 = true;
                        }
                    }
                    z6 = z7;
                }
                if (z6) {
                    this.f18328m = u(v6 - this.f18326k);
                }
            }
        }
        return z6;
    }

    public final E s() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f18327l[v(this.f18326k + w.G(this))];
    }

    @Override // x3.f, java.util.AbstractList, java.util.List
    public E set(int i7, E e7) {
        c.f18278k.b(i7, size());
        int v6 = v(this.f18326k + i7);
        Object[] objArr = this.f18327l;
        E e8 = (E) objArr[v6];
        objArr[v6] = e7;
        return e8;
    }

    @n6.e
    public final E t() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f18327l[v(this.f18326k + w.G(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @n6.d
    public <T> T[] toArray(@n6.d T[] tArr) {
        u4.l0.p(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) m.a(tArr, size());
        }
        int v6 = v(this.f18326k + size());
        int i7 = this.f18326k;
        if (i7 < v6) {
            o.l1(this.f18327l, tArr, 0, i7, v6, 2, null);
        } else if ((!isEmpty()) != false) {
            Object[] objArr = this.f18327l;
            o.c1(objArr, tArr, 0, this.f18326k, objArr.length);
            Object[] objArr2 = this.f18327l;
            o.c1(objArr2, tArr, objArr2.length - this.f18326k, 0, v6);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public final int u(int i7) {
        return i7 < 0 ? i7 + this.f18327l.length : i7;
    }

    public final int v(int i7) {
        Object[] objArr = this.f18327l;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    public final E w() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f18327l;
        int i7 = this.f18326k;
        E e7 = (E) objArr[i7];
        objArr[i7] = null;
        this.f18326k = o(i7);
        this.f18328m = size() - 1;
        return e7;
    }

    @n6.e
    public final E x() {
        if (isEmpty()) {
            return null;
        }
        return w();
    }

    public final E y() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int v6 = v(this.f18326k + w.G(this));
        Object[] objArr = this.f18327l;
        E e7 = (E) objArr[v6];
        objArr[v6] = null;
        this.f18328m = size() - 1;
        return e7;
    }

    @n6.e
    public final E z() {
        if (isEmpty()) {
            return null;
        }
        return y();
    }

    @Override // x3.f, java.util.AbstractList, java.util.List
    public void add(int i7, E e7) {
        c.f18278k.c(i7, size());
        if (i7 == size()) {
            f(e7);
        } else if (i7 == 0) {
            d(e7);
        } else {
            k(size() + 1);
            int v6 = v(this.f18326k + i7);
            if (i7 < ((size() + 1) >> 1)) {
                int j7 = j(v6);
                int j8 = j(this.f18326k);
                int i8 = this.f18326k;
                if (j7 >= i8) {
                    Object[] objArr = this.f18327l;
                    objArr[j8] = objArr[i8];
                    o.c1(objArr, objArr, i8, i8 + 1, j7 + 1);
                } else {
                    Object[] objArr2 = this.f18327l;
                    o.c1(objArr2, objArr2, i8 - 1, i8, objArr2.length);
                    Object[] objArr3 = this.f18327l;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    o.c1(objArr3, objArr3, 0, 1, j7 + 1);
                }
                this.f18327l[j7] = e7;
                this.f18326k = j8;
            } else {
                int v7 = v(this.f18326k + size());
                if (v6 < v7) {
                    Object[] objArr4 = this.f18327l;
                    o.c1(objArr4, objArr4, v6 + 1, v6, v7);
                } else {
                    Object[] objArr5 = this.f18327l;
                    o.c1(objArr5, objArr5, 1, 0, v7);
                    Object[] objArr6 = this.f18327l;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    o.c1(objArr6, objArr6, v6 + 1, v6, objArr6.length - 1);
                }
                this.f18327l[v6] = e7;
            }
            this.f18328m = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, @n6.d Collection<? extends E> collection) {
        u4.l0.p(collection, "elements");
        c.f18278k.c(i7, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i7 == size()) {
            return addAll(collection);
        }
        k(size() + collection.size());
        int v6 = v(this.f18326k + size());
        int v7 = v(this.f18326k + i7);
        int size = collection.size();
        if (i7 < ((size() + 1) >> 1)) {
            int i8 = this.f18326k;
            int i9 = i8 - size;
            if (v7 < i8) {
                Object[] objArr = this.f18327l;
                o.c1(objArr, objArr, i9, i8, objArr.length);
                if (size >= v7) {
                    Object[] objArr2 = this.f18327l;
                    o.c1(objArr2, objArr2, objArr2.length - size, 0, v7);
                } else {
                    Object[] objArr3 = this.f18327l;
                    o.c1(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f18327l;
                    o.c1(objArr4, objArr4, 0, size, v7);
                }
            } else if (i9 >= 0) {
                Object[] objArr5 = this.f18327l;
                o.c1(objArr5, objArr5, i9, i8, v7);
            } else {
                Object[] objArr6 = this.f18327l;
                i9 += objArr6.length;
                int i10 = v7 - i8;
                int length = objArr6.length - i9;
                if (length >= i10) {
                    o.c1(objArr6, objArr6, i9, i8, v7);
                } else {
                    o.c1(objArr6, objArr6, i9, i8, i8 + length);
                    Object[] objArr7 = this.f18327l;
                    o.c1(objArr7, objArr7, 0, this.f18326k + length, v7);
                }
            }
            this.f18326k = i9;
            g(u(v7 - size), collection);
        } else {
            int i11 = v7 + size;
            if (v7 < v6) {
                int i12 = size + v6;
                Object[] objArr8 = this.f18327l;
                if (i12 <= objArr8.length) {
                    o.c1(objArr8, objArr8, i11, v7, v6);
                } else if (i11 >= objArr8.length) {
                    o.c1(objArr8, objArr8, i11 - objArr8.length, v7, v6);
                } else {
                    int length2 = v6 - (i12 - objArr8.length);
                    o.c1(objArr8, objArr8, 0, length2, v6);
                    Object[] objArr9 = this.f18327l;
                    o.c1(objArr9, objArr9, i11, v7, length2);
                }
            } else {
                Object[] objArr10 = this.f18327l;
                o.c1(objArr10, objArr10, size, 0, v6);
                Object[] objArr11 = this.f18327l;
                if (i11 >= objArr11.length) {
                    o.c1(objArr11, objArr11, i11 - objArr11.length, v7, objArr11.length);
                } else {
                    o.c1(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f18327l;
                    o.c1(objArr12, objArr12, i11, v7, objArr12.length - size);
                }
            }
            g(v7, collection);
        }
        return true;
    }

    public k() {
        this.f18327l = f18323o;
    }

    public k(@n6.d Collection<? extends E> collection) {
        u4.l0.p(collection, "elements");
        Object[] array = collection.toArray(new Object[0]);
        this.f18327l = array;
        this.f18328m = array.length;
        if (array.length == 0) {
            this.f18327l = f18323o;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @n6.d
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
