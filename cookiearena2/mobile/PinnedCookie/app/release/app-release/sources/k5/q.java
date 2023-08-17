package k5;

import v3.g1;
@l
@g1(version = "1.3")
/* loaded from: classes.dex */
public final class q extends b {

    /* renamed from: c  reason: collision with root package name */
    public long f11807c;

    public q() {
        super(h.NANOSECONDS);
    }

    @Override // k5.b
    public long c() {
        return this.f11807c;
    }

    public final void d(long j7) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f11807c + k.h(b()) + " is advanced by " + ((Object) e.u0(j7)) + '.');
    }

    public final void e(long j7) {
        long j8;
        long r02 = e.r0(j7, b());
        if (r02 == Long.MIN_VALUE || r02 == Long.MAX_VALUE) {
            double o02 = this.f11807c + e.o0(j7, b());
            if (o02 > 9.223372036854776E18d || o02 < -9.223372036854776E18d) {
                d(j7);
            }
            j8 = (long) o02;
        } else {
            long j9 = this.f11807c;
            j8 = j9 + r02;
            if ((r02 ^ j9) >= 0 && (j9 ^ j8) < 0) {
                d(j7);
            }
        }
        this.f11807c = j8;
    }
}
