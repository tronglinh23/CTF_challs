package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import f.a;

/* loaded from: classes.dex */
public class u extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f1799b = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1800a;

    public u(@d.o0 Context context, @d.q0 AttributeSet attributeSet, @d.f int i7) {
        super(context, attributeSet, i7);
        a(context, attributeSet, i7, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i7, int i8) {
        t1 G = t1.G(context, attributeSet, a.m.S4, i7, i8);
        if (G.C(a.m.V4)) {
            b(G.a(a.m.V4, false));
        }
        setBackgroundDrawable(G.h(a.m.T4));
        G.I();
    }

    public final void b(boolean z6) {
        if (f1799b) {
            this.f1800a = z6;
        } else {
            k1.t.c(this, z6);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8) {
        if (f1799b && this.f1800a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i7, int i8, int i9, int i10) {
        if (f1799b && this.f1800a) {
            i8 -= view.getHeight();
        }
        super.update(view, i7, i8, i9, i10);
    }

    public u(@d.o0 Context context, @d.q0 AttributeSet attributeSet, @d.f int i7, @d.g1 int i8) {
        super(context, attributeSet, i7, i8);
        a(context, attributeSet, i7, i8);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8, int i9) {
        if (f1799b && this.f1800a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8, i9);
    }
}