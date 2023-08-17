package k5;

import java.util.concurrent.TimeUnit;
import u4.l0;
import v3.g1;
import v3.j0;
import v3.q2;
/* loaded from: classes.dex */
public class j {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11803a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f11803a = iArr;
        }
    }

    @g1(version = "1.3")
    public static final double a(double d7, @n6.d h hVar, @n6.d h hVar2) {
        l0.p(hVar, "sourceUnit");
        l0.p(hVar2, "targetUnit");
        long convert = hVar2.d().convert(1L, hVar.d());
        return convert > 0 ? d7 * convert : d7 / hVar.d().convert(1L, hVar2.d());
    }

    @g1(version = "1.5")
    public static final long b(long j7, @n6.d h hVar, @n6.d h hVar2) {
        l0.p(hVar, "sourceUnit");
        l0.p(hVar2, "targetUnit");
        return hVar2.d().convert(j7, hVar.d());
    }

    @g1(version = "1.5")
    public static final long c(long j7, @n6.d h hVar, @n6.d h hVar2) {
        l0.p(hVar, "sourceUnit");
        l0.p(hVar2, "targetUnit");
        return hVar2.d().convert(j7, hVar.d());
    }

    @g1(version = "1.8")
    @n6.d
    @q2(markerClass = {l.class})
    public static final h d(@n6.d TimeUnit timeUnit) {
        l0.p(timeUnit, "<this>");
        switch (a.f11803a[timeUnit.ordinal()]) {
            case 1:
                return h.NANOSECONDS;
            case 2:
                return h.MICROSECONDS;
            case 3:
                return h.MILLISECONDS;
            case 4:
                return h.SECONDS;
            case 5:
                return h.MINUTES;
            case 6:
                return h.HOURS;
            case 7:
                return h.DAYS;
            default:
                throw new j0();
        }
    }

    @g1(version = "1.8")
    @n6.d
    @q2(markerClass = {l.class})
    public static final TimeUnit e(@n6.d h hVar) {
        l0.p(hVar, "<this>");
        return hVar.d();
    }
}
