package c5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import n6.d;
import u4.l0;
/* loaded from: classes.dex */
public final class a extends b5.a {
    @Override // b5.f
    public double i(double d7) {
        return ThreadLocalRandom.current().nextDouble(d7);
    }

    @Override // b5.f
    public int n(int i7, int i8) {
        return ThreadLocalRandom.current().nextInt(i7, i8);
    }

    @Override // b5.f
    public long p(long j7) {
        return ThreadLocalRandom.current().nextLong(j7);
    }

    @Override // b5.f
    public long q(long j7, long j8) {
        return ThreadLocalRandom.current().nextLong(j7, j8);
    }

    @Override // b5.a
    @d
    public Random r() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l0.o(current, "current()");
        return current;
    }
}
