package androidx.collection;

import java.util.Iterator;
import t4.p;
import u4.l0;
import v3.m2;
import x3.t0;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public static final class a extends t0 {

        /* renamed from: k  reason: collision with root package name */
        public int f1948k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ h f1949l;

        public a(h<T> hVar) {
            this.f1949l = hVar;
        }

        @Override // x3.t0
        public long b() {
            h hVar = this.f1949l;
            int i7 = this.f1948k;
            this.f1948k = i7 + 1;
            return hVar.t(i7);
        }

        public final int d() {
            return this.f1948k;
        }

        public final void f(int i7) {
            this.f1948k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1948k < this.f1949l.D();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public int f1950k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ h f1951l;

        public b(h<T> hVar) {
            this.f1951l = hVar;
        }

        public final int a() {
            return this.f1950k;
        }

        public final void b(int i7) {
            this.f1950k = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1950k < this.f1951l.D();
        }

        @Override // java.util.Iterator
        public T next() {
            h hVar = this.f1951l;
            int i7 = this.f1950k;
            this.f1950k = i7 + 1;
            return (T) hVar.E(i7);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@n6.d h<T> hVar, long j7) {
        l0.q(hVar, "receiver$0");
        return hVar.k(j7);
    }

    public static final <T> void b(@n6.d h<T> hVar, @n6.d p<? super Long, ? super T, m2> pVar) {
        l0.q(hVar, "receiver$0");
        l0.q(pVar, s2.t0.f16450f);
        int D = hVar.D();
        for (int i7 = 0; i7 < D; i7++) {
            pVar.J(Long.valueOf(hVar.t(i7)), hVar.E(i7));
        }
    }

    public static final <T> T c(@n6.d h<T> hVar, long j7, T t6) {
        l0.q(hVar, "receiver$0");
        return hVar.p(j7, t6);
    }

    public static final <T> T d(@n6.d h<T> hVar, long j7, @n6.d t4.a<? extends T> aVar) {
        l0.q(hVar, "receiver$0");
        l0.q(aVar, "defaultValue");
        T o6 = hVar.o(j7);
        return o6 != null ? o6 : aVar.n();
    }

    public static final <T> int e(@n6.d h<T> hVar) {
        l0.q(hVar, "receiver$0");
        return hVar.D();
    }

    public static final <T> boolean f(@n6.d h<T> hVar) {
        l0.q(hVar, "receiver$0");
        return !hVar.s();
    }

    @n6.d
    public static final <T> t0 g(@n6.d h<T> hVar) {
        l0.q(hVar, "receiver$0");
        return new a(hVar);
    }

    @n6.d
    public static final <T> h<T> h(@n6.d h<T> hVar, @n6.d h<T> hVar2) {
        l0.q(hVar, "receiver$0");
        l0.q(hVar2, "other");
        h<T> hVar3 = new h<>(hVar.D() + hVar2.D());
        hVar3.v(hVar);
        hVar3.v(hVar2);
        return hVar3;
    }

    @v3.k(message = "Replaced with member function. Remove extension import!")
    public static final <T> boolean i(@n6.d h<T> hVar, long j7, T t6) {
        l0.q(hVar, "receiver$0");
        return hVar.y(j7, t6);
    }

    public static final <T> void j(@n6.d h<T> hVar, long j7, T t6) {
        l0.q(hVar, "receiver$0");
        hVar.u(j7, t6);
    }

    @n6.d
    public static final <T> Iterator<T> k(@n6.d h<T> hVar) {
        l0.q(hVar, "receiver$0");
        return new b(hVar);
    }
}