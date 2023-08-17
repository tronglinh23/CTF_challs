package v1;

import i5.h0;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import v3.h2;
import v3.t1;
/* loaded from: classes.dex */
public class j {
    public static final int A = 26;
    public static final int B = 36;
    public static final q C = new v1.a(new byte[]{0}, 1);
    public static final /* synthetic */ boolean D = false;

    /* renamed from: a  reason: collision with root package name */
    public static final int f17664a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f17665b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f17666c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f17667d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f17668e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f17669f = 5;

    /* renamed from: g  reason: collision with root package name */
    public static final int f17670g = 6;

    /* renamed from: h  reason: collision with root package name */
    public static final int f17671h = 7;

    /* renamed from: i  reason: collision with root package name */
    public static final int f17672i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final int f17673j = 9;

    /* renamed from: k  reason: collision with root package name */
    public static final int f17674k = 10;

    /* renamed from: l  reason: collision with root package name */
    public static final int f17675l = 11;

    /* renamed from: m  reason: collision with root package name */
    public static final int f17676m = 12;

    /* renamed from: n  reason: collision with root package name */
    public static final int f17677n = 13;

    /* renamed from: o  reason: collision with root package name */
    public static final int f17678o = 14;

    /* renamed from: p  reason: collision with root package name */
    public static final int f17679p = 15;

    /* renamed from: q  reason: collision with root package name */
    public static final int f17680q = 16;

    /* renamed from: r  reason: collision with root package name */
    public static final int f17681r = 17;

    /* renamed from: s  reason: collision with root package name */
    public static final int f17682s = 18;

    /* renamed from: t  reason: collision with root package name */
    public static final int f17683t = 19;

    /* renamed from: u  reason: collision with root package name */
    public static final int f17684u = 20;

    /* renamed from: v  reason: collision with root package name */
    public static final int f17685v = 21;

    /* renamed from: w  reason: collision with root package name */
    public static final int f17686w = 22;

    /* renamed from: x  reason: collision with root package name */
    public static final int f17687x = 23;

    /* renamed from: y  reason: collision with root package name */
    public static final int f17688y = 24;

    /* renamed from: z  reason: collision with root package name */
    public static final int f17689z = 25;

    /* loaded from: classes.dex */
    public static class a extends h {

        /* renamed from: e  reason: collision with root package name */
        public static final a f17690e = new a(j.C, 1, 1);

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ boolean f17691f = false;

        public a(q qVar, int i7, int i8) {
            super(qVar, i7, i8);
        }

        public static a d() {
            return f17690e;
        }

        @Override // v1.j.f
        public StringBuilder a(StringBuilder sb) {
            sb.append(h0.f11093b);
            sb.append(this.f17695a.A(this.f17696b, b()));
            sb.append(h0.f11093b);
            return sb;
        }

        @Override // v1.j.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public ByteBuffer c() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f17695a.y());
            wrap.position(this.f17696b);
            wrap.limit(this.f17696b + b());
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte e(int i7) {
            return this.f17695a.get(this.f17696b + i7);
        }

        public byte[] f() {
            int b7 = b();
            byte[] bArr = new byte[b7];
            for (int i7 = 0; i7 < b7; i7++) {
                bArr[i7] = this.f17695a.get(this.f17696b + i7);
            }
            return bArr;
        }

        @Override // v1.j.f
        public String toString() {
            return this.f17695a.A(this.f17696b, b());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: d  reason: collision with root package name */
        public static final c f17692d = new c(j.C, 0, 0);

        public c(q qVar, int i7, int i8) {
            super(qVar, i7, i8);
        }

        public static c d() {
            return f17692d;
        }

        @Override // v1.j.f
        public StringBuilder a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        public int c(byte[] bArr) {
            byte b7;
            byte b8;
            int i7 = this.f17696b;
            int i8 = 0;
            do {
                b7 = this.f17695a.get(i7);
                b8 = bArr[i8];
                if (b7 == 0) {
                    return b7 - b8;
                }
                i7++;
                i8++;
                if (i8 == bArr.length) {
                    return b7 - b8;
                }
            } while (b7 == b8);
            return b7 - b8;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f17696b == this.f17696b && cVar.f17697c == this.f17697c;
            }
            return false;
        }

        public int hashCode() {
            return this.f17696b ^ this.f17697c;
        }

