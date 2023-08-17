package kotlinx.coroutines.flow;

import kotlinx.coroutines.d2;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements i<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ n5.i f12329k;

        public a(n5.i iVar) {
            this.f12329k = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @n6.e
        public Object a(@n6.d j<? super T> jVar, @n6.d e4.d<? super m2> dVar) {
            Object m02 = k.m0(jVar, this.f12329k.B(), dVar);
            return m02 == g4.d.h() ? m02 : m2.f17815a;
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    /* loaded from: classes.dex */
    public static final class b<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f12330n;

        /* renamed from: o  reason: collision with root package name */
        public Object f12331o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f12332p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f12333q;

        /* renamed from: r  reason: collision with root package name */
        public int f12334r;

        public b(e4.d<? super b> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12333q = obj;
            this.f12334r |= Integer.MIN_VALUE;
            return m.e(null, null, false, this);
        }
    }

    @n6.d
    @v3.k(level = v3.m.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> i<T> b(@n6.d n5.i<T> iVar) {
        return new a(iVar);
    }

    @n6.d
    public static final <T> i<T> c(@n6.d n5.i0<? extends T> i0Var) {
        return new e(i0Var, true, null, 0, null, 28, null);
    }

    @n6.e
    public static final <T> Object d(@n6.d j<? super T> jVar, @n6.d n5.i0<? extends T> i0Var, @n6.d e4.d<? super m2> dVar) {
        Object e7 = e(jVar, i0Var, true, dVar);
        return e7 == g4.d.h() ? e7 : m2.f17815a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:27:0x006f, B:29:0x0075, B:35:0x0084, B:36:0x0085, B:18:0x004b), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:27:0x006f, B:29:0x0075, B:35:0x0084, B:36:0x0085, B:18:0x004b), top: B:46:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0095 -> B:14:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(kotlinx.coroutines.flow.j<? super T> r6, n5.i0<? extends T> r7, boolean r8, e4.d<? super v3.m2> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.m.b
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.m$b r0 = (kotlinx.coroutines.flow.m.b) r0
            int r1 = r0.f12334r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12334r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m$b r0 = new kotlinx.coroutines.flow.m$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f12333q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12334r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            boolean r6 = r0.f12332p
            java.lang.Object r7 = r0.f12331o
            n5.i0 r7 = (n5.i0) r7
            java.lang.Object r8 = r0.f12330n
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
            v3.e1.n(r9)     // Catch: java.lang.Throwable -> L55
        L35:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L5d
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            boolean r6 = r0.f12332p
            java.lang.Object r7 = r0.f12331o
            n5.i0 r7 = (n5.i0) r7
            java.lang.Object r8 = r0.f12330n
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
            v3.e1.n(r9)     // Catch: java.lang.Throwable -> L55
            n5.r r9 = (n5.r) r9     // Catch: java.lang.Throwable -> L55
            java.lang.Object r9 = r9.o()     // Catch: java.lang.Throwable -> L55
            goto L6f
        L55:
            r8 = move-exception
            goto L9c
        L57:
            v3.e1.n(r9)
            kotlinx.coroutines.flow.k.o0(r6)
        L5d:
            r0.f12330n = r6     // Catch: java.lang.Throwable -> L98
            r0.f12331o = r7     // Catch: java.lang.Throwable -> L98
            r0.f12332p = r8     // Catch: java.lang.Throwable -> L98
            r0.f12334r = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r9 = r7.F(r0)     // Catch: java.lang.Throwable -> L98
            if (r9 != r1) goto L6c
            return r1
        L6c:
            r5 = r8
            r8 = r6
            r6 = r5
        L6f:
            boolean r2 = n5.r.k(r9)     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L85
            java.lang.Throwable r8 = n5.r.f(r9)     // Catch: java.lang.Throwable -> L55
            if (r8 != 0) goto L84
            if (r6 == 0) goto L81
            r6 = 0
            n5.s.b(r7, r6)
        L81:
            v3.m2 r6 = v3.m2.f17815a
            return r6
        L84:
            throw r8     // Catch: java.lang.Throwable -> L55
        L85:
            java.lang.Object r9 = n5.r.i(r9)     // Catch: java.lang.Throwable -> L55
            r0.f12330n = r8     // Catch: java.lang.Throwable -> L55
            r0.f12331o = r7     // Catch: java.lang.Throwable -> L55
            r0.f12332p = r6     // Catch: java.lang.Throwable -> L55
            r0.f12334r = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r9 = r8.f(r9, r0)     // Catch: java.lang.Throwable -> L55
            if (r9 != r1) goto L35
            return r1
        L98:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        L9c:
            throw r8     // Catch: java.lang.Throwable -> L9d
        L9d:
            r9 = move-exception
            if (r6 == 0) goto La3
            n5.s.b(r7, r8)
        La3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.m.e(kotlinx.coroutines.flow.j, n5.i0, boolean, e4.d):java.lang.Object");
    }

    @d2
    @n6.d
    public static final <T> n5.i0<T> f(@n6.d i<? extends T> iVar, @n6.d kotlinx.coroutines.u0 u0Var) {
        return p5.f.b(iVar).o(u0Var);
    }

    @n6.d
    public static final <T> i<T> g(@n6.d n5.i0<? extends T> i0Var) {
        return new e(i0Var, false, null, 0, null, 28, null);
    }
}
