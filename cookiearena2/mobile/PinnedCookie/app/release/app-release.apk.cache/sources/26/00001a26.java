package s2;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Arrays;
import s2.n;

/* loaded from: classes.dex */
public final class o<Args extends n> implements v3.d0<Args> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final e5.d<Args> f16389k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final t4.a<Bundle> f16390l;
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public Args f16391m;

    public o(@n6.d e5.d<Args> dVar, @n6.d t4.a<Bundle> aVar) {
        u4.l0.p(dVar, "navArgsClass");
        u4.l0.p(aVar, "argumentProducer");
        this.f16389k = dVar;
        this.f16390l = aVar;
    }

    @Override // v3.d0
    public boolean a() {
        return this.f16391m != null;
    }

    @Override // v3.d0
    @n6.d
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public Args getValue() {
        Args args = this.f16391m;
        if (args == null) {
            Bundle n7 = this.f16390l.n();
            Method method = p.a().get(this.f16389k);
            if (method == null) {
                Class d7 = s4.a.d(this.f16389k);
                Class<Bundle>[] b7 = p.b();
                method = d7.getMethod("fromBundle", (Class[]) Arrays.copyOf(b7, b7.length));
                p.a().put(this.f16389k, method);
                u4.l0.o(method, "navArgsClass.java.getMet…hod\n                    }");
            }
            Object invoke = method.invoke(null, n7);
            u4.l0.n(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
            Args args2 = (Args) invoke;
            this.f16391m = args2;
            return args2;
        }
        return args;
    }
}