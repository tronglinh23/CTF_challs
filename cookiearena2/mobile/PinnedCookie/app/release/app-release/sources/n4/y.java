package n4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s2.t0;
import u4.i0;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.m2;
@s4.h(name = "TextStreamsKt")
@r1({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1295#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
/* loaded from: classes.dex */
public final class y {

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.l<String, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f13877l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<String> arrayList) {
            super(1);
            this.f13877l = arrayList;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(String str) {
            b(str);
            return m2.f17815a;
        }

        public final void b(@n6.d String str) {
            l0.p(str, "it");
            this.f13877l.add(str);
        }
    }

    @k4.f
    public static final BufferedReader a(Reader reader, int i7) {
        l0.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i7);
    }

    @k4.f
    public static final BufferedWriter b(Writer writer, int i7) {
        l0.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i7);
    }

    public static /* synthetic */ BufferedReader c(Reader reader, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 8192;
        }
        l0.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i7);
    }

    public static /* synthetic */ BufferedWriter d(Writer writer, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 8192;
        }
        l0.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i7);
    }

    public static final long e(@n6.d Reader reader, @n6.d Writer writer, int i7) {
        l0.p(reader, "<this>");
        l0.p(writer, "out");
        char[] cArr = new char[i7];
        int read = reader.read(cArr);
        long j7 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j7 += read;
            read = reader.read(cArr);
        }
        return j7;
    }

    public static /* synthetic */ long f(Reader reader, Writer writer, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 8192;
        }
        return e(reader, writer, i7);
    }

    public static final void g(@n6.d Reader reader, @n6.d t4.l<? super String, m2> lVar) {
        l0.p(reader, "<this>");
        l0.p(lVar, t0.f16450f);
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = h(bufferedReader).iterator();
            while (it.hasNext()) {
                lVar.O(it.next());
            }
            m2 m2Var = m2.f17815a;
            c.a(bufferedReader, null);
        } finally {
        }
    }

    @n6.d
    public static final f5.m<String> h(@n6.d BufferedReader bufferedReader) {
        l0.p(bufferedReader, "<this>");
        return f5.s.f(new s(bufferedReader));
    }

    @n6.d
    public static final byte[] i(@n6.d URL url) {
        l0.p(url, "<this>");
        InputStream openStream = url.openStream();
        try {
            l0.o(openStream, "it");
            byte[] p6 = b.p(openStream);
            c.a(openStream, null);
            return p6;
        } finally {
        }
    }

    @n6.d
    public static final List<String> j(@n6.d Reader reader) {
        l0.p(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        g(reader, new a(arrayList));
        return arrayList;
    }

    @n6.d
    public static final String k(@n6.d Reader reader) {
        l0.p(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        f(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        l0.o(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    @k4.f
    public static final String l(URL url, Charset charset) {
        l0.p(url, "<this>");
        l0.p(charset, "charset");
        return new String(i(url), charset);
    }

    public static /* synthetic */ String m(URL url, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        l0.p(url, "<this>");
        l0.p(charset, "charset");
        return new String(i(url), charset);
    }

    @k4.f
    public static final StringReader n(String str) {
        l0.p(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T o(@n6.d Reader reader, @n6.d t4.l<? super f5.m<String>, ? extends T> lVar) {
        l0.p(reader, "<this>");
        l0.p(lVar, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T O = lVar.O(h(bufferedReader));
            i0.d(1);
            c.a(bufferedReader, null);
            i0.c(1);
            return O;
        } finally {
        }
    }
}
