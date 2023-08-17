package g1;

import d.b1;
import java.io.PrintWriter;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class i0 {
    @b1({b1.a.LIBRARY_GROUP_PREFIX})

    /* renamed from: a  reason: collision with root package name */
    public static final int f10005a = 19;

    /* renamed from: b  reason: collision with root package name */
    public static final int f10006b = 60;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10007c = 3600;

    /* renamed from: d  reason: collision with root package name */
    public static final int f10008d = 86400;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f10009e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static char[] f10010f = new char[24];

    public static int a(int i7, int i8, boolean z6, int i9) {
        if (i7 > 99 || (z6 && i9 >= 3)) {
            return i8 + 3;
        }
        if (i7 > 9 || (z6 && i9 >= 2)) {
            return i8 + 2;
        }
        if (z6 || i7 > 0) {
            return i8 + 1;
        }
        return 0;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static void b(long j7, long j8, PrintWriter printWriter) {
        if (j7 == 0) {
            printWriter.print("--");
        } else {
            d(j7 - j8, printWriter, 0);
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static void c(long j7, PrintWriter printWriter) {
        d(j7, printWriter, 0);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static void d(long j7, PrintWriter printWriter, int i7) {
        synchronized (f10009e) {
            printWriter.print(new String(f10010f, 0, f(j7, i7)));
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static void e(long j7, StringBuilder sb) {
        synchronized (f10009e) {
            sb.append(f10010f, 0, f(j7, 0));
        }
    }

    public static int f(long j7, int i7) {
        char c7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j8 = j7;
        if (f10010f.length < i7) {
            f10010f = new char[i7];
        }
        char[] cArr = f10010f;
        int i13 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
        if (i13 == 0) {
            int i14 = i7 - 1;
            while (i14 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i13 > 0) {
            c7 = '+';
        } else {
            j8 = -j8;
            c7 = '-';
        }
        int i15 = (int) (j8 % 1000);
        int floor = (int) Math.floor(j8 / 1000);
        if (floor > 86400) {
            i8 = floor / f10008d;
            floor -= f10008d * i8;
        } else {
            i8 = 0;
        }
        if (floor > 3600) {
            i9 = floor / f10007c;
            floor -= i9 * f10007c;
        } else {
            i9 = 0;
        }
        if (floor > 60) {
            int i16 = floor / 60;
            i10 = floor - (i16 * 60);
            i11 = i16;
        } else {
            i10 = floor;
            i11 = 0;
        }
        if (i7 != 0) {
            int a7 = a(i8, 1, false, 0);
            int a8 = a7 + a(i9, 1, a7 > 0, 2);
            int a9 = a8 + a(i11, 1, a8 > 0, 2);
            int a10 = a9 + a(i10, 1, a9 > 0, 2);
            i12 = 0;
            for (int a11 = a10 + a(i15, 2, true, a10 > 0 ? 3 : 0) + 1; a11 < i7; a11++) {
                cArr[i12] = ' ';
                i12++;
            }
        } else {
            i12 = 0;
        }
        cArr[i12] = c7;
        int i17 = i12 + 1;
        boolean z6 = i7 != 0;
        int g7 = g(cArr, i8, 'd', i17, false, 0);
        int g8 = g(cArr, i9, 'h', g7, g7 != i17, z6 ? 2 : 0);
        int g9 = g(cArr, i11, 'm', g8, g8 != i17, z6 ? 2 : 0);
        int g10 = g(cArr, i10, 's', g9, g9 != i17, z6 ? 2 : 0);
        int g11 = g(cArr, i15, 'm', g10, true, (!z6 || g10 == i17) ? 0 : 3);
        cArr[g11] = 's';
        return g11 + 1;
    }

    public static int g(char[] cArr, int i7, char c7, int i8, boolean z6, int i9) {
        int i10;
        if (z6 || i7 > 0) {
            if ((!z6 || i9 < 3) && i7 <= 99) {
                i10 = i8;
            } else {
                int i11 = i7 / 100;
                cArr[i8] = (char) (i11 + 48);
                i10 = i8 + 1;
                i7 -= i11 * 100;
            }
            if ((z6 && i9 >= 2) || i7 > 9 || i8 != i10) {
                int i12 = i7 / 10;
                cArr[i10] = (char) (i12 + 48);
                i10++;
                i7 -= i12 * 10;
            }
            cArr[i10] = (char) (i7 + 48);
            int i13 = i10 + 1;
            cArr[i13] = c7;
            return i13 + 1;
        }
        return i8;
    }
}