package e3;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.savedstate.Recreator;
import s4.m;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class c {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final a f8748d = new a(null);
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final d f8749a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final androidx.savedstate.a f8750b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8751c;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        @n6.d
        @m
        public final c a(@n6.d d dVar) {
            l0.p(dVar, "owner");
            return new c(dVar, null);
        }

        public a() {
        }
    }

    public /* synthetic */ c(d dVar, w wVar) {
        this(dVar);
    }

    @n6.d
    @m
    public static final c a(@n6.d d dVar) {
        return f8748d.a(dVar);
    }

    @n6.d
    public final androidx.savedstate.a b() {
        return this.f8750b;
    }

    @d.l0
    public final void c() {
        p lifecycle = this.f8749a.getLifecycle();
        if (!(lifecycle.b() == p.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new Recreator(this.f8749a));
        this.f8750b.g(lifecycle);
        this.f8751c = true;
    }

    @d.l0
    public final void d(@n6.e Bundle bundle) {
        if (!this.f8751c) {
            c();
        }
        p lifecycle = this.f8749a.getLifecycle();
        if ((!lifecycle.b().d(p.b.STARTED)) == true) {
            this.f8750b.h(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    @d.l0
    public final void e(@n6.d Bundle bundle) {
        l0.p(bundle, "outBundle");
        this.f8750b.i(bundle);
    }

    public c(d dVar) {
        this.f8749a = dVar;
        this.f8750b = new androidx.savedstate.a();
    }
}
