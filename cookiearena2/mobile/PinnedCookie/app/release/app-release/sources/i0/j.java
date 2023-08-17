package i0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import d.b1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
@d.b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10473a = "ActivityRecreator";

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f10474b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f10475c;

    /* renamed from: d  reason: collision with root package name */
    public static final Field f10476d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f10477e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f10478f;

    /* renamed from: g  reason: collision with root package name */
    public static final Method f10479g;

    /* renamed from: h  reason: collision with root package name */
    public static final Handler f10480h = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ d f10481k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Object f10482l;

        public a(d dVar, Object obj) {
            this.f10481k = dVar;
            this.f10482l = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10481k.f10487a = this.f10482l;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Application f10483k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ d f10484l;

        public b(Application application, d dVar) {
            this.f10483k = application;
            this.f10484l = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10483k.unregisterActivityLifecycleCallbacks(this.f10484l);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Object f10485k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Object f10486l;

        public c(Object obj, Object obj2) {
            this.f10485k = obj;
            this.f10486l = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = j.f10477e;
                if (method != null) {
                    method.invoke(this.f10485k, this.f10486l, Boolean.FALSE, "AppCompat recreation");
                } else {
                    j.f10478f.invoke(this.f10485k, this.f10486l, Boolean.FALSE);
                }
            } catch (RuntimeException e7) {
                if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                    throw e7;
                }
            } catch (Throwable th) {
                Log.e(j.f10473a, "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public Object f10487a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f10488b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10489c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f10490d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10491e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10492f = false;

        public d(@d.o0 Activity activity) {
            this.f10488b = activity;
            this.f10489c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f10488b == activity) {
                this.f10488b = null;
                this.f10491e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f10491e || this.f10492f || this.f10490d || !j.h(this.f10487a, this.f10489c, activity)) {
                return;
            }
            this.f10492f = true;
            this.f10487a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f10488b == activity) {
                this.f10490d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a7 = a();
        f10474b = a7;
        f10475c = b();
        f10476d = f();
        f10477e = d(a7);
        f10478f = c(a7);
        f10479g = e(a7);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 == 26 || i7 == 27;
    }

    public static boolean h(Object obj, int i7, Activity activity) {
        try {
            Object obj2 = f10476d.get(activity);
            if (obj2 == obj && activity.hashCode() == i7) {
                f10480h.postAtFrontOfQueue(new c(f10475c.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e(f10473a, "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(@d.o0 Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f10479g == null) {
            return false;
        } else {
            if (f10478f == null && f10477e == null) {
                return false;
            }
            try {
                Object obj2 = f10476d.get(activity);
                if (obj2 == null || (obj = f10475c.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f10480h;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f10479g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
