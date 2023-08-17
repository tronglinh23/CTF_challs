package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.x0;
import androidx.appcompat.widget.y1;
import d.b1;
import f.a;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionMenuItemView extends f0 implements o.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: m  reason: collision with root package name */
    public static final String f1024m = "ActionMenuItemView";

    /* renamed from: n  reason: collision with root package name */
    public static final int f1025n = 32;

    /* renamed from: b  reason: collision with root package name */
    public j f1026b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f1027c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f1028d;

    /* renamed from: e  reason: collision with root package name */
    public g.b f1029e;

    /* renamed from: f  reason: collision with root package name */
    public x0 f1030f;

    /* renamed from: g  reason: collision with root package name */
    public b f1031g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1032h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1033i;

    /* renamed from: j  reason: collision with root package name */
    public int f1034j;

    /* renamed from: k  reason: collision with root package name */
    public int f1035k;

    /* renamed from: l  reason: collision with root package name */
    public int f1036l;

    /* loaded from: classes.dex */
    public class a extends x0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.x0
        public q b() {
            b bVar = ActionMenuItemView.this.f1031g;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.x0
        public boolean c() {
            q b7;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f1029e;
            return bVar != null && bVar.a(actionMenuItemView.f1026b) && (b7 = b()) != null && b7.a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract q a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return d();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return d() && this.f1026b.getIcon() == null;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        return i7 >= 480 || (i7 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.f1027c);
        if (this.f1028d != null && (!this.f1026b.E() || (!this.f1032h && !this.f1033i))) {
            z6 = false;
        }
        boolean z8 = z7 & z6;
        setText(z8 ? this.f1027c : null);
        CharSequence contentDescription = this.f1026b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z8 ? null : this.f1026b.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1026b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            y1.a(this, z8 ? null : this.f1026b.getTitle());
        } else {
            y1.a(this, tooltipText);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f1026b;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void initialize(j jVar, int i7) {
        this.f1026b = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.l(this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f1030f == null) {
            this.f1030f = new a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f1029e;
        if (bVar != null) {
            bVar.a(this.f1026b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1032h = e();
        f();
    }

    @Override // androidx.appcompat.widget.f0, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        boolean d7 = d();
        if (d7 && (i9 = this.f1035k) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1034j) : this.f1034j;
        if (mode != 1073741824 && this.f1034j > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i8);
        }
        if (d7 || this.f1028d == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1028d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        x0 x0Var;
        if (this.f1026b.hasSubMenu() && (x0Var = this.f1030f) != null && x0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean prefersCondensedTitle() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z6) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f1033i != z6) {
            this.f1033i = z6;
            j jVar = this.f1026b;
            if (jVar != null) {
                jVar.e();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(Drawable drawable) {
        this.f1028d = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f1036l;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.f1029e = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
        this.f1035k = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(b bVar) {
        this.f1031g = bVar;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setShortcut(boolean z6, char c7) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        this.f1027c = charSequence;
        f();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean showsIcon() {
        return true;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Resources resources = context.getResources();
        this.f1032h = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.G, i7, 0);
        this.f1034j = obtainStyledAttributes.getDimensionPixelSize(a.m.H, 0);
        obtainStyledAttributes.recycle();
        this.f1036l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1035k = -1;
        setSaveEnabled(false);
    }
}
