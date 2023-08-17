package kotlinx.coroutines.internal;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final int f12804a = 16;
    @n6.d

    /* renamed from: b */
    public static final r0 f12805b = new r0("CLOSED");

    public static final /* synthetic */ r0 a() {
        return f12805b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.h] */
    @n6.d
    public static final <N extends h<N>> N b(@n6.d N n7) {
        while (true) {
            Object e7 = n7.e();
            if (e7 == f12805b) {
                return n7;
            }
            ?? r02 = (h) e7;
            if (r02 != 0) {
                n7 = r02;
            } else if (n7.j()) {
                return n7;
            }
        }
    }

    public static final <S extends o0<S>> Object c(S s6, long j7, t4.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s6.o() >= j7 && !s6.g()) {
                return p0.b(s6);
            }
            Object e7 = s6.e();
            if (e7 == f12805b) {
                return p0.b(f12805b);
            }
            S s7 = (S) ((h) e7);
            if (s7 == null) {
                s7 = pVar.J(Long.valueOf(s6.o() + 1), s6);
                if (s6.m(s7)) {
                    if (s6.g()) {
                        s6.l();
                    }
                }
            }
            s6 = s7;
        }
    }

    public static /* synthetic */ void d() {
    }
}
