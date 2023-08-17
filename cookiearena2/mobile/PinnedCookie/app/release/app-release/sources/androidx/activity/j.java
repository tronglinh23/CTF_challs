package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.b0;
import androidx.lifecycle.g1;
import androidx.lifecycle.p;
import androidx.lifecycle.z;
import u4.l0;
/* loaded from: classes.dex */
public class j extends Dialog implements z, t {
    @n6.e
    private b0 _lifecycleRegistry;
    @n6.d
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @s4.i
    public j(@n6.d Context context) {
        this(context, 0, 2, null);
        l0.p(context, "context");
    }

    public static /* synthetic */ void c() {
    }

    public static final void e(j jVar) {
        l0.p(jVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@n6.d View view, @n6.e ViewGroup.LayoutParams layoutParams) {
        l0.p(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    public final b0 b() {
        b0 b0Var = this._lifecycleRegistry;
        if (b0Var == null) {
            b0 b0Var2 = new b0(this);
            this._lifecycleRegistry = b0Var2;
            return b0Var2;
        }
        return b0Var;
    }

    public final void d() {
        Window window = getWindow();
        l0.m(window);
        g1.b(window.getDecorView(), this);
        Window window2 = getWindow();
        l0.m(window2);
        View decorView = window2.getDecorView();
        l0.o(decorView, "window!!.decorView");
        y.b(decorView, this);
    }

    @Override // androidx.lifecycle.z
    @n6.d
    public final androidx.lifecycle.p getLifecycle() {
        return b();
    }

    @Override // androidx.activity.t
    @n6.d
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // android.app.Dialog
    @d.i
    public void onBackPressed() {
        this.onBackPressedDispatcher.g();
    }

    @Override // android.app.Dialog
    @d.i
    public void onCreate(@n6.e Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.onBackPressedDispatcher.h(getOnBackInvokedDispatcher());
        }
        b().l(p.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    @d.i
    public void onStart() {
        super.onStart();
        b().l(p.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    @d.i
    public void onStop() {
        b().l(p.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        d();
        super.setContentView(i7);
    }

    public /* synthetic */ j(Context context, int i7, int i8, u4.w wVar) {
        this(context, (i8 & 2) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @s4.i
    public j(@n6.d Context context, @d.g1 int i7) {
        super(context, i7);
        l0.p(context, "context");
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.i
            @Override // java.lang.Runnable
            public final void run() {
                j.e(j.this);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(@n6.d View view) {
        l0.p(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@n6.d View view, @n6.e ViewGroup.LayoutParams layoutParams) {
        l0.p(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
