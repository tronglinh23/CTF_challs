package p5;

import kotlinx.coroutines.internal.w0;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class b0<T> implements kotlinx.coroutines.flow.j<T> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final e4.g f14836k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final Object f14837l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final t4.p<T, e4.d<? super m2>, Object> f14838m;

    @h4.f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<T, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f14839o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f14840p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<T> f14841q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.j<? super T> jVar, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f14841q = jVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f14841q, dVar);
            aVar.f14840p = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f14839o;
            if (i7 == 0) {
                e1.n(obj);
                Object obj2 = this.f14840p;
                kotlinx.coroutines.flow.j<T> jVar = this.f14841q;
                this.f14839o = 1;
                if (jVar.f(obj2, this) == h7) {
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
        public final Object J(T t6, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(t6, dVar)).Q(m2.f17815a);
        }
    }

    public b0(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.g gVar) {
        this.f14836k = gVar;
        this.f14837l = w0.b(gVar);
        this.f14838m = new a(jVar, null);
    }

    @Override // kotlinx.coroutines.flow.j
    @n6.e
    public Object f(T t6, @n6.d e4.d<? super m2> dVar) {
        Object c7 = f.c(this.f14836k, t6, this.f14837l, this.f14838m, dVar);
        return c7 == g4.d.h() ? c7 : m2.f17815a;
    }
}
