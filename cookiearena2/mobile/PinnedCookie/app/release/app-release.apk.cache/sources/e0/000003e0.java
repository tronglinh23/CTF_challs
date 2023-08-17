package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes.dex */
public final class t0 {

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(Menu menu, boolean z6) {
            menu.setGroupDividerEnabled(z6);
        }
    }

    public static void a(@d.o0 Menu menu, boolean z6) {
        if (menu instanceof u0.a) {
            ((u0.a) menu).setGroupDividerEnabled(z6);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a.a(menu, z6);
        }
    }

    @Deprecated
    public static void b(MenuItem menuItem, int i7) {
        menuItem.setShowAsAction(i7);
    }
}