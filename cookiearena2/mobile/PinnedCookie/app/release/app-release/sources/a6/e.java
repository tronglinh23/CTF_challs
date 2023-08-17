package a6;

import i5.b0;
import i6.p;
import u4.l0;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final int f281b = 16384;

    /* renamed from: c  reason: collision with root package name */
    public static final int f282c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f283d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f284e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f285f = 3;

    /* renamed from: g  reason: collision with root package name */
    public static final int f286g = 4;

    /* renamed from: h  reason: collision with root package name */
    public static final int f287h = 5;

    /* renamed from: i  reason: collision with root package name */
    public static final int f288i = 6;

    /* renamed from: j  reason: collision with root package name */
    public static final int f289j = 7;

    /* renamed from: k  reason: collision with root package name */
    public static final int f290k = 8;

    /* renamed from: l  reason: collision with root package name */
    public static final int f291l = 9;

    /* renamed from: m  reason: collision with root package name */
    public static final int f292m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f293n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f294o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f295p = 4;

    /* renamed from: q  reason: collision with root package name */
    public static final int f296q = 4;

    /* renamed from: r  reason: collision with root package name */
    public static final int f297r = 8;

    /* renamed from: s  reason: collision with root package name */
    public static final int f298s = 32;

    /* renamed from: t  reason: collision with root package name */
    public static final int f299t = 32;

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f302w;

    /* renamed from: x  reason: collision with root package name */
    public static final e f303x = new e();
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public static final p f280a = p.f11252p.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: u  reason: collision with root package name */
    public static final String[] f300u = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: v  reason: collision with root package name */
    public static final String[] f301v = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i7 = 0; i7 < 256; i7++) {
            String binaryString = Integer.toBinaryString(i7);
            l0.o(binaryString, "Integer.toBinaryString(it)");
            strArr[i7] = b0.k2(s5.d.v("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f302w = strArr;
        String[] strArr2 = f301v;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = l0.C("END_STREAM", "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = iArr2[i8];
            int i10 = iArr[0];
            String[] strArr3 = f301v;
            int i11 = i10 | i9;
            strArr3[i11] = strArr3[i10] + "|" + strArr3[i9];
            strArr3[i11 | 8] = strArr3[i10] + "|" + strArr3[i9] + "|PADDED";
        }
        int length = f301v.length;
        for (int i12 = 0; i12 < length; i12++) {
            String[] strArr4 = f301v;
            if (strArr4[i12] == null) {
                strArr4[i12] = f302w[i12];
            }
        }
    }

    @n6.d
    public final String a(int i7, int i8) {
        String str;
        if (i8 == 0) {
            return "";
        }
        if (i7 != 2 && i7 != 3) {
            if (i7 == 4 || i7 == 6) {
                return i8 == 1 ? "ACK" : f302w[i8];
            } else if (i7 != 7 && i7 != 8) {
                String[] strArr = f301v;
                if (i8 < strArr.length) {
                    str = strArr[i8];
                    l0.m(str);
                } else {
                    str = f302w[i8];
                }
                String str2 = str;
                return (i7 != 5 || (i8 & 4) == 0) ? (i7 != 0 || (i8 & 32) == 0) ? str2 : b0.l2(str2, "PRIORITY", "COMPRESSED", false, 4, null) : b0.l2(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f302w[i8];
    }

    @n6.d
    public final String b(int i7) {
        String[] strArr = f300u;
        return i7 < strArr.length ? strArr[i7] : s5.d.v("0x%02x", Integer.valueOf(i7));
    }

    @n6.d
    public final String c(boolean z6, int i7, int i8, int i9, int i10) {
        return s5.d.v("%s 0x%08x %5d %-13s %s", z6 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i8), b(i9), a(i9, i10));
    }
}
