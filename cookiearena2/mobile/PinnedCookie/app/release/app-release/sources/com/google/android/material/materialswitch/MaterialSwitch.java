package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.n1;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import d.o0;
import d.q0;
import d.v;
import g.a;
import p0.p0;
import q0.c;
/* loaded from: classes.dex */
public class MaterialSwitch extends n1 {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_CompoundButton_MaterialSwitch;
    private static final int[] STATE_SET_WITH_ICON = {R.attr.state_with_icon};
    private int[] currentStateChecked;
    private int[] currentStateUnchecked;
    @q0
    private Drawable thumbDrawable;
    @q0
    private Drawable thumbIconDrawable;
    @q0
    private ColorStateList thumbIconTintList;
    @o0
    private PorterDuff.Mode thumbIconTintMode;
    @q0
    private ColorStateList thumbTintList;
    @q0
    private Drawable trackDecorationDrawable;
    @q0
    private ColorStateList trackDecorationTintList;
    @o0
    private PorterDuff.Mode trackDecorationTintMode;
    @q0
    private Drawable trackDrawable;
    @q0
    private ColorStateList trackTintList;

    public MaterialSwitch(@o0 Context context) {
        this(context, null);
    }

    private void refreshThumbDrawable() {
        this.thumbDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.thumbDrawable, this.thumbTintList, getThumbTintMode());
        this.thumbIconDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.thumbIconDrawable, this.thumbIconTintList, this.thumbIconTintMode);
        updateDrawableTints();
        super.setThumbDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.thumbDrawable, this.thumbIconDrawable));
        refreshDrawableState();
    }

    private void refreshTrackDrawable() {
        this.trackDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.trackDrawable, this.trackTintList, getTrackTintMode());
        this.trackDecorationDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.trackDecorationDrawable, this.trackDecorationTintList, this.trackDecorationTintMode);
        updateDrawableTints();
        Drawable drawable = this.trackDrawable;
        if (drawable != null && this.trackDecorationDrawable != null) {
            drawable = new LayerDrawable(new Drawable[]{this.trackDrawable, this.trackDecorationDrawable});
        } else if (drawable == null) {
            drawable = this.trackDecorationDrawable;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    private static void setInterpolatedDrawableTintIfPossible(@q0 Drawable drawable, @q0 ColorStateList colorStateList, @o0 int[] iArr, @o0 int[] iArr2, float f7) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        c.n(drawable, p0.i(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f7));
    }

    private void updateDrawableTints() {
        if (this.thumbTintList == null && this.thumbIconTintList == null && this.trackTintList == null && this.trackDecorationTintList == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.thumbTintList;
        if (colorStateList != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbDrawable, colorStateList, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList2 = this.thumbIconTintList;
        if (colorStateList2 != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbIconDrawable, colorStateList2, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList3 = this.trackTintList;
        if (colorStateList3 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDrawable, colorStateList3, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList4 = this.trackDecorationTintList;
        if (colorStateList4 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDecorationDrawable, colorStateList4, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.n1
    @q0
    public Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    @q0
    public Drawable getThumbIconDrawable() {
        return this.thumbIconDrawable;
    }

    @q0
    public ColorStateList getThumbIconTintList() {
        return this.thumbIconTintList;
    }

    @o0
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.thumbIconTintMode;
    }

    @Override // androidx.appcompat.widget.n1
    @q0
    public ColorStateList getThumbTintList() {
        return this.thumbTintList;
    }

    @q0
    public Drawable getTrackDecorationDrawable() {
        return this.trackDecorationDrawable;
    }

    @q0
    public ColorStateList getTrackDecorationTintList() {
        return this.trackDecorationTintList;
    }

    @o0
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.trackDecorationTintMode;
    }

    @Override // androidx.appcompat.widget.n1
    @q0
    public Drawable getTrackDrawable() {
        return this.trackDrawable;
    }

    @Override // androidx.appcompat.widget.n1
    @q0
    public ColorStateList getTrackTintList() {
        return this.trackTintList;
    }

    @Override // android.view.View
    public void invalidate() {
        updateDrawableTints();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.n1, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (this.thumbIconDrawable != null) {
            View.mergeDrawableStates(onCreateDrawableState, STATE_SET_WITH_ICON);
        }
        this.currentStateUnchecked = DrawableUtils.getUncheckedState(onCreateDrawableState);
        this.currentStateChecked = DrawableUtils.getCheckedState(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.n1
    public void setThumbDrawable(@q0 Drawable drawable) {
        this.thumbDrawable = drawable;
        refreshThumbDrawable();
    }

    public void setThumbIconDrawable(@q0 Drawable drawable) {
        this.thumbIconDrawable = drawable;
        refreshThumbDrawable();
    }

    public void setThumbIconResource(@v int i7) {
        setThumbIconDrawable(a.b(getContext(), i7));
    }

    public void setThumbIconTintList(@q0 ColorStateList colorStateList) {
        this.thumbIconTintList = colorStateList;
        refreshThumbDrawable();
    }

    public void setThumbIconTintMode(@o0 PorterDuff.Mode mode) {
        this.thumbIconTintMode = mode;
        refreshThumbDrawable();
    }

    @Override // androidx.appcompat.widget.n1
    public void setThumbTintList(@q0 ColorStateList colorStateList) {
        this.thumbTintList = colorStateList;
        refreshThumbDrawable();
    }

    @Override // androidx.appcompat.widget.n1
    public void setThumbTintMode(@q0 PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        refreshThumbDrawable();
    }

    public void setTrackDecorationDrawable(@q0 Drawable drawable) {
        this.trackDecorationDrawable = drawable;
        refreshTrackDrawable();
    }

    public void setTrackDecorationResource(@v int i7) {
        setTrackDecorationDrawable(a.b(getContext(), i7));
    }

    public void setTrackDecorationTintList(@q0 ColorStateList colorStateList) {
        this.trackDecorationTintList = colorStateList;
        refreshTrackDrawable();
    }

    public void setTrackDecorationTintMode(@o0 PorterDuff.Mode mode) {
        this.trackDecorationTintMode = mode;
        refreshTrackDrawable();
    }

    @Override // androidx.appcompat.widget.n1
    public void setTrackDrawable(@q0 Drawable drawable) {
        this.trackDrawable = drawable;
        refreshTrackDrawable();
    }

    @Override // androidx.appcompat.widget.n1
    public void setTrackTintList(@q0 ColorStateList colorStateList) {
        this.trackTintList = colorStateList;
        refreshTrackDrawable();
    }

    @Override // androidx.appcompat.widget.n1
    public void setTrackTintMode(@q0 PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        refreshTrackDrawable();
    }

    public MaterialSwitch(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialSwitch(@d.o0 android.content.Context r7, @d.q0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.materialswitch.MaterialSwitch.DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            android.graphics.drawable.Drawable r7 = super.getThumbDrawable()
            r6.thumbDrawable = r7
            android.content.res.ColorStateList r7 = super.getThumbTintList()
            r6.thumbTintList = r7
            r7 = 0
            super.setThumbTintList(r7)
            android.graphics.drawable.Drawable r1 = super.getTrackDrawable()
            r6.trackDrawable = r1
            android.content.res.ColorStateList r1 = super.getTrackTintList()
            r6.trackTintList = r1
            super.setTrackTintList(r7)
            int[] r2 = com.google.android.material.R.styleable.MaterialSwitch
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            androidx.appcompat.widget.t1 r8 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_thumbIcon
            android.graphics.drawable.Drawable r9 = r8.h(r9)
            r6.thumbIconDrawable = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_thumbIconTint
            android.content.res.ColorStateList r9 = r8.d(r9)
            r6.thumbIconTintList = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_thumbIconTintMode
            r0 = -1
            int r9 = r8.o(r9, r0)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.ViewUtils.parseTintMode(r9, r1)
            r6.thumbIconTintMode = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_trackDecoration
            android.graphics.drawable.Drawable r9 = r8.h(r9)
            r6.trackDecorationDrawable = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_trackDecorationTint
            android.content.res.ColorStateList r9 = r8.d(r9)
            r6.trackDecorationTintList = r9
            int r9 = com.google.android.material.R.styleable.MaterialSwitch_trackDecorationTintMode
            int r9 = r8.o(r9, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.ViewUtils.parseTintMode(r9, r0)
            r6.trackDecorationTintMode = r9
            r8.I()
            r6.setEnforceSwitchWidth(r7)
            r6.refreshThumbDrawable()
            r6.refreshTrackDrawable()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.materialswitch.MaterialSwitch.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
