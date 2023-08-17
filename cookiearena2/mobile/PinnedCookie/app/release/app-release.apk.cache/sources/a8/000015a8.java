package kotlinx.coroutines;

import kotlinx.coroutines.p0;

/* loaded from: classes.dex */
public final class r0 {

    /* loaded from: classes.dex */
    public static final class a extends e4.a implements p0 {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p<e4.g, Throwable, v3.m2> f12938l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t4.p<? super e4.g, ? super Throwable, v3.m2> pVar, p0.b bVar) {
            super(bVar);
            this.f12938l = pVar;
        }

        @Override // kotlinx.coroutines.p0
        public void I0(@n6.d e4.g gVar, @n6.d Throwable th) {
            this.f12938l.J(gVar, th);
        }
    }

    @n6.d
    public static final p0 a(@n6.d t4.p<? super e4.g, ? super Throwable, v3.m2> pVar) {
        return new a(pVar, p0.f12928b);
    }

    @i2
    public static final void b(@n6.d e4.g gVar, @n6.d Throwable th) {
        try {
            p0 p0Var = (p0) gVar.e(p0.f12928b);
            if (p0Var != null) {
                p0Var.I0(gVar, th);
            } else {
                q0.a(gVar, th);
            }
        } catch (Throwable th2) {
            q0.a(gVar, c(th, th2));
        }
    }

    @n6.d
    public static final Throwable c(@n6.d Throwable th, @n6.d Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        v3.p.a(runtimeException, th);
        return runtimeException;
    }
}