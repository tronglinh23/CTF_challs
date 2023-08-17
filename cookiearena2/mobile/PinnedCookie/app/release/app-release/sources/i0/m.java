package i0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10750a = "android.support.AppLaunchChecker";

    /* renamed from: b  reason: collision with root package name */
    public static final String f10751b = "startedFromLauncher";

    @Deprecated
    public m() {
    }

    public static boolean a(@d.o0 Context context) {
        return context.getSharedPreferences(f10750a, 0).getBoolean(f10751b, false);
    }

    public static void b(@d.o0 Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f10750a, 0);
        if (sharedPreferences.getBoolean(f10751b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(k0.i.f11475e)) {
            sharedPreferences.edit().putBoolean(f10751b, true).apply();
        }
    }
}
