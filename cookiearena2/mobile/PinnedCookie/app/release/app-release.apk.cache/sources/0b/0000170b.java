package n4;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import u4.l0;
import u4.r1;

@r1({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
/* loaded from: classes.dex */
public final class r {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final r f13861a = new r();

    /* renamed from: b  reason: collision with root package name */
    public static final int f13862b = 32;

    /* renamed from: c  reason: collision with root package name */
    public static CharsetDecoder f13863c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f13864d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f13865e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final char[] f13866f;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public static final ByteBuffer f13867g;
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public static final CharBuffer f13868h;
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public static final StringBuilder f13869i;

    static {
        byte[] bArr = new byte[32];
        f13865e = bArr;
        char[] cArr = new char[32];
        f13866f = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        l0.o(wrap, "wrap(bytes)");
        f13867g = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        l0.o(wrap2, "wrap(chars)");
        f13868h = wrap2;
        f13869i = new StringBuilder();
    }

    public final int a() {
        ByteBuffer byteBuffer = f13867g;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    public final int b(boolean z6) {
        while (true) {
            CharsetDecoder charsetDecoder = f13863c;
            if (charsetDecoder == null) {
                l0.S("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f13867g;
            CharBuffer charBuffer = f13868h;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z6);
            l0.o(decode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (decode.isError()) {
                e();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb = f13869i;
            char[] cArr = f13866f;
            int i7 = position - 1;
            sb.append(cArr, 0, i7);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i7]);
        }
    }

    public final int c(int i7, int i8) {
        ByteBuffer byteBuffer = f13867g;
        byteBuffer.limit(i7);
        f13868h.position(i8);
        int b7 = b(true);
        CharsetDecoder charsetDecoder = f13863c;
        if (charsetDecoder == null) {
            l0.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return b7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (u4.l0.g(r0.charset(), r12) == false) goto L9;
     */
    @n6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.lang.String d(@n6.d java.io.InputStream r11, @n6.d java.nio.charset.Charset r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "inputStream"
            u4.l0.p(r11, r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = "charset"
            u4.l0.p(r12, r0)     // Catch: java.lang.Throwable -> Lc9
            java.nio.charset.CharsetDecoder r0 = n4.r.f13863c     // Catch: java.lang.Throwable -> Lc9
            r1 = 0
            if (r0 == 0) goto L22
            if (r0 != 0) goto L18
            java.lang.String r0 = "decoder"
            u4.l0.S(r0)     // Catch: java.lang.Throwable -> Lc9
            r0 = r1
        L18:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = u4.l0.g(r0, r12)     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L25
        L22:
            r10.g(r12)     // Catch: java.lang.Throwable -> Lc9
        L25:
            r12 = 0
            r0 = r12
            r2 = r0
        L28:
            int r3 = r11.read()     // Catch: java.lang.Throwable -> Lc9
            r4 = 32
            r5 = 10
            r6 = -1
            r7 = 1
            if (r3 != r6) goto L4c
            java.lang.StringBuilder r11 = n4.r.f13869i     // Catch: java.lang.Throwable -> Lc9
            int r11 = r11.length()     // Catch: java.lang.Throwable -> Lc9
            if (r11 != 0) goto L3e
            r11 = r7
            goto L3f
        L3e:
            r11 = r12
        L3f:
            if (r11 == 0) goto L47
            if (r0 != 0) goto L47
            if (r2 != 0) goto L47
            monitor-exit(r10)
            return r1
        L47:
            int r11 = r10.c(r0, r2)     // Catch: java.lang.Throwable -> Lc9
            goto L7a
        L4c:
            byte[] r6 = n4.r.f13865e     // Catch: java.lang.Throwable -> Lc9
            int r8 = r0 + 1
            byte r9 = (byte) r3     // Catch: java.lang.Throwable -> Lc9
            r6[r0] = r9     // Catch: java.lang.Throwable -> Lc9
            if (r3 == r5) goto L5e
            if (r8 == r4) goto L5e
            boolean r0 = n4.r.f13864d     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L5c
            goto L5e
        L5c:
            r0 = r8
            goto L28
        L5e:
            java.nio.ByteBuffer r0 = n4.r.f13867g     // Catch: java.lang.Throwable -> Lc9
            r0.limit(r8)     // Catch: java.lang.Throwable -> Lc9
            java.nio.CharBuffer r3 = n4.r.f13868h     // Catch: java.lang.Throwable -> Lc9
            r3.position(r2)     // Catch: java.lang.Throwable -> Lc9
            int r2 = r10.b(r12)     // Catch: java.lang.Throwable -> Lc9
            if (r2 <= 0) goto Lc3
            char[] r3 = n4.r.f13866f     // Catch: java.lang.Throwable -> Lc9
            int r6 = r2 + (-1)
            char r3 = r3[r6]     // Catch: java.lang.Throwable -> Lc9
            if (r3 != r5) goto Lc3
            r0.position(r12)     // Catch: java.lang.Throwable -> Lc9
            r11 = r2
        L7a:
            if (r11 <= 0) goto L92
            char[] r0 = n4.r.f13866f     // Catch: java.lang.Throwable -> Lc9
            int r1 = r11 + (-1)
            char r1 = r0[r1]     // Catch: java.lang.Throwable -> Lc9
            if (r1 != r5) goto L92
            int r11 = r11 + (-1)
            if (r11 <= 0) goto L92
            int r1 = r11 + (-1)
            char r0 = r0[r1]     // Catch: java.lang.Throwable -> Lc9
            r1 = 13
            if (r0 != r1) goto L92
            int r11 = r11 + (-1)
        L92:
            java.lang.StringBuilder r0 = n4.r.f13869i     // Catch: java.lang.Throwable -> Lc9
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lc9
            if (r1 != 0) goto L9b
            goto L9c
        L9b:
            r7 = r12
        L9c:
            if (r7 == 0) goto La7
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lc9
            char[] r1 = n4.r.f13866f     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r1, r12, r11)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r10)
            return r0
        La7:
            char[] r1 = n4.r.f13866f     // Catch: java.lang.Throwable -> Lc9
            r0.append(r1, r12, r11)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = "sb.toString()"
            u4.l0.o(r11, r1)     // Catch: java.lang.Throwable -> Lc9
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lc9
            if (r1 <= r4) goto Lbe
            r10.f()     // Catch: java.lang.Throwable -> Lc9
        Lbe:
            r0.setLength(r12)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r10)
            return r11
        Lc3:
            int r0 = r10.a()     // Catch: java.lang.Throwable -> Lc9
            goto L28
        Lc9:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.r.d(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }

    public final void e() {
        CharsetDecoder charsetDecoder = f13863c;
        if (charsetDecoder == null) {
            l0.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f13867g.position(0);
        f13869i.setLength(0);
    }

    public final void f() {
        StringBuilder sb = f13869i;
        sb.setLength(32);
        sb.trimToSize();
    }

    public final void g(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        l0.o(newDecoder, "charset.newDecoder()");
        f13863c = newDecoder;
        ByteBuffer byteBuffer = f13867g;
        byteBuffer.clear();
        CharBuffer charBuffer = f13868h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f13863c;
        if (charsetDecoder == null) {
            l0.S("decoder");
            charsetDecoder = null;
        }
        boolean z6 = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z6 = true;
        }
        f13864d = z6;
        e();
    }
}