package k5;

import k5.d;
import k5.e;
import k5.s;
import u4.l0;
import u4.r1;
import u4.w;
import v3.g1;
@l
@g1(version = "1.3")
/* loaded from: classes.dex */
public abstract class b implements s.c {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final h f11777b;

    @r1({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,180:1\n720#2,2:181\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n66#1:181,2\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a implements d {

        /* renamed from: k  reason: collision with root package name */
        public final long f11778k;
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public final b f11779l;

        /* renamed from: m  reason: collision with root package name */
        public final long f11780m;

        public /* synthetic */ a(long j7, b bVar, long j8, w wVar) {
            this(j7, bVar, j8);
        }

        @Override // k5.r
        @n6.d
        public d a(long j7) {
            return d.a.d(this, j7);
        }

        @Override // k5.r
        public boolean c() {
            return d.a.c(this);
        }

        @Override // k5.r
        public boolean d() {
            return d.a.b(this);
        }

        @Override // k5.r
        public long e() {
            return e.d0(this.f11780m) ? e.x0(this.f11780m) : e.g0(g.n0(this.f11779l.c() - this.f11778k, this.f11779l.b()), this.f11780m);
        }

        @Override // k5.d
        public boolean equals(@n6.e Object obj) {
            return (obj instanceof a) && l0.g(this.f11779l, ((a) obj).f11779l) && e.r(f((d) obj), e.f11783l.W());
        }

        @Override // k5.d
        public long f(@n6.d d dVar) {
            l0.p(dVar, "other");
            if (dVar instanceof a) {
                a aVar = (a) dVar;
                if (l0.g(this.f11779l, aVar.f11779l)) {
                    if (e.r(this.f11780m, aVar.f11780m) && e.d0(this.f11780m)) {
                        return e.f11783l.W();
                    }
                    long g02 = e.g0(this.f11780m, aVar.f11780m);
                    long n02 = g.n0(this.f11778k - aVar.f11778k, this.f11779l.b());
                    return e.r(n02, e.x0(g02)) ? e.f11783l.W() : e.h0(n02, g02);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + dVar);
        }

        @Override // java.lang.Comparable
        /* renamed from: g */
        public int compareTo(@n6.d d dVar) {
            return d.a.a(this, dVar);
        }

        public final long h() {
            if (e.d0(this.f11780m)) {
                return this.f11780m;
            }
            h b7 = this.f11779l.b();
            h hVar = h.MILLISECONDS;
            if (b7.compareTo(hVar) >= 0) {
                return e.h0(g.n0(this.f11778k, b7), this.f11780m);
            }
            long b8 = j.b(1L, hVar, b7);
            long j7 = this.f11778k;
            long j8 = j7 / b8;
            long j9 = j7 % b8;
            long j10 = this.f11780m;
            long P = e.P(j10);
            int T = e.T(j10);
            int i7 = T / 1000000;
            long n02 = g.n0(j9, b7);
            e.a aVar = e.f11783l;
            return e.h0(e.h0(e.h0(n02, g.m0(T % 1000000, h.NANOSECONDS)), g.n0(j8 + i7, hVar)), g.n0(P, h.SECONDS));
        }

        @Override // k5.d
        public int hashCode() {
            return e.Z(h());
        }

        @n6.d
        public String toString() {
            return "LongTimeMark(" + this.f11778k + k.h(this.f11779l.b()) + " + " + ((Object) e.u0(this.f11780m)) + " (=" + ((Object) e.u0(h())) + "), " + this.f11779l + ')';
        }

        public a(long j7, b bVar, long j8) {
            l0.p(bVar, "timeSource");
            this.f11778k = j7;
            this.f11779l = bVar;
            this.f11780m = j8;
        }

        @Override // k5.r
        @n6.d
        public d b(long j7) {
            return new a(this.f11778k, this.f11779l, e.h0(this.f11780m, j7), null);
        }
    }

    public b(@n6.d h hVar) {
        l0.p(hVar, "unit");
        this.f11777b = hVar;
    }

    @n6.d
    public final h b() {
        return this.f11777b;
    }

    public abstract long c();

    @Override // k5.s
    @n6.d
    public d a() {
        return new a(c(), this, e.f11783l.W(), null);
    }
}
