package a6;

import u4.l0;
import u4.w;
import x3.o;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final int f474c = 65535;

    /* renamed from: d  reason: collision with root package name */
    public static final int f475d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f476e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f477f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f478g = 5;

    /* renamed from: h  reason: collision with root package name */
    public static final int f479h = 6;

    /* renamed from: i  reason: collision with root package name */
    public static final int f480i = 7;

    /* renamed from: j  reason: collision with root package name */
    public static final int f481j = 10;

    /* renamed from: k  reason: collision with root package name */
    public static final a f482k = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public int f483a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f484b = new int[10];

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public final void a() {
        this.f483a = 0;
        o.u2(this.f484b, 0, 0, 0, 6, null);
    }

    public final int b(int i7) {
        return this.f484b[i7];
    }

    public final boolean c(boolean z6) {
        return (this.f483a & 4) != 0 ? this.f484b[2] == 1 : z6;
    }

    public final int d() {
        if ((this.f483a & 2) != 0) {
            return this.f484b[1];
        }
        return -1;
    }

    public final int e() {
        if ((this.f483a & 128) != 0) {
            return this.f484b[7];
        }
        return 65535;
    }

    public final int f() {
        if ((this.f483a & 16) != 0) {
            return this.f484b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int g(int i7) {
        return (this.f483a & 32) != 0 ? this.f484b[5] : i7;
    }

    public final int h(int i7) {
        return (this.f483a & 64) != 0 ? this.f484b[6] : i7;
    }

    public final boolean i(int i7) {
        return ((1 << i7) & this.f483a) != 0;
    }

    public final void j(@n6.d m mVar) {
        l0.p(mVar, "other");
        for (int i7 = 0; i7 < 10; i7++) {
            if (mVar.i(i7)) {
                k(i7, mVar.b(i7));
            }
        }
    }

    @n6.d
    public final m k(int i7, int i8) {
        if (i7 >= 0) {
            int[] iArr = this.f484b;
            if (i7 < iArr.length) {
                this.f483a = (1 << i7) | this.f483a;
                iArr[i7] = i8;
            }
        }
        return this;
    }

    public final int l() {
        return Integer.bitCount(this.f483a);
    }
}
