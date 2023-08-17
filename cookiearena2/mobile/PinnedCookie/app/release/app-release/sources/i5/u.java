package i5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u4.l0;
import u4.n0;
import u4.r1;
@r1({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,123:1\n113#1,2:125\n115#1,4:140\n120#1,2:153\n113#1,2:162\n115#1,4:177\n120#1,2:184\n1#2:124\n1#2:150\n1#2:181\n1#2:205\n1569#3,11:127\n1864#3,2:138\n1866#3:151\n1580#3:152\n766#3:155\n857#3,2:156\n1549#3:158\n1620#3,3:159\n1569#3,11:164\n1864#3,2:175\n1866#3:182\n1580#3:183\n1569#3,11:192\n1864#3,2:203\n1866#3:206\n1580#3:207\n151#4,6:144\n151#4,6:186\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n38#1:125,2\n38#1:140,4\n38#1:153,2\n78#1:162,2\n78#1:177,4\n78#1:184,2\n38#1:150\n78#1:181\n114#1:205\n38#1:127,11\n38#1:138,2\n38#1:151\n38#1:152\n74#1:155\n74#1:156,2\n75#1:158\n75#1:159,3\n78#1:164,11\n78#1:175,2\n78#1:182\n78#1:183\n114#1:192,11\n114#1:203,2\n114#1:206\n114#1:207\n39#1:144,6\n101#1:186,6\n*E\n"})
/* loaded from: classes.dex */
public class u extends t {

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.l<String, String> {

        /* renamed from: l */
        public static final a f11160l = new a();

        public a() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b */
        public final String O(@n6.d String str) {
            l0.p(str, "line");
            return str;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.l<String, String> {

        /* renamed from: l */
        public final /* synthetic */ String f11161l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f11161l = str;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b */
        public final String O(@n6.d String str) {
            l0.p(str, "line");
            return this.f11161l + str;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.l<String, String> {

        /* renamed from: l */
        public final /* synthetic */ String f11162l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f11162l = str;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b */
        public final String O(@n6.d String str) {
            l0.p(str, "it");
            if (b0.V1(str)) {
                return str.length() < this.f11162l.length() ? this.f11162l : str;
            }
            return this.f11162l + str;
        }
    }

    public static final t4.l<String, String> g(String str) {
        return str.length() == 0 ? a.f11160l : new b(str);
    }

    public static final int h(String str) {
        int length = str.length();
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            } else if ((!d.r(str.charAt(i7))) == true) {
                break;
            } else {
                i7++;
            }
        }
        return i7 == -1 ? str.length() : i7;
    }

    @n6.d
    public static final String i(@n6.d String str, @n6.d String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "indent");
        return f5.u.e1(f5.u.k1(c0.L3(str), new c(str2)), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String j(String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    public static final String k(List<String> list, int i7, t4.l<? super String, String> lVar, t4.l<? super String, String> lVar2) {
        Appendable e32;
        String O;
        int G = x3.w.G(list);
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                x3.w.W();
            }
            String str = (String) obj;
            if ((i8 == 0 || i8 == G) && b0.V1(str)) {
                str = null;
            } else {
                String O2 = lVar2.O(str);
                if (O2 != null && (O = lVar.O(O2)) != null) {
                    str = O;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i8 = i9;
        }
        e32 = x3.e0.e3(arrayList, new StringBuilder(i7), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) e32).toString();
        l0.o(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    @n6.d
    public static final String l(@n6.d String str, @n6.d String str2) {
        Appendable e32;
        String O;
        l0.p(str, "<this>");
        l0.p(str2, "newIndent");
        List<String> M3 = c0.M3(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : M3) {
            if ((!b0.V1((String) obj)) != false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x3.x.Y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(h((String) it.next())));
        }
        Integer num = (Integer) x3.e0.c4(arrayList2);
        int i7 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * M3.size());
        t4.l<String, String> g7 = g(str2);
        int G = x3.w.G(M3);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : M3) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            String str3 = (String) obj2;
            if ((i7 == 0 || i7 == G) && b0.V1(str3)) {
                str3 = null;
            } else {
                String B6 = e0.B6(str3, intValue);
                if (B6 != null && (O = g7.O(B6)) != null) {
                    str3 = O;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i7 = i8;
        }
        e32 = x3.e0.e3(arrayList3, new StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) e32).toString();
        l0.o(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static /* synthetic */ String m(String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str2 = "";
        }
        return l(str, str2);
    }

    @n6.d
    public static final String n(@n6.d String str, @n6.d String str2, @n6.d String str3) {
        Appendable e32;
        int i7;
        String O;
        l0.p(str, "<this>");
        l0.p(str2, "newIndent");
        l0.p(str3, "marginPrefix");
        if ((!b0.V1(str3)) == true) {
            List<String> M3 = c0.M3(str);
            int length = str.length() + (str2.length() * M3.size());
            t4.l<String, String> g7 = g(str2);
            int G = x3.w.G(M3);
            ArrayList arrayList = new ArrayList();
            int i8 = 0;
            for (Object obj : M3) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    x3.w.W();
                }
                String str4 = (String) obj;
                String str5 = null;
                if ((i8 == 0 || i8 == G) && b0.V1(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            i7 = -1;
                            break;
                        } else if ((!d.r(str4.charAt(i10))) == true) {
                            i7 = i10;
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i7 != -1) {
                        int i11 = i7;
                        if (b0.u2(str4, str3, i7, false, 4, null)) {
                            int length3 = i11 + str3.length();
                            l0.n(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(length3);
                            l0.o(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (str5 != null && (O = g7.O(str5)) != null) {
                        str4 = O;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i8 = i9;
            }
            e32 = x3.e0.e3(arrayList, new StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
            String sb = ((StringBuilder) e32).toString();
            l0.o(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static /* synthetic */ String o(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str2 = "";
        }
        if ((i7 & 2) != 0) {
            str3 = "|";
        }
        return n(str, str2, str3);
    }

    @n6.d
    @k4.g
    public static final String p(@n6.d String str) {
        l0.p(str, "<this>");
        return l(str, "");
    }

    @n6.d
    @k4.g
    public static final String q(@n6.d String str, @n6.d String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "marginPrefix");
        return n(str, "", str2);
    }

    public static /* synthetic */ String r(String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str2 = "|";
        }
        return q(str, str2);
    }
}
