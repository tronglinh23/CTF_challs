package kotlinx.coroutines;

import v3.d1;
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12892a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f12893b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f12894c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f12895d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f12896e = -1;

    public static final <T> void a(@n6.d j1<? super T> j1Var, int i7) {
        e4.d<? super T> e7 = j1Var.e();
        boolean z6 = i7 == 4;
        if (z6 || !(e7 instanceof kotlinx.coroutines.internal.l) || c(i7) != c(j1Var.f12882m)) {
            e(j1Var, e7, z6);
            return;
        }
        o0 o0Var = ((kotlinx.coroutines.internal.l) e7).f12816n;
        e4.g g7 = e7.g();
        if (o0Var.X0(g7)) {
            o0Var.V0(g7, j1Var);
        } else {
            f(j1Var);
        }
    }

    @v3.a1
    public static /* synthetic */ void b() {
    }

    public static final boolean c(int i7) {
        return i7 == 1 || i7 == 2;
    }

    public static final boolean d(int i7) {
        return i7 == 2;
    }

    public static final <T> void e(@n6.d j1<? super T> j1Var, @n6.d e4.d<? super T> dVar, boolean z6) {
        Object h7;
        Object j7 = j1Var.j();
        Throwable f7 = j1Var.f(j7);
        if (f7 != null) {
            d1.a aVar = v3.d1.f17778l;
            h7 = v3.e1.a(f7);
        } else {
            d1.a aVar2 = v3.d1.f17778l;
            h7 = j1Var.h(j7);
        }
        Object b7 = v3.d1.b(h7);
        if (!z6) {
            dVar.D(b7);
            return;
        }
        kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) dVar;
        e4.d<T> dVar2 = lVar.f12817o;
        Object obj = lVar.f12819q;
        e4.g g7 = dVar2.g();
        Object c7 = kotlinx.coroutines.internal.w0.c(g7, obj);
        c4<?> g8 = c7 != kotlinx.coroutines.internal.w0.f12850a ? n0.g(dVar2, g7, c7) : null;
        try {
            lVar.f12817o.D(b7);
            v3.m2 m2Var = v3.m2.f17815a;
        } finally {
            if (g8 == null || g8.N1()) {
                kotlinx.coroutines.internal.w0.a(g7, c7);
            }
        }
    }

    public static final void f(j1<?> j1Var) {
        t1 b7 = u3.f13126a.b();
        if (b7.i1()) {
            b7.d1(j1Var);
            return;
        }
        b7.f1(true);
        try {
            e(j1Var, j1Var.e(), true);
            do {
            } while (b7.l1());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void g(@n6.d e4.d<?> dVar, @n6.d Throwable th) {
        d1.a aVar = v3.d1.f17778l;
        dVar.D(v3.d1.b(v3.e1.a(th)));
    }

    public static final void h(@n6.d j1<?> j1Var, @n6.d t1 t1Var, @n6.d t4.a<v3.m2> aVar) {
        t1Var.f1(true);
        try {
            aVar.n();
            do {
            } while (t1Var.l1());
            u4.i0.d(1);
        } catch (Throwable th) {
            try {
                j1Var.i(th, null);
                u4.i0.d(1);
            } catch (Throwable th2) {
                u4.i0.d(1);
                t1Var.a1(true);
                u4.i0.c(1);
                throw th2;
            }
        }
        t1Var.a1(true);
        u4.i0.c(1);
    }
}
