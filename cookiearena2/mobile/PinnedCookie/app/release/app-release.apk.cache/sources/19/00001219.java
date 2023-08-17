package i5;

import java.util.Locale;
import u4.l0;

/* loaded from: classes.dex */
public final class j0 {
    @n6.d
    public static final String a(char c7) {
        String valueOf = String.valueOf(c7);
        l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() > 1) {
            if (c7 == 329) {
                return upperCase;
            }
            char charAt = upperCase.charAt(0);
            l0.n(upperCase, "null cannot be cast to non-null type java.lang.String");
            String substring = upperCase.substring(1);
            l0.o(substring, "this as java.lang.String).substring(startIndex)");
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(locale);
            l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
        return String.valueOf(Character.toTitleCase(c7));
    }
}