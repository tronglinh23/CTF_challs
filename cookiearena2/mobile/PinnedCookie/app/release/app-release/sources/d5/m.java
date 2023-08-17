package d5;

import x3.t0;
/* loaded from: classes.dex */
public class m implements Iterable<Long>, v4.a {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final a f8500n = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public final long f8501k;

    /* renamed from: l  reason: collision with root package name */
    public final long f8502l;

    /* renamed from: m  reason: collision with root package name */
    public final long f8503m;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final m a(long j7, long j8, long j9) {
            return new m(j7, j8, j9);
        }

        public a() {
        }
    }

    public m(long j7, long j8, long j9) {
        if (j9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j9 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f8501k = j7;
        this.f8502l = k4.n.d(j7, j8, j9);
        this.f8503m = j9;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof m) {
            if (!isEmpty() || !((m) obj).isEmpty()) {
                m mVar = (m) obj;
                if (this.f8501k != mVar.f8501k || this.f8502l != mVar.f8502l || this.f8503m != mVar.f8503m) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j7 = 31;
        long j8 = this.f8501k;
        long j9 = this.f8502l;
        long j10 = j7 * (((j8 ^ (j8 >>> 32)) * j7) + (j9 ^ (j9 >>> 32)));
        long j11 = this.f8503m;
        return (int) (j10 + (j11 ^ (j11 >>> 32)));
    }

    public final long i() {
        return this.f8501k;
    }

    public boolean isEmpty() {
        int i7 = (this.f8503m > 0L ? 1 : (this.f8503m == 0L ? 0 : -1));
        long j7 = this.f8501k;
        long j8 = this.f8502l;
        if (i7 > 0) {
            if (j7 > j8) {
                return true;
            }
        } else if (j7 < j8) {
            return true;
        }
        return false;
    }

    public final long j() {
        return this.f8502l;
    }

    public final long k() {
        return this.f8503m;
    }

    @Override // java.lang.Iterable
    @n6.d
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public t0 iterator() {
        return new n(this.f8501k, this.f8502l, this.f8503m);
    }

    @n6.d
    public String toString() {
        StringBuilder sb;
        long j7;
        if (this.f8503m > 0) {
            sb = new StringBuilder();
            sb.append(this.f8501k);
            sb.append("..");
            sb.append(this.f8502l);
            sb.append(" step ");
            j7 = this.f8503m;
        } else {
            sb = new StringBuilder();
            sb.append(this.f8501k);
            sb.append(" downTo ");
            sb.append(this.f8502l);
            sb.append(" step ");
            j7 = -this.f8503m;
        }
        sb.append(j7);
        return sb.toString();
    }
}
