package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.t1;
import androidx.core.view.m0;
import androidx.core.view.r0;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import d.g1;
import d.o0;
import d.q0;
import d.u0;
import k1.v;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class StartCompoundLayout extends LinearLayout {
    private boolean hintExpanded;
    @q0
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private int startIconMinSize;
    private View.OnLongClickListener startIconOnLongClickListener;
    @o0
    private ImageView.ScaleType startIconScaleType;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final TextInputLayout textInputLayout;

    public StartCompoundLayout(TextInputLayout textInputLayout, t1 t1Var) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, m0.f3714b));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        f0 f0Var = new f0(getContext());
        this.prefixTextView = f0Var;
        initStartIconView(t1Var);
        initPrefixTextView(t1Var);
        addView(checkableImageButton);
        addView(f0Var);
    }

    private void initPrefixTextView(t1 t1Var) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(R.id.textinput_prefix_text);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        u1.D1(this.prefixTextView, 1);
        setPrefixTextAppearance(t1Var.u(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        if (t1Var.C(R.styleable.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(t1Var.d(R.styleable.TextInputLayout_prefixTextColor));
        }
        setPrefixText(t1Var.x(R.styleable.TextInputLayout_prefixText));
    }

    private void initStartIconView(t1 t1Var) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            r0.g((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (t1Var.C(R.styleable.TextInputLayout_startIconTint)) {
            this.startIconTintList = MaterialResources.getColorStateList(getContext(), t1Var, R.styleable.TextInputLayout_startIconTint);
        }
        if (t1Var.C(R.styleable.TextInputLayout_startIconTintMode)) {
            this.startIconTintMode = ViewUtils.parseTintMode(t1Var.o(R.styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (t1Var.C(R.styleable.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(t1Var.h(R.styleable.TextInputLayout_startIconDrawable));
            if (t1Var.C(R.styleable.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(t1Var.x(R.styleable.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(t1Var.a(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        setStartIconMinSize(t1Var.g(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        if (t1Var.C(R.styleable.TextInputLayout_startIconScaleType)) {
            setStartIconScaleType(IconHelper.convertScaleType(t1Var.o(R.styleable.TextInputLayout_startIconScaleType, -1)));
        }
    }

    private void updateVisibility() {
        int i7 = (this.prefixText == null || this.hintExpanded) ? 8 : 0;
        setVisibility(this.startIconView.getVisibility() == 0 || i7 == 0 ? 0 : 8);
        this.prefixTextView.setVisibility(i7);
        this.textInputLayout.updateDummyDrawables();
    }

    @q0
    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    @q0
    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    @o0
    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    @q0
    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    @q0
    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.startIconMinSize;
    }

    @o0
    public ImageView.ScaleType getStartIconScaleType() {
        return this.startIconScaleType;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    public void onHintStateChanged(boolean z6) {
        this.hintExpanded = z6;
        updateVisibility();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        updatePrefixTextViewPadding();
    }

    public void refreshStartIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    public void setPrefixText(@q0 CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    public void setPrefixTextAppearance(@g1 int i7) {
        v.E(this.prefixTextView, i7);
    }

    public void setPrefixTextColor(@o0 ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z6) {
        this.startIconView.setCheckable(z6);
    }

    public void setStartIconContentDescription(@q0 CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@q0 Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription(null);
    }

    public void setStartIconMinSize(@u0 int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i7 != this.startIconMinSize) {
            this.startIconMinSize = i7;
            IconHelper.setIconMinSize(this.startIconView, i7);
        }
    }

    public void setStartIconOnClickListener(@q0 View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(@q0 View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconScaleType(@o0 ImageView.ScaleType scaleType) {
        this.startIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.startIconView, scaleType);
    }

    public void setStartIconTintList(@q0 ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    public void setStartIconTintMode(@q0 PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    public void setStartIconVisible(boolean z6) {
        if (isStartIconVisible() != z6) {
            this.startIconView.setVisibility(z6 ? 0 : 8);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    public void setupAccessibilityNodeInfo(@o0 h1.f0 f0Var) {
        if (this.prefixTextView.getVisibility() != 0) {
            f0Var.Y1(this.startIconView);
            return;
        }
        f0Var.t1(this.prefixTextView);
        f0Var.Y1(this.prefixTextView);
    }

    public void updatePrefixTextViewPadding() {
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        u1.d2(this.prefixTextView, isStartIconVisible() ? 0 : u1.k0(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }
}
