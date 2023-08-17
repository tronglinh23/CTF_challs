package a4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import k4.f;
import s4.h;
import u4.l0;
import v3.b1;
import v3.b2;
import v3.c2;
import v3.g1;
import v3.h2;
import v3.i2;
import v3.k;
import v3.l;
import v3.p2;
import v3.t;
import v3.t0;
import v3.t1;
import v3.u1;
import v3.x1;
import v3.y1;
import x3.p;
import x3.s0;
/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public static final class a extends x3.c<x1> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int[] f209l;

        public a(int[] iArr) {
            this.f209l = iArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return y1.o(this.f209l);
        }

        public boolean b(int i7) {
            return y1.i(this.f209l, i7);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof x1) {
                return b(((x1) obj).l0());
            }
            return false;
        }

        public int d(int i7) {
            return y1.m(this.f209l, i7);
        }

        public int f(int i7) {
            return p.hg(this.f209l, i7);
        }

        public int g(int i7) {
            return p.li(this.f209l, i7);
        }

        @Override // x3.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i7) {
            return x1.d(d(i7));
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof x1) {
                return f(((x1) obj).l0());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return y1.r(this.f209l);
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof x1) {
                return g(((x1) obj).l0());
            }
            return -1;
        }
    }

    /* renamed from: a4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0008b extends x3.c<b2> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ long[] f210l;

        public C0008b(long[] jArr) {
            this.f210l = jArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return c2.o(this.f210l);
        }

        public boolean b(long j7) {
            return c2.i(this.f210l, j7);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof b2) {
                return b(((b2) obj).l0());
            }
            return false;
        }

        public long d(int i7) {
            return c2.m(this.f210l, i7);
        }

        public int f(long j7) {
            return p.ig(this.f210l, j7);
        }

        public int g(long j7) {
            return p.mi(this.f210l, j7);
        }

        @Override // x3.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i7) {
            return b2.d(d(i7));
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof b2) {
                return f(((b2) obj).l0());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return c2.r(this.f210l);
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof b2) {
                return g(((b2) obj).l0());
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends x3.c<t1> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ byte[] f211l;

        public c(byte[] bArr) {
            this.f211l = bArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return u1.o(this.f211l);
        }

        public boolean b(byte b7) {
            return u1.i(this.f211l, b7);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof t1) {
                return b(((t1) obj).j0());
            }
            return false;
        }

        public byte d(int i7) {
            return u1.m(this.f211l, i7);
        }

        public int f(byte b7) {
            return p.dg(this.f211l, b7);
        }

        public int g(byte b7) {
            return p.hi(this.f211l, b7);
        }

        @Override // x3.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i7) {
            return t1.d(d(i7));
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof t1) {
                return f(((t1) obj).j0());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return u1.r(this.f211l);
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof t1) {
                return g(((t1) obj).j0());
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends x3.c<h2> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ short[] f212l;

        public d(short[] sArr) {
            this.f212l = sArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return i2.o(this.f212l);
        }

        public boolean b(short s6) {
            return i2.i(this.f212l, s6);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof h2) {
                return b(((h2) obj).j0());
            }
            return false;
        }

        public short d(int i7) {
            return i2.m(this.f212l, i7);
        }

        public int f(short s6) {
            return p.kg(this.f212l, s6);
        }

        public int g(short s6) {
            return p.oi(this.f212l, s6);
        }

        @Override // x3.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i7) {
            return h2.d(d(i7));
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof h2) {
                return f(((h2) obj).j0());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return i2.r(this.f212l);
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof h2) {
                return g(((h2) obj).j0());
            }
            return -1;
        }
    }

    @g1(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ h2 A(short[] sArr, Comparator comparator) {
        l0.p(sArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        return a4.c.M6(sArr, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ b2 B(long[] jArr, Comparator comparator) {
        l0.p(jArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        return a4.c.N6(jArr, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ x1 C(int[] iArr) {
        l0.p(iArr, "$this$min");
        return a4.c.G7(iArr);
    }

    @g1(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ t1 D(byte[] bArr) {
        l0.p(bArr, "$this$min");
        return a4.c.H7(bArr);
    }

    @g1(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ b2 E(long[] jArr) {
        l0.p(jArr, "$this$min");
        return a4.c.I7(jArr);
    }

    @g1(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ h2 F(short[] sArr) {
        l0.p(sArr, "$this$min");
        return a4.c.J7(sArr);
    }

    @g1(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    public static final /* synthetic */ <R extends Comparable<? super R>> t1 G(byte[] bArr, t4.l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        byte m7 = u1.m(bArr, 0);
        int Re = p.Re(bArr);
        if (Re != 0) {
            R O = lVar.O(t1.d(m7));
            s0 it = new d5.l(1, Re).iterator();
            while (it.hasNext()) {
                byte m8 = u1.m(bArr, it.b());
                R O2 = lVar.O(t1.d(m8));
                if (O.compareTo(O2) > 0) {
                    m7 = m8;
                    O = O2;
                }
            }
        }
        return t1.d(m7);
    }

    @g1(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    public static final /* synthetic */ <R extends Comparable<? super R>> b2 H(long[] jArr, t4.l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        long m7 = c2.m(jArr, 0);
        int We = p.We(jArr);
        if (We != 0) {
            R O = lVar.O(b2.d(m7));
            s0 it = new d5.l(1, We).iterator();
            while (it.hasNext()) {
                long m8 = c2.m(jArr, it.b());
                R O2 = lVar.O(b2.d(m8));
                if (O.compareTo(O2) > 0) {
                    m7 = m8;
                    O = O2;
                }
            }
        }
        return b2.d(m7);
    }

    @g1(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    public static final /* synthetic */ <R extends Comparable<? super R>> x1 I(int[] iArr, t4.l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        int m7 = y1.m(iArr, 0);
        int Ve = p.Ve(iArr);
        if (Ve != 0) {
            R O = lVar.O(x1.d(m7));
            s0 it = new d5.l(1, Ve).iterator();
            while (it.hasNext()) {
                int m8 = y1.m(iArr, it.b());
                R O2 = lVar.O(x1.d(m8));
                if (O.compareTo(O2) > 0) {
                    m7 = m8;
                    O = O2;
                }
            }
        }
        return x1.d(m7);
    }

    @g1(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    public static final /* synthetic */ <R extends Comparable<? super R>> h2 J(short[] sArr, t4.l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        short m7 = i2.m(sArr, 0);
        int Ye = p.Ye(sArr);
        if (Ye != 0) {
            R O = lVar.O(h2.d(m7));
            s0 it = new d5.l(1, Ye).iterator();
            while (it.hasNext()) {
                short m8 = i2.m(sArr, it.b());
                R O2 = lVar.O(h2.d(m8));
                if (O.compareTo(O2) > 0) {
                    m7 = m8;
                    O = O2;
                }
            }
        }
        return h2.d(m7);
    }

    @g1(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ t1 K(byte[] bArr, Comparator comparator) {
        l0.p(bArr, "$this$minWith");
        l0.p(comparator, "comparator");
        return a4.c.O7(bArr, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ x1 L(int[] iArr, Comparator comparator) {
        l0.p(iArr, "$this$minWith");
        l0.p(comparator, "comparator");
        return a4.c.P7(iArr, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ h2 M(short[] sArr, Comparator comparator) {
        l0.p(sArr, "$this$minWith");
        l0.p(comparator, "comparator");
        return a4.c.Q7(sArr, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ b2 N(long[] jArr, Comparator comparator) {
        l0.p(jArr, "$this$minWith");
        l0.p(comparator, "comparator");
        return a4.c.R7(jArr, comparator);
    }

    @h(name = "sumOfBigDecimal")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final BigDecimal O(byte[] bArr, t4.l<? super t1, ? extends BigDecimal> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            valueOf = valueOf.add(lVar.O(t1.d(u1.m(bArr, i7))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigDecimal")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final BigDecimal P(int[] iArr, t4.l<? super x1, ? extends BigDecimal> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            valueOf = valueOf.add(lVar.O(x1.d(y1.m(iArr, i7))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigDecimal")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final BigDecimal Q(long[] jArr, t4.l<? super b2, ? extends BigDecimal> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            valueOf = valueOf.add(lVar.O(b2.d(c2.m(jArr, i7))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigDecimal")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final BigDecimal R(short[] sArr, t4.l<? super h2, ? extends BigDecimal> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            valueOf = valueOf.add(lVar.O(h2.d(i2.m(sArr, i7))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigInteger")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final BigInteger S(byte[] bArr, t4.l<? super t1, ? extends BigInteger> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            valueOf = valueOf.add(lVar.O(t1.d(u1.m(bArr, i7))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigInteger")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final BigInteger T(int[] iArr, t4.l<? super x1, ? extends BigInteger> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            valueOf = valueOf.add(lVar.O(x1.d(y1.m(iArr, i7))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigInteger")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final BigInteger U(long[] jArr, t4.l<? super b2, ? extends BigInteger> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            valueOf = valueOf.add(lVar.O(b2.d(c2.m(jArr, i7))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigInteger")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final BigInteger V(short[] sArr, t4.l<? super h2, ? extends BigInteger> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            valueOf = valueOf.add(lVar.O(h2.d(i2.m(sArr, i7))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<x1> a(@n6.d int[] iArr) {
        l0.p(iArr, "$this$asList");
        return new a(iArr);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<t1> b(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$asList");
        return new c(bArr);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<b2> c(@n6.d long[] jArr) {
        l0.p(jArr, "$this$asList");
        return new C0008b(jArr);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<h2> d(@n6.d short[] sArr) {
        l0.p(sArr, "$this$asList");
        return new d(sArr);
    }

    @g1(version = "1.3")
    @t
    public static final int e(@n6.d int[] iArr, int i7, int i8, int i9) {
        l0.p(iArr, "$this$binarySearch");
        x3.c.f18278k.d(i8, i9, y1.o(iArr));
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int c7 = p2.c(iArr[i11], i7);
            if (c7 < 0) {
                i8 = i11 + 1;
            } else if (c7 <= 0) {
                return i11;
            } else {
                i10 = i11 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static /* synthetic */ int f(int[] iArr, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = y1.o(iArr);
        }
        return e(iArr, i7, i8, i9);
    }

    @g1(version = "1.3")
    @t
    public static final int g(@n6.d short[] sArr, short s6, int i7, int i8) {
        l0.p(sArr, "$this$binarySearch");
        x3.c.f18278k.d(i7, i8, i2.o(sArr));
        int i9 = s6 & h2.f17796n;
        int i10 = i8 - 1;
        while (i7 <= i10) {
            int i11 = (i7 + i10) >>> 1;
            int c7 = p2.c(sArr[i11], i9);
            if (c7 < 0) {
                i7 = i11 + 1;
            } else if (c7 <= 0) {
                return i11;
            } else {
                i10 = i11 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static /* synthetic */ int h(short[] sArr, short s6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = i2.o(sArr);
        }
        return g(sArr, s6, i7, i8);
    }

    @g1(version = "1.3")
    @t
    public static final int i(@n6.d long[] jArr, long j7, int i7, int i8) {
        l0.p(jArr, "$this$binarySearch");
        x3.c.f18278k.d(i7, i8, c2.o(jArr));
        int i9 = i8 - 1;
        while (i7 <= i9) {
            int i10 = (i7 + i9) >>> 1;
            int g7 = p2.g(jArr[i10], j7);
            if (g7 < 0) {
                i7 = i10 + 1;
            } else if (g7 <= 0) {
                return i10;
            } else {
                i9 = i10 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static /* synthetic */ int j(long[] jArr, long j7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = c2.o(jArr);
        }
        return i(jArr, j7, i7, i8);
    }

    @g1(version = "1.3")
    @t
    public static final int k(@n6.d byte[] bArr, byte b7, int i7, int i8) {
        l0.p(bArr, "$this$binarySearch");
        x3.c.f18278k.d(i7, i8, u1.o(bArr));
        int i9 = b7 & t1.f17828n;
        int i10 = i8 - 1;
        while (i7 <= i10) {
            int i11 = (i7 + i10) >>> 1;
            int c7 = p2.c(bArr[i11], i9);
            if (c7 < 0) {
                i7 = i11 + 1;
            } else if (c7 <= 0) {
                return i11;
            } else {
                i10 = i11 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static /* synthetic */ int l(byte[] bArr, byte b7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = u1.o(bArr);
        }
        return k(bArr, b7, i7, i8);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte m(byte[] bArr, int i7) {
        l0.p(bArr, "$this$elementAt");
        return u1.m(bArr, i7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short n(short[] sArr, int i7) {
        l0.p(sArr, "$this$elementAt");
        return i2.m(sArr, i7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int o(int[] iArr, int i7) {
        l0.p(iArr, "$this$elementAt");
        return y1.m(iArr, i7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long p(long[] jArr, int i7) {
        l0.p(jArr, "$this$elementAt");
        return c2.m(jArr, i7);
    }

    @g1(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ x1 q(int[] iArr) {
        l0.p(iArr, "$this$max");
        return a4.c.C6(iArr);
    }

    @g1(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ t1 r(byte[] bArr) {
        l0.p(bArr, "$this$max");
        return a4.c.D6(bArr);
    }

    @g1(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ b2 s(long[] jArr) {
        l0.p(jArr, "$this$max");
        return a4.c.E6(jArr);
    }

    @g1(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ h2 t(short[] sArr) {
        l0.p(sArr, "$this$max");
        return a4.c.F6(sArr);
    }

    @g1(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    public static final /* synthetic */ <R extends Comparable<? super R>> t1 u(byte[] bArr, t4.l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        byte m7 = u1.m(bArr, 0);
        int Re = p.Re(bArr);
        if (Re != 0) {
            R O = lVar.O(t1.d(m7));
            s0 it = new d5.l(1, Re).iterator();
            while (it.hasNext()) {
                byte m8 = u1.m(bArr, it.b());
                R O2 = lVar.O(t1.d(m8));
                if (O.compareTo(O2) < 0) {
                    m7 = m8;
                    O = O2;
                }
            }
        }
        return t1.d(m7);
    }

    @g1(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    public static final /* synthetic */ <R extends Comparable<? super R>> b2 v(long[] jArr, t4.l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        long m7 = c2.m(jArr, 0);
        int We = p.We(jArr);
        if (We != 0) {
            R O = lVar.O(b2.d(m7));
            s0 it = new d5.l(1, We).iterator();
            while (it.hasNext()) {
                long m8 = c2.m(jArr, it.b());
                R O2 = lVar.O(b2.d(m8));
                if (O.compareTo(O2) < 0) {
                    m7 = m8;
                    O = O2;
                }
            }
        }
        return b2.d(m7);
    }

    @g1(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    public static final /* synthetic */ <R extends Comparable<? super R>> x1 w(int[] iArr, t4.l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        int m7 = y1.m(iArr, 0);
        int Ve = p.Ve(iArr);
        if (Ve != 0) {
            R O = lVar.O(x1.d(m7));
            s0 it = new d5.l(1, Ve).iterator();
            while (it.hasNext()) {
                int m8 = y1.m(iArr, it.b());
                R O2 = lVar.O(x1.d(m8));
                if (O.compareTo(O2) < 0) {
                    m7 = m8;
                    O = O2;
                }
            }
        }
        return x1.d(m7);
    }

    @g1(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    public static final /* synthetic */ <R extends Comparable<? super R>> h2 x(short[] sArr, t4.l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        short m7 = i2.m(sArr, 0);
        int Ye = p.Ye(sArr);
        if (Ye != 0) {
            R O = lVar.O(h2.d(m7));
            s0 it = new d5.l(1, Ye).iterator();
            while (it.hasNext()) {
                short m8 = i2.m(sArr, it.b());
                R O2 = lVar.O(h2.d(m8));
                if (O.compareTo(O2) < 0) {
                    m7 = m8;
                    O = O2;
                }
            }
        }
        return h2.d(m7);
    }

    @g1(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ t1 y(byte[] bArr, Comparator comparator) {
        l0.p(bArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        return a4.c.K6(bArr, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ x1 z(int[] iArr, Comparator comparator) {
        l0.p(iArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        return a4.c.L6(iArr, comparator);
    }
}
