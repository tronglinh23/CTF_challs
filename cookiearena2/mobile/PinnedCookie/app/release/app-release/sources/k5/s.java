package k5;

import k5.d;
import u4.l0;
import v3.g1;
@l
@g1(version = "1.3")
/* loaded from: classes.dex */
public interface s {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final a f11808a = a.f11809a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f11809a = new a();
    }

    /* loaded from: classes.dex */
    public static final class b implements c {
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final b f11810b = new b();

        @g1(version = "1.7")
        @s4.f
        @l
        /* loaded from: classes.dex */
        public static final class a implements d {

            /* renamed from: k  reason: collision with root package name */
            public final long f11811k;

            public /* synthetic */ a(long j7) {
                this.f11811k = j7;
            }

            public static final /* synthetic */ a h(long j7) {
                return new a(j7);
            }

            public static final int i(long j7, long j8) {
                return e.l(r(j7, j8), e.f11783l.W());
            }

            public static int j(long j7, @n6.d d dVar) {
                l0.p(dVar, "other");
                return h(j7).compareTo(dVar);
            }

            public static long k(long j7) {
                return j7;
            }

            public static long l(long j7) {
                return p.f11805b.d(j7);
            }

            public static boolean m(long j7, Object obj) {
                return (obj instanceof a) && j7 == ((a) obj).y();
            }

            public static final boolean n(long j7, long j8) {
                return j7 == j8;
            }

            public static boolean o(long j7) {
                return e.e0(l(j7));
            }

            public static boolean p(long j7) {
                return !e.e0(l(j7));
            }

            public static int q(long j7) {
                return Long.hashCode(j7);
            }

            public static final long r(long j7, long j8) {
                return p.f11805b.c(j7, j8);
            }

            public static long t(long j7, long j8) {
                return p.f11805b.b(j7, e.x0(j8));
            }

            public static long u(long j7, @n6.d d dVar) {
                l0.p(dVar, "other");
                if (dVar instanceof a) {
                    return r(j7, ((a) dVar).y());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) x(j7)) + " and " + dVar);
            }

            public static long w(long j7, long j8) {
                return p.f11805b.b(j7, j8);
            }

            public static String x(long j7) {
                return "ValueTimeMark(reading=" + j7 + ')';
            }

            @Override // k5.d, k5.r
            public /* bridge */ /* synthetic */ d a(long j7) {
                return h(s(j7));
            }

            @Override // k5.d, k5.r
            public /* bridge */ /* synthetic */ d b(long j7) {
                return h(v(j7));
            }

            @Override // k5.r
            public boolean c() {
                return p(this.f11811k);
            }

            @Override // k5.r
            public boolean d() {
                return o(this.f11811k);
            }

            @Override // k5.r
            public long e() {
                return l(this.f11811k);
            }

            @Override // k5.d
            public boolean equals(Object obj) {
                return m(this.f11811k, obj);
            }

            @Override // k5.d
            public long f(@n6.d d dVar) {
                l0.p(dVar, "other");
                return u(this.f11811k, dVar);
            }

            @Override // java.lang.Comparable
            /* renamed from: g  reason: merged with bridge method [inline-methods] */
            public int compareTo(@n6.d d dVar) {
                return d.a.a(this, dVar);
            }

            @Override // k5.d
            public int hashCode() {
                return q(this.f11811k);
            }

            public long s(long j7) {
                return t(this.f11811k, j7);
            }

            public String toString() {
                return x(this.f11811k);
            }

            public long v(long j7) {
                return w(this.f11811k, j7);
            }

            public final /* synthetic */ long y() {
                return this.f11811k;
            }

            @Override // k5.r
            public /* bridge */ /* synthetic */ r a(long j7) {
                return h(s(j7));
            }

            @Override // k5.r
            public /* bridge */ /* synthetic */ r b(long j7) {
                return h(v(j7));
            }
        }

        @Override // k5.s.c, k5.s
        public /* bridge */ /* synthetic */ d a() {
            return a.h(b());
        }

        public long b() {
            return p.f11805b.e();
        }

        @n6.d
        public String toString() {
            return p.f11805b.toString();
        }

        @Override // k5.s
        public /* bridge */ /* synthetic */ r a() {
            return a.h(b());
        }
    }

    @l
    @g1(version = "1.8")
    /* loaded from: classes.dex */
    public interface c extends s {
        @Override // k5.s
        @n6.d
        d a();
    }

    @n6.d
    r a();
}
