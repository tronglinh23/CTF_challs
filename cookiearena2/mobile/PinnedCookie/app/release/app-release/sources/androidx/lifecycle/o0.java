package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import d.l1;
/* loaded from: classes.dex */
public final class o0 implements z {

    /* renamed from: k  reason: collision with root package name */
    public static final long f4779k = 700;

    /* renamed from: b  reason: collision with root package name */
    public int f4781b;

    /* renamed from: c  reason: collision with root package name */
    public int f4782c;
    @n6.e

    /* renamed from: f  reason: collision with root package name */
    public Handler f4785f;
    @n6.d

    /* renamed from: j  reason: collision with root package name */
    public static final b f4778j = new b(null);
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final o0 f4780l = new o0();

    /* renamed from: d  reason: collision with root package name */
    public boolean f4783d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4784e = true;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public final b0 f4786g = new b0(this);
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f4787h = new Runnable() { // from class: androidx.lifecycle.m0
        @Override // java.lang.Runnable
        public final void run() {
            o0.i(o0.this);
        }
    };
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public final p0.a f4788i = new d();

    @d.w0(29)
    /* loaded from: classes.dex */
    public static final class a {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public static final a f4789a = new a();

        @d.u
        @s4.m
        public static final void a(@n6.d Activity activity, @n6.d Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            u4.l0.p(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(u4.w wVar) {
            this();
        }

        @l1
        public static /* synthetic */ void b() {
        }

        @n6.d
        @s4.m
        public final z a() {
            return o0.f4780l;
        }

        @s4.m
        public final void c(@n6.d Context context) {
            u4.l0.p(context, "context");
            o0.f4780l.h(context);
        }

        public b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends k {

        /* loaded from: classes.dex */
        public static final class a extends k {
            final /* synthetic */ o0 this$0;

            public a(o0 o0Var) {
                this.this$0 = o0Var;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@n6.d Activity activity) {
                u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@n6.d Activity activity) {
                u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
                this.this$0.f();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@n6.d Activity activity, @n6.e Bundle bundle) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            if (Build.VERSION.SDK_INT < 29) {
                p0.f4800c.b(activity).h(o0.this.f4788i);
            }
        }

        @Override // androidx.lifecycle.k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@n6.d Activity activity) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            o0.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @d.w0(29)
        public void onActivityPreCreated(@n6.d Activity activity, @n6.e Bundle bundle) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            a.a(activity, new a(o0.this));
        }

        @Override // androidx.lifecycle.k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@n6.d Activity activity) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            o0.this.g();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements p0.a {
        public d() {
        }

        @Override // androidx.lifecycle.p0.a
        public void a() {
        }

        @Override // androidx.lifecycle.p0.a
        public void b() {
            o0.this.e();
        }

        @Override // androidx.lifecycle.p0.a
        public void c() {
            o0.this.f();
        }
    }

    public static final void i(o0 o0Var) {
        u4.l0.p(o0Var, "this$0");
        o0Var.j();
        o0Var.k();
    }

    @n6.d
    @s4.m
    public static final z l() {
        return f4778j.a();
    }

    @s4.m
    public static final void m(@n6.d Context context) {
        f4778j.c(context);
    }

    public final void d() {
        int i7 = this.f4782c - 1;
        this.f4782c = i7;
        if (i7 == 0) {
            Handler handler = this.f4785f;
            u4.l0.m(handler);
            handler.postDelayed(this.f4787h, 700L);
        }
    }

    public final void e() {
        int i7 = this.f4782c + 1;
        this.f4782c = i7;
        if (i7 == 1) {
            if (this.f4783d) {
                this.f4786g.l(p.a.ON_RESUME);
                this.f4783d = false;
                return;
            }
            Handler handler = this.f4785f;
            u4.l0.m(handler);
            handler.removeCallbacks(this.f4787h);
        }
    }

    public final void f() {
        int i7 = this.f4781b + 1;
        this.f4781b = i7;
        if (i7 == 1 && this.f4784e) {
            this.f4786g.l(p.a.ON_START);
            this.f4784e = false;
        }
    }

    public final void g() {
        this.f4781b--;
        k();
    }

    @Override // androidx.lifecycle.z
    @n6.d
    public p getLifecycle() {
        return this.f4786g;
    }

    public final void h(@n6.d Context context) {
        u4.l0.p(context, "context");
        this.f4785f = new Handler();
        this.f4786g.l(p.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        u4.l0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f4782c == 0) {
            this.f4783d = true;
            this.f4786g.l(p.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f4781b == 0 && this.f4783d) {
            this.f4786g.l(p.a.ON_STOP);
            this.f4784e = true;
        }
    }
}
