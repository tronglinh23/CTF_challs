package p0;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
/* loaded from: classes.dex */
public final class f1 {
    @n6.d
    public static final PorterDuffColorFilter a(@n6.d PorterDuff.Mode mode, int i7) {
        u4.l0.p(mode, "<this>");
        return new PorterDuffColorFilter(i7, mode);
    }

    @n6.d
    public static final PorterDuffXfermode b(@n6.d PorterDuff.Mode mode) {
        u4.l0.p(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}
