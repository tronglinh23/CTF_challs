package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class l extends t1 {

    /* renamed from: d  reason: collision with root package name */
    public float f6686d = 3.0f;

    public static float h(float f7, float f8, float f9, float f10) {
        float f11 = f9 - f7;
        float f12 = f10 - f8;
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    @Override // androidx.transition.n0
    public long c(ViewGroup viewGroup, j0 j0Var, r0 r0Var, r0 r0Var2) {
        int i7;
        int round;
        int i8;
        if (r0Var == null && r0Var2 == null) {
            return 0L;
        }
        if (r0Var2 == null || e(r0Var) == 0) {
            i7 = -1;
        } else {
            r0Var = r0Var2;
            i7 = 1;
        }
        int f7 = f(r0Var);
        int g7 = g(r0Var);
        Rect epicenter = j0Var.getEpicenter();
        if (epicenter != null) {
            i8 = epicenter.centerX();
            round = epicenter.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            round = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            i8 = round2;
        }
        float h7 = h(f7, g7, i8, round) / h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long duration = j0Var.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i7)) / this.f6686d) * h7);
    }

    public void i(float f7) {
        if (f7 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f6686d = f7;
    }
}