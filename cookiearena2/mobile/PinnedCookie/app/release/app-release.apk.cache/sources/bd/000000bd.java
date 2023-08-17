package androidx.activity;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f555a;

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f555a.run();
    }
}