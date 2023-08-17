package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.o0;
import d.b1;
import d.d0;
import d.j0;
import d.q0;
import f.a;
import j.b;

/* loaded from: classes.dex */
public class o extends androidx.activity.j implements e {
    private h mDelegate;
    private final o0.a mKeyDispatcher;

    public o(@d.o0 Context context) {
        this(context, 0);
    }

    public static int getThemeResId(Context context, int i7) {
        if (i7 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(a.b.Z0, typedValue, true);
            return typedValue.resourceId;
        }
        return i7;
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void addContentView(@d.o0 View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().d(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().L();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return o0.e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @q0
    public <T extends View> T findViewById(@d0 int i7) {
        return (T) getDelegate().q(i7);
    }

    @d.o0
    public h getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = h.m(this, this);
        }
        return this.mDelegate;
    }

    public a getSupportActionBar() {
        return getDelegate().A();
    }

    @Override // android.app.Dialog
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        getDelegate().D();
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().C();
        super.onCreate(bundle);
        getDelegate().K(bundle);
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().Q();
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(j.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(j.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    @q0
    public j.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void setContentView(@j0 int i7) {
        getDelegate().X(i7);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().h0(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i7) {
        return getDelegate().T(i7);
    }

    public o(@d.o0 Context context, int i7) {
        super(context, getThemeResId(context, i7));
        this.mKeyDispatcher = new o0.a() { // from class: androidx.appcompat.app.n
            @Override // androidx.core.view.o0.a
            public final boolean e(KeyEvent keyEvent) {
                return o.this.superDispatchKeyEvent(keyEvent);
            }
        };
        h delegate = getDelegate();
        delegate.g0(getThemeResId(context, i7));
        delegate.K(null);
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void setContentView(@d.o0 View view) {
        getDelegate().Y(view);
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void setContentView(@d.o0 View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().Z(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i7) {
        super.setTitle(i7);
        getDelegate().h0(getContext().getString(i7));
    }

    public o(@d.o0 Context context, boolean z6, @q0 DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new o0.a() { // from class: androidx.appcompat.app.n
            @Override // androidx.core.view.o0.a
            public final boolean e(KeyEvent keyEvent) {
                return o.this.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z6);
        setOnCancelListener(onCancelListener);
    }
}