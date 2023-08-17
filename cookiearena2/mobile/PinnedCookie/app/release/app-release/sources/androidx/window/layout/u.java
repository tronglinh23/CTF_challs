package androidx.window.layout;

import android.app.Activity;
import u4.l0;
import v3.m2;
/* loaded from: classes.dex */
public final class u implements s {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final a f7118d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f7119e = 10;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final y f7120b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final r f7121c;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public a() {
        }
    }

    @h4.f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", "listener", "$this$flow", "listener"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class b extends h4.o implements t4.p<kotlinx.coroutines.flow.j<? super w>, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public Object f7122o;

        /* renamed from: p  reason: collision with root package name */
        public Object f7123p;

        /* renamed from: q  reason: collision with root package name */
        public int f7124q;

        /* renamed from: r  reason: collision with root package name */
        public /* synthetic */ Object f7125r;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ Activity f7127t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, e4.d<? super b> dVar) {
            super(2, dVar);
            this.f7127t = activity;
        }

        public static final void h0(n5.n nVar, w wVar) {
            l0.o(wVar, "info");
            nVar.V(wVar);
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            b bVar = new b(this.f7127t, dVar);
            bVar.f7125r = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:17:0x0064, B:21:0x0076, B:23:0x007e), top: B:35:0x0064 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0093 -> B:35:0x0064). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r9.f7124q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L39
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r9.f7123p
                n5.p r1 = (n5.p) r1
                java.lang.Object r4 = r9.f7122o
                g1.e r4 = (g1.e) r4
                java.lang.Object r5 = r9.f7125r
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                v3.e1.n(r10)     // Catch: java.lang.Throwable -> La3
                r10 = r5
                goto L63
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.f7123p
                n5.p r1 = (n5.p) r1
                java.lang.Object r4 = r9.f7122o
                g1.e r4 = (g1.e) r4
                java.lang.Object r5 = r9.f7125r
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                v3.e1.n(r10)     // Catch: java.lang.Throwable -> La3
                r6 = r5
                r5 = r9
                goto L76
            L39:
                v3.e1.n(r10)
                java.lang.Object r10 = r9.f7125r
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                n5.m r1 = n5.m.DROP_OLDEST
                r4 = 4
                r5 = 10
                r6 = 0
                n5.n r1 = n5.q.d(r5, r1, r6, r4, r6)
                androidx.window.layout.v r4 = new androidx.window.layout.v
                r4.<init>()
                androidx.window.layout.u r5 = androidx.window.layout.u.this
                androidx.window.layout.r r5 = androidx.window.layout.u.e(r5)
                android.app.Activity r6 = r9.f7127t
                b3.e r7 = new b3.e
                r7.<init>()
                r5.b(r6, r7, r4)
                n5.p r1 = r1.iterator()     // Catch: java.lang.Throwable -> La3
            L63:
                r5 = r9
            L64:
                r5.f7125r = r10     // Catch: java.lang.Throwable -> La1
                r5.f7122o = r4     // Catch: java.lang.Throwable -> La1
                r5.f7123p = r1     // Catch: java.lang.Throwable -> La1
                r5.f7124q = r3     // Catch: java.lang.Throwable -> La1
                java.lang.Object r6 = r1.b(r5)     // Catch: java.lang.Throwable -> La1
                if (r6 != r0) goto L73
                return r0
            L73:
                r8 = r6
                r6 = r10
                r10 = r8
            L76:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La1
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La1
                if (r10 == 0) goto L95
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> La1
                androidx.window.layout.w r10 = (androidx.window.layout.w) r10     // Catch: java.lang.Throwable -> La1
                r5.f7125r = r6     // Catch: java.lang.Throwable -> La1
                r5.f7122o = r4     // Catch: java.lang.Throwable -> La1
                r5.f7123p = r1     // Catch: java.lang.Throwable -> La1
                r5.f7124q = r2     // Catch: java.lang.Throwable -> La1
                java.lang.Object r10 = r6.f(r10, r5)     // Catch: java.lang.Throwable -> La1
                if (r10 != r0) goto L93
                return r0
            L93:
                r10 = r6
                goto L64
            L95:
                androidx.window.layout.u r10 = androidx.window.layout.u.this
                androidx.window.layout.r r10 = androidx.window.layout.u.e(r10)
                r10.a(r4)
                v3.m2 r10 = v3.m2.f17815a
                return r10
            La1:
                r10 = move-exception
                goto La5
            La3:
                r10 = move-exception
                r5 = r9
            La5:
                androidx.window.layout.u r0 = androidx.window.layout.u.this
                androidx.window.layout.r r0 = androidx.window.layout.u.e(r0)
                r0.a(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.u.b.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: c0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d kotlinx.coroutines.flow.j<? super w> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((b) H(jVar, dVar)).Q(m2.f17815a);
        }
    }

    public u(@n6.d y yVar, @n6.d r rVar) {
        l0.p(yVar, "windowMetricsCalculator");
        l0.p(rVar, "windowBackend");
        this.f7120b = yVar;
        this.f7121c = rVar;
    }

    @Override // androidx.window.layout.s
    @n6.d
    public kotlinx.coroutines.flow.i<w> c(@n6.d Activity activity) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        return kotlinx.coroutines.flow.k.I0(new b(activity, null));
    }
}
