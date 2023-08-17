package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.c4;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.u3;
import v3.d1;
import v3.m2;
/* loaded from: classes.dex */
public final class l<T> extends j1<T> implements h4.e, e4.d<T> {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12815r = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_reusableCancellableContinuation");
    @n6.d
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    @n6.d
    @s4.e

    /* renamed from: n  reason: collision with root package name */
    public final kotlinx.coroutines.o0 f12816n;
    @n6.d
    @s4.e

    /* renamed from: o  reason: collision with root package name */
    public final e4.d<T> f12817o;
    @s4.e
    @n6.e

    /* renamed from: p  reason: collision with root package name */
    public Object f12818p;
    @n6.d
    @s4.e

    /* renamed from: q  reason: collision with root package name */
    public final Object f12819q;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@n6.d kotlinx.coroutines.o0 o0Var, @n6.d e4.d<? super T> dVar) {
        super(-1);
        this.f12816n = o0Var;
        this.f12817o = dVar;
        this.f12818p = m.a();
        this.f12819q = w0.b(g());
        this._reusableCancellableContinuation = null;
    }

    public static /* synthetic */ void s() {
    }

    public final void A(@n6.d Object obj) {
        e4.d<T> dVar = this.f12817o;
        Object obj2 = this.f12819q;
        e4.g g7 = dVar.g();
        Object c7 = w0.c(g7, obj2);
        c4<?> g8 = c7 != w0.f12850a ? kotlinx.coroutines.n0.g(dVar, g7, c7) : null;
        try {
            this.f12817o.D(obj);
            m2 m2Var = m2.f17815a;
        } finally {
            u4.i0.d(1);
            if (g8 == null || g8.N1()) {
                w0.a(g7, c7);
            }
            u4.i0.c(1);
        }
    }

    @n6.e
    public final Throwable B(@n6.d kotlinx.coroutines.q<?> qVar) {
        r0 r0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            r0Var = m.f12822b;
            if (obj != r0Var) {
                if (obj instanceof Throwable) {
                    if (p.b.a(f12815r, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!p.b.a(f12815r, this, r0Var, qVar));
        return null;
    }

    @Override // e4.d
    public void D(@n6.d Object obj) {
        e4.g g7 = this.f12817o.g();
        Object d7 = kotlinx.coroutines.k0.d(obj, null, 1, null);
        if (this.f12816n.X0(g7)) {
            this.f12818p = d7;
            this.f12882m = 0;
            this.f12816n.V0(g7, this);
            return;
        }
        t1 b7 = u3.f13126a.b();
        if (b7.i1()) {
            this.f12818p = d7;
            this.f12882m = 0;
            b7.d1(this);
            return;
        }
        b7.f1(true);
        try {
            e4.g g8 = g();
            Object c7 = w0.c(g8, this.f12819q);
            this.f12817o.D(obj);
            m2 m2Var = m2.f17815a;
            w0.a(g8, c7);
            do {
            } while (b7.l1());
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // kotlinx.coroutines.j1
    public void c(@n6.e Object obj, @n6.d Throwable th) {
        if (obj instanceof kotlinx.coroutines.f0) {
            ((kotlinx.coroutines.f0) obj).f11974b.O(th);
        }
    }

    @Override // kotlinx.coroutines.j1
    @n6.d
    public e4.d<T> e() {
        return this;
    }

    @Override // e4.d
    @n6.d
    public e4.g g() {
        return this.f12817o.g();
    }

    @Override // kotlinx.coroutines.j1
    @n6.e
    public Object j() {
        Object obj = this.f12818p;
        this.f12818p = m.a();
        return obj;
    }

    public final void k() {
        do {
        } while (this._reusableCancellableContinuation == m.f12822b);
    }

    @Override // h4.e
    @n6.e
    public StackTraceElement k0() {
        return null;
    }

    @n6.e
    public final kotlinx.coroutines.r<T> m() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = m.f12822b;
                return null;
            } else if (obj instanceof kotlinx.coroutines.r) {
                if (p.b.a(f12815r, this, obj, m.f12822b)) {
                    return (kotlinx.coroutines.r) obj;
                }
            } else if (obj != m.f12822b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void n(@n6.d e4.g gVar, T t6) {
        this.f12818p = t6;
        this.f12882m = 1;
        this.f12816n.W0(gVar, this);
    }

    public final kotlinx.coroutines.r<?> p() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof kotlinx.coroutines.r) {
            return (kotlinx.coroutines.r) obj;
        }
        return null;
    }

    public final boolean t() {
        return this._reusableCancellableContinuation != null;
    }

    @n6.d
    public String toString() {
        return "DispatchedContinuation[" + this.f12816n + ", " + kotlinx.coroutines.z0.c(this.f12817o) + ']';
    }

    public final boolean u(@n6.d Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r0 r0Var = m.f12822b;
            if (u4.l0.g(obj, r0Var)) {
                if (p.b.a(f12815r, this, r0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (p.b.a(f12815r, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // h4.e
    @n6.e
    public h4.e v() {
        e4.d<T> dVar = this.f12817o;
        if (dVar instanceof h4.e) {
            return (h4.e) dVar;
        }
        return null;
    }

    public final void w() {
        k();
        kotlinx.coroutines.r<?> p6 = p();
        if (p6 != null) {
            p6.u();
        }
    }

    public final void y(@n6.d Object obj, @n6.e t4.l<? super Throwable, m2> lVar) {
        boolean z6;
        Object c7 = kotlinx.coroutines.k0.c(obj, lVar);
        if (this.f12816n.X0(g())) {
            this.f12818p = c7;
            this.f12882m = 1;
            this.f12816n.V0(g(), this);
            return;
        }
        t1 b7 = u3.f13126a.b();
        if (b7.i1()) {
            this.f12818p = c7;
            this.f12882m = 1;
            b7.d1(this);
            return;
        }
        b7.f1(true);
        try {
            n2 n2Var = (n2) g().e(n2.f12920c);
            if (n2Var == null || n2Var.d()) {
                z6 = false;
            } else {
                CancellationException w02 = n2Var.w0();
                c(c7, w02);
                d1.a aVar = v3.d1.f17778l;
                D(v3.d1.b(v3.e1.a(w02)));
                z6 = true;
            }
            if (!z6) {
                e4.d<T> dVar = this.f12817o;
                Object obj2 = this.f12819q;
                e4.g g7 = dVar.g();
                Object c8 = w0.c(g7, obj2);
                c4<?> g8 = c8 != w0.f12850a ? kotlinx.coroutines.n0.g(dVar, g7, c8) : null;
                this.f12817o.D(obj);
                m2 m2Var = m2.f17815a;
                u4.i0.d(1);
                if (g8 == null || g8.N1()) {
                    w0.a(g7, c8);
                }
                u4.i0.c(1);
            }
            do {
            } while (b7.l1());
            u4.i0.d(1);
        } catch (Throwable th) {
            try {
                i(th, null);
                u4.i0.d(1);
            } catch (Throwable th2) {
                u4.i0.d(1);
                b7.a1(true);
                u4.i0.c(1);
                throw th2;
            }
        }
        b7.a1(true);
        u4.i0.c(1);
    }

    public final boolean z(@n6.e Object obj) {
        n2 n2Var = (n2) g().e(n2.f12920c);
        if (n2Var == null || n2Var.d()) {
            return false;
        }
        CancellationException w02 = n2Var.w0();
        c(obj, w02);
        d1.a aVar = v3.d1.f17778l;
        D(v3.d1.b(v3.e1.a(w02)));
        return true;
    }
}
