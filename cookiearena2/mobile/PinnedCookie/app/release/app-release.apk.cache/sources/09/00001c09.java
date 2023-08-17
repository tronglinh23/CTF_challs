package v3;

@g1(version = "1.1")
/* loaded from: classes.dex */
public final class a0 implements Comparable<a0> {

    /* renamed from: p  reason: collision with root package name */
    public static final int f17759p = 255;

    /* renamed from: k  reason: collision with root package name */
    public final int f17761k;

    /* renamed from: l  reason: collision with root package name */
    public final int f17762l;

    /* renamed from: m  reason: collision with root package name */
    public final int f17763m;

    /* renamed from: n  reason: collision with root package name */
    public final int f17764n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final a f17758o = new a(null);
    @n6.d
    @s4.e

    /* renamed from: q  reason: collision with root package name */
    public static final a0 f17760q = b0.a();

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public a() {
        }
    }

    public a0(int i7, int i8, int i9) {
        this.f17761k = i7;
        this.f17762l = i8;
        this.f17763m = i9;
        this.f17764n = k(i7, i8, i9);
    }

    @Override // java.lang.Comparable
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public int compareTo(@n6.d a0 a0Var) {
        u4.l0.p(a0Var, "other");
        return this.f17764n - a0Var.f17764n;
    }

    public final int d() {
        return this.f17761k;
    }

    public final int e() {
        return this.f17762l;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        a0 a0Var = obj instanceof a0 ? (a0) obj : null;
        return a0Var != null && this.f17764n == a0Var.f17764n;
    }

    public final int h() {
        return this.f17763m;
    }

    public int hashCode() {
        return this.f17764n;
    }

    public final boolean i(int i7, int i8) {
        int i9 = this.f17761k;
        return i9 > i7 || (i9 == i7 && this.f17762l >= i8);
    }

    public final boolean j(int i7, int i8, int i9) {
        int i10;
        int i11 = this.f17761k;
        return i11 > i7 || (i11 == i7 && ((i10 = this.f17762l) > i8 || (i10 == i8 && this.f17763m >= i9)));
    }

    public final int k(int i7, int i8, int i9) {
        boolean z6 = false;
        if (new d5.l(0, 255).n(i7) && new d5.l(0, 255).n(i8) && new d5.l(0, 255).n(i9)) {
            z6 = true;
        }
        if (z6) {
            return (i7 << 16) + (i8 << 8) + i9;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i7 + '.' + i8 + '.' + i9).toString());
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17761k);
        sb.append('.');
        sb.append(this.f17762l);
        sb.append('.');
        sb.append(this.f17763m);
        return sb.toString();
    }

    public a0(int i7, int i8) {
        this(i7, i8, 0);
    }
}