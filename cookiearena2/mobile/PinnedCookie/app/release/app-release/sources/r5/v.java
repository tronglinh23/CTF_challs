package r5;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import u4.l0;
import v3.b1;
import x3.l1;
/* loaded from: classes.dex */
public final class v {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final String f16049l = " \"':;<=>@[]^`{}|/\\?#";
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final String f16050m = " \"':;<=>@[]^`{}|/\\?#";
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final String f16051n = " \"<>^`{}|/\\?#";
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final String f16052o = "[]";
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public static final String f16053p = " \"'<>#";
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public static final String f16054q = " \"'<>#&=";
    @n6.d

    /* renamed from: r  reason: collision with root package name */
    public static final String f16055r = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    @n6.d

    /* renamed from: s  reason: collision with root package name */
    public static final String f16056s = "\\^`{|}";
    @n6.d

    /* renamed from: t  reason: collision with root package name */
    public static final String f16057t = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    @n6.d

    /* renamed from: u  reason: collision with root package name */
    public static final String f16058u = "";
    @n6.d

    /* renamed from: v  reason: collision with root package name */
    public static final String f16059v = " \"#<>\\^`{|}";

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16061a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final String f16062b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final String f16063c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final String f16064d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final String f16065e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16066f;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f16067g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f16068h;
    @n6.e

    /* renamed from: i  reason: collision with root package name */
    public final String f16069i;

    /* renamed from: j  reason: collision with root package name */
    public final String f16070j;

    /* renamed from: w  reason: collision with root package name */
    public static final b f16060w = new b(null);

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f16048k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* loaded from: classes.dex */
    public static final class a {
        @n6.d

        /* renamed from: i  reason: collision with root package name */
        public static final String f16071i = "Invalid URL host";

        /* renamed from: j  reason: collision with root package name */
        public static final C0236a f16072j = new C0236a(null);
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public String f16073a;
        @n6.e

        /* renamed from: d  reason: collision with root package name */
        public String f16076d;
        @n6.d

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f16078f;
        @n6.e

        /* renamed from: g  reason: collision with root package name */
        public List<String> f16079g;
        @n6.e

        /* renamed from: h  reason: collision with root package name */
        public String f16080h;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public String f16074b = "";
        @n6.d

        /* renamed from: c  reason: collision with root package name */
        public String f16075c = "";

        /* renamed from: e  reason: collision with root package name */
        public int f16077e = -1;

        /* renamed from: r5.v$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0236a {
            public C0236a() {
            }

            public final int e(String str, int i7, int i8) {
                try {
                    int parseInt = Integer.parseInt(b.f(v.f16060w, str, i7, i8, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int f(String str, int i7, int i8) {
                while (i7 < i8) {
                    char charAt = str.charAt(i7);
                    if (charAt == ':') {
                        return i7;
                    }
                    if (charAt != '[') {
                        i7++;
                    }
                    do {
                        i7++;
                        if (i7 < i8) {
                        }
                        i7++;
                    } while (str.charAt(i7) != ']');
                    i7++;
                }
                return i8;
            }

            public final int g(String str, int i7, int i8) {
                if (i8 - i7 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i7);
                if ((l0.t(charAt, 97) < 0 || l0.t(charAt, 122) > 0) && (l0.t(charAt, 65) < 0 || l0.t(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i7++;
                    if (i7 >= i8) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i7);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i7;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public final int h(String str, int i7, int i8) {
                int i9 = 0;
                while (i7 < i8) {
                    char charAt = str.charAt(i7);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i9++;
                    i7++;
                }
                return i9;
            }

            public /* synthetic */ C0236a(u4.w wVar) {
                this();
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f16078f = arrayList;
            arrayList.add("");
        }

