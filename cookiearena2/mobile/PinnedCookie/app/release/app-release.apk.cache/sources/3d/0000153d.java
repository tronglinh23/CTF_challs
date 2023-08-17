package kotlinx.coroutines.internal;

import v3.m2;

/* loaded from: classes.dex */
public final class i0 {

    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.l<Throwable, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.l<E, m2> f12811l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ E f12812m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ e4.g f12813n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t4.l<? super E, m2> lVar, E e7, e4.g gVar) {
            super(1);
            this.f12811l = lVar;
            this.f12812m = e7;
            this.f12813n = gVar;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            b(th);
            return m2.f17815a;
        }

        public final void b(@n6.d Throwable th) {
            i0.b(this.f12811l, this.f12812m, this.f12813n);
        }
    }

    @n6.d
    public static final <E> t4.l<Throwable, m2> a(@n6.d t4.l<? super E, m2> lVar, E e7, @n6.d e4.g gVar) {
        return new a(lVar, e7, gVar);
    }

    public static final <E> void b(@n6.d t4.l<? super E, m2> lVar, E e7, @n6.d e4.g gVar) {
        d1 c7 = c(lVar, e7, null);
        if (c7 != null) {
            kotlinx.coroutines.r0.b(gVar, c7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.e
    public static final <E> d1 c(@n6.d t4.l<? super E, m2> lVar, E e7, @n6.e d1 d1Var) {
        try {
            lVar.O(e7);
        } catch (Throwable th) {
            if (d1Var == null || d1Var.getCause() == th) {
                return new d1("Exception in undelivered element handler for " + e7, th);
            }
            v3.p.a(d1Var, th);
        }
        return d1Var;
    }

    public static /* synthetic */ d1 d(t4.l lVar, Object obj, d1 d1Var, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            d1Var = null;
        }
        return c(lVar, obj, d1Var);
    }
}