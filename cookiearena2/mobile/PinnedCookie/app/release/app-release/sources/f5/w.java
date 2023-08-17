package f5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.l0;
import u4.r1;
@r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes.dex */
public final class w<T> implements m<T>, e<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f9950a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9951b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public int f9952k;
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public final Iterator<T> f9953l;

        public a(w<T> wVar) {
            this.f9952k = wVar.f9951b;
            this.f9953l = wVar.f9950a.iterator();
        }

        @n6.d
        public final Iterator<T> a() {
            return this.f9953l;
        }

        public final int b() {
            return this.f9952k;
        }

        public final void d(int i7) {
            this.f9952k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9952k > 0 && this.f9953l.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i7 = this.f9952k;
            if (i7 != 0) {
                this.f9952k = i7 - 1;
                return this.f9953l.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(@n6.d m<? extends T> mVar, int i7) {
        l0.p(mVar, "sequence");
        this.f9950a = mVar;
        this.f9951b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // f5.e
    @n6.d
    public m<T> a(int i7) {
        return i7 >= this.f9951b ? this : new w(this.f9950a, i7);
    }

    @Override // f5.e
    @n6.d
    public m<T> b(int i7) {
        int i8 = this.f9951b;
        return i7 >= i8 ? s.g() : new v(this.f9950a, i7, i8);
    }

    @Override // f5.m
    @n6.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
