package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
@d.w0(22)
/* loaded from: classes.dex */
public class n1 extends l1 {

    /* renamed from: l  reason: collision with root package name */
    public static boolean f6712l = true;

    @Override // androidx.transition.r1
    @SuppressLint({"NewApi"})
    public void f(@d.o0 View view, int i7, int i8, int i9, int i10) {
        if (f6712l) {
            try {
                view.setLeftTopRightBottom(i7, i8, i9, i10);
            } catch (NoSuchMethodError unused) {
                f6712l = false;
            }
        }
    }
}
