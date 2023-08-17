package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.t1;
import androidx.core.view.h4;
import androidx.core.view.m0;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import d.b1;
import d.d0;
import d.g1;
import d.j0;
import d.o0;
import d.q;
import d.q0;
import d.r;
import d.u0;
import d.v;
import f.a;
import g.a;
import j.g;
import k0.d;
/* loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private boolean bottomInsetScrimEnabled;
    @u0
    private int drawerLayoutCornerSize;
    private int layoutGravity;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    @o0
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final RectF shapeClipBounds;
    @q0
    private Path shapeClipPath;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = R.style.Widget_Design_NavigationView;

    /* loaded from: classes.dex */
    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@o0 MenuItem menuItem);
    }

    public NavigationView(@o0 Context context) {
        this(context, null);
    }

    @q0
    private ColorStateList createDefaultColorStateList(int i7) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i7, typedValue, true)) {
            ColorStateList a7 = a.a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(a.b.J0, typedValue, true)) {
                int i8 = typedValue.data;
                int defaultColor = a7.getDefaultColor();
                int[] iArr = DISABLED_STATE_SET;
                return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{a7.getColorForState(iArr, defaultColor), i8, defaultColor});
            }
            return null;
        }
        return null;
    }

    @o0
    private Drawable createDefaultItemBackground(@o0 t1 t1Var) {
        return createDefaultItemDrawable(t1Var, MaterialResources.getColorStateList(getContext(), t1Var, R.styleable.NavigationView_itemShapeFillColor));
    }

    @o0
    private Drawable createDefaultItemDrawable(@o0 t1 t1Var, @q0 ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), t1Var.u(R.styleable.NavigationView_itemShapeAppearance, 0), t1Var.u(R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, t1Var.g(R.styleable.NavigationView_itemShapeInsetStart, 0), t1Var.g(R.styleable.NavigationView_itemShapeInsetTop, 0), t1Var.g(R.styleable.NavigationView_itemShapeInsetEnd, 0), t1Var.g(R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new g(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(@o0 t1 t1Var) {
        return t1Var.C(R.styleable.NavigationView_itemShapeAppearance) || t1Var.C(R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    private void maybeUpdateCornerSizeForDrawerLayout(@u0 int i7, @u0 int i8) {
        if (!(getParent() instanceof s1.a) || this.drawerLayoutCornerSize <= 0 || !(getBackground() instanceof MaterialShapeDrawable)) {
            this.shapeClipPath = null;
            this.shapeClipBounds.setEmpty();
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
        ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
        if (m0.d(this.layoutGravity, u1.Z(this)) == 3) {
            builder.setTopRightCornerSize(this.drawerLayoutCornerSize);
            builder.setBottomRightCornerSize(this.drawerLayoutCornerSize);
        } else {
            builder.setTopLeftCornerSize(this.drawerLayoutCornerSize);
            builder.setBottomLeftCornerSize(this.drawerLayoutCornerSize);
        }
        materialShapeDrawable.setShapeAppearanceModel(builder.build());
        if (this.shapeClipPath == null) {
            this.shapeClipPath = new Path();
        }
        this.shapeClipPath.reset();
        this.shapeClipBounds.set(0.0f, 0.0f, i7, i8);
        ShapeAppearancePathProvider.getInstance().calculatePath(materialShapeDrawable.getShapeAppearanceModel(), materialShapeDrawable.getInterpolation(), this.shapeClipBounds, this.shapeClipPath);
        invalidate();
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z6 = true;
                boolean z7 = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z7);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z7 && navigationView2.isTopInsetScrimEnabled());
                NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.tmpLocation[0] == 0 || NavigationView.this.tmpLocation[0] + NavigationView.this.getWidth() == 0);
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
                    boolean z8 = currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.tmpLocation[1];
                    boolean z9 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView3 = NavigationView.this;
                    navigationView3.setDrawBottomInsetForeground(z8 && z9 && navigationView3.isBottomInsetScrimEnabled());
                    if (currentWindowBounds.width() != NavigationView.this.tmpLocation[0] && currentWindowBounds.width() - NavigationView.this.getWidth() != NavigationView.this.tmpLocation[0]) {
                        z6 = false;
                    }
                    NavigationView.this.setDrawRightInsetForeground(z6);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(@o0 View view) {
        this.presenter.addHeaderView(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@o0 Canvas canvas) {
        if (this.shapeClipPath == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.shapeClipPath);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @q0
    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    @u0
    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    @u0
    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i7) {
        return this.presenter.getHeaderView(i7);
    }

    @q0
    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    @r
    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    @r
    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    @q0
    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    @q0
    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    @u0
    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    @o0
    public Menu getMenu() {
        return this.menu;
    }

    @u0
    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    @u0
    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    public View inflateHeaderView(@j0 int i7) {
        return this.presenter.inflateHeaderView(i7);
    }

    public void inflateMenu(int i7) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i7, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @b1({b1.a.LIBRARY_GROUP})
    public void onInsetsChanged(@o0 h4 h4Var) {
        this.presenter.dispatchApplyWindowInsets(h4Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i7, i8);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        maybeUpdateCornerSizeForDrawerLayout(i7, i8);
    }

    public void removeHeaderView(@o0 View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z6) {
        this.bottomInsetScrimEnabled = z6;
    }

    public void setCheckedItem(@d0 int i7) {
        MenuItem findItem = this.menu.findItem(i7);
        if (findItem != null) {
            this.presenter.setCheckedItem((j) findItem);
        }
    }

    public void setDividerInsetEnd(@u0 int i7) {
        this.presenter.setDividerInsetEnd(i7);
    }

    public void setDividerInsetStart(@u0 int i7) {
        this.presenter.setDividerInsetStart(i7);
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        MaterialShapeUtils.setElevation(this, f7);
    }

    public void setItemBackground(@q0 Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@v int i7) {
        setItemBackground(d.i(getContext(), i7));
    }

    public void setItemHorizontalPadding(@r int i7) {
        this.presenter.setItemHorizontalPadding(i7);
    }

    public void setItemHorizontalPaddingResource(@q int i7) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i7));
    }

    public void setItemIconPadding(@r int i7) {
        this.presenter.setItemIconPadding(i7);
    }

    public void setItemIconPaddingResource(int i7) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i7));
    }

    public void setItemIconSize(@r int i7) {
        this.presenter.setItemIconSize(i7);
    }

    public void setItemIconTintList(@q0 ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i7) {
        this.presenter.setItemMaxLines(i7);
    }

    public void setItemTextAppearance(@g1 int i7) {
        this.presenter.setItemTextAppearance(i7);
    }

    public void setItemTextColor(@q0 ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(@u0 int i7) {
        this.presenter.setItemVerticalPadding(i7);
    }

    public void setItemVerticalPaddingResource(@q int i7) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i7));
    }

    public void setNavigationItemSelectedListener(@q0 OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i7) {
        super.setOverScrollMode(i7);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i7);
        }
    }

    public void setSubheaderInsetEnd(@u0 int i7) {
        this.presenter.setSubheaderInsetEnd(i7);
    }

    public void setSubheaderInsetStart(@u0 int i7) {
        this.presenter.setSubheaderInsetStart(i7);
    }

    public void setTopInsetScrimEnabled(boolean z6) {
        this.topInsetScrimEnabled = z6;
    }

    /* loaded from: classes.dex */
    public static class SavedState extends o1.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
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
        public Bundle menuState;

        public SavedState(@o0 Parcel parcel, @q0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationView(@d.o0 android.content.Context r17, @d.q0 android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(@o0 MenuItem menuItem) {
        MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.presenter.setCheckedItem((j) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
