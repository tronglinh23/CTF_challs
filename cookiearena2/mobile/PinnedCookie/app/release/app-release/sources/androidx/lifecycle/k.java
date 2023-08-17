package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes.dex */
public class k implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@n6.d Activity activity, @n6.e Bundle bundle) {
        u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@n6.d Activity activity) {
        u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@n6.d Activity activity) {
        u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@n6.d Activity activity) {
        u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@n6.d Activity activity, @n6.d Bundle bundle) {
        u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
        u4.l0.p(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@n6.d Activity activity) {
        u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@n6.d Activity activity) {
        u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
    }
}
