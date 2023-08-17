package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import d.b1;
import f.a;
import java.util.ArrayList;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e implements n, AdapterView.OnItemClickListener {

    /* renamed from: l  reason: collision with root package name */
    public static final String f1121l = "ListMenuPresenter";

    /* renamed from: m  reason: collision with root package name */
    public static final String f1122m = "android:menu:list";

    /* renamed from: b  reason: collision with root package name */
    public Context f1123b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f1124c;

    /* renamed from: d  reason: collision with root package name */
    public g f1125d;

    /* renamed from: e  reason: collision with root package name */
    public ExpandedMenuView f1126e;

    /* renamed from: f  reason: collision with root package name */
    public int f1127f;

    /* renamed from: g  reason: collision with root package name */
    public int f1128g;

    /* renamed from: h  reason: collision with root package name */
    public int f1129h;

    /* renamed from: i  reason: collision with root package name */
    public n.a f1130i;

    /* renamed from: j  reason: collision with root package name */
    public a f1131j;

    /* renamed from: k  reason: collision with root package name */
    public int f1132k;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        public int f1133b = -1;

        public a() {
            a();
        }

        public void a() {
            j expandedItem = e.this.f1125d.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<j> nonActionItems = e.this.f1125d.getNonActionItems();
                int size = nonActionItems.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (nonActionItems.get(i7) == expandedItem) {
                        this.f1133b = i7;
                        return;
                    }
                }
            }
            this.f1133b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public j getItem(int i7) {
            ArrayList<j> nonActionItems = e.this.f1125d.getNonActionItems();
            int i8 = i7 + e.this.f1127f;
            int i9 = this.f1133b;
            if (i9 >= 0 && i8 >= i9) {
                i8++;
            }
            return nonActionItems.get(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f1125d.getNonActionItems().size() - e.this.f1127f;
            return this.f1133b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f1124c.inflate(eVar.f1129h, viewGroup, false);
            }
            ((o.a) view).initialize(getItem(i7), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i7) {
        this(i7, 0);
        this.f1123b = context;
        this.f1124c = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f1131j == null) {
            this.f1131j = new a();
        }
        return this.f1131j;
    }

    public int b() {
        return this.f1127f;
    }

    public void c(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f1122m);
        if (sparseParcelableArray != null) {
            this.f1126e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(g gVar, j jVar) {
        return false;
    }

    public void d(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1126e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f1122m, sparseArray);
    }

    public void e(int i7) {
        this.f1132k = i7;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(g gVar, j jVar) {
        return false;
    }

    public void f(int i7) {
        this.f1127f = i7;
        if (this.f1126e != null) {
            updateMenuView(false);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f1132k;
    }

    @Override // androidx.appcompat.view.menu.n
    public o getMenuView(ViewGroup viewGroup) {
        if (this.f1126e == null) {
            this.f1126e = (ExpandedMenuView) this.f1124c.inflate(a.j.f9207n, viewGroup, false);
            if (this.f1131j == null) {
                this.f1131j = new a();
            }
            this.f1126e.setAdapter((ListAdapter) this.f1131j);
            this.f1126e.setOnItemClickListener(this);
        }
        return this.f1126e;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(Context context, g gVar) {
        if (this.f1128g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1128g);
            this.f1123b = contextThemeWrapper;
            this.f1124c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1123b != null) {
            this.f1123b = context;
            if (this.f1124c == null) {
                this.f1124c = LayoutInflater.from(context);
            }
        }
        this.f1125d = gVar;
        a aVar = this.f1131j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(g gVar, boolean z6) {
        n.a aVar = this.f1130i;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, z6);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
        this.f1125d.performItemAction(this.f1131j.getItem(i7), this, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void onRestoreInstanceState(Parcelable parcelable) {
        c((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable onSaveInstanceState() {
        if (this.f1126e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        d(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(s sVar) {
        if (sVar.hasVisibleItems()) {
            new h(sVar).d(null);
            n.a aVar = this.f1130i;
            if (aVar != null) {
                aVar.a(sVar);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(n.a aVar) {
        this.f1130i = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z6) {
        a aVar = this.f1131j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public e(int i7, int i8) {
        this.f1129h = i7;
        this.f1128g = i8;
    }
}
