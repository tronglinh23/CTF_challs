package i0;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import i0.k0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
@d.w0(16)
/* loaded from: classes.dex */
public class o2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10764a = "NotificationCompat";

    /* renamed from: b  reason: collision with root package name */
    public static final String f10765b = "android.support.dataRemoteInputs";

    /* renamed from: c  reason: collision with root package name */
    public static final String f10766c = "android.support.allowGeneratedReplies";

    /* renamed from: d  reason: collision with root package name */
    public static final String f10767d = "icon";

    /* renamed from: e  reason: collision with root package name */
    public static final String f10768e = "title";

    /* renamed from: f  reason: collision with root package name */
    public static final String f10769f = "actionIntent";

    /* renamed from: g  reason: collision with root package name */
    public static final String f10770g = "extras";

    /* renamed from: h  reason: collision with root package name */
    public static final String f10771h = "remoteInputs";

    /* renamed from: i  reason: collision with root package name */
    public static final String f10772i = "dataOnlyRemoteInputs";

    /* renamed from: j  reason: collision with root package name */
    public static final String f10773j = "resultKey";

    /* renamed from: k  reason: collision with root package name */
    public static final String f10774k = "label";

    /* renamed from: l  reason: collision with root package name */
    public static final String f10775l = "choices";

    /* renamed from: m  reason: collision with root package name */
    public static final String f10776m = "allowFreeFormInput";

    /* renamed from: n  reason: collision with root package name */
    public static final String f10777n = "allowedDataTypes";

    /* renamed from: o  reason: collision with root package name */
    public static final String f10778o = "semanticAction";

    /* renamed from: p  reason: collision with root package name */
    public static final String f10779p = "showsUserInterface";

    /* renamed from: r  reason: collision with root package name */
    public static Field f10781r;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f10782s;

    /* renamed from: u  reason: collision with root package name */
    public static Field f10784u;

    /* renamed from: v  reason: collision with root package name */
    public static Field f10785v;

    /* renamed from: w  reason: collision with root package name */
    public static Field f10786w;

    /* renamed from: x  reason: collision with root package name */
    public static Field f10787x;

    /* renamed from: y  reason: collision with root package name */
    public static boolean f10788y;

    /* renamed from: q  reason: collision with root package name */
    public static final Object f10780q = new Object();

    /* renamed from: t  reason: collision with root package name */
    public static final Object f10783t = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            Bundle bundle = list.get(i7);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i7, bundle);
            }
        }
        return sparseArray;
    }

    public static boolean b() {
        if (f10788y) {
            return false;
        }
        try {
            if (f10784u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f10785v = cls.getDeclaredField("icon");
                f10786w = cls.getDeclaredField(f10768e);
                f10787x = cls.getDeclaredField(f10769f);
                Field declaredField = Notification.class.getDeclaredField(k0.z.f10734y);
                f10784u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException e7) {
            Log.e(f10764a, "Unable to access notification actions", e7);
            f10788y = true;
        } catch (NoSuchFieldException e8) {
            Log.e(f10764a, "Unable to access notification actions", e8);
            f10788y = true;
        }
        return !f10788y;
    }

    public static q3 c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f10777n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new q3(bundle.getString(f10773j), bundle.getCharSequence(f10774k), bundle.getCharSequenceArray(f10775l), bundle.getBoolean(f10776m), 0, bundle.getBundle("extras"), hashSet);
    }

    public static q3[] d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        q3[] q3VarArr = new q3[bundleArr.length];
        for (int i7 = 0; i7 < bundleArr.length; i7++) {
            q3VarArr[i7] = c(bundleArr[i7]);
        }
        return q3VarArr;
    }

    public static k0.b e(Notification notification, int i7) {
        SparseArray sparseParcelableArray;
        synchronized (f10783t) {
            try {
                try {
                    Object[] h7 = h(notification);
                    if (h7 != null) {
                        Object obj = h7[i7];
                        Bundle k7 = k(notification);
                        return l(f10785v.getInt(obj), (CharSequence) f10786w.get(obj), (PendingIntent) f10787x.get(obj), (k7 == null || (sparseParcelableArray = k7.getSparseParcelableArray(n2.f10760e)) == null) ? null : (Bundle) sparseParcelableArray.get(i7));
                    }
                } catch (IllegalAccessException e7) {
                    Log.e(f10764a, "Unable to access notification actions", e7);
                    f10788y = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int f(Notification notification) {
        int length;
        synchronized (f10783t) {
            Object[] h7 = h(notification);
            length = h7 != null ? h7.length : 0;
        }
        return length;
    }

    public static k0.b g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new k0.b(bundle.getInt("icon"), bundle.getCharSequence(f10768e), (PendingIntent) bundle.getParcelable(f10769f), bundle.getBundle("extras"), d(i(bundle, f10771h)), d(i(bundle, f10772i)), bundle2 != null ? bundle2.getBoolean(f10766c, false) : false, bundle.getInt(f10778o), bundle.getBoolean(f10779p), false, false);
    }

    public static Object[] h(Notification notification) {
        synchronized (f10783t) {
            if (b()) {
                try {
                    return (Object[]) f10784u.get(notification);
                } catch (IllegalAccessException e7) {
                    Log.e(f10764a, "Unable to access notification actions", e7);
                    f10788y = true;
                    return null;
                }
            }
            return null;
        }
    }

    public static Bundle[] i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    public static Bundle j(k0.b bVar) {
        Bundle bundle = new Bundle();
        IconCompat f7 = bVar.f();
        bundle.putInt("icon", f7 != null ? f7.t() : 0);
        bundle.putCharSequence(f10768e, bVar.j());
        bundle.putParcelable(f10769f, bVar.a());
        Bundle bundle2 = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle2.putBoolean(f10766c, bVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray(f10771h, n(bVar.g()));
        bundle.putBoolean(f10779p, bVar.i());
        bundle.putInt(f10778o, bVar.h());
        return bundle;
    }

    public static Bundle k(Notification notification) {
        synchronized (f10780q) {
            if (f10782s) {
                return null;
            }
            try {
                if (f10781r == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(f10764a, "Notification.extras field is not of type Bundle");
                        f10782s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f10781r = declaredField;
                }
                Bundle bundle = (Bundle) f10781r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f10781r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e7) {
                Log.e(f10764a, "Unable to access notification extras", e7);
                f10782s = true;
                return null;
            } catch (NoSuchFieldException e8) {
                Log.e(f10764a, "Unable to access notification extras", e8);
                f10782s = true;
                return null;
            }
        }
    }

    public static k0.b l(int i7, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        q3[] q3VarArr;
        q3[] q3VarArr2;
        boolean z6;
        if (bundle != null) {
            q3VarArr = d(i(bundle, n2.f10761f));
            q3VarArr2 = d(i(bundle, f10765b));
            z6 = bundle.getBoolean(f10766c);
        } else {
            q3VarArr = null;
            q3VarArr2 = null;
            z6 = false;
        }
        return new k0.b(i7, charSequence, pendingIntent, bundle, q3VarArr, q3VarArr2, z6, 0, true, false, false);
    }

    public static Bundle m(q3 q3Var) {
        Bundle bundle = new Bundle();
        bundle.putString(f10773j, q3Var.o());
        bundle.putCharSequence(f10774k, q3Var.n());
        bundle.putCharSequenceArray(f10775l, q3Var.h());
        bundle.putBoolean(f10776m, q3Var.f());
        bundle.putBundle("extras", q3Var.m());
        Set<String> g7 = q3Var.g();
        if (g7 != null && !g7.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(g7.size());
            Iterator<String> it = g7.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList(f10777n, arrayList);
        }
        return bundle;
    }

    public static Bundle[] n(q3[] q3VarArr) {
        if (q3VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[q3VarArr.length];
        for (int i7 = 0; i7 < q3VarArr.length; i7++) {
            bundleArr[i7] = m(q3VarArr[i7]);
        }
        return bundleArr;
    }

    public static Bundle o(Notification.Builder builder, k0.b bVar) {
        IconCompat f7 = bVar.f();
        builder.addAction(f7 != null ? f7.t() : 0, bVar.j(), bVar.a());
        Bundle bundle = new Bundle(bVar.d());
        if (bVar.g() != null) {
            bundle.putParcelableArray(n2.f10761f, n(bVar.g()));
        }
        if (bVar.c() != null) {
            bundle.putParcelableArray(f10765b, n(bVar.c()));
        }
        bundle.putBoolean(f10766c, bVar.b());
        return bundle;
    }
}
