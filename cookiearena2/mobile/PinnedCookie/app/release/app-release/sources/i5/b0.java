package i5;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import u4.l0;
import u4.r1;
import u4.t1;
import v3.b1;
import v3.g1;
import v3.q2;
import x3.s0;
@r1({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,825:1\n1174#2,2:826\n1#3:828\n1726#4,3:829\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:826,2\n621#1:829,3\n*E\n"})
/* loaded from: classes.dex */
public class b0 extends a0 {
    @k4.f
    public static final boolean A1(String str, StringBuffer stringBuffer) {
        l0.p(str, "<this>");
        l0.p(stringBuffer, "stringBuilder");
        return str.contentEquals(stringBuffer);
    }

    @k4.f
    public static final char[] A2(String str) {
        l0.p(str, "<this>");
        char[] charArray = str.toCharArray();
        l0.o(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }

    @n6.d
    @v3.k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @v3.l(warningSince = "1.5")
    public static final String B1(@n6.d String str) {
        l0.p(str, "<this>");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        l0.n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase();
        l0.o(lowerCase, "this as java.lang.String).toLowerCase()");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        l0.o(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final char[] B2(@n6.d String str, int i7, int i8) {
        l0.p(str, "<this>");
        x3.c.f18278k.a(i7, i8, str.length());
        char[] cArr = new char[i8 - i7];
        str.getChars(i7, i8, cArr, 0);
        return cArr;
    }

    @g1(version = "1.4")
    @k4.h
    @v3.k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @v3.l(warningSince = "1.5")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final String C1(@n6.d String str, @n6.d Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        l0.n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        l0.o(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    @k4.f
    public static final char[] C2(String str, char[] cArr, int i7, int i8, int i9) {
        l0.p(str, "<this>");
        l0.p(cArr, "destination");
        str.getChars(i8, i9, cArr, i7);
        return cArr;
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final String D1(@n6.d byte[] bArr) {
        l0.p(bArr, "<this>");
        return new String(bArr, f.f11071b);
    }

    public static /* synthetic */ char[] D2(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return B2(str, i7, i8);
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final String E1(@n6.d byte[] bArr, int i7, int i8, boolean z6) {
        l0.p(bArr, "<this>");
        x3.c.f18278k.a(i7, i8, bArr.length);
        if (z6) {
            String charBuffer = f.f11071b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i7, i8 - i7)).toString();
            l0.o(charBuffer, "decoder.decode(ByteBuffe…- startIndex)).toString()");
            return charBuffer;
        }
        return new String(bArr, i7, i8 - i7, f.f11071b);
    }

    public static /* synthetic */ char[] E2(String str, char[] cArr, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = str.length();
        }
        l0.p(str, "<this>");
        l0.p(cArr, "destination");
        str.getChars(i8, i9, cArr, i7);
        return cArr;
    }

    public static /* synthetic */ String F1(byte[] bArr, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = bArr.length;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return E1(bArr, i7, i8, z6);
    }

    @v3.k(message = "Use lowercase() instead.", replaceWith = @b1(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @v3.l(warningSince = "1.5")
    @k4.f
    public static final String F2(String str) {
        l0.p(str, "<this>");
        String lowerCase = str.toLowerCase();
        l0.o(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final byte[] G1(@n6.d String str) {
        l0.p(str, "<this>");
        byte[] bytes = str.getBytes(f.f11071b);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @v3.k(message = "Use lowercase() instead.", replaceWith = @b1(expression = "lowercase(locale)", imports = {}))
    @v3.l(warningSince = "1.5")
    @k4.f
    public static final String G2(String str, Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final byte[] H1(@n6.d String str, int i7, int i8, boolean z6) {
        l0.p(str, "<this>");
        x3.c.f18278k.a(i7, i8, str.length());
        if (!z6) {
            String substring = str.substring(i7, i8);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = f.f11071b;
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            l0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        ByteBuffer encode = f.f11071b.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i7, i8));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            l0.m(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                l0.o(array2, "{\n        byteBuffer.array()\n    }");
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    @k4.f
    public static final Pattern H2(String str, int i7) {
        l0.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i7);
        l0.o(compile, "compile(this, flags)");
        return compile;
    }

    public static /* synthetic */ byte[] I1(String str, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return H1(str, i7, i8, z6);
    }

    public static /* synthetic */ Pattern I2(String str, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        l0.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i7);
        l0.o(compile, "compile(this, flags)");
        return compile;
    }

    public static final boolean J1(@n6.d String str, @n6.d String str2, boolean z6) {
        l0.p(str, "<this>");
        l0.p(str2, "suffix");
        return !z6 ? str.endsWith(str2) : e2(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    @v3.k(message = "Use uppercase() instead.", replaceWith = @b1(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @v3.l(warningSince = "1.5")
    @k4.f
    public static final String J2(String str) {
        l0.p(str, "<this>");
        String upperCase = str.toUpperCase();
        l0.o(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    public static /* synthetic */ boolean K1(String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return J1(str, str2, z6);
    }

    @v3.k(message = "Use uppercase() instead.", replaceWith = @b1(expression = "uppercase(locale)", imports = {}))
    @v3.l(warningSince = "1.5")
    @k4.f
    public static final String K2(String str, Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    public static final boolean L1(@n6.e String str, @n6.e String str2, boolean z6) {
        return str == null ? str2 == null : !z6 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final String L2(String str) {
        l0.p(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static /* synthetic */ boolean M1(String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return L1(str, str2, z6);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final String M2(String str, Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ String N1(String str, Locale locale, Object... objArr) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        l0.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(locale, this, *args)");
        return format;
    }

    @k4.f
    public static final String O1(String str, Object... objArr) {
        l0.p(str, "<this>");
        l0.p(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(this, *args)");
        return format;
    }

    @k4.f
    public static final String P1(t1 t1Var, String str, Object... objArr) {
        l0.p(t1Var, "<this>");
        l0.p(str, "format");
        l0.p(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(format, *args)");
        return format;
    }

    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ String Q1(t1 t1Var, Locale locale, String str, Object... objArr) {
        l0.p(t1Var, "<this>");
        l0.p(locale, "locale");
        l0.p(str, "format");
        l0.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(locale, format, *args)");
        return format;
    }

    @s4.h(name = "formatNullable")
    @g1(version = "1.4")
    @k4.f
    public static final String R1(String str, Locale locale, Object... objArr) {
        l0.p(str, "<this>");
        l0.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(locale, this, *args)");
        return format;
    }

    @s4.h(name = "formatNullable")
    @g1(version = "1.4")
    @k4.f
    public static final String S1(t1 t1Var, Locale locale, String str, Object... objArr) {
        l0.p(t1Var, "<this>");
        l0.p(str, "format");
        l0.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(locale, format, *args)");
        return format;
    }

    @n6.d
    public static final Comparator<String> T1(@n6.d t1 t1Var) {
        l0.p(t1Var, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        l0.o(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    @k4.f
    public static final String U1(String str) {
        l0.p(str, "<this>");
        String intern = str.intern();
        l0.o(intern, "this as java.lang.String).intern()");
        return intern;
    }

    public static final boolean V1(@n6.d CharSequence charSequence) {
        boolean z6;
        l0.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            d5.l i32 = c0.i3(charSequence);
            if (!(i32 instanceof Collection) || !((Collection) i32).isEmpty()) {
                Iterator<Integer> it = i32.iterator();
                while (it.hasNext()) {
                    if (!d.r(charSequence.charAt(((s0) it).b()))) {
                        z6 = false;
                        break;
                    }
                }
            }
            z6 = true;
            return z6;
        }
        return true;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final String W1(String str) {
        l0.p(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final String X1(String str, Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @k4.f
    public static final int Y1(String str, char c7, int i7) {
        l0.p(str, "<this>");
        return str.indexOf(c7, i7);
    }

    @k4.f
    public static final int Z1(String str, String str2, int i7) {
        l0.p(str, "<this>");
        l0.p(str2, "str");
        return str.indexOf(str2, i7);
    }

    @k4.f
    public static final int a2(String str, char c7, int i7) {
        l0.p(str, "<this>");
        return str.lastIndexOf(c7, i7);
    }

    @k4.f
    public static final int b2(String str, String str2, int i7) {
        l0.p(str, "<this>");
        l0.p(str2, "str");
        return str.lastIndexOf(str2, i7);
    }

    @k4.f
    public static final int c2(String str, int i7, int i8) {
        l0.p(str, "<this>");
        return str.offsetByCodePoints(i7, i8);
    }

    public static final boolean d2(@n6.d CharSequence charSequence, int i7, @n6.d CharSequence charSequence2, int i8, int i9, boolean z6) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? e2((String) charSequence, i7, (String) charSequence2, i8, i9, z6) : c0.b4(charSequence, i7, charSequence2, i8, i9, z6);
    }

    @k4.f
    public static final String e1(StringBuffer stringBuffer) {
        l0.p(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    public static final boolean e2(@n6.d String str, int i7, @n6.d String str2, int i8, int i9, boolean z6) {
        l0.p(str, "<this>");
        l0.p(str2, "other");
        return !z6 ? str.regionMatches(i7, str2, i8, i9) : str.regionMatches(z6, i7, str2, i8, i9);
    }

    @k4.f
    public static final String f1(StringBuilder sb) {
        l0.p(sb, "stringBuilder");
        return new String(sb);
    }

    public static /* synthetic */ boolean f2(CharSequence charSequence, int i7, CharSequence charSequence2, int i8, int i9, boolean z6, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z6 = false;
        }
        return d2(charSequence, i7, charSequence2, i8, i9, z6);
    }

    @k4.f
    public static final String g1(byte[] bArr) {
        l0.p(bArr, "bytes");
        return new String(bArr, f.f11071b);
    }

    public static /* synthetic */ boolean g2(String str, int i7, String str2, int i8, int i9, boolean z6, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z6 = false;
        }
        return e2(str, i7, str2, i8, i9, z6);
    }

    @k4.f
    public static final String h1(byte[] bArr, int i7, int i8) {
        l0.p(bArr, "bytes");
        return new String(bArr, i7, i8, f.f11071b);
    }

    @n6.d
    public static final String h2(@n6.d CharSequence charSequence, int i7) {
        l0.p(charSequence, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i7 + '.').toString());
        } else if (i7 != 0) {
            if (i7 != 1) {
                int length = charSequence.length();
                if (length != 0) {
                    if (length == 1) {
                        char charAt = charSequence.charAt(0);
                        char[] cArr = new char[i7];
                        for (int i8 = 0; i8 < i7; i8++) {
                            cArr[i8] = charAt;
                        }
                        return new String(cArr);
                    }
                    StringBuilder sb = new StringBuilder(charSequence.length() * i7);
                    s0 it = new d5.l(1, i7).iterator();
                    while (it.hasNext()) {
                        it.b();
                        sb.append(charSequence);
                    }
                    String sb2 = sb.toString();
                    l0.o(sb2, "{\n                    va…tring()\n                }");
                    return sb2;
                }
                return "";
            }
            return charSequence.toString();
        } else {
            return "";
        }
    }

    @k4.f
    public static final String i1(byte[] bArr, int i7, int i8, Charset charset) {
        l0.p(bArr, "bytes");
        l0.p(charset, "charset");
        return new String(bArr, i7, i8, charset);
    }

    @n6.d
    public static final String i2(@n6.d String str, char c7, char c8, boolean z6) {
        l0.p(str, "<this>");
        if (!z6) {
            String replace = str.replace(c7, c8);
            l0.o(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (e.J(charAt, c7, z6)) {
                charAt = c8;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @k4.f
    public static final String j1(byte[] bArr, Charset charset) {
        l0.p(bArr, "bytes");
        l0.p(charset, "charset");
        return new String(bArr, charset);
    }

    @n6.d
    public static final String j2(@n6.d String str, @n6.d String str2, @n6.d String str3, boolean z6) {
        l0.p(str, "<this>");
        l0.p(str2, "oldValue");
        l0.p(str3, "newValue");
        int i7 = 0;
        int o32 = c0.o3(str, str2, 0, z6);
        if (o32 < 0) {
            return str;
        }
        int length = str2.length();
        int u6 = d5.u.u(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i7, o32);
                sb.append(str3);
                i7 = o32 + length;
                if (o32 >= str.length()) {
                    break;
                }
                o32 = c0.o3(str, str2, o32 + u6, z6);
            } while (o32 > 0);
            sb.append((CharSequence) str, i7, str.length());
            String sb2 = sb.toString();
            l0.o(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    @k4.f
    public static final String k1(char[] cArr) {
        l0.p(cArr, "chars");
        return new String(cArr);
    }

    public static /* synthetic */ String k2(String str, char c7, char c8, boolean z6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        return i2(str, c7, c8, z6);
    }

    @k4.f
    public static final String l1(char[] cArr, int i7, int i8) {
        l0.p(cArr, "chars");
        return new String(cArr, i7, i8);
    }

    public static /* synthetic */ String l2(String str, String str2, String str3, boolean z6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        return j2(str, str2, str3, z6);
    }

    @k4.f
    public static final String m1(int[] iArr, int i7, int i8) {
        l0.p(iArr, "codePoints");
        return new String(iArr, i7, i8);
    }

    @n6.d
    public static final String m2(@n6.d String str, char c7, char c8, boolean z6) {
        l0.p(str, "<this>");
        int r32 = c0.r3(str, c7, 0, z6, 2, null);
        return r32 < 0 ? str : c0.J4(str, r32, r32 + 1, String.valueOf(c8)).toString();
    }

    @n6.d
    @v3.k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @v3.l(warningSince = "1.5")
    public static final String n1(@n6.d String str) {
        l0.p(str, "<this>");
        Locale locale = Locale.getDefault();
        l0.o(locale, "getDefault()");
        return o1(str, locale);
    }

    @n6.d
    public static final String n2(@n6.d String str, @n6.d String str2, @n6.d String str3, boolean z6) {
        l0.p(str, "<this>");
        l0.p(str2, "oldValue");
        l0.p(str3, "newValue");
        int s32 = c0.s3(str, str2, 0, z6, 2, null);
        return s32 < 0 ? str : c0.J4(str, s32, str2.length() + s32, str3).toString();
    }

    @g1(version = "1.4")
    @k4.h
    @v3.k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @v3.l(warningSince = "1.5")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final String o1(@n6.d String str, @n6.d Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        if (str.length() > 0) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    l0.n(substring, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = substring.toUpperCase(locale);
                    l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                l0.o(substring2, "this as java.lang.String).substring(startIndex)");
                sb.append(substring2);
                String sb2 = sb.toString();
                l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            return str;
        }
        return str;
    }

    public static /* synthetic */ String o2(String str, char c7, char c8, boolean z6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        return m2(str, c7, c8, z6);
    }

    @k4.f
    public static final int p1(String str, int i7) {
        l0.p(str, "<this>");
        return str.codePointAt(i7);
    }

    public static /* synthetic */ String p2(String str, String str2, String str3, boolean z6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        return n2(str, str2, str3, z6);
    }

    @k4.f
    public static final int q1(String str, int i7) {
        l0.p(str, "<this>");
        return str.codePointBefore(i7);
    }

    @n6.d
    public static final List<String> q2(@n6.d CharSequence charSequence, @n6.d Pattern pattern, int i7) {
        l0.p(charSequence, "<this>");
        l0.p(pattern, "regex");
        c0.N4(i7);
        if (i7 == 0) {
            i7 = -1;
        }
        String[] split = pattern.split(charSequence, i7);
        l0.o(split, "regex.split(this, if (limit == 0) -1 else limit)");
        return x3.o.t(split);
    }

    @k4.f
    public static final int r1(String str, int i7, int i8) {
        l0.p(str, "<this>");
        return str.codePointCount(i7, i8);
    }

    public static /* synthetic */ List r2(CharSequence charSequence, Pattern pattern, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return q2(charSequence, pattern, i7);
    }

    public static final int s1(@n6.d String str, @n6.d String str2, boolean z6) {
        l0.p(str, "<this>");
        l0.p(str2, "other");
        return z6 ? str.compareToIgnoreCase(str2) : str.compareTo(str2);
    }

    public static final boolean s2(@n6.d String str, @n6.d String str2, int i7, boolean z6) {
        l0.p(str, "<this>");
        l0.p(str2, "prefix");
        return !z6 ? str.startsWith(str2, i7) : e2(str, i7, str2, 0, str2.length(), z6);
    }

    public static /* synthetic */ int t1(String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return s1(str, str2, z6);
    }

    public static final boolean t2(@n6.d String str, @n6.d String str2, boolean z6) {
        l0.p(str, "<this>");
        l0.p(str2, "prefix");
        return !z6 ? str.startsWith(str2) : e2(str, 0, str2, 0, str2.length(), z6);
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final String u1(@n6.d char[] cArr) {
        l0.p(cArr, "<this>");
        return new String(cArr);
    }

    public static /* synthetic */ boolean u2(String str, String str2, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return s2(str, str2, i7, z6);
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final String v1(@n6.d char[] cArr, int i7, int i8) {
        l0.p(cArr, "<this>");
        x3.c.f18278k.a(i7, i8, cArr.length);
        return new String(cArr, i7, i8 - i7);
    }

    public static /* synthetic */ boolean v2(String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return t2(str, str2, z6);
    }

    public static /* synthetic */ String w1(char[] cArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = cArr.length;
        }
        return v1(cArr, i7, i8);
    }

    @k4.f
    public static final String w2(String str, int i7) {
        l0.p(str, "<this>");
        String substring = str.substring(i7);
        l0.o(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @g1(version = "1.5")
    public static final boolean x1(@n6.e CharSequence charSequence, @n6.e CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? c0.Y2(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @k4.f
    public static final String x2(String str, int i7, int i8) {
        l0.p(str, "<this>");
        String substring = str.substring(i7, i8);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @g1(version = "1.5")
    public static final boolean y1(@n6.e CharSequence charSequence, @n6.e CharSequence charSequence2, boolean z6) {
        return z6 ? c0.X2(charSequence, charSequence2) : x1(charSequence, charSequence2);
    }

    @k4.f
    public static final byte[] y2(String str, Charset charset) {
        l0.p(str, "<this>");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @k4.f
    public static final boolean z1(String str, CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    public static /* synthetic */ byte[] z2(String str, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = f.f11071b;
        }
        l0.p(str, "<this>");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
