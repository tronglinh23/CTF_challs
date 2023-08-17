package w;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import u.u;
import u.v;
/* loaded from: classes.dex */
public class q implements v {
    public static final int A = -1;
    public static final int B = -2;

    /* renamed from: q  reason: collision with root package name */
    public static final int f17977q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f17978r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f17979s = 2;

    /* renamed from: t  reason: collision with root package name */
    public static final int f17980t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final int f17981u = 1;

    /* renamed from: v  reason: collision with root package name */
    public static final int f17982v = 2;

    /* renamed from: w  reason: collision with root package name */
    public static final int f17983w = 3;

    /* renamed from: x  reason: collision with root package name */
    public static final int f17984x = 4;

    /* renamed from: y  reason: collision with root package name */
    public static final int f17985y = 5;

    /* renamed from: z  reason: collision with root package name */
    public static final int f17986z = 6;

    /* renamed from: h  reason: collision with root package name */
    public HashMap<Integer, HashMap<String, a>> f17987h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public HashMap<String, b> f17988i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public u f17989j = new u();

    /* renamed from: k  reason: collision with root package name */
    public int f17990k = 0;

    /* renamed from: l  reason: collision with root package name */
    public String f17991l = null;

    /* renamed from: m  reason: collision with root package name */
    public u.d f17992m = null;

    /* renamed from: n  reason: collision with root package name */
    public int f17993n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f17994o = 400;

    /* renamed from: p  reason: collision with root package name */
    public float f17995p = 0.0f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f17996a;

        /* renamed from: b  reason: collision with root package name */
        public String f17997b;

        /* renamed from: c  reason: collision with root package name */
        public int f17998c;

        /* renamed from: d  reason: collision with root package name */
        public float f17999d;

        /* renamed from: e  reason: collision with root package name */
        public float f18000e;

        public a(String str, int i7, int i8, float f7, float f8) {
            this.f17997b = str;
            this.f17996a = i7;
            this.f17998c = i8;
            this.f17999d = f7;
            this.f18000e = f8;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: d  reason: collision with root package name */
        public r.c f18004d;

        /* renamed from: h  reason: collision with root package name */
        public u.g f18008h = new u.g();

        /* renamed from: i  reason: collision with root package name */
        public int f18009i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f18010j = -1;

        /* renamed from: a  reason: collision with root package name */
        public r f18001a = new r();

        /* renamed from: b  reason: collision with root package name */
        public r f18002b = new r();

        /* renamed from: c  reason: collision with root package name */
        public r f18003c = new r();

        /* renamed from: e  reason: collision with root package name */
        public r.f f18005e = new r.f(this.f18001a);

        /* renamed from: f  reason: collision with root package name */
        public r.f f18006f = new r.f(this.f18002b);

        /* renamed from: g  reason: collision with root package name */
        public r.f f18007g = new r.f(this.f18003c);

        public b() {
            r.c cVar = new r.c(this.f18005e);
            this.f18004d = cVar;
            cVar.Z(this.f18005e);
            this.f18004d.X(this.f18006f);
        }

        public r a(int i7) {
            return i7 == 0 ? this.f18001a : i7 == 1 ? this.f18002b : this.f18003c;
        }

        public void b(int i7, int i8, float f7, q qVar) {
            this.f18009i = i8;
            this.f18010j = i7;
            this.f18004d.d0(i7, i8, 1.0f, System.nanoTime());
            r.n(i7, i8, this.f18003c, this.f18001a, this.f18002b, qVar, f7);
            this.f18003c.f18029q = f7;
            this.f18004d.Q(this.f18007g, f7, System.nanoTime(), this.f18008h);
        }

        public void c(u uVar) {
            s.c cVar = new s.c();
            uVar.g(cVar);
            this.f18004d.f(cVar);
        }

        public void d(u uVar) {
            s.d dVar = new s.d();
            uVar.g(dVar);
            this.f18004d.f(dVar);
        }

        public void e(u uVar) {
            s.e eVar = new s.e();
            uVar.g(eVar);
            this.f18004d.f(eVar);
        }

        public void f(y.e eVar, int i7) {
            if (i7 == 0) {
                this.f18001a.C(eVar);
                this.f18004d.Z(this.f18005e);
            } else if (i7 == 1) {
                this.f18002b.C(eVar);
                this.f18004d.X(this.f18006f);
            }
            this.f18010j = -1;
        }
    }

