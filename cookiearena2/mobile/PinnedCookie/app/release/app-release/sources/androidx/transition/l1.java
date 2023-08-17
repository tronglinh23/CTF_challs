package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
@d.w0(21)
/* loaded from: classes.dex */
public class l1 extends h1 {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f6687i = true;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f6688j = true;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f6689k = true;

    @Override // androidx.transition.r1
    @SuppressLint({"NewApi"})
    public void e(@d.o0 View view, @d.q0 Matrix matrix) {
        if (f6687i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f6687i = false;
            }
        }
    }

    @Override // androidx.transition.r1
    @SuppressLint({"NewApi"})
    public void i(@d.o0 View view, @d.o0 Matrix matrix) {
        if (f6688j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6688j = false;
            }
        }
    }

    @Override // androidx.transition.r1
    @SuppressLint({"NewApi"})
    public void j(@d.o0 View view, @d.o0 Matrix matrix) {
        if (f6689k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6689k = false;
            }
        }
    }
}
