package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.h4;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import d.b1;
import d.g0;
import d.g1;
import d.l;
import d.o0;
import d.q0;
import d.v;
import d.w0;
import d.x;
import g1.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_CollapsingToolbar;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;
    @o0
    final CollapsingTextHelper collapsingTextHelper;
    private boolean collapsingTitleEnabled;
    @q0
    private Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;
    @o0
    final ElevationOverlayProvider elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int extraMultilineHeight;
    private boolean extraMultilineHeightEnabled;
    private boolean forceApplySystemWindowInsetTop;
    @q0
    h4 lastInsets;
    private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private final TimeInterpolator scrimAnimationFadeInInterpolator;
    private final TimeInterpolator scrimAnimationFadeOutInterpolator;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;
    @q0
    Drawable statusBarScrim;
    private int titleCollapseMode;
    private final Rect tmpRect;
    @q0
    private ViewGroup toolbar;
    @q0
    private View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;

    /* loaded from: classes.dex */
    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        public OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.currentOffset = i7;
            h4 h4Var = collapsingToolbarLayout.lastInsets;
            int r6 = h4Var != null ? h4Var.r() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i8);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                int i9 = layoutParams.collapseMode;
                if (i9 == 1) {
                    viewOffsetHelper.setTopAndBottomOffset(x0.a.e(-i7, 0, CollapsingToolbarLayout.this.getMaxOffsetForPinChild(childAt)));
                } else if (i9 == 2) {
                    viewOffsetHelper.setTopAndBottomOffset(Math.round((-i7) * layoutParams.parallaxMult));
                }
            }
            CollapsingToolbarLayout.this.updateScrimVisibility();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.statusBarScrim != null && r6 > 0) {
                u1.n1(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - u1.e0(CollapsingToolbarLayout.this)) - r6;
            float f7 = height;
            CollapsingToolbarLayout.this.collapsingTextHelper.setFadeModeStartFraction(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f7));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.collapsingTextHelper.setCurrentOffsetY(collapsingToolbarLayout3.currentOffset + height);
            CollapsingToolbarLayout.this.collapsingTextHelper.setExpansionFraction(Math.abs(i7) / f7);
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    @w0(23)
    /* loaded from: classes.dex */
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(@o0 Context context) {
        this(context, null);
    }

    private void animateScrim(int i7) {
        ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            valueAnimator2.setInterpolator(i7 > this.scrimAlpha ? this.scrimAnimationFadeInInterpolator : this.scrimAnimationFadeOutInterpolator);
            this.scrimAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@o0 ValueAnimator valueAnimator3) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setDuration(this.scrimAnimationDuration);
        this.scrimAnimator.setIntValues(this.scrimAlpha, i7);
        this.scrimAnimator.start();
    }

    private TextUtils.TruncateAt convertEllipsizeToTruncateAt(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    private void disableLiftOnScrollIfNeeded(AppBarLayout appBarLayout) {
        if (isTitleCollapseFadeMode()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void ensureToolbar() {
        if (this.refreshToolbar) {
            ViewGroup viewGroup = null;
            this.toolbar = null;
            this.toolbarDirectChild = null;
            int i7 = this.toolbarId;
            if (i7 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i7);
                this.toolbar = viewGroup2;
                if (viewGroup2 != null) {
                    this.toolbarDirectChild = findDirectChild(viewGroup2);
                }
            }
            if (this.toolbar == null) {
                int childCount = getChildCount();
                int i8 = 0;
                while (true) {
                    if (i8 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i8);
                    if (isToolbar(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i8++;
                }
                this.toolbar = viewGroup;
            }
            updateDummyView();
            this.refreshToolbar = false;
        }
    }

    @o0
    private View findDirectChild(@o0 View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    private static int getHeightWithMargins(@o0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private static CharSequence getToolbarTitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @o0
    public static ViewOffsetHelper getViewOffsetHelper(@o0 View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(R.id.view_offset_helper);
        if (viewOffsetHelper == null) {
            ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
            view.setTag(R.id.view_offset_helper, viewOffsetHelper2);
            return viewOffsetHelper2;
        }
        return viewOffsetHelper;
    }

    private boolean isTitleCollapseFadeMode() {
        return this.titleCollapseMode == 1;
    }

    private static boolean isToolbar(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        if (view2 == null || view2 == this) {
            if (view == this.toolbar) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private void updateCollapsedBounds(boolean z6) {
        int i7;
        int i8;
        int i9;
        int i10;
        View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int maxOffsetForPinChild = getMaxOffsetForPinChild(view);
        DescendantOffsetUtils.getDescendantRect(this, this.dummyView, this.tmpRect);
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i7 = toolbar.getTitleMarginStart();
            i9 = toolbar.getTitleMarginEnd();
            i10 = toolbar.getTitleMarginTop();
            i8 = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i7 = toolbar2.getTitleMarginStart();
            i9 = toolbar2.getTitleMarginEnd();
            i10 = toolbar2.getTitleMarginTop();
            i8 = toolbar2.getTitleMarginBottom();
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        Rect rect = this.tmpRect;
        int i11 = rect.left + (z6 ? i9 : i7);
        int i12 = rect.top + maxOffsetForPinChild + i10;
        int i13 = rect.right;
        if (!z6) {
            i7 = i9;
        }
        collapsingTextHelper.setCollapsedBounds(i11, i12, i13 - i7, (rect.bottom + maxOffsetForPinChild) - i8);
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    private void updateContentScrimBounds(@o0 Drawable drawable, int i7, int i8) {
        updateContentScrimBounds(drawable, this.toolbar, i7, i8);
    }

    private void updateDummyView() {
        View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (!this.collapsingTitleEnabled || this.toolbar == null) {
            return;
        }
        if (this.dummyView == null) {
            this.dummyView = new View(getContext());
        }
        if (this.dummyView.getParent() == null) {
            this.toolbar.addView(this.dummyView, -1, -1);
        }
    }

    private void updateTextBounds(int i7, int i8, int i9, int i10, boolean z6) {
        View view;
        if (!this.collapsingTitleEnabled || (view = this.dummyView) == null) {
            return;
        }
        boolean z7 = u1.O0(view) && this.dummyView.getVisibility() == 0;
        this.drawCollapsingTitle = z7;
        if (z7 || z6) {
            boolean z8 = u1.Z(this) == 1;
            updateCollapsedBounds(z8);
            this.collapsingTextHelper.setExpandedBounds(z8 ? this.expandedMarginEnd : this.expandedMarginStart, this.tmpRect.top + this.expandedMarginTop, (i9 - i7) - (z8 ? this.expandedMarginStart : this.expandedMarginEnd), (i10 - i8) - this.expandedMarginBottom);
            this.collapsingTextHelper.recalculate(z6);
        }
    }

    private void updateTitleFromToolbarIfNeeded() {
        if (this.toolbar != null && this.collapsingTitleEnabled && TextUtils.isEmpty(this.collapsingTextHelper.getText())) {
            setTitle(getToolbarTitle(this.toolbar));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            if (this.toolbar == null || this.contentScrim == null || this.scrimAlpha <= 0 || !isTitleCollapseFadeMode() || this.collapsingTextHelper.getExpansionFraction() >= this.collapsingTextHelper.getFadeModeThresholdFraction()) {
                this.collapsingTextHelper.draw(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.contentScrim.getBounds(), Region.Op.DIFFERENCE);
                this.collapsingTextHelper.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.statusBarScrim == null || this.scrimAlpha <= 0) {
            return;
        }
        h4 h4Var = this.lastInsets;
        int r6 = h4Var != null ? h4Var.r() : 0;
        if (r6 > 0) {
            this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), r6 - this.currentOffset);
            this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
            this.statusBarScrim.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j7) {
        boolean z6;
        if (this.contentScrim == null || this.scrimAlpha <= 0 || !isToolbarChild(view)) {
            z6 = false;
        } else {
            updateContentScrimBounds(this.contentScrim, view, getWidth(), getHeight());
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z6 = true;
        }
        return super.drawChild(canvas, view, j7) || z6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarScrim;
        boolean z6 = false;
        if (drawable != null && drawable.isStateful()) {
            z6 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            z6 |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper != null) {
            z6 |= collapsingTextHelper.setState(drawableState);
        }
        if (z6) {
            invalidate();
        }
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTextHelper.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.collapsingTextHelper.getCollapsedTextSize();
    }

    @o0
    public Typeface getCollapsedTitleTypeface() {
        return this.collapsingTextHelper.getCollapsedTypeface();
    }

    @q0
    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTextHelper.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    public float getExpandedTitleTextSize() {
        return this.collapsingTextHelper.getExpandedTextSize();
    }

    @o0
    public Typeface getExpandedTitleTypeface() {
        return this.collapsingTextHelper.getExpandedTypeface();
    }

    @b1({b1.a.LIBRARY_GROUP})
    @w0(23)
    public int getHyphenationFrequency() {
        return this.collapsingTextHelper.getHyphenationFrequency();
    }

    @b1({b1.a.LIBRARY_GROUP})
    public int getLineCount() {
        return this.collapsingTextHelper.getLineCount();
    }

    @b1({b1.a.LIBRARY_GROUP})
    @w0(23)
    public float getLineSpacingAdd() {
        return this.collapsingTextHelper.getLineSpacingAdd();
    }

    @b1({b1.a.LIBRARY_GROUP})
    @w0(23)
    public float getLineSpacingMultiplier() {
        return this.collapsingTextHelper.getLineSpacingMultiplier();
    }

    @b1({b1.a.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.collapsingTextHelper.getMaxLines();
    }

    public final int getMaxOffsetForPinChild(@o0 View view) {
        return ((getHeight() - getViewOffsetHelper(view).getLayoutTop()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        int i7 = this.scrimVisibleHeightTrigger;
        if (i7 >= 0) {
            return i7 + this.topInsetApplied + this.extraMultilineHeight;
        }
        h4 h4Var = this.lastInsets;
        int r6 = h4Var != null ? h4Var.r() : 0;
        int e02 = u1.e0(this);
        return e02 > 0 ? Math.min((e02 * 2) + r6, getHeight()) : getHeight() / 3;
    }

    @q0
    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    @q0
    public CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTextHelper.getText();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.titleCollapseMode;
    }

    @q0
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.collapsingTextHelper.getPositionInterpolator();
    }

    @o0
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.collapsingTextHelper.getTitleTextEllipsize();
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean isExtraMultilineHeightEnabled() {
        return this.extraMultilineHeightEnabled;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean isForceApplySystemWindowInsetTop() {
        return this.forceApplySystemWindowInsetTop;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.collapsingTextHelper.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            disableLiftOnScrollIfNeeded(appBarLayout);
            u1.O1(this, u1.U(appBarLayout));
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new OffsetUpdateListener();
            }
            appBarLayout.addOnOffsetChangedListener(this.onOffsetChangedListener);
            u1.v1(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@o0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.onOffsetChangedListener;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        h4 h4Var = this.lastInsets;
        if (h4Var != null) {
            int r6 = h4Var.r();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!u1.U(childAt) && childAt.getTop() < r6) {
                    u1.f1(childAt, r6);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            getViewOffsetHelper(getChildAt(i12)).onViewLayout();
        }
        updateTextBounds(i7, i8, i9, i10, false);
        updateTitleFromToolbarIfNeeded();
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i13 = 0; i13 < childCount3; i13++) {
            getViewOffsetHelper(getChildAt(i13)).applyOffsets();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        ensureToolbar();
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i8);
        h4 h4Var = this.lastInsets;
        int r6 = h4Var != null ? h4Var.r() : 0;
        if ((mode == 0 || this.forceApplySystemWindowInsetTop) && r6 > 0) {
            this.topInsetApplied = r6;
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + r6, 1073741824));
        }
        if (this.extraMultilineHeightEnabled && this.collapsingTextHelper.getMaxLines() > 1) {
            updateTitleFromToolbarIfNeeded();
            updateTextBounds(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int expandedLineCount = this.collapsingTextHelper.getExpandedLineCount();
            if (expandedLineCount > 1) {
                this.extraMultilineHeight = Math.round(this.collapsingTextHelper.getExpandedTextFullHeight()) * (expandedLineCount - 1);
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.extraMultilineHeight, 1073741824));
            }
        }
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup != null) {
            View view = this.toolbarDirectChild;
            if (view == null || view == this) {
                setMinimumHeight(getHeightWithMargins(viewGroup));
            } else {
                setMinimumHeight(getHeightWithMargins(view));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        Drawable drawable = this.contentScrim;
        if (drawable != null) {
            updateContentScrimBounds(drawable, i7, i8);
        }
    }

    public h4 onWindowInsetChanged(@o0 h4 h4Var) {
        h4 h4Var2 = u1.U(this) ? h4Var : null;
        if (!n.a(this.lastInsets, h4Var2)) {
            this.lastInsets = h4Var2;
            requestLayout();
        }
        return h4Var.c();
    }

    public void setCollapsedTitleGravity(int i7) {
        this.collapsingTextHelper.setCollapsedTextGravity(i7);
    }

    public void setCollapsedTitleTextAppearance(@g1 int i7) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i7);
    }

    public void setCollapsedTitleTextColor(@l int i7) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setCollapsedTitleTextSize(float f7) {
        this.collapsingTextHelper.setCollapsedTextSize(f7);
    }

    public void setCollapsedTitleTypeface(@q0 Typeface typeface) {
        this.collapsingTextHelper.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@q0 Drawable drawable) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.contentScrim = mutate;
            if (mutate != null) {
                updateContentScrimBounds(mutate, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            u1.n1(this);
        }
    }

    public void setContentScrimColor(@l int i7) {
        setContentScrim(new ColorDrawable(i7));
    }

    public void setContentScrimResource(@v int i7) {
        setContentScrim(k0.d.i(getContext(), i7));
    }

    public void setExpandedTitleColor(@l int i7) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setExpandedTitleGravity(int i7) {
        this.collapsingTextHelper.setExpandedTextGravity(i7);
    }

    public void setExpandedTitleMargin(int i7, int i8, int i9, int i10) {
        this.expandedMarginStart = i7;
        this.expandedMarginTop = i8;
        this.expandedMarginEnd = i9;
        this.expandedMarginBottom = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i7) {
        this.expandedMarginBottom = i7;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i7) {
        this.expandedMarginEnd = i7;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i7) {
        this.expandedMarginStart = i7;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i7) {
        this.expandedMarginTop = i7;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@g1 int i7) {
        this.collapsingTextHelper.setExpandedTextAppearance(i7);
    }

    public void setExpandedTitleTextColor(@o0 ColorStateList colorStateList) {
        this.collapsingTextHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTextSize(float f7) {
        this.collapsingTextHelper.setExpandedTextSize(f7);
    }

    public void setExpandedTitleTypeface(@q0 Typeface typeface) {
        this.collapsingTextHelper.setExpandedTypeface(typeface);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z6) {
        this.extraMultilineHeightEnabled = z6;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z6) {
        this.forceApplySystemWindowInsetTop = z6;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @w0(23)
    public void setHyphenationFrequency(int i7) {
        this.collapsingTextHelper.setHyphenationFrequency(i7);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @w0(23)
    public void setLineSpacingAdd(float f7) {
        this.collapsingTextHelper.setLineSpacingAdd(f7);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @w0(23)
    public void setLineSpacingMultiplier(@x(from = 0.0d) float f7) {
        this.collapsingTextHelper.setLineSpacingMultiplier(f7);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void setMaxLines(int i7) {
        this.collapsingTextHelper.setMaxLines(i7);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z6) {
        this.collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(z6);
    }

    public void setScrimAlpha(int i7) {
        ViewGroup viewGroup;
        if (i7 != this.scrimAlpha) {
            if (this.contentScrim != null && (viewGroup = this.toolbar) != null) {
                u1.n1(viewGroup);
            }
            this.scrimAlpha = i7;
            u1.n1(this);
        }
    }

    public void setScrimAnimationDuration(@g0(from = 0) long j7) {
        this.scrimAnimationDuration = j7;
    }

    public void setScrimVisibleHeightTrigger(@g0(from = 0) int i7) {
        if (this.scrimVisibleHeightTrigger != i7) {
            this.scrimVisibleHeightTrigger = i7;
            updateScrimVisibility();
        }
    }

    public void setScrimsShown(boolean z6) {
        setScrimsShown(z6, u1.U0(this) && !isInEditMode());
    }

    @b1({b1.a.LIBRARY_GROUP})
    @w0(23)
    public void setStaticLayoutBuilderConfigurer(@q0 StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.collapsingTextHelper.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setStatusBarScrim(@q0 Drawable drawable) {
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.statusBarScrim = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                q0.c.m(this.statusBarScrim, u1.Z(this));
                this.statusBarScrim.setVisible(getVisibility() == 0, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            u1.n1(this);
        }
    }

    public void setStatusBarScrimColor(@l int i7) {
        setStatusBarScrim(new ColorDrawable(i7));
    }

    public void setStatusBarScrimResource(@v int i7) {
        setStatusBarScrim(k0.d.i(getContext(), i7));
    }

    public void setTitle(@q0 CharSequence charSequence) {
        this.collapsingTextHelper.setText(charSequence);
        updateContentDescriptionFromTitle();
    }

    public void setTitleCollapseMode(int i7) {
        this.titleCollapseMode = i7;
        boolean isTitleCollapseFadeMode = isTitleCollapseFadeMode();
        this.collapsingTextHelper.setFadeModeEnabled(isTitleCollapseFadeMode);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            disableLiftOnScrollIfNeeded((AppBarLayout) parent);
        }
        if (isTitleCollapseFadeMode && this.contentScrim == null) {
            setContentScrimColor(this.elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(R.dimen.design_appbar_elevation)));
        }
    }

    public void setTitleEllipsize(@o0 TextUtils.TruncateAt truncateAt) {
        this.collapsingTextHelper.setTitleTextEllipsize(truncateAt);
    }

    public void setTitleEnabled(boolean z6) {
        if (z6 != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z6;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@q0 TimeInterpolator timeInterpolator) {
        this.collapsingTextHelper.setPositionInterpolator(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.statusBarScrim;
        if (drawable != null && drawable.isVisible() != z6) {
            this.statusBarScrim.setVisible(z6, false);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 == null || drawable2.isVisible() == z6) {
            return;
        }
        this.contentScrim.setVisible(z6, false);
    }

    public final void updateScrimVisibility() {
        if (this.contentScrim == null && this.statusBarScrim == null) {
            return;
        }
        setScrimsShown(getHeight() + this.currentOffset < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public boolean verifyDrawable(@o0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.contentScrim || drawable == this.statusBarScrim;
    }

    public CollapsingToolbarLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    private void updateContentScrimBounds(@o0 Drawable drawable, @q0 View view, int i7, int i8) {
        if (isTitleCollapseFadeMode() && view != null && this.collapsingTitleEnabled) {
            i8 = view.getBottom();
        }
        drawable.setBounds(0, 0, i7, i8);
    }

    public void setCollapsedTitleTextColor(@o0 ColorStateList colorStateList) {
        this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
    }

    public void setScrimsShown(boolean z6, boolean z7) {
        if (this.scrimsAreShown != z6) {
            if (z7) {
                animateScrim(z6 ? 255 : 0);
            } else {
                setScrimAlpha(z6 ? 255 : 0);
            }
            this.scrimsAreShown = z6;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarLayout(@d.o0 android.content.Context r11, @d.q0 android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        int collapseMode;
        float parallaxMult;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
            this.collapseMode = obtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(obtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }

        public void setCollapseMode(int i7) {
            this.collapseMode = i7;
        }

        public void setParallaxMultiplier(float f7) {
            this.parallaxMult = f7;
        }

        public LayoutParams(int i7, int i8) {
            super(i7, i8);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(int i7, int i8, int i9) {
            super(i7, i8, i9);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@o0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        @w0(19)
        public LayoutParams(@o0 FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        @w0(19)
        public LayoutParams(@o0 LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            this.collapseMode = layoutParams.collapseMode;
            this.parallaxMult = layoutParams.parallaxMult;
        }
    }
}
