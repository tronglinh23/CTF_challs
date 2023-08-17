package androidx.collection;

import java.util.Iterator;
import s2.t0;
import t4.p;
import u4.l0;
import v3.m2;
import x3.s0;
/* loaded from: classes.dex */
public final class o {

    /* loaded from: classes.dex */
    public static final class a extends s0 {

        /* renamed from: k  reason: collision with root package name */
        public int f1999k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ n f2000l;

        public a(n<T> nVar) {
            this.f2000l = nVar;
        }

        @Override // x3.s0
        public int b() {
            n nVar = this.f2000l;
            int i7 = this.f1999k;
            this.f1999k = i7 + 1;
            return nVar.t(i7);
        }

        public final int d() {
            return this.f1999k;
        }

        public final void f(int i7) {
            this.f1999k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1999k < this.f2000l.E();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public int f2001k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ n f2002l;

        public b(n<T> nVar) {
            this.f2002l = nVar;
        }

        public final int a() {
            return this.f2001k;
        }

        public final void b(int i7) {
            this.f2001k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2001k < this.f2002l.E();
        }

        @Override // java.util.Iterator
        public T next() {
            n nVar = this.f2002l;
            int i7 = this.f2001k;
            this.f2001k = i7 + 1;
            return (T) nVar.F(i7);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@n6.d n<T> nVar, int i7) {
        l0.q(nVar, "receiver$0");
        return nVar.k(i7);
    }

    public static final <T> void b(@n6.d n<T> nVar, @n6.d p<? super Integer, ? super T, m2> pVar) {
        l0.q(nVar, "receiver$0");
        l0.q(pVar, t0.f16450f);
        int E = nVar.E();
        for (int i7 = 0; i7 < E; i7++) {
            pVar.J(Integer.valueOf(nVar.t(i7)), nVar.F(i7));
        }
    }

    public static final <T> T c(@n6.d n<T> nVar, int i7, T t6) {
        l0.q(nVar, "receiver$0");
        return nVar.p(i7, t6);
    }

    public static final <T> T d(@n6.d n<T> nVar, int i7, @n6.d t4.a<? extends T> aVar) {
        l0.q(nVar, "receiver$0");
        l0.q(aVar, "defaultValue");
        T o6 = nVar.o(i7);
        return o6 != null ? o6 : aVar.n();
    }

    public static final <T> int e(@n6.d n<T> nVar) {
        l0.q(nVar, "receiver$0");
        return nVar.E();
    }

    public static final <T> boolean f(@n6.d n<T> nVar) {
        l0.q(nVar, "receiver$0");
        return !nVar.s();
    }

    @n6.d
    public static final <T> s0 g(@n6.d n<T> nVar) {
        l0.q(nVar, "receiver$0");
        return new a(nVar);
    }

    @n6.d
    public static final <T> n<T> h(@n6.d n<T> nVar, @n6.d n<T> nVar2) {
        l0.q(nVar, "receiver$0");
        l0.q(nVar2, "other");
        n<T> nVar3 = new n<>(nVar.E() + nVar2.E());
        nVar3.v(nVar);
        nVar3.v(nVar2);
        return nVar3;
    }

    @v3.k(message = "Replaced with member function. Remove extension import!")
    public static final <T> boolean i(@n6.d n<T> nVar, int i7, T t6) {
        l0.q(nVar, "receiver$0");
        return nVar.y(i7, t6);
    }

    public static final <T> void j(@n6.d n<T> nVar, int i7, T t6) {
        l0.q(nVar, "receiver$0");
        nVar.u(i7, t6);
    }

    @n6.d
    public static final <T> Iterator<T> k(@n6.d n<T> nVar) {
        l0.q(nVar, "receiver$0");
        return new b(nVar);
    }
}
