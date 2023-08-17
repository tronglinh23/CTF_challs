package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.d0;
/* loaded from: classes.dex */
public class m extends s1 {

    /* renamed from: l  reason: collision with root package name */
    public static final TimeInterpolator f6690l = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    public static final TimeInterpolator f6691m = new AccelerateInterpolator();

    /* renamed from: n  reason: collision with root package name */
    public static final String f6692n = "android:explode:screenBounds";

    /* renamed from: k  reason: collision with root package name */
    public int[] f6693k;

    public m() {
        this.f6693k = new int[2];
        setPropagation(new l());
    }

    public static float A(float f7, float f8) {
        return (float) Math.sqrt((f7 * f7) + (f8 * f8));
    }

    public static float B(View view, int i7, int i8) {
        return A(Math.max(i7, view.getWidth() - i7), Math.max(i8, view.getHeight() - i8));
    }

    private void captureValues(r0 r0Var) {
        View view = r0Var.f6757b;
        view.getLocationOnScreen(this.f6693k);
        int[] iArr = this.f6693k;
        int i7 = iArr[0];
        int i8 = iArr[1];
        r0Var.f6756a.put(f6692n, new Rect(i7, i8, view.getWidth() + i7, view.getHeight() + i8));
    }

    public final void C(View view, Rect rect, int[] iArr) {
        int centerY;
        int i7;
        view.getLocationOnScreen(this.f6693k);
        int[] iArr2 = this.f6693k;
        int i8 = iArr2[0];
        int i9 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            i7 = (view.getWidth() / 2) + i8 + Math.round(view.getTranslationX());
            centerY = (view.getHeight() / 2) + i9 + Math.round(view.getTranslationY());
        } else {
            int centerX = epicenter.centerX();
            centerY = epicenter.centerY();
            i7 = centerX;
        }
        float centerX2 = rect.centerX() - i7;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float A = A(centerX2, centerY2);
        float B = B(view, i7 - i8, centerY - i9);
        iArr[0] = Math.round((centerX2 / A) * B);
        iArr[1] = Math.round(B * (centerY2 / A));
    }

    @Override // androidx.transition.s1, androidx.transition.j0
    public void captureEndValues(@d.o0 r0 r0Var) {
        super.captureEndValues(r0Var);
        captureValues(r0Var);
    }

    @Override // androidx.transition.s1, androidx.transition.j0
    public void captureStartValues(@d.o0 r0 r0Var) {
        super.captureStartValues(r0Var);
        captureValues(r0Var);
    }

    @Override // androidx.transition.s1
    @d.q0
    public Animator onAppear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        if (r0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) r0Var2.f6756a.get(f6692n);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        C(viewGroup, rect, this.f6693k);
        int[] iArr = this.f6693k;
        return t0.a(view, r0Var2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f6690l, this);
    }

    @Override // androidx.transition.s1
    @d.q0
    public Animator onDisappear(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        float f7;
        float f8;
        if (r0Var == null) {
            return null;
        }
        Rect rect = (Rect) r0Var.f6756a.get(f6692n);
        int i7 = rect.left;
        int i8 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) r0Var.f6757b.getTag(d0.g.T1);
        if (iArr != null) {
            f7 = (r7 - rect.left) + translationX;
            f8 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f7 = translationX;
            f8 = translationY;
        }
        C(viewGroup, rect, this.f6693k);
        int[] iArr2 = this.f6693k;
        return t0.a(view, r0Var, i7, i8, translationX, translationY, f7 + iArr2[0], f8 + iArr2[1], f6691m, this);
    }

    public m(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6693k = new int[2];
        setPropagation(new l());
    }
}
