package w;

import java.util.HashMap;
import java.util.Set;
import u.v;
import w.q;
import y.d;
/* loaded from: classes.dex */
public class r {

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f18011u = true;

    /* renamed from: v  reason: collision with root package name */
    public static float f18012v = Float.NaN;

    /* renamed from: a  reason: collision with root package name */
    public y.e f18013a;

    /* renamed from: b  reason: collision with root package name */
    public int f18014b;

    /* renamed from: c  reason: collision with root package name */
    public int f18015c;

    /* renamed from: d  reason: collision with root package name */
    public int f18016d;

    /* renamed from: e  reason: collision with root package name */
    public int f18017e;

    /* renamed from: f  reason: collision with root package name */
    public float f18018f;

    /* renamed from: g  reason: collision with root package name */
    public float f18019g;

    /* renamed from: h  reason: collision with root package name */
    public float f18020h;

    /* renamed from: i  reason: collision with root package name */
    public float f18021i;

    /* renamed from: j  reason: collision with root package name */
    public float f18022j;

    /* renamed from: k  reason: collision with root package name */
    public float f18023k;

    /* renamed from: l  reason: collision with root package name */
    public float f18024l;

    /* renamed from: m  reason: collision with root package name */
    public float f18025m;

    /* renamed from: n  reason: collision with root package name */
    public float f18026n;

    /* renamed from: o  reason: collision with root package name */
    public float f18027o;

    /* renamed from: p  reason: collision with root package name */
    public float f18028p;

    /* renamed from: q  reason: collision with root package name */
    public float f18029q;

    /* renamed from: r  reason: collision with root package name */
    public int f18030r;

    /* renamed from: s  reason: collision with root package name */
    public final HashMap<String, r.b> f18031s;

    /* renamed from: t  reason: collision with root package name */
    public String f18032t;

    public r() {
        this.f18013a = null;
        this.f18014b = 0;
        this.f18015c = 0;
        this.f18016d = 0;
        this.f18017e = 0;
        this.f18018f = Float.NaN;
        this.f18019g = Float.NaN;
        this.f18020h = Float.NaN;
        this.f18021i = Float.NaN;
        this.f18022j = Float.NaN;
        this.f18023k = Float.NaN;
        this.f18024l = Float.NaN;
        this.f18025m = Float.NaN;
        this.f18026n = Float.NaN;
        this.f18027o = Float.NaN;
        this.f18028p = Float.NaN;
        this.f18029q = Float.NaN;
        this.f18030r = 0;
        this.f18031s = new HashMap<>();
        this.f18032t = null;
    }

    public static void a(StringBuilder sb, String str, float f7) {
        if (Float.isNaN(f7)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f7);
        sb.append(",\n");
    }

    public static void b(StringBuilder sb, String str, int i7) {
        sb.append(str);
        sb.append(": ");
        sb.append(i7);
        sb.append(",\n");
    }

