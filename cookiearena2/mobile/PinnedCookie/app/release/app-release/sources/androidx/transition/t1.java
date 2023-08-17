package androidx.transition;

import android.view.View;
/* loaded from: classes.dex */
public abstract class t1 extends n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6810a = "android:visibilityPropagation:visibility";

    /* renamed from: b  reason: collision with root package name */
    public static final String f6811b = "android:visibilityPropagation:center";

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f6812c = {f6810a, f6811b};

    public static int d(r0 r0Var, int i7) {
        int[] iArr;
        if (r0Var == null || (iArr = (int[]) r0Var.f6756a.get(f6811b)) == null) {
            return -1;
        }
        return iArr[i7];
    }

    @Override // androidx.transition.n0
    public void a(r0 r0Var) {
        View view = r0Var.f6757b;
        Integer num = (Integer) r0Var.f6756a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        r0Var.f6756a.put(f6810a, num);
        view.getLocationOnScreen(r2);
        int round = r2[0] + Math.round(view.getTranslationX());
        int[] iArr = {round};
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        r0Var.f6756a.put(f6811b, iArr);
    }

    @Override // androidx.transition.n0
    public String[] b() {
        return f6812c;
    }

    public int e(r0 r0Var) {
        Integer num;
        if (r0Var == null || (num = (Integer) r0Var.f6756a.get(f6810a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(r0 r0Var) {
        return d(r0Var, 0);
    }

    public int g(r0 r0Var) {
        return d(r0Var, 1);
    }
}
