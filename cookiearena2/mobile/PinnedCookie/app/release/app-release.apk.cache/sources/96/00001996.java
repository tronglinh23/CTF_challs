package r5;

import java.util.concurrent.TimeUnit;
import u4.l0;

/* loaded from: classes.dex */
public final class k {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final x5.h f15975a;

    public k(@n6.d x5.h hVar) {
        l0.p(hVar, "delegate");
        this.f15975a = hVar;
    }

    public final int a() {
        return this.f15975a.d();
    }

    public final void b() {
        this.f15975a.e();
    }

    @n6.d
    public final x5.h c() {
        return this.f15975a;
    }

    public final int d() {
        return this.f15975a.f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i7, long j7, @n6.d TimeUnit timeUnit) {
        this(new x5.h(w5.d.f18228h, i7, j7, timeUnit));
        l0.p(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}