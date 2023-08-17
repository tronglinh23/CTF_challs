package r5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import u4.l0;
import v3.b1;
/* loaded from: classes.dex */
public final class m {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final String f15996a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final String f15997b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15998c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final String f15999d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final String f16000e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f16001f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f16002g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f16003h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f16004i;

    /* renamed from: n  reason: collision with root package name */
    public static final b f15995n = new b(null);

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f15991j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f15992k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f15993l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f15994m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f16005a;

        /* renamed from: b  reason: collision with root package name */
        public String f16006b;

        /* renamed from: d  reason: collision with root package name */
        public String f16008d;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16010f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f16011g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f16012h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f16013i;

        /* renamed from: c  reason: collision with root package name */
        public long f16007c = y5.c.f18855a;

        /* renamed from: e  reason: collision with root package name */
        public String f16009e = "/";

        @n6.d
        public final m a() {
            String str = this.f16005a;
            if (str != null) {
                String str2 = this.f16006b;
                if (str2 != null) {
                    long j7 = this.f16007c;
                    String str3 = this.f16008d;
                    if (str3 != null) {
                        return new m(str, str2, j7, str3, this.f16009e, this.f16010f, this.f16011g, this.f16012h, this.f16013i, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        @n6.d
        public final a b(@n6.d String str) {
            l0.p(str, "domain");
            return c(str, false);
        }

        public final a c(String str, boolean z6) {
            String e7 = s5.a.e(str);
            if (e7 != null) {
                this.f16008d = e7;
                this.f16013i = z6;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        @n6.d
        public final a d(long j7) {
            if (j7 <= 0) {
                j7 = Long.MIN_VALUE;
            }
            if (j7 > y5.c.f18855a) {
                j7 = 253402300799999L;
            }
            this.f16007c = j7;
            this.f16012h = true;
            return this;
        }

        @n6.d
        public final a e(@n6.d String str) {
            l0.p(str, "domain");
            return c(str, true);
        }

        @n6.d
        public final a f() {
            this.f16011g = true;
            return this;
        }

        @n6.d
        public final a g(@n6.d String str) {
            l0.p(str, "name");
            if (l0.g(i5.c0.F5(str).toString(), str)) {
                this.f16005a = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        @n6.d
        public final a h(@n6.d String str) {
            l0.p(str, "path");
            if (i5.b0.v2(str, "/", false, 2, null)) {
                this.f16009e = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'".toString());
        }

        @n6.d
        public final a i() {
            this.f16010f = true;
            return this;
        }

        @n6.d
        public final a j(@n6.d String str) {
            l0.p(str, "value");
            if (l0.g(i5.c0.F5(str).toString(), str)) {
                this.f16006b = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public final int c(String str, int i7, int i8, boolean z6) {
            while (i7 < i8) {
                char charAt = str.charAt(i7);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z6)) {
                    return i7;
                }
                i7++;
            }
            return i8;
        }

        public final boolean d(String str, String str2) {
            if (l0.g(str, str2)) {
                return true;
            }
            return i5.b0.K1(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !s5.d.h(str);
        }

        @s4.m
        @n6.e
        public final m e(@n6.d v vVar, @n6.d String str) {
            l0.p(vVar, "url");
            l0.p(str, "setCookie");
            return f(System.currentTimeMillis(), vVar, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
            if (r1 > y5.c.f18855a) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final r5.m f(long r26, @n6.d r5.v r28, @n6.d java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 379
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.m.b.f(long, r5.v, java.lang.String):r5.m");
        }

        @n6.d
        @s4.m
        public final List<m> g(@n6.d v vVar, @n6.d u uVar) {
            l0.p(vVar, "url");
            l0.p(uVar, "headers");
            List<String> p6 = uVar.p("Set-Cookie");
            int size = p6.size();
            ArrayList arrayList = null;
            for (int i7 = 0; i7 < size; i7++) {
                m e7 = e(vVar, p6.get(i7));
                if (e7 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(e7);
                }
            }
            if (arrayList != null) {
                List<m> unmodifiableList = Collections.unmodifiableList(arrayList);
                l0.o(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            return x3.w.E();
        }

        public final String h(String str) {
            if ((!i5.b0.K1(str, ".", false, 2, null)) == true) {
                String e7 = s5.a.e(i5.c0.d4(str, "."));
                if (e7 != null) {
                    return e7;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long i(String str, int i7, int i8) {
            int c7 = c(str, i7, i8, false);
            Matcher matcher = m.f15994m.matcher(str);
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            while (c7 < i8) {
                int c8 = c(str, c7 + 1, i8, true);
                matcher.region(c7, c8);
                if (i10 == -1 && matcher.usePattern(m.f15994m).matches()) {
                    String group = matcher.group(1);
                    l0.o(group, "matcher.group(1)");
                    i10 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    l0.o(group2, "matcher.group(2)");
                    i13 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    l0.o(group3, "matcher.group(3)");
                    i14 = Integer.parseInt(group3);
                } else if (i11 == -1 && matcher.usePattern(m.f15993l).matches()) {
                    String group4 = matcher.group(1);
                    l0.o(group4, "matcher.group(1)");
                    i11 = Integer.parseInt(group4);
                } else if (i12 == -1 && matcher.usePattern(m.f15992k).matches()) {
                    String group5 = matcher.group(1);
                    l0.o(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    l0.o(locale, "Locale.US");
                    if (group5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = group5.toLowerCase(locale);
                    l0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String pattern = m.f15992k.pattern();
                    l0.o(pattern, "MONTH_PATTERN.pattern()");
                    i12 = i5.c0.s3(pattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i9 == -1 && matcher.usePattern(m.f15991j).matches()) {
                    String group6 = matcher.group(1);
                    l0.o(group6, "matcher.group(1)");
                    i9 = Integer.parseInt(group6);
                }
                c7 = c(str, c8 + 1, i8, false);
            }
            if (70 <= i9 && 99 >= i9) {
                i9 += 1900;
            }
            if (i9 >= 0 && 69 >= i9) {
                i9 += 2000;
            }
            if (i9 >= 1601) {
                if (i12 != -1) {
                    if (1 <= i11 && 31 >= i11) {
                        if (i10 >= 0 && 23 >= i10) {
                            if (i13 >= 0 && 59 >= i13) {
                                if (i14 >= 0 && 59 >= i14) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(s5.d.f16656f);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i9);
                                    gregorianCalendar.set(2, i12 - 1);
                                    gregorianCalendar.set(5, i11);
                                    gregorianCalendar.set(11, i10);
                                    gregorianCalendar.set(12, i13);
                                    gregorianCalendar.set(13, i14);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long j(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e7) {
                if (new i5.o("-?\\d+").k(str)) {
                    return i5.b0.v2(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e7;
            }
        }

        public final boolean k(v vVar, String str) {
            String x6 = vVar.x();
            if (l0.g(x6, str)) {
                return true;
            }
            return i5.b0.v2(x6, str, false, 2, null) && (i5.b0.K1(str, "/", false, 2, null) || x6.charAt(str.length()) == '/');
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    public m(String str, String str2, long j7, String str3, String str4, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f15996a = str;
        this.f15997b = str2;
        this.f15998c = j7;
        this.f15999d = str3;
        this.f16000e = str4;
        this.f16001f = z6;
        this.f16002g = z7;
        this.f16003h = z8;
        this.f16004i = z9;
    }

    @s4.m
    @n6.e
    public static final m t(@n6.d v vVar, @n6.d String str) {
        return f15995n.e(vVar, str);
    }

    @n6.d
    @s4.m
    public static final List<m> u(@n6.d v vVar, @n6.d u uVar) {
        return f15995n.g(vVar, uVar);
    }

    @s4.h(name = "-deprecated_domain")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "domain", imports = {}))
    public final String a() {
        return this.f15999d;
    }

    @s4.h(name = "-deprecated_expiresAt")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "expiresAt", imports = {}))
    public final long b() {
        return this.f15998c;
    }

    @s4.h(name = "-deprecated_hostOnly")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "hostOnly", imports = {}))
    public final boolean c() {
        return this.f16004i;
    }

    @s4.h(name = "-deprecated_httpOnly")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "httpOnly", imports = {}))
    public final boolean d() {
        return this.f16002g;
    }

    @s4.h(name = "-deprecated_name")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "name", imports = {}))
    public final String e() {
        return this.f15996a;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (l0.g(mVar.f15996a, this.f15996a) && l0.g(mVar.f15997b, this.f15997b) && mVar.f15998c == this.f15998c && l0.g(mVar.f15999d, this.f15999d) && l0.g(mVar.f16000e, this.f16000e) && mVar.f16001f == this.f16001f && mVar.f16002g == this.f16002g && mVar.f16003h == this.f16003h && mVar.f16004i == this.f16004i) {
                return true;
            }
        }
        return false;
    }

    @s4.h(name = "-deprecated_path")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "path", imports = {}))
    public final String f() {
        return this.f16000e;
    }

    @s4.h(name = "-deprecated_persistent")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "persistent", imports = {}))
    public final boolean g() {
        return this.f16003h;
    }

    @s4.h(name = "-deprecated_secure")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "secure", imports = {}))
    public final boolean h() {
        return this.f16001f;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f15996a.hashCode()) * 31) + this.f15997b.hashCode()) * 31) + Long.hashCode(this.f15998c)) * 31) + this.f15999d.hashCode()) * 31) + this.f16000e.hashCode()) * 31) + Boolean.hashCode(this.f16001f)) * 31) + Boolean.hashCode(this.f16002g)) * 31) + Boolean.hashCode(this.f16003h)) * 31) + Boolean.hashCode(this.f16004i);
    }

    @s4.h(name = "-deprecated_value")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "value", imports = {}))
    public final String i() {
        return this.f15997b;
    }

    @s4.h(name = "domain")
    @n6.d
    public final String n() {
        return this.f15999d;
    }

    @s4.h(name = "expiresAt")
    public final long o() {
        return this.f15998c;
    }

    @s4.h(name = "hostOnly")
    public final boolean p() {
        return this.f16004i;
    }

    @s4.h(name = "httpOnly")
    public final boolean q() {
        return this.f16002g;
    }

    public final boolean r(@n6.d v vVar) {
        l0.p(vVar, "url");
        if ((this.f16004i ? l0.g(vVar.F(), this.f15999d) : f15995n.d(vVar.F(), this.f15999d)) && f15995n.k(vVar, this.f16000e)) {
            return !this.f16001f || vVar.G();
        }
        return false;
    }

    @s4.h(name = "name")
    @n6.d
    public final String s() {
        return this.f15996a;
    }

    @n6.d
    public String toString() {
        return y(false);
    }

    @s4.h(name = "path")
    @n6.d
    public final String v() {
        return this.f16000e;
    }

    @s4.h(name = "persistent")
    public final boolean w() {
        return this.f16003h;
    }

    @s4.h(name = "secure")
    public final boolean x() {
        return this.f16001f;
    }

    @n6.d
    public final String y(boolean z6) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15996a);
        sb.append('=');
        sb.append(this.f15997b);
        if (this.f16003h) {
            if (this.f15998c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(y5.c.b(new Date(this.f15998c)));
            }
        }
        if (!this.f16004i) {
            sb.append("; domain=");
            if (z6) {
                sb.append(".");
            }
            sb.append(this.f15999d);
        }
        sb.append("; path=");
        sb.append(this.f16000e);
        if (this.f16001f) {
            sb.append("; secure");
        }
        if (this.f16002g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        l0.o(sb2, "toString()");
        return sb2;
    }

    @s4.h(name = "value")
    @n6.d
    public final String z() {
        return this.f15997b;
    }

    public /* synthetic */ m(String str, String str2, long j7, String str3, String str4, boolean z6, boolean z7, boolean z8, boolean z9, u4.w wVar) {
        this(str, str2, j7, str3, str4, z6, z7, z8, z9);
    }
}
