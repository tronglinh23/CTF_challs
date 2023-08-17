package w0;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import d.b1;
import d.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class a {
    @SuppressLint({"InlinedApi"})

    /* renamed from: a  reason: collision with root package name */
    public static final int f18033a = 0;
    @SuppressLint({"InlinedApi"})

    /* renamed from: b  reason: collision with root package name */
    public static final int f18034b = 1;
    @SuppressLint({"InlinedApi"})

    /* renamed from: c  reason: collision with root package name */
    public static final int f18035c = 2;
    @SuppressLint({"InlinedApi"})

    /* renamed from: d  reason: collision with root package name */
    public static final int f18036d = 3;
    @SuppressLint({"InlinedApi"})

    /* renamed from: e  reason: collision with root package name */
    public static final int f18037e = 4;
    @SuppressLint({"InlinedApi"})

    /* renamed from: f  reason: collision with root package name */
    public static final int f18038f = 5;
    @SuppressLint({"InlinedApi"})

    /* renamed from: g  reason: collision with root package name */
    public static final int f18039g = 6;
    @SuppressLint({"InlinedApi"})

    /* renamed from: h  reason: collision with root package name */
    public static final int f18040h = 7;

    /* renamed from: w0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0255a {
        public void a(@d.g0(from = 0) int i7) {
        }

        public void b(@d.o0 a aVar) {
        }

        public void c() {
        }

        public void d() {
        }
    }

    @b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    @d.o0
    @w0(24)
    public static a n(@d.o0 GnssStatus gnssStatus) {
        return new w0.b(gnssStatus);
    }

    @SuppressLint({"ReferencesDeprecated"})
    @d.o0
    public static a o(@d.o0 GpsStatus gpsStatus) {
        return new e(gpsStatus);
    }

    @d.x(from = androidx.cardview.widget.g.f1896q, to = 360.0d)
    public abstract float a(@d.g0(from = 0) int i7);

    @d.x(from = androidx.cardview.widget.g.f1896q, to = 63.0d)
    public abstract float b(@d.g0(from = 0) int i7);

    @d.x(from = androidx.cardview.widget.g.f1896q)
    public abstract float c(@d.g0(from = 0) int i7);

    @d.x(from = androidx.cardview.widget.g.f1896q, to = 63.0d)
    public abstract float d(@d.g0(from = 0) int i7);

    public abstract int e(@d.g0(from = 0) int i7);

    @d.x(from = -90.0d, to = 90.0d)
    public abstract float f(@d.g0(from = 0) int i7);

    @d.g0(from = 0)
    public abstract int g();

    @d.g0(from = i6.p.f11250n, to = 200)
    public abstract int h(@d.g0(from = 0) int i7);

    public abstract boolean i(@d.g0(from = 0) int i7);

    public abstract boolean j(@d.g0(from = 0) int i7);

    public abstract boolean k(@d.g0(from = 0) int i7);

    public abstract boolean l(@d.g0(from = 0) int i7);

    public abstract boolean m(@d.g0(from = 0) int i7);
}