package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import d.b1;
import f.a;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class r {
    @d.o0

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f1760a;

    /* renamed from: b  reason: collision with root package name */
    public r1 f1761b;

    /* renamed from: c  reason: collision with root package name */
    public r1 f1762c;

    /* renamed from: d  reason: collision with root package name */
    public r1 f1763d;

    /* renamed from: e  reason: collision with root package name */
    public int f1764e = 0;

    public r(@d.o0 ImageView imageView) {
        this.f1760a = imageView;
    }

    public final boolean a(@d.o0 Drawable drawable) {
        if (this.f1763d == null) {
            this.f1763d = new r1();
        }
        r1 r1Var = this.f1763d;
        r1Var.a();
        ColorStateList a7 = k1.o.a(this.f1760a);
        if (a7 != null) {
            r1Var.f1768d = true;
            r1Var.f1765a = a7;
        }
        PorterDuff.Mode b7 = k1.o.b(this.f1760a);
        if (b7 != null) {
            r1Var.f1767c = true;
            r1Var.f1766b = b7;
        }
        if (r1Var.f1768d || r1Var.f1767c) {
            l.j(drawable, r1Var, this.f1760a.getDrawableState());
            return true;
        }
        return false;
    }

    public void b() {
        if (this.f1760a.getDrawable() != null) {
            this.f1760a.getDrawable().setLevel(this.f1764e);
        }
    }

    public void c() {
        Drawable drawable = this.f1760a.getDrawable();
        if (drawable != null) {
            q0.b(drawable);
        }
        if (drawable != null) {
            if (m() && a(drawable)) {
                return;
            }
            r1 r1Var = this.f1762c;
            if (r1Var != null) {
                l.j(drawable, r1Var, this.f1760a.getDrawableState());
                return;
            }
            r1 r1Var2 = this.f1761b;
            if (r1Var2 != null) {
                l.j(drawable, r1Var2, this.f1760a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        r1 r1Var = this.f1762c;
        if (r1Var != null) {
            return r1Var.f1765a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        r1 r1Var = this.f1762c;
        if (r1Var != null) {
            return r1Var.f1766b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f1760a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i7) {
        int u6;
        t1 G = t1.G(this.f1760a.getContext(), attributeSet, a.m.f9453d0, i7, 0);
        ImageView imageView = this.f1760a;
        androidx.core.view.u1.z1(imageView, imageView.getContext(), a.m.f9453d0, attributeSet, G.B(), i7, 0);
        try {
            Drawable drawable = this.f1760a.getDrawable();
            if (drawable == null && (u6 = G.u(a.m.f9469f0, -1)) != -1 && (drawable = g.a.b(this.f1760a.getContext(), u6)) != null) {
                this.f1760a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                q0.b(drawable);
            }
            if (G.C(a.m.f9477g0)) {
                k1.o.c(this.f1760a, G.d(a.m.f9477g0));
            }
            if (G.C(a.m.f9485h0)) {
                k1.o.d(this.f1760a, q0.e(G.o(a.m.f9485h0, -1), null));
            }
        } finally {
            G.I();
        }
    }

    public void h(@d.o0 Drawable drawable) {
        this.f1764e = drawable.getLevel();
    }

    public void i(int i7) {
        if (i7 != 0) {
            Drawable b7 = g.a.b(this.f1760a.getContext(), i7);
            if (b7 != null) {
                q0.b(b7);
            }
            this.f1760a.setImageDrawable(b7);
        } else {
            this.f1760a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1761b == null) {
                this.f1761b = new r1();
            }
            r1 r1Var = this.f1761b;
            r1Var.f1765a = colorStateList;
            r1Var.f1768d = true;
        } else {
            this.f1761b = null;
        }
        c();
    }

    public void k(ColorStateList colorStateList) {
        if (this.f1762c == null) {
            this.f1762c = new r1();
        }
        r1 r1Var = this.f1762c;
        r1Var.f1765a = colorStateList;
        r1Var.f1768d = true;
        c();
    }

    public void l(PorterDuff.Mode mode) {
        if (this.f1762c == null) {
            this.f1762c = new r1();
        }
        r1 r1Var = this.f1762c;
        r1Var.f1766b = mode;
        r1Var.f1767c = true;
        c();
    }

    public final boolean m() {
        return this.f1761b != null;
    }
}
