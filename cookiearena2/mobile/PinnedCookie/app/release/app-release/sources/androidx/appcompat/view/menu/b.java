package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import d.b1;
import java.util.ArrayList;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class b implements n {

    /* renamed from: b  reason: collision with root package name */
    public Context f1074b;

    /* renamed from: c  reason: collision with root package name */
    public Context f1075c;

    /* renamed from: d  reason: collision with root package name */
    public g f1076d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f1077e;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f1078f;

    /* renamed from: g  reason: collision with root package name */
    public n.a f1079g;

    /* renamed from: h  reason: collision with root package name */
    public int f1080h;

    /* renamed from: i  reason: collision with root package name */
    public int f1081i;

    /* renamed from: j  reason: collision with root package name */
    public o f1082j;

    /* renamed from: k  reason: collision with root package name */
    public int f1083k;

    public b(Context context, int i7, int i8) {
        this.f1074b = context;
        this.f1077e = LayoutInflater.from(context);
        this.f1080h = i7;
        this.f1081i = i8;
    }

    public void b(View view, int i7) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1082j).addView(view, i7);
    }

    public abstract void c(j jVar, o.a aVar);

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(g gVar, j jVar) {
        return false;
    }

    public o.a d(ViewGroup viewGroup) {
        return (o.a) this.f1077e.inflate(this.f1081i, viewGroup, false);
    }

    public boolean e(ViewGroup viewGroup, int i7) {
        viewGroup.removeViewAt(i7);
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(g gVar, j jVar) {
        return false;
    }

    public n.a f() {
        return this.f1079g;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    public View g(j jVar, View view, ViewGroup viewGroup) {
        o.a d7 = view instanceof o.a ? (o.a) view : d(viewGroup);
        c(jVar, d7);
        return (View) d7;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f1083k;
    }

    @Override // androidx.appcompat.view.menu.n
    public o getMenuView(ViewGroup viewGroup) {
        if (this.f1082j == null) {
            o oVar = (o) this.f1077e.inflate(this.f1080h, viewGroup, false);
            this.f1082j = oVar;
            oVar.initialize(this.f1076d);
            updateMenuView(true);
        }
        return this.f1082j;
    }

    public void h(int i7) {
        this.f1083k = i7;
    }

    public boolean i(int i7, j jVar) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(Context context, g gVar) {
        this.f1075c = context;
        this.f1078f = LayoutInflater.from(context);
        this.f1076d = gVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(g gVar, boolean z6) {
        n.a aVar = this.f1079g;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, z6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(s sVar) {
        n.a aVar = this.f1079g;
        s sVar2 = sVar;
        if (aVar != null) {
            if (sVar == null) {
                sVar2 = this.f1076d;
            }
            return aVar.a(sVar2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(n.a aVar) {
        this.f1079g = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z6) {
        ViewGroup viewGroup = (ViewGroup) this.f1082j;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f1076d;
        int i7 = 0;
        if (gVar != null) {
            gVar.flagActionItems();
            ArrayList<j> visibleItems = this.f1076d.getVisibleItems();
            int size = visibleItems.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                j jVar = visibleItems.get(i9);
                if (i(i8, jVar)) {
                    View childAt = viewGroup.getChildAt(i8);
                    j itemData = childAt instanceof o.a ? ((o.a) childAt).getItemData() : null;
                    View g7 = g(jVar, childAt, viewGroup);
                    if (jVar != itemData) {
                        g7.setPressed(false);
                        g7.jumpDrawablesToCurrentState();
                    }
                    if (g7 != childAt) {
                        b(g7, i8);
                    }
                    i8++;
                }
            }
            i7 = i8;
        }
        while (i7 < viewGroup.getChildCount()) {
            if (!e(viewGroup, i7)) {
                i7++;
            }
        }
    }
}
