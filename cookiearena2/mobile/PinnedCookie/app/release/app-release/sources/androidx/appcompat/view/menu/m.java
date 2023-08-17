package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.n;
import androidx.core.view.m0;
import androidx.core.view.u1;
import d.b1;
import d.g1;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import f.a;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class m implements i {

    /* renamed from: m  reason: collision with root package name */
    public static final int f1174m = 48;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1175a;

    /* renamed from: b  reason: collision with root package name */
    public final g f1176b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1177c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1178d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1179e;

    /* renamed from: f  reason: collision with root package name */
    public View f1180f;

    /* renamed from: g  reason: collision with root package name */
    public int f1181g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1182h;

    /* renamed from: i  reason: collision with root package name */
    public n.a f1183i;

    /* renamed from: j  reason: collision with root package name */
    public l f1184j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1185k;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f1186l;

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m.this.g();
        }
    }

    @w0(17)
    /* loaded from: classes.dex */
    public static class b {
        @u
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public m(@o0 Context context, @o0 g gVar) {
        this(context, gVar, null, false, a.b.f8971z2, 0);
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(@q0 n.a aVar) {
        this.f1183i = aVar;
        l lVar = this.f1184j;
        if (lVar != null) {
            lVar.setCallback(aVar);
        }
    }

    @o0
    public final l b() {
        Display defaultDisplay = ((WindowManager) this.f1175a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        l dVar = Math.min(point.x, point.y) >= this.f1175a.getResources().getDimensionPixelSize(a.e.f9071w) ? new d(this.f1175a, this.f1180f, this.f1178d, this.f1179e, this.f1177c) : new r(this.f1175a, this.f1176b, this.f1180f, this.f1178d, this.f1179e, this.f1177c);
        dVar.b(this.f1176b);
        dVar.l(this.f1186l);
        dVar.g(this.f1180f);
        dVar.setCallback(this.f1183i);
        dVar.i(this.f1182h);
        dVar.j(this.f1181g);
        return dVar;
    }

    public int c() {
        return this.f1181g;
    }

    public ListView d() {
        return e().f();
    }

    @Override // androidx.appcompat.view.menu.i
    public void dismiss() {
        if (f()) {
            this.f1184j.dismiss();
        }
    }

    @b1({b1.a.LIBRARY})
    @o0
    public l e() {
        if (this.f1184j == null) {
            this.f1184j = b();
        }
        return this.f1184j;
    }

    public boolean f() {
        l lVar = this.f1184j;
        return lVar != null && lVar.a();
    }

    public void g() {
        this.f1184j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1185k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(@o0 View view) {
        this.f1180f = view;
    }

    public void i(boolean z6) {
        this.f1182h = z6;
        l lVar = this.f1184j;
        if (lVar != null) {
            lVar.i(z6);
        }
    }

    public void j(int i7) {
        this.f1181g = i7;
    }

    public void k(@q0 PopupWindow.OnDismissListener onDismissListener) {
        this.f1185k = onDismissListener;
    }

    public void l() {
        if (!o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m(int i7, int i8) {
        if (!p(i7, i8)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void n(int i7, int i8, boolean z6, boolean z7) {
        l e7 = e();
        e7.m(z7);
        if (z6) {
            if ((m0.d(this.f1181g, u1.Z(this.f1180f)) & 7) == 5) {
                i7 -= this.f1180f.getWidth();
            }
            e7.k(i7);
            e7.n(i8);
            int i9 = (int) ((this.f1175a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            e7.h(new Rect(i7 - i9, i8 - i9, i7 + i9, i8 + i9));
        }
        e7.show();
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f1180f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int i7, int i8) {
        if (f()) {
            return true;
        }
        if (this.f1180f == null) {
            return false;
        }
        n(i7, i8, true, true);
        return true;
    }

    public m(@o0 Context context, @o0 g gVar, @o0 View view) {
        this(context, gVar, view, false, a.b.f8971z2, 0);
    }

    public m(@o0 Context context, @o0 g gVar, @o0 View view, boolean z6, @d.f int i7) {
        this(context, gVar, view, z6, i7, 0);
    }

    public m(@o0 Context context, @o0 g gVar, @o0 View view, boolean z6, @d.f int i7, @g1 int i8) {
        this.f1181g = m0.f3714b;
        this.f1186l = new a();
        this.f1175a = context;
        this.f1176b = gVar;
        this.f1180f = view;
        this.f1177c = z6;
        this.f1178d = i7;
        this.f1179e = i8;
    }
}
