package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import d.b1;
import f.a;
/* loaded from: classes.dex */
public class i extends CheckedTextView implements k1.b0, androidx.core.view.r1, v0, k1.d0 {

    /* renamed from: b  reason: collision with root package name */
    public final j f1634b;

    /* renamed from: c  reason: collision with root package name */
    public final f f1635c;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f1636d;
    @d.o0

    /* renamed from: e  reason: collision with root package name */
    public o f1637e;

    public i(@d.o0 Context context) {
        this(context, null);
    }

    @d.o0
    private o getEmojiTextViewHelper() {
        if (this.f1637e == null) {
            this.f1637e = new o(this);
        }
        return this.f1637e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.f1636d;
        if (d0Var != null) {
            d0Var.b();
        }
        f fVar = this.f1635c;
        if (fVar != null) {
            fVar.b();
        }
        j jVar = this.f1634b;
        if (jVar != null) {
            jVar.a();
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
        f fVar = this.f1635c;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1635c;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // k1.b0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public ColorStateList getSupportCheckMarkTintList() {
        j jVar = this.f1634b;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    @Override // k1.b0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        j jVar = this.f1634b;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1636d.j();
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1636d.k();
    }

    @Override // androidx.appcompat.widget.v0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    @d.q0
    public InputConnection onCreateInputConnection(@d.o0 EditorInfo editorInfo) {
        return p.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@d.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1635c;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@d.v int i7) {
        super.setBackgroundResource(i7);
        f fVar = this.f1635c;
        if (fVar != null) {
            fVar.g(i7);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@d.q0 Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        j jVar = this.f1634b;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@d.q0 Drawable drawable, @d.q0 Drawable drawable2, @d.q0 Drawable drawable3, @d.q0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f1636d;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    @d.w0(17)
    public void setCompoundDrawablesRelative(@d.q0 Drawable drawable, @d.q0 Drawable drawable2, @d.q0 Drawable drawable3, @d.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f1636d;
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
        getEmojiTextViewHelper().e(z6);
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@d.q0 ColorStateList colorStateList) {
        f fVar = this.f1635c;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@d.q0 PorterDuff.Mode mode) {
        f fVar = this.f1635c;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // k1.b0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@d.q0 ColorStateList colorStateList) {
        j jVar = this.f1634b;
        if (jVar != null) {
            jVar.f(colorStateList);
        }
    }

    @Override // k1.b0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@d.q0 PorterDuff.Mode mode) {
        j jVar = this.f1634b;
        if (jVar != null) {
            jVar.g(mode);
        }
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@d.q0 ColorStateList colorStateList) {
        this.f1636d.w(colorStateList);
        this.f1636d.b();
    }

    @Override // k1.d0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@d.q0 PorterDuff.Mode mode) {
        this.f1636d.x(mode);
        this.f1636d.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@d.o0 Context context, int i7) {
        super.setTextAppearance(context, i7);
        d0 d0Var = this.f1636d;
        if (d0Var != null) {
            d0Var.q(context, i7);
        }
    }

    public i(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.f8954w0);
    }

    public i(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(q1.b(context), attributeSet, i7);
        o1.a(this, getContext());
        d0 d0Var = new d0(this);
        this.f1636d = d0Var;
        d0Var.m(attributeSet, i7);
        d0Var.b();
        f fVar = new f(this);
        this.f1635c = fVar;
        fVar.e(attributeSet, i7);
        j jVar = new j(this);
        this.f1634b = jVar;
        jVar.d(attributeSet, i7);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@d.v int i7) {
        setCheckMarkDrawable(g.a.b(getContext(), i7));
    }
}
