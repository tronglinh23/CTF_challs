package kotlinx.coroutines;
/* loaded from: classes.dex */
public enum w0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13151a;

        static {
            int[] iArr = new int[w0.values().length];
            iArr[w0.DEFAULT.ordinal()] = 1;
            iArr[w0.ATOMIC.ordinal()] = 2;
            iArr[w0.UNDISPATCHED.ordinal()] = 3;
            iArr[w0.LAZY.ordinal()] = 4;
            f13151a = iArr;
        }
    }

    @i2
    public static /* synthetic */ void i() {
    }

    @i2
    public final <T> void d(@n6.d t4.l<? super e4.d<? super T>, ? extends Object> lVar, @n6.d e4.d<? super T> dVar) {
        int i7 = a.f13151a[ordinal()];
        if (i7 == 1) {
            q5.a.d(lVar, dVar);
        } else if (i7 == 2) {
            e4.f.h(lVar, dVar);
        } else if (i7 == 3) {
            q5.b.a(lVar, dVar);
        } else if (i7 != 4) {
            throw new v3.j0();
        }
    }

    @i2
    public final <R, T> void e(@n6.d t4.p<? super R, ? super e4.d<? super T>, ? extends Object> pVar, R r6, @n6.d e4.d<? super T> dVar) {
        int i7 = a.f13151a[ordinal()];
        if (i7 == 1) {
            q5.a.f(pVar, r6, dVar, null, 4, null);
        } else if (i7 == 2) {
            e4.f.i(pVar, r6, dVar);
        } else if (i7 == 3) {
            q5.b.b(pVar, r6, dVar);
        } else if (i7 != 4) {
            throw new v3.j0();
        }
    }

    public final boolean h() {
        return this == LAZY;
    }
}
