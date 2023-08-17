package h4;

import u4.l0;
import v3.d1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final class l implements e4.d<m2> {
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public d1<m2> f10321k;

    @Override // e4.d
    public void D(@n6.d Object obj) {
        synchronized (this) {
            this.f10321k = d1.a(obj);
            l0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            m2 m2Var = m2.f17815a;
        }
    }

    public final void a() {
        synchronized (this) {
            while (true) {
                d1<m2> d1Var = this.f10321k;
                if (d1Var == null) {
                    l0.n(this, "null cannot be cast to non-null type java.lang.Object");
                    wait();
                } else {
                    e1.n(d1Var.l());
                }
            }
        }
    }

    @n6.e
    public final d1<m2> c() {
        return this.f10321k;
    }

    public final void e(@n6.e d1<m2> d1Var) {
        this.f10321k = d1Var;
    }

    @Override // e4.d
    @n6.d
    public e4.g g() {
        return e4.i.f8770k;
    }
}
