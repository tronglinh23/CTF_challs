package b3;

import d.o0;
import d.q0;
import d.w0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import v3.t1;

@w0(19)
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f7182a = 8;

    /* renamed from: b  reason: collision with root package name */
    public static final int f7183b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f7184c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f7185d = 4;

    public static int a(int i7) {
        return (((i7 + 8) - 1) & (-8)) / 8;
    }

    public static byte[] b(@o0 byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    @o0
    public static RuntimeException c(@q0 String str) {
        return new IllegalStateException(str);
    }

    @o0
    public static byte[] d(@o0 InputStream inputStream, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int read = inputStream.read(bArr, i8, i7 - i8);
            if (read < 0) {
                throw c("Not enough bytes to read: " + i7);
            }
            i8 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r0.finished() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        throw c("Inflater did not finish");
     */
    @d.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] e(@d.o0 java.io.InputStream r8, int r9, int r10) throws java.io.IOException {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L84
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L84
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L53
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L53
            if (r4 >= r9) goto L53
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L84
            if (r6 < 0) goto L38
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L84
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L84
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L84
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L38:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r8.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L84
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L84
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L53:
            if (r4 != r9) goto L66
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L5f
            r0.end()
            return r1
        L5f:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L66:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r8.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L84
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            r8.append(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L84
            java.lang.RuntimeException r8 = c(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L84:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.c.e(java.io.InputStream, int, int):byte[]");
    }

    @o0
    public static String f(InputStream inputStream, int i7) throws IOException {
        return new String(d(inputStream, i7), StandardCharsets.UTF_8);
    }

    public static long g(@o0 InputStream inputStream, int i7) throws IOException {
        byte[] d7 = d(inputStream, i7);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 += (d7[i8] & t1.f17828n) << (i8 * 8);
        }
        return j7;
    }

    public static int h(@o0 InputStream inputStream) throws IOException {
        return (int) g(inputStream, 2);
    }

    public static long i(@o0 InputStream inputStream) throws IOException {
        return g(inputStream, 4);
    }

    public static int j(@o0 InputStream inputStream) throws IOException {
        return (int) g(inputStream, 1);
    }

    public static int k(@o0 String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void l(@o0 InputStream inputStream, @o0 OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static void m(@o0 OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, bArr.length);
        byte[] b7 = b(bArr);
        q(outputStream, b7.length);
        outputStream.write(b7);
    }

    public static void n(@o0 OutputStream outputStream, @o0 String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void o(@o0 OutputStream outputStream, long j7, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j7 >> (i8 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void p(@o0 OutputStream outputStream, int i7) throws IOException {
        o(outputStream, i7, 2);
    }

    public static void q(@o0 OutputStream outputStream, long j7) throws IOException {
        o(outputStream, j7, 4);
    }

    public static void r(@o0 OutputStream outputStream, int i7) throws IOException {
        o(outputStream, i7, 1);
    }
}