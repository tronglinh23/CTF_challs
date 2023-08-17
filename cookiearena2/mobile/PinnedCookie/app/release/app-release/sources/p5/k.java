package p5;

import java.util.Iterator;
import kotlinx.coroutines.u0;
import n5.e0;
import n5.g0;
import n5.i0;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class k<T> extends e<T> {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final Iterable<kotlinx.coroutines.flow.i<T>> f14891n;

    @h4.f(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f14892o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T> f14893p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ y<T> f14894q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.i<? extends T> iVar, y<T> yVar, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f14893p = iVar;
            this.f14894q = yVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new a(this.f14893p, this.f14894q, dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f14892o;
            if (i7 == 0) {
                e1.n(obj);
                kotlinx.coroutines.flow.i<T> iVar = this.f14893p;
                y<T> yVar = this.f14894q;
                this.f14892o = 1;
                if (iVar.a(yVar, this) == h7) {
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

    public /* synthetic */ k(Iterable iterable, e4.g gVar, int i7, n5.m mVar, int i8, u4.w wVar) {
        this(iterable, (i8 & 2) != 0 ? e4.i.f8770k : gVar, (i8 & 4) != 0 ? -2 : i7, (i8 & 8) != 0 ? n5.m.SUSPEND : mVar);
    }

    @Override // p5.e
    @n6.e
    public Object g(@n6.d g0<? super T> g0Var, @n6.d e4.d<? super m2> dVar) {
        y yVar = new y(g0Var);
        Iterator<kotlinx.coroutines.flow.i<T>> it = this.f14891n.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.l.f(g0Var, null, null, new a(it.next(), yVar, null), 3, null);
        }
        return m2.f17815a;
    }

    @Override // p5.e
    @n6.d
    public e<T> i(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        return new k(this.f14891n, gVar, i7, mVar);
    }

    @Override // p5.e
    @n6.d
    public i0<T> o(@n6.d u0 u0Var) {
        return e0.e(u0Var, this.f14843k, this.f14844l, m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@n6.d Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, @n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        super(gVar, i7, mVar);
        this.f14891n = iterable;
    }
}
