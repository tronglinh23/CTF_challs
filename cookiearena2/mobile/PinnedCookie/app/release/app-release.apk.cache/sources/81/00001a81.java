package s2;

import android.net.Uri;
import android.os.Bundle;
import d.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u4.r1;
import v3.m2;
import v3.q1;

@r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1360#2:652\n1446#2,5:653\n1559#2:658\n1590#2,4:659\n1559#2:663\n1590#2,4:664\n1855#2:670\n1559#2:671\n1590#2,4:672\n1856#2:676\n215#3,2:668\n1#4:677\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n85#1:652\n85#1:653,5\n229#1:658\n229#1:659,4\n247#1:663\n247#1:664,4\n295#1:670\n307#1:671\n307#1:672,4\n295#1:676\n269#1:668,2\n*E\n"})
/* loaded from: classes.dex */
public final class z {
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public static final b f16574q = new b(null);

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f16575r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f16576s = Pattern.compile("\\{(.+?)\\}");
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final String f16577a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final String f16578b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public final String f16579c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f16580d;
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public String f16581e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final v3.d0 f16582f;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public final v3.d0 f16583g;
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public final v3.d0 f16584h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16585i;
    @n6.d

    /* renamed from: j  reason: collision with root package name */
    public final v3.d0 f16586j;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final v3.d0 f16587k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final v3.d0 f16588l;
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public final v3.d0 f16589m;
    @n6.e

    /* renamed from: n  reason: collision with root package name */
    public String f16590n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final v3.d0 f16591o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16592p;

    @r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a {
        @n6.d

        /* renamed from: d  reason: collision with root package name */
        public static final C0244a f16593d = new C0244a(null);
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public String f16594a;
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public String f16595b;
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public String f16596c;

        @r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
        /* renamed from: s2.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0244a {
            public /* synthetic */ C0244a(u4.w wVar) {
                this();
            }

            @n6.d
            @s4.m
            public final a a(@n6.d String str) {
                u4.l0.p(str, t0.f16450f);
                if (str.length() > 0) {
                    a aVar = new a();
                    aVar.e(str);
                    return aVar;
                }
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }

            @n6.d
            @s4.m
            public final a b(@n6.d String str) {
                u4.l0.p(str, "mimeType");
                a aVar = new a();
                aVar.f(str);
                return aVar;
            }

            @n6.d
            @s4.m
            public final a c(@n6.d String str) {
                u4.l0.p(str, "uriPattern");
                a aVar = new a();
                aVar.g(str);
                return aVar;
            }

            public C0244a() {
            }
        }

        @d.b1({b1.a.LIBRARY_GROUP})
        public a() {
        }

        @n6.d
        @s4.m
        public static final a b(@n6.d String str) {
            return f16593d.a(str);
        }

        @n6.d
        @s4.m
        public static final a c(@n6.d String str) {
            return f16593d.b(str);
        }

        @n6.d
        @s4.m
        public static final a d(@n6.d String str) {
            return f16593d.c(str);
        }

        @n6.d
        public final z a() {
            return new z(this.f16594a, this.f16595b, this.f16596c);
        }

