package kotlinx.coroutines.scheduling;

/* loaded from: classes.dex */
public abstract class k implements Runnable {
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public long f12998k;
    @n6.d
    @s4.e

    /* renamed from: l  reason: collision with root package name */
    public l f12999l;

    public k(long j7, @n6.d l lVar) {
        this.f12998k = j7;
        this.f12999l = lVar;
    }

    public final int a() {
        return this.f12999l.M0();
    }

    public k() {
        this(0L, o.f13010i);
    }
}