package u4;

/* loaded from: classes.dex */
public abstract class j1 extends q implements e5.o {

    /* renamed from: r  reason: collision with root package name */
    public final boolean f17425r;

    public j1() {
        this.f17425r = false;
    }

    @Override // u4.q
    @v3.g1(version = "1.1")
    /* renamed from: B0  reason: merged with bridge method [inline-methods] */
    public e5.o z0() {
        if (this.f17425r) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (e5.o) super.z0();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            return y0().equals(j1Var.y0()) && getName().equals(j1Var.getName()) && A0().equals(j1Var.A0()) && l0.g(x0(), j1Var.x0());
        } else if (obj instanceof e5.o) {
            return obj.equals(v0());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((y0().hashCode() * 31) + getName().hashCode()) * 31) + A0().hashCode();
    }

    @Override // e5.o
    @v3.g1(version = "1.1")
    public boolean p0() {
        return z0().p0();
    }

    public String toString() {
        e5.c v02 = v0();
        if (v02 != this) {
            return v02.toString();
        }
        return "property " + getName() + l1.f17441b;
    }

    @Override // e5.o
    @v3.g1(version = "1.1")
    public boolean v() {
        return z0().v();
    }

    @Override // u4.q
    public e5.c v0() {
        return this.f17425r ? this : super.v0();
    }

    @v3.g1(version = "1.1")
    public j1(Object obj) {
        super(obj);
        this.f17425r = false;
    }

    @v3.g1(version = "1.4")
    public j1(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f17425r = (i7 & 2) == 2;
    }
}