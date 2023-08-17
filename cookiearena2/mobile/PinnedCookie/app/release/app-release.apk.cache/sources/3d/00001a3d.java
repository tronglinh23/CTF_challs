package s2;

import s2.q;

@i0
/* loaded from: classes.dex */
public final class r {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final q.a f16425a = new q.a();
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public y0<?> f16426b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16427c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public Object f16428d;

    @n6.d
    public final q a() {
        return this.f16425a.a();
    }

    @n6.e
    public final Object b() {
        return this.f16428d;
    }

    public final boolean c() {
        return this.f16427c;
    }

    @n6.d
    public final y0<?> d() {
        y0<?> y0Var = this.f16426b;
        if (y0Var != null) {
            return y0Var;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final void e(@n6.e Object obj) {
        this.f16428d = obj;
        this.f16425a.b(obj);
    }

    public final void f(boolean z6) {
        this.f16427c = z6;
        this.f16425a.c(z6);
    }

    public final void g(@n6.d y0<?> y0Var) {
        u4.l0.p(y0Var, "value");
        this.f16426b = y0Var;
        this.f16425a.d(y0Var);
    }
}