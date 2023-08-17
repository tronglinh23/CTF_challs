package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import i0.b;
import i0.n3;
import i0.t2;
import i0.v2;
import i0.w3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements b.j, b.l {
    public static final String A = "android:support:lifecycle";

    /* renamed from: v  reason: collision with root package name */
    public final u f4207v;

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.b0 f4208w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4209x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4210y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4211z;

    /* loaded from: classes.dex */
    public class a extends w<FragmentActivity> implements k0.q0, k0.r0, t2, v2, androidx.lifecycle.f1, androidx.activity.t, androidx.activity.result.k, e3.d, l0, androidx.core.view.u0 {
        public a() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.w
        public void B() {
            invalidateMenu();
        }

        @Override // androidx.fragment.app.w
        /* renamed from: C  reason: merged with bridge method [inline-methods] */
        public FragmentActivity q() {
            return FragmentActivity.this;
        }

        @Override // androidx.fragment.app.l0
        public void a(@d.o0 FragmentManager fragmentManager, @d.o0 Fragment fragment) {
            FragmentActivity.this.T(fragment);
        }

        @Override // androidx.core.view.u0
        public void addMenuProvider(@d.o0 androidx.core.view.a1 a1Var) {
            FragmentActivity.this.addMenuProvider(a1Var);
        }

        @Override // k0.q0
        public void b(@d.o0 g1.e<Configuration> eVar) {
            FragmentActivity.this.b(eVar);
        }

        @Override // k0.q0
        public void d(@d.o0 g1.e<Configuration> eVar) {
            FragmentActivity.this.d(eVar);
        }

        @Override // androidx.fragment.app.w, androidx.fragment.app.t
        @d.q0
        public View e(int i7) {
            return FragmentActivity.this.findViewById(i7);
        }

        @Override // i0.v2
        public void f(@d.o0 g1.e<n3> eVar) {
            FragmentActivity.this.f(eVar);
        }

        @Override // androidx.fragment.app.w, androidx.fragment.app.t
        public boolean g() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.z
        @d.o0
        public androidx.lifecycle.p getLifecycle() {
            return FragmentActivity.this.f4208w;
        }

        @Override // androidx.activity.t
        @d.o0
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // e3.d
        @d.o0
        public androidx.savedstate.a getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.f1
        @d.o0
        public androidx.lifecycle.e1 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // i0.t2
        public void h(@d.o0 g1.e<i0.w> eVar) {
            FragmentActivity.this.h(eVar);
        }

        @Override // i0.v2
        public void i(@d.o0 g1.e<n3> eVar) {
            FragmentActivity.this.i(eVar);
        }

        @Override // androidx.core.view.u0
        public void invalidateMenu() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.w
        public void m(@d.o0 String str, @d.q0 FileDescriptor fileDescriptor, @d.o0 PrintWriter printWriter, @d.q0 String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // k0.r0
        public void n(@d.o0 g1.e<Integer> eVar) {
            FragmentActivity.this.n(eVar);
        }

        @Override // androidx.activity.result.k
        @d.o0
        public ActivityResultRegistry o() {
            return FragmentActivity.this.o();
        }

        @Override // i0.t2
        public void p(@d.o0 g1.e<i0.w> eVar) {
            FragmentActivity.this.p(eVar);
        }

        @Override // k0.r0
        public void r(@d.o0 g1.e<Integer> eVar) {
            FragmentActivity.this.r(eVar);
        }

        @Override // androidx.core.view.u0
        public void removeMenuProvider(@d.o0 androidx.core.view.a1 a1Var) {
            FragmentActivity.this.removeMenuProvider(a1Var);
        }

        @Override // androidx.fragment.app.w
        @d.o0
        public LayoutInflater s() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.w
        public int t() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.w
        public boolean u() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.w
        public boolean w(@d.o0 Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.w
        public boolean x(@d.o0 String str) {
            return i0.b.P(FragmentActivity.this, str);
        }

        @Override // androidx.core.view.u0
        public void addMenuProvider(@d.o0 androidx.core.view.a1 a1Var, @d.o0 androidx.lifecycle.z zVar) {
            FragmentActivity.this.addMenuProvider(a1Var, zVar);
        }

        @Override // androidx.core.view.u0
        public void addMenuProvider(@d.o0 androidx.core.view.a1 a1Var, @d.o0 androidx.lifecycle.z zVar, @d.o0 p.b bVar) {
            FragmentActivity.this.addMenuProvider(a1Var, zVar, bVar);
        }
    }

    public FragmentActivity() {
        this.f4207v = u.b(new a());
        this.f4208w = new androidx.lifecycle.b0(this);
        this.f4211z = true;
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle N() {
        R();
        this.f4208w.l(p.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(Configuration configuration) {
        this.f4207v.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(Intent intent) {
        this.f4207v.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(Context context) {
        this.f4207v.a(null);
    }

    public static boolean S(FragmentManager fragmentManager, p.b bVar) {
        boolean z6 = false;
        for (Fragment fragment : fragmentManager.J0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z6 |= S(fragment.getChildFragmentManager(), bVar);
                }
                z0 z0Var = fragment.mViewLifecycleOwner;
                if (z0Var != null && z0Var.getLifecycle().b().d(p.b.STARTED)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    z6 = true;
                }
                if (fragment.mLifecycleRegistry.b().d(p.b.STARTED)) {
                    fragment.mLifecycleRegistry.s(bVar);
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @d.q0
    public final View J(@d.q0 View view, @d.o0 String str, @d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        return this.f4207v.G(view, str, context, attributeSet);
    }

    @d.o0
    public FragmentManager K() {
        return this.f4207v.D();
    }

    @d.o0
    @Deprecated
    public o2.a L() {
        return o2.a.d(this);
    }

    public final void M() {
        getSavedStateRegistry().j(A, new a.c() { // from class: androidx.fragment.app.o
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle N;
                N = FragmentActivity.this.N();
                return N;
            }
        });
        b(new g1.e() { // from class: androidx.fragment.app.p
            @Override // g1.e
            public final void accept(Object obj) {
                FragmentActivity.this.O((Configuration) obj);
            }
        });
        j(new g1.e() { // from class: androidx.fragment.app.q
            @Override // g1.e
            public final void accept(Object obj) {
                FragmentActivity.this.P((Intent) obj);
            }
        });
        c(new a.d() { // from class: androidx.fragment.app.r
            @Override // a.d
            public final void a(Context context) {
                FragmentActivity.this.Q(context);
            }
        });
    }

    public void R() {
        do {
        } while (S(K(), p.b.CREATED));
    }

    @d.l0
    @Deprecated
    public void T(@d.o0 Fragment fragment) {
    }

    public void U() {
        this.f4208w.l(p.a.ON_RESUME);
        this.f4207v.r();
    }

    public void V(@d.q0 w3 w3Var) {
        i0.b.L(this, w3Var);
    }

    public void W(@d.q0 w3 w3Var) {
        i0.b.M(this, w3Var);
    }

    public void X(@d.o0 Fragment fragment, @d.o0 Intent intent, int i7) {
        Y(fragment, intent, i7, null);
    }

    public void Y(@d.o0 Fragment fragment, @d.o0 Intent intent, int i7, @d.q0 Bundle bundle) {
        if (i7 == -1) {
            i0.b.Q(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i7, bundle);
        }
    }

    @Deprecated
    public void Z(@d.o0 Fragment fragment, @d.o0 IntentSender intentSender, int i7, @d.q0 Intent intent, int i8, int i9, int i10, @d.q0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i7 == -1) {
            i0.b.R(this, intentSender, i7, intent, i8, i9, i10, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
        }
    }

    @Override // i0.b.l
    @Deprecated
    public final void a(int i7) {
    }

    public void a0() {
        i0.b.A(this);
    }

    @Deprecated
    public void b0() {
        invalidateMenu();
    }

    public void c0() {
        i0.b.G(this);
    }

    public void d0() {
        i0.b.S(this);
    }

    @Override // android.app.Activity
    public void dump(@d.o0 String str, @d.q0 FileDescriptor fileDescriptor, @d.o0 PrintWriter printWriter, @d.q0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (u(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f4209x);
            printWriter.print(" mResumed=");
            printWriter.print(this.f4210y);
            printWriter.print(" mStopped=");
            printWriter.print(this.f4211z);
            if (getApplication() != null) {
                o2.a.d(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.f4207v.D().e0(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @d.i
    public void onActivityResult(int i7, int i8, @d.q0 Intent intent) {
        this.f4207v.F();
        super.onActivityResult(i7, i8, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@d.q0 Bundle bundle) {
        super.onCreate(bundle);
        this.f4208w.l(p.a.ON_CREATE);
        this.f4207v.f();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @d.q0
    public View onCreateView(@d.q0 View view, @d.o0 String str, @d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        View J = J(view, str, context, attributeSet);
        return J == null ? super.onCreateView(view, str, context, attributeSet) : J;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f4207v.h();
        this.f4208w.l(p.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, @d.o0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return this.f4207v.e(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f4210y = false;
        this.f4207v.n();
        this.f4208w.l(p.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        U();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @d.i
    public void onRequestPermissionsResult(int i7, @d.o0 String[] strArr, @d.o0 int[] iArr) {
        this.f4207v.F();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f4207v.F();
        super.onResume();
        this.f4210y = true;
        this.f4207v.z();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f4207v.F();
        super.onStart();
        this.f4211z = false;
        if (!this.f4209x) {
            this.f4209x = true;
            this.f4207v.c();
        }
        this.f4207v.z();
        this.f4208w.l(p.a.ON_START);
        this.f4207v.s();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f4207v.F();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f4211z = true;
        R();
        this.f4207v.t();
        this.f4208w.l(p.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @d.q0
    public View onCreateView(@d.o0 String str, @d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        View J = J(null, str, context, attributeSet);
        return J == null ? super.onCreateView(str, context, attributeSet) : J;
    }

    @d.o
    public FragmentActivity(@d.j0 int i7) {
        super(i7);
        this.f4207v = u.b(new a());
        this.f4208w = new androidx.lifecycle.b0(this);
        this.f4211z = true;
        M();
    }
}
