package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import d.o0;

/* loaded from: classes.dex */
public final class b implements t {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.g f5231a;

    public b(@o0 RecyclerView.g gVar) {
        this.f5231a = gVar;
    }

    @Override // androidx.recyclerview.widget.t
    public void a(int i7, int i8) {
        this.f5231a.notifyItemRangeRemoved(i7, i8);
    }

    @Override // androidx.recyclerview.widget.t
    public void b(int i7, int i8) {
        this.f5231a.notifyItemMoved(i7, i8);
    }

    @Override // androidx.recyclerview.widget.t
    public void c(int i7, int i8) {
        this.f5231a.notifyItemRangeInserted(i7, i8);
    }

    @Override // androidx.recyclerview.widget.t
    public void d(int i7, int i8, Object obj) {
        this.f5231a.notifyItemRangeChanged(i7, i8, obj);
    }
}