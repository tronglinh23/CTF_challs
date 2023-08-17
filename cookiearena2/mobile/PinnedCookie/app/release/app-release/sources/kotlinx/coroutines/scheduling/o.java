package kotlinx.coroutines.scheduling;

import d5.u;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.internal.v0;
/* loaded from: classes.dex */
public final class o {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final String f13002a = "DefaultDispatcher";
    @s4.e

    /* renamed from: b  reason: collision with root package name */
    public static final long f13003b;
    @s4.e

    /* renamed from: c  reason: collision with root package name */
    public static final int f13004c;
    @s4.e

    /* renamed from: d  reason: collision with root package name */
    public static final int f13005d;
    @s4.e

    /* renamed from: e  reason: collision with root package name */
    public static final long f13006e;
    @n6.d
    @s4.e

    /* renamed from: f  reason: collision with root package name */
    public static j f13007f = null;

    /* renamed from: g  reason: collision with root package name */
    public static final int f13008g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f13009h = 1;
    @n6.d
    @s4.e

    /* renamed from: i  reason: collision with root package name */
    public static final l f13010i;
    @n6.d
    @s4.e

    /* renamed from: j  reason: collision with root package name */
    public static final l f13011j;

    static {
        long e7;
        int d7;
        int d8;
        long e8;
        e7 = v0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f13003b = e7;
        d7 = v0.d("kotlinx.coroutines.scheduler.core.pool.size", u.u(t0.a(), 2), 1, 0, 8, null);
        f13004c = d7;
        d8 = v0.d("kotlinx.coroutines.scheduler.max.pool.size", a.F, 0, a.F, 4, null);
        f13005d = d8;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e8 = v0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f13006e = timeUnit.toNanos(e8);
        f13007f = h.f12992a;
        f13010i = new m(0);
        f13011j = new m(1);
    }

    public static final boolean a(@n6.d k kVar) {
        return kVar.f12999l.M0() == 1;
    }
}
