package kotlinx.coroutines.flow;
/* loaded from: classes.dex */
public interface o0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final a f12358a = a.f12359a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f12359a = new a();
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final o0 f12360b = new q0();
        @n6.d

        /* renamed from: c  reason: collision with root package name */
        public static final o0 f12361c = new r0();

        public static /* synthetic */ o0 b(a aVar, long j7, long j8, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j7 = 0;
            }
            if ((i7 & 2) != 0) {
                j8 = Long.MAX_VALUE;
            }
            return aVar.a(j7, j8);
        }

        @n6.d
        public final o0 a(long j7, long j8) {
            return new s0(j7, j8);
        }

        @n6.d
        public final o0 c() {
            return f12360b;
        }

        @n6.d
        public final o0 d() {
            return f12361c;
        }
    }

    @n6.d
    i<m0> a(@n6.d t0<Integer> t0Var);
}
