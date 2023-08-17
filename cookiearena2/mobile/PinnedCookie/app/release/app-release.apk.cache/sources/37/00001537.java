package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.z2;

/* loaded from: classes.dex */
public final class f0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final String f12802a = "kotlinx.coroutines.fast.service.loader";

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f12803b = true;

    public static final g0 a(Throwable th, String str) {
        if (f12803b) {
            return new g0(th, str);
        }
        if (th != null) {
            throw th;
        }
        e();
        throw new v3.y();
    }

    public static /* synthetic */ g0 b(Throwable th, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static /* synthetic */ void c() {
    }

    @i2
    public static final boolean d(@n6.d z2 z2Var) {
        return z2Var.a1() instanceof g0;
    }

    @n6.d
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @n6.d
    @i2
    public static final z2 f(@n6.d d0 d0Var, @n6.d List<? extends d0> list) {
        try {
            return d0Var.b(list);
        } catch (Throwable th) {
            return a(th, d0Var.a());
        }
    }
}