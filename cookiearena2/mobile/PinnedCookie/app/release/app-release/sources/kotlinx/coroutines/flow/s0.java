package kotlinx.coroutines.flow;

import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class s0 implements o0 {

    /* renamed from: b  reason: collision with root package name */
    public final long f12436b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12437c;

    @h4.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: classes.dex */
    public static final class a extends h4.o implements t4.q<j<? super m0>, Integer, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12438o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12439p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ int f12440q;

        public a(e4.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // t4.q
        public /* bridge */ /* synthetic */ Object I(j<? super m0> jVar, Integer num, e4.d<? super m2> dVar) {
            return a0(jVar, num.intValue(), dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
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
                int r1 = r9.f12438o
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f12439p
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                v3.e1.n(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f12439p
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                v3.e1.n(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f12439p
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                v3.e1.n(r10)
                goto L64
            L38:
                v3.e1.n(r10)
                goto L9c
            L3c:
                v3.e1.n(r10)
                java.lang.Object r10 = r9.f12439p
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                int r10 = r9.f12440q
                if (r10 <= 0) goto L53
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.START
                r9.f12438o = r6
                java.lang.Object r10 = r1.f(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r6 = kotlinx.coroutines.flow.s0.c(r10)
                r9.f12439p = r1
                r9.f12438o = r5
                java.lang.Object r10 = kotlinx.coroutines.f1.b(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r5 = kotlinx.coroutines.flow.s0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.STOP
                r9.f12439p = r1
                r9.f12438o = r4
                java.lang.Object r10 = r1.f(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                kotlinx.coroutines.flow.s0 r10 = kotlinx.coroutines.flow.s0.this
                long r4 = kotlinx.coroutines.flow.s0.b(r10)
                r9.f12439p = r1
                r9.f12438o = r3
                java.lang.Object r10 = kotlinx.coroutines.f1.b(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                kotlinx.coroutines.flow.m0 r10 = kotlinx.coroutines.flow.m0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f12439p = r3
                r9.f12438o = r2
                java.lang.Object r10 = r1.f(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                v3.m2 r10 = v3.m2.f17815a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.s0.a.Q(java.lang.Object):java.lang.Object");
        }

        @n6.e
        public final Object a0(@n6.d j<? super m0> jVar, int i7, @n6.e e4.d<? super m2> dVar) {
            a aVar = new a(dVar);
            aVar.f12439p = jVar;
            aVar.f12440q = i7;
            return aVar.Q(m2.f17815a);
        }
    }

    @h4.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends h4.o implements t4.p<m0, e4.d<? super Boolean>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12442o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12443p;

        public b(e4.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f12443p = obj;
            return bVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            g4.d.h();
            if (this.f12442o == 0) {
                e1.n(obj);
                return h4.b.a(((m0) this.f12443p) != m0.START);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d m0 m0Var, @n6.e e4.d<? super Boolean> dVar) {
            return ((b) H(m0Var, dVar)).Q(m2.f17815a);
        }
    }

    public s0(long j7, long j8) {
        this.f12436b = j7;
        this.f12437c = j8;
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j7 + " ms) cannot be negative").toString());
        }
        if (j8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j8 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.o0
    @n6.d
    public i<m0> a(@n6.d t0<Integer> t0Var) {
        return k.g0(k.k0(k.b2(t0Var, new a(null)), new b(null)));
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f12436b == s0Var.f12436b && this.f12437c == s0Var.f12437c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f12436b) * 31) + Long.hashCode(this.f12437c);
    }

    @n6.d
    public String toString() {
        List j7 = x3.v.j(2);
        if (this.f12436b > 0) {
            j7.add("stopTimeout=" + this.f12436b + "ms");
        }
        if (this.f12437c < Long.MAX_VALUE) {
            j7.add("replayExpiration=" + this.f12437c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + x3.e0.h3(x3.v.a(j7), null, null, null, 0, null, null, 63, null) + ')';
    }
}