        @Override // v1.j.f
        public String toString() {
            int i7 = this.f17696b;
            while (this.f17695a.get(i7) != 0) {
                i7++;
            }
            int i8 = this.f17696b;
            return this.f17695a.A(i8, i7 - i8);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final i f17693a;

        public d(i iVar) {
            this.f17693a = iVar;
        }

        public c a(int i7) {
            if (i7 >= b()) {
                return c.f17692d;
            }
            i iVar = this.f17693a;
            int i8 = iVar.f17696b + (i7 * iVar.f17697c);
            i iVar2 = this.f17693a;
            q qVar = iVar2.f17695a;
            return new c(qVar, j.i(qVar, i8, iVar2.f17697c), 1);
        }

        public int b() {
            return this.f17693a.b();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i7 = 0; i7 < this.f17693a.b(); i7++) {
                this.f17693a.d(i7).z(sb);
                if (i7 != this.f17693a.b() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends k {

        /* renamed from: f  reason: collision with root package name */
        public static final e f17694f = new e(j.C, 1, 1);

        public e(q qVar, int i7, int i8) {
            super(qVar, i7, i8);
        }

        public static e g() {
            return f17694f;
        }

        @Override // v1.j.k, v1.j.f
        public StringBuilder a(StringBuilder sb) {
            sb.append("{ ");
            d j7 = j();
            int b7 = b();
            k k7 = k();
            for (int i7 = 0; i7 < b7; i7++) {
                sb.append(h0.f11093b);
                sb.append(j7.a(i7).toString());
                sb.append("\" : ");
                sb.append(k7.d(i7).toString());
                if (i7 != b7 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public final int f(d dVar, byte[] bArr) {
            int b7 = dVar.b() - 1;
            int i7 = 0;
            while (i7 <= b7) {
                int i8 = (i7 + b7) >>> 1;
                int c7 = dVar.a(i8).c(bArr);
                if (c7 < 0) {
                    i7 = i8 + 1;
                } else if (c7 <= 0) {
                    return i8;
                } else {
                    b7 = i8 - 1;
                }
            }
            return -(i7 + 1);
        }

        public g h(String str) {
            return i(str.getBytes(StandardCharsets.UTF_8));
        }

        public g i(byte[] bArr) {
            d j7 = j();
            int b7 = j7.b();
            int f7 = f(j7, bArr);
            return (f7 < 0 || f7 >= b7) ? g.f17698f : d(f7);
        }

        public d j() {
            int i7 = this.f17696b - (this.f17697c * 3);
            q qVar = this.f17695a;
            int i8 = j.i(qVar, i7, this.f17697c);
            q qVar2 = this.f17695a;
            int i9 = this.f17697c;
            return new d(new i(qVar, i8, j.n(qVar2, i7 + i9, i9), 4));
        }

        public k k() {
            return new k(this.f17695a, this.f17696b, this.f17697c);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public q f17695a;

        /* renamed from: b  reason: collision with root package name */
        public int f17696b;

        /* renamed from: c  reason: collision with root package name */
        public int f17697c;

        public f(q qVar, int i7, int i8) {
            this.f17695a = qVar;
            this.f17696b = i7;
            this.f17697c = i8;
        }

        public abstract StringBuilder a(StringBuilder sb);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: f  reason: collision with root package name */
        public static final g f17698f = new g(j.C, 0, 1, 0);

        /* renamed from: a  reason: collision with root package name */
        public q f17699a;

        /* renamed from: b  reason: collision with root package name */
        public int f17700b;

        /* renamed from: c  reason: collision with root package name */
        public int f17701c;

        /* renamed from: d  reason: collision with root package name */
        public int f17702d;

        /* renamed from: e  reason: collision with root package name */
        public int f17703e;

        public g(q qVar, int i7, int i8, int i9) {
            this(qVar, i7, i8, 1 << (i9 & 3), i9 >> 2);
        }

        public a b() {
            if (m() || v()) {
                q qVar = this.f17699a;
                return new a(qVar, j.i(qVar, this.f17700b, this.f17701c), this.f17702d);
            }
            return a.d();
        }

        public boolean c() {
            return n() ? this.f17699a.get(this.f17700b) != 0 : j() != 0;
        }

        public double d() {
            int i7 = this.f17703e;
            if (i7 == 3) {
                return j.m(this.f17699a, this.f17700b, this.f17701c);
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 5) {
                        return Double.parseDouble(i());
                    }
                    if (i7 == 6) {
                        q qVar = this.f17699a;
                        return j.n(qVar, j.i(qVar, this.f17700b, this.f17701c), this.f17702d);
                    } else if (i7 == 7) {
                        q qVar2 = this.f17699a;
                        return j.p(qVar2, j.i(qVar2, this.f17700b, this.f17701c), this.f17702d);
                    } else if (i7 == 8) {
                        q qVar3 = this.f17699a;
                        return j.m(qVar3, j.i(qVar3, this.f17700b, this.f17701c), this.f17702d);
                    } else if (i7 == 10) {
                        return k().b();
                    } else {
                        if (i7 != 26) {
                            return androidx.cardview.widget.g.f1896q;
                        }
                    }
                }
                return j.p(this.f17699a, this.f17700b, this.f17701c);
            }
            return j.n(this.f17699a, this.f17700b, this.f17701c);
        }

        public int e() {
            int i7 = this.f17703e;
            if (i7 == 1) {
                return j.n(this.f17699a, this.f17700b, this.f17701c);
            }
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 5) {
                        if (i7 == 6) {
                            q qVar = this.f17699a;
                            return j.n(qVar, j.i(qVar, this.f17700b, this.f17701c), this.f17702d);
                        } else if (i7 == 7) {
                            q qVar2 = this.f17699a;
                            return (int) j.p(qVar2, j.i(qVar2, this.f17700b, this.f17701c), this.f17701c);
                        } else if (i7 == 8) {
                            q qVar3 = this.f17699a;
                            return (int) j.m(qVar3, j.i(qVar3, this.f17700b, this.f17701c), this.f17702d);
                        } else if (i7 != 10) {
                            if (i7 != 26) {
                                return 0;
                            }
                            return j.n(this.f17699a, this.f17700b, this.f17701c);
                        } else {
                            return k().b();
                        }
                    }
                    return Integer.parseInt(i());
                }
                return (int) j.m(this.f17699a, this.f17700b, this.f17701c);
            }
            return (int) j.p(this.f17699a, this.f17700b, this.f17701c);
        }

        public c f() {
            if (r()) {
                q qVar = this.f17699a;
                return new c(qVar, j.i(qVar, this.f17700b, this.f17701c), this.f17702d);
            }
            return c.d();
        }

        public long g() {
            int i7 = this.f17703e;
            if (i7 == 1) {
                return j.o(this.f17699a, this.f17700b, this.f17701c);
            }
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 5) {
                        try {
                            return Long.parseLong(i());
                        } catch (NumberFormatException unused) {
                            return 0L;
                        }
                    } else if (i7 == 6) {
                        q qVar = this.f17699a;
                        return j.o(qVar, j.i(qVar, this.f17700b, this.f17701c), this.f17702d);
                    } else if (i7 == 7) {
                        q qVar2 = this.f17699a;
                        return j.p(qVar2, j.i(qVar2, this.f17700b, this.f17701c), this.f17701c);
                    } else if (i7 == 8) {
                        q qVar3 = this.f17699a;
                        return (long) j.m(qVar3, j.i(qVar3, this.f17700b, this.f17701c), this.f17702d);
                    } else if (i7 != 10) {
                        if (i7 != 26) {
                            return 0L;
                        }
                        return j.n(this.f17699a, this.f17700b, this.f17701c);
                    } else {
                        return k().b();
                    }
                }
                return (long) j.m(this.f17699a, this.f17700b, this.f17701c);
            }
            return j.p(this.f17699a, this.f17700b, this.f17701c);
        }

