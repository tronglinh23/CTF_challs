package kotlinx.coroutines;

import e4.e;
import e4.g;
/* loaded from: classes.dex */
public abstract class o0 extends e4.a implements e4.e {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final a f12924l = new a(null);

    @v3.r
    /* loaded from: classes.dex */
    public static final class a extends e4.b<e4.e, o0> {

        /* renamed from: kotlinx.coroutines.o0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0171a extends u4.n0 implements t4.l<g.b, o0> {

            /* renamed from: l  reason: collision with root package name */
            public static final C0171a f12925l = new C0171a();

            public C0171a() {
                super(1);
            }

            @Override // t4.l
            @n6.e
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final o0 O(@n6.d g.b bVar) {
                if (bVar instanceof o0) {
                    return (o0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public a() {
            super(e4.e.f8765a, C0171a.f12925l);
        }
    }

    public o0() {
        super(e4.e.f8765a);
    }

    @Override // e4.e
    @n6.d
    public final <T> e4.d<T> S(@n6.d e4.d<? super T> dVar) {
        return new kotlinx.coroutines.internal.l(this, dVar);
    }

    @Override // e4.e
    public final void U0(@n6.d e4.d<?> dVar) {
        ((kotlinx.coroutines.internal.l) dVar).w();
    }

    public abstract void V0(@n6.d e4.g gVar, @n6.d Runnable runnable);

    @i2
    public void W0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        V0(gVar, runnable);
    }

    public boolean X0(@n6.d e4.g gVar) {
        return true;
    }

    @c2
    @n6.d
    public o0 Y0(int i7) {
        kotlinx.coroutines.internal.t.a(i7);
        return new kotlinx.coroutines.internal.s(this, i7);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final o0 Z0(@n6.d o0 o0Var) {
        return o0Var;
    }

    @Override // e4.a, e4.g.b, e4.g
    @n6.d
    public e4.g a(@n6.d g.c<?> cVar) {
        return e.a.c(this, cVar);
    }

    @Override // e4.a, e4.g.b, e4.g
    @n6.e
    public <E extends g.b> E e(@n6.d g.c<E> cVar) {
        return (E) e.a.b(this, cVar);
    }

    @n6.d
    public String toString() {
        return z0.a(this) + '@' + z0.b(this);
    }
}
