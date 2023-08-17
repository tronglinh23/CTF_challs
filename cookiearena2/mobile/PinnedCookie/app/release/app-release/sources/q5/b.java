package q5;

import e4.g;
import h4.h;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.w2;
import kotlinx.coroutines.y3;
import n6.d;
import n6.e;
import t4.l;
import t4.p;
import u4.u1;
import v3.d1;
import v3.e1;
/* loaded from: classes.dex */
public final class b {
    public static final <T> void a(@d l<? super e4.d<? super T>, ? extends Object> lVar, @d e4.d<? super T> dVar) {
        e4.d a7 = h.a(dVar);
        try {
            g g7 = dVar.g();
            Object c7 = w0.c(g7, null);
            Object O = ((l) u1.q(lVar, 1)).O(a7);
            w0.a(g7, c7);
            if (O != g4.d.h()) {
                d1.a aVar = d1.f17778l;
                a7.D(d1.b(O));
            }
        } catch (Throwable th) {
            d1.a aVar2 = d1.f17778l;
            a7.D(d1.b(e1.a(th)));
        }
    }

    public static final <R, T> void b(@d p<? super R, ? super e4.d<? super T>, ? extends Object> pVar, R r6, @d e4.d<? super T> dVar) {
        e4.d a7 = h.a(dVar);
        try {
            g g7 = dVar.g();
            Object c7 = w0.c(g7, null);
            Object J = ((p) u1.q(pVar, 2)).J(r6, a7);
            w0.a(g7, c7);
            if (J != g4.d.h()) {
                d1.a aVar = d1.f17778l;
                a7.D(d1.b(J));
            }
        } catch (Throwable th) {
            d1.a aVar2 = d1.f17778l;
            a7.D(d1.b(e1.a(th)));
        }
    }

    public static final <T> void c(@d l<? super e4.d<? super T>, ? extends Object> lVar, @d e4.d<? super T> dVar) {
        e4.d a7 = h.a(dVar);
        try {
            Object O = ((l) u1.q(lVar, 1)).O(a7);
            if (O != g4.d.h()) {
                d1.a aVar = d1.f17778l;
                a7.D(d1.b(O));
            }
        } catch (Throwable th) {
            d1.a aVar2 = d1.f17778l;
            a7.D(d1.b(e1.a(th)));
        }
    }

    public static final <R, T> void d(@d p<? super R, ? super e4.d<? super T>, ? extends Object> pVar, R r6, @d e4.d<? super T> dVar) {
        e4.d a7 = h.a(dVar);
        try {
            Object J = ((p) u1.q(pVar, 2)).J(r6, a7);
            if (J != g4.d.h()) {
                d1.a aVar = d1.f17778l;
                a7.D(d1.b(J));
            }
        } catch (Throwable th) {
            d1.a aVar2 = d1.f17778l;
            a7.D(d1.b(e1.a(th)));
        }
    }

    public static final <T> void e(e4.d<? super T> dVar, l<? super e4.d<? super T>, ? extends Object> lVar) {
        e4.d a7 = h.a(dVar);
        try {
            Object O = lVar.O(a7);
            if (O != g4.d.h()) {
                d1.a aVar = d1.f17778l;
                a7.D(d1.b(O));
            }
        } catch (Throwable th) {
            d1.a aVar2 = d1.f17778l;
            a7.D(d1.b(e1.a(th)));
        }
    }

    @e
    public static final <T, R> Object f(@d n0<? super T> n0Var, R r6, @d p<? super R, ? super e4.d<? super T>, ? extends Object> pVar) {
        Object e0Var;
        Object h12;
        int i7 = 2;
        try {
            e0Var = ((p) u1.q(pVar, 2)).J(r6, n0Var);
        } catch (Throwable th) {
            e0Var = new e0(th, false, i7, null);
        }
        if (e0Var != g4.d.h() && (h12 = n0Var.h1(e0Var)) != w2.f13153b) {
            if (h12 instanceof e0) {
                throw ((e0) h12).f11961a;
            }
            return w2.o(h12);
        }
        return g4.d.h();
    }

    @e
    public static final <T, R> Object g(@d n0<? super T> n0Var, R r6, @d p<? super R, ? super e4.d<? super T>, ? extends Object> pVar) {
        Object e0Var;
        Object h12;
        int i7 = 2;
        try {
            e0Var = ((p) u1.q(pVar, 2)).J(r6, n0Var);
        } catch (Throwable th) {
            e0Var = new e0(th, r0, i7, null);
        }
        if (e0Var != g4.d.h() && (h12 = n0Var.h1(e0Var)) != w2.f13153b) {
            if (h12 instanceof e0) {
                Throwable th2 = ((e0) h12).f11961a;
                if (((th2 instanceof y3) && ((y3) th2).f13186k == n0Var) ? false : true) {
                    throw th2;
                }
                if (e0Var instanceof e0) {
                    throw ((e0) e0Var).f11961a;
                }
            } else {
                e0Var = w2.o(h12);
            }
            return e0Var;
        }
        return g4.d.h();
    }

    public static final <T> Object h(n0<? super T> n0Var, l<? super Throwable, Boolean> lVar, t4.a<? extends Object> aVar) {
        Object e0Var;
        Object h12;
        try {
            e0Var = aVar.n();
        } catch (Throwable th) {
            e0Var = new e0(th, false, 2, null);
        }
        if (e0Var != g4.d.h() && (h12 = n0Var.h1(e0Var)) != w2.f13153b) {
            if (h12 instanceof e0) {
                e0 e0Var2 = (e0) h12;
                if (lVar.O(e0Var2.f11961a).booleanValue()) {
                    throw e0Var2.f11961a;
                }
                if (e0Var instanceof e0) {
                    throw ((e0) e0Var).f11961a;
                }
                return e0Var;
            }
            return w2.o(h12);
        }
        return g4.d.h();
    }
}
