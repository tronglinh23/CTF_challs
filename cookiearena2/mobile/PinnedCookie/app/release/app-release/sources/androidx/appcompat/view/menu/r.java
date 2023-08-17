package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.d1;
import androidx.core.view.u1;
import f.a;
/* loaded from: classes.dex */
public final class r extends l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, n, View.OnKeyListener {

    /* renamed from: w  reason: collision with root package name */
    public static final int f1189w = a.j.f9213t;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1190c;

    /* renamed from: d  reason: collision with root package name */
    public final g f1191d;

    /* renamed from: e  reason: collision with root package name */
    public final f f1192e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1193f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1194g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1195h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1196i;

    /* renamed from: j  reason: collision with root package name */
    public final d1 f1197j;

    /* renamed from: m  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1200m;

    /* renamed from: n  reason: collision with root package name */
    public View f1201n;

    /* renamed from: o  reason: collision with root package name */
    public View f1202o;

    /* renamed from: p  reason: collision with root package name */
    public n.a f1203p;

    /* renamed from: q  reason: collision with root package name */
    public ViewTreeObserver f1204q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1205r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1206s;

    /* renamed from: t  reason: collision with root package name */
    public int f1207t;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1209v;

    /* renamed from: k  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1198k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f1199l = new b();

    /* renamed from: u  reason: collision with root package name */
    public int f1208u = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!r.this.a() || r.this.f1197j.J()) {
                return;
            }
            View view = r.this.f1202o;
            if (view == null || !view.isShown()) {
                r.this.dismiss();
            } else {
                r.this.f1197j.show();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = r.this.f1204q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    r.this.f1204q = view.getViewTreeObserver();
                }
                r rVar = r.this;
                rVar.f1204q.removeGlobalOnLayoutListener(rVar.f1198k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public r(Context context, g gVar, View view, int i7, int i8, boolean z6) {
        this.f1190c = context;
        this.f1191d = gVar;
        this.f1193f = z6;
        this.f1192e = new f(gVar, LayoutInflater.from(context), z6, f1189w);
        this.f1195h = i7;
        this.f1196i = i8;
        Resources resources = context.getResources();
        this.f1194g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.e.f9073x));
        this.f1201n = view;
        this.f1197j = new d1(context, null, i7, i8);
        gVar.addMenuPresenter(this, context);
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean a() {
        return !this.f1205r && this.f1197j.a();
    }

    @Override // androidx.appcompat.view.menu.l
    public void b(g gVar) {
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        if (a()) {
            this.f1197j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView f() {
        return this.f1197j.f();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public void g(View view) {
        this.f1201n = view;
    }

    @Override // androidx.appcompat.view.menu.l
    public void i(boolean z6) {
        this.f1192e.e(z6);
    }

    @Override // androidx.appcompat.view.menu.l
    public void j(int i7) {
        this.f1208u = i7;
    }

    @Override // androidx.appcompat.view.menu.l
    public void k(int i7) {
        this.f1197j.j(i7);
    }

    @Override // androidx.appcompat.view.menu.l
    public void l(PopupWindow.OnDismissListener onDismissListener) {
        this.f1200m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void m(boolean z6) {
        this.f1209v = z6;
    }

    @Override // androidx.appcompat.view.menu.l
    public void n(int i7) {
        this.f1197j.h(i7);
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(g gVar, boolean z6) {
        if (gVar != this.f1191d) {
            return;
        }
        dismiss();
        n.a aVar = this.f1203p;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, z6);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1205r = true;
        this.f1191d.close();
        ViewTreeObserver viewTreeObserver = this.f1204q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1204q = this.f1202o.getViewTreeObserver();
            }
            this.f1204q.removeGlobalOnLayoutListener(this.f1198k);
            this.f1204q = null;
        }
        this.f1202o.removeOnAttachStateChangeListener(this.f1199l);
        PopupWindow.OnDismissListener onDismissListener = this.f1200m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i7 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(s sVar) {
        if (sVar.hasVisibleItems()) {
            m mVar = new m(this.f1190c, sVar, this.f1202o, this.f1193f, this.f1195h, this.f1196i);
            mVar.a(this.f1203p);
            mVar.i(l.o(sVar));
            mVar.k(this.f1200m);
            this.f1200m = null;
            this.f1191d.close(false);
            int b7 = this.f1197j.b();
            int l7 = this.f1197j.l();
            if ((Gravity.getAbsoluteGravity(this.f1208u, u1.Z(this.f1201n)) & 7) == 5) {
                b7 += this.f1201n.getWidth();
            }
            if (mVar.p(b7, l7)) {
                n.a aVar = this.f1203p;
                if (aVar != null) {
                    aVar.a(sVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f1205r || (view = this.f1201n) == null) {
            return false;
        }
        this.f1202o = view;
        this.f1197j.c0(this);
        this.f1197j.d0(this);
        this.f1197j.b0(true);
        View view2 = this.f1202o;
        boolean z6 = this.f1204q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1204q = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1198k);
        }
        view2.addOnAttachStateChangeListener(this.f1199l);
        this.f1197j.Q(view2);
        this.f1197j.U(this.f1208u);
        if (!this.f1206s) {
            this.f1207t = l.e(this.f1192e, null, this.f1190c, this.f1194g);
            this.f1206s = true;
        }
        this.f1197j.S(this.f1207t);
        this.f1197j.Y(2);
        this.f1197j.V(d());
        this.f1197j.show();
        ListView f7 = this.f1197j.f();
        f7.setOnKeyListener(this);
        if (this.f1209v && this.f1191d.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1190c).inflate(a.j.f9212s, (ViewGroup) f7, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1191d.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            f7.addHeaderView(frameLayout, null, false);
        }
        this.f1197j.o(this.f1192e);
        this.f1197j.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(n.a aVar) {
        this.f1203p = aVar;
    }

    @Override // androidx.appcompat.view.menu.q
    public void show() {
        if (!q()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z6) {
        this.f1206s = false;
        f fVar = this.f1192e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }
}
