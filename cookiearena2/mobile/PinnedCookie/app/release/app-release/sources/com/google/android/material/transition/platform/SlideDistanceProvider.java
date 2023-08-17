package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.u1;
import com.google.android.material.R;
import d.b1;
import d.o0;
import d.q0;
import d.u0;
import d.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@w0(21)
/* loaded from: classes.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    @u0
    private int slideDistance = -1;
    private int slideEdge;

    @b1({b1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i7) {
        this.slideEdge = i7;
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i7, @u0 int i8) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i7 != 3) {
            if (i7 != 5) {
                if (i7 != 48) {
                    if (i7 != 80) {
                        if (i7 == 8388611) {
                            return createTranslationXAnimator(view2, isRtl(view) ? i8 + translationX : translationX - i8, translationX, translationX);
                        } else if (i7 == 8388613) {
                            return createTranslationXAnimator(view2, isRtl(view) ? translationX - i8 : i8 + translationX, translationX, translationX);
                        } else {
                            throw new IllegalArgumentException("Invalid slide direction: " + i7);
                        }
                    }
                    return createTranslationYAnimator(view2, i8 + translationY, translationY, translationY);
                }
                return createTranslationYAnimator(view2, translationY - i8, translationY, translationY);
            }
            return createTranslationXAnimator(view2, translationX - i8, translationX, translationX);
        }
        return createTranslationXAnimator(view2, i8 + translationX, translationX, translationX);
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i7, @u0 int i8) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i7 != 3) {
            if (i7 != 5) {
                if (i7 != 48) {
                    if (i7 != 80) {
                        if (i7 == 8388611) {
                            return createTranslationXAnimator(view2, translationX, isRtl(view) ? translationX - i8 : i8 + translationX, translationX);
                        } else if (i7 == 8388613) {
                            return createTranslationXAnimator(view2, translationX, isRtl(view) ? i8 + translationX : translationX - i8, translationX);
                        } else {
                            throw new IllegalArgumentException("Invalid slide direction: " + i7);
                        }
                    }
                    return createTranslationYAnimator(view2, translationY, translationY - i8, translationY);
                }
                return createTranslationYAnimator(view2, translationY, i8 + translationY, translationY);
            }
            return createTranslationXAnimator(view2, translationX, i8 + translationX, translationX);
        }
        return createTranslationXAnimator(view2, translationX, translationX - i8, translationX);
    }

    private static Animator createTranslationXAnimator(final View view, float f7, float f8, final float f9) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f7, f8));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f9);
            }
        });
        return ofPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(final View view, float f7, float f8, final float f9) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f7, f8));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f9);
            }
        });
        return ofPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i7 = this.slideDistance;
        return i7 != -1 ? i7 : context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean isRtl(View view) {
        return u1.Z(view) == 1;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @q0
    public Animator createAppear(@o0 ViewGroup viewGroup, @o0 View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @q0
    public Animator createDisappear(@o0 ViewGroup viewGroup, @o0 View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @u0
    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(@u0 int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.slideDistance = i7;
    }

    public void setSlideEdge(int i7) {
        this.slideEdge = i7;
    }
}
