package w0;

import android.annotation.SuppressLint;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import d.a1;
import d.w0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import w0.a;
import w0.l;
import z0.j;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final long f18097a = 30000;

    /* renamed from: b  reason: collision with root package name */
    public static final long f18098b = 10000;

    /* renamed from: c  reason: collision with root package name */
    public static final long f18099c = 5;

    /* renamed from: d  reason: collision with root package name */
    public static Field f18100d;

    /* renamed from: e  reason: collision with root package name */
    public static Class<?> f18101e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f18102f;

    /* renamed from: g  reason: collision with root package name */
    public static Method f18103g;
    @d.b0("sLocationListeners")

    /* renamed from: h  reason: collision with root package name */
    public static final WeakHashMap<k, WeakReference<C0257l>> f18104h = new WeakHashMap<>();

    @w0(19)
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f18105a;

        /* renamed from: b  reason: collision with root package name */
        public static Method f18106b;

        @d.u
        public static boolean a(LocationManager locationManager, String str, m0 m0Var, w0.h hVar, Looper looper) {
            try {
                if (f18105a == null) {
                    f18105a = Class.forName("android.location.LocationRequest");
                }
                if (f18106b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f18105a, LocationListener.class, Looper.class);
                    f18106b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i7 = m0Var.i(str);
                if (i7 != null) {
                    f18106b.invoke(locationManager, i7, hVar, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @d.u
        public static boolean b(LocationManager locationManager, String str, m0 m0Var, C0257l c0257l) {
            try {
                if (f18105a == null) {
                    f18105a = Class.forName("android.location.LocationRequest");
                }
                if (f18106b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f18105a, LocationListener.class, Looper.class);
                    f18106b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i7 = m0Var.i(str);
                if (i7 != null) {
                    synchronized (l.f18104h) {
                        f18106b.invoke(locationManager, i7, c0257l, Looper.getMainLooper());
                        l.p(locationManager, c0257l);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    @w0(24)
    /* loaded from: classes.dex */
    public static class b {
        @a1("android.permission.ACCESS_FINE_LOCATION")
        @d.u
        public static boolean a(@d.o0 LocationManager locationManager, @d.o0 GnssMeasurementsEvent.Callback callback, @d.o0 Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @d.u
        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, a.AbstractC0255a abstractC0255a) {
            g1.s.a(handler != null);
            androidx.collection.m<Object, Object> mVar = g.f18115a;
            synchronized (mVar) {
                m mVar2 = (m) mVar.get(abstractC0255a);
                if (mVar2 == null) {
                    mVar2 = new m(abstractC0255a);
                } else {
                    mVar2.j();
                }
                mVar2.i(executor);
                if (locationManager.registerGnssStatusCallback(mVar2, handler)) {
                    mVar.put(abstractC0255a, mVar2);
                    return true;
                }
                return false;
            }
        }

        @d.u
        public static void c(@d.o0 LocationManager locationManager, @d.o0 GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        @d.u
        public static void d(LocationManager locationManager, Object obj) {
            if (obj instanceof m) {
                ((m) obj).j();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    @w0(28)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static String a(LocationManager locationManager) {
            String gnssHardwareModelName;
            gnssHardwareModelName = locationManager.getGnssHardwareModelName();
            return gnssHardwareModelName;
        }

        @d.u
        public static int b(LocationManager locationManager) {
            int gnssYearOfHardware;
            gnssYearOfHardware = locationManager.getGnssYearOfHardware();
            return gnssYearOfHardware;
        }

        @d.u
        public static boolean c(LocationManager locationManager) {
            boolean isLocationEnabled;
            isLocationEnabled = locationManager.isLocationEnabled();
            return isLocationEnabled;
        }
    }

    @w0(30)
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f18107a;

        /* renamed from: b  reason: collision with root package name */
        public static Method f18108b;

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @d.u
        public static void a(LocationManager locationManager, @d.o0 String str, @d.q0 z0.j jVar, @d.o0 Executor executor, @d.o0 final g1.e<Location> eVar) {
            CancellationSignal cancellationSignal = jVar != null ? (CancellationSignal) jVar.b() : null;
            Objects.requireNonNull(eVar);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: w0.r
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    g1.e.this.accept((Location) obj);
                }
            });
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @d.u
        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, a.AbstractC0255a abstractC0255a) {
            boolean registerGnssStatusCallback;
            androidx.collection.m<Object, Object> mVar = g.f18115a;
            synchronized (mVar) {
                h hVar = (h) mVar.get(abstractC0255a);
                if (hVar == null) {
                    hVar = new h(abstractC0255a);
                }
                registerGnssStatusCallback = locationManager.registerGnssStatusCallback(executor, hVar);
                if (registerGnssStatusCallback) {
                    mVar.put(abstractC0255a, hVar);
                    return true;
                }
                return false;
            }
        }

        @d.u
        public static boolean c(LocationManager locationManager, String str, m0 m0Var, Executor executor, w0.h hVar) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f18107a == null) {
                        f18107a = Class.forName("android.location.LocationRequest");
                    }
                    if (f18108b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f18107a, Executor.class, LocationListener.class);
                        f18108b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest i7 = m0Var.i(str);
                    if (i7 != null) {
                        f18108b.invoke(locationManager, i7, executor, hVar);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    @w0(31)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static boolean a(LocationManager locationManager, @d.o0 String str) {
            boolean hasProvider;
            hasProvider = locationManager.hasProvider(str);
            return hasProvider;
        }

        @a1("android.permission.ACCESS_FINE_LOCATION")
        @d.u
        public static boolean b(@d.o0 LocationManager locationManager, @d.o0 Executor executor, @d.o0 GnssMeasurementsEvent.Callback callback) {
            boolean registerGnssMeasurementsCallback;
            registerGnssMeasurementsCallback = locationManager.registerGnssMeasurementsCallback(executor, callback);
            return registerGnssMeasurementsCallback;
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @d.u
        public static void c(LocationManager locationManager, @d.o0 String str, @d.o0 LocationRequest locationRequest, @d.o0 Executor executor, @d.o0 LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        public final LocationManager f18109a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f18110b;

        /* renamed from: c  reason: collision with root package name */
        public final Handler f18111c = new Handler(Looper.getMainLooper());

        /* renamed from: d  reason: collision with root package name */
        public g1.e<Location> f18112d;
        @d.b0("this")

        /* renamed from: e  reason: collision with root package name */
        public boolean f18113e;
        @d.q0

        /* renamed from: f  reason: collision with root package name */
        public Runnable f18114f;

        public f(LocationManager locationManager, Executor executor, g1.e<Location> eVar) {
            this.f18109a = locationManager;
            this.f18110b = executor;
            this.f18112d = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            this.f18114f = null;
            onLocationChanged((Location) null);
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void c() {
            synchronized (this) {
                if (this.f18113e) {
                    return;
                }
                this.f18113e = true;
                d();
            }
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public final void d() {
            this.f18112d = null;
            this.f18109a.removeUpdates(this);
            Runnable runnable = this.f18114f;
            if (runnable != null) {
                this.f18111c.removeCallbacks(runnable);
                this.f18114f = null;
            }
        }

        @SuppressLint({"MissingPermission"})
        public void g(long j7) {
            synchronized (this) {
                if (this.f18113e) {
                    return;
                }
                Runnable runnable = new Runnable() { // from class: w0.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.f.this.f();
                    }
                };
                this.f18114f = runnable;
                this.f18111c.postDelayed(runnable, j7);
            }
        }

        @Override // android.location.LocationListener
        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@d.q0 final Location location) {
            synchronized (this) {
                if (this.f18113e) {
                    return;
                }
                this.f18113e = true;
                final g1.e<Location> eVar = this.f18112d;
                this.f18110b.execute(new Runnable() { // from class: w0.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        g1.e.this.accept(location);
                    }
                });
                d();
            }
        }

        @Override // android.location.LocationListener
        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@d.o0 String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@d.o0 String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i7, Bundle bundle) {
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        @d.b0("sGnssStatusListeners")

        /* renamed from: a  reason: collision with root package name */
        public static final androidx.collection.m<Object, Object> f18115a = new androidx.collection.m<>();
    }

    @w0(30)
    /* loaded from: classes.dex */
    public static class h extends GnssStatus.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final a.AbstractC0255a f18116a;

        public h(a.AbstractC0255a abstractC0255a) {
            g1.s.b(abstractC0255a != null, "invalid null callback");
            this.f18116a = abstractC0255a;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i7) {
            this.f18116a.a(i7);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f18116a.b(w0.a.n(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f18116a.c();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f18116a.d();
        }
    }

    /* loaded from: classes.dex */
    public static class i implements GpsStatus.Listener {

        /* renamed from: a  reason: collision with root package name */
        public final LocationManager f18117a;

        /* renamed from: b  reason: collision with root package name */
        public final a.AbstractC0255a f18118b;
        @d.q0

        /* renamed from: c  reason: collision with root package name */
        public volatile Executor f18119c;

        public i(LocationManager locationManager, a.AbstractC0255a abstractC0255a) {
            g1.s.b(abstractC0255a != null, "invalid null callback");
            this.f18117a = locationManager;
            this.f18118b = abstractC0255a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Executor executor) {
            if (this.f18119c != executor) {
                return;
            }
            this.f18118b.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Executor executor) {
            if (this.f18119c != executor) {
                return;
            }
            this.f18118b.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Executor executor, int i7) {
            if (this.f18119c != executor) {
                return;
            }
            this.f18118b.a(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Executor executor, w0.a aVar) {
            if (this.f18119c != executor) {
                return;
            }
            this.f18118b.b(aVar);
        }

        public void i(Executor executor) {
            g1.s.n(this.f18119c == null);
            this.f18119c = executor;
        }

        public void j() {
            this.f18119c = null;
        }

        @Override // android.location.GpsStatus.Listener
        @a1("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i7) {
            GpsStatus gpsStatus;
            final Executor executor = this.f18119c;
            if (executor == null) {
                return;
            }
            if (i7 == 1) {
                executor.execute(new Runnable() { // from class: w0.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.i.this.e(executor);
                    }
                });
            } else if (i7 == 2) {
                executor.execute(new Runnable() { // from class: w0.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.i.this.f(executor);
                    }
                });
            } else if (i7 != 3) {
                if (i7 == 4 && (gpsStatus = this.f18117a.getGpsStatus(null)) != null) {
                    final w0.a o6 = w0.a.o(gpsStatus);
                    executor.execute(new Runnable() { // from class: w0.a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            l.i.this.h(executor, o6);
                        }
                    });
                }
            } else {
                GpsStatus gpsStatus2 = this.f18117a.getGpsStatus(null);
                if (gpsStatus2 != null) {
                    final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                    executor.execute(new Runnable() { // from class: w0.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            l.i.this.g(executor, timeToFirstFix);
                        }
                    });
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements Executor {

        /* renamed from: k  reason: collision with root package name */
        public final Handler f18120k;

        public j(@d.o0 Handler handler) {
            this.f18120k = (Handler) g1.s.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@d.o0 Runnable runnable) {
            if (Looper.myLooper() == this.f18120k.getLooper()) {
                runnable.run();
            } else if (this.f18120k.post((Runnable) g1.s.l(runnable))) {
            } else {
                throw new RejectedExecutionException(this.f18120k + " is shutting down");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public final String f18121a;

        /* renamed from: b  reason: collision with root package name */
        public final w0.h f18122b;

        public k(String str, w0.h hVar) {
            this.f18121a = (String) g1.n.e(str, "invalid null provider");
            this.f18122b = (w0.h) g1.n.e(hVar, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                return this.f18121a.equals(kVar.f18121a) && this.f18122b.equals(kVar.f18122b);
            }
            return false;
        }

        public int hashCode() {
            return g1.n.b(this.f18121a, this.f18122b);
        }
    }

    @w0(24)
    /* loaded from: classes.dex */
    public static class m extends GnssStatus.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final a.AbstractC0255a f18125a;
        @d.q0

        /* renamed from: b  reason: collision with root package name */
        public volatile Executor f18126b;

        public m(a.AbstractC0255a abstractC0255a) {
            g1.s.b(abstractC0255a != null, "invalid null callback");
            this.f18125a = abstractC0255a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Executor executor, int i7) {
            if (this.f18126b != executor) {
                return;
            }
            this.f18125a.a(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Executor executor, GnssStatus gnssStatus) {
            if (this.f18126b != executor) {
                return;
            }
            this.f18125a.b(w0.a.n(gnssStatus));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Executor executor) {
            if (this.f18126b != executor) {
                return;
            }
            this.f18125a.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Executor executor) {
            if (this.f18126b != executor) {
                return;
            }
            this.f18125a.d();
        }

        public void i(Executor executor) {
            g1.s.b(executor != null, "invalid null executor");
            g1.s.n(this.f18126b == null);
            this.f18126b = executor;
        }

        public void j() {
            this.f18126b = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i7) {
            final Executor executor = this.f18126b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: w0.j0
                @Override // java.lang.Runnable
                public final void run() {
                    l.m.this.e(executor, i7);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f18126b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: w0.i0
                @Override // java.lang.Runnable
                public final void run() {
                    l.m.this.f(executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.f18126b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: w0.h0
                @Override // java.lang.Runnable
                public final void run() {
                    l.m.this.g(executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.f18126b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: w0.k0
                @Override // java.lang.Runnable
                public final void run() {
                    l.m.this.h(executor);
                }
            });
        }
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void c(@d.o0 LocationManager locationManager, @d.o0 String str, @d.q0 z0.j jVar, @d.o0 Executor executor, @d.o0 final g1.e<Location> eVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.a(locationManager, str, jVar, executor, eVar);
            return;
        }
        if (jVar != null) {
            jVar.e();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - w0.f.c(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: w0.j
                @Override // java.lang.Runnable
                public final void run() {
                    g1.e.this.accept(lastKnownLocation);
                }
            });
            return;
        }
        final f fVar = new f(locationManager, executor, eVar);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, fVar, Looper.getMainLooper());
        if (jVar != null) {
            jVar.d(new j.b() { // from class: w0.k
                @Override // z0.j.b
                public final void onCancel() {
                    l.f.this.c();
                }
            });
        }
        fVar.g(f18097a);
    }

    @d.q0
    public static String d(@d.o0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(locationManager);
        }
        return null;
    }

    public static int e(@d.o0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.b(locationManager);
        }
        return 0;
    }

    public static boolean f(@d.o0 LocationManager locationManager, @d.o0 String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean g(@d.o0 LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? c.c(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    public static /* synthetic */ Boolean i(LocationManager locationManager, i iVar) throws Exception {
        return Boolean.valueOf(locationManager.addGpsStatusListener(iVar));
    }

    @a1("android.permission.ACCESS_FINE_LOCATION")
    @w0(24)
    public static boolean j(@d.o0 LocationManager locationManager, @d.o0 GnssMeasurementsEvent.Callback callback, @d.o0 Handler handler) {
        return Build.VERSION.SDK_INT != 30 ? b.a(locationManager, callback, handler) : l(locationManager, z0.n.a(handler), callback);
    }

    @a1("android.permission.ACCESS_FINE_LOCATION")
    @w0(30)
    public static boolean k(@d.o0 LocationManager locationManager, @d.o0 Executor executor, @d.o0 GnssMeasurementsEvent.Callback callback) {
        return Build.VERSION.SDK_INT > 30 ? e.b(locationManager, executor, callback) : l(locationManager, executor, callback);
    }

    @w0(30)
    public static boolean l(@d.o0 LocationManager locationManager, @d.o0 Executor executor, @d.o0 GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT == 30) {
            try {
                if (f18101e == null) {
                    f18101e = Class.forName("android.location.GnssRequest$Builder");
                }
                if (f18102f == null) {
                    Method declaredMethod = f18101e.getDeclaredMethod("build", new Class[0]);
                    f18102f = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (f18103g == null) {
                    Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class);
                    f18103g = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                Object invoke = f18103g.invoke(locationManager, f18102f.invoke(f18101e.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]), executor, callback);
                if (invoke != null) {
                    return ((Boolean) invoke).booleanValue();
                }
                return false;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                return false;
            }
        }
        throw new IllegalStateException();
    }

    @a1("android.permission.ACCESS_FINE_LOCATION")
    public static boolean m(LocationManager locationManager, Handler handler, Executor executor, a.AbstractC0255a abstractC0255a) {
        return Build.VERSION.SDK_INT >= 30 ? d.b(locationManager, handler, executor, abstractC0255a) : b.b(locationManager, handler, executor, abstractC0255a);
    }

    @a1("android.permission.ACCESS_FINE_LOCATION")
    public static boolean n(@d.o0 LocationManager locationManager, @d.o0 Executor executor, @d.o0 a.AbstractC0255a abstractC0255a) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m(locationManager, null, executor, abstractC0255a);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return m(locationManager, new Handler(myLooper), executor, abstractC0255a);
    }

    @a1("android.permission.ACCESS_FINE_LOCATION")
    public static boolean o(@d.o0 LocationManager locationManager, @d.o0 a.AbstractC0255a abstractC0255a, @d.o0 Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? n(locationManager, z0.n.a(handler), abstractC0255a) : n(locationManager, new j(handler), abstractC0255a);
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @d.b0("sLocationListeners")
    public static void p(LocationManager locationManager, C0257l c0257l) {
        WeakReference<C0257l> put = f18104h.put(c0257l.g(), new WeakReference<>(c0257l));
        C0257l c0257l2 = put != null ? put.get() : null;
        if (c0257l2 != null) {
            c0257l2.n();
            locationManager.removeUpdates(c0257l2);
        }
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void q(@d.o0 LocationManager locationManager, @d.o0 w0.h hVar) {
        WeakHashMap<k, WeakReference<C0257l>> weakHashMap = f18104h;
        synchronized (weakHashMap) {
            Iterator<WeakReference<C0257l>> it = weakHashMap.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                C0257l c0257l = it.next().get();
                if (c0257l != null) {
                    k g7 = c0257l.g();
                    if (g7.f18122b == hVar) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(g7);
                        c0257l.n();
                        locationManager.removeUpdates(c0257l);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f18104h.remove((k) it2.next());
                }
            }
        }
        locationManager.removeUpdates(hVar);
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void r(@d.o0 LocationManager locationManager, @d.o0 String str, @d.o0 m0 m0Var, @d.o0 Executor executor, @d.o0 w0.h hVar) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            e.c(locationManager, str, m0Var.h(), executor, hVar);
        } else if (i7 < 30 || !d.c(locationManager, str, m0Var, executor, hVar)) {
            C0257l c0257l = new C0257l(new k(str, hVar), executor);
            if (a.b(locationManager, str, m0Var, c0257l)) {
                return;
            }
            synchronized (f18104h) {
                locationManager.requestLocationUpdates(str, m0Var.b(), m0Var.e(), c0257l, Looper.getMainLooper());
                p(locationManager, c0257l);
            }
        }
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void s(@d.o0 LocationManager locationManager, @d.o0 String str, @d.o0 m0 m0Var, @d.o0 w0.h hVar, @d.o0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            e.c(locationManager, str, m0Var.h(), z0.n.a(new Handler(looper)), hVar);
        } else if (a.a(locationManager, str, m0Var, hVar, looper)) {
        } else {
            locationManager.requestLocationUpdates(str, m0Var.b(), m0Var.e(), hVar, looper);
        }
    }

    @w0(24)
    public static void t(@d.o0 LocationManager locationManager, @d.o0 GnssMeasurementsEvent.Callback callback) {
        b.c(locationManager, callback);
    }

    public static void u(@d.o0 LocationManager locationManager, @d.o0 a.AbstractC0255a abstractC0255a) {
        androidx.collection.m<Object, Object> mVar = g.f18115a;
        synchronized (mVar) {
            Object remove = mVar.remove(abstractC0255a);
            if (remove != null) {
                b.d(locationManager, remove);
            }
        }
    }

    /* renamed from: w0.l$l  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0257l implements LocationListener {
        @d.q0

        /* renamed from: a  reason: collision with root package name */
        public volatile k f18123a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f18124b;

        public C0257l(@d.q0 k kVar, Executor executor) {
            this.f18123a = kVar;
            this.f18124b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(int i7) {
            k kVar = this.f18123a;
            if (kVar == null) {
                return;
            }
            kVar.f18122b.onFlushComplete(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Location location) {
            k kVar = this.f18123a;
            if (kVar == null) {
                return;
            }
            kVar.f18122b.onLocationChanged(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(List list) {
            k kVar = this.f18123a;
            if (kVar == null) {
                return;
            }
            kVar.f18122b.onLocationChanged(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            k kVar = this.f18123a;
            if (kVar == null) {
                return;
            }
            kVar.f18122b.onProviderDisabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(String str) {
            k kVar = this.f18123a;
            if (kVar == null) {
                return;
            }
            kVar.f18122b.onProviderEnabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(String str, int i7, Bundle bundle) {
            k kVar = this.f18123a;
            if (kVar == null) {
                return;
            }
            kVar.f18122b.onStatusChanged(str, i7, bundle);
        }

        public k g() {
            return (k) g1.n.d(this.f18123a);
        }

        public void n() {
            this.f18123a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i7) {
            if (this.f18123a == null) {
                return;
            }
            this.f18124b.execute(new Runnable() { // from class: w0.c0
                @Override // java.lang.Runnable
                public final void run() {
                    l.C0257l.this.h(i7);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@d.o0 final Location location) {
            if (this.f18123a == null) {
                return;
            }
            this.f18124b.execute(new Runnable() { // from class: w0.f0
                @Override // java.lang.Runnable
                public final void run() {
                    l.C0257l.this.i(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@d.o0 final String str) {
            if (this.f18123a == null) {
                return;
            }
            this.f18124b.execute(new Runnable() { // from class: w0.e0
                @Override // java.lang.Runnable
                public final void run() {
                    l.C0257l.this.k(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@d.o0 final String str) {
            if (this.f18123a == null) {
                return;
            }
            this.f18124b.execute(new Runnable() { // from class: w0.b0
                @Override // java.lang.Runnable
                public final void run() {
                    l.C0257l.this.l(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i7, final Bundle bundle) {
            if (this.f18123a == null) {
                return;
            }
            this.f18124b.execute(new Runnable() { // from class: w0.g0
                @Override // java.lang.Runnable
                public final void run() {
                    l.C0257l.this.m(str, i7, bundle);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@d.o0 final List<Location> list) {
            if (this.f18123a == null) {
                return;
            }
            this.f18124b.execute(new Runnable() { // from class: w0.d0
                @Override // java.lang.Runnable
                public final void run() {
                    l.C0257l.this.j(list);
                }
            });
        }
    }
}
