package k5;

import java.util.concurrent.TimeUnit;
import v3.g1;
import v3.q2;

@g1(version = "1.6")
@q2(markerClass = {l.class})
/* loaded from: classes.dex */
public enum h {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final TimeUnit f11802k;

    h(TimeUnit timeUnit) {
        this.f11802k = timeUnit;
    }

    @n6.d
    public final TimeUnit d() {
        return this.f11802k;
    }
}