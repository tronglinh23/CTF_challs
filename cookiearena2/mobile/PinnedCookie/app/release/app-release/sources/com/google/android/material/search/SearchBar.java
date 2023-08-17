package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.r0;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.f1;
import d.g1;
import d.m0;
import d.o0;
import d.q0;
import d.w0;
import h1.c;
import i0.o2;
/* loaded from: classes.dex */
public class SearchBar extends Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SearchBar;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    @q0
    private final AccessibilityManager accessibilityManager;
    private MaterialShapeDrawable backgroundShape;
    @q0
    private View centerView;
    private final boolean defaultMarginsEnabled;
    private final Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private int menuResId;
    @q0
    private Integer navigationIconTint;
    @q0
    private Drawable originalNavigationIconBackground;
    private final SearchBarAnimationHelper searchBarAnimationHelper;
    private final TextView textView;
    private final boolean tintNavigationIcon;
    private final c.e touchExplorationStateChangeListener;

    /* loaded from: classes.dex */
    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends o1.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchBar.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        String text;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeString(this.text);
        }

        public SavedState(Parcel parcel, @q0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchBar(@o0 Context context) {
        this(context, null);
    }

    private int defaultIfZero(int i7, int i8) {
        return i7 == 0 ? i8 : i7;
    }

    private ColorStateList getCompatBackgroundColorStateList(@d.l int i7, @d.l int i8) {
        int[][] iArr = {new int[]{16842919}, new int[]{16842908}, new int[0]};
        int layer = MaterialColors.layer(i7, i8);
        return new ColorStateList(iArr, new int[]{layer, layer, i7});
    }

    private void initBackground(ShapeAppearanceModel shapeAppearanceModel, float f7, float f8, @d.l int i7) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        this.backgroundShape = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.backgroundShape.setElevation(f7);
        if (f8 >= 0.0f) {
            this.backgroundShape.setStroke(f8, i7);
        }
        int color = MaterialColors.getColor(this, R.attr.colorSurface);
        int color2 = MaterialColors.getColor(this, R.attr.colorControlHighlight);
        this.backgroundShape.setFillColor(ColorStateList.valueOf(color));
        ColorStateList valueOf = ColorStateList.valueOf(color2);
        MaterialShapeDrawable materialShapeDrawable2 = this.backgroundShape;
        u1.I1(this, new RippleDrawable(valueOf, materialShapeDrawable2, materialShapeDrawable2));
    }

    private void initNavigationIcon() {
        setNavigationIcon(getNavigationIcon() == null ? this.defaultNavigationIcon : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    private void initTextView(@g1 int i7, String str, String str2) {
        if (i7 != -1) {
            k1.v.E(this.textView, i7);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            r0.h((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams(), getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(boolean z6) {
        setFocusableInTouchMode(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOnLoadAnimation$1() {
        this.searchBarAnimationHelper.startOnLoadAnimation(this);
    }

    private void layoutCenterView() {
        View view = this.centerView;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i7 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.centerView.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        layoutChild(this.centerView, measuredWidth2, measuredHeight2, i7, measuredHeight2 + measuredHeight);
    }

    private void layoutChild(View view, int i7, int i8, int i9, int i10) {
        if (u1.Z(this) == 1) {
            view.layout(getMeasuredWidth() - i9, i8, getMeasuredWidth() - i7, i10);
        } else {
            view.layout(i7, i8, i9, i10);
        }
    }

    @q0
    private Drawable maybeTintNavigationIcon(@q0 Drawable drawable) {
        int color;
        if (!this.tintNavigationIcon || drawable == null) {
            return drawable;
        }
        Integer num = this.navigationIconTint;
        if (num != null) {
            color = num.intValue();
        } else {
            color = MaterialColors.getColor(this, drawable == this.defaultNavigationIcon ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
        }
        Drawable r6 = q0.c.r(drawable.mutate());
        q0.c.n(r6, color);
        return r6;
    }

    private void measureCenterView(int i7, int i8) {
        View view = this.centerView;
        if (view != null) {
            view.measure(i7, i8);
        }
    }

    private void setDefaultMargins() {
        if (this.defaultMarginsEnabled && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_vertical);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = defaultIfZero(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = defaultIfZero(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = defaultIfZero(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = defaultIfZero(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void setNavigationIconDecorative(boolean z6) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        navigationIconButton.setClickable(!z6);
        navigationIconButton.setFocusable(!z6);
        Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.originalNavigationIconBackground = background;
        }
        navigationIconButton.setBackgroundDrawable(z6 ? null : this.originalNavigationIconBackground);
    }

    private void setOrClearDefaultScrollFlags() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.defaultScrollFlagsEnabled) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    private void setupTouchExplorationStateChangeListener() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.search.SearchBar.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    h1.c.b(SearchBar.this.accessibilityManager, SearchBar.this.touchExplorationStateChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    h1.c.g(SearchBar.this.accessibilityManager, SearchBar.this.touchExplorationStateChangeListener);
                }
            });
        }
    }

    private void validateAttributes(@q0 AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(NAMESPACE_APP, o2.f10768e) != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue(NAMESPACE_APP, "subtitle") != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    public void addCollapseAnimationListener(@o0 AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addCollapseAnimationListener(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(@o0 AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addExpandAnimationListener(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(@o0 OnLoadAnimationCallback onLoadAnimationCallback) {
        this.searchBarAnimationHelper.addOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated && this.centerView == null && !(view instanceof ActionMenuView)) {
            this.centerView = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i7, layoutParams);
    }

    public void clearText() {
        this.textView.setText("");
    }

    @CanIgnoreReturnValue
    public boolean collapse(@o0 View view) {
        return collapse(view, null);
    }

    @CanIgnoreReturnValue
    public boolean expand(@o0 View view) {
        return expand(view, null);
    }

    @q0
    public View getCenterView() {
        return this.centerView;
    }

    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        return materialShapeDrawable != null ? materialShapeDrawable.getElevation() : u1.R(this);
    }

    public float getCornerSize() {
        return this.backgroundShape.getTopLeftCornerResolvedSize();
    }

    @q0
    public CharSequence getHint() {
        return this.textView.getHint();
    }

    public int getMenuResId() {
        return this.menuResId;
    }

    @d.l
    public int getStrokeColor() {
        return this.backgroundShape.getStrokeColor().getDefaultColor();
    }

    @d.r
    public float getStrokeWidth() {
        return this.backgroundShape.getStrokeWidth();
    }

    @q0
    public CharSequence getText() {
        return this.textView.getText();
    }

    @o0
    public TextView getTextView() {
        return this.textView;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@m0 int i7) {
        super.inflateMenu(i7);
        this.menuResId = i7;
    }

    public boolean isCollapsing() {
        return this.searchBarAnimationHelper.isCollapsing();
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.defaultScrollFlagsEnabled;
    }

    public boolean isExpanding() {
        return this.searchBarAnimationHelper.isExpanding();
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.searchBarAnimationHelper.isOnLoadAnimationFadeInEnabled();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.backgroundShape);
        setDefaultMargins();
        setOrClearDefaultScrollFlags();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(isEmpty);
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        layoutCenterView();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        measureCenterView(i7, i8);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @o0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.text = text == null ? null : text.toString();
        return savedState;
    }

    public boolean removeCollapseAnimationListener(@o0 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeCollapseAnimationListener(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(@o0 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeExpandAnimationListener(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(@o0 OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.searchBarAnimationHelper.removeOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    public void setCenterView(@q0 View view) {
        View view2 = this.centerView;
        if (view2 != null) {
            removeView(view2);
            this.centerView = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z6) {
        this.defaultScrollFlagsEnabled = z6;
        setOrClearDefaultScrollFlags();
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f7) {
        super.setElevation(f7);
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f7);
        }
    }

    public void setHint(@q0 CharSequence charSequence) {
        this.textView.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@q0 Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.forceDefaultNavigationOnClickListener) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z6) {
        this.searchBarAnimationHelper.setOnLoadAnimationFadeInEnabled(z6);
    }

    public void setStrokeColor(@d.l int i7) {
        if (getStrokeColor() != i7) {
            this.backgroundShape.setStrokeColor(ColorStateList.valueOf(i7));
        }
    }

    public void setStrokeWidth(@d.r float f7) {
        if (getStrokeWidth() != f7) {
            this.backgroundShape.setStrokeWidth(f7);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@q0 CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void startOnLoadAnimation() {
        post(new Runnable() { // from class: com.google.android.material.search.b
            @Override // java.lang.Runnable
            public final void run() {
                SearchBar.this.lambda$startOnLoadAnimation$1();
            }
        });
    }

    public void stopOnLoadAnimation() {
        this.searchBarAnimationHelper.stopOnLoadAnimation(this);
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        public ScrollingViewBehavior() {
            this.initialized = false;
        }

        private void setAppBarLayoutTransparent(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.initialized && (view2 instanceof AppBarLayout)) {
                this.initialized = true;
                setAppBarLayoutTransparent((AppBarLayout) view2);
            }
            return onDependentViewChanged;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior(@o0 Context context, @q0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.initialized = false;
        }
    }

    public SearchBar(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    @CanIgnoreReturnValue
    public boolean collapse(@o0 View view, @q0 AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    @CanIgnoreReturnValue
    public boolean expand(@o0 View view, @q0 AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    public void setHint(@f1 int i7) {
        this.textView.setHint(i7);
    }

    public void setText(@f1 int i7) {
        this.textView.setText(i7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchBar(@d.o0 android.content.Context r10, @d.q0 android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r6 = com.google.android.material.search.SearchBar.DEF_STYLE_RES
            android.content.Context r10 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r10, r11, r12, r6)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.menuResId = r10
            com.google.android.material.search.a r0 = new com.google.android.material.search.a
            r0.<init>()
            r9.touchExplorationStateChangeListener = r0
            android.content.Context r7 = r9.getContext()
            r9.validateAttributes(r11)
            int r0 = com.google.android.material.R.drawable.ic_search_black_24
            android.graphics.drawable.Drawable r0 = g.a.b(r7, r0)
            r9.defaultNavigationIcon = r0
            com.google.android.material.search.SearchBarAnimationHelper r0 = new com.google.android.material.search.SearchBarAnimationHelper
            r0.<init>()
            r9.searchBarAnimationHelper = r0
            int[] r2 = com.google.android.material.R.styleable.SearchBar
            r8 = 0
            int[] r5 = new int[r8]
            r0 = r7
            r1 = r11
            r3 = r12
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r11 = com.google.android.material.shape.ShapeAppearanceModel.builder(r7, r11, r12, r6)
            com.google.android.material.shape.ShapeAppearanceModel r11 = r11.build()
            int r12 = com.google.android.material.R.styleable.SearchBar_elevation
            r1 = 0
            float r12 = r0.getDimension(r12, r1)
            int r1 = com.google.android.material.R.styleable.SearchBar_defaultMarginsEnabled
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            r9.defaultMarginsEnabled = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_defaultScrollFlagsEnabled
            boolean r1 = r0.getBoolean(r1, r2)
            r9.defaultScrollFlagsEnabled = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_hideNavigationIcon
            boolean r1 = r0.getBoolean(r1, r8)
            int r3 = com.google.android.material.R.styleable.SearchBar_forceDefaultNavigationOnClickListener
            boolean r3 = r0.getBoolean(r3, r8)
            r9.forceDefaultNavigationOnClickListener = r3
            int r3 = com.google.android.material.R.styleable.SearchBar_tintNavigationIcon
            boolean r3 = r0.getBoolean(r3, r2)
            r9.tintNavigationIcon = r3
            int r3 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            boolean r3 = r0.hasValue(r3)
            if (r3 == 0) goto L80
            int r3 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            int r3 = r0.getColor(r3, r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.navigationIconTint = r3
        L80:
            int r3 = com.google.android.material.R.styleable.SearchBar_android_textAppearance
            int r10 = r0.getResourceId(r3, r10)
            int r3 = com.google.android.material.R.styleable.SearchBar_android_text
            java.lang.String r3 = r0.getString(r3)
            int r4 = com.google.android.material.R.styleable.SearchBar_android_hint
            java.lang.String r4 = r0.getString(r4)
            int r5 = com.google.android.material.R.styleable.SearchBar_strokeWidth
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r0.getDimension(r5, r6)
            int r6 = com.google.android.material.R.styleable.SearchBar_strokeColor
            int r6 = r0.getColor(r6, r8)
            r0.recycle()
            if (r1 != 0) goto La8
            r9.initNavigationIcon()
        La8:
            r9.setClickable(r2)
            r9.setFocusable(r2)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r7)
            int r1 = com.google.android.material.R.layout.mtrl_search_bar
            r0.inflate(r1, r9)
            r9.layoutInflated = r2
            int r0 = com.google.android.material.R.id.search_bar_text_view
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.textView = r0
            androidx.core.view.u1.N1(r9, r12)
            r9.initTextView(r10, r3, r4)
            r9.initBackground(r11, r12, r5, r6)
            android.content.Context r10 = r9.getContext()
            java.lang.String r11 = "accessibility"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.view.accessibility.AccessibilityManager r10 = (android.view.accessibility.AccessibilityManager) r10
            r9.accessibilityManager = r10
            r9.setupTouchExplorationStateChangeListener()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @CanIgnoreReturnValue
    public boolean collapse(@o0 View view, @q0 AppBarLayout appBarLayout, boolean z6) {
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        this.searchBarAnimationHelper.startCollapseAnimation(this, view, appBarLayout, z6);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean expand(@o0 View view, @q0 AppBarLayout appBarLayout, boolean z6) {
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        this.searchBarAnimationHelper.startExpandAnimation(this, view, appBarLayout, z6);
        return true;
    }
}
