package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v3.d1;
import v3.m2;
/* loaded from: classes.dex */
public final class w0 extends p5.d<u0<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12631a = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_state");
    @n6.d
    volatile /* synthetic */ Object _state = null;

    @Override // p5.d
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public boolean a(@n6.d u0<?> u0Var) {
        kotlinx.coroutines.internal.r0 r0Var;
        if (this._state != null) {
            return false;
        }
        r0Var = v0.f12599a;
        this._state = r0Var;
        return true;
    }

    @n6.e
    public final Object d(@n6.d e4.d<? super m2> dVar) {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(g4.c.d(dVar), 1);
        rVar.x();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12631a;
        r0Var = v0.f12599a;
        if (!p.b.a(atomicReferenceFieldUpdater, this, r0Var, rVar)) {
            d1.a aVar = d1.f17778l;
            rVar.D(d1.b(m2.f17815a));
        }
        Object A = rVar.A();
        if (A == g4.d.h()) {
            h4.h.c(dVar);
        }
        return A == g4.d.h() ? A : m2.f17815a;
    }

    @Override // p5.d
    @n6.d
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public e4.d<m2>[] b(@n6.d u0<?> u0Var) {
        this._state = null;
        return p5.c.f14842a;
    }

    public final void f() {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        kotlinx.coroutines.internal.r0 r0Var3;
        kotlinx.coroutines.internal.r0 r0Var4;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            r0Var = v0.f12600b;
            if (obj == r0Var) {
                return;
            }
            r0Var2 = v0.f12599a;
            if (obj == r0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12631a;
                r0Var3 = v0.f12600b;
                if (p.b.a(atomicReferenceFieldUpdater, this, obj, r0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12631a;
                r0Var4 = v0.f12599a;
                if (p.b.a(atomicReferenceFieldUpdater2, this, obj, r0Var4)) {
                    d1.a aVar = d1.f17778l;
                    ((kotlinx.coroutines.r) obj).D(d1.b(m2.f17815a));
                    return;
                }
            }
        }
    }

    public final boolean g() {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12631a;
        r0Var = v0.f12599a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, r0Var);
        u4.l0.m(andSet);
        r0Var2 = v0.f12600b;
        return andSet == r0Var2;
    }
}
