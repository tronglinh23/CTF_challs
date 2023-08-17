package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.v0;
import s2.t0;
import u4.i0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int f13100a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f13101b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f13102c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final r0 f13103d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final r0 f13104e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f13105f;

    @h4.f(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {85}, m = "withPermit", n = {"$this$withPermit", t0.f16450f}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class a<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f13106n;

        /* renamed from: o  reason: collision with root package name */
        public Object f13107o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f13108p;

        /* renamed from: q  reason: collision with root package name */
        public int f13109q;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f13108p = obj;
            this.f13109q |= Integer.MIN_VALUE;
            return h.q(null, null, this);
        }
    }

    static {
        int d7;
        int d8;
        d7 = v0.d("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f13100a = d7;
        f13101b = new r0("PERMIT");
        f13102c = new r0("TAKEN");
        f13103d = new r0("BROKEN");
        f13104e = new r0("CANCELLED");
        d8 = v0.d("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f13105f = d8;
    }

    @n6.d
    public static final f a(int i7, int i8) {
        return new g(i7, i8);
    }

    public static /* synthetic */ f b(int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return a(i7, i8);
    }

    public static final i j(long j7, i iVar) {
        return new i(j7, iVar, 0);
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object q(@n6.d kotlinx.coroutines.sync.f r4, @n6.d t4.a<? extends T> r5, @n6.d e4.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.h.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.sync.h$a r0 = (kotlinx.coroutines.sync.h.a) r0
            int r1 = r0.f13109q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13109q = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.h$a r0 = new kotlinx.coroutines.sync.h$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13108p
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f13109q
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f13107o
            r5 = r4
            t4.a r5 = (t4.a) r5
            java.lang.Object r4 = r0.f13106n
            kotlinx.coroutines.sync.f r4 = (kotlinx.coroutines.sync.f) r4
            v3.e1.n(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            v3.e1.n(r6)
            r0.f13106n = r4
            r0.f13107o = r5
            r0.f13109q = r3
            java.lang.Object r6 = r4.c(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Object r5 = r5.n()     // Catch: java.lang.Throwable -> L58
            u4.i0.d(r3)
            r4.a()
            u4.i0.c(r3)
            return r5
        L58:
            r5 = move-exception
            u4.i0.d(r3)
            r4.a()
            u4.i0.c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.h.q(kotlinx.coroutines.sync.f, t4.a, e4.d):java.lang.Object");
    }

    public static final <T> Object r(f fVar, t4.a<? extends T> aVar, e4.d<? super T> dVar) {
        i0.e(0);
        fVar.c(dVar);
        i0.e(1);
        try {
            return aVar.n();
        } finally {
            i0.d(1);
            fVar.a();
            i0.c(1);
        }
    }
}