package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import d.b1;
import d.o0;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface n {

    /* loaded from: classes.dex */
    public interface a {
        boolean a(@o0 g gVar);

        void onCloseMenu(@o0 g gVar, boolean z6);
    }

    boolean collapseItemActionView(g gVar, j jVar);

    boolean expandItemActionView(g gVar, j jVar);

    boolean flagActionItems();

    int getId();

    o getMenuView(ViewGroup viewGroup);

    void initForMenu(Context context, g gVar);

    void onCloseMenu(g gVar, boolean z6);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(s sVar);

    void setCallback(a aVar);

    void updateMenuView(boolean z6);
}
