package f5;

import java.util.Iterator;
import u4.l0;
/* loaded from: classes.dex */
public final class y<T, R> implements m<R> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f9960a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final t4.p<Integer, T, R> f9961b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<R>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final Iterator<T> f9962k;

        /* renamed from: l  reason: collision with root package name */
        public int f9963l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ y<T, R> f9964m;

        public a(y<T, R> yVar) {
            this.f9964m = yVar;
            this.f9962k = yVar.f9960a.iterator();
        }

        public final int a() {
            return this.f9963l;
        }

        @n6.d
        public final Iterator<T> b() {
            return this.f9962k;
        }

        public final void d(int i7) {
            this.f9963l = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9962k.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            t4.p pVar = this.f9964m.f9961b;
            int i7 = this.f9963l;
            this.f9963l = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            return (R) pVar.J(Integer.valueOf(i7), this.f9962k.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@n6.d m<? extends T> mVar, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(mVar, "sequence");
        l0.p(pVar, "transformer");
        this.f9960a = mVar;
        this.f9961b = pVar;
    }

    @Override // f5.m
    @n6.d
    public Iterator<R> iterator() {
        return new a(this);
    }
}
