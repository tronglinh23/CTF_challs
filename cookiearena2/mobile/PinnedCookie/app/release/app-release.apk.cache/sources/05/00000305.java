package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.m;
import androidx.core.view.o0;
import androidx.lifecycle.b0;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.z;
import d.b1;
import d.i;
import d.q0;
import d.s0;
import z0.a;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements z, o0.a {

    /* renamed from: b  reason: collision with root package name */
    public m<Class<? extends a>, a> f3486b = new m<>();

    /* renamed from: c  reason: collision with root package name */
    public b0 f3487c = new b0(this);

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {
    }

    @s0(markerClass = {a.b.class})
    public static boolean v(@q0 String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        char c7 = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c7 = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c7 = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c7 = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c7 = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c7 = 4;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                return Build.VERSION.SDK_INT >= 31;
            case 1:
            case 2:
                return z0.a.k();
            case 3:
                return Build.VERSION.SDK_INT >= 29;
            case 4:
                return true;
            default:
                return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !o0.d(decorView, keyEvent)) {
            return o0.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !o0.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.core.view.o0.a
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean e(@d.o0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @d.o0
    public p getLifecycle() {
        return this.f3487c;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        p0.g(this);
    }

    @Override // android.app.Activity
    @i
    public void onSaveInstanceState(@d.o0 Bundle bundle) {
        this.f3487c.n(p.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public <T extends a> T s(Class<T> cls) {
        return (T) this.f3486b.get(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public void t(a aVar) {
        this.f3486b.put(aVar.getClass(), aVar);
    }

    public final boolean u(@q0 String[] strArr) {
        return !v(strArr);
    }
}