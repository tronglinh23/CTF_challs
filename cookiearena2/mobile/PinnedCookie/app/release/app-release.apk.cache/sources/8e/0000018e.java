package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import d.b1;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class p extends c implements Menu {

    /* renamed from: o  reason: collision with root package name */
    public final u0.a f1188o;

    public p(Context context, u0.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1188o = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return e(this.f1188o.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f1188o.addIntentOptions(i7, i8, i9, componentName, intentArr, intent, i10, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                menuItemArr[i11] = e(menuItemArr2[i11]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return f(this.f1188o.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        g();
        this.f1188o.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f1188o.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i7) {
        return e(this.f1188o.findItem(i7));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i7) {
        return e(this.f1188o.getItem(i7));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f1188o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f1188o.isShortcutKey(i7, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i7, int i8) {
        return this.f1188o.performIdentifierAction(i7, i8);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        return this.f1188o.performShortcut(i7, keyEvent, i8);
    }

    @Override // android.view.Menu
    public void removeGroup(int i7) {
        h(i7);
        this.f1188o.removeGroup(i7);
    }

    @Override // android.view.Menu
    public void removeItem(int i7) {
        i(i7);
        this.f1188o.removeItem(i7);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i7, boolean z6, boolean z7) {
        this.f1188o.setGroupCheckable(i7, z6, z7);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i7, boolean z6) {
        this.f1188o.setGroupEnabled(i7, z6);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i7, boolean z6) {
        this.f1188o.setGroupVisible(i7, z6);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f1188o.setQwertyMode(z6);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1188o.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i7) {
        return e(this.f1188o.add(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7) {
        return f(this.f1188o.addSubMenu(i7));
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return e(this.f1188o.add(i7, i8, i9, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        return f(this.f1188o.addSubMenu(i7, i8, i9, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, int i10) {
        return e(this.f1188o.add(i7, i8, i9, i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return f(this.f1188o.addSubMenu(i7, i8, i9, i10));
    }
}