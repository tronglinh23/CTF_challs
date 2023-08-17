package r5;

import java.util.concurrent.TimeUnit;
import u4.l0;
import v3.b1;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15803a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15804b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15805c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15806d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15807e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f15808f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15809g;

    /* renamed from: h  reason: collision with root package name */
    public final int f15810h;

    /* renamed from: i  reason: collision with root package name */
    public final int f15811i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f15812j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f15813k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f15814l;

    /* renamed from: m  reason: collision with root package name */
    public String f15815m;

    /* renamed from: p  reason: collision with root package name */
    public static final b f15802p = new b(null);
    @n6.d
    @s4.e

    /* renamed from: n  reason: collision with root package name */
    public static final d f15800n = new a().g().a();
    @n6.d
    @s4.e

    /* renamed from: o  reason: collision with root package name */
    public static final d f15801o = new a().j().e(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f15816a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f15817b;

        /* renamed from: c  reason: collision with root package name */
        public int f15818c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f15819d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f15820e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f15821f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f15822g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f15823h;

        @n6.d
        public final d a() {
            return new d(this.f15816a, this.f15817b, this.f15818c, -1, false, false, false, this.f15819d, this.f15820e, this.f15821f, this.f15822g, this.f15823h, null, null);
        }

        public final int b(long j7) {
            if (j7 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j7;
        }

        @n6.d
        public final a c() {
            this.f15823h = true;
            return this;
        }

        @n6.d
        public final a d(int i7, @n6.d TimeUnit timeUnit) {
            l0.p(timeUnit, "timeUnit");
            if (i7 >= 0) {
                this.f15818c = b(timeUnit.toSeconds(i7));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i7).toString());
        }

        @n6.d
        public final a e(int i7, @n6.d TimeUnit timeUnit) {
            l0.p(timeUnit, "timeUnit");
            if (i7 >= 0) {
                this.f15819d = b(timeUnit.toSeconds(i7));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i7).toString());
        }

        @n6.d
        public final a f(int i7, @n6.d TimeUnit timeUnit) {
            l0.p(timeUnit, "timeUnit");
            if (i7 >= 0) {
                this.f15820e = b(timeUnit.toSeconds(i7));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i7).toString());
        }

        @n6.d
        public final a g() {
            this.f15816a = true;
            return this;
        }

        @n6.d
        public final a h() {
            this.f15817b = true;
            return this;
        }

        @n6.d
        public final a i() {
            this.f15822g = true;
            return this;
        }

        @n6.d
        public final a j() {
            this.f15821f = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public static /* synthetic */ int b(b bVar, String str, String str2, int i7, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                i7 = 0;
            }
            return bVar.a(str, str2, i7);
        }

        public final int a(String str, String str2, int i7) {
            int length = str.length();
            while (i7 < length) {
                if (i5.c0.V2(str2, str.charAt(i7), false, 2, null)) {
                    return i7;
                }
                i7++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
        @n6.d
        @s4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final r5.d c(@n6.d r5.u r32) {
            /*
                Method dump skipped, instructions count: 406
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.d.b.c(r5.u):r5.d");
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    public d(boolean z6, boolean z7, int i7, int i8, boolean z8, boolean z9, boolean z10, int i9, int i10, boolean z11, boolean z12, boolean z13, String str) {
        this.f15803a = z6;
        this.f15804b = z7;
        this.f15805c = i7;
        this.f15806d = i8;
        this.f15807e = z8;
        this.f15808f = z9;
        this.f15809g = z10;
        this.f15810h = i9;
        this.f15811i = i10;
        this.f15812j = z11;
        this.f15813k = z12;
        this.f15814l = z13;
        this.f15815m = str;
    }

    @n6.d
    @s4.m
    public static final d v(@n6.d u uVar) {
        return f15802p.c(uVar);
    }

    @s4.h(name = "-deprecated_immutable")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "immutable", imports = {}))
    public final boolean a() {
        return this.f15814l;
    }

    @s4.h(name = "-deprecated_maxAgeSeconds")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "maxAgeSeconds", imports = {}))
    public final int b() {
        return this.f15805c;
    }

    @s4.h(name = "-deprecated_maxStaleSeconds")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "maxStaleSeconds", imports = {}))
    public final int c() {
        return this.f15810h;
    }

    @s4.h(name = "-deprecated_minFreshSeconds")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "minFreshSeconds", imports = {}))
    public final int d() {
        return this.f15811i;
    }

    @s4.h(name = "-deprecated_mustRevalidate")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "mustRevalidate", imports = {}))
    public final boolean e() {
        return this.f15809g;
    }

    @s4.h(name = "-deprecated_noCache")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "noCache", imports = {}))
    public final boolean f() {
        return this.f15803a;
    }

    @s4.h(name = "-deprecated_noStore")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "noStore", imports = {}))
    public final boolean g() {
        return this.f15804b;
    }

    @s4.h(name = "-deprecated_noTransform")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "noTransform", imports = {}))
    public final boolean h() {
        return this.f15813k;
    }

    @s4.h(name = "-deprecated_onlyIfCached")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "onlyIfCached", imports = {}))
    public final boolean i() {
        return this.f15812j;
    }

    @s4.h(name = "-deprecated_sMaxAgeSeconds")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "sMaxAgeSeconds", imports = {}))
    public final int j() {
        return this.f15806d;
    }

    @s4.h(name = "immutable")
    public final boolean k() {
        return this.f15814l;
    }

    public final boolean l() {
        return this.f15807e;
    }

    public final boolean m() {
        return this.f15808f;
    }

    @s4.h(name = "maxAgeSeconds")
    public final int n() {
        return this.f15805c;
    }

    @s4.h(name = "maxStaleSeconds")
    public final int o() {
        return this.f15810h;
    }

    @s4.h(name = "minFreshSeconds")
    public final int p() {
        return this.f15811i;
    }

    @s4.h(name = "mustRevalidate")
    public final boolean q() {
        return this.f15809g;
    }

    @s4.h(name = "noCache")
    public final boolean r() {
        return this.f15803a;
    }

    @s4.h(name = "noStore")
    public final boolean s() {
        return this.f15804b;
    }

    @s4.h(name = "noTransform")
    public final boolean t() {
        return this.f15813k;
    }

    @n6.d
    public String toString() {
        String str = this.f15815m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f15803a) {
                sb.append("no-cache, ");
            }
            if (this.f15804b) {
                sb.append("no-store, ");
            }
            if (this.f15805c != -1) {
                sb.append("max-age=");
                sb.append(this.f15805c);
                sb.append(", ");
            }
            if (this.f15806d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f15806d);
                sb.append(", ");
            }
            if (this.f15807e) {
                sb.append("private, ");
            }
            if (this.f15808f) {
                sb.append("public, ");
            }
            if (this.f15809g) {
                sb.append("must-revalidate, ");
            }
            if (this.f15810h != -1) {
                sb.append("max-stale=");
                sb.append(this.f15810h);
                sb.append(", ");
            }
            if (this.f15811i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f15811i);
                sb.append(", ");
            }
            if (this.f15812j) {
                sb.append("only-if-cached, ");
            }
            if (this.f15813k) {
                sb.append("no-transform, ");
            }
            if (this.f15814l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            this.f15815m = sb2;
            return sb2;
        }
        return str;
    }

    @s4.h(name = "onlyIfCached")
    public final boolean u() {
        return this.f15812j;
    }

    @s4.h(name = "sMaxAgeSeconds")
    public final int w() {
        return this.f15806d;
    }

    public /* synthetic */ d(boolean z6, boolean z7, int i7, int i8, boolean z8, boolean z9, boolean z10, int i9, int i10, boolean z11, boolean z12, boolean z13, String str, u4.w wVar) {
        this(z6, z7, i7, i8, z8, z9, z10, i9, i10, z11, z12, z13, str);
    }
}
