package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import f.a;

/* loaded from: classes.dex */
public class f {
    @d.o0

    /* renamed from: a  reason: collision with root package name */
    public final View f1581a;

    /* renamed from: d  reason: collision with root package name */
    public r1 f1584d;

    /* renamed from: e  reason: collision with root package name */
    public r1 f1585e;

    /* renamed from: f  reason: collision with root package name */
    public r1 f1586f;

    /* renamed from: c  reason: collision with root package name */
    public int f1583c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final l f1582b = l.b();

    public f(@d.o0 View view) {
        this.f1581a = view;
    }

    public final boolean a(@d.o0 Drawable drawable) {
        if (this.f1586f == null) {
            this.f1586f = new r1();
        }
        r1 r1Var = this.f1586f;
        r1Var.a();
        ColorStateList N = androidx.core.view.u1.N(this.f1581a);
        if (N != null) {
            r1Var.f1768d = true;
            r1Var.f1765a = N;
        }
        PorterDuff.Mode O = androidx.core.view.u1.O(this.f1581a);
        if (O != null) {
            r1Var.f1767c = true;
            r1Var.f1766b = O;
        }
        if (r1Var.f1768d || r1Var.f1767c) {
            l.j(drawable, r1Var, this.f1581a.getDrawableState());
            return true;
        }
        return false;
    }

    public void b() {
        Drawable background = this.f1581a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            r1 r1Var = this.f1585e;
            if (r1Var != null) {
                l.j(background, r1Var, this.f1581a.getDrawableState());
                return;
            }
            r1 r1Var2 = this.f1584d;
            if (r1Var2 != null) {
                l.j(background, r1Var2, this.f1581a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        r1 r1Var = this.f1585e;
        if (r1Var != null) {
            return r1Var.f1765a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        r1 r1Var = this.f1585e;
        if (r1Var != null) {
            return r1Var.f1766b;
        }
        return null;
    }

    public void e(@d.q0 AttributeSet attributeSet, int i7) {
        t1 G = t1.G(this.f1581a.getContext(), attributeSet, a.m.a7, i7, 0);
        View view = this.f1581a;
        androidx.core.view.u1.z1(view, view.getContext(), a.m.a7, attributeSet, G.B(), i7, 0);
        try {
            if (G.C(a.m.b7)) {
                this.f1583c = G.u(a.m.b7, -1);
                ColorStateList f7 = this.f1582b.f(this.f1581a.getContext(), this.f1583c);
                if (f7 != null) {
                    h(f7);
                }
            }
            if (G.C(a.m.c7)) {
                androidx.core.view.u1.J1(this.f1581a, G.d(a.m.c7));
            }
            if (G.C(a.m.d7)) {
                androidx.core.view.u1.K1(this.f1581a, q0.e(G.o(a.m.d7, -1), null));
            }
        } finally {
            G.I();
        }
    }

    public void f(Drawable drawable) {
        this.f1583c = -1;
        h(null);
        b();
    }

    public void g(int i7) {
        this.f1583c = i7;
        l lVar = this.f1582b;
        h(lVar != null ? lVar.f(this.f1581a.getContext(), i7) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1584d == null) {
                this.f1584d = new r1();
            }
            r1 r1Var = this.f1584d;
            r1Var.f1765a = colorStateList;
            r1Var.f1768d = true;
        } else {
            this.f1584d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f1585e == null) {
            this.f1585e = new r1();
        }
        r1 r1Var = this.f1585e;
        r1Var.f1765a = colorStateList;
        r1Var.f1768d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f1585e == null) {
            this.f1585e = new r1();
        }
        r1 r1Var = this.f1585e;
        r1Var.f1766b = mode;
        r1Var.f1767c = true;
        b();
    }

    public final boolean k() {
        return this.f1584d != null;
    }
}