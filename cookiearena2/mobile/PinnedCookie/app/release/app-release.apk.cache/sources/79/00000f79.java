package f5;

import java.util.Iterator;
import u4.l0;
import u4.r1;

@r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes.dex */
public final class d<T> implements m<T>, e<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f9803a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9804b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final Iterator<T> f9805k;

        /* renamed from: l  reason: collision with root package name */
        public int f9806l;

        public a(d<T> dVar) {
            this.f9805k = dVar.f9803a.iterator();
            this.f9806l = dVar.f9804b;
        }

        public final void a() {
            while (this.f9806l > 0 && this.f9805k.hasNext()) {
                this.f9805k.next();
                this.f9806l--;
            }
        }

        @n6.d
        public final Iterator<T> b() {
            return this.f9805k;
        }

        public final int d() {
            return this.f9806l;
        }

        public final void f(int i7) {
            this.f9806l = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f9805k.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f9805k.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@n6.d m<? extends T> mVar, int i7) {
        l0.p(mVar, "sequence");
        this.f9803a = mVar;
        this.f9804b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // f5.e
    @n6.d
    public m<T> a(int i7) {
        int i8 = this.f9804b;
        int i9 = i8 + i7;
        return i9 < 0 ? new w(this, i7) : new v(this.f9803a, i8, i9);
    }

    @Override // f5.e
    @n6.d
    public m<T> b(int i7) {
        int i8 = this.f9804b + i7;
        return i8 < 0 ? new d(this, i7) : new d(this.f9803a, i8);
    }

    @Override // f5.m
    @n6.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}