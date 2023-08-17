package kotlinx.coroutines.debug.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i7, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i7, obj, obj2)) {
            if (atomicReferenceArray.get(i7) != obj) {
                return false;
            }
        }
        return true;
    }
}