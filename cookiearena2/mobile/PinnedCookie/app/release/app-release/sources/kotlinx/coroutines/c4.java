package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class c4<T> extends kotlinx.coroutines.internal.n0<T> {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public ThreadLocal<v3.u0<e4.g, Object>> f11861n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c4(@n6.d e4.g r3, @n6.d e4.d<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.d4 r0 = kotlinx.coroutines.d4.f11868k
            e4.g$b r1 = r3.e(r0)
            if (r1 != 0) goto Ld
            e4.g r0 = r3.t(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f11861n = r0
            e4.g r4 = r4.g()
            e4.e$b r0 = e4.e.f8765a
            e4.g$b r4 = r4.e(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.o0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.w0.c(r3, r4)
            kotlinx.coroutines.internal.w0.a(r3, r4)
            r2.O1(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.c4.<init>(e4.g, e4.d):void");
    }

    @Override // kotlinx.coroutines.internal.n0, kotlinx.coroutines.a
    public void H1(@n6.e Object obj) {
        v3.u0<e4.g, Object> u0Var = this.f11861n.get();
        if (u0Var != null) {
            kotlinx.coroutines.internal.w0.a(u0Var.a(), u0Var.b());
            this.f11861n.set(null);
        }
        Object a7 = k0.a(obj, this.f12831m);
        e4.d<T> dVar = this.f12831m;
        e4.g g7 = dVar.g();
        Object c7 = kotlinx.coroutines.internal.w0.c(g7, null);
        c4<?> g8 = c7 != kotlinx.coroutines.internal.w0.f12850a ? n0.g(dVar, g7, c7) : null;
        try {
            this.f12831m.D(a7);
            v3.m2 m2Var = v3.m2.f17815a;
        } finally {
            if (g8 == null || g8.N1()) {
                kotlinx.coroutines.internal.w0.a(g7, c7);
            }
        }
    }

    public final boolean N1() {
        if (this.f11861n.get() == null) {
            return false;
        }
        this.f11861n.set(null);
        return true;
    }

    public final void O1(@n6.d e4.g gVar, @n6.e Object obj) {
        this.f11861n.set(v3.q1.a(gVar, obj));
    }
}
