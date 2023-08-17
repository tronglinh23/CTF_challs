package w0;

import android.location.Location;
import android.os.Bundle;
import d.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18069a = "mockLocation";

    /* renamed from: b  reason: collision with root package name */
    public static final String f18070b = "verticalAccuracy";

    /* renamed from: c  reason: collision with root package name */
    public static final String f18071c = "speedAccuracy";

    /* renamed from: d  reason: collision with root package name */
    public static final String f18072d = "bearingAccuracy";

    /* renamed from: e  reason: collision with root package name */
    public static final String f18073e = "androidx.core.location.extra.MSL_ALTITUDE";

    /* renamed from: f  reason: collision with root package name */
    public static final String f18074f = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    @d.q0

    /* renamed from: g  reason: collision with root package name */
    public static Method f18075g;

    @w0(17)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static long a(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    @w0(18)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static boolean a(Location location) {
            return location.isFromMockProvider();
        }
    }

    @w0(26)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @d.u
        public static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @d.u
        public static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @d.u
        public static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        @d.u
        public static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        @d.u
        public static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }

        @d.u
        public static void g(Location location, float f7) {
            location.setBearingAccuracyDegrees(f7);
        }

        @d.u
        public static void h(Location location, float f7) {
            location.setSpeedAccuracyMetersPerSecond(f7);
        }

        @d.u
        public static void i(Location location, float f7) {
            location.setVerticalAccuracyMeters(f7);
        }
    }

    public static boolean a(@d.o0 Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    public static float b(@d.o0 Location location) {
        return c.a(location);
    }

    public static long c(@d.o0 Location location) {
        return TimeUnit.NANOSECONDS.toMillis(a.a(location));
    }

    public static long d(@d.o0 Location location) {
        return a.a(location);
    }

    @d.x(from = androidx.cardview.widget.g.f1896q)
    public static float e(@d.o0 Location location) {
        g1.s.o(m(location), "The Mean Sea Level altitude accuracy of the location is not set.");
        return g(location).getFloat(f18074f);
    }

    public static double f(@d.o0 Location location) {
        g1.s.o(l(location), "The Mean Sea Level altitude of the location is not set.");
        return g(location).getDouble(f18073e);
    }

    public static Bundle g(@d.o0 Location location) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            return location.getExtras();
        }
        return extras;
    }

    public static Method h() throws NoSuchMethodException {
        if (f18075g == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f18075g = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f18075g;
    }

    public static float i(@d.o0 Location location) {
        return c.b(location);
    }

    public static float j(@d.o0 Location location) {
        return c.c(location);
    }

    public static boolean k(@d.o0 Location location) {
        return c.d(location);
    }

    public static boolean l(@d.o0 Location location) {
        return a(location, f18073e);
    }

    public static boolean m(@d.o0 Location location) {
        return a(location, f18074f);
    }

    public static boolean n(@d.o0 Location location) {
        return c.e(location);
    }

    public static boolean o(@d.o0 Location location) {
        return c.f(location);
    }

    public static boolean p(@d.o0 Location location) {
        return b.a(location);
    }

    public static void q(@d.o0 Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static void r(@d.o0 Location location) {
        q(location, f18073e);
    }

    public static void s(@d.o0 Location location) {
        q(location, f18074f);
    }

    public static void t(@d.o0 Location location, float f7) {
        c.g(location, f7);
    }

    public static void u(@d.o0 Location location, boolean z6) {
        try {
            h().invoke(location, Boolean.valueOf(z6));
        } catch (IllegalAccessException e7) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e7);
            throw illegalAccessError;
        } catch (NoSuchMethodException e8) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e8);
            throw noSuchMethodError;
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    public static void v(@d.o0 Location location, @d.x(from = 0.0d) float f7) {
        g(location).putFloat(f18074f, f7);
    }

    public static void w(@d.o0 Location location, double d7) {
        g(location).putDouble(f18073e, d7);
    }

    public static void x(@d.o0 Location location, float f7) {
        c.h(location, f7);
    }

    public static void y(@d.o0 Location location, float f7) {
        c.i(location, f7);
    }
}
