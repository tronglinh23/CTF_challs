package n5;

import kotlinx.coroutines.e2;
import kotlinx.coroutines.e3;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import kotlinx.coroutines.v2;
import kotlinx.coroutines.w0;
import v3.m2;
/* loaded from: classes.dex */
public final class l {

    /* loaded from: classes.dex */
    public static final class a extends e4.a implements kotlinx.coroutines.p0 {
        public a(p0.b bVar) {
            super(bVar);
        }

        @Override // kotlinx.coroutines.p0
        public void I0(@n6.d e4.g gVar, @n6.d Throwable th) {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.l<Throwable, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ i0<E> f13945l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(i0<? extends E> i0Var) {
            super(1);
            this.f13945l = i0Var;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Throwable th) {
            b(th);
            return m2.f17815a;
        }

        public final void b(@n6.e Throwable th) {
            s.b(this.f13945l, th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @h4.f(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {53, 54}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    /* loaded from: classes.dex */
    public static final class c<E> extends h4.o implements t4.p<g0<? super E>, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public Object f13946o;

        /* renamed from: p  reason: collision with root package name */
        public int f13947p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f13948q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ i0<E> f13949r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(i0<? extends E> i0Var, e4.d<? super c> dVar) {
            super(2, dVar);
            this.f13949r = i0Var;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            c cVar = new c(this.f13949r, dVar);
            cVar.f13948q = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0068 -> B:12:0x003e). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r7.f13947p
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f13946o
                n5.p r1 = (n5.p) r1
                java.lang.Object r4 = r7.f13948q
                n5.g0 r4 = (n5.g0) r4
                v3.e1.n(r8)
                r8 = r4
                goto L3d
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.f13946o
                n5.p r1 = (n5.p) r1
                java.lang.Object r4 = r7.f13948q
                n5.g0 r4 = (n5.g0) r4
                v3.e1.n(r8)
                r5 = r7
                goto L4f
            L30:
                v3.e1.n(r8)
                java.lang.Object r8 = r7.f13948q
                n5.g0 r8 = (n5.g0) r8
                n5.i0<E> r1 = r7.f13949r
                n5.p r1 = r1.iterator()
            L3d:
                r4 = r7
            L3e:
                r4.f13948q = r8
                r4.f13946o = r1
                r4.f13947p = r3
                java.lang.Object r5 = r1.b(r4)
                if (r5 != r0) goto L4b
                return r0
            L4b:
                r6 = r4
                r4 = r8
                r8 = r5
                r5 = r6
            L4f:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L6b
                java.lang.Object r8 = r1.next()
                r5.f13948q = r4
                r5.f13946o = r1
                r5.f13947p = r2
                java.lang.Object r8 = r4.z(r8, r5)
                if (r8 != r0) goto L68
                return r0
            L68:
                r8 = r4
                r4 = r5
                goto L3e
            L6b:
                v3.m2 r8 = v3.m2.f17815a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.l.c.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d g0<? super E> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((c) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    @e3
    @n6.d
    public static final <E> i<E> a(@n6.d u0 u0Var, @n6.d e4.g gVar, int i7, @n6.d w0 w0Var, @n6.e t4.l<? super Throwable, m2> lVar, @v3.b @n6.d t4.p<? super g0<? super E>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        e4.g e7 = kotlinx.coroutines.n0.e(u0Var, gVar);
        i a7 = j.a(i7);
        k c0Var = w0Var.h() ? new c0(e7, a7, pVar) : new k(e7, a7, true);
        if (lVar != null) {
            ((v2) c0Var).X(lVar);
        }
        ((kotlinx.coroutines.a) c0Var).L1(w0Var, c0Var, pVar);
        return c0Var;
    }

    @e3
    @n6.d
    public static final <E> i<E> b(@n6.d i0<? extends E> i0Var, int i7, @n6.d w0 w0Var) {
        return c(v0.m(v0.m(e2.f11962k, m1.g()), new a(kotlinx.coroutines.p0.f12928b)), null, i7, w0Var, new b(i0Var), new c(i0Var, null), 1, null);
    }

    public static /* synthetic */ i c(u0 u0Var, e4.g gVar, int i7, w0 w0Var, t4.l lVar, t4.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = e4.i.f8770k;
        }
        e4.g gVar2 = gVar;
        if ((i8 & 2) != 0) {
            i7 = 1;
        }
        int i9 = i7;
        if ((i8 & 4) != 0) {
            w0Var = w0.LAZY;
        }
        w0 w0Var2 = w0Var;
        if ((i8 & 8) != 0) {
            lVar = null;
        }
        return a(u0Var, gVar2, i9, w0Var2, lVar, pVar);
    }

    public static /* synthetic */ i d(i0 i0Var, int i7, w0 w0Var, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 1;
        }
        if ((i8 & 2) != 0) {
            w0Var = w0.LAZY;
        }
        return b(i0Var, i7, w0Var);
    }
}
