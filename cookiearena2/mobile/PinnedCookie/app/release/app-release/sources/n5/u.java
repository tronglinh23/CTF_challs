package n5;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.e3;
import kotlinx.coroutines.y1;
import n5.i0;
import s2.t0;
import v3.a1;
import v3.b1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class u {

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {w0.m0.f18130k}, m = "consumeEach", n = {t0.f16450f, "$this$consume$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class a<E> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f14006n;

        /* renamed from: o  reason: collision with root package name */
        public Object f14007o;

        /* renamed from: p  reason: collision with root package name */
        public Object f14008p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f14009q;

        /* renamed from: r  reason: collision with root package name */
        public int f14010r;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f14009q = obj;
            this.f14010r |= Integer.MIN_VALUE;
            return u.e(null, null, this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {129}, m = "consumeEach", n = {t0.f16450f, "channel$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class b<E> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f14011n;

        /* renamed from: o  reason: collision with root package name */
        public Object f14012o;

        /* renamed from: p  reason: collision with root package name */
        public Object f14013p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f14014q;

        /* renamed from: r  reason: collision with root package name */
        public int f14015r;

        public b(e4.d<? super b> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f14014q = obj;
            this.f14015r |= Integer.MIN_VALUE;
            return u.d(null, null, this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {148}, m = "toList", n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    /* loaded from: classes.dex */
    public static final class c<E> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f14016n;

        /* renamed from: o  reason: collision with root package name */
        public Object f14017o;

        /* renamed from: p  reason: collision with root package name */
        public Object f14018p;

        /* renamed from: q  reason: collision with root package name */
        public Object f14019q;

        /* renamed from: r  reason: collision with root package name */
        public /* synthetic */ Object f14020r;

        /* renamed from: s  reason: collision with root package name */
        public int f14021s;

        public c(e4.d<? super c> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f14020r = obj;
            this.f14021s |= Integer.MIN_VALUE;
            return s.g0(null, this);
        }
    }

    @a1
    public static final void a(@n6.d i0<?> i0Var, @n6.e Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = y1.a("Channel was consumed, consumer had failed", th);
            }
        }
        i0Var.f(r0);
    }

    @e3
    public static final <E, R> R b(@n6.d i<E> iVar, @n6.d t4.l<? super i0<? extends E>, ? extends R> lVar) {
        i0<E> B = iVar.B();
        try {
            return lVar.O(B);
        } finally {
            u4.i0.d(1);
            i0.a.b(B, null, 1, null);
            u4.i0.c(1);
        }
    }

    public static final <E, R> R c(@n6.d i0<? extends E> i0Var, @n6.d t4.l<? super i0<? extends E>, ? extends R> lVar) {
        try {
            R O = lVar.O(i0Var);
            u4.i0.d(1);
            s.b(i0Var, null);
            u4.i0.c(1);
            return O;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:26:0x0066, B:28:0x006e, B:29:0x0079), top: B:40:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:26:0x0066, B:28:0x006e, B:29:0x0079), top: B:40:0x0066 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:14:0x0038). Please submit an issue!!! */
    @kotlinx.coroutines.e3
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object d(@n6.d n5.i<E> r6, @n6.d t4.l<? super E, v3.m2> r7, @n6.d e4.d<? super v3.m2> r8) {
        /*
            boolean r0 = r8 instanceof n5.u.b
            if (r0 == 0) goto L13
            r0 = r8
            n5.u$b r0 = (n5.u.b) r0
            int r1 = r0.f14015r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14015r = r1
            goto L18
        L13:
            n5.u$b r0 = new n5.u$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14014q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14015r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r6 = r0.f14013p
            n5.p r6 = (n5.p) r6
            java.lang.Object r7 = r0.f14012o
            n5.i0 r7 = (n5.i0) r7
            java.lang.Object r2 = r0.f14011n
            t4.l r2 = (t4.l) r2
            v3.e1.n(r8)     // Catch: java.lang.Throwable -> L3b
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r1
            r1 = r5
            goto L66
        L3b:
            r6 = move-exception
            goto L8f
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            v3.e1.n(r8)
            n5.i0 r6 = r6.B()
            n5.p r8 = r6.iterator()     // Catch: java.lang.Throwable -> L8b
            r5 = r8
            r8 = r6
            r6 = r5
        L53:
            r0.f14011n = r7     // Catch: java.lang.Throwable -> L88
            r0.f14012o = r8     // Catch: java.lang.Throwable -> L88
            r0.f14013p = r6     // Catch: java.lang.Throwable -> L88
            r0.f14015r = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L88
            if (r2 != r1) goto L62
            return r1
        L62:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L85
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L79
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L85
            r7.O(r8)     // Catch: java.lang.Throwable -> L85
            r8 = r0
            r0 = r1
            r1 = r2
            goto L53
        L79:
            v3.m2 r6 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L85
            u4.i0.d(r4)
            n5.i0.a.b(r0, r3, r4, r3)
            u4.i0.c(r4)
            return r6
        L85:
            r6 = move-exception
            r7 = r0
            goto L8f
        L88:
            r6 = move-exception
            r7 = r8
            goto L8f
        L8b:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8f:
            u4.i0.d(r4)
            n5.i0.a.b(r7, r3, r4, r3)
            u4.i0.c(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.u.d(n5.i, t4.l, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:37:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:37:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please submit an issue!!! */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object e(@n6.d n5.i0<? extends E> r5, @n6.d t4.l<? super E, v3.m2> r6, @n6.d e4.d<? super v3.m2> r7) {
        /*
            boolean r0 = r7 instanceof n5.u.a
            if (r0 == 0) goto L13
            r0 = r7
            n5.u$a r0 = (n5.u.a) r0
            int r1 = r0.f14010r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14010r = r1
            goto L18
        L13:
            n5.u$a r0 = new n5.u$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14009q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14010r
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f14008p
            n5.p r5 = (n5.p) r5
            java.lang.Object r6 = r0.f14007o
            n5.i0 r6 = (n5.i0) r6
            java.lang.Object r2 = r0.f14006n
            t4.l r2 = (t4.l) r2
            v3.e1.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L7e
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            v3.e1.n(r7)
            n5.p r7 = r5.iterator()     // Catch: java.lang.Throwable -> L7a
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f14006n = r7     // Catch: java.lang.Throwable -> L35
            r0.f14007o = r6     // Catch: java.lang.Throwable -> L35
            r0.f14008p = r5     // Catch: java.lang.Throwable -> L35
            r0.f14010r = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.O(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            v3.m2 r5 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L35
            u4.i0.d(r3)
            r7 = 0
            n5.s.b(r6, r7)
            u4.i0.c(r3)
            return r5
        L7a:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7e:
            throw r5     // Catch: java.lang.Throwable -> L7f
        L7f:
            r7 = move-exception
            u4.i0.d(r3)
            n5.s.b(r6, r5)
            u4.i0.c(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.u.e(n5.i0, t4.l, e4.d):java.lang.Object");
    }

    @e3
    public static final <E> Object f(i<E> iVar, t4.l<? super E, m2> lVar, e4.d<? super m2> dVar) {
        i0<E> B = iVar.B();
        try {
            p<E> it = B.iterator();
            while (true) {
                u4.i0.e(3);
                u4.i0.e(0);
                Object b7 = it.b(null);
                u4.i0.e(1);
                if (!((Boolean) b7).booleanValue()) {
                    return m2.f17815a;
                }
                lVar.O(it.next());
            }
        } finally {
            u4.i0.d(1);
            i0.a.b(B, null, 1, null);
            u4.i0.c(1);
        }
    }

    public static final <E> Object g(i0<? extends E> i0Var, t4.l<? super E, m2> lVar, e4.d<? super m2> dVar) {
        try {
            p<? extends E> it = i0Var.iterator();
            while (true) {
                u4.i0.e(3);
                u4.i0.e(0);
                Object b7 = it.b(null);
                u4.i0.e(1);
                if (!((Boolean) b7).booleanValue()) {
                    m2 m2Var = m2.f17815a;
                    u4.i0.d(1);
                    s.b(i0Var, null);
                    u4.i0.c(1);
                    return m2Var;
                }
                lVar.O((E) it.next());
            }
        } finally {
        }
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final <E> kotlinx.coroutines.selects.d<E> h(@n6.d i0<? extends E> i0Var) {
        return (kotlinx.coroutines.selects.d<? extends E>) i0Var.K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.k(level = v3.m.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    @n6.e
    public static final <E> Object i(@n6.d i0<? extends E> i0Var, @n6.d e4.d<? super E> dVar) {
        return i0Var.U(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0067, B:27:0x006f, B:28:0x0078), top: B:43:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0067, B:27:0x006f, B:28:0x0078), top: B:43:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please submit an issue!!! */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object j(@n6.d n5.i0<? extends E> r7, @n6.d e4.d<? super java.util.List<? extends E>> r8) {
        /*
            boolean r0 = r8 instanceof n5.u.c
            if (r0 == 0) goto L13
            r0 = r8
            n5.u$c r0 = (n5.u.c) r0
            int r1 = r0.f14021s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14021s = r1
            goto L18
        L13:
            n5.u$c r0 = new n5.u$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14020r
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f14021s
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.f14019q
            n5.p r7 = (n5.p) r7
            java.lang.Object r2 = r0.f14018p
            n5.i0 r2 = (n5.i0) r2
            java.lang.Object r4 = r0.f14017o
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f14016n
            java.util.List r5 = (java.util.List) r5
            v3.e1.n(r8)     // Catch: java.lang.Throwable -> L39
            goto L67
        L39:
            r7 = move-exception
            r8 = r2
            goto L89
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            v3.e1.n(r8)
            java.util.List r8 = x3.v.i()
            n5.p r2 = r7.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = r8
            r5 = r4
            r8 = r7
            r7 = r2
        L53:
            r0.f14016n = r5     // Catch: java.lang.Throwable -> L83
            r0.f14017o = r4     // Catch: java.lang.Throwable -> L83
            r0.f14018p = r8     // Catch: java.lang.Throwable -> L83
            r0.f14019q = r7     // Catch: java.lang.Throwable -> L83
            r0.f14021s = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r7.b(r0)     // Catch: java.lang.Throwable -> L83
            if (r2 != r1) goto L64
            return r1
        L64:
            r6 = r2
            r2 = r8
            r8 = r6
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L78
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L39
            r4.add(r8)     // Catch: java.lang.Throwable -> L39
            r8 = r2
            goto L53
        L78:
            v3.m2 r7 = v3.m2.f17815a     // Catch: java.lang.Throwable -> L39
            r7 = 0
            n5.s.b(r2, r7)
            java.util.List r7 = x3.v.a(r5)
            return r7
        L83:
            r7 = move-exception
            goto L89
        L85:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L89:
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            n5.s.b(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.u.j(n5.i0, e4.d):java.lang.Object");
    }
}
