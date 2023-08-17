package i0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import d.b1;
import i0.b;
import i0.w3;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import z0.a;
/* loaded from: classes.dex */
public class b extends k0.d {

    /* renamed from: i  reason: collision with root package name */
    public static k f10449i;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ String[] f10450k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Activity f10451l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ int f10452m;

        public a(String[] strArr, Activity activity, int i7) {
            this.f10450k = strArr;
            this.f10451l = activity;
            this.f10452m = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f10450k.length];
            PackageManager packageManager = this.f10451l.getPackageManager();
            String packageName = this.f10451l.getPackageName();
            int length = this.f10450k.length;
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = packageManager.checkPermission(this.f10450k[i7], packageName);
            }
            ((j) this.f10451l).onRequestPermissionsResult(this.f10452m, this.f10450k, iArr);
        }
    }

    @d.w0(16)
    /* renamed from: i0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0124b {
        @d.u
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        @d.u
        public static void b(Activity activity, Intent intent, int i7, Bundle bundle) {
            activity.startActivityForResult(intent, i7, bundle);
        }

        @d.u
        public static void c(Activity activity, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        @d.u
        public static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @d.u
        public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @d.u
        public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @d.u
        public static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    @d.w0(22)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @d.u
        public static void b(Activity activity, String[] strArr, int i7) {
            activity.requestPermissions(strArr, i7);
        }

        @d.u
        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class f {
        @d.u
        public static <T> T a(Activity activity, int i7) {
            View requireViewById;
            requireViewById = activity.requireViewById(i7);
            return (T) requireViewById;
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class g {
        @d.u
        public static Display a(ContextWrapper contextWrapper) {
            Display display;
            display = contextWrapper.getDisplay();
            return display;
        }

        @d.u
        public static void b(@d.o0 Activity activity, @d.q0 k0.o0 o0Var, @d.q0 Bundle bundle) {
            activity.setLocusContext(o0Var == null ? null : o0Var.c(), bundle);
        }
    }

    @d.w0(31)
    /* loaded from: classes.dex */
    public static class h {
        @d.u
        public static boolean a(@d.o0 Activity activity) {
            boolean isLaunchedFromBubble;
            isLaunchedFromBubble = activity.isLaunchedFromBubble();
            return isLaunchedFromBubble;
        }

        @d.u
        @SuppressLint({"BanUncheckedReflection"})
        public static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    @d.w0(32)
    /* loaded from: classes.dex */
    public static class i {
        @d.u
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        void onRequestPermissionsResult(int i7, @d.o0 String[] strArr, @d.o0 int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a(@d.o0 Activity activity, @d.g0(from = 0) int i7, int i8, @d.q0 Intent intent);

        boolean b(@d.o0 Activity activity, @d.o0 String[] strArr, @d.g0(from = 0) int i7);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface l {
        void a(int i7);
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class m extends SharedElementCallback {

        /* renamed from: a  reason: collision with root package name */
        public final w3 f10453a;

        public m(w3 w3Var) {
            this.f10453a = w3Var;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f10453a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f10453a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f10453a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f10453a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f10453a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f10453a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @d.w0(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f10453a.h(list, list2, new w3.a() { // from class: i0.g
                @Override // i0.w3.a
                public final void a() {
                    b.e.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    public static void A(@d.o0 Activity activity) {
        c.a(activity);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public static k B() {
        return f10449i;
    }

    @d.q0
    public static Uri C(@d.o0 Activity activity) {
        return d.a(activity);
    }

    @Deprecated
    public static boolean D(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean E(@d.o0 Activity activity) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            return h.a(activity);
        }
        if (i7 == 30) {
            return (g.a(activity) == null || g.a(activity).getDisplayId() == 0) ? false : true;
        } else if (i7 == 29) {
            return (activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
        } else {
            return false;
        }
    }

    public static /* synthetic */ void F(Activity activity) {
        if (activity.isFinishing() || i0.j.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void G(@d.o0 Activity activity) {
        c.b(activity);
    }

    public static void H(@d.o0 final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: i0.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.F(activity);
                }
            });
        }
    }

    @d.q0
    public static androidx.core.view.h0 I(@d.o0 Activity activity, @d.o0 DragEvent dragEvent) {
        return androidx.core.view.h0.b(activity, dragEvent);
    }

    @d.s0(markerClass = {a.b.class})
    public static void J(@d.o0 Activity activity, @d.o0 String[] strArr, @d.g0(from = 0) int i7) {
        k kVar = f10449i;
        if (kVar == null || !kVar.b(activity, strArr, i7)) {
            HashSet hashSet = new HashSet();
            for (int i8 = 0; i8 < strArr.length; i8++) {
                if (TextUtils.isEmpty(strArr[i8])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (!z0.a.k() && TextUtils.equals(strArr[i8], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i8));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i9 = 0;
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    if (!hashSet.contains(Integer.valueOf(i10))) {
                        strArr2[i9] = strArr[i10];
                        i9++;
                    }
                }
            }
            if (activity instanceof l) {
                ((l) activity).a(i7);
            }
            e.b(activity, strArr, i7);
        }
    }

    @d.o0
    public static <T extends View> T K(@d.o0 Activity activity, @d.d0 int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) f.a(activity, i7);
        }
        T t6 = (T) activity.findViewById(i7);
        if (t6 != null) {
            return t6;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void L(@d.o0 Activity activity, @d.q0 w3 w3Var) {
        c.c(activity, w3Var != null ? new m(w3Var) : null);
    }

    public static void M(@d.o0 Activity activity, @d.q0 w3 w3Var) {
        c.d(activity, w3Var != null ? new m(w3Var) : null);
    }

    public static void N(@d.o0 Activity activity, @d.q0 k0.o0 o0Var, @d.q0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            g.b(activity, o0Var, bundle);
        }
    }

    public static void O(@d.q0 k kVar) {
        f10449i = kVar;
    }

    @d.s0(markerClass = {a.b.class})
    public static boolean P(@d.o0 Activity activity, @d.o0 String str) {
        if (z0.a.k() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            int i7 = Build.VERSION.SDK_INT;
            return i7 >= 32 ? i.a(activity, str) : i7 == 31 ? h.b(activity, str) : e.c(activity, str);
        }
        return false;
    }

    public static void Q(@d.o0 Activity activity, @d.o0 Intent intent, int i7, @d.q0 Bundle bundle) {
        C0124b.b(activity, intent, i7, bundle);
    }

    public static void R(@d.o0 Activity activity, @d.o0 IntentSender intentSender, int i7, @d.q0 Intent intent, int i8, int i9, int i10, @d.q0 Bundle bundle) throws IntentSender.SendIntentException {
        C0124b.c(activity, intentSender, i7, intent, i8, i9, i10, bundle);
    }

    public static void S(@d.o0 Activity activity) {
        c.e(activity);
    }

    public static void z(@d.o0 Activity activity) {
        C0124b.a(activity);
    }
}
