package kotlinx.coroutines;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f13164b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f13165c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f13166d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final long f13167e = 1000000;

    /* renamed from: f  reason: collision with root package name */
    public static final long f13168f = 9223372036854L;

    /* renamed from: g  reason: collision with root package name */
    public static final long f13169g = 4611686018427387903L;
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r0 f13163a = new kotlinx.coroutines.internal.r0("REMOVED_TASK");
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r0 f13170h = new kotlinx.coroutines.internal.r0("CLOSED_EMPTY");

    public static final long c(long j7) {
        return j7 / f13167e;
    }

    public static final long d(long j7) {
        if (j7 <= 0) {
            return 0L;
        }
        if (j7 >= f13168f) {
            return Long.MAX_VALUE;
        }
        return f13167e * j7;
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }
}