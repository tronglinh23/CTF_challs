package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.p;
/* loaded from: classes.dex */
public class z0 implements androidx.lifecycle.o, e3.d, androidx.lifecycle.f1 {

    /* renamed from: b  reason: collision with root package name */
    public final Fragment f4591b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e1 f4592c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f4593d;

    /* renamed from: e  reason: collision with root package name */
    public c1.b f4594e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.lifecycle.b0 f4595f = null;

    /* renamed from: g  reason: collision with root package name */
    public e3.c f4596g = null;

    public z0(@d.o0 Fragment fragment, @d.o0 androidx.lifecycle.e1 e1Var, @d.o0 Runnable runnable) {
        this.f4591b = fragment;
        this.f4592c = e1Var;
        this.f4593d = runnable;
    }

    public void a(@d.o0 p.a aVar) {
        this.f4595f.l(aVar);
    }

    public void b() {
        if (this.f4595f == null) {
            this.f4595f = new androidx.lifecycle.b0(this);
            e3.c a7 = e3.c.a(this);
            this.f4596g = a7;
            a7.c();
            this.f4593d.run();
        }
    }

    public boolean c() {
        return this.f4595f != null;
    }

    public void d(@d.q0 Bundle bundle) {
        this.f4596g.d(bundle);
    }

    public void e(@d.o0 Bundle bundle) {
        this.f4596g.e(bundle);
    }

    public void f(@d.o0 p.b bVar) {
        this.f4595f.s(bVar);
    }

    @Override // androidx.lifecycle.o
    @d.i
    @d.o0
    public k2.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f4591b.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        k2.e eVar = new k2.e();
        if (application != null) {
            eVar.c(c1.a.f4720i, application);
        }
        eVar.c(androidx.lifecycle.s0.f4832c, this.f4591b);
        eVar.c(androidx.lifecycle.s0.f4833d, this);
        if (this.f4591b.getArguments() != null) {
            eVar.c(androidx.lifecycle.s0.f4834e, this.f4591b.getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.o
    @d.o0
    public c1.b getDefaultViewModelProviderFactory() {
        Application application;
        c1.b defaultViewModelProviderFactory = this.f4591b.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f4591b.mDefaultFactory)) {
            this.f4594e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f4594e == null) {
            Context applicationContext = this.f4591b.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            Fragment fragment = this.f4591b;
            this.f4594e = new androidx.lifecycle.v0(application, fragment, fragment.getArguments());
        }
        return this.f4594e;
    }

    @Override // androidx.lifecycle.z
    @d.o0
    public androidx.lifecycle.p getLifecycle() {
        b();
        return this.f4595f;
    }

    @Override // e3.d
    @d.o0
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f4596g.b();
    }

    @Override // androidx.lifecycle.f1
    @d.o0
    public androidx.lifecycle.e1 getViewModelStore() {
        b();
        return this.f4592c;
    }
}
