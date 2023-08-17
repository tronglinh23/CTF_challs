package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.z1;
import u4.w;
import v3.a1;
@a1
/* loaded from: classes.dex */
public class e extends z1 {

    /* renamed from: n  reason: collision with root package name */
    public final int f12981n;

    /* renamed from: o  reason: collision with root package name */
    public final int f12982o;

    /* renamed from: p  reason: collision with root package name */
    public final long f12983p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public final String f12984q;
    @n6.d

    /* renamed from: r  reason: collision with root package name */
    public a f12985r;

    public /* synthetic */ e(int i7, int i8, long j7, String str, int i9, w wVar) {
        this(i7, i8, j7, (i9 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public static /* synthetic */ o0 c1(e eVar, int i7, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                i7 = 16;
            }
            return eVar.b1(i7);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
    }

    @Override // kotlinx.coroutines.o0
    public void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        try {
            a.p(this.f12985r, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            kotlinx.coroutines.a1.f11839r.V0(gVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.o0
    public void W0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        try {
            a.p(this.f12985r, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            kotlinx.coroutines.a1.f11839r.W0(gVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.z1
    @n6.d
    public Executor a1() {
        return this.f12985r;
    }

    @n6.d
    public final o0 b1(int i7) {
        if (i7 > 0) {
            return new g(this, i7, null, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i7).toString());
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12985r.close();
    }

    public final a d1() {
        return new a(this.f12981n, this.f12982o, this.f12983p, this.f12984q);
    }

    public final void e1(@n6.d Runnable runnable, @n6.d l lVar, boolean z6) {
        try {
            this.f12985r.m(runnable, lVar, z6);
        } catch (RejectedExecutionException unused) {
            kotlinx.coroutines.a1.f11839r.u1(this.f12985r.f(runnable, lVar));
        }
    }

    @n6.d
    public final o0 f1(int i7) {
        if (!(i7 > 0)) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i7).toString());
        }
        if (i7 <= this.f12981n) {
            return new g(this, i7, null, 0);
        }
        throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.f12981n + "), but have " + i7).toString());
    }

    @Override // kotlinx.coroutines.o0
    @n6.d
    public String toString() {
        return super.toString() + "[scheduler = " + this.f12985r + ']';
    }

    public e(int i7, int i8, long j7, @n6.d String str) {
        this.f12981n = i7;
        this.f12982o = i8;
        this.f12983p = j7;
        this.f12984q = str;
        this.f12985r = d1();
    }

    public /* synthetic */ e(int i7, int i8, String str, int i9, w wVar) {
        this((i9 & 1) != 0 ? o.f13004c : i7, (i9 & 2) != 0 ? o.f13005d : i8, (i9 & 4) != 0 ? o.f13002a : str);
    }

    public e(int i7, int i8, @n6.d String str) {
        this(i7, i8, o.f13006e, str);
    }

    public /* synthetic */ e(int i7, int i8, int i9, w wVar) {
        this((i9 & 1) != 0 ? o.f13004c : i7, (i9 & 2) != 0 ? o.f13005d : i8);
    }

    @v3.k(level = v3.m.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ e(int i7, int i8) {
        this(i7, i8, o.f13006e, null, 8, null);
    }
}
