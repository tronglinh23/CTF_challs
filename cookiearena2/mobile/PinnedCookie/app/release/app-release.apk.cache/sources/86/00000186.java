package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public abstract class l implements q, n, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public Rect f1173b;

    public static int e(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i8 = 0;
        int i9 = 0;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = listAdapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i10, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i8) {
                i8 = measuredWidth;
            }
        }
        return i8;
    }

    public static boolean o(g gVar) {
        int size = gVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = gVar.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static f p(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f) listAdapter;
    }

    public abstract void b(g gVar);

    public boolean c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(g gVar, j jVar) {
        return false;
    }

    public Rect d() {
        return this.f1173b;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(g gVar, j jVar) {
        return false;
    }

    public abstract void g(View view);

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.n
    public o getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    public void h(Rect rect) {
        this.f1173b = rect;
    }

    public abstract void i(boolean z6);

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(@o0 Context context, @q0 g gVar) {
    }

    public abstract void j(int i7);

    public abstract void k(int i7);

    public abstract void l(PopupWindow.OnDismissListener onDismissListener);

    public abstract void m(boolean z6);

    public abstract void n(int i7);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        p(listAdapter).f1135b.performItemAction((MenuItem) listAdapter.getItem(i7), this, c() ? 0 : 4);
    }
}