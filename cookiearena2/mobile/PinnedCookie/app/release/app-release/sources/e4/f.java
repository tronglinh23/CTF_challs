package e4;

import t4.l;
import t4.p;
import u4.i0;
import u4.l0;
import u4.r1;
import v3.d1;
import v3.e1;
import v3.g1;
import v3.k0;
import v3.m2;
/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @r1({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> implements d<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ g f8767k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ l<d1<? extends T>, m2> f8768l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(g gVar, l<? super d1<? extends T>, m2> lVar) {
            this.f8767k = gVar;
            this.f8768l = lVar;
        }

        @Override // e4.d
        public void D(@n6.d Object obj) {
            this.f8768l.O(d1.a(obj));
        }

        @Override // e4.d
        @n6.d
        public g g() {
            return this.f8767k;
        }
    }

    @g1(version = "1.3")
    @k4.f
    public static final <T> d<T> a(g gVar, l<? super d1<? extends T>, m2> lVar) {
        l0.p(gVar, "context");
        l0.p(lVar, "resumeWith");
        return new a(gVar, lVar);
    }

    @g1(version = "1.3")
    @n6.d
    public static final <T> d<m2> b(@n6.d l<? super d<? super T>, ? extends Object> lVar, @n6.d d<? super T> dVar) {
        l0.p(lVar, "<this>");
        l0.p(dVar, "completion");
        return new k(g4.c.d(g4.c.b(lVar, dVar)), g4.d.h());
    }

    @g1(version = "1.3")
    @n6.d
    public static final <R, T> d<m2> c(@n6.d p<? super R, ? super d<? super T>, ? extends Object> pVar, R r6, @n6.d d<? super T> dVar) {
        l0.p(pVar, "<this>");
        l0.p(dVar, "completion");
        return new k(g4.c.d(g4.c.c(pVar, r6, dVar)), g4.d.h());
    }

    public static final g d() {
        throw new k0("Implemented as intrinsic");
    }

    @g1(version = "1.3")
    @k4.f
    public static /* synthetic */ void e() {
    }

    @g1(version = "1.3")
    @k4.f
    public static final <T> void f(d<? super T> dVar, T t6) {
        l0.p(dVar, "<this>");
        d1.a aVar = d1.f17778l;
        dVar.D(d1.b(t6));
    }

    @g1(version = "1.3")
    @k4.f
    public static final <T> void g(d<? super T> dVar, Throwable th) {
        l0.p(dVar, "<this>");
        l0.p(th, "exception");
        d1.a aVar = d1.f17778l;
        dVar.D(d1.b(e1.a(th)));
    }

    @g1(version = "1.3")
    public static final <T> void h(@n6.d l<? super d<? super T>, ? extends Object> lVar, @n6.d d<? super T> dVar) {
        l0.p(lVar, "<this>");
        l0.p(dVar, "completion");
        d d7 = g4.c.d(g4.c.b(lVar, dVar));
        d1.a aVar = d1.f17778l;
        d7.D(d1.b(m2.f17815a));
    }

    @g1(version = "1.3")
    public static final <R, T> void i(@n6.d p<? super R, ? super d<? super T>, ? extends Object> pVar, R r6, @n6.d d<? super T> dVar) {
        l0.p(pVar, "<this>");
        l0.p(dVar, "completion");
        d d7 = g4.c.d(g4.c.c(pVar, r6, dVar));
        d1.a aVar = d1.f17778l;
        d7.D(d1.b(m2.f17815a));
    }

    @g1(version = "1.3")
    @k4.f
    public static final <T> Object j(l<? super d<? super T>, m2> lVar, d<? super T> dVar) {
        i0.e(0);
        k kVar = new k(g4.c.d(dVar));
        lVar.O(kVar);
        Object a7 = kVar.a();
        if (a7 == g4.d.h()) {
            h4.h.c(dVar);
        }
        i0.e(1);
        return a7;
    }
}
