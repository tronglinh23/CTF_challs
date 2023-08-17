package kotlinx.coroutines.scheduling;

import d5.u;
import java.util.concurrent.Executor;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.internal.v0;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.z1;
/* loaded from: classes.dex */
public final class c extends z1 implements Executor {
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final c f12978n = new c();
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final o0 f12979o;

    static {
        int d7;
        p pVar = p.f13012m;
        d7 = v0.d(n1.f12919a, u.u(64, t0.a()), 0, 0, 12, null);
        f12979o = pVar.Y0(d7);
    }

    @Override // kotlinx.coroutines.o0
    public void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        f12979o.V0(gVar, runnable);
    }

    @Override // kotlinx.coroutines.o0
    @i2
    public void W0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        f12979o.W0(gVar, runnable);
    }

    @Override // kotlinx.coroutines.o0
    @c2
    @n6.d
    public o0 Y0(int i7) {
        return p.f13012m.Y0(i7);
    }

    @Override // kotlinx.coroutines.z1
    @n6.d
    public Executor a1() {
        return this;
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@n6.d Runnable runnable) {
        V0(e4.i.f8770k, runnable);
    }

    @Override // kotlinx.coroutines.o0
    @n6.d
    public String toString() {
        return "Dispatchers.IO";
    }
}
