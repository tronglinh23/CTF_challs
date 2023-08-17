package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.b1;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class t extends p implements SubMenu {

    /* renamed from: p  reason: collision with root package name */
    public final u0.c f1212p;

    public t(Context context, u0.c cVar) {
        super(context, cVar);
        this.f1212p = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f1212p.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return e(this.f1212p.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i7) {
        this.f1212p.setHeaderIcon(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i7) {
        this.f1212p.setHeaderTitle(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f1212p.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i7) {
        this.f1212p.setIcon(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1212p.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1212p.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1212p.setIcon(drawable);
        return this;
    }
}
