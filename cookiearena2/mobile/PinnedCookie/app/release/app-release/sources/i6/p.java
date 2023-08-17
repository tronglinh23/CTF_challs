package i6;

import i0.x2;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p0.x0;
import u.v;
import v3.b1;
/* loaded from: classes.dex */
public class p implements Serializable, Comparable<p> {

    /* renamed from: n  reason: collision with root package name */
    public static final long f11250n = 1;

    /* renamed from: k  reason: collision with root package name */
    public transient int f11253k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public transient String f11254l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f11255m;

    /* renamed from: p  reason: collision with root package name */
    public static final a f11252p = new a(null);
    @n6.d
    @s4.e

    /* renamed from: o  reason: collision with root package name */
    public static final p f11251o = new p(new byte[0]);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public static /* synthetic */ p k(a aVar, String str, Charset charset, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                charset = i5.f.f11071b;
            }
            return aVar.j(str, charset);
        }

        public static /* synthetic */ p p(a aVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i7 = 0;
            }
            if ((i9 & 2) != 0) {
                i8 = bArr.length;
            }
            return aVar.o(bArr, i7, i8);
        }

        @s4.h(name = "-deprecated_decodeBase64")
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @n6.e
        public final p a(@n6.d String str) {
            u4.l0.p(str, v.b.f17140e);
            return h(str);
        }

        @s4.h(name = "-deprecated_decodeHex")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        public final p b(@n6.d String str) {
            u4.l0.p(str, v.b.f17140e);
            return i(str);
        }

        @s4.h(name = "-deprecated_encodeString")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        public final p c(@n6.d String str, @n6.d Charset charset) {
            u4.l0.p(str, v.b.f17140e);
            u4.l0.p(charset, "charset");
            return j(str, charset);
        }

        @s4.h(name = "-deprecated_encodeUtf8")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        public final p d(@n6.d String str) {
            u4.l0.p(str, v.b.f17140e);
            return l(str);
        }

        @s4.h(name = "-deprecated_of")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        public final p e(@n6.d ByteBuffer byteBuffer) {
            u4.l0.p(byteBuffer, "buffer");
            return m(byteBuffer);
        }

        @s4.h(name = "-deprecated_of")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        public final p f(@n6.d byte[] bArr, int i7, int i8) {
            u4.l0.p(bArr, "array");
            return o(bArr, i7, i8);
        }

        @s4.h(name = "-deprecated_read")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        public final p g(@n6.d InputStream inputStream, int i7) {
            u4.l0.p(inputStream, "inputstream");
            return q(inputStream, i7);
        }

        @s4.m
        @n6.e
        public final p h(@n6.d String str) {
            u4.l0.p(str, "$this$decodeBase64");
            byte[] a7 = i6.a.a(str);
            if (a7 != null) {
                return new p(a7);
            }
            return null;
        }

        @n6.d
        @s4.m
        public final p i(@n6.d String str) {
            u4.l0.p(str, "$this$decodeHex");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = i7 * 2;
                bArr[i7] = (byte) ((j6.b.b(str.charAt(i8)) << 4) + j6.b.b(str.charAt(i8 + 1)));
            }
            return new p(bArr);
        }

        @s4.h(name = "encodeString")
        @n6.d
        @s4.m
        public final p j(@n6.d String str, @n6.d Charset charset) {
            u4.l0.p(str, "$this$encode");
            u4.l0.p(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            u4.l0.o(bytes, "(this as java.lang.String).getBytes(charset)");
            return new p(bytes);
        }

        @n6.d
        @s4.m
        public final p l(@n6.d String str) {
            u4.l0.p(str, "$this$encodeUtf8");
            p pVar = new p(i.a(str));
            pVar.Y(str);
            return pVar;
        }

        @s4.h(name = "of")
        @n6.d
        @s4.m
        public final p m(@n6.d ByteBuffer byteBuffer) {
            u4.l0.p(byteBuffer, "$this$toByteString");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new p(bArr);
        }

        @n6.d
        @s4.m
        public final p n(@n6.d byte... bArr) {
            u4.l0.p(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            u4.l0.o(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new p(copyOf);
        }

        @s4.h(name = "of")
        @n6.d
        @s4.m
        public final p o(@n6.d byte[] bArr, int i7, int i8) {
            u4.l0.p(bArr, "$this$toByteString");
            j.e(bArr.length, i7, i8);
            return new p(x3.o.G1(bArr, i7, i8 + i7));
        }

        @s4.h(name = "read")
        @n6.d
        @s4.m
        public final p q(@n6.d InputStream inputStream, int i7) throws IOException {
            u4.l0.p(inputStream, "$this$readByteString");
            int i8 = 0;
            if (!(i7 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + i7).toString());
            }
            byte[] bArr = new byte[i7];
            while (i8 < i7) {
                int read = inputStream.read(bArr, i8, i7 - i8);
                if (read == -1) {
                    throw new EOFException();
                }
                i8 += read;
            }
            return new p(bArr);
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    public p(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "data");
        this.f11255m = bArr;
    }

    public static /* synthetic */ int F(p pVar, p pVar2, int i7, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                i7 = 0;
            }
            return pVar.C(pVar2, i7);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int G(p pVar, byte[] bArr, int i7, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                i7 = 0;
            }
            return pVar.E(bArr, i7);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int N(p pVar, p pVar2, int i7, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                i7 = pVar.c0();
            }
            return pVar.K(pVar2, i7);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ int O(p pVar, byte[] bArr, int i7, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                i7 = pVar.c0();
            }
            return pVar.M(bArr, i7);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    @s4.h(name = "of")
    @n6.d
    @s4.m
    public static final p Q(@n6.d ByteBuffer byteBuffer) {
        return f11252p.m(byteBuffer);
    }

    @n6.d
    @s4.m
    public static final p R(@n6.d byte... bArr) {
        return f11252p.n(bArr);
    }

    @s4.h(name = "of")
    @n6.d
    @s4.m
    public static final p S(@n6.d byte[] bArr, int i7, int i8) {
        return f11252p.o(bArr, i7, i8);
    }

    @s4.h(name = "read")
    @n6.d
    @s4.m
    public static final p V(@n6.d InputStream inputStream, int i7) throws IOException {
        return f11252p.q(inputStream, i7);
    }

    public static /* synthetic */ p j0(p pVar, int i7, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 1) != 0) {
                i7 = 0;
            }
            if ((i9 & 2) != 0) {
                i8 = pVar.c0();
            }
            return pVar.i0(i7, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    @s4.m
    @n6.e
    public static final p k(@n6.d String str) {
        return f11252p.h(str);
    }

    @n6.d
    @s4.m
    public static final p l(@n6.d String str) {
        return f11252p.i(str);
    }

    @s4.h(name = "encodeString")
    @n6.d
    @s4.m
    public static final p n(@n6.d String str, @n6.d Charset charset) {
        return f11252p.j(str, charset);
    }

    @n6.d
    @s4.m
    public static final p o(@n6.d String str) {
        return f11252p.l(str);
    }

    @n6.d
    public p A(@n6.d p pVar) {
        u4.l0.p(pVar, x2.f10960j);
        return x("HmacSHA512", pVar);
    }

    @s4.i
    public final int B(@n6.d p pVar) {
        return F(this, pVar, 0, 2, null);
    }

    @s4.i
    public final int C(@n6.d p pVar, int i7) {
        u4.l0.p(pVar, "other");
        return E(pVar.H(), i7);
    }

    @s4.i
    public final int D(@n6.d byte[] bArr) {
        return G(this, bArr, 0, 2, null);
    }

    @s4.i
    public int E(@n6.d byte[] bArr, int i7) {
        u4.l0.p(bArr, "other");
        int length = s().length - bArr.length;
        int max = Math.max(i7, 0);
        if (max <= length) {
            while (!j.d(s(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    @n6.d
    public byte[] H() {
        return s();
    }

    public byte I(int i7) {
        return s()[i7];
    }

    @s4.i
    public final int J(@n6.d p pVar) {
        return N(this, pVar, 0, 2, null);
    }

    @s4.i
    public final int K(@n6.d p pVar, int i7) {
        u4.l0.p(pVar, "other");
        return M(pVar.H(), i7);
    }

    @s4.i
    public final int L(@n6.d byte[] bArr) {
        return O(this, bArr, 0, 2, null);
    }

    @s4.i
    public int M(@n6.d byte[] bArr, int i7) {
        u4.l0.p(bArr, "other");
        for (int min = Math.min(i7, s().length - bArr.length); min >= 0; min--) {
            if (j.d(s(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @n6.d
    public p P() {
        return m("MD5");
    }

    public boolean T(int i7, @n6.d p pVar, int i8, int i9) {
        u4.l0.p(pVar, "other");
        return pVar.U(i8, s(), i7, i9);
    }

    public boolean U(int i7, @n6.d byte[] bArr, int i8, int i9) {
        u4.l0.p(bArr, "other");
        return i7 >= 0 && i7 <= s().length - i9 && i8 >= 0 && i8 <= bArr.length - i9 && j.d(s(), i7, bArr, i8, i9);
    }

    public final void W(ObjectInputStream objectInputStream) throws IOException {
        p q6 = f11252p.q(objectInputStream, objectInputStream.readInt());
        Field declaredField = p.class.getDeclaredField(x0.f14590b);
        u4.l0.o(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, q6.f11255m);
    }

    public final void X(int i7) {
        this.f11253k = i7;
    }

    public final void Y(@n6.e String str) {
        this.f11254l = str;
    }

    @n6.d
    public p Z() {
        return m("SHA-1");
    }

    @n6.d
    public p a0() {
        return m("SHA-256");
    }

    @n6.d
    public p b0() {
        return m("SHA-512");
    }

    @s4.h(name = "-deprecated_getByte")
    @v3.k(level = v3.m.ERROR, message = "moved to operator function", replaceWith = @b1(expression = "this[index]", imports = {}))
    public final byte c(int i7) {
        return r(i7);
    }

    @s4.h(name = "size")
    public final int c0() {
        return u();
    }

    @s4.h(name = "-deprecated_size")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "size", imports = {}))
    public final int d() {
        return c0();
    }

    public final boolean d0(@n6.d p pVar) {
        u4.l0.p(pVar, "prefix");
        return T(0, pVar, 0, pVar.c0());
    }

    @n6.d
    public ByteBuffer e() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.f11255m).asReadOnlyBuffer();
        u4.l0.o(asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public final boolean e0(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "prefix");
        return U(0, bArr, 0, bArr.length);
    }

    public boolean equals(@n6.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.c0() == s().length && pVar.U(0, s(), 0, s().length)) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public String f0(@n6.d Charset charset) {
        u4.l0.p(charset, "charset");
        return new String(this.f11255m, charset);
    }

    @n6.d
    @s4.i
    public final p g0() {
        return j0(this, 0, 0, 3, null);
    }

    @n6.d
    public String h() {
        return i6.a.c(s(), null, 1, null);
    }

    @n6.d
    @s4.i
    public final p h0(int i7) {
        return j0(this, i7, 0, 2, null);
    }

    public int hashCode() {
        int t6 = t();
        if (t6 != 0) {
            return t6;
        }
        int hashCode = Arrays.hashCode(s());
        X(hashCode);
        return hashCode;
    }

    @n6.d
    public String i() {
        return i6.a.b(s(), i6.a.e());
    }

    @n6.d
    @s4.i
    public p i0(int i7, int i8) {
        if (i7 >= 0) {
            if (i8 <= s().length) {
                if (i8 - i7 >= 0) {
                    return (i7 == 0 && i8 == s().length) ? this : new p(x3.o.G1(s(), i7, i8));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + s().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L13;
     */
    @Override // java.lang.Comparable
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(@n6.d i6.p r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            u4.l0.p(r10, r0)
            int r0 = r9.c0()
            int r1 = r10.c0()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.r(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.r(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.p.compareTo(i6.p):int");
    }

    @n6.d
    public p k0() {
        byte b7;
        for (int i7 = 0; i7 < s().length; i7++) {
            byte b8 = s()[i7];
            byte b9 = (byte) 65;
            if (b8 >= b9 && b8 <= (b7 = (byte) 90)) {
                byte[] s6 = s();
                byte[] copyOf = Arrays.copyOf(s6, s6.length);
                u4.l0.o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i7] = (byte) (b8 + 32);
                for (int i8 = i7 + 1; i8 < copyOf.length; i8++) {
                    byte b10 = copyOf[i8];
                    if (b10 >= b9 && b10 <= b7) {
                        copyOf[i8] = (byte) (b10 + 32);
                    }
                }
                return new p(copyOf);
            }
        }
        return this;
    }

    @n6.d
    public p l0() {
        byte b7;
        for (int i7 = 0; i7 < s().length; i7++) {
            byte b8 = s()[i7];
            byte b9 = (byte) 97;
            if (b8 >= b9 && b8 <= (b7 = (byte) 122)) {
                byte[] s6 = s();
                byte[] copyOf = Arrays.copyOf(s6, s6.length);
                u4.l0.o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i7] = (byte) (b8 - 32);
                for (int i8 = i7 + 1; i8 < copyOf.length; i8++) {
                    byte b10 = copyOf[i8];
                    if (b10 >= b9 && b10 <= b7) {
                        copyOf[i8] = (byte) (b10 - 32);
                    }
                }
                return new p(copyOf);
            }
        }
        return this;
    }

    @n6.d
    public p m(@n6.d String str) {
        u4.l0.p(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.f11255m);
        u4.l0.o(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new p(digest);
    }

    @n6.d
    public byte[] m0() {
        byte[] s6 = s();
        byte[] copyOf = Arrays.copyOf(s6, s6.length);
        u4.l0.o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @n6.d
    public String n0() {
        String v6 = v();
        if (v6 == null) {
            String c7 = i.c(H());
            Y(c7);
            return c7;
        }
        return v6;
    }

    public void o0(@n6.d OutputStream outputStream) throws IOException {
        u4.l0.p(outputStream, "out");
        outputStream.write(this.f11255m);
    }

    public final boolean p(@n6.d p pVar) {
        u4.l0.p(pVar, "suffix");
        return T(c0() - pVar.c0(), pVar, 0, pVar.c0());
    }

    public void p0(@n6.d m mVar, int i7, int i8) {
        u4.l0.p(mVar, "buffer");
        j6.b.G(this, mVar, i7, i8);
    }

    public final boolean q(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "suffix");
        return U(c0() - bArr.length, bArr, 0, bArr.length);
    }

    public final void q0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f11255m.length);
        objectOutputStream.write(this.f11255m);
    }

    @s4.h(name = "getByte")
    public final byte r(int i7) {
        return I(i7);
    }

    @n6.d
    public final byte[] s() {
        return this.f11255m;
    }

    public final int t() {
        return this.f11253k;
    }

    @n6.d
    public String toString() {
        if (s().length == 0) {
            return "[size=0]";
        }
        int a7 = j6.b.a(s(), 64);
        if (a7 == -1) {
            if (s().length <= 64) {
                return "[hex=" + w() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(s().length);
            sb.append(" hex=");
            if (64 <= s().length) {
                sb.append((64 == s().length ? this : new p(x3.o.G1(s(), 0, 64))).w());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + s().length + ')').toString());
        }
        String n02 = n0();
        if (n02 != null) {
            String substring = n02.substring(0, a7);
            u4.l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String l22 = i5.b0.l2(i5.b0.l2(i5.b0.l2(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (a7 >= n02.length()) {
                return "[text=" + l22 + ']';
            }
            return "[size=" + s().length + " text=" + l22 + "…]";
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public int u() {
        return s().length;
    }

    @n6.e
    public final String v() {
        return this.f11254l;
    }

    @n6.d
    public String w() {
        char[] cArr = new char[s().length * 2];
        int i7 = 0;
        for (byte b7 : s()) {
            int i8 = i7 + 1;
            cArr[i7] = j6.b.I()[(b7 >> 4) & 15];
            i7 = i8 + 1;
            cArr[i8] = j6.b.I()[b7 & 15];
        }
        return new String(cArr);
    }

    @n6.d
    public p x(@n6.d String str, @n6.d p pVar) {
        u4.l0.p(str, "algorithm");
        u4.l0.p(pVar, x2.f10960j);
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(pVar.m0(), str));
            byte[] doFinal = mac.doFinal(this.f11255m);
            u4.l0.o(doFinal, "mac.doFinal(data)");
            return new p(doFinal);
        } catch (InvalidKeyException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    @n6.d
    public p y(@n6.d p pVar) {
        u4.l0.p(pVar, x2.f10960j);
        return x("HmacSHA1", pVar);
    }

    @n6.d
    public p z(@n6.d p pVar) {
        u4.l0.p(pVar, x2.f10960j);
        return x("HmacSHA256", pVar);
    }
}
