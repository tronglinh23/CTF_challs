package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.s;
import androidx.core.view.h4;
import androidx.core.view.u1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import com.google.android.material.R;
import d.b1;
import d.g1;
import d.j0;
import d.o0;
import d.q0;
import d.r;
import d.u0;
import h1.f0;
import java.util.ArrayList;
import k1.v;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class NavigationMenuPresenter implements n {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuAdapter adapter;
    private n.a callback;
    @u0
    int dividerInsetEnd;
    @u0
    int dividerInsetStart;
    boolean hasCustomItemIconSize;
    LinearLayout headerLayout;
    ColorStateList iconTintList;
    private int id;
    Drawable itemBackground;
    RippleDrawable itemForeground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;
    @u0
    int itemVerticalPadding;
    LayoutInflater layoutInflater;
    g menu;
    private NavigationMenuView menuView;
    int paddingSeparator;
    private int paddingTopDefault;
    @q0
    ColorStateList subheaderColor;
    @u0
    int subheaderInsetEnd;
    @u0
    int subheaderInsetStart;
    ColorStateList textColor;
    int subheaderTextAppearance = 0;
    int textAppearance = 0;
    boolean isBehindStatusBar = true;
    private int overScrollMode = -1;
    final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z6 = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            j itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean performItemAction = navigationMenuPresenter.menu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && performItemAction) {
                NavigationMenuPresenter.this.adapter.setCheckedItem(itemData);
            } else {
                z6 = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z6) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    /* loaded from: classes.dex */
    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    /* loaded from: classes.dex */
    public class NavigationMenuAdapter extends RecyclerView.g<ViewHolder> {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private j checkedItem;
        private final ArrayList<NavigationMenuItem> items = new ArrayList<>();
        private boolean updateSuspended;

        public NavigationMenuAdapter() {
            prepareMenuItems();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int adjustItemPositionForA11yDelegate(int i7) {
            int i8 = i7;
            for (int i9 = 0; i9 < i7; i9++) {
                if (NavigationMenuPresenter.this.adapter.getItemViewType(i9) == 2) {
                    i8--;
                }
            }
            return NavigationMenuPresenter.this.headerLayout.getChildCount() == 0 ? i8 - 1 : i8;
        }

        private void appendTransparentIconIfMissing(int i7, int i8) {
            while (i7 < i8) {
                ((NavigationMenuTextItem) this.items.get(i7)).needsEmptyIcon = true;
                i7++;
            }
        }

        private void prepareMenuItems() {
            if (this.updateSuspended) {
                return;
            }
            boolean z6 = true;
            this.updateSuspended = true;
            this.items.clear();
            this.items.add(new NavigationMenuHeaderItem());
            int size = NavigationMenuPresenter.this.menu.getVisibleItems().size();
            int i7 = -1;
            int i8 = 0;
            boolean z7 = false;
            int i9 = 0;
            while (i8 < size) {
                j jVar = NavigationMenuPresenter.this.menu.getVisibleItems().get(i8);
                if (jVar.isChecked()) {
                    setCheckedItem(jVar);
                }
                if (jVar.isCheckable()) {
                    jVar.w(false);
                }
                if (jVar.hasSubMenu()) {
                    SubMenu subMenu = jVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i8 != 0) {
                            this.items.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.paddingSeparator, 0));
                        }
                        this.items.add(new NavigationMenuTextItem(jVar));
                        int size2 = this.items.size();
                        int size3 = subMenu.size();
                        int i10 = 0;
                        boolean z8 = false;
                        while (i10 < size3) {
                            j jVar2 = (j) subMenu.getItem(i10);
                            if (jVar2.isVisible()) {
                                if (!z8 && jVar2.getIcon() != null) {
                                    z8 = z6;
                                }
                                if (jVar2.isCheckable()) {
                                    jVar2.w(false);
                                }
                                if (jVar.isChecked()) {
                                    setCheckedItem(jVar);
                                }
                                this.items.add(new NavigationMenuTextItem(jVar2));
                            }
                            i10++;
                            z6 = true;
                        }
                        if (z8) {
                            appendTransparentIconIfMissing(size2, this.items.size());
                        }
                    }
                } else {
                    int groupId = jVar.getGroupId();
                    if (groupId != i7) {
                        i9 = this.items.size();
                        z7 = jVar.getIcon() != null;
                        if (i8 != 0) {
                            i9++;
                            ArrayList<NavigationMenuItem> arrayList = this.items;
                            int i11 = NavigationMenuPresenter.this.paddingSeparator;
                            arrayList.add(new NavigationMenuSeparatorItem(i11, i11));
                        }
                    } else if (!z7 && jVar.getIcon() != null) {
                        appendTransparentIconIfMissing(i9, this.items.size());
                        z7 = true;
                    }
                    NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(jVar);
                    navigationMenuTextItem.needsEmptyIcon = z7;
                    this.items.add(navigationMenuTextItem);
                    i7 = groupId;
                }
                i8++;
                z6 = true;
            }
            this.updateSuspended = false;
        }

        private void setAccessibilityDelegate(View view, final int i7, final boolean z6) {
            u1.B1(view, new androidx.core.view.a() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // androidx.core.view.a
                public void onInitializeAccessibilityNodeInfo(@o0 View view2, @o0 f0 f0Var) {
                    super.onInitializeAccessibilityNodeInfo(view2, f0Var);
                    f0Var.e1(f0.e.h(NavigationMenuAdapter.this.adjustItemPositionForA11yDelegate(i7), 1, 1, 1, z6, view2.isSelected()));
                }
            });
        }

        @o0
        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            j jVar = this.checkedItem;
            if (jVar != null) {
                bundle.putInt(STATE_CHECKED_ITEM, jVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.items.size();
            for (int i7 = 0; i7 < size; i7++) {
                NavigationMenuItem navigationMenuItem = this.items.get(i7);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    j menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        public j getCheckedItem() {
            return this.checkedItem;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int getItemCount() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public long getItemId(int i7) {
            return i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int getItemViewType(int i7) {
            NavigationMenuItem navigationMenuItem = this.items.get(i7);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public int getRowCount() {
            int i7 = NavigationMenuPresenter.this.headerLayout.getChildCount() == 0 ? 0 : 1;
            for (int i8 = 0; i8 < NavigationMenuPresenter.this.adapter.getItemCount(); i8++) {
                int itemViewType = NavigationMenuPresenter.this.adapter.getItemViewType(i8);
                if (itemViewType == 0 || itemViewType == 1) {
                    i7++;
                }
            }
            return i7;
        }

        public void restoreInstanceState(@o0 Bundle bundle) {
            j menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            j menuItem2;
            int i7 = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i7 != 0) {
                this.updateSuspended = true;
                int size = this.items.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    NavigationMenuItem navigationMenuItem = this.items.get(i8);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.getItemId() == i7) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                    i8++;
                }
                this.updateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.items.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    NavigationMenuItem navigationMenuItem2 = this.items.get(i9);
                    if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(@o0 j jVar) {
            if (this.checkedItem == jVar || !jVar.isCheckable()) {
                return;
            }
            j jVar2 = this.checkedItem;
            if (jVar2 != null) {
                jVar2.setChecked(false);
            }
            this.checkedItem = jVar;
            jVar.setChecked(true);
        }

        public void setUpdateSuspended(boolean z6) {
            this.updateSuspended = z6;
        }

        public void update() {
            prepareMenuItems();
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(@o0 ViewHolder viewHolder, int i7) {
            int itemViewType = getItemViewType(i7);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType == 2) {
                        NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.items.get(i7);
                        viewHolder.itemView.setPadding(NavigationMenuPresenter.this.dividerInsetStart, navigationMenuSeparatorItem.getPaddingTop(), NavigationMenuPresenter.this.dividerInsetEnd, navigationMenuSeparatorItem.getPaddingBottom());
                        return;
                    } else if (itemViewType != 3) {
                        return;
                    } else {
                        setAccessibilityDelegate(viewHolder.itemView, i7, true);
                        return;
                    }
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((NavigationMenuTextItem) this.items.get(i7)).getMenuItem().getTitle());
                int i8 = NavigationMenuPresenter.this.subheaderTextAppearance;
                if (i8 != 0) {
                    v.E(textView, i8);
                }
                textView.setPadding(NavigationMenuPresenter.this.subheaderInsetStart, textView.getPaddingTop(), NavigationMenuPresenter.this.subheaderInsetEnd, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.subheaderColor;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                setAccessibilityDelegate(textView, i7, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.iconTintList);
            int i9 = NavigationMenuPresenter.this.textAppearance;
            if (i9 != 0) {
                navigationMenuItemView.setTextAppearance(i9);
            }
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.textColor;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = NavigationMenuPresenter.this.itemBackground;
            u1.I1(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.itemForeground;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.items.get(i7);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i10 = navigationMenuPresenter.itemHorizontalPadding;
            int i11 = navigationMenuPresenter.itemVerticalPadding;
            navigationMenuItemView.setPadding(i10, i11, i10, i11);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.hasCustomItemIconSize) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.itemIconSize);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.itemMaxLines);
            navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), 0);
            setAccessibilityDelegate(navigationMenuItemView, i7, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        @q0
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            if (i7 == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.layoutInflater, viewGroup, navigationMenuPresenter.onClickListener);
            } else if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        return null;
                    }
                    return new HeaderViewHolder(NavigationMenuPresenter.this.headerLayout);
                }
                return new SeparatorViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            } else {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    /* loaded from: classes.dex */
    public interface NavigationMenuItem {
    }

    /* loaded from: classes.dex */
    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int i7, int i8) {
            this.paddingTop = i7;
            this.paddingBottom = i8;
        }

        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }
    }

    /* loaded from: classes.dex */
    public static class NavigationMenuTextItem implements NavigationMenuItem {
        private final j menuItem;
        boolean needsEmptyIcon;

        public NavigationMenuTextItem(j jVar) {
            this.menuItem = jVar;
        }

        public j getMenuItem() {
            return this.menuItem;
        }
    }

    /* loaded from: classes.dex */
    public class NavigationMenuViewAccessibilityDelegate extends y {
        public NavigationMenuViewAccessibilityDelegate(@o0 RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.y, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @o0 f0 f0Var) {
            super.onInitializeAccessibilityNodeInfo(view, f0Var);
            f0Var.d1(f0.d.e(NavigationMenuPresenter.this.adapter.getRowCount(), 1, false));
        }
    }

    /* loaded from: classes.dex */
    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@o0 LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* loaded from: classes.dex */
    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(@o0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* loaded from: classes.dex */
    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(@o0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ViewHolder extends RecyclerView.f0 {
        public ViewHolder(View view) {
            super(view);
        }
    }

    private void updateTopPadding() {
        int i7 = (this.headerLayout.getChildCount() == 0 && this.isBehindStatusBar) ? this.paddingTopDefault : 0;
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i7, 0, navigationMenuView.getPaddingBottom());
    }

    public void addHeaderView(@o0 View view) {
        this.headerLayout.addView(view);
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(g gVar, j jVar) {
        return false;
    }

    public void dispatchApplyWindowInsets(@o0 h4 h4Var) {
        int r6 = h4Var.r();
        if (this.paddingTopDefault != r6) {
            this.paddingTopDefault = r6;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, h4Var.o());
        u1.p(this.headerLayout, h4Var);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    @q0
    public j getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    @u0
    public int getDividerInsetEnd() {
        return this.dividerInsetEnd;
    }

    @u0
    public int getDividerInsetStart() {
        return this.dividerInsetStart;
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int i7) {
        return this.headerLayout.getChildAt(i7);
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.id;
    }

    @q0
    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    @q0
    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    @q0
    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    @u0
    public int getItemVerticalPadding() {
        return this.itemVerticalPadding;
    }

    @Override // androidx.appcompat.view.menu.n
    public o getMenuView(ViewGroup viewGroup) {
        if (this.menuView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.layoutInflater.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.menuView));
            if (this.adapter == null) {
                this.adapter = new NavigationMenuAdapter();
            }
            int i7 = this.overScrollMode;
            if (i7 != -1) {
                this.menuView.setOverScrollMode(i7);
            }
            this.headerLayout = (LinearLayout) this.layoutInflater.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.menuView, false);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    @u0
    public int getSubheaderInsetEnd() {
        return this.subheaderInsetEnd;
    }

    @u0
    public int getSubheaderInsetStart() {
        return this.subheaderInsetStart;
    }

    public View inflateHeaderView(@j0 int i7) {
        View inflate = this.layoutInflater.inflate(i7, (ViewGroup) this.headerLayout, false);
        addHeaderView(inflate);
        return inflate;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(@o0 Context context, @o0 g gVar) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = gVar;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(g gVar, boolean z6) {
        n.a aVar = this.callback;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.restoreInstanceState(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    @o0
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.menuView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.headerLayout != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(s sVar) {
        return false;
    }

    public void removeHeaderView(@o0 View view) {
        this.headerLayout.removeView(view);
        if (this.headerLayout.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.menuView;
            navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void setBehindStatusBar(boolean z6) {
        if (this.isBehindStatusBar != z6) {
            this.isBehindStatusBar = z6;
            updateTopPadding();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(n.a aVar) {
        this.callback = aVar;
    }

    public void setCheckedItem(@o0 j jVar) {
        this.adapter.setCheckedItem(jVar);
    }

    public void setDividerInsetEnd(@u0 int i7) {
        this.dividerInsetEnd = i7;
        updateMenuView(false);
    }

    public void setDividerInsetStart(@u0 int i7) {
        this.dividerInsetStart = i7;
        updateMenuView(false);
    }

    public void setId(int i7) {
        this.id = i7;
    }

    public void setItemBackground(@q0 Drawable drawable) {
        this.itemBackground = drawable;
        updateMenuView(false);
    }

    public void setItemForeground(@q0 RippleDrawable rippleDrawable) {
        this.itemForeground = rippleDrawable;
        updateMenuView(false);
    }

    public void setItemHorizontalPadding(int i7) {
        this.itemHorizontalPadding = i7;
        updateMenuView(false);
    }

    public void setItemIconPadding(int i7) {
        this.itemIconPadding = i7;
        updateMenuView(false);
    }

    public void setItemIconSize(@r int i7) {
        if (this.itemIconSize != i7) {
            this.itemIconSize = i7;
            this.hasCustomItemIconSize = true;
            updateMenuView(false);
        }
    }

    public void setItemIconTintList(@q0 ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i7) {
        this.itemMaxLines = i7;
        updateMenuView(false);
    }

    public void setItemTextAppearance(@g1 int i7) {
        this.textAppearance = i7;
        updateMenuView(false);
    }

    public void setItemTextColor(@q0 ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateMenuView(false);
    }

    public void setItemVerticalPadding(@u0 int i7) {
        this.itemVerticalPadding = i7;
        updateMenuView(false);
    }

    public void setOverScrollMode(int i7) {
        this.overScrollMode = i7;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i7);
        }
    }

    public void setSubheaderColor(@q0 ColorStateList colorStateList) {
        this.subheaderColor = colorStateList;
        updateMenuView(false);
    }

    public void setSubheaderInsetEnd(@u0 int i7) {
        this.subheaderInsetEnd = i7;
        updateMenuView(false);
    }

    public void setSubheaderInsetStart(@u0 int i7) {
        this.subheaderInsetStart = i7;
        updateMenuView(false);
    }

    public void setSubheaderTextAppearance(@g1 int i7) {
        this.subheaderTextAppearance = i7;
        updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z6) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z6);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z6) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }
}
