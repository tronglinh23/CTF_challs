package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.z2;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public boolean f4759b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4760c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4758a = true;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final Queue<Runnable> f4761d = new ArrayDeque();

    public static final void d(j jVar, Runnable runnable) {
        u4.l0.p(jVar, "this$0");
        u4.l0.p(runnable, "$runnable");
        jVar.f(runnable);
    }

    @d.l0
    public final boolean b() {
        return this.f4759b || !this.f4758a;
    }

    @d.d
    public final void c(@n6.d e4.g gVar, @n6.d final Runnable runnable) {
        u4.l0.p(gVar, "context");
        u4.l0.p(runnable, "runnable");
        z2 a12 = m1.e().a1();
        if (a12.X0(gVar) || b()) {
            a12.V0(gVar, new Runnable() { // from class: androidx.lifecycle.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.d(j.this, runnable);
                }
            });
        } else {
            f(runnable);
        }
    }

    @d.l0
    public final void e() {
        if (this.f4760c) {
            return;
        }
        try {
            this.f4760c = true;
            while ((!this.f4761d.isEmpty()) != false && b()) {
                Runnable poll = this.f4761d.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.f4760c = false;
        }
    }

    @d.l0
    public final void f(Runnable runnable) {
        if (!this.f4761d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        e();
    }

    @d.l0
    public final void g() {
        this.f4759b = true;
        e();
    }

    @d.l0
    public final void h() {
        this.f4758a = true;
    }

    @d.l0
    public final void i() {
        if (this.f4758a) {
            if ((!this.f4759b) != true) {
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.f4758a = false;
            e();
        }
    }
}
