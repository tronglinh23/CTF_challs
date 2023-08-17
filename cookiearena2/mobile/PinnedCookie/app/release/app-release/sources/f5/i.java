package f5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.l0;
/* loaded from: classes.dex */
public final class i<T, R, E> implements m<E> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f9821a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final t4.l<T, R> f9822b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final t4.l<R, Iterator<E>> f9823c;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<E>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final Iterator<T> f9824k;
        @n6.e

        /* renamed from: l  reason: collision with root package name */
        public Iterator<? extends E> f9825l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ i<T, R, E> f9826m;

        public a(i<T, R, E> iVar) {
            this.f9826m = iVar;
            this.f9824k = iVar.f9821a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a() {
            /*
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.f9825l
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = r1
                goto Lf
            Le:
                r0 = r2
            Lf:
                if (r0 == 0) goto L14
                r0 = 0
                r5.f9825l = r0
            L14:
                java.util.Iterator<? extends E> r0 = r5.f9825l
                if (r0 != 0) goto L45
                java.util.Iterator<T> r0 = r5.f9824k
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L21
                return r2
            L21:
                java.util.Iterator<T> r0 = r5.f9824k
                java.lang.Object r0 = r0.next()
                f5.i<T, R, E> r3 = r5.f9826m
                t4.l r3 = f5.i.c(r3)
                f5.i<T, R, E> r4 = r5.f9826m
                t4.l r4 = f5.i.e(r4)
                java.lang.Object r0 = r4.O(r0)
                java.lang.Object r0 = r3.O(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L14
                r5.f9825l = r0
            L45:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f5.i.a.a():boolean");
        }

        @n6.e
        public final Iterator<E> b() {
            return (Iterator<? extends E>) this.f9825l;
        }

        @n6.d
        public final Iterator<T> d() {
            return this.f9824k;
        }

        public final void f(@n6.e Iterator<? extends E> it) {
            this.f9825l = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (a()) {
                Iterator<? extends E> it = this.f9825l;
                l0.m(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@n6.d m<? extends T> mVar, @n6.d t4.l<? super T, ? extends R> lVar, @n6.d t4.l<? super R, ? extends Iterator<? extends E>> lVar2) {
        l0.p(mVar, "sequence");
        l0.p(lVar, "transformer");
        l0.p(lVar2, "iterator");
        this.f9821a = mVar;
        this.f9822b = lVar;
        this.f9823c = lVar2;
    }

    @Override // f5.m
    @n6.d
    public Iterator<E> iterator() {
        return new a(this);
    }
}
