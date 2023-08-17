package k5;

import d5.u;
import i5.c0;
import kotlinx.coroutines.x1;
import s2.t0;
import u4.l0;
import u4.r1;
import u4.w;
import v3.a1;
import v3.b1;
import v3.g1;
import v3.q2;
@g1(version = "1.6")
@s4.f
@r1({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1484:1\n38#1:1485\n38#1:1486\n38#1:1487\n38#1:1488\n38#1:1489\n672#1,2:1490\n689#1,2:1499\n163#2,6:1492\n1#3:1498\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1485\n40#1:1486\n458#1:1487\n478#1:1488\n651#1:1489\n968#1:1490,2\n1059#1:1499,2\n1010#1:1492,6\n*E\n"})
@q2(markerClass = {l.class})
/* loaded from: classes.dex */
public final class e implements Comparable<e> {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final a f11783l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public static final long f11784m = m(0);

    /* renamed from: n  reason: collision with root package name */
    public static final long f11785n = g.b(4611686018427387903L);

    /* renamed from: o  reason: collision with root package name */
    public static final long f11786o = g.b(-4611686018427387903L);

    /* renamed from: k  reason: collision with root package name */
    public final long f11787k;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        @k4.f
        public static /* synthetic */ void A(double d7) {
        }

        @k4.f
        public static /* synthetic */ void B(int i7) {
        }

        @k4.f
        public static /* synthetic */ void C(long j7) {
        }

        @k4.f
        public static /* synthetic */ void G(double d7) {
        }

        @k4.f
        public static /* synthetic */ void H(int i7) {
        }

        @k4.f
        public static /* synthetic */ void I(long j7) {
        }

        @k4.f
        public static /* synthetic */ void N(double d7) {
        }

        @k4.f
        public static /* synthetic */ void O(int i7) {
        }

        @k4.f
        public static /* synthetic */ void P(long j7) {
        }

        @k4.f
        public static /* synthetic */ void T(double d7) {
        }

        @k4.f
        public static /* synthetic */ void U(int i7) {
        }

        @k4.f
        public static /* synthetic */ void V(long j7) {
        }

        @k4.f
        public static /* synthetic */ void h(double d7) {
        }

        @k4.f
        public static /* synthetic */ void i(int i7) {
        }

        @k4.f
        public static /* synthetic */ void j(long j7) {
        }

        @k4.f
        public static /* synthetic */ void n(double d7) {
        }

        @k4.f
        public static /* synthetic */ void o(int i7) {
        }

        @k4.f
        public static /* synthetic */ void p(long j7) {
        }

        @k4.f
        public static /* synthetic */ void u(double d7) {
        }

        @k4.f
        public static /* synthetic */ void v(int i7) {
        }

        @k4.f
        public static /* synthetic */ void w(long j7) {
        }

        public final long D(double d7) {
            return g.l0(d7, h.MINUTES);
        }

        public final long E(int i7) {
            return g.m0(i7, h.MINUTES);
        }

        public final long F(long j7) {
            return g.n0(j7, h.MINUTES);
        }

        public final long J() {
            return e.f11786o;
        }

        public final long K(double d7) {
            return g.l0(d7, h.NANOSECONDS);
        }

        public final long L(int i7) {
            return g.m0(i7, h.NANOSECONDS);
        }

        public final long M(long j7) {
            return g.n0(j7, h.NANOSECONDS);
        }

        public final long Q(double d7) {
            return g.l0(d7, h.SECONDS);
        }

        public final long R(int i7) {
            return g.m0(i7, h.SECONDS);
        }

        public final long S(long j7) {
            return g.n0(j7, h.SECONDS);
        }

        public final long W() {
            return e.f11784m;
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long X(double d7) {
            return g.l0(d7, h.HOURS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long Y(int i7) {
            return g.m0(i7, h.HOURS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long Z(long j7) {
            return g.n0(j7, h.HOURS);
        }

        @l
        public final double a(double d7, @n6.d h hVar, @n6.d h hVar2) {
            l0.p(hVar, "sourceUnit");
            l0.p(hVar2, "targetUnit");
            return j.a(d7, hVar, hVar2);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long a0(double d7) {
            return g.l0(d7, h.MICROSECONDS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long b(double d7) {
            return g.l0(d7, h.DAYS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long b0(int i7) {
            return g.m0(i7, h.MICROSECONDS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long c(int i7) {
            return g.m0(i7, h.DAYS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long c0(long j7) {
            return g.n0(j7, h.MICROSECONDS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long d(long j7) {
            return g.n0(j7, h.DAYS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long d0(double d7) {
            return g.l0(d7, h.MILLISECONDS);
        }

        public final long e(double d7) {
            return g.l0(d7, h.DAYS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long e0(int i7) {
            return g.m0(i7, h.MILLISECONDS);
        }

        public final long f(int i7) {
            return g.m0(i7, h.DAYS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long f0(long j7) {
            return g.n0(j7, h.MILLISECONDS);
        }

        public final long g(long j7) {
            return g.n0(j7, h.DAYS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long g0(double d7) {
            return g.l0(d7, h.MINUTES);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long h0(int i7) {
            return g.m0(i7, h.MINUTES);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long i0(long j7) {
            return g.n0(j7, h.MINUTES);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long j0(double d7) {
            return g.l0(d7, h.NANOSECONDS);
        }

        public final long k(double d7) {
            return g.l0(d7, h.HOURS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long k0(int i7) {
            return g.m0(i7, h.NANOSECONDS);
        }

        public final long l(int i7) {
            return g.m0(i7, h.HOURS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long l0(long j7) {
            return g.n0(j7, h.NANOSECONDS);
        }

        public final long m(long j7) {
            return g.n0(j7, h.HOURS);
        }

        public final long m0(@n6.d String str) {
            l0.p(str, "value");
            try {
                return g.h(str, false);
            } catch (IllegalArgumentException e7) {
                throw new IllegalArgumentException("Invalid duration string format: '" + str + "'.", e7);
            }
        }

        public final long n0(@n6.d String str) {
            l0.p(str, "value");
            try {
                return g.h(str, true);
            } catch (IllegalArgumentException e7) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e7);
            }
        }

        @n6.e
        public final e o0(@n6.d String str) {
            l0.p(str, "value");
            try {
                return e.j(g.h(str, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @n6.e
        public final e p0(@n6.d String str) {
            l0.p(str, "value");
            try {
                return e.j(g.h(str, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final long q() {
            return e.f11785n;
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long q0(double d7) {
            return g.l0(d7, h.SECONDS);
        }

        public final long r(double d7) {
            return g.l0(d7, h.MICROSECONDS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long r0(int i7) {
            return g.m0(i7, h.SECONDS);
        }

        public final long s(int i7) {
            return g.m0(i7, h.MICROSECONDS);
        }

        @g1(version = "1.5")
        @v3.k(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @v3.l(errorSince = "1.8", warningSince = "1.6")
        @l
        public final long s0(long j7) {
            return g.n0(j7, h.SECONDS);
        }

        public final long t(long j7) {
            return g.n0(j7, h.MICROSECONDS);
        }

        public final long x(double d7) {
            return g.l0(d7, h.MILLISECONDS);
        }

        public final long y(int i7) {
            return g.m0(i7, h.MILLISECONDS);
        }

        public final long z(long j7) {
            return g.n0(j7, h.MILLISECONDS);
        }

        public a() {
        }
    }

    public /* synthetic */ e(long j7) {
        this.f11787k = j7;
    }

    public static final double A(long j7) {
        return o0(j7, h.MICROSECONDS);
    }

    @l
    @v3.k(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    public static /* synthetic */ void B() {
    }

    public static final double C(long j7) {
        return o0(j7, h.MILLISECONDS);
    }

    @l
    @v3.k(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    public static /* synthetic */ void D() {
    }

    public static final double E(long j7) {
        return o0(j7, h.MINUTES);
    }

    @l
    @v3.k(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    public static /* synthetic */ void F() {
    }

    public static final double G(long j7) {
        return o0(j7, h.NANOSECONDS);
    }

    @l
    @v3.k(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    public static /* synthetic */ void H() {
    }

    public static final double I(long j7) {
        return o0(j7, h.SECONDS);
    }

    public static final long J(long j7) {
        return r0(j7, h.DAYS);
    }

    public static final long K(long j7) {
        return r0(j7, h.HOURS);
    }

    public static final long L(long j7) {
        return r0(j7, h.MICROSECONDS);
    }

    public static final long M(long j7) {
        return (b0(j7) && a0(j7)) ? Y(j7) : r0(j7, h.MILLISECONDS);
    }

    public static final long N(long j7) {
        return r0(j7, h.MINUTES);
    }

    public static final long O(long j7) {
        long Y = Y(j7);
        if (c0(j7)) {
            return Y;
        }
        if (Y > x1.f13168f) {
            return Long.MAX_VALUE;
        }
        if (Y < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return g.f(Y);
    }

    public static final long P(long j7) {
        return r0(j7, h.SECONDS);
    }

    @a1
    public static /* synthetic */ void Q() {
    }

    public static final int R(long j7) {
        if (d0(j7)) {
            return 0;
        }
        return (int) (N(j7) % 60);
    }

    @a1
    public static /* synthetic */ void S() {
    }

    public static final int T(long j7) {
        if (d0(j7)) {
            return 0;
        }
        return (int) (b0(j7) ? g.f(Y(j7) % 1000) : Y(j7) % ((long) a6.f.S));
    }

    @a1
    public static /* synthetic */ void U() {
    }

    public static final int V(long j7) {
        if (d0(j7)) {
            return 0;
        }
        return (int) (P(j7) % 60);
    }

    public static final h W(long j7) {
        return c0(j7) ? h.NANOSECONDS : h.MILLISECONDS;
    }

    public static final int X(long j7) {
        return ((int) j7) & 1;
    }

    public static final long Y(long j7) {
        return j7 >> 1;
    }

    public static int Z(long j7) {
        return Long.hashCode(j7);
    }

    public static final boolean a0(long j7) {
        return !d0(j7);
    }

    public static final boolean b0(long j7) {
        return (((int) j7) & 1) == 1;
    }

    public static final boolean c0(long j7) {
        return (((int) j7) & 1) == 0;
    }

    public static final boolean d0(long j7) {
        return j7 == f11785n || j7 == f11786o;
    }

    public static final boolean e0(long j7) {
        return j7 < 0;
    }

    public static final boolean f0(long j7) {
        return j7 > 0;
    }

    public static final long g0(long j7, long j8) {
        return h0(j7, x0(j8));
    }

    public static final long h(long j7, long j8, long j9) {
        long g7 = g.g(j9);
        long j10 = j8 + g7;
        if (new d5.o(-4611686018426L, g.f11793d).n(j10)) {
            return g.d(g.f(j10) + (j9 - g.f(g7)));
        }
        return g.b(u.K(j10, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long h0(long j7, long j8) {
        if (d0(j7)) {
            if (a0(j8) || (j8 ^ j7) >= 0) {
                return j7;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (d0(j8)) {
            return j8;
        } else {
            if ((((int) j7) & 1) != (((int) j8) & 1)) {
                return b0(j7) ? h(j7, Y(j7), Y(j8)) : h(j7, Y(j8), Y(j7));
            }
            long Y = Y(j7) + Y(j8);
            return c0(j7) ? g.e(Y) : g.c(Y);
        }
    }

    public static final void i(long j7, StringBuilder sb, int i7, int i8, int i9, String str, boolean z6) {
        sb.append(i7);
        if (i8 != 0) {
            sb.append('.');
            String U3 = c0.U3(String.valueOf(i8), i9, '0');
            int i10 = -1;
            int length = U3.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (U3.charAt(length) != '0') {
                        i10 = length;
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        length = i11;
                    }
                }
            }
            int i12 = i10 + 1;
            if (z6 || i12 >= 3) {
                sb.append((CharSequence) U3, 0, ((i12 + 2) / 3) * 3);
                l0.o(sb, "this.append(value, startIndex, endIndex)");
            } else {
                sb.append((CharSequence) U3, 0, i12);
                l0.o(sb, "this.append(value, startIndex, endIndex)");
            }
        }
        sb.append(str);
    }

    public static final long i0(long j7, double d7) {
        int K0 = z4.d.K0(d7);
        if (((double) K0) == d7) {
            return j0(j7, K0);
        }
        h W = W(j7);
        return g.l0(o0(j7, W) * d7, W);
    }

    public static final /* synthetic */ e j(long j7) {
        return new e(j7);
    }

    public static final long j0(long j7, int i7) {
        if (d0(j7)) {
            if (i7 != 0) {
                return i7 > 0 ? j7 : x0(j7);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        } else if (i7 == 0) {
            return f11784m;
        } else {
            long Y = Y(j7);
            long j8 = i7;
            long j9 = Y * j8;
            if (!c0(j7)) {
                return j9 / j8 == Y ? g.b(u.L(j9, new d5.o(-4611686018427387903L, 4611686018427387903L))) : z4.d.V(Y) * z4.d.U(i7) > 0 ? f11785n : f11786o;
            } else if (new d5.o(-2147483647L, 2147483647L).n(Y)) {
                return g.d(j9);
            } else {
                if (j9 / j8 == Y) {
                    return g.e(j9);
                }
                long g7 = g.g(Y);
                long j10 = g7 * j8;
                long g8 = g.g((Y - g.f(g7)) * j8) + j10;
                return (j10 / j8 != g7 || (g8 ^ j10) < 0) ? z4.d.V(Y) * z4.d.U(i7) > 0 ? f11785n : f11786o : g.b(u.L(g8, new d5.o(-4611686018427387903L, 4611686018427387903L)));
            }
        }
    }

    public static final <T> T k0(long j7, @n6.d t4.p<? super Long, ? super Integer, ? extends T> pVar) {
        l0.p(pVar, t0.f16450f);
        return pVar.J(Long.valueOf(P(j7)), Integer.valueOf(T(j7)));
    }

    public static int l(long j7, long j8) {
        long j9 = j7 ^ j8;
        if (j9 < 0 || (((int) j9) & 1) == 0) {
            return l0.u(j7, j8);
        }
        int i7 = (((int) j7) & 1) - (((int) j8) & 1);
        return e0(j7) ? -i7 : i7;
    }

    public static final <T> T l0(long j7, @n6.d t4.q<? super Long, ? super Integer, ? super Integer, ? extends T> qVar) {
        l0.p(qVar, t0.f16450f);
        return qVar.I(Long.valueOf(N(j7)), Integer.valueOf(V(j7)), Integer.valueOf(T(j7)));
    }

    public static long m(long j7) {
        if (f.d()) {
            if (c0(j7)) {
                if (!new d5.o(-4611686018426999999L, g.f11791b).n(Y(j7))) {
                    throw new AssertionError(Y(j7) + " ns is out of nanoseconds range");
                }
            } else if (!new d5.o(-4611686018427387903L, 4611686018427387903L).n(Y(j7))) {
                throw new AssertionError(Y(j7) + " ms is out of milliseconds range");
            } else if (new d5.o(-4611686018426L, g.f11793d).n(Y(j7))) {
                throw new AssertionError(Y(j7) + " ms is denormalized");
            }
        }
        return j7;
    }

    public static final <T> T m0(long j7, @n6.d t4.r<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> rVar) {
        l0.p(rVar, t0.f16450f);
        return rVar.l0(Long.valueOf(K(j7)), Integer.valueOf(R(j7)), Integer.valueOf(V(j7)), Integer.valueOf(T(j7)));
    }

    public static final double n(long j7, long j8) {
        h hVar = (h) b4.h.X(W(j7), W(j8));
        return o0(j7, hVar) / o0(j8, hVar);
    }

    public static final <T> T n0(long j7, @n6.d t4.s<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> sVar) {
        l0.p(sVar, t0.f16450f);
        return sVar.P(Long.valueOf(J(j7)), Integer.valueOf(u(j7)), Integer.valueOf(R(j7)), Integer.valueOf(V(j7)), Integer.valueOf(T(j7)));
    }

    public static final long o(long j7, double d7) {
        int K0 = z4.d.K0(d7);
        if (!(((double) K0) == d7) || K0 == 0) {
            h W = W(j7);
            return g.l0(o0(j7, W) / d7, W);
        }
        return p(j7, K0);
    }

    public static final double o0(long j7, @n6.d h hVar) {
        l0.p(hVar, "unit");
        if (j7 == f11785n) {
            return Double.POSITIVE_INFINITY;
        }
        if (j7 == f11786o) {
            return Double.NEGATIVE_INFINITY;
        }
        return j.a(Y(j7), W(j7), hVar);
    }

    public static final long p(long j7, int i7) {
        if (i7 == 0) {
            if (f0(j7)) {
                return f11785n;
            }
            if (e0(j7)) {
                return f11786o;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        } else if (c0(j7)) {
            return g.d(Y(j7) / i7);
        } else {
            if (d0(j7)) {
                return j0(j7, z4.d.U(i7));
            }
            long j8 = i7;
            long Y = Y(j7) / j8;
            if (new d5.o(-4611686018426L, g.f11793d).n(Y)) {
                return g.d(g.f(Y) + (g.f(Y(j7) - (Y * j8)) / j8));
            }
            return g.b(Y);
        }
    }

    public static final int p0(long j7, @n6.d h hVar) {
        l0.p(hVar, "unit");
        return (int) u.K(r0(j7, hVar), -2147483648L, 2147483647L);
    }

    public static boolean q(long j7, Object obj) {
        return (obj instanceof e) && j7 == ((e) obj).y0();
    }

    @n6.d
    public static final String q0(long j7) {
        StringBuilder sb = new StringBuilder();
        if (e0(j7)) {
            sb.append('-');
        }
        sb.append("PT");
        long s6 = s(j7);
        long K = K(s6);
        int R = R(s6);
        int V = V(s6);
        int T = T(s6);
        if (d0(j7)) {
            K = 9999999999999L;
        }
        boolean z6 = true;
        boolean z7 = K != 0;
        boolean z8 = (V == 0 && T == 0) ? false : true;
        if (R == 0 && (!z8 || !z7)) {
            z6 = false;
        }
        if (z7) {
            sb.append(K);
            sb.append('H');
        }
        if (z6) {
            sb.append(R);
            sb.append('M');
        }
        if (z8 || (!z7 && !z6)) {
            i(j7, sb, V, T, 9, "S", true);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final boolean r(long j7, long j8) {
        return j7 == j8;
    }

    public static final long r0(long j7, @n6.d h hVar) {
        l0.p(hVar, "unit");
        if (j7 == f11785n) {
            return Long.MAX_VALUE;
        }
        if (j7 == f11786o) {
            return Long.MIN_VALUE;
        }
        return j.b(Y(j7), W(j7), hVar);
    }

    public static final long s(long j7) {
        return e0(j7) ? x0(j7) : j7;
    }

    @l
    @v3.k(message = "Use inWholeMilliseconds property instead.", replaceWith = @b1(expression = "this.inWholeMilliseconds", imports = {}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    public static final long s0(long j7) {
        return M(j7);
    }

    @a1
    public static /* synthetic */ void t() {
    }

    @l
    @v3.k(message = "Use inWholeNanoseconds property instead.", replaceWith = @b1(expression = "this.inWholeNanoseconds", imports = {}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    public static final long t0(long j7) {
        return O(j7);
    }

    public static final int u(long j7) {
        if (d0(j7)) {
            return 0;
        }
        return (int) (K(j7) % 24);
    }

    @n6.d
    public static String u0(long j7) {
        if (j7 == 0) {
            return "0s";
        }
        if (j7 == f11785n) {
            return "Infinity";
        }
        if (j7 == f11786o) {
            return "-Infinity";
        }
        boolean e02 = e0(j7);
        StringBuilder sb = new StringBuilder();
        if (e02) {
            sb.append('-');
        }
        long s6 = s(j7);
        long J = J(s6);
        int u6 = u(s6);
        int R = R(s6);
        int V = V(s6);
        int T = T(s6);
        int i7 = 0;
        boolean z6 = J != 0;
        boolean z7 = u6 != 0;
        boolean z8 = R != 0;
        boolean z9 = (V == 0 && T == 0) ? false : true;
        if (z6) {
            sb.append(J);
            sb.append('d');
            i7 = 1;
        }
        if (z7 || (z6 && (z8 || z9))) {
            int i8 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(u6);
            sb.append('h');
            i7 = i8;
        }
        if (z8 || (z9 && (z7 || z6))) {
            int i9 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(R);
            sb.append('m');
            i7 = i9;
        }
        if (z9) {
            int i10 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            if (V != 0 || z6 || z7 || z8) {
                i(j7, sb, V, T, 9, "s", false);
            } else if (T >= 1000000) {
                i(j7, sb, T / 1000000, T % 1000000, 6, "ms", false);
            } else if (T >= 1000) {
                i(j7, sb, T / 1000, T % 1000, 3, "us", false);
            } else {
                sb.append(T);
                sb.append("ns");
            }
            i7 = i10;
        }
        if (e02 && i7 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @v3.k(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    public static /* synthetic */ void v() {
    }

    @n6.d
    public static final String v0(long j7, @n6.d h hVar, int i7) {
        l0.p(hVar, "unit");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i7).toString());
        }
        double o02 = o0(j7, hVar);
        if (Double.isInfinite(o02)) {
            return String.valueOf(o02);
        }
        return f.b(o02, u.B(i7, 12)) + k.h(hVar);
    }

    public static final double w(long j7) {
        return o0(j7, h.DAYS);
    }

    public static /* synthetic */ String w0(long j7, h hVar, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return v0(j7, hVar, i7);
    }

    @l
    @v3.k(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    public static /* synthetic */ void x() {
    }

    public static final long x0(long j7) {
        return g.a(-Y(j7), ((int) j7) & 1);
    }

    public static final double y(long j7) {
        return o0(j7, h.HOURS);
    }

    @l
    @v3.k(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @b1(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @v3.l(errorSince = "1.8", warningSince = "1.5")
    public static /* synthetic */ void z() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(e eVar) {
        return k(eVar.y0());
    }

    public boolean equals(Object obj) {
        return q(this.f11787k, obj);
    }

    public int hashCode() {
        return Z(this.f11787k);
    }

    public int k(long j7) {
        return l(this.f11787k, j7);
    }

    @n6.d
    public String toString() {
        return u0(this.f11787k);
    }

    public final /* synthetic */ long y0() {
        return this.f11787k;
    }
}
