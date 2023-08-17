package v1;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import v1.j;
/* loaded from: classes.dex */
public class k {

    /* renamed from: h  reason: collision with root package name */
    public static final int f17708h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f17709i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f17710j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f17711k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f17712l = 4;

    /* renamed from: m  reason: collision with root package name */
    public static final int f17713m = 7;

    /* renamed from: n  reason: collision with root package name */
    public static final int f17714n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f17715o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f17716p = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final int f17717q = 3;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ boolean f17718r = false;

    /* renamed from: a  reason: collision with root package name */
    public final r f17719a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f17720b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, Integer> f17721c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, Integer> f17722d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17723e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17724f;

    /* renamed from: g  reason: collision with root package name */
    public Comparator<b> f17725g;

    /* loaded from: classes.dex */
    public class a implements Comparator<b> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            byte b7;
            byte b8;
            int i7 = bVar.f17732e;
            int i8 = bVar2.f17732e;
            do {
                b7 = k.this.f17719a.get(i7);
                b8 = k.this.f17719a.get(i8);
                if (b7 == 0) {
                    return b7 - b8;
                }
                i7++;
                i8++;
            } while (b7 == b8);
            return b7 - b8;
        }
    }

    public k(int i7) {
        this(new v1.a(i7), 1);
    }

    public static int E(long j7) {
        if (j7 <= j.C0252j.a((byte) -1)) {
            return 0;
        }
        if (j7 <= j.C0252j.c((short) -1)) {
            return 1;
        }
        return j7 <= j.C0252j.b(-1) ? 2 : 3;
    }

    public final void A(String str, long j7) {
        this.f17720b.add(b.w(u(str), j7));
    }

    public void B(BigInteger bigInteger) {
        A(null, bigInteger.longValue());
    }

    public int C() {
        return this.f17720b.size();
    }

    public int D() {
        return this.f17720b.size();
    }

    public final void F(b bVar, int i7) {
        int i8 = bVar.f17728a;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            if (i8 == 3) {
                H(bVar.f17730c, i7);
                return;
            } else if (i8 != 26) {
                J(bVar.f17731d, i7);
                return;
            }
        }
        I(bVar.f17731d, i7);
    }

    public final b G(int i7, byte[] bArr, int i8, boolean z6) {
        int E = E(bArr.length);
        I(bArr.length, b(E));
        int m7 = this.f17719a.m();
        this.f17719a.s(bArr, 0, bArr.length);
        if (z6) {
            this.f17719a.v((byte) 0);
        }
        return b.f(i7, m7, i8, E);
    }

    public final void H(double d7, int i7) {
        if (i7 == 4) {
            this.f17719a.p((float) d7);
        } else if (i7 == 8) {
            this.f17719a.t(d7);
        }
    }

    public final void I(long j7, int i7) {
        if (i7 == 1) {
            this.f17719a.v((byte) j7);
        } else if (i7 == 2) {
            this.f17719a.u((short) j7);
        } else if (i7 == 4) {
            this.f17719a.q((int) j7);
        } else if (i7 != 8) {
        } else {
            this.f17719a.z(j7);
        }
    }

    public final void J(long j7, int i7) {
        I((int) (this.f17719a.m() - j7), i7);
    }

    public final b K(int i7, String str) {
        return G(i7, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public final int b(int i7) {
        int i8 = 1 << i7;
        int q6 = b.q(this.f17719a.m(), i8);
        while (true) {
            int i9 = q6 - 1;
            if (q6 == 0) {
                return i8;
            }
            this.f17719a.v((byte) 0);
            q6 = i9;
        }
    }

    public final b c(int i7, int i8) {
        long j7 = i8;
        int max = Math.max(0, E(j7));
        int i9 = i7;
        while (i9 < this.f17720b.size()) {
            i9++;
            max = Math.max(max, b.i(4, 0, this.f17720b.get(i9).f17732e, this.f17719a.m(), i9));
        }
        int b7 = b(max);
        I(j7, b7);
        int m7 = this.f17719a.m();
        while (i7 < this.f17720b.size()) {
            int i10 = this.f17720b.get(i7).f17732e;
            J(this.f17720b.get(i7).f17732e, b7);
            i7++;
        }
        return new b(-1, j.q(4, 0), max, m7);
    }

    public final b d(int i7, int i8, int i9, boolean z6, boolean z7, b bVar) {
        int i10;
        int i11;
        int i12 = i9;
        long j7 = i12;
        int max = Math.max(0, E(j7));
        if (bVar != null) {
            max = Math.max(max, bVar.h(this.f17719a.m(), 0));
            i10 = 3;
        } else {
            i10 = 1;
        }
        int i13 = 4;
        int i14 = max;
        for (int i15 = i8; i15 < this.f17720b.size(); i15++) {
            i14 = Math.max(i14, this.f17720b.get(i15).h(this.f17719a.m(), i15 + i10));
            if (z6 && i15 == i8) {
                i13 = this.f17720b.get(i15).f17728a;
                if (!j.l(i13)) {
                    throw new j.b("TypedVector does not support this element type");
                }
            }
        }
        int i16 = i8;
        int b7 = b(i14);
        if (bVar != null) {
            J(bVar.f17731d, b7);
            I(1 << bVar.f17729b, b7);
        }
        if (!z7) {
            I(j7, b7);
        }
        int m7 = this.f17719a.m();
        for (int i17 = i16; i17 < this.f17720b.size(); i17++) {
            F(this.f17720b.get(i17), b7);
        }
        if (!z6) {
            while (i16 < this.f17720b.size()) {
                this.f17719a.v(this.f17720b.get(i16).s(i14));
                i16++;
            }
        }
        if (bVar != null) {
            i11 = 9;
        } else if (z6) {
            if (!z7) {
                i12 = 0;
            }
            i11 = j.q(i13, i12);
        } else {
            i11 = 10;
        }
        return new b(i7, i11, i14, m7);
    }

    public int e(String str, int i7) {
        int u6 = u(str);
        ArrayList<b> arrayList = this.f17720b;
        Collections.sort(arrayList.subList(i7, arrayList.size()), this.f17725g);
        b d7 = d(u6, i7, this.f17720b.size() - i7, false, false, c(i7, this.f17720b.size() - i7));
        while (this.f17720b.size() > i7) {
            this.f17720b.remove(r0.size() - 1);
        }
        this.f17720b.add(d7);
        return (int) d7.f17731d;
    }

    public int f(String str, int i7, boolean z6, boolean z7) {
        b d7 = d(u(str), i7, this.f17720b.size() - i7, z6, z7, null);
        while (this.f17720b.size() > i7) {
            this.f17720b.remove(r10.size() - 1);
        }
        this.f17720b.add(d7);
        return (int) d7.f17731d;
    }

    public ByteBuffer g() {
        int b7 = b(this.f17720b.get(0).h(this.f17719a.m(), 0));
        F(this.f17720b.get(0), b7);
        this.f17719a.v(this.f17720b.get(0).r());
        this.f17719a.v((byte) b7);
        this.f17724f = true;
        return ByteBuffer.wrap(this.f17719a.y(), 0, this.f17719a.m());
    }

    public r h() {
        return this.f17719a;
    }

    public int i(String str, byte[] bArr) {
        b G = G(u(str), bArr, 25, false);
        this.f17720b.add(G);
        return (int) G.f17731d;
    }

    public int j(byte[] bArr) {
        return i(null, bArr);
    }

    public void k(String str, boolean z6) {
        this.f17720b.add(b.g(u(str), z6));
    }

    public void l(boolean z6) {
        k(null, z6);
    }

    public void m(double d7) {
        o(null, d7);
    }

    public void n(float f7) {
        p(null, f7);
    }

    public void o(String str, double d7) {
        this.f17720b.add(b.k(u(str), d7));
    }

    public void p(String str, float f7) {
        this.f17720b.add(b.j(u(str), f7));
    }

    public void q(int i7) {
        s(null, i7);
    }

    public void r(long j7) {
        t(null, j7);
    }

    public void s(String str, int i7) {
        t(str, i7);
    }

    public void t(String str, long j7) {
        int u6 = u(str);
        if (-128 <= j7 && j7 <= 127) {
            this.f17720b.add(b.o(u6, (int) j7));
        } else if (-32768 <= j7 && j7 <= 32767) {
            this.f17720b.add(b.l(u6, (int) j7));
        } else if (-2147483648L > j7 || j7 > 2147483647L) {
            this.f17720b.add(b.n(u6, j7));
        } else {
            this.f17720b.add(b.m(u6, (int) j7));
        }
    }

    public final int u(String str) {
        if (str == null) {
            return -1;
        }
        int m7 = this.f17719a.m();
        if ((this.f17723e & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f17719a.s(bytes, 0, bytes.length);
            this.f17719a.v((byte) 0);
            this.f17721c.put(str, Integer.valueOf(m7));
            return m7;
        }
        Integer num = this.f17721c.get(str);
        if (num == null) {
            byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
            this.f17719a.s(bytes2, 0, bytes2.length);
            this.f17719a.v((byte) 0);
            this.f17721c.put(str, Integer.valueOf(m7));
            return m7;
        }
        return num.intValue();
    }

    public int v(String str) {
        return w(null, str);
    }

    public int w(String str, String str2) {
        int u6 = u(str);
        if ((this.f17723e & 2) == 0) {
            b K = K(u6, str2);
            this.f17720b.add(K);
            return (int) K.f17731d;
        }
        Integer num = this.f17722d.get(str2);
        if (num != null) {
            this.f17720b.add(b.f(u6, num.intValue(), 5, E(str2.length())));
            return num.intValue();
        }
        b K2 = K(u6, str2);
        this.f17722d.put(str2, Integer.valueOf((int) K2.f17731d));
        this.f17720b.add(K2);
        return (int) K2.f17731d;
    }

    public void x(int i7) {
        z(null, i7);
    }

    public void y(long j7) {
        z(null, j7);
    }

    public final void z(String str, long j7) {
        int u6 = u(str);
        int E = E(j7);
        this.f17720b.add(E == 0 ? b.x(u6, (int) j7) : E == 1 ? b.u(u6, (int) j7) : E == 2 ? b.v(u6, (int) j7) : b.w(u6, j7));
    }

    public k() {
        this(256);
    }

    @Deprecated
    public k(ByteBuffer byteBuffer, int i7) {
        this(new v1.a(byteBuffer.array()), i7);
    }

    public k(r rVar, int i7) {
        this.f17720b = new ArrayList<>();
        this.f17721c = new HashMap<>();
        this.f17722d = new HashMap<>();
        this.f17724f = false;
        this.f17725g = new a();
        this.f17719a = rVar;
        this.f17723e = i7;
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ boolean f17727f = false;

        /* renamed from: a  reason: collision with root package name */
        public final int f17728a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17729b;

        /* renamed from: c  reason: collision with root package name */
        public final double f17730c;

        /* renamed from: d  reason: collision with root package name */
        public long f17731d;

        /* renamed from: e  reason: collision with root package name */
        public int f17732e;

        public b(int i7, int i8, int i9, long j7) {
            this.f17732e = i7;
            this.f17728a = i8;
            this.f17729b = i9;
            this.f17731d = j7;
            this.f17730c = Double.MIN_VALUE;
        }

        public static b f(int i7, int i8, int i9, int i10) {
            return new b(i7, i9, i10, i8);
        }

        public static b g(int i7, boolean z6) {
            return new b(i7, 26, 0, z6 ? 1L : 0L);
        }

        public static int i(int i7, int i8, long j7, int i9, int i10) {
            if (j.j(i7)) {
                return i8;
            }
            for (int i11 = 1; i11 <= 32; i11 *= 2) {
                int E = k.E((int) (((q(i9, i11) + i9) + (i10 * i11)) - j7));
                if ((1 << E) == i11) {
                    return E;
                }
            }
            return 3;
        }

        public static b j(int i7, float f7) {
            return new b(i7, 3, 2, f7);
        }

        public static b k(int i7, double d7) {
            return new b(i7, 3, 3, d7);
        }

        public static b l(int i7, int i8) {
            return new b(i7, 1, 1, i8);
        }

        public static b m(int i7, int i8) {
            return new b(i7, 1, 2, i8);
        }

        public static b n(int i7, long j7) {
            return new b(i7, 1, 3, j7);
        }

        public static b o(int i7, int i8) {
            return new b(i7, 1, 0, i8);
        }

        public static byte p(int i7, int i8) {
            return (byte) (i7 | (i8 << 2));
        }

        public static int q(int i7, int i8) {
            return ((~i7) + 1) & (i8 - 1);
        }

        public static b u(int i7, int i8) {
            return new b(i7, 2, 1, i8);
        }

        public static b v(int i7, int i8) {
            return new b(i7, 2, 2, i8);
        }

        public static b w(int i7, long j7) {
            return new b(i7, 2, 3, j7);
        }

        public static b x(int i7, int i8) {
            return new b(i7, 2, 0, i8);
        }

        public final int h(int i7, int i8) {
            return i(this.f17728a, this.f17729b, this.f17731d, i7, i8);
        }

        public final byte r() {
            return s(0);
        }

        public final byte s(int i7) {
            return p(t(i7), this.f17728a);
        }

        public final int t(int i7) {
            return j.j(this.f17728a) ? Math.max(this.f17729b, i7) : this.f17729b;
        }

        public b(int i7, int i8, int i9, double d7) {
            this.f17732e = i7;
            this.f17728a = i8;
            this.f17729b = i9;
            this.f17730c = d7;
            this.f17731d = Long.MIN_VALUE;
        }
    }

    public k(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
