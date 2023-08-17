package kotlinx.coroutines.flow;

import kotlinx.coroutines.d2;
import v3.m2;
@d2
/* loaded from: classes.dex */
public abstract class a<T> implements i<T>, c<T> {

    @h4.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0146a extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public Object f11978n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f11979o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ a<T> f11980p;

        /* renamed from: q  reason: collision with root package name */
        public int f11981q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0146a(a<T> aVar, e4.d<? super C0146a> dVar) {
            super(dVar);
            this.f11980p = aVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f11979o = obj;
            this.f11981q |= Integer.MIN_VALUE;
            return this.f11980p.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // kotlinx.coroutines.flow.i
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r6, @n6.d e4.d<? super v3.m2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.a.C0146a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.a.C0146a) r0
            int r1 = r0.f11981q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11981q = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f11979o
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f11981q
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f11978n
            p5.v r6 = (p5.v) r6
            v3.e1.n(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            v3.e1.n(r7)
            p5.v r7 = new p5.v
            e4.g r2 = r0.g()
            r7.<init>(r6, r2)
            r0.f11978n = r7     // Catch: java.lang.Throwable -> L55
            r0.f11981q = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.d(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.R()
            v3.m2 r6 = v3.m2.f17815a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.R()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
    }

    @n6.e
    public abstract Object d(@n6.d j<? super T> jVar, @n6.d e4.d<? super m2> dVar);
}