    public static float m(float f7, float f8, float f9, float f10) {
        boolean isNaN = Float.isNaN(f7);
        boolean isNaN2 = Float.isNaN(f8);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f7 = f9;
        }
        if (isNaN2) {
            f8 = f9;
        }
        return f7 + (f10 * (f8 - f7));
    }

    public static void n(int i7, int i8, r rVar, r rVar2, r rVar3, q qVar, float f7) {
        int i9;
        float f8;
        int i10;
        int i11;
        float f9;
        float f10;
        int i12;
        float f11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f12 = 100.0f * f7;
        int i19 = (int) f12;
        int i20 = rVar2.f18014b;
        int i21 = rVar2.f18015c;
        int i22 = rVar3.f18014b;
        int i23 = rVar3.f18015c;
        int i24 = rVar2.f18016d - i20;
        int i25 = rVar2.f18017e - i21;
        int i26 = rVar3.f18016d - i22;
        int i27 = rVar3.f18017e - i23;
        float f13 = rVar2.f18028p;
        float f14 = rVar3.f18028p;
        if (rVar2.f18030r == 8) {
            i21 = (int) (i21 - (i27 / 2.0f));
            i11 = (int) (i20 - (i26 / 2.0f));
            if (Float.isNaN(f13)) {
                i10 = i27;
                i9 = i26;
                f8 = 0.0f;
            } else {
                f8 = f13;
                i9 = i26;
                i10 = i27;
            }
        } else {
            i9 = i24;
            f8 = f13;
            i10 = i25;
            i11 = i20;
        }
        if (rVar3.f18030r == 8) {
            i22 = (int) (i22 - (i9 / 2.0f));
            i23 = (int) (i23 - (i10 / 2.0f));
            i26 = i9;
            i27 = i10;
            if (Float.isNaN(f14)) {
                f14 = 0.0f;
            }
        }
        if (Float.isNaN(f8) && !Float.isNaN(f14)) {
            f8 = 1.0f;
        }
        if (!Float.isNaN(f8) && Float.isNaN(f14)) {
            f14 = 1.0f;
        }
        if (rVar2.f18030r == 4) {
            f10 = f14;
            f9 = 0.0f;
        } else {
            f9 = f8;
            f10 = f14;
        }
        float f15 = rVar3.f18030r == 4 ? 0.0f : f10;
        if (rVar.f18013a == null || !qVar.N()) {
            i12 = i21;
            f11 = f7;
            i13 = i11;
            i14 = i22;
        } else {
            q.a x6 = qVar.x(rVar.f18013a.f18604o, i19);
            i12 = i21;
            q.a w6 = qVar.w(rVar.f18013a.f18604o, i19);
            if (x6 == w6) {
                w6 = null;
            }
            if (x6 != null) {
                i11 = (int) (x6.f17999d * i7);
                i16 = i22;
                i15 = i8;
                i12 = (int) (x6.f18000e * i15);
                i17 = x6.f17996a;
            } else {
                i15 = i8;
                i16 = i22;
                i17 = 0;
            }
            i13 = i11;
            if (w6 != null) {
                int i28 = (int) (w6.f17999d * i7);
                int i29 = (int) (w6.f18000e * i15);
                i18 = w6.f17996a;
                i14 = i28;
                i23 = i29;
            } else {
                i18 = 100;
                i14 = i16;
            }
            f11 = (f12 - i17) / (i18 - i17);
        }
        rVar.f18013a = rVar2.f18013a;
        int i30 = (int) (i13 + ((i14 - i13) * f11));
        rVar.f18014b = i30;
        int i31 = (int) (i12 + (f11 * (i23 - r10)));
        rVar.f18015c = i31;
        float f16 = 1.0f - f7;
        rVar.f18016d = i30 + ((int) ((i9 * f16) + (i26 * f7)));
        rVar.f18017e = i31 + ((int) ((f16 * i10) + (i27 * f7)));
        rVar.f18018f = m(rVar2.f18018f, rVar3.f18018f, 0.5f, f7);
        rVar.f18019g = m(rVar2.f18019g, rVar3.f18019g, 0.5f, f7);
        rVar.f18020h = m(rVar2.f18020h, rVar3.f18020h, 0.0f, f7);
        rVar.f18021i = m(rVar2.f18021i, rVar3.f18021i, 0.0f, f7);
        rVar.f18022j = m(rVar2.f18022j, rVar3.f18022j, 0.0f, f7);
        rVar.f18026n = m(rVar2.f18026n, rVar3.f18026n, 1.0f, f7);
        rVar.f18027o = m(rVar2.f18027o, rVar3.f18027o, 1.0f, f7);
        rVar.f18023k = m(rVar2.f18023k, rVar3.f18023k, 0.0f, f7);
        rVar.f18024l = m(rVar2.f18024l, rVar3.f18024l, 0.0f, f7);
        rVar.f18025m = m(rVar2.f18025m, rVar3.f18025m, 0.0f, f7);
        rVar.f18028p = m(f9, f15, 1.0f, f7);
        Set<String> keySet = rVar3.f18031s.keySet();
        rVar.f18031s.clear();
        for (String str : keySet) {
            if (rVar2.f18031s.containsKey(str)) {
                r.b bVar = rVar2.f18031s.get(str);
                r.b bVar2 = rVar3.f18031s.get(str);
                r.b bVar3 = new r.b(bVar);
                rVar.f18031s.put(str, bVar3);
                if (bVar.r() == 1) {
                    bVar3.y(Float.valueOf(m(bVar.n(), bVar2.n(), 0.0f, f7)));
                } else {
                    int r6 = bVar.r();
                    float[] fArr = new float[r6];
                    float[] fArr2 = new float[r6];
                    bVar.o(fArr);
                    bVar2.o(fArr2);
                    for (int i32 = 0; i32 < r6; i32++) {
                        fArr[i32] = m(fArr[i32], fArr2[i32], 0.0f, f7);
                        bVar3.z(fArr);
                    }
                }
            }
        }
    }

    public boolean A(String str, v.c cVar) throws v.h {
        str.hashCode();
        char c7 = 65535;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    c7 = 0;
                    break;
                }
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c7 = 1;
                    break;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c7 = 2;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c7 = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c7 = 4;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c7 = 5;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c7 = 6;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c7 = 7;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c7 = '\b';
                    break;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c7 = '\t';
                    break;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c7 = '\n';
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c7 = 11;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c7 = '\r';
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c7 = 14;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c7 = 15;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c7 = 16;
                    break;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    c7 = 17;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                f18012v = cVar.g();
                break;
            case 1:
                this.f18017e = cVar.h();
                break;
            case 2:
                q(cVar);
                break;
            case 3:
                this.f18020h = cVar.g();
                break;
            case 4:
                this.f18021i = cVar.g();
                break;
            case 5:
                this.f18022j = cVar.g();
                break;
            case 6:
                this.f18023k = cVar.g();
                break;
            case 7:
                this.f18024l = cVar.g();
                break;
            case '\b':
                this.f18025m = cVar.g();
                break;
            case '\t':
                this.f18018f = cVar.g();
                break;
            case '\n':
                this.f18019g = cVar.g();
                break;
            case 11:
                this.f18026n = cVar.g();
                break;
            case '\f':
                this.f18027o = cVar.g();
                break;
            case '\r':
                this.f18015c = cVar.h();
                break;
            case 14:
                this.f18014b = cVar.h();
                break;
            case 15:
                this.f18028p = cVar.g();
                break;
            case 16:
                this.f18016d = cVar.h();
                break;
            case 17:
                this.f18029q = cVar.g();
                break;
            default:
                return false;
        }
        return true;
    }

    public r B() {
        y.e eVar = this.f18013a;
        if (eVar != null) {
            this.f18014b = eVar.L();
            this.f18015c = this.f18013a.e0();
            this.f18016d = this.f18013a.X();
            this.f18017e = this.f18013a.v();
            D(this.f18013a.f18602n);
        }
        return this;
    }

    public r C(y.e eVar) {
        if (eVar == null) {
            return this;
        }
        this.f18013a = eVar;
        B();
        return this;
    }

    public void D(r rVar) {
        this.f18018f = rVar.f18018f;
        this.f18019g = rVar.f18019g;
        this.f18020h = rVar.f18020h;
        this.f18021i = rVar.f18021i;
        this.f18022j = rVar.f18022j;
        this.f18023k = rVar.f18023k;
        this.f18024l = rVar.f18024l;
        this.f18025m = rVar.f18025m;
        this.f18026n = rVar.f18026n;
        this.f18027o = rVar.f18027o;
        this.f18028p = rVar.f18028p;
        this.f18030r = rVar.f18030r;
        this.f18031s.clear();
        for (r.b bVar : rVar.f18031s.values()) {
            this.f18031s.put(bVar.k(), bVar.d());
        }
    }

    public int E() {
        return Math.max(0, this.f18016d - this.f18014b);
    }

    public void c(String str, int i7) {
        w(str, v.b.f17147l, i7);
    }

    public void d(String str, float f7) {
        v(str, v.b.f17146k, f7);
    }

    public float e() {
        return this.f18014b + ((this.f18016d - r0) / 2.0f);
    }

    public float f() {
        return this.f18015c + ((this.f18017e - r0) / 2.0f);
    }

    public r.b g(String str) {
        return this.f18031s.get(str);
    }

    public Set<String> h() {
        return this.f18031s.keySet();
    }

    public int i(String str) {
        if (this.f18031s.containsKey(str)) {
            return this.f18031s.get(str).g();
        }
        return -21880;
    }

    public float j(String str) {
        if (this.f18031s.containsKey(str)) {
            return this.f18031s.get(str).h();
        }
        return Float.NaN;
    }

    public String k() {
        y.e eVar = this.f18013a;
        return eVar == null ? z0.m.f19022b : eVar.f18604o;
    }

    public int l() {
        return Math.max(0, this.f18017e - this.f18015c);
    }

    public boolean o() {
        return Float.isNaN(this.f18020h) && Float.isNaN(this.f18021i) && Float.isNaN(this.f18022j) && Float.isNaN(this.f18023k) && Float.isNaN(this.f18024l) && Float.isNaN(this.f18025m) && Float.isNaN(this.f18026n) && Float.isNaN(this.f18027o) && Float.isNaN(this.f18028p);
    }

    public void p(String str) {
        String str2;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str3 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.f18013a != null) {
            str2 = str3 + "/" + (this.f18013a.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        System.out.println(str2 + " " + str);
    }

    public void q(v.c cVar) throws v.h {
        v.f fVar = (v.f) cVar;
        int size = fVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            v.d dVar = (v.d) fVar.w(i7);
            dVar.b();
            v.c Y = dVar.Y();
            String b7 = Y.b();
            if (b7.matches("#[0-9a-fA-F]+")) {
                w(dVar.b(), v.b.f17147l, Integer.parseInt(b7.substring(1), 16));
            } else if (Y instanceof v.e) {
                v(dVar.b(), v.b.f17146k, Y.g());
            } else {
                x(dVar.b(), v.b.f17148m, b7);
            }
        }
    }

    public void r() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        String str2 = this.f18013a != null ? str + "/" + (this.f18013a.hashCode() % 1000) + " " : str + "/NULL ";
        HashMap<String, r.b> hashMap = this.f18031s;
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                System.out.println(str2 + this.f18031s.get(str3).toString());
            }
        }
    }

    public StringBuilder s(StringBuilder sb) {
        return t(sb, false);
    }

    public StringBuilder t(StringBuilder sb, boolean z6) {
        sb.append("{\n");
        b(sb, "left", this.f18014b);
        b(sb, "top", this.f18015c);
        b(sb, "right", this.f18016d);
        b(sb, "bottom", this.f18017e);
        a(sb, "pivotX", this.f18018f);
        a(sb, "pivotY", this.f18019g);
        a(sb, "rotationX", this.f18020h);
        a(sb, "rotationY", this.f18021i);
        a(sb, "rotationZ", this.f18022j);
        a(sb, "translationX", this.f18023k);
        a(sb, "translationY", this.f18024l);
        a(sb, "translationZ", this.f18025m);
        a(sb, "scaleX", this.f18026n);
        a(sb, "scaleY", this.f18027o);
        a(sb, "alpha", this.f18028p);
        b(sb, "visibility", this.f18030r);
        a(sb, "interpolatedPos", this.f18029q);
        if (this.f18013a != null) {
            for (d.b bVar : d.b.values()) {
                u(sb, bVar);
            }
        }
        if (z6) {
            a(sb, "phone_orientation", f18012v);
        }
        if (z6) {
            a(sb, "phone_orientation", f18012v);
        }
        if (this.f18031s.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.f18031s.keySet()) {
                r.b bVar2 = this.f18031s.get(str);
                sb.append(str);
                sb.append(": ");
                switch (bVar2.m()) {
                    case v.b.f17145j /* 900 */:
                        sb.append(bVar2.i());
                        sb.append(",\n");
                        break;
                    case v.b.f17146k /* 901 */:
                    case v.b.f17150o /* 905 */:
                        sb.append(bVar2.h());
                        sb.append(",\n");
                        break;
                    case v.b.f17147l /* 902 */:
                        sb.append("'");
                        sb.append(r.b.c(bVar2.i()));
                        sb.append("',\n");
                        break;
                    case v.b.f17148m /* 903 */:
                        sb.append("'");
                        sb.append(bVar2.l());
                        sb.append("',\n");
                        break;
                    case v.b.f17149n /* 904 */:
                        sb.append("'");
                        sb.append(bVar2.f());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public final void u(StringBuilder sb, d.b bVar) {
        y.d r6 = this.f18013a.r(bVar);
        if (r6 == null || r6.f18535f == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(bVar.name());
        sb.append(": ['");
        String str = r6.f18535f.i().f18604o;
        if (str == null) {
            str = "#PARENT";
        }
        sb.append(str);
        sb.append("', '");
        sb.append(r6.f18535f.l().name());
        sb.append("', '");
        sb.append(r6.f18536g);
        sb.append("'],\n");
    }

    public void v(String str, int i7, float f7) {
        if (this.f18031s.containsKey(str)) {
            this.f18031s.get(str).u(f7);
        } else {
            this.f18031s.put(str, new r.b(str, i7, f7));
        }
    }

    public void w(String str, int i7, int i8) {
        if (this.f18031s.containsKey(str)) {
            this.f18031s.get(str).v(i8);
        } else {
            this.f18031s.put(str, new r.b(str, i7, i8));
        }
    }

    public void x(String str, int i7, String str2) {
        if (this.f18031s.containsKey(str)) {
            this.f18031s.get(str).x(str2);
        } else {
            this.f18031s.put(str, new r.b(str, i7, str2));
        }
    }

    public void y(String str, int i7, boolean z6) {
        if (this.f18031s.containsKey(str)) {
            this.f18031s.get(str).t(z6);
        } else {
            this.f18031s.put(str, new r.b(str, i7, z6));
        }
    }

    public void z(r.a aVar, float[] fArr) {
    }

    public r(y.e eVar) {
        this.f18013a = null;
        this.f18014b = 0;
        this.f18015c = 0;
        this.f18016d = 0;
        this.f18017e = 0;
        this.f18018f = Float.NaN;
        this.f18019g = Float.NaN;
        this.f18020h = Float.NaN;
        this.f18021i = Float.NaN;
        this.f18022j = Float.NaN;
        this.f18023k = Float.NaN;
        this.f18024l = Float.NaN;
        this.f18025m = Float.NaN;
        this.f18026n = Float.NaN;
        this.f18027o = Float.NaN;
        this.f18028p = Float.NaN;
        this.f18029q = Float.NaN;
        this.f18030r = 0;
        this.f18031s = new HashMap<>();
        this.f18032t = null;
        this.f18013a = eVar;
    }

    public r(r rVar) {
        this.f18013a = null;
        this.f18014b = 0;
        this.f18015c = 0;
        this.f18016d = 0;
        this.f18017e = 0;
        this.f18018f = Float.NaN;
        this.f18019g = Float.NaN;
        this.f18020h = Float.NaN;
        this.f18021i = Float.NaN;
        this.f18022j = Float.NaN;
        this.f18023k = Float.NaN;
        this.f18024l = Float.NaN;
        this.f18025m = Float.NaN;
        this.f18026n = Float.NaN;
        this.f18027o = Float.NaN;
        this.f18028p = Float.NaN;
        this.f18029q = Float.NaN;
        this.f18030r = 0;
        this.f18031s = new HashMap<>();
        this.f18032t = null;
        this.f18013a = rVar.f18013a;
        this.f18014b = rVar.f18014b;
        this.f18015c = rVar.f18015c;
        this.f18016d = rVar.f18016d;
        this.f18017e = rVar.f18017e;
        D(rVar);
    }
}
