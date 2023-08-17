package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class u {
    @d.q0
    public static q a(@d.o0 View view, @d.o0 ViewGroup viewGroup, @d.q0 Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? s.b(view, viewGroup, matrix) : t.b(view, viewGroup, matrix);
    }

    public static void b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            s.f(view);
        } else {
            t.f(view);
        }
    }
}
