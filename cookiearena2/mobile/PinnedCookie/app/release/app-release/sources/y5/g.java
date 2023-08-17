package y5;

import i0.k0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import r5.d0;
import r5.f0;
import r5.w;
import u4.l0;
/* loaded from: classes.dex */
public final class g implements w.a {

    /* renamed from: a  reason: collision with root package name */
    public int f18866a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final x5.e f18867b;

    /* renamed from: c  reason: collision with root package name */
    public final List<w> f18868c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18869d;
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public final x5.c f18870e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final d0 f18871f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18872g;

    /* renamed from: h  reason: collision with root package name */
    public final int f18873h;

    /* renamed from: i  reason: collision with root package name */
    public final int f18874i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@n6.d x5.e eVar, @n6.d List<? extends w> list, int i7, @n6.e x5.c cVar, @n6.d d0 d0Var, int i8, int i9, int i10) {
        l0.p(eVar, k0.E0);
        l0.p(list, "interceptors");
        l0.p(d0Var, "request");
        this.f18867b = eVar;
        this.f18868c = list;
        this.f18869d = i7;
        this.f18870e = cVar;
        this.f18871f = d0Var;
        this.f18872g = i8;
        this.f18873h = i9;
        this.f18874i = i10;
    }

    public static /* synthetic */ g k(g gVar, int i7, x5.c cVar, d0 d0Var, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = gVar.f18869d;
        }
        if ((i11 & 2) != 0) {
            cVar = gVar.f18870e;
        }
        x5.c cVar2 = cVar;
        if ((i11 & 4) != 0) {
            d0Var = gVar.f18871f;
        }
        d0 d0Var2 = d0Var;
        if ((i11 & 8) != 0) {
            i8 = gVar.f18872g;
        }
        int i12 = i8;
        if ((i11 & 16) != 0) {
            i9 = gVar.f18873h;
        }
        int i13 = i9;
        if ((i11 & 32) != 0) {
            i10 = gVar.f18874i;
        }
        return gVar.j(i7, cVar2, d0Var2, i12, i13, i10);
    }

    @Override // r5.w.a
    @n6.d
    public d0 a() {
        return this.f18871f;
    }

    @Override // r5.w.a
    @n6.d
    public w.a b(int i7, @n6.d TimeUnit timeUnit) {
        l0.p(timeUnit, "unit");
        if (this.f18870e == null) {
            return k(this, 0, null, null, 0, s5.d.j("readTimeout", i7, timeUnit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // r5.w.a
    @n6.d
    public w.a c(int i7, @n6.d TimeUnit timeUnit) {
        l0.p(timeUnit, "unit");
        if (this.f18870e == null) {
            return k(this, 0, null, null, 0, 0, s5.d.j("writeTimeout", i7, timeUnit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // r5.w.a
    @n6.d
    public r5.e call() {
        return this.f18867b;
    }

    @Override // r5.w.a
    public int d() {
        return this.f18872g;
    }

    @Override // r5.w.a
    public int e() {
        return this.f18873h;
    }

    @Override // r5.w.a
    public int f() {
        return this.f18874i;
    }

    @Override // r5.w.a
    @n6.d
    public w.a g(int i7, @n6.d TimeUnit timeUnit) {
        l0.p(timeUnit, "unit");
        if (this.f18870e == null) {
            return k(this, 0, null, null, s5.d.j("connectTimeout", i7, timeUnit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // r5.w.a
    @n6.d
    public f0 h(@n6.d d0 d0Var) throws IOException {
        l0.p(d0Var, "request");
        if (this.f18869d < this.f18868c.size()) {
            this.f18866a++;
            x5.c cVar = this.f18870e;
            if (cVar != null) {
                if (!cVar.j().g(d0Var.q())) {
                    throw new IllegalStateException(("network interceptor " + this.f18868c.get(this.f18869d - 1) + " must retain the same host and port").toString());
                }
                if (!(this.f18866a == 1)) {
                    throw new IllegalStateException(("network interceptor " + this.f18868c.get(this.f18869d - 1) + " must call proceed() exactly once").toString());
                }
            }
            g k7 = k(this, this.f18869d + 1, null, d0Var, 0, 0, 0, 58, null);
            w wVar = this.f18868c.get(this.f18869d);
            f0 a7 = wVar.a(k7);
            if (a7 == null) {
                throw new NullPointerException("interceptor " + wVar + " returned null");
            }
            if (this.f18870e != null) {
                if (!(this.f18869d + 1 >= this.f18868c.size() || k7.f18866a == 1)) {
                    throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
                }
            }
            if (a7.A() != null) {
                return a7;
            }
            throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // r5.w.a
    @n6.e
    public r5.j i() {
        x5.c cVar = this.f18870e;
        if (cVar != null) {
            return cVar.h();
        }
        return null;
    }

    @n6.d
    public final g j(int i7, @n6.e x5.c cVar, @n6.d d0 d0Var, int i8, int i9, int i10) {
        l0.p(d0Var, "request");
        return new g(this.f18867b, this.f18868c, i7, cVar, d0Var, i8, i9, i10);
    }

    @n6.d
    public final x5.e l() {
        return this.f18867b;
    }

    public final int m() {
        return this.f18872g;
    }

    @n6.e
    public final x5.c n() {
        return this.f18870e;
    }

    public final int o() {
        return this.f18873h;
    }

    @n6.d
    public final d0 p() {
        return this.f18871f;
    }

    public final int q() {
        return this.f18874i;
    }
}
