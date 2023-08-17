package k4;

import v3.a1;

/* loaded from: classes.dex */
public final class n {
    public static final int a(int i7, int i8, int i9) {
        return e(e(i7, i9) - e(i8, i9), i9);
    }

    public static final long b(long j7, long j8, long j9) {
        return f(f(j7, j9) - f(j8, j9), j9);
    }

    @a1
    public static final int c(int i7, int i8, int i9) {
        if (i9 > 0) {
            return i7 >= i8 ? i8 : i8 - a(i8, i7, i9);
        } else if (i9 < 0) {
            return i7 <= i8 ? i8 : i8 + a(i7, i8, -i9);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @a1
    public static final long d(long j7, long j8, long j9) {
        int i7 = (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1));
        if (i7 > 0) {
            return j7 >= j8 ? j8 : j8 - b(j8, j7, j9);
        } else if (i7 < 0) {
            return j7 <= j8 ? j8 : j8 + b(j7, j8, -j9);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final int e(int i7, int i8) {
        int i9 = i7 % i8;
        return i9 >= 0 ? i9 : i9 + i8;
    }

    public static final long f(long j7, long j8) {
        long j9 = j7 % j8;
        return j9 >= 0 ? j9 : j9 + j8;
    }
}