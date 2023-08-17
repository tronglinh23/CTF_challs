package v3;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public class m0 {
    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal a(BigDecimal bigDecimal) {
        u4.l0.p(bigDecimal, "<this>");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        u4.l0.o(subtract, "this.subtract(BigDecimal.ONE)");
        return subtract;
    }

    @k4.f
    public static final BigDecimal b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        u4.l0.p(bigDecimal, "<this>");
        u4.l0.p(bigDecimal2, "other");
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        u4.l0.o(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal c(BigDecimal bigDecimal) {
        u4.l0.p(bigDecimal, "<this>");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        u4.l0.o(add, "this.add(BigDecimal.ONE)");
        return add;
    }

    @k4.f
    public static final BigDecimal d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        u4.l0.p(bigDecimal, "<this>");
        u4.l0.p(bigDecimal2, "other");
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        u4.l0.o(subtract, "this.subtract(other)");
        return subtract;
    }

    @k4.f
    public static final BigDecimal e(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        u4.l0.p(bigDecimal, "<this>");
        u4.l0.p(bigDecimal2, "other");
        BigDecimal add = bigDecimal.add(bigDecimal2);
        u4.l0.o(add, "this.add(other)");
        return add;
    }

    @k4.f
    public static final BigDecimal f(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        u4.l0.p(bigDecimal, "<this>");
        u4.l0.p(bigDecimal2, "other");
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        u4.l0.o(remainder, "this.remainder(other)");
        return remainder;
    }

    @k4.f
    public static final BigDecimal g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        u4.l0.p(bigDecimal, "<this>");
        u4.l0.p(bigDecimal2, "other");
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        u4.l0.o(multiply, "this.multiply(other)");
        return multiply;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal h(double d7) {
        return new BigDecimal(String.valueOf(d7));
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal i(double d7, MathContext mathContext) {
        u4.l0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d7), mathContext);
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal j(float f7) {
        return new BigDecimal(String.valueOf(f7));
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal k(float f7, MathContext mathContext) {
        u4.l0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f7), mathContext);
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal l(int i7) {
        BigDecimal valueOf = BigDecimal.valueOf(i7);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal m(int i7, MathContext mathContext) {
        u4.l0.p(mathContext, "mathContext");
        return new BigDecimal(i7, mathContext);
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal n(long j7) {
        BigDecimal valueOf = BigDecimal.valueOf(j7);
        u4.l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal o(long j7, MathContext mathContext) {
        u4.l0.p(mathContext, "mathContext");
        return new BigDecimal(j7, mathContext);
    }

    @k4.f
    public static final BigDecimal p(BigDecimal bigDecimal) {
        u4.l0.p(bigDecimal, "<this>");
        BigDecimal negate = bigDecimal.negate();
        u4.l0.o(negate, "this.negate()");
        return negate;
    }
}