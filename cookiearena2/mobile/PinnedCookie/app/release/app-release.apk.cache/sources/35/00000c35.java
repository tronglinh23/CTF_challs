package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.h4;
import androidx.core.view.k1;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import d.b1;
import d.f1;
import d.g1;
import d.m0;
import d.o0;
import d.q0;
import d.u0;
import d.w0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SearchView;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    final View backgroundView;
    private Map<View, Integer> childImportantForAccessibilityMap;
    final ImageButton clearButton;
    final TouchObserverFrameLayout contentContainer;
    @o0
    private TransitionState currentTransitionState;
    final View divider;
    final Toolbar dummyToolbar;
    final EditText editText;
    private final ElevationOverlayProvider elevationOverlayProvider;
    final FrameLayout headerContainer;
    private final boolean layoutInflated;
    final ClippableRoundedCornerLayout rootView;
    final View scrim;
    @q0
    private SearchBar searchBar;
    final TextView searchPrefix;
    private final SearchViewAnimationHelper searchViewAnimationHelper;
    private int softInputMode;
    final View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final MaterialToolbar toolbar;
    final FrameLayout toolbarContainer;
    private final Set<TransitionListener> transitionListeners;
    private boolean useWindowInsetsController;

    /* loaded from: classes.dex */
    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        public Behavior(@o0 Context context, @q0 AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(@o0 CoordinatorLayout coordinatorLayout, @o0 SearchView searchView, @o0 View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends o1.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }

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
        int visibility;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeString(this.text);
            parcel.writeInt(this.visibility);
        }

        public SavedState(Parcel parcel, @q0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
            this.visibility = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public interface TransitionListener {
        void onStateChanged(@o0 SearchView searchView, @o0 TransitionState transitionState, @o0 TransitionState transitionState2);
    }

    /* loaded from: classes.dex */
    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(@o0 Context context) {
        this(context, null);
    }

    public static /* synthetic */ void b(SearchView searchView, View view) {
        searchView.lambda$setUpClearButton$2(view);
    }

    public static /* synthetic */ void c(SearchView searchView, View view) {
        searchView.lambda$setupWithSearchBar$7(view);
    }

    public static /* synthetic */ void d(SearchView searchView) {
        searchView.lambda$requestFocusAndShowKeyboard$8();
    }

    public static /* synthetic */ boolean f(SearchView searchView, View view, MotionEvent motionEvent) {
        return searchView.lambda$setUpContentOnTouchListener$3(view, motionEvent);
    }

    public static /* synthetic */ void g(SearchView searchView, View view) {
        searchView.lambda$setUpBackButton$1(view);
    }

    @q0
    private Window getActivityWindow() {
        Activity activity = ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.searchBar;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @u0
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static /* synthetic */ void h(SearchView searchView) {
        searchView.lambda$clearFocusAndHideKeyboard$9();
    }

    public static /* synthetic */ boolean i(View view, MotionEvent motionEvent) {
        return lambda$setUpRootView$0(view, motionEvent);
    }

    private boolean isNavigationIconDrawerArrowDrawable(@o0 Toolbar toolbar) {
        return q0.c.q(toolbar.getNavigationIcon()) instanceof androidx.appcompat.graphics.drawable.d;
    }

    public /* synthetic */ void lambda$clearFocusAndHideKeyboard$9() {
        this.editText.clearFocus();
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        ViewUtils.hideKeyboard(this.editText, this.useWindowInsetsController);
    }

    public /* synthetic */ void lambda$requestFocusAndShowKeyboard$8() {
        if (this.editText.requestFocus()) {
            this.editText.sendAccessibilityEvent(8);
        }
        ViewUtils.showKeyboard(this.editText, this.useWindowInsetsController);
    }

    public /* synthetic */ void lambda$setUpBackButton$1(View view) {
        hide();
    }

    public /* synthetic */ void lambda$setUpClearButton$2(View view) {
        clearText();
        requestFocusAndShowKeyboardIfNeeded();
    }

    public /* synthetic */ boolean lambda$setUpContentOnTouchListener$3(View view, MotionEvent motionEvent) {
        if (isAdjustNothingSoftInputMode()) {
            clearFocusAndHideKeyboard();
            return false;
        }
        return false;
    }

    public static /* synthetic */ h4 lambda$setUpDividerInsetListener$6(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i8, View view, h4 h4Var) {
        marginLayoutParams.leftMargin = i7 + h4Var.p();
        marginLayoutParams.rightMargin = i8 + h4Var.q();
        return h4Var;
    }

    public static /* synthetic */ boolean lambda$setUpRootView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public /* synthetic */ h4 lambda$setUpStatusBarSpacerInsetListener$5(View view, h4 h4Var) {
        int r6 = h4Var.r();
        setUpStatusBarSpacer(r6);
        if (!this.statusBarSpacerEnabledOverride) {
            setStatusBarSpacerEnabledInternal(r6 > 0);
        }
        return h4Var;
    }

    public /* synthetic */ h4 lambda$setUpToolbarInsetListener$4(View view, h4 h4Var, ViewUtils.RelativePadding relativePadding) {
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this.toolbar);
        this.toolbar.setPadding((isLayoutRtl ? relativePadding.end : relativePadding.start) + h4Var.p(), relativePadding.top, (isLayoutRtl ? relativePadding.start : relativePadding.end) + h4Var.q(), relativePadding.bottom);
        return h4Var;
    }

    public /* synthetic */ void lambda$setupWithSearchBar$7(View view) {
        show();
    }

    private void setStatusBarSpacerEnabledInternal(boolean z6) {
        this.statusBarSpacer.setVisibility(z6 ? 0 : 8);
    }

    private void setUpBackButton(boolean z6, boolean z7) {
        if (z7) {
            this.toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        this.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.g(SearchView.this, view);
            }
        });
        if (z6) {
            androidx.appcompat.graphics.drawable.d dVar = new androidx.appcompat.graphics.drawable.d(getContext());
            dVar.p(MaterialColors.getColor(this, R.attr.colorOnSurface));
            this.toolbar.setNavigationIcon(dVar);
        }
    }

    private void setUpBackgroundViewElevationOverlay() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void setUpClearButton() {
        this.clearButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.b(SearchView.this, view);
            }
        });
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.1
            {
                SearchView.this = this;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                SearchView.this.clearButton.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpContentOnTouchListener() {
        this.contentContainer.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.f(SearchView.this, view, motionEvent);
            }
        });
    }

    private void setUpDividerInsetListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.divider.getLayoutParams();
        final int i7 = marginLayoutParams.leftMargin;
        final int i8 = marginLayoutParams.rightMargin;
        u1.a2(this.divider, new k1() { // from class: com.google.android.material.search.l
            @Override // androidx.core.view.k1
            public final h4 onApplyWindowInsets(View view, h4 h4Var) {
                h4 lambda$setUpDividerInsetListener$6;
                lambda$setUpDividerInsetListener$6 = SearchView.lambda$setUpDividerInsetListener$6(marginLayoutParams, i7, i8, view, h4Var);
                return lambda$setUpDividerInsetListener$6;
            }
        });
    }

    private void setUpEditText(@g1 int i7, String str, String str2) {
        if (i7 != -1) {
            k1.v.E(this.editText, i7);
        }
        this.editText.setText(str);
        this.editText.setHint(str2);
    }

    private void setUpHeaderLayout(int i7) {
        if (i7 != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i7, (ViewGroup) this.headerContainer, false));
        }
    }

    private void setUpInsetListeners() {
        setUpToolbarInsetListener();
        setUpDividerInsetListener();
        setUpStatusBarSpacerInsetListener();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpRootView() {
        this.rootView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.i(view, motionEvent);
            }
        });
    }

    private void setUpStatusBarSpacer(@u0 int i7) {
        if (this.statusBarSpacer.getLayoutParams().height != i7) {
            this.statusBarSpacer.getLayoutParams().height = i7;
            this.statusBarSpacer.requestLayout();
        }
    }

    private void setUpStatusBarSpacerInsetListener() {
        setUpStatusBarSpacer(getStatusBarHeight());
        u1.a2(this.statusBarSpacer, new k1() { // from class: com.google.android.material.search.m
            @Override // androidx.core.view.k1
            public final h4 onApplyWindowInsets(View view, h4 h4Var) {
                h4 lambda$setUpStatusBarSpacerInsetListener$5;
                lambda$setUpStatusBarSpacerInsetListener$5 = SearchView.this.lambda$setUpStatusBarSpacerInsetListener$5(view, h4Var);
                return lambda$setUpStatusBarSpacerInsetListener$5;
            }
        });
    }

    private void setUpToolbarInsetListener() {
        ViewUtils.doOnApplyWindowInsets(this.toolbar, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.q
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final h4 onApplyWindowInsets(View view, h4 h4Var, ViewUtils.RelativePadding relativePadding) {
                h4 lambda$setUpToolbarInsetListener$4;
                lambda$setUpToolbarInsetListener$4 = SearchView.this.lambda$setUpToolbarInsetListener$4(view, h4Var, relativePadding);
                return lambda$setUpToolbarInsetListener$4;
            }
        });
    }

    @SuppressLint({"InlinedApi"})
    private void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean z6) {
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != this) {
                if (childAt.findViewById(this.rootView.getId()) != null) {
                    updateChildImportantForAccessibility((ViewGroup) childAt, z6);
                } else if (z6) {
                    this.childImportantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    u1.R1(childAt, 4);
                } else {
                    Map<View, Integer> map = this.childImportantForAccessibilityMap;
                    if (map != null && map.containsKey(childAt)) {
                        u1.R1(childAt, this.childImportantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void updateNavigationIconIfNeeded() {
        MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar == null || isNavigationIconDrawerArrowDrawable(materialToolbar)) {
            return;
        }
        int i7 = R.drawable.ic_arrow_back_black_24;
        if (this.searchBar == null) {
            this.toolbar.setNavigationIcon(i7);
            return;
        }
        Drawable r6 = q0.c.r(g.a.b(getContext(), i7).mutate());
        if (this.toolbar.getNavigationIconTint() != null) {
            q0.c.n(r6, this.toolbar.getNavigationIconTint().intValue());
        }
        this.toolbar.setNavigationIcon(new FadeThroughDrawable(this.searchBar.getNavigationIcon(), r6));
        updateNavigationIconProgressIfNeeded();
    }

    private void updateNavigationIconProgressIfNeeded() {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        int i7 = this.rootView.getVisibility() == 0 ? 1 : 0;
        Drawable q6 = q0.c.q(navigationIconButton.getDrawable());
        if (q6 instanceof androidx.appcompat.graphics.drawable.d) {
            ((androidx.appcompat.graphics.drawable.d) q6).setProgress(i7);
        }
        if (q6 instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) q6).setProgress(i7);
        }
    }

    public void addHeaderView(@o0 View view) {
        this.headerContainer.addView(view);
        this.headerContainer.setVisibility(0);
    }

    public void addTransitionListener(@o0 TransitionListener transitionListener) {
        this.transitionListeners.add(transitionListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated) {
            this.contentContainer.addView(view, i7, layoutParams);
        } else {
            super.addView(view, i7, layoutParams);
        }
    }

    public void clearFocusAndHideKeyboard() {
        this.editText.post(new Runnable() { // from class: com.google.android.material.search.r
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.h(SearchView.this);
            }
        });
    }

    public void clearText() {
        this.editText.setText("");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @o0
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    @o0
    public TransitionState getCurrentTransitionState() {
        return this.currentTransitionState;
    }

    @o0
    public EditText getEditText() {
        return this.editText;
    }

    @q0
    public CharSequence getHint() {
        return this.editText.getHint();
    }

    @o0
    public TextView getSearchPrefix() {
        return this.searchPrefix;
    }

    @q0
    public CharSequence getSearchPrefixText() {
        return this.searchPrefix.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.softInputMode;
    }

    @q0
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.editText.getText();
    }

    @o0
    public Toolbar getToolbar() {
        return this.toolbar;
    }

    public void hide() {
        if (this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING)) {
            return;
        }
        this.searchViewAnimationHelper.hide();
        setModalForAccessibility(false);
    }

    public void inflateMenu(@m0 int i7) {
        this.toolbar.inflateMenu(i7);
    }

    public boolean isAdjustNothingSoftInputMode() {
        return this.softInputMode == 48;
    }

    public boolean isAnimatedNavigationIcon() {
        return this.animatedNavigationIcon;
    }

    public boolean isAutoShowKeyboard() {
        return this.autoShowKeyboard;
    }

    public boolean isMenuItemsAnimated() {
        return this.animatedMenuItems;
    }

    public boolean isSetupWithSearchBar() {
        return this.searchBar != null;
    }

    public boolean isShowing() {
        return this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean isUseWindowInsetsController() {
        return this.useWindowInsetsController;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
        setVisible(savedState.visibility == 0);
    }

    @Override // android.view.View
    @o0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.text = text == null ? null : text.toString();
        savedState.visibility = this.rootView.getVisibility();
        return savedState;
    }

    public void removeAllHeaderViews() {
        this.headerContainer.removeAllViews();
        this.headerContainer.setVisibility(8);
    }

    public void removeHeaderView(@o0 View view) {
        this.headerContainer.removeView(view);
        if (this.headerContainer.getChildCount() == 0) {
            this.headerContainer.setVisibility(8);
        }
    }

    public void removeTransitionListener(@o0 TransitionListener transitionListener) {
        this.transitionListeners.remove(transitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        this.editText.postDelayed(new Runnable() { // from class: com.google.android.material.search.n
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.d(SearchView.this);
            }
        }, 100L);
    }

    public void requestFocusAndShowKeyboardIfNeeded() {
        if (this.autoShowKeyboard) {
            requestFocusAndShowKeyboard();
        }
    }

    public void setAnimatedNavigationIcon(boolean z6) {
        this.animatedNavigationIcon = z6;
    }

    public void setAutoShowKeyboard(boolean z6) {
        this.autoShowKeyboard = z6;
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f7) {
        super.setElevation(f7);
        setUpBackgroundViewElevationOverlay(f7);
    }

    public void setHint(@q0 CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z6) {
        this.animatedMenuItems = z6;
    }

    public void setModalForAccessibility(boolean z6) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z6) {
            this.childImportantForAccessibilityMap = new HashMap(viewGroup.getChildCount());
        }
        updateChildImportantForAccessibility(viewGroup, z6);
        if (z6) {
            return;
        }
        this.childImportantForAccessibilityMap = null;
    }

    public void setOnMenuItemClickListener(@q0 Toolbar.h hVar) {
        this.toolbar.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(@q0 CharSequence charSequence) {
        this.searchPrefix.setText(charSequence);
        this.searchPrefix.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z6) {
        this.statusBarSpacerEnabledOverride = true;
        setStatusBarSpacerEnabledInternal(z6);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@q0 CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z6) {
        this.toolbar.setTouchscreenBlocksFocus(z6);
    }

    public void setTransitionState(@o0 TransitionState transitionState) {
        if (this.currentTransitionState.equals(transitionState)) {
            return;
        }
        TransitionState transitionState2 = this.currentTransitionState;
        this.currentTransitionState = transitionState;
        Iterator it = new LinkedHashSet(this.transitionListeners).iterator();
        while (it.hasNext()) {
            ((TransitionListener) it.next()).onStateChanged(this, transitionState2, transitionState);
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z6) {
        this.useWindowInsetsController = z6;
    }

    public void setVisible(boolean z6) {
        boolean z7 = this.rootView.getVisibility() == 0;
        this.rootView.setVisibility(z6 ? 0 : 8);
        updateNavigationIconProgressIfNeeded();
        if (z7 != z6) {
            setModalForAccessibility(z6);
        }
        setTransitionState(z6 ? TransitionState.SHOWN : TransitionState.HIDDEN);
    }

    public void setupWithSearchBar(@q0 SearchBar searchBar) {
        this.searchBar = searchBar;
        this.searchViewAnimationHelper.setSearchBar(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchView.c(SearchView.this, view);
                }
            });
        }
        updateNavigationIconIfNeeded();
        setUpBackgroundViewElevationOverlay();
    }

    public void show() {
        if (this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING)) {
            return;
        }
        this.searchViewAnimationHelper.show();
        setModalForAccessibility(true);
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.softInputMode = activityWindow.getAttributes().softInputMode;
        }
    }

    public SearchView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    private void setUpBackgroundViewElevationOverlay(float f7) {
        ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider == null || this.backgroundView == null) {
            return;
        }
        this.backgroundView.setBackgroundColor(elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(f7));
    }

    public void setHint(@f1 int i7) {
        this.editText.setHint(i7);
    }

    public void setText(@f1 int i7) {
        this.editText.setText(i7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchView(@d.o0 android.content.Context r9, @d.q0 android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}