package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.a;
import androidx.transition.d0;
import androidx.transition.j0;
import d.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public abstract class s1 extends j0 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    /* loaded from: classes.dex */
    public class a extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f6778a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f6779b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f6780c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f6778a = viewGroup;
            this.f6779b = view;
            this.f6780c = view2;
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionEnd(@d.o0 j0 j0Var) {
            this.f6780c.setTag(d0.g.Z0, null);
            z0.b(this.f6778a).remove(this.f6779b);
            j0Var.removeListener(this);
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionPause(@d.o0 j0 j0Var) {
            z0.b(this.f6778a).remove(this.f6779b);
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionResume(@d.o0 j0 j0Var) {
            if (this.f6779b.getParent() == null) {
                z0.b(this.f6778a).add(this.f6779b);
            } else {
                s1.this.cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements j0.h, a.InterfaceC0067a {

        /* renamed from: a  reason: collision with root package name */
        public final View f6782a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6783b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f6784c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f6785d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6786e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6787f = false;

        public b(View view, int i7, boolean z6) {
            this.f6782a = view;
            this.f6783b = i7;
            this.f6784c = (ViewGroup) view.getParent();
            this.f6785d = z6;
            b(true);
        }

        public final void a() {
            if (!this.f6787f) {
                e1.i(this.f6782a, this.f6783b);
                ViewGroup viewGroup = this.f6784c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        public final void b(boolean z6) {
            ViewGroup viewGroup;
            if (!this.f6785d || this.f6786e == z6 || (viewGroup = this.f6784c) == null) {
                return;
            }
            this.f6786e = z6;
            z0.d(viewGroup, z6);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6787f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0067a
        public void onAnimationPause(Animator animator) {
            if (this.f6787f) {
                return;
            }
            e1.i(this.f6782a, this.f6783b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0067a
        public void onAnimationResume(Animator animator) {
            if (this.f6787f) {
                return;
            }
            e1.i(this.f6782a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.j0.h
        public void onTransitionCancel(@d.o0 j0 j0Var) {
        }

        @Override // androidx.transition.j0.h
        public void onTransitionEnd(@d.o0 j0 j0Var) {
            a();
            j0Var.removeListener(this);
        }

        @Override // androidx.transition.j0.h
        public void onTransitionPause(@d.o0 j0 j0Var) {
            b(false);
        }

        @Override // androidx.transition.j0.h
        public void onTransitionResume(@d.o0 j0 j0Var) {
            b(true);
        }

        @Override // androidx.transition.j0.h
        public void onTransitionStart(@d.o0 j0 j0Var) {
        }
    }

    @SuppressLint({"UniqueConstants"})
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6788a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6789b;

        /* renamed from: c  reason: collision with root package name */
        public int f6790c;

        /* renamed from: d  reason: collision with root package name */
        public int f6791d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f6792e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f6793f;
    }

    public s1() {
        this.mMode = 3;
    }

    @Override // androidx.transition.j0
    public void captureEndValues(@d.o0 r0 r0Var) {
        captureValues(r0Var);
    }

    @Override // androidx.transition.j0
    public void captureStartValues(@d.o0 r0 r0Var) {
        captureValues(r0Var);
    }

    public final void captureValues(r0 r0Var) {
        r0Var.f6756a.put(PROPNAME_VISIBILITY, Integer.valueOf(r0Var.f6757b.getVisibility()));
        r0Var.f6756a.put(PROPNAME_PARENT, r0Var.f6757b.getParent());
        int[] iArr = new int[2];
        r0Var.f6757b.getLocationOnScreen(iArr);
        r0Var.f6756a.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // androidx.transition.j0
    @d.q0
    public Animator createAnimator(@d.o0 ViewGroup viewGroup, @d.q0 r0 r0Var, @d.q0 r0 r0Var2) {
        d z6 = z(r0Var, r0Var2);
        if (z6.f6788a) {
            if (z6.f6792e == null && z6.f6793f == null) {
                return null;
            }
            return z6.f6789b ? onAppear(viewGroup, r0Var, z6.f6790c, r0Var2, z6.f6791d) : onDisappear(viewGroup, r0Var, z6.f6790c, r0Var2, z6.f6791d);
        }
        return null;
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.j0
    @d.q0
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.j0
    public boolean isTransitionRequired(@d.q0 r0 r0Var, @d.q0 r0 r0Var2) {
        if (r0Var == null && r0Var2 == null) {
            return false;
        }
        if (r0Var == null || r0Var2 == null || r0Var2.f6756a.containsKey(PROPNAME_VISIBILITY) == r0Var.f6756a.containsKey(PROPNAME_VISIBILITY)) {
            d z6 = z(r0Var, r0Var2);
            if (z6.f6788a) {
                return z6.f6790c == 0 || z6.f6791d == 0;
            }
            return false;
        }
        return false;
    }

    public boolean isVisible(r0 r0Var) {
        if (r0Var == null) {
            return false;
        }
        return ((Integer) r0Var.f6756a.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) r0Var.f6756a.get(PROPNAME_PARENT)) != null;
    }

    @d.q0
    public Animator onAppear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return null;
    }

    @d.q0
    public Animator onDisappear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return null;
    }

    public void setMode(int i7) {
        if ((i7 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i7;
    }

    public final d z(r0 r0Var, r0 r0Var2) {
        d dVar = new d();
        dVar.f6788a = false;
        dVar.f6789b = false;
        if (r0Var == null || !r0Var.f6756a.containsKey(PROPNAME_VISIBILITY)) {
            dVar.f6790c = -1;
            dVar.f6792e = null;
        } else {
            dVar.f6790c = ((Integer) r0Var.f6756a.get(PROPNAME_VISIBILITY)).intValue();
            dVar.f6792e = (ViewGroup) r0Var.f6756a.get(PROPNAME_PARENT);
        }
        if (r0Var2 == null || !r0Var2.f6756a.containsKey(PROPNAME_VISIBILITY)) {
            dVar.f6791d = -1;
            dVar.f6793f = null;
        } else {
            dVar.f6791d = ((Integer) r0Var2.f6756a.get(PROPNAME_VISIBILITY)).intValue();
            dVar.f6793f = (ViewGroup) r0Var2.f6756a.get(PROPNAME_PARENT);
        }
        if (r0Var != null && r0Var2 != null) {
            int i7 = dVar.f6790c;
            int i8 = dVar.f6791d;
            if (i7 == i8 && dVar.f6792e == dVar.f6793f) {
                return dVar;
            }
            if (i7 != i8) {
                if (i7 == 0) {
                    dVar.f6789b = false;
                    dVar.f6788a = true;
                } else if (i8 == 0) {
                    dVar.f6789b = true;
                    dVar.f6788a = true;
                }
            } else if (dVar.f6793f == null) {
                dVar.f6789b = false;
                dVar.f6788a = true;
            } else if (dVar.f6792e == null) {
                dVar.f6789b = true;
                dVar.f6788a = true;
            }
        } else if (r0Var == null && dVar.f6791d == 0) {
            dVar.f6789b = true;
            dVar.f6788a = true;
        } else if (r0Var2 == null && dVar.f6790c == 0) {
            dVar.f6789b = false;
            dVar.f6788a = true;
        }
        return dVar;
    }

    @d.q0
    public Animator onAppear(ViewGroup viewGroup, r0 r0Var, int i7, r0 r0Var2, int i8) {
        if ((this.mMode & 1) != 1 || r0Var2 == null) {
            return null;
        }
        if (r0Var == null) {
            View view = (View) r0Var2.f6757b.getParent();
            if (z(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f6788a) {
                return null;
            }
        }
        return onAppear(viewGroup, r0Var2.f6757b, r0Var, r0Var2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
        if (r10.mCanRemoveViews != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    @d.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r11, androidx.transition.r0 r12, int r13, androidx.transition.r0 r14, int r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.s1.onDisappear(android.view.ViewGroup, androidx.transition.r0, int, androidx.transition.r0, int):android.animation.Animator");
    }

    @SuppressLint({"RestrictedApi"})
    public s1(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f6605e);
        int k7 = m0.p.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k7 != 0) {
            setMode(k7);
        }
    }
}
