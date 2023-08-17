package p5;

import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.t0;
/* loaded from: classes.dex */
public final class a0 extends j0<Integer> implements t0<Integer> {
    public a0(int i7) {
        super(1, Integer.MAX_VALUE, n5.m.DROP_OLDEST);
        k(Integer.valueOf(i7));
    }

    @Override // kotlinx.coroutines.flow.t0
    @n6.d
    /* renamed from: g0  reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(S().intValue());
        }
        return valueOf;
    }

    public final boolean h0(int i7) {
        boolean k7;
        synchronized (this) {
            k7 = k(Integer.valueOf(S().intValue() + i7));
        }
        return k7;
    }
}
