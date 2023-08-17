package kotlinx.coroutines;

/* loaded from: classes.dex */
public abstract class u2 extends g0 implements p1, g2 {

    /* renamed from: n  reason: collision with root package name */
    public v2 f13125n;

    @n6.d
    public final v2 Y0() {
        v2 v2Var = this.f13125n;
        if (v2Var != null) {
            return v2Var;
        }
        u4.l0.S("job");
        return null;
    }

    public final void Z0(@n6.d v2 v2Var) {
        this.f13125n = v2Var;
    }

    @Override // kotlinx.coroutines.g2
    public boolean d() {
        return true;
    }

    @Override // kotlinx.coroutines.p1
    public void j() {
        Y0().u1(this);
    }

    @Override // kotlinx.coroutines.g2
    @n6.e
    public a3 j0() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.y
    @n6.d
    public String toString() {
        return z0.a(this) + '@' + z0.b(this) + "[job@" + z0.b(Y0()) + ']';
    }
}