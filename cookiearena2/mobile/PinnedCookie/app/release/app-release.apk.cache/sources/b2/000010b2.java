package h6;

import i0.x2;
import i6.m;
import i6.p;
import u4.l0;

/* loaded from: classes.dex */
public final class g {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final String f10396a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* renamed from: b  reason: collision with root package name */
    public static final int f10397b = 128;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10398c = 64;

    /* renamed from: d  reason: collision with root package name */
    public static final int f10399d = 32;

    /* renamed from: e  reason: collision with root package name */
    public static final int f10400e = 16;

    /* renamed from: f  reason: collision with root package name */
    public static final int f10401f = 15;

    /* renamed from: g  reason: collision with root package name */
    public static final int f10402g = 8;

    /* renamed from: h  reason: collision with root package name */
    public static final int f10403h = 128;

    /* renamed from: i  reason: collision with root package name */
    public static final int f10404i = 127;

    /* renamed from: j  reason: collision with root package name */
    public static final int f10405j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f10406k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f10407l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final int f10408m = 8;

    /* renamed from: n  reason: collision with root package name */
    public static final int f10409n = 9;

    /* renamed from: o  reason: collision with root package name */
    public static final int f10410o = 10;

    /* renamed from: p  reason: collision with root package name */
    public static final long f10411p = 125;

    /* renamed from: q  reason: collision with root package name */
    public static final long f10412q = 123;

    /* renamed from: r  reason: collision with root package name */
    public static final int f10413r = 126;

    /* renamed from: s  reason: collision with root package name */
    public static final long f10414s = 65535;

    /* renamed from: t  reason: collision with root package name */
    public static final int f10415t = 127;

    /* renamed from: u  reason: collision with root package name */
    public static final int f10416u = 1001;

    /* renamed from: v  reason: collision with root package name */
    public static final int f10417v = 1005;

    /* renamed from: w  reason: collision with root package name */
    public static final g f10418w = new g();

    @n6.d
    public final String a(@n6.d String str) {
        l0.p(str, x2.f10960j);
        return p.f11252p.l(str + f10396a).Z().h();
    }

    @n6.e
    public final String b(int i7) {
        if (i7 < 1000 || i7 >= 5000) {
            return "Code must be in range [1000,5000): " + i7;
        } else if ((1004 > i7 || 1006 < i7) && (1015 > i7 || 2999 < i7)) {
            return null;
        } else {
            return "Code " + i7 + " is reserved and may not be used.";
        }
    }

    public final void c(@n6.d m.a aVar, @n6.d byte[] bArr) {
        l0.p(aVar, "cursor");
        l0.p(bArr, x2.f10960j);
        int length = bArr.length;
        int i7 = 0;
        do {
            byte[] bArr2 = aVar.f11244o;
            int i8 = aVar.f11245p;
            int i9 = aVar.f11246q;
            if (bArr2 != null) {
                while (i8 < i9) {
                    int i10 = i7 % length;
                    bArr2[i8] = (byte) (bArr2[i8] ^ bArr[i10]);
                    i8++;
                    i7 = i10 + 1;
                }
            }
        } while (aVar.b() != -1);
    }

    public final void d(int i7) {
        String b7 = b(i7);
        if (b7 == null) {
            return;
        }
        l0.m(b7);
        throw new IllegalArgumentException(b7.toString());
    }
}