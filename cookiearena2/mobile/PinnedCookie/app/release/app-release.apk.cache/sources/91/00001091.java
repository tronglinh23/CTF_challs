package h4;

import java.io.Serializable;
import u4.l0;
import v3.d1;
import v3.e1;
import v3.g1;
import v3.m2;

@g1(version = "1.3")
/* loaded from: classes.dex */
public abstract class a implements e4.d<Object>, e, Serializable {
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public final e4.d<Object> f10309k;

    public a(@n6.e e4.d<Object> dVar) {
        this.f10309k = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e4.d
    public final void D(@n6.d Object obj) {
        Object Q;
        e4.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            e4.d dVar2 = aVar.f10309k;
            l0.m(dVar2);
            try {
                Q = aVar.Q(obj);
            } catch (Throwable th) {
                d1.a aVar2 = d1.f17778l;
                obj = d1.b(e1.a(th));
            }
            if (Q == g4.d.h()) {
                return;
            }
            d1.a aVar3 = d1.f17778l;
            obj = d1.b(Q);
            aVar.R();
            if (!(dVar2 instanceof a)) {
                dVar2.D(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    @n6.d
    public e4.d<m2> G(@n6.d e4.d<?> dVar) {
        l0.p(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @n6.d
    public e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
        l0.p(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @n6.e
    public final e4.d<Object> L() {
        return this.f10309k;
    }

    @n6.e
    public abstract Object Q(@n6.d Object obj);

    public void R() {
    }

    @Override // h4.e
    @n6.e
    public StackTraceElement k0() {
        return g.e(this);
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object k02 = k0();
        if (k02 == null) {
            k02 = getClass().getName();
        }
        sb.append(k02);
        return sb.toString();
    }

    @Override // h4.e
    @n6.e
    public e v() {
        e4.d<Object> dVar = this.f10309k;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }
}