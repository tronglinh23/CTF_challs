package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l<T> extends WeakReference<T> {
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public final int f11949a;

    public l(T t6, @n6.e ReferenceQueue<T> referenceQueue) {
        super(t6, referenceQueue);
        this.f11949a = t6 != null ? t6.hashCode() : 0;
    }
}