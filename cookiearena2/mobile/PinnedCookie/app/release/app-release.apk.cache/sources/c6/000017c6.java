package o4;

import u4.r1;
import v3.g1;
import x3.o;

@r1({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,647:1\n13654#2,3:648\n13654#2,3:651\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n582#1:648,3\n601#1:651,3\n*E\n"})
/* loaded from: classes.dex */
public final class c {
    @n6.d

    /* renamed from: a */
    public static final byte[] f14409a;
    @n6.d

    /* renamed from: b */
    public static final int[] f14410b;
    @n6.d

    /* renamed from: c */
    public static final byte[] f14411c;
    @n6.d

    /* renamed from: d */
    public static final int[] f14412d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f14409a = bArr;
        int[] iArr = new int[256];
        int i7 = 0;
        o.u2(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            iArr[bArr[i8]] = i9;
            i8++;
            i9++;
        }
        f14410b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f14411c = bArr2;
        int[] iArr2 = new int[256];
        o.u2(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i10 = 0;
        while (i7 < length2) {
            iArr2[bArr2[i7]] = i10;
            i7++;
            i10++;
        }
        f14412d = iArr2;
    }

    public static final /* synthetic */ int[] a() {
        return f14410b;
    }

    public static final /* synthetic */ byte[] b() {
        return f14409a;
    }

    public static final /* synthetic */ int[] c() {
        return f14412d;
    }

    public static final /* synthetic */ byte[] d() {
        return f14411c;
    }

    @f
    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }

    @f
    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void h() {
    }

    @g1(version = "1.8")
    @f
    public static final boolean i(int i7) {
        return (i7 >= 0 && i7 < f14410b.length) && f14410b[i7] != -1;
    }
}