package s;

import java.util.HashMap;
import java.util.HashSet;
import u.o;
import u.v;

/* loaded from: classes.dex */
public abstract class b implements v {

    /* renamed from: m  reason: collision with root package name */
    public static int f16140m = -1;

    /* renamed from: n  reason: collision with root package name */
    public static final String f16141n = "alpha";

    /* renamed from: o  reason: collision with root package name */
    public static final String f16142o = "elevation";

    /* renamed from: p  reason: collision with root package name */
    public static final String f16143p = "rotationZ";

    /* renamed from: q  reason: collision with root package name */
    public static final String f16144q = "rotationX";

    /* renamed from: r  reason: collision with root package name */
    public static final String f16145r = "transitionPathRotate";

    /* renamed from: s  reason: collision with root package name */
    public static final String f16146s = "scaleX";

    /* renamed from: t  reason: collision with root package name */
    public static final String f16147t = "scaleY";

    /* renamed from: u  reason: collision with root package name */
    public static final String f16148u = "translationX";

    /* renamed from: v  reason: collision with root package name */
    public static final String f16149v = "translationY";

    /* renamed from: w  reason: collision with root package name */
    public static final String f16150w = "CUSTOM";

    /* renamed from: x  reason: collision with root package name */
    public static final String f16151x = "visibility";

    /* renamed from: h  reason: collision with root package name */
    public int f16152h;

    /* renamed from: i  reason: collision with root package name */
    public int f16153i;

    /* renamed from: j  reason: collision with root package name */
    public String f16154j;

    /* renamed from: k  reason: collision with root package name */
    public int f16155k;

    /* renamed from: l  reason: collision with root package name */
    public HashMap<String, r.b> f16156l;

    public b() {
        int i7 = f16140m;
        this.f16152h = i7;
        this.f16153i = i7;
        this.f16154j = null;
    }

    @Override // u.v
    public boolean b(int i7, int i8) {
        if (i7 != 100) {
            return false;
        }
        this.f16152h = i8;
        return true;
    }

    @Override // u.v
    public boolean c(int i7, float f7) {
        return false;
    }

    @Override // u.v
    public boolean d(int i7, String str) {
        if (i7 != 101) {
            return false;
        }
        this.f16154j = str;
        return true;
    }

    @Override // u.v
    public boolean e(int i7, boolean z6) {
        return false;
    }

    public abstract void f(HashMap<String, o> hashMap);

    @Override // 
    /* renamed from: g  reason: merged with bridge method [inline-methods] */
    public abstract b clone();

    public b h(b bVar) {
        this.f16152h = bVar.f16152h;
        this.f16153i = bVar.f16153i;
        this.f16154j = bVar.f16154j;
        this.f16155k = bVar.f16155k;
        return this;
    }

    public abstract void i(HashSet<String> hashSet);

    public int j() {
        return this.f16152h;
    }

    public boolean k(String str) {
        String str2 = this.f16154j;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void l(String str, int i7, float f7) {
        this.f16156l.put(str, new r.b(str, i7, f7));
    }

    public void m(String str, int i7, int i8) {
        this.f16156l.put(str, new r.b(str, i7, i8));
    }

    public void n(String str, int i7, String str2) {
        this.f16156l.put(str, new r.b(str, i7, str2));
    }

    public void o(String str, int i7, boolean z6) {
        this.f16156l.put(str, new r.b(str, i7, z6));
    }

    public void p(int i7) {
        this.f16152h = i7;
    }

    public void q(HashMap<String, Integer> hashMap) {
    }

    public b r(int i7) {
        this.f16153i = i7;
        return this;
    }

    public boolean s(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public float t(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int u(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}