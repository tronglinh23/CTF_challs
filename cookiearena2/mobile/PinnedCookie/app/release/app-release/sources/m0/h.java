package m0;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public final class h {
    public static int[] a(int[] iArr, int i7, int i8) {
        if (i7 + 1 > iArr.length) {
            int[] iArr2 = new int[e(i7)];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            iArr = iArr2;
        }
        iArr[i7] = i8;
        return iArr;
    }

    public static long[] b(long[] jArr, int i7, long j7) {
        if (i7 + 1 > jArr.length) {
            long[] jArr2 = new long[e(i7)];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            jArr = jArr2;
        }
        jArr[i7] = j7;
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[], java.lang.Object] */
    public static <T> T[] c(T[] tArr, int i7, T t6) {
        if (i7 + 1 > tArr.length) {
            ?? r02 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), e(i7));
            System.arraycopy(tArr, 0, r02, 0, i7);
            tArr = r02;
        }
        tArr[i7] = t6;
        return tArr;
    }

    public static boolean[] d(boolean[] zArr, int i7, boolean z6) {
        if (i7 + 1 > zArr.length) {
            boolean[] zArr2 = new boolean[e(i7)];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            zArr = zArr2;
        }
        zArr[i7] = z6;
        return zArr;
    }

    public static int e(int i7) {
        if (i7 <= 4) {
            return 8;
        }
        return i7 * 2;
    }

    public static int[] f(int[] iArr, int i7, int i8, int i9) {
        if (i7 + 1 <= iArr.length) {
            System.arraycopy(iArr, i8, iArr, i8 + 1, i7 - i8);
            iArr[i8] = i9;
            return iArr;
        }
        int[] iArr2 = new int[e(i7)];
        System.arraycopy(iArr, 0, iArr2, 0, i8);
        iArr2[i8] = i9;
        System.arraycopy(iArr, i8, iArr2, i8 + 1, iArr.length - i8);
        return iArr2;
    }

    public static long[] g(long[] jArr, int i7, int i8, long j7) {
        if (i7 + 1 <= jArr.length) {
            System.arraycopy(jArr, i8, jArr, i8 + 1, i7 - i8);
            jArr[i8] = j7;
            return jArr;
        }
        long[] jArr2 = new long[e(i7)];
        System.arraycopy(jArr, 0, jArr2, 0, i8);
        jArr2[i8] = j7;
        System.arraycopy(jArr, i8, jArr2, i8 + 1, jArr.length - i8);
        return jArr2;
    }

    public static <T> T[] h(T[] tArr, int i7, int i8, T t6) {
        if (i7 + 1 <= tArr.length) {
            System.arraycopy(tArr, i8, tArr, i8 + 1, i7 - i8);
            tArr[i8] = t6;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), e(i7)));
        System.arraycopy(tArr, 0, tArr2, 0, i8);
        tArr2[i8] = t6;
        System.arraycopy(tArr, i8, tArr2, i8 + 1, tArr.length - i8);
        return tArr2;
    }

    public static boolean[] i(boolean[] zArr, int i7, int i8, boolean z6) {
        if (i7 + 1 <= zArr.length) {
            System.arraycopy(zArr, i8, zArr, i8 + 1, i7 - i8);
            zArr[i8] = z6;
            return zArr;
        }
        boolean[] zArr2 = new boolean[e(i7)];
        System.arraycopy(zArr, 0, zArr2, 0, i8);
        zArr2[i8] = z6;
        System.arraycopy(zArr, i8, zArr2, i8 + 1, zArr.length - i8);
        return zArr2;
    }
}
