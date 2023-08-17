package u4;

import java.util.Arrays;
import java.util.Collections;
/* loaded from: classes.dex */
public class l1 {

    /* renamed from: a  reason: collision with root package name */
    public static final m1 f17440a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f17441b = " (Kotlin reflection is not available)";

    /* renamed from: c  reason: collision with root package name */
    public static final e5.d[] f17442c;

    static {
        m1 m1Var = null;
        try {
            m1Var = (m1) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (m1Var == null) {
            m1Var = new m1();
        }
        f17440a = m1Var;
        f17442c = new e5.d[0];
    }

    @v3.g1(version = "1.4")
    public static e5.s A(e5.g gVar) {
        return f17440a.s(gVar, Collections.emptyList(), false);
    }

    @v3.g1(version = "1.4")
    public static e5.s B(Class cls) {
        return f17440a.s(d(cls), Collections.emptyList(), false);
    }

    @v3.g1(version = "1.4")
    public static e5.s C(Class cls, e5.u uVar) {
        return f17440a.s(d(cls), Collections.singletonList(uVar), false);
    }

    @v3.g1(version = "1.4")
    public static e5.s D(Class cls, e5.u uVar, e5.u uVar2) {
        return f17440a.s(d(cls), Arrays.asList(uVar, uVar2), false);
    }

    @v3.g1(version = "1.4")
    public static e5.s E(Class cls, e5.u... uVarArr) {
        return f17440a.s(d(cls), x3.p.kz(uVarArr), false);
    }

    @v3.g1(version = "1.4")
    public static e5.t F(Object obj, String str, e5.v vVar, boolean z6) {
        return f17440a.t(obj, str, vVar, z6);
    }

    public static e5.d a(Class cls) {
        return f17440a.a(cls);
    }

    public static e5.d b(Class cls, String str) {
        return f17440a.b(cls, str);
    }

    public static e5.i c(g0 g0Var) {
        return f17440a.c(g0Var);
    }

    public static e5.d d(Class cls) {
        return f17440a.d(cls);
    }

    public static e5.d e(Class cls, String str) {
        return f17440a.e(cls, str);
    }

    public static e5.d[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f17442c;
        }
        e5.d[] dVarArr = new e5.d[length];
        for (int i7 = 0; i7 < length; i7++) {
            dVarArr[i7] = d(clsArr[i7]);
        }
        return dVarArr;
    }

    @v3.g1(version = "1.4")
    public static e5.h g(Class cls) {
        return f17440a.f(cls, "");
    }

    public static e5.h h(Class cls, String str) {
        return f17440a.f(cls, str);
    }

    @v3.g1(version = "1.6")
    public static e5.s i(e5.s sVar) {
        return f17440a.g(sVar);
    }

    public static e5.k j(u0 u0Var) {
        return f17440a.h(u0Var);
    }

    public static e5.l k(w0 w0Var) {
        return f17440a.i(w0Var);
    }

    public static e5.m l(y0 y0Var) {
        return f17440a.j(y0Var);
    }

    @v3.g1(version = "1.6")
    public static e5.s m(e5.s sVar) {
        return f17440a.k(sVar);
    }

    @v3.g1(version = "1.4")
    public static e5.s n(e5.g gVar) {
        return f17440a.s(gVar, Collections.emptyList(), true);
    }

    @v3.g1(version = "1.4")
    public static e5.s o(Class cls) {
        return f17440a.s(d(cls), Collections.emptyList(), true);
    }

    @v3.g1(version = "1.4")
    public static e5.s p(Class cls, e5.u uVar) {
        return f17440a.s(d(cls), Collections.singletonList(uVar), true);
    }

    @v3.g1(version = "1.4")
    public static e5.s q(Class cls, e5.u uVar, e5.u uVar2) {
        return f17440a.s(d(cls), Arrays.asList(uVar, uVar2), true);
    }

    @v3.g1(version = "1.4")
    public static e5.s r(Class cls, e5.u... uVarArr) {
        return f17440a.s(d(cls), x3.p.kz(uVarArr), true);
    }

    @v3.g1(version = "1.6")
    public static e5.s s(e5.s sVar, e5.s sVar2) {
        return f17440a.l(sVar, sVar2);
    }

    public static e5.p t(d1 d1Var) {
        return f17440a.m(d1Var);
    }

    public static e5.q u(f1 f1Var) {
        return f17440a.n(f1Var);
    }

    public static e5.r v(h1 h1Var) {
        return f17440a.o(h1Var);
    }

    @v3.g1(version = "1.3")
    public static String w(e0 e0Var) {
        return f17440a.p(e0Var);
    }

    @v3.g1(version = "1.1")
    public static String x(n0 n0Var) {
        return f17440a.q(n0Var);
    }

    @v3.g1(version = "1.4")
    public static void y(e5.t tVar, e5.s sVar) {
        f17440a.r(tVar, Collections.singletonList(sVar));
    }

    @v3.g1(version = "1.4")
    public static void z(e5.t tVar, e5.s... sVarArr) {
        f17440a.r(tVar, x3.p.kz(sVarArr));
    }
}
