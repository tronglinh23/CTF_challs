package z0;

import d.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes.dex */
public final class v implements w {

    /* renamed from: c  reason: collision with root package name */
    public static final Locale[] f19033c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Locale f19034d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    public static final Locale f19035e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    public static final Locale f19036f = u.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f19037a;
    @d.o0

    /* renamed from: b  reason: collision with root package name */
    public final String f19038b;

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    public v(@d.o0 Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f19037a = f19033c;
            this.f19038b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < localeArr.length; i7++) {
            Locale locale = localeArr[i7];
            if (locale == null) {
                throw new NullPointerException("list[" + i7 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                k(sb, locale2);
                if (i7 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f19037a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f19038b = sb.toString();
    }

    public static String h(Locale locale) {
        String a7 = a.a(locale);
        return !a7.isEmpty() ? a7 : "";
    }

    public static boolean i(Locale locale) {
        return f19034d.equals(locale) || f19035e.equals(locale);
    }

    @d.g0(from = 0, to = i6.p.f11250n)
    public static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || i(locale) || i(locale2)) {
            return 0;
        }
        String h7 = h(locale);
        if (h7.isEmpty()) {
            String country = locale.getCountry();
            return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
        }
        return h7.equals(h(locale2)) ? 1 : 0;
    }

    @l1
    public static void k(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // z0.w
    public String a() {
        return this.f19038b;
    }

    @Override // z0.w
    @d.q0
    public Object b() {
        return null;
    }

    @Override // z0.w
    public int c(Locale locale) {
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.f19037a;
            if (i7 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i7].equals(locale)) {
                return i7;
            }
            i7++;
        }
    }

    @Override // z0.w
    public Locale d(@d.o0 String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    public final Locale e(Collection<String> collection, boolean z6) {
        int f7 = f(collection, z6);
        if (f7 == -1) {
            return null;
        }
        return this.f19037a[f7];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        Locale[] localeArr = ((v) obj).f19037a;
        if (this.f19037a.length != localeArr.length) {
            return false;
        }
        int i7 = 0;
        while (true) {
            Locale[] localeArr2 = this.f19037a;
            if (i7 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i7].equals(localeArr[i7])) {
                return false;
            }
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r6 < Integer.MAX_VALUE) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f19037a
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L8
            return r3
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = z0.v.f19036f
            int r6 = r4.g(r6)
            if (r6 != 0) goto L1b
            return r3
        L1b:
            if (r6 >= r0) goto L1e
            goto L1f
        L1e:
            r6 = r0
        L1f:
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = z0.u.b(r1)
            int r1 = r4.g(r1)
            if (r1 != 0) goto L3a
            return r3
        L3a:
            if (r1 >= r6) goto L23
            r6 = r1
            goto L23
        L3e:
            if (r6 != r0) goto L41
            return r3
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.v.f(java.util.Collection, boolean):int");
    }

    public final int g(Locale locale) {
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.f19037a;
            if (i7 >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (j(locale, localeArr[i7]) > 0) {
                return i7;
            }
            i7++;
        }
    }

    @Override // z0.w
    public Locale get(int i7) {
        if (i7 >= 0) {
            Locale[] localeArr = this.f19037a;
            if (i7 < localeArr.length) {
                return localeArr[i7];
            }
        }
        return null;
    }

    public int hashCode() {
        int i7 = 1;
        for (Locale locale : this.f19037a) {
            i7 = (i7 * 31) + locale.hashCode();
        }
        return i7;
    }

    @Override // z0.w
    public boolean isEmpty() {
        return this.f19037a.length == 0;
    }

    @Override // z0.w
    public int size() {
        return this.f19037a.length;
    }

    @d.o0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.f19037a;
            if (i7 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i7]);
            if (i7 < this.f19037a.length - 1) {
                sb.append(',');
            }
            i7++;
        }
    }
}