    public static d E(int i7, final String str) {
        switch (i7) {
            case -1:
                return new d() { // from class: w.i
                    @Override // w.d
                    public final float getInterpolation(float f7) {
                        float Q;
                        Q = q.Q(str, f7);
                        return Q;
                    }
                };
            case 0:
                return new d() { // from class: w.j
                    @Override // w.d
                    public final float getInterpolation(float f7) {
                        float R;
                        R = q.R(f7);
                        return R;
                    }
                };
            case 1:
                return new d() { // from class: w.k
                    @Override // w.d
                    public final float getInterpolation(float f7) {
                        float S;
                        S = q.S(f7);
                        return S;
                    }
                };
            case 2:
                return new d() { // from class: w.l
                    @Override // w.d
                    public final float getInterpolation(float f7) {
                        float T;
                        T = q.T(f7);
                        return T;
                    }
                };
            case 3:
                return new d() { // from class: w.m
                    @Override // w.d
                    public final float getInterpolation(float f7) {
                        float U;
                        U = q.U(f7);
                        return U;
                    }
                };
            case 4:
                return new d() { // from class: w.p
                    @Override // w.d
                    public final float getInterpolation(float f7) {
                        float X;
                        X = q.X(f7);
                        return X;
                    }
                };
            case 5:
                return new d() { // from class: w.o
                    @Override // w.d
                    public final float getInterpolation(float f7) {
                        float W;
                        W = q.W(f7);
                        return W;
                    }
                };
            case 6:
                return new d() { // from class: w.n
                    @Override // w.d
                    public final float getInterpolation(float f7) {
                        float V;
                        V = q.V(f7);
                        return V;
                    }
                };
            default:
                return null;
        }
    }

    public static /* synthetic */ float Q(String str, float f7) {
        return (float) u.d.c(str).a(f7);
    }

    public static /* synthetic */ float R(float f7) {
        return (float) u.d.c(u.d.f16906k).a(f7);
    }

    public static /* synthetic */ float S(float f7) {
        return (float) u.d.c(u.d.f16905j).a(f7);
    }

    public static /* synthetic */ float T(float f7) {
        return (float) u.d.c(u.d.f16904i).a(f7);
    }

    public static /* synthetic */ float U(float f7) {
        return (float) u.d.c(u.d.f16907l).a(f7);
    }

    public static /* synthetic */ float V(float f7) {
        return (float) u.d.c(u.d.f16908m).a(f7);
    }

    public static /* synthetic */ float W(float f7) {
        return (float) u.d.c(u.d.f16909n).a(f7);
    }

    public static /* synthetic */ float X(float f7) {
        return (float) u.d.c("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").a(f7);
    }

    public r A(y.e eVar) {
        return M(eVar.f18604o, null, 1).f18002b;
    }

    public r B(String str) {
        b bVar = this.f17988i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f18003c;
    }

    public r C(y.e eVar) {
        return M(eVar.f18604o, null, 2).f18003c;
    }

    public d D() {
        return E(this.f17990k, this.f17991l);
    }

    public int F(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f17988i.get(str).f18004d.j(fArr, iArr, iArr2);
    }

    public r.c G(String str) {
        return M(str, null, 0).f18004d;
    }

    public int H(r rVar) {
        int i7 = 0;
        for (int i8 = 0; i8 <= 100; i8++) {
            HashMap<String, a> hashMap = this.f17987h.get(Integer.valueOf(i8));
            if (hashMap != null && hashMap.get(rVar.f18013a.f18604o) != null) {
                i7++;
            }
        }
        return i7;
    }

    public float[] I(String str) {
        float[] fArr = new float[124];
        this.f17988i.get(str).f18004d.k(fArr, 62);
        return fArr;
    }

    public r J(String str) {
        b bVar = this.f17988i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f18001a;
    }

    public r K(y.e eVar) {
        return M(eVar.f18604o, null, 0).f18001a;
    }

    public final b L(String str) {
        return this.f17988i.get(str);
    }

