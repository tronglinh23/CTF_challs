package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import d.b1;
import f.a;
/* loaded from: classes.dex */
public class m extends EditText implements androidx.core.view.r1, androidx.core.view.m1, v0, k1.d0 {
    @d.o0
    private final n mAppCompatEmojiEditTextHelper;
    private final f mBackgroundTintHelper;
    private final k1.a0 mDefaultOnReceiveContentListener;
    @d.q0
    private a mSuperCaller;
    private final c0 mTextClassifierHelper;
    private final d0 mTextHelper;

    @d.w0(api = 26)
    /* loaded from: classes.dex */
    public class a {
        public a() {
        }

        @d.q0
        public TextClassifier a() {
            return m.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            m.super.setTextClassifier(textClassifier);
        }
    }

    public m(@d.o0 Context context) {
        this(context, null);
    }

    @d.k1
    @d.o0
    @d.w0(26)
    private a getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new a();
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    @d.o0
    @d.w0(api = 26)
    public TextClassifier getTextClassifier() {
        c0 c0Var;
        return (Build.VERSION.SDK_INT >= 28 || (c0Var = this.mTextClassifierHelper) == null) ? getSuperCaller().a() : c0Var.a();
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
    @d.q0
    public InputConnection onCreateInputConnection(@d.o0 EditorInfo editorInfo) {
        String[] h02;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        InputConnection a7 = p.a(onCreateInputConnection, editorInfo, this);
        if (a7 != null && Build.VERSION.SDK_INT <= 30 && (h02 = androidx.core.view.u1.h0(this)) != null) {
            j1.e.h(editorInfo, h02);
            a7 = j1.g.d(this, a7, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.e(a7, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (y.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.m1
    @d.q0
    public androidx.core.view.k onReceiveContent(@d.o0 androidx.core.view.k kVar) {
        return this.mDefaultOnReceiveContentListener.a(this, kVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        if (y.b(this, i7)) {
            return true;
        }
        return super.onTextContextMenuItem(i7);
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

    @Override // android.widget.TextView
    @d.w0(api = 26)
    public void setTextClassifier(@d.q0 TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.mTextClassifierHelper) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            c0Var.b(textClassifier);
        }
    }

    public m(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.f8940t1);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @d.q0
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public m(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(q1.b(context), attributeSet, i7);
        o1.a(this, getContext());
        f fVar = new f(this);
        this.mBackgroundTintHelper = fVar;
        fVar.e(attributeSet, i7);
        d0 d0Var = new d0(this);
        this.mTextHelper = d0Var;
        d0Var.m(attributeSet, i7);
        d0Var.b();
        this.mTextClassifierHelper = new c0(this);
        this.mDefaultOnReceiveContentListener = new k1.a0();
        n nVar = new n(this);
        this.mAppCompatEmojiEditTextHelper = nVar;
        nVar.d(attributeSet, i7);
        initEmojiKeyListener(nVar);
    }
}
