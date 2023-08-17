package d5;

import java.util.Iterator;
import v3.b2;
import v3.g1;
import v3.q2;

@g1(version = "1.5")
@q2(markerClass = {v3.t.class})
/* loaded from: classes.dex */
public class y implements Iterable<b2>, v4.a {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final a f8524n = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public final long f8525k;

    /* renamed from: l  reason: collision with root package name */
    public final long f8526l;

    /* renamed from: m  reason: collision with root package name */
    public final long f8527m;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final y a(long j7, long j8, long j9) {
            return new y(j7, j8, j9, null);
        }

        public a() {
        }
    }

    public /* synthetic */ y(long j7, long j8, long j9, u4.w wVar) {
        this(j7, j8, j9);
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof y) {
            if (!isEmpty() || !((y) obj).isEmpty()) {
                y yVar = (y) obj;
                if (this.f8525k != yVar.f8525k || this.f8526l != yVar.f8526l || this.f8527m != yVar.f8527m) {
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
        long j7 = this.f8525k;
        int l7 = ((int) b2.l(j7 ^ b2.l(j7 >>> 32))) * 31;
        long j8 = this.f8526l;
        int l8 = (l7 + ((int) b2.l(j8 ^ b2.l(j8 >>> 32)))) * 31;
        long j9 = this.f8527m;
        return l8 + ((int) ((j9 >>> 32) ^ j9));
    }

    public final long i() {
        return this.f8525k;
    }

    public boolean isEmpty() {
        int i7 = (this.f8527m > 0L ? 1 : (this.f8527m == 0L ? 0 : -1));
        long j7 = this.f8525k;
        long j8 = this.f8526l;
        if (i7 > 0) {
            if (Long.compareUnsigned(j7, j8) > 0) {
                return true;
            }
        } else if (Long.compareUnsigned(j7, j8) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @n6.d
    public final Iterator<b2> iterator() {
        return new z(this.f8525k, this.f8526l, this.f8527m, null);
    }

    public final long j() {
        return this.f8526l;
    }

    public final long k() {
        return this.f8527m;
    }

    @n6.d
    public String toString() {
        StringBuilder sb;
        long j7;
        if (this.f8527m > 0) {
            sb = new StringBuilder();
            sb.append((Object) b2.g0(this.f8525k));
            sb.append("..");
            sb.append((Object) b2.g0(this.f8526l));
            sb.append(" step ");
            j7 = this.f8527m;
        } else {
            sb = new StringBuilder();
            sb.append((Object) b2.g0(this.f8525k));
            sb.append(" downTo ");
            sb.append((Object) b2.g0(this.f8526l));
            sb.append(" step ");
            j7 = -this.f8527m;
        }
        sb.append(j7);
        return sb.toString();
    }

    public y(long j7, long j8, long j9) {
        if (j9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j9 != Long.MIN_VALUE) {
            this.f8525k = j7;
            this.f8526l = k4.r.c(j7, j8, j9);
            this.f8527m = j9;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }
}