package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import d.l1;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class u {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final u f4841a = new u();
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f4842b = new AtomicBoolean(false);

    @l1
    /* loaded from: classes.dex */
    public static final class a extends k {
        @Override // androidx.lifecycle.k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@n6.d Activity activity, @n6.e Bundle bundle) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            p0.f4800c.d(activity);
        }
    }

    @s4.m
    public static final void a(@n6.d Context context) {
        u4.l0.p(context, "context");
        if (f4842b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        u4.l0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
