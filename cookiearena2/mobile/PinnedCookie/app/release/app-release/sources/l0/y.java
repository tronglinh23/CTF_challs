package l0;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.core.graphics.drawable.IconCompat;
import d.b1;
import d.l1;
import d.o0;
import d.q0;
import d.w0;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l0.r;
import l0.u;
/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public static final int f13233a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f13234b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f13235c = 4;

    /* renamed from: d  reason: collision with root package name */
    public static final int f13236d = 8;
    @l1

    /* renamed from: e  reason: collision with root package name */
    public static final String f13237e = "com.android.launcher.action.INSTALL_SHORTCUT";
    @l1

    /* renamed from: f  reason: collision with root package name */
    public static final String f13238f = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* renamed from: g  reason: collision with root package name */
    public static final int f13239g = 96;

    /* renamed from: h  reason: collision with root package name */
    public static final int f13240h = 48;

    /* renamed from: i  reason: collision with root package name */
    public static final String f13241i = "android.intent.extra.shortcut.ID";

    /* renamed from: j  reason: collision with root package name */
    public static volatile u<?> f13242j = null;

    /* renamed from: k  reason: collision with root package name */
    public static volatile List<l> f13243k = null;

    /* renamed from: l  reason: collision with root package name */
    public static final String f13244l = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* renamed from: m  reason: collision with root package name */
    public static final String f13245m = "androidx.core.content.pm.shortcut_listener_impl";

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IntentSender f13246a;

        public a(IntentSender intentSender) {
            this.f13246a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.f13246a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    @w0(25)
    /* loaded from: classes.dex */
    public static class b {
        public static String a(@o0 List<ShortcutInfo> list) {
            int i7 = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > i7) {
                    str = shortcutInfo.getId();
                    i7 = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    @l1
    public static void A(List<l> list) {
        f13243k = list;
    }

    @l1
    public static void B(u<Void> uVar) {
        f13242j = uVar;
    }

    public static boolean C(@o0 Context context, @o0 List<r> list) {
        List<r> w6 = w(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            c(context, w6);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<r> it = w6.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().H());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
            o(context).a(w6);
            Iterator<l> it2 = n(context).iterator();
            while (it2.hasNext()) {
                it2.next().d(list);
            }
            return true;
        }
        return false;
    }

    public static boolean a(@o0 Context context, @o0 List<r> list) {
        List<r> w6 = w(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            c(context, w6);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<r> it = w6.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().H());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
            o(context).a(w6);
            Iterator<l> it2 = n(context).iterator();
            while (it2.hasNext()) {
                it2.next().b(list);
            }
            return true;
        }
        return false;
    }

    @l1
    public static boolean b(@o0 Context context, @o0 r rVar) {
        Bitmap decodeStream;
        IconCompat iconCompat = rVar.f13210i;
        if (iconCompat == null) {
            return false;
        }
        int i7 = iconCompat.f3510a;
        if (i7 == 6 || i7 == 4) {
            InputStream y6 = iconCompat.y(context);
            if (y6 == null || (decodeStream = BitmapFactory.decodeStream(y6)) == null) {
                return false;
            }
            rVar.f13210i = i7 == 6 ? IconCompat.j(decodeStream) : IconCompat.m(decodeStream);
            return true;
        }
        return true;
    }

    @l1
    public static void c(@o0 Context context, @o0 List<r> list) {
        for (r rVar : new ArrayList(list)) {
            if (!b(context, rVar)) {
                list.remove(rVar);
            }
        }
    }

    @o0
    public static Intent d(@o0 Context context, @o0 r rVar) {
        Intent createShortcutResultIntent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(rVar.H());
        if (createShortcutResultIntent == null) {
            createShortcutResultIntent = new Intent();
        }
        return rVar.a(createShortcutResultIntent);
    }

    public static void e(@o0 Context context, @o0 List<String> list, @q0 CharSequence charSequence) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        o(context).d(list);
        Iterator<l> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void f(@o0 Context context, @o0 List<r> list) {
        List<r> w6 = w(list, 1);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<r> it = w6.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f13203b);
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        o(context).a(w6);
        Iterator<l> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().b(list);
        }
    }

    @o0
    public static List<r> g(@o0 Context context) {
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new r.b(context, it.next()).c());
        }
        return arrayList;
    }

    public static int h(@o0 Context context, boolean z6) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(androidx.appcompat.widget.d.f1516r);
        int max = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (max * ((z6 ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    public static int i(@o0 Context context) {
        g1.s.l(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight();
    }

    public static int j(@o0 Context context) {
        g1.s.l(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth();
    }

    public static int k(@o0 Context context) {
        g1.s.l(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    @l1
    public static List<l> l() {
        return f13243k;
    }

    public static String m(@o0 List<r> list) {
        int i7 = -1;
        String str = null;
        for (r rVar : list) {
            if (rVar.v() > i7) {
                str = rVar.k();
                i7 = rVar.v();
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<l0.l> n(android.content.Context r8) {
        /*
            java.util.List<l0.l> r0 = l0.y.f13243k
            if (r0 != 0) goto L71
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.core.content.pm.SHORTCUT_LISTENER"
            r2.<init>(r3)
            java.lang.String r3 = r8.getPackageName()
            r2.setPackage(r3)
            r3 = 128(0x80, float:1.794E-43)
            java.util.List r1 = r1.queryIntentActivities(r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r1.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 != 0) goto L36
            goto L25
        L36:
            android.os.Bundle r2 = r2.metaData
            if (r2 != 0) goto L3b
            goto L25
        L3b:
            java.lang.String r3 = "androidx.core.content.pm.shortcut_listener_impl"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L44
            goto L25
        L44:
            java.lang.Class<l0.y> r3 = l0.y.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L25
            r4 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = "getInstance"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L25
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch: java.lang.Exception -> L25
            java.lang.reflect.Method r2 = r2.getMethod(r3, r6)     // Catch: java.lang.Exception -> L25
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L25
            r3[r4] = r8     // Catch: java.lang.Exception -> L25
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L25
            l0.l r2 = (l0.l) r2     // Catch: java.lang.Exception -> L25
            r0.add(r2)     // Catch: java.lang.Exception -> L25
            goto L25
        L6b:
            java.util.List<l0.l> r8 = l0.y.f13243k
            if (r8 != 0) goto L71
            l0.y.f13243k = r0
        L71:
            java.util.List<l0.l> r8 = l0.y.f13243k
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.y.n(android.content.Context):java.util.List");
    }

    public static u<?> o(Context context) {
        if (f13242j == null) {
            try {
                f13242j = (u) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, y.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f13242j == null) {
                f13242j = new u.a();
            }
        }
        return f13242j;
    }

    @o0
    public static List<r> p(@o0 Context context, int i7) {
        List shortcuts;
        if (Build.VERSION.SDK_INT >= 30) {
            shortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i7);
            return r.c(context, shortcuts);
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        if ((i7 & 1) != 0) {
            arrayList.addAll(shortcutManager.getManifestShortcuts());
        }
        if ((i7 & 2) != 0) {
            arrayList.addAll(shortcutManager.getDynamicShortcuts());
        }
        if ((i7 & 4) != 0) {
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
        }
        return r.c(context, arrayList);
    }

    public static boolean q(@o0 Context context) {
        g1.s.l(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive();
    }

    public static boolean r(@o0 Context context) {
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    public static boolean s(@o0 Context context, @o0 r rVar) {
        g1.s.l(context);
        g1.s.l(rVar);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 <= 32 && rVar.E(1)) {
            Iterator<l> it = n(context).iterator();
            while (it.hasNext()) {
                it.next().b(Collections.singletonList(rVar));
            }
            return true;
        }
        int k7 = k(context);
        if (k7 == 0) {
            return false;
        }
        if (i7 <= 29) {
            b(context, rVar);
        }
        if (i7 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(rVar.H());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= k7) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(b.a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(rVar.H()));
        }
        u<?> o6 = o(context);
        try {
            List<r> b7 = o6.b();
            if (b7.size() >= k7) {
                o6.d(Arrays.asList(m(b7)));
            }
            o6.a(Arrays.asList(rVar));
            Iterator<l> it2 = n(context).iterator();
            while (it2.hasNext()) {
                it2.next().b(Collections.singletonList(rVar));
            }
            x(context, rVar.k());
            return true;
        } catch (Exception unused) {
            Iterator<l> it3 = n(context).iterator();
            while (it3.hasNext()) {
                it3.next().b(Collections.singletonList(rVar));
            }
            x(context, rVar.k());
            return false;
        } catch (Throwable th) {
            Iterator<l> it4 = n(context).iterator();
            while (it4.hasNext()) {
                it4.next().b(Collections.singletonList(rVar));
            }
            x(context, rVar.k());
            throw th;
        }
    }

    public static void t(@o0 Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        o(context).c();
        Iterator<l> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static void u(@o0 Context context, @o0 List<String> list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        o(context).d(list);
        Iterator<l> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void v(@o0 Context context, @o0 List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            u(context, list);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        o(context).d(list);
        Iterator<l> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    @o0
    public static List<r> w(@o0 List<r> list, int i7) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (r rVar : list) {
            if (rVar.E(i7)) {
                arrayList.remove(rVar);
            }
        }
        return arrayList;
    }

    public static void x(@o0 Context context, @o0 String str) {
        g1.s.l(context);
        g1.s.l(str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator<l> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().e(Collections.singletonList(str));
        }
    }

    public static boolean y(@o0 Context context, @o0 r rVar, @q0 IntentSender intentSender) {
        if (Build.VERSION.SDK_INT > 32 || !rVar.E(1)) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(rVar.H(), intentSender);
        }
        return false;
    }

    public static boolean z(@o0 Context context, @o0 List<r> list) {
        g1.s.l(context);
        g1.s.l(list);
        List<r> w6 = w(list, 1);
        ArrayList arrayList = new ArrayList(w6.size());
        Iterator<r> it = w6.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().H());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
            o(context).c();
            o(context).a(w6);
            for (l lVar : n(context)) {
                lVar.a();
                lVar.b(list);
            }
            return true;
        }
        return false;
    }
}
