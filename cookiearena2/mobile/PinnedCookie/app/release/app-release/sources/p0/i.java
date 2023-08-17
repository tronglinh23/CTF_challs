package p0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import p0.k;
/* loaded from: classes.dex */
public class i {

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static ColorFilter a(int i7, Object obj) {
            h.a();
            return g.a(i7, f.a(obj));
        }
    }

    @d.q0
    public static ColorFilter a(int i7, @d.o0 j jVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a7 = k.b.a(jVar);
            if (a7 != null) {
                return a.a(i7, a7);
            }
            return null;
        }
        PorterDuff.Mode a8 = k.a(jVar);
        if (a8 != null) {
            return new PorterDuffColorFilter(i7, a8);
        }
        return null;
    }
}
