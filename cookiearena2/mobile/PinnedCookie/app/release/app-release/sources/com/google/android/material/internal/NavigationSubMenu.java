package com.google.android.material.internal;

import android.content.Context;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.s;
import d.b1;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class NavigationSubMenu extends s {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, j jVar) {
        super(context, navigationMenu, jVar);
    }

    @Override // androidx.appcompat.view.menu.g
    public void onItemsChanged(boolean z6) {
        super.onItemsChanged(z6);
        ((g) getParentMenu()).onItemsChanged(z6);
    }
}
