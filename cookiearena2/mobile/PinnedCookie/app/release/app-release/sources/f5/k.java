package f5;

import java.util.Iterator;
import u4.l0;
import x3.p0;
/* loaded from: classes.dex */
public final class k<T> implements m<p0<? extends T>> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f9832a;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<p0<? extends T>>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final Iterator<T> f9833k;

        /* renamed from: l  reason: collision with root package name */
        public int f9834l;

        public a(k<T> kVar) {
            this.f9833k = kVar.f9832a.iterator();
        }

        public final int a() {
            return this.f9834l;
        }

        @n6.d
        public final Iterator<T> b() {
            return this.f9833k;
        }

        @Override // java.util.Iterator
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public p0<T> next() {
            int i7 = this.f9834l;
            this.f9834l = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            return new p0<>(i7, this.f9833k.next());
        }

        public final void f(int i7) {
            this.f9834l = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9833k.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@n6.d m<? extends T> mVar) {
        l0.p(mVar, "sequence");
        this.f9832a = mVar;
    }

    @Override // f5.m
    @n6.d
    public Iterator<p0<T>> iterator() {
        return new a(this);
    }
}
