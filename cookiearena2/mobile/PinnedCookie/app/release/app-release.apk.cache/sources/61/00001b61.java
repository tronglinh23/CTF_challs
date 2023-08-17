package u4;

/* loaded from: classes.dex */
public class g0 extends q implements e0, e5.i {

    /* renamed from: r  reason: collision with root package name */
    public final int f17416r;
    @v3.g1(version = "1.4")

    /* renamed from: s  reason: collision with root package name */
    public final int f17417s;

    public g0(int i7) {
        this(i7, q.f17458q, null, null, null, 0);
    }

    @Override // u4.q
    @v3.g1(version = "1.1")
    /* renamed from: B0  reason: merged with bridge method [inline-methods] */
    public e5.i z0() {
        return (e5.i) super.z0();
    }

    @Override // u4.e0
    public int e() {
        return this.f17416r;
    }

    @Override // e5.i
    @v3.g1(version = "1.1")
    public boolean e0() {
        return z0().e0();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return getName().equals(g0Var.getName()) && A0().equals(g0Var.A0()) && this.f17417s == g0Var.f17417s && this.f17416r == g0Var.f17416r && l0.g(x0(), g0Var.x0()) && l0.g(y0(), g0Var.y0());
        } else if (obj instanceof e5.i) {
            return obj.equals(v0());
        } else {
            return false;
        }
    }

    @Override // e5.i
    @v3.g1(version = "1.1")
    public boolean g0() {
        return z0().g0();
    }

    public int hashCode() {
        return (((y0() == null ? 0 : y0().hashCode() * 31) + getName().hashCode()) * 31) + A0().hashCode();
    }

    @Override // u4.q, e5.c
    @v3.g1(version = "1.1")
    public boolean i() {
        return z0().i();
    }

    @Override // e5.i
    @v3.g1(version = "1.1")
    public boolean s0() {
        return z0().s0();
    }

    @Override // e5.i
    @v3.g1(version = "1.1")
    public boolean t() {
        return z0().t();
    }

    public String toString() {
        e5.c v02 = v0();
        if (v02 != this) {
            return v02.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + l1.f17441b;
    }

    @Override // u4.q
    @v3.g1(version = "1.1")
    public e5.c w0() {
        return l1.c(this);
    }

    @v3.g1(version = "1.1")
    public g0(int i7, Object obj) {
        this(i7, obj, null, null, null, 0);
    }

    @v3.g1(version = "1.4")
    public g0(int i7, Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f17416r = i7;
        this.f17417s = i8 >> 1;
    }
}