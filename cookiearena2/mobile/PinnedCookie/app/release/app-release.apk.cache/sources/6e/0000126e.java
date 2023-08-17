package i6;

import java.io.IOException;
import v3.b1;

/* loaded from: classes.dex */
public abstract class r implements m0 {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final m0 f11272k;

    public r(@n6.d m0 m0Var) {
        u4.l0.p(m0Var, "delegate");
        this.f11272k = m0Var;
    }

    @s4.h(name = "-deprecated_delegate")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "delegate", imports = {}))
    public final m0 a() {
        return this.f11272k;
    }

    @s4.h(name = "delegate")
    @n6.d
    public final m0 b() {
        return this.f11272k;
    }

    @Override // i6.m0
    @n6.d
    public q0 c() {
        return this.f11272k.c();
    }

    @Override // i6.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11272k.close();
    }

    @Override // i6.m0, java.io.Flushable
    public void flush() throws IOException {
        this.f11272k.flush();
    }

    @n6.d
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f11272k + ')';
    }

    @Override // i6.m0
    public void w(@n6.d m mVar, long j7) throws IOException {
        u4.l0.p(mVar, "source");
        this.f11272k.w(mVar, j7);
    }
}