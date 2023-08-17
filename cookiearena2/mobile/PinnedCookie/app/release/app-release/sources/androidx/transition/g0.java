package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class g0 extends t1 {

    /* renamed from: d  reason: collision with root package name */
    public float f6576d = 3.0f;

    /* renamed from: e  reason: collision with root package name */
    public int f6577e = 80;

    @Override // androidx.transition.n0
    public long c(ViewGroup viewGroup, j0 j0Var, r0 r0Var, r0 r0Var2) {
        int i7;
        int i8;
        int i9;
        r0 r0Var3 = r0Var;
        if (r0Var3 == null && r0Var2 == null) {
            return 0L;
        }
        Rect epicenter = j0Var.getEpicenter();
        if (r0Var2 == null || e(r0Var3) == 0) {
            i7 = -1;
        } else {
            r0Var3 = r0Var2;
            i7 = 1;
        }
        int f7 = f(r0Var3);
        int g7 = g(r0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (epicenter != null) {
            i8 = epicenter.centerX();
            i9 = epicenter.centerY();
        } else {
            i8 = (round + width) / 2;
            i9 = (round2 + height) / 2;
        }
        float h7 = h(viewGroup, f7, g7, i8, i9, round, round2, width, height) / i(viewGroup);
        long duration = j0Var.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i7)) / this.f6576d) * h7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        if ((androidx.core.view.u1.Z(r7) == 1) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if ((androidx.core.view.u1.Z(r7) == 1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.f6577e
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 5
            r3 = 3
            r4 = 0
            r5 = 1
            if (r0 != r1) goto L19
            int r7 = androidx.core.view.u1.Z(r7)
            if (r7 != r5) goto L12
            goto L13
        L12:
            r5 = r4
        L13:
            if (r5 == 0) goto L17
        L15:
            r0 = r2
            goto L29
        L17:
            r0 = r3
            goto L29
        L19:
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L29
            int r7 = androidx.core.view.u1.Z(r7)
            if (r7 != r5) goto L25
            goto L26
        L25:
            r5 = r4
        L26:
            if (r5 == 0) goto L15
            goto L17
        L29:
            if (r0 == r3) goto L51
            if (r0 == r2) goto L48
            r7 = 48
            if (r0 == r7) goto L3f
            r7 = 80
            if (r0 == r7) goto L36
            goto L59
        L36:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r4 = r9 + r7
            goto L59
        L3f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r4 = r15 + r7
            goto L59
        L48:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r4 = r8 + r7
            goto L59
        L51:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r4 = r14 + r7
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.g0.h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    public final int i(ViewGroup viewGroup) {
        int i7 = this.f6577e;
        return (i7 == 3 || i7 == 5 || i7 == 8388611 || i7 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    public void j(float f7) {
        if (f7 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f6576d = f7;
    }

    public void k(int i7) {
        this.f6577e = i7;
    }
}
