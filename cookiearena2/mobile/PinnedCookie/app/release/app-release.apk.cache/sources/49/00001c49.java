package v3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* loaded from: classes.dex */
public class n0 extends m0 {
    @g1(version = "1.2")
    @k4.f
    public static final BigInteger A(BigInteger bigInteger, int i7) {
        u4.l0.p(bigInteger, "<this>");
        BigInteger shiftRight = bigInteger.shiftRight(i7);
        u4.l0.o(shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }

    @k4.f
    public static final BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
        u4.l0.p(bigInteger, "<this>");
        u4.l0.p(bigInteger2, "other");
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        u4.l0.o(multiply, "this.multiply(other)");
        return multiply;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal C(BigInteger bigInteger) {
        u4.l0.p(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigDecimal D(BigInteger bigInteger, int i7, MathContext mathContext) {
        u4.l0.p(bigInteger, "<this>");
        u4.l0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i7, mathContext);
    }

    public static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i7, MathContext mathContext, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            u4.l0.o(mathContext, "UNLIMITED");
        }
        u4.l0.p(bigInteger, "<this>");
        u4.l0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i7, mathContext);
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigInteger F(int i7) {
        BigInteger valueOf = BigInteger.valueOf(i7);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigInteger G(long j7) {
        BigInteger valueOf = BigInteger.valueOf(j7);
        u4.l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @k4.f
    public static final BigInteger H(BigInteger bigInteger) {
        u4.l0.p(bigInteger, "<this>");
        BigInteger negate = bigInteger.negate();
        u4.l0.o(negate, "this.negate()");
        return negate;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigInteger I(BigInteger bigInteger, BigInteger bigInteger2) {
        u4.l0.p(bigInteger, "<this>");
        u4.l0.p(bigInteger2, "other");
        BigInteger xor = bigInteger.xor(bigInteger2);
        u4.l0.o(xor, "this.xor(other)");
        return xor;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigInteger q(BigInteger bigInteger, BigInteger bigInteger2) {
        u4.l0.p(bigInteger, "<this>");
        u4.l0.p(bigInteger2, "other");
        BigInteger and = bigInteger.and(bigInteger2);
        u4.l0.o(and, "this.and(other)");
        return and;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigInteger r(BigInteger bigInteger) {
        u4.l0.p(bigInteger, "<this>");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        u4.l0.o(subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }

    @k4.f
    public static final BigInteger s(BigInteger bigInteger, BigInteger bigInteger2) {
        u4.l0.p(bigInteger, "<this>");
        u4.l0.p(bigInteger2, "other");
        BigInteger divide = bigInteger.divide(bigInteger2);
        u4.l0.o(divide, "this.divide(other)");
        return divide;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigInteger t(BigInteger bigInteger) {
        u4.l0.p(bigInteger, "<this>");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        u4.l0.o(add, "this.add(BigInteger.ONE)");
        return add;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigInteger u(BigInteger bigInteger) {
        u4.l0.p(bigInteger, "<this>");
        BigInteger not = bigInteger.not();
        u4.l0.o(not, "this.not()");
        return not;
    }

    @k4.f
    public static final BigInteger v(BigInteger bigInteger, BigInteger bigInteger2) {
        u4.l0.p(bigInteger, "<this>");
        u4.l0.p(bigInteger2, "other");
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        u4.l0.o(subtract, "this.subtract(other)");
        return subtract;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigInteger w(BigInteger bigInteger, BigInteger bigInteger2) {
        u4.l0.p(bigInteger, "<this>");
        u4.l0.p(bigInteger2, "other");
        BigInteger or = bigInteger.or(bigInteger2);
        u4.l0.o(or, "this.or(other)");
        return or;
    }

    @k4.f
    public static final BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
        u4.l0.p(bigInteger, "<this>");
        u4.l0.p(bigInteger2, "other");
        BigInteger add = bigInteger.add(bigInteger2);
        u4.l0.o(add, "this.add(other)");
        return add;
    }

    @g1(version = "1.1")
    @k4.f
    public static final BigInteger y(BigInteger bigInteger, BigInteger bigInteger2) {
        u4.l0.p(bigInteger, "<this>");
        u4.l0.p(bigInteger2, "other");
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        u4.l0.o(remainder, "this.remainder(other)");
        return remainder;
    }

    @g1(version = "1.2")
    @k4.f
    public static final BigInteger z(BigInteger bigInteger, int i7) {
        u4.l0.p(bigInteger, "<this>");
        BigInteger shiftLeft = bigInteger.shiftLeft(i7);
        u4.l0.o(shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }
}