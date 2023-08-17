package r5;

import i0.x2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import r5.e0;
import r5.u;
import r5.x;
import u4.l0;
import v3.b1;
/* loaded from: classes.dex */
public final class y extends e0 {
    @n6.d
    @s4.e

    /* renamed from: g  reason: collision with root package name */
    public static final x f16093g;
    @n6.d
    @s4.e

    /* renamed from: h  reason: collision with root package name */
    public static final x f16094h;
    @n6.d
    @s4.e

    /* renamed from: i  reason: collision with root package name */
    public static final x f16095i;
    @n6.d
    @s4.e

    /* renamed from: j  reason: collision with root package name */
    public static final x f16096j;
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public static final x f16097k;

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f16098l;

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f16099m;

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f16100n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f16101o = new b(null);

    /* renamed from: b  reason: collision with root package name */
    public final x f16102b;

    /* renamed from: c  reason: collision with root package name */
    public long f16103c;

    /* renamed from: d  reason: collision with root package name */
    public final i6.p f16104d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final x f16105e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final List<c> f16106f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final i6.p f16107a;

        /* renamed from: b  reason: collision with root package name */
        public x f16108b;

        /* renamed from: c  reason: collision with root package name */
        public final List<c> f16109c;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, u4.w] */
        @s4.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a() {
            /*
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.y.a.<init>():void");
        }

        @n6.d
        public final a a(@n6.d String str, @n6.d String str2) {
            l0.p(str, "name");
            l0.p(str2, "value");
            d(c.f16110c.c(str, str2));
            return this;
        }

        @n6.d
        public final a b(@n6.d String str, @n6.e String str2, @n6.d e0 e0Var) {
            l0.p(str, "name");
            l0.p(e0Var, y0.c.f18717e);
            d(c.f16110c.d(str, str2, e0Var));
            return this;
        }

        @n6.d
        public final a c(@n6.e u uVar, @n6.d e0 e0Var) {
            l0.p(e0Var, y0.c.f18717e);
            d(c.f16110c.a(uVar, e0Var));
            return this;
        }

        @n6.d
        public final a d(@n6.d c cVar) {
            l0.p(cVar, "part");
            this.f16109c.add(cVar);
            return this;
        }

        @n6.d
        public final a e(@n6.d e0 e0Var) {
            l0.p(e0Var, y0.c.f18717e);
            d(c.f16110c.b(e0Var));
            return this;
        }

        @n6.d
        public final y f() {
            if ((!this.f16109c.isEmpty()) == true) {
                return new y(this.f16107a, this.f16108b, s5.d.c0(this.f16109c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @n6.d
        public final a g(@n6.d x xVar) {
            l0.p(xVar, "type");
            if (l0.g(xVar.l(), "multipart")) {
                this.f16108b = xVar;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + xVar).toString());
        }

        @s4.i
        public a(@n6.d String str) {
            l0.p(str, "boundary");
            this.f16107a = i6.p.f11252p.l(str);
            this.f16108b = y.f16093g;
            this.f16109c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ a(java.lang.String r1, int r2, u4.w r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                u4.l0.o(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.y.a.<init>(java.lang.String, int, u4.w):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public final void a(@n6.d StringBuilder sb, @n6.d String str) {
            l0.p(sb, "$this$appendQuotedString");
            l0.p(str, x2.f10960j);
            sb.append(i5.h0.f11093b);
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = str.charAt(i7);
                if (charAt == '\n') {
                    sb.append("%0A");
                } else if (charAt == '\r') {
                    sb.append("%0D");
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append(i5.h0.f11093b);
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f16110c = new a(null);
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public final u f16111a;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public final e0 f16112b;

        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            @n6.d
            @s4.m
            public final c a(@n6.e u uVar, @n6.d e0 e0Var) {
                l0.p(e0Var, y0.c.f18717e);
                u4.w wVar = null;
                if ((uVar != null ? uVar.d("Content-Type") : null) == null) {
                    if ((uVar != null ? uVar.d("Content-Length") : null) == null) {
                        return new c(uVar, e0Var, wVar);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            @n6.d
            @s4.m
            public final c b(@n6.d e0 e0Var) {
                l0.p(e0Var, y0.c.f18717e);
                return a(null, e0Var);
            }

            @n6.d
            @s4.m
            public final c c(@n6.d String str, @n6.d String str2) {
                l0.p(str, "name");
                l0.p(str2, "value");
                return d(str, null, e0.a.p(e0.f15835a, str2, null, 1, null));
            }

            @n6.d
            @s4.m
            public final c d(@n6.d String str, @n6.e String str2, @n6.d e0 e0Var) {
                l0.p(str, "name");
                l0.p(e0Var, y0.c.f18717e);
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                b bVar = y.f16101o;
                bVar.a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    bVar.a(sb, str2);
                }
                String sb2 = sb.toString();
                l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
                return a(new u.a().h("Content-Disposition", sb2).i(), e0Var);
            }

            public /* synthetic */ a(u4.w wVar) {
                this();
            }
        }

        public c(u uVar, e0 e0Var) {
            this.f16111a = uVar;
            this.f16112b = e0Var;
        }

        @n6.d
        @s4.m
        public static final c d(@n6.e u uVar, @n6.d e0 e0Var) {
            return f16110c.a(uVar, e0Var);
        }

        @n6.d
        @s4.m
        public static final c e(@n6.d e0 e0Var) {
            return f16110c.b(e0Var);
        }

        @n6.d
        @s4.m
        public static final c f(@n6.d String str, @n6.d String str2) {
            return f16110c.c(str, str2);
        }

        @n6.d
        @s4.m
        public static final c g(@n6.d String str, @n6.e String str2, @n6.d e0 e0Var) {
            return f16110c.d(str, str2, e0Var);
        }

        @s4.h(name = "-deprecated_body")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = y0.c.f18717e, imports = {}))
        public final e0 a() {
            return this.f16112b;
        }

        @s4.h(name = "-deprecated_headers")
        @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "headers", imports = {}))
        @n6.e
        public final u b() {
            return this.f16111a;
        }

        @s4.h(name = y0.c.f18717e)
        @n6.d
        public final e0 c() {
            return this.f16112b;
        }

        @s4.h(name = "headers")
        @n6.e
        public final u h() {
            return this.f16111a;
        }

        public /* synthetic */ c(u uVar, e0 e0Var, u4.w wVar) {
            this(uVar, e0Var);
        }
    }

    static {
        x.a aVar = x.f16088i;
        f16093g = aVar.c("multipart/mixed");
        f16094h = aVar.c("multipart/alternative");
        f16095i = aVar.c("multipart/digest");
        f16096j = aVar.c("multipart/parallel");
        f16097k = aVar.c("multipart/form-data");
        f16098l = new byte[]{(byte) 58, (byte) 32};
        f16099m = new byte[]{(byte) 13, (byte) 10};
        byte b7 = (byte) 45;
        f16100n = new byte[]{b7, b7};
    }

    public y(@n6.d i6.p pVar, @n6.d x xVar, @n6.d List<c> list) {
        l0.p(pVar, "boundaryByteString");
        l0.p(xVar, "type");
        l0.p(list, "parts");
        this.f16104d = pVar;
        this.f16105e = xVar;
        this.f16106f = list;
        this.f16102b = x.f16088i.c(xVar + "; boundary=" + w());
        this.f16103c = -1L;
    }

    @s4.h(name = "type")
    @n6.d
    public final x A() {
        return this.f16105e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long B(i6.n nVar, boolean z6) throws IOException {
        i6.m mVar;
        if (z6) {
            nVar = new i6.m();
            mVar = nVar;
        } else {
            mVar = 0;
        }
        int size = this.f16106f.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            c cVar = this.f16106f.get(i7);
            u h7 = cVar.h();
            e0 c7 = cVar.c();
            l0.m(nVar);
            nVar.k0(f16100n);
            nVar.K(this.f16104d);
            nVar.k0(f16099m);
            if (h7 != null) {
                int size2 = h7.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    nVar.H0(h7.i(i8)).k0(f16098l).H0(h7.o(i8)).k0(f16099m);
                }
            }
            x b7 = c7.b();
            if (b7 != null) {
                nVar.H0("Content-Type: ").H0(b7.toString()).k0(f16099m);
            }
            long a7 = c7.a();
            if (a7 != -1) {
                nVar.H0("Content-Length: ").J0(a7).k0(f16099m);
            } else if (z6) {
                l0.m(mVar);
                mVar.l();
                return -1L;
            }
            byte[] bArr = f16099m;
            nVar.k0(bArr);
            if (z6) {
                j7 += a7;
            } else {
                c7.r(nVar);
            }
            nVar.k0(bArr);
        }
        l0.m(nVar);
        byte[] bArr2 = f16100n;
        nVar.k0(bArr2);
        nVar.K(this.f16104d);
        nVar.k0(bArr2);
        nVar.k0(f16099m);
        if (z6) {
            l0.m(mVar);
            long a12 = j7 + mVar.a1();
            mVar.l();
            return a12;
        }
        return j7;
    }

    @Override // r5.e0
    public long a() throws IOException {
        long j7 = this.f16103c;
        if (j7 == -1) {
            long B = B(null, true);
            this.f16103c = B;
            return B;
        }
        return j7;
    }

    @Override // r5.e0
    @n6.d
    public x b() {
        return this.f16102b;
    }

    @Override // r5.e0
    public void r(@n6.d i6.n nVar) throws IOException {
        l0.p(nVar, "sink");
        B(nVar, false);
    }

    @s4.h(name = "-deprecated_boundary")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "boundary", imports = {}))
    public final String s() {
        return w();
    }

    @s4.h(name = "-deprecated_parts")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "parts", imports = {}))
    public final List<c> t() {
        return this.f16106f;
    }

    @s4.h(name = "-deprecated_size")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "size", imports = {}))
    public final int u() {
        return z();
    }

    @s4.h(name = "-deprecated_type")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "type", imports = {}))
    public final x v() {
        return this.f16105e;
    }

    @s4.h(name = "boundary")
    @n6.d
    public final String w() {
        return this.f16104d.n0();
    }

    @n6.d
    public final c x(int i7) {
        return this.f16106f.get(i7);
    }

    @s4.h(name = "parts")
    @n6.d
    public final List<c> y() {
        return this.f16106f;
    }

    @s4.h(name = "size")
    public final int z() {
        return this.f16106f.size();
    }
}
