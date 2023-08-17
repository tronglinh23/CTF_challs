package d5;

import java.util.Iterator;
import v3.g1;
import v3.q2;
import v3.x1;
@g1(version = "1.5")
@q2(markerClass = {v3.t.class})
/* loaded from: classes.dex */
public class v implements Iterable<x1>, v4.a {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final a f8514n = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public final int f8515k;

    /* renamed from: l  reason: collision with root package name */
    public final int f8516l;

    /* renamed from: m  reason: collision with root package name */
    public final int f8517m;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final v a(int i7, int i8, int i9) {
            return new v(i7, i8, i9, null);
        }

        public a() {
        }
    }

    public /* synthetic */ v(int i7, int i8, int i9, u4.w wVar) {
        this(i7, i8, i9);
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof v) {
            if (!isEmpty() || !((v) obj).isEmpty()) {
                v vVar = (v) obj;
                if (this.f8515k != vVar.f8515k || this.f8516l != vVar.f8516l || this.f8517m != vVar.f8517m) {
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
        return (((this.f8515k * 31) + this.f8516l) * 31) + this.f8517m;
    }

    public final int i() {
        return this.f8515k;
    }

    public boolean isEmpty() {
        if (this.f8517m > 0) {
            if (Integer.compareUnsigned(this.f8515k, this.f8516l) > 0) {
                return true;
            }
        } else if (Integer.compareUnsigned(this.f8515k, this.f8516l) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @n6.d
    public final Iterator<x1> iterator() {
        return new w(this.f8515k, this.f8516l, this.f8517m, null);
    }

    public final int j() {
        return this.f8516l;
    }

    public final int k() {
        return this.f8517m;
    }

    @n6.d
    public String toString() {
        StringBuilder sb;
        int i7;
        if (this.f8517m > 0) {
            sb = new StringBuilder();
            sb.append((Object) x1.g0(this.f8515k));
            sb.append("..");
            sb.append((Object) x1.g0(this.f8516l));
            sb.append(" step ");
            i7 = this.f8517m;
        } else {
            sb = new StringBuilder();
            sb.append((Object) x1.g0(this.f8515k));
            sb.append(" downTo ");
            sb.append((Object) x1.g0(this.f8516l));
            sb.append(" step ");
            i7 = -this.f8517m;
        }
        sb.append(i7);
        return sb.toString();
    }

    public v(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f8515k = i7;
            this.f8516l = k4.r.d(i7, i8, i9);
            this.f8517m = i9;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }
}
