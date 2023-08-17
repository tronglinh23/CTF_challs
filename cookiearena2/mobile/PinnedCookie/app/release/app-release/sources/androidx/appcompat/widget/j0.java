package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import d.b1;
/* loaded from: classes.dex */
public class j0 extends ToggleButton implements androidx.core.view.r1, v0, k1.d0 {

    /* renamed from: b  reason: collision with root package name */
    public final f f1653b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f1654c;

    /* renamed from: d  reason: collision with root package name */
    public o f1655d;

    public j0(@d.o0 Context context) {
        this(context, null);
    }

    @d.o0
    private o getEmojiTextViewHelper() {
        if (this.f1655d == null) {
            this.f1655d = new o(this);
        }
        return this.f1655d;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1653b;
        if (fVar != null) {
            fVar.b();
        }
        d0 d0Var = this.f1654c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1653b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1653b;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1654c.j();
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1654c.k();
    }

    @Override // androidx.appcompat.widget.v0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@d.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1653b;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@d.v int i7) {
        super.setBackgroundResource(i7);
        f fVar = this.f1653b;
        if (fVar != null) {
            fVar.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@d.q0 Drawable drawable, @d.q0 Drawable drawable2, @d.q0 Drawable drawable3, @d.q0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f1654c;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    @d.w0(17)
    public void setCompoundDrawablesRelative(@d.q0 Drawable drawable, @d.q0 Drawable drawable2, @d.q0 Drawable drawable3, @d.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f1654c;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // androidx.appcompat.widget.v0
    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().e(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(@d.o0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@d.q0 ColorStateList colorStateList) {
        f fVar = this.f1653b;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@d.q0 PorterDuff.Mode mode) {
        f fVar = this.f1653b;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@d.q0 ColorStateList colorStateList) {
        this.f1654c.w(colorStateList);
        this.f1654c.b();
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@d.q0 PorterDuff.Mode mode) {
        this.f1654c.x(mode);
        this.f1654c.b();
    }

    public j0(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public j0(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        o1.a(this, getContext());
        f fVar = new f(this);
        this.f1653b = fVar;
        fVar.e(attributeSet, i7);
        d0 d0Var = new d0(this);
        this.f1654c = d0Var;
        d0Var.m(attributeSet, i7);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }
}
