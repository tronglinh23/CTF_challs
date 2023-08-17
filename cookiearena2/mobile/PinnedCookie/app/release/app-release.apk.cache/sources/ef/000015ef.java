package kotlinx.coroutines.sync;

import androidx.appcompat.widget.g0;
import kotlinx.coroutines.internal.r0;
import s2.t0;
import u4.i0;

/* loaded from: classes.dex */
public final class e {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f13081a = new r0("LOCK_FAIL");
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f13082b = new r0("UNLOCK_FAIL");
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f13083c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final r0 f13084d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final b f13085e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final b f13086f;

    @h4.f(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {g0.f1602o}, m = "withLock", n = {"$this$withLock", "owner", t0.f16450f}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes.dex */
    public static final class a<T> extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f13087n;

        /* renamed from: o  reason: collision with root package name */
        public Object f13088o;

        /* renamed from: p  reason: collision with root package name */
        public Object f13089p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f13090q;

        /* renamed from: r  reason: collision with root package name */
        public int f13091r;

        public a(e4.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f13090q = obj;
            this.f13091r |= Integer.MIN_VALUE;
            return e.o(null, null, null, this);
        }
    }

    static {
        r0 r0Var = new r0("LOCKED");
        f13083c = r0Var;
        r0 r0Var2 = new r0("UNLOCKED");
        f13084d = r0Var2;
        f13085e = new b(r0Var);
        f13086f = new b(r0Var2);
    }

    @n6.d
    public static final c a(boolean z6) {
        return new d(z6);
    }

    public static /* synthetic */ c b(boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        return a(z6);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void n() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object o(@n6.d kotlinx.coroutines.sync.c r4, @n6.e java.lang.Object r5, @n6.d t4.a<? extends T> r6, @n6.d e4.d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.e.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.e$a r0 = (kotlinx.coroutines.sync.e.a) r0
            int r1 = r0.f13091r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13091r = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.e$a r0 = new kotlinx.coroutines.sync.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13090q
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f13091r
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f13089p
            r6 = r4
            t4.a r6 = (t4.a) r6
            java.lang.Object r5 = r0.f13088o
            java.lang.Object r4 = r0.f13087n
            kotlinx.coroutines.sync.c r4 = (kotlinx.coroutines.sync.c) r4
            v3.e1.n(r7)
            goto L4e
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            v3.e1.n(r7)
            r0.f13087n = r4
            r0.f13088o = r5
            r0.f13089p = r6
            r0.f13091r = r3
            java.lang.Object r7 = r4.a(r5, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Object r6 = r6.n()     // Catch: java.lang.Throwable -> L5c
            u4.i0.d(r3)
            r4.b(r5)
            u4.i0.c(r3)
            return r6
        L5c:
            r6 = move-exception
            u4.i0.d(r3)
            r4.b(r5)
            u4.i0.c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.e.o(kotlinx.coroutines.sync.c, java.lang.Object, t4.a, e4.d):java.lang.Object");
    }

    public static final <T> Object p(c cVar, Object obj, t4.a<? extends T> aVar, e4.d<? super T> dVar) {
        i0.e(0);
        cVar.a(obj, dVar);
        i0.e(1);
        try {
            return aVar.n();
        } finally {
            i0.d(1);
            cVar.b(obj);
            i0.c(1);
        }
    }

    public static /* synthetic */ Object q(c cVar, Object obj, t4.a aVar, e4.d dVar, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = null;
        }
        i0.e(0);
        cVar.a(obj, dVar);
        i0.e(1);
        try {
            return aVar.n();
        } finally {
            i0.d(1);
            cVar.b(obj);
            i0.c(1);
        }
    }
}