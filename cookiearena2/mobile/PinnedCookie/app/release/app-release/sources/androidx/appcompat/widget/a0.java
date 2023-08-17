package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import f.a;
/* loaded from: classes.dex */
public class a0 extends v {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1424d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1425e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1426f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1427g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1428h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1429i;

    public a0(SeekBar seekBar) {
        super(seekBar);
        this.f1426f = null;
        this.f1427g = null;
        this.f1428h = false;
        this.f1429i = false;
        this.f1424d = seekBar;
    }

    @Override // androidx.appcompat.widget.v
    public void c(AttributeSet attributeSet, int i7) {
        super.c(attributeSet, i7);
        t1 G = t1.G(this.f1424d.getContext(), attributeSet, a.m.f9493i0, i7, 0);
        SeekBar seekBar = this.f1424d;
        androidx.core.view.u1.z1(seekBar, seekBar.getContext(), a.m.f9493i0, attributeSet, G.B(), i7, 0);
        Drawable i8 = G.i(a.m.f9501j0);
        if (i8 != null) {
            this.f1424d.setThumb(i8);
        }
        m(G.h(a.m.f9509k0));
        if (G.C(a.m.f9525m0)) {
            this.f1427g = q0.e(G.o(a.m.f9525m0, -1), this.f1427g);
            this.f1429i = true;
        }
        if (G.C(a.m.f9517l0)) {
            this.f1426f = G.d(a.m.f9517l0);
            this.f1428h = true;
        }
        G.I();
        f();
    }

    public final void f() {
        Drawable drawable = this.f1425e;
        if (drawable != null) {
            if (this.f1428h || this.f1429i) {
                Drawable r6 = q0.c.r(drawable.mutate());
                this.f1425e = r6;
                if (this.f1428h) {
                    q0.c.o(r6, this.f1426f);
                }
                if (this.f1429i) {
                    q0.c.p(this.f1425e, this.f1427g);
                }
                if (this.f1425e.isStateful()) {
                    this.f1425e.setState(this.f1424d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f1425e != null) {
            int max = this.f1424d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1425e.getIntrinsicWidth();
                int intrinsicHeight = this.f1425e.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i8 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1425e.setBounds(-i7, -i8, i7, i8);
                float width = ((this.f1424d.getWidth() - this.f1424d.getPaddingLeft()) - this.f1424d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1424d.getPaddingLeft(), this.f1424d.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f1425e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f1425e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1424d.getDrawableState())) {
            this.f1424d.invalidateDrawable(drawable);
        }
    }

    @d.q0
    public Drawable i() {
        return this.f1425e;
    }

    @d.q0
    public ColorStateList j() {
        return this.f1426f;
    }

    @d.q0
    public PorterDuff.Mode k() {
        return this.f1427g;
    }

    public void l() {
        Drawable drawable = this.f1425e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void m(@d.q0 Drawable drawable) {
        Drawable drawable2 = this.f1425e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1425e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1424d);
            q0.c.m(drawable, androidx.core.view.u1.Z(this.f1424d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1424d.getDrawableState());
            }
            f();
        }
        this.f1424d.invalidate();
    }

    public void n(@d.q0 ColorStateList colorStateList) {
        this.f1426f = colorStateList;
        this.f1428h = true;
        f();
    }

    public void o(@d.q0 PorterDuff.Mode mode) {
        this.f1427g = mode;
        this.f1429i = true;
        f();
    }
}
