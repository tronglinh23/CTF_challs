package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.o;
import d.b1;
import java.util.ArrayList;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    public g f1135b;

    /* renamed from: c  reason: collision with root package name */
    public int f1136c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1137d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1138e;

    /* renamed from: f  reason: collision with root package name */
    public final LayoutInflater f1139f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1140g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z6, int i7) {
        this.f1138e = z6;
        this.f1139f = layoutInflater;
        this.f1135b = gVar;
        this.f1140g = i7;
        a();
    }

    public void a() {
        j expandedItem = this.f1135b.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<j> nonActionItems = this.f1135b.getNonActionItems();
            int size = nonActionItems.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (nonActionItems.get(i7) == expandedItem) {
                    this.f1136c = i7;
                    return;
                }
            }
        }
        this.f1136c = -1;
    }

    public g b() {
        return this.f1135b;
    }

    public boolean c() {
        return this.f1137d;
    }

    @Override // android.widget.Adapter
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public j getItem(int i7) {
        ArrayList<j> nonActionItems = this.f1138e ? this.f1135b.getNonActionItems() : this.f1135b.getVisibleItems();
        int i8 = this.f1136c;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return nonActionItems.get(i7);
    }

    public void e(boolean z6) {
        this.f1137d = z6;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1136c < 0 ? (this.f1138e ? this.f1135b.getNonActionItems() : this.f1135b.getVisibleItems()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1139f.inflate(this.f1140g, viewGroup, false);
        }
        int groupId = getItem(i7).getGroupId();
        int i8 = i7 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1135b.isGroupDividerEnabled() && groupId != (i8 >= 0 ? getItem(i8).getGroupId() : groupId));
        o.a aVar = (o.a) view;
        if (this.f1137d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.initialize(getItem(i7), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
