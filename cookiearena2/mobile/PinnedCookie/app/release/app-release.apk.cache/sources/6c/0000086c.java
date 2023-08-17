package b5;

import java.io.Serializable;
import u4.r1;
import u4.w;

@r1({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* loaded from: classes.dex */
public final class i extends f implements Serializable {
    @n6.d

    /* renamed from: s  reason: collision with root package name */
    public static final a f7264s = new a(null);

    /* renamed from: t  reason: collision with root package name */
    public static final long f7265t = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f7266m;

    /* renamed from: n  reason: collision with root package name */
    public int f7267n;

    /* renamed from: o  reason: collision with root package name */
    public int f7268o;

    /* renamed from: p  reason: collision with root package name */
    public int f7269p;

    /* renamed from: q  reason: collision with root package name */
    public int f7270q;

    /* renamed from: r  reason: collision with root package name */
    public int f7271r;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        public a() {
        }
    }

    public i(int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f7266m = i7;
        this.f7267n = i8;
        this.f7268o = i9;
        this.f7269p = i10;
        this.f7270q = i11;
        this.f7271r = i12;
        int i13 = i7 | i8 | i9 | i10 | i11;
        if (!(i13 != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i14 = 0; i14 < 64; i14++) {
            l();
        }
    }

    @Override // b5.f
    public int b(int i7) {
        return g.j(l(), i7);
    }

    @Override // b5.f
    public int l() {
        int i7 = this.f7266m;
        int i8 = i7 ^ (i7 >>> 2);
        this.f7266m = this.f7267n;
        this.f7267n = this.f7268o;
        this.f7268o = this.f7269p;
        int i9 = this.f7270q;
        this.f7269p = i9;
        int i10 = ((i8 ^ (i8 << 1)) ^ i9) ^ (i9 << 4);
        this.f7270q = i10;
        int i11 = this.f7271r + 362437;
        this.f7271r = i11;
        return i10 + i11;
    }

    public i(int i7, int i8) {
        this(i7, i8, 0, 0, ~i7, (i7 << 10) ^ (i8 >>> 4));
    }
}