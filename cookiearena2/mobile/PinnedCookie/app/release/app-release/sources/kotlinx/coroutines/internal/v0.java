package kotlinx.coroutines.internal;
/* loaded from: classes.dex */
public final /* synthetic */ class v0 {
    public static final int a(@n6.d String str, int i7, int i8, int i9) {
        return (int) t0.c(str, i7, i8, i9);
    }

    public static final long b(@n6.d String str, long j7, long j8, long j9) {
        String d7 = t0.d(str);
        if (d7 == null) {
            return j7;
        }
        Long a12 = i5.a0.a1(d7);
        if (a12 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d7 + '\'').toString());
        }
        long longValue = a12.longValue();
        boolean z6 = false;
        if (j8 <= longValue && longValue <= j9) {
            z6 = true;
        }
        if (z6) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j8 + ".." + j9 + ", but is '" + longValue + '\'').toString());
    }

    public static final boolean c(@n6.d String str, boolean z6) {
        String d7 = t0.d(str);
        return d7 != null ? Boolean.parseBoolean(d7) : z6;
    }

    public static /* synthetic */ int d(String str, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i8 = 1;
        }
        if ((i10 & 8) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        return t0.b(str, i7, i8, i9);
    }

    public static /* synthetic */ long e(String str, long j7, long j8, long j9, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j8 = 1;
        }
        long j10 = j8;
        if ((i7 & 8) != 0) {
            j9 = Long.MAX_VALUE;
        }
        return t0.c(str, j7, j10, j9);
    }
}
