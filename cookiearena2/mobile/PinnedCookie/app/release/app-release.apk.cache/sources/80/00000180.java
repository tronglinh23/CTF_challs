package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import d.b1;
import d.w0;
import java.lang.reflect.Method;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class k extends androidx.appcompat.view.menu.c implements MenuItem {

    /* renamed from: q  reason: collision with root package name */
    public static final String f1161q = "MenuItemWrapper";

    /* renamed from: o  reason: collision with root package name */
    public final u0.b f1162o;

    /* renamed from: p  reason: collision with root package name */
    public Method f1163p;

    /* loaded from: classes.dex */
    public class a extends androidx.core.view.b {

        /* renamed from: e  reason: collision with root package name */
        public final ActionProvider f1164e;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1164e = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f1164e.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public View d() {
            return this.f1164e.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public boolean f() {
            return this.f1164e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void g(SubMenu subMenu) {
            this.f1164e.onPrepareSubMenu(k.this.f(subMenu));
        }
    }

    @w0(16)
    /* loaded from: classes.dex */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: g  reason: collision with root package name */
        public b.InterfaceC0035b f1166g;

        public b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.b
        public boolean c() {
            return this.f1164e.isVisible();
        }

        @Override // androidx.core.view.b
        public View e(MenuItem menuItem) {
            return this.f1164e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean h() {
            return this.f1164e.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void i() {
            this.f1164e.refreshVisibility();
        }

        @Override // androidx.core.view.b
        public void l(b.InterfaceC0035b interfaceC0035b) {
            this.f1166g = interfaceC0035b;
            this.f1164e.setVisibilityListener(interfaceC0035b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z6) {
            b.InterfaceC0035b interfaceC0035b = this.f1166g;
            if (interfaceC0035b != null) {
                interfaceC0035b.onActionProviderVisibilityChanged(z6);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends FrameLayout implements j.c {

        /* renamed from: b  reason: collision with root package name */
        public final CollapsibleActionView f1168b;

        public c(View view) {
            super(view.getContext());
            this.f1168b = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f1168b;
        }

        @Override // j.c
        public void b() {
            this.f1168b.onActionViewExpanded();
        }

        @Override // j.c
        public void c() {
            this.f1168b.onActionViewCollapsed();
        }
    }

    /* loaded from: classes.dex */
    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f1169a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1169a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1169a.onMenuItemActionCollapse(k.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1169a.onMenuItemActionExpand(k.this.e(menuItem));
        }
    }

    /* loaded from: classes.dex */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f1171a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1171a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1171a.onMenuItemClick(k.this.e(menuItem));
        }
    }

    public k(Context context, u0.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1162o = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f1162o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f1162o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b b7 = this.f1162o.b();
        if (b7 instanceof a) {
            return ((a) b7).f1164e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f1162o.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1162o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1162o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1162o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1162o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1162o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1162o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1162o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1162o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1162o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1162o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1162o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1162o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1162o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.f1162o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1162o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f1162o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1162o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1162o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1162o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f1162o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f1162o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f1162o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f1162o.isVisible();
    }

    public void j(boolean z6) {
        try {
            if (this.f1163p == null) {
                this.f1163p = this.f1162o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f1163p.invoke(this.f1162o, Boolean.valueOf(z6));
        } catch (Exception e7) {
            Log.w(f1161q, "Error while calling setExclusiveCheckable", e7);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f1084l, actionProvider);
        u0.b bVar2 = this.f1162o;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f1162o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        this.f1162o.setAlphabeticShortcut(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z6) {
        this.f1162o.setCheckable(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z6) {
        this.f1162o.setChecked(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1162o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z6) {
        this.f1162o.setEnabled(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1162o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1162o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1162o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1162o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        this.f1162o.setNumericShortcut(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1162o.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1162o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f1162o.setShortcut(c7, c8);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i7) {
        this.f1162o.setShowAsAction(i7);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i7) {
        this.f1162o.setShowAsActionFlags(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1162o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1162o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1162o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z6) {
        return this.f1162o.setVisible(z6);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        this.f1162o.setAlphabeticShortcut(c7, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f1162o.setIcon(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7, int i7) {
        this.f1162o.setNumericShortcut(c7, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f1162o.setShortcut(c7, c8, i7, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        this.f1162o.setTitle(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i7) {
        this.f1162o.setActionView(i7);
        View actionView = this.f1162o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1162o.setActionView(new c(actionView));
        }
        return this;
    }
}