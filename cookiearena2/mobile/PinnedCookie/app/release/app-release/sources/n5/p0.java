package n5;

import kotlinx.coroutines.e2;
import kotlinx.coroutines.e3;
import kotlinx.coroutines.m1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class p0 {

    @h4.f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, androidx.appcompat.app.h.f805t, androidx.appcompat.app.h.f806u}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    /* loaded from: classes.dex */
    public static final class a extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public long f13976n;

        /* renamed from: o  reason: collision with root package name */
        public Object f13977o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f13978p;

        /* renamed from: q  reason: collision with root package name */
        public int f13979q;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f13978p = obj;
            this.f13979q |= Integer.MIN_VALUE;
            return p0.c(0L, 0L, null, this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, androidx.constraintlayout.widget.e.N1, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    /* loaded from: classes.dex */
    public static final class b extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public long f13980n;

        /* renamed from: o  reason: collision with root package name */
        public long f13981o;

        /* renamed from: p  reason: collision with root package name */
        public Object f13982p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f13983q;

        /* renamed from: r  reason: collision with root package name */
        public int f13984r;

        public b(e4.d<? super b> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f13983q = obj;
            this.f13984r |= Integer.MIN_VALUE;
            return p0.d(0L, 0L, null, this);
        }
    }

    @h4.f(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class c extends h4.o implements t4.p<g0<? super m2>, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f13985o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f13986p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ q0 f13987q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ long f13988r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ long f13989s;

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f13990a;

            static {
                int[] iArr = new int[q0.values().length];
                iArr[q0.FIXED_PERIOD.ordinal()] = 1;
                iArr[q0.FIXED_DELAY.ordinal()] = 2;
                f13990a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q0 q0Var, long j7, long j8, e4.d<? super c> dVar) {
            super(2, dVar);
            this.f13987q = q0Var;
            this.f13988r = j7;
            this.f13989s = j8;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            c cVar = new c(this.f13987q, this.f13988r, this.f13989s, dVar);
            cVar.f13986p = obj;
            return cVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f13985o;
            if (i7 == 0) {
                e1.n(obj);
                g0 g0Var = (g0) this.f13986p;
                int i8 = a.f13990a[this.f13987q.ordinal()];
                if (i8 == 1) {
                    long j7 = this.f13988r;
                    long j8 = this.f13989s;
                    m0 m7 = g0Var.m();
                    this.f13985o = 1;
                    if (p0.d(j7, j8, m7, this) == h7) {
                        return h7;
                    }
                } else if (i8 == 2) {
                    long j9 = this.f13988r;
                    long j10 = this.f13989s;
                    m0 m8 = g0Var.m();
                    this.f13985o = 2;
                    if (p0.c(j9, j10, m8, this) == h7) {
                        return h7;
                    }
                }
            } else if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d g0<? super m2> g0Var, @n6.e e4.d<? super m2> dVar) {
            return ((c) H(g0Var, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:14:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r6, long r8, n5.m0<? super v3.m2> r10, e4.d<? super v3.m2> r11) {
        /*
            boolean r0 = r11 instanceof n5.p0.a
            if (r0 == 0) goto L13
            r0 = r11
            n5.p0$a r0 = (n5.p0.a) r0
            int r1 = r0.f13979q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13979q = r1
            goto L18
        L13:
            n5.p0$a r0 = new n5.p0$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f13978p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f13979q
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            long r6 = r0.f13976n
            java.lang.Object r8 = r0.f13977o
            n5.m0 r8 = (n5.m0) r8
            v3.e1.n(r11)
        L34:
            r10 = r8
            goto L63
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            long r6 = r0.f13976n
            java.lang.Object r8 = r0.f13977o
            n5.m0 r8 = (n5.m0) r8
            v3.e1.n(r11)
            goto L73
        L48:
            long r6 = r0.f13976n
            java.lang.Object r8 = r0.f13977o
            r10 = r8
            n5.m0 r10 = (n5.m0) r10
            v3.e1.n(r11)
            goto L63
        L53:
            v3.e1.n(r11)
            r0.f13977o = r10
            r0.f13976n = r6
            r0.f13979q = r5
            java.lang.Object r8 = kotlinx.coroutines.f1.b(r8, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            v3.m2 r8 = v3.m2.f17815a
            r0.f13977o = r10
            r0.f13976n = r6
            r0.f13979q = r4
            java.lang.Object r8 = r10.z(r8, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            r8 = r10
        L73:
            r0.f13977o = r8
            r0.f13976n = r6
            r0.f13979q = r3
            java.lang.Object r9 = kotlinx.coroutines.f1.b(r6, r0)
            if (r9 != r1) goto L34
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.p0.c(long, long, n5.m0, e4.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fc -> B:31:0x00aa). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0112 -> B:15:0x003d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(long r18, long r20, n5.m0<? super v3.m2> r22, e4.d<? super v3.m2> r23) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.p0.d(long, long, n5.m0, e4.d):java.lang.Object");
    }

    @e3
    @n6.d
    public static final i0<m2> e(long j7, long j8, @n6.d e4.g gVar, @n6.d q0 q0Var) {
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j7 + " ms").toString());
        }
        if (j8 >= 0) {
            return e0.e(e2.f11962k, m1.g().t(gVar), 0, new c(q0Var, j7, j8, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j8 + " ms").toString());
    }

    public static /* synthetic */ i0 f(long j7, long j8, e4.g gVar, q0 q0Var, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j8 = j7;
        }
        if ((i7 & 4) != 0) {
            gVar = e4.i.f8770k;
        }
        if ((i7 & 8) != 0) {
            q0Var = q0.FIXED_PERIOD;
        }
        return e(j7, j8, gVar, q0Var);
    }
}
