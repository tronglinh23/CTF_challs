package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import d.b1;
import d.o0;
import java.util.List;

@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class AnimatorSetCompat {
    public static void playTogether(@o0 AnimatorSet animatorSet, @o0 List<Animator> list) {
        int size = list.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Animator animator = list.get(i7);
            j7 = Math.max(j7, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j7);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}