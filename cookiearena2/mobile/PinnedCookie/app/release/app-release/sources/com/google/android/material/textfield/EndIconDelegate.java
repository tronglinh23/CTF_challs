package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import d.f1;
import d.o0;
import d.q0;
import d.v;
import h1.c;
import h1.f0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class EndIconDelegate {
    final Context context;
    final CheckableImageButton endIconView;
    final EndCompoundLayout endLayout;
    final TextInputLayout textInputLayout;

    public EndIconDelegate(@o0 EndCompoundLayout endCompoundLayout) {
        this.textInputLayout = endCompoundLayout.textInputLayout;
        this.endLayout = endCompoundLayout;
        this.context = endCompoundLayout.getContext();
        this.endIconView = endCompoundLayout.getEndIconView();
    }

    public void afterEditTextChanged(Editable editable) {
    }

    public void beforeEditTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    @f1
    public int getIconContentDescriptionResId() {
        return 0;
    }

    @v
    public int getIconDrawableResId() {
        return 0;
    }

    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return null;
    }

    public View.OnClickListener getOnIconClickListener() {
        return null;
    }

    public View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return null;
    }

    public c.e getTouchExplorationStateChangeListener() {
        return null;
    }

    public boolean isBoxBackgroundModeSupported(int i7) {
        return true;
    }

    public boolean isIconActivable() {
        return false;
    }

    public boolean isIconActivated() {
        return false;
    }

    public boolean isIconCheckable() {
        return false;
    }

    public boolean isIconChecked() {
        return false;
    }

    public void onEditTextAttached(@q0 EditText editText) {
    }

    public void onInitializeAccessibilityNodeInfo(View view, @o0 f0 f0Var) {
    }

    public void onPopulateAccessibilityEvent(View view, @o0 AccessibilityEvent accessibilityEvent) {
    }

    public void onSuffixVisibilityChanged(boolean z6) {
    }

    public final void refreshIconState() {
        this.endLayout.refreshIconState(false);
    }

    public void setUp() {
    }

    public boolean shouldTintIconOnError() {
        return false;
    }

    public void tearDown() {
    }
}
