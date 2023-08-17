package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import d.b1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class w<E> extends t {
    @d.q0

    /* renamed from: b  reason: collision with root package name */
    public final Activity f4556b;
    @d.o0

    /* renamed from: c  reason: collision with root package name */
    public final Context f4557c;
    @d.o0

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4558d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4559e;

    /* renamed from: f  reason: collision with root package name */
    public final FragmentManager f4560f;

    public w(@d.o0 Context context, @d.o0 Handler handler, int i7) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i7);
    }

    @Deprecated
    public void A(@d.o0 Fragment fragment, @d.o0 IntentSender intentSender, int i7, @d.q0 Intent intent, int i8, int i9, int i10, @d.q0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i7 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        i0.b.R(this.f4556b, intentSender, i7, intent, i8, i9, i10, bundle);
    }

    public void B() {
    }

    @Override // androidx.fragment.app.t
    @d.q0
    public View e(int i7) {
        return null;
    }

    @Override // androidx.fragment.app.t
    public boolean g() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @d.q0
    public Activity j() {
        return this.f4556b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @d.o0
    public Context k() {
        return this.f4557c;
    }

    @d.b1({b1.a.LIBRARY})
    @d.o0
    public Handler l() {
        return this.f4558d;
    }

    public void m(@d.o0 String str, @d.q0 FileDescriptor fileDescriptor, @d.o0 PrintWriter printWriter, @d.q0 String[] strArr) {
    }

    @d.q0
    public abstract E q();

    @d.o0
    public LayoutInflater s() {
        return LayoutInflater.from(this.f4557c);
    }

    public int t() {
        return this.f4559e;
    }

    public boolean u() {
        return true;
    }

    @Deprecated
    public void v(@d.o0 Fragment fragment, @d.o0 String[] strArr, int i7) {
    }

    public boolean w(@d.o0 Fragment fragment) {
        return true;
    }

    public boolean x(@d.o0 String str) {
        return false;
    }

    public void y(@d.o0 Fragment fragment, @d.o0 Intent intent, int i7) {
        z(fragment, intent, i7, null);
    }

    public void z(@d.o0 Fragment fragment, @d.o0 Intent intent, int i7, @d.q0 Bundle bundle) {
        if (i7 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        k0.d.w(this.f4557c, intent, bundle);
    }

    public w(@d.o0 FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    public w(@d.q0 Activity activity, @d.o0 Context context, @d.o0 Handler handler, int i7) {
        this.f4560f = new g0();
        this.f4556b = activity;
        this.f4557c = (Context) g1.s.m(context, "context == null");
        this.f4558d = (Handler) g1.s.m(handler, "handler == null");
        this.f4559e = i7;
    }
}
