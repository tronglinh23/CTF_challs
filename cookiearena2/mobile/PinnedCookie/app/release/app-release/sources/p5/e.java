package p5;

import java.util.ArrayList;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.z0;
import n5.e0;
import n5.g0;
import n5.i0;
import u4.l0;
import v3.e1;
import v3.m2;
@i2
/* loaded from: classes.dex */
public abstract class e<T> implements r<T> {
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public final e4.g f14843k;
    @s4.e

    /* renamed from: l  reason: collision with root package name */
    public final int f14844l;
    @n6.d
    @s4.e

    /* renamed from: m  reason: collision with root package name */
    public final n5.m f14845m;

    @h4.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.p<u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f14846o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f14847p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<T> f14848q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ e<T> f14849r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.j<? super T> jVar, e<T> eVar, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f14848q = jVar;
            this.f14849r = eVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f14848q, this.f14849r, dVar);
            aVar.f14847p = obj;
            return aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f14846o;
            if (i7 == 0) {
                e1.n(obj);
                u0 u0Var = (u0) this.f14847p;
                kotlinx.coroutines.flow.j<T> jVar = this.f14848q;
                i0<T> o6 = this.f14849r.o(u0Var);
                this.f14846o = 1;
                if (kotlinx.coroutines.flow.k.m0(jVar, o6, this) == h7) {
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

    @h4.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends h4.o implements t4.p<g0<? super T>, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f14850o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f14851p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ e<T> f14852q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e<T> eVar, e4.d<? super b> dVar) {
            super(2, dVar);
            this.f14852q = eVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            b bVar = new b(this.f14852q, dVar);
            bVar.f14851p = obj;
            return bVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f14850o;
            if (i7 == 0) {
                e1.n(obj);
                g0<? super T> g0Var = (g0) this.f14851p;
                e<T> eVar = this.f14852q;
                this.f14850o = 1;
                if (eVar.g(g0Var, this) == h7) {
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
        public final Object J(@n6.d g0<? super T> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((b) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    public e(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        this.f14843k = gVar;
        this.f14844l = i7;
        this.f14845m = mVar;
    }

    public static /* synthetic */ Object e(e eVar, kotlinx.coroutines.flow.j jVar, e4.d dVar) {
        Object g7 = v0.g(new a(jVar, eVar, null), dVar);
        return g7 == g4.d.h() ? g7 : m2.f17815a;
    }

    @Override // kotlinx.coroutines.flow.i
    @n6.e
    public Object a(@n6.d kotlinx.coroutines.flow.j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
        return e(this, jVar, dVar);
    }

    @Override // p5.r
    @n6.d
    public kotlinx.coroutines.flow.i<T> c(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar) {
        e4.g t6 = gVar.t(this.f14843k);
        if (mVar == n5.m.SUSPEND) {
            int i8 = this.f14844l;
            if (i8 != -3) {
                if (i7 != -3) {
                    if (i8 != -2) {
                        if (i7 != -2 && (i8 = i8 + i7) < 0) {
                            i7 = Integer.MAX_VALUE;
                        }
                    }
                }
                i7 = i8;
            }
            mVar = this.f14845m;
        }
        return (l0.g(t6, this.f14843k) && i7 == this.f14844l && mVar == this.f14845m) ? this : i(t6, i7, mVar);
    }

    @n6.e
    public String d() {
        return null;
    }

    @n6.e
    public abstract Object g(@n6.d g0<? super T> g0Var, @n6.d e4.d<? super m2> dVar);

    @n6.d
    public abstract e<T> i(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar);

    @n6.e
    public kotlinx.coroutines.flow.i<T> l() {
        return null;
    }

    @n6.d
    public final t4.p<g0<? super T>, e4.d<? super m2>, Object> m() {
        return new b(this, null);
    }

    public final int n() {
        int i7 = this.f14844l;
        if (i7 == -3) {
            return -2;
        }
        return i7;
    }

    @n6.d
    public i0<T> o(@n6.d u0 u0Var) {
        return e0.g(u0Var, this.f14843k, n(), this.f14845m, w0.ATOMIC, null, m(), 16, null);
    }

    @n6.d
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d7 = d();
        if (d7 != null) {
            arrayList.add(d7);
        }
        if (this.f14843k != e4.i.f8770k) {
            arrayList.add("context=" + this.f14843k);
        }
        if (this.f14844l != -3) {
            arrayList.add("capacity=" + this.f14844l);
        }
        if (this.f14845m != n5.m.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f14845m);
        }
        return z0.a(this) + '[' + x3.e0.h3(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
