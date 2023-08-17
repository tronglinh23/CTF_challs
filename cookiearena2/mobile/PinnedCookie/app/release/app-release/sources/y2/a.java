package y2;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import d.f1;
import java.lang.ref.WeakReference;
import s2.g0;
import s2.w;
import u4.l0;
import u4.r1;
import v3.q1;
import v3.u0;
import y2.t;
@r1({"SMAP\nAbstractAppBarOnDestinationChangedListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAppBarOnDestinationChangedListener.kt\nandroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: classes.dex */
public abstract class a implements w.c {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Context f18757a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final d f18758b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<androidx.customview.widget.c> f18759c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public androidx.appcompat.graphics.drawable.d f18760d;
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f18761e;

    public a(@n6.d Context context, @n6.d d dVar) {
        l0.p(context, "context");
        l0.p(dVar, "configuration");
        this.f18757a = context;
        this.f18758b = dVar;
        androidx.customview.widget.c c7 = dVar.c();
        this.f18759c = c7 != null ? new WeakReference<>(c7) : null;
    }

    @Override // s2.w.c
    public void a(@n6.d w wVar, @n6.d g0 g0Var, @n6.e Bundle bundle) {
        l0.p(wVar, "controller");
        l0.p(g0Var, "destination");
        if (g0Var instanceof s2.i) {
            return;
        }
        WeakReference<androidx.customview.widget.c> weakReference = this.f18759c;
        androidx.customview.widget.c cVar = weakReference != null ? weakReference.get() : null;
        if (this.f18759c != null && cVar == null) {
            wVar.N0(this);
            return;
        }
        String l7 = g0Var.l(this.f18757a, bundle);
        if (l7 != null) {
            d(l7);
        }
        boolean e7 = this.f18758b.e(g0Var);
        boolean z6 = false;
        if (cVar == null && e7) {
            c(null, 0);
            return;
        }
        if (cVar != null && e7) {
            z6 = true;
        }
        b(z6);
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    public final void b(boolean z6) {
        u0 a7;
        androidx.appcompat.graphics.drawable.d dVar = this.f18760d;
        if (dVar == null || (a7 = q1.a(dVar, Boolean.TRUE)) == null) {
            androidx.appcompat.graphics.drawable.d dVar2 = new androidx.appcompat.graphics.drawable.d(this.f18757a);
            this.f18760d = dVar2;
            a7 = q1.a(dVar2, Boolean.FALSE);
        }
        androidx.appcompat.graphics.drawable.d dVar3 = (androidx.appcompat.graphics.drawable.d) a7.a();
        boolean booleanValue = ((Boolean) a7.b()).booleanValue();
        c(dVar3, z6 ? t.d.f18808c : t.d.f18807b);
        float f7 = z6 ? 0.0f : 1.0f;
        if (!booleanValue) {
            dVar3.setProgress(f7);
            return;
        }
        float i7 = dVar3.i();
        ValueAnimator valueAnimator = this.f18761e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar3, "progress", i7, f7);
        this.f18761e = ofFloat;
        l0.n(ofFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        ofFloat.start();
    }

    public abstract void c(@n6.e Drawable drawable, @f1 int i7);

    public abstract void d(@n6.e CharSequence charSequence);
}
