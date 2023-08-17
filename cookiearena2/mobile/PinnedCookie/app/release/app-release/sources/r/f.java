package r;

import java.util.Set;
import u.v;
import w.r;
/* loaded from: classes.dex */
public class f implements v {
    public static final int A = 0;
    public static final int B = 0;
    public static final int C = -1;
    public static final int D = -1;
    public static final int E = -2;
    public static final int F = Integer.MIN_VALUE;
    public static final int G = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f15411m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f15412n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f15413o = -1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f15414p = -2;

    /* renamed from: q  reason: collision with root package name */
    public static final int f15415q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f15416r = 4;

    /* renamed from: s  reason: collision with root package name */
    public static final int f15417s = -3;

    /* renamed from: t  reason: collision with root package name */
    public static final int f15418t = -4;

    /* renamed from: u  reason: collision with root package name */
    public static final int f15419u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f15420v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f15421w = 2;

    /* renamed from: x  reason: collision with root package name */
    public static final int f15422x = 3;

    /* renamed from: y  reason: collision with root package name */
    public static final int f15423y = 4;

    /* renamed from: z  reason: collision with root package name */
    public static final int f15424z = -1;

    /* renamed from: h  reason: collision with root package name */
    public r f15425h;

    /* renamed from: i  reason: collision with root package name */
    public a f15426i;

    /* renamed from: j  reason: collision with root package name */
    public b f15427j;

    /* renamed from: k  reason: collision with root package name */
    public float f15428k;

    /* renamed from: l  reason: collision with root package name */
    public float f15429l;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: n  reason: collision with root package name */
        public static final int f15430n = -2;

        /* renamed from: o  reason: collision with root package name */
        public static final int f15431o = -1;

        /* renamed from: p  reason: collision with root package name */
        public static final int f15432p = -3;

        /* renamed from: a  reason: collision with root package name */
        public int f15433a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f15434b = 0;

        /* renamed from: c  reason: collision with root package name */
        public String f15435c = null;

        /* renamed from: d  reason: collision with root package name */
        public int f15436d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f15437e = 0;

        /* renamed from: f  reason: collision with root package name */
        public float f15438f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public int f15439g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f15440h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f15441i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public int f15442j = -1;

        /* renamed from: k  reason: collision with root package name */
        public String f15443k = null;

        /* renamed from: l  reason: collision with root package name */
        public int f15444l = -3;

        /* renamed from: m  reason: collision with root package name */
        public int f15445m = -1;
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f15446a = 4;

        /* renamed from: b  reason: collision with root package name */
        public int f15447b = 0;

