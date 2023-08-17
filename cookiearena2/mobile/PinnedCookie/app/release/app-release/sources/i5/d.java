package i5;

import java.util.Locale;
import u4.l0;
import v3.a1;
import v3.b1;
import v3.g1;
import v3.q2;
/* loaded from: classes.dex */
public class d {
    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final String A(char c7) {
        String valueOf = String.valueOf(c7);
        l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final String B(char c7, @n6.d Locale locale) {
        l0.p(locale, "locale");
        String valueOf = String.valueOf(c7);
        l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final char C(char c7) {
        return Character.toUpperCase(c7);
    }

    @a1
    public static final int a(int i7) {
        if (new d5.l(2, 36).n(i7)) {
            return i7;
        }
        throw new IllegalArgumentException("radix " + i7 + " was not in valid range " + new d5.l(2, 36));
    }

    public static final int b(char c7, int i7) {
        return Character.digit((int) c7, i7);
    }

    @n6.d
    public static final a c(char c7) {
        return a.f11018m.a(Character.getType(c7));
    }

    @n6.d
    public static final b d(char c7) {
        return b.f11034l.b(Character.getDirectionality(c7));
    }

    @k4.f
    public static final boolean e(char c7) {
        return Character.isDefined(c7);
    }

    @k4.f
    public static final boolean f(char c7) {
        return Character.isDigit(c7);
    }

    @k4.f
    public static final boolean g(char c7) {
        return Character.isHighSurrogate(c7);
    }

    @k4.f
    public static final boolean h(char c7) {
        return Character.isISOControl(c7);
    }

    @k4.f
    public static final boolean i(char c7) {
        return Character.isIdentifierIgnorable(c7);
    }

    @k4.f
    public static final boolean j(char c7) {
        return Character.isJavaIdentifierPart(c7);
    }

    @k4.f
    public static final boolean k(char c7) {
        return Character.isJavaIdentifierStart(c7);
    }

    @k4.f
    public static final boolean l(char c7) {
        return Character.isLetter(c7);
    }

    @k4.f
    public static final boolean m(char c7) {
        return Character.isLetterOrDigit(c7);
    }

    @k4.f
    public static final boolean n(char c7) {
        return Character.isLowSurrogate(c7);
    }

    @k4.f
    public static final boolean o(char c7) {
        return Character.isLowerCase(c7);
    }

    @k4.f
    public static final boolean p(char c7) {
        return Character.isTitleCase(c7);
    }

    @k4.f
    public static final boolean q(char c7) {
        return Character.isUpperCase(c7);
    }

    public static final boolean r(char c7) {
        return Character.isWhitespace(c7) || Character.isSpaceChar(c7);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final String s(char c7) {
        String valueOf = String.valueOf(c7);
        l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final String t(char c7, @n6.d Locale locale) {
        l0.p(locale, "locale");
        String valueOf = String.valueOf(c7);
        l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final char u(char c7) {
        return Character.toLowerCase(c7);
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final String v(char c7, @n6.d Locale locale) {
        l0.p(locale, "locale");
        String B = B(c7, locale);
        if (B.length() <= 1) {
            String valueOf = String.valueOf(c7);
            l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !l0.g(B, upperCase) ? B : String.valueOf(Character.toTitleCase(c7));
        } else if (c7 == 329) {
            return B;
        } else {
            char charAt = B.charAt(0);
            l0.n(B, "null cannot be cast to non-null type java.lang.String");
            String substring = B.substring(1);
            l0.o(substring, "this as java.lang.String).substring(startIndex)");
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final char w(char c7) {
        return Character.toTitleCase(c7);
    }

    @v3.k(message = "Use lowercaseChar() instead.", replaceWith = @b1(expression = "lowercaseChar()", imports = {}))
    @v3.l(warningSince = "1.5")
    @k4.f
    public static final char x(char c7) {
        return Character.toLowerCase(c7);
    }

    @v3.k(message = "Use titlecaseChar() instead.", replaceWith = @b1(expression = "titlecaseChar()", imports = {}))
    @v3.l(warningSince = "1.5")
    @k4.f
    public static final char y(char c7) {
        return Character.toTitleCase(c7);
    }

    @v3.k(message = "Use uppercaseChar() instead.", replaceWith = @b1(expression = "uppercaseChar()", imports = {}))
    @v3.l(warningSince = "1.5")
    @k4.f
    public static final char z(char c7) {
        return Character.toUpperCase(c7);
    }
}
