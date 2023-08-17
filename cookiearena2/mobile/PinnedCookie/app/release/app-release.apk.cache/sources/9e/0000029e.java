package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import d.q0;
import d.w0;

@w0(21)
/* loaded from: classes.dex */
public class b implements e {
    @Override // androidx.cardview.widget.e
    public float a(d dVar) {
        return p(dVar).c();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList b(d dVar) {
        return p(dVar).b();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar, Context context, ColorStateList colorStateList, float f7, float f8, float f9) {
        dVar.c(new f(colorStateList, f7));
        View a7 = dVar.a();
        a7.setClipToOutline(true);
        a7.setElevation(f8);
        o(dVar, f9);
    }

    @Override // androidx.cardview.widget.e
    public void d(d dVar, float f7) {
        p(dVar).h(f7);
    }

    @Override // androidx.cardview.widget.e
    public float e(d dVar) {
        return dVar.a().getElevation();
    }

    @Override // androidx.cardview.widget.e
    public void f(d dVar) {
        if (!dVar.e()) {
            dVar.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float a7 = a(dVar);
        float h7 = h(dVar);
        int ceil = (int) Math.ceil(g.c(a7, h7, dVar.d()));
        int ceil2 = (int) Math.ceil(g.d(a7, h7, dVar.d()));
        dVar.setShadowPadding(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.e
    public void g() {
    }

    @Override // androidx.cardview.widget.e
    public float h(d dVar) {
        return p(dVar).d();
    }

    @Override // androidx.cardview.widget.e
    public float i(d dVar) {
        return h(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public float j(d dVar) {
        return h(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar) {
        o(dVar, a(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void l(d dVar, float f7) {
        dVar.a().setElevation(f7);
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar) {
        o(dVar, a(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, @q0 ColorStateList colorStateList) {
        p(dVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f7) {
        p(dVar).g(f7, dVar.e(), dVar.d());
        f(dVar);
    }

    public final f p(d dVar) {
        return (f) dVar.f();
    }
}