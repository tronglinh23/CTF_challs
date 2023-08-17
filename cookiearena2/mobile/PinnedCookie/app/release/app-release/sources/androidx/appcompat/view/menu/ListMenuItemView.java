package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.t1;
import androidx.core.view.u1;
import d.b1;
import f.a;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements o.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: s  reason: collision with root package name */
    public static final String f1041s = "ListMenuItemView";

    /* renamed from: b  reason: collision with root package name */
    public j f1042b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f1043c;

    /* renamed from: d  reason: collision with root package name */
    public RadioButton f1044d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f1045e;

    /* renamed from: f  reason: collision with root package name */
    public CheckBox f1046f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f1047g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f1048h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f1049i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f1050j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f1051k;

    /* renamed from: l  reason: collision with root package name */
    public int f1052l;

    /* renamed from: m  reason: collision with root package name */
    public Context f1053m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1054n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f1055o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1056p;

    /* renamed from: q  reason: collision with root package name */
    public LayoutInflater f1057q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1058r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.Y1);
    }

    private LayoutInflater getInflater() {
        if (this.f1057q == null) {
            this.f1057q = LayoutInflater.from(getContext());
        }
        return this.f1057q;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f1048h;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1049i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1049i.getLayoutParams();
        rect.top += this.f1049i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i7) {
        LinearLayout linearLayout = this.f1050j;
        if (linearLayout != null) {
            linearLayout.addView(view, i7);
        } else {
            addView(view, i7);
        }
    }

    public final void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(a.j.f9208o, (ViewGroup) this, false);
        this.f1046f = checkBox;
        a(checkBox);
    }

    public final void d() {
        ImageView imageView = (ImageView) getInflater().inflate(a.j.f9209p, (ViewGroup) this, false);
        this.f1043c = imageView;
        b(imageView, 0);
    }

    public final void e() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(a.j.f9211r, (ViewGroup) this, false);
        this.f1044d = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f1042b;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void initialize(j jVar, int i7) {
        this.f1042b = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.l(this));
        setCheckable(jVar.isCheckable());
        setShortcut(jVar.D(), jVar.j());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        u1.I1(this, this.f1051k);
        TextView textView = (TextView) findViewById(a.g.f9168s0);
        this.f1045e = textView;
        int i7 = this.f1052l;
        if (i7 != -1) {
            textView.setTextAppearance(this.f1053m, i7);
        }
        this.f1047g = (TextView) findViewById(a.g.f9146h0);
        ImageView imageView = (ImageView) findViewById(a.g.f9158n0);
        this.f1048h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1055o);
        }
        this.f1049i = (ImageView) findViewById(a.g.C);
        this.f1050j = (LinearLayout) findViewById(a.g.f9169t);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        if (this.f1043c != null && this.f1054n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1043c.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f1044d == null && this.f1046f == null) {
            return;
        }
        if (this.f1042b.p()) {
            if (this.f1044d == null) {
                e();
            }
            compoundButton = this.f1044d;
            view = this.f1046f;
        } else {
            if (this.f1046f == null) {
                c();
            }
            compoundButton = this.f1046f;
            view = this.f1044d;
        }
        if (z6) {
            compoundButton.setChecked(this.f1042b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1046f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1044d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if (this.f1042b.p()) {
            if (this.f1044d == null) {
                e();
            }
            compoundButton = this.f1044d;
        } else {
            if (this.f1046f == null) {
                c();
            }
            compoundButton = this.f1046f;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f1058r = z6;
        this.f1054n = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f1049i;
        if (imageView != null) {
            imageView.setVisibility((this.f1056p || !z6) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(Drawable drawable) {
        boolean z6 = this.f1042b.C() || this.f1058r;
        if (z6 || this.f1054n) {
            ImageView imageView = this.f1043c;
            if (imageView == null && drawable == null && !this.f1054n) {
                return;
            }
            if (imageView == null) {
                d();
            }
            if (drawable == null && !this.f1054n) {
                this.f1043c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f1043c;
            if (!z6) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1043c.getVisibility() != 0) {
                this.f1043c.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setShortcut(boolean z6, char c7) {
        int i7 = (z6 && this.f1042b.D()) ? 0 : 8;
        if (i7 == 0) {
            this.f1047g.setText(this.f1042b.k());
        }
        if (this.f1047g.getVisibility() != i7) {
            this.f1047g.setVisibility(i7);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1045e.getVisibility() != 8) {
                this.f1045e.setVisibility(8);
                return;
            }
            return;
        }
        this.f1045e.setText(charSequence);
        if (this.f1045e.getVisibility() != 0) {
            this.f1045e.setVisibility(0);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean showsIcon() {
        return this.f1058r;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        t1 G = t1.G(getContext(), attributeSet, a.m.I4, i7, 0);
        this.f1051k = G.h(a.m.O4);
        this.f1052l = G.u(a.m.K4, -1);
        this.f1054n = G.a(a.m.Q4, false);
        this.f1053m = context;
        this.f1055o = G.h(a.m.R4);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, a.b.f8920p1, 0);
        this.f1056p = obtainStyledAttributes.hasValue(0);
        G.I();
        obtainStyledAttributes.recycle();
    }
}
