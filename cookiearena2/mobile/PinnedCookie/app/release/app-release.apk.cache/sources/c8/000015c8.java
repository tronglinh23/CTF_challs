package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13013b = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13014c = AtomicIntegerFieldUpdater.newUpdater(q.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13015d = AtomicIntegerFieldUpdater.newUpdater(q.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13016e = AtomicIntegerFieldUpdater.newUpdater(q.class, "blockingTasksInBuffer");
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<k> f13017a = new AtomicReferenceArray<>(128);
    @n6.d
    private volatile /* synthetic */ Object lastScheduledTask = null;
    @n6.d
    private volatile /* synthetic */ int producerIndex = 0;
    @n6.d
    private volatile /* synthetic */ int consumerIndex = 0;
    @n6.d
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ k b(q qVar, k kVar, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return qVar.a(kVar, z6);
    }

    @n6.e
    public final k a(@n6.d k kVar, boolean z6) {
        if (z6) {
            return c(kVar);
        }
        k kVar2 = (k) f13013b.getAndSet(this, kVar);
        if (kVar2 == null) {
            return null;
        }
        return c(kVar2);
    }

    public final k c(k kVar) {
        if (kVar.f12999l.M0() == 1) {
            f13016e.incrementAndGet(this);
        }
        if (e() == 127) {
            return kVar;
        }
        int i7 = this.producerIndex & 127;
        while (this.f13017a.get(i7) != null) {
            Thread.yield();
        }
        this.f13017a.lazySet(i7, kVar);
        f13014c.incrementAndGet(this);
        return null;
    }

    public final void d(k kVar) {
        if (kVar != null) {
            if (kVar.f12999l.M0() == 1) {
                f13016e.decrementAndGet(this);
            }
        }
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(@n6.d f fVar) {
        k kVar = (k) f13013b.getAndSet(this, null);
        if (kVar != null) {
            fVar.a(kVar);
        }
        do {
        } while (j(fVar));
    }

    @n6.e
    public final k h() {
        k kVar = (k) f13013b.getAndSet(this, null);
        return kVar == null ? i() : kVar;
    }

    public final k i() {
        k andSet;
        while (true) {
            int i7 = this.consumerIndex;
            if (i7 - this.producerIndex == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (f13015d.compareAndSet(this, i7, i7 + 1) && (andSet = this.f13017a.getAndSet(i8, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    public final boolean j(f fVar) {
        k i7 = i();
        if (i7 == null) {
            return false;
        }
        fVar.a(i7);
        return true;
    }

    public final long k(@n6.d q qVar) {
        int i7 = qVar.consumerIndex;
        int i8 = qVar.producerIndex;
        AtomicReferenceArray<k> atomicReferenceArray = qVar.f13017a;
        while (true) {
            if (i7 == i8) {
                break;
            }
            int i9 = i7 & 127;
            if (qVar.blockingTasksInBuffer == 0) {
                break;
            }
            k kVar = atomicReferenceArray.get(i9);
            if (kVar != null) {
                if ((kVar.f12999l.M0() == 1) && kotlinx.coroutines.debug.internal.b.a(atomicReferenceArray, i9, kVar, null)) {
                    f13016e.decrementAndGet(qVar);
                    b(this, kVar, false, 2, null);
                    return -1L;
                }
            }
            i7++;
        }
        return m(qVar, true);
    }

    public final long l(@n6.d q qVar) {
        k i7 = qVar.i();
        if (i7 != null) {
            b(this, i7, false, 2, null);
            return -1L;
        }
        return m(qVar, false);
    }

    public final long m(q qVar, boolean z6) {
        k kVar;
        do {
            kVar = (k) qVar.lastScheduledTask;
            if (kVar == null) {
                return -2L;
            }
            if (z6) {
                if (!(kVar.f12999l.M0() == 1)) {
                    return -2L;
                }
            }
            long a7 = o.f13007f.a() - kVar.f12998k;
            long j7 = o.f13003b;
            if (a7 < j7) {
                return j7 - a7;
            }
        } while (!p.b.a(f13013b, qVar, kVar, null));
        b(this, kVar, false, 2, null);
        return -1L;
    }
}