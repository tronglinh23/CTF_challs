package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.o;
import androidx.core.view.b;
import d.b1;
import d.o0;
import d.q0;
import f.a;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class j implements u0.b {
    public static final String Q = "MenuItemImpl";
    public static final int R = 3;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 4;
    public static final int V = 8;
    public static final int W = 16;
    public static final int X = 32;
    public static final int Y = 0;
    public Runnable A;
    public MenuItem.OnMenuItemClickListener B;
    public CharSequence C;
    public CharSequence D;
    public int K;
    public View L;
    public androidx.core.view.b M;
    public MenuItem.OnActionExpandListener N;
    public ContextMenu.ContextMenuInfo P;

    /* renamed from: l  reason: collision with root package name */
    public final int f1145l;

    /* renamed from: m  reason: collision with root package name */
    public final int f1146m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1147n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1148o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f1149p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f1150q;

    /* renamed from: r  reason: collision with root package name */
    public Intent f1151r;

    /* renamed from: s  reason: collision with root package name */
    public char f1152s;

    /* renamed from: u  reason: collision with root package name */
    public char f1154u;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f1156w;

    /* renamed from: y  reason: collision with root package name */
    public g f1158y;

    /* renamed from: z  reason: collision with root package name */
    public s f1159z;

    /* renamed from: t  reason: collision with root package name */
    public int f1153t = 4096;

    /* renamed from: v  reason: collision with root package name */
    public int f1155v = 4096;

    /* renamed from: x  reason: collision with root package name */
    public int f1157x = 0;
    public ColorStateList E = null;
    public PorterDuff.Mode F = null;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public int J = 16;
    public boolean O = false;

    /* loaded from: classes.dex */
    public class a implements b.InterfaceC0035b {
        public a() {
        }

        @Override // androidx.core.view.b.InterfaceC0035b
        public void onActionProviderVisibilityChanged(boolean z6) {
            j jVar = j.this;
            jVar.f1158y.onItemVisibleChanged(jVar);
        }
    }

    public j(g gVar, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f1158y = gVar;
        this.f1145l = i8;
        this.f1146m = i7;
        this.f1147n = i9;
        this.f1148o = i10;
        this.f1149p = charSequence;
        this.K = i11;
    }

    public static void f(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    public void A(s sVar) {
        this.f1159z = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    public boolean B(boolean z6) {
        int i7 = this.J;
        int i8 = (z6 ? 0 : 8) | (i7 & (-9));
        this.J = i8;
        return i7 != i8;
    }

    public boolean C() {
        return this.f1158y.getOptionalIconsVisible();
    }

    public boolean D() {
        return this.f1158y.isShortcutsVisible() && j() != 0;
    }

    public boolean E() {
        return (this.K & 4) == 4;
    }

    @Override // u0.b
    @o0
    public u0.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.M;
        if (bVar2 != null) {
            bVar2.j();
        }
        this.L = null;
        this.M = bVar;
        this.f1158y.onItemsChanged(true);
        androidx.core.view.b bVar3 = this.M;
        if (bVar3 != null) {
            bVar3.l(new a());
        }
        return this;
    }

    @Override // u0.b
    public androidx.core.view.b b() {
        return this.M;
    }

    @Override // u0.b
    public boolean c() {
        return (d() || q()) ? false : true;
    }

    @Override // u0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1158y.collapseItemActionView(this);
        }
        return false;
    }

    @Override // u0.b
    public boolean d() {
        return (this.K & 2) == 2;
    }

    public void e() {
        this.f1158y.onItemActionRequestChanged(this);
    }

    @Override // u0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (m()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.N;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f1158y.expandItemActionView(this);
            }
            return false;
        }
        return false;
    }

    public final Drawable g(Drawable drawable) {
        if (drawable != null && this.I && (this.G || this.H)) {
            drawable = q0.c.r(drawable).mutate();
            if (this.G) {
                q0.c.o(drawable, this.E);
            }
            if (this.H) {
                q0.c.p(drawable, this.F);
            }
            this.I = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // u0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.M;
        if (bVar != null) {
            View e7 = bVar.e(this);
            this.L = e7;
            return e7;
        }
        return null;
    }

    @Override // u0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1155v;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1154u;
    }

    @Override // u0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1146m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1156w;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.f1157x != 0) {
            Drawable b7 = g.a.b(this.f1158y.getContext(), this.f1157x);
            this.f1157x = 0;
            this.f1156w = b7;
            return g(b7);
        }
        return null;
    }

    @Override // u0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.E;
    }

    @Override // u0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.F;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1151r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1145l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.P;
    }

    @Override // u0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1153t;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1152s;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1147n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1159z;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1149p;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1150q;
        return charSequence != null ? charSequence : this.f1149p;
    }

    @Override // u0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.D;
    }

    public Runnable h() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1159z != null;
    }

    public int i() {
        return this.f1148o;
    }

    @Override // u0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.O;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.J & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.J & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.J & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.M;
        return (bVar == null || !bVar.h()) ? (this.J & 8) == 0 : (this.J & 8) == 0 && this.M.c();
    }

    public char j() {
        return this.f1158y.isQwertyMode() ? this.f1154u : this.f1152s;
    }

    public String k() {
        char j7 = j();
        if (j7 == 0) {
            return "";
        }
        Resources resources = this.f1158y.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1158y.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(a.k.f9237r));
        }
        int i7 = this.f1158y.isQwertyMode() ? this.f1155v : this.f1153t;
        f(sb, i7, 65536, resources.getString(a.k.f9233n));
        f(sb, i7, 4096, resources.getString(a.k.f9229j));
        f(sb, i7, 2, resources.getString(a.k.f9228i));
        f(sb, i7, 1, resources.getString(a.k.f9234o));
        f(sb, i7, 4, resources.getString(a.k.f9236q));
        f(sb, i7, 8, resources.getString(a.k.f9232m));
        if (j7 == '\b') {
            sb.append(resources.getString(a.k.f9230k));
        } else if (j7 == '\n') {
            sb.append(resources.getString(a.k.f9231l));
        } else if (j7 != ' ') {
            sb.append(j7);
        } else {
            sb.append(resources.getString(a.k.f9235p));
        }
        return sb.toString();
    }

    public CharSequence l(o.a aVar) {
        return (aVar == null || !aVar.prefersCondensedTitle()) ? getTitle() : getTitleCondensed();
    }

    public boolean m() {
        androidx.core.view.b bVar;
        if ((this.K & 8) != 0) {
            if (this.L == null && (bVar = this.M) != null) {
                this.L = bVar.e(this);
            }
            return this.L != null;
        }
        return false;
    }

    public boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.B;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            g gVar = this.f1158y;
            if (gVar.dispatchMenuItemSelected(gVar, this)) {
                return true;
            }
            Runnable runnable = this.A;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f1151r != null) {
                try {
                    this.f1158y.getContext().startActivity(this.f1151r);
                    return true;
                } catch (ActivityNotFoundException e7) {
                    Log.e(Q, "Can't find activity to handle intent; ignoring", e7);
                }
            }
            androidx.core.view.b bVar = this.M;
            return bVar != null && bVar.f();
        }
        return true;
    }

    public boolean o() {
        return (this.J & 32) == 32;
    }

    public boolean p() {
        return (this.J & 4) != 0;
    }

    public boolean q() {
        return (this.K & 1) == 1;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    /* renamed from: r  reason: merged with bridge method [inline-methods] */
    public u0.b setActionView(int i7) {
        Context context = this.f1158y.getContext();
        setActionView(LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    /* renamed from: s  reason: merged with bridge method [inline-methods] */
    public u0.b setActionView(View view) {
        int i7;
        this.L = view;
        this.M = null;
        if (view != null && view.getId() == -1 && (i7 = this.f1145l) > 0) {
            view.setId(i7);
        }
        this.f1158y.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        if (this.f1154u == c7) {
            return this;
        }
        this.f1154u = Character.toLowerCase(c7);
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z6) {
        int i7 = this.J;
        int i8 = (z6 ? 1 : 0) | (i7 & (-2));
        this.J = i8;
        if (i7 != i8) {
            this.f1158y.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z6) {
        if ((this.J & 4) != 0) {
            this.f1158y.setExclusiveItemChecked(this);
        } else {
            v(z6);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.J |= 16;
        } else {
            this.J &= -17;
        }
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1157x = 0;
        this.f1156w = drawable;
        this.I = true;
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public MenuItem setIconTintList(@q0 ColorStateList colorStateList) {
        this.E = colorStateList;
        this.G = true;
        this.I = true;
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.F = mode;
        this.H = true;
        this.I = true;
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1151r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        if (this.f1152s == c7) {
            return this;
        }
        this.f1152s = c7;
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.N = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.B = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f1152s = c7;
        this.f1154u = Character.toLowerCase(c8);
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    public void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.K = i7;
        this.f1158y.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1149p = charSequence;
        this.f1158y.onItemsChanged(false);
        s sVar = this.f1159z;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1150q = charSequence;
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z6) {
        if (B(z6)) {
            this.f1158y.onItemVisibleChanged(this);
        }
        return this;
    }

    public void t(boolean z6) {
        this.O = z6;
        this.f1158y.onItemsChanged(false);
    }

    public String toString() {
        CharSequence charSequence = this.f1149p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.A = runnable;
        return this;
    }

    public void v(boolean z6) {
        int i7 = this.J;
        int i8 = (z6 ? 2 : 0) | (i7 & (-3));
        this.J = i8;
        if (i7 != i8) {
            this.f1158y.onItemsChanged(false);
        }
    }

    public void w(boolean z6) {
        this.J = (z6 ? 4 : 0) | (this.J & (-5));
    }

    public void x(boolean z6) {
        if (z6) {
            this.J |= 32;
        } else {
            this.J &= -33;
        }
    }

    public void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.P = contextMenuInfo;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    /* renamed from: z  reason: merged with bridge method [inline-methods] */
    public u0.b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public u0.b setContentDescription(CharSequence charSequence) {
        this.C = charSequence;
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public u0.b setTooltipText(CharSequence charSequence) {
        this.D = charSequence;
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        if (this.f1154u == c7 && this.f1155v == i7) {
            return this;
        }
        this.f1154u = Character.toLowerCase(c7);
        this.f1155v = KeyEvent.normalizeMetaState(i7);
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public MenuItem setNumericShortcut(char c7, int i7) {
        if (this.f1152s == c7 && this.f1153t == i7) {
            return this;
        }
        this.f1152s = c7;
        this.f1153t = KeyEvent.normalizeMetaState(i7);
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f1152s = c7;
        this.f1153t = KeyEvent.normalizeMetaState(i7);
        this.f1154u = Character.toLowerCase(c8);
        this.f1155v = KeyEvent.normalizeMetaState(i8);
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f1156w = null;
        this.f1157x = i7;
        this.I = true;
        this.f1158y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        return setTitle(this.f1158y.getContext().getString(i7));
    }
}