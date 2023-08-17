package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
@d.w0(19)
/* loaded from: classes.dex */
public class h1 extends r1 {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f6594h = true;

    @Override // androidx.transition.r1
    public void a(@d.o0 View view) {
    }

    @Override // androidx.transition.r1
    @SuppressLint({"NewApi"})
    public float c(@d.o0 View view) {
        float transitionAlpha;
        if (f6594h) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f6594h = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.r1
    public void d(@d.o0 View view) {
    }

    @Override // androidx.transition.r1
    @SuppressLint({"NewApi"})
    public void g(@d.o0 View view, float f7) {
        if (f6594h) {
            try {
                view.setTransitionAlpha(f7);
                return;
            } catch (NoSuchMethodError unused) {
                f6594h = false;
            }
        }
        view.setAlpha(f7);
    }
}
