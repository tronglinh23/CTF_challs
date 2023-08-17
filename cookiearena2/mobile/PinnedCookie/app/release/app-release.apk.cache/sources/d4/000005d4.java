package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.p;
import d.b1;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class p0 extends Fragment {
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final b f4800c = new b(null);
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final String f4801d = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public a f4802b;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(u4.w wVar) {
            this();
        }

        @s4.m
        public static /* synthetic */ void c(Activity activity) {
        }

        @s4.m
        public final void a(@n6.d Activity activity, @n6.d p.a aVar) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            u4.l0.p(aVar, i0.k0.I0);
            if (activity instanceof c0) {
                ((c0) activity).getLifecycle().l(aVar);
            } else if (activity instanceof z) {
                p lifecycle = ((z) activity).getLifecycle();
                if (lifecycle instanceof b0) {
                    ((b0) lifecycle).l(aVar);
                }
            }
        }

        @s4.h(name = "get")
        @n6.d
        public final p0 b(@n6.d Activity activity) {
            u4.l0.p(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag(p0.f4801d);
            u4.l0.n(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (p0) findFragmentByTag;
        }

        @s4.m
        public final void d(@n6.d Activity activity) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(p0.f4801d) == null) {
                fragmentManager.beginTransaction().add(new p0(), p0.f4801d).commit();
                fragmentManager.executePendingTransactions();
            }
        }

        public b() {
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        @n6.d
        public static final a Companion = new a(null);

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(u4.w wVar) {
                this();
            }

            @s4.m
            public final void a(@n6.d Activity activity) {
                u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
                activity.registerActivityLifecycleCallbacks(new c());
            }

            public a() {
            }
        }

        @s4.m
        public static final void registerIn(@n6.d Activity activity) {
            Companion.a(activity);
        }

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
        public void onActivityPostCreated(@n6.d Activity activity, @n6.e Bundle bundle) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            p0.f4800c.a(activity, p.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@n6.d Activity activity) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            p0.f4800c.a(activity, p.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@n6.d Activity activity) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            p0.f4800c.a(activity, p.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@n6.d Activity activity) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            p0.f4800c.a(activity, p.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@n6.d Activity activity) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            p0.f4800c.a(activity, p.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@n6.d Activity activity) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            p0.f4800c.a(activity, p.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@n6.d Activity activity) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@n6.d Activity activity, @n6.d Bundle bundle) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            u4.l0.p(bundle, "bundle");
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

    @s4.m
    public static final void b(@n6.d Activity activity, @n6.d p.a aVar) {
        f4800c.a(activity, aVar);
    }

    @s4.h(name = "get")
    @n6.d
    public static final p0 f(@n6.d Activity activity) {
        return f4800c.b(activity);
    }

    @s4.m
    public static final void g(@n6.d Activity activity) {
        f4800c.d(activity);
    }

    public final void a(p.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f4800c;
            Activity activity = getActivity();
            u4.l0.o(activity, androidx.appcompat.widget.d.f1516r);
            bVar.a(activity, aVar);
        }
    }

    public final void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void d(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void e(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void h(@n6.e a aVar) {
        this.f4802b = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@n6.e Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f4802b);
        a(p.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(p.a.ON_DESTROY);
        this.f4802b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(p.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.f4802b);
        a(p.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.f4802b);
        a(p.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(p.a.ON_STOP);
    }
}