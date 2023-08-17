package i6;

import java.io.IOException;
import v3.b1;

/* loaded from: classes.dex */
public abstract class s implements o0 {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final o0 f11281k;

    public s(@n6.d o0 o0Var) {
        u4.l0.p(o0Var, "delegate");
        this.f11281k = o0Var;
    }

    @s4.h(name = "-deprecated_delegate")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "delegate", imports = {}))
    public final o0 a() {
        return this.f11281k;
    }

    @s4.h(name = "delegate")
    @n6.d
    public final o0 b() {
        return this.f11281k;
    }

    @Override // i6.o0
    @n6.d
    public q0 c() {
        return this.f11281k.c();
    }

    @Override // i6.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11281k.close();
    }

    @Override // i6.o0
    public long l0(@n6.d m mVar, long j7) throws IOException {
        u4.l0.p(mVar, "sink");
        return this.f11281k.l0(mVar, j7);
    }

    @n6.d
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f11281k + ')';
    }
}