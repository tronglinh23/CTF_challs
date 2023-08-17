package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.i;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d.l1;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import u4.l0;
import v3.m2;
/* loaded from: classes.dex */
public final class SidecarCompat implements i {
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final a f7029f = new a(null);
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public static final String f7030g = "SidecarCompat";
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final SidecarInterface f7031a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final o f7032b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final Map<IBinder, Activity> f7033c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final Map<Activity, ComponentCallbacks> f7034d;
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public i.a f7035e;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lv3/m2;", "onDeviceStateChanged", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "Landroidx/window/layout/o;", "a", "Landroidx/window/layout/o;", "sidecarAdapter", "b", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "callbackInterface", "Ljava/util/concurrent/locks/ReentrantLock;", "c", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", androidx.appcompat.widget.d.f1513o, "Landroidx/window/sidecar/SidecarDeviceState;", "lastDeviceState", "Ljava/util/WeakHashMap;", "e", "Ljava/util/WeakHashMap;", "mActivityWindowLayoutInfo", "<init>", "(Landroidx/window/layout/o;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        @n6.d

        /* renamed from: a  reason: collision with root package name and from kotlin metadata */
        public final o sidecarAdapter;
        @n6.d

        /* renamed from: b  reason: collision with root package name and from kotlin metadata */
        public final SidecarInterface.SidecarCallback callbackInterface;
        @n6.d

        /* renamed from: c  reason: collision with root package name and from kotlin metadata */
        public final ReentrantLock lock;
        @d.b0("lock")
        @n6.e

        /* renamed from: d  reason: collision with root package name and from kotlin metadata */
        public SidecarDeviceState lastDeviceState;
        @n6.d
        @d.b0("mLock")

        /* renamed from: e  reason: collision with root package name and from kotlin metadata */
        public final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;

