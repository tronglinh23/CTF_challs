package y2;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.transition.m0;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d.f1;
import java.lang.ref.WeakReference;
import s2.g0;
import s2.w;
import u4.l0;
/* loaded from: classes.dex */
public final class h extends a {
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference<CollapsingToolbarLayout> f18773f;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public final WeakReference<Toolbar> f18774g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(@n6.d com.google.android.material.appbar.CollapsingToolbarLayout r3, @n6.d androidx.appcompat.widget.Toolbar r4, @n6.d y2.d r5) {
        /*
            r2 = this;
            java.lang.String r0 = "collapsingToolbarLayout"
            u4.l0.p(r3, r0)
            java.lang.String r0 = "toolbar"
            u4.l0.p(r4, r0)
            java.lang.String r0 = "configuration"
            u4.l0.p(r5, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "collapsingToolbarLayout.context"
            u4.l0.o(r0, r1)
            r2.<init>(r0, r5)
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            r2.f18773f = r5
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            r2.f18774g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.h.<init>(com.google.android.material.appbar.CollapsingToolbarLayout, androidx.appcompat.widget.Toolbar, y2.d):void");
    }

    @Override // y2.a, s2.w.c
    public void a(@n6.d w wVar, @n6.d g0 g0Var, @n6.e Bundle bundle) {
        l0.p(wVar, "controller");
        l0.p(g0Var, "destination");
        CollapsingToolbarLayout collapsingToolbarLayout = this.f18773f.get();
        Toolbar toolbar = this.f18774g.get();
        if (collapsingToolbarLayout == null || toolbar == null) {
            wVar.N0(this);
        } else {
            super.a(wVar, g0Var, bundle);
        }
    }

    @Override // y2.a
    public void c(@n6.e Drawable drawable, @f1 int i7) {
        Toolbar toolbar = this.f18774g.get();
        if (toolbar != null) {
            boolean z6 = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i7);
            if (z6) {
                m0.a(toolbar);
            }
        }
    }

    @Override // y2.a
    public void d(@n6.e CharSequence charSequence) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f18773f.get();
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setTitle(charSequence);
        }
    }
}
