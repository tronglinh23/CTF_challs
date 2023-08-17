package k5;

import p0.x0;
import u4.l0;
import v3.g1;
/* loaded from: classes.dex */
public class k extends j {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11804a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f11804a = iArr;
        }
    }

    @g1(version = "1.5")
    @n6.d
    public static final h f(char c7, boolean z6) {
        if (!z6) {
            if (c7 == 'D') {
                return h.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c7);
        } else if (c7 == 'H') {
            return h.HOURS;
        } else {
            if (c7 == 'M') {
                return h.MINUTES;
            }
            if (c7 == 'S') {
                return h.SECONDS;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c7);
        }
    }

    @g1(version = "1.5")
    @n6.d
    public static final h g(@n6.d String str) {
        l0.p(str, "shortName");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals("us")) {
                                    return h.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return h.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return h.MILLISECONDS;
                        }
                    } else if (str.equals("s")) {
                        return h.SECONDS;
                    }
                } else if (str.equals(x0.f14590b)) {
                    return h.MINUTES;
                }
            } else if (str.equals("h")) {
                return h.HOURS;
            }
        } else if (str.equals(androidx.appcompat.widget.d.f1513o)) {
            return h.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }

    @g1(version = "1.3")
    @n6.d
    public static final String h(@n6.d h hVar) {
        l0.p(hVar, "<this>");
        switch (a.f11804a[hVar.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return x0.f14590b;
            case 6:
                return "h";
            case 7:
                return androidx.appcompat.widget.d.f1513o;
            default:
                throw new IllegalStateException(("Unknown unit: " + hVar).toString());
        }
    }
}
