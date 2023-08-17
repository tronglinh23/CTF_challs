package h5;

import n6.d;
import s4.h;
import u4.l0;
import v3.m2;
@h(name = "TimingKt")
/* loaded from: classes.dex */
public final class b {
    public static final long a(@d t4.a<m2> aVar) {
        l0.p(aVar, "block");
        long nanoTime = System.nanoTime();
        aVar.n();
        return System.nanoTime() - nanoTime;
    }

    public static final long b(@d t4.a<m2> aVar) {
        l0.p(aVar, "block");
        long currentTimeMillis = System.currentTimeMillis();
        aVar.n();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
