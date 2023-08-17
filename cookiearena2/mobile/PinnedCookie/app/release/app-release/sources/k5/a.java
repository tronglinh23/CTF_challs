package k5;

import k5.d;
import k5.s;
import u4.l0;
import u4.w;
import v3.g1;
@l
@g1(version = "1.3")
@v3.k(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
/* loaded from: classes.dex */
public abstract class a implements s.c {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final h f11773b;

    /* renamed from: k5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0141a implements d {

        /* renamed from: k  reason: collision with root package name */
        public final double f11774k;
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public final a f11775l;

        /* renamed from: m  reason: collision with root package name */
        public final long f11776m;

        public /* synthetic */ C0141a(double d7, a aVar, long j7, w wVar) {
            this(d7, aVar, j7);
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
            return e.g0(g.l0(this.f11775l.c() - this.f11774k, this.f11775l.b()), this.f11776m);
        }

        @Override // k5.d
        public boolean equals(@n6.e Object obj) {
            return (obj instanceof C0141a) && l0.g(this.f11775l, ((C0141a) obj).f11775l) && e.r(f((d) obj), e.f11783l.W());
        }

        @Override // k5.d
        public long f(@n6.d d dVar) {
            l0.p(dVar, "other");
            if (dVar instanceof C0141a) {
                C0141a c0141a = (C0141a) dVar;
                if (l0.g(this.f11775l, c0141a.f11775l)) {
                    if (e.r(this.f11776m, c0141a.f11776m) && e.d0(this.f11776m)) {
                        return e.f11783l.W();
                    }
                    long g02 = e.g0(this.f11776m, c0141a.f11776m);
                    long l02 = g.l0(this.f11774k - c0141a.f11774k, this.f11775l.b());
                    return e.r(l02, e.x0(g02)) ? e.f11783l.W() : e.h0(l02, g02);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + dVar);
        }

        @Override // java.lang.Comparable
        /* renamed from: g */
        public int compareTo(@n6.d d dVar) {
            return d.a.a(this, dVar);
        }

        @Override // k5.d
        public int hashCode() {
            return e.Z(e.h0(g.l0(this.f11774k, this.f11775l.b()), this.f11776m));
        }

        @n6.d
        public String toString() {
            return "DoubleTimeMark(" + this.f11774k + k.h(this.f11775l.b()) + " + " + ((Object) e.u0(this.f11776m)) + ", " + this.f11775l + ')';
        }

        public C0141a(double d7, a aVar, long j7) {
            l0.p(aVar, "timeSource");
            this.f11774k = d7;
            this.f11775l = aVar;
            this.f11776m = j7;
        }

        @Override // k5.r
        @n6.d
        public d b(long j7) {
            return new C0141a(this.f11774k, this.f11775l, e.h0(this.f11776m, j7), null);
        }
    }

    public a(@n6.d h hVar) {
        l0.p(hVar, "unit");
        this.f11773b = hVar;
    }

    @n6.d
    public final h b() {
        return this.f11773b;
    }

    public abstract double c();

    @Override // k5.s
    @n6.d
    public d a() {
        return new C0141a(c(), this, e.f11783l.W(), null);
    }
}
