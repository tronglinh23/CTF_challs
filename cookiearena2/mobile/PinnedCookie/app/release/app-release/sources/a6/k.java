package a6;

import androidx.appcompat.widget.g0;
import androidx.core.view.o1;
import i6.p;
import java.io.IOException;
import u.v;
import u4.l0;
import w0.m0;
import x3.o;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f464a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f465b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f466c;

    /* renamed from: d  reason: collision with root package name */
    public static final k f467d;

    static {
        k kVar = new k();
        f467d = kVar;
        f464a = new int[]{8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, o1.f3762r, o1.f3763s, 4090, 8185, 21, 248, 2042, o1.f3764t, o1.f3765u, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, o1.f3766v, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, v.f17109g, m0.f18129j, 103, m0.f18130k, 105, 106, 107, androidx.appcompat.app.h.f805t, androidx.appcompat.app.h.f806u, 110, 111, g0.f1602o, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f465b = bArr;
        f466c = new a();
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.a(i7, f464a[i7], f465b[i7]);
        }
    }

    public final void a(int i7, int i8, int i9) {
        a aVar = new a(i7, i9);
        a aVar2 = f466c;
        while (i9 > 8) {
            i9 -= 8;
            int i10 = (i8 >>> i9) & 255;
            a[] a7 = aVar2.a();
            l0.m(a7);
            a aVar3 = a7[i10];
            if (aVar3 == null) {
                aVar3 = new a();
                a7[i10] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i11 = 8 - i9;
        int i12 = (i8 << i11) & 255;
        a[] a8 = aVar2.a();
        l0.m(a8);
        o.n2(a8, aVar, i12, (1 << i11) + i12);
    }

    public final void b(@n6.d i6.o oVar, long j7, @n6.d i6.n nVar) {
        l0.p(oVar, "source");
        l0.p(nVar, "sink");
        a aVar = f466c;
        int i7 = 0;
        int i8 = 0;
        for (long j8 = 0; j8 < j7; j8++) {
            i7 = (i7 << 8) | s5.d.b(oVar.readByte(), 255);
            i8 += 8;
            while (i8 >= 8) {
                int i9 = i8 - 8;
                a[] a7 = aVar.a();
                l0.m(a7);
                aVar = a7[(i7 >>> i9) & 255];
                l0.m(aVar);
                if (aVar.a() == null) {
                    nVar.e0(aVar.b());
                    i8 -= aVar.c();
                    aVar = f466c;
                } else {
                    i8 = i9;
                }
            }
        }
        while (i8 > 0) {
            a[] a8 = aVar.a();
            l0.m(a8);
            a aVar2 = a8[(i7 << (8 - i8)) & 255];
            l0.m(aVar2);
            if (aVar2.a() != null || aVar2.c() > i8) {
                return;
            }
            nVar.e0(aVar2.b());
            i8 -= aVar2.c();
            aVar = f466c;
        }
    }

    public final void c(@n6.d p pVar, @n6.d i6.n nVar) throws IOException {
        l0.p(pVar, "source");
        l0.p(nVar, "sink");
        int c02 = pVar.c0();
        long j7 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < c02; i8++) {
            int b7 = s5.d.b(pVar.r(i8), 255);
            int i9 = f464a[b7];
            byte b8 = f465b[b7];
            j7 = (j7 << b8) | i9;
            i7 += b8;
            while (i7 >= 8) {
                i7 = (i7 == true ? 1 : 0) - 8;
                nVar.e0((int) (j7 >> i7));
            }
        }
        if (i7 > 0) {
            nVar.e0((int) ((j7 << (8 - i7)) | (255 >>> i7)));
        }
    }

    public final int d(@n6.d p pVar) {
        l0.p(pVar, "bytes");
        long j7 = 0;
        for (int i7 = 0; i7 < pVar.c0(); i7++) {
            j7 += f465b[s5.d.b(pVar.r(i7), 255)];
        }
        return (int) ((j7 + 7) >> 3);
    }

    /* loaded from: classes.dex */
    public static final class a {
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public final a[] f468a;

        /* renamed from: b  reason: collision with root package name */
        public final int f469b;

        /* renamed from: c  reason: collision with root package name */
        public final int f470c;

        public a() {
            this.f468a = new a[256];
            this.f469b = 0;
            this.f470c = 0;
        }

        @n6.e
        public final a[] a() {
            return this.f468a;
        }

        public final int b() {
            return this.f469b;
        }

        public final int c() {
            return this.f470c;
        }

        public a(int i7, int i8) {
            this.f468a = null;
            this.f469b = i7;
            int i9 = i8 & 7;
            this.f470c = i9 == 0 ? 8 : i9;
        }
    }
}
