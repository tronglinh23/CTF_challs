package f5;

import java.util.Iterator;
import u4.l0;
/* loaded from: classes.dex */
public final class l<T1, T2, V> implements m<V> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T1> f9835a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final m<T2> f9836b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final t4.p<T1, T2, V> f9837c;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<V>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final Iterator<T1> f9838k;
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public final Iterator<T2> f9839l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ l<T1, T2, V> f9840m;

        public a(l<T1, T2, V> lVar) {
            this.f9840m = lVar;
            this.f9838k = lVar.f9835a.iterator();
            this.f9839l = lVar.f9836b.iterator();
        }

        @n6.d
        public final Iterator<T1> a() {
            return this.f9838k;
        }

        @n6.d
        public final Iterator<T2> b() {
            return this.f9839l;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9838k.hasNext() && this.f9839l.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.f9840m.f9837c.J(this.f9838k.next(), this.f9839l.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@n6.d m<? extends T1> mVar, @n6.d m<? extends T2> mVar2, @n6.d t4.p<? super T1, ? super T2, ? extends V> pVar) {
        l0.p(mVar, "sequence1");
        l0.p(mVar2, "sequence2");
        l0.p(pVar, "transform");
        this.f9835a = mVar;
        this.f9836b = mVar2;
        this.f9837c = pVar;
    }

    @Override // f5.m
    @n6.d
    public Iterator<V> iterator() {
        return new a(this);
    }
}
