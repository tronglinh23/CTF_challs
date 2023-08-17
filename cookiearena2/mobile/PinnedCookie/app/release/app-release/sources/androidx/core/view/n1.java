package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class n1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final View f3738b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver f3739c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f3740d;

    public n1(View view, Runnable runnable) {
        this.f3738b = view;
        this.f3739c = view.getViewTreeObserver();
        this.f3740d = runnable;
    }

    @d.o0
    public static n1 a(@d.o0 View view, @d.o0 Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                n1 n1Var = new n1(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(n1Var);
                view.addOnAttachStateChangeListener(n1Var);
                return n1Var;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    public void b() {
        if (this.f3739c.isAlive()) {
            this.f3739c.removeOnPreDrawListener(this);
        } else {
            this.f3738b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3738b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f3740d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@d.o0 View view) {
        this.f3739c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@d.o0 View view) {
        b();
    }
}
