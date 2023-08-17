package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public class a {

    /* renamed from: androidx.transition.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0067a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    public static void a(@d.o0 Animator animator, @d.o0 AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    public static void b(@d.o0 Animator animator) {
        animator.pause();
    }

    public static void c(@d.o0 Animator animator) {
        animator.resume();
    }
}