    public final b M(String str, y.e eVar, int i7) {
        b bVar = this.f17988i.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f17989j.g(bVar.f18004d);
            this.f17988i.put(str, bVar);
            if (eVar != null) {
                bVar.f(eVar, i7);
            }
        }
        return bVar;
    }

    public boolean N() {
        return this.f17987h.size() > 0;
    }

    public void O(int i7, int i8, float f7) {
        u.d dVar = this.f17992m;
        if (dVar != null) {
            f7 = (float) dVar.a(f7);
        }
        Iterator<String> it = this.f17988i.keySet().iterator();
        while (it.hasNext()) {
            this.f17988i.get(it.next()).b(i7, i8, f7, this);
        }
    }

    public boolean P() {
        return this.f17988i.isEmpty();
    }

    public void Y(u uVar) {
        uVar.f(this.f17989j);
        uVar.g(this);
    }

    public void Z(y.f fVar, int i7) {
        ArrayList<y.e> l22 = fVar.l2();
        int size = l22.size();
        for (int i8 = 0; i8 < size; i8++) {
            y.e eVar = l22.get(i8);
            M(eVar.f18604o, null, i7).f(eVar, i7);
        }
    }

    @Override // u.v
    public int a(String str) {
        return 0;
    }

    @Override // u.v
    public boolean b(int i7, int i8) {
        return false;
    }

    @Override // u.v
    public boolean c(int i7, float f7) {
        if (i7 == 706) {
            this.f17995p = f7;
            return false;
        }
        return false;
    }

    @Override // u.v
    public boolean d(int i7, String str) {
        if (i7 == 705) {
            this.f17991l = str;
            this.f17992m = u.d.c(str);
            return false;
        }
        return false;
    }

    @Override // u.v
    public boolean e(int i7, boolean z6) {
        return false;
    }

    public void n(int i7, String str, String str2, int i8) {
        M(str, null, i7).a(i7).c(str2, i8);
    }

    public void o(int i7, String str, String str2, float f7) {
        M(str, null, i7).a(i7).d(str2, f7);
    }

    public void p(String str, u uVar) {
        M(str, null, 0).c(uVar);
    }

    public void q(String str, u uVar) {
        M(str, null, 0).d(uVar);
    }

    public void r(String str, int i7, int i8, float f7, float f8) {
        u uVar = new u();
        uVar.b(v.g.f17250r, 2);
        uVar.b(100, i7);
        uVar.a(v.g.f17246n, f7);
        uVar.a(v.g.f17247o, f8);
        M(str, null, 0).e(uVar);
        a aVar = new a(str, i7, i8, f7, f8);
        HashMap<String, a> hashMap = this.f17987h.get(Integer.valueOf(i7));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.f17987h.put(Integer.valueOf(i7), hashMap);
        }
        hashMap.put(str, aVar);
    }

    public void s(String str, u uVar) {
        M(str, null, 0).e(uVar);
    }

    public void t() {
        this.f17988i.clear();
    }

    public boolean u(String str) {
        return this.f17988i.containsKey(str);
    }

    public void v(r rVar, float[] fArr, float[] fArr2, float[] fArr3) {
        a aVar;
        int i7 = 0;
        for (int i8 = 0; i8 <= 100; i8++) {
            HashMap<String, a> hashMap = this.f17987h.get(Integer.valueOf(i8));
            if (hashMap != null && (aVar = hashMap.get(rVar.f18013a.f18604o)) != null) {
                fArr[i7] = aVar.f17999d;
                fArr2[i7] = aVar.f18000e;
                fArr3[i7] = aVar.f17996a;
                i7++;
            }
        }
    }

    public a w(String str, int i7) {
        a aVar;
        while (i7 <= 100) {
            HashMap<String, a> hashMap = this.f17987h.get(Integer.valueOf(i7));
            if (hashMap != null && (aVar = hashMap.get(str)) != null) {
                return aVar;
            }
            i7++;
        }
        return null;
    }

    public a x(String str, int i7) {
        a aVar;
        while (i7 >= 0) {
            HashMap<String, a> hashMap = this.f17987h.get(Integer.valueOf(i7));
            if (hashMap != null && (aVar = hashMap.get(str)) != null) {
                return aVar;
            }
            i7--;
        }
        return null;
    }

    public int y() {
        return this.f17993n;
    }

    public r z(String str) {
        b bVar = this.f17988i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f18002b;
    }
}
