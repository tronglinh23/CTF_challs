package v1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import v3.t1;

/* loaded from: classes.dex */
public class i {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ boolean f17647o = false;

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f17648a;

    /* renamed from: b  reason: collision with root package name */
    public int f17649b;

    /* renamed from: c  reason: collision with root package name */
    public int f17650c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f17651d;

    /* renamed from: e  reason: collision with root package name */
    public int f17652e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17653f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17654g;

    /* renamed from: h  reason: collision with root package name */
    public int f17655h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f17656i;

    /* renamed from: j  reason: collision with root package name */
    public int f17657j;

    /* renamed from: k  reason: collision with root package name */
    public int f17658k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f17659l;

    /* renamed from: m  reason: collision with root package name */
    public b f17660m;

    /* renamed from: n  reason: collision with root package name */
    public final x f17661n;

    /* loaded from: classes.dex */
    public static class a extends InputStream {

        /* renamed from: k  reason: collision with root package name */
        public ByteBuffer f17662k;

        public a(ByteBuffer byteBuffer) {
            this.f17662k = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.f17662k.get() & t1.f17828n;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract ByteBuffer a(int i7);

        public void b(ByteBuffer byteBuffer) {
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f17663a = new c();

        @Override // v1.i.b
        public ByteBuffer a(int i7) {
            return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public i(int i7, b bVar) {
        this(i7, bVar, null, x.d());
    }

    public static ByteBuffer N(ByteBuffer byteBuffer, b bVar) {
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            int i7 = capacity == 0 ? 1 : capacity << 1;
            byteBuffer.position(0);
            ByteBuffer a7 = bVar.a(i7);
            a7.position(a7.clear().capacity() - capacity);
            a7.put(byteBuffer);
            return a7;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    public static boolean P(v vVar, int i7) {
        return vVar.d(i7) != 0;
    }

    public int A(int[] iArr) {
        Q();
        h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            n(iArr[length]);
        }
        return E();
    }

    public ByteBuffer B() {
        L();
        return this.f17648a;
    }

    @Deprecated
    public final int C() {
        L();
        return this.f17649b;
    }

    public int D() {
        int i7;
        if (this.f17651d == null || !this.f17653f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        j(0);
        int R = R();
        int i8 = this.f17652e - 1;
        while (i8 >= 0 && this.f17651d[i8] == 0) {
            i8--;
        }
        int i9 = i8 + 1;
        while (i8 >= 0) {
            int i10 = this.f17651d[i8];
            q((short) (i10 != 0 ? R - i10 : 0));
            i8--;
        }
        q((short) (R - this.f17655h));
        q((short) ((i9 + 2) * 2));
        int i11 = 0;
        loop2: while (true) {
            if (i11 >= this.f17657j) {
                i7 = 0;
                break;
            }
            int capacity = this.f17648a.capacity() - this.f17656i[i11];
            int i12 = this.f17649b;
            short s6 = this.f17648a.getShort(capacity);
            if (s6 == this.f17648a.getShort(i12)) {
                for (int i13 = 2; i13 < s6; i13 += 2) {
                    if (this.f17648a.getShort(capacity + i13) != this.f17648a.getShort(i12 + i13)) {
                        break;
                    }
                }
                i7 = this.f17656i[i11];
                break loop2;
            }
            i11++;
        }
        if (i7 != 0) {
            int capacity2 = this.f17648a.capacity() - R;
            this.f17649b = capacity2;
            this.f17648a.putInt(capacity2, i7 - R);
        } else {
            int i14 = this.f17657j;
            int[] iArr = this.f17656i;
            if (i14 == iArr.length) {
                this.f17656i = Arrays.copyOf(iArr, i14 * 2);
            }
            int[] iArr2 = this.f17656i;
            int i15 = this.f17657j;
            this.f17657j = i15 + 1;
            iArr2[i15] = R();
            ByteBuffer byteBuffer = this.f17648a;
            byteBuffer.putInt(byteBuffer.capacity() - R, R() - R);
        }
        this.f17653f = false;
        return R;
    }

    public int E() {
        if (this.f17653f) {
            this.f17653f = false;
            Y(this.f17658k);
            return R();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public void F(int i7) {
        I(i7, false);
    }

    public void G(int i7, String str) {
        H(i7, str, false);
    }

    public void H(int i7, String str, boolean z6) {
        T(this.f17650c, (z6 ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i8 = 3; i8 >= 0; i8--) {
            d((byte) str.charAt(i8));
        }
        I(i7, z6);
    }

    public void I(int i7, boolean z6) {
        T(this.f17650c, (z6 ? 4 : 0) + 4);
        n(i7);
        if (z6) {
            j(this.f17648a.capacity() - this.f17649b);
        }
        this.f17648a.position(this.f17649b);
        this.f17654g = true;
    }

    public void J(int i7) {
        I(i7, true);
    }

    public void K(int i7, String str) {
        H(i7, str, true);
    }

    public void L() {
        if (!this.f17654g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public i M(boolean z6) {
        this.f17659l = z6;
        return this;
    }

    public i O(ByteBuffer byteBuffer, b bVar) {
        this.f17660m = bVar;
        this.f17648a = byteBuffer;
        byteBuffer.clear();
        this.f17648a.order(ByteOrder.LITTLE_ENDIAN);
        this.f17650c = 1;
        this.f17649b = this.f17648a.capacity();
        this.f17652e = 0;
        this.f17653f = false;
        this.f17654g = false;
        this.f17655h = 0;
        this.f17657j = 0;
        this.f17658k = 0;
        return this;
    }

    public void Q() {
        if (this.f17653f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int R() {
        return this.f17648a.capacity() - this.f17649b;
    }

    public void S(int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            ByteBuffer byteBuffer = this.f17648a;
            int i9 = this.f17649b - 1;
            this.f17649b = i9;
            byteBuffer.put(i9, (byte) 0);
        }
    }

    public void T(int i7, int i8) {
        if (i7 > this.f17650c) {
            this.f17650c = i7;
        }
        int i9 = ((~((this.f17648a.capacity() - this.f17649b) + i8)) + 1) & (i7 - 1);
        while (this.f17649b < i9 + i7 + i8) {
            int capacity = this.f17648a.capacity();
            ByteBuffer byteBuffer = this.f17648a;
            ByteBuffer N = N(byteBuffer, this.f17660m);
            this.f17648a = N;
            if (byteBuffer != N) {
                this.f17660m.b(byteBuffer);
            }
            this.f17649b += this.f17648a.capacity() - capacity;
        }
        S(i9);
    }

    public void U(boolean z6) {
        ByteBuffer byteBuffer = this.f17648a;
        int i7 = this.f17649b - 1;
        this.f17649b = i7;
        byteBuffer.put(i7, z6 ? (byte) 1 : (byte) 0);
    }

    public void V(byte b7) {
        ByteBuffer byteBuffer = this.f17648a;
        int i7 = this.f17649b - 1;
        this.f17649b = i7;
        byteBuffer.put(i7, b7);
    }

    public void W(double d7) {
        ByteBuffer byteBuffer = this.f17648a;
        int i7 = this.f17649b - 8;
        this.f17649b = i7;
        byteBuffer.putDouble(i7, d7);
    }

    public void X(float f7) {
        ByteBuffer byteBuffer = this.f17648a;
        int i7 = this.f17649b - 4;
        this.f17649b = i7;
        byteBuffer.putFloat(i7, f7);
    }

    public void Y(int i7) {
        ByteBuffer byteBuffer = this.f17648a;
        int i8 = this.f17649b - 4;
        this.f17649b = i8;
        byteBuffer.putInt(i8, i7);
    }

    public void Z(long j7) {
        ByteBuffer byteBuffer = this.f17648a;
        int i7 = this.f17649b - 8;
        this.f17649b = i7;
        byteBuffer.putLong(i7, j7);
    }

    public void a(int i7) {
        if (i7 != R()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void a0(short s6) {
        ByteBuffer byteBuffer = this.f17648a;
        int i7 = this.f17649b - 2;
        this.f17649b = i7;
        byteBuffer.putShort(i7, s6);
    }

    public void b(int i7, boolean z6, boolean z7) {
        if (this.f17659l || z6 != z7) {
            c(z6);
            f0(i7);
        }
    }

    public void b0(int i7, int i8) {
        int capacity = this.f17648a.capacity() - i7;
        if (this.f17648a.getShort((capacity - this.f17648a.getInt(capacity)) + i8) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i8 + " must be set");
    }

    public void c(boolean z6) {
        T(1, 0);
        U(z6);
    }

    public byte[] c0() {
        return d0(this.f17649b, this.f17648a.capacity() - this.f17649b);
    }

    public void d(byte b7) {
        T(1, 0);
        V(b7);
    }

    public byte[] d0(int i7, int i8) {
        L();
        byte[] bArr = new byte[i8];
        this.f17648a.position(i7);
        this.f17648a.get(bArr);
        return bArr;
    }

    public void e(int i7, byte b7, int i8) {
        if (this.f17659l || b7 != i8) {
            d(b7);
            f0(i7);
        }
    }

    public InputStream e0() {
        L();
        ByteBuffer duplicate = this.f17648a.duplicate();
        duplicate.position(this.f17649b);
        duplicate.limit(this.f17648a.capacity());
        return new a(duplicate);
    }

    public void f(double d7) {
        T(8, 0);
        W(d7);
    }

    public void f0(int i7) {
        this.f17651d[i7] = R();
    }

    public void g(int i7, double d7, double d8) {
        if (this.f17659l || d7 != d8) {
            f(d7);
            f0(i7);
        }
    }

    public void g0(int i7) {
        Q();
        int[] iArr = this.f17651d;
        if (iArr == null || iArr.length < i7) {
            this.f17651d = new int[i7];
        }
        this.f17652e = i7;
        Arrays.fill(this.f17651d, 0, i7, 0);
        this.f17653f = true;
        this.f17655h = R();
    }

    public void h(float f7) {
        T(4, 0);
        X(f7);
    }

    public void h0(int i7, int i8, int i9) {
        Q();
        this.f17658k = i8;
        int i10 = i7 * i8;
        T(4, i10);
        T(i9, i10);
        this.f17653f = true;
    }

    public void i(int i7, float f7, double d7) {
        if (this.f17659l || f7 != d7) {
            h(f7);
            f0(i7);
        }
    }

    public void j(int i7) {
        T(4, 0);
        Y(i7);
    }

    public void k(int i7, int i8, int i9) {
        if (this.f17659l || i8 != i9) {
            j(i8);
            f0(i7);
        }
    }

    public void l(int i7, long j7, long j8) {
        if (this.f17659l || j7 != j8) {
            m(j7);
            f0(i7);
        }
    }

    public void m(long j7) {
        T(8, 0);
        Z(j7);
    }

    public void n(int i7) {
        T(4, 0);
        Y((R() - i7) + 4);
    }

    public void o(int i7, int i8, int i9) {
        if (this.f17659l || i8 != i9) {
            n(i8);
            f0(i7);
        }
    }

    public void p(int i7, short s6, int i8) {
        if (this.f17659l || s6 != i8) {
            q(s6);
            f0(i7);
        }
    }

    public void q(short s6) {
        T(2, 0);
        a0(s6);
    }

    public void r(int i7, int i8, int i9) {
        if (i8 != i9) {
            a(i8);
            f0(i7);
        }
    }

    public void s() {
        this.f17649b = this.f17648a.capacity();
        this.f17648a.clear();
        this.f17650c = 1;
        while (true) {
            int i7 = this.f17652e;
            if (i7 <= 0) {
                this.f17652e = 0;
                this.f17653f = false;
                this.f17654g = false;
                this.f17655h = 0;
                this.f17657j = 0;
                this.f17658k = 0;
                return;
            }
            int[] iArr = this.f17651d;
            int i8 = i7 - 1;
            this.f17652e = i8;
            iArr[i8] = 0;
        }
    }

    public int t(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f17648a;
        int i7 = this.f17649b - remaining;
        this.f17649b = i7;
        byteBuffer2.position(i7);
        this.f17648a.put(byteBuffer);
        return E();
    }

    public int u(byte[] bArr) {
        int length = bArr.length;
        h0(1, length, 1);
        ByteBuffer byteBuffer = this.f17648a;
        int i7 = this.f17649b - length;
        this.f17649b = i7;
        byteBuffer.position(i7);
        this.f17648a.put(bArr);
        return E();
    }

    public int v(byte[] bArr, int i7, int i8) {
        h0(1, i8, 1);
        ByteBuffer byteBuffer = this.f17648a;
        int i9 = this.f17649b - i8;
        this.f17649b = i9;
        byteBuffer.position(i9);
        this.f17648a.put(bArr, i7, i8);
        return E();
    }

    public <T extends v> int w(T t6, int[] iArr) {
        t6.t(iArr, this.f17648a);
        return A(iArr);
    }

    public int x(CharSequence charSequence) {
        int c7 = this.f17661n.c(charSequence);
        d((byte) 0);
        h0(1, c7, 1);
        ByteBuffer byteBuffer = this.f17648a;
        int i7 = this.f17649b - c7;
        this.f17649b = i7;
        byteBuffer.position(i7);
        this.f17661n.b(charSequence, this.f17648a);
        return E();
    }

    public int y(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        d((byte) 0);
        h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f17648a;
        int i7 = this.f17649b - remaining;
        this.f17649b = i7;
        byteBuffer2.position(i7);
        this.f17648a.put(byteBuffer);
        return E();
    }

    public ByteBuffer z(int i7, int i8, int i9) {
        int i10 = i7 * i8;
        h0(i7, i8, i9);
        ByteBuffer byteBuffer = this.f17648a;
        int i11 = this.f17649b - i10;
        this.f17649b = i11;
        byteBuffer.position(i11);
        ByteBuffer order = this.f17648a.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i10);
        return order;
    }

    public i(int i7, b bVar, ByteBuffer byteBuffer, x xVar) {
        this.f17650c = 1;
        this.f17651d = null;
        this.f17652e = 0;
        this.f17653f = false;
        this.f17654g = false;
        this.f17656i = new int[16];
        this.f17657j = 0;
        this.f17658k = 0;
        this.f17659l = false;
        i7 = i7 <= 0 ? 1 : i7;
        this.f17660m = bVar;
        if (byteBuffer != null) {
            this.f17648a = byteBuffer;
            byteBuffer.clear();
            this.f17648a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f17648a = bVar.a(i7);
        }
        this.f17661n = xVar;
        this.f17649b = this.f17648a.capacity();
    }

    public i(int i7) {
        this(i7, c.f17663a, null, x.d());
    }

    public i() {
        this(1024);
    }

    public i(ByteBuffer byteBuffer, b bVar) {
        this(byteBuffer.capacity(), bVar, byteBuffer, x.d());
    }

    public i(ByteBuffer byteBuffer) {
        this(byteBuffer, new c());
    }
}