        @n6.d
        public final a A(@n6.e v vVar, @n6.d String str) {
            int q6;
            int i7;
            int i8;
            String str2;
            boolean z6;
            int i9;
            String str3;
            int i10;
            boolean z7;
            boolean z8;
            l0.p(str, "input");
            int D = s5.d.D(str, 0, 0, 3, null);
            int F = s5.d.F(str, D, 0, 2, null);
            C0236a c0236a = f16072j;
            int g7 = c0236a.g(str, D, F);
            String str4 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            boolean z9 = true;
            char c7 = 65535;
            if (g7 != -1) {
                if (i5.b0.s2(str, "https:", D, true)) {
                    this.f16073a = "https";
                    D += 6;
                } else if (!i5.b0.s2(str, "http:", D, true)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str.substring(0, g7);
                    l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                } else {
                    this.f16073a = "http";
                    D += 5;
                }
            } else if (vVar == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            } else {
                this.f16073a = vVar.X();
            }
            int h7 = c0236a.h(str, D, F);
            char c8 = '?';
            char c9 = '#';
            if (h7 >= 2 || vVar == null || (!l0.g(vVar.X(), this.f16073a)) == true) {
                int i11 = D + h7;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    q6 = s5.d.q(str, "@/\\?#", i11, F);
                    char charAt = q6 != F ? str.charAt(q6) : c7;
                    if (charAt == c7 || charAt == c9 || charAt == '/' || charAt == '\\' || charAt == c8) {
                        break;
                    }
                    if (charAt != '@') {
                        z6 = z9;
                        str3 = str4;
                        i9 = F;
                    } else {
                        if (z10) {
                            z6 = z9;
                            i9 = F;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f16075c);
                            sb2.append("%40");
                            str3 = str4;
                            i10 = q6;
                            sb2.append(b.f(v.f16060w, str, i11, q6, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f16075c = sb2.toString();
                            z7 = z11;
                        } else {
                            int p6 = s5.d.p(str, ':', i11, q6);
                            b bVar = v.f16060w;
                            z6 = z9;
                            i9 = F;
                            String str5 = str4;
                            String f7 = b.f(bVar, str, i11, p6, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z11) {
                                f7 = this.f16074b + "%40" + f7;
                            }
                            this.f16074b = f7;
                            if (p6 != q6) {
                                this.f16075c = b.f(bVar, str, p6 + 1, q6, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z8 = z6;
                            } else {
                                z8 = z10;
                            }
                            z10 = z8;
                            str3 = str5;
                            z7 = z6;
                            i10 = q6;
                        }
                        i11 = i10 + 1;
                        z11 = z7;
                    }
                    str4 = str3;
                    z9 = z6;
                    F = i9;
                    c9 = '#';
                    c8 = '?';
                    c7 = 65535;
                }
                boolean z12 = z9;
                String str6 = str4;
                i7 = F;
                C0236a c0236a2 = f16072j;
                int f8 = c0236a2.f(str, i11, q6);
                int i12 = f8 + 1;
                if (i12 < q6) {
                    i8 = i11;
                    this.f16076d = s5.a.e(b.n(v.f16060w, str, i11, f8, false, 4, null));
                    int e7 = c0236a2.e(str, i12, q6);
                    this.f16077e = e7;
                    if (!(e7 != -1 ? z12 : false)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String substring2 = str.substring(i12, q6);
                        l0.o(substring2, str6);
                        sb3.append(substring2);
                        sb3.append(i5.h0.f11093b);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str2 = str6;
                } else {
                    i8 = i11;
                    str2 = str6;
                    b bVar2 = v.f16060w;
                    this.f16076d = s5.a.e(b.n(bVar2, str, i8, f8, false, 4, null));
                    String str7 = this.f16073a;
                    l0.m(str7);
                    this.f16077e = bVar2.g(str7);
                }
                if (!(this.f16076d != null ? z12 : false)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String substring3 = str.substring(i8, f8);
                    l0.o(substring3, str2);
                    sb4.append(substring3);
                    sb4.append(i5.h0.f11093b);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                D = q6;
            } else {
                this.f16074b = vVar.A();
                this.f16075c = vVar.w();
                this.f16076d = vVar.F();
                this.f16077e = vVar.N();
                this.f16078f.clear();
                this.f16078f.addAll(vVar.y());
                if (D == F || str.charAt(D) == '#') {
                    m(vVar.z());
                }
                i7 = F;
            }
            int i13 = i7;
            int q7 = s5.d.q(str, "?#", D, i13);
            L(str, D, q7);
            if (q7 < i13 && str.charAt(q7) == '?') {
                int p7 = s5.d.p(str, '#', q7, i13);
                b bVar3 = v.f16060w;
                this.f16079g = bVar3.p(b.f(bVar3, str, q7 + 1, p7, v.f16053p, true, false, true, false, null, 208, null));
                q7 = p7;
            }
            if (q7 < i13 && str.charAt(q7) == '#') {
                this.f16080h = b.f(v.f16060w, str, q7 + 1, i13, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @n6.d
        public final a B(@n6.d String str) {
            l0.p(str, "password");
            this.f16075c = b.f(v.f16060w, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final void C() {
            List<String> list = this.f16078f;
            if (!(list.remove(list.size() - 1).length() == 0) || (!this.f16078f.isEmpty()) != true) {
                this.f16078f.add("");
                return;
            }
            List<String> list2 = this.f16078f;
            list2.set(list2.size() - 1, "");
        }

        @n6.d
        public final a D(int i7) {
            if (1 <= i7 && 65535 >= i7) {
                this.f16077e = i7;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i7).toString());
        }

        public final void E(String str, int i7, int i8, boolean z6, boolean z7) {
            String f7 = b.f(v.f16060w, str, i7, i8, v.f16051n, z7, false, false, false, null, 240, null);
            if (y(f7)) {
                return;
            }
            if (z(f7)) {
                C();
                return;
            }
            List<String> list = this.f16078f;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f16078f;
                list2.set(list2.size() - 1, f7);
            } else {
                this.f16078f.add(f7);
            }
            if (z6) {
                this.f16078f.add("");
            }
        }

        @n6.d
        public final a F(@n6.e String str) {
            List<String> list;
            if (str != null) {
                b bVar = v.f16060w;
                String f7 = b.f(bVar, str, 0, 0, v.f16053p, false, false, true, false, null, 219, null);
                if (f7 != null) {
                    list = bVar.p(f7);
                    this.f16079g = list;
                    return this;
                }
            }
            list = null;
            this.f16079g = list;
            return this;
        }

        @n6.d
        public final a G() {
            String str = this.f16076d;
            this.f16076d = str != null ? new i5.o("[\"<>^`{|}]").m(str, "") : null;
            int size = this.f16078f.size();
            for (int i7 = 0; i7 < size; i7++) {
                List<String> list = this.f16078f;
                list.set(i7, b.f(v.f16060w, list.get(i7), 0, 0, v.f16052o, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.f16079g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    String str2 = list2.get(i8);
                    list2.set(i8, str2 != null ? b.f(v.f16060w, str2, 0, 0, v.f16056s, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f16080h;
            this.f16080h = str3 != null ? b.f(v.f16060w, str3, 0, 0, v.f16059v, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final void H(String str) {
            List<String> list = this.f16079g;
            l0.m(list);
            d5.j B1 = d5.u.B1(d5.u.k0(list.size() - 2, 0), 2);
            int i7 = B1.i();
            int j7 = B1.j();
            int k7 = B1.k();
            if (k7 >= 0) {
                if (i7 > j7) {
                    return;
                }
            } else if (i7 < j7) {
                return;
            }
            while (true) {
                List<String> list2 = this.f16079g;
                l0.m(list2);
                if (l0.g(str, list2.get(i7))) {
                    List<String> list3 = this.f16079g;
                    l0.m(list3);
                    list3.remove(i7 + 1);
                    List<String> list4 = this.f16079g;
                    l0.m(list4);
                    list4.remove(i7);
                    List<String> list5 = this.f16079g;
                    l0.m(list5);
                    if (list5.isEmpty()) {
                        this.f16079g = null;
                        return;
                    }
                }
                if (i7 == j7) {
                    return;
                }
                i7 += k7;
            }
        }

        @n6.d
        public final a I(@n6.d String str) {
            l0.p(str, "encodedName");
            if (this.f16079g == null) {
                return this;
            }
            H(b.f(v.f16060w, str, 0, 0, v.f16054q, true, false, true, false, null, 211, null));
            return this;
        }

        @n6.d
        public final a J(@n6.d String str) {
            l0.p(str, "name");
            if (this.f16079g == null) {
                return this;
            }
            H(b.f(v.f16060w, str, 0, 0, v.f16055r, false, false, true, false, null, 219, null));
            return this;
        }

        @n6.d
        public final a K(int i7) {
            this.f16078f.remove(i7);
            if (this.f16078f.isEmpty()) {
                this.f16078f.add("");
            }
            return this;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:11:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void L(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.f16078f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.f16078f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f16078f
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = s5.d.q(r11, r12, r6, r13)
                if (r12 >= r13) goto L36
                r0 = r3
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.E(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.v.a.L(java.lang.String, int, int):void");
        }

        @n6.d
        public final a M(@n6.d String str) {
            l0.p(str, "scheme");
            if (i5.b0.L1(str, "http", true)) {
                this.f16073a = "http";
            } else if (!i5.b0.L1(str, "https", true)) {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            } else {
                this.f16073a = "https";
            }
            return this;
        }

        public final void N(@n6.e String str) {
            this.f16080h = str;
        }

        public final void O(@n6.d String str) {
            l0.p(str, "<set-?>");
            this.f16075c = str;
        }

        @n6.d
        public final a P(int i7, @n6.d String str) {
            l0.p(str, "encodedPathSegment");
            String f7 = b.f(v.f16060w, str, 0, 0, v.f16051n, true, false, false, false, null, 243, null);
            this.f16078f.set(i7, f7);
            if ((y(f7) || z(f7)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void Q(@n6.e List<String> list) {
            this.f16079g = list;
        }

        @n6.d
        public final a R(@n6.d String str, @n6.e String str2) {
            l0.p(str, "encodedName");
            I(str);
            c(str, str2);
            return this;
        }

        public final void S(@n6.d String str) {
            l0.p(str, "<set-?>");
            this.f16074b = str;
        }

        public final void T(@n6.e String str) {
            this.f16076d = str;
        }

        @n6.d
        public final a U(int i7, @n6.d String str) {
            l0.p(str, "pathSegment");
            String f7 = b.f(v.f16060w, str, 0, 0, v.f16051n, false, false, false, false, null, 251, null);
            if ((y(f7) || z(f7)) ? false : true) {
                this.f16078f.set(i7, f7);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void V(int i7) {
            this.f16077e = i7;
        }

        @n6.d
        public final a W(@n6.d String str, @n6.e String str2) {
            l0.p(str, "name");
            J(str);
            g(str, str2);
            return this;
        }

        public final void X(@n6.e String str) {
            this.f16073a = str;
        }

        @n6.d
        public final a Y(@n6.d String str) {
            l0.p(str, "username");
            this.f16074b = b.f(v.f16060w, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @n6.d
        public final a a(@n6.d String str) {
            l0.p(str, "encodedPathSegment");
            E(str, 0, str.length(), false, true);
            return this;
        }

        @n6.d
        public final a b(@n6.d String str) {
            l0.p(str, "encodedPathSegments");
            return f(str, true);
        }

        @n6.d
        public final a c(@n6.d String str, @n6.e String str2) {
            l0.p(str, "encodedName");
            if (this.f16079g == null) {
                this.f16079g = new ArrayList();
            }
            List<String> list = this.f16079g;
            l0.m(list);
            b bVar = v.f16060w;
            list.add(b.f(bVar, str, 0, 0, v.f16054q, true, false, true, false, null, 211, null));
            List<String> list2 = this.f16079g;
            l0.m(list2);
            list2.add(str2 != null ? b.f(bVar, str2, 0, 0, v.f16054q, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @n6.d
        public final a d(@n6.d String str) {
            l0.p(str, "pathSegment");
            E(str, 0, str.length(), false, false);
            return this;
        }

        @n6.d
        public final a e(@n6.d String str) {
            l0.p(str, "pathSegments");
            return f(str, false);
        }

        public final a f(String str, boolean z6) {
            int i7 = 0;
            do {
                int q6 = s5.d.q(str, "/\\", i7, str.length());
                E(str, i7, q6, q6 < str.length(), z6);
                i7 = q6 + 1;
            } while (i7 <= str.length());
            return this;
        }

        @n6.d
        public final a g(@n6.d String str, @n6.e String str2) {
            l0.p(str, "name");
            if (this.f16079g == null) {
                this.f16079g = new ArrayList();
            }
            List<String> list = this.f16079g;
            l0.m(list);
            b bVar = v.f16060w;
            list.add(b.f(bVar, str, 0, 0, v.f16055r, false, false, true, false, null, 219, null));
            List<String> list2 = this.f16079g;
            l0.m(list2);
            list2.add(str2 != null ? b.f(bVar, str2, 0, 0, v.f16055r, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @n6.d
        public final v h() {
            ArrayList arrayList;
            String str = this.f16073a;
            if (str != null) {
                b bVar = v.f16060w;
                String n7 = b.n(bVar, this.f16074b, 0, 0, false, 7, null);
                String n8 = b.n(bVar, this.f16075c, 0, 0, false, 7, null);
                String str2 = this.f16076d;
                if (str2 != null) {
                    int i7 = i();
                    List<String> list = this.f16078f;
                    ArrayList arrayList2 = new ArrayList(x3.x.Y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(b.n(v.f16060w, (String) it.next(), 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.f16079g;
                    if (list2 != null) {
                        arrayList = new ArrayList(x3.x.Y(list2, 10));
                        for (String str3 : list2) {
                            arrayList.add(str3 != null ? b.n(v.f16060w, str3, 0, 0, true, 3, null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.f16080h;
                    return new v(str, n7, n8, str2, i7, arrayList2, arrayList, str4 != null ? b.n(v.f16060w, str4, 0, 0, false, 7, null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int i() {
            int i7 = this.f16077e;
            if (i7 != -1) {
                return i7;
            }
            b bVar = v.f16060w;
            String str = this.f16073a;
            l0.m(str);
            return bVar.g(str);
        }

        @n6.d
        public final a j(@n6.e String str) {
            this.f16080h = str != null ? b.f(v.f16060w, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @n6.d
        public final a k(@n6.d String str) {
            l0.p(str, "encodedPassword");
            this.f16075c = b.f(v.f16060w, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @n6.d
        public final a l(@n6.d String str) {
            l0.p(str, "encodedPath");
            if (i5.b0.v2(str, "/", false, 2, null)) {
                L(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + str).toString());
        }

        @n6.d
        public final a m(@n6.e String str) {
            List<String> list;
            if (str != null) {
                b bVar = v.f16060w;
                String f7 = b.f(bVar, str, 0, 0, v.f16053p, true, false, true, false, null, 211, null);
                if (f7 != null) {
                    list = bVar.p(f7);
                    this.f16079g = list;
                    return this;
                }
            }
            list = null;
            this.f16079g = list;
            return this;
        }

        @n6.d
        public final a n(@n6.d String str) {
            l0.p(str, "encodedUsername");
            this.f16074b = b.f(v.f16060w, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @n6.d
        public final a o(@n6.e String str) {
            this.f16080h = str != null ? b.f(v.f16060w, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @n6.e
        public final String p() {
            return this.f16080h;
        }

        @n6.d
        public final String q() {
            return this.f16075c;
        }

        @n6.d
        public final List<String> r() {
            return this.f16078f;
        }

        @n6.e
        public final List<String> s() {
            return this.f16079g;
        }

        @n6.d
        public final String t() {
            return this.f16074b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            if ((r6.f16075c.length() > 0) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
            if (r1 != r3.g(r2)) goto L38;
         */
        @n6.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f16073a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f16074b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = r2
                goto L24
            L23:
                r1 = r3
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.f16075c
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = r2
                goto L33
            L32:
                r1 = r3
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.f16074b
                r0.append(r1)
                java.lang.String r1 = r6.f16075c
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = r3
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.f16075c
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.f16076d
                if (r1 == 0) goto L77
                u4.l0.m(r1)
                r2 = 2
                r5 = 0
                boolean r1 = i5.c0.V2(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L72
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f16076d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L77
            L72:
                java.lang.String r1 = r6.f16076d
                r0.append(r1)
            L77:
                int r1 = r6.f16077e
                r2 = -1
                if (r1 != r2) goto L80
                java.lang.String r1 = r6.f16073a
                if (r1 == 0) goto L99
            L80:
                int r1 = r6.i()
                java.lang.String r2 = r6.f16073a
                if (r2 == 0) goto L93
                r5.v$b r3 = r5.v.f16060w
                u4.l0.m(r2)
                int r2 = r3.g(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                r5.v$b r1 = r5.v.f16060w
                java.util.List<java.lang.String> r2 = r6.f16078f
                r1.o(r2, r0)
                java.util.List<java.lang.String> r2 = r6.f16079g
                if (r2 == 0) goto Lb1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.f16079g
                u4.l0.m(r2)
                r1.q(r2, r0)
            Lb1:
                java.lang.String r1 = r6.f16080h
                if (r1 == 0) goto Lbf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f16080h
                r0.append(r1)
            Lbf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                u4.l0.o(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.v.a.toString():java.lang.String");
        }

        @n6.e
        public final String u() {
            return this.f16076d;
        }

        public final int v() {
            return this.f16077e;
        }

        @n6.e
        public final String w() {
            return this.f16073a;
        }

        @n6.d
        public final a x(@n6.d String str) {
            l0.p(str, a6.g.f399j);
            String e7 = s5.a.e(b.n(v.f16060w, str, 0, 0, false, 7, null));
            if (e7 != null) {
                this.f16076d = e7;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final boolean y(String str) {
            return l0.g(str, ".") || i5.b0.L1(str, "%2e", true);
        }

        public final boolean z(String str) {
            return l0.g(str, "..") || i5.b0.L1(str, "%2e.", true) || i5.b0.L1(str, ".%2e", true) || i5.b0.L1(str, "%2e%2e", true);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public static /* synthetic */ String f(b bVar, String str, int i7, int i8, String str2, boolean z6, boolean z7, boolean z8, boolean z9, Charset charset, int i9, Object obj) {
            return bVar.e(str, (i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? str.length() : i8, str2, (i9 & 8) != 0 ? false : z6, (i9 & 16) != 0 ? false : z7, (i9 & 32) != 0 ? false : z8, (i9 & 64) != 0 ? false : z9, (i9 & 128) != 0 ? null : charset);
        }

        public static /* synthetic */ String n(b bVar, String str, int i7, int i8, boolean z6, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i7 = 0;
            }
            if ((i9 & 2) != 0) {
                i8 = str.length();
            }
            if ((i9 & 4) != 0) {
                z6 = false;
            }
            return bVar.m(str, i7, i8, z6);
        }

        @s4.h(name = "-deprecated_get")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        public final v a(@n6.d String str) {
            l0.p(str, "url");
            return h(str);
        }

        @s4.h(name = "-deprecated_get")
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @n6.e
        public final v b(@n6.d URI uri) {
            l0.p(uri, "uri");
            return i(uri);
        }

        @s4.h(name = "-deprecated_get")
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @n6.e
        public final v c(@n6.d URL url) {
            l0.p(url, "url");
            return j(url);
        }

        @s4.h(name = "-deprecated_parse")
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @n6.e
        public final v d(@n6.d String str) {
            l0.p(str, "url");
            return l(str);
        }

        @n6.d
        public final String e(@n6.d String str, int i7, int i8, @n6.d String str2, boolean z6, boolean z7, boolean z8, boolean z9, @n6.e Charset charset) {
            l0.p(str, "$this$canonicalize");
            l0.p(str2, "encodeSet");
            int i9 = i7;
            while (i9 < i8) {
                int codePointAt = str.codePointAt(i9);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z9) && !i5.c0.V2(str2, (char) codePointAt, false, 2, null))) {
                    if (codePointAt == 37) {
                        if (z6) {
                            if (z7) {
                                if (!k(str, i9, i8)) {
                                    i6.m mVar = new i6.m();
                                    mVar.s(str, i7, i9);
                                    r(mVar, str, i9, i8, str2, z6, z7, z8, z9, charset);
                                    return mVar.j0();
                                }
                                if (codePointAt != 43 && z8) {
                                    i6.m mVar2 = new i6.m();
                                    mVar2.s(str, i7, i9);
                                    r(mVar2, str, i9, i8, str2, z6, z7, z8, z9, charset);
                                    return mVar2.j0();
                                }
                                i9 += Character.charCount(codePointAt);
                            }
                        }
                    }
                    if (codePointAt != 43) {
                    }
                    i9 += Character.charCount(codePointAt);
                }
                i6.m mVar22 = new i6.m();
                mVar22.s(str, i7, i9);
                r(mVar22, str, i9, i8, str2, z6, z7, z8, z9, charset);
                return mVar22.j0();
            }
            String substring = str.substring(i7, i8);
            l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @s4.m
        public final int g(@n6.d String str) {
            l0.p(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        @s4.h(name = "get")
        @n6.d
        @s4.m
        public final v h(@n6.d String str) {
            l0.p(str, "$this$toHttpUrl");
            return new a().A(null, str).h();
        }

        @s4.h(name = "get")
        @s4.m
        @n6.e
        public final v i(@n6.d URI uri) {
            l0.p(uri, "$this$toHttpUrlOrNull");
            String uri2 = uri.toString();
            l0.o(uri2, "toString()");
            return l(uri2);
        }

        @s4.h(name = "get")
        @s4.m
        @n6.e
        public final v j(@n6.d URL url) {
            l0.p(url, "$this$toHttpUrlOrNull");
            String url2 = url.toString();
            l0.o(url2, "toString()");
            return l(url2);
        }

        public final boolean k(String str, int i7, int i8) {
            int i9 = i7 + 2;
            return i9 < i8 && str.charAt(i7) == '%' && s5.d.N(str.charAt(i7 + 1)) != -1 && s5.d.N(str.charAt(i9)) != -1;
        }

        @s4.h(name = "parse")
        @s4.m
        @n6.e
        public final v l(@n6.d String str) {
            l0.p(str, "$this$toHttpUrlOrNull");
            try {
                return h(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @n6.d
        public final String m(@n6.d String str, int i7, int i8, boolean z6) {
            l0.p(str, "$this$percentDecode");
            for (int i9 = i7; i9 < i8; i9++) {
                char charAt = str.charAt(i9);
                if (charAt == '%' || (charAt == '+' && z6)) {
                    i6.m mVar = new i6.m();
                    mVar.s(str, i7, i9);
                    s(mVar, str, i9, i8, z6);
                    return mVar.j0();
                }
            }
            String substring = str.substring(i7, i8);
            l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void o(@n6.d List<String> list, @n6.d StringBuilder sb) {
            l0.p(list, "$this$toPathString");
            l0.p(sb, "out");
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                sb.append('/');
                sb.append(list.get(i7));
            }
        }

        @n6.d
        public final List<String> p(@n6.d String str) {
            l0.p(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            while (i7 <= str.length()) {
                int r32 = i5.c0.r3(str, i5.h0.f11095d, i7, false, 4, null);
                if (r32 == -1) {
                    r32 = str.length();
                }
                int i8 = r32;
                int r33 = i5.c0.r3(str, '=', i7, false, 4, null);
                if (r33 == -1 || r33 > i8) {
                    String substring = str.substring(i7, i8);
                    l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i7, r33);
                    l0.o(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(r33 + 1, i8);
                    l0.o(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i7 = i8 + 1;
            }
            return arrayList;
        }

        public final void q(@n6.d List<String> list, @n6.d StringBuilder sb) {
            l0.p(list, "$this$toQueryString");
            l0.p(sb, "out");
            d5.j B1 = d5.u.B1(d5.u.W1(0, list.size()), 2);
            int i7 = B1.i();
            int j7 = B1.j();
            int k7 = B1.k();
            if (k7 >= 0) {
                if (i7 > j7) {
                    return;
                }
            } else if (i7 < j7) {
                return;
            }
            while (true) {
                String str = list.get(i7);
                String str2 = list.get(i7 + 1);
                if (i7 > 0) {
                    sb.append(i5.h0.f11095d);
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i7 == j7) {
                    return;
                }
                i7 += k7;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
            if (k(r16, r5, r18) == false) goto L43;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void r(i6.m r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lc5
                if (r1 == 0) goto Lbc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L2b
                r8 = 9
                if (r7 == r8) goto L26
                r8 = 10
                if (r7 == r8) goto L26
                r8 = 12
                if (r7 == r8) goto L26
                r8 = 13
                if (r7 == r8) goto L26
                goto L2b
            L26:
                r8 = r14
                r12 = r19
                goto Lb5
            L2b:
                r8 = 43
                if (r7 != r8) goto L3c
                if (r22 == 0) goto L3c
                if (r20 == 0) goto L36
                java.lang.String r8 = "+"
                goto L38
            L36:
                java.lang.String r8 = "%2B"
            L38:
                r15.H0(r8)
                goto L26
            L3c:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L6c
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L6c
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L4c
                if (r23 == 0) goto L6c
            L4c:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = i5.c0.V2(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L6a
                if (r7 != r9) goto L65
                if (r20 == 0) goto L6a
                if (r21 == 0) goto L65
                r8 = r14
                boolean r10 = r14.k(r1, r5, r2)
                if (r10 != 0) goto L66
                goto L6f
            L65:
                r8 = r14
            L66:
                r15.H(r7)
                goto Lb5
            L6a:
                r8 = r14
                goto L6f
            L6c:
                r8 = r14
                r12 = r19
            L6f:
                if (r6 != 0) goto L76
                i6.m r6 = new i6.m
                r6.<init>()
            L76:
                if (r3 == 0) goto L8a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = u4.l0.g(r3, r10)
                if (r10 == 0) goto L81
                goto L8a
            L81:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.D0(r1, r5, r10, r3)
                goto L8d
            L8a:
                r6.H(r7)
            L8d:
                boolean r10 = r6.c0()
                if (r10 != 0) goto Lb5
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.e0(r9)
                char[] r11 = r5.v.t()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.e0(r11)
                char[] r11 = r5.v.t()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.e0(r10)
                goto L8d
            Lb5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbc:
                r8 = r14
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            Lc5:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.v.b.r(i6.m, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        public final void s(i6.m mVar, String str, int i7, int i8, boolean z6) {
            int i9;
            while (i7 < i8) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int codePointAt = str.codePointAt(i7);
                if (codePointAt != 37 || (i9 = i7 + 2) >= i8) {
                    if (codePointAt == 43 && z6) {
                        mVar.e0(32);
                        i7++;
                    }
                    mVar.H(codePointAt);
                    i7 += Character.charCount(codePointAt);
                } else {
                    int N = s5.d.N(str.charAt(i7 + 1));
                    int N2 = s5.d.N(str.charAt(i9));
                    if (N != -1 && N2 != -1) {
                        mVar.e0((N << 4) + N2);
                        i7 = Character.charCount(codePointAt) + i9;
                    }
                    mVar.H(codePointAt);
                    i7 += Character.charCount(codePointAt);
                }
            }
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    public v(@n6.d String str, @n6.d String str2, @n6.d String str3, @n6.d String str4, int i7, @n6.d List<String> list, @n6.e List<String> list2, @n6.e String str5, @n6.d String str6) {
        l0.p(str, "scheme");
        l0.p(str2, "username");
        l0.p(str3, "password");
        l0.p(str4, a6.g.f399j);
        l0.p(list, "pathSegments");
        l0.p(str6, "url");
        this.f16062b = str;
        this.f16063c = str2;
        this.f16064d = str3;
        this.f16065e = str4;
        this.f16066f = i7;
        this.f16067g = list;
        this.f16068h = list2;
        this.f16069i = str5;
        this.f16070j = str6;
        this.f16061a = l0.g(str, "https");
    }

    @s4.h(name = "get")
    @n6.d
    @s4.m
    public static final v C(@n6.d String str) {
        return f16060w.h(str);
    }

    @s4.h(name = "get")
    @s4.m
    @n6.e
    public static final v D(@n6.d URI uri) {
        return f16060w.i(uri);
    }

    @s4.h(name = "get")
    @s4.m
    @n6.e
    public static final v E(@n6.d URL url) {
        return f16060w.j(url);
    }

    @s4.h(name = "parse")
    @s4.m
    @n6.e
    public static final v J(@n6.d String str) {
        return f16060w.l(str);
    }

    @s4.m
    public static final int u(@n6.d String str) {
        return f16060w.g(str);
    }

    @s4.h(name = "encodedUsername")
    @n6.d
    public final String A() {
        if (this.f16063c.length() == 0) {
            return "";
        }
        int length = this.f16062b.length() + 3;
        String str = this.f16070j;
        int q6 = s5.d.q(str, ":@", length, str.length());
        String str2 = this.f16070j;
        if (str2 != null) {
            String substring = str2.substring(length, q6);
            l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @s4.h(name = "fragment")
    @n6.e
    public final String B() {
        return this.f16069i;
    }

    @s4.h(name = a6.g.f399j)
    @n6.d
    public final String F() {
        return this.f16065e;
    }

    public final boolean G() {
        return this.f16061a;
    }

    @n6.d
    public final a H() {
        a aVar = new a();
        aVar.X(this.f16062b);
        aVar.S(A());
        aVar.O(w());
        aVar.T(this.f16065e);
        aVar.V(this.f16066f != f16060w.g(this.f16062b) ? this.f16066f : -1);
        aVar.r().clear();
        aVar.r().addAll(y());
        aVar.m(z());
        aVar.N(v());
        return aVar;
    }

    @n6.e
    public final a I(@n6.d String str) {
        l0.p(str, "link");
        try {
            return new a().A(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @s4.h(name = "password")
    @n6.d
    public final String K() {
        return this.f16064d;
    }

    @s4.h(name = "pathSegments")
    @n6.d
    public final List<String> L() {
        return this.f16067g;
    }

    @s4.h(name = "pathSize")
    public final int M() {
        return this.f16067g.size();
    }

    @s4.h(name = "port")
    public final int N() {
        return this.f16066f;
    }

    @s4.h(name = "query")
    @n6.e
    public final String O() {
        if (this.f16068h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f16060w.q(this.f16068h, sb);
        return sb.toString();
    }

    @n6.e
    public final String P(@n6.d String str) {
        l0.p(str, "name");
        List<String> list = this.f16068h;
        if (list == null) {
            return null;
        }
        d5.j B1 = d5.u.B1(d5.u.W1(0, list.size()), 2);
        int i7 = B1.i();
        int j7 = B1.j();
        int k7 = B1.k();
        if (k7 < 0 ? i7 >= j7 : i7 <= j7) {
            while (!l0.g(str, this.f16068h.get(i7))) {
                if (i7 != j7) {
                    i7 += k7;
                }
            }
            return this.f16068h.get(i7 + 1);
        }
        return null;
    }

    @n6.d
    public final String Q(int i7) {
        List<String> list = this.f16068h;
        if (list != null) {
            String str = list.get(i7 * 2);
            l0.m(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    @s4.h(name = "queryParameterNames")
    @n6.d
    public final Set<String> R() {
        if (this.f16068h == null) {
            return l1.k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        d5.j B1 = d5.u.B1(d5.u.W1(0, this.f16068h.size()), 2);
        int i7 = B1.i();
        int j7 = B1.j();
        int k7 = B1.k();
        if (k7 < 0 ? i7 >= j7 : i7 <= j7) {
            while (true) {
                String str = this.f16068h.get(i7);
                l0.m(str);
                linkedHashSet.add(str);
                if (i7 == j7) {
                    break;
                }
                i7 += k7;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        l0.o(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @n6.e
    public final String S(int i7) {
        List<String> list = this.f16068h;
        if (list != null) {
            return list.get((i7 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @n6.d
    public final List<String> T(@n6.d String str) {
        l0.p(str, "name");
        if (this.f16068h == null) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList();
        d5.j B1 = d5.u.B1(d5.u.W1(0, this.f16068h.size()), 2);
        int i7 = B1.i();
        int j7 = B1.j();
        int k7 = B1.k();
        if (k7 < 0 ? i7 >= j7 : i7 <= j7) {
            while (true) {
                if (l0.g(str, this.f16068h.get(i7))) {
                    arrayList.add(this.f16068h.get(i7 + 1));
                }
                if (i7 == j7) {
                    break;
                }
                i7 += k7;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        l0.o(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    @s4.h(name = "querySize")
    public final int U() {
        List<String> list = this.f16068h;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @n6.d
    public final String V() {
        a I = I("/...");
        l0.m(I);
        return I.Y("").B("").h().toString();
    }

    @n6.e
    public final v W(@n6.d String str) {
        l0.p(str, "link");
        a I = I(str);
        if (I != null) {
            return I.h();
        }
        return null;
    }

    @s4.h(name = "scheme")
    @n6.d
    public final String X() {
        return this.f16062b;
    }

    @n6.e
    public final String Y() {
        if (s5.d.h(this.f16065e)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.c().e(this.f16065e);
    }

    @s4.h(name = "uri")
    @n6.d
    public final URI Z() {
        String aVar = H().G().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e7) {
            try {
                URI create = URI.create(new i5.o("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m(aVar, ""));
                l0.o(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e7);
            }
        }
    }

    @s4.h(name = "-deprecated_encodedFragment")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedFragment", imports = {}))
    @n6.e
    public final String a() {
        return v();
    }

    @s4.h(name = "url")
    @n6.d
    public final URL a0() {
        try {
            return new URL(this.f16070j);
        } catch (MalformedURLException e7) {
            throw new RuntimeException(e7);
        }
    }

    @s4.h(name = "-deprecated_encodedPassword")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedPassword", imports = {}))
    public final String b() {
        return w();
    }

    @s4.h(name = "username")
    @n6.d
    public final String b0() {
        return this.f16063c;
    }

    @s4.h(name = "-deprecated_encodedPath")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedPath", imports = {}))
    public final String c() {
        return x();
    }

    @s4.h(name = "-deprecated_encodedPathSegments")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedPathSegments", imports = {}))
    public final List<String> d() {
        return y();
    }

    @s4.h(name = "-deprecated_encodedQuery")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedQuery", imports = {}))
    @n6.e
    public final String e() {
        return z();
    }

    public boolean equals(@n6.e Object obj) {
        return (obj instanceof v) && l0.g(((v) obj).f16070j, this.f16070j);
    }

    @s4.h(name = "-deprecated_encodedUsername")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedUsername", imports = {}))
    public final String f() {
        return A();
    }

    @s4.h(name = "-deprecated_fragment")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "fragment", imports = {}))
    @n6.e
    public final String g() {
        return this.f16069i;
    }

    @s4.h(name = "-deprecated_host")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = a6.g.f399j, imports = {}))
    public final String h() {
        return this.f16065e;
    }

    public int hashCode() {
        return this.f16070j.hashCode();
    }

    @s4.h(name = "-deprecated_password")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "password", imports = {}))
    public final String i() {
        return this.f16064d;
    }

    @s4.h(name = "-deprecated_pathSegments")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "pathSegments", imports = {}))
    public final List<String> j() {
        return this.f16067g;
    }

    @s4.h(name = "-deprecated_pathSize")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "pathSize", imports = {}))
    public final int k() {
        return M();
    }

    @s4.h(name = "-deprecated_port")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "port", imports = {}))
    public final int l() {
        return this.f16066f;
    }

    @s4.h(name = "-deprecated_query")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "query", imports = {}))
    @n6.e
    public final String m() {
        return O();
    }

    @s4.h(name = "-deprecated_queryParameterNames")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "queryParameterNames", imports = {}))
    public final Set<String> n() {
        return R();
    }

    @s4.h(name = "-deprecated_querySize")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "querySize", imports = {}))
    public final int o() {
        return U();
    }

    @s4.h(name = "-deprecated_scheme")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "scheme", imports = {}))
    public final String p() {
        return this.f16062b;
    }

    @s4.h(name = "-deprecated_uri")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to toUri()", replaceWith = @b1(expression = "toUri()", imports = {}))
    public final URI q() {
        return Z();
    }

    @s4.h(name = "-deprecated_url")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to toUrl()", replaceWith = @b1(expression = "toUrl()", imports = {}))
    public final URL r() {
        return a0();
    }

    @s4.h(name = "-deprecated_username")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "username", imports = {}))
    public final String s() {
        return this.f16063c;
    }

    @n6.d
    public String toString() {
        return this.f16070j;
    }

    @s4.h(name = "encodedFragment")
    @n6.e
    public final String v() {
        if (this.f16069i == null) {
            return null;
        }
        int r32 = i5.c0.r3(this.f16070j, '#', 0, false, 6, null) + 1;
        String str = this.f16070j;
        if (str != null) {
            String substring = str.substring(r32);
            l0.o(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @s4.h(name = "encodedPassword")
    @n6.d
    public final String w() {
        if (this.f16064d.length() == 0) {
            return "";
        }
        int r32 = i5.c0.r3(this.f16070j, ':', this.f16062b.length() + 3, false, 4, null) + 1;
        int r33 = i5.c0.r3(this.f16070j, '@', 0, false, 6, null);
        String str = this.f16070j;
        if (str != null) {
            String substring = str.substring(r32, r33);
            l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @s4.h(name = "encodedPath")
    @n6.d
    public final String x() {
        int r32 = i5.c0.r3(this.f16070j, '/', this.f16062b.length() + 3, false, 4, null);
        String str = this.f16070j;
        int q6 = s5.d.q(str, "?#", r32, str.length());
        String str2 = this.f16070j;
        if (str2 != null) {
            String substring = str2.substring(r32, q6);
            l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @s4.h(name = "encodedPathSegments")
    @n6.d
    public final List<String> y() {
        int r32 = i5.c0.r3(this.f16070j, '/', this.f16062b.length() + 3, false, 4, null);
        String str = this.f16070j;
        int q6 = s5.d.q(str, "?#", r32, str.length());
        ArrayList arrayList = new ArrayList();
        while (r32 < q6) {
            int i7 = r32 + 1;
            int p6 = s5.d.p(this.f16070j, '/', i7, q6);
            String str2 = this.f16070j;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = str2.substring(i7, p6);
            l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            r32 = p6;
        }
        return arrayList;
    }

    @s4.h(name = "encodedQuery")
    @n6.e
    public final String z() {
        if (this.f16068h == null) {
            return null;
        }
        int r32 = i5.c0.r3(this.f16070j, '?', 0, false, 6, null) + 1;
        String str = this.f16070j;
        int p6 = s5.d.p(str, '#', r32, str.length());
        String str2 = this.f16070j;
        if (str2 != null) {
            String substring = str2.substring(r32, p6);
            l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
