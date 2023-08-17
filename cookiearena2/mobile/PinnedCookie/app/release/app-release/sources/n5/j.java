package n5;

import kotlinx.coroutines.e3;
/* loaded from: classes.dex */
public final class j {
    @e3
    @n6.d
    public static final <E> i<E> a(int i7) {
        if (i7 != -2) {
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != Integer.MAX_VALUE) {
                        return new g(i7);
                    }
                    throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
                }
                throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
            }
            return new z();
        }
        return new g(n.f13954d.a());
    }
}
