package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.y1;
import androidx.core.view.m0;
import androidx.core.view.o1;
import androidx.core.view.r0;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.b1;
import d.f1;
import d.h;
import d.j0;
import d.l;
import d.n;
import d.o0;
import d.q0;
import d.r;
import d.w0;
import g1.r;
import h1.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import k1.v;
import p3.a;
import p3.d;
import q0.c;
@d.e
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    @r(unit = 0)
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    @r(unit = 0)
    private static final int DEFAULT_HEIGHT = 48;
    @r(unit = 0)
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    @r(unit = 0)
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int SELECTED_INDICATOR_HEIGHT_DEFAULT = -1;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
    @r(unit = 0)
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private AdapterChangeListener adapterChangeListener;
    private int contentInsetStart;
    @q0
    private BaseOnTabSelectedListener currentVpSelectedListener;
    private final int defaultTabTextAppearance;
    int indicatorPosition;
    boolean inlineLabel;
    int mode;
    private TabLayoutOnPageChangeListener pageChangeListener;
    @q0
    private a pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    @q0
    private BaseOnTabSelectedListener selectedListener;
    private final ArrayList<BaseOnTabSelectedListener> selectedListeners;
    @q0
    private Tab selectedTab;
    private int selectedTabTextAppearance;
    float selectedTabTextSize;
    private boolean setupViewPagerImplicitly;
    @o0
    final SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    int tabIndicatorAnimationMode;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabIndicatorHeight;
    private TabIndicatorInterpolator tabIndicatorInterpolator;
    private final TimeInterpolator tabIndicatorTimeInterpolator;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    ColorStateList tabRippleColorStateList;
    @o0
    Drawable tabSelectedIndicator;
    private int tabSelectedIndicatorColor;
    private final int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final r.a<TabView> tabViewPool;
    private final ArrayList<Tab> tabs;
    boolean unboundedRipple;
    @q0
    d viewPager;
    private int viewPagerScrollState;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_TabLayout;
    private static final r.a<Tab> tabPool = new r.c(16);

    /* loaded from: classes.dex */
    public class AdapterChangeListener implements d.i {
        private boolean autoRefresh;

        public AdapterChangeListener() {
        }

        @Override // p3.d.i
        public void onAdapterChanged(@o0 d dVar, @q0 a aVar, @q0 a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.viewPager == dVar) {
                tabLayout.setPagerAdapter(aVar2, this.autoRefresh);
            }
        }

        public void setAutoRefresh(boolean z6) {
            this.autoRefresh = z6;
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void onTabReselected(T t6);

        void onTabSelected(T t6);

        void onTabUnselected(T t6);
    }

    /* loaded from: classes.dex */
    public @interface LabelVisibility {
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Mode {
    }

    /* loaded from: classes.dex */
    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    /* loaded from: classes.dex */
    public class PagerAdapterObserver extends DataSetObserver {
        public PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }
    }

    /* loaded from: classes.dex */
    public class SlidingTabIndicator extends LinearLayout {
        ValueAnimator indicatorAnimator;
        private int layoutDirection;

        public SlidingTabIndicator(Context context) {
            super(context);
            this.layoutDirection = -1;
            setWillNotDraw(false);
        }

        private void jumpIndicatorToIndicatorPosition() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.indicatorPosition == -1) {
                tabLayout.indicatorPosition = tabLayout.getSelectedTabPosition();
            }
            jumpIndicatorToPosition(TabLayout.this.indicatorPosition);
        }

        private void jumpIndicatorToPosition(int i7) {
            if (TabLayout.this.viewPagerScrollState == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i7);
                TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.tabIndicatorInterpolator;
                TabLayout tabLayout = TabLayout.this;
                tabIndicatorInterpolator.setIndicatorBoundsForTab(tabLayout, childAt, tabLayout.tabSelectedIndicator);
                TabLayout.this.indicatorPosition = i7;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jumpIndicatorToSelectedPosition() {
            jumpIndicatorToPosition(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tweenIndicatorPosition(View view, View view2, float f7) {
            if (view != null && view.getWidth() > 0) {
                TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.tabIndicatorInterpolator;
                TabLayout tabLayout = TabLayout.this;
                tabIndicatorInterpolator.updateIndicatorForOffset(tabLayout, view, view2, f7, tabLayout.tabSelectedIndicator);
            } else {
                Drawable drawable = TabLayout.this.tabSelectedIndicator;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.tabSelectedIndicator.getBounds().bottom);
            }
            u1.n1(this);
        }

        private void updateOrRecreateIndicatorAnimation(boolean z6, int i7, int i8) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.indicatorPosition == i7) {
                return;
            }
            final View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            final View childAt2 = getChildAt(i7);
            if (childAt2 == null) {
                jumpIndicatorToSelectedPosition();
                return;
            }
            TabLayout.this.indicatorPosition = i7;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
                    SlidingTabIndicator.this.tweenIndicatorPosition(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (!z6) {
                this.indicatorAnimator.removeAllUpdateListeners();
                this.indicatorAnimator.addUpdateListener(animatorUpdateListener);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.indicatorAnimator = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.tabIndicatorTimeInterpolator);
            valueAnimator.setDuration(i8);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(animatorUpdateListener);
            valueAnimator.start();
        }

        public void animateIndicatorToPosition(int i7, int i8) {
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.indicatorPosition != i7) {
                this.indicatorAnimator.cancel();
            }
            updateOrRecreateIndicatorAnimation(true, i7, i8);
        }

        public boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                if (getChildAt(i7).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@o0 Canvas canvas) {
            int height;
            int height2 = TabLayout.this.tabSelectedIndicator.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            }
            int i7 = TabLayout.this.tabIndicatorGravity;
            if (i7 == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i7 != 1) {
                height = 0;
                if (i7 != 2) {
                    height2 = i7 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (TabLayout.this.tabSelectedIndicator.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
                TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.tabSelectedIndicator.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
            super.onLayout(z6, i7, i8, i9, i10);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                jumpIndicatorToIndicatorPosition();
            } else {
                updateOrRecreateIndicatorAnimation(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i7, int i8) {
            super.onMeasure(i7, i8);
            if (View.MeasureSpec.getMode(i7) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z6 = true;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        i9 = Math.max(i9, childAt.getMeasuredWidth());
                    }
                }
                if (i9 <= 0) {
                    return;
                }
                if (i9 * childCount <= getMeasuredWidth() - (((int) ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                    boolean z7 = false;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i11).getLayoutParams();
                        if (layoutParams.width != i9 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i9;
                            layoutParams.weight = 0.0f;
                            z7 = true;
                        }
                    }
                    z6 = z7;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.tabGravity = 0;
                    tabLayout2.updateTabViews(false);
                }
                if (z6) {
                    super.onMeasure(i7, i8);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i7) {
            super.onRtlPropertiesChanged(i7);
        }

        public void setIndicatorPositionFromTabPosition(int i7, float f7) {
            TabLayout.this.indicatorPosition = Math.round(i7 + f7);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.indicatorAnimator.cancel();
            }
            tweenIndicatorPosition(getChildAt(i7), getChildAt(i7 + 1), f7);
        }

        public void setSelectedIndicatorHeight(int i7) {
            Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
            TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i7);
            requestLayout();
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TabGravity {
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TabIndicatorAnimationMode {
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TabIndicatorGravity {
    }

    /* loaded from: classes.dex */
    public static class TabLayoutOnPageChangeListener implements d.j {
        private int previousScrollState;
        private int scrollState;
        @o0
        private final WeakReference<TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference<>(tabLayout);
        }

        @Override // p3.d.j
        public void onPageScrollStateChanged(int i7) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i7;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.updateViewPagerScrollState(this.scrollState);
            }
        }

        @Override // p3.d.j
        public void onPageScrolled(int i7, float f7, int i8) {
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i9 = this.scrollState;
                tabLayout.setScrollPosition(i7, f7, i9 != 2 || this.previousScrollState == 1, (i9 == 2 && this.previousScrollState == 0) ? false : true, false);
            }
        }

        @Override // p3.d.j
        public void onPageSelected(int i7) {
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i7 || i7 >= tabLayout.getTabCount()) {
                return;
            }
            int i8 = this.scrollState;
            tabLayout.selectTab(tabLayout.getTabAt(i7), i8 == 0 || (i8 == 2 && this.previousScrollState == 0));
        }

        public void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    /* loaded from: classes.dex */
    public final class TabView extends LinearLayout {
        @q0
        private View badgeAnchorView;
        @q0
        private BadgeDrawable badgeDrawable;
        @q0
        private Drawable baseBackgroundDrawable;
        @q0
        private ImageView customIconView;
        @q0
        private TextView customTextView;
        @q0
        private View customView;
        private int defaultMaxLines;
        private ImageView iconView;
        private Tab tab;
        private TextView textView;

        public TabView(@o0 Context context) {
            super(context);
            this.defaultMaxLines = 2;
            updateBackgroundDrawable(context);
            u1.d2(this, TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            setClickable(true);
            u1.g2(this, o1.c(getContext(), o1.f3749e));
        }

        private void addOnLayoutChangeListener(@q0 final View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                    if (view.getVisibility() == 0) {
                        TabView.this.tryUpdateBadgeDrawableBounds(view);
                    }
                }
            });
        }

        private float approximateLineWidth(@o0 Layout layout, int i7, float f7) {
            return layout.getLineWidth(i7) * (f7 / layout.getPaint().getTextSize());
        }

        private void clipViewToPaddingForBadge(boolean z6) {
            setClipChildren(z6);
            setClipToPadding(z6);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z6);
                viewGroup.setClipToPadding(z6);
            }
        }

        @o0
        private FrameLayout createPreApi18BadgeAnchorRoot() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void drawBackground(@o0 Canvas canvas) {
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @q0
        public BadgeDrawable getBadge() {
            return this.badgeDrawable;
        }

        @q0
        private FrameLayout getCustomParentForBadge(@o0 View view) {
            if ((view == this.iconView || view == this.textView) && BadgeUtils.USE_COMPAT_PARENT) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @o0
        public BadgeDrawable getOrCreateBadge() {
            if (this.badgeDrawable == null) {
                this.badgeDrawable = BadgeDrawable.create(getContext());
            }
            tryUpdateBadgeAnchor();
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasBadgeDrawable() {
            return this.badgeDrawable != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void inflateAndAddDefaultIconView() {
            FrameLayout frameLayout;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout = createPreApi18BadgeAnchorRoot();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.iconView = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void inflateAndAddDefaultTextView() {
            FrameLayout frameLayout;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout = createPreApi18BadgeAnchorRoot();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.textView = textView;
            frameLayout.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBadge() {
            if (this.badgeAnchorView != null) {
                tryRemoveBadgeFromAnchor();
            }
            this.badgeDrawable = null;
        }

        private void tryAttachBadgeToAnchor(@q0 View view) {
            if (hasBadgeDrawable() && view != null) {
                clipViewToPaddingForBadge(false);
                BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
                this.badgeAnchorView = view;
            }
        }

        private void tryRemoveBadgeFromAnchor() {
            if (hasBadgeDrawable()) {
                clipViewToPaddingForBadge(true);
                View view = this.badgeAnchorView;
                if (view != null) {
                    BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
                    this.badgeAnchorView = null;
                }
            }
        }

        private void tryUpdateBadgeAnchor() {
            Tab tab;
            Tab tab2;
            if (hasBadgeDrawable()) {
                if (this.customView != null) {
                    tryRemoveBadgeFromAnchor();
                } else if (this.iconView != null && (tab2 = this.tab) != null && tab2.getIcon() != null) {
                    View view = this.badgeAnchorView;
                    ImageView imageView = this.iconView;
                    if (view == imageView) {
                        tryUpdateBadgeDrawableBounds(imageView);
                        return;
                    }
                    tryRemoveBadgeFromAnchor();
                    tryAttachBadgeToAnchor(this.iconView);
                } else if (this.textView == null || (tab = this.tab) == null || tab.getTabLabelVisibility() != 1) {
                    tryRemoveBadgeFromAnchor();
                } else {
                    View view2 = this.badgeAnchorView;
                    TextView textView = this.textView;
                    if (view2 == textView) {
                        tryUpdateBadgeDrawableBounds(textView);
                        return;
                    }
                    tryRemoveBadgeFromAnchor();
                    tryAttachBadgeToAnchor(this.textView);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tryUpdateBadgeDrawableBounds(@o0 View view) {
            if (hasBadgeDrawable() && view == this.badgeAnchorView) {
                BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void updateBackgroundDrawable(Context context) {
            int i7 = TabLayout.this.tabBackgroundResId;
            if (i7 != 0) {
                Drawable b7 = g.a.b(context, i7);
                this.baseBackgroundDrawable = b7;
                if (b7 != null && b7.isStateful()) {
                    this.baseBackgroundDrawable.setState(getDrawableState());
                }
            } else {
                this.baseBackgroundDrawable = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.tabRippleColorStateList != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList convertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(TabLayout.this.tabRippleColorStateList);
                boolean z6 = TabLayout.this.unboundedRipple;
                if (z6) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(convertToRippleDrawableColor, gradientDrawable, z6 ? null : gradientDrawable2);
            }
            u1.I1(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        private void updateTextAndIcon(@q0 TextView textView, @q0 ImageView imageView, boolean z6) {
            boolean z7;
            Tab tab = this.tab;
            Drawable mutate = (tab == null || tab.getIcon() == null) ? null : c.r(this.tab.getIcon()).mutate();
            if (mutate != null) {
                c.o(mutate, TabLayout.this.tabIconTint);
                PorterDuff.Mode mode = TabLayout.this.tabIconTintMode;
                if (mode != null) {
                    c.p(mutate, mode);
                }
            }
            Tab tab2 = this.tab;
            CharSequence text = tab2 != null ? tab2.getText() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z8 = !TextUtils.isEmpty(text);
            if (textView != null) {
                z7 = z8 && this.tab.labelVisibilityMode == 1;
                textView.setText(z8 ? text : null);
                textView.setVisibility(z7 ? 0 : 8);
                if (z8) {
                    setVisibility(0);
                }
            } else {
                z7 = false;
            }
            if (z6 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int dpToPx = (z7 && imageView.getVisibility() == 0) ? (int) ViewUtils.dpToPx(getContext(), 8) : 0;
                if (TabLayout.this.inlineLabel) {
                    if (dpToPx != r0.b(marginLayoutParams)) {
                        r0.g(marginLayoutParams, dpToPx);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (dpToPx != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = dpToPx;
                    r0.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.tab;
            CharSequence charSequence = tab3 != null ? tab3.contentDesc : null;
            if (!z8) {
                text = charSequence;
            }
            y1.a(this, text);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.baseBackgroundDrawable;
            boolean z6 = false;
            if (drawable != null && drawable.isStateful()) {
                z6 = false | this.baseBackgroundDrawable.setState(drawableState);
            }
            if (z6) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i7 = 0;
            int i8 = 0;
            boolean z6 = false;
            for (int i9 = 0; i9 < 3; i9++) {
                View view = viewArr[i9];
                if (view != null && view.getVisibility() == 0) {
                    i8 = z6 ? Math.min(i8, view.getTop()) : view.getTop();
                    i7 = z6 ? Math.max(i7, view.getBottom()) : view.getBottom();
                    z6 = true;
                }
            }
            return i7 - i8;
        }

        public int getContentWidth() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i7 = 0;
            int i8 = 0;
            boolean z6 = false;
            for (int i9 = 0; i9 < 3; i9++) {
                View view = viewArr[i9];
                if (view != null && view.getVisibility() == 0) {
                    i8 = z6 ? Math.min(i8, view.getLeft()) : view.getLeft();
                    i7 = z6 ? Math.max(i7, view.getRight()) : view.getRight();
                    z6 = true;
                }
            }
            return i7 - i8;
        }

        @q0
        public Tab getTab() {
            return this.tab;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.badgeDrawable.getContentDescription()));
            }
            f0 g22 = f0.g2(accessibilityNodeInfo);
            g22.e1(f0.e.h(0, 1, this.tab.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                g22.c1(false);
                g22.P0(f0.a.f10212j);
            }
            g22.K1(getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i7, int i8) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i7 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i7, i8);
            if (this.textView != null) {
                float f7 = TabLayout.this.tabTextSize;
                int i9 = this.defaultMaxLines;
                ImageView imageView = this.iconView;
                boolean z6 = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.textView;
                    if (textView != null && textView.getLineCount() > 1) {
                        f7 = TabLayout.this.tabTextMultiLineSize;
                    }
                } else {
                    i9 = 1;
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int k7 = v.k(this.textView);
                int i10 = (f7 > textSize ? 1 : (f7 == textSize ? 0 : -1));
                if (i10 != 0 || (k7 >= 0 && i9 != k7)) {
                    if (TabLayout.this.mode == 1 && i10 > 0 && lineCount == 1 && ((layout = this.textView.getLayout()) == null || approximateLineWidth(layout, 0, f7) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z6 = false;
                    }
                    if (z6) {
                        this.textView.setTextSize(0, f7);
                        this.textView.setMaxLines(i9);
                        super.onMeasure(i7, i8);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.tab != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.tab.select();
                return true;
            }
            return performClick;
        }

        public void reset() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z6) {
            if (isSelected() != z6) {
            }
            super.setSelected(z6);
            TextView textView = this.textView;
            if (textView != null) {
                textView.setSelected(z6);
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setSelected(z6);
            }
            View view = this.customView;
            if (view != null) {
                view.setSelected(z6);
            }
        }

        public void setTab(@q0 Tab tab) {
            if (tab != this.tab) {
                this.tab = tab;
                update();
            }
        }

        public final void update() {
            updateTab();
            Tab tab = this.tab;
            setSelected(tab != null && tab.isSelected());
        }

        public final void updateOrientation() {
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            TextView textView = this.customTextView;
            if (textView == null && this.customIconView == null) {
                updateTextAndIcon(this.textView, this.iconView, true);
            } else {
                updateTextAndIcon(textView, this.customIconView, false);
            }
        }

        public final void updateTab() {
            ViewParent parent;
            Tab tab = this.tab;
            View customView = tab != null ? tab.getCustomView() : null;
            if (customView != null) {
                ViewParent parent2 = customView.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(customView);
                    }
                    View view = this.customView;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.customView);
                    }
                    addView(customView);
                }
                this.customView = customView;
                TextView textView = this.textView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.iconView.setImageDrawable(null);
                }
                TextView textView2 = (TextView) customView.findViewById(16908308);
                this.customTextView = textView2;
                if (textView2 != null) {
                    this.defaultMaxLines = v.k(textView2);
                }
                this.customIconView = (ImageView) customView.findViewById(16908294);
            } else {
                View view2 = this.customView;
                if (view2 != null) {
                    removeView(view2);
                    this.customView = null;
                }
                this.customTextView = null;
                this.customIconView = null;
            }
            if (this.customView == null) {
                if (this.iconView == null) {
                    inflateAndAddDefaultIconView();
                }
                if (this.textView == null) {
                    inflateAndAddDefaultTextView();
                    this.defaultMaxLines = v.k(this.textView);
                }
                v.E(this.textView, TabLayout.this.defaultTabTextAppearance);
                if (!isSelected() || TabLayout.this.selectedTabTextAppearance == -1) {
                    v.E(this.textView, TabLayout.this.tabTextAppearance);
                } else {
                    v.E(this.textView, TabLayout.this.selectedTabTextAppearance);
                }
                ColorStateList colorStateList = TabLayout.this.tabTextColors;
                if (colorStateList != null) {
                    this.textView.setTextColor(colorStateList);
                }
                updateTextAndIcon(this.textView, this.iconView, true);
                tryUpdateBadgeAnchor();
                addOnLayoutChangeListener(this.iconView);
                addOnLayoutChangeListener(this.textView);
            } else {
                TextView textView3 = this.customTextView;
                if (textView3 != null || this.customIconView != null) {
                    updateTextAndIcon(textView3, this.customIconView, false);
                }
            }
            if (tab == null || TextUtils.isEmpty(tab.contentDesc)) {
                return;
            }
            setContentDescription(tab.contentDesc);
        }
    }

    /* loaded from: classes.dex */
    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final d viewPager;

        public ViewPagerOnTabSelectedListener(d dVar) {
            this.viewPager = dVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@o0 Tab tab) {
            this.viewPager.setCurrentItem(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }

    public TabLayout(@o0 Context context) {
        this(context, null);
    }

    private void addTabFromItemView(@o0 TabItem tabItem) {
        Tab newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            newTab.setText(charSequence);
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            newTab.setIcon(drawable);
        }
        int i7 = tabItem.customLayout;
        if (i7 != 0) {
            newTab.setCustomView(i7);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(newTab);
    }

    private void addTabView(@o0 Tab tab) {
        TabView tabView = tab.view;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.slidingTabIndicator.addView(tabView, tab.getPosition(), createLayoutParamsForTabs());
    }

    private void addViewInternal(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        addTabFromItemView((TabItem) view);
    }

    private void animateToTab(int i7) {
        if (i7 == -1) {
            return;
        }
        if (getWindowToken() == null || !u1.U0(this) || this.slidingTabIndicator.childrenNeedLayout()) {
            setScrollPosition(i7, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int calculateScrollXForTab = calculateScrollXForTab(i7, 0.0f);
        if (scrollX != calculateScrollXForTab) {
            ensureScrollAnimator();
            this.scrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
            this.scrollAnimator.start();
        }
        this.slidingTabIndicator.animateIndicatorToPosition(i7, this.tabIndicatorAnimationDuration);
    }

    private void applyGravityForModeScrollable(int i7) {
        if (i7 == 0) {
            Log.w(LOG_TAG, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i7 == 1) {
            this.slidingTabIndicator.setGravity(1);
            return;
        } else if (i7 != 2) {
            return;
        }
        this.slidingTabIndicator.setGravity(m0.f3714b);
    }

    private void applyModeAndGravity() {
        int i7 = this.mode;
        u1.d2(this.slidingTabIndicator, (i7 == 0 || i7 == 2) ? Math.max(0, this.contentInsetStart - this.tabPaddingStart) : 0, 0, 0, 0);
        int i8 = this.mode;
        if (i8 == 0) {
            applyGravityForModeScrollable(this.tabGravity);
        } else if (i8 == 1 || i8 == 2) {
            if (this.tabGravity == 2) {
                Log.w(LOG_TAG, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.slidingTabIndicator.setGravity(1);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i7, float f7) {
        View childAt;
        int i8 = this.mode;
        if ((i8 == 0 || i8 == 2) && (childAt = this.slidingTabIndicator.getChildAt(i7)) != null) {
            int i9 = i7 + 1;
            View childAt2 = i9 < this.slidingTabIndicator.getChildCount() ? this.slidingTabIndicator.getChildAt(i9) : null;
            int width = childAt.getWidth();
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i10 = (int) ((width + width2) * 0.5f * f7);
            return u1.Z(this) == 0 ? left + i10 : left - i10;
        }
        return 0;
    }

    private void configureTab(@o0 Tab tab, int i7) {
        tab.setPosition(i7);
        this.tabs.add(i7, tab);
        int size = this.tabs.size();
        int i8 = -1;
        for (int i9 = i7 + 1; i9 < size; i9++) {
            if (this.tabs.get(i9).getPosition() == this.indicatorPosition) {
                i8 = i9;
            }
            this.tabs.get(i9).setPosition(i9);
        }
        this.indicatorPosition = i8;
    }

    @o0
    private static ColorStateList createColorStateList(int i7, int i8) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i8, i7});
    }

    @o0
    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    @o0
    private TabView createTabView(@o0 Tab tab) {
        r.a<TabView> aVar = this.tabViewPool;
        TabView b7 = aVar != null ? aVar.b() : null;
        if (b7 == null) {
            b7 = new TabView(getContext());
        }
        b7.setTab(tab);
        b7.setFocusable(true);
        b7.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.contentDesc)) {
            b7.setContentDescription(tab.text);
        } else {
            b7.setContentDescription(tab.contentDesc);
        }
        return b7;
    }

    private void dispatchTabReselected(@o0 Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabReselected(tab);
        }
    }

    private void dispatchTabSelected(@o0 Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabSelected(tab);
        }
    }

    private void dispatchTabUnselected(@o0 Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabUnselected(tab);
        }
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(this.tabIndicatorTimeInterpolator);
            this.scrollAnimator.setDuration(this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@o0 ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    @d.r(unit = 0)
    private int getDefaultHeight() {
        int size = this.tabs.size();
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Tab tab = this.tabs.get(i7);
                if (tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText())) {
                    z6 = true;
                    break;
                }
                i7++;
            } else {
                break;
            }
        }
        return (!z6 || this.inlineLabel) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i7 = this.requestedTabMinWidth;
        if (i7 != -1) {
            return i7;
        }
        int i8 = this.mode;
        if (i8 == 0 || i8 == 2) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private boolean isScrollingEnabled() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void removeTabViewAt(int i7) {
        TabView tabView = (TabView) this.slidingTabIndicator.getChildAt(i7);
        this.slidingTabIndicator.removeViewAt(i7);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.a(tabView);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i7) {
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i7 < childCount) {
            int i8 = 0;
            while (i8 < childCount) {
                View childAt = this.slidingTabIndicator.getChildAt(i8);
                if ((i8 != i7 || childAt.isSelected()) && (i8 == i7 || !childAt.isSelected())) {
                    childAt.setSelected(i8 == i7);
                    childAt.setActivated(i8 == i7);
                } else {
                    childAt.setSelected(i8 == i7);
                    childAt.setActivated(i8 == i7);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).updateTab();
                    }
                }
                i8++;
            }
        }
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.tabs.get(i7).updateView();
        }
    }

    private void updateTabViewLayoutParams(@o0 LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void addOnTabSelectedListener(@o0 OnTabSelectedListener onTabSelectedListener) {
        addOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void addTab(@o0 Tab tab) {
        addTab(tab, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    public Tab createTabFromPool() {
        Tab b7 = tabPool.b();
        return b7 == null ? new Tab() : b7;
    }

    public int getSelectedTabPosition() {
        Tab tab = this.selectedTab;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    @q0
    public Tab getTabAt(int i7) {
        if (i7 < 0 || i7 >= getTabCount()) {
            return null;
        }
        return this.tabs.get(i7);
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    @q0
    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorAnimationMode() {
        return this.tabIndicatorAnimationMode;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    @q0
    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    @o0
    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    @q0
    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    @o0
    public Tab newTab() {
        Tab createTabFromPool = createTabFromPool();
        createTabFromPool.parent = this;
        createTabFromPool.view = createTabView(createTabFromPool);
        if (createTabFromPool.id != -1) {
            createTabFromPool.view.setId(createTabFromPool.id);
        }
        return createTabFromPool;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof d) {
                setupWithViewPager((d) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@o0 Canvas canvas) {
        for (int i7 = 0; i7 < this.slidingTabIndicator.getChildCount(); i7++) {
            View childAt = this.slidingTabIndicator.getChildAt(i7);
            if (childAt instanceof TabView) {
                ((TabView) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f0.g2(accessibilityNodeInfo).d1(f0.d.f(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isScrollingEnabled() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L29;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.ViewUtils.dpToPx(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.requestedTabMaxWidth
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.ViewUtils.dpToPx(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.tabMaxWidth = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.mode
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || isScrollingEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        a aVar = this.pagerAdapter;
        if (aVar != null) {
            int e7 = aVar.e();
            for (int i7 = 0; i7 < e7; i7++) {
                addTab(newTab().setText(this.pagerAdapter.g(i7)), false);
            }
            d dVar = this.viewPager;
            if (dVar == null || e7 <= 0 || (currentItem = dVar.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            selectTab(getTabAt(currentItem));
        }
    }

    public boolean releaseFromTabPool(Tab tab) {
        return tabPool.a(tab);
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<Tab> it = this.tabs.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.reset();
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    public void removeOnTabSelectedListener(@o0 OnTabSelectedListener onTabSelectedListener) {
        removeOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void removeTab(@o0 Tab tab) {
        if (tab.parent != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        removeTabAt(tab.getPosition());
    }

    public void removeTabAt(int i7) {
        Tab tab = this.selectedTab;
        int position = tab != null ? tab.getPosition() : 0;
        removeTabViewAt(i7);
        Tab remove = this.tabs.remove(i7);
        if (remove != null) {
            remove.reset();
            releaseFromTabPool(remove);
        }
        int size = this.tabs.size();
        int i8 = -1;
        for (int i9 = i7; i9 < size; i9++) {
            if (this.tabs.get(i9).getPosition() == this.indicatorPosition) {
                i8 = i9;
            }
            this.tabs.get(i9).setPosition(i9);
        }
        this.indicatorPosition = i8;
        if (position == i7) {
            selectTab(this.tabs.isEmpty() ? null : this.tabs.get(Math.max(0, i7 - 1)));
        }
    }

    public void selectTab(@q0 Tab tab) {
        selectTab(tab, true);
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f7) {
        super.setElevation(f7);
        MaterialShapeUtils.setElevation(this, f7);
    }

    public void setInlineLabel(boolean z6) {
        if (this.inlineLabel != z6) {
            this.inlineLabel = z6;
            for (int i7 = 0; i7 < this.slidingTabIndicator.getChildCount(); i7++) {
                View childAt = this.slidingTabIndicator.getChildAt(i7);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(@h int i7) {
        setInlineLabel(getResources().getBoolean(i7));
    }

    @Deprecated
    public void setOnTabSelectedListener(@q0 OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void setPagerAdapter(@q0 a aVar, boolean z6) {
        DataSetObserver dataSetObserver;
        a aVar2 = this.pagerAdapter;
        if (aVar2 != null && (dataSetObserver = this.pagerAdapterObserver) != null) {
            aVar2.u(dataSetObserver);
        }
        this.pagerAdapter = aVar;
        if (z6 && aVar != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new PagerAdapterObserver();
            }
            aVar.m(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int i7, float f7, boolean z6) {
        setScrollPosition(i7, f7, z6, true);
    }

    public void setSelectedTabIndicator(@q0 Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = c.r(drawable).mutate();
        this.tabSelectedIndicator = mutate;
        DrawableUtils.setTint(mutate, this.tabSelectedIndicatorColor);
        int i7 = this.tabIndicatorHeight;
        if (i7 == -1) {
            i7 = this.tabSelectedIndicator.getIntrinsicHeight();
        }
        this.slidingTabIndicator.setSelectedIndicatorHeight(i7);
    }

    public void setSelectedTabIndicatorColor(@l int i7) {
        this.tabSelectedIndicatorColor = i7;
        DrawableUtils.setTint(this.tabSelectedIndicator, i7);
        updateTabViews(false);
    }

    public void setSelectedTabIndicatorGravity(int i7) {
        if (this.tabIndicatorGravity != i7) {
            this.tabIndicatorGravity = i7;
            u1.n1(this.slidingTabIndicator);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i7) {
        this.tabIndicatorHeight = i7;
        this.slidingTabIndicator.setSelectedIndicatorHeight(i7);
    }

    public void setTabGravity(int i7) {
        if (this.tabGravity != i7) {
            this.tabGravity = i7;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(@q0 ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(@n int i7) {
        setTabIconTint(g.a.a(getContext(), i7));
    }

    public void setTabIndicatorAnimationMode(int i7) {
        this.tabIndicatorAnimationMode = i7;
        if (i7 == 0) {
            this.tabIndicatorInterpolator = new TabIndicatorInterpolator();
        } else if (i7 == 1) {
            this.tabIndicatorInterpolator = new ElasticTabIndicatorInterpolator();
        } else if (i7 == 2) {
            this.tabIndicatorInterpolator = new FadeTabIndicatorInterpolator();
        } else {
            throw new IllegalArgumentException(i7 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z6) {
        this.tabIndicatorFullWidth = z6;
        this.slidingTabIndicator.jumpIndicatorToSelectedPosition();
        u1.n1(this.slidingTabIndicator);
    }

    public void setTabMode(int i7) {
        if (i7 != this.mode) {
            this.mode = i7;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(@q0 ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i7 = 0; i7 < this.slidingTabIndicator.getChildCount(); i7++) {
                View childAt = this.slidingTabIndicator.getChildAt(i7);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@n int i7) {
        setTabRippleColor(g.a.a(getContext(), i7));
    }

    public void setTabTextColors(@q0 ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@q0 a aVar) {
        setPagerAdapter(aVar, false);
    }

    public void setUnboundedRipple(boolean z6) {
        if (this.unboundedRipple != z6) {
            this.unboundedRipple = z6;
            for (int i7 = 0; i7 < this.slidingTabIndicator.getChildCount(); i7++) {
                View childAt = this.slidingTabIndicator.getChildAt(i7);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@h int i7) {
        setUnboundedRipple(getResources().getBoolean(i7));
    }

    public void setupWithViewPager(@q0 d dVar) {
        setupWithViewPager(dVar, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void updateTabViews(boolean z6) {
        for (int i7 = 0; i7 < this.slidingTabIndicator.getChildCount(); i7++) {
            View childAt = this.slidingTabIndicator.getChildAt(i7);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z6) {
                childAt.requestLayout();
            }
        }
    }

    public void updateViewPagerScrollState(int i7) {
        this.viewPagerScrollState = i7;
    }

    /* loaded from: classes.dex */
    public static class Tab {
        public static final int INVALID_POSITION = -1;
        @q0
        private CharSequence contentDesc;
        @q0
        private View customView;
        @q0
        private Drawable icon;
        @q0
        public TabLayout parent;
        @q0
        private Object tag;
        @q0
        private CharSequence text;
        @o0
        public TabView view;
        private int position = -1;
        @LabelVisibility
        private int labelVisibilityMode = 1;
        private int id = -1;

        @q0
        public BadgeDrawable getBadge() {
            return this.view.getBadge();
        }

        @q0
        public CharSequence getContentDescription() {
            TabView tabView = this.view;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @q0
        public View getCustomView() {
            return this.customView;
        }

        @q0
        public Drawable getIcon() {
            return this.icon;
        }

        public int getId() {
            return this.id;
        }

        @o0
        public BadgeDrawable getOrCreateBadge() {
            return this.view.getOrCreateBadge();
        }

        public int getPosition() {
            return this.position;
        }

        @LabelVisibility
        public int getTabLabelVisibility() {
            return this.labelVisibilityMode;
        }

        @q0
        public Object getTag() {
            return this.tag;
        }

        @q0
        public CharSequence getText() {
            return this.text;
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                return selectedTabPosition != -1 && selectedTabPosition == this.position;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void removeBadge() {
            this.view.removeBadge();
        }

        public void reset() {
            this.parent = null;
            this.view = null;
            this.tag = null;
            this.icon = null;
            this.id = -1;
            this.text = null;
            this.contentDesc = null;
            this.position = -1;
            this.customView = null;
        }

        public void select() {
            TabLayout tabLayout = this.parent;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.selectTab(this);
        }

        @CanIgnoreReturnValue
        @o0
        public Tab setContentDescription(@f1 int i7) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setContentDescription(tabLayout.getResources().getText(i7));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @CanIgnoreReturnValue
        @o0
        public Tab setCustomView(@q0 View view) {
            this.customView = view;
            updateView();
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Tab setIcon(@q0 Drawable drawable) {
            this.icon = drawable;
            TabLayout tabLayout = this.parent;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            updateView();
            if (BadgeUtils.USE_COMPAT_PARENT && this.view.hasBadgeDrawable() && this.view.badgeDrawable.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Tab setId(int i7) {
            this.id = i7;
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.setId(i7);
            }
            return this;
        }

        public void setPosition(int i7) {
            this.position = i7;
        }

        @CanIgnoreReturnValue
        @o0
        public Tab setTabLabelVisibility(@LabelVisibility int i7) {
            this.labelVisibilityMode = i7;
            TabLayout tabLayout = this.parent;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            updateView();
            if (BadgeUtils.USE_COMPAT_PARENT && this.view.hasBadgeDrawable() && this.view.badgeDrawable.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Tab setTag(@q0 Object obj) {
            this.tag = obj;
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Tab setText(@q0 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.contentDesc) && !TextUtils.isEmpty(charSequence)) {
                this.view.setContentDescription(charSequence);
            }
            this.text = charSequence;
            updateView();
            return this;
        }

        public void updateView() {
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.update();
            }
        }

        @CanIgnoreReturnValue
        @o0
        public Tab setCustomView(@j0 int i7) {
            return setCustomView(LayoutInflater.from(this.view.getContext()).inflate(i7, (ViewGroup) this.view, false));
        }

        @CanIgnoreReturnValue
        @o0
        public Tab setContentDescription(@q0 CharSequence charSequence) {
            this.contentDesc = charSequence;
            updateView();
            return this;
        }

        @CanIgnoreReturnValue
        @o0
        public Tab setText(@f1 int i7) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setText(tabLayout.getResources().getText(i7));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @CanIgnoreReturnValue
        @o0
        public Tab setIcon(@d.v int i7) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setIcon(g.a.b(tabLayout.getContext(), i7));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    public TabLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Deprecated
    public void addOnTabSelectedListener(@q0 BaseOnTabSelectedListener baseOnTabSelectedListener) {
        if (this.selectedListeners.contains(baseOnTabSelectedListener)) {
            return;
        }
        this.selectedListeners.add(baseOnTabSelectedListener);
    }

    public void addTab(@o0 Tab tab, int i7) {
        addTab(tab, i7, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i7) {
        addViewInternal(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(@q0 BaseOnTabSelectedListener baseOnTabSelectedListener) {
        this.selectedListeners.remove(baseOnTabSelectedListener);
    }

    public void selectTab(@q0 Tab tab, boolean z6) {
        Tab tab2 = this.selectedTab;
        if (tab2 == tab) {
            if (tab2 != null) {
                dispatchTabReselected(tab);
                animateToTab(tab.getPosition());
                return;
            }
            return;
        }
        int position = tab != null ? tab.getPosition() : -1;
        if (z6) {
            if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                animateToTab(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.selectedTab = tab;
        if (tab2 != null && tab2.parent != null) {
            dispatchTabUnselected(tab2);
        }
        if (tab != null) {
            dispatchTabSelected(tab);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@q0 BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.selectedListener;
        if (baseOnTabSelectedListener2 != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener2);
        }
        this.selectedListener = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            addOnTabSelectedListener(baseOnTabSelectedListener);
        }
    }

    public void setScrollPosition(int i7, float f7, boolean z6, boolean z7) {
        setScrollPosition(i7, f7, z6, z7, true);
    }

    public void setupWithViewPager(@q0 d dVar, boolean z6) {
        setupWithViewPager(dVar, z6, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(@d.o0 android.content.Context r11, @d.q0 android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setupWithViewPager(@q0 d dVar, boolean z6, boolean z7) {
        d dVar2 = this.viewPager;
        if (dVar2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.pageChangeListener;
            if (tabLayoutOnPageChangeListener != null) {
                dVar2.O(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.adapterChangeListener;
            if (adapterChangeListener != null) {
                this.viewPager.N(adapterChangeListener);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.currentVpSelectedListener;
        if (baseOnTabSelectedListener != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener);
            this.currentVpSelectedListener = null;
        }
        if (dVar != null) {
            this.viewPager = dVar;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new TabLayoutOnPageChangeListener(this);
            }
            this.pageChangeListener.reset();
            dVar.c(this.pageChangeListener);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(dVar);
            this.currentVpSelectedListener = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener((BaseOnTabSelectedListener) viewPagerOnTabSelectedListener);
            a adapter = dVar.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z6);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new AdapterChangeListener();
            }
            this.adapterChangeListener.setAutoRefresh(z6);
            dVar.b(this.adapterChangeListener);
            setScrollPosition(dVar.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z7;
    }

    public void addTab(@o0 Tab tab, boolean z6) {
        addTab(tab, this.tabs.size(), z6);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void setScrollPosition(int i7, float f7, boolean z6, boolean z7, boolean z8) {
        int round = Math.round(i7 + f7);
        if (round < 0 || round >= this.slidingTabIndicator.getChildCount()) {
            return;
        }
        if (z7) {
            this.slidingTabIndicator.setIndicatorPositionFromTabPosition(i7, f7);
        }
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.scrollAnimator.cancel();
        }
        int calculateScrollXForTab = calculateScrollXForTab(i7, f7);
        int scrollX = getScrollX();
        boolean z9 = (i7 < getSelectedTabPosition() && calculateScrollXForTab >= scrollX) || (i7 > getSelectedTabPosition() && calculateScrollXForTab <= scrollX) || i7 == getSelectedTabPosition();
        if (u1.Z(this) == 1) {
            z9 = (i7 < getSelectedTabPosition() && calculateScrollXForTab <= scrollX) || (i7 > getSelectedTabPosition() && calculateScrollXForTab >= scrollX) || i7 == getSelectedTabPosition();
        }
        if (z9 || this.viewPagerScrollState == 1 || z8) {
            if (i7 < 0) {
                calculateScrollXForTab = 0;
            }
            scrollTo(calculateScrollXForTab, 0);
        }
        if (z6) {
            setSelectedTabView(round);
        }
    }

    public void addTab(@o0 Tab tab, int i7, boolean z6) {
        if (tab.parent == this) {
            configureTab(tab, i7);
            addTabView(tab);
            if (z6) {
                tab.select();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void setTabTextColors(int i7, int i8) {
        setTabTextColors(createColorStateList(i7, i8));
    }

    public void setSelectedTabIndicator(@d.v int i7) {
        if (i7 != 0) {
            setSelectedTabIndicator(g.a.b(getContext(), i7));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
