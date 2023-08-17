package i0;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class r {

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static <T> T a(Dialog dialog, int i7) {
            View requireViewById;
            requireViewById = dialog.requireViewById(i7);
            return (T) requireViewById;
        }
    }

    @d.o0
    public static View a(@d.o0 Dialog dialog, int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) a.a(dialog, i7);
        }
        View findViewById = dialog.findViewById(i7);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}