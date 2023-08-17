package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.h;
/* loaded from: classes.dex */
public abstract class h<N extends h<N>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12808a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12809b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_prev");
    @n6.d
    private volatile /* synthetic */ Object _next = null;
    @n6.d
    private volatile /* synthetic */ Object _prev;

    public h(@n6.e N n7) {
        this._prev = n7;
    }

    public final void b() {
        f12809b.lazySet(this, null);
    }

    public final N c() {
        N f7 = f();
        while (f7 != null && f7.g()) {
            f7 = (N) f7._prev;
        }
        return f7;
    }

    @n6.e
    public final N d() {
        Object e7 = e();
        if (e7 == g.a()) {
            return null;
        }
        return (N) e7;
    }

    public final Object e() {
        return this._next;
    }

    @n6.e
    public final N f() {
        return (N) this._prev;
    }

    public abstract boolean g();

    public final N h() {
        N d7 = d();
        u4.l0.m(d7);
        while (d7.g()) {
            d7 = (N) d7.d();
            u4.l0.m(d7);
        }
        return d7;
    }

    public final boolean i() {
        return d() == null;
    }

    public final boolean j() {
        return p.b.a(f12808a, this, null, g.a());
    }

    @n6.e
    public final N k(@n6.d t4.a aVar) {
        Object e7 = e();
        if (e7 != g.a()) {
            return (N) e7;
        }
        aVar.n();
        throw new v3.y();
    }

    public final void l() {
        while (true) {
            N c7 = c();
            N h7 = h();
            h7._prev = c7;
            if (c7 != null) {
                c7._next = h7;
            }
            if (!h7.g() && (c7 == null || !c7.g())) {
                return;
            }
        }
    }

    public final boolean m(@n6.d N n7) {
        return p.b.a(f12808a, this, null, n7);
    }
}
