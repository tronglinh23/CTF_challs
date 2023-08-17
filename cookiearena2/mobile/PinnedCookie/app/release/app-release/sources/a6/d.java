package a6;

import i6.a0;
import i6.o;
import i6.o0;
import i6.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import u.v;
import u4.l0;
import u4.w;
import x3.e0;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f253a = 15;

    /* renamed from: b  reason: collision with root package name */
    public static final int f254b = 31;

    /* renamed from: c  reason: collision with root package name */
    public static final int f255c = 63;

    /* renamed from: d  reason: collision with root package name */
    public static final int f256d = 127;

    /* renamed from: e  reason: collision with root package name */
    public static final int f257e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public static final int f258f = 16384;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public static final c[] f259g;
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public static final Map<p, Integer> f260h;

    /* renamed from: i  reason: collision with root package name */
    public static final d f261i;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f262a;

        /* renamed from: b  reason: collision with root package name */
        public final o f263b;
        @n6.d
        @s4.e

        /* renamed from: c  reason: collision with root package name */
        public c[] f264c;

        /* renamed from: d  reason: collision with root package name */
        public int f265d;
        @s4.e

        /* renamed from: e  reason: collision with root package name */
        public int f266e;
        @s4.e

        /* renamed from: f  reason: collision with root package name */
        public int f267f;

        /* renamed from: g  reason: collision with root package name */
        public final int f268g;

        /* renamed from: h  reason: collision with root package name */
        public int f269h;

        @s4.i
        public a(@n6.d o0 o0Var, int i7) {
            this(o0Var, i7, 0, 4, null);
        }

        public final void a() {
            int i7 = this.f269h;
            int i8 = this.f267f;
            if (i7 < i8) {
                if (i7 == 0) {
                    b();
                } else {
                    d(i8 - i7);
                }
            }
        }

        public final void b() {
            x3.o.w2(this.f264c, null, 0, 0, 6, null);
            this.f265d = this.f264c.length - 1;
            this.f266e = 0;
            this.f267f = 0;
        }

        public final int c(int i7) {
            return this.f265d + 1 + i7;
        }

        public final int d(int i7) {
            int i8;
            int i9 = 0;
            if (i7 > 0) {
                int length = this.f264c.length;
                while (true) {
                    length--;
                    i8 = this.f265d;
                    if (length < i8 || i7 <= 0) {
                        break;
                    }
                    c cVar = this.f264c[length];
                    l0.m(cVar);
                    int i10 = cVar.f250a;
                    i7 -= i10;
                    this.f267f -= i10;
                    this.f266e--;
                    i9++;
                }
                c[] cVarArr = this.f264c;
                System.arraycopy(cVarArr, i8 + 1, cVarArr, i8 + 1 + i9, this.f266e);
                this.f265d += i9;
            }
            return i9;
        }

        @n6.d
        public final List<c> e() {
            List<c> Q5 = e0.Q5(this.f262a);
            this.f262a.clear();
            return Q5;
        }

        public final p f(int i7) throws IOException {
            if (h(i7)) {
                return d.f261i.c()[i7].f251b;
            }
            int c7 = c(i7 - d.f261i.c().length);
            if (c7 >= 0) {
                c[] cVarArr = this.f264c;
                if (c7 < cVarArr.length) {
                    c cVar = cVarArr[c7];
                    l0.m(cVar);
                    return cVar.f251b;
                }
            }
            throw new IOException("Header index too large " + (i7 + 1));
        }

        public final void g(int i7, c cVar) {
            this.f262a.add(cVar);
            int i8 = cVar.f250a;
            if (i7 != -1) {
                c cVar2 = this.f264c[c(i7)];
                l0.m(cVar2);
                i8 -= cVar2.f250a;
            }
            int i9 = this.f269h;
            if (i8 > i9) {
                b();
                return;
            }
            int d7 = d((this.f267f + i8) - i9);
            if (i7 == -1) {
                int i10 = this.f266e + 1;
                c[] cVarArr = this.f264c;
                if (i10 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f265d = this.f264c.length - 1;
                    this.f264c = cVarArr2;
                }
                int i11 = this.f265d;
                this.f265d = i11 - 1;
                this.f264c[i11] = cVar;
                this.f266e++;
            } else {
                this.f264c[i7 + c(i7) + d7] = cVar;
            }
            this.f267f += i8;
        }

        public final boolean h(int i7) {
            return i7 >= 0 && i7 <= d.f261i.c().length - 1;
        }

        public final int i() {
            return this.f269h;
        }

        public final int j() throws IOException {
            return s5.d.b(this.f263b.readByte(), 255);
        }

        @n6.d
        public final p k() throws IOException {
            int j7 = j();
            boolean z6 = (j7 & 128) == 128;
            long n7 = n(j7, 127);
            if (z6) {
                i6.m mVar = new i6.m();
                k.f467d.b(this.f263b, n7, mVar);
                return mVar.x();
            }
            return this.f263b.z(n7);
        }

        public final void l() throws IOException {
            while (!this.f263b.c0()) {
                int b7 = s5.d.b(this.f263b.readByte(), 255);
                if (b7 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b7 & 128) == 128) {
                    m(n(b7, 127) - 1);
                } else if (b7 == 64) {
                    p();
                } else if ((b7 & 64) == 64) {
                    o(n(b7, 63) - 1);
                } else if ((b7 & 32) == 32) {
                    int n7 = n(b7, 31);
                    this.f269h = n7;
                    if (n7 < 0 || n7 > this.f268g) {
                        throw new IOException("Invalid dynamic table size update " + this.f269h);
                    }
                    a();
                } else if (b7 == 16 || b7 == 0) {
                    r();
                } else {
                    q(n(b7, 15) - 1);
                }
            }
        }

        public final void m(int i7) throws IOException {
            if (h(i7)) {
                this.f262a.add(d.f261i.c()[i7]);
                return;
            }
            int c7 = c(i7 - d.f261i.c().length);
            if (c7 >= 0) {
                c[] cVarArr = this.f264c;
                if (c7 < cVarArr.length) {
                    List<c> list = this.f262a;
                    c cVar = cVarArr[c7];
                    l0.m(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i7 + 1));
        }

        public final int n(int i7, int i8) throws IOException {
            int i9 = i7 & i8;
            if (i9 < i8) {
                return i9;
            }
            int i10 = 0;
            while (true) {
                int j7 = j();
                if ((j7 & 128) == 0) {
                    return i8 + (j7 << i10);
                }
                i8 += (j7 & 127) << i10;
                i10 += 7;
            }
        }

        public final void o(int i7) throws IOException {
            g(-1, new c(f(i7), k()));
        }

        public final void p() throws IOException {
            g(-1, new c(d.f261i.a(k()), k()));
        }

        public final void q(int i7) throws IOException {
            this.f262a.add(new c(f(i7), k()));
        }

        public final void r() throws IOException {
            this.f262a.add(new c(d.f261i.a(k()), k()));
        }

        @s4.i
        public a(@n6.d o0 o0Var, int i7, int i8) {
            l0.p(o0Var, "source");
            this.f268g = i7;
            this.f269h = i8;
            this.f262a = new ArrayList();
            this.f263b = a0.d(o0Var);
            this.f264c = new c[8];
            this.f265d = r2.length - 1;
        }

        public /* synthetic */ a(o0 o0Var, int i7, int i8, int i9, w wVar) {
            this(o0Var, i7, (i9 & 4) != 0 ? i7 : i8);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f270a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f271b;
        @s4.e

        /* renamed from: c  reason: collision with root package name */
        public int f272c;
        @n6.d
        @s4.e

        /* renamed from: d  reason: collision with root package name */
        public c[] f273d;

        /* renamed from: e  reason: collision with root package name */
        public int f274e;
        @s4.e

        /* renamed from: f  reason: collision with root package name */
        public int f275f;
        @s4.e

        /* renamed from: g  reason: collision with root package name */
        public int f276g;
        @s4.e

        /* renamed from: h  reason: collision with root package name */
        public int f277h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f278i;

        /* renamed from: j  reason: collision with root package name */
        public final i6.m f279j;

        @s4.i
        public b(int i7, @n6.d i6.m mVar) {
            this(i7, false, mVar, 2, null);
        }

        public final void a() {
            int i7 = this.f272c;
            int i8 = this.f276g;
            if (i7 < i8) {
                if (i7 == 0) {
                    b();
                } else {
                    c(i8 - i7);
                }
            }
        }

        public final void b() {
            x3.o.w2(this.f273d, null, 0, 0, 6, null);
            this.f274e = this.f273d.length - 1;
            this.f275f = 0;
            this.f276g = 0;
        }

        public final int c(int i7) {
            int i8;
            int i9 = 0;
            if (i7 > 0) {
                int length = this.f273d.length;
                while (true) {
                    length--;
                    i8 = this.f274e;
                    if (length < i8 || i7 <= 0) {
                        break;
                    }
                    c cVar = this.f273d[length];
                    l0.m(cVar);
                    i7 -= cVar.f250a;
                    int i10 = this.f276g;
                    c cVar2 = this.f273d[length];
                    l0.m(cVar2);
                    this.f276g = i10 - cVar2.f250a;
                    this.f275f--;
                    i9++;
                }
                c[] cVarArr = this.f273d;
                System.arraycopy(cVarArr, i8 + 1, cVarArr, i8 + 1 + i9, this.f275f);
                c[] cVarArr2 = this.f273d;
                int i11 = this.f274e;
                Arrays.fill(cVarArr2, i11 + 1, i11 + 1 + i9, (Object) null);
                this.f274e += i9;
            }
            return i9;
        }

        public final void d(c cVar) {
            int i7 = cVar.f250a;
            int i8 = this.f272c;
            if (i7 > i8) {
                b();
                return;
            }
            c((this.f276g + i7) - i8);
            int i9 = this.f275f + 1;
            c[] cVarArr = this.f273d;
            if (i9 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f274e = this.f273d.length - 1;
                this.f273d = cVarArr2;
            }
            int i10 = this.f274e;
            this.f274e = i10 - 1;
            this.f273d[i10] = cVar;
            this.f275f++;
            this.f276g += i7;
        }

        public final void e(int i7) {
            this.f277h = i7;
            int min = Math.min(i7, 16384);
            int i8 = this.f272c;
            if (i8 == min) {
                return;
            }
            if (min < i8) {
                this.f270a = Math.min(this.f270a, min);
            }
            this.f271b = true;
            this.f272c = min;
            a();
        }

        public final void f(@n6.d p pVar) throws IOException {
            l0.p(pVar, "data");
            if (this.f278i) {
                k kVar = k.f467d;
                if (kVar.d(pVar) < pVar.c0()) {
                    i6.m mVar = new i6.m();
                    kVar.c(pVar, mVar);
                    p x6 = mVar.x();
                    h(x6.c0(), 127, 128);
                    this.f279j.K(x6);
                    return;
                }
            }
            h(pVar.c0(), 127, 0);
            this.f279j.K(pVar);
        }

        public final void g(@n6.d List<c> list) throws IOException {
            int i7;
            int i8;
            l0.p(list, "headerBlock");
            if (this.f271b) {
                int i9 = this.f270a;
                if (i9 < this.f272c) {
                    h(i9, 31, 32);
                }
                this.f271b = false;
                this.f270a = Integer.MAX_VALUE;
                h(this.f272c, 31, 32);
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = list.get(i10);
                p k02 = cVar.f251b.k0();
                p pVar = cVar.f252c;
                d dVar = d.f261i;
                Integer num = dVar.b().get(k02);
                if (num != null) {
                    i8 = num.intValue() + 1;
                    if (2 <= i8 && 7 >= i8) {
                        if (l0.g(dVar.c()[i8 - 1].f252c, pVar)) {
                            i7 = i8;
                        } else if (l0.g(dVar.c()[i8].f252c, pVar)) {
                            i8++;
                            i7 = i8;
                        }
                    }
                    i7 = i8;
                    i8 = -1;
                } else {
                    i7 = -1;
                    i8 = -1;
                }
                if (i8 == -1) {
                    int i11 = this.f274e + 1;
                    int length = this.f273d.length;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        }
                        c cVar2 = this.f273d[i11];
                        l0.m(cVar2);
                        if (l0.g(cVar2.f251b, k02)) {
                            c cVar3 = this.f273d[i11];
                            l0.m(cVar3);
                            if (l0.g(cVar3.f252c, pVar)) {
                                i8 = d.f261i.c().length + (i11 - this.f274e);
                                break;
                            } else if (i7 == -1) {
                                i7 = (i11 - this.f274e) + d.f261i.c().length;
                            }
                        }
                        i11++;
                    }
                }
                if (i8 != -1) {
                    h(i8, 127, 128);
                } else if (i7 == -1) {
                    this.f279j.e0(64);
                    f(k02);
                    f(pVar);
                    d(cVar);
                } else if (k02.d0(c.f238d) && (!l0.g(c.f248n, k02)) == true) {
                    h(i7, 15, 0);
                    f(pVar);
                } else {
                    h(i7, 63, 64);
                    f(pVar);
                    d(cVar);
                }
            }
        }

        public final void h(int i7, int i8, int i9) {
            if (i7 < i8) {
                this.f279j.e0(i7 | i9);
                return;
            }
            this.f279j.e0(i9 | i8);
            int i10 = i7 - i8;
            while (i10 >= 128) {
                this.f279j.e0(128 | (i10 & 127));
                i10 >>>= 7;
            }
            this.f279j.e0(i10);
        }

        @s4.i
        public b(@n6.d i6.m mVar) {
            this(0, false, mVar, 3, null);
        }

        @s4.i
        public b(int i7, boolean z6, @n6.d i6.m mVar) {
            l0.p(mVar, "out");
            this.f277h = i7;
            this.f278i = z6;
            this.f279j = mVar;
            this.f270a = Integer.MAX_VALUE;
            this.f272c = i7;
            this.f273d = new c[8];
            this.f274e = r2.length - 1;
        }

        public /* synthetic */ b(int i7, boolean z6, i6.m mVar, int i8, w wVar) {
            this((i8 & 1) != 0 ? 4096 : i7, (i8 & 2) != 0 ? true : z6, mVar);
        }
    }

    static {
        d dVar = new d();
        f261i = dVar;
        p pVar = c.f245k;
        p pVar2 = c.f246l;
        p pVar3 = c.f247m;
        p pVar4 = c.f244j;
        f259g = new c[]{new c(c.f248n, ""), new c(pVar, "GET"), new c(pVar, "POST"), new c(pVar2, "/"), new c(pVar2, "/index.html"), new c(pVar3, "http"), new c(pVar3, "https"), new c(pVar4, "200"), new c(pVar4, "204"), new c(pVar4, "206"), new c(pVar4, "304"), new c(pVar4, "400"), new c(pVar4, "404"), new c(pVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c(v.h.f17254c, ""), new c(g.f399j, ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c(g.f402m, ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f260h = dVar.d();
    }

    @n6.d
    public final p a(@n6.d p pVar) throws IOException {
        l0.p(pVar, "name");
        int c02 = pVar.c0();
        for (int i7 = 0; i7 < c02; i7++) {
            byte b7 = (byte) 65;
            byte b8 = (byte) 90;
            byte r6 = pVar.r(i7);
            if (b7 <= r6 && b8 >= r6) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + pVar.n0());
            }
        }
        return pVar;
    }

    @n6.d
    public final Map<p, Integer> b() {
        return f260h;
    }

    @n6.d
    public final c[] c() {
        return f259g;
    }

    public final Map<p, Integer> d() {
        c[] cVarArr = f259g;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            c[] cVarArr2 = f259g;
            if (!linkedHashMap.containsKey(cVarArr2[i7].f251b)) {
                linkedHashMap.put(cVarArr2[i7].f251b, Integer.valueOf(i7));
            }
        }
        Map<p, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l0.o(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }
}
