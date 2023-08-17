package i5;

import u4.l0;
import u4.r1;
import v3.g1;
import v3.q2;
@r1({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
/* loaded from: classes.dex */
public class e extends d {
    @g1(version = "1.5")
    @q2(markerClass = {v3.r.class})
    public static final char D(int i7) {
        if (new d5.l(0, 9).n(i7)) {
            return (char) (i7 + 48);
        }
        throw new IllegalArgumentException("Int " + i7 + " is not a decimal digit");
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.r.class})
    public static final char E(int i7, int i8) {
        if (!new d5.l(2, 36).n(i8)) {
            throw new IllegalArgumentException("Invalid radix: " + i8 + ". Valid radix values are in range 2..36");
        } else if (i7 >= 0 && i7 < i8) {
            return (char) (i7 < 10 ? i7 + 48 : ((char) (i7 + 65)) - '\n');
        } else {
            throw new IllegalArgumentException("Digit " + i7 + " does not represent a valid digit in radix " + i8);
        }
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.r.class})
    public static final int F(char c7) {
        int b7 = d.b(c7, 10);
        if (b7 >= 0) {
            return b7;
        }
        throw new IllegalArgumentException("Char " + c7 + " is not a decimal digit");
    }

    @g1(version = "1.5")
    @q2(markerClass = {v3.r.class})
    public static final int G(char c7, int i7) {
        Integer I = I(c7, i7);
        if (I != null) {
            return I.intValue();
        }
        throw new IllegalArgumentException("Char " + c7 + " is not a digit in the given radix=" + i7);
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Integer H(char c7) {
        Integer valueOf = Integer.valueOf(d.b(c7, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Integer I(char c7, int i7) {
        d.a(i7);
        Integer valueOf = Integer.valueOf(d.b(c7, i7));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean J(char c7, char c8, boolean z6) {
        if (c7 == c8) {
            return true;
        }
        if (z6) {
            char upperCase = Character.toUpperCase(c7);
            char upperCase2 = Character.toUpperCase(c8);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    public static /* synthetic */ boolean K(char c7, char c8, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return J(c7, c8, z6);
    }

    public static final boolean L(char c7) {
        return new d5.c((char) 55296, (char) 57343).n(c7);
    }

    @k4.f
    public static final String M(char c7, String str) {
        l0.p(str, "other");
        return c7 + str;
    }

    @g1(version = "1.5")
    @n6.d
    public static final String N(char c7) {
        return j0.a(c7);
    }
}