        @n6.d
        public final a e(@n6.d String str) {
            u4.l0.p(str, t0.f16450f);
            if (str.length() > 0) {
                this.f16595b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
        }

        @n6.d
        public final a f(@n6.d String str) {
            u4.l0.p(str, "mimeType");
            this.f16596c = str;
            return this;
        }

        @n6.d
        public final a g(@n6.d String str) {
            u4.l0.p(str, "uriPattern");
            this.f16594a = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(u4.w wVar) {
            this();
        }

        public b() {
        }
    }

    @r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n731#2,9:652\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n*L\n412#1:652,9\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public String f16597k;
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public String f16598l;

        public c(@n6.d String str) {
            List E;
            u4.l0.p(str, "mimeType");
            List<String> p6 = new i5.o("/").p(str, 0);
            if (!p6.isEmpty()) {
                ListIterator<String> listIterator = p6.listIterator(p6.size());
                while (listIterator.hasPrevious()) {
                    if (!(listIterator.previous().length() == 0)) {
                        E = x3.e0.E5(p6, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            E = x3.w.E();
            this.f16597k = (String) E.get(0);
            this.f16598l = (String) E.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public int compareTo(@n6.d c cVar) {
            u4.l0.p(cVar, "other");
            int i7 = u4.l0.g(this.f16597k, cVar.f16597k) ? 2 : 0;
            return u4.l0.g(this.f16598l, cVar.f16598l) ? i7 + 1 : i7;
        }

        @n6.d
        public final String d() {
            return this.f16598l;
        }

        @n6.d
        public final String e() {
            return this.f16597k;
        }

        public final void h(@n6.d String str) {
            u4.l0.p(str, "<set-?>");
            this.f16598l = str;
        }

        public final void i(@n6.d String str) {
            u4.l0.p(str, "<set-?>");
            this.f16597k = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public String f16599a;
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f16600b = new ArrayList();

        public final void a(@n6.d String str) {
            u4.l0.p(str, "name");
            this.f16600b.add(str);
        }

        @n6.d
        public final String b(int i7) {
            return this.f16600b.get(i7);
        }

        @n6.d
        public final List<String> c() {
            return this.f16600b;
        }

        @n6.e
        public final String d() {
            return this.f16599a;
        }

        public final void e(@n6.e String str) {
            this.f16599a = str;
        }

        public final int f() {
            return this.f16600b.size();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends u4.n0 implements t4.a<List<String>> {
        public e() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final List<String> n() {
            List<String> list;
            v3.u0 l7 = z.this.l();
            return (l7 == null || (list = (List) l7.e()) == null) ? new ArrayList() : list;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends u4.n0 implements t4.a<v3.u0<? extends List<String>, ? extends String>> {
        public f() {
            super(0);
        }

        @Override // t4.a
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final v3.u0<List<String>, String> n() {
            return z.this.I();
        }
    }

    @r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$fragPattern$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
    /* loaded from: classes.dex */
    public static final class g extends u4.n0 implements t4.a<Pattern> {
        public g() {
            super(0);
        }

        @Override // t4.a
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Pattern n() {
            String n7 = z.this.n();
            if (n7 != null) {
                return Pattern.compile(n7, 2);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends u4.n0 implements t4.a<String> {
        public h() {
            super(0);
        }

        @Override // t4.a
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final String n() {
            v3.u0 l7 = z.this.l();
            if (l7 != null) {
                return (String) l7.f();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends u4.n0 implements t4.l<String, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Bundle f16605l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Bundle bundle) {
            super(1);
            this.f16605l = bundle;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d String str) {
            u4.l0.p(str, "argName");
            return Boolean.valueOf(!this.f16605l.containsKey(str));
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends u4.n0 implements t4.a<Boolean> {
        public j() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            return Boolean.valueOf((z.this.y() == null || Uri.parse(z.this.y()).getQuery() == null) ? false : true);
        }
    }

    @r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$mimeTypePattern$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
    /* loaded from: classes.dex */
    public static final class k extends u4.n0 implements t4.a<Pattern> {
        public k() {
            super(0);
        }

        @Override // t4.a
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Pattern n() {
            String str = z.this.f16590n;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    @r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$pathPattern$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
    /* loaded from: classes.dex */
    public static final class l extends u4.n0 implements t4.a<Pattern> {
        public l() {
            super(0);
        }

        @Override // t4.a
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Pattern n() {
            String str = z.this.f16581e;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends u4.n0 implements t4.a<Map<String, d>> {
        public m() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Map<String, d> n() {
            return z.this.M();
        }
    }

    public z(@n6.e String str, @n6.e String str2, @n6.e String str3) {
        this.f16577a = str;
        this.f16578b = str2;
        this.f16579c = str3;
        this.f16580d = new ArrayList();
        this.f16582f = v3.f0.b(new l());
        this.f16583g = v3.f0.b(new j());
        v3.h0 h0Var = v3.h0.NONE;
        this.f16584h = v3.f0.c(h0Var, new m());
        this.f16586j = v3.f0.c(h0Var, new f());
        this.f16587k = v3.f0.c(h0Var, new e());
        this.f16588l = v3.f0.c(h0Var, new h());
        this.f16589m = v3.f0.b(new g());
        this.f16591o = v3.f0.b(new k());
        L();
        K();
    }

    public final boolean A() {
        return ((Boolean) this.f16583g.getValue()).booleanValue();
    }

    public final boolean B(String str) {
        boolean z6 = str == null;
        String str2 = this.f16578b;
        return z6 != (str2 != null) && (str == null || u4.l0.g(str2, str));
    }

    public final boolean C(String str) {
        if ((str == null) != (this.f16579c != null)) {
            if (str == null) {
                return true;
            }
            Pattern v6 = v();
            u4.l0.m(v6);
            if (v6.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public final boolean D(Uri uri) {
        if ((uri == null) != (w() != null)) {
            if (uri == null) {
                return true;
            }
            Pattern w6 = w();
            u4.l0.m(w6);
            if (w6.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    public final boolean E(@n6.d Uri uri) {
        u4.l0.p(uri, "uri");
        return F(new e0(uri, null, null));
    }

    public final boolean F(@n6.d e0 e0Var) {
        u4.l0.p(e0Var, "deepLinkRequest");
        if (D(e0Var.c()) && B(e0Var.a())) {
            return C(e0Var.b());
        }
        return false;
    }

    public final boolean G(Bundle bundle, String str, String str2, q qVar) {
        if (qVar != null) {
            qVar.b().g(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    public final boolean H(Bundle bundle, String str, String str2, q qVar) {
        if (bundle.containsKey(str)) {
            if (qVar != null) {
                y0<Object> b7 = qVar.b();
                b7.h(bundle, str, str2, b7.b(bundle, str));
                return false;
            }
            return false;
        }
        return true;
    }

    public final v3.u0<List<String>, String> I() {
        String str = this.f16577a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.f16577a).getFragment();
        StringBuilder sb = new StringBuilder();
        u4.l0.m(fragment);
        g(fragment, arrayList, sb);
        String sb2 = sb.toString();
        u4.l0.o(sb2, "fragRegex.toString()");
        return q1.a(arrayList, sb2);
    }

    public final boolean J(List<String> list, d dVar, Bundle bundle, Map<String, q> map) {
        if (list != null) {
            for (String str : list) {
                String d7 = dVar.d();
                Matcher matcher = d7 != null ? Pattern.compile(d7, 32).matcher(str) : null;
                if (matcher == null || !matcher.matches()) {
                    return false;
                }
                Bundle bundle2 = new Bundle();
                try {
                    List<String> c7 = dVar.c();
                    ArrayList arrayList = new ArrayList(x3.x.Y(c7, 10));
                    int i7 = 0;
                    for (Object obj : c7) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            x3.w.W();
                        }
                        String str2 = (String) obj;
                        String group = matcher.group(i8);
                        if (group == null) {
                            group = "";
                        } else {
                            u4.l0.o(group, "argMatcher.group(index + 1) ?: \"\"");
                        }
                        q qVar = map.get(str2);
                        if (H(bundle, str2, group, qVar)) {
                            if (!u4.l0.g(group, '{' + str2 + '}') && G(bundle2, str2, group, qVar)) {
                                return false;
                            }
                        }
                        arrayList.add(m2.f17815a);
                        i7 = i8;
                    }
                    bundle.putAll(bundle2);
                } catch (IllegalArgumentException unused) {
                }
            }
            return true;
        }
        return true;
    }

    public final void K() {
        if (this.f16579c == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f16579c).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.f16579c + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.f16579c);
        this.f16590n = i5.b0.l2("^(" + cVar.e() + "|[*]+)/(" + cVar.d() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    public final void L() {
        if (this.f16577a == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!f16575r.matcher(this.f16577a).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f16577a);
        matcher.find();
        boolean z6 = false;
        String substring = this.f16577a.substring(0, matcher.start());
        u4.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        g(substring, this.f16580d, sb);
        if (!i5.c0.W2(sb, ".*", false, 2, null) && !i5.c0.W2(sb, "([^/]+?)", false, 2, null)) {
            z6 = true;
        }
        this.f16592p = z6;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        u4.l0.o(sb2, "uriRegex.toString()");
        this.f16581e = i5.b0.l2(sb2, ".*", "\\E.*\\Q", false, 4, null);
    }

    public final Map<String, d> M() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (A()) {
            Uri parse = Uri.parse(this.f16577a);
            for (String str : parse.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParameters = parse.getQueryParameters(str);
                int i7 = 0;
                if (!(queryParameters.size() <= 1)) {
                    throw new IllegalArgumentException(("Query parameter " + str + " must only be present once in " + this.f16577a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                u4.l0.o(queryParameters, "queryParams");
                String str2 = (String) x3.e0.B2(queryParameters);
                if (str2 == null) {
                    this.f16585i = true;
                    str2 = str;
                }
                Matcher matcher = f16576s.matcher(str2);
                d dVar = new d();
                while (matcher.find()) {
                    String group = matcher.group(1);
                    u4.l0.n(group, "null cannot be cast to non-null type kotlin.String");
                    dVar.a(group);
                    u4.l0.o(str2, "queryParam");
                    String substring = str2.substring(i7, matcher.start());
                    u4.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(Pattern.quote(substring));
                    sb.append("(.+?)?");
                    i7 = matcher.end();
                }
                if (i7 < str2.length()) {
                    u4.l0.o(str2, "queryParam");
                    String substring2 = str2.substring(i7);
                    u4.l0.o(substring2, "this as java.lang.String).substring(startIndex)");
                    sb.append(Pattern.quote(substring2));
                }
                String sb2 = sb.toString();
                u4.l0.o(sb2, "argRegex.toString()");
                dVar.e(i5.b0.l2(sb2, ".*", "\\E.*\\Q", false, 4, null));
                u4.l0.o(str, "paramName");
                linkedHashMap.put(str, dVar);
            }
            return linkedHashMap;
        }
        return linkedHashMap;
    }

    public final void N(boolean z6) {
        this.f16592p = z6;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return u4.l0.g(this.f16577a, zVar.f16577a) && u4.l0.g(this.f16578b, zVar.f16578b) && u4.l0.g(this.f16579c, zVar.f16579c);
    }

    public final void g(String str, List<String> list, StringBuilder sb) {
        Matcher matcher = f16576s.matcher(str);
        int i7 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            u4.l0.n(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i7) {
                String substring = str.substring(i7, matcher.start());
                u4.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]+?)");
            i7 = matcher.end();
        }
        if (i7 < str.length()) {
            String substring2 = str.substring(i7);
            u4.l0.o(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public final int h(@n6.e Uri uri) {
        if (uri == null || this.f16577a == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(this.f16577a).getPathSegments();
        u4.l0.o(pathSegments, "requestedPathSegments");
        u4.l0.o(pathSegments2, "uriPathSegments");
        return x3.e0.d3(pathSegments, pathSegments2).size();
    }

    public int hashCode() {
        String str = this.f16577a;
        int hashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f16578b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16579c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @n6.e
    public final String i() {
        return this.f16578b;
    }

    @n6.d
    public final List<String> j() {
        List<String> list = this.f16580d;
        Collection<d> values = x().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            x3.b0.o0(arrayList, ((d) it.next()).c());
        }
        return x3.e0.z4(x3.e0.z4(list, arrayList), k());
    }

    public final List<String> k() {
        return (List) this.f16587k.getValue();
    }

    public final v3.u0<List<String>, String> l() {
        return (v3.u0) this.f16586j.getValue();
    }

    public final Pattern m() {
        return (Pattern) this.f16589m.getValue();
    }

    public final String n() {
        return (String) this.f16588l.getValue();
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.e
    public final Bundle o(@n6.d Uri uri, @n6.d Map<String, q> map) {
        u4.l0.p(uri, t0.f16449e);
        u4.l0.p(map, androidx.fragment.app.q0.f4472m);
        Pattern w6 = w();
        Matcher matcher = w6 != null ? w6.matcher(uri.toString()) : null;
        if (matcher != null && matcher.matches()) {
            Bundle bundle = new Bundle();
            if (q(matcher, bundle, map)) {
                if (!A() || r(uri, bundle, map)) {
                    s(uri.getFragment(), bundle, map);
                    if ((!s.a(map, new i(bundle)).isEmpty()) == true) {
                        return null;
                    }
                    return bundle;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @n6.d
    public final Bundle p(@n6.e Uri uri, @n6.d Map<String, q> map) {
        u4.l0.p(map, androidx.fragment.app.q0.f4472m);
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern w6 = w();
        Matcher matcher = w6 != null ? w6.matcher(uri.toString()) : null;
        if (matcher != null && matcher.matches()) {
            q(matcher, bundle, map);
            if (A()) {
                r(uri, bundle, map);
            }
            return bundle;
        }
        return bundle;
    }

    public final boolean q(Matcher matcher, Bundle bundle, Map<String, q> map) {
        List<String> list = this.f16580d;
        ArrayList arrayList = new ArrayList(x3.x.Y(list, 10));
        int i7 = 0;
        for (Object obj : list) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            String str = (String) obj;
            String decode = Uri.decode(matcher.group(i8));
            q qVar = map.get(str);
            try {
                u4.l0.o(decode, "value");
                if (G(bundle, str, decode, qVar)) {
                    return false;
                }
                arrayList.add(m2.f17815a);
                i7 = i8;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(Uri uri, Bundle bundle, Map<String, q> map) {
        String query;
        for (Map.Entry<String, d> entry : x().entrySet()) {
            String key = entry.getKey();
            d value = entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(key);
            if (this.f16585i && (query = uri.getQuery()) != null && !u4.l0.g(query, uri.toString())) {
                queryParameters = x3.v.k(query);
            }
            if (!J(queryParameters, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    public final void s(String str, Bundle bundle, Map<String, q> map) {
        Pattern m7 = m();
        Matcher matcher = m7 != null ? m7.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            List<String> k7 = k();
            ArrayList arrayList = new ArrayList(x3.x.Y(k7, 10));
            int i7 = 0;
            for (Object obj : k7) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    x3.w.W();
                }
                String str2 = (String) obj;
                String decode = Uri.decode(matcher.group(i8));
                q qVar = map.get(str2);
                try {
                    u4.l0.o(decode, "value");
                    if (G(bundle, str2, decode, qVar)) {
                        return;
                    }
                    arrayList.add(m2.f17815a);
                    i7 = i8;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    @n6.e
    public final String t() {
        return this.f16579c;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final int u(@n6.d String str) {
        u4.l0.p(str, "mimeType");
        if (this.f16579c != null) {
            Pattern v6 = v();
            u4.l0.m(v6);
            if (v6.matcher(str).matches()) {
                return new c(this.f16579c).compareTo(new c(str));
            }
        }
        return -1;
    }

    public final Pattern v() {
        return (Pattern) this.f16591o.getValue();
    }

    public final Pattern w() {
        return (Pattern) this.f16582f.getValue();
    }

    public final Map<String, d> x() {
        return (Map) this.f16584h.getValue();
    }

    @n6.e
    public final String y() {
        return this.f16577a;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final boolean z() {
        return this.f16592p;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @d.b1({b1.a.LIBRARY_GROUP})
    public z(@n6.d String str) {
        this(str, null, null);
        u4.l0.p(str, "uri");
    }
}