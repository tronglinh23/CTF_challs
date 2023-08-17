package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.d1;
import androidx.core.view.m0;
import androidx.core.view.u1;
import d.g1;
import d.o0;
import d.q0;
import f.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class d extends l implements n, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int C = a.j.f9205l;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 200;
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1087c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1088d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1089e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1090f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1091g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f1092h;

    /* renamed from: p  reason: collision with root package name */
    public View f1100p;

    /* renamed from: q  reason: collision with root package name */
    public View f1101q;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1103s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1104t;

    /* renamed from: u  reason: collision with root package name */
    public int f1105u;

    /* renamed from: v  reason: collision with root package name */
    public int f1106v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1108x;

    /* renamed from: y  reason: collision with root package name */
    public n.a f1109y;

    /* renamed from: z  reason: collision with root package name */
    public ViewTreeObserver f1110z;

    /* renamed from: i  reason: collision with root package name */
    public final List<g> f1093i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final List<C0024d> f1094j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1095k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f1096l = new b();

    /* renamed from: m  reason: collision with root package name */
    public final c1 f1097m = new c();

    /* renamed from: n  reason: collision with root package name */
    public int f1098n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f1099o = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1107w = false;

    /* renamed from: r  reason: collision with root package name */
    public int f1102r = u();

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.a() || d.this.f1094j.size() <= 0 || d.this.f1094j.get(0).f1118a.J()) {
                return;
            }
            View view = d.this.f1101q;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0024d> it = d.this.f1094j.iterator();
            while (it.hasNext()) {
                it.next().f1118a.show();
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
            ViewTreeObserver viewTreeObserver = d.this.f1110z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.f1110z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.f1110z.removeGlobalOnLayoutListener(dVar.f1095k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements c1 {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ C0024d f1114k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ MenuItem f1115l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ g f1116m;

            public a(C0024d c0024d, MenuItem menuItem, g gVar) {
                this.f1114k = c0024d;
                this.f1115l = menuItem;
                this.f1116m = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0024d c0024d = this.f1114k;
                if (c0024d != null) {
                    d.this.B = true;
                    c0024d.f1119b.close(false);
                    d.this.B = false;
                }
                if (this.f1115l.isEnabled() && this.f1115l.hasSubMenu()) {
                    this.f1116m.performItemAction(this.f1115l, 4);
                }
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.widget.c1
        public void c(@o0 g gVar, @o0 MenuItem menuItem) {
            d.this.f1092h.removeCallbacksAndMessages(null);
            int size = d.this.f1094j.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                } else if (gVar == d.this.f1094j.get(i7).f1119b) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 == -1) {
                return;
            }
            int i8 = i7 + 1;
            d.this.f1092h.postAtTime(new a(i8 < d.this.f1094j.size() ? d.this.f1094j.get(i8) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.c1
        public void d(@o0 g gVar, @o0 MenuItem menuItem) {
            d.this.f1092h.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0024d {

        /* renamed from: a  reason: collision with root package name */
        public final d1 f1118a;

        /* renamed from: b  reason: collision with root package name */
        public final g f1119b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1120c;

        public C0024d(@o0 d1 d1Var, @o0 g gVar, int i7) {
            this.f1118a = d1Var;
            this.f1119b = gVar;
            this.f1120c = i7;
        }

        public ListView a() {
            return this.f1118a.f();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    public d(@o0 Context context, @o0 View view, @d.f int i7, @g1 int i8, boolean z6) {
        this.f1087c = context;
        this.f1100p = view;
        this.f1089e = i7;
        this.f1090f = i8;
        this.f1091g = z6;
        Resources resources = context.getResources();
        this.f1088d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.e.f9073x));
        this.f1092h = new Handler();
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean a() {
        return this.f1094j.size() > 0 && this.f1094j.get(0).f1118a.a();
    }

    @Override // androidx.appcompat.view.menu.l
    public void b(g gVar) {
        gVar.addMenuPresenter(this, this.f1087c);
        if (a()) {
            w(gVar);
        } else {
            this.f1093i.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        int size = this.f1094j.size();
        if (size > 0) {
            C0024d[] c0024dArr = (C0024d[]) this.f1094j.toArray(new C0024d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                C0024d c0024d = c0024dArr[i7];
                if (c0024d.f1118a.a()) {
                    c0024d.f1118a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView f() {
        if (this.f1094j.isEmpty()) {
            return null;
        }
        return this.f1094j.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public void g(@o0 View view) {
        if (this.f1100p != view) {
            this.f1100p = view;
            this.f1099o = m0.d(this.f1098n, u1.Z(view));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void i(boolean z6) {
        this.f1107w = z6;
    }

    @Override // androidx.appcompat.view.menu.l
    public void j(int i7) {
        if (this.f1098n != i7) {
            this.f1098n = i7;
            this.f1099o = m0.d(i7, u1.Z(this.f1100p));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void k(int i7) {
        this.f1103s = true;
        this.f1105u = i7;
    }

    @Override // androidx.appcompat.view.menu.l
    public void l(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void m(boolean z6) {
        this.f1108x = z6;
    }

    @Override // androidx.appcompat.view.menu.l
    public void n(int i7) {
        this.f1104t = true;
        this.f1106v = i7;
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(g gVar, boolean z6) {
        int r6 = r(gVar);
        if (r6 < 0) {
            return;
        }
        int i7 = r6 + 1;
        if (i7 < this.f1094j.size()) {
            this.f1094j.get(i7).f1119b.close(false);
        }
        C0024d remove = this.f1094j.remove(r6);
        remove.f1119b.removeMenuPresenter(this);
        if (this.B) {
            remove.f1118a.o0(null);
            remove.f1118a.R(0);
        }
        remove.f1118a.dismiss();
        int size = this.f1094j.size();
        if (size > 0) {
            this.f1102r = this.f1094j.get(size - 1).f1120c;
        } else {
            this.f1102r = u();
        }
        if (size != 0) {
            if (z6) {
                this.f1094j.get(0).f1119b.close(false);
                return;
            }
            return;
        }
        dismiss();
        n.a aVar = this.f1109y;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1110z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1110z.removeGlobalOnLayoutListener(this.f1095k);
            }
            this.f1110z = null;
        }
        this.f1101q.removeOnAttachStateChangeListener(this.f1096l);
        this.A.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0024d c0024d;
        int size = this.f1094j.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                c0024d = null;
                break;
            }
            c0024d = this.f1094j.get(i7);
            if (!c0024d.f1118a.a()) {
                break;
            }
            i7++;
        }
        if (c0024d != null) {
            c0024d.f1119b.close(false);
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
        for (C0024d c0024d : this.f1094j) {
            if (sVar == c0024d.f1119b) {
                c0024d.a().requestFocus();
                return true;
            }
        }
        if (sVar.hasVisibleItems()) {
            b(sVar);
            n.a aVar = this.f1109y;
            if (aVar != null) {
                aVar.a(sVar);
            }
            return true;
        }
        return false;
    }

    public final d1 q() {
        d1 d1Var = new d1(this.f1087c, null, this.f1089e, this.f1090f);
        d1Var.p0(this.f1097m);
        d1Var.d0(this);
        d1Var.c0(this);
        d1Var.Q(this.f1100p);
        d1Var.U(this.f1099o);
        d1Var.b0(true);
        d1Var.Y(2);
        return d1Var;
    }

    public final int r(@o0 g gVar) {
        int size = this.f1094j.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (gVar == this.f1094j.get(i7).f1119b) {
                return i7;
            }
        }
        return -1;
    }

    public final MenuItem s(@o0 g gVar, @o0 g gVar2) {
        int size = gVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = gVar.getItem(i7);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(n.a aVar) {
        this.f1109y = aVar;
    }

    @Override // androidx.appcompat.view.menu.q
    public void show() {
        if (a()) {
            return;
        }
        Iterator<g> it = this.f1093i.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
        this.f1093i.clear();
        View view = this.f1100p;
        this.f1101q = view;
        if (view != null) {
            boolean z6 = this.f1110z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1110z = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1095k);
            }
            this.f1101q.addOnAttachStateChangeListener(this.f1096l);
        }
    }

    @q0
    public final View t(@o0 C0024d c0024d, @o0 g gVar) {
        f fVar;
        int i7;
        int firstVisiblePosition;
        MenuItem s6 = s(c0024d.f1119b, gVar);
        if (s6 == null) {
            return null;
        }
        ListView a7 = c0024d.a();
        ListAdapter adapter = a7.getAdapter();
        int i8 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i7 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i7 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i8 >= count) {
                i8 = -1;
                break;
            } else if (s6 == fVar.getItem(i8)) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 != -1 && (firstVisiblePosition = (i8 + i7) - a7.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a7.getChildCount()) {
            return a7.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int u() {
        return u1.Z(this.f1100p) == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z6) {
        Iterator<C0024d> it = this.f1094j.iterator();
        while (it.hasNext()) {
            l.p(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    public final int v(int i7) {
        List<C0024d> list = this.f1094j;
        ListView a7 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a7.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1101q.getWindowVisibleDisplayFrame(rect);
        return this.f1102r == 1 ? (iArr[0] + a7.getWidth()) + i7 > rect.right ? 0 : 1 : iArr[0] - i7 < 0 ? 1 : 0;
    }

    public final void w(@o0 g gVar) {
        C0024d c0024d;
        View view;
        int i7;
        LayoutInflater from = LayoutInflater.from(this.f1087c);
        f fVar = new f(gVar, from, this.f1091g, C);
        if (!a() && this.f1107w) {
            fVar.e(true);
        } else if (a()) {
            fVar.e(l.o(gVar));
        }
        int e7 = l.e(fVar, null, this.f1087c, this.f1088d);
        d1 q6 = q();
        q6.o(fVar);
        q6.S(e7);
        q6.U(this.f1099o);
        if (this.f1094j.size() > 0) {
            List<C0024d> list = this.f1094j;
            c0024d = list.get(list.size() - 1);
            view = t(c0024d, gVar);
        } else {
            c0024d = null;
            view = null;
        }
        if (view != null) {
            q6.q0(false);
            q6.n0(null);
            int v6 = v(e7);
            boolean z6 = v6 == 1;
            this.f1102r = v6;
            q6.Q(view);
            if ((this.f1099o & 5) == 5) {
                if (!z6) {
                    e7 = view.getWidth();
                    i7 = 0 - e7;
                }
                i7 = e7 + 0;
            } else {
                if (z6) {
                    e7 = view.getWidth();
                    i7 = e7 + 0;
                }
                i7 = 0 - e7;
            }
            q6.j(i7);
            q6.f0(true);
            q6.h(0);
        } else {
            if (this.f1103s) {
                q6.j(this.f1105u);
            }
            if (this.f1104t) {
                q6.h(this.f1106v);
            }
            q6.V(d());
        }
        this.f1094j.add(new C0024d(q6, gVar, this.f1102r));
        q6.show();
        ListView f7 = q6.f();
        f7.setOnKeyListener(this);
        if (c0024d == null && this.f1108x && gVar.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(a.j.f9212s, (ViewGroup) f7, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(gVar.getHeaderTitle());
            f7.addHeaderView(frameLayout, null, false);
            q6.show();
        }
    }
}
