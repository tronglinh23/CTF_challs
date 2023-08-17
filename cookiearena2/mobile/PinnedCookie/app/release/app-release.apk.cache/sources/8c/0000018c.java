package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import d.b1;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface o {

    /* loaded from: classes.dex */
    public interface a {
        j getItemData();

        void initialize(j jVar, int i7);

        boolean prefersCondensedTitle();

        void setCheckable(boolean z6);

        void setChecked(boolean z6);

        void setEnabled(boolean z6);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z6, char c7);

        void setTitle(CharSequence charSequence);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(g gVar);
}