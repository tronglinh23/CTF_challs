package i5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.b1;
import v3.b2;
import v3.g1;
import v3.m2;
import v3.q1;
import v3.q2;
import v3.t0;
import v3.u0;
import v3.x1;
import x3.k1;
import x3.l1;
import x3.o1;
import x3.p0;
import x3.q0;
import x3.s0;
import x3.z0;

@r1({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2486:1\n126#1,2:2487\n214#1,5:2489\n502#1,5:2495\n502#1,5:2500\n462#1:2505\n1183#1,2:2506\n463#1,2:2508\n1185#1:2510\n465#1:2511\n462#1:2512\n1183#1,2:2513\n463#1,2:2515\n1185#1:2517\n465#1:2518\n1183#1,3:2519\n492#1,2:2522\n492#1,2:2524\n750#1,4:2526\n719#1,4:2530\n735#1,4:2534\n782#1,4:2538\n882#1,5:2542\n923#1,3:2547\n926#1,3:2557\n941#1,3:2560\n944#1,3:2570\n1041#1,3:2587\n1011#1,4:2590\n1000#1:2594\n1183#1,2:2595\n1185#1:2598\n1001#1:2599\n1183#1,3:2600\n1032#1:2603\n1174#1:2604\n1175#1:2606\n1033#1:2607\n1174#1,2:2608\n1183#1,3:2610\n1982#1,2:2613\n1984#1,6:2616\n2006#1,2:2622\n2008#1,6:2625\n2431#1,6:2631\n2461#1,7:2637\n1#2:2494\n1#2:2597\n1#2:2605\n1#2:2615\n1#2:2624\n361#3,7:2550\n361#3,7:2563\n361#3,7:2573\n361#3,7:2580\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n52#1:2487,2\n62#1:2489,5\n420#1:2495,5\n429#1:2500,5\n440#1:2505\n440#1:2506,2\n440#1:2508,2\n440#1:2510\n440#1:2511\n451#1:2512\n451#1:2513,2\n451#1:2515,2\n451#1:2517\n451#1:2518\n462#1:2519,3\n474#1:2522,2\n483#1:2524,2\n677#1:2526,4\n692#1:2530,4\n706#1:2534,4\n769#1:2538,4\n842#1:2542,5\n898#1:2547,3\n898#1:2557,3\n911#1:2560,3\n911#1:2570,3\n970#1:2587,3\n980#1:2590,4\n990#1:2594\n990#1:2595,2\n990#1:2598\n990#1:2599\n1000#1:2600,3\n1024#1:2603\n1024#1:2604\n1024#1:2606\n1024#1:2607\n1032#1:2608,2\n1786#1:2610,3\n2077#1:2613,2\n2077#1:2616,6\n2095#1:2622,2\n2095#1:2625,6\n2420#1:2631,6\n2448#1:2637,7\n990#1:2597\n1024#1:2605\n2077#1:2615\n2095#1:2624\n898#1:2550,7\n911#1:2563,7\n925#1:2573,7\n943#1:2580,7\n*E\n"})
/* loaded from: classes.dex */
public class e0 extends d0 {

    @r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,70:1\n2475#2:71\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a implements Iterable<Character>, v4.a {

        /* renamed from: k */
        public final /* synthetic */ CharSequence f11059k;

        public a(CharSequence charSequence) {
            this.f11059k = charSequence;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<Character> iterator() {
            return c0.C3(this.f11059k);
        }
    }

    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,680:1\n2483#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b implements f5.m<Character> {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f11060a;

        public b(CharSequence charSequence) {
            this.f11060a = charSequence;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Character> iterator() {
            return c0.C3(this.f11060a);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.l<CharSequence, String> {

        /* renamed from: l */
        public static final c f11061l = new c();

        public c() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b */
        public final String O(@n6.d CharSequence charSequence) {
            l0.p(charSequence, "it");
            return charSequence.toString();
        }
    }

    @r1({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt$groupingBy$1\n*L\n1#1,2486:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class d<K> implements x3.l0<Character, K> {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f11062a;

        /* renamed from: b */
        public final /* synthetic */ t4.l<Character, K> f11063b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(CharSequence charSequence, t4.l<? super Character, ? extends K> lVar) {
            this.f11062a = charSequence;
            this.f11063b = lVar;
        }

        @Override // x3.l0
        public /* bridge */ /* synthetic */ Object a(Character ch) {
            return c(ch.charValue());
        }

        @Override // x3.l0
        @n6.d
        public Iterator<Character> b() {
            return c0.C3(this.f11062a);
        }

        public K c(char c7) {
            return this.f11063b.O(Character.valueOf(c7));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends n0 implements t4.l<CharSequence, String> {

        /* renamed from: l */
        public static final e f11064l = new e();

        public e() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b */
        public final String O(@n6.d CharSequence charSequence) {
            l0.p(charSequence, "it");
            return charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends n0 implements t4.l<CharSequence, String> {

        /* renamed from: l */
        public static final f f11065l = new f();

        public f() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b */
        public final String O(@n6.d CharSequence charSequence) {
            l0.p(charSequence, "it");
            return charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class g<R> extends n0 implements t4.l<Integer, R> {

        /* renamed from: l */
        public final /* synthetic */ int f11066l;

        /* renamed from: m */
        public final /* synthetic */ CharSequence f11067m;

        /* renamed from: n */
        public final /* synthetic */ t4.l<CharSequence, R> f11068n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(int i7, CharSequence charSequence, t4.l<? super CharSequence, ? extends R> lVar) {
            super(1);
            this.f11066l = i7;
            this.f11067m = charSequence;
            this.f11068n = lVar;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ Object O(Integer num) {
            return b(num.intValue());
        }

        public final R b(int i7) {
            int i8 = this.f11066l + i7;
            if (i8 < 0 || i8 > this.f11067m.length()) {
                i8 = this.f11067m.length();
            }
            return this.f11068n.O(this.f11067m.subSequence(i7, i8));
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends n0 implements t4.a<Iterator<? extends Character>> {

        /* renamed from: l */
        public final /* synthetic */ CharSequence f11069l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(CharSequence charSequence) {
            super(0);
            this.f11069l = charSequence;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b */
        public final Iterator<Character> n() {
            return c0.C3(this.f11069l);
        }
    }

    @n6.d
    public static final CharSequence A6(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "<this>");
        if (i7 >= 0) {
            return charSequence.subSequence(d5.u.B(i7, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R> List<R> A7(@n6.d CharSequence charSequence, @n6.d t4.p<? super Integer, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            int i9 = i8 + 1;
            R J = pVar.J(Integer.valueOf(i8), Character.valueOf(charSequence.charAt(i7)));
            if (J != null) {
                arrayList.add(J);
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @n6.d
    public static final CharSequence A8(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        l0.o(reverse, "StringBuilder(this).reverse()");
        return reverse;
    }

    @n6.d
    public static final String B6(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        if (i7 >= 0) {
            String substring = str.substring(d5.u.B(i7, str.length()));
            l0.o(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C B7(@n6.d CharSequence charSequence, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            int i9 = i8 + 1;
            R J = pVar.J(Integer.valueOf(i8), Character.valueOf(charSequence.charAt(i7)));
            if (J != null) {
                c7.add(J);
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    @k4.f
    public static final String B8(String str) {
        l0.p(str, "<this>");
        return A8(str).toString();
    }

    @n6.d
    public static final CharSequence C6(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "<this>");
        if (i7 >= 0) {
            return X8(charSequence, d5.u.u(charSequence.length() - i7, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C C7(@n6.d CharSequence charSequence, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            c7.add(pVar.J(Integer.valueOf(i8), Character.valueOf(charSequence.charAt(i7))));
            i7++;
            i8++;
        }
        return c7;
    }

    @g1(version = "1.4")
    @n6.d
    public static final <R> List<R> C8(@n6.d CharSequence charSequence, R r6, @n6.d t4.p<? super R, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        if (charSequence.length() == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r6);
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            r6 = pVar.J(r6, Character.valueOf(charSequence.charAt(i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.d
    public static final String D6(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        if (i7 >= 0) {
            return Y8(str, d5.u.u(str.length() - i7, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R> List<R> D7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            R O = lVar.O(Character.valueOf(charSequence.charAt(i7)));
            if (O != null) {
                arrayList.add(O);
            }
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @n6.d
    public static final <R> List<R> D8(@n6.d CharSequence charSequence, R r6, @n6.d t4.q<? super Integer, ? super R, ? super Character, ? extends R> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        if (charSequence.length() == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r6);
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Character.valueOf(charSequence.charAt(i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.d
    public static final CharSequence E6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int j32 = c0.j3(charSequence); -1 < j32; j32--) {
            if (!lVar.O(Character.valueOf(charSequence.charAt(j32))).booleanValue()) {
                return charSequence.subSequence(0, j32 + 1);
            }
        }
        return "";
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C E7(@n6.d CharSequence charSequence, @n6.d C c7, @n6.d t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            R O = lVar.O(Character.valueOf(charSequence.charAt(i7)));
            if (O != null) {
                c7.add(O);
            }
        }
        return c7;
    }

    @g1(version = "1.4")
    @n6.d
    public static final List<Character> E8(@n6.d CharSequence charSequence, @n6.d t4.p<? super Character, ? super Character, Character> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        if (charSequence.length() == 0) {
            return x3.w.E();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i7 = 1; i7 < length; i7++) {
            charAt = pVar.J(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i7))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @n6.d
    public static final String F6(@n6.d String str, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        for (int j32 = c0.j3(str); -1 < j32; j32--) {
            if (!lVar.O(Character.valueOf(str.charAt(j32))).booleanValue()) {
                String substring = str.substring(0, j32 + 1);
                l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return "";
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C F7(@n6.d CharSequence charSequence, @n6.d C c7, @n6.d t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            c7.add(lVar.O(Character.valueOf(charSequence.charAt(i7))));
        }
        return c7;
    }

    @g1(version = "1.4")
    @n6.d
    public static final List<Character> F8(@n6.d CharSequence charSequence, @n6.d t4.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        if (charSequence.length() == 0) {
            return x3.w.E();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i7 = 1; i7 < length; i7++) {
            charAt = qVar.I(Integer.valueOf(i7), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i7))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @n6.d
    public static final CharSequence G6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!lVar.O(Character.valueOf(charSequence.charAt(i7))).booleanValue()) {
                return charSequence.subSequence(i7, charSequence.length());
            }
        }
        return "";
    }

    @g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Character G7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int j32 = c0.j3(charSequence);
        if (j32 == 0) {
            return Character.valueOf(charAt);
        }
        R O = lVar.O(Character.valueOf(charAt));
        s0 it = new d5.l(1, j32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            R O2 = lVar.O(Character.valueOf(charAt2));
            if (O.compareTo(O2) < 0) {
                charAt = charAt2;
                O = O2;
            }
        }
        return Character.valueOf(charAt);
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> G8(@n6.d CharSequence charSequence, R r6, @n6.d t4.p<? super R, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        if (charSequence.length() == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r6);
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            r6 = pVar.J(r6, Character.valueOf(charSequence.charAt(i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.d
    public static final String H6(@n6.d String str, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!lVar.O(Character.valueOf(str.charAt(i7))).booleanValue()) {
                String substring = str.substring(i7);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return "";
    }

    @s4.h(name = "maxByOrThrow")
    @g1(version = "1.7")
    public static final <R extends Comparable<? super R>> char H7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int j32 = c0.j3(charSequence);
        if (j32 == 0) {
            return charAt;
        }
        R O = lVar.O(Character.valueOf(charAt));
        s0 it = new d5.l(1, j32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            R O2 = lVar.O(Character.valueOf(charAt2));
            if (O.compareTo(O2) < 0) {
                charAt = charAt2;
                O = O2;
            }
        }
        return charAt;
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> H8(@n6.d CharSequence charSequence, R r6, @n6.d t4.q<? super Integer, ? super R, ? super Character, ? extends R> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        if (charSequence.length() == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r6);
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Character.valueOf(charSequence.charAt(i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @k4.f
    public static final char I6(CharSequence charSequence, int i7, t4.l<? super Integer, Character> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > c0.j3(charSequence)) ? lVar.O(Integer.valueOf(i7)).charValue() : charSequence.charAt(i7);
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final double I7(CharSequence charSequence, t4.l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Character.valueOf(charSequence.charAt(0))).doubleValue();
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Character.valueOf(charSequence.charAt(it.b()))).doubleValue());
        }
        return doubleValue;
    }

    public static final char I8(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @k4.f
    public static final Character J6(CharSequence charSequence, int i7) {
        l0.p(charSequence, "<this>");
        return m7(charSequence, i7);
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final float J7(CharSequence charSequence, t4.l<? super Character, Float> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Character.valueOf(charSequence.charAt(0))).floatValue();
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Character.valueOf(charSequence.charAt(it.b()))).floatValue());
        }
        return floatValue;
    }

    public static final char J8(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        Character ch = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                ch = Character.valueOf(charAt);
                z6 = true;
            }
        }
        if (z6) {
            l0.n(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @n6.d
    public static final CharSequence K6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = charSequence.charAt(i7);
            if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <R extends Comparable<? super R>> R K7(CharSequence charSequence, t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Character.valueOf(charSequence.charAt(0)));
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Character.valueOf(charSequence.charAt(it.b())));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @n6.e
    public static final Character K8(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @n6.d
    public static final String L6(@n6.d String str, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "filterTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <R extends Comparable<? super R>> R L7(CharSequence charSequence, t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R O = lVar.O(Character.valueOf(charSequence.charAt(0)));
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Character.valueOf(charSequence.charAt(it.b())));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @n6.e
    public static final Character L8(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        Character ch = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                if (z6) {
                    return null;
                }
                ch = Character.valueOf(charAt);
                z6 = true;
            }
        }
        if (z6) {
            return ch;
        }
        return null;
    }

    @n6.d
    public static final CharSequence M6(@n6.d CharSequence charSequence, @n6.d t4.p<? super Integer, ? super Character, Boolean> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "predicate");
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            char charAt = charSequence.charAt(i7);
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i7++;
            i8 = i9;
        }
        return sb;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final Double M7(CharSequence charSequence, t4.l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = lVar.O(Character.valueOf(charSequence.charAt(0))).doubleValue();
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Character.valueOf(charSequence.charAt(it.b()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @n6.d
    public static final CharSequence M8(@n6.d CharSequence charSequence, @n6.d d5.l lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "indices");
        return lVar.isEmpty() ? "" : c0.h5(charSequence, lVar);
    }

    @n6.d
    public static final String N6(@n6.d String str, @n6.d t4.p<? super Integer, ? super Character, Boolean> pVar) {
        l0.p(str, "<this>");
        l0.p(pVar, "predicate");
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        int i8 = 0;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i7++;
            i8 = i9;
        }
        String sb2 = sb.toString();
        l0.o(sb2, "filterIndexedTo(StringBu…(), predicate).toString()");
        return sb2;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final Float N7(CharSequence charSequence, t4.l<? super Character, Float> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = lVar.O(Character.valueOf(charSequence.charAt(0))).floatValue();
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Character.valueOf(charSequence.charAt(it.b()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @n6.d
    public static final CharSequence N8(@n6.d CharSequence charSequence, @n6.d Iterable<Integer> iterable) {
        l0.p(charSequence, "<this>");
        l0.p(iterable, "indices");
        int Y = x3.x.Y(iterable, 10);
        if (Y == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(charSequence.charAt(it.next().intValue()));
        }
        return sb;
    }

    @n6.d
    public static final <C extends Appendable> C O6(@n6.d CharSequence charSequence, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Character, Boolean> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(c7, "destination");
        l0.p(pVar, "predicate");
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            char charAt = charSequence.charAt(i7);
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Character.valueOf(charAt)).booleanValue()) {
                c7.append(charAt);
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <R> R O7(CharSequence charSequence, Comparator<? super R> comparator, t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Character.valueOf(charSequence.charAt(0)));
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Character.valueOf(charSequence.charAt(it.b())));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @n6.d
    public static final String O8(@n6.d String str, @n6.d d5.l lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "indices");
        return lVar.isEmpty() ? "" : c0.l5(str, lVar);
    }

    @n6.d
    public static final CharSequence P6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            if (!lVar.O(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <R> R P7(CharSequence charSequence, Comparator<? super R> comparator, t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Character.valueOf(charSequence.charAt(0)));
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Character.valueOf(charSequence.charAt(it.b())));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @k4.f
    public static final String P8(String str, Iterable<Integer> iterable) {
        l0.p(str, "<this>");
        l0.p(iterable, "indices");
        return N8(str, iterable).toString();
    }

    @n6.d
    public static final String Q6(@n6.d String str, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (!lVar.O(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    @g1(version = "1.4")
    @n6.e
    public static final Character Q7(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            if (l0.t(charAt, charAt2) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final int Q8(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Integer> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        int i7 = 0;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            i7 += lVar.O(Character.valueOf(charSequence.charAt(i8))).intValue();
        }
        return i7;
    }

    @n6.d
    public static final <C extends Appendable> C R6(@n6.d CharSequence charSequence, @n6.d C c7, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            if (!lVar.O(Character.valueOf(charAt)).booleanValue()) {
                c7.append(charAt);
            }
        }
        return c7;
    }

    @s4.h(name = "maxOrThrow")
    @g1(version = "1.7")
    public static final char R7(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            if (l0.t(charAt, charAt2) < 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final double R8(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            d7 += lVar.O(Character.valueOf(charSequence.charAt(i7))).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final <C extends Appendable> C S6(@n6.d CharSequence charSequence, @n6.d C c7, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = charSequence.charAt(i7);
            if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                c7.append(charAt);
            }
        }
        return c7;
    }

    @g1(version = "1.4")
    @n6.e
    public static final Character S7(@n6.d CharSequence charSequence, @n6.d Comparator<? super Character> comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @s4.h(name = "sumOfDouble")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final double S8(CharSequence charSequence, t4.l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            d7 += lVar.O(Character.valueOf(charSequence.charAt(i7))).doubleValue();
        }
        return d7;
    }

    @k4.f
    public static final Character T6(CharSequence charSequence, t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @s4.h(name = "maxWithOrThrow")
    @g1(version = "1.7")
    public static final char T7(@n6.d CharSequence charSequence, @n6.d Comparator<? super Character> comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    @s4.h(name = "sumOfInt")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final int T8(CharSequence charSequence, t4.l<? super Character, Integer> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        int i7 = 0;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            i7 += lVar.O(Character.valueOf(charSequence.charAt(i8))).intValue();
        }
        return i7;
    }

    @k4.f
    public static final Character U6(CharSequence charSequence, t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                char charAt = charSequence.charAt(length);
                if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                    return Character.valueOf(charAt);
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return null;
    }

    @g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Character U7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int j32 = c0.j3(charSequence);
        if (j32 == 0) {
            return Character.valueOf(charAt);
        }
        R O = lVar.O(Character.valueOf(charAt));
        s0 it = new d5.l(1, j32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            R O2 = lVar.O(Character.valueOf(charAt2));
            if (O.compareTo(O2) > 0) {
                charAt = charAt2;
                O = O2;
            }
        }
        return Character.valueOf(charAt);
    }

    @s4.h(name = "sumOfLong")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final long U8(CharSequence charSequence, t4.l<? super Character, Long> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        long j7 = 0;
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            j7 += lVar.O(Character.valueOf(charSequence.charAt(i7))).longValue();
        }
        return j7;
    }

    public static final char V6(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    @s4.h(name = "minByOrThrow")
    @g1(version = "1.7")
    public static final <R extends Comparable<? super R>> char V7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int j32 = c0.j3(charSequence);
        if (j32 == 0) {
            return charAt;
        }
        R O = lVar.O(Character.valueOf(charAt));
        s0 it = new d5.l(1, j32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            R O2 = lVar.O(Character.valueOf(charAt2));
            if (O.compareTo(O2) > 0) {
                charAt = charAt2;
                O = O2;
            }
        }
        return charAt;
    }

    @s4.h(name = "sumOfUInt")
    @g1(version = "1.5")
    @t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final int V8(CharSequence charSequence, t4.l<? super Character, x1> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        int l7 = x1.l(0);
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            l7 = x1.l(l7 + lVar.O(Character.valueOf(charSequence.charAt(i7))).l0());
        }
        return l7;
    }

    public static final char W6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                return charAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final double W7(CharSequence charSequence, t4.l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Character.valueOf(charSequence.charAt(0))).doubleValue();
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Character.valueOf(charSequence.charAt(it.b()))).doubleValue());
        }
        return doubleValue;
    }

    @s4.h(name = "sumOfULong")
    @g1(version = "1.5")
    @t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final long W8(CharSequence charSequence, t4.l<? super Character, b2> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            l7 = b2.l(l7 + lVar.O(Character.valueOf(charSequence.charAt(i7))).l0());
        }
        return l7;
    }

    @g1(version = "1.5")
    @k4.f
    public static final <R> R X6(CharSequence charSequence, t4.l<? super Character, ? extends R> lVar) {
        R r6;
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        int i7 = 0;
        while (true) {
            if (i7 >= charSequence.length()) {
                r6 = null;
                break;
            }
            r6 = lVar.O(Character.valueOf(charSequence.charAt(i7)));
            if (r6 != null) {
                break;
            }
            i7++;
        }
        if (r6 != null) {
            return r6;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final float X7(CharSequence charSequence, t4.l<? super Character, Float> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Character.valueOf(charSequence.charAt(0))).floatValue();
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Character.valueOf(charSequence.charAt(it.b()))).floatValue());
        }
        return floatValue;
    }

    @n6.d
    public static final CharSequence X8(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "<this>");
        if (i7 >= 0) {
            return charSequence.subSequence(0, d5.u.B(i7, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    @g1(version = "1.5")
    @k4.f
    public static final <R> R Y6(CharSequence charSequence, t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            R O = lVar.O(Character.valueOf(charSequence.charAt(i7)));
            if (O != null) {
                return O;
            }
        }
        return null;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Y7(CharSequence charSequence, t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Character.valueOf(charSequence.charAt(0)));
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Character.valueOf(charSequence.charAt(it.b())));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @n6.d
    public static final String Y8(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        if (i7 >= 0) {
            String substring = str.substring(0, d5.u.B(i7, str.length()));
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    @n6.e
    public static final Character Z6(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Z7(CharSequence charSequence, t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R O = lVar.O(Character.valueOf(charSequence.charAt(0)));
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Character.valueOf(charSequence.charAt(it.b())));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @n6.d
    public static final CharSequence Z8(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "<this>");
        if (i7 >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - d5.u.B(i7, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    @n6.e
    public static final Character a7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final Double a8(CharSequence charSequence, t4.l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = lVar.O(Character.valueOf(charSequence.charAt(0))).doubleValue();
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Character.valueOf(charSequence.charAt(it.b()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @n6.d
    public static final String a9(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        if (i7 >= 0) {
            int length = str.length();
            String substring = str.substring(length - d5.u.B(i7, length));
            l0.o(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R> List<R> b7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends Iterable<? extends R>> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            x3.b0.o0(arrayList, lVar.O(Character.valueOf(charSequence.charAt(i7))));
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final Float b8(CharSequence charSequence, t4.l<? super Character, Float> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = lVar.O(Character.valueOf(charSequence.charAt(0))).floatValue();
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Character.valueOf(charSequence.charAt(it.b()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @n6.d
    public static final CharSequence b9(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int j32 = c0.j3(charSequence); -1 < j32; j32--) {
            if (!lVar.O(Character.valueOf(charSequence.charAt(j32))).booleanValue()) {
                return charSequence.subSequence(j32 + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @s4.h(name = "flatMapIndexedIterable")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <R> List<R> c7(CharSequence charSequence, t4.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            x3.b0.o0(arrayList, pVar.J(Integer.valueOf(i8), Character.valueOf(charSequence.charAt(i7))));
            i7++;
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <R> R c8(CharSequence charSequence, Comparator<? super R> comparator, t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Character.valueOf(charSequence.charAt(0)));
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Character.valueOf(charSequence.charAt(it.b())));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @n6.d
    public static final String c9(@n6.d String str, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        for (int j32 = c0.j3(str); -1 < j32; j32--) {
            if (!lVar.O(Character.valueOf(str.charAt(j32))).booleanValue()) {
                String substring = str.substring(j32 + 1);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return str;
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <R, C extends Collection<? super R>> C d7(CharSequence charSequence, C c7, t4.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            x3.b0.o0(c7, pVar.J(Integer.valueOf(i8), Character.valueOf(charSequence.charAt(i7))));
            i7++;
            i8++;
        }
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <R> R d8(CharSequence charSequence, Comparator<? super R> comparator, t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Character.valueOf(charSequence.charAt(0)));
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Character.valueOf(charSequence.charAt(it.b())));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @n6.d
    public static final CharSequence d9(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!lVar.O(Character.valueOf(charSequence.charAt(i7))).booleanValue()) {
                return charSequence.subSequence(0, i7);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C e7(@n6.d CharSequence charSequence, @n6.d C c7, @n6.d t4.l<? super Character, ? extends Iterable<? extends R>> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            x3.b0.o0(c7, lVar.O(Character.valueOf(charSequence.charAt(i7))));
        }
        return c7;
    }

    @g1(version = "1.4")
    @n6.e
    public static final Character e8(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            if (l0.t(charAt, charAt2) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @n6.d
    public static final String e9(@n6.d String str, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!lVar.O(Character.valueOf(str.charAt(i7))).booleanValue()) {
                String substring = str.substring(0, i7);
                l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str;
    }

    public static final <R> R f7(@n6.d CharSequence charSequence, R r6, @n6.d t4.p<? super R, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            r6 = pVar.J(r6, Character.valueOf(charSequence.charAt(i7)));
        }
        return r6;
    }

    @s4.h(name = "minOrThrow")
    @g1(version = "1.7")
    public static final char f8(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            if (l0.t(charAt, charAt2) > 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    @n6.d
    public static final <C extends Collection<? super Character>> C f9(@n6.d CharSequence charSequence, @n6.d C c7) {
        l0.p(charSequence, "<this>");
        l0.p(c7, "destination");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            c7.add(Character.valueOf(charSequence.charAt(i7)));
        }
        return c7;
    }

    public static final <R> R g7(@n6.d CharSequence charSequence, R r6, @n6.d t4.q<? super Integer, ? super R, ? super Character, ? extends R> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            r6 = qVar.I(Integer.valueOf(i8), r6, Character.valueOf(charSequence.charAt(i7)));
            i7++;
            i8++;
        }
        return r6;
    }

    @g1(version = "1.4")
    @n6.e
    public static final Character g8(@n6.d CharSequence charSequence, @n6.d Comparator<? super Character> comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @n6.d
    public static final HashSet<Character> g9(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return (HashSet) f9(charSequence, new HashSet(z0.j(d5.u.B(charSequence.length(), 128))));
    }

    public static final boolean h6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!lVar.O(Character.valueOf(charSequence.charAt(i7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <R> R h7(@n6.d CharSequence charSequence, R r6, @n6.d t4.p<? super Character, ? super R, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        for (int j32 = c0.j3(charSequence); j32 >= 0; j32--) {
            r6 = pVar.J(Character.valueOf(charSequence.charAt(j32)), r6);
        }
        return r6;
    }

    @s4.h(name = "minWithOrThrow")
    @g1(version = "1.7")
    public static final char h8(@n6.d CharSequence charSequence, @n6.d Comparator<? super Character> comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.b());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    @n6.d
    public static final List<Character> h9(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? i9(charSequence) : x3.v.k(Character.valueOf(charSequence.charAt(0))) : x3.w.E();
    }

    public static final boolean i6(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    public static final <R> R i7(@n6.d CharSequence charSequence, R r6, @n6.d t4.q<? super Integer, ? super Character, ? super R, ? extends R> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        for (int j32 = c0.j3(charSequence); j32 >= 0; j32--) {
            r6 = qVar.I(Integer.valueOf(j32), Character.valueOf(charSequence.charAt(j32)), r6);
        }
        return r6;
    }

    public static final boolean i8(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @n6.d
    public static final List<Character> i9(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return (List) f9(charSequence, new ArrayList(charSequence.length()));
    }

    public static final boolean j6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (lVar.O(Character.valueOf(charSequence.charAt(i7))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final void j7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, m2> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, s2.t0.f16450f);
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            lVar.O(Character.valueOf(charSequence.charAt(i7)));
        }
    }

    public static final boolean j8(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (lVar.O(Character.valueOf(charSequence.charAt(i7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public static final Set<Character> j9(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? (Set) f9(charSequence, new LinkedHashSet(z0.j(d5.u.B(charSequence.length(), 128)))) : k1.f(Character.valueOf(charSequence.charAt(0))) : l1.k();
    }

    @n6.d
    public static final Iterable<Character> k6(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return x3.w.E();
            }
        }
        return new a(charSequence);
    }

    public static final void k7(@n6.d CharSequence charSequence, @n6.d t4.p<? super Integer, ? super Character, m2> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, s2.t0.f16450f);
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            pVar.J(Integer.valueOf(i8), Character.valueOf(charSequence.charAt(i7)));
            i7++;
            i8++;
        }
    }

    @g1(version = "1.1")
    @n6.d
    public static final <S extends CharSequence> S k8(@n6.d S s6, @n6.d t4.l<? super Character, m2> lVar) {
        l0.p(s6, "<this>");
        l0.p(lVar, s2.t0.f16450f);
        for (int i7 = 0; i7 < s6.length(); i7++) {
            lVar.O(Character.valueOf(s6.charAt(i7)));
        }
        return s6;
    }

    @g1(version = "1.2")
    @n6.d
    public static final List<String> k9(@n6.d CharSequence charSequence, int i7, int i8, boolean z6) {
        l0.p(charSequence, "<this>");
        return l9(charSequence, i7, i8, z6, e.f11064l);
    }

    @n6.d
    public static final f5.m<Character> l6(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return f5.s.g();
            }
        }
        return new b(charSequence);
    }

    @k4.f
    public static final char l7(CharSequence charSequence, int i7, t4.l<? super Integer, Character> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > c0.j3(charSequence)) ? lVar.O(Integer.valueOf(i7)).charValue() : charSequence.charAt(i7);
    }

    @g1(version = "1.4")
    @n6.d
    public static final <S extends CharSequence> S l8(@n6.d S s6, @n6.d t4.p<? super Integer, ? super Character, m2> pVar) {
        l0.p(s6, "<this>");
        l0.p(pVar, s2.t0.f16450f);
        int i7 = 0;
        int i8 = 0;
        while (i7 < s6.length()) {
            pVar.J(Integer.valueOf(i8), Character.valueOf(s6.charAt(i7)));
            i7++;
            i8++;
        }
        return s6;
    }

    @g1(version = "1.2")
    @n6.d
    public static final <R> List<R> l9(@n6.d CharSequence charSequence, int i7, int i8, boolean z6, @n6.d t4.l<? super CharSequence, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        o1.a(i7, i8);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList((length / i8) + (length % i8 == 0 ? 0 : 1));
        int i9 = 0;
        while (true) {
            if (!(i9 >= 0 && i9 < length)) {
                break;
            }
            int i10 = i9 + i7;
            if (i10 < 0 || i10 > length) {
                if (!z6) {
                    break;
                }
                i10 = length;
            }
            arrayList.add(lVar.O(charSequence.subSequence(i9, i10)));
            i9 += i8;
        }
        return arrayList;
    }

    @n6.d
    public static final <K, V> Map<K, V> m6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(charSequence.length()), 16));
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            u0<? extends K, ? extends V> O = lVar.O(Character.valueOf(charSequence.charAt(i7)));
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    @n6.e
    public static final Character m7(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "<this>");
        if (i7 < 0 || i7 > c0.j3(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i7));
    }

    @n6.d
    public static final u0<CharSequence, CharSequence> m8(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new u0<>(sb, sb2);
    }

    public static /* synthetic */ List m9(CharSequence charSequence, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return k9(charSequence, i7, i8, z6);
    }

    @n6.d
    public static final <K> Map<K, Character> n6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends K> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(charSequence.length()), 16));
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            linkedHashMap.put(lVar.O(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @n6.d
    public static final <K> Map<K, List<Character>> n7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends K> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            K O = lVar.O(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @n6.d
    public static final u0<String, String> n8(@n6.d String str, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        String sb3 = sb.toString();
        l0.o(sb3, "first.toString()");
        String sb4 = sb2.toString();
        l0.o(sb4, "second.toString()");
        return new u0<>(sb3, sb4);
    }

    public static /* synthetic */ List n9(CharSequence charSequence, int i7, int i8, boolean z6, t4.l lVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return l9(charSequence, i7, i8, z6, lVar);
    }

    @n6.d
    public static final <K, V> Map<K, V> o6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends K> lVar, @n6.d t4.l<? super Character, ? extends V> lVar2) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(charSequence.length()), 16));
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            linkedHashMap.put(lVar.O(Character.valueOf(charAt)), lVar2.O(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @n6.d
    public static final <K, V> Map<K, List<V>> o7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends K> lVar, @n6.d t4.l<? super Character, ? extends V> lVar2) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            K O = lVar.O(Character.valueOf(charAt));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @g1(version = "1.3")
    @k4.f
    public static final char o8(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return p8(charSequence, b5.f.f7260k);
    }

    @g1(version = "1.2")
    @n6.d
    public static final f5.m<String> o9(@n6.d CharSequence charSequence, int i7, int i8, boolean z6) {
        l0.p(charSequence, "<this>");
        return p9(charSequence, i7, i8, z6, f.f11065l);
    }

    @n6.d
    public static final <K, M extends Map<? super K, ? super Character>> M p6(@n6.d CharSequence charSequence, @n6.d M m7, @n6.d t4.l<? super Character, ? extends K> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            m7.put(lVar.O(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return m7;
    }

    @n6.d
    public static final <K, M extends Map<? super K, List<Character>>> M p7(@n6.d CharSequence charSequence, @n6.d M m7, @n6.d t4.l<? super Character, ? extends K> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            K O = lVar.O(Character.valueOf(charAt));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return m7;
    }

    @g1(version = "1.3")
    public static final char p8(@n6.d CharSequence charSequence, @n6.d b5.f fVar) {
        l0.p(charSequence, "<this>");
        l0.p(fVar, "random");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(fVar.m(charSequence.length()));
    }

    @g1(version = "1.2")
    @n6.d
    public static final <R> f5.m<R> p9(@n6.d CharSequence charSequence, int i7, int i8, boolean z6, @n6.d t4.l<? super CharSequence, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        o1.a(i7, i8);
        return f5.u.k1(x3.e0.v1(d5.u.B1(z6 ? c0.i3(charSequence) : d5.u.W1(0, (charSequence.length() - i7) + 1), i8)), new g(i7, charSequence, lVar));
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M q6(@n6.d CharSequence charSequence, @n6.d M m7, @n6.d t4.l<? super Character, ? extends K> lVar, @n6.d t4.l<? super Character, ? extends V> lVar2) {
        l0.p(charSequence, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            m7.put(lVar.O(Character.valueOf(charAt)), lVar2.O(Character.valueOf(charAt)));
        }
        return m7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, M extends Map<? super K, List<V>>> M q7(@n6.d CharSequence charSequence, @n6.d M m7, @n6.d t4.l<? super Character, ? extends K> lVar, @n6.d t4.l<? super Character, ? extends V> lVar2) {
        l0.p(charSequence, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            K O = lVar.O(Character.valueOf(charAt));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(Character.valueOf(charAt)));
        }
        return m7;
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Character q8(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return r8(charSequence, b5.f.f7260k);
    }

    public static /* synthetic */ f5.m q9(CharSequence charSequence, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return o9(charSequence, i7, i8, z6);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M r6(@n6.d CharSequence charSequence, @n6.d M m7, @n6.d t4.l<? super Character, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "transform");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            u0<? extends K, ? extends V> O = lVar.O(Character.valueOf(charSequence.charAt(i7)));
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @g1(version = "1.1")
    @n6.d
    public static final <K> x3.l0<Character, K> r7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends K> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "keySelector");
        return new d(charSequence, lVar);
    }

    @g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Character r8(@n6.d CharSequence charSequence, @n6.d b5.f fVar) {
        l0.p(charSequence, "<this>");
        l0.p(fVar, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(fVar.m(charSequence.length())));
    }

    public static /* synthetic */ f5.m r9(CharSequence charSequence, int i7, int i8, boolean z6, t4.l lVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return p9(charSequence, i7, i8, z6, lVar);
    }

    @g1(version = "1.3")
    @n6.d
    public static final <V> Map<Character, V> s6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends V> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(d5.u.B(charSequence.length(), 128)), 16));
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            linkedHashMap.put(Character.valueOf(charAt), lVar.O(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    public static final int s7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(Character.valueOf(charSequence.charAt(i7))).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    public static final char s8(@n6.d CharSequence charSequence, @n6.d t4.p<? super Character, ? super Character, Character> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            charAt = pVar.J(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(it.b()))).charValue();
        }
        return charAt;
    }

    @n6.d
    public static final Iterable<p0<Character>> s9(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return new q0(new h(charSequence));
    }

    @g1(version = "1.3")
    @n6.d
    public static final <V, M extends Map<? super Character, ? super V>> M t6(@n6.d CharSequence charSequence, @n6.d M m7, @n6.d t4.l<? super Character, ? extends V> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "valueSelector");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char charAt = charSequence.charAt(i7);
            m7.put(Character.valueOf(charAt), lVar.O(Character.valueOf(charAt)));
        }
        return m7;
    }

    public static final int t7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (lVar.O(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    public static final char t8(@n6.d CharSequence charSequence, @n6.d t4.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            charAt = qVar.I(Integer.valueOf(b7), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(b7))).charValue();
        }
        return charAt;
    }

    @n6.d
    public static final List<u0<Character, Character>> t9(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(q1.a(Character.valueOf(charSequence.charAt(i7)), Character.valueOf(charSequence2.charAt(i7))));
        }
        return arrayList;
    }

    @g1(version = "1.2")
    @n6.d
    public static final List<String> u6(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "<this>");
        return k9(charSequence, i7, i7, true);
    }

    public static final char u7(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(c0.j3(charSequence));
    }

    @g1(version = "1.4")
    @n6.e
    public static final Character u8(@n6.d CharSequence charSequence, @n6.d t4.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            charAt = qVar.I(Integer.valueOf(b7), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(b7))).charValue();
        }
        return Character.valueOf(charAt);
    }

    @n6.d
    public static final <V> List<V> u9(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d t4.p<? super Character, ? super Character, ? extends V> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Character.valueOf(charSequence.charAt(i7)), Character.valueOf(charSequence2.charAt(i7))));
        }
        return arrayList;
    }

    @g1(version = "1.2")
    @n6.d
    public static final <R> List<R> v6(@n6.d CharSequence charSequence, int i7, @n6.d t4.l<? super CharSequence, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        return l9(charSequence, i7, i7, true, lVar);
    }

    public static final char v7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                char charAt = charSequence.charAt(length);
                if (!lVar.O(Character.valueOf(charAt)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                } else {
                    return charAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Character v8(@n6.d CharSequence charSequence, @n6.d t4.p<? super Character, ? super Character, Character> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 it = new d5.l(1, c0.j3(charSequence)).iterator();
        while (it.hasNext()) {
            charAt = pVar.J(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(it.b()))).charValue();
        }
        return Character.valueOf(charAt);
    }

    @g1(version = "1.2")
    @n6.d
    public static final List<u0<Character, Character>> v9(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList(length);
        int i7 = 0;
        while (i7 < length) {
            char charAt = charSequence.charAt(i7);
            i7++;
            arrayList.add(q1.a(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i7))));
        }
        return arrayList;
    }

    @g1(version = "1.2")
    @n6.d
    public static final f5.m<String> w6(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "<this>");
        return x6(charSequence, i7, c.f11061l);
    }

    @n6.e
    public static final Character w7(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final char w8(@n6.d CharSequence charSequence, @n6.d t4.p<? super Character, ? super Character, Character> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        int j32 = c0.j3(charSequence);
        if (j32 >= 0) {
            char charAt = charSequence.charAt(j32);
            for (int i7 = j32 - 1; i7 >= 0; i7--) {
                charAt = pVar.J(Character.valueOf(charSequence.charAt(i7)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @g1(version = "1.2")
    @n6.d
    public static final <R> List<R> w9(@n6.d CharSequence charSequence, @n6.d t4.p<? super Character, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList(length);
        int i7 = 0;
        while (i7 < length) {
            Character valueOf = Character.valueOf(charSequence.charAt(i7));
            i7++;
            arrayList.add(pVar.J(valueOf, Character.valueOf(charSequence.charAt(i7))));
        }
        return arrayList;
    }

    @g1(version = "1.2")
    @n6.d
    public static final <R> f5.m<R> x6(@n6.d CharSequence charSequence, int i7, @n6.d t4.l<? super CharSequence, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        return p9(charSequence, i7, i7, true, lVar);
    }

    @n6.e
    public static final Character x7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i7 = length - 1;
            char charAt = charSequence.charAt(length);
            if (lVar.O(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
            if (i7 < 0) {
                return null;
            }
            length = i7;
        }
    }

    public static final char x8(@n6.d CharSequence charSequence, @n6.d t4.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        int j32 = c0.j3(charSequence);
        if (j32 >= 0) {
            char charAt = charSequence.charAt(j32);
            for (int i7 = j32 - 1; i7 >= 0; i7--) {
                charAt = qVar.I(Integer.valueOf(i7), Character.valueOf(charSequence.charAt(i7)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @k4.f
    public static final int y6(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return charSequence.length();
    }

    @n6.d
    public static final <R> List<R> y7(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            arrayList.add(lVar.O(Character.valueOf(charSequence.charAt(i7))));
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @n6.e
    public static final Character y8(@n6.d CharSequence charSequence, @n6.d t4.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        int j32 = c0.j3(charSequence);
        if (j32 < 0) {
            return null;
        }
        char charAt = charSequence.charAt(j32);
        for (int i7 = j32 - 1; i7 >= 0; i7--) {
            charAt = qVar.I(Integer.valueOf(i7), Character.valueOf(charSequence.charAt(i7)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final int z6(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int i7 = 0;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            if (lVar.O(Character.valueOf(charSequence.charAt(i8))).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @n6.d
    public static final <R> List<R> z7(@n6.d CharSequence charSequence, @n6.d t4.p<? super Integer, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            arrayList.add(pVar.J(Integer.valueOf(i8), Character.valueOf(charSequence.charAt(i7))));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Character z8(@n6.d CharSequence charSequence, @n6.d t4.p<? super Character, ? super Character, Character> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        int j32 = c0.j3(charSequence);
        if (j32 < 0) {
            return null;
        }
        char charAt = charSequence.charAt(j32);
        for (int i7 = j32 - 1; i7 >= 0; i7--) {
            charAt = pVar.J(Character.valueOf(charSequence.charAt(i7)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }
}