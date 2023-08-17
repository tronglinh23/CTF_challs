package f5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.l0;

/* loaded from: classes.dex */
public final class j<T> implements m<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final t4.a<T> f9827a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final t4.l<T, T> f9828b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, v4.a {
        @n6.e

        /* renamed from: k  reason: collision with root package name */
        public T f9829k;

        /* renamed from: l  reason: collision with root package name */
        public int f9830l = -2;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ j<T> f9831m;

        public a(j<T> jVar) {
            this.f9831m = jVar;
        }

        public final void a() {
            T t6;
            if (this.f9830l == -2) {
                t6 = (T) this.f9831m.f9827a.n();
            } else {
                t4.l lVar = this.f9831m.f9828b;
                T t7 = this.f9829k;
                l0.m(t7);
                t6 = (T) lVar.O(t7);
            }
            this.f9829k = t6;
            this.f9830l = t6 == null ? 0 : 1;
        }

        @n6.e
        public final T b() {
            return this.f9829k;
        }

        public final int d() {
            return this.f9830l;
        }

        public final void f(@n6.e T t6) {
            this.f9829k = t6;
        }

        public final void g(int i7) {
            this.f9830l = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9830l < 0) {
                a();
            }
            return this.f9830l == 1;
        }

        @Override // java.util.Iterator
        @n6.d
        public T next() {
            if (this.f9830l < 0) {
                a();
            }
            if (this.f9830l != 0) {
                T t6 = this.f9829k;
                l0.n(t6, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f9830l = -1;
                return t6;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@n6.d t4.a<? extends T> aVar, @n6.d t4.l<? super T, ? extends T> lVar) {
        l0.p(aVar, "getInitialValue");
        l0.p(lVar, "getNextValue");
        this.f9827a = aVar;
        this.f9828b = lVar;
    }

    @Override // f5.m
    @n6.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}