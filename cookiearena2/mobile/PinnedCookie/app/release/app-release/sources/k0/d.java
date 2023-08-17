package k0;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import d.b1;
import i0.q2;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;
import z0.a;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11444a = "ContextCompat";

    /* renamed from: b  reason: collision with root package name */
    public static final Object f11445b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f11446c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static TypedValue f11447d = null;

    /* renamed from: e  reason: collision with root package name */
    public static final String f11448e = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";

    /* renamed from: f  reason: collision with root package name */
    public static final int f11449f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f11450g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f11451h = 4;

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @d.u
        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        @d.u
        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @d.u
        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        @d.u
        public static Drawable b(Context context, int i7) {
            return context.getDrawable(i7);
        }

        @d.u
        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @d.w0(23)
    /* renamed from: k0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0135d {
        @d.u
        public static int a(Context context, int i7) {
            return context.getColor(i7);
        }

        @d.u
        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @d.u
        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @d.u
        public static File b(Context context) {
            return context.getDataDir();
        }

        @d.u
        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class f {
        @d.u
        public static Intent a(Context context, @d.q0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
            return ((i7 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, d.r(context), handler);
        }

        @d.u
        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class g {
        @d.u
        public static Executor a(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class h {
        @d.u
        public static String a(Context context) {
            String attributionTag;
            attributionTag = context.getAttributionTag();
            return attributionTag;
        }
    }

    @d.w0(33)
    /* loaded from: classes.dex */
    public static class i {
        @d.u
        public static Intent a(Context context, @d.q0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7);
        }
    }

    /* loaded from: classes.dex */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<Class<?>, String> f11452a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f11452a = hashMap;
            hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
            hashMap.put(UsageStatsManager.class, "usagestats");
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, androidx.appcompat.widget.d.f1516r);
            hashMap.put(AlarmManager.class, i0.k0.K0);
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    @d.b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface k {
    }

    @d.s0(markerClass = {a.b.class})
    public static int a(@d.o0 Context context, @d.o0 String str) {
        g1.n.e(str, "permission must be non-null");
        return (z0.a.k() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : q2.p(context).a() ? 0 : -1;
    }

    @d.q0
    public static Context b(@d.o0 Context context) {
        return e.a(context);
    }

    public static File c(File file) {
        synchronized (f11446c) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w(f11444a, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    @d.q0
    public static String d(@d.o0 Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return h.a(context);
        }
        return null;
    }

    @d.o0
    public static File e(@d.o0 Context context) {
        return c.a(context);
    }

    @d.l
    public static int f(@d.o0 Context context, @d.n int i7) {
        return C0135d.a(context, i7);
    }

    @d.q0
    public static ColorStateList g(@d.o0 Context context, @d.n int i7) {
        return m0.i.f(context.getResources(), i7, context.getTheme());
    }

    @d.q0
    public static File h(@d.o0 Context context) {
        return e.b(context);
    }

    @d.q0
    public static Drawable i(@d.o0 Context context, @d.v int i7) {
        return c.b(context, i7);
    }

    @d.o0
    public static File[] j(@d.o0 Context context) {
        return b.a(context);
    }

    @d.o0
    public static File[] k(@d.o0 Context context, @d.q0 String str) {
        return b.b(context, str);
    }

    @d.o0
    public static Executor l(@d.o0 Context context) {
        return Build.VERSION.SDK_INT >= 28 ? g.a(context) : z0.n.a(new Handler(context.getMainLooper()));
    }

    @d.q0
    public static File m(@d.o0 Context context) {
        return c.c(context);
    }

    @d.o0
    public static File[] n(@d.o0 Context context) {
        return b.c(context);
    }

    @d.q0
    public static <T> T o(@d.o0 Context context, @d.o0 Class<T> cls) {
        return (T) C0135d.b(context, cls);
    }

    @d.q0
    public static String p(@d.o0 Context context, @d.o0 Class<?> cls) {
        return C0135d.c(context, cls);
    }

    public static boolean q(@d.o0 Context context) {
        return e.c(context);
    }

    public static String r(Context context) {
        String str = context.getPackageName() + f11448e;
        if (v0.d(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    @d.q0
    public static Intent s(@d.o0 Context context, @d.q0 BroadcastReceiver broadcastReceiver, @d.o0 IntentFilter intentFilter, int i7) {
        return t(context, broadcastReceiver, intentFilter, null, null, i7);
    }

    @d.q0
    @d.s0(markerClass = {a.b.class})
    public static Intent t(@d.o0 Context context, @d.q0 BroadcastReceiver broadcastReceiver, @d.o0 IntentFilter intentFilter, @d.q0 String str, @d.q0 Handler handler, int i7) {
        int i8 = i7 & 1;
        if (i8 == 0 || (i7 & 4) == 0) {
            if (i8 != 0) {
                i7 |= 2;
            }
            int i9 = i7;
            int i10 = i9 & 2;
            if (i10 == 0 && (i9 & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            }
            if (i10 == 0 || (i9 & 4) == 0) {
                return z0.a.k() ? i.a(context, broadcastReceiver, intentFilter, str, handler, i9) : f.a(context, broadcastReceiver, intentFilter, str, handler, i9);
            }
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
    }

    public static boolean u(@d.o0 Context context, @d.o0 Intent[] intentArr) {
        return v(context, intentArr, null);
    }

    public static boolean v(@d.o0 Context context, @d.o0 Intent[] intentArr, @d.q0 Bundle bundle) {
        a.a(context, intentArr, bundle);
        return true;
    }

    public static void w(@d.o0 Context context, @d.o0 Intent intent, @d.q0 Bundle bundle) {
        a.b(context, intent, bundle);
    }

    public static void x(@d.o0 Context context, @d.o0 Intent intent) {
        f.b(context, intent);
    }
}
