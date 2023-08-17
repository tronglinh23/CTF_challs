package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.p;
import androidx.lifecycle.z;
import d.l0;
import d.o0;
import d.w0;
import java.lang.reflect.Field;

@w0(19)
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.v {

    /* renamed from: l  reason: collision with root package name */
    public static final int f517l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f518m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f519n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static int f520o;

    /* renamed from: p  reason: collision with root package name */
    public static Field f521p;

    /* renamed from: q  reason: collision with root package name */
    public static Field f522q;

    /* renamed from: r  reason: collision with root package name */
    public static Field f523r;

    /* renamed from: k  reason: collision with root package name */
    public Activity f524k;

    public ImmLeaksCleaner(Activity activity) {
        this.f524k = activity;
    }

    @l0
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void h() {
        try {
            f520o = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f522q = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f523r = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f521p = declaredField3;
            declaredField3.setAccessible(true);
            f520o = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.v
    public void d(@o0 z zVar, @o0 p.a aVar) {
        if (aVar != p.a.ON_DESTROY) {
            return;
        }
        if (f520o == 0) {
            h();
        }
        if (f520o == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f524k.getSystemService("input_method");
            try {
                Object obj = f521p.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f522q.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f523r.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}