package kotlinx.coroutines.flow;

import java.util.List;
import v3.m2;
/* loaded from: classes.dex */
public final class y0<T> implements i0<T> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final i0<T> f12721k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final t4.p<j<? super T>, e4.d<? super m2>, Object> f12722l;

    @h4.f(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends h4.d {

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f12723n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ y0<T> f12724o;

        /* renamed from: p  reason: collision with root package name */
        public int f12725p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y0<T> y0Var, e4.d<? super a> dVar) {
            super(dVar);
            this.f12724o = y0Var;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            this.f12723n = obj;
            this.f12725p |= Integer.MIN_VALUE;
            return this.f12724o.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@n6.d i0<? extends T> i0Var, @n6.d t4.p<? super j<? super T>, ? super e4.d<? super m2>, ? extends Object> pVar) {
        this.f12721k = i0Var;
        this.f12722l = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@n6.d kotlinx.coroutines.flow.j<? super T> r6, @n6.d e4.d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.y0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.y0$a r0 = (kotlinx.coroutines.flow.y0.a) r0
            int r1 = r0.f12725p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12725p = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y0$a r0 = new kotlinx.coroutines.flow.y0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12723n
            java.lang.Object r1 = g4.d.h()
            int r2 = r0.f12725p
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            v3.e1.n(r7)
            goto L46
        L31:
            v3.e1.n(r7)
            kotlinx.coroutines.flow.i0<T> r7 = r5.f12721k
            kotlinx.coroutines.flow.x0 r2 = new kotlinx.coroutines.flow.x0
            t4.p<kotlinx.coroutines.flow.j<? super T>, e4.d<? super v3.m2>, java.lang.Object> r4 = r5.f12722l
            r2.<init>(r6, r4)
            r0.f12725p = r3
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            v3.y r6 = new v3.y
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y0.a(kotlinx.coroutines.flow.j, e4.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.i0
    @n6.d
    public List<T> b() {
        return this.f12721k.b();
    }
}
