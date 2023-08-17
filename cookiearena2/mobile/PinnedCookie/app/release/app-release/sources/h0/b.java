package h0;

import android.animation.Animator;
import d.u;
import d.w0;
import n6.d;
import s4.m;
import u4.l0;
@w0(19)
/* loaded from: classes.dex */
public final class b {
    @d

    /* renamed from: a  reason: collision with root package name */
    public static final b f10133a = new b();

    @u
    @m
    public static final void a(@d Animator animator, @d Animator.AnimatorPauseListener animatorPauseListener) {
        l0.p(animator, "animator");
        l0.p(animatorPauseListener, "listener");
        animator.addPauseListener(animatorPauseListener);
    }
}
