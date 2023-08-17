package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.t1;
import d.b1;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g.b, o, AdapterView.OnItemClickListener {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1038d = {16842964, 16843049};

    /* renamed from: b  reason: collision with root package name */
    public g f1039b;

    /* renamed from: c  reason: collision with root package name */
    public int f1040c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(j jVar) {
        return this.f1039b.performItemAction(jVar, 0);
    }

    @Override // androidx.appcompat.view.menu.o
    public int getWindowAnimations() {
        return this.f1040c;
    }

    @Override // androidx.appcompat.view.menu.o
    public void initialize(g gVar) {
        this.f1039b = gVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        a((j) getAdapter().getItem(i7));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        t1 G = t1.G(context, attributeSet, f1038d, i7, 0);
        if (G.C(0)) {
            setBackgroundDrawable(G.h(0));
        }
        if (G.C(1)) {
            setDivider(G.h(1));
        }
        G.I();
    }
}