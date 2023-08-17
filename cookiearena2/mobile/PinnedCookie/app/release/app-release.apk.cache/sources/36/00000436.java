package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3872a = "MenuItemCompat";
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final int f3873b = 0;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f3874c = 1;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final int f3875d = 2;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final int f3876e = 4;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public static final int f3877f = 8;

    /* loaded from: classes.dex */
    public class a implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3878a;

        public a(c cVar) {
            this.f3878a = cVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f3878a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f3878a.onMenuItemActionExpand(menuItem);
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @d.u
        public static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @d.u
        public static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @d.u
        public static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @d.u
        public static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @d.u
        public static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @d.u
        public static MenuItem g(MenuItem menuItem, char c7, int i7) {
            return menuItem.setAlphabeticShortcut(c7, i7);
        }

        @d.u
        public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @d.u
        public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @d.u
        public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @d.u
        public static MenuItem k(MenuItem menuItem, char c7, int i7) {
            return menuItem.setNumericShortcut(c7, i7);
        }

        @d.u
        public static MenuItem l(MenuItem menuItem, char c7, char c8, int i7, int i8) {
            return menuItem.setShortcut(c7, c8, i7, i8);
        }

        @d.u
        public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @d.q0
    public static androidx.core.view.b c(@d.o0 MenuItem menuItem) {
        if (menuItem instanceof u0.b) {
            return ((u0.b) menuItem).b();
        }
        Log.w(f3872a, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(@d.o0 MenuItem menuItem) {
        return menuItem instanceof u0.b ? ((u0.b) menuItem).getAlphabeticModifiers() : b.a(menuItem);
    }

    @d.q0
    public static CharSequence f(@d.o0 MenuItem menuItem) {
        return menuItem instanceof u0.b ? ((u0.b) menuItem).getContentDescription() : b.b(menuItem);
    }

    @d.q0
    public static ColorStateList g(@d.o0 MenuItem menuItem) {
        return menuItem instanceof u0.b ? ((u0.b) menuItem).getIconTintList() : b.c(menuItem);
    }

    @d.q0
    public static PorterDuff.Mode h(@d.o0 MenuItem menuItem) {
        return menuItem instanceof u0.b ? ((u0.b) menuItem).getIconTintMode() : b.d(menuItem);
    }

    public static int i(@d.o0 MenuItem menuItem) {
        return menuItem instanceof u0.b ? ((u0.b) menuItem).getNumericModifiers() : b.e(menuItem);
    }

    @d.q0
    public static CharSequence j(@d.o0 MenuItem menuItem) {
        return menuItem instanceof u0.b ? ((u0.b) menuItem).getTooltipText() : b.f(menuItem);
    }

    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @d.q0
    public static MenuItem l(@d.o0 MenuItem menuItem, @d.q0 androidx.core.view.b bVar) {
        if (menuItem instanceof u0.b) {
            return ((u0.b) menuItem).a(bVar);
        }
        Log.w(f3872a, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    public static MenuItem m(MenuItem menuItem, int i7) {
        return menuItem.setActionView(i7);
    }

    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(@d.o0 MenuItem menuItem, char c7, int i7) {
        if (menuItem instanceof u0.b) {
            ((u0.b) menuItem).setAlphabeticShortcut(c7, i7);
        } else {
            b.g(menuItem, c7, i7);
        }
    }

    public static void p(@d.o0 MenuItem menuItem, @d.q0 CharSequence charSequence) {
        if (menuItem instanceof u0.b) {
            ((u0.b) menuItem).setContentDescription(charSequence);
        } else {
            b.h(menuItem, charSequence);
        }
    }

    public static void q(@d.o0 MenuItem menuItem, @d.q0 ColorStateList colorStateList) {
        if (menuItem instanceof u0.b) {
            ((u0.b) menuItem).setIconTintList(colorStateList);
        } else {
            b.i(menuItem, colorStateList);
        }
    }

    public static void r(@d.o0 MenuItem menuItem, @d.q0 PorterDuff.Mode mode) {
        if (menuItem instanceof u0.b) {
            ((u0.b) menuItem).setIconTintMode(mode);
        } else {
            b.j(menuItem, mode);
        }
    }

    public static void s(@d.o0 MenuItem menuItem, char c7, int i7) {
        if (menuItem instanceof u0.b) {
            ((u0.b) menuItem).setNumericShortcut(c7, i7);
        } else {
            b.k(menuItem, c7, i7);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, c cVar) {
        return menuItem.setOnActionExpandListener(new a(cVar));
    }

    public static void u(@d.o0 MenuItem menuItem, char c7, char c8, int i7, int i8) {
        if (menuItem instanceof u0.b) {
            ((u0.b) menuItem).setShortcut(c7, c8, i7, i8);
        } else {
            b.l(menuItem, c7, c8, i7, i8);
        }
    }

    @Deprecated
    public static void v(MenuItem menuItem, int i7) {
        menuItem.setShowAsAction(i7);
    }

    public static void w(@d.o0 MenuItem menuItem, @d.q0 CharSequence charSequence) {
        if (menuItem instanceof u0.b) {
            ((u0.b) menuItem).setTooltipText(charSequence);
        } else {
            b.m(menuItem, charSequence);
        }
    }
}