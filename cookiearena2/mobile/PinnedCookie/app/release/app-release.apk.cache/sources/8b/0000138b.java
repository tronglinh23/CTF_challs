package k5;

import k5.s;
import v3.g1;

@l
@g1(version = "1.3")
/* loaded from: classes.dex */
public final class p implements s.c {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final p f11805b = new p();

    /* renamed from: c  reason: collision with root package name */
    public static final long f11806c = System.nanoTime();

    @Override // k5.s.c, k5.s
    public /* bridge */ /* synthetic */ d a() {
        return s.b.a.h(e());
    }

    public final long b(long j7, long j8) {
        return s.b.a.k(m.c(j7, j8));
    }

    public final long c(long j7, long j8) {
        return m.g(j7, j8);
    }

    public final long d(long j7) {
        return m.e(f(), j7);
    }

    public long e() {
        return s.b.a.k(f());
    }

    public final long f() {
        return System.nanoTime() - f11806c;
    }

    @n6.d
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // k5.s
    public /* bridge */ /* synthetic */ r a() {
        return s.b.a.h(e());
    }
}