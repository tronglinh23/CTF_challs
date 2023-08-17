package u3;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import u4.l0;
import v3.m2;
import x3.e0;
import x3.l1;
@t3.d
/* loaded from: classes.dex */
public final class s {
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public static volatile s f17360d = null;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f17362f = false;
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final j f17363a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public Set<? extends m> f17364b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final a f17359c = new a(null);
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final ReentrantLock f17361e = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        @s4.m
        public final s a() {
            if (s.f17360d == null) {
                ReentrantLock reentrantLock = s.f17361e;
                reentrantLock.lock();
                try {
                    if (s.f17360d == null) {
                        a aVar = s.f17359c;
                        s.f17360d = new s(null);
                    }
                    m2 m2Var = m2.f17815a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            s sVar = s.f17360d;
            l0.m(sVar);
            return sVar;
        }

        @s4.m
        public final void b(@n6.d Context context, int i7) {
            l0.p(context, "context");
            Set<m> g7 = new z().g(context, i7);
            s a7 = a();
            if (g7 == null) {
                g7 = l1.k();
            }
            a7.m(g7);
        }

        public a() {
        }
    }

    public /* synthetic */ s(u4.w wVar) {
        this();
    }

    @n6.d
    @s4.m
    public static final s g() {
        return f17359c.a();
    }

    @s4.m
    public static final void i(@n6.d Context context, int i7) {
        f17359c.b(context, i7);
    }

    public final void e(@n6.d Activity activity, @n6.d Executor executor, @n6.d g1.e<List<t>> eVar) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        l0.p(executor, "executor");
        l0.p(eVar, "consumer");
        this.f17363a.c(activity, executor, eVar);
    }

    public final void f() {
        this.f17363a.a(this.f17364b);
    }

    @n6.d
    public final Set<m> h() {
        return e0.V5(this.f17363a.d());
    }

    public final boolean j() {
        return this.f17363a.g();
    }

    public final void k(@n6.d m mVar) {
        l0.p(mVar, "rule");
        this.f17363a.f(mVar);
    }

    public final void l(@n6.d g1.e<List<t>> eVar) {
        l0.p(eVar, "consumer");
        this.f17363a.e(eVar);
    }

    public final void m(Set<? extends m> set) {
        this.f17364b = set;
        this.f17363a.a(set);
    }

    public final void n(@n6.d m mVar) {
        l0.p(mVar, "rule");
        this.f17363a.b(mVar);
    }

    public s() {
        this.f17363a = p.f17340e.a();
        this.f17364b = l1.k();
    }
}
