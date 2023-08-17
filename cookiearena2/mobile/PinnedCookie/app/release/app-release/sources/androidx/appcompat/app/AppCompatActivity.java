package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d2;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.g1;
import androidx.lifecycle.i1;
import androidx.savedstate.a;
import d.d0;
import d.j0;
import d.o0;
import d.q0;
import i0.x3;
import j.b;
/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements e, x3.b, b.c {
    public static final String D = "androidx:appcompat";
    public h B;
    public Resources C;

    /* loaded from: classes.dex */
    public class a implements a.c {
        public a() {
        }

        @Override // androidx.savedstate.a.c
        @o0
        public Bundle a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.e0().O(bundle);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public class b implements a.d {
        public b() {
        }

        @Override // a.d
        public void a(@o0 Context context) {
            h e02 = AppCompatActivity.this.e0();
            e02.C();
            e02.K(AppCompatActivity.this.getSavedStateRegistry().b(AppCompatActivity.D));
        }
    }

    public AppCompatActivity() {
        g0();
    }

    public final void B() {
        g1.b(getWindow().getDecorView(), this);
        i1.b(getWindow().getDecorView(), this);
        e3.f.b(getWindow().getDecorView(), this);
        androidx.activity.y.b(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        e0().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(e0().k(context));
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void b0() {
        e0().D();
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a f02 = f0();
        if (getWindow().hasFeature(0)) {
            if (f02 == null || !f02.l()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a f02 = f0();
        if (keyCode == 82 && f02 != null && f02.L(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @o0
    public h e0() {
        if (this.B == null) {
            this.B = h.l(this, this);
        }
        return this.B;
    }

    @q0
    public androidx.appcompat.app.a f0() {
        return e0().A();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@d0 int i7) {
        return (T) e0().q(i7);
    }

    @Override // androidx.appcompat.app.b.c
    @q0
    public b.InterfaceC0019b g() {
        return e0().u();
    }

    public final void g0() {
        getSavedStateRegistry().j(D, new a());
        c(new b());
    }

    @Override // android.app.Activity
    @o0
    public MenuInflater getMenuInflater() {
        return e0().x();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.C == null && d2.d()) {
            this.C = new d2(this, super.getResources());
        }
        Resources resources = this.C;
        return resources == null ? super.getResources() : resources;
    }

    public void h0(@o0 x3 x3Var) {
        x3Var.d(this);
    }

    public void i0(@o0 z0.u uVar) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        e0().D();
    }

    public void j0(int i7) {
    }

    public void k0(@o0 x3 x3Var) {
    }

    @Deprecated
    public void l0() {
    }

    public boolean m0() {
        Intent q6 = q();
        if (q6 != null) {
            if (!w0(q6)) {
                u0(q6);
                return true;
            }
            x3 g7 = x3.g(this);
            h0(g7);
            k0(g7);
            g7.o();
            try {
                i0.b.z(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    public final boolean n0(KeyEvent keyEvent) {
        return false;
    }

    public void o0(@q0 Toolbar toolbar) {
        e0().f0(toolbar);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@o0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e0().J(configuration);
        if (this.C != null) {
            this.C.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        l0();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e0().L();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (n0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, @o0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a f02 = f0();
        if (menuItem.getItemId() != 16908332 || f02 == null || (f02.p() & 4) == 0) {
            return false;
        }
        return m0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i7, Menu menu) {
        return super.onMenuOpened(i7, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, @o0 Menu menu) {
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(@q0 Bundle bundle) {
        super.onPostCreate(bundle);
        e0().M(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        e0().N();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        e0().P();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        e0().Q();
    }

    @Override // androidx.appcompat.app.e
    @d.i
    public void onSupportActionModeFinished(@o0 j.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    @d.i
    public void onSupportActionModeStarted(@o0 j.b bVar) {
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        e0().h0(charSequence);
    }

    @Override // androidx.appcompat.app.e
    @q0
    public j.b onWindowStartingSupportActionMode(@o0 b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a f02 = f0();
        if (getWindow().hasFeature(0)) {
            if (f02 == null || !f02.M()) {
                super.openOptionsMenu();
            }
        }
    }

    @Deprecated
    public void p0(int i7) {
    }

    @Override // i0.x3.b
    @q0
    public Intent q() {
        return i0.x.a(this);
    }

    @Deprecated
    public void q0(boolean z6) {
    }

    @Deprecated
    public void r0(boolean z6) {
    }

    @Deprecated
    public void s0(boolean z6) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@j0 int i7) {
        B();
        e0().X(i7);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@d.g1 int i7) {
        super.setTheme(i7);
        e0().g0(i7);
    }

    @q0
    public j.b t0(@o0 b.a aVar) {
        return e0().i0(aVar);
    }

    public void u0(@o0 Intent intent) {
        i0.x.g(this, intent);
    }

    public boolean v0(int i7) {
        return e0().T(i7);
    }

    public boolean w0(@o0 Intent intent) {
        return i0.x.h(this, intent);
    }

    @d.o
    public AppCompatActivity(@j0 int i7) {
        super(i7);
        g0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        B();
        e0().Y(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        e0().Z(view, layoutParams);
    }
}
