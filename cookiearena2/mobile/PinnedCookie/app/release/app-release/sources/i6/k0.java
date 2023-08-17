package i6;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f11233c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference<j0>[] f11234d;

    /* renamed from: e  reason: collision with root package name */
    public static final k0 f11235e = new k0();

    /* renamed from: a  reason: collision with root package name */
    public static final int f11231a = 65536;

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f11232b = new j0(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f11233c = highestOneBit;
        AtomicReference<j0>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i7 = 0; i7 < highestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference<>();
        }
        f11234d = atomicReferenceArr;
    }

    @s4.m
    public static final void d(@n6.d j0 j0Var) {
        AtomicReference<j0> a7;
        j0 j0Var2;
        u4.l0.p(j0Var, "segment");
        if (!(j0Var.f11217f == null && j0Var.f11218g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (j0Var.f11215d || (j0Var2 = (a7 = f11235e.a()).get()) == f11232b) {
            return;
        }
        int i7 = j0Var2 != null ? j0Var2.f11214c : 0;
        if (i7 >= f11231a) {
            return;
        }
        j0Var.f11217f = j0Var2;
        j0Var.f11213b = 0;
        j0Var.f11214c = i7 + 8192;
        if (androidx.lifecycle.w.a(a7, j0Var2, j0Var)) {
            return;
        }
        j0Var.f11217f = null;
    }

    @n6.d
    @s4.m
    public static final j0 e() {
        AtomicReference<j0> a7 = f11235e.a();
        j0 j0Var = f11232b;
        j0 andSet = a7.getAndSet(j0Var);
        if (andSet == j0Var) {
            return new j0();
        }
        if (andSet == null) {
            a7.set(null);
            return new j0();
        }
        a7.set(andSet.f11217f);
        andSet.f11217f = null;
        andSet.f11214c = 0;
        return andSet;
    }

    public final AtomicReference<j0> a() {
        Thread currentThread = Thread.currentThread();
        u4.l0.o(currentThread, "Thread.currentThread()");
        return f11234d[(int) (currentThread.getId() & (f11233c - 1))];
    }

    public final int b() {
        j0 j0Var = a().get();
        if (j0Var != null) {
            return j0Var.f11214c;
        }
        return 0;
    }

    public final int c() {
        return f11231a;
    }
}
