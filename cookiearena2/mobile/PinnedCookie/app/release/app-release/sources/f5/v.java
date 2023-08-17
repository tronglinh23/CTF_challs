package f5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.l0;
import u4.r1;
@r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes.dex */
public final class v<T> implements m<T>, e<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f9944a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9945b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9946c;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final Iterator<T> f9947k;

        /* renamed from: l  reason: collision with root package name */
        public int f9948l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ v<T> f9949m;

        public a(v<T> vVar) {
            this.f9949m = vVar;
            this.f9947k = vVar.f9944a.iterator();
        }

        public final void a() {
            while (this.f9948l < this.f9949m.f9945b && this.f9947k.hasNext()) {
                this.f9947k.next();
                this.f9948l++;
            }
        }

        @n6.d
        public final Iterator<T> b() {
            return this.f9947k;
        }

        public final int d() {
            return this.f9948l;
        }

        public final void f(int i7) {
            this.f9948l = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f9948l < this.f9949m.f9946c && this.f9947k.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.f9948l < this.f9949m.f9946c) {
                this.f9948l++;
                return this.f9947k.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@n6.d m<? extends T> mVar, int i7, int i8) {
        l0.p(mVar, "sequence");
        this.f9944a = mVar;
        this.f9945b = i7;
        this.f9946c = i8;
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i7).toString());
        }
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i8).toString());
        }
        if (i8 >= i7) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i8 + " < " + i7).toString());
    }

    @Override // f5.e
    @n6.d
    public m<T> a(int i7) {
        if (i7 >= f()) {
            return this;
        }
        m<T> mVar = this.f9944a;
        int i8 = this.f9945b;
        return new v(mVar, i8, i7 + i8);
    }

    @Override // f5.e
    @n6.d
    public m<T> b(int i7) {
        return i7 >= f() ? s.g() : new v(this.f9944a, this.f9945b + i7, this.f9946c);
    }

    public final int f() {
        return this.f9946c - this.f9945b;
    }

    @Override // f5.m
    @n6.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
