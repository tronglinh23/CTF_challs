package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.n1;
import x1.a;
/* loaded from: classes.dex */
public class s {
    @d.a
    public static int a(Fragment fragment, boolean z6, boolean z7) {
        return z7 ? z6 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z6 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    @SuppressLint({"ResourceType"})
    public static a b(@d.o0 Context context, @d.o0 Fragment fragment, boolean z6, boolean z7) {
        int nextTransition = fragment.getNextTransition();
        int a7 = a(fragment, z6, z7);
        boolean z8 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(a.c.f18266c) != null) {
            fragment.mContainer.setTag(a.c.f18266c, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z6, a7);
            if (onCreateAnimation != null) {
                return new a(onCreateAnimation);
            }
            Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z6, a7);
            if (onCreateAnimator != null) {
                return new a(onCreateAnimator);
            }
            if (a7 == 0 && nextTransition != 0) {
                a7 = d(context, nextTransition, z6);
            }
            if (a7 != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(a7));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, a7);
                        if (loadAnimation != null) {
                            return new a(loadAnimation);
                        }
                        z8 = true;
                    } catch (Resources.NotFoundException e7) {
                        throw e7;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z8) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, a7);
                        if (loadAnimator != null) {
                            return new a(loadAnimator);
                        }
                    } catch (RuntimeException e8) {
                        if (equals) {
                            throw e8;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a7);
                        if (loadAnimation2 != null) {
                            return new a(loadAnimation2);
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    @d.a
    public static int c(@d.o0 Context context, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i7});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @d.a
    public static int d(@d.o0 Context context, int i7, boolean z6) {
        if (i7 == 4097) {
            return z6 ? a.b.f18262e : a.b.f18263f;
        } else if (i7 == 8194) {
            return z6 ? a.b.f18258a : a.b.f18259b;
        } else if (i7 == 8197) {
            return z6 ? c(context, 16842938) : c(context, 16842939);
        } else if (i7 == 4099) {
            return z6 ? a.b.f18260c : a.b.f18261d;
        } else if (i7 != 4100) {
            return -1;
        } else {
            return z6 ? c(context, 16842936) : c(context, 16842937);
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f4493a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f4494b;

        public a(Animation animation) {
            this.f4493a = animation;
            this.f4494b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f4493a = null;
            this.f4494b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final ViewGroup f4495k;

        /* renamed from: l  reason: collision with root package name */
        public final View f4496l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f4497m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f4498n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f4499o;

        public b(@d.o0 Animation animation, @d.o0 ViewGroup viewGroup, @d.o0 View view) {
            super(false);
            this.f4499o = true;
            this.f4495k = viewGroup;
            this.f4496l = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j7, @d.o0 Transformation transformation) {
            this.f4499o = true;
            if (this.f4497m) {
                return !this.f4498n;
            }
            if (!super.getTransformation(j7, transformation)) {
                this.f4497m = true;
                n1.a(this.f4495k, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4497m || !this.f4499o) {
                this.f4495k.endViewTransition(this.f4496l);
                this.f4498n = true;
                return;
            }
            this.f4499o = false;
            this.f4495k.post(this);
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j7, @d.o0 Transformation transformation, float f7) {
            this.f4499o = true;
            if (this.f4497m) {
                return !this.f4498n;
            }
            if (!super.getTransformation(j7, transformation, f7)) {
                this.f4497m = true;
                n1.a(this.f4495k, this);
            }
            return true;
        }
    }
}
