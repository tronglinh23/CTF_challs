package w;

import java.util.ArrayList;
import java.util.HashMap;
import u.v;
import w.h;
import y.d;

/* loaded from: classes.dex */
public class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public Object f17868a;

    /* renamed from: a0  reason: collision with root package name */
    public float f17869a0;

    /* renamed from: b  reason: collision with root package name */
    public final h f17870b;

    /* renamed from: b0  reason: collision with root package name */
    public float f17871b0;

    /* renamed from: d0  reason: collision with root package name */
    public w.b f17875d0;

    /* renamed from: e0  reason: collision with root package name */
    public w.b f17877e0;

    /* renamed from: f0  reason: collision with root package name */
    public Object f17879f0;

    /* renamed from: g0  reason: collision with root package name */
    public y.e f17881g0;

    /* renamed from: h0  reason: collision with root package name */
    public HashMap<String, Integer> f17883h0;

    /* renamed from: i0  reason: collision with root package name */
    public HashMap<String, Float> f17885i0;

    /* renamed from: c  reason: collision with root package name */
    public String f17872c = null;

    /* renamed from: d  reason: collision with root package name */
    public x.e f17874d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f17876e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f17878f = 0;

    /* renamed from: g  reason: collision with root package name */
    public float f17880g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f17882h = -1.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f17884i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    public float f17886j = 0.5f;

    /* renamed from: k  reason: collision with root package name */
    public int f17887k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f17888l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f17889m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f17890n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f17891o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f17892p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f17893q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f17894r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f17895s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f17896t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f17897u = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f17898v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f17899w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f17900x = 0;

    /* renamed from: y  reason: collision with root package name */
    public float f17901y = Float.NaN;

    /* renamed from: z  reason: collision with root package name */
    public float f17902z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public int J = 0;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public Object T = null;
    public Object U = null;
    public Object V = null;
    public Object W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;

    /* renamed from: c0  reason: collision with root package name */
    public h.c f17873c0 = null;

    /* renamed from: w.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0254a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17903a;

        static {
            int[] iArr = new int[h.c.values().length];
            f17903a = iArr;
            try {
                iArr[h.c.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17903a[h.c.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17903a[h.c.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17903a[h.c.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17903a[h.c.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17903a[h.c.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17903a[h.c.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17903a[h.c.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17903a[h.c.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17903a[h.c.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17903a[h.c.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17903a[h.c.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17903a[h.c.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17903a[h.c.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17903a[h.c.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f17903a[h.c.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f17903a[h.c.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f17903a[h.c.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        a a(h hVar);
    }

    /* loaded from: classes.dex */
    public static class c extends Exception {

        /* renamed from: k  reason: collision with root package name */
        public final ArrayList<String> f17904k;

        public c(ArrayList<String> arrayList) {
            this.f17904k = arrayList;
        }

        public ArrayList<String> a() {
            return this.f17904k;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.f17904k.toString();
        }
    }

    public a(h hVar) {
        Object obj = w.b.f17906j;
        this.f17875d0 = w.b.b(obj);
        this.f17877e0 = w.b.b(obj);
        this.f17883h0 = new HashMap<>();
        this.f17885i0 = new HashMap<>();
        this.f17870b = hVar;
    }

    public a A(Object obj) {
        this.f17873c0 = h.c.END_TO_END;
        this.R = obj;
        return this;
    }

    public a A0(Object obj) {
        this.f17873c0 = h.c.START_TO_END;
        this.P = obj;
        return this;
    }

    public a B(Object obj) {
        this.f17873c0 = h.c.END_TO_START;
        this.Q = obj;
        return this;
    }

    public a B0(Object obj) {
        this.f17873c0 = h.c.START_TO_START;
        this.O = obj;
        return this;
    }

    public final Object C(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.f17870b.r(obj) : obj;
    }

    public a C0() {
        if (this.S != null) {
            this.f17873c0 = h.c.TOP_TO_TOP;
        } else {
            this.f17873c0 = h.c.TOP_TO_BOTTOM;
        }
        return this;
    }

    public float D() {
        return this.G;
    }

    public a D0(Object obj) {
        this.f17873c0 = h.c.TOP_TO_BOTTOM;
        this.T = obj;
        return this;
    }

    public w.b E() {
        return this.f17877e0;
    }

    public a E0(Object obj) {
        this.f17873c0 = h.c.TOP_TO_TOP;
        this.S = obj;
        return this;
    }

    public int F() {
        return this.f17876e;
    }

    public a F0(float f7) {
        this.D = f7;
        return this;
    }

    public float G() {
        return this.f17880g;
    }

    public a G0(float f7) {
        this.E = f7;
        return this;
    }

    public float H() {
        return this.f17901y;
    }

    public a H0(float f7) {
        this.F = f7;
        return this;
    }

    public float I() {
        return this.f17902z;
    }

    public void I0() throws c {
        ArrayList arrayList = new ArrayList();
        if (this.K != null && this.L != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.M != null && this.N != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.O != null && this.P != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.Q != null && this.R != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.K != null || this.L != null || this.M != null || this.N != null) && (this.O != null || this.P != null || this.Q != null || this.R != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new c(arrayList);
        }
    }

    public float J() {
        return this.A;
    }

    public a J0(float f7) {
        this.f17886j = f7;
        return this;
    }

    public float K() {
        return this.B;
    }

    public a K0(int i7) {
        this.J = i7;
        return this;
    }

    public float L() {
        return this.C;
    }

    public a L0(w.b bVar) {
        return y0(bVar);
    }

    public float M() {
        return this.H;
    }

    public float N() {
        return this.I;
    }

    public String O() {
        return this.f17872c;
    }

    public final y.e P(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).a();
        }
        return null;
    }

    public float Q() {
        return this.D;
    }

    public float R() {
        return this.E;
    }

    public float S() {
        return this.F;
    }

    public int T(int i7) {
        return this.f17878f;
    }

    public float U() {
        return this.f17882h;
    }

    public Object V() {
        return this.f17879f0;
    }

    public w.b W() {
        return this.f17875d0;
    }

    public a X(w.b bVar) {
        return r0(bVar);
    }

    public a Y(float f7) {
        this.f17884i = f7;
        return this;
    }

    public a Z() {
        if (this.K != null) {
            this.f17873c0 = h.c.LEFT_TO_LEFT;
        } else {
            this.f17873c0 = h.c.LEFT_TO_RIGHT;
        }
        return this;
    }

    @Override // w.e
    public y.e a() {
        if (this.f17881g0 == null) {
            y.e x6 = x();
            this.f17881g0 = x6;
            x6.h1(this.f17879f0);
        }
        return this.f17881g0;
    }

    public a a0(Object obj) {
        this.f17873c0 = h.c.LEFT_TO_LEFT;
        this.K = obj;
        return this;
    }

    @Override // w.e
    public void b() {
        if (this.f17881g0 == null) {
            return;
        }
        x.e eVar = this.f17874d;
        if (eVar != null) {
            eVar.b();
        }
        this.f17875d0.j(this.f17870b, this.f17881g0, 0);
        this.f17877e0.j(this.f17870b, this.f17881g0, 1);
        y();
        i(this.f17881g0, this.K, h.c.LEFT_TO_LEFT);
        i(this.f17881g0, this.L, h.c.LEFT_TO_RIGHT);
        i(this.f17881g0, this.M, h.c.RIGHT_TO_LEFT);
        i(this.f17881g0, this.N, h.c.RIGHT_TO_RIGHT);
        i(this.f17881g0, this.O, h.c.START_TO_START);
        i(this.f17881g0, this.P, h.c.START_TO_END);
        i(this.f17881g0, this.Q, h.c.END_TO_START);
        i(this.f17881g0, this.R, h.c.END_TO_END);
        i(this.f17881g0, this.S, h.c.TOP_TO_TOP);
        i(this.f17881g0, this.T, h.c.TOP_TO_BOTTOM);
        i(this.f17881g0, this.U, h.c.BOTTOM_TO_TOP);
        i(this.f17881g0, this.V, h.c.BOTTOM_TO_BOTTOM);
        i(this.f17881g0, this.W, h.c.BASELINE_TO_BASELINE);
        i(this.f17881g0, this.X, h.c.BASELINE_TO_TOP);
        i(this.f17881g0, this.Y, h.c.BASELINE_TO_BOTTOM);
        i(this.f17881g0, this.Z, h.c.CIRCULAR_CONSTRAINT);
        int i7 = this.f17876e;
        if (i7 != 0) {
            this.f17881g0.B1(i7);
        }
        int i8 = this.f17878f;
        if (i8 != 0) {
            this.f17881g0.W1(i8);
        }
        float f7 = this.f17880g;
        if (f7 != -1.0f) {
            this.f17881g0.F1(f7);
        }
        float f8 = this.f17882h;
        if (f8 != -1.0f) {
            this.f17881g0.a2(f8);
        }
        this.f17881g0.A1(this.f17884i);
        this.f17881g0.V1(this.f17886j);
        y.e eVar2 = this.f17881g0;
        r rVar = eVar2.f18602n;
        rVar.f18018f = this.f17901y;
        rVar.f18019g = this.f17902z;
        rVar.f18020h = this.A;
        rVar.f18021i = this.B;
        rVar.f18022j = this.C;
        rVar.f18023k = this.D;
        rVar.f18024l = this.E;
        rVar.f18025m = this.F;
        rVar.f18026n = this.H;
        rVar.f18027o = this.I;
        rVar.f18028p = this.G;
        int i9 = this.J;
        rVar.f18030r = i9;
        eVar2.b2(i9);
        HashMap<String, Integer> hashMap = this.f17883h0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.f17881g0.f18602n.w(str, v.b.f17147l, this.f17883h0.get(str).intValue());
            }
        }
        HashMap<String, Float> hashMap2 = this.f17885i0;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.f17881g0.f18602n.v(str2, v.b.f17146k, this.f17885i0.get(str2).floatValue());
            }
        }
    }

    public a b0(Object obj) {
        this.f17873c0 = h.c.LEFT_TO_RIGHT;
        this.L = obj;
        return this;
    }

    @Override // w.e
    public void c(y.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f17881g0 = eVar;
        eVar.h1(this.f17879f0);
    }

    public a c0(int i7) {
        h.c cVar = this.f17873c0;
        if (cVar != null) {
            switch (C0254a.f17903a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.f17887k = i7;
                    break;
                case 3:
                case 4:
                    this.f17888l = i7;
                    break;
                case 5:
                case 6:
                    this.f17889m = i7;
                    break;
                case 7:
                case 8:
                    this.f17890n = i7;
                    break;
                case 9:
                case 10:
                    this.f17891o = i7;
                    break;
                case 11:
                case 12:
                    this.f17892p = i7;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f17899w = i7;
                    break;
                case 16:
                    this.f17871b0 = i7;
                    break;
            }
        } else {
            this.f17887k = i7;
            this.f17888l = i7;
            this.f17889m = i7;
            this.f17890n = i7;
            this.f17891o = i7;
            this.f17892p = i7;
        }
        return this;
    }

    @Override // w.e
    public void d(Object obj) {
        this.f17868a = obj;
    }

    public a d0(Object obj) {
        return c0(this.f17870b.f(obj));
    }

    @Override // w.e
    public x.e e() {
        return this.f17874d;
    }

    public a e0(int i7) {
        h.c cVar = this.f17873c0;
        if (cVar != null) {
            switch (C0254a.f17903a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.f17893q = i7;
                    break;
                case 3:
                case 4:
                    this.f17894r = i7;
                    break;
                case 5:
                case 6:
                    this.f17895s = i7;
                    break;
                case 7:
                case 8:
                    this.f17896t = i7;
                    break;
                case 9:
                case 10:
                    this.f17897u = i7;
                    break;
                case 11:
                case 12:
                    this.f17898v = i7;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f17900x = i7;
                    break;
            }
        } else {
            this.f17893q = i7;
            this.f17894r = i7;
            this.f17895s = i7;
            this.f17896t = i7;
            this.f17897u = i7;
            this.f17898v = i7;
        }
        return this;
    }

    public void f(String str, int i7) {
        this.f17883h0.put(str, Integer.valueOf(i7));
    }

    public a f0(Object obj) {
        return e0(this.f17870b.f(obj));
    }

    public void g(String str, float f7) {
        if (this.f17885i0 == null) {
            this.f17885i0 = new HashMap<>();
        }
        this.f17885i0.put(str, Float.valueOf(f7));
    }

    public a g0(float f7) {
        this.f17901y = f7;
        return this;
    }

    @Override // w.e
    public Object getKey() {
        return this.f17868a;
    }

    public a h(float f7) {
        this.G = f7;
        return this;
    }

    public a h0(float f7) {
        this.f17902z = f7;
        return this;
    }

    public final void i(y.e eVar, Object obj, h.c cVar) {
        y.e P = P(obj);
        if (P == null) {
            return;
        }
        int[] iArr = C0254a.f17903a;
        int i7 = iArr[cVar.ordinal()];
        switch (iArr[cVar.ordinal()]) {
            case 1:
                d.b bVar = d.b.LEFT;
                eVar.r(bVar).b(P.r(bVar), this.f17887k, this.f17893q, false);
                return;
            case 2:
                eVar.r(d.b.LEFT).b(P.r(d.b.RIGHT), this.f17887k, this.f17893q, false);
                return;
            case 3:
                eVar.r(d.b.RIGHT).b(P.r(d.b.LEFT), this.f17888l, this.f17894r, false);
                return;
            case 4:
                d.b bVar2 = d.b.RIGHT;
                eVar.r(bVar2).b(P.r(bVar2), this.f17888l, this.f17894r, false);
                return;
            case 5:
                d.b bVar3 = d.b.LEFT;
                eVar.r(bVar3).b(P.r(bVar3), this.f17889m, this.f17895s, false);
                return;
            case 6:
                eVar.r(d.b.LEFT).b(P.r(d.b.RIGHT), this.f17889m, this.f17895s, false);
                return;
            case 7:
                eVar.r(d.b.RIGHT).b(P.r(d.b.LEFT), this.f17890n, this.f17896t, false);
                return;
            case 8:
                d.b bVar4 = d.b.RIGHT;
                eVar.r(bVar4).b(P.r(bVar4), this.f17890n, this.f17896t, false);
                return;
            case 9:
                d.b bVar5 = d.b.TOP;
                eVar.r(bVar5).b(P.r(bVar5), this.f17891o, this.f17897u, false);
                return;
            case 10:
                eVar.r(d.b.TOP).b(P.r(d.b.BOTTOM), this.f17891o, this.f17897u, false);
                return;
            case 11:
                eVar.r(d.b.BOTTOM).b(P.r(d.b.TOP), this.f17892p, this.f17898v, false);
                return;
            case 12:
                d.b bVar6 = d.b.BOTTOM;
                eVar.r(bVar6).b(P.r(bVar6), this.f17892p, this.f17898v, false);
                return;
            case 13:
                eVar.v0(d.b.BASELINE, P, d.b.BOTTOM, this.f17899w, this.f17900x);
                return;
            case 14:
                eVar.v0(d.b.BASELINE, P, d.b.TOP, this.f17899w, this.f17900x);
                return;
            case 15:
                d.b bVar7 = d.b.BASELINE;
                eVar.v0(bVar7, P, bVar7, this.f17899w, this.f17900x);
                return;
            case 16:
                eVar.m(P, this.f17869a0, (int) this.f17871b0);
                return;
            default:
                return;
        }
    }

    public a i0() {
        if (this.M != null) {
            this.f17873c0 = h.c.RIGHT_TO_LEFT;
        } else {
            this.f17873c0 = h.c.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public a j() {
        this.f17873c0 = h.c.BASELINE_TO_BASELINE;
        return this;
    }

    public a j0(Object obj) {
        this.f17873c0 = h.c.RIGHT_TO_LEFT;
        this.M = obj;
        return this;
    }

    public a k(Object obj) {
        this.f17873c0 = h.c.BASELINE_TO_BASELINE;
        this.W = obj;
        return this;
    }

    public a k0(Object obj) {
        this.f17873c0 = h.c.RIGHT_TO_RIGHT;
        this.N = obj;
        return this;
    }

    public a l(Object obj) {
        this.f17873c0 = h.c.BASELINE_TO_BOTTOM;
        this.Y = obj;
        return this;
    }

    public a l0(float f7) {
        this.A = f7;
        return this;
    }

    public a m(Object obj) {
        this.f17873c0 = h.c.BASELINE_TO_TOP;
        this.X = obj;
        return this;
    }

    public a m0(float f7) {
        this.B = f7;
        return this;
    }

    public a n(float f7) {
        h.c cVar = this.f17873c0;
        if (cVar == null) {
            return this;
        }
        int i7 = C0254a.f17903a[cVar.ordinal()];
        if (i7 != 17) {
            if (i7 != 18) {
                switch (i7) {
                }
                return this;
            }
            this.f17886j = f7;
            return this;
        }
        this.f17884i = f7;
        return this;
    }

    public a n0(float f7) {
        this.C = f7;
        return this;
    }

    public a o() {
        if (this.U != null) {
            this.f17873c0 = h.c.BOTTOM_TO_TOP;
        } else {
            this.f17873c0 = h.c.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public a o0(float f7) {
        this.H = f7;
        return this;
    }

    public a p(Object obj) {
        this.f17873c0 = h.c.BOTTOM_TO_BOTTOM;
        this.V = obj;
        return this;
    }

    public a p0(float f7) {
        this.I = f7;
        return this;
    }

    public a q(Object obj) {
        this.f17873c0 = h.c.BOTTOM_TO_TOP;
        this.U = obj;
        return this;
    }

    public void q0(x.e eVar) {
        this.f17874d = eVar;
        if (eVar != null) {
            c(eVar.a());
        }
    }

    public a r(Object obj) {
        Object C = C(obj);
        this.O = C;
        this.R = C;
        this.f17873c0 = h.c.CENTER_HORIZONTALLY;
        this.f17884i = 0.5f;
        return this;
    }

    public a r0(w.b bVar) {
        this.f17877e0 = bVar;
        return this;
    }

    public a s(Object obj) {
        Object C = C(obj);
        this.S = C;
        this.V = C;
        this.f17873c0 = h.c.CENTER_VERTICALLY;
        this.f17886j = 0.5f;
        return this;
    }

    public void s0(int i7) {
        this.f17876e = i7;
    }

    public a t(Object obj, float f7, float f8) {
        this.Z = C(obj);
        this.f17869a0 = f7;
        this.f17871b0 = f8;
        this.f17873c0 = h.c.CIRCULAR_CONSTRAINT;
        return this;
    }

    public void t0(float f7) {
        this.f17880g = f7;
    }

    public a u() {
        h.c cVar = this.f17873c0;
        if (cVar != null) {
            switch (C0254a.f17903a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.K = null;
                    this.L = null;
                    this.f17887k = 0;
                    this.f17893q = 0;
                    break;
                case 3:
                case 4:
                    this.M = null;
                    this.N = null;
                    this.f17888l = 0;
                    this.f17894r = 0;
                    break;
                case 5:
                case 6:
                    this.O = null;
                    this.P = null;
                    this.f17889m = 0;
                    this.f17895s = 0;
                    break;
                case 7:
                case 8:
                    this.Q = null;
                    this.R = null;
                    this.f17890n = 0;
                    this.f17896t = 0;
                    break;
                case 9:
                case 10:
                    this.S = null;
                    this.T = null;
                    this.f17891o = 0;
                    this.f17897u = 0;
                    break;
                case 11:
                case 12:
                    this.U = null;
                    this.V = null;
                    this.f17892p = 0;
                    this.f17898v = 0;
                    break;
                case 15:
                    this.W = null;
                    break;
                case 16:
                    this.Z = null;
                    break;
            }
        } else {
            this.K = null;
            this.L = null;
            this.f17887k = 0;
            this.M = null;
            this.N = null;
            this.f17888l = 0;
            this.O = null;
            this.P = null;
            this.f17889m = 0;
            this.Q = null;
            this.R = null;
            this.f17890n = 0;
            this.S = null;
            this.T = null;
            this.f17891o = 0;
            this.U = null;
            this.V = null;
            this.f17892p = 0;
            this.W = null;
            this.Z = null;
            this.f17884i = 0.5f;
            this.f17886j = 0.5f;
            this.f17893q = 0;
            this.f17894r = 0;
            this.f17895s = 0;
            this.f17896t = 0;
            this.f17897u = 0;
            this.f17898v = 0;
        }
        return this;
    }

    public void u0(String str) {
        this.f17872c = str;
    }

    public a v() {
        z0().u();
        z().u();
        Z().u();
        i0().u();
        return this;
    }

    public void v0(int i7) {
        this.f17878f = i7;
    }

    public a w() {
        C0().u();
        j().u();
        o().u();
        return this;
    }

    public void w0(float f7) {
        this.f17882h = f7;
    }

    public y.e x() {
        return new y.e(W().n(), E().n());
    }

    public void x0(Object obj) {
        this.f17879f0 = obj;
        y.e eVar = this.f17881g0;
        if (eVar != null) {
            eVar.h1(obj);
        }
    }

    public final void y() {
        this.K = C(this.K);
        this.L = C(this.L);
        this.M = C(this.M);
        this.N = C(this.N);
        this.O = C(this.O);
        this.P = C(this.P);
        this.Q = C(this.Q);
        this.R = C(this.R);
        this.S = C(this.S);
        this.T = C(this.T);
        this.U = C(this.U);
        this.V = C(this.V);
        this.W = C(this.W);
        this.X = C(this.X);
        this.Y = C(this.Y);
    }

    public a y0(w.b bVar) {
        this.f17875d0 = bVar;
        return this;
    }

    public a z() {
        if (this.Q != null) {
            this.f17873c0 = h.c.END_TO_START;
        } else {
            this.f17873c0 = h.c.END_TO_END;
        }
        return this;
    }

    public a z0() {
        if (this.O != null) {
            this.f17873c0 = h.c.START_TO_START;
        } else {
            this.f17873c0 = h.c.START_TO_END;
        }
        return this;
    }
}