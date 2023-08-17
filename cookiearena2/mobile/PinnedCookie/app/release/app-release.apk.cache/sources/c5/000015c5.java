package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.z0;

/* loaded from: classes.dex */
public final class n extends k {
    @n6.d
    @s4.e

    /* renamed from: m  reason: collision with root package name */
    public final Runnable f13001m;

    public n(@n6.d Runnable runnable, long j7, @n6.d l lVar) {
        super(j7, lVar);
        this.f13001m = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f13001m.run();
        } finally {
            this.f12999l.I();
        }
    }

    @n6.d
    public String toString() {
        return "Task[" + z0.a(this.f13001m) + '@' + z0.b(this.f13001m) + ", " + this.f12998k + ", " + this.f12999l + ']';
    }
}