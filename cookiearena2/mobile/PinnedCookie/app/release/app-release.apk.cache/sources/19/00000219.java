package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import d.b1;
import d1.z;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class f0 extends TextView implements androidx.core.view.r1, k1.d0, k1.b, v0 {
    private final f mBackgroundTintHelper;
    @d.o0
    private o mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    @d.q0
    private Future<d1.z> mPrecomputedTextFuture;
    @d.q0
    private a mSuperCaller;
    private final c0 mTextClassifierHelper;
    private final d0 mTextHelper;

    /* loaded from: classes.dex */
    public interface a {
        void a(@d.q0 TextClassifier textClassifier);

        void b(@d.u0 int i7);

        TextClassifier c();

        void d(@d.u0 int i7);

        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7);

        void setAutoSizeTextTypeWithDefaults(int i7);
    }

    @d.w0(api = 26)
    /* loaded from: classes.dex */
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.f0.a
        public void a(@d.q0 TextClassifier textClassifier) {
            f0.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.f0.a
        public void b(int i7) {
        }

        @Override // androidx.appcompat.widget.f0.a
        public TextClassifier c() {
            return f0.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.f0.a
        public void d(int i7) {
        }

        @Override // androidx.appcompat.widget.f0.a
        public int getAutoSizeMaxTextSize() {
            return f0.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.f0.a
        public int getAutoSizeMinTextSize() {
            return f0.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.f0.a
        public int getAutoSizeStepGranularity() {
            return f0.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.f0.a
        public int[] getAutoSizeTextAvailableSizes() {
            return f0.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.f0.a
        public int getAutoSizeTextType() {
            return f0.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.f0.a
        public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
            f0.super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }

        @Override // androidx.appcompat.widget.f0.a
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
            f0.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
        }

        @Override // androidx.appcompat.widget.f0.a
        public void setAutoSizeTextTypeWithDefaults(int i7) {
            f0.super.setAutoSizeTextTypeWithDefaults(i7);
        }
    }

    @d.w0(api = 28)
    /* loaded from: classes.dex */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.f0.b, androidx.appcompat.widget.f0.a
        public void b(@d.u0 int i7) {
            f0.super.setLastBaselineToBottomHeight(i7);
        }

        @Override // androidx.appcompat.widget.f0.b, androidx.appcompat.widget.f0.a
        public void d(@d.u0 int i7) {
            f0.super.setFirstBaselineToTopHeight(i7);
        }
    }

    public f0(@d.o0 Context context) {
        this(context, null);
    }

    @d.o0
    private o getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new o(this);
        }
        return this.mEmojiTextViewHelper;
    }

    public final void c() {
        Future<d1.z> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                k1.v.D(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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
            return getSuperCaller().getAutoSizeMaxTextSize();
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
            return getSuperCaller().getAutoSizeMinTextSize();
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
            return getSuperCaller().getAutoSizeStepGranularity();
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
            return getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        d0 d0Var = this.mTextHelper;
        return d0Var != null ? d0Var.h() : new int[0];
    }

    @Override // android.widget.TextView, k1.b
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (e2.f1580c) {
            return getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return k1.v.i(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return k1.v.j(this);
    }

    @d.k1
    @d.w0(api = 26)
    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.mSuperCaller = new c();
            } else {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
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
    public CharSequence getText() {
        c();
        return super.getText();
    }

    @Override // android.widget.TextView
    @d.o0
    @d.w0(api = 26)
    public TextClassifier getTextClassifier() {
        c0 c0Var;
        return (Build.VERSION.SDK_INT >= 28 || (c0Var = this.mTextClassifierHelper) == null) ? getSuperCaller().c() : c0Var.a();
    }

    @d.o0
    public z.a getTextMetricsParamsCompat() {
        return k1.v.o(this);
    }

    @Override // androidx.appcompat.widget.v0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        return p.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.o(z6, i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        c();
        super.onMeasure(i7, i8);
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
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
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
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
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
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i7);
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
    @d.w0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@d.q0 Drawable drawable, @d.q0 Drawable drawable2, @d.q0 Drawable drawable3, @d.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@d.q0 Drawable drawable, @d.q0 Drawable drawable2, @d.q0 Drawable drawable3, @d.q0 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
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
        getEmojiTextViewHelper().e(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(@d.o0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@d.u0 @d.g0(from = 0) int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i7);
        } else {
            k1.v.A(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@d.u0 @d.g0(from = 0) int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i7);
        } else {
            k1.v.B(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@d.u0 @d.g0(from = 0) int i7) {
        k1.v.C(this, i7);
    }

    public void setPrecomputedText(@d.o0 d1.z zVar) {
        k1.v.D(this, zVar);
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
            getSuperCaller().a(textClassifier);
        } else {
            c0Var.b(textClassifier);
        }
    }

    public void setTextFuture(@d.q0 Future<d1.z> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@d.o0 z.a aVar) {
        k1.v.F(this, aVar);
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

    @Override // android.widget.TextView
    public void setTypeface(@d.q0 Typeface typeface, int i7) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface b7 = (typeface == null || i7 <= 0) ? null : p0.j1.b(getContext(), typeface, i7);
        this.mIsSetTypefaceProcessing = true;
        if (b7 != null) {
            typeface = b7;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public f0(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public f0(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(q1.b(context), attributeSet, i7);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        o1.a(this, getContext());
        f fVar = new f(this);
        this.mBackgroundTintHelper = fVar;
        fVar.e(attributeSet, i7);
        d0 d0Var = new d0(this);
        this.mTextHelper = d0Var;
        d0Var.m(attributeSet, i7);
        d0Var.b();
        this.mTextClassifierHelper = new c0(this);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }

    @Override // android.widget.TextView
    @d.w0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? g.a.b(context, i7) : null, i8 != 0 ? g.a.b(context, i8) : null, i9 != 0 ? g.a.b(context, i9) : null, i10 != 0 ? g.a.b(context, i10) : null);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? g.a.b(context, i7) : null, i8 != 0 ? g.a.b(context, i8) : null, i9 != 0 ? g.a.b(context, i9) : null, i10 != 0 ? g.a.b(context, i10) : null);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.p();
        }
    }
}