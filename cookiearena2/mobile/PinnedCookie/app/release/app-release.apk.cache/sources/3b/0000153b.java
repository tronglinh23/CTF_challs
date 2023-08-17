package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.z2;

@i2
/* loaded from: classes.dex */
public final class h0 implements d0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f12810a = new h0();

    @Override // kotlinx.coroutines.internal.d0
    @n6.e
    public String a() {
        return d0.a.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, java.lang.String, u4.w] */
    @Override // kotlinx.coroutines.internal.d0
    @n6.d
    public z2 b(@n6.d List<? extends d0> list) {
        ?? r02 = 0;
        return new g0(r02, r02, 2, r02);
    }

    @Override // kotlinx.coroutines.internal.d0
    public int c() {
        return -1;
    }
}