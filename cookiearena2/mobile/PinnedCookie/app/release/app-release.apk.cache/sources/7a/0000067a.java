package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public abstract class a0 extends RecyclerView.l {

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f5228m = false;

    /* renamed from: n  reason: collision with root package name */
    public static final String f5229n = "SimpleItemAnimator";

    /* renamed from: l  reason: collision with root package name */
    public boolean f5230l = true;

    public abstract boolean D(RecyclerView.f0 f0Var);

    public abstract boolean E(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i7, int i8, int i9, int i10);

    public abstract boolean F(RecyclerView.f0 f0Var, int i7, int i8, int i9, int i10);

    public abstract boolean G(RecyclerView.f0 f0Var);

    public final void H(RecyclerView.f0 f0Var) {
        Q(f0Var);
        h(f0Var);
    }

    public final void I(RecyclerView.f0 f0Var) {
        R(f0Var);
    }

    public final void J(RecyclerView.f0 f0Var, boolean z6) {
        S(f0Var, z6);
        h(f0Var);
    }

    public final void K(RecyclerView.f0 f0Var, boolean z6) {
        T(f0Var, z6);
    }

    public final void L(RecyclerView.f0 f0Var) {
        U(f0Var);
        h(f0Var);
    }

    public final void M(RecyclerView.f0 f0Var) {
        V(f0Var);
    }

    public final void N(RecyclerView.f0 f0Var) {
        W(f0Var);
        h(f0Var);
    }

    public final void O(RecyclerView.f0 f0Var) {
        X(f0Var);
    }

    public boolean P() {
        return this.f5230l;
    }

    public void Q(RecyclerView.f0 f0Var) {
    }

    public void R(RecyclerView.f0 f0Var) {
    }

    public void S(RecyclerView.f0 f0Var, boolean z6) {
    }

    public void T(RecyclerView.f0 f0Var, boolean z6) {
    }

    public void U(RecyclerView.f0 f0Var) {
    }

    public void V(RecyclerView.f0 f0Var) {
    }

    public void W(RecyclerView.f0 f0Var) {
    }

    public void X(RecyclerView.f0 f0Var) {
    }

    public void Y(boolean z6) {
        this.f5230l = z6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(@o0 RecyclerView.f0 f0Var, @q0 RecyclerView.l.d dVar, @o0 RecyclerView.l.d dVar2) {
        int i7;
        int i8;
        return (dVar == null || ((i7 = dVar.f5111a) == (i8 = dVar2.f5111a) && dVar.f5112b == dVar2.f5112b)) ? D(f0Var) : F(f0Var, i7, dVar.f5112b, i8, dVar2.f5112b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(@o0 RecyclerView.f0 f0Var, @o0 RecyclerView.f0 f0Var2, @o0 RecyclerView.l.d dVar, @o0 RecyclerView.l.d dVar2) {
        int i7;
        int i8;
        int i9 = dVar.f5111a;
        int i10 = dVar.f5112b;
        if (f0Var2.shouldIgnore()) {
            int i11 = dVar.f5111a;
            i8 = dVar.f5112b;
            i7 = i11;
        } else {
            i7 = dVar2.f5111a;
            i8 = dVar2.f5112b;
        }
        return E(f0Var, f0Var2, i9, i10, i7, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(@o0 RecyclerView.f0 f0Var, @o0 RecyclerView.l.d dVar, @q0 RecyclerView.l.d dVar2) {
        int i7 = dVar.f5111a;
        int i8 = dVar.f5112b;
        View view = f0Var.itemView;
        int left = dVar2 == null ? view.getLeft() : dVar2.f5111a;
        int top = dVar2 == null ? view.getTop() : dVar2.f5112b;
        if (f0Var.isRemoved() || (i7 == left && i8 == top)) {
            return G(f0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return F(f0Var, i7, i8, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(@o0 RecyclerView.f0 f0Var, @o0 RecyclerView.l.d dVar, @o0 RecyclerView.l.d dVar2) {
        int i7 = dVar.f5111a;
        int i8 = dVar2.f5111a;
        if (i7 == i8 && dVar.f5112b == dVar2.f5112b) {
            L(f0Var);
            return false;
        }
        return F(f0Var, i7, dVar.f5112b, i8, dVar2.f5112b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(@o0 RecyclerView.f0 f0Var) {
        return !this.f5230l || f0Var.isInvalid();
    }
}