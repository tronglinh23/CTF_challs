package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.u1;
import com.google.android.material.internal.CheckableImageButton;
import d.o0;
import d.q0;
import d.u0;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class IconHelper {
    private IconHelper() {
    }

    public static void applyIconTint(@o0 TextInputLayout textInputLayout, @o0 CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = q0.c.r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                q0.c.o(drawable, colorStateList);
            } else {
                q0.c.o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                q0.c.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static ImageView.ScaleType convertScaleType(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    private static int[] mergeIconState(@o0 TextInputLayout textInputLayout, @o0 CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    public static void refreshIconDrawableState(@o0 TextInputLayout textInputLayout, @o0 CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = q0.c.r(drawable).mutate();
        q0.c.o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static void setCompatRippleBackgroundIfNeeded(@o0 CheckableImageButton checkableImageButton) {
    }

    private static void setIconClickable(@o0 CheckableImageButton checkableImageButton, @q0 View.OnLongClickListener onLongClickListener) {
        boolean K0 = u1.K0(checkableImageButton);
        boolean z6 = onLongClickListener != null;
        boolean z7 = K0 || z6;
        checkableImageButton.setFocusable(z7);
        checkableImageButton.setClickable(K0);
        checkableImageButton.setPressable(K0);
        checkableImageButton.setLongClickable(z6);
        u1.R1(checkableImageButton, z7 ? 1 : 2);
    }

    public static void setIconMinSize(@o0 CheckableImageButton checkableImageButton, @u0 int i7) {
        checkableImageButton.setMinimumWidth(i7);
        checkableImageButton.setMinimumHeight(i7);
    }

    public static void setIconOnClickListener(@o0 CheckableImageButton checkableImageButton, @q0 View.OnClickListener onClickListener, @q0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    public static void setIconOnLongClickListener(@o0 CheckableImageButton checkableImageButton, @q0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    public static void setIconScaleType(@o0 CheckableImageButton checkableImageButton, @o0 ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
