package w0;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import d.b1;
import d.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: h  reason: collision with root package name */
    public static final long f18127h = Long.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public static final int f18128i = 100;

    /* renamed from: j  reason: collision with root package name */
    public static final int f18129j = 102;

    /* renamed from: k  reason: collision with root package name */
    public static final int f18130k = 104;

    /* renamed from: l  reason: collision with root package name */
    public static final long f18131l = -1;

    /* renamed from: a  reason: collision with root package name */
    public final int f18132a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18133b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18134c;

    /* renamed from: d  reason: collision with root package name */
    public final long f18135d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18136e;

    /* renamed from: f  reason: collision with root package name */
    public final float f18137f;

    /* renamed from: g  reason: collision with root package name */
    public final long f18138g;

    @w0(19)
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f18139a;

        /* renamed from: b  reason: collision with root package name */
        public static Method f18140b;

        /* renamed from: c  reason: collision with root package name */
        public static Method f18141c;

        /* renamed from: d  reason: collision with root package name */
        public static Method f18142d;

        /* renamed from: e  reason: collision with root package name */
        public static Method f18143e;

        /* renamed from: f  reason: collision with root package name */
        public static Method f18144f;

        public static Object a(m0 m0Var, String str) {
            try {
                if (f18139a == null) {
                    f18139a = Class.forName("android.location.LocationRequest");
                }
                if (f18140b == null) {
                    Method declaredMethod = f18139a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f18140b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f18140b.invoke(null, str, Long.valueOf(m0Var.b()), Float.valueOf(m0Var.e()), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (f18141c == null) {
                    Method declaredMethod2 = f18139a.getDeclaredMethod("setQuality", Integer.TYPE);
                    f18141c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f18141c.invoke(invoke, Integer.valueOf(m0Var.g()));
                if (f18142d == null) {
                    Method declaredMethod3 = f18139a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f18142d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f18142d.invoke(invoke, Long.valueOf(m0Var.f()));
                if (m0Var.d() < Integer.MAX_VALUE) {
                    if (f18143e == null) {
                        Method declaredMethod4 = f18139a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f18143e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f18143e.invoke(invoke, Integer.valueOf(m0Var.d()));
                }
                if (m0Var.a() < Long.MAX_VALUE) {
                    if (f18144f == null) {
                        Method declaredMethod5 = f18139a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f18144f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f18144f.invoke(invoke, Long.valueOf(m0Var.a()));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    @w0(31)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static LocationRequest a(m0 m0Var) {
            LocationRequest.Builder quality;
            LocationRequest.Builder minUpdateIntervalMillis;
            LocationRequest.Builder durationMillis;
            LocationRequest.Builder maxUpdates;
            LocationRequest.Builder minUpdateDistanceMeters;
            LocationRequest.Builder maxUpdateDelayMillis;
            LocationRequest build;
            v0.a();
            quality = u0.a(m0Var.b()).setQuality(m0Var.g());
            minUpdateIntervalMillis = quality.setMinUpdateIntervalMillis(m0Var.f());
            durationMillis = minUpdateIntervalMillis.setDurationMillis(m0Var.a());
            maxUpdates = durationMillis.setMaxUpdates(m0Var.d());
            minUpdateDistanceMeters = maxUpdates.setMinUpdateDistanceMeters(m0Var.e());
            maxUpdateDelayMillis = minUpdateDistanceMeters.setMaxUpdateDelayMillis(m0Var.c());
            build = maxUpdateDelayMillis.build();
            return build;
        }
    }

    @b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    public m0(long j7, int i7, long j8, int i8, long j9, float f7, long j10) {
        this.f18133b = j7;
        this.f18132a = i7;
        this.f18134c = j9;
        this.f18135d = j8;
        this.f18136e = i8;
        this.f18137f = f7;
        this.f18138g = j10;
    }

    @d.g0(from = i6.p.f11250n)
    public long a() {
        return this.f18135d;
    }

    @d.g0(from = 0)
    public long b() {
        return this.f18133b;
    }

    @d.g0(from = 0)
    public long c() {
        return this.f18138g;
    }

    @d.g0(from = i6.p.f11250n, to = 2147483647L)
    public int d() {
        return this.f18136e;
    }

    @d.x(from = androidx.cardview.widget.g.f1896q, to = 3.4028234663852886E38d)
    public float e() {
        return this.f18137f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            return this.f18132a == m0Var.f18132a && this.f18133b == m0Var.f18133b && this.f18134c == m0Var.f18134c && this.f18135d == m0Var.f18135d && this.f18136e == m0Var.f18136e && Float.compare(m0Var.f18137f, this.f18137f) == 0 && this.f18138g == m0Var.f18138g;
        }
        return false;
    }

    @d.g0(from = 0)
    public long f() {
        long j7 = this.f18134c;
        return j7 == -1 ? this.f18133b : j7;
    }

    public int g() {
        return this.f18132a;
    }

    @d.o0
    @w0(31)
    public LocationRequest h() {
        return b.a(this);
    }

    public int hashCode() {
        int i7 = this.f18132a * 31;
        long j7 = this.f18133b;
        int i8 = (i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f18134c;
        return i8 + ((int) (j8 ^ (j8 >>> 32)));
    }

    @d.q0
    @SuppressLint({"NewApi"})
    @w0(19)
    public LocationRequest i(@d.o0 String str) {
        return Build.VERSION.SDK_INT >= 31 ? h() : l0.a(a.a(this, str));
    }

    @d.o0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.f18133b != Long.MAX_VALUE) {
            sb.append("@");
            g1.i0.e(this.f18133b, sb);
            int i7 = this.f18132a;
            if (i7 == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i7 == 102) {
                sb.append(" BALANCED");
            } else if (i7 == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.f18135d != Long.MAX_VALUE) {
            sb.append(", duration=");
            g1.i0.e(this.f18135d, sb);
        }
        if (this.f18136e != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f18136e);
        }
        long j7 = this.f18134c;
        if (j7 != -1 && j7 < this.f18133b) {
            sb.append(", minUpdateInterval=");
            g1.i0.e(this.f18134c, sb);
        }
        if (this.f18137f > androidx.cardview.widget.g.f1896q) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f18137f);
        }
        if (this.f18138g / 2 > this.f18133b) {
            sb.append(", maxUpdateDelay=");
            g1.i0.e(this.f18138g, sb);
        }
        sb.append(']');
        return sb.toString();
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public long f18145a;

        /* renamed from: b  reason: collision with root package name */
        public int f18146b;

        /* renamed from: c  reason: collision with root package name */
        public long f18147c;

        /* renamed from: d  reason: collision with root package name */
        public int f18148d;

        /* renamed from: e  reason: collision with root package name */
        public long f18149e;

        /* renamed from: f  reason: collision with root package name */
        public float f18150f;

        /* renamed from: g  reason: collision with root package name */
        public long f18151g;

        public c(long j7) {
            d(j7);
            this.f18146b = m0.f18129j;
            this.f18147c = Long.MAX_VALUE;
            this.f18148d = Integer.MAX_VALUE;
            this.f18149e = -1L;
            this.f18150f = 0.0f;
            this.f18151g = 0L;
        }

        @d.o0
        public m0 a() {
            g1.s.o((this.f18145a == Long.MAX_VALUE && this.f18149e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j7 = this.f18145a;
            return new m0(j7, this.f18146b, this.f18147c, this.f18148d, Math.min(this.f18149e, j7), this.f18150f, this.f18151g);
        }

        @d.o0
        public c b() {
            this.f18149e = -1L;
            return this;
        }

        @d.o0
        public c c(@d.g0(from = 1) long j7) {
            this.f18147c = g1.s.h(j7, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @d.o0
        public c d(@d.g0(from = 0) long j7) {
            this.f18145a = g1.s.h(j7, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @d.o0
        public c e(@d.g0(from = 0) long j7) {
            this.f18151g = j7;
            this.f18151g = g1.s.h(j7, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @d.o0
        public c f(@d.g0(from = 1, to = 2147483647L) int i7) {
            this.f18148d = g1.s.g(i7, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @d.o0
        public c g(@d.x(from = 0.0d, to = 3.4028234663852886E38d) float f7) {
            this.f18150f = f7;
            this.f18150f = g1.s.f(f7, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @d.o0
        public c h(@d.g0(from = 0) long j7) {
            this.f18149e = g1.s.h(j7, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @d.o0
        public c i(int i7) {
            g1.s.c(i7 == 104 || i7 == 102 || i7 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i7));
            this.f18146b = i7;
            return this;
        }

        public c(@d.o0 m0 m0Var) {
            this.f18145a = m0Var.f18133b;
            this.f18146b = m0Var.f18132a;
            this.f18147c = m0Var.f18135d;
            this.f18148d = m0Var.f18136e;
            this.f18149e = m0Var.f18134c;
            this.f18150f = m0Var.f18137f;
            this.f18151g = m0Var.f18138g;
        }
    }
}
