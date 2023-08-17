package w;

import y.e;
/* loaded from: classes.dex */
public class b {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f17905i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final Object f17906j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final Object f17907k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final Object f17908l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public static final Object f17909m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static final Object f17910n = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final int f17911a;

    /* renamed from: b  reason: collision with root package name */
    public int f17912b;

    /* renamed from: c  reason: collision with root package name */
    public int f17913c;

    /* renamed from: d  reason: collision with root package name */
    public float f17914d;

    /* renamed from: e  reason: collision with root package name */
    public int f17915e;

    /* renamed from: f  reason: collision with root package name */
    public String f17916f;

    /* renamed from: g  reason: collision with root package name */
    public Object f17917g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17918h;

    /* loaded from: classes.dex */
    public enum a {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public b() {
        this.f17911a = -2;
        this.f17912b = 0;
        this.f17913c = Integer.MAX_VALUE;
        this.f17914d = 1.0f;
        this.f17915e = 0;
        this.f17916f = null;
        this.f17917g = f17906j;
        this.f17918h = false;
    }

    public static b a(int i7) {
        b bVar = new b(f17905i);
        bVar.l(i7);
        return bVar;
    }

    public static b b(Object obj) {
        b bVar = new b(f17905i);
        bVar.m(obj);
        return bVar;
    }

    public static b c() {
        return new b(f17908l);
    }

    public static b d(Object obj, float f7) {
        b bVar = new b(f17909m);
        bVar.s(obj, f7);
        return bVar;
    }

    public static b e(String str) {
        b bVar = new b(f17910n);
        bVar.t(str);
        return bVar;
    }

    public static b f() {
        return new b(f17907k);
    }

    public static b g(int i7) {
        b bVar = new b();
        bVar.v(i7);
        return bVar;
    }

    public static b h(Object obj) {
        b bVar = new b();
        bVar.w(obj);
        return bVar;
    }

    public static b i() {
        return new b(f17906j);
    }

    public void j(h hVar, y.e eVar, int i7) {
        String str = this.f17916f;
        if (str != null) {
            eVar.n1(str);
        }
        int i8 = 2;
        if (i7 == 0) {
            if (this.f17918h) {
                eVar.D1(e.b.MATCH_CONSTRAINT);
                Object obj = this.f17917g;
                if (obj == f17906j) {
                    i8 = 1;
                } else if (obj != f17909m) {
                    i8 = 0;
                }
                eVar.E1(i8, this.f17912b, this.f17913c, this.f17914d);
                return;
            }
            int i9 = this.f17912b;
            if (i9 > 0) {
                eVar.P1(i9);
            }
            int i10 = this.f17913c;
            if (i10 < Integer.MAX_VALUE) {
                eVar.M1(i10);
            }
            Object obj2 = this.f17917g;
            if (obj2 == f17906j) {
                eVar.D1(e.b.WRAP_CONTENT);
            } else if (obj2 == f17908l) {
                eVar.D1(e.b.MATCH_PARENT);
            } else if (obj2 == null) {
                eVar.D1(e.b.FIXED);
                eVar.c2(this.f17915e);
            }
        } else if (this.f17918h) {
            eVar.Y1(e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f17917g;
            if (obj3 == f17906j) {
                i8 = 1;
            } else if (obj3 != f17909m) {
                i8 = 0;
            }
            eVar.Z1(i8, this.f17912b, this.f17913c, this.f17914d);
        } else {
            int i11 = this.f17912b;
            if (i11 > 0) {
                eVar.O1(i11);
            }
            int i12 = this.f17913c;
            if (i12 < Integer.MAX_VALUE) {
                eVar.L1(i12);
            }
            Object obj4 = this.f17917g;
            if (obj4 == f17906j) {
                eVar.Y1(e.b.WRAP_CONTENT);
            } else if (obj4 == f17908l) {
                eVar.Y1(e.b.MATCH_PARENT);
            } else if (obj4 == null) {
                eVar.Y1(e.b.FIXED);
                eVar.y1(this.f17915e);
            }
        }
    }

    public boolean k(int i7) {
        return this.f17917g == null && this.f17915e == i7;
    }

    public b l(int i7) {
        this.f17917g = null;
        this.f17915e = i7;
        return this;
    }

    public b m(Object obj) {
        this.f17917g = obj;
        if (obj instanceof Integer) {
            this.f17915e = ((Integer) obj).intValue();
            this.f17917g = null;
        }
        return this;
    }

    public int n() {
        return this.f17915e;
    }

    public b o(int i7) {
        if (this.f17913c >= 0) {
            this.f17913c = i7;
        }
        return this;
    }

    public b p(Object obj) {
        Object obj2 = f17906j;
        if (obj == obj2 && this.f17918h) {
            this.f17917g = obj2;
            this.f17913c = Integer.MAX_VALUE;
        }
        return this;
    }

    public b q(int i7) {
        if (i7 >= 0) {
            this.f17912b = i7;
        }
        return this;
    }

    public b r(Object obj) {
        if (obj == f17906j) {
            this.f17912b = -2;
        }
        return this;
    }

    public b s(Object obj, float f7) {
        this.f17914d = f7;
        return this;
    }

    public b t(String str) {
        this.f17916f = str;
        return this;
    }

    public void u(int i7) {
        this.f17918h = false;
        this.f17917g = null;
        this.f17915e = i7;
    }

    public b v(int i7) {
        this.f17918h = true;
        if (i7 >= 0) {
            this.f17913c = i7;
        }
        return this;
    }

    public b w(Object obj) {
        this.f17917g = obj;
        this.f17918h = true;
        return this;
    }

    public b(Object obj) {
        this.f17911a = -2;
        this.f17912b = 0;
        this.f17913c = Integer.MAX_VALUE;
        this.f17914d = 1.0f;
        this.f17915e = 0;
        this.f17916f = null;
        this.f17918h = false;
        this.f17917g = obj;
    }
}
