package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import d.b1;
import f.a;
/* loaded from: classes.dex */
public class t extends MultiAutoCompleteTextView implements androidx.core.view.r1, v0, k1.d0 {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1792e = {16843126};

    /* renamed from: b  reason: collision with root package name */
    public final f f1793b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f1794c;
    @d.o0

    /* renamed from: d  reason: collision with root package name */
    public final n f1795d;

    public t(@d.o0 Context context) {
        this(context, null);
    }

    public void a(n nVar) {
        KeyListener keyListener = getKeyListener();
        if (nVar.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a7 = nVar.a(keyListener);
            if (a7 == keyListener) {
                return;
            }
            super.setKeyListener(a7);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1793b;
        if (fVar != null) {
            fVar.b();
        }
        d0 d0Var = this.f1794c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1793b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1793b;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1794c.j();
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1794c.k();
    }

    @Override // androidx.appcompat.widget.v0
    public boolean isEmojiCompatEnabled() {
        return this.f1795d.c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1795d.e(p.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@d.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1793b;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@d.v int i7) {
        super.setBackgroundResource(i7);
        f fVar = this.f1793b;
        if (fVar != null) {
            fVar.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@d.q0 Drawable drawable, @d.q0 Drawable drawable2, @d.q0 Drawable drawable3, @d.q0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f1794c;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    @d.w0(17)
    public void setCompoundDrawablesRelative(@d.q0 Drawable drawable, @d.q0 Drawable drawable2, @d.q0 Drawable drawable3, @d.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f1794c;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@d.v int i7) {
        setDropDownBackgroundDrawable(g.a.b(getContext(), i7));
    }

    @Override // androidx.appcompat.widget.v0
    public void setEmojiCompatEnabled(boolean z6) {
        this.f1795d.f(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@d.q0 KeyListener keyListener) {
        super.setKeyListener(this.f1795d.a(keyListener));
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@d.q0 ColorStateList colorStateList) {
        f fVar = this.f1793b;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@d.q0 PorterDuff.Mode mode) {
        f fVar = this.f1793b;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@d.q0 ColorStateList colorStateList) {
        this.f1794c.w(colorStateList);
        this.f1794c.b();
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@d.q0 PorterDuff.Mode mode) {
        this.f1794c.x(mode);
        this.f1794c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        d0 d0Var = this.f1794c;
        if (d0Var != null) {
            d0Var.q(context, i7);
        }
    }

    public t(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.S);
    }

    public t(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(q1.b(context), attributeSet, i7);
        o1.a(this, getContext());
        t1 G = t1.G(getContext(), attributeSet, f1792e, i7, 0);
        if (G.C(0)) {
            setDropDownBackgroundDrawable(G.h(0));
        }
        G.I();
        f fVar = new f(this);
        this.f1793b = fVar;
        fVar.e(attributeSet, i7);
        d0 d0Var = new d0(this);
        this.f1794c = d0Var;
        d0Var.m(attributeSet, i7);
        d0Var.b();
        n nVar = new n(this);
        this.f1795d = nVar;
        nVar.d(attributeSet, i7);
        a(nVar);
    }
}
