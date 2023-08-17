package f5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.l0;

/* loaded from: classes.dex */
public final class h<T> implements m<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f9814a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9815b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final t4.l<T, Boolean> f9816c;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final Iterator<T> f9817k;

        /* renamed from: l  reason: collision with root package name */
        public int f9818l = -1;
        @n6.e

        /* renamed from: m  reason: collision with root package name */
        public T f9819m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ h<T> f9820n;

        public a(h<T> hVar) {
            this.f9820n = hVar;
            this.f9817k = hVar.f9814a.iterator();
        }

        public final void a() {
            while (this.f9817k.hasNext()) {
                T next = this.f9817k.next();
                if (((Boolean) this.f9820n.f9816c.O(next)).booleanValue() == this.f9820n.f9815b) {
                    this.f9819m = next;
                    this.f9818l = 1;
                    return;
                }
            }
            this.f9818l = 0;
        }

        @n6.d
        public final Iterator<T> b() {
            return this.f9817k;
        }

        @n6.e
        public final T d() {
            return this.f9819m;
        }

        public final int f() {
            return this.f9818l;
        }

        public final void g(@n6.e T t6) {
            this.f9819m = t6;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9818l == -1) {
                a();
            }
            return this.f9818l == 1;
        }

        public final void i(int i7) {
            this.f9818l = i7;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f9818l == -1) {
                a();
            }
            if (this.f9818l != 0) {
                T t6 = this.f9819m;
                this.f9819m = null;
                this.f9818l = -1;
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
    public h(@n6.d m<? extends T> mVar, boolean z6, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "sequence");
        l0.p(lVar, "predicate");
        this.f9814a = mVar;
        this.f9815b = z6;
        this.f9816c = lVar;
    }

    @Override // f5.m
    @n6.d
    public Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ h(m mVar, boolean z6, t4.l lVar, int i7, u4.w wVar) {
        this(mVar, (i7 & 2) != 0 ? true : z6, lVar);
    }
}