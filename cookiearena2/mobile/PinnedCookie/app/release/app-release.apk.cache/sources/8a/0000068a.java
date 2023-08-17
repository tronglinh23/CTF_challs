package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;

/* loaded from: classes.dex */
public abstract class d0<T2> extends c0.b<T2> {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.g f5281a;

    public d0(RecyclerView.g gVar) {
        this.f5281a = gVar;
    }

    @Override // androidx.recyclerview.widget.t
    public void a(int i7, int i8) {
        this.f5281a.notifyItemRangeRemoved(i7, i8);
    }

    @Override // androidx.recyclerview.widget.t
    public void b(int i7, int i8) {
        this.f5281a.notifyItemMoved(i7, i8);
    }

    @Override // androidx.recyclerview.widget.t
    public void c(int i7, int i8) {
        this.f5281a.notifyItemRangeInserted(i7, i8);
    }

    @Override // androidx.recyclerview.widget.c0.b, androidx.recyclerview.widget.t
    public void d(int i7, int i8, Object obj) {
        this.f5281a.notifyItemRangeChanged(i7, i8, obj);
    }

    @Override // androidx.recyclerview.widget.c0.b
    public void h(int i7, int i8) {
        this.f5281a.notifyItemRangeChanged(i7, i8);
    }
}