package q0;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import d.w0;
import u4.l0;

/* loaded from: classes.dex */
public final class b {
    @n6.d
    public static final ColorDrawable a(@d.l int i7) {
        return new ColorDrawable(i7);
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @w0(26)
    public static final ColorDrawable b(@n6.d Color color) {
        l0.p(color, "<this>");
        return new ColorDrawable(color.toArgb());
    }
}