package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import d.b1;
import f.a;
/* loaded from: classes.dex */
public class g extends Button implements androidx.core.view.r1, k1.b, k1.d0, v0 {
    @d.o0
    private o mAppCompatEmojiTextHelper;
    private final f mBackgroundTintHelper;
    private final d0 mTextHelper;

    public g(@d.o0 Context context) {
        this(context, null);
    }

    @d.o0
    private o getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new o(this);
        }
        return this.mAppCompatEmojiTextHelper;
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

    @Override // android.widget.TextView, k1.b
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (e2.f1580c) {
            return super.getAutoSizeMaxTextSize();
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            return d0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, k1.b
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (e2.f1580c) {
            return super.getAutoSizeMinTextSize();
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            return d0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, k1.b
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (e2.f1580c) {
            return super.getAutoSizeStepGranularity();
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            return d0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, k1.b
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (e2.f1580c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        d0 d0Var = this.mTextHelper;
        return d0Var != null ? d0Var.h() : new int[0];
    }

    @Override // android.widget.TextView, k1.b
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (e2.f1580c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            return d0Var.i();
        }
        return 0;
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

    @Override // androidx.appcompat.widget.v0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.o(z6, i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        d0 d0Var = this.mTextHelper;
        if ((d0Var == null || e2.f1580c || !d0Var.l()) ? false : true) {
            this.mTextHelper.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.TextView, k1.b
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) throws IllegalArgumentException {
        if (e2.f1580c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.t(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView, k1.b
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@d.o0 int[] iArr, int i7) throws IllegalArgumentException {
        if (e2.f1580c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.u(iArr, i7);
        }
    }

    @Override // android.widget.TextView, k1.b
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (e2.f1580c) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.v(i7);
        }
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
    public void setCustomSelectionActionModeCallback(@d.q0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k1.v.H(this, callback));
    }

    @Override // androidx.appcompat.widget.v0
    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().e(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(@d.o0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z6) {
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.s(z6);
        }
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
    public void setTextSize(int i7, float f7) {
        if (e2.f1580c) {
            super.setTextSize(i7, f7);
            return;
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.A(i7, f7);
        }
    }

    public g(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.f8914o0);
    }

    public g(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(q1.b(context), attributeSet, i7);
        o1.a(this, getContext());
        f fVar = new f(this);
        this.mBackgroundTintHelper = fVar;
        fVar.e(attributeSet, i7);
        d0 d0Var = new d0(this);
        this.mTextHelper = d0Var;
        d0Var.m(attributeSet, i7);
        d0Var.b();
        getEmojiTextViewHelper().c(attributeSet, i7);
    }
}
