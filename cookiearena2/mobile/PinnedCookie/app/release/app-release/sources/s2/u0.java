package s2;
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16461a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16462b;
    @d.d0

    /* renamed from: c  reason: collision with root package name */
    public final int f16463c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16464d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16465e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16466f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16467g;

    /* renamed from: h  reason: collision with root package name */
    public final int f16468h;

    /* renamed from: i  reason: collision with root package name */
    public final int f16469i;
    @n6.e

    /* renamed from: j  reason: collision with root package name */
    public String f16470j;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16471a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f16472b;
        @n6.e

        /* renamed from: d  reason: collision with root package name */
        public String f16474d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f16475e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16476f;
        @d.d0

        /* renamed from: c  reason: collision with root package name */
        public int f16473c = -1;
        @d.a
        @d.b

        /* renamed from: g  reason: collision with root package name */
        public int f16477g = -1;
        @d.a
        @d.b

        /* renamed from: h  reason: collision with root package name */
        public int f16478h = -1;
        @d.a
        @d.b

        /* renamed from: i  reason: collision with root package name */
        public int f16479i = -1;
        @d.a
        @d.b

        /* renamed from: j  reason: collision with root package name */
        public int f16480j = -1;

        public static /* synthetic */ a k(a aVar, int i7, boolean z6, boolean z7, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                z7 = false;
            }
            return aVar.h(i7, z6, z7);
        }

        public static /* synthetic */ a l(a aVar, String str, boolean z6, boolean z7, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                z7 = false;
            }
            return aVar.j(str, z6, z7);
        }

        @n6.d
        public final u0 a() {
            String str = this.f16474d;
            return str != null ? new u0(this.f16471a, this.f16472b, str, this.f16475e, this.f16476f, this.f16477g, this.f16478h, this.f16479i, this.f16480j) : new u0(this.f16471a, this.f16472b, this.f16473c, this.f16475e, this.f16476f, this.f16477g, this.f16478h, this.f16479i, this.f16480j);
        }

        @n6.d
        public final a b(@d.a @d.b int i7) {
            this.f16477g = i7;
            return this;
        }

        @n6.d
        public final a c(@d.a @d.b int i7) {
            this.f16478h = i7;
            return this;
        }

        @n6.d
        public final a d(boolean z6) {
            this.f16471a = z6;
            return this;
        }

        @n6.d
        public final a e(@d.a @d.b int i7) {
            this.f16479i = i7;
            return this;
        }

        @n6.d
        public final a f(@d.a @d.b int i7) {
            this.f16480j = i7;
            return this;
        }

        @n6.d
        @s4.i
        public final a g(@d.d0 int i7, boolean z6) {
            return k(this, i7, z6, false, 4, null);
        }

        @n6.d
        @s4.i
        public final a h(@d.d0 int i7, boolean z6, boolean z7) {
            this.f16473c = i7;
            this.f16474d = null;
            this.f16475e = z6;
            this.f16476f = z7;
            return this;
        }

        @n6.d
        @s4.i
        public final a i(@n6.e String str, boolean z6) {
            return l(this, str, z6, false, 4, null);
        }

        @n6.d
        @s4.i
        public final a j(@n6.e String str, boolean z6, boolean z7) {
            this.f16474d = str;
            this.f16473c = -1;
            this.f16475e = z6;
            this.f16476f = z7;
            return this;
        }

        @n6.d
        public final a m(boolean z6) {
            this.f16472b = z6;
            return this;
        }
    }

    public u0(boolean z6, boolean z7, @d.d0 int i7, boolean z8, boolean z9, @d.a @d.b int i8, @d.a @d.b int i9, @d.a @d.b int i10, @d.a @d.b int i11) {
        this.f16461a = z6;
        this.f16462b = z7;
        this.f16463c = i7;
        this.f16464d = z8;
        this.f16465e = z9;
        this.f16466f = i8;
        this.f16467g = i9;
        this.f16468h = i10;
        this.f16469i = i11;
    }

    @d.a
    @d.b
    public final int a() {
        return this.f16466f;
    }

    @d.a
    @d.b
    public final int b() {
        return this.f16467g;
    }

    @d.a
    @d.b
    public final int c() {
        return this.f16468h;
    }

    @d.a
    @d.b
    public final int d() {
        return this.f16469i;
    }

    @d.d0
    @v3.k(message = "Use popUpToId instead.", replaceWith = @v3.b1(expression = "popUpToId", imports = {}))
    public final int e() {
        return this.f16463c;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !u4.l0.g(u0.class, obj.getClass())) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f16461a == u0Var.f16461a && this.f16462b == u0Var.f16462b && this.f16463c == u0Var.f16463c && u4.l0.g(this.f16470j, u0Var.f16470j) && this.f16464d == u0Var.f16464d && this.f16465e == u0Var.f16465e && this.f16466f == u0Var.f16466f && this.f16467g == u0Var.f16467g && this.f16468h == u0Var.f16468h && this.f16469i == u0Var.f16469i;
    }

    @d.d0
    public final int f() {
        return this.f16463c;
    }

    @n6.e
    public final String g() {
        return this.f16470j;
    }

    public final boolean h() {
        return this.f16464d;
    }

    public int hashCode() {
        int i7 = (((((i() ? 1 : 0) * 31) + (k() ? 1 : 0)) * 31) + this.f16463c) * 31;
        String str = this.f16470j;
        return ((((((((((((i7 + (str != null ? str.hashCode() : 0)) * 31) + (h() ? 1 : 0)) * 31) + (j() ? 1 : 0)) * 31) + this.f16466f) * 31) + this.f16467g) * 31) + this.f16468h) * 31) + this.f16469i;
    }

    public final boolean i() {
        return this.f16461a;
    }

    public final boolean j() {
        return this.f16465e;
    }

    public final boolean k() {
        return this.f16462b;
    }

    public u0(boolean z6, boolean z7, @n6.e String str, boolean z8, boolean z9, int i7, int i8, int i9, int i10) {
        this(z6, z7, g0.f16312t.a(str).hashCode(), z8, z9, i7, i8, i9, i10);
        this.f16470j = str;
    }
}
