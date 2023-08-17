package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import d.b1;
import d.o0;

@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class NavigationBarMenu extends g {
    private final int maxItemCount;
    @o0
    private final Class<?> viewClass;

    public NavigationBarMenu(@o0 Context context, @o0 Class<?> cls, int i7) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i7;
    }

    @Override // androidx.appcompat.view.menu.g
    @o0
    public MenuItem addInternal(int i7, int i8, int i9, @o0 CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem addInternal = super.addInternal(i7, i8, i9, charSequence);
            if (addInternal instanceof j) {
                ((j) addInternal).w(true);
            }
            startDispatchingItemsChanged();
            return addInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.maxItemCount + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @o0
    public SubMenu addSubMenu(int i7, int i8, int i9, @o0 CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName() + " does not support submenus");
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}