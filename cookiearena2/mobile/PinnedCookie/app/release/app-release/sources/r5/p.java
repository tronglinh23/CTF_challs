package r5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u4.l0;
import v3.b1;
import v3.m2;
import x5.e;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public int f16018a;

    /* renamed from: b  reason: collision with root package name */
    public int f16019b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public Runnable f16020c;

    /* renamed from: d  reason: collision with root package name */
    public ExecutorService f16021d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<e.a> f16022e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<e.a> f16023f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<x5.e> f16024g;

    public p() {
        this.f16018a = 64;
        this.f16019b = 5;
        this.f16022e = new ArrayDeque<>();
        this.f16023f = new ArrayDeque<>();
        this.f16024g = new ArrayDeque<>();
    }

    @s4.h(name = "-deprecated_executorService")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "executorService", imports = {}))
    public final ExecutorService a() {
        return e();
    }

    public final synchronized void b() {
        Iterator<e.a> it = this.f16022e.iterator();
        while (it.hasNext()) {
            it.next().b().cancel();
        }
        Iterator<e.a> it2 = this.f16023f.iterator();
        while (it2.hasNext()) {
            it2.next().b().cancel();
        }
        Iterator<x5.e> it3 = this.f16024g.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void c(@n6.d e.a aVar) {
        e.a f7;
        l0.p(aVar, i0.k0.E0);
        synchronized (this) {
            this.f16022e.add(aVar);
            if (!aVar.b().u() && (f7 = f(aVar.d())) != null) {
                aVar.f(f7);
            }
            m2 m2Var = m2.f17815a;
        }
        m();
    }

    public final synchronized void d(@n6.d x5.e eVar) {
        l0.p(eVar, i0.k0.E0);
        this.f16024g.add(eVar);
    }

    @s4.h(name = "executorService")
    @n6.d
    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        if (this.f16021d == null) {
            this.f16021d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), s5.d.U(s5.d.f16659i + " Dispatcher", false));
        }
        executorService = this.f16021d;
        l0.m(executorService);
        return executorService;
    }

    public final e.a f(String str) {
        Iterator<e.a> it = this.f16023f.iterator();
        while (it.hasNext()) {
            e.a next = it.next();
            if (l0.g(next.d(), str)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.f16022e.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (l0.g(next2.d(), str)) {
                return next2;
            }
        }
        return null;
    }

    public final <T> void g(Deque<T> deque, T t6) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t6)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f16020c;
            m2 m2Var = m2.f17815a;
        }
        if (m() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final void h(@n6.d e.a aVar) {
        l0.p(aVar, i0.k0.E0);
        aVar.c().decrementAndGet();
        g(this.f16023f, aVar);
    }

    public final void i(@n6.d x5.e eVar) {
        l0.p(eVar, i0.k0.E0);
        g(this.f16024g, eVar);
    }

    @n6.e
    public final synchronized Runnable j() {
        return this.f16020c;
    }

    public final synchronized int k() {
        return this.f16018a;
    }

    public final synchronized int l() {
        return this.f16019b;
    }

    public final boolean m() {
        int i7;
        boolean z6;
        if (s5.d.f16658h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<e.a> it = this.f16022e.iterator();
            l0.o(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                e.a next = it.next();
                if (this.f16023f.size() >= this.f16018a) {
                    break;
                } else if (next.c().get() < this.f16019b) {
                    it.remove();
                    next.c().incrementAndGet();
                    l0.o(next, "asyncCall");
                    arrayList.add(next);
                    this.f16023f.add(next);
                }
            }
            z6 = q() > 0;
            m2 m2Var = m2.f17815a;
        }
        int size = arrayList.size();
        for (i7 = 0; i7 < size; i7++) {
            ((e.a) arrayList.get(i7)).a(e());
        }
        return z6;
    }

    @n6.d
    public final synchronized List<e> n() {
        List<e> unmodifiableList;
        ArrayDeque<e.a> arrayDeque = this.f16022e;
        ArrayList arrayList = new ArrayList(x3.x.Y(arrayDeque, 10));
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((e.a) it.next()).b());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        l0.o(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int o() {
        return this.f16022e.size();
    }

    @n6.d
    public final synchronized List<e> p() {
        List<e> unmodifiableList;
        ArrayDeque<x5.e> arrayDeque = this.f16024g;
        ArrayDeque<e.a> arrayDeque2 = this.f16023f;
        ArrayList arrayList = new ArrayList(x3.x.Y(arrayDeque2, 10));
        Iterator<T> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(((e.a) it.next()).b());
        }
        unmodifiableList = Collections.unmodifiableList(x3.e0.z4(arrayDeque, arrayList));
        l0.o(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int q() {
        return this.f16023f.size() + this.f16024g.size();
    }

    public final synchronized void r(@n6.e Runnable runnable) {
        this.f16020c = runnable;
    }

    public final void s(int i7) {
        if (!(i7 >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + i7).toString());
        }
        synchronized (this) {
            this.f16018a = i7;
            m2 m2Var = m2.f17815a;
        }
        m();
    }

    public final void t(int i7) {
        if (!(i7 >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + i7).toString());
        }
        synchronized (this) {
            this.f16019b = i7;
            m2 m2Var = m2.f17815a;
        }
        m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@n6.d ExecutorService executorService) {
        this();
        l0.p(executorService, "executorService");
        this.f16021d = executorService;
    }
}
