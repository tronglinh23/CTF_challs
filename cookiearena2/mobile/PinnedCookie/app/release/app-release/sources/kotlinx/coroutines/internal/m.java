package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.c4;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.u3;
import v3.d1;
import v3.m2;
/* loaded from: classes.dex */
public final class m {
    @n6.d

    /* renamed from: a */
    public static final r0 f12821a = new r0("UNDEFINED");
    @n6.d
    @s4.e

    /* renamed from: b */
    public static final r0 f12822b = new r0("REUSABLE_CLAIMED");

    public static final /* synthetic */ r0 a() {
        return f12821a;
    }

    public static final boolean b(l<?> lVar, Object obj, int i7, boolean z6, t4.a<m2> aVar) {
        t1 b7 = u3.f13126a.b();
        if (z6 && b7.j1()) {
            return false;
        }
        if (b7.i1()) {
            lVar.f12818p = obj;
            lVar.f12882m = i7;
            b7.d1(lVar);
            return true;
        }
        b7.f1(true);
        try {
            aVar.n();
            do {
            } while (b7.l1());
            u4.i0.d(1);
        } catch (Throwable th) {
            try {
                lVar.i(th, null);
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
        return false;
    }

    public static /* synthetic */ boolean c(l lVar, Object obj, int i7, boolean z6, t4.a aVar, int i8, Object obj2) {
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        t1 b7 = u3.f13126a.b();
        if (z6 && b7.j1()) {
            return false;
        }
        if (b7.i1()) {
            lVar.f12818p = obj;
            lVar.f12882m = i7;
            b7.d1(lVar);
            return true;
        }
        b7.f1(true);
        try {
            aVar.n();
            do {
            } while (b7.l1());
            u4.i0.d(1);
        } catch (Throwable th) {
            try {
                lVar.i(th, null);
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
        return false;
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }

    @i2
    public static final <T> void f(@n6.d e4.d<? super T> dVar, @n6.d Object obj, @n6.e t4.l<? super Throwable, m2> lVar) {
        boolean z6;
        if (!(dVar instanceof l)) {
            dVar.D(obj);
            return;
        }
        l lVar2 = (l) dVar;
        Object c7 = kotlinx.coroutines.k0.c(obj, lVar);
        if (lVar2.f12816n.X0(lVar2.g())) {
            lVar2.f12818p = c7;
            lVar2.f12882m = 1;
            lVar2.f12816n.V0(lVar2.g(), lVar2);
            return;
        }
        t1 b7 = u3.f13126a.b();
        if (b7.i1()) {
            lVar2.f12818p = c7;
            lVar2.f12882m = 1;
            b7.d1(lVar2);
            return;
        }
        b7.f1(true);
        try {
            n2 n2Var = (n2) lVar2.g().e(n2.f12920c);
            if (n2Var == null || n2Var.d()) {
                z6 = false;
            } else {
                CancellationException w02 = n2Var.w0();
                lVar2.c(c7, w02);
                d1.a aVar = v3.d1.f17778l;
                lVar2.D(v3.d1.b(v3.e1.a(w02)));
                z6 = true;
            }
            if (!z6) {
                e4.d<T> dVar2 = lVar2.f12817o;
                Object obj2 = lVar2.f12819q;
                e4.g g7 = dVar2.g();
                Object c8 = w0.c(g7, obj2);
                c4<?> g8 = c8 != w0.f12850a ? kotlinx.coroutines.n0.g(dVar2, g7, c8) : null;
                lVar2.f12817o.D(obj);
                m2 m2Var = m2.f17815a;
                if (g8 == null || g8.N1()) {
                    w0.a(g7, c8);
                }
            }
            do {
            } while (b7.l1());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void g(e4.d dVar, Object obj, t4.l lVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            lVar = null;
        }
        f(dVar, obj, lVar);
    }

    public static final boolean h(@n6.d l<? super m2> lVar) {
        m2 m2Var = m2.f17815a;
        t1 b7 = u3.f13126a.b();
        if (b7.j1()) {
            return false;
        }
        if (b7.i1()) {
            lVar.f12818p = m2Var;
            lVar.f12882m = 1;
            b7.d1(lVar);
            return true;
        }
        b7.f1(true);
        try {
            lVar.run();
            do {
            } while (b7.l1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
