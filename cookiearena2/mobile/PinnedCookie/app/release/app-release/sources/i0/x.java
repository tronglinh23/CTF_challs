package i0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10955a = "NavUtils";

    /* renamed from: b  reason: collision with root package name */
    public static final String f10956b = "android.support.PARENT_ACTIVITY";

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static Intent a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @d.u
        public static boolean b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @d.u
        public static boolean c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    @d.q0
    public static Intent a(@d.o0 Activity activity) {
        Intent a7 = a.a(activity);
        if (a7 != null) {
            return a7;
        }
        String d7 = d(activity);
        if (d7 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, d7);
        try {
            return e(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(f10955a, "getParentActivityIntent: bad parentActivityName '" + d7 + "' in manifest");
            return null;
        }
    }

    @d.q0
    public static Intent b(@d.o0 Context context, @d.o0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String e7 = e(context, componentName);
        if (e7 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), e7);
        return e(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @d.q0
    public static Intent c(@d.o0 Context context, @d.o0 Class<?> cls) throws PackageManager.NameNotFoundException {
        String e7 = e(context, new ComponentName(context, cls));
        if (e7 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, e7);
        return e(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }

    @d.q0
    public static String d(@d.o0 Activity activity) {
        try {
            return e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    @d.q0
    public static String e(@d.o0 Context context, @d.o0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(f10956b)) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static void f(@d.o0 Activity activity) {
        Intent a7 = a(activity);
        if (a7 != null) {
            g(activity, a7);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    public static void g(@d.o0 Activity activity, @d.o0 Intent intent) {
        a.b(activity, intent);
    }

    public static boolean h(@d.o0 Activity activity, @d.o0 Intent intent) {
        return a.c(activity, intent);
    }
}
