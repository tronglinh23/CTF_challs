package f5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.l0;
import v3.d1;
import v3.e1;
import v3.m2;

/* loaded from: classes.dex */
public final class n<T> extends o<T> implements Iterator<T>, e4.d<m2>, v4.a {

    /* renamed from: k  reason: collision with root package name */
    public int f9841k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public T f9842l;
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public Iterator<? extends T> f9843m;
    @n6.e

    /* renamed from: n  reason: collision with root package name */
    public e4.d<? super m2> f9844n;

    @Override // e4.d
    public void D(@n6.d Object obj) {
        e1.n(obj);
        this.f9841k = 4;
    }

    @Override // f5.o
    @n6.e
    public Object a(T t6, @n6.d e4.d<? super m2> dVar) {
        this.f9842l = t6;
        this.f9841k = 3;
        this.f9844n = dVar;
        Object h7 = g4.d.h();
        if (h7 == g4.d.h()) {
            h4.h.c(dVar);
        }
        return h7 == g4.d.h() ? h7 : m2.f17815a;
    }

    @Override // e4.d
    @n6.d
    public e4.g g() {
        return e4.i.f8770k;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i7 = this.f9841k;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        return true;
                    }
                    if (i7 == 4) {
                        return false;
                    }
                    throw k();
                }
                Iterator<? extends T> it = this.f9843m;
                l0.m(it);
                if (it.hasNext()) {
                    this.f9841k = 2;
                    return true;
                }
                this.f9843m = null;
            }
            this.f9841k = 5;
            e4.d<? super m2> dVar = this.f9844n;
            l0.m(dVar);
            this.f9844n = null;
            d1.a aVar = d1.f17778l;
            dVar.D(d1.b(m2.f17815a));
        }
    }

    @Override // f5.o
    @n6.e
    public Object j(@n6.d Iterator<? extends T> it, @n6.d e4.d<? super m2> dVar) {
        if (it.hasNext()) {
            this.f9843m = it;
            this.f9841k = 2;
            this.f9844n = dVar;
            Object h7 = g4.d.h();
            if (h7 == g4.d.h()) {
                h4.h.c(dVar);
            }
            return h7 == g4.d.h() ? h7 : m2.f17815a;
        }
        return m2.f17815a;
    }

    public final Throwable k() {
        int i7 = this.f9841k;
        if (i7 != 4) {
            if (i7 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f9841k);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @n6.e
    public final e4.d<m2> m() {
        return this.f9844n;
    }

    public final T n() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public T next() {
        int i7 = this.f9841k;
        if (i7 == 0 || i7 == 1) {
            return n();
        }
        if (i7 == 2) {
            this.f9841k = 1;
            Iterator<? extends T> it = this.f9843m;
            l0.m(it);
            return it.next();
        } else if (i7 == 3) {
            this.f9841k = 0;
            T t6 = this.f9842l;
            this.f9842l = null;
            return t6;
        } else {
            throw k();
        }
    }

    public final void p(@n6.e e4.d<? super m2> dVar) {
        this.f9844n = dVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}