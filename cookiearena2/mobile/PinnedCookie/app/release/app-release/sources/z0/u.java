package z0;

import android.os.LocaleList;
import java.util.Locale;
import z0.a;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b  reason: collision with root package name */
    public static final u f19030b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public final w f19031a;

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Locale[] f19032a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        @d.u
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale) {
            for (Locale locale2 : f19032a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        @d.u
        public static boolean c(@d.o0 Locale locale, @d.o0 Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String c7 = d1.e.c(locale);
            if (c7.isEmpty()) {
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            return c7.equals(d1.e.c(locale2));
        }
    }

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @d.u
        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        @d.u
        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public u(w wVar) {
        this.f19031a = wVar;
    }

    @d.o0
    public static u a(@d.o0 Locale... localeArr) {
        return o(b.a(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @d.o0
    public static u c(@d.q0 String str) {
        if (str == null || str.isEmpty()) {
            return g();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            localeArr[i7] = a.a(split[i7]);
        }
        return a(localeArr);
    }

    @d.d1(min = i6.p.f11250n)
    @d.o0
    public static u e() {
        return o(b.b());
    }

    @d.d1(min = i6.p.f11250n)
    @d.o0
    public static u f() {
        return o(b.c());
    }

    @d.o0
    public static u g() {
        return f19030b;
    }

    @d.s0(markerClass = {a.b.class})
    @d.w0(21)
    public static boolean k(@d.o0 Locale locale, @d.o0 Locale locale2) {
        boolean matchesLanguageAndScript;
        if (z0.a.k()) {
            matchesLanguageAndScript = LocaleList.matchesLanguageAndScript(locale, locale2);
            return matchesLanguageAndScript;
        }
        return a.c(locale, locale2);
    }

    @d.o0
    @d.w0(24)
    public static u o(@d.o0 LocaleList localeList) {
        return new u(new x(localeList));
    }

    @d.w0(24)
    @Deprecated
    public static u p(Object obj) {
        return o((LocaleList) obj);
    }

    @d.q0
    public Locale d(int i7) {
        return this.f19031a.get(i7);
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && this.f19031a.equals(((u) obj).f19031a);
    }

    @d.q0
    public Locale h(@d.o0 String[] strArr) {
        return this.f19031a.d(strArr);
    }

    public int hashCode() {
        return this.f19031a.hashCode();
    }

    @d.g0(from = -1)
    public int i(@d.q0 Locale locale) {
        return this.f19031a.c(locale);
    }

    public boolean j() {
        return this.f19031a.isEmpty();
    }

    @d.g0(from = 0)
    public int l() {
        return this.f19031a.size();
    }

    @d.o0
    public String m() {
        return this.f19031a.a();
    }

    @d.q0
    public Object n() {
        return this.f19031a.b();
    }

    @d.o0
    public String toString() {
        return this.f19031a.toString();
    }
}
