package androidx.collection;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1940a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f1941b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f1942c = new Object[0];

    public static int a(int[] iArr, int i7, int i8) {
        int i9 = i7 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else if (i12 <= i8) {
                return i11;
            } else {
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static int b(long[] jArr, int i7, long j7) {
        int i8 = i7 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int i11 = (jArr[i10] > j7 ? 1 : (jArr[i10] == j7 ? 0 : -1));
            if (i11 < 0) {
                i9 = i10 + 1;
            } else if (i11 <= 0) {
                return i10;
            } else {
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int d(int i7) {
        for (int i8 = 4; i8 < 32; i8++) {
            int i9 = (1 << i8) - 12;
            if (i7 <= i9) {
                return i9;
            }
        }
        return i7;
    }

    public static int e(int i7) {
        return d(i7 * 4) / 4;
    }

    public static int f(int i7) {
        return d(i7 * 8) / 8;
    }
}