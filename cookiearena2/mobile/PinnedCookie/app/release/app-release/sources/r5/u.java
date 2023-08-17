package r5;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import u4.l0;
import u4.t1;
import v3.b1;
import v3.q1;
import v3.u0;
/* loaded from: classes.dex */
public final class u implements Iterable<u0<? extends String, ? extends String>>, v4.a {

    /* renamed from: l  reason: collision with root package name */
    public static final b f16045l = new b(null);

    /* renamed from: k  reason: collision with root package name */
    public final String[] f16046k;

    /* loaded from: classes.dex */
    public static final class a {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f16047a = new ArrayList(20);

        @n6.d
        public final a a(@n6.d String str) {
            l0.p(str, "line");
            int r32 = i5.c0.r3(str, ':', 0, false, 6, null);
            if (!(r32 != -1)) {
                throw new IllegalArgumentException(("Unexpected header: " + str).toString());
            }
            String substring = str.substring(0, r32);
            l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (substring != null) {
                String obj = i5.c0.F5(substring).toString();
                String substring2 = str.substring(r32 + 1);
                l0.o(substring2, "(this as java.lang.String).substring(startIndex)");
                b(obj, substring2);
                return this;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }

        @n6.d
        public final a b(@n6.d String str, @n6.d String str2) {
            l0.p(str, "name");
            l0.p(str2, "value");
            b bVar = u.f16045l;
            bVar.f(str);
            bVar.g(str2, str);
            g(str, str2);
            return this;
        }

        @n6.d
        @IgnoreJRERequirement
        public final a c(@n6.d String str, @n6.d Instant instant) {
            l0.p(str, "name");
            l0.p(instant, "value");
            d(str, new Date(instant.toEpochMilli()));
            return this;
        }

        @n6.d
        public final a d(@n6.d String str, @n6.d Date date) {
            l0.p(str, "name");
            l0.p(date, "value");
            b(str, y5.c.b(date));
            return this;
        }

        @n6.d
        public final a e(@n6.d u uVar) {
            l0.p(uVar, "headers");
            int size = uVar.size();
            for (int i7 = 0; i7 < size; i7++) {
                g(uVar.i(i7), uVar.o(i7));
            }
            return this;
        }

        @n6.d
        public final a f(@n6.d String str) {
            l0.p(str, "line");
            int r32 = i5.c0.r3(str, ':', 1, false, 4, null);
            if (r32 != -1) {
                String substring = str.substring(0, r32);
                l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(r32 + 1);
                l0.o(substring2, "(this as java.lang.String).substring(startIndex)");
                g(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                l0.o(substring3, "(this as java.lang.String).substring(startIndex)");
                g("", substring3);
            } else {
                g("", str);
            }
            return this;
        }

        @n6.d
        public final a g(@n6.d String str, @n6.d String str2) {
            l0.p(str, "name");
            l0.p(str2, "value");
            this.f16047a.add(str);
            this.f16047a.add(i5.c0.F5(str2).toString());
            return this;
        }

        @n6.d
        public final a h(@n6.d String str, @n6.d String str2) {
            l0.p(str, "name");
            l0.p(str2, "value");
            u.f16045l.f(str);
            g(str, str2);
            return this;
        }

        @n6.d
        public final u i() {
            Object[] array = this.f16047a.toArray(new String[0]);
            if (array != null) {
                return new u((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @n6.e
        public final String j(@n6.d String str) {
            l0.p(str, "name");
            d5.j B1 = d5.u.B1(d5.u.k0(this.f16047a.size() - 2, 0), 2);
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
            while (!i5.b0.L1(str, this.f16047a.get(i7), true)) {
                if (i7 == j7) {
                    return null;
                }
                i7 += k7;
            }
            return this.f16047a.get(i7 + 1);
        }

        @n6.d
        public final List<String> k() {
            return this.f16047a;
        }

        @n6.d
        public final a l(@n6.d String str) {
            l0.p(str, "name");
            int i7 = 0;
            while (i7 < this.f16047a.size()) {
                if (i5.b0.L1(str, this.f16047a.get(i7), true)) {
                    this.f16047a.remove(i7);
                    this.f16047a.remove(i7);
                    i7 -= 2;
                }
                i7 += 2;
            }
            return this;
        }

        @n6.d
        public final a m(@n6.d String str, @n6.d String str2) {
            l0.p(str, "name");
            l0.p(str2, "value");
            b bVar = u.f16045l;
            bVar.f(str);
            bVar.g(str2, str);
            l(str);
            g(str, str2);
            return this;
        }

        @n6.d
        @IgnoreJRERequirement
        public final a n(@n6.d String str, @n6.d Instant instant) {
            l0.p(str, "name");
            l0.p(instant, "value");
            return o(str, new Date(instant.toEpochMilli()));
        }

        @n6.d
        public final a o(@n6.d String str, @n6.d Date date) {
            l0.p(str, "name");
            l0.p(date, "value");
            m(str, y5.c.b(date));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        @s4.h(name = "-deprecated_of")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "function moved to extension", replaceWith = @b1(expression = "headers.toHeaders()", imports = {}))
        public final u a(@n6.d Map<String, String> map) {
            l0.p(map, "headers");
            return i(map);
        }

        @s4.h(name = "-deprecated_of")
        @n6.d
        @v3.k(level = v3.m.ERROR, message = "function name changed", replaceWith = @b1(expression = "headersOf(*namesAndValues)", imports = {}))
        public final u b(@n6.d String... strArr) {
            l0.p(strArr, "namesAndValues");
            return j((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void f(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = str.charAt(i7);
                if (!('!' <= charAt && '~' >= charAt)) {
                    throw new IllegalArgumentException(s5.d.v("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i7), str).toString());
                }
            }
        }

        public final void g(String str, String str2) {
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = str.charAt(i7);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    throw new IllegalArgumentException(s5.d.v("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i7), str2, str).toString());
                }
            }
        }

        public final String h(String[] strArr, String str) {
            d5.j B1 = d5.u.B1(d5.u.k0(strArr.length - 2, 0), 2);
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
            while (!i5.b0.L1(str, strArr[i7], true)) {
                if (i7 == j7) {
                    return null;
                }
                i7 += k7;
            }
            return strArr[i7 + 1];
        }

        @s4.h(name = "of")
        @n6.d
        @s4.m
        public final u i(@n6.d Map<String, String> map) {
            l0.p(map, "$this$toHeaders");
            String[] strArr = new String[map.size() * 2];
            int i7 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String obj = i5.c0.F5(key).toString();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String obj2 = i5.c0.F5(value).toString();
                f(obj);
                g(obj2, obj);
                strArr[i7] = obj;
                strArr[i7 + 1] = obj2;
                i7 += 2;
            }
            return new u(strArr, null);
        }

        @s4.h(name = "of")
        @n6.d
        @s4.m
        public final u j(@n6.d String... strArr) {
            l0.p(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                if (clone != null) {
                    String[] strArr2 = (String[]) clone;
                    int length = strArr2.length;
                    for (int i7 = 0; i7 < length; i7++) {
                        String str = strArr2[i7];
                        if (!(str != null)) {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        }
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        strArr2[i7] = i5.c0.F5(str).toString();
                    }
                    d5.j B1 = d5.u.B1(d5.u.W1(0, strArr2.length), 2);
                    int i8 = B1.i();
                    int j7 = B1.j();
                    int k7 = B1.k();
                    if (k7 < 0 ? i8 >= j7 : i8 <= j7) {
                        while (true) {
                            String str2 = strArr2[i8];
                            String str3 = strArr2[i8 + 1];
                            f(str2);
                            g(str3, str2);
                            if (i8 == j7) {
                                break;
                            }
                            i8 += k7;
                        }
                    }
                    return new u(strArr2, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }
    }

    public u(String[] strArr) {
        this.f16046k = strArr;
    }

    @s4.h(name = "of")
    @n6.d
    @s4.m
    public static final u l(@n6.d Map<String, String> map) {
        return f16045l.i(map);
    }

    @s4.h(name = "of")
    @n6.d
    @s4.m
    public static final u m(@n6.d String... strArr) {
        return f16045l.j(strArr);
    }

    @s4.h(name = "-deprecated_size")
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "size", imports = {}))
    public final int a() {
        return size();
    }

    public final long b() {
        String[] strArr = this.f16046k;
        long length = strArr.length * 2;
        for (int i7 = 0; i7 < strArr.length; i7++) {
            length += this.f16046k[i7].length();
        }
        return length;
    }

    @n6.e
    public final String d(@n6.d String str) {
        l0.p(str, "name");
        return f16045l.h(this.f16046k, str);
    }

    public boolean equals(@n6.e Object obj) {
        return (obj instanceof u) && Arrays.equals(this.f16046k, ((u) obj).f16046k);
    }

    @n6.e
    public final Date f(@n6.d String str) {
        l0.p(str, "name");
        String d7 = d(str);
        if (d7 != null) {
            return y5.c.a(d7);
        }
        return null;
    }

    @n6.e
    @IgnoreJRERequirement
    public final Instant g(@n6.d String str) {
        l0.p(str, "name");
        Date f7 = f(str);
        if (f7 != null) {
            return f7.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f16046k);
    }

    @n6.d
    public final String i(int i7) {
        return this.f16046k[i7 * 2];
    }

    @Override // java.lang.Iterable
    @n6.d
    public Iterator<u0<? extends String, ? extends String>> iterator() {
        int size = size();
        u0[] u0VarArr = new u0[size];
        for (int i7 = 0; i7 < size; i7++) {
            u0VarArr[i7] = q1.a(i(i7), o(i7));
        }
        return u4.i.a(u0VarArr);
    }

    @n6.d
    public final Set<String> j() {
        TreeSet treeSet = new TreeSet(i5.b0.T1(t1.f17486a));
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            treeSet.add(i(i7));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        l0.o(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @n6.d
    public final a k() {
        a aVar = new a();
        x3.b0.p0(aVar.k(), this.f16046k);
        return aVar;
    }

    @n6.d
    public final Map<String, List<String>> n() {
        TreeMap treeMap = new TreeMap(i5.b0.T1(t1.f17486a));
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            String i8 = i(i7);
            Locale locale = Locale.US;
            l0.o(locale, "Locale.US");
            if (i8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = i8.toLowerCase(locale);
            l0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(o(i7));
        }
        return treeMap;
    }

    @n6.d
    public final String o(int i7) {
        return this.f16046k[(i7 * 2) + 1];
    }

    @n6.d
    public final List<String> p(@n6.d String str) {
        l0.p(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            if (i5.b0.L1(str, i(i7), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(o(i7));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            l0.o(unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }
        return x3.w.E();
    }

    @s4.h(name = "size")
    public final int size() {
        return this.f16046k.length / 2;
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            sb.append(i(i7));
            sb.append(": ");
            sb.append(o(i7));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ u(String[] strArr, u4.w wVar) {
        this(strArr);
    }
}
