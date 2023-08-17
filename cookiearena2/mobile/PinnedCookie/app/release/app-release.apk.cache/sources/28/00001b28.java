package u0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import d.b1;
import d.o0;
import d.q0;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface b extends MenuItem {

    /* renamed from: g  reason: collision with root package name */
    public static final int f17315g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f17316h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f17317i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f17318j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f17319k = 8;

    @o0
    b a(@q0 androidx.core.view.b bVar);

    @q0
    androidx.core.view.b b();

    boolean c();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    boolean d();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @q0
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @q0
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @q0
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @q0
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @q0
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    @o0
    MenuItem setActionView(int i7);

    @Override // android.view.MenuItem
    @o0
    MenuItem setActionView(@q0 View view);

    @Override // android.view.MenuItem
    @o0
    MenuItem setAlphabeticShortcut(char c7, int i7);

    @Override // android.view.MenuItem
    @o0
    b setContentDescription(@q0 CharSequence charSequence);

    @Override // android.view.MenuItem
    @o0
    MenuItem setIconTintList(@q0 ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @o0
    MenuItem setIconTintMode(@q0 PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @o0
    MenuItem setNumericShortcut(char c7, int i7);

    @Override // android.view.MenuItem
    @o0
    MenuItem setShortcut(char c7, char c8, int i7, int i8);

    @Override // android.view.MenuItem
    void setShowAsAction(int i7);

    @Override // android.view.MenuItem
    @o0
    MenuItem setShowAsActionFlags(int i7);

    @Override // android.view.MenuItem
    @o0
    b setTooltipText(@q0 CharSequence charSequence);
}