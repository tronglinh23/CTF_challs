package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.b1;
import d.o0;
import d.q0;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a implements u0.b {
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 4;
    public static final int I = 8;
    public static final int J = 16;

    /* renamed from: l  reason: collision with root package name */
    public final int f1059l;

    /* renamed from: m  reason: collision with root package name */
    public final int f1060m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1061n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f1062o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f1063p;

    /* renamed from: q  reason: collision with root package name */
    public Intent f1064q;

    /* renamed from: r  reason: collision with root package name */
    public char f1065r;

    /* renamed from: t  reason: collision with root package name */
    public char f1067t;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f1069v;

    /* renamed from: w  reason: collision with root package name */
    public Context f1070w;

    /* renamed from: x  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f1071x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f1072y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f1073z;

    /* renamed from: s  reason: collision with root package name */
    public int f1066s = 4096;

    /* renamed from: u  reason: collision with root package name */
    public int f1068u = 4096;
    public ColorStateList A = null;
    public PorterDuff.Mode B = null;
    public boolean C = false;
    public boolean D = false;
    public int E = 16;

    public a(Context context, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        this.f1070w = context;
        this.f1059l = i8;
        this.f1060m = i7;
        this.f1061n = i10;
        this.f1062o = charSequence;
    }

    @Override // u0.b
    @o0
    public u0.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // u0.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // u0.b
    public boolean c() {
        return false;
    }

    @Override // u0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // u0.b
    public boolean d() {
        return true;
    }

    public final void e() {
        Drawable drawable = this.f1069v;
        if (drawable != null) {
            if (this.C || this.D) {
                Drawable r6 = q0.c.r(drawable);
                this.f1069v = r6;
                Drawable mutate = r6.mutate();
                this.f1069v = mutate;
                if (this.C) {
                    q0.c.o(mutate, this.A);
                }
                if (this.D) {
                    q0.c.p(this.f1069v, this.B);
                }
            }
        }
    }

    @Override // u0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1071x;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            Intent intent = this.f1064q;
            if (intent != null) {
                this.f1070w.startActivity(intent);
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    /* renamed from: g  reason: merged with bridge method [inline-methods] */
    public u0.b setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // u0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // u0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1068u;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1067t;
    }

    @Override // u0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1072y;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1060m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1069v;
    }

    @Override // u0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.A;
    }

    @Override // u0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1064q;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1059l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // u0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1066s;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1065r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1061n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1062o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1063p;
        return charSequence != null ? charSequence : this.f1062o;
    }

    @Override // u0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1073z;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public u0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public a i(boolean z6) {
        this.E = (z6 ? 4 : 0) | (this.E & (-5));
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.E & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.E & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.E & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.E & 8) == 0;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public u0.b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        this.f1067t = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z6) {
        this.E = (z6 ? 1 : 0) | (this.E & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z6) {
        this.E = (z6 ? 2 : 0) | (this.E & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z6) {
        this.E = (z6 ? 16 : 0) | (this.E & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1069v = drawable;
        e();
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public MenuItem setIconTintList(@q0 ColorStateList colorStateList) {
        this.A = colorStateList;
        this.C = true;
        e();
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.B = mode;
        this.D = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1064q = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        this.f1065r = c7;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1071x = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f1065r = c7;
        this.f1067t = Character.toLowerCase(c8);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    public void setShowAsAction(int i7) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1062o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1063p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z6) {
        this.E = (this.E & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        this.f1067t = Character.toLowerCase(c7);
        this.f1068u = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public u0.b setContentDescription(CharSequence charSequence) {
        this.f1072y = charSequence;
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public MenuItem setNumericShortcut(char c7, int i7) {
        this.f1065r = c7;
        this.f1066s = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        this.f1062o = this.f1070w.getResources().getString(i7);
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public u0.b setTooltipText(CharSequence charSequence) {
        this.f1073z = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f1069v = k0.d.i(this.f1070w, i7);
        e();
        return this;
    }

    @Override // u0.b, android.view.MenuItem
    @o0
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f1065r = c7;
        this.f1066s = KeyEvent.normalizeMetaState(i7);
        this.f1067t = Character.toLowerCase(c8);
        this.f1068u = KeyEvent.normalizeMetaState(i8);
        return this;
    }
}
