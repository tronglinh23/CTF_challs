package i5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.a1;
import v3.g1;
import v3.m2;
import v3.q2;

@r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n22#2,3:399\n1#3:402\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n104#1:399,3\n*E\n"})
/* loaded from: classes.dex */
public final class o implements Serializable {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final a f11128m = new a(null);
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final Pattern f11129k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public Set<? extends q> f11130l;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public final int b(int i7) {
            return (i7 & 2) != 0 ? i7 | 64 : i7;
        }

        @n6.d
        public final String c(@n6.d String str) {
            l0.p(str, "literal");
            String quote = Pattern.quote(str);
            l0.o(quote, "quote(literal)");
            return quote;
        }

        @n6.d
        public final String d(@n6.d String str) {
            l0.p(str, "literal");
            String quoteReplacement = Matcher.quoteReplacement(str);
            l0.o(quoteReplacement, "quoteReplacement(literal)");
            return quoteReplacement;
        }

        @n6.d
        public final o e(@n6.d String str) {
            l0.p(str, "literal");
            return new o(str, q.f11150o);
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {
        @n6.d

        /* renamed from: m  reason: collision with root package name */
        public static final a f11131m = new a(null);

        /* renamed from: n  reason: collision with root package name */
        public static final long f11132n = 0;
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final String f11133k;

        /* renamed from: l  reason: collision with root package name */
        public final int f11134l;

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(u4.w wVar) {
                this();
            }

            public a() {
            }
        }

        public b(@n6.d String str, int i7) {
            l0.p(str, "pattern");
            this.f11133k = str;
            this.f11134l = i7;
        }

        public final int a() {
            return this.f11134l;
        }

        @n6.d
        public final String b() {
            return this.f11133k;
        }

        public final Object c() {
            Pattern compile = Pattern.compile(this.f11133k, this.f11134l);
            l0.o(compile, "compile(pattern, flags)");
            return new o(compile);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.a<m> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ CharSequence f11136m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ int f11137n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence, int i7) {
            super(0);
            this.f11136m = charSequence;
            this.f11137n = i7;
        }

        @Override // t4.a
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final m n() {
            return o.this.c(this.f11136m, this.f11137n);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d extends u4.h0 implements t4.l<m, m> {

        /* renamed from: t  reason: collision with root package name */
        public static final d f11138t = new d();

        public d() {
            super(1, m.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: C0  reason: merged with bridge method [inline-methods] */
        public final m O(@n6.d m mVar) {
            l0.p(mVar, "p0");
            return mVar.next();
        }
    }

    @r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,398:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class e extends n0 implements t4.l<q, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f11139l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i7) {
            super(1);
            this.f11139l = i7;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(q qVar) {
            q qVar2 = qVar;
            return Boolean.valueOf((this.f11139l & qVar2.c()) == qVar2.getValue());
        }
    }

    @h4.f(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {276, 284, 288}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    /* loaded from: classes.dex */
    public static final class f extends h4.k implements t4.p<f5.o<? super String>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f11140m;

        /* renamed from: n  reason: collision with root package name */
        public int f11141n;

        /* renamed from: o  reason: collision with root package name */
        public int f11142o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f11143p;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ CharSequence f11145r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ int f11146s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CharSequence charSequence, int i7, e4.d<? super f> dVar) {
            super(2, dVar);
            this.f11145r = charSequence;
            this.f11146s = i7;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            f fVar = new f(this.f11145r, this.f11146s, dVar);
            fVar.f11143p = obj;
            return fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:21:0x0073). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r10.f11142o
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L33
                if (r1 == r4) goto L2e
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                v3.e1.n(r11)
                goto L9f
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                int r1 = r10.f11141n
                java.lang.Object r5 = r10.f11140m
                java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
                java.lang.Object r6 = r10.f11143p
                f5.o r6 = (f5.o) r6
                v3.e1.n(r11)
                r7 = r10
                r11 = r5
                goto L73
            L2e:
                v3.e1.n(r11)
                goto Lb1
            L33:
                v3.e1.n(r11)
                java.lang.Object r11 = r10.f11143p
                f5.o r11 = (f5.o) r11
                i5.o r1 = i5.o.this
                java.util.regex.Pattern r1 = i5.o.a(r1)
                java.lang.CharSequence r5 = r10.f11145r
                java.util.regex.Matcher r1 = r1.matcher(r5)
                int r5 = r10.f11146s
                if (r5 == r4) goto La2
                boolean r5 = r1.find()
                if (r5 != 0) goto L51
                goto La2
            L51:
                r5 = 0
                r7 = r10
                r6 = r11
                r11 = r1
                r1 = r5
            L56:
                java.lang.CharSequence r8 = r7.f11145r
                int r9 = r11.start()
                java.lang.CharSequence r5 = r8.subSequence(r5, r9)
                java.lang.String r5 = r5.toString()
                r7.f11143p = r6
                r7.f11140m = r11
                r7.f11141n = r1
                r7.f11142o = r3
                java.lang.Object r5 = r6.a(r5, r7)
                if (r5 != r0) goto L73
                return r0
            L73:
                int r5 = r11.end()
                int r1 = r1 + r4
                int r8 = r7.f11146s
                int r8 = r8 - r4
                if (r1 == r8) goto L83
                boolean r8 = r11.find()
                if (r8 != 0) goto L56
            L83:
                java.lang.CharSequence r11 = r7.f11145r
                int r1 = r11.length()
                java.lang.CharSequence r11 = r11.subSequence(r5, r1)
                java.lang.String r11 = r11.toString()
                r1 = 0
                r7.f11143p = r1
                r7.f11140m = r1
                r7.f11142o = r2
                java.lang.Object r11 = r6.a(r11, r7)
                if (r11 != r0) goto L9f
                return r0
            L9f:
                v3.m2 r11 = v3.m2.f17815a
                return r11
            La2:
                java.lang.CharSequence r1 = r10.f11145r
                java.lang.String r1 = r1.toString()
                r10.f11142o = r4
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto Lb1
                return r0
            Lb1:
                v3.m2 r11 = v3.m2.f17815a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.o.f.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super String> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((f) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    @a1
    public o(@n6.d Pattern pattern) {
        l0.p(pattern, "nativePattern");
        this.f11129k = pattern;
    }

    public static /* synthetic */ m d(o oVar, CharSequence charSequence, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return oVar.c(charSequence, i7);
    }

    public static /* synthetic */ f5.m f(o oVar, CharSequence charSequence, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return oVar.e(charSequence, i7);
    }

    public static /* synthetic */ List q(o oVar, CharSequence charSequence, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return oVar.p(charSequence, i7);
    }

    public static /* synthetic */ f5.m s(o oVar, CharSequence charSequence, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return oVar.r(charSequence, i7);
    }

    public final boolean b(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "input");
        return this.f11129k.matcher(charSequence).find();
    }

    @n6.e
    public final m c(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "input");
        Matcher matcher = this.f11129k.matcher(charSequence);
        l0.o(matcher, "nativePattern.matcher(input)");
        return p.a(matcher, i7, charSequence);
    }

    @n6.d
    public final f5.m<m> e(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "input");
        if (i7 < 0 || i7 > charSequence.length()) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + i7 + ", input length: " + charSequence.length());
        }
        return f5.s.n(new c(charSequence, i7), d.f11138t);
    }

    @n6.d
    public final Set<q> g() {
        Set set = this.f11130l;
        if (set == null) {
            int flags = this.f11129k.flags();
            EnumSet allOf = EnumSet.allOf(q.class);
            l0.o(allOf, "fromInt$lambda$1");
            x3.b0.N0(allOf, new e(flags));
            Set<q> unmodifiableSet = Collections.unmodifiableSet(allOf);
            l0.o(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
            this.f11130l = unmodifiableSet;
            return unmodifiableSet;
        }
        return set;
    }

    @n6.d
    public final String h() {
        String pattern = this.f11129k.pattern();
        l0.o(pattern, "nativePattern.pattern()");
        return pattern;
    }

    @g1(version = "1.7")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public final m i(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "input");
        Matcher region = this.f11129k.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i7, charSequence.length());
        if (region.lookingAt()) {
            l0.o(region, "this");
            return new n(region, charSequence);
        }
        return null;
    }

    @n6.e
    public final m j(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "input");
        Matcher matcher = this.f11129k.matcher(charSequence);
        l0.o(matcher, "nativePattern.matcher(input)");
        return p.b(matcher, charSequence);
    }

    public final boolean k(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "input");
        return this.f11129k.matcher(charSequence).matches();
    }

    @g1(version = "1.7")
    @q2(markerClass = {v3.r.class})
    public final boolean l(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "input");
        return this.f11129k.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i7, charSequence.length()).lookingAt();
    }

    @n6.d
    public final String m(@n6.d CharSequence charSequence, @n6.d String str) {
        l0.p(charSequence, "input");
        l0.p(str, "replacement");
        String replaceAll = this.f11129k.matcher(charSequence).replaceAll(str);
        l0.o(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @n6.d
    public final String n(@n6.d CharSequence charSequence, @n6.d t4.l<? super m, ? extends CharSequence> lVar) {
        l0.p(charSequence, "input");
        l0.p(lVar, "transform");
        int i7 = 0;
        m d7 = d(this, charSequence, 0, 2, null);
        if (d7 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i7, d7.d().b().intValue());
            sb.append(lVar.O(d7));
            i7 = d7.d().g().intValue() + 1;
            d7 = d7.next();
            if (i7 >= length) {
                break;
            }
        } while (d7 != null);
        if (i7 < length) {
            sb.append(charSequence, i7, length);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }

    @n6.d
    public final String o(@n6.d CharSequence charSequence, @n6.d String str) {
        l0.p(charSequence, "input");
        l0.p(str, "replacement");
        String replaceFirst = this.f11129k.matcher(charSequence).replaceFirst(str);
        l0.o(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    @n6.d
    public final List<String> p(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "input");
        c0.N4(i7);
        Matcher matcher = this.f11129k.matcher(charSequence);
        if (i7 == 1 || !matcher.find()) {
            return x3.v.k(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i7 > 0 ? d5.u.B(i7, 10) : 10);
        int i8 = i7 - 1;
        int i9 = 0;
        do {
            arrayList.add(charSequence.subSequence(i9, matcher.start()).toString());
            i9 = matcher.end();
            if (i8 >= 0 && arrayList.size() == i8) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i9, charSequence.length()).toString());
        return arrayList;
    }

    @g1(version = "1.6")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public final f5.m<String> r(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "input");
        c0.N4(i7);
        return f5.q.b(new f(charSequence, i7, null));
    }

    @n6.d
    public final Pattern t() {
        return this.f11129k;
    }

    @n6.d
    public String toString() {
        String pattern = this.f11129k.toString();
        l0.o(pattern, "nativePattern.toString()");
        return pattern;
    }

    public final Object u() {
        String pattern = this.f11129k.pattern();
        l0.o(pattern, "nativePattern.pattern()");
        return new b(pattern, this.f11129k.flags());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(@n6.d java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            u4.l0.p(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            u4.l0.o(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.o.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(@n6.d java.lang.String r2, @n6.d i5.q r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            u4.l0.p(r2, r0)
            java.lang.String r0 = "option"
            u4.l0.p(r3, r0)
            i5.o$a r0 = i5.o.f11128m
            int r3 = r3.getValue()
            int r3 = i5.o.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            u4.l0.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.o.<init>(java.lang.String, i5.q):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(@n6.d java.lang.String r2, @n6.d java.util.Set<? extends i5.q> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            u4.l0.p(r2, r0)
            java.lang.String r0 = "options"
            u4.l0.p(r3, r0)
            i5.o$a r0 = i5.o.f11128m
            int r3 = i5.p.e(r3)
            int r3 = i5.o.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            u4.l0.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.o.<init>(java.lang.String, java.util.Set):void");
    }
}