package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.z1;
/* loaded from: classes.dex */
public final class g extends z1 implements l, Executor {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12986s = AtomicIntegerFieldUpdater.newUpdater(g.class, "inFlightTasks");
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final e f12987n;

    /* renamed from: o  reason: collision with root package name */
    public final int f12988o;
    @n6.e

    /* renamed from: p  reason: collision with root package name */
    public final String f12989p;

    /* renamed from: q  reason: collision with root package name */
    public final int f12990q;
    @n6.d

    /* renamed from: r  reason: collision with root package name */
    public final ConcurrentLinkedQueue<Runnable> f12991r = new ConcurrentLinkedQueue<>();
    @n6.d
    private volatile /* synthetic */ int inFlightTasks = 0;

    public g(@n6.d e eVar, int i7, @n6.e String str, int i8) {
        this.f12987n = eVar;
        this.f12988o = i7;
        this.f12989p = str;
        this.f12990q = i8;
    }

    @Override // kotlinx.coroutines.scheduling.l
    public void I() {
        Runnable poll = this.f12991r.poll();
        if (poll != null) {
            this.f12987n.e1(poll, this, true);
            return;
        }
        f12986s.decrementAndGet(this);
        Runnable poll2 = this.f12991r.poll();
        if (poll2 == null) {
            return;
        }
        b1(poll2, true);
    }

    @Override // kotlinx.coroutines.scheduling.l
    public int M0() {
        return this.f12990q;
    }

    @Override // kotlinx.coroutines.o0
    public void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        b1(runnable, false);
    }

    @Override // kotlinx.coroutines.o0
    public void W0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        b1(runnable, true);
    }

    @Override // kotlinx.coroutines.z1
    @n6.d
    public Executor a1() {
        return this;
    }

    public final void b1(Runnable runnable, boolean z6) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12986s;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f12988o) {
                this.f12987n.e1(runnable, this, z6);
                return;
            }
            this.f12991r.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f12988o) {
                return;
            }
            runnable = this.f12991r.poll();
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@n6.d Runnable runnable) {
        b1(runnable, false);
    }

    @Override // kotlinx.coroutines.o0
    @n6.d
    public String toString() {
        String str = this.f12989p;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f12987n + ']';
        }
        return str;
    }
}
