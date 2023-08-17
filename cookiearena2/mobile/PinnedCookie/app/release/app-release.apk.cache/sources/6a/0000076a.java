package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

@d.w0(23)
/* loaded from: classes.dex */
public class p1 extends n1 {

    /* renamed from: m  reason: collision with root package name */
    public static boolean f6746m = true;

    @Override // androidx.transition.r1
    @SuppressLint({"NewApi"})
    public void h(@d.o0 View view, int i7) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i7);
        } else if (f6746m) {
            try {
                view.setTransitionVisibility(i7);
            } catch (NoSuchMethodError unused) {
                f6746m = false;
            }
        }
    }
}