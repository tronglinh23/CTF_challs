package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import d.b1;
import d.f;
import d.f1;
import d.g1;
import d.l;
import d.n1;
import d.o0;
import d.q0;
import d.t0;
import d.u0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;
/* loaded from: classes.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    static final int BADGE_RADIUS_NOT_SPECIFIED = -1;
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;
    static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    @g1
    private static final int DEFAULT_STYLE = R.style.Widget_MaterialComponents_Badge;
    @f
    private static final int DEFAULT_THEME_ATTR = R.attr.badgeStyle;
    private static final int MAX_CIRCULAR_BADGE_NUMBER_COUNT = 9;
    static final int OFFSET_ALIGNMENT_MODE_EDGE = 0;
    static final int OFFSET_ALIGNMENT_MODE_LEGACY = 1;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    @q0
    private WeakReference<View> anchorViewRef;
    @o0
    private final Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    @o0
    private final WeakReference<Context> contextRef;
    private float cornerRadius;
    @q0
    private WeakReference<FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    @o0
    private final MaterialShapeDrawable shapeDrawable;
    @o0
    private final BadgeState state;
    @o0
    private final TextDrawableHelper textDrawableHelper;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface BadgeGravity {
    }

    private BadgeDrawable(@o0 Context context, @n1 int i7, @f int i8, @g1 int i9, @q0 BadgeState.State state) {
        this.contextRef = new WeakReference<>(context);
        ThemeEnforcement.checkMaterialTheme(context);
        this.badgeBounds = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i7, i8, i9, state);
        this.state = badgeState;
        this.shapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context, badgeState.hasNumber() ? badgeState.getBadgeWithTextShapeAppearanceResId() : badgeState.getBadgeShapeAppearanceResId(), badgeState.hasNumber() ? badgeState.getBadgeWithTextShapeAppearanceOverlayResId() : badgeState.getBadgeShapeAppearanceOverlayResId()).build());
        restoreState();
    }

    private void calculateCenterAndBounds(@o0 Rect rect, @o0 View view) {
        float f7 = !hasNumber() ? this.state.badgeRadius : this.state.badgeWithTextRadius;
        this.cornerRadius = f7;
        if (f7 != -1.0f) {
            this.halfBadgeHeight = f7;
            this.halfBadgeWidth = f7;
        } else {
            this.halfBadgeHeight = Math.round((!hasNumber() ? this.state.badgeHeight : this.state.badgeWithTextHeight) / 2.0f);
            this.halfBadgeWidth = Math.round((!hasNumber() ? this.state.badgeWidth : this.state.badgeWithTextWidth) / 2.0f);
        }
        if (getNumber() > 9) {
            this.halfBadgeWidth = Math.max(this.halfBadgeWidth, (this.textDrawableHelper.getTextWidth(getBadgeText()) / 2.0f) + this.state.badgeWidePadding);
        }
        int totalVerticalOffsetForState = getTotalVerticalOffsetForState();
        int badgeGravity = this.state.getBadgeGravity();
        if (badgeGravity == 8388691 || badgeGravity == 8388693) {
            this.badgeCenterY = rect.bottom - totalVerticalOffsetForState;
        } else {
            this.badgeCenterY = rect.top + totalVerticalOffsetForState;
        }
        int totalHorizontalOffsetForState = getTotalHorizontalOffsetForState();
        int badgeGravity2 = this.state.getBadgeGravity();
        if (badgeGravity2 == 8388659 || badgeGravity2 == 8388691) {
            this.badgeCenterX = u1.Z(view) == 0 ? (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState : (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState;
        } else {
            this.badgeCenterX = u1.Z(view) == 0 ? (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState : (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState;
        }
    }

    @o0
    public static BadgeDrawable create(@o0 Context context) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    @o0
    public static BadgeDrawable createFromResource(@o0 Context context, @n1 int i7) {
        return new BadgeDrawable(context, i7, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    @o0
    public static BadgeDrawable createFromSavedState(@o0 Context context, @o0 BadgeState.State state) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, state);
    }

    private void drawText(Canvas canvas) {
        Rect rect = new Rect();
        String badgeText = getBadgeText();
        this.textDrawableHelper.getTextPaint().getTextBounds(badgeText, 0, badgeText.length(), rect);
        canvas.drawText(badgeText, this.badgeCenterX, this.badgeCenterY + (rect.height() / 2), this.textDrawableHelper.getTextPaint());
    }

    @o0
    private String getBadgeText() {
        if (getNumber() <= this.maxBadgeNumber) {
            return NumberFormat.getInstance(this.state.getNumberLocale()).format(getNumber());
        }
        Context context = this.contextRef.get();
        return context == null ? "" : String.format(this.state.getNumberLocale(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.maxBadgeNumber), DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
    }

    private int getTotalHorizontalOffsetForState() {
        int horizontalOffsetWithText = hasNumber() ? this.state.getHorizontalOffsetWithText() : this.state.getHorizontalOffsetWithoutText();
        if (this.state.offsetAlignmentMode == 1) {
            horizontalOffsetWithText += hasNumber() ? this.state.horizontalInsetWithText : this.state.horizontalInset;
        }
        return horizontalOffsetWithText + this.state.getAdditionalHorizontalOffset();
    }

    private int getTotalVerticalOffsetForState() {
        int verticalOffsetWithText = hasNumber() ? this.state.getVerticalOffsetWithText() : this.state.getVerticalOffsetWithoutText();
        if (this.state.offsetAlignmentMode == 0) {
            verticalOffsetWithText -= Math.round(this.halfBadgeHeight);
        }
        return verticalOffsetWithText + this.state.getAdditionalVerticalOffset();
    }

    private void onAlphaUpdated() {
        this.textDrawableHelper.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void onBackgroundColorUpdated() {
        ColorStateList valueOf = ColorStateList.valueOf(this.state.getBackgroundColor());
        if (this.shapeDrawable.getFillColor() != valueOf) {
            this.shapeDrawable.setFillColor(valueOf);
            invalidateSelf();
        }
    }

    private void onBadgeGravityUpdated() {
        WeakReference<View> weakReference = this.anchorViewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.anchorViewRef.get();
        WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
        updateBadgeCoordinates(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void onBadgeShapeAppearanceUpdated() {
        Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        this.shapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder(context, this.state.hasNumber() ? this.state.getBadgeWithTextShapeAppearanceResId() : this.state.getBadgeShapeAppearanceResId(), this.state.hasNumber() ? this.state.getBadgeWithTextShapeAppearanceOverlayResId() : this.state.getBadgeShapeAppearanceOverlayResId()).build());
        invalidateSelf();
    }

    private void onBadgeTextAppearanceUpdated() {
        TextAppearance textAppearance;
        Context context = this.contextRef.get();
        if (context == null || this.textDrawableHelper.getTextAppearance() == (textAppearance = new TextAppearance(context, this.state.getTextAppearanceResId()))) {
            return;
        }
        this.textDrawableHelper.setTextAppearance(textAppearance, context);
        onBadgeTextColorUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onBadgeTextColorUpdated() {
        this.textDrawableHelper.getTextPaint().setColor(this.state.getBadgeTextColor());
        invalidateSelf();
    }

    private void onMaxCharacterCountUpdated() {
        updateMaxBadgeNumber();
        this.textDrawableHelper.setTextWidthDirty(true);
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onNumberUpdated() {
        this.textDrawableHelper.setTextWidthDirty(true);
        onBadgeShapeAppearanceUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onVisibilityUpdated() {
        boolean isVisible = this.state.isVisible();
        setVisible(isVisible, false);
        if (!BadgeUtils.USE_COMPAT_PARENT || getCustomBadgeParent() == null || isVisible) {
            return;
        }
        ((ViewGroup) getCustomBadgeParent().getParent()).invalidate();
    }

    private void restoreState() {
        onBadgeShapeAppearanceUpdated();
        onBadgeTextAppearanceUpdated();
        onMaxCharacterCountUpdated();
        onNumberUpdated();
        onAlphaUpdated();
        onBackgroundColorUpdated();
        onBadgeTextColorUpdated();
        onBadgeGravityUpdated();
        updateCenterAndBounds();
        onVisibilityUpdated();
    }

    private void tryWrapAnchorInCompatParent(final View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != R.id.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
            if (weakReference == null || weakReference.get() != viewGroup) {
                updateAnchorParentToNotClip(view);
                final FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(R.id.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.customBadgeParentRef = new WeakReference<>(frameLayout);
                frameLayout.post(new Runnable() { // from class: com.google.android.material.badge.BadgeDrawable.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BadgeDrawable.this.updateBadgeCoordinates(view, frameLayout);
                    }
                });
            }
        }
    }

    private static void updateAnchorParentToNotClip(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void updateCenterAndBounds() {
        Context context = this.contextRef.get();
        WeakReference<View> weakReference = this.anchorViewRef;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.badgeBounds);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || BadgeUtils.USE_COMPAT_PARENT) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        calculateCenterAndBounds(rect2, view);
        BadgeUtils.updateBadgeBounds(this.badgeBounds, this.badgeCenterX, this.badgeCenterY, this.halfBadgeWidth, this.halfBadgeHeight);
        float f7 = this.cornerRadius;
        if (f7 != -1.0f) {
            this.shapeDrawable.setCornerSize(f7);
        }
        if (rect.equals(this.badgeBounds)) {
            return;
        }
        this.shapeDrawable.setBounds(this.badgeBounds);
    }

    private void updateMaxBadgeNumber() {
        this.maxBadgeNumber = ((int) Math.pow(10.0d, getMaxCharacterCount() - 1.0d)) - 1;
    }

    public void clearNumber() {
        if (hasNumber()) {
            this.state.clearNumber();
            onNumberUpdated();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.shapeDrawable.draw(canvas);
        if (hasNumber()) {
            drawText(canvas);
        }
    }

    public int getAdditionalHorizontalOffset() {
        return this.state.getAdditionalHorizontalOffset();
    }

    @u0
    public int getAdditionalVerticalOffset() {
        return this.state.getAdditionalVerticalOffset();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.state.getAlpha();
    }

    @l
    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.state.getBadgeGravity();
    }

    @o0
    public Locale getBadgeNumberLocale() {
        return this.state.getNumberLocale();
    }

    @l
    public int getBadgeTextColor() {
        return this.textDrawableHelper.getTextPaint().getColor();
    }

    @q0
    public CharSequence getContentDescription() {
        Context context;
        if (isVisible()) {
            if (hasNumber()) {
                if (this.state.getContentDescriptionQuantityStrings() == 0 || (context = this.contextRef.get()) == null) {
                    return null;
                }
                return getNumber() <= this.maxBadgeNumber ? context.getResources().getQuantityString(this.state.getContentDescriptionQuantityStrings(), getNumber(), Integer.valueOf(getNumber())) : context.getString(this.state.getContentDescriptionExceedsMaxBadgeNumberStringResource(), Integer.valueOf(this.maxBadgeNumber));
            }
            return this.state.getContentDescriptionNumberless();
        }
        return null;
    }

    @q0
    public FrameLayout getCustomBadgeParent() {
        WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    @u0
    public int getHorizontalOffsetWithText() {
        return this.state.getHorizontalOffsetWithText();
    }

    @u0
    public int getHorizontalOffsetWithoutText() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    public int getMaxCharacterCount() {
        return this.state.getMaxCharacterCount();
    }

    public int getNumber() {
        if (hasNumber()) {
            return this.state.getNumber();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @o0
    public BadgeState.State getSavedState() {
        return this.state.getOverridingState();
    }

    public int getVerticalOffset() {
        return this.state.getVerticalOffsetWithoutText();
    }

    @u0
    public int getVerticalOffsetWithText() {
        return this.state.getVerticalOffsetWithText();
    }

    @u0
    public int getVerticalOffsetWithoutText() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public boolean hasNumber() {
        return this.state.hasNumber();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    @b1({b1.a.LIBRARY_GROUP})
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setAdditionalHorizontalOffset(int i7) {
        this.state.setAdditionalHorizontalOffset(i7);
        updateCenterAndBounds();
    }

    public void setAdditionalVerticalOffset(@u0 int i7) {
        this.state.setAdditionalVerticalOffset(i7);
        updateCenterAndBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.state.setAlpha(i7);
        onAlphaUpdated();
    }

    public void setBackgroundColor(@l int i7) {
        this.state.setBackgroundColor(i7);
        onBackgroundColorUpdated();
    }

    public void setBadgeGravity(int i7) {
        if (this.state.getBadgeGravity() != i7) {
            this.state.setBadgeGravity(i7);
            onBadgeGravityUpdated();
        }
    }

    public void setBadgeNumberLocale(@o0 Locale locale) {
        if (locale.equals(this.state.getNumberLocale())) {
            return;
        }
        this.state.setNumberLocale(locale);
        invalidateSelf();
    }

    public void setBadgeTextColor(@l int i7) {
        if (this.textDrawableHelper.getTextPaint().getColor() != i7) {
            this.state.setBadgeTextColor(i7);
            onBadgeTextColorUpdated();
        }
    }

    public void setBadgeWithTextShapeAppearance(@g1 int i7) {
        this.state.setBadgeWithTextShapeAppearanceResId(i7);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(@g1 int i7) {
        this.state.setBadgeWithTextShapeAppearanceOverlayResId(i7);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearance(@g1 int i7) {
        this.state.setBadgeShapeAppearanceResId(i7);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(@g1 int i7) {
        this.state.setBadgeShapeAppearanceOverlayResId(i7);
        onBadgeShapeAppearanceUpdated();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@f1 int i7) {
        this.state.setContentDescriptionExceedsMaxBadgeNumberStringResource(i7);
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.state.setContentDescriptionNumberless(charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(@t0 int i7) {
        this.state.setContentDescriptionQuantityStringsResource(i7);
    }

    public void setHorizontalOffset(int i7) {
        setHorizontalOffsetWithoutText(i7);
        setHorizontalOffsetWithText(i7);
    }

    public void setHorizontalOffsetWithText(@u0 int i7) {
        this.state.setHorizontalOffsetWithText(i7);
        updateCenterAndBounds();
    }

    public void setHorizontalOffsetWithoutText(@u0 int i7) {
        this.state.setHorizontalOffsetWithoutText(i7);
        updateCenterAndBounds();
    }

    public void setMaxCharacterCount(int i7) {
        if (this.state.getMaxCharacterCount() != i7) {
            this.state.setMaxCharacterCount(i7);
            onMaxCharacterCountUpdated();
        }
    }

    public void setNumber(int i7) {
        int max = Math.max(0, i7);
        if (this.state.getNumber() != max) {
            this.state.setNumber(max);
            onNumberUpdated();
        }
    }

    public void setTextAppearance(@g1 int i7) {
        this.state.setTextAppearanceResId(i7);
        onBadgeTextAppearanceUpdated();
    }

    public void setVerticalOffset(int i7) {
        setVerticalOffsetWithoutText(i7);
        setVerticalOffsetWithText(i7);
    }

    public void setVerticalOffsetWithText(@u0 int i7) {
        this.state.setVerticalOffsetWithText(i7);
        updateCenterAndBounds();
    }

    public void setVerticalOffsetWithoutText(@u0 int i7) {
        this.state.setVerticalOffsetWithoutText(i7);
        updateCenterAndBounds();
    }

    public void setVisible(boolean z6) {
        this.state.setVisible(z6);
        onVisibilityUpdated();
    }

    @Deprecated
    public void updateBadgeCoordinates(@o0 View view, @q0 ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            updateBadgeCoordinates(view, (FrameLayout) viewGroup);
            return;
        }
        throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
    }

    public void updateBadgeCoordinates(@o0 View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    public void updateBadgeCoordinates(@o0 View view, @q0 FrameLayout frameLayout) {
        this.anchorViewRef = new WeakReference<>(view);
        boolean z6 = BadgeUtils.USE_COMPAT_PARENT;
        if (z6 && frameLayout == null) {
            tryWrapAnchorInCompatParent(view);
        } else {
            this.customBadgeParentRef = new WeakReference<>(frameLayout);
        }
        if (!z6) {
            updateAnchorParentToNotClip(view);
        }
        updateCenterAndBounds();
        invalidateSelf();
    }
}
