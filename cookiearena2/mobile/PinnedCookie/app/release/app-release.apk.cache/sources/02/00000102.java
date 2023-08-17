package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import d.a1;
import d.l1;
import d.o0;
import java.util.Calendar;
import k0.v0;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: d  reason: collision with root package name */
    public static final String f717d = "TwilightManager";

    /* renamed from: e  reason: collision with root package name */
    public static final int f718e = 6;

    /* renamed from: f  reason: collision with root package name */
    public static final int f719f = 22;

    /* renamed from: g  reason: collision with root package name */
    public static a0 f720g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f721a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f722b;

    /* renamed from: c  reason: collision with root package name */
    public final a f723c = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f724a;

        /* renamed from: b  reason: collision with root package name */
        public long f725b;
    }

    @l1
    public a0(@o0 Context context, @o0 LocationManager locationManager) {
        this.f721a = context;
        this.f722b = locationManager;
    }

    public static a0 a(@o0 Context context) {
        if (f720g == null) {
            Context applicationContext = context.getApplicationContext();
            f720g = new a0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f720g;
    }

    @l1
    public static void f(a0 a0Var) {
        f720g = a0Var;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location c7 = v0.d(this.f721a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c8 = v0.d(this.f721a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c8 == null || c7 == null) ? c8 != null ? c8 : c7 : c8.getTime() > c7.getTime() ? c8 : c7;
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Location c(String str) {
        try {
            if (this.f722b.isProviderEnabled(str)) {
                return this.f722b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f723c;
        if (e()) {
            return aVar.f724a;
        }
        Location b7 = b();
        if (b7 != null) {
            g(b7);
            return aVar.f724a;
        }
        Log.i(f717d, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i7 = Calendar.getInstance().get(11);
        return i7 < 6 || i7 >= 22;
    }

    public final boolean e() {
        return this.f723c.f725b > System.currentTimeMillis();
    }

    public final void g(@o0 Location location) {
        long j7;
        a aVar = this.f723c;
        long currentTimeMillis = System.currentTimeMillis();
        z b7 = z.b();
        b7.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b7.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z6 = b7.f945c == 1;
        long j8 = b7.f944b;
        long j9 = b7.f943a;
        b7.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j10 = b7.f944b;
        if (j8 == -1 || j9 == -1) {
            j7 = 43200000 + currentTimeMillis;
        } else {
            j7 = (currentTimeMillis > j9 ? j10 + 0 : currentTimeMillis > j8 ? j9 + 0 : j8 + 0) + h6.e.B;
        }
        aVar.f724a = z6;
        aVar.f725b = j7;
    }
}