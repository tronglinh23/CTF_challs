package f5;

import java.util.Iterator;
import u4.l0;
/* loaded from: classes.dex */
public final class f<T> implements m<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f9807a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final t4.l<T, Boolean> f9808b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final Iterator<T> f9809k;

        /* renamed from: l  reason: collision with root package name */
        public int f9810l = -1;
        @n6.e

        /* renamed from: m  reason: collision with root package name */
        public T f9811m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ f<T> f9812n;

        public a(f<T> fVar) {
            this.f9812n = fVar;
            this.f9809k = fVar.f9807a.iterator();
        }

        public final void a() {
            while (this.f9809k.hasNext()) {
                T next = this.f9809k.next();
                if (!((Boolean) this.f9812n.f9808b.O(next)).booleanValue()) {
                    this.f9811m = next;
                    this.f9810l = 1;
                    return;
                }
            }
            this.f9810l = 0;
        }

        public final int b() {
            return this.f9810l;
        }

        @n6.d
        public final Iterator<T> d() {
            return this.f9809k;
        }

        @n6.e
        public final T f() {
            return this.f9811m;
        }

        public final void g(int i7) {
            this.f9810l = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9810l == -1) {
                a();
            }
            return this.f9810l == 1 || this.f9809k.hasNext();
        }

        public final void i(@n6.e T t6) {
            this.f9811m = t6;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f9810l == -1) {
                a();
            }
            if (this.f9810l == 1) {
                T t6 = this.f9811m;
                this.f9811m = null;
                this.f9810l = 0;
                return t6;
            }
            return this.f9809k.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@n6.d m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "sequence");
        l0.p(lVar, "predicate");
        this.f9807a = mVar;
        this.f9808b = lVar;
    }

    @Override // f5.m
    @n6.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
