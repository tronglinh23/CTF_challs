package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.t1;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import d.b1;
import d.d0;
import d.f;
import d.g1;
import d.o0;
import d.q;
import d.q0;
import d.r;
import d.u0;
import d.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o1.a;
import q0.c;
/* loaded from: classes.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;
    @o0
    private final NavigationBarMenu menu;
    private MenuInflater menuInflater;
    @o0
    private final NavigationBarMenuView menuView;
    @o0
    private final NavigationBarPresenter presenter;
    private OnItemReselectedListener reselectedListener;
    private OnItemSelectedListener selectedListener;

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface LabelVisibility {
    }

    /* loaded from: classes.dex */
    public interface OnItemReselectedListener {
        void onNavigationItemReselected(@o0 MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(@o0 MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @q0
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        @q0
        Bundle menuPresenterState;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeBundle(this.menuPresenterState);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public NavigationBarView(@o0 Context context, @q0 AttributeSet attributeSet, @f int i7, @g1 int i8) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i8), attributeSet, i7);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.presenter = navigationBarPresenter;
        Context context2 = getContext();
        t1 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.NavigationBarView, i7, i8, R.styleable.NavigationBarView_itemTextAppearanceInactive, R.styleable.NavigationBarView_itemTextAppearanceActive);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount());
        this.menu = navigationBarMenu;
        NavigationBarMenuView createNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = createNavigationBarMenuView;
        navigationBarPresenter.setMenuView(createNavigationBarMenuView);
        navigationBarPresenter.setId(1);
        createNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        if (obtainTintedStyledAttributes.C(R.styleable.NavigationBarView_itemIconTint)) {
            createNavigationBarMenuView.setIconTintList(obtainTintedStyledAttributes.d(R.styleable.NavigationBarView_itemIconTint));
        } else {
            createNavigationBarMenuView.setIconTintList(createNavigationBarMenuView.createDefaultColorStateList(16842808));
        }
        setItemIconSize(obtainTintedStyledAttributes.g(R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (obtainTintedStyledAttributes.C(R.styleable.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(obtainTintedStyledAttributes.u(R.styleable.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if (obtainTintedStyledAttributes.C(R.styleable.NavigationBarView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(obtainTintedStyledAttributes.u(R.styleable.NavigationBarView_itemTextAppearanceActive, 0));
        }
        if (obtainTintedStyledAttributes.C(R.styleable.NavigationBarView_itemTextColor)) {
            setItemTextColor(obtainTintedStyledAttributes.d(R.styleable.NavigationBarView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            u1.I1(this, createMaterialShapeDrawableBackground(context2));
        }
        if (obtainTintedStyledAttributes.C(R.styleable.NavigationBarView_itemPaddingTop)) {
            setItemPaddingTop(obtainTintedStyledAttributes.g(R.styleable.NavigationBarView_itemPaddingTop, 0));
        }
        if (obtainTintedStyledAttributes.C(R.styleable.NavigationBarView_itemPaddingBottom)) {
            setItemPaddingBottom(obtainTintedStyledAttributes.g(R.styleable.NavigationBarView_itemPaddingBottom, 0));
        }
        if (obtainTintedStyledAttributes.C(R.styleable.NavigationBarView_elevation)) {
            setElevation(obtainTintedStyledAttributes.g(R.styleable.NavigationBarView_elevation, 0));
        }
        c.o(getBackground().mutate(), MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, R.styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(obtainTintedStyledAttributes.p(R.styleable.NavigationBarView_labelVisibilityMode, -1));
        int u6 = obtainTintedStyledAttributes.u(R.styleable.NavigationBarView_itemBackground, 0);
        if (u6 != 0) {
            createNavigationBarMenuView.setItemBackgroundRes(u6);
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, R.styleable.NavigationBarView_itemRippleColor));
        }
        int u7 = obtainTintedStyledAttributes.u(R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (u7 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(u7, R.styleable.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.builder(context2, obtainStyledAttributes.getResourceId(R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).build());
            obtainStyledAttributes.recycle();
        }
        if (obtainTintedStyledAttributes.C(R.styleable.NavigationBarView_menu)) {
            inflateMenu(obtainTintedStyledAttributes.u(R.styleable.NavigationBarView_menu, 0));
        }
        obtainTintedStyledAttributes.I();
        addView(createNavigationBarMenuView);
        navigationBarMenu.setCallback(new g.a() { // from class: com.google.android.material.navigation.NavigationBarView.1
            @Override // androidx.appcompat.view.menu.g.a
            public boolean onMenuItemSelected(g gVar, @o0 MenuItem menuItem) {
                if (NavigationBarView.this.reselectedListener == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                    return (NavigationBarView.this.selectedListener == null || NavigationBarView.this.selectedListener.onNavigationItemSelected(menuItem)) ? false : true;
                }
                NavigationBarView.this.reselectedListener.onNavigationItemReselected(menuItem);
                return true;
            }

            @Override // androidx.appcompat.view.menu.g.a
            public void onMenuModeChange(g gVar) {
            }
        });
    }

    @o0
    private MaterialShapeDrawable createMaterialShapeDrawableBackground(Context context) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        materialShapeDrawable.initializeElevationOverlay(context);
        return materialShapeDrawable;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new j.g(getContext());
        }
        return this.menuInflater;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @o0
    public abstract NavigationBarMenuView createNavigationBarMenuView(@o0 Context context);

    @q0
    public BadgeDrawable getBadge(int i7) {
        return this.menuView.getBadge(i7);
    }

    @q0
    public ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.getItemActiveIndicatorColor();
    }

    @u0
    public int getItemActiveIndicatorHeight() {
        return this.menuView.getItemActiveIndicatorHeight();
    }

    @u0
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorMarginHorizontal();
    }

    @q0
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.menuView.getItemActiveIndicatorShapeAppearance();
    }

    @u0
    public int getItemActiveIndicatorWidth() {
        return this.menuView.getItemActiveIndicatorWidth();
    }

    @q0
    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @v
    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    @r
    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    @q0
    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    @u0
    public int getItemPaddingBottom() {
        return this.menuView.getItemPaddingBottom();
    }

    @u0
    public int getItemPaddingTop() {
        return this.menuView.getItemPaddingTop();
    }

    @q0
    public ColorStateList getItemRippleColor() {
        return this.menuView.getItemRippleColor();
    }

    @g1
    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    @g1
    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    @q0
    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @o0
    public Menu getMenu() {
        return this.menu;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @o0
    public o getMenuView() {
        return this.menuView;
    }

    @o0
    public BadgeDrawable getOrCreateBadge(int i7) {
        return this.menuView.getOrCreateBadge(i7);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @o0
    public NavigationBarPresenter getPresenter() {
        return this.presenter;
    }

    @d0
    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i7) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i7, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.getItemActiveIndicatorEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@q0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    @Override // android.view.View
    @o0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i7) {
        this.menuView.removeBadge(i7);
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        MaterialShapeUtils.setElevation(this, f7);
    }

    public void setItemActiveIndicatorColor(@q0 ColorStateList colorStateList) {
        this.menuView.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z6) {
        this.menuView.setItemActiveIndicatorEnabled(z6);
    }

    public void setItemActiveIndicatorHeight(@u0 int i7) {
        this.menuView.setItemActiveIndicatorHeight(i7);
    }

    public void setItemActiveIndicatorMarginHorizontal(@u0 int i7) {
        this.menuView.setItemActiveIndicatorMarginHorizontal(i7);
    }

    public void setItemActiveIndicatorShapeAppearance(@q0 ShapeAppearanceModel shapeAppearanceModel) {
        this.menuView.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(@u0 int i7) {
        this.menuView.setItemActiveIndicatorWidth(i7);
    }

    public void setItemBackground(@q0 Drawable drawable) {
        this.menuView.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@v int i7) {
        this.menuView.setItemBackgroundRes(i7);
    }

    public void setItemIconSize(@r int i7) {
        this.menuView.setItemIconSize(i7);
    }

    public void setItemIconSizeRes(@q int i7) {
        setItemIconSize(getResources().getDimensionPixelSize(i7));
    }

    public void setItemIconTintList(@q0 ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i7, @q0 View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i7, onTouchListener);
    }

    public void setItemPaddingBottom(@u0 int i7) {
        this.menuView.setItemPaddingBottom(i7);
    }

    public void setItemPaddingTop(@u0 int i7) {
        this.menuView.setItemPaddingTop(i7);
    }

    public void setItemRippleColor(@q0 ColorStateList colorStateList) {
        this.menuView.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@g1 int i7) {
        this.menuView.setItemTextAppearanceActive(i7);
    }

    public void setItemTextAppearanceInactive(@g1 int i7) {
        this.menuView.setItemTextAppearanceInactive(i7);
    }

    public void setItemTextColor(@q0 ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i7) {
        if (this.menuView.getLabelVisibilityMode() != i7) {
            this.menuView.setLabelVisibilityMode(i7);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(@q0 OnItemReselectedListener onItemReselectedListener) {
        this.reselectedListener = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(@q0 OnItemSelectedListener onItemSelectedListener) {
        this.selectedListener = onItemSelectedListener;
    }

    public void setSelectedItemId(@d0 int i7) {
        MenuItem findItem = this.menu.findItem(i7);
        if (findItem == null || this.menu.performItemAction(findItem, this.presenter, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
