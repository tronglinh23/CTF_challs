package r5;

import i6.o0;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import u4.l0;
import v3.b1;
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a */
    public static final a f15835a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: r5.e0$a$a */
        /* loaded from: classes.dex */
        public static final class C0232a extends e0 {

            /* renamed from: b */
            public final /* synthetic */ File f15836b;

            /* renamed from: c */
            public final /* synthetic */ x f15837c;

            public C0232a(File file, x xVar) {
                this.f15836b = file;
                this.f15837c = xVar;
            }

            @Override // r5.e0
            public long a() {
                return this.f15836b.length();
            }

            @Override // r5.e0
            @n6.e
            public x b() {
                return this.f15837c;
            }

            @Override // r5.e0
            public void r(@n6.d i6.n nVar) {
                l0.p(nVar, "sink");
                o0 l7 = i6.a0.l(this.f15836b);
                try {
                    nVar.B(l7);
                    n4.c.a(l7, null);
                } finally {
                }
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends e0 {

            /* renamed from: b */
            public final /* synthetic */ i6.p f15838b;

            /* renamed from: c */
            public final /* synthetic */ x f15839c;

            public b(i6.p pVar, x xVar) {
                this.f15838b = pVar;
                this.f15839c = xVar;
            }

            @Override // r5.e0
            public long a() {
                return this.f15838b.c0();
            }

            @Override // r5.e0
            @n6.e
            public x b() {
                return this.f15839c;
            }

            @Override // r5.e0
            public void r(@n6.d i6.n nVar) {
                l0.p(nVar, "sink");
                nVar.K(this.f15838b);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends e0 {

            /* renamed from: b */
            public final /* synthetic */ byte[] f15840b;

            /* renamed from: c */
            public final /* synthetic */ x f15841c;

            /* renamed from: d */
            public final /* synthetic */ int f15842d;

            /* renamed from: e */
            public final /* synthetic */ int f15843e;

            public c(byte[] bArr, x xVar, int i7, int i8) {
                this.f15840b = bArr;
                this.f15841c = xVar;
                this.f15842d = i7;
                this.f15843e = i8;
            }

            @Override // r5.e0
            public long a() {
                return this.f15842d;
            }

            @Override // r5.e0
            @n6.e
            public x b() {
                return this.f15841c;
            }

            @Override // r5.e0
            public void r(@n6.d i6.n nVar) {
                l0.p(nVar, "sink");
                nVar.n(this.f15840b, this.f15843e, this.f15842d);
            }
        }

        public a() {
        }

        public static /* synthetic */ e0 n(a aVar, i6.p pVar, x xVar, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                xVar = null;
            }
            return aVar.a(pVar, xVar);
        }

        public static /* synthetic */ e0 o(a aVar, File file, x xVar, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                xVar = null;
            }
            return aVar.b(file, xVar);
        }

        public static /* synthetic */ e0 p(a aVar, String str, x xVar, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                xVar = null;
            }
            return aVar.c(str, xVar);
        }

        public static /* synthetic */ e0 q(a aVar, x xVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
            if ((i9 & 4) != 0) {
                i7 = 0;
            }
            if ((i9 & 8) != 0) {
                i8 = bArr.length;
            }
            return aVar.i(xVar, bArr, i7, i8);
        }

        public static /* synthetic */ e0 r(a aVar, byte[] bArr, x xVar, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                xVar = null;
            }
            if ((i9 & 2) != 0) {
                i7 = 0;
            }
            if ((i9 & 4) != 0) {
                i8 = bArr.length;
            }
            return aVar.m(bArr, xVar, i7, i8);
        }

        @s4.h(name = "create")
        @n6.d
        @s4.m
        public final e0 a(@n6.d i6.p pVar, @n6.e x xVar) {
            l0.p(pVar, "$this$toRequestBody");
            return new b(pVar, xVar);
        }

        @s4.h(name = "create")
        @n6.d
        @s4.m
        public final e0 b(@n6.d File file, @n6.e x xVar) {
            l0.p(file, "$this$asRequestBody");
            return new C0232a(file, xVar);
        }

        @s4.h(name = "create")
        @n6.d
        @s4.m
        public final e0 c(@n6.d String str, @n6.e x xVar) {
            l0.p(str, "$this$toRequestBody");
            Charset charset = i5.f.f11071b;
            if (xVar != null) {
                Charset g7 = x.g(xVar, null, 1, null);
                if (g7 == null) {
                    xVar = x.f16088i.d(xVar + "; charset=utf-8");
                } else {
                    charset = g7;
                }
            }
            byte[] bytes = str.getBytes(charset);
            l0.o(bytes, "(this as java.lang.String).getBytes(charset)");
            return m(bytes, xVar, 0, bytes.length);
        }

        @n6.d
        @s4.m
        @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final e0 d(@n6.e x xVar, @n6.d i6.p pVar) {
            l0.p(pVar, "content");
            return a(pVar, xVar);
        }

        @n6.d
        @s4.m
        @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @b1(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        public final e0 e(@n6.e x xVar, @n6.d File file) {
            l0.p(file, "file");
            return b(file, xVar);
        }

        @n6.d
        @s4.m
        @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final e0 f(@n6.e x xVar, @n6.d String str) {
            l0.p(str, "content");
            return c(str, xVar);
        }

        @s4.i
        @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @n6.d
        @s4.m
        public final e0 g(@n6.e x xVar, @n6.d byte[] bArr) {
            return q(this, xVar, bArr, 0, 0, 12, null);
        }

        @s4.i
        @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @n6.d
        @s4.m
        public final e0 h(@n6.e x xVar, @n6.d byte[] bArr, int i7) {
            return q(this, xVar, bArr, i7, 0, 8, null);
        }

        @s4.i
        @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @n6.d
        @s4.m
        public final e0 i(@n6.e x xVar, @n6.d byte[] bArr, int i7, int i8) {
            l0.p(bArr, "content");
            return m(bArr, xVar, i7, i8);
        }

        @s4.h(name = "create")
        @s4.i
        @n6.d
        @s4.m
        public final e0 j(@n6.d byte[] bArr) {
            return r(this, bArr, null, 0, 0, 7, null);
        }

        @s4.h(name = "create")
        @s4.i
        @n6.d
        @s4.m
        public final e0 k(@n6.d byte[] bArr, @n6.e x xVar) {
            return r(this, bArr, xVar, 0, 0, 6, null);
        }

        @s4.h(name = "create")
        @s4.i
        @n6.d
        @s4.m
        public final e0 l(@n6.d byte[] bArr, @n6.e x xVar, int i7) {
            return r(this, bArr, xVar, i7, 0, 4, null);
        }

        @s4.h(name = "create")
        @s4.i
        @n6.d
        @s4.m
        public final e0 m(@n6.d byte[] bArr, @n6.e x xVar, int i7, int i8) {
            l0.p(bArr, "$this$toRequestBody");
            s5.d.k(bArr.length, i7, i8);
            return new c(bArr, xVar, i8, i7);
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    @s4.h(name = "create")
    @n6.d
    @s4.m
    public static final e0 c(@n6.d i6.p pVar, @n6.e x xVar) {
        return f15835a.a(pVar, xVar);
    }

    @s4.h(name = "create")
    @n6.d
    @s4.m
    public static final e0 d(@n6.d File file, @n6.e x xVar) {
        return f15835a.b(file, xVar);
    }

    @s4.h(name = "create")
    @n6.d
    @s4.m
    public static final e0 e(@n6.d String str, @n6.e x xVar) {
        return f15835a.c(str, xVar);
    }

    @n6.d
    @s4.m
    @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final e0 f(@n6.e x xVar, @n6.d i6.p pVar) {
        return f15835a.d(xVar, pVar);
    }

    @n6.d
    @s4.m
    @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @b1(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    public static final e0 g(@n6.e x xVar, @n6.d File file) {
        return f15835a.e(xVar, file);
    }

    @n6.d
    @s4.m
    @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final e0 h(@n6.e x xVar, @n6.d String str) {
        return f15835a.f(xVar, str);
    }

    @s4.i
    @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @n6.d
    @s4.m
    public static final e0 i(@n6.e x xVar, @n6.d byte[] bArr) {
        return a.q(f15835a, xVar, bArr, 0, 0, 12, null);
    }

    @s4.i
    @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @n6.d
    @s4.m
    public static final e0 j(@n6.e x xVar, @n6.d byte[] bArr, int i7) {
        return a.q(f15835a, xVar, bArr, i7, 0, 8, null);
    }

    @s4.i
    @v3.k(level = v3.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @n6.d
    @s4.m
    public static final e0 k(@n6.e x xVar, @n6.d byte[] bArr, int i7, int i8) {
        return f15835a.i(xVar, bArr, i7, i8);
    }

    @s4.h(name = "create")
    @s4.i
    @n6.d
    @s4.m
    public static final e0 l(@n6.d byte[] bArr) {
        return a.r(f15835a, bArr, null, 0, 0, 7, null);
    }

    @s4.h(name = "create")
    @s4.i
    @n6.d
    @s4.m
    public static final e0 m(@n6.d byte[] bArr, @n6.e x xVar) {
        return a.r(f15835a, bArr, xVar, 0, 0, 6, null);
    }

    @s4.h(name = "create")
    @s4.i
    @n6.d
    @s4.m
    public static final e0 n(@n6.d byte[] bArr, @n6.e x xVar, int i7) {
        return a.r(f15835a, bArr, xVar, i7, 0, 4, null);
    }

    @s4.h(name = "create")
    @s4.i
    @n6.d
    @s4.m
    public static final e0 o(@n6.d byte[] bArr, @n6.e x xVar, int i7, int i8) {
        return f15835a.m(bArr, xVar, i7, i8);
    }

    public long a() throws IOException {
        return -1L;
    }

    @n6.e
    public abstract x b();

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(@n6.d i6.n nVar) throws IOException;
}
