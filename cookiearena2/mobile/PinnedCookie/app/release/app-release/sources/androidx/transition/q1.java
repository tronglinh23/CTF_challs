package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
@d.w0(29)
/* loaded from: classes.dex */
public class q1 extends p1 {
    @Override // androidx.transition.h1, androidx.transition.r1
    public float c(@d.o0 View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // androidx.transition.l1, androidx.transition.r1
    public void e(@d.o0 View view, @d.q0 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.n1, androidx.transition.r1
    public void f(@d.o0 View view, int i7, int i8, int i9, int i10) {
        view.setLeftTopRightBottom(i7, i8, i9, i10);
    }

    @Override // androidx.transition.h1, androidx.transition.r1
    public void g(@d.o0 View view, float f7) {
        view.setTransitionAlpha(f7);
    }

    @Override // androidx.transition.p1, androidx.transition.r1
    public void h(@d.o0 View view, int i7) {
        view.setTransitionVisibility(i7);
    }

    @Override // androidx.transition.l1, androidx.transition.r1
    public void i(@d.o0 View view, @d.o0 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.l1, androidx.transition.r1
    public void j(@d.o0 View view, @d.o0 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
