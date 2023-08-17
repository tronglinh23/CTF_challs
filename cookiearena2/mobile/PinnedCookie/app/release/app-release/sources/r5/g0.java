package r5;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import u4.l0;
import v3.b1;
/* loaded from: classes.dex */
public abstract class g0 implements Closeable {

    /* renamed from: l */
    public static final b f15882l = new b(null);

    /* renamed from: k */
    public Reader f15883k;

    /* loaded from: classes.dex */
    public static final class a extends Reader {

        /* renamed from: k */
        public boolean f15884k;

        /* renamed from: l */
        public Reader f15885l;

        /* renamed from: m */
        public final i6.o f15886m;

        /* renamed from: n */
        public final Charset f15887n;

        public a(@n6.d i6.o oVar, @n6.d Charset charset) {
            l0.p(oVar, "source");
            l0.p(charset, "charset");
            this.f15886m = oVar;
            this.f15887n = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f15884k = true;
            Reader reader = this.f15885l;
            if (reader != null) {
                reader.close();
            } else {
                this.f15886m.close();
            }
        }

        @Override // java.io.Reader
        public int read(@n6.d char[] cArr, int i7, int i8) throws IOException {
            l0.p(cArr, "cbuf");
            if (this.f15884k) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f15885l;
            if (reader == null) {
                reader = new InputStreamReader(this.f15886m.S0(), s5.d.P(this.f15886m, this.f15887n));
                this.f15885l = reader;
            }
            return reader.read(cArr, i7, i8);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* loaded from: classes.dex */
        public static final class a extends g0 {

            /* renamed from: m */
            public final /* synthetic */ i6.o f15888m;

            /* renamed from: n */
            public final /* synthetic */ x f15889n;

            /* renamed from: o */
            public final /* synthetic */ long f15890o;

            public a(i6.o oVar, x xVar, long j7) {
                this.f15888m = oVar;
                this.f15889n = xVar;
                this.f15890o = j7;
            }

            @Override // r5.g0
            @n6.d
            public i6.o I() {
                return this.f15888m;
            }

            @Override // r5.g0
            public long i() {
                return this.f15890o;
            }

            @Override // r5.g0
            @n6.e
            public x k() {
                return this.f15889n;
            }
        }

        public b() {
        }

        public static /* synthetic */ g0 i(b bVar, i6.o oVar, x xVar, long j7, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                xVar = null;
            }
            if ((i7 & 2) != 0) {
                j7 = -1;
            }
            return bVar.a(oVar, xVar, j7);
        }

        public static /* synthetic */ g0 j(b bVar, i6.p pVar, x xVar, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                xVar = null;
            }
            return bVar.b(pVar, xVar);
        }

