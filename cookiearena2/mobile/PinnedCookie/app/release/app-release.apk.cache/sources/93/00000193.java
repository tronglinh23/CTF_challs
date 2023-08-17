package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.g;
import d.b1;
import d.o0;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class s extends g implements SubMenu {
    private j mItem;
    private g mParentMenu;

    public s(Context context, g gVar, j jVar) {
        super(context);
        this.mParentMenu = gVar;
        this.mItem = jVar;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean collapseItemActionView(j jVar) {
        return this.mParentMenu.collapseItemActionView(jVar);
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean dispatchMenuItemSelected(@o0 g gVar, @o0 MenuItem menuItem) {
        return super.dispatchMenuItemSelected(gVar, menuItem) || this.mParentMenu.dispatchMenuItemSelected(gVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean expandItemActionView(j jVar) {
        return this.mParentMenu.expandItemActionView(jVar);
    }

    @Override // androidx.appcompat.view.menu.g
    public String getActionViewStatesKey() {
        j jVar = this.mItem;
        int itemId = jVar != null ? jVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.g
    public g getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.g
    public void setCallback(g.a aVar) {
        this.mParentMenu.setCallback(aVar);
    }

    @Override // androidx.appcompat.view.menu.g, u0.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.mParentMenu.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.mParentMenu.setQwertyMode(z6);
    }

    @Override // androidx.appcompat.view.menu.g
    public void setShortcutsVisible(boolean z6) {
        this.mParentMenu.setShortcutsVisible(z6);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i7) {
        return (SubMenu) super.setHeaderIconInt(i7);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i7) {
        return (SubMenu) super.setHeaderTitleInt(i7);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i7) {
        this.mItem.setIcon(i7);
        return this;
    }
}