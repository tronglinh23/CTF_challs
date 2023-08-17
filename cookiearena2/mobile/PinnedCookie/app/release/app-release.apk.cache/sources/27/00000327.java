package androidx.core.view;

import android.view.View;

@d.w0(16)
/* loaded from: classes.dex */
public final class c {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final c f3556a = new c();

    @d.u
    @s4.m
    public static final void a(@n6.d View view, @n6.d Runnable runnable, long j7) {
        u4.l0.p(view, "view");
        u4.l0.p(runnable, s2.t0.f16450f);
        view.postOnAnimationDelayed(runnable, j7);
    }
}