        /* renamed from: c  reason: collision with root package name */
        public float f15448c = 1.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f15449d = Float.NaN;
    }

    public f() {
        this.f15425h = new r();
        this.f15426i = new a();
        this.f15427j = new b();
    }

    public float A(int i7) {
        switch (i7) {
            case 303:
                return this.f15425h.f18028p;
            case 304:
                return this.f15425h.f18023k;
            case 305:
                return this.f15425h.f18024l;
            case 306:
                return this.f15425h.f18025m;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.f15425h.f18020h;
            case 309:
                return this.f15425h.f18021i;
            case 310:
                return this.f15425h.f18022j;
            case 311:
                return this.f15425h.f18026n;
            case 312:
                return this.f15425h.f18027o;
            case 313:
                return this.f15425h.f18018f;
            case 314:
                return this.f15425h.f18019g;
            case 315:
                return this.f15428k;
            case v.a.f17126q /* 316 */:
                return this.f15429l;
        }
    }

    public int B() {
        return this.f15427j.f15446a;
    }

    public r C() {
        return this.f15425h;
    }

    public int D() {
        r rVar = this.f15425h;
        return rVar.f18016d - rVar.f18014b;
    }

    public int E() {
        return this.f15425h.f18014b;
    }

    public int F() {
        return this.f15425h.f18015c;
    }

    public void G(int i7, int i8, int i9, int i10) {
        H(i7, i8, i9, i10);
    }

    public void H(int i7, int i8, int i9, int i10) {
        if (this.f15425h == null) {
            this.f15425h = new r((y.e) null);
        }
        r rVar = this.f15425h;
        rVar.f18015c = i8;
        rVar.f18014b = i7;
        rVar.f18016d = i9;
        rVar.f18017e = i10;
    }

    public void I(String str, int i7, float f7) {
        this.f15425h.v(str, i7, f7);
    }

    public void J(String str, int i7, int i8) {
        this.f15425h.w(str, i7, i8);
    }

    public void K(String str, int i7, String str2) {
        this.f15425h.x(str, i7, str2);
    }

    public void L(String str, int i7, boolean z6) {
        this.f15425h.y(str, i7, z6);
    }

    public void M(r.a aVar, float[] fArr) {
        this.f15425h.v(aVar.f15314b, v.b.f17146k, fArr[0]);
    }

    public void N(float f7) {
        this.f15425h.f18018f = f7;
    }

    public void O(float f7) {
        this.f15425h.f18019g = f7;
    }

    public void P(float f7) {
        this.f15425h.f18020h = f7;
    }

    public void Q(float f7) {
        this.f15425h.f18021i = f7;
    }

    public void R(float f7) {
        this.f15425h.f18022j = f7;
    }

    public void S(float f7) {
        this.f15425h.f18026n = f7;
    }

    public void T(float f7) {
        this.f15425h.f18027o = f7;
    }

    public void U(float f7) {
        this.f15425h.f18023k = f7;
    }

    public void V(float f7) {
        this.f15425h.f18024l = f7;
    }

    public void W(float f7) {
        this.f15425h.f18025m = f7;
    }

    public boolean X(int i7, float f7) {
        switch (i7) {
            case 303:
                this.f15425h.f18028p = f7;
                return true;
            case 304:
                this.f15425h.f18023k = f7;
                return true;
            case 305:
                this.f15425h.f18024l = f7;
                return true;
            case 306:
                this.f15425h.f18025m = f7;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f15425h.f18020h = f7;
                return true;
            case 309:
                this.f15425h.f18021i = f7;
                return true;
            case 310:
                this.f15425h.f18022j = f7;
                return true;
            case 311:
                this.f15425h.f18026n = f7;
                return true;
            case 312:
                this.f15425h.f18027o = f7;
                return true;
            case 313:
                this.f15425h.f18018f = f7;
                return true;
            case 314:
                this.f15425h.f18019g = f7;
                return true;
            case 315:
                this.f15428k = f7;
                return true;
            case v.a.f17126q /* 316 */:
                this.f15429l = f7;
                return true;
        }
    }

    public boolean Y(int i7, float f7) {
        switch (i7) {
            case 600:
                this.f15426i.f15438f = f7;
                return true;
            case 601:
                this.f15426i.f15440h = f7;
                return true;
            case v.e.f17201r /* 602 */:
                this.f15426i.f15441i = f7;
                return true;
            default:
                return false;
        }
    }

    public boolean Z(int i7, int i8) {
        switch (i7) {
            case v.e.f17204u /* 605 */:
                this.f15426i.f15433a = i8;
                return true;
            case v.e.f17205v /* 606 */:
                this.f15426i.f15434b = i8;
                return true;
            case v.e.f17206w /* 607 */:
                this.f15426i.f15436d = i8;
                return true;
            case v.e.f17207x /* 608 */:
                this.f15426i.f15437e = i8;
                return true;
            case v.e.f17208y /* 609 */:
                this.f15426i.f15439g = i8;
                return true;
            case v.e.f17209z /* 610 */:
                this.f15426i.f15442j = i8;
                return true;
            case v.e.A /* 611 */:
                this.f15426i.f15444l = i8;
                return true;
            case v.e.B /* 612 */:
                this.f15426i.f15445m = i8;
                return true;
            default:
                return false;
        }
    }

    @Override // u.v
    public int a(String str) {
        int a7 = v.a.a(str);
        return a7 != -1 ? a7 : v.e.a(str);
    }

    public boolean a0(int i7, String str) {
        if (i7 == 603) {
            this.f15426i.f15435c = str;
            return true;
        } else if (i7 != 604) {
            return false;
        } else {
            this.f15426i.f15443k = str;
            return true;
        }
    }

    @Override // u.v
    public boolean b(int i7, int i8) {
        return X(i7, i8);
    }

    public void b0(int i7) {
        this.f15427j.f15446a = i7;
    }

    @Override // u.v
    public boolean c(int i7, float f7) {
        if (X(i7, f7)) {
            return true;
        }
        return Y(i7, f7);
    }

    @Override // u.v
    public boolean d(int i7, String str) {
        return a0(i7, str);
    }

    @Override // u.v
    public boolean e(int i7, boolean z6) {
        return false;
    }

    public f f(int i7) {
        return null;
    }

    public float g() {
        return this.f15427j.f15448c;
    }

    public int h() {
        return this.f15425h.f18017e;
    }

    public r.b i(String str) {
        return this.f15425h.g(str);
    }

    public Set<String> j() {
        return this.f15425h.h();
    }

    public int k() {
        r rVar = this.f15425h;
        return rVar.f18017e - rVar.f18015c;
    }

    public int l() {
        return this.f15425h.f18014b;
    }

    public String m() {
        return this.f15425h.k();
    }

    public f n() {
        return null;
    }

    public float o() {
        return this.f15425h.f18018f;
    }

    public float p() {
        return this.f15425h.f18019g;
    }

    public int q() {
        return this.f15425h.f18016d;
    }

    public float r() {
        return this.f15425h.f18020h;
    }

    public float s() {
        return this.f15425h.f18021i;
    }

    public float t() {
        return this.f15425h.f18022j;
    }

    public String toString() {
        return this.f15425h.f18014b + ", " + this.f15425h.f18015c + ", " + this.f15425h.f18016d + ", " + this.f15425h.f18017e;
    }

    public float u() {
        return this.f15425h.f18026n;
    }

    public float v() {
        return this.f15425h.f18027o;
    }

    public int w() {
        return this.f15425h.f18015c;
    }

    public float x() {
        return this.f15425h.f18023k;
    }

    public float y() {
        return this.f15425h.f18024l;
    }

    public float z() {
        return this.f15425h.f18025m;
    }

    public f(r rVar) {
        this.f15425h = new r();
        this.f15426i = new a();
        this.f15427j = new b();
        this.f15425h = rVar;
    }
}
