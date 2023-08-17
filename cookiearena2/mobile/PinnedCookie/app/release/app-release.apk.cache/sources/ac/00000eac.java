package d5;

import x3.s0;

/* loaded from: classes.dex */
public class j implements Iterable<Integer>, v4.a {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final a f8490n = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public final int f8491k;

    /* renamed from: l  reason: collision with root package name */
    public final int f8492l;

    /* renamed from: m  reason: collision with root package name */
    public final int f8493m;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final j a(int i7, int i8, int i9) {
            return new j(i7, i8, i9);
        }

        public a() {
        }
    }

    public j(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f8491k = i7;
        this.f8492l = k4.n.c(i7, i8, i9);
        this.f8493m = i9;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof j) {
            if (!isEmpty() || !((j) obj).isEmpty()) {
                j jVar = (j) obj;
                if (this.f8491k != jVar.f8491k || this.f8492l != jVar.f8492l || this.f8493m != jVar.f8493m) {
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
        return (((this.f8491k * 31) + this.f8492l) * 31) + this.f8493m;
    }

    public final int i() {
        return this.f8491k;
    }

    public boolean isEmpty() {
        if (this.f8493m > 0) {
            if (this.f8491k > this.f8492l) {
                return true;
            }
        } else if (this.f8491k < this.f8492l) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f8492l;
    }

    public final int k() {
        return this.f8493m;
    }

    @Override // java.lang.Iterable
    @n6.d
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public s0 iterator() {
        return new k(this.f8491k, this.f8492l, this.f8493m);
    }

    @n6.d
    public String toString() {
        StringBuilder sb;
        int i7;
        if (this.f8493m > 0) {
            sb = new StringBuilder();
            sb.append(this.f8491k);
            sb.append("..");
            sb.append(this.f8492l);
            sb.append(" step ");
            i7 = this.f8493m;
        } else {
            sb = new StringBuilder();
            sb.append(this.f8491k);
            sb.append(" downTo ");
            sb.append(this.f8492l);
            sb.append(" step ");
            i7 = -this.f8493m;
        }
        sb.append(i7);
        return sb.toString();
    }
}