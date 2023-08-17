package n4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s2.t0;
import u4.i0;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.m2;

@r1({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n231#1:234\n1#2:233\n1#2:235\n*S KotlinDebug\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n*L\n230#1:234\n230#1:235\n*E\n"})
/* loaded from: classes.dex */
public class o extends n {

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.l<String, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f13858l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<String> arrayList) {
            super(1);
            this.f13858l = arrayList;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(String str) {
            b(str);
            return m2.f17815a;
        }

        public final void b(@n6.d String str) {
            l0.p(str, "it");
            this.f13858l.add(str);
        }
    }

    @k4.f
    public static final InputStreamReader A(File file, Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static /* synthetic */ InputStreamReader B(File file, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T C(@n6.d File file, @n6.d Charset charset, @n6.d t4.l<? super f5.m<String>, ? extends T> lVar) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        l0.p(lVar, "block");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            T O = lVar.O(y.h(bufferedReader));
            i0.d(1);
            c.a(bufferedReader, null);
            i0.c(1);
            return O;
        } finally {
        }
    }

    public static /* synthetic */ Object D(File file, Charset charset, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            Object O = lVar.O(y.h(bufferedReader));
            i0.d(1);
            c.a(bufferedReader, null);
            i0.c(1);
            return O;
        } finally {
        }
    }

    public static final void E(@n6.d File file, @n6.d byte[] bArr) {
        l0.p(file, "<this>");
        l0.p(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            m2 m2Var = m2.f17815a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void F(@n6.d File file, @n6.d String str, @n6.d Charset charset) {
        l0.p(file, "<this>");
        l0.p(str, "text");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        E(file, bytes);
    }

    public static /* synthetic */ void G(File file, String str, Charset charset, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            charset = i5.f.f11071b;
        }
        F(file, str, charset);
    }

    @k4.f
    public static final OutputStreamWriter H(File file, Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static /* synthetic */ OutputStreamWriter I(File file, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void g(@n6.d File file, @n6.d byte[] bArr) {
        l0.p(file, "<this>");
        l0.p(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            m2 m2Var = m2.f17815a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void h(@n6.d File file, @n6.d String str, @n6.d Charset charset) {
        l0.p(file, "<this>");
        l0.p(str, "text");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        g(file, bytes);
    }

    public static /* synthetic */ void i(File file, String str, Charset charset, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            charset = i5.f.f11071b;
        }
        h(file, str, charset);
    }

    @k4.f
    public static final BufferedReader j(File file, Charset charset, int i7) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i7);
    }

    public static /* synthetic */ BufferedReader k(File file, Charset charset, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        if ((i8 & 2) != 0) {
            i7 = 8192;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i7);
    }

    @k4.f
    public static final BufferedWriter l(File file, Charset charset, int i7) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i7);
    }

    public static /* synthetic */ BufferedWriter m(File file, Charset charset, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        if ((i8 & 2) != 0) {
            i7 = 8192;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void n(@n6.d File file, int i7, @n6.d t4.p<? super byte[], ? super Integer, m2> pVar) {
        l0.p(file, "<this>");
        l0.p(pVar, t0.f16450f);
        ?? r22 = new byte[d5.u.u(i7, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(r22);
                if (read <= 0) {
                    m2 m2Var = m2.f17815a;
                    c.a(fileInputStream, null);
                    return;
                }
                pVar.J(r22, Integer.valueOf(read));
            } finally {
            }
        }
    }

    public static final void o(@n6.d File file, @n6.d t4.p<? super byte[], ? super Integer, m2> pVar) {
        l0.p(file, "<this>");
        l0.p(pVar, t0.f16450f);
        n(file, 4096, pVar);
    }

    public static final void p(@n6.d File file, @n6.d Charset charset, @n6.d t4.l<? super String, m2> lVar) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        l0.p(lVar, t0.f16450f);
        y.g(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), lVar);
    }

    public static /* synthetic */ void q(File file, Charset charset, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        p(file, charset, lVar);
    }

    @k4.f
    public static final FileInputStream r(File file) {
        l0.p(file, "<this>");
        return new FileInputStream(file);
    }

    @k4.f
    public static final FileOutputStream s(File file) {
        l0.p(file, "<this>");
        return new FileOutputStream(file);
    }

    @k4.f
    public static final PrintWriter t(File file, Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    public static /* synthetic */ PrintWriter u(File file, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    @n6.d
    public static final byte[] v(@n6.d File file) {
        l0.p(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i7 = (int) length;
            byte[] bArr = new byte[i7];
            int i8 = i7;
            int i9 = 0;
            while (i8 > 0) {
                int read = fileInputStream.read(bArr, i9, i8);
                if (read < 0) {
                    break;
                }
                i8 -= read;
                i9 += read;
            }
            if (i8 > 0) {
                bArr = Arrays.copyOf(bArr, i9);
                l0.o(bArr, "copyOf(this, newSize)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    g gVar = new g(8193);
                    gVar.write(read2);
                    b.l(fileInputStream, gVar, 0, 2, null);
                    int size = gVar.size() + i7;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a7 = gVar.a();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    l0.o(copyOf, "copyOf(this, newSize)");
                    bArr = x3.o.W0(a7, copyOf, i7, 0, gVar.size());
                }
            }
            c.a(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    @n6.d
    public static final List<String> w(@n6.d File file, @n6.d Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        ArrayList arrayList = new ArrayList();
        p(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List x(File file, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        return w(file, charset);
    }

    @n6.d
    public static final String y(@n6.d File file, @n6.d Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String k7 = y.k(inputStreamReader);
            c.a(inputStreamReader, null);
            return k7;
        } finally {
        }
    }

    public static /* synthetic */ String z(File file, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        return y(file, charset);
    }
}