        public static /* synthetic */ g0 k(b bVar, String str, x xVar, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                xVar = null;
            }
            return bVar.c(str, xVar);
        }

        public static /* synthetic */ g0 l(b bVar, byte[] bArr, x xVar, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                xVar = null;
            }
            return bVar.h(bArr, xVar);
        }

        @s4.h(name = "create")
        @n6.d
        @s4.m
        public final g0 a(@n6.d i6.o oVar, @n6.e x xVar, long j7) {
            l0.p(oVar, "$this$asResponseBody");
            return new a(oVar, xVar, j7);
        }

        @s4.h(name = "create")
        @n6.d
        @s4.m
        public final g0 b(@n6.d i6.p pVar, @n6.e x xVar) {
            l0.p(pVar, "$this$toResponseBody");
            return a(new i6.m().K(pVar), xVar, pVar.c0());
        }

        @s4.h(name = "create")
        @n6.d
        @s4.m
        public final g0 c(@n6.d String str, @n6.e x xVar) {
            l0.p(str, "$this$toResponseBody");
            Charset charset = i5.f.f11071b;
            if (xVar != null) {
                Charset g7 = x.g(xVar, null, 1, null);
                if (g7 == null) {
                    xVar = x.f16088i.d(xVar + "; charset=utf-8");
                } else {
                    charset = g7;
                }
            }
            i6.m y6 = new i6.m().y(str, charset);
            return a(y6, xVar, y6.a1());
        }

        @n6.d
        @s4.m
        @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        public final g0 d(@n6.e x xVar, long j7, @n6.d i6.o oVar) {
            l0.p(oVar, "content");
            return a(oVar, xVar, j7);
        }

        @n6.d
        @s4.m
        @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        public final g0 e(@n6.e x xVar, @n6.d i6.p pVar) {
            l0.p(pVar, "content");
            return b(pVar, xVar);
        }

        @n6.d
        @s4.m
        @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        public final g0 f(@n6.e x xVar, @n6.d String str) {
            l0.p(str, "content");
            return c(str, xVar);
        }

        @n6.d
        @s4.m
        @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        public final g0 g(@n6.e x xVar, @n6.d byte[] bArr) {
            l0.p(bArr, "content");
            return h(bArr, xVar);
        }

        @s4.h(name = "create")
        @n6.d
        @s4.m
        public final g0 h(@n6.d byte[] bArr, @n6.e x xVar) {
            l0.p(bArr, "$this$toResponseBody");
            return a(new i6.m().k0(bArr), xVar, bArr.length);
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    @n6.d
    @s4.m
    @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    public static final g0 A(@n6.e x xVar, @n6.d String str) {
        return f15882l.f(xVar, str);
    }

    @n6.d
    @s4.m
    @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    public static final g0 C(@n6.e x xVar, @n6.d byte[] bArr) {
        return f15882l.g(xVar, bArr);
    }

    @s4.h(name = "create")
    @n6.d
    @s4.m
    public static final g0 E(@n6.d byte[] bArr, @n6.e x xVar) {
        return f15882l.h(bArr, xVar);
    }

    @s4.h(name = "create")
    @n6.d
    @s4.m
    public static final g0 l(@n6.d i6.o oVar, @n6.e x xVar, long j7) {
        return f15882l.a(oVar, xVar, j7);
    }

    @s4.h(name = "create")
    @n6.d
    @s4.m
    public static final g0 m(@n6.d i6.p pVar, @n6.e x xVar) {
        return f15882l.b(pVar, xVar);
    }

    @s4.h(name = "create")
    @n6.d
    @s4.m
    public static final g0 p(@n6.d String str, @n6.e x xVar) {
        return f15882l.c(str, xVar);
    }

    @n6.d
    @s4.m
    @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    public static final g0 t(@n6.e x xVar, long j7, @n6.d i6.o oVar) {
        return f15882l.d(xVar, j7, oVar);
    }

    @n6.d
    @s4.m
    @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    public static final g0 u(@n6.e x xVar, @n6.d i6.p pVar) {
        return f15882l.e(xVar, pVar);
    }

    @n6.d
    public abstract i6.o I();

    @n6.d
    public final String L() throws IOException {
        i6.o I = I();
        try {
            String R0 = I.R0(s5.d.P(I, f()));
            n4.c.a(I, null);
            return R0;
        } finally {
        }
    }

    @n6.d
    public final InputStream a() {
        return I().S0();
    }

    @n6.d
    public final i6.p b() throws IOException {
        long i7 = i();
        if (i7 > Integer.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + i7);
        }
        i6.o I = I();
        try {
            i6.p x6 = I.x();
            n4.c.a(I, null);
            int c02 = x6.c0();
            if (i7 == -1 || i7 == c02) {
                return x6;
            }
            throw new IOException("Content-Length (" + i7 + ") and stream length (" + c02 + ") disagree");
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        s5.d.l(I());
    }

    @n6.d
    public final byte[] d() throws IOException {
        long i7 = i();
        if (i7 > Integer.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + i7);
        }
        i6.o I = I();
        try {
            byte[] V = I.V();
            n4.c.a(I, null);
            int length = V.length;
            if (i7 == -1 || i7 == length) {
                return V;
            }
            throw new IOException("Content-Length (" + i7 + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @n6.d
    public final Reader e() {
        Reader reader = this.f15883k;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(I(), f());
        this.f15883k = aVar;
        return aVar;
    }

    public final Charset f() {
        Charset f7;
        x k7 = k();
        return (k7 == null || (f7 = k7.f(i5.f.f11071b)) == null) ? i5.f.f11071b : f7;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    public final <T> T h(t4.l<? super i6.o, ? extends T> lVar, t4.l<? super T, Integer> lVar2) {
        long i7 = i();
        if (i7 > Integer.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + i7);
        }
        i6.o I = I();
        try {
            T O = lVar.O(I);
            u4.i0.d(1);
            n4.c.a(I, null);
            u4.i0.c(1);
            int intValue = lVar2.O(O).intValue();
            if (i7 == -1 || i7 == intValue) {
                return O;
            }
            throw new IOException("Content-Length (" + i7 + ") and stream length (" + intValue + ") disagree");
        } finally {
        }
    }

    public abstract long i();

    @n6.e
    public abstract x k();
}
