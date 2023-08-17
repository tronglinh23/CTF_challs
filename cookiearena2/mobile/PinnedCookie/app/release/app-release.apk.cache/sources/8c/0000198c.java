package r5;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import u4.l0;
import v3.b1;
import x3.a1;

/* loaded from: classes.dex */
public final class h {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f15891a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final String f15892b;

    public h(@n6.d String str, @n6.d Map<String, String> map) {
        String str2;
        l0.p(str, "scheme");
        l0.p(map, "authParams");
        this.f15892b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                l0.o(locale, "US");
                str2 = key.toLowerCase(locale);
                l0.o(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l0.o(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f15891a = unmodifiableMap;
    }

    @s4.h(name = "-deprecated_authParams")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "authParams", imports = {}))
    public final Map<String, String> a() {
        return this.f15891a;
    }

    @s4.h(name = "-deprecated_charset")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "charset", imports = {}))
    public final Charset b() {
        return f();
    }

    @s4.h(name = "-deprecated_realm")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "realm", imports = {}))
    @n6.e
    public final String c() {
        return g();
    }

    @s4.h(name = "-deprecated_scheme")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "scheme", imports = {}))
    public final String d() {
        return this.f15892b;
    }

    @s4.h(name = "authParams")
    @n6.d
    public final Map<String, String> e() {
        return this.f15891a;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (l0.g(hVar.f15892b, this.f15892b) && l0.g(hVar.f15891a, this.f15891a)) {
                return true;
            }
        }
        return false;
    }

    @s4.h(name = "charset")
    @n6.d
    public final Charset f() {
        String str = this.f15891a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                l0.o(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        l0.o(charset, "ISO_8859_1");
        return charset;
    }

    @s4.h(name = "realm")
    @n6.e
    public final String g() {
        return this.f15891a.get("realm");
    }

    @s4.h(name = "scheme")
    @n6.d
    public final String h() {
        return this.f15892b;
    }

    public int hashCode() {
        return ((899 + this.f15892b.hashCode()) * 31) + this.f15891a.hashCode();
    }

    @n6.d
    public final h i(@n6.d Charset charset) {
        l0.p(charset, "charset");
        Map J0 = a1.J0(this.f15891a);
        String name = charset.name();
        l0.o(name, "charset.name()");
        J0.put("charset", name);
        return new h(this.f15892b, J0);
    }

    @n6.d
    public String toString() {
        return this.f15892b + " authParams=" + this.f15891a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(@n6.d java.lang.String r2, @n6.d java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "scheme"
            u4.l0.p(r2, r0)
            java.lang.String r0 = "realm"
            u4.l0.p(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "singletonMap(\"realm\", realm)"
            u4.l0.o(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.h.<init>(java.lang.String, java.lang.String):void");
    }
}