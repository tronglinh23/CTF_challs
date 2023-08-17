package d5;

import u4.l0;
/* loaded from: classes.dex */
public class a implements Iterable<Character>, v4.a {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final C0095a f8470n = new C0095a(null);

    /* renamed from: k  reason: collision with root package name */
    public final char f8471k;

    /* renamed from: l  reason: collision with root package name */
    public final char f8472l;

    /* renamed from: m  reason: collision with root package name */
    public final int f8473m;

    /* renamed from: d5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0095a {
        public /* synthetic */ C0095a(u4.w wVar) {
            this();
        }

        @n6.d
        public final a a(char c7, char c8, int i7) {
            return new a(c7, c8, i7);
        }

        public C0095a() {
        }
    }

    public a(char c7, char c8, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f8471k = c7;
        this.f8472l = (char) k4.n.c(c7, c8, i7);
        this.f8473m = i7;
    }

    public boolean equals(@n6.e Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f8471k != aVar.f8471k || this.f8472l != aVar.f8472l || this.f8473m != aVar.f8473m) {
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
        return (((this.f8471k * 31) + this.f8472l) * 31) + this.f8473m;
    }

    public final char i() {
        return this.f8471k;
    }

    public boolean isEmpty() {
        if (this.f8473m > 0) {
            if (l0.t(this.f8471k, this.f8472l) > 0) {
                return true;
            }
        } else if (l0.t(this.f8471k, this.f8472l) < 0) {
            return true;
        }
        return false;
    }

    public final char j() {
        return this.f8472l;
    }

    public final int k() {
        return this.f8473m;
    }

    @Override // java.lang.Iterable
    @n6.d
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public x3.t iterator() {
        return new b(this.f8471k, this.f8472l, this.f8473m);
    }

    @n6.d
    public String toString() {
        StringBuilder sb;
        int i7;
        if (this.f8473m > 0) {
            sb = new StringBuilder();
            sb.append(this.f8471k);
            sb.append("..");
            sb.append(this.f8472l);
            sb.append(" step ");
            i7 = this.f8473m;
        } else {
            sb = new StringBuilder();
            sb.append(this.f8471k);
            sb.append(" downTo ");
            sb.append(this.f8472l);
            sb.append(" step ");
            i7 = -this.f8473m;
        }
        sb.append(i7);
        return sb.toString();
    }
}
