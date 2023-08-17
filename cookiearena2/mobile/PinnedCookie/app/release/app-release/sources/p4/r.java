package p4;

import f5.u;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import n4.y;
import s2.t0;
import u4.i0;
import u4.l0;
import u4.r1;
import v3.g1;
import v3.m2;
import v3.q2;
@r1({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,326:1\n1#2:327\n1#2:329\n52#3:328\n1295#4,2:330\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n202#1:329\n202#1:328\n202#1:330,2\n*E\n"})
/* loaded from: classes.dex */
public class r {
    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path A(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(iterable, "lines");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(write, "write(this, lines, charset, *options)");
        return write;
    }

    public static /* synthetic */ Path B(Path path, f5.m mVar, Charset charset, OpenOption[] openOptionArr, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(path, "<this>");
        l0.p(mVar, "lines");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        Path write = Files.write(path, u.N(mVar), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }

    public static /* synthetic */ Path C(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(path, "<this>");
        l0.p(iterable, "lines");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(write, "write(this, lines, charset, *options)");
        return write;
    }

    @g1(version = "1.5")
    @q2(markerClass = {f.class})
    public static final void D(@n6.d Path path, @n6.d CharSequence charSequence, @n6.d Charset charset, @n6.d OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(charSequence, "text");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(newOutputStream, "newOutputStream(this, *options)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            n4.c.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            charset = i5.f.f11071b;
        }
        D(path, charSequence, charset, openOptionArr);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final OutputStreamWriter F(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ OutputStreamWriter G(Path path, Charset charset, OpenOption[] openOptionArr, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final void a(Path path, byte[] bArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(bArr, "array");
        Files.write(path, bArr, StandardOpenOption.APPEND);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path b(Path path, f5.m<? extends CharSequence> mVar, Charset charset) throws IOException {
        l0.p(path, "<this>");
        l0.p(mVar, "lines");
        l0.p(charset, "charset");
        Path write = Files.write(path, u.N(mVar), charset, StandardOpenOption.APPEND);
        l0.o(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path c(Path path, Iterable<? extends CharSequence> iterable, Charset charset) throws IOException {
        l0.p(path, "<this>");
        l0.p(iterable, "lines");
        l0.p(charset, "charset");
        Path write = Files.write(path, iterable, charset, StandardOpenOption.APPEND);
        l0.o(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    public static /* synthetic */ Path d(Path path, f5.m mVar, Charset charset, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(path, "<this>");
        l0.p(mVar, "lines");
        l0.p(charset, "charset");
        Path write = Files.write(path, u.N(mVar), charset, StandardOpenOption.APPEND);
        l0.o(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    public static /* synthetic */ Path e(Path path, Iterable iterable, Charset charset, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(path, "<this>");
        l0.p(iterable, "lines");
        l0.p(charset, "charset");
        Path write = Files.write(path, iterable, charset, StandardOpenOption.APPEND);
        l0.o(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    @g1(version = "1.5")
    @q2(markerClass = {f.class})
    public static final void f(@n6.d Path path, @n6.d CharSequence charSequence, @n6.d Charset charset) throws IOException {
        l0.p(path, "<this>");
        l0.p(charSequence, "text");
        l0.p(charset, "charset");
        OutputStream newOutputStream = Files.newOutputStream(path, StandardOpenOption.APPEND);
        l0.o(newOutputStream, "newOutputStream(this, StandardOpenOption.APPEND)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            n4.c.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void g(Path path, CharSequence charSequence, Charset charset, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            charset = i5.f.f11071b;
        }
        f(path, charSequence, charset);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final BufferedReader h(Path path, Charset charset, int i7, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i7);
    }

    public static /* synthetic */ BufferedReader i(Path path, Charset charset, int i7, OpenOption[] openOptionArr, int i8, Object obj) throws IOException {
        if ((i8 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        if ((i8 & 2) != 0) {
            i7 = 8192;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i7);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final BufferedWriter j(Path path, Charset charset, int i7, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i7);
    }

    public static /* synthetic */ BufferedWriter k(Path path, Charset charset, int i7, OpenOption[] openOptionArr, int i8, Object obj) throws IOException {
        if ((i8 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        if ((i8 & 2) != 0) {
            i7 = 8192;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i7);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final void l(Path path, Charset charset, t4.l<? super String, m2> lVar) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(lVar, t0.f16450f);
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        l0.o(newBufferedReader, "newBufferedReader(this, charset)");
        try {
            Iterator<String> it = y.h(newBufferedReader).iterator();
            while (it.hasNext()) {
                lVar.O(it.next());
            }
            m2 m2Var = m2.f17815a;
            i0.d(1);
            n4.c.a(newBufferedReader, null);
            i0.c(1);
        } finally {
        }
    }

    public static /* synthetic */ void m(Path path, Charset charset, t4.l lVar, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(lVar, t0.f16450f);
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        l0.o(newBufferedReader, "newBufferedReader(this, charset)");
        try {
            Iterator<String> it = y.h(newBufferedReader).iterator();
            while (it.hasNext()) {
                lVar.O(it.next());
            }
            m2 m2Var = m2.f17815a;
            i0.d(1);
            n4.c.a(newBufferedReader, null);
            i0.c(1);
        } finally {
        }
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final InputStream n(Path path, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(openOptionArr, "options");
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(newInputStream, "newInputStream(this, *options)");
        return newInputStream;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final OutputStream o(Path path, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(newOutputStream, "newOutputStream(this, *options)");
        return newOutputStream;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final byte[] p(Path path) throws IOException {
        l0.p(path, "<this>");
        byte[] readAllBytes = Files.readAllBytes(path);
        l0.o(readAllBytes, "readAllBytes(this)");
        return readAllBytes;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final List<String> q(Path path, Charset charset) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        List<String> readAllLines = Files.readAllLines(path, charset);
        l0.o(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    public static /* synthetic */ List r(Path path, Charset charset, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        List<String> readAllLines = Files.readAllLines(path, charset);
        l0.o(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {f.class})
    public static final String s(@n6.d Path path, @n6.d Charset charset) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String k7 = y.k(inputStreamReader);
            n4.c.a(inputStreamReader, null);
            return k7;
        } finally {
        }
    }

    public static /* synthetic */ String t(Path path, Charset charset, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        return s(path, charset);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final InputStreamReader u(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ InputStreamReader v(Path path, Charset charset, OpenOption[] openOptionArr, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final <T> T w(Path path, Charset charset, t4.l<? super f5.m<String>, ? extends T> lVar) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(lVar, "block");
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            l0.o(newBufferedReader, "it");
            T O = lVar.O(y.h(newBufferedReader));
            i0.d(1);
            n4.c.a(newBufferedReader, null);
            i0.c(1);
            return O;
        } finally {
        }
    }

    public static /* synthetic */ Object x(Path path, Charset charset, t4.l lVar, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(lVar, "block");
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            l0.o(newBufferedReader, "it");
            Object O = lVar.O(y.h(newBufferedReader));
            i0.d(1);
            n4.c.a(newBufferedReader, null);
            i0.c(1);
            return O;
        } finally {
        }
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final void y(Path path, byte[] bArr, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(bArr, "array");
        l0.p(openOptionArr, "options");
        Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path z(Path path, f5.m<? extends CharSequence> mVar, Charset charset, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(mVar, "lines");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        Path write = Files.write(path, u.N(mVar), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }
}
