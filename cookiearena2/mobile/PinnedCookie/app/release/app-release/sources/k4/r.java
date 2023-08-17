package k4;

import v3.a1;
import v3.b2;
import v3.g1;
import v3.x1;
/* loaded from: classes.dex */
public final class r {
    public static final int a(int i7, int i8, int i9) {
        int remainderUnsigned = Integer.remainderUnsigned(i7, i9);
        int remainderUnsigned2 = Integer.remainderUnsigned(i8, i9);
        int compareUnsigned = Integer.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        int l7 = x1.l(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? l7 : x1.l(l7 + i9);
    }

    public static final long b(long j7, long j8, long j9) {
        long remainderUnsigned = Long.remainderUnsigned(j7, j9);
        long remainderUnsigned2 = Long.remainderUnsigned(j8, j9);
        int compareUnsigned = Long.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        long l7 = b2.l(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? l7 : b2.l(l7 + j9);
    }

    @g1(version = "1.3")
    @a1
    public static final long c(long j7, long j8, long j9) {
        int i7 = (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1));
        if (i7 > 0) {
            return Long.compareUnsigned(j7, j8) >= 0 ? j8 : b2.l(j8 - b(j8, j7, b2.l(j9)));
        } else if (i7 < 0) {
            return Long.compareUnsigned(j7, j8) <= 0 ? j8 : b2.l(j8 + b(j7, j8, b2.l(-j9)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @g1(version = "1.3")
    @a1
    public static final int d(int i7, int i8, int i9) {
        if (i9 > 0) {
            return Integer.compareUnsigned(i7, i8) >= 0 ? i8 : x1.l(i8 - a(i8, i7, x1.l(i9)));
        } else if (i9 < 0) {
            return Integer.compareUnsigned(i7, i8) <= 0 ? i8 : x1.l(i8 + a(i7, i8, x1.l(-i9)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
