package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import d.b1;
import java.lang.reflect.Method;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class d1 extends z0 implements c1 {
    public static final String V = "MenuPopupWindow";
    public static Method W;
    public c1 U;

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @d.u
        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static void a(PopupWindow popupWindow, boolean z6) {
            popupWindow.setTouchModal(z6);
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class c extends s0 {

        /* renamed from: q  reason: collision with root package name */
        public final int f1571q;

        /* renamed from: r  reason: collision with root package name */
        public final int f1572r;

        /* renamed from: s  reason: collision with root package name */
        public c1 f1573s;

        /* renamed from: t  reason: collision with root package name */
        public MenuItem f1574t;

        @d.w0(17)
        /* loaded from: classes.dex */
        public static class a {
            @d.u
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z6) {
            super(context, z6);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f1571q = 21;
                this.f1572r = 22;
                return;
            }
            this.f1571q = 22;
            this.f1572r = 21;
        }

        @Override // androidx.appcompat.widget.s0
        public /* bridge */ /* synthetic */ int d(int i7, boolean z6) {
            return super.d(i7, z6);
        }

        @Override // androidx.appcompat.widget.s0
        public /* bridge */ /* synthetic */ int e(int i7, int i8, int i9, int i10, int i11) {
            return super.e(i7, i8, i9, i10, i11);
        }

        @Override // androidx.appcompat.widget.s0
        public /* bridge */ /* synthetic */ boolean f(MotionEvent motionEvent, int i7) {
            return super.f(motionEvent, i7);
        }

        @Override // androidx.appcompat.widget.s0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.s0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.s0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.s0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.s0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.f fVar;
            int i7;
            int pointToPosition;
            int i8;
            if (this.f1573s != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i7 = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                    i7 = 0;
                }
                androidx.appcompat.view.menu.j item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i8 = pointToPosition - i7) < 0 || i8 >= fVar.getCount()) ? null : fVar.getItem(i8);
                MenuItem menuItem = this.f1574t;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.g b7 = fVar.b();
                    if (menuItem != null) {
                        this.f1573s.d(b7, menuItem);
                    }
                    this.f1574t = item;
                    if (item != null) {
                        this.f1573s.c(b7, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i7, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i7 == this.f1571q) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i7 != this.f1572r) {
                return super.onKeyDown(i7, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.f) adapter).b().close(false);
                return true;
            }
        }

        @Override // androidx.appcompat.widget.s0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void p() {
            setSelection(-1);
        }

        public void setHoverListener(c1 c1Var) {
            this.f1573s = c1Var;
        }

        @Override // androidx.appcompat.widget.s0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                W = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(V, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public d1(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override // androidx.appcompat.widget.c1
    public void c(@d.o0 androidx.appcompat.view.menu.g gVar, @d.o0 MenuItem menuItem) {
        c1 c1Var = this.U;
        if (c1Var != null) {
            c1Var.c(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.c1
    public void d(@d.o0 androidx.appcompat.view.menu.g gVar, @d.o0 MenuItem menuItem) {
        c1 c1Var = this.U;
        if (c1Var != null) {
            c1Var.d(gVar, menuItem);
        }
    }

    public void n0(Object obj) {
        a.a(this.G, (Transition) obj);
    }

    public void o0(Object obj) {
        a.b(this.G, (Transition) obj);
    }

    public void p0(c1 c1Var) {
        this.U = c1Var;
    }

    public void q0(boolean z6) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.G, z6);
            return;
        }
        Method method = W;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(z6));
            } catch (Exception unused) {
                Log.i(V, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.z0
    @d.o0
    public s0 s(Context context, boolean z6) {
        c cVar = new c(context, z6);
        cVar.setHoverListener(this);
        return cVar;
    }
}
