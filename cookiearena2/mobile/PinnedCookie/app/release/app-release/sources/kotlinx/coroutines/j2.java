package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12883a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f12884b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f12885c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f12886d = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @h4.f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a<T> extends h4.o implements t4.p<u0, e4.d<? super T>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12887o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12888p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ t4.a<T> f12889q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t4.a<? extends T> aVar, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f12889q = aVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<v3.m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f12889q, dVar);
            aVar.f12888p = obj;
            return aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            g4.d.h();
            if (this.f12887o == 0) {
                v3.e1.n(obj);
                return j2.d(((u0) this.f12888p).getCoroutineContext(), this.f12889q);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d u0 u0Var, @n6.e e4.d<? super T> dVar) {
            return ((a) H(u0Var, dVar)).Q(v3.m2.f17815a);
        }
    }

    @n6.e
    public static final <T> Object b(@n6.d e4.g gVar, @n6.d t4.a<? extends T> aVar, @n6.d e4.d<? super T> dVar) {
        return j.h(gVar, new a(aVar, null), dVar);
    }

    public static /* synthetic */ Object c(e4.g gVar, t4.a aVar, e4.d dVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            gVar = e4.i.f8770k;
        }
        return b(gVar, aVar, dVar);
    }

    public static final <T> T d(e4.g gVar, t4.a<? extends T> aVar) {
        try {
            x3 x3Var = new x3(r2.B(gVar));
            x3Var.g();
            T n7 = aVar.n();
            x3Var.b();
            return n7;
        } catch (InterruptedException e7) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e7);
        }
    }
}
