package k5;

import d5.u;
import i5.b0;
import i5.c0;
import i5.e0;
import java.util.Collection;
import java.util.Iterator;
import u4.l0;
import u4.r1;
import v3.b1;
import v3.g1;
import v3.q2;
import x3.s0;
@r1({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1484:1\n1436#1,6:1486\n1439#1,3:1492\n1436#1,6:1495\n1436#1,6:1501\n1439#1,3:1510\n1#2:1485\n1726#3,3:1507\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1360#1:1486,6\n1394#1:1492,3\n1397#1:1495,6\n1400#1:1501,6\n1436#1:1510,3\n1425#1:1507,3\n*E\n"})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final int f11790a = 1000000;

    /* renamed from: b */
    public static final long f11791b = 4611686018426999999L;

    /* renamed from: c */
    public static final long f11792c = 4611686018427387903L;

    /* renamed from: d */
    public static final long f11793d = 4611686018426L;

    public static final long A(int i7) {
        return m0(i7, h.MICROSECONDS);
    }

    public static final long B(long j7) {
        return n0(j7, h.MICROSECONDS);
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void C(double d7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void D(int i7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void E(long j7) {
    }

    public static final long F(double d7) {
        return l0(d7, h.MILLISECONDS);
    }

    public static final long G(int i7) {
        return m0(i7, h.MILLISECONDS);
    }

    public static final long H(long j7) {
        return n0(j7, h.MILLISECONDS);
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void I(double d7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void J(int i7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void K(long j7) {
    }

    public static final long L(double d7) {
        return l0(d7, h.MINUTES);
    }

    public static final long M(int i7) {
        return m0(i7, h.MINUTES);
    }

    public static final long N(long j7) {
        return n0(j7, h.MINUTES);
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void O(double d7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void P(int i7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void Q(long j7) {
    }

    public static final long R(double d7) {
        return l0(d7, h.NANOSECONDS);
    }

    public static final long S(int i7) {
        return m0(i7, h.NANOSECONDS);
    }

    public static final long T(long j7) {
        return n0(j7, h.NANOSECONDS);
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void U(double d7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void V(int i7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void W(long j7) {
    }

    public static final long X(double d7) {
        return l0(d7, h.SECONDS);
    }

    public static final long Y(int i7) {
        return m0(i7, h.SECONDS);
    }

    public static final long Z(long j7) {
        return n0(j7, h.SECONDS);
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void a0(double d7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void b0(int i7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void c0(long j7) {
    }

    public static final long d0(long j7) {
        return j7 * 1000000;
    }

    public static final long e0(long j7) {
        return j7 / 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x009a A[LOOP:1: B:220:0x006c->B:231:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00a6 A[EDGE_INSN: B:354:0x00a6->B:233:0x00a6 BREAK  A[LOOP:1: B:220:0x006c->B:231:0x009a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long f0(java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.g.f0(java.lang.String, boolean):long");
    }

    public static final long g0(String str) {
        boolean z6;
        int length = str.length();
        int i7 = (length <= 0 || !c0.V2("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i7 > 16) {
            d5.l lVar = new d5.l(i7, c0.j3(str));
            if (!(lVar instanceof Collection) || !((Collection) lVar).isEmpty()) {
                Iterator<Integer> it = lVar.iterator();
                while (it.hasNext()) {
                    if (!new d5.c('0', '9').n(str.charAt(((s0) it).b()))) {
                        z6 = false;
                        break;
                    }
                }
            }
            z6 = true;
            if (z6) {
                return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        if (b0.v2(str, "+", false, 2, null)) {
            str = e0.B6(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final int h0(String str, int i7, t4.l<? super Character, Boolean> lVar) {
        while (i7 < str.length() && lVar.O(Character.valueOf(str.charAt(i7))).booleanValue()) {
            i7++;
        }
        return i7;
    }

    public static final long i(long j7, int i7) {
        return e.m((j7 << 1) + i7);
    }

    public static final String i0(String str, int i7, t4.l<? super Character, Boolean> lVar) {
        int i8 = i7;
        while (i8 < str.length() && lVar.O(Character.valueOf(str.charAt(i8))).booleanValue()) {
            i8++;
        }
        l0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i7, i8);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final long j(long j7) {
        return e.m((j7 << 1) + 1);
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {l.class})
    public static final long j0(double d7, long j7) {
        return e.i0(j7, d7);
    }

    public static final long k(long j7) {
        return new d5.o(-4611686018426L, f11793d).n(j7) ? l(d0(j7)) : j(u.K(j7, -4611686018427387903L, 4611686018427387903L));
    }

    @g1(version = "1.6")
    @k4.f
    @q2(markerClass = {l.class})
    public static final long k0(int i7, long j7) {
        return e.j0(j7, i7);
    }

    public static final long l(long j7) {
        return e.m(j7 << 1);
    }

    @g1(version = "1.6")
    @q2(markerClass = {l.class})
    public static final long l0(double d7, @n6.d h hVar) {
        l0.p(hVar, "unit");
        double a7 = j.a(d7, hVar, h.NANOSECONDS);
        if ((!Double.isNaN(a7)) == true) {
            long M0 = z4.d.M0(a7);
            return new d5.o(-4611686018426999999L, f11791b).n(M0) ? l(M0) : k(z4.d.M0(j.a(d7, hVar, h.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final long m(long j7) {
        return new d5.o(-4611686018426999999L, f11791b).n(j7) ? l(j7) : j(e0(j7));
    }

    @g1(version = "1.6")
    @q2(markerClass = {l.class})
    public static final long m0(int i7, @n6.d h hVar) {
        l0.p(hVar, "unit");
        return hVar.compareTo(h.SECONDS) <= 0 ? l(j.c(i7, hVar, h.NANOSECONDS)) : n0(i7, hVar);
    }

    public static final long n(double d7) {
        return l0(d7, h.DAYS);
    }

    @g1(version = "1.6")
    @q2(markerClass = {l.class})
    public static final long n0(long j7, @n6.d h hVar) {
        l0.p(hVar, "unit");
        h hVar2 = h.NANOSECONDS;
        long c7 = j.c(f11791b, hVar2, hVar);
        return new d5.o(-c7, c7).n(j7) ? l(j.c(j7, hVar, hVar2)) : j(u.K(j.b(j7, hVar, h.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    public static final long o(int i7) {
        return m0(i7, h.DAYS);
    }

    public static final long p(long j7) {
        return n0(j7, h.DAYS);
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void q(double d7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void r(int i7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void s(long j7) {
    }

    public static final long t(double d7) {
        return l0(d7, h.HOURS);
    }

    public static final long u(int i7) {
        return m0(i7, h.HOURS);
    }

    public static final long v(long j7) {
        return n0(j7, h.HOURS);
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void w(double d7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void x(int i7) {
    }

    @g1(version = "1.3")
    @v3.k(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    @l
    public static /* synthetic */ void y(long j7) {
    }

    public static final long z(double d7) {
        return l0(d7, h.MICROSECONDS);
    }
}
