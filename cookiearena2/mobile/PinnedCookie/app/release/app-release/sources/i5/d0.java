package i5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import u4.l0;
import u4.r1;
import v3.b1;
import v3.g1;
import v3.t0;
import x3.s0;
@r1({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1239#2,14:109\n1521#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
/* loaded from: classes.dex */
public class d0 extends c0 {
    @k4.f
    public static final char X5(CharSequence charSequence, int i7) {
        l0.p(charSequence, "<this>");
        return charSequence.charAt(i7);
    }

    @v3.k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character Y5(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return e0.Q7(charSequence);
    }

    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character Z5(CharSequence charSequence, t4.l<? super Character, ? extends R> lVar) {
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

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character a6(CharSequence charSequence, Comparator comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        return e0.S7(charSequence, comparator);
    }

    @v3.k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character b6(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return e0.e8(charSequence);
    }

    @v3.k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character c6(CharSequence charSequence, t4.l<? super Character, ? extends R> lVar) {
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

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character d6(CharSequence charSequence, Comparator comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        return e0.g8(charSequence, comparator);
    }

    @s4.h(name = "sumOfBigDecimal")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final BigDecimal e6(CharSequence charSequence, t4.l<? super Character, ? extends BigDecimal> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            valueOf = valueOf.add(lVar.O(Character.valueOf(charSequence.charAt(i7))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @s4.h(name = "sumOfBigInteger")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final BigInteger f6(CharSequence charSequence, t4.l<? super Character, ? extends BigInteger> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            valueOf = valueOf.add(lVar.O(Character.valueOf(charSequence.charAt(i7))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @n6.d
    public static final SortedSet<Character> g6(@n6.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return (SortedSet) e0.f9(charSequence, new TreeSet());
    }
}
