package l5;

import java.time.Duration;
import k4.f;
import k5.e;
import k5.g;
import k5.l;
import s4.h;
import u4.l0;
import u4.r1;
import v3.g1;
import v3.q2;
@h(name = "DurationConversionsJDK8Kt")
@r1({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n720#2,2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34,2\n*E\n"})
/* loaded from: classes.dex */
public final class a {
    @g1(version = "1.6")
    @f
    @q2(markerClass = {l.class})
    public static final Duration a(long j7) {
        Duration ofSeconds = Duration.ofSeconds(e.P(j7), e.T(j7));
        l0.o(ofSeconds, "toJavaDuration-LRDsOJo");
        return ofSeconds;
    }

    @g1(version = "1.6")
    @f
    @q2(markerClass = {l.class})
    public static final long b(Duration duration) {
        l0.p(duration, "<this>");
        return e.h0(g.n0(duration.getSeconds(), k5.h.SECONDS), g.m0(duration.getNano(), k5.h.NANOSECONDS));
    }
}
