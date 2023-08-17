package f5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.l0;

/* loaded from: classes.dex */
public final class x<T> implements m<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f9954a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final t4.l<T, Boolean> f9955b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final Iterator<T> f9956k;

        /* renamed from: l  reason: collision with root package name */
        public int f9957l = -1;
        @n6.e

        /* renamed from: m  reason: collision with root package name */
        public T f9958m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ x<T> f9959n;

        public a(x<T> xVar) {
            this.f9959n = xVar;
            this.f9956k = xVar.f9954a.iterator();
        }

        public final void a() {
            if (this.f9956k.hasNext()) {
                T next = this.f9956k.next();
                if (((Boolean) this.f9959n.f9955b.O(next)).booleanValue()) {
                    this.f9957l = 1;
                    this.f9958m = next;
                    return;
                }
            }
            this.f9957l = 0;
        }

        @n6.d
        public final Iterator<T> b() {
            return this.f9956k;
        }

        @n6.e
        public final T d() {
            return this.f9958m;
        }

        public final int f() {
            return this.f9957l;
        }

        public final void g(@n6.e T t6) {
            this.f9958m = t6;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9957l == -1) {
                a();
            }
            return this.f9957l == 1;
        }

        public final void i(int i7) {
            this.f9957l = i7;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f9957l == -1) {
                a();
            }
            if (this.f9957l != 0) {
                T t6 = this.f9958m;
                this.f9958m = null;
                this.f9957l = -1;
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
    public x(@n6.d m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "sequence");
        l0.p(lVar, "predicate");
        this.f9954a = mVar;
        this.f9955b = lVar;
    }

    @Override // f5.m
    @n6.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}