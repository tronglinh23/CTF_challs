package androidx.lifecycle;

import java.io.Closeable;
import kotlinx.coroutines.t2;
/* loaded from: classes.dex */
public final class d implements Closeable, kotlinx.coroutines.u0 {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final e4.g f4729k;

    public d(@n6.d e4.g gVar) {
        u4.l0.p(gVar, "context");
        this.f4729k = gVar;
    }

    @Override // kotlinx.coroutines.u0
    @n6.d
    public e4.g I() {
        return this.f4729k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        t2.i(I(), null, 1, null);
    }
}
