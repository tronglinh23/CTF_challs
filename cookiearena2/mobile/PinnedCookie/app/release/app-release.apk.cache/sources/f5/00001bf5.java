package v1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public int f17736a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f17737b;

    /* renamed from: c  reason: collision with root package name */
    public int f17738c;

    /* renamed from: d  reason: collision with root package name */
    public int f17739d;

    /* renamed from: e  reason: collision with root package name */
    public x f17740e = x.d();

    /* loaded from: classes.dex */
    public class a implements Comparator<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f17741a;

        public a(ByteBuffer byteBuffer) {
            this.f17741a = byteBuffer;
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(Integer num, Integer num2) {
            return v.this.s(num, num2, this.f17741a);
        }
    }

    public static boolean a(ByteBuffer byteBuffer, String str) {
        if (str.length() == 4) {
            for (int i7 = 0; i7 < 4; i7++) {
                if (str.charAt(i7) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i7))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public static int c(int i7, ByteBuffer byteBuffer) {
        return i7 + byteBuffer.getInt(i7);
    }

    public static int e(int i7, int i8, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i8;
        return byteBuffer.getShort((i7 + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    public static String i(int i7, ByteBuffer byteBuffer, x xVar) {
        int i8 = i7 + byteBuffer.getInt(i7);
        return xVar.a(byteBuffer, i8 + 4, byteBuffer.getInt(i8));
    }

    public static v k(v vVar, int i7, ByteBuffer byteBuffer) {
        vVar.g(c(i7, byteBuffer), byteBuffer);
        return vVar;
    }

    public static int p(int i7, int i8, ByteBuffer byteBuffer) {
        int i9 = i7 + byteBuffer.getInt(i7);
        int i10 = i8 + byteBuffer.getInt(i8);
        int i11 = byteBuffer.getInt(i9);
        int i12 = byteBuffer.getInt(i10);
        int i13 = i9 + 4;
        int i14 = i10 + 4;
        int min = Math.min(i11, i12);
        for (int i15 = 0; i15 < min; i15++) {
            int i16 = i15 + i13;
            int i17 = i15 + i14;
            if (byteBuffer.get(i16) != byteBuffer.get(i17)) {
                return byteBuffer.get(i16) - byteBuffer.get(i17);
            }
        }
        return i11 - i12;
    }

    public static int q(int i7, byte[] bArr, ByteBuffer byteBuffer) {
        int i8 = i7 + byteBuffer.getInt(i7);
        int i9 = byteBuffer.getInt(i8);
        int length = bArr.length;
        int i10 = i8 + 4;
        int min = Math.min(i9, length);
        for (int i11 = 0; i11 < min; i11++) {
            int i12 = i11 + i10;
            if (byteBuffer.get(i12) != bArr[i11]) {
                return byteBuffer.get(i12) - bArr[i11];
            }
        }
        return i9 - length;
    }

    public int b(int i7) {
        return i7 + this.f17737b.getInt(i7);
    }

    public int d(int i7) {
        if (i7 < this.f17739d) {
            return this.f17737b.getShort(this.f17738c + i7);
        }
        return 0;
    }

    public void f() {
        g(0, null);
    }

    public void g(int i7, ByteBuffer byteBuffer) {
        this.f17737b = byteBuffer;
        if (byteBuffer == null) {
            this.f17736a = 0;
            this.f17738c = 0;
            this.f17739d = 0;
            return;
        }
        this.f17736a = i7;
        int i8 = i7 - byteBuffer.getInt(i7);
        this.f17738c = i8;
        this.f17739d = this.f17737b.getShort(i8);
    }

    public String h(int i7) {
        return i(i7, this.f17737b, this.f17740e);
    }

    public v j(v vVar, int i7) {
        return k(vVar, i7, this.f17737b);
    }

    public int l(int i7) {
        int i8 = i7 + this.f17736a;
        return i8 + this.f17737b.getInt(i8) + 4;
    }

    public ByteBuffer m(int i7, int i8) {
        int d7 = d(i7);
        if (d7 == 0) {
            return null;
        }
        ByteBuffer order = this.f17737b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int l7 = l(d7);
        order.position(l7);
        order.limit(l7 + (o(d7) * i8));
        return order;
    }

    public ByteBuffer n(ByteBuffer byteBuffer, int i7, int i8) {
        int d7 = d(i7);
        if (d7 == 0) {
            return null;
        }
        int l7 = l(d7);
        byteBuffer.rewind();
        byteBuffer.limit((o(d7) * i8) + l7);
        byteBuffer.position(l7);
        return byteBuffer;
    }

    public int o(int i7) {
        int i8 = i7 + this.f17736a;
        return this.f17737b.getInt(i8 + this.f17737b.getInt(i8));
    }

    public ByteBuffer r() {
        return this.f17737b;
    }

    public int s(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    public void t(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            numArr[i7] = Integer.valueOf(iArr[i7]);
        }
        Arrays.sort(numArr, new a(byteBuffer));
        for (int i8 = 0; i8 < iArr.length; i8++) {
            iArr[i8] = numArr[i8].intValue();
        }
    }
}