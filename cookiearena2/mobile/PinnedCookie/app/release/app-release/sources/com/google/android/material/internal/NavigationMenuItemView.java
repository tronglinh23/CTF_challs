package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.y1;
import androidx.core.view.u1;
import com.google.android.material.R;
import d.b1;
import d.o0;
import d.q0;
import d.r;
import f.a;
import h1.f0;
import k1.v;
import m0.i;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements o.a {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private final androidx.core.view.a accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    private j itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    public NavigationMenuItemView(@o0 Context context) {
        this(context, null);
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                y0.b bVar = (y0.b) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) bVar).width = -1;
                this.actionArea.setLayoutParams(bVar);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            y0.b bVar2 = (y0.b) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) bVar2).width = -2;
            this.actionArea.setLayoutParams(bVar2);
        }
    }

    @q0
    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(a.b.G0, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private void setActionView(@q0 View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private boolean shouldExpandActionArea() {
        return this.itemData.getTitle() == null && this.itemData.getIcon() == null && this.itemData.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void initialize(@o0 j jVar, int i7) {
        this.itemData = jVar;
        if (jVar.getItemId() > 0) {
            setId(jVar.getItemId());
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            u1.I1(this, createDefaultBackground());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        y1.a(this, jVar.getTooltipText());
        adjustAppearance();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        j jVar = this.itemData;
        if (jVar != null && jVar.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z6) {
        refreshDrawableState();
        if (this.checkable != z6) {
            this.checkable = z6;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z6) {
        refreshDrawableState();
        this.textView.setChecked(z6);
        CheckedTextView checkedTextView = this.textView;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z6 ? 1 : 0);
    }

    public void setHorizontalPadding(int i7) {
        setPadding(i7, getPaddingTop(), i7, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(@q0 Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = q0.c.r(drawable).mutate();
                q0.c.o(drawable, this.iconTintList);
            }
            int i7 = this.iconSize;
            drawable.setBounds(0, 0, i7, i7);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable g7 = i.g(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                this.emptyDrawable = g7;
                if (g7 != null) {
                    int i8 = this.iconSize;
                    g7.setBounds(0, 0, i8, i8);
                }
            }
            drawable = this.emptyDrawable;
        }
        v.w(this.textView, drawable, null, null, null);
    }

    public void setIconPadding(int i7) {
        this.textView.setCompoundDrawablePadding(i7);
    }

    public void setIconSize(@r int i7) {
        this.iconSize = i7;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        j jVar = this.itemData;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i7) {
        this.textView.setMaxLines(i7);
    }

    public void setNeedsEmptyIcon(boolean z6) {
        this.needsEmptyIcon = z6;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setShortcut(boolean z6, char c7) {
    }

    public void setTextAppearance(int i7) {
        v.E(this.textView, i7);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@o0 Context context, @q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        androidx.core.view.a aVar = new androidx.core.view.a() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view, @o0 f0 f0Var) {
                super.onInitializeAccessibilityNodeInfo(view, f0Var);
                f0Var.Z0(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        u1.B1(checkedTextView, aVar);
    }
}
