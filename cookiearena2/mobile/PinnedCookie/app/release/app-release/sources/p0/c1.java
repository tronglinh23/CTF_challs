package p0;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;
/* loaded from: classes.dex */
public final class c1 {

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static float[] a(Path path, float f7) {
            return path.approximate(f7);
        }
    }

    @d.o0
    @d.w0(26)
    public static Collection<b1> a(@d.o0 Path path) {
        return b(path, 0.5f);
    }

    @d.o0
    @d.w0(26)
    public static Collection<b1> b(@d.o0 Path path, @d.x(from = 0.0d) float f7) {
        float[] a7 = a.a(path, f7);
        int length = a7.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 1; i7 < length; i7++) {
            int i8 = i7 * 3;
            int i9 = (i7 - 1) * 3;
            float f8 = a7[i8];
            float f9 = a7[i8 + 1];
            float f10 = a7[i8 + 2];
            float f11 = a7[i9];
            float f12 = a7[i9 + 1];
            float f13 = a7[i9 + 2];
            if (f8 != f11 && (f9 != f12 || f10 != f13)) {
                arrayList.add(new b1(new PointF(f12, f13), f11, new PointF(f9, f10), f8));
            }
        }
        return arrayList;
    }
}
