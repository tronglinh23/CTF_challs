package i5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import u.v;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.b1;
import v3.g1;
import v3.q1;
import v3.q2;
import v3.t0;
import v3.u0;
import x3.s0;
@r1({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n79#1,22:1487\n113#1,5:1509\n130#1,5:1514\n79#1,22:1519\n107#1:1541\n79#1,22:1542\n113#1,5:1564\n124#1:1569\n113#1,5:1570\n130#1,5:1575\n141#1:1580\n130#1,5:1581\n79#1,22:1586\n113#1,5:1608\n130#1,5:1613\n12824#2,2:1618\n12824#2,2:1620\n288#3,2:1622\n288#3,2:1624\n1549#3:1627\n1620#3,3:1628\n1549#3:1631\n1620#3,3:1632\n1#4:1626\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n107#1:1487,22\n124#1:1509,5\n141#1:1514,5\n146#1:1519,22\n151#1:1541\n151#1:1542,22\n156#1:1564,5\n161#1:1569\n161#1:1570,5\n166#1:1575,5\n171#1:1580\n171#1:1581,5\n176#1:1586,22\n187#1:1608,5\n198#1:1613,5\n940#1:1618,2\n964#1:1620,2\n1003#1:1622,2\n1009#1:1624,2\n1309#1:1627\n1309#1:1628,3\n1334#1:1631\n1334#1:1632,3\n*E\n"})
/* loaded from: classes.dex */
public class c0 extends b0 {

    /* loaded from: classes.dex */
    public static final class a extends x3.t {

        /* renamed from: k */
        public int f11051k;

        /* renamed from: l */
        public final /* synthetic */ CharSequence f11052l;

        public a(CharSequence charSequence) {
            this.f11052l = charSequence;
        }

        @Override // x3.t
        public char b() {
            CharSequence charSequence = this.f11052l;
            int i7 = this.f11051k;
            this.f11051k = i7 + 1;
            return charSequence.charAt(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11051k < this.f11052l.length();
        }
    }

    @r1({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.p<CharSequence, Integer, u0<? extends Integer, ? extends Integer>> {

        /* renamed from: l */
        public final /* synthetic */ char[] f11053l;

        /* renamed from: m */
        public final /* synthetic */ boolean f11054m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(char[] cArr, boolean z6) {
            super(2);
            this.f11053l = cArr;
            this.f11054m = z6;
        }

        @Override // t4.p
        public /* bridge */ /* synthetic */ u0<? extends Integer, ? extends Integer> J(CharSequence charSequence, Integer num) {
            return b(charSequence, num.intValue());
        }

        @n6.e
        public final u0<Integer, Integer> b(@n6.d CharSequence charSequence, int i7) {
            l0.p(charSequence, "$this$$receiver");
            int u32 = c0.u3(charSequence, this.f11053l, i7, this.f11054m);
            if (u32 < 0) {
                return null;
            }
            return q1.a(Integer.valueOf(u32), 1);
        }
    }

    @r1({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.p<CharSequence, Integer, u0<? extends Integer, ? extends Integer>> {

        /* renamed from: l */
        public final /* synthetic */ List<String> f11055l;

        /* renamed from: m */
        public final /* synthetic */ boolean f11056m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<String> list, boolean z6) {
            super(2);
            this.f11055l = list;
            this.f11056m = z6;
        }

        @Override // t4.p
        public /* bridge */ /* synthetic */ u0<? extends Integer, ? extends Integer> J(CharSequence charSequence, Integer num) {
            return b(charSequence, num.intValue());
        }

        @n6.e
        public final u0<Integer, Integer> b(@n6.d CharSequence charSequence, int i7) {
            l0.p(charSequence, "$this$$receiver");
            u0 e32 = c0.e3(charSequence, this.f11055l, i7, this.f11056m, false);
            if (e32 != null) {
                return q1.a(e32.e(), Integer.valueOf(((String) e32.f()).length()));
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n0 implements t4.l<d5.l, String> {

        /* renamed from: l */
        public final /* synthetic */ CharSequence f11057l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CharSequence charSequence) {
            super(1);
            this.f11057l = charSequence;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b */
        public final String O(@n6.d d5.l lVar) {
            l0.p(lVar, "it");
            return c0.k5(this.f11057l, lVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends n0 implements t4.l<d5.l, String> {

        /* renamed from: l */
        public final /* synthetic */ CharSequence f11058l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CharSequence charSequence) {
            super(1);
            this.f11058l = charSequence;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b */
        public final String O(@n6.d d5.l lVar) {
            l0.p(lVar, "it");
            return c0.k5(this.f11058l, lVar);
        }
    }

    @k4.f
    public static final boolean A3(CharSequence charSequence) {
        return charSequence == null || b0.V1(charSequence);
    }

    public static /* synthetic */ String A4(String str, char c7, String str2, String str3, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str3 = str;
        }
        return y4(str, c7, str2, str3);
    }

    @n6.d
    public static final String A5(@n6.d String str, @n6.d String str2, @n6.d String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "missingDelimiterValue");
        int G3 = G3(str, str2, 0, false, 6, null);
        if (G3 == -1) {
            return str3;
        }
        String substring = str.substring(0, G3);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @k4.f
    public static final boolean B3(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static /* synthetic */ String B4(String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str4 = str;
        }
        return z4(str, str2, str3, str4);
    }

    public static /* synthetic */ String B5(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return z5(str, c7, str2);
    }

    @n6.d
    public static final x3.t C3(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return new a(charSequence);
    }

    @n6.d
    public static final String C4(@n6.d String str, char c7, @n6.d String str2, @n6.d String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "replacement");
        l0.p(str3, "missingDelimiterValue");
        int F3 = F3(str, c7, 0, false, 6, null);
        return F3 == -1 ? str3 : J4(str, 0, F3, str2).toString();
    }

    public static /* synthetic */ String C5(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return A5(str, str2, str3);
    }

    public static final int D3(@n6.d CharSequence charSequence, char c7, int i7, boolean z6) {
        l0.p(charSequence, "<this>");
        return (z6 || !(charSequence instanceof String)) ? I3(charSequence, new char[]{c7}, i7, z6) : ((String) charSequence).lastIndexOf(c7, i7);
    }

    @n6.d
    public static final String D4(@n6.d String str, @n6.d String str2, @n6.d String str3, @n6.d String str4) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "replacement");
        l0.p(str4, "missingDelimiterValue");
        int G3 = G3(str, str2, 0, false, 6, null);
        return G3 == -1 ? str4 : J4(str, 0, G3, str3).toString();
    }

    @g1(version = "1.5")
    public static final boolean D5(@n6.d String str) {
        l0.p(str, "<this>");
        if (l0.g(str, "true")) {
            return true;
        }
        if (l0.g(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final int E3(@n6.d CharSequence charSequence, @n6.d String str, int i7, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(str, v.b.f17140e);
        return (z6 || !(charSequence instanceof String)) ? p3(charSequence, str, i7, 0, z6, true) : ((String) charSequence).lastIndexOf(str, i7);
    }

    public static /* synthetic */ String E4(String str, char c7, String str2, String str3, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str3 = str;
        }
        return C4(str, c7, str2, str3);
    }

    @g1(version = "1.5")
    @n6.e
    public static final Boolean E5(@n6.d String str) {
        l0.p(str, "<this>");
        if (l0.g(str, "true")) {
            return Boolean.TRUE;
        }
        if (l0.g(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int F3(CharSequence charSequence, char c7, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = j3(charSequence);
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return D3(charSequence, c7, i7, z6);
    }

    public static /* synthetic */ String F4(String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str4 = str;
        }
        return D4(str, str2, str3, str4);
    }

    @n6.d
    public static final CharSequence F5(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i7 = 0;
        boolean z6 = false;
        while (i7 <= length) {
            boolean r6 = i5.d.r(charSequence.charAt(!z6 ? i7 : length));
            if (z6) {
                if (!r6) {
                    break;
                }
                length--;
            } else if (r6) {
                i7++;
            } else {
                z6 = true;
            }
        }
        return charSequence.subSequence(i7, length + 1);
    }

    public static /* synthetic */ int G3(CharSequence charSequence, String str, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = j3(charSequence);
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return E3(charSequence, str, i7, z6);
    }

    @k4.f
    public static final String G4(CharSequence charSequence, o oVar, String str) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        l0.p(str, "replacement");
        return oVar.o(charSequence, str);
    }

    @n6.d
    public static final CharSequence G5(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        int i7 = 0;
        boolean z6 = false;
        while (i7 <= length) {
            boolean booleanValue = lVar.O(Character.valueOf(charSequence.charAt(!z6 ? i7 : length))).booleanValue();
            if (z6) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i7++;
            } else {
                z6 = true;
            }
        }
        return charSequence.subSequence(i7, length + 1);
    }

    public static final int H3(@n6.d CharSequence charSequence, @n6.d Collection<String> collection, int i7, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(collection, "strings");
        u0<Integer, String> e32 = e3(charSequence, collection, i7, z6, true);
        if (e32 != null) {
            return e32.e().intValue();
        }
        return -1;
    }

    @s4.h(name = "replaceFirstCharWithChar")
    @g1(version = "1.5")
    @t0
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final String H4(String str, t4.l<? super Character, Character> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "transform");
        if (str.length() > 0) {
            char charValue = lVar.O(Character.valueOf(str.charAt(0))).charValue();
            String substring = str.substring(1);
            l0.o(substring, "this as java.lang.String).substring(startIndex)");
            return charValue + substring;
        }
        return str;
    }

    @n6.d
    public static final CharSequence H5(@n6.d CharSequence charSequence, @n6.d char... cArr) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "chars");
        int length = charSequence.length() - 1;
        int i7 = 0;
        boolean z6 = false;
        while (i7 <= length) {
            boolean O8 = x3.p.O8(cArr, charSequence.charAt(!z6 ? i7 : length));
            if (z6) {
                if (!O8) {
                    break;
                }
                length--;
            } else if (O8) {
                i7++;
            } else {
                z6 = true;
            }
        }
        return charSequence.subSequence(i7, length + 1);
    }

    public static final int I3(@n6.d CharSequence charSequence, @n6.d char[] cArr, int i7, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "chars");
        if (!z6 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(x3.p.xt(cArr), i7);
        }
        for (int B = d5.u.B(i7, j3(charSequence)); -1 < B; B--) {
            char charAt = charSequence.charAt(B);
            int length = cArr.length;
            boolean z7 = false;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                } else if (i5.e.J(cArr[i8], charAt, z6)) {
                    z7 = true;
                    break;
                } else {
                    i8++;
                }
            }
            if (z7) {
                return B;
            }
        }
        return -1;
    }

    @s4.h(name = "replaceFirstCharWithCharSequence")
    @g1(version = "1.5")
    @t0
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final String I4(String str, t4.l<? super Character, ? extends CharSequence> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "transform");
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) lVar.O(Character.valueOf(str.charAt(0))));
            String substring = str.substring(1);
            l0.o(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    @k4.f
    public static final String I5(String str) {
        l0.p(str, "<this>");
        return F5(str).toString();
    }

    public static /* synthetic */ int J3(CharSequence charSequence, Collection collection, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = j3(charSequence);
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return H3(charSequence, collection, i7, z6);
    }

    @n6.d
    public static final CharSequence J4(@n6.d CharSequence charSequence, int i7, int i8, @n6.d CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "replacement");
        if (i8 >= i7) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i7);
            l0.o(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence2);
            sb.append(charSequence, i8, charSequence.length());
            l0.o(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i8 + ") is less than start index (" + i7 + ").");
    }

    @n6.d
    public static final String J5(@n6.d String str, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        int length = str.length() - 1;
        int i7 = 0;
        boolean z6 = false;
        while (i7 <= length) {
            boolean booleanValue = lVar.O(Character.valueOf(str.charAt(!z6 ? i7 : length))).booleanValue();
            if (z6) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i7++;
            } else {
                z6 = true;
            }
        }
        return str.subSequence(i7, length + 1).toString();
    }

    public static /* synthetic */ int K3(CharSequence charSequence, char[] cArr, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = j3(charSequence);
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return I3(charSequence, cArr, i7, z6);
    }

    @n6.d
    public static final CharSequence K4(@n6.d CharSequence charSequence, @n6.d d5.l lVar, @n6.d CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "range");
        l0.p(charSequence2, "replacement");
        return J4(charSequence, lVar.b().intValue(), lVar.g().intValue() + 1, charSequence2);
    }

    @n6.d
    public static final String K5(@n6.d String str, @n6.d char... cArr) {
        l0.p(str, "<this>");
        l0.p(cArr, "chars");
        int length = str.length() - 1;
        int i7 = 0;
        boolean z6 = false;
        while (i7 <= length) {
            boolean O8 = x3.p.O8(cArr, str.charAt(!z6 ? i7 : length));
            if (z6) {
                if (!O8) {
                    break;
                }
                length--;
            } else if (O8) {
                i7++;
            } else {
                z6 = true;
            }
        }
        return str.subSequence(i7, length + 1).toString();
    }

    @n6.d
    public static final f5.m<String> L3(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return a5(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    @k4.f
    public static final String L4(String str, int i7, int i8, CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(charSequence, "replacement");
        return J4(str, i7, i8, charSequence).toString();
    }

    @n6.d
    public static final CharSequence L5(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (!i5.d.r(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return "";
    }

    @n6.d
    public static final List<String> M3(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return f5.u.c3(L3(charSequence));
    }

    @k4.f
    public static final String M4(String str, d5.l lVar, CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(lVar, "range");
        l0.p(charSequence, "replacement");
        return K4(str, lVar, charSequence).toString();
    }

    @n6.d
    public static final CharSequence M5(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i7 = length - 1;
            if (!lVar.O(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i7 < 0) {
                return "";
            }
            length = i7;
        }
    }

    @k4.f
    public static final boolean N3(CharSequence charSequence, o oVar) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.k(charSequence);
    }

    public static final void N4(int i7) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i7).toString());
    }

    @n6.d
    public static final CharSequence N5(@n6.d CharSequence charSequence, @n6.d char... cArr) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (!x3.p.O8(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return "";
    }

    @n6.d
    public static final String O2(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i7 = 0;
        while (i7 < min && i5.e.J(charSequence.charAt(i7), charSequence2.charAt(i7), z6)) {
            i7++;
        }
        int i8 = i7 - 1;
        if (k3(charSequence, i8) || k3(charSequence2, i8)) {
            i7--;
        }
        return charSequence.subSequence(0, i7).toString();
    }

    @k4.f
    public static final String O3(String str) {
        return str == null ? "" : str;
    }

    @k4.f
    public static final List<String> O4(CharSequence charSequence, o oVar, int i7) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.p(charSequence, i7);
    }

    @k4.f
    public static final String O5(String str) {
        l0.p(str, "<this>");
        return L5(str).toString();
    }

    public static /* synthetic */ String P2(CharSequence charSequence, CharSequence charSequence2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return O2(charSequence, charSequence2, z6);
    }

    @n6.d
    public static final CharSequence P3(@n6.d CharSequence charSequence, int i7, char c7) {
        l0.p(charSequence, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException("Desired length " + i7 + " is less than zero.");
        } else if (i7 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i7);
            sb.append(charSequence);
            s0 it = new d5.l(1, i7 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.b();
                sb.append(c7);
            }
            return sb;
        }
    }

    @n6.d
    public static final List<String> P4(@n6.d CharSequence charSequence, @n6.d char[] cArr, boolean z6, int i7) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "delimiters");
        if (cArr.length == 1) {
            return R4(charSequence, String.valueOf(cArr[0]), z6, i7);
        }
        Iterable N = f5.u.N(Z3(charSequence, cArr, 0, z6, i7, 2, null));
        ArrayList arrayList = new ArrayList(x3.x.Y(N, 10));
        Iterator it = N.iterator();
        while (it.hasNext()) {
            arrayList.add(k5(charSequence, (d5.l) it.next()));
        }
        return arrayList;
    }

    @n6.d
    public static final String P5(@n6.d String str, @n6.d t4.l<? super Character, Boolean> lVar) {
        CharSequence charSequence;
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (!lVar.O(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i7 < 0) {
                    break;
                } else {
                    length = i7;
                }
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    @n6.d
    public static final String Q2(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        int length = charSequence.length();
        int min = Math.min(length, charSequence2.length());
        int i7 = 0;
        while (i7 < min && i5.e.J(charSequence.charAt((length - i7) - 1), charSequence2.charAt((r1 - i7) - 1), z6)) {
            i7++;
        }
        if (k3(charSequence, (length - i7) - 1) || k3(charSequence2, (r1 - i7) - 1)) {
            i7--;
        }
        return charSequence.subSequence(length - i7, length).toString();
    }

    @n6.d
    public static final String Q3(@n6.d String str, int i7, char c7) {
        l0.p(str, "<this>");
        return P3(str, i7, c7).toString();
    }

    @n6.d
    public static final List<String> Q4(@n6.d CharSequence charSequence, @n6.d String[] strArr, boolean z6, int i7) {
        l0.p(charSequence, "<this>");
        l0.p(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return R4(charSequence, str, z6, i7);
            }
        }
        Iterable N = f5.u.N(a4(charSequence, strArr, 0, z6, i7, 2, null));
        ArrayList arrayList = new ArrayList(x3.x.Y(N, 10));
        Iterator it = N.iterator();
        while (it.hasNext()) {
            arrayList.add(k5(charSequence, (d5.l) it.next()));
        }
        return arrayList;
    }

    @n6.d
    public static final String Q5(@n6.d String str, @n6.d char... cArr) {
        CharSequence charSequence;
        l0.p(str, "<this>");
        l0.p(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (!x3.p.O8(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i7 < 0) {
                    break;
                } else {
                    length = i7;
                }
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static /* synthetic */ String R2(CharSequence charSequence, CharSequence charSequence2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return Q2(charSequence, charSequence2, z6);
    }

    public static /* synthetic */ CharSequence R3(CharSequence charSequence, int i7, char c7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            c7 = ' ';
        }
        return P3(charSequence, i7, c7);
    }

    public static final List<String> R4(CharSequence charSequence, String str, boolean z6, int i7) {
        N4(i7);
        int i8 = 0;
        int o32 = o3(charSequence, str, 0, z6);
        if (o32 == -1 || i7 == 1) {
            return x3.v.k(charSequence.toString());
        }
        boolean z7 = i7 > 0;
        ArrayList arrayList = new ArrayList(z7 ? d5.u.B(i7, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i8, o32).toString());
            i8 = str.length() + o32;
            if (z7 && arrayList.size() == i7 - 1) {
                break;
            }
            o32 = o3(charSequence, str, i8, z6);
        } while (o32 != -1);
        arrayList.add(charSequence.subSequence(i8, charSequence.length()).toString());
        return arrayList;
    }

    @n6.d
    public static final CharSequence R5(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!i5.d.r(charSequence.charAt(i7))) {
                return charSequence.subSequence(i7, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean S2(@n6.d CharSequence charSequence, char c7, boolean z6) {
        l0.p(charSequence, "<this>");
        return r3(charSequence, c7, 0, z6, 2, null) >= 0;
    }

    public static /* synthetic */ String S3(String str, int i7, char c7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            c7 = ' ';
        }
        return Q3(str, i7, c7);
    }

    public static /* synthetic */ List S4(CharSequence charSequence, o oVar, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.p(charSequence, i7);
    }

    @n6.d
    public static final CharSequence S5(@n6.d CharSequence charSequence, @n6.d t4.l<? super Character, Boolean> lVar) {
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

    @k4.f
    public static final boolean T2(CharSequence charSequence, o oVar) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.b(charSequence);
    }

    @n6.d
    public static final CharSequence T3(@n6.d CharSequence charSequence, int i7, char c7) {
        l0.p(charSequence, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException("Desired length " + i7 + " is less than zero.");
        } else if (i7 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i7);
            s0 it = new d5.l(1, i7 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.b();
                sb.append(c7);
            }
            sb.append(charSequence);
            return sb;
        }
    }

    public static /* synthetic */ List T4(CharSequence charSequence, char[] cArr, boolean z6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return P4(charSequence, cArr, z6, i7);
    }

    @n6.d
    public static final CharSequence T5(@n6.d CharSequence charSequence, @n6.d char... cArr) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "chars");
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!x3.p.O8(cArr, charSequence.charAt(i7))) {
                return charSequence.subSequence(i7, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean U2(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (s3(charSequence, (String) charSequence2, 0, z6, 2, null) >= 0) {
                return true;
            }
        } else if (q3(charSequence, charSequence2, 0, charSequence.length(), z6, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    @n6.d
    public static final String U3(@n6.d String str, int i7, char c7) {
        l0.p(str, "<this>");
        return T3(str, i7, c7).toString();
    }

    public static /* synthetic */ List U4(CharSequence charSequence, String[] strArr, boolean z6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return Q4(charSequence, strArr, z6, i7);
    }

    @k4.f
    public static final String U5(String str) {
        l0.p(str, "<this>");
        return R5(str).toString();
    }

    public static /* synthetic */ boolean V2(CharSequence charSequence, char c7, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return S2(charSequence, c7, z6);
    }

    public static /* synthetic */ CharSequence V3(CharSequence charSequence, int i7, char c7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            c7 = ' ';
        }
        return T3(charSequence, i7, c7);
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final f5.m<String> V4(CharSequence charSequence, o oVar, int i7) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.r(charSequence, i7);
    }

    @n6.d
    public static final String V5(@n6.d String str, @n6.d t4.l<? super Character, Boolean> lVar) {
        CharSequence charSequence;
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        int length = str.length();
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                charSequence = "";
                break;
            } else if (!lVar.O(Character.valueOf(str.charAt(i7))).booleanValue()) {
                charSequence = str.subSequence(i7, str.length());
                break;
            } else {
                i7++;
            }
        }
        return charSequence.toString();
    }

    public static /* synthetic */ boolean W2(CharSequence charSequence, CharSequence charSequence2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return U2(charSequence, charSequence2, z6);
    }

    public static /* synthetic */ String W3(String str, int i7, char c7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            c7 = ' ';
        }
        return U3(str, i7, c7);
    }

    @n6.d
    public static final f5.m<String> W4(@n6.d CharSequence charSequence, @n6.d char[] cArr, boolean z6, int i7) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "delimiters");
        return f5.u.k1(Z3(charSequence, cArr, 0, z6, i7, 2, null), new e(charSequence));
    }

    @n6.d
    public static final String W5(@n6.d String str, @n6.d char... cArr) {
        CharSequence charSequence;
        l0.p(str, "<this>");
        l0.p(cArr, "chars");
        int length = str.length();
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                charSequence = "";
                break;
            } else if (!x3.p.O8(cArr, str.charAt(i7))) {
                charSequence = str.subSequence(i7, str.length());
                break;
            } else {
                i7++;
            }
        }
        return charSequence.toString();
    }

    public static final boolean X2(@n6.e CharSequence charSequence, @n6.e CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return b0.L1((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!i5.e.J(charSequence.charAt(i7), charSequence2.charAt(i7), true)) {
                return false;
            }
        }
        return true;
    }

    public static final f5.m<d5.l> X3(CharSequence charSequence, char[] cArr, int i7, boolean z6, int i8) {
        N4(i8);
        return new h(charSequence, i7, i8, new b(cArr, z6));
    }

    @n6.d
    public static final f5.m<String> X4(@n6.d CharSequence charSequence, @n6.d String[] strArr, boolean z6, int i7) {
        l0.p(charSequence, "<this>");
        l0.p(strArr, "delimiters");
        return f5.u.k1(a4(charSequence, strArr, 0, z6, i7, 2, null), new d(charSequence));
    }

    public static final boolean Y2(@n6.e CharSequence charSequence, @n6.e CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return l0.g(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (charSequence.charAt(i7) != charSequence2.charAt(i7)) {
                return false;
            }
        }
        return true;
    }

    public static final f5.m<d5.l> Y3(CharSequence charSequence, String[] strArr, int i7, boolean z6, int i8) {
        N4(i8);
        return new h(charSequence, i7, i8, new c(x3.o.t(strArr), z6));
    }

    public static /* synthetic */ f5.m Y4(CharSequence charSequence, o oVar, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.r(charSequence, i7);
    }

    public static final boolean Z2(@n6.d CharSequence charSequence, char c7, boolean z6) {
        l0.p(charSequence, "<this>");
        return charSequence.length() > 0 && i5.e.J(charSequence.charAt(j3(charSequence)), c7, z6);
    }

    public static /* synthetic */ f5.m Z3(CharSequence charSequence, char[] cArr, int i7, boolean z6, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return X3(charSequence, cArr, i7, z6, i8);
    }

    public static /* synthetic */ f5.m Z4(CharSequence charSequence, char[] cArr, boolean z6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return W4(charSequence, cArr, z6, i7);
    }

    public static final boolean a3(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "suffix");
        return (!z6 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? b0.K1((String) charSequence, (String) charSequence2, false, 2, null) : b4(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z6);
    }

    public static /* synthetic */ f5.m a4(CharSequence charSequence, String[] strArr, int i7, boolean z6, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return Y3(charSequence, strArr, i7, z6, i8);
    }

    public static /* synthetic */ f5.m a5(CharSequence charSequence, String[] strArr, boolean z6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return X4(charSequence, strArr, z6, i7);
    }

    public static /* synthetic */ boolean b3(CharSequence charSequence, char c7, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return Z2(charSequence, c7, z6);
    }

    public static final boolean b4(@n6.d CharSequence charSequence, int i7, @n6.d CharSequence charSequence2, int i8, int i9, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > charSequence2.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!i5.e.J(charSequence.charAt(i7 + i10), charSequence2.charAt(i8 + i10), z6)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b5(@n6.d CharSequence charSequence, char c7, boolean z6) {
        l0.p(charSequence, "<this>");
        return charSequence.length() > 0 && i5.e.J(charSequence.charAt(0), c7, z6);
    }

    public static /* synthetic */ boolean c3(CharSequence charSequence, CharSequence charSequence2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return a3(charSequence, charSequence2, z6);
    }

    @n6.d
    public static final CharSequence c4(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "prefix");
        return g5(charSequence, charSequence2, false, 2, null) ? charSequence.subSequence(charSequence2.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final boolean c5(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, int i7, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "prefix");
        return (!z6 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? b0.u2((String) charSequence, (String) charSequence2, i7, false, 4, null) : b4(charSequence, i7, charSequence2, 0, charSequence2.length(), z6);
    }

    @n6.e
    public static final u0<Integer, String> d3(@n6.d CharSequence charSequence, @n6.d Collection<String> collection, int i7, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(collection, "strings");
        return e3(charSequence, collection, i7, z6, false);
    }

    @n6.d
    public static final String d4(@n6.d String str, @n6.d CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(charSequence, "prefix");
        if (g5(str, charSequence, false, 2, null)) {
            String substring = str.substring(charSequence.length());
            l0.o(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static final boolean d5(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "prefix");
        return (!z6 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? b0.v2((String) charSequence, (String) charSequence2, false, 2, null) : b4(charSequence, 0, charSequence2, 0, charSequence2.length(), z6);
    }

    public static final u0<Integer, String> e3(CharSequence charSequence, Collection<String> collection, int i7, boolean z6, boolean z7) {
        Object obj;
        Object obj2;
        if (!z6 && collection.size() == 1) {
            String str = (String) x3.e0.a5(collection);
            int s32 = !z7 ? s3(charSequence, str, i7, false, 4, null) : G3(charSequence, str, i7, false, 4, null);
            if (s32 < 0) {
                return null;
            }
            return q1.a(Integer.valueOf(s32), str);
        }
        d5.j lVar = !z7 ? new d5.l(d5.u.u(i7, 0), charSequence.length()) : d5.u.k0(d5.u.B(i7, j3(charSequence)), 0);
        if (charSequence instanceof String) {
            int i8 = lVar.i();
            int j7 = lVar.j();
            int k7 = lVar.k();
            if ((k7 > 0 && i8 <= j7) || (k7 < 0 && j7 <= i8)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (b0.e2(str2, 0, (String) charSequence, i8, str2.length(), z6)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (i8 == j7) {
                            break;
                        }
                        i8 += k7;
                    } else {
                        return q1.a(Integer.valueOf(i8), str3);
                    }
                }
            }
        } else {
            int i9 = lVar.i();
            int j8 = lVar.j();
            int k8 = lVar.k();
            if ((k8 > 0 && i9 <= j8) || (k8 < 0 && j8 <= i9)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (b4(str4, 0, charSequence, i9, str4.length(), z6)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (i9 == j8) {
                            break;
                        }
                        i9 += k8;
                    } else {
                        return q1.a(Integer.valueOf(i9), str5);
                    }
                }
            }
        }
        return null;
    }

    @n6.d
    public static final CharSequence e4(@n6.d CharSequence charSequence, int i7, int i8) {
        l0.p(charSequence, "<this>");
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("End index (" + i8 + ") is less than start index (" + i7 + ").");
        } else if (i8 == i7) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(charSequence.length() - (i8 - i7));
            sb.append(charSequence, 0, i7);
            l0.o(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence, i8, charSequence.length());
            l0.o(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
    }

    public static /* synthetic */ boolean e5(CharSequence charSequence, char c7, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return b5(charSequence, c7, z6);
    }

    public static /* synthetic */ u0 f3(CharSequence charSequence, Collection collection, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return d3(charSequence, collection, i7, z6);
    }

    @n6.d
    public static final CharSequence f4(@n6.d CharSequence charSequence, @n6.d d5.l lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "range");
        return e4(charSequence, lVar.b().intValue(), lVar.g().intValue() + 1);
    }

    public static /* synthetic */ boolean f5(CharSequence charSequence, CharSequence charSequence2, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return c5(charSequence, charSequence2, i7, z6);
    }

    @n6.e
    public static final u0<Integer, String> g3(@n6.d CharSequence charSequence, @n6.d Collection<String> collection, int i7, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(collection, "strings");
        return e3(charSequence, collection, i7, z6, true);
    }

    @k4.f
    public static final String g4(String str, int i7, int i8) {
        l0.p(str, "<this>");
        return e4(str, i7, i8).toString();
    }

    public static /* synthetic */ boolean g5(CharSequence charSequence, CharSequence charSequence2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return d5(charSequence, charSequence2, z6);
    }

    public static /* synthetic */ u0 h3(CharSequence charSequence, Collection collection, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = j3(charSequence);
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return g3(charSequence, collection, i7, z6);
    }

    @k4.f
    public static final String h4(String str, d5.l lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "range");
        return f4(str, lVar).toString();
    }

    @n6.d
    public static final CharSequence h5(@n6.d CharSequence charSequence, @n6.d d5.l lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "range");
        return charSequence.subSequence(lVar.b().intValue(), lVar.g().intValue() + 1);
    }

    @n6.d
    public static final d5.l i3(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return new d5.l(0, charSequence.length() - 1);
    }

    @n6.d
    public static final CharSequence i4(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "suffix");
        return c3(charSequence, charSequence2, false, 2, null) ? charSequence.subSequence(0, charSequence.length() - charSequence2.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @v3.k(message = "Use parameters named startIndex and endIndex.", replaceWith = @b1(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @k4.f
    public static final CharSequence i5(String str, int i7, int i8) {
        l0.p(str, "<this>");
        return str.subSequence(i7, i8);
    }

    public static final int j3(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @n6.d
    public static final String j4(@n6.d String str, @n6.d CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(charSequence, "suffix");
        if (c3(str, charSequence, false, 2, null)) {
            String substring = str.substring(0, str.length() - charSequence.length());
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    @k4.f
    public static final String j5(CharSequence charSequence, int i7, int i8) {
        l0.p(charSequence, "<this>");
        return charSequence.subSequence(i7, i8).toString();
    }

    public static final boolean k3(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "<this>");
        return new d5.l(0, charSequence.length() + (-2)).n(i7) && Character.isHighSurrogate(charSequence.charAt(i7)) && Character.isLowSurrogate(charSequence.charAt(i7 + 1));
    }

    @n6.d
    public static final CharSequence k4(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "delimiter");
        return l4(charSequence, charSequence2, charSequence2);
    }

    @n6.d
    public static final String k5(@n6.d CharSequence charSequence, @n6.d d5.l lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "range");
        return charSequence.subSequence(lVar.b().intValue(), lVar.g().intValue() + 1).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @k4.f
    public static final <C extends CharSequence & R, R> R l3(C c7, t4.a<? extends R> aVar) {
        l0.p(aVar, "defaultValue");
        return b0.V1(c7) ? aVar.n() : c7;
    }

    @n6.d
    public static final CharSequence l4(@n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "suffix");
        return (charSequence.length() >= charSequence2.length() + charSequence3.length() && g5(charSequence, charSequence2, false, 2, null) && c3(charSequence, charSequence3, false, 2, null)) ? charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @n6.d
    public static final String l5(@n6.d String str, @n6.d d5.l lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "range");
        String substring = str.substring(lVar.b().intValue(), lVar.g().intValue() + 1);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @k4.f
    public static final <C extends CharSequence & R, R> R m3(C c7, t4.a<? extends R> aVar) {
        l0.p(aVar, "defaultValue");
        return c7.length() == 0 ? aVar.n() : c7;
    }

    @n6.d
    public static final String m4(@n6.d String str, @n6.d CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(charSequence, "delimiter");
        return n4(str, charSequence, charSequence);
    }

    public static /* synthetic */ String m5(CharSequence charSequence, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = charSequence.length();
        }
        l0.p(charSequence, "<this>");
        return charSequence.subSequence(i7, i8).toString();
    }

    public static final int n3(@n6.d CharSequence charSequence, char c7, int i7, boolean z6) {
        l0.p(charSequence, "<this>");
        return (z6 || !(charSequence instanceof String)) ? u3(charSequence, new char[]{c7}, i7, z6) : ((String) charSequence).indexOf(c7, i7);
    }

    @n6.d
    public static final String n4(@n6.d String str, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2) {
        l0.p(str, "<this>");
        l0.p(charSequence, "prefix");
        l0.p(charSequence2, "suffix");
        if (str.length() >= charSequence.length() + charSequence2.length() && g5(str, charSequence, false, 2, null) && c3(str, charSequence2, false, 2, null)) {
            String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    @n6.d
    public static final String n5(@n6.d String str, char c7, @n6.d String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "missingDelimiterValue");
        int r32 = r3(str, c7, 0, false, 6, null);
        if (r32 == -1) {
            return str2;
        }
        String substring = str.substring(r32 + 1, str.length());
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int o3(@n6.d CharSequence charSequence, @n6.d String str, int i7, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(str, v.b.f17140e);
        return (z6 || !(charSequence instanceof String)) ? q3(charSequence, str, i7, charSequence.length(), z6, false, 16, null) : ((String) charSequence).indexOf(str, i7);
    }

    @k4.f
    public static final String o4(CharSequence charSequence, o oVar, String str) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        l0.p(str, "replacement");
        return oVar.m(charSequence, str);
    }

    @n6.d
    public static final String o5(@n6.d String str, @n6.d String str2, @n6.d String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "missingDelimiterValue");
        int s32 = s3(str, str2, 0, false, 6, null);
        if (s32 == -1) {
            return str3;
        }
        String substring = str.substring(s32 + str2.length(), str.length());
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int p3(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z6, boolean z7) {
        d5.j lVar = !z7 ? new d5.l(d5.u.u(i7, 0), d5.u.B(i8, charSequence.length())) : d5.u.k0(d5.u.B(i7, j3(charSequence)), d5.u.u(i8, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i9 = lVar.i();
            int j7 = lVar.j();
            int k7 = lVar.k();
            if ((k7 <= 0 || i9 > j7) && (k7 >= 0 || j7 > i9)) {
                return -1;
            }
            while (!b0.e2((String) charSequence2, 0, (String) charSequence, i9, charSequence2.length(), z6)) {
                if (i9 == j7) {
                    return -1;
                }
                i9 += k7;
            }
            return i9;
        }
        int i10 = lVar.i();
        int j8 = lVar.j();
        int k8 = lVar.k();
        if ((k8 <= 0 || i10 > j8) && (k8 >= 0 || j8 > i10)) {
            return -1;
        }
        while (!b4(charSequence2, 0, charSequence, i10, charSequence2.length(), z6)) {
            if (i10 == j8) {
                return -1;
            }
            i10 += k8;
        }
        return i10;
    }

    @k4.f
    public static final String p4(CharSequence charSequence, o oVar, t4.l<? super m, ? extends CharSequence> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        l0.p(lVar, "transform");
        return oVar.n(charSequence, lVar);
    }

    public static /* synthetic */ String p5(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return n5(str, c7, str2);
    }

    public static /* synthetic */ int q3(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z6, boolean z7, int i9, Object obj) {
        if ((i9 & 16) != 0) {
            z7 = false;
        }
        return p3(charSequence, charSequence2, i7, i8, z6, z7);
    }

    @n6.d
    public static final String q4(@n6.d String str, char c7, @n6.d String str2, @n6.d String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "replacement");
        l0.p(str3, "missingDelimiterValue");
        int r32 = r3(str, c7, 0, false, 6, null);
        return r32 == -1 ? str3 : J4(str, r32 + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ String q5(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return o5(str, str2, str3);
    }

    public static /* synthetic */ int r3(CharSequence charSequence, char c7, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return n3(charSequence, c7, i7, z6);
    }

    @n6.d
    public static final String r4(@n6.d String str, @n6.d String str2, @n6.d String str3, @n6.d String str4) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "replacement");
        l0.p(str4, "missingDelimiterValue");
        int s32 = s3(str, str2, 0, false, 6, null);
        return s32 == -1 ? str4 : J4(str, s32 + str2.length(), str.length(), str3).toString();
    }

    @n6.d
    public static final String r5(@n6.d String str, char c7, @n6.d String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "missingDelimiterValue");
        int F3 = F3(str, c7, 0, false, 6, null);
        if (F3 == -1) {
            return str2;
        }
        String substring = str.substring(F3 + 1, str.length());
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ int s3(CharSequence charSequence, String str, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return o3(charSequence, str, i7, z6);
    }

    public static /* synthetic */ String s4(String str, char c7, String str2, String str3, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str3 = str;
        }
        return q4(str, c7, str2, str3);
    }

    @n6.d
    public static final String s5(@n6.d String str, @n6.d String str2, @n6.d String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "missingDelimiterValue");
        int G3 = G3(str, str2, 0, false, 6, null);
        if (G3 == -1) {
            return str3;
        }
        String substring = str.substring(G3 + str2.length(), str.length());
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int t3(@n6.d CharSequence charSequence, @n6.d Collection<String> collection, int i7, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(collection, "strings");
        u0<Integer, String> e32 = e3(charSequence, collection, i7, z6, false);
        if (e32 != null) {
            return e32.e().intValue();
        }
        return -1;
    }

    public static /* synthetic */ String t4(String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str4 = str;
        }
        return r4(str, str2, str3, str4);
    }

    public static /* synthetic */ String t5(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return r5(str, c7, str2);
    }

    public static final int u3(@n6.d CharSequence charSequence, @n6.d char[] cArr, int i7, boolean z6) {
        boolean z7;
        l0.p(charSequence, "<this>");
        l0.p(cArr, "chars");
        if (!z6 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(x3.p.xt(cArr), i7);
        }
        s0 it = new d5.l(d5.u.u(i7, 0), j3(charSequence)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            char charAt = charSequence.charAt(b7);
            int length = cArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    z7 = false;
                    break;
                } else if (i5.e.J(cArr[i8], charAt, z6)) {
                    z7 = true;
                    break;
                } else {
                    i8++;
                }
            }
            if (z7) {
                return b7;
            }
        }
        return -1;
    }

    @n6.d
    public static final String u4(@n6.d String str, char c7, @n6.d String str2, @n6.d String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "replacement");
        l0.p(str3, "missingDelimiterValue");
        int F3 = F3(str, c7, 0, false, 6, null);
        return F3 == -1 ? str3 : J4(str, F3 + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ String u5(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return s5(str, str2, str3);
    }

    public static /* synthetic */ int v3(CharSequence charSequence, Collection collection, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return t3(charSequence, collection, i7, z6);
    }

    @n6.d
    public static final String v4(@n6.d String str, @n6.d String str2, @n6.d String str3, @n6.d String str4) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "replacement");
        l0.p(str4, "missingDelimiterValue");
        int G3 = G3(str, str2, 0, false, 6, null);
        return G3 == -1 ? str4 : J4(str, G3 + str2.length(), str.length(), str3).toString();
    }

    @n6.d
    public static final String v5(@n6.d String str, char c7, @n6.d String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "missingDelimiterValue");
        int r32 = r3(str, c7, 0, false, 6, null);
        if (r32 == -1) {
            return str2;
        }
        String substring = str.substring(0, r32);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ int w3(CharSequence charSequence, char[] cArr, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return u3(charSequence, cArr, i7, z6);
    }

    public static /* synthetic */ String w4(String str, char c7, String str2, String str3, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str3 = str;
        }
        return u4(str, c7, str2, str3);
    }

    @n6.d
    public static final String w5(@n6.d String str, @n6.d String str2, @n6.d String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "missingDelimiterValue");
        int s32 = s3(str, str2, 0, false, 6, null);
        if (s32 == -1) {
            return str3;
        }
        String substring = str.substring(0, s32);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @k4.f
    public static final boolean x3(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    public static /* synthetic */ String x4(String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str4 = str;
        }
        return v4(str, str2, str3, str4);
    }

    public static /* synthetic */ String x5(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return v5(str, c7, str2);
    }

    @k4.f
    public static final boolean y3(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return !b0.V1(charSequence);
    }

    @n6.d
    public static final String y4(@n6.d String str, char c7, @n6.d String str2, @n6.d String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "replacement");
        l0.p(str3, "missingDelimiterValue");
        int r32 = r3(str, c7, 0, false, 6, null);
        return r32 == -1 ? str3 : J4(str, 0, r32, str2).toString();
    }

    public static /* synthetic */ String y5(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return w5(str, str2, str3);
    }

    @k4.f
    public static final boolean z3(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    @n6.d
    public static final String z4(@n6.d String str, @n6.d String str2, @n6.d String str3, @n6.d String str4) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "replacement");
        l0.p(str4, "missingDelimiterValue");
        int s32 = s3(str, str2, 0, false, 6, null);
        return s32 == -1 ? str4 : J4(str, 0, s32, str3).toString();
    }

    @n6.d
    public static final String z5(@n6.d String str, char c7, @n6.d String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "missingDelimiterValue");
        int F3 = F3(str, c7, 0, false, 6, null);
        if (F3 == -1) {
            return str2;
        }
        String substring = str.substring(0, F3);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
