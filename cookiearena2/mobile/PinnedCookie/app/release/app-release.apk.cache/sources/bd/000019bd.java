package r5;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u4.l0;
import v3.b1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: e */
    public static final String f16084e = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* renamed from: f */
    public static final String f16085f = "\"([^\"]*)\"";

    /* renamed from: a */
    public final String f16089a;
    @n6.d

    /* renamed from: b */
    public final String f16090b;
    @n6.d

    /* renamed from: c */
    public final String f16091c;

    /* renamed from: d */
    public final String[] f16092d;

    /* renamed from: i */
    public static final a f16088i = new a(null);

    /* renamed from: g */
    public static final Pattern f16086g = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: h */
    public static final Pattern f16087h = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @s4.h(name = "-deprecated_get")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        public final x a(@n6.d String str) {
            l0.p(str, "mediaType");
            return c(str);
        }

        @s4.h(name = "-deprecated_parse")
        @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @n6.e
        public final x b(@n6.d String str) {
            l0.p(str, "mediaType");
            return d(str);
        }

        @s4.h(name = "get")
        @n6.d
        @s4.m
        public final x c(@n6.d String str) {
            l0.p(str, "$this$toMediaType");
            Matcher matcher = x.f16086g.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + i5.h0.f11093b).toString());
            }
            String group = matcher.group(1);
            l0.o(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            l0.o(locale, "Locale.US");
            if (group != null) {
                String lowerCase = group.toLowerCase(locale);
                l0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                l0.o(group2, "typeSubtype.group(2)");
                l0.o(locale, "Locale.US");
                if (group2 != null) {
                    String lowerCase2 = group2.toLowerCase(locale);
                    l0.o(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                    ArrayList arrayList = new ArrayList();
                    Matcher matcher2 = x.f16087h.matcher(str);
                    int end = matcher.end();
                    while (end < str.length()) {
                        matcher2.region(end, str.length());
                        if (!matcher2.lookingAt()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Parameter is not formatted correctly: \"");
                            String substring = str.substring(end);
                            l0.o(substring, "(this as java.lang.String).substring(startIndex)");
                            sb.append(substring);
                            sb.append("\" for: \"");
                            sb.append(str);
                            sb.append(i5.h0.f11093b);
                            throw new IllegalArgumentException(sb.toString().toString());
                        }
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (i5.b0.v2(group4, "'", false, 2, null) && i5.b0.K1(group4, "'", false, 2, null) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                l0.o(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        return new x(str, lowerCase, lowerCase2, (String[]) array, null);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        @s4.h(name = "parse")
        @s4.m
        @n6.e
        public final x d(@n6.d String str) {
            l0.p(str, "$this$toMediaTypeOrNull");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    public x(String str, String str2, String str3, String[] strArr) {
        this.f16089a = str;
        this.f16090b = str2;
        this.f16091c = str3;
        this.f16092d = strArr;
    }

    public static /* synthetic */ Charset g(x xVar, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = null;
        }
        return xVar.f(charset);
    }

    @s4.h(name = "get")
    @n6.d
    @s4.m
    public static final x h(@n6.d String str) {
        return f16088i.c(str);
    }

    @s4.h(name = "parse")
    @s4.m
    @n6.e
    public static final x j(@n6.d String str) {
        return f16088i.d(str);
    }

    @s4.h(name = "-deprecated_subtype")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "subtype", imports = {}))
    public final String a() {
        return this.f16091c;
    }

    @s4.h(name = "-deprecated_type")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "type", imports = {}))
    public final String b() {
        return this.f16090b;
    }

    @s4.i
    @n6.e
    public final Charset e() {
        return g(this, null, 1, null);
    }

    public boolean equals(@n6.e Object obj) {
        return (obj instanceof x) && l0.g(((x) obj).f16089a, this.f16089a);
    }

    @s4.i
    @n6.e
    public final Charset f(@n6.e Charset charset) {
        String i7 = i("charset");
        if (i7 != null) {
            try {
                return Charset.forName(i7);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        return charset;
    }

    public int hashCode() {
        return this.f16089a.hashCode();
    }

    @n6.e
    public final String i(@n6.d String str) {
        l0.p(str, "name");
        d5.j B1 = d5.u.B1(x3.p.Oe(this.f16092d), 2);
        int i7 = B1.i();
        int j7 = B1.j();
        int k7 = B1.k();
        if (k7 >= 0) {
            if (i7 > j7) {
                return null;
            }
        } else if (i7 < j7) {
            return null;
        }
        while (!i5.b0.L1(this.f16092d[i7], str, true)) {
            if (i7 == j7) {
                return null;
            }
            i7 += k7;
        }
        return this.f16092d[i7 + 1];
    }

    @s4.h(name = "subtype")
    @n6.d
    public final String k() {
        return this.f16091c;
    }

    @s4.h(name = "type")
    @n6.d
    public final String l() {
        return this.f16090b;
    }

    @n6.d
    public String toString() {
        return this.f16089a;
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, u4.w wVar) {
        this(str, str2, str3, strArr);
    }
}