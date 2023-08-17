package n4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import u4.l0;
import v3.b1;
import v3.g1;

@s4.h(name = "ByteStreamsKt")
/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends x3.s {

        /* renamed from: k  reason: collision with root package name */
        public int f13822k = -1;

        /* renamed from: l  reason: collision with root package name */
        public boolean f13823l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f13824m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ BufferedInputStream f13825n;

        public a(BufferedInputStream bufferedInputStream) {
            this.f13825n = bufferedInputStream;
        }

        @Override // x3.s
        public byte b() {
            i();
            if (this.f13824m) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b7 = (byte) this.f13822k;
            this.f13823l = false;
            return b7;
        }

        public final boolean d() {
            return this.f13824m;
        }

        public final int f() {
            return this.f13822k;
        }

        public final boolean g() {
            return this.f13823l;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            i();
            return !this.f13824m;
        }

        public final void i() {
            if (this.f13823l || this.f13824m) {
                return;
            }
            int read = this.f13825n.read();
            this.f13822k = read;
            this.f13823l = true;
            this.f13824m = read == -1;
        }

        public final void j(boolean z6) {
            this.f13824m = z6;
        }

        public final void k(int i7) {
            this.f13822k = i7;
        }

        public final void l(boolean z6) {
            this.f13823l = z6;
        }
    }

    @k4.f
    public static final BufferedInputStream a(InputStream inputStream, int i7) {
        l0.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i7);
    }

    @k4.f
    public static final BufferedOutputStream b(OutputStream outputStream, int i7) {
        l0.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i7);
    }

    public static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 8192;
        }
        l0.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i7);
    }

    public static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 8192;
        }
        l0.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i7);
    }

    @k4.f
    public static final BufferedReader e(InputStream inputStream, Charset charset) {
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    public static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @k4.f
    public static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    public static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    @k4.f
    public static final ByteArrayInputStream i(String str, Charset charset) {
        l0.p(str, "<this>");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    public static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(str, "<this>");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long k(@n6.d InputStream inputStream, @n6.d OutputStream outputStream, int i7) {
        l0.p(inputStream, "<this>");
        l0.p(outputStream, "out");
        byte[] bArr = new byte[i7];
        int read = inputStream.read(bArr);
        long j7 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j7 += read;
            read = inputStream.read(bArr);
        }
        return j7;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 8192;
        }
        return k(inputStream, outputStream, i7);
    }

    @k4.f
    public static final ByteArrayInputStream m(byte[] bArr) {
        l0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @k4.f
    public static final ByteArrayInputStream n(byte[] bArr, int i7, int i8) {
        l0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i7, i8);
    }

    @n6.d
    public static final x3.s o(@n6.d BufferedInputStream bufferedInputStream) {
        l0.p(bufferedInputStream, "<this>");
        return new a(bufferedInputStream);
    }

    @g1(version = "1.3")
    @n6.d
    public static final byte[] p(@n6.d InputStream inputStream) {
        l0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l0.o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @n6.d
    @v3.k(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @b1(expression = "readBytes()", imports = {}))
    @v3.l(errorSince = "1.5", warningSince = "1.3")
    public static final byte[] q(@n6.d InputStream inputStream, int i7) {
        l0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i7, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l0.o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 8192;
        }
        return q(inputStream, i7);
    }

    @k4.f
    public static final InputStreamReader s(InputStream inputStream, Charset charset) {
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    public static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @k4.f
    public static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}