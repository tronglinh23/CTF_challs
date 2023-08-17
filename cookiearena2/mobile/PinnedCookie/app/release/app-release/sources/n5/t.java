package n5;

import kotlinx.coroutines.u0;
import n5.r;
import v3.b1;
import v3.d1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class t {

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {androidx.constraintlayout.widget.e.f2192d1}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f13999o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ m0<E> f14000p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ E f14001q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(m0<? super E> m0Var, E e7, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f14000p = m0Var;
            this.f14001q = e7;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new a(this.f14000p, this.f14001q, dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f13999o;
            if (i7 == 0) {
                e1.n(obj);
                m0<E> m0Var = this.f14000p;
                E e7 = this.f14001q;
                this.f13999o = 1;
                if (m0Var.z(e7, this) == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d u0 u0Var, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends h4.o implements t4.p<u0, e4.d<? super r<? extends m2>>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f14002o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f14003p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ m0<E> f14004q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ E f14005r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(m0<? super E> m0Var, E e7, e4.d<? super b> dVar) {
            super(2, dVar);
            this.f14004q = m0Var;
            this.f14005r = e7;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            b bVar = new b(this.f14004q, this.f14005r, dVar);
            bVar.f14003p = obj;
            return bVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object b7;
            Object h7 = g4.d.h();
            int i7 = this.f14002o;
            try {
                if (i7 == 0) {
                    e1.n(obj);
                    u0 u0Var = (u0) this.f14003p;
                    m0<E> m0Var = this.f14004q;
                    E e7 = this.f14005r;
                    d1.a aVar = d1.f17778l;
                    this.f14002o = 1;
                    if (m0Var.z(e7, this) == h7) {
                        return h7;
                    }
                } else if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e1.n(obj);
                }
                b7 = d1.b(m2.f17815a);
            } catch (Throwable th) {
                d1.a aVar2 = d1.f17778l;
                b7 = d1.b(e1.a(th));
            }
            return r.b(d1.j(b7) ? r.f13994b.c(m2.f17815a) : r.f13994b.a(d1.e(b7)));
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d u0 u0Var, @n6.e e4.d<? super r<m2>> dVar) {
            return ((b) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @b1(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void a(@n6.d m0<? super E> m0Var, E e7) {
        if (r.m(m0Var.V(e7))) {
            return;
        }
        kotlinx.coroutines.k.b(null, new a(m0Var, e7, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <E> Object b(@n6.d m0<? super E> m0Var, E e7) {
        Object b7;
        Object V = m0Var.V(e7);
        if (V instanceof r.c) {
            b7 = kotlinx.coroutines.k.b(null, new b(m0Var, e7, null), 1, null);
            return ((r) b7).o();
        }
        m2 m2Var = (m2) V;
        return r.f13994b.c(m2.f17815a);
    }
}
