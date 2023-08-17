package i5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import u4.l0;
import u4.r1;
import v3.g1;

@r1({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,283:1\n274#1,7:284\n274#1,7:291\n274#1,7:298\n274#1,7:305\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n151#1:284,7\n158#1:291,7\n238#1:298,7\n249#1:305,7\n*E\n"})
/* loaded from: classes.dex */
public class z extends y {
    @g1(version = "1.2")
    @k4.f
    public static final BigInteger A0(String str, int i7) {
        l0.p(str, "<this>");
        return new BigInteger(str, d.a(i7));
    }

    @g1(version = "1.2")
    @n6.e
    public static final BigInteger B0(@n6.d String str) {
        l0.p(str, "<this>");
        return C0(str, 10);
    }

    @g1(version = "1.2")
    @n6.e
    public static final BigInteger C0(@n6.d String str, int i7) {
        l0.p(str, "<this>");
        d.a(i7);
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                for (int i8 = str.charAt(0) == '-' ? 1 : 0; i8 < length; i8++) {
                    if (d.b(str.charAt(i8), i7) < 0) {
                        return null;
                    }
                }
            } else if (d.b(str.charAt(0), i7) < 0) {
                return null;
            }
            return new BigInteger(str, d.a(i7));
        }
        return null;
    }

    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ boolean D0(String str) {
        l0.p(str, "<this>");
        return Boolean.parseBoolean(str);
    }

    @s4.h(name = "toBooleanNullable")
    @g1(version = "1.4")
    @k4.f
    public static final boolean E0(String str) {
        return Boolean.parseBoolean(str);
    }

    @k4.f
    public static final byte F0(String str) {
        l0.p(str, "<this>");
        return Byte.parseByte(str);
    }

    @g1(version = "1.1")
    @k4.f
    public static final byte G0(String str, int i7) {
        l0.p(str, "<this>");
        return Byte.parseByte(str, d.a(i7));
    }

    @k4.f
    public static final double H0(String str) {
        l0.p(str, "<this>");
        return Double.parseDouble(str);
    }

    @g1(version = "1.1")
    @n6.e
    public static final Double I0(@n6.d String str) {
        l0.p(str, "<this>");
        try {
            if (r.f11159b.k(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @k4.f
    public static final float J0(String str) {
        l0.p(str, "<this>");
        return Float.parseFloat(str);
    }

    @g1(version = "1.1")
    @n6.e
    public static final Float K0(@n6.d String str) {
        l0.p(str, "<this>");
        try {
            if (r.f11159b.k(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @k4.f
    public static final int L0(String str) {
        l0.p(str, "<this>");
        return Integer.parseInt(str);
    }

    @g1(version = "1.1")
    @k4.f
    public static final int M0(String str, int i7) {
        l0.p(str, "<this>");
        return Integer.parseInt(str, d.a(i7));
    }

    @k4.f
    public static final long N0(String str) {
        l0.p(str, "<this>");
        return Long.parseLong(str);
    }

    @g1(version = "1.1")
    @k4.f
    public static final long O0(String str, int i7) {
        l0.p(str, "<this>");
        return Long.parseLong(str, d.a(i7));
    }

    @k4.f
    public static final short P0(String str) {
        l0.p(str, "<this>");
        return Short.parseShort(str);
    }

    @g1(version = "1.1")
    @k4.f
    public static final short Q0(String str, int i7) {
        l0.p(str, "<this>");
        return Short.parseShort(str, d.a(i7));
    }

    @g1(version = "1.1")
    @k4.f
    public static final String R0(byte b7, int i7) {
        String num = Integer.toString(b7, d.a(d.a(i7)));
        l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @g1(version = "1.1")
    @k4.f
    public static final String S0(int i7, int i8) {
        String num = Integer.toString(i7, d.a(i8));
        l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @g1(version = "1.1")
    @k4.f
    public static final String T0(long j7, int i7) {
        String l7 = Long.toString(j7, d.a(i7));
        l0.o(l7, "toString(this, checkRadix(radix))");
        return l7;
    }

    @g1(version = "1.1")
    @k4.f
    public static final String U0(short s6, int i7) {
        String num = Integer.toString(s6, d.a(d.a(i7)));
        l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    public static final <T> T u0(String str, t4.l<? super String, ? extends T> lVar) {
        try {
            if (r.f11159b.k(str)) {
                return lVar.O(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal v0(String str) {
        l0.p(str, "<this>");
        return new BigDecimal(str);
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal w0(String str, MathContext mathContext) {
        l0.p(str, "<this>");
        l0.p(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @g1(version = "1.2")
    @n6.e
    public static final BigDecimal x0(@n6.d String str) {
        l0.p(str, "<this>");
        try {
            if (r.f11159b.k(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @g1(version = "1.2")
    @n6.e
    public static final BigDecimal y0(@n6.d String str, @n6.d MathContext mathContext) {
        l0.p(str, "<this>");
        l0.p(mathContext, "mathContext");
        try {
            if (r.f11159b.k(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigInteger z0(String str) {
        l0.p(str, "<this>");
        return new BigInteger(str);
    }
}