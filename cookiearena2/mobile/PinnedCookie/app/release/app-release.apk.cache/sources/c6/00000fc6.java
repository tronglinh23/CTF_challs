package f5;

import java.util.Iterator;
import u4.l0;

/* loaded from: classes.dex */
public final class z<T, R> implements m<R> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f9965a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final t4.l<T, R> f9966b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<R>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final Iterator<T> f9967k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ z<T, R> f9968l;

        public a(z<T, R> zVar) {
            this.f9968l = zVar;
            this.f9967k = zVar.f9965a.iterator();
        }

        @n6.d
        public final Iterator<T> a() {
            return this.f9967k;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9967k.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f9968l.f9966b.O(this.f9967k.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@n6.d m<? extends T> mVar, @n6.d t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "sequence");
        l0.p(lVar, "transformer");
        this.f9965a = mVar;
        this.f9966b = lVar;
    }

    @n6.d
    public final <E> m<E> e(@n6.d t4.l<? super R, ? extends Iterator<? extends E>> lVar) {
        l0.p(lVar, "iterator");
        return new i(this.f9965a, this.f9966b, lVar);
    }

    @Override // f5.m
    @n6.d
    public Iterator<R> iterator() {
        return new a(this);
    }
}