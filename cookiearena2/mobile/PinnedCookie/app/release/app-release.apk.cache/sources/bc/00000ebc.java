package d5;

import d5.a;
import d5.j;
import d5.m;
import java.util.NoSuchElementException;
import u4.l0;
import u4.r1;
import v3.g1;
import v3.q2;

@r1({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
/* loaded from: classes.dex */
public class u extends t {
    public static final float A(float f7, float f8) {
        return f7 > f8 ? f8 : f7;
    }

    @g1(version = "1.7")
    @n6.e
    public static final Integer A0(@n6.d j jVar) {
        l0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.i());
    }

    @n6.d
    public static final a A1(@n6.d a aVar, int i7) {
        l0.p(aVar, "<this>");
        t.a(i7 > 0, Integer.valueOf(i7));
        a.C0095a c0095a = a.f8470n;
        char i8 = aVar.i();
        char j7 = aVar.j();
        if (aVar.k() <= 0) {
            i7 = -i7;
        }
        return c0095a.a(i8, j7, i7);
    }

    public static final int B(int i7, int i8) {
        return i7 > i8 ? i8 : i7;
    }

    @g1(version = "1.7")
    @n6.e
    public static final Long B0(@n6.d m mVar) {
        l0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.i());
    }

    @n6.d
    public static final j B1(@n6.d j jVar, int i7) {
        l0.p(jVar, "<this>");
        t.a(i7 > 0, Integer.valueOf(i7));
        j.a aVar = j.f8490n;
        int i8 = jVar.i();
        int j7 = jVar.j();
        if (jVar.k() <= 0) {
            i7 = -i7;
        }
        return aVar.a(i8, j7, i7);
    }

    public static final long C(long j7, long j8) {
        return j7 > j8 ? j8 : j7;
    }

    @s4.h(name = "floatRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean C0(g gVar, byte b7) {
        l0.p(gVar, "<this>");
        return gVar.a(Float.valueOf(b7));
    }

    @n6.d
    public static final m C1(@n6.d m mVar, long j7) {
        l0.p(mVar, "<this>");
        t.a(j7 > 0, Long.valueOf(j7));
        m.a aVar = m.f8500n;
        long i7 = mVar.i();
        long j8 = mVar.j();
        if (mVar.k() <= 0) {
            j7 = -j7;
        }
        return aVar.a(i7, j8, j7);
    }

    @n6.d
    public static final <T extends Comparable<? super T>> T D(@n6.d T t6, @n6.d T t7) {
        l0.p(t6, "<this>");
        l0.p(t7, "maximumValue");
        return t6.compareTo(t7) > 0 ? t7 : t6;
    }

    @s4.h(name = "floatRangeContains")
    public static final boolean D0(@n6.d g<Float> gVar, double d7) {
        l0.p(gVar, "<this>");
        return gVar.a(Float.valueOf((float) d7));
    }

    @n6.e
    public static final Byte D1(double d7) {
        boolean z6 = false;
        if (-128.0d <= d7 && d7 <= 127.0d) {
            z6 = true;
        }
        if (z6) {
            return Byte.valueOf((byte) d7);
        }
        return null;
    }

    public static final short E(short s6, short s7) {
        return s6 > s7 ? s7 : s6;
    }

    @s4.h(name = "floatRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean E0(g gVar, int i7) {
        l0.p(gVar, "<this>");
        return gVar.a(Float.valueOf(i7));
    }

    @n6.e
    public static final Byte E1(float f7) {
        boolean z6 = false;
        if (-128.0f <= f7 && f7 <= 127.0f) {
            z6 = true;
        }
        if (z6) {
            return Byte.valueOf((byte) f7);
        }
        return null;
    }

    public static final byte F(byte b7, byte b8, byte b9) {
        if (b8 <= b9) {
            return b7 < b8 ? b8 : b7 > b9 ? b9 : b7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b9) + " is less than minimum " + ((int) b8) + '.');
    }

    @s4.h(name = "floatRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean F0(g gVar, long j7) {
        l0.p(gVar, "<this>");
        return gVar.a(Float.valueOf((float) j7));
    }

    @n6.e
    public static final Byte F1(int i7) {
        if (new l(-128, 127).n(i7)) {
            return Byte.valueOf((byte) i7);
        }
        return null;
    }

    public static final double G(double d7, double d8, double d9) {
        if (d8 <= d9) {
            return d7 < d8 ? d8 : d7 > d9 ? d9 : d7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d9 + " is less than minimum " + d8 + '.');
    }

    @s4.h(name = "floatRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean G0(g gVar, short s6) {
        l0.p(gVar, "<this>");
        return gVar.a(Float.valueOf(s6));
    }

    @n6.e
    public static final Byte G1(long j7) {
        if (new o(-128L, 127L).n(j7)) {
            return Byte.valueOf((byte) j7);
        }
        return null;
    }

    public static final float H(float f7, float f8, float f9) {
        if (f8 <= f9) {
            return f7 < f8 ? f8 : f7 > f9 ? f9 : f7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f9 + " is less than minimum " + f8 + '.');
    }

    @s4.h(name = "intRangeContains")
    public static final boolean H0(@n6.d g<Integer> gVar, byte b7) {
        l0.p(gVar, "<this>");
        return gVar.a(Integer.valueOf(b7));
    }

    @n6.e
    public static final Byte H1(short s6) {
        if (L0(new l(-128, 127), s6)) {
            return Byte.valueOf((byte) s6);
        }
        return null;
    }

    public static final int I(int i7, int i8, int i9) {
        if (i8 <= i9) {
            return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    @s4.h(name = "intRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean I0(g gVar, double d7) {
        l0.p(gVar, "<this>");
        Integer I1 = I1(d7);
        if (I1 != null) {
            return gVar.a(I1);
        }
        return false;
    }

    @n6.e
    public static final Integer I1(double d7) {
        boolean z6 = false;
        if (-2.147483648E9d <= d7 && d7 <= 2.147483647E9d) {
            z6 = true;
        }
        if (z6) {
            return Integer.valueOf((int) d7);
        }
        return null;
    }

    public static final int J(int i7, @n6.d g<Integer> gVar) {
        l0.p(gVar, "range");
        if (gVar instanceof f) {
            return ((Number) M(Integer.valueOf(i7), (f) gVar)).intValue();
        }
        if (!gVar.isEmpty()) {
            return i7 < gVar.b().intValue() ? gVar.b().intValue() : i7 > gVar.g().intValue() ? gVar.g().intValue() : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
    }

    @s4.h(name = "intRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean J0(g gVar, float f7) {
        l0.p(gVar, "<this>");
        Integer J1 = J1(f7);
        if (J1 != null) {
            return gVar.a(J1);
        }
        return false;
    }

    @n6.e
    public static final Integer J1(float f7) {
        boolean z6 = false;
        if (-2.14748365E9f <= f7 && f7 <= 2.14748365E9f) {
            z6 = true;
        }
        if (z6) {
            return Integer.valueOf((int) f7);
        }
        return null;
    }

    public static final long K(long j7, long j8, long j9) {
        if (j8 <= j9) {
            return j7 < j8 ? j8 : j7 > j9 ? j9 : j7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j9 + " is less than minimum " + j8 + '.');
    }

    @s4.h(name = "intRangeContains")
    public static final boolean K0(@n6.d g<Integer> gVar, long j7) {
        l0.p(gVar, "<this>");
        Integer K1 = K1(j7);
        if (K1 != null) {
            return gVar.a(K1);
        }
        return false;
    }

    @n6.e
    public static final Integer K1(long j7) {
        if (new o(-2147483648L, 2147483647L).n(j7)) {
            return Integer.valueOf((int) j7);
        }
        return null;
    }

    public static final long L(long j7, @n6.d g<Long> gVar) {
        l0.p(gVar, "range");
        if (gVar instanceof f) {
            return ((Number) M(Long.valueOf(j7), (f) gVar)).longValue();
        }
        if (!gVar.isEmpty()) {
            return j7 < gVar.b().longValue() ? gVar.b().longValue() : j7 > gVar.g().longValue() ? gVar.g().longValue() : j7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
    }

    @s4.h(name = "intRangeContains")
    public static final boolean L0(@n6.d g<Integer> gVar, short s6) {
        l0.p(gVar, "<this>");
        return gVar.a(Integer.valueOf(s6));
    }

    @n6.e
    public static final Long L1(double d7) {
        boolean z6 = false;
        if (-9.223372036854776E18d <= d7 && d7 <= 9.223372036854776E18d) {
            z6 = true;
        }
        if (z6) {
            return Long.valueOf((long) d7);
        }
        return null;
    }

    @g1(version = "1.1")
    @n6.d
    public static final <T extends Comparable<? super T>> T M(@n6.d T t6, @n6.d f<T> fVar) {
        l0.p(t6, "<this>");
        l0.p(fVar, "range");
        if (!fVar.isEmpty()) {
            return (!fVar.f(t6, fVar.b()) || fVar.f(fVar.b(), t6)) ? (!fVar.f(fVar.g(), t6) || fVar.f(t6, fVar.g())) ? t6 : fVar.g() : fVar.b();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
    }

    @s4.h(name = "intRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean M0(@n6.d r<Integer> rVar, byte b7) {
        l0.p(rVar, "<this>");
        return rVar.a(Integer.valueOf(b7));
    }

    @n6.e
    public static final Long M1(float f7) {
        boolean z6 = false;
        if (-9.223372E18f <= f7 && f7 <= 9.223372E18f) {
            z6 = true;
        }
        if (z6) {
            return Long.valueOf(f7);
        }
        return null;
    }

    @n6.d
    public static final <T extends Comparable<? super T>> T N(@n6.d T t6, @n6.d g<T> gVar) {
        l0.p(t6, "<this>");
        l0.p(gVar, "range");
        if (gVar instanceof f) {
            return (T) M(t6, (f) gVar);
        }
        if (!gVar.isEmpty()) {
            return t6.compareTo(gVar.b()) < 0 ? gVar.b() : t6.compareTo(gVar.g()) > 0 ? gVar.g() : t6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
    }

    @s4.h(name = "intRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean N0(@n6.d r<Integer> rVar, long j7) {
        l0.p(rVar, "<this>");
        Integer K1 = K1(j7);
        if (K1 != null) {
            return rVar.a(K1);
        }
        return false;
    }

    @n6.e
    public static final Short N1(double d7) {
        boolean z6 = false;
        if (-32768.0d <= d7 && d7 <= 32767.0d) {
            z6 = true;
        }
        if (z6) {
            return Short.valueOf((short) d7);
        }
        return null;
    }

    @n6.d
    public static final <T extends Comparable<? super T>> T O(@n6.d T t6, @n6.e T t7, @n6.e T t8) {
        l0.p(t6, "<this>");
        if (t7 == null || t8 == null) {
            if (t7 != null && t6.compareTo(t7) < 0) {
                return t7;
            }
            if (t8 != null && t6.compareTo(t8) > 0) {
                return t8;
            }
        } else if (t7.compareTo(t8) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t8 + " is less than minimum " + t7 + '.');
        } else if (t6.compareTo(t7) < 0) {
            return t7;
        } else {
            if (t6.compareTo(t8) > 0) {
                return t8;
            }
        }
        return t6;
    }

    @s4.h(name = "intRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean O0(@n6.d r<Integer> rVar, short s6) {
        l0.p(rVar, "<this>");
        return rVar.a(Integer.valueOf(s6));
    }

    @n6.e
    public static final Short O1(float f7) {
        boolean z6 = false;
        if (-32768.0f <= f7 && f7 <= 32767.0f) {
            z6 = true;
        }
        if (z6) {
            return Short.valueOf((short) f7);
        }
        return null;
    }

    public static final short P(short s6, short s7, short s8) {
        if (s7 <= s8) {
            return s6 < s7 ? s7 : s6 > s8 ? s8 : s6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s8) + " is less than minimum " + ((int) s7) + '.');
    }

    @g1(version = "1.7")
    public static final char P0(@n6.d a aVar) {
        l0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            throw new NoSuchElementException("Progression " + aVar + " is empty.");
        }
        return aVar.j();
    }

    @n6.e
    public static final Short P1(int i7) {
        if (new l(-32768, 32767).n(i7)) {
            return Short.valueOf((short) i7);
        }
        return null;
    }

    @g1(version = "1.3")
    @k4.f
    public static final boolean Q(c cVar, Character ch) {
        l0.p(cVar, "<this>");
        return ch != null && cVar.n(ch.charValue());
    }

    @g1(version = "1.7")
    public static final int Q0(@n6.d j jVar) {
        l0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            throw new NoSuchElementException("Progression " + jVar + " is empty.");
        }
        return jVar.j();
    }

    @n6.e
    public static final Short Q1(long j7) {
        if (new o(-32768L, 32767L).n(j7)) {
            return Short.valueOf((short) j7);
        }
        return null;
    }

    @k4.f
    public static final boolean R(l lVar, byte b7) {
        l0.p(lVar, "<this>");
        return H0(lVar, b7);
    }

    @g1(version = "1.7")
    public static final long R0(@n6.d m mVar) {
        l0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            throw new NoSuchElementException("Progression " + mVar + " is empty.");
        }
        return mVar.j();
    }

    @n6.d
    public static final c R1(char c7, char c8) {
        return l0.t(c8, 0) <= 0 ? c.f8480o.a() : new c(c7, (char) (c8 - 1));
    }

    @k4.f
    public static final boolean S(l lVar, long j7) {
        l0.p(lVar, "<this>");
        return K0(lVar, j7);
    }

    @g1(version = "1.7")
    @n6.e
    public static final Character S0(@n6.d a aVar) {
        l0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.j());
    }

    @n6.d
    public static final l S1(byte b7, byte b8) {
        return new l(b7, b8 - 1);
    }

    @g1(version = "1.3")
    @k4.f
    public static final boolean T(l lVar, Integer num) {
        l0.p(lVar, "<this>");
        return num != null && lVar.n(num.intValue());
    }

    @g1(version = "1.7")
    @n6.e
    public static final Integer T0(@n6.d j jVar) {
        l0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.j());
    }

    @n6.d
    public static final l T1(byte b7, int i7) {
        return i7 <= Integer.MIN_VALUE ? l.f8498o.a() : new l(b7, i7 - 1);
    }

    @k4.f
    public static final boolean U(l lVar, short s6) {
        l0.p(lVar, "<this>");
        return L0(lVar, s6);
    }

    @g1(version = "1.7")
    @n6.e
    public static final Long U0(@n6.d m mVar) {
        l0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.j());
    }

    @n6.d
    public static final l U1(byte b7, short s6) {
        return new l(b7, s6 - 1);
    }

    @k4.f
    public static final boolean V(o oVar, byte b7) {
        l0.p(oVar, "<this>");
        return V0(oVar, b7);
    }

    @s4.h(name = "longRangeContains")
    public static final boolean V0(@n6.d g<Long> gVar, byte b7) {
        l0.p(gVar, "<this>");
        return gVar.a(Long.valueOf(b7));
    }

    @n6.d
    public static final l V1(int i7, byte b7) {
        return new l(i7, b7 - 1);
    }

    @k4.f
    public static final boolean W(o oVar, int i7) {
        l0.p(oVar, "<this>");
        return Y0(oVar, i7);
    }

    @s4.h(name = "longRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean W0(g gVar, double d7) {
        l0.p(gVar, "<this>");
        Long L1 = L1(d7);
        if (L1 != null) {
            return gVar.a(L1);
        }
        return false;
    }

    @n6.d
    public static final l W1(int i7, int i8) {
        return i8 <= Integer.MIN_VALUE ? l.f8498o.a() : new l(i7, i8 - 1);
    }

    @g1(version = "1.3")
    @k4.f
    public static final boolean X(o oVar, Long l7) {
        l0.p(oVar, "<this>");
        return l7 != null && oVar.n(l7.longValue());
    }

    @s4.h(name = "longRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean X0(g gVar, float f7) {
        l0.p(gVar, "<this>");
        Long M1 = M1(f7);
        if (M1 != null) {
            return gVar.a(M1);
        }
        return false;
    }

    @n6.d
    public static final l X1(int i7, short s6) {
        return new l(i7, s6 - 1);
    }

    @k4.f
    public static final boolean Y(o oVar, short s6) {
        l0.p(oVar, "<this>");
        return Z0(oVar, s6);
    }

    @s4.h(name = "longRangeContains")
    public static final boolean Y0(@n6.d g<Long> gVar, int i7) {
        l0.p(gVar, "<this>");
        return gVar.a(Long.valueOf(i7));
    }

    @n6.d
    public static final l Y1(short s6, byte b7) {
        return new l(s6, b7 - 1);
    }

    @s4.h(name = "doubleRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean Z(g gVar, byte b7) {
        l0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(b7));
    }

    @s4.h(name = "longRangeContains")
    public static final boolean Z0(@n6.d g<Long> gVar, short s6) {
        l0.p(gVar, "<this>");
        return gVar.a(Long.valueOf(s6));
    }

    @n6.d
    public static final l Z1(short s6, int i7) {
        return i7 <= Integer.MIN_VALUE ? l.f8498o.a() : new l(s6, i7 - 1);
    }

    @s4.h(name = "doubleRangeContains")
    public static final boolean a0(@n6.d g<Double> gVar, float f7) {
        l0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(f7));
    }

    @s4.h(name = "longRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean a1(@n6.d r<Long> rVar, byte b7) {
        l0.p(rVar, "<this>");
        return rVar.a(Long.valueOf(b7));
    }

    @n6.d
    public static final l a2(short s6, short s7) {
        return new l(s6, s7 - 1);
    }

    @s4.h(name = "doubleRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean b0(g gVar, int i7) {
        l0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(i7));
    }

    @s4.h(name = "longRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean b1(@n6.d r<Long> rVar, int i7) {
        l0.p(rVar, "<this>");
        return rVar.a(Long.valueOf(i7));
    }

    @n6.d
    public static final o b2(byte b7, long j7) {
        return j7 <= Long.MIN_VALUE ? o.f8508o.a() : new o(b7, j7 - 1);
    }

    @s4.h(name = "doubleRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean c0(g gVar, long j7) {
        l0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(j7));
    }

    @s4.h(name = "longRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean c1(@n6.d r<Long> rVar, short s6) {
        l0.p(rVar, "<this>");
        return rVar.a(Long.valueOf(s6));
    }

    @n6.d
    public static final o c2(int i7, long j7) {
        return j7 <= Long.MIN_VALUE ? o.f8508o.a() : new o(i7, j7 - 1);
    }

    @s4.h(name = "doubleRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean d0(g gVar, short s6) {
        l0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(s6));
    }

    @g1(version = "1.3")
    @k4.f
    public static final char d1(c cVar) {
        l0.p(cVar, "<this>");
        return e1(cVar, b5.f.f7260k);
    }

    @n6.d
    public static final o d2(long j7, byte b7) {
        return new o(j7, b7 - 1);
    }

    @s4.h(name = "doubleRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean e0(@n6.d r<Double> rVar, float f7) {
        l0.p(rVar, "<this>");
        return rVar.a(Double.valueOf(f7));
    }

    @g1(version = "1.3")
    public static final char e1(@n6.d c cVar, @n6.d b5.f fVar) {
        l0.p(cVar, "<this>");
        l0.p(fVar, "random");
        try {
            return (char) fVar.n(cVar.i(), cVar.j() + 1);
        } catch (IllegalArgumentException e7) {
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @n6.d
    public static final o e2(long j7, int i7) {
        return new o(j7, i7 - 1);
    }

    @n6.d
    public static final a f0(char c7, char c8) {
        return a.f8470n.a(c7, c8, -1);
    }

    @g1(version = "1.3")
    @k4.f
    public static final int f1(l lVar) {
        l0.p(lVar, "<this>");
        return g1(lVar, b5.f.f7260k);
    }

    @n6.d
    public static final o f2(long j7, long j8) {
        return j8 <= Long.MIN_VALUE ? o.f8508o.a() : new o(j7, j8 - 1);
    }

    @n6.d
    public static final j g0(byte b7, byte b8) {
        return j.f8490n.a(b7, b8, -1);
    }

    @g1(version = "1.3")
    public static final int g1(@n6.d l lVar, @n6.d b5.f fVar) {
        l0.p(lVar, "<this>");
        l0.p(fVar, "random");
        try {
            return b5.g.h(fVar, lVar);
        } catch (IllegalArgumentException e7) {
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @n6.d
    public static final o g2(long j7, short s6) {
        return new o(j7, s6 - 1);
    }

    @n6.d
    public static final j h0(byte b7, int i7) {
        return j.f8490n.a(b7, i7, -1);
    }

    @g1(version = "1.3")
    @k4.f
    public static final long h1(o oVar) {
        l0.p(oVar, "<this>");
        return i1(oVar, b5.f.f7260k);
    }

    @n6.d
    public static final o h2(short s6, long j7) {
        return j7 <= Long.MIN_VALUE ? o.f8508o.a() : new o(s6, j7 - 1);
    }

    @n6.d
    public static final j i0(byte b7, short s6) {
        return j.f8490n.a(b7, s6, -1);
    }

    @g1(version = "1.3")
    public static final long i1(@n6.d o oVar, @n6.d b5.f fVar) {
        l0.p(oVar, "<this>");
        l0.p(fVar, "random");
        try {
            return b5.g.i(fVar, oVar);
        } catch (IllegalArgumentException e7) {
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @s4.h(name = "byteRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean j(g gVar, double d7) {
        l0.p(gVar, "<this>");
        Byte D1 = D1(d7);
        if (D1 != null) {
            return gVar.a(D1);
        }
        return false;
    }

    @n6.d
    public static final j j0(int i7, byte b7) {
        return j.f8490n.a(i7, b7, -1);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Character j1(c cVar) {
        l0.p(cVar, "<this>");
        return k1(cVar, b5.f.f7260k);
    }

    @s4.h(name = "byteRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean k(g gVar, float f7) {
        l0.p(gVar, "<this>");
        Byte E1 = E1(f7);
        if (E1 != null) {
            return gVar.a(E1);
        }
        return false;
    }

    @n6.d
    public static final j k0(int i7, int i8) {
        return j.f8490n.a(i7, i8, -1);
    }

    @g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Character k1(@n6.d c cVar, @n6.d b5.f fVar) {
        l0.p(cVar, "<this>");
        l0.p(fVar, "random");
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) fVar.n(cVar.i(), cVar.j() + 1));
    }

    @s4.h(name = "byteRangeContains")
    public static final boolean l(@n6.d g<Byte> gVar, int i7) {
        l0.p(gVar, "<this>");
        Byte F1 = F1(i7);
        if (F1 != null) {
            return gVar.a(F1);
        }
        return false;
    }

    @n6.d
    public static final j l0(int i7, short s6) {
        return j.f8490n.a(i7, s6, -1);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Integer l1(l lVar) {
        l0.p(lVar, "<this>");
        return m1(lVar, b5.f.f7260k);
    }

    @s4.h(name = "byteRangeContains")
    public static final boolean m(@n6.d g<Byte> gVar, long j7) {
        l0.p(gVar, "<this>");
        Byte G1 = G1(j7);
        if (G1 != null) {
            return gVar.a(G1);
        }
        return false;
    }

    @n6.d
    public static final j m0(short s6, byte b7) {
        return j.f8490n.a(s6, b7, -1);
    }

    @g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Integer m1(@n6.d l lVar, @n6.d b5.f fVar) {
        l0.p(lVar, "<this>");
        l0.p(fVar, "random");
        if (lVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(b5.g.h(fVar, lVar));
    }

    @s4.h(name = "byteRangeContains")
    public static final boolean n(@n6.d g<Byte> gVar, short s6) {
        l0.p(gVar, "<this>");
        Byte H1 = H1(s6);
        if (H1 != null) {
            return gVar.a(H1);
        }
        return false;
    }

    @n6.d
    public static final j n0(short s6, int i7) {
        return j.f8490n.a(s6, i7, -1);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Long n1(o oVar) {
        l0.p(oVar, "<this>");
        return o1(oVar, b5.f.f7260k);
    }

    @s4.h(name = "byteRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean o(@n6.d r<Byte> rVar, int i7) {
        l0.p(rVar, "<this>");
        Byte F1 = F1(i7);
        if (F1 != null) {
            return rVar.a(F1);
        }
        return false;
    }

    @n6.d
    public static final j o0(short s6, short s7) {
        return j.f8490n.a(s6, s7, -1);
    }

    @g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Long o1(@n6.d o oVar, @n6.d b5.f fVar) {
        l0.p(oVar, "<this>");
        l0.p(fVar, "random");
        if (oVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(b5.g.i(fVar, oVar));
    }

    @s4.h(name = "byteRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean p(@n6.d r<Byte> rVar, long j7) {
        l0.p(rVar, "<this>");
        Byte G1 = G1(j7);
        if (G1 != null) {
            return rVar.a(G1);
        }
        return false;
    }

    @n6.d
    public static final m p0(byte b7, long j7) {
        return m.f8500n.a(b7, j7, -1L);
    }

    @n6.d
    public static final a p1(@n6.d a aVar) {
        l0.p(aVar, "<this>");
        return a.f8470n.a(aVar.j(), aVar.i(), -aVar.k());
    }

    @s4.h(name = "byteRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean q(@n6.d r<Byte> rVar, short s6) {
        l0.p(rVar, "<this>");
        Byte H1 = H1(s6);
        if (H1 != null) {
            return rVar.a(H1);
        }
        return false;
    }

    @n6.d
    public static final m q0(int i7, long j7) {
        return m.f8500n.a(i7, j7, -1L);
    }

    @n6.d
    public static final j q1(@n6.d j jVar) {
        l0.p(jVar, "<this>");
        return j.f8490n.a(jVar.j(), jVar.i(), -jVar.k());
    }

    public static final byte r(byte b7, byte b8) {
        return b7 < b8 ? b8 : b7;
    }

    @n6.d
    public static final m r0(long j7, byte b7) {
        return m.f8500n.a(j7, b7, -1L);
    }

    @n6.d
    public static final m r1(@n6.d m mVar) {
        l0.p(mVar, "<this>");
        return m.f8500n.a(mVar.j(), mVar.i(), -mVar.k());
    }

    public static final double s(double d7, double d8) {
        return d7 < d8 ? d8 : d7;
    }

    @n6.d
    public static final m s0(long j7, int i7) {
        return m.f8500n.a(j7, i7, -1L);
    }

    @s4.h(name = "shortRangeContains")
    public static final boolean s1(@n6.d g<Short> gVar, byte b7) {
        l0.p(gVar, "<this>");
        return gVar.a(Short.valueOf(b7));
    }

    public static final float t(float f7, float f8) {
        return f7 < f8 ? f8 : f7;
    }

    @n6.d
    public static final m t0(long j7, long j8) {
        return m.f8500n.a(j7, j8, -1L);
    }

    @s4.h(name = "shortRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean t1(g gVar, double d7) {
        l0.p(gVar, "<this>");
        Short N1 = N1(d7);
        if (N1 != null) {
            return gVar.a(N1);
        }
        return false;
    }

    public static final int u(int i7, int i8) {
        return i7 < i8 ? i8 : i7;
    }

    @n6.d
    public static final m u0(long j7, short s6) {
        return m.f8500n.a(j7, s6, -1L);
    }

    @s4.h(name = "shortRangeContains")
    @v3.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @v3.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean u1(g gVar, float f7) {
        l0.p(gVar, "<this>");
        Short O1 = O1(f7);
        if (O1 != null) {
            return gVar.a(O1);
        }
        return false;
    }

    public static final long v(long j7, long j8) {
        return j7 < j8 ? j8 : j7;
    }

    @n6.d
    public static final m v0(short s6, long j7) {
        return m.f8500n.a(s6, j7, -1L);
    }

    @s4.h(name = "shortRangeContains")
    public static final boolean v1(@n6.d g<Short> gVar, int i7) {
        l0.p(gVar, "<this>");
        Short P1 = P1(i7);
        if (P1 != null) {
            return gVar.a(P1);
        }
        return false;
    }

    @n6.d
    public static final <T extends Comparable<? super T>> T w(@n6.d T t6, @n6.d T t7) {
        l0.p(t6, "<this>");
        l0.p(t7, "minimumValue");
        return t6.compareTo(t7) < 0 ? t7 : t6;
    }

    @g1(version = "1.7")
    public static final char w0(@n6.d a aVar) {
        l0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            throw new NoSuchElementException("Progression " + aVar + " is empty.");
        }
        return aVar.i();
    }

    @s4.h(name = "shortRangeContains")
    public static final boolean w1(@n6.d g<Short> gVar, long j7) {
        l0.p(gVar, "<this>");
        Short Q1 = Q1(j7);
        if (Q1 != null) {
            return gVar.a(Q1);
        }
        return false;
    }

    public static final short x(short s6, short s7) {
        return s6 < s7 ? s7 : s6;
    }

    @g1(version = "1.7")
    public static final int x0(@n6.d j jVar) {
        l0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            throw new NoSuchElementException("Progression " + jVar + " is empty.");
        }
        return jVar.i();
    }

    @s4.h(name = "shortRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean x1(@n6.d r<Short> rVar, byte b7) {
        l0.p(rVar, "<this>");
        return rVar.a(Short.valueOf(b7));
    }

    public static final byte y(byte b7, byte b8) {
        return b7 > b8 ? b8 : b7;
    }

    @g1(version = "1.7")
    public static final long y0(@n6.d m mVar) {
        l0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            throw new NoSuchElementException("Progression " + mVar + " is empty.");
        }
        return mVar.i();
    }

    @s4.h(name = "shortRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean y1(@n6.d r<Short> rVar, int i7) {
        l0.p(rVar, "<this>");
        Short P1 = P1(i7);
        if (P1 != null) {
            return rVar.a(P1);
        }
        return false;
    }

    public static final double z(double d7, double d8) {
        return d7 > d8 ? d8 : d7;
    }

    @g1(version = "1.7")
    @n6.e
    public static final Character z0(@n6.d a aVar) {
        l0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.i());
    }

    @s4.h(name = "shortRangeContains")
    @g1(version = "1.7")
    @v3.r
    public static final boolean z1(@n6.d r<Short> rVar, long j7) {
        l0.p(rVar, "<this>");
        Short Q1 = Q1(j7);
        if (Q1 != null) {
            return rVar.a(Q1);
        }
        return false;
    }
}