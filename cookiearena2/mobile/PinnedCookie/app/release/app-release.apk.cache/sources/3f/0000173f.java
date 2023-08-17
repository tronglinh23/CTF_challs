package n5;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.i2;
import v3.b1;
import v3.e1;
import v3.m2;

/* loaded from: classes.dex */
public interface i0<E> {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: n5.i0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0191a implements kotlinx.coroutines.selects.d<E> {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ i0<E> f13938k;

            /* JADX INFO: Add missing generic type declarations: [R] */
            @h4.f(c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", f = "Channel.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: n5.i0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0192a<R> extends h4.o implements t4.p<r<? extends E>, e4.d<? super R>, Object> {

                /* renamed from: o  reason: collision with root package name */
                public int f13939o;

                /* renamed from: p  reason: collision with root package name */
                public /* synthetic */ Object f13940p;

                /* renamed from: q  reason: collision with root package name */
                public final /* synthetic */ t4.p<E, e4.d<? super R>, Object> f13941q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0192a(t4.p<? super E, ? super e4.d<? super R>, ? extends Object> pVar, e4.d<? super C0192a> dVar) {
                    super(2, dVar);
                    this.f13941q = pVar;
                }

                @Override // h4.a
                @n6.d
                public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
                    C0192a c0192a = new C0192a(this.f13941q, dVar);
                    c0192a.f13940p = obj;
                    return c0192a;
                }

                @Override // t4.p
                public /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
                    return a0(((r) obj).o(), (e4.d) obj2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // h4.a
                @n6.e
                public final Object Q(@n6.d Object obj) {
                    Object h7 = g4.d.h();
                    int i7 = this.f13939o;
                    if (i7 == 0) {
                        e1.n(obj);
                        Object o6 = ((r) this.f13940p).o();
                        Throwable f7 = r.f(o6);
                        if (f7 != null) {
                            throw f7;
                        }
                        t4.p<E, e4.d<? super R>, Object> pVar = this.f13941q;
                        Object h8 = r.h(o6);
                        this.f13939o = 1;
                        obj = pVar.J(h8, this);
                        if (obj == h7) {
                            return h7;
                        }
                    } else if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e1.n(obj);
                    }
                    return obj;
                }

                @n6.e
                public final Object a0(@n6.d Object obj, @n6.e e4.d<? super R> dVar) {
                    return ((C0192a) H(r.b(obj), dVar)).Q(m2.f17815a);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0191a(i0<? extends E> i0Var) {
                this.f13938k = i0Var;
            }

            @Override // kotlinx.coroutines.selects.d
            @i2
            public <R> void c(@n6.d kotlinx.coroutines.selects.f<? super R> fVar, @n6.d t4.p<? super E, ? super e4.d<? super R>, ? extends Object> pVar) {
                this.f13938k.J().c(fVar, new C0192a(pVar, null));
            }
        }

        @h4.f(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {354}, m = "receiveOrNull", n = {}, s = {})
        /* loaded from: classes.dex */
        public static final class b<E> extends h4.d {

            /* renamed from: n  reason: collision with root package name */
            public /* synthetic */ Object f13942n;

            /* renamed from: o  reason: collision with root package name */
            public int f13943o;

            public b(e4.d<? super b> dVar) {
                super(dVar);
            }

            @Override // h4.a
            @n6.e
            public final Object Q(@n6.d Object obj) {
                this.f13942n = obj;
                this.f13943o |= Integer.MIN_VALUE;
                return a.i(null, this);
            }
        }

        public static /* synthetic */ void b(i0 i0Var, CancellationException cancellationException, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i7 & 1) != 0) {
                cancellationException = null;
            }
            i0Var.f(cancellationException);
        }

        public static /* synthetic */ boolean c(i0 i0Var, Throwable th, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & 1) != 0) {
                    th = null;
                }
                return i0Var.b(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @n6.d
        public static <E> kotlinx.coroutines.selects.d<E> d(@n6.d i0<? extends E> i0Var) {
            return new C0191a(i0Var);
        }

        @v3.k(level = v3.m.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @b1(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @c2
        public static /* synthetic */ void f() {
        }

        @c2
        public static /* synthetic */ void g() {
        }

        @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        @n6.e
        public static <E> E h(@n6.d i0<? extends E> i0Var) {
            Object T = i0Var.T();
            if (r.m(T)) {
                return (E) r.i(T);
            }
            Throwable f7 = r.f(T);
            if (f7 == null) {
                return null;
            }
            throw kotlinx.coroutines.internal.q0.p(f7);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        @k4.h
        @v3.k(level = v3.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @v3.b1(expression = "receiveCatching().getOrNull()", imports = {}))
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static <E> java.lang.Object i(@n6.d n5.i0<? extends E> r4, @n6.d e4.d<? super E> r5) {
            /*
                boolean r0 = r5 instanceof n5.i0.a.b
                if (r0 == 0) goto L13
                r0 = r5
                n5.i0$a$b r0 = (n5.i0.a.b) r0
                int r1 = r0.f13943o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13943o = r1
                goto L18
            L13:
                n5.i0$a$b r0 = new n5.i0$a$b
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f13942n
                java.lang.Object r1 = g4.d.h()
                int r2 = r0.f13943o
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                v3.e1.n(r5)
                n5.r r5 = (n5.r) r5
                java.lang.Object r4 = r5.o()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                v3.e1.n(r5)
                r0.f13943o = r3
                java.lang.Object r4 = r4.F(r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                java.lang.Object r4 = n5.r.h(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.i0.a.i(n5.i0, e4.d):java.lang.Object");
        }
    }

    @n6.e
    Object F(@n6.d e4.d<? super r<? extends E>> dVar);

    @n6.d
    kotlinx.coroutines.selects.d<E> G();

    @n6.d
    kotlinx.coroutines.selects.d<r<E>> J();

    @n6.d
    kotlinx.coroutines.selects.d<E> K();

    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    @n6.e
    E M();

    @n6.d
    Object T();

    @k4.h
    @v3.k(level = v3.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    @n6.e
    Object U(@n6.d e4.d<? super E> dVar);

    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean b(Throwable th);

    @v3.k(level = v3.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void f(@n6.e CancellationException cancellationException);

    boolean isEmpty();

    @n6.d
    p<E> iterator();

    @n6.e
    Object n(@n6.d e4.d<? super E> dVar);

    boolean y();
}