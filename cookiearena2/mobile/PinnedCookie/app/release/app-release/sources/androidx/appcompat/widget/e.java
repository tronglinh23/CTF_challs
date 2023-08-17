package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import d.b1;
import f.a;
/* loaded from: classes.dex */
public class e extends AutoCompleteTextView implements androidx.core.view.r1, v0, k1.d0 {
    private static final int[] TINT_ATTRS = {16843126};
    @d.o0
    private final n mAppCompatEmojiEditTextHelper;
    private final f mBackgroundTintHelper;
    private final d0 mTextHelper;

    public e(@d.o0 Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.b();
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    @d.q0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k1.v.G(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    public void initEmojiKeyListener(n nVar) {
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

    @Override // androidx.appcompat.widget.v0
    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.mAppCompatEmojiEditTextHelper.e(p.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@d.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@d.v int i7) {
        super.setBackgroundResource(i7);
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@d.q0 Drawable drawable, @d.q0 Drawable drawable2, @d.q0 Drawable drawable3, @d.q0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    @d.w0(17)
    public void setCompoundDrawablesRelative(@d.q0 Drawable drawable, @d.q0 Drawable drawable2, @d.q0 Drawable drawable3, @d.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@d.q0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k1.v.H(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@d.v int i7) {
        setDropDownBackgroundDrawable(g.a.b(getContext(), i7));
    }

    @Override // androidx.appcompat.widget.v0
    public void setEmojiCompatEnabled(boolean z6) {
        this.mAppCompatEmojiEditTextHelper.f(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@d.q0 KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@d.q0 ColorStateList colorStateList) {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@d.q0 PorterDuff.Mode mode) {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@d.q0 ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@d.q0 PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.q(context, i7);
        }
    }

    public e(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.S);
    }

    public e(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(q1.b(context), attributeSet, i7);
        o1.a(this, getContext());
        t1 G = t1.G(getContext(), attributeSet, TINT_ATTRS, i7, 0);
        if (G.C(0)) {
            setDropDownBackgroundDrawable(G.h(0));
        }
        G.I();
        f fVar = new f(this);
        this.mBackgroundTintHelper = fVar;
        fVar.e(attributeSet, i7);
        d0 d0Var = new d0(this);
        this.mTextHelper = d0Var;
        d0Var.m(attributeSet, i7);
        d0Var.b();
        n nVar = new n(this);
        this.mAppCompatEmojiEditTextHelper = nVar;
        nVar.d(attributeSet, i7);
        initEmojiKeyListener(nVar);
    }
}
