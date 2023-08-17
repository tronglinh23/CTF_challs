package i6;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: h  reason: collision with root package name */
    public static final int f11209h = 8192;

    /* renamed from: i  reason: collision with root package name */
    public static final int f11210i = 1024;

    /* renamed from: j  reason: collision with root package name */
    public static final a f11211j = new a(null);
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f11212a;
    @s4.e

    /* renamed from: b  reason: collision with root package name */
    public int f11213b;
    @s4.e

    /* renamed from: c  reason: collision with root package name */
    public int f11214c;
    @s4.e

    /* renamed from: d  reason: collision with root package name */
    public boolean f11215d;
    @s4.e

    /* renamed from: e  reason: collision with root package name */
    public boolean f11216e;
    @s4.e
    @n6.e

    /* renamed from: f  reason: collision with root package name */
    public j0 f11217f;
    @s4.e
    @n6.e

    /* renamed from: g  reason: collision with root package name */
    public j0 f11218g;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    public j0() {
        this.f11212a = new byte[8192];
        this.f11216e = true;
        this.f11215d = false;
    }

    public final void a() {
        j0 j0Var = this.f11218g;
        int i7 = 0;
        if (!(j0Var != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        u4.l0.m(j0Var);
        if (j0Var.f11216e) {
            int i8 = this.f11214c - this.f11213b;
            j0 j0Var2 = this.f11218g;
            u4.l0.m(j0Var2);
            int i9 = 8192 - j0Var2.f11214c;
            j0 j0Var3 = this.f11218g;
            u4.l0.m(j0Var3);
            if (!j0Var3.f11215d) {
                j0 j0Var4 = this.f11218g;
                u4.l0.m(j0Var4);
                i7 = j0Var4.f11213b;
            }
            if (i8 > i9 + i7) {
                return;
            }
            j0 j0Var5 = this.f11218g;
            u4.l0.m(j0Var5);
            g(j0Var5, i8);
            b();
            k0.d(this);
        }
    }

    @n6.e
    public final j0 b() {
        j0 j0Var = this.f11217f;
        if (j0Var == this) {
            j0Var = null;
        }
        j0 j0Var2 = this.f11218g;
        u4.l0.m(j0Var2);
        j0Var2.f11217f = this.f11217f;
        j0 j0Var3 = this.f11217f;
        u4.l0.m(j0Var3);
        j0Var3.f11218g = this.f11218g;
        this.f11217f = null;
        this.f11218g = null;
        return j0Var;
    }

    @n6.d
    public final j0 c(@n6.d j0 j0Var) {
        u4.l0.p(j0Var, "segment");
        j0Var.f11218g = this;
        j0Var.f11217f = this.f11217f;
        j0 j0Var2 = this.f11217f;
        u4.l0.m(j0Var2);
        j0Var2.f11218g = j0Var;
        this.f11217f = j0Var;
        return j0Var;
    }

    @n6.d
    public final j0 d() {
        this.f11215d = true;
        return new j0(this.f11212a, this.f11213b, this.f11214c, true, false);
    }

    @n6.d
    public final j0 e(int i7) {
        j0 e7;
        if (i7 > 0 && i7 <= this.f11214c - this.f11213b) {
            if (i7 >= 1024) {
                e7 = d();
            } else {
                e7 = k0.e();
                byte[] bArr = this.f11212a;
                byte[] bArr2 = e7.f11212a;
                int i8 = this.f11213b;
                x3.o.f1(bArr, bArr2, 0, i8, i8 + i7, 2, null);
            }
            e7.f11214c = e7.f11213b + i7;
            this.f11213b += i7;
            j0 j0Var = this.f11218g;
            u4.l0.m(j0Var);
            j0Var.c(e7);
            return e7;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    @n6.d
    public final j0 f() {
        byte[] bArr = this.f11212a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        u4.l0.o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new j0(copyOf, this.f11213b, this.f11214c, false, true);
    }

    public final void g(@n6.d j0 j0Var, int i7) {
        u4.l0.p(j0Var, "sink");
        if (!j0Var.f11216e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i8 = j0Var.f11214c;
        if (i8 + i7 > 8192) {
            if (j0Var.f11215d) {
                throw new IllegalArgumentException();
            }
            int i9 = j0Var.f11213b;
            if ((i8 + i7) - i9 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = j0Var.f11212a;
            x3.o.f1(bArr, bArr, 0, i9, i8, 2, null);
            j0Var.f11214c -= j0Var.f11213b;
            j0Var.f11213b = 0;
        }
        byte[] bArr2 = this.f11212a;
        byte[] bArr3 = j0Var.f11212a;
        int i10 = j0Var.f11214c;
        int i11 = this.f11213b;
        x3.o.W0(bArr2, bArr3, i10, i11, i11 + i7);
        j0Var.f11214c += i7;
        this.f11213b += i7;
    }

    public j0(@n6.d byte[] bArr, int i7, int i8, boolean z6, boolean z7) {
        u4.l0.p(bArr, "data");
        this.f11212a = bArr;
        this.f11213b = i7;
        this.f11214c = i8;
        this.f11215d = z6;
        this.f11216e = z7;
    }
}
