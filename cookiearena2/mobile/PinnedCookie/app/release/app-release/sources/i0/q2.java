package i0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: c  reason: collision with root package name */
    public static final String f10795c = "NotifManCompat";

    /* renamed from: d  reason: collision with root package name */
    public static final String f10796d = "checkOpNoThrow";

    /* renamed from: e  reason: collision with root package name */
    public static final String f10797e = "OP_POST_NOTIFICATION";

    /* renamed from: f  reason: collision with root package name */
    public static final String f10798f = "android.support.useSideChannel";

    /* renamed from: g  reason: collision with root package name */
    public static final String f10799g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* renamed from: h  reason: collision with root package name */
    public static final int f10800h = 19;

    /* renamed from: i  reason: collision with root package name */
    public static final int f10801i = 1000;

    /* renamed from: j  reason: collision with root package name */
    public static final int f10802j = 6;

    /* renamed from: k  reason: collision with root package name */
    public static final String f10803k = "enabled_notification_listeners";
    @d.b0("sEnabledNotificationListenersLock")

    /* renamed from: m  reason: collision with root package name */
    public static String f10805m = null;
    @d.b0("sLock")

    /* renamed from: p  reason: collision with root package name */
    public static h f10808p = null;

    /* renamed from: q  reason: collision with root package name */
    public static final int f10809q = -1000;

    /* renamed from: r  reason: collision with root package name */
    public static final int f10810r = 0;

    /* renamed from: s  reason: collision with root package name */
    public static final int f10811s = 1;

    /* renamed from: t  reason: collision with root package name */
    public static final int f10812t = 2;

    /* renamed from: u  reason: collision with root package name */
    public static final int f10813u = 3;

    /* renamed from: v  reason: collision with root package name */
    public static final int f10814v = 4;

    /* renamed from: w  reason: collision with root package name */
    public static final int f10815w = 5;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10816a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f10817b;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f10804l = new Object();
    @d.b0("sEnabledNotificationListenersLock")

    /* renamed from: n  reason: collision with root package name */
    public static Set<String> f10806n = new HashSet();

    /* renamed from: o  reason: collision with root package name */
    public static final Object f10807o = new Object();

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        @d.u
        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        @d.u
        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        @d.u
        public static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        @d.u
        public static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        @d.u
        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        @d.u
        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        @d.u
        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @d.u
        public static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        @d.u
        public static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        @d.u
        public static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        @d.u
        public static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            NotificationChannelGroup notificationChannelGroup;
            notificationChannelGroup = notificationManager.getNotificationChannelGroup(str);
            return notificationChannelGroup;
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            NotificationChannel notificationChannel;
            notificationChannel = notificationManager.getNotificationChannel(str, str2);
            return notificationChannel;
        }

        @d.u
        public static String b(NotificationChannel notificationChannel) {
            String parentChannelId;
            parentChannelId = notificationChannel.getParentChannelId();
            return parentChannelId;
        }
    }

    /* loaded from: classes.dex */
    public static class f implements i {

        /* renamed from: a  reason: collision with root package name */
        public final String f10822a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10823b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10824c;

        /* renamed from: d  reason: collision with root package name */
        public final Notification f10825d;

        public f(String str, int i7, String str2, Notification notification) {
            this.f10822a = str;
            this.f10823b = i7;
            this.f10824c = str2;
            this.f10825d = notification;
        }

        @Override // i0.q2.i
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f10822a, this.f10823b, this.f10824c, this.f10825d);
        }

        @d.o0
        public String toString() {
            return "NotifyTask[packageName:" + this.f10822a + ", id:" + this.f10823b + ", tag:" + this.f10824c + "]";
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f10826a;

        /* renamed from: b  reason: collision with root package name */
        public final IBinder f10827b;

        public g(ComponentName componentName, IBinder iBinder) {
            this.f10826a = componentName;
            this.f10827b = iBinder;
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Handler.Callback, ServiceConnection {

        /* renamed from: f  reason: collision with root package name */
        public static final int f10828f = 0;

        /* renamed from: g  reason: collision with root package name */
        public static final int f10829g = 1;

        /* renamed from: h  reason: collision with root package name */
        public static final int f10830h = 2;

        /* renamed from: i  reason: collision with root package name */
        public static final int f10831i = 3;

        /* renamed from: a  reason: collision with root package name */
        public final Context f10832a;

        /* renamed from: b  reason: collision with root package name */
        public final HandlerThread f10833b;

        /* renamed from: c  reason: collision with root package name */
        public final Handler f10834c;

        /* renamed from: d  reason: collision with root package name */
        public final Map<ComponentName, a> f10835d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        public Set<String> f10836e = new HashSet();

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ComponentName f10837a;

            /* renamed from: c  reason: collision with root package name */
            public INotificationSideChannel f10839c;

            /* renamed from: b  reason: collision with root package name */
            public boolean f10838b = false;

            /* renamed from: d  reason: collision with root package name */
            public ArrayDeque<i> f10840d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            public int f10841e = 0;

            public a(ComponentName componentName) {
                this.f10837a = componentName;
            }
        }

        public h(Context context) {
            this.f10832a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f10833b = handlerThread;
            handlerThread.start();
            this.f10834c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.f10838b) {
                return true;
            }
            boolean bindService = this.f10832a.bindService(new Intent(q2.f10799g).setComponent(aVar.f10837a), this, 33);
            aVar.f10838b = bindService;
            if (bindService) {
                aVar.f10841e = 0;
            } else {
                Log.w(q2.f10795c, "Unable to bind to listener " + aVar.f10837a);
                this.f10832a.unbindService(this);
            }
            return aVar.f10838b;
        }

        public final void b(a aVar) {
            if (aVar.f10838b) {
                this.f10832a.unbindService(this);
                aVar.f10838b = false;
            }
            aVar.f10839c = null;
        }

        public final void c(i iVar) {
            j();
            for (a aVar : this.f10835d.values()) {
                aVar.f10840d.add(iVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = this.f10835d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f10835d.get(componentName);
            if (aVar != null) {
                aVar.f10839c = INotificationSideChannel.Stub.asInterface(iBinder);
                aVar.f10841e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = this.f10835d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable(q2.f10795c, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.f10837a);
                sb.append(", ");
                sb.append(aVar.f10840d.size());
                sb.append(" queued tasks");
            }
            if (aVar.f10840d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f10839c == null) {
                i(aVar);
                return;
            }
            while (true) {
                i peek = aVar.f10840d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(q2.f10795c, 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Sending task ");
                        sb2.append(peek);
                    }
                    peek.a(aVar.f10839c);
                    aVar.f10840d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(q2.f10795c, 3)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Remote service has died: ");
                        sb3.append(aVar.f10837a);
                    }
                } catch (RemoteException e7) {
                    Log.w(q2.f10795c, "RemoteException communicating with " + aVar.f10837a, e7);
                }
            }
            if (aVar.f10840d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        public void h(i iVar) {
            this.f10834c.obtainMessage(0, iVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 0) {
                c((i) message.obj);
                return true;
            } else if (i7 == 1) {
                g gVar = (g) message.obj;
                e(gVar.f10826a, gVar.f10827b);
                return true;
            } else if (i7 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i7 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public final void i(a aVar) {
            if (this.f10834c.hasMessages(3, aVar.f10837a)) {
                return;
            }
            int i7 = aVar.f10841e + 1;
            aVar.f10841e = i7;
            if (i7 <= 6) {
                int i8 = (1 << (i7 - 1)) * 1000;
                if (Log.isLoggable(q2.f10795c, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Scheduling retry for ");
                    sb.append(i8);
                    sb.append(" ms");
                }
                this.f10834c.sendMessageDelayed(this.f10834c.obtainMessage(3, aVar.f10837a), i8);
                return;
            }
            Log.w(q2.f10795c, "Giving up on delivering " + aVar.f10840d.size() + " tasks to " + aVar.f10837a + " after " + aVar.f10841e + " retries");
            aVar.f10840d.clear();
        }

        public final void j() {
            Set<String> q6 = q2.q(this.f10832a);
            if (q6.equals(this.f10836e)) {
                return;
            }
            this.f10836e = q6;
            List<ResolveInfo> queryIntentServices = this.f10832a.getPackageManager().queryIntentServices(new Intent().setAction(q2.f10799g), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (q6.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(q2.f10795c, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f10835d.containsKey(componentName2)) {
                    if (Log.isLoggable(q2.f10795c, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Adding listener record for ");
                        sb.append(componentName2);
                    }
                    this.f10835d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f10835d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable(q2.f10795c, 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Removing listener record for ");
                        sb2.append(next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(q2.f10795c, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
            }
            this.f10834c.obtainMessage(1, new g(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(q2.f10795c, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
            }
            this.f10834c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    public q2(Context context) {
        this.f10816a = context;
        this.f10817b = (NotificationManager) context.getSystemService("notification");
    }

    public static boolean F(Notification notification) {
        Bundle n7 = k0.n(notification);
        return n7 != null && n7.getBoolean(f10798f);
    }

    @d.o0
    public static q2 p(@d.o0 Context context) {
        return new q2(context);
    }

    @d.o0
    public static Set<String> q(@d.o0 Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), f10803k);
        synchronized (f10804l) {
            if (string != null) {
                if (!string.equals(f10805m)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f10806n = hashSet;
                    f10805m = string;
                }
            }
            set = f10806n;
        }
        return set;
    }

    @d.o0
    public List<NotificationChannel> A() {
        return b.k(this.f10817b);
    }

    @d.o0
    public List<z> B() {
        List<NotificationChannel> A = A();
        if (A.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A.size());
        Iterator<NotificationChannel> it = A.iterator();
        while (it.hasNext()) {
            arrayList.add(new z(it.next()));
        }
        return arrayList;
    }

    @d.a1("android.permission.POST_NOTIFICATIONS")
    public void C(int i7, @d.o0 Notification notification) {
        D(null, i7, notification);
    }

    @d.a1("android.permission.POST_NOTIFICATIONS")
    public void D(@d.q0 String str, int i7, @d.o0 Notification notification) {
        if (!F(notification)) {
            this.f10817b.notify(str, i7, notification);
            return;
        }
        E(new f(this.f10816a.getPackageName(), i7, str, notification));
        this.f10817b.cancel(str, i7);
    }

    public final void E(i iVar) {
        synchronized (f10807o) {
            if (f10808p == null) {
                f10808p = new h(this.f10816a.getApplicationContext());
            }
            f10808p.h(iVar);
        }
    }

    public boolean a() {
        return a.a(this.f10817b);
    }

    public void b(int i7) {
        c(null, i7);
    }

    public void c(@d.q0 String str, int i7) {
        this.f10817b.cancel(str, i7);
    }

    public void d() {
        this.f10817b.cancelAll();
    }

    public void e(@d.o0 NotificationChannel notificationChannel) {
        b.a(this.f10817b, notificationChannel);
    }

    public void f(@d.o0 z zVar) {
        e(zVar.m());
    }

    public void g(@d.o0 NotificationChannelGroup notificationChannelGroup) {
        b.b(this.f10817b, notificationChannelGroup);
    }

    public void h(@d.o0 f0 f0Var) {
        g(f0Var.f());
    }

    public void i(@d.o0 List<NotificationChannelGroup> list) {
        b.c(this.f10817b, list);
    }

    public void j(@d.o0 List<f0> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<f0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f());
        }
        b.c(this.f10817b, arrayList);
    }

    public void k(@d.o0 List<NotificationChannel> list) {
        b.d(this.f10817b, list);
    }

    public void l(@d.o0 List<z> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<z> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m());
        }
        b.d(this.f10817b, arrayList);
    }

    public void m(@d.o0 String str) {
        b.e(this.f10817b, str);
    }

    public void n(@d.o0 String str) {
        b.f(this.f10817b, str);
    }

    public void o(@d.o0 Collection<String> collection) {
        for (NotificationChannel notificationChannel : b.k(this.f10817b)) {
            if (!collection.contains(b.g(notificationChannel)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(d.b(notificationChannel)))) {
                b.e(this.f10817b, b.g(notificationChannel));
            }
        }
    }

    public int r() {
        return a.b(this.f10817b);
    }

    @d.q0
    public NotificationChannel s(@d.o0 String str) {
        return b.i(this.f10817b, str);
    }

    @d.q0
    public NotificationChannel t(@d.o0 String str, @d.o0 String str2) {
        return Build.VERSION.SDK_INT >= 30 ? d.a(this.f10817b, str, str2) : s(str);
    }

    @d.q0
    public z u(@d.o0 String str) {
        NotificationChannel s6 = s(str);
        if (s6 != null) {
            return new z(s6);
        }
        return null;
    }

    @d.q0
    public z v(@d.o0 String str, @d.o0 String str2) {
        NotificationChannel t6 = t(str, str2);
        if (t6 != null) {
            return new z(t6);
        }
        return null;
    }

    @d.q0
    public NotificationChannelGroup w(@d.o0 String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(this.f10817b, str);
        }
        for (NotificationChannelGroup notificationChannelGroup : y()) {
            if (b.h(notificationChannelGroup).equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    @d.q0
    public f0 x(@d.o0 String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            NotificationChannelGroup w6 = w(str);
            if (w6 != null) {
                return new f0(w6);
            }
            return null;
        }
        NotificationChannelGroup w7 = w(str);
        if (w7 != null) {
            return new f0(w7, A());
        }
        return null;
    }

    @d.o0
    public List<NotificationChannelGroup> y() {
        return b.j(this.f10817b);
    }

    @d.o0
    public List<f0> z() {
        int i7 = Build.VERSION.SDK_INT;
        List<NotificationChannelGroup> y6 = y();
        if (y6.isEmpty()) {
            return Collections.emptyList();
        }
        List<NotificationChannel> emptyList = i7 >= 28 ? Collections.emptyList() : A();
        ArrayList arrayList = new ArrayList(y6.size());
        for (NotificationChannelGroup notificationChannelGroup : y6) {
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add(new f0(notificationChannelGroup));
            } else {
                arrayList.add(new f0(notificationChannelGroup, emptyList));
            }
        }
        return arrayList;
    }

    /* loaded from: classes.dex */
    public static class e implements i {

        /* renamed from: a  reason: collision with root package name */
        public final String f10818a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10819b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10820c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f10821d;

        public e(String str) {
            this.f10818a = str;
            this.f10819b = 0;
            this.f10820c = null;
            this.f10821d = true;
        }

        @Override // i0.q2.i
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.f10821d) {
                iNotificationSideChannel.cancelAll(this.f10818a);
            } else {
                iNotificationSideChannel.cancel(this.f10818a, this.f10819b, this.f10820c);
            }
        }

        @d.o0
        public String toString() {
            return "CancelTask[packageName:" + this.f10818a + ", id:" + this.f10819b + ", tag:" + this.f10820c + ", all:" + this.f10821d + "]";
        }

        public e(String str, int i7, String str2) {
            this.f10818a = str;
            this.f10819b = i7;
            this.f10820c = str2;
            this.f10821d = false;
        }
    }
}