        public DistinctSidecarElementCallback(@n6.d o oVar, @n6.d SidecarInterface.SidecarCallback sidecarCallback) {
            l0.p(oVar, "sidecarAdapter");
            l0.p(sidecarCallback, "callbackInterface");
            this.sidecarAdapter = oVar;
            this.callbackInterface = sidecarCallback;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(@n6.d SidecarDeviceState sidecarDeviceState) {
            l0.p(sidecarDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.a(this.lastDeviceState, sidecarDeviceState)) {
                    return;
                }
                this.lastDeviceState = sidecarDeviceState;
                this.callbackInterface.onDeviceStateChanged(sidecarDeviceState);
                m2 m2Var = m2.f17815a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@n6.d IBinder iBinder, @n6.d SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            l0.p(iBinder, "token");
            l0.p(sidecarWindowLayoutInfo, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.d(this.mActivityWindowLayoutInfo.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.mActivityWindowLayoutInfo.put(iBinder, sidecarWindowLayoutInfo);
                this.callbackInterface.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\r"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lv3/m2;", "onDeviceStateChanged", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "<init>", "(Landroidx/window/layout/SidecarCompat;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SidecarCompat f7041a;

        public TranslatingCallback(SidecarCompat sidecarCompat) {
            l0.p(sidecarCompat, "this$0");
            this.f7041a = sidecarCompat;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@n6.d SidecarDeviceState sidecarDeviceState) {
            SidecarInterface h7;
            l0.p(sidecarDeviceState, "newDeviceState");
            Collection<Activity> values = this.f7041a.f7033c.values();
            SidecarCompat sidecarCompat = this.f7041a;
            for (Activity activity : values) {
                IBinder a7 = SidecarCompat.f7029f.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (a7 != null && (h7 = sidecarCompat.h()) != null) {
                    sidecarWindowLayoutInfo = h7.getWindowLayoutInfo(a7);
                }
                i.a aVar = sidecarCompat.f7035e;
                if (aVar != null) {
                    aVar.a(activity, sidecarCompat.f7032b.e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@n6.d IBinder iBinder, @n6.d SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            l0.p(iBinder, "windowToken");
            l0.p(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) this.f7041a.f7033c.get(iBinder);
            if (activity == null) {
                Log.w(SidecarCompat.f7030g, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            o oVar = this.f7041a.f7032b;
            SidecarInterface h7 = this.f7041a.h();
            SidecarDeviceState deviceState = h7 == null ? null : h7.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            w e7 = oVar.e(sidecarWindowLayoutInfo, deviceState);
            i.a aVar = this.f7041a.f7035e;
            if (aVar == null) {
                return;
            }
            aVar.a(activity, e7);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.e
        public final IBinder a(@n6.e Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @n6.e
        public final SidecarInterface b(@n6.d Context context) {
            l0.p(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @n6.e
        public final t3.i c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return t3.i.f16847p.e(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements i.a {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final i.a f7042a;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public final ReentrantLock f7043b;
        @n6.d
        @d.b0("mLock")

        /* renamed from: c  reason: collision with root package name */
        public final WeakHashMap<Activity, w> f7044c;

        public b(@n6.d i.a aVar) {
            l0.p(aVar, "callbackInterface");
            this.f7042a = aVar;
            this.f7043b = new ReentrantLock();
            this.f7044c = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.i.a
        public void a(@n6.d Activity activity, @n6.d w wVar) {
            l0.p(activity, androidx.appcompat.widget.d.f1516r);
            l0.p(wVar, "newLayout");
            ReentrantLock reentrantLock = this.f7043b;
            reentrantLock.lock();
            try {
                if (l0.g(wVar, this.f7044c.get(activity))) {
                    return;
                }
                this.f7044c.put(activity, wVar);
                reentrantLock.unlock();
                this.f7042a.a(activity, wVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements View.OnAttachStateChangeListener {
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public final SidecarCompat f7045b;
        @n6.d

        /* renamed from: c  reason: collision with root package name */
        public final WeakReference<Activity> f7046c;

        public c(@n6.d SidecarCompat sidecarCompat, @n6.d Activity activity) {
            l0.p(sidecarCompat, "sidecarCompat");
            l0.p(activity, androidx.appcompat.widget.d.f1516r);
            this.f7045b = sidecarCompat;
            this.f7046c = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@n6.d View view) {
            l0.p(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f7046c.get();
            IBinder a7 = SidecarCompat.f7029f.a(activity);
            if (activity == null || a7 == null) {
                return;
            }
            this.f7045b.j(a7, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@n6.d View view) {
            l0.p(view, "view");
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements ComponentCallbacks {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Activity f7048c;

        public d(Activity activity) {
            this.f7048c = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@n6.d Configuration configuration) {
            l0.p(configuration, "newConfig");
            i.a aVar = SidecarCompat.this.f7035e;
            if (aVar == null) {
                return;
            }
            Activity activity = this.f7048c;
            aVar.a(activity, SidecarCompat.this.i(activity));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    @l1
    public SidecarCompat(@n6.e @l1 SidecarInterface sidecarInterface, @n6.d o oVar) {
        l0.p(oVar, "sidecarAdapter");
        this.f7031a = sidecarInterface;
        this.f7032b = oVar;
        this.f7033c = new LinkedHashMap();
        this.f7034d = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0172 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018a A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:34:0x005d, B:36:0x0065, B:46:0x0084, B:48:0x008c, B:58:0x00aa, B:60:0x00b2, B:62:0x00b8, B:68:0x00ee, B:69:0x010a, B:71:0x010d, B:73:0x013c, B:76:0x0146, B:77:0x014d, B:78:0x014e, B:79:0x0155, B:64:0x00bb, B:66:0x00e6, B:80:0x0156, B:81:0x015d, B:82:0x015e, B:83:0x0165, B:84:0x0166, B:85:0x0171, B:57:0x00a6, B:51:0x0092, B:54:0x0099, B:86:0x0172, B:87:0x017d, B:45:0x0080, B:39:0x006b, B:42:0x0072, B:88:0x017e, B:89:0x0189, B:33:0x0059, B:27:0x0044, B:30:0x004b, B:22:0x0039, B:18:0x0031, B:90:0x018a, B:91:0x0195, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:96:0x0001, inners: #0, #2 }] */
    @Override // androidx.window.layout.i
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.a():boolean");
    }

    @Override // androidx.window.layout.i
    public void b(@n6.d Activity activity) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        IBinder a7 = f7029f.a(activity);
        if (a7 != null) {
            j(a7, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
    }

    @Override // androidx.window.layout.i
    public void c(@n6.d i.a aVar) {
        l0.p(aVar, "extensionCallback");
        this.f7035e = new b(aVar);
        SidecarInterface sidecarInterface = this.f7031a;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f7032b, new TranslatingCallback(this)));
    }

    @Override // androidx.window.layout.i
    public void d(@n6.d Activity activity) {
        SidecarInterface sidecarInterface;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        IBinder a7 = f7029f.a(activity);
        if (a7 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f7031a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a7);
        }
        l(activity);
        boolean z6 = this.f7033c.size() == 1;
        this.f7033c.remove(a7);
        if (!z6 || (sidecarInterface = this.f7031a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    @n6.e
    public final SidecarInterface h() {
        return this.f7031a;
    }

    @n6.d
    @l1
    public final w i(@n6.d Activity activity) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        IBinder a7 = f7029f.a(activity);
        if (a7 == null) {
            return new w(x3.w.E());
        }
        SidecarInterface sidecarInterface = this.f7031a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(a7);
        o oVar = this.f7032b;
        SidecarInterface sidecarInterface2 = this.f7031a;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return oVar.e(windowLayoutInfo, deviceState);
    }

    public final void j(@n6.d IBinder iBinder, @n6.d Activity activity) {
        SidecarInterface sidecarInterface;
        l0.p(iBinder, "windowToken");
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        this.f7033c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f7031a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f7033c.size() == 1 && (sidecarInterface = this.f7031a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        i.a aVar = this.f7035e;
        if (aVar != null) {
            aVar.a(activity, i(activity));
        }
        k(activity);
    }

    public final void k(Activity activity) {
        if (this.f7034d.get(activity) == null) {
            d dVar = new d(activity);
            this.f7034d.put(activity, dVar);
            activity.registerComponentCallbacks(dVar);
        }
    }

    public final void l(Activity activity) {
        activity.unregisterComponentCallbacks(this.f7034d.get(activity));
        this.f7034d.remove(activity);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [t3.g$b, u4.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SidecarCompat(@n6.d android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            u4.l0.p(r4, r0)
            androidx.window.layout.SidecarCompat$a r0 = androidx.window.layout.SidecarCompat.f7029f
            androidx.window.sidecar.SidecarInterface r4 = r0.b(r4)
            androidx.window.layout.o r0 = new androidx.window.layout.o
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.<init>(android.content.Context):void");
    }
}