        public e h() {
            if (s()) {
                q qVar = this.f17699a;
                return new e(qVar, j.i(qVar, this.f17700b, this.f17701c), this.f17702d);
            }
            return e.g();
        }

        public String i() {
            if (v()) {
                int i7 = j.i(this.f17699a, this.f17700b, this.f17701c);
                q qVar = this.f17699a;
                int i8 = this.f17702d;
                return this.f17699a.A(i7, (int) j.p(qVar, i7 - i8, i8));
            } else if (r()) {
                int i9 = j.i(this.f17699a, this.f17700b, this.f17702d);
                int i10 = i9;
                while (this.f17699a.get(i10) != 0) {
                    i10++;
                }
                return this.f17699a.A(i9, i10 - i9);
            } else {
                return "";
            }
        }

        public long j() {
            int i7 = this.f17703e;
            if (i7 == 2) {
                return j.p(this.f17699a, this.f17700b, this.f17701c);
            }
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 10) {
                        if (i7 != 26) {
                            if (i7 != 5) {
                                if (i7 == 6) {
                                    q qVar = this.f17699a;
                                    return j.o(qVar, j.i(qVar, this.f17700b, this.f17701c), this.f17702d);
                                } else if (i7 == 7) {
                                    q qVar2 = this.f17699a;
                                    return j.p(qVar2, j.i(qVar2, this.f17700b, this.f17701c), this.f17702d);
                                } else if (i7 != 8) {
                                    return 0L;
                                } else {
                                    q qVar3 = this.f17699a;
                                    return (long) j.m(qVar3, j.i(qVar3, this.f17700b, this.f17701c), this.f17701c);
                                }
                            }
                            return Long.parseLong(i());
                        }
                        return j.n(this.f17699a, this.f17700b, this.f17701c);
                    }
                    return k().b();
                }
                return (long) j.m(this.f17699a, this.f17700b, this.f17701c);
            }
            return j.o(this.f17699a, this.f17700b, this.f17701c);
        }

        public k k() {
            if (y()) {
                q qVar = this.f17699a;
                return new k(qVar, j.i(qVar, this.f17700b, this.f17701c), this.f17702d);
            }
            int i7 = this.f17703e;
            if (i7 == 15) {
                q qVar2 = this.f17699a;
                return new i(qVar2, j.i(qVar2, this.f17700b, this.f17701c), this.f17702d, 4);
            } else if (j.k(i7)) {
                q qVar3 = this.f17699a;
                return new i(qVar3, j.i(qVar3, this.f17700b, this.f17701c), this.f17702d, j.r(this.f17703e));
            } else {
                return k.c();
            }
        }

        public int l() {
            return this.f17703e;
        }

        public boolean m() {
            return this.f17703e == 25;
        }

        public boolean n() {
            return this.f17703e == 26;
        }

        public boolean o() {
            int i7 = this.f17703e;
            return i7 == 3 || i7 == 8;
        }

        public boolean p() {
            int i7 = this.f17703e;
            return i7 == 1 || i7 == 6;
        }

        public boolean q() {
            return p() || x();
        }

        public boolean r() {
            return this.f17703e == 4;
        }

        public boolean s() {
            return this.f17703e == 9;
        }

        public boolean t() {
            return this.f17703e == 0;
        }

        public String toString() {
            return z(new StringBuilder(128)).toString();
        }

        public boolean u() {
            return q() || o();
        }

        public boolean v() {
            return this.f17703e == 5;
        }

        public boolean w() {
            return j.k(this.f17703e);
        }

        public boolean x() {
            int i7 = this.f17703e;
            return i7 == 2 || i7 == 7;
        }

        public boolean y() {
            int i7 = this.f17703e;
            return i7 == 10 || i7 == 9;
        }

        public StringBuilder z(StringBuilder sb) {
            int i7 = this.f17703e;
            if (i7 != 36) {
                switch (i7) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(g());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(j());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(d());
                        return sb;
                    case 4:
                        c f7 = f();
                        sb.append(h0.f11093b);
                        StringBuilder a7 = f7.a(sb);
                        a7.append(h0.f11093b);
                        return a7;
                    case 5:
                        sb.append(h0.f11093b);
                        sb.append(i());
                        sb.append(h0.f11093b);
                        return sb;
                    case 9:
                        return h().a(sb);
                    case 10:
                        return k().a(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new b("not_implemented:" + this.f17703e);
                    case 25:
                        return b().a(sb);
                    case 26:
                        sb.append(c());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(k());
            return sb;
        }

        public g(q qVar, int i7, int i8, int i9, int i10) {
            this.f17699a = qVar;
            this.f17700b = i7;
            this.f17701c = i8;
            this.f17702d = i9;
            this.f17703e = i10;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h extends f {

        /* renamed from: d  reason: collision with root package name */
        public final int f17704d;

        public h(q qVar, int i7, int i8) {
            super(qVar, i7, i8);
            this.f17704d = j.n(this.f17695a, i7 - i8, i8);
        }

        public int b() {
            return this.f17704d;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends k {

        /* renamed from: g  reason: collision with root package name */
        public static final i f17705g = new i(j.C, 1, 1, 1);

        /* renamed from: f  reason: collision with root package name */
        public final int f17706f;

        public i(q qVar, int i7, int i8, int i9) {
            super(qVar, i7, i8);
            this.f17706f = i9;
        }

        public static i f() {
            return f17705g;
        }

        @Override // v1.j.k
        public g d(int i7) {
            if (i7 >= b()) {
                return g.f17698f;
            }
            return new g(this.f17695a, this.f17696b + (i7 * this.f17697c), this.f17697c, 1, this.f17706f);
        }

        public int g() {
            return this.f17706f;
        }

        public boolean h() {
            return this == f17705g;
        }
    }

    /* renamed from: v1.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0252j {
        public static int a(byte b7) {
            return b7 & t1.f17828n;
        }

        public static long b(int i7) {
            return i7 & 4294967295L;
        }

        public static int c(short s6) {
            return s6 & h2.f17796n;
        }
    }

    /* loaded from: classes.dex */
    public static class k extends h {

        /* renamed from: e  reason: collision with root package name */
        public static final k f17707e = new k(j.C, 1, 1);

        public k(q qVar, int i7, int i8) {
            super(qVar, i7, i8);
        }

        public static k c() {
            return f17707e;
        }

        @Override // v1.j.f
        public StringBuilder a(StringBuilder sb) {
            sb.append("[ ");
            int b7 = b();
            for (int i7 = 0; i7 < b7; i7++) {
                d(i7).z(sb);
                if (i7 != b7 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        @Override // v1.j.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public g d(int i7) {
            long b7 = b();
            long j7 = i7;
            if (j7 >= b7) {
                return g.f17698f;
            }
            return new g(this.f17695a, this.f17696b + (i7 * this.f17697c), this.f17697c, C0252j.a(this.f17695a.get((int) (this.f17696b + (b7 * this.f17697c) + j7))));
        }

        public boolean e() {
            return this == f17707e;
        }

        @Override // v1.j.f
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Deprecated
    public static g g(ByteBuffer byteBuffer) {
        return h(byteBuffer.hasArray() ? new v1.a(byteBuffer.array(), byteBuffer.limit()) : new v1.d(byteBuffer));
    }

    public static g h(q qVar) {
        int a7 = qVar.a() - 1;
        byte b7 = qVar.get(a7);
        int i7 = a7 - 1;
        return new g(qVar, i7 - b7, b7, C0252j.a(qVar.get(i7)));
    }

    public static int i(q qVar, int i7, int i8) {
        return (int) (i7 - p(qVar, i7, i8));
    }

    public static boolean j(int i7) {
        return i7 <= 3 || i7 == 26;
    }

    public static boolean k(int i7) {
        return (i7 >= 11 && i7 <= 15) || i7 == 36;
    }

    public static boolean l(int i7) {
        return (i7 >= 1 && i7 <= 4) || i7 == 26;
    }

    public static double m(q qVar, int i7, int i8) {
        if (i8 != 4) {
            if (i8 != 8) {
                return -1.0d;
            }
            return qVar.i(i7);
        }
        return qVar.o(i7);
    }

    public static int n(q qVar, int i7, int i8) {
        return (int) o(qVar, i7, i8);
    }

    public static long o(q qVar, int i7, int i8) {
        int i9;
        if (i8 == 1) {
            i9 = qVar.get(i7);
        } else if (i8 == 2) {
            i9 = qVar.w(i7);
        } else if (i8 != 4) {
            if (i8 != 8) {
                return -1L;
            }
            return qVar.r(i7);
        } else {
            i9 = qVar.l(i7);
        }
        return i9;
    }

    public static long p(q qVar, int i7, int i8) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 4) {
                    if (i8 != 8) {
                        return -1L;
                    }
                    return qVar.r(i7);
                }
                return C0252j.b(qVar.l(i7));
            }
            return C0252j.c(qVar.w(i7));
        }
        return C0252j.a(qVar.get(i7));
    }

    public static int q(int i7, int i8) {
        if (i8 != 0) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        return 0;
                    }
                    return (i7 - 1) + 22;
                }
                return (i7 - 1) + 19;
            }
            return (i7 - 1) + 16;
        }
        return (i7 - 1) + 11;
    }

    public static int r(int i7) {
        return (i7 - 11) + 1;
    }
}
