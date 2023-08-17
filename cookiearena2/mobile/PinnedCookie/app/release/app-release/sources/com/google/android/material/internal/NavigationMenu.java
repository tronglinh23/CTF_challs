package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import d.b1;
import d.o0;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class NavigationMenu extends g {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @o0
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        j jVar = (j) addInternal(i7, i8, i9, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, jVar);
        jVar.A(navigationSubMenu);
        return navigationSubMenu;
    }
}
