package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.o0;

/* loaded from: classes.dex */
public abstract class o0<S extends o0<S>> extends h<S> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12834d = AtomicIntegerFieldUpdater.newUpdater(o0.class, "cleanedAndPointers");

    /* renamed from: c  reason: collision with root package name */
    public final long f12835c;
    @n6.d
    private volatile /* synthetic */ int cleanedAndPointers;

    public o0(long j7, @n6.e S s6, int i7) {
        super(s6);
        this.f12835c = j7;
        this.cleanedAndPointers = i7 << 16;
    }

    @Override // kotlinx.coroutines.internal.h
    public boolean g() {
        return this.cleanedAndPointers == p() && !i();
    }

    public final boolean n() {
        return f12834d.addAndGet(this, u0.a.f17311c) == p() && !i();
    }

    public final long o() {
        return this.f12835c;
    }

    public abstract int p();

    public final void q() {
        if (f12834d.incrementAndGet(this) != p() || i()) {
            return;
        }
        l();
    }

    public final boolean r() {
        int i7;
        do {
            i7 = this.cleanedAndPointers;
            if (!(i7 != p() || i())) {
                return false;
            }
        } while (!f12834d.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}