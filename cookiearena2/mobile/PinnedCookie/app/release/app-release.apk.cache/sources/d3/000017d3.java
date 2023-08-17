package p;

import com.google.common.util.concurrent.ListenableFuture;
import d.b1;
import d.o0;
import d.q0;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p0.x0;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class a<V> implements ListenableFuture<V> {

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f14443n = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: o  reason: collision with root package name */
    public static final Logger f14444o = Logger.getLogger(a.class.getName());

    /* renamed from: p  reason: collision with root package name */
    public static final long f14445p = 1000;

    /* renamed from: q  reason: collision with root package name */
    public static final b f14446q;

    /* renamed from: r  reason: collision with root package name */
    public static final Object f14447r;
    @q0

    /* renamed from: k  reason: collision with root package name */
    public volatile Object f14448k;
    @q0

    /* renamed from: l  reason: collision with root package name */
    public volatile e f14449l;
    @q0

    /* renamed from: m  reason: collision with root package name */
    public volatile i f14450m;

    /* loaded from: classes.dex */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final c f14451c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f14452d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f14453a;
        @q0

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f14454b;

        static {
            if (a.f14443n) {
                f14452d = null;
                f14451c = null;
                return;
            }
            f14452d = new c(false, null);
            f14451c = new c(true, null);
        }

        public c(boolean z6, @q0 Throwable th) {
            this.f14453a = z6;
            this.f14454b = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        public static final d f14455b = new d(new C0202a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f14456a;

        /* renamed from: p.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0202a extends Throwable {
            public C0202a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f14456a = (Throwable) a.d(th);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f14457d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f14458a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f14459b;
        @q0

        /* renamed from: c  reason: collision with root package name */
        public e f14460c;

        public e(Runnable runnable, Executor executor) {
            this.f14458a = runnable;
            this.f14459b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f14461a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f14462b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, i> f14463c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f14464d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f14465e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f14461a = atomicReferenceFieldUpdater;
            this.f14462b = atomicReferenceFieldUpdater2;
            this.f14463c = atomicReferenceFieldUpdater3;
            this.f14464d = atomicReferenceFieldUpdater4;
            this.f14465e = atomicReferenceFieldUpdater5;
        }

        @Override // p.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return p.b.a(this.f14464d, aVar, eVar, eVar2);
        }

        @Override // p.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return p.b.a(this.f14465e, aVar, obj, obj2);
        }

        @Override // p.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return p.b.a(this.f14463c, aVar, iVar, iVar2);
        }

        @Override // p.a.b
        public void d(i iVar, i iVar2) {
            this.f14462b.lazySet(iVar, iVar2);
        }

        @Override // p.a.b
        public void e(i iVar, Thread thread) {
            this.f14461a.lazySet(iVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final a<V> f14466k;

        /* renamed from: l  reason: collision with root package name */
        public final ListenableFuture<? extends V> f14467l;

        public g(a<V> aVar, ListenableFuture<? extends V> listenableFuture) {
            this.f14466k = aVar;
            this.f14467l = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f14466k.f14448k != this) {
                return;
            }
            if (a.f14446q.b(this.f14466k, this, a.i(this.f14467l))) {
                a.f(this.f14466k);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // p.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f14449l == eVar) {
                    aVar.f14449l = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // p.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f14448k == obj) {
                    aVar.f14448k = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // p.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f14450m == iVar) {
                    aVar.f14450m = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // p.a.b
        public void d(i iVar, i iVar2) {
            iVar.f14470b = iVar2;
        }

        @Override // p.a.b
        public void e(i iVar, Thread thread) {
            iVar.f14469a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        public static final i f14468c = new i(false);
        @q0

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f14469a;
        @q0

        /* renamed from: b  reason: collision with root package name */
        public volatile i f14470b;

        public i(boolean z6) {
        }

        public void a(i iVar) {
            a.f14446q.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f14469a;
            if (thread != null) {
                this.f14469a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            a.f14446q.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, x0.f14590b), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "l"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "k"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f14446q = hVar;
        if (th != null) {
            f14444o.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f14447r = new Object();
    }

    public static CancellationException c(@q0 String str, @q0 Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @o0
    public static <T> T d(@q0 T t6) {
        t6.getClass();
        return t6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [p.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [p.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [p.a, p.a<V>] */
    public static void f(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e e7 = aVar.e(eVar);
            while (e7 != null) {
                eVar = e7.f14460c;
                Runnable runnable = e7.f14458a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f14466k;
                    if (aVar.f14448k == gVar) {
                        if (f14446q.b(aVar, gVar, i(gVar.f14467l))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, e7.f14459b);
                }
                e7 = eVar;
            }
            return;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f14444o.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object i(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof a) {
            Object obj = ((a) listenableFuture).f14448k;
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f14453a ? cVar.f14454b != null ? new c(false, cVar.f14454b) : c.f14452d : obj;
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f14443n) != false && isCancelled) {
            return c.f14452d;
        }
        try {
            Object j7 = j(listenableFuture);
            return j7 == null ? f14447r : j7;
        } catch (CancellationException e7) {
            if (isCancelled) {
                return new c(false, e7);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e7));
        } catch (ExecutionException e8) {
            return new d(e8.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public static <V> V j(Future<V> future) throws ExecutionException {
        V v6;
        boolean z6 = false;
        while (true) {
            try {
                v6 = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return v6;
    }

    public final void a(StringBuilder sb) {
        try {
            Object j7 = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(j7));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f14449l;
        if (eVar != e.f14457d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f14460c = eVar;
                if (f14446q.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f14449l;
            } while (eVar != e.f14457d);
        }
        g(runnable, executor);
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        Object obj = this.f14448k;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f14443n ? new c(z6, new CancellationException("Future.cancel() was called.")) : z6 ? c.f14451c : c.f14452d;
        a<V> aVar = this;
        boolean z7 = false;
        while (true) {
            if (f14446q.b(aVar, obj, cVar)) {
                if (z6) {
                    aVar.k();
                }
                f(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((g) obj).f14467l;
                if (!(listenableFuture instanceof a)) {
                    listenableFuture.cancel(z6);
                    return true;
                }
                aVar = (a) listenableFuture;
                obj = aVar.f14448k;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z7 = true;
            } else {
                obj = aVar.f14448k;
                if (!(obj instanceof g)) {
                    return z7;
                }
            }
        }
    }

    public final e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f14449l;
        } while (!f14446q.a(this, eVar2, e.f14457d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f14460c;
            eVar4.f14460c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j7);
        if (!Thread.interrupted()) {
            Object obj = this.f14448k;
            if ((obj != null) & (!(obj instanceof g))) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f14450m;
                if (iVar != i.f14468c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f14446q.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f14448k;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.f14450m;
                        }
                    } while (iVar != i.f14468c);
                }
                return h(this.f14448k);
            }
            while (nanos > 0) {
                Object obj3 = this.f14448k;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j8 = -nanos;
                long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
                long nanos2 = j8 - timeUnit.toNanos(convert);
                int i7 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z6 = i7 == 0 || nanos2 > 1000;
                if (i7 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z6) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z6) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f14454b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f14456a);
        }
        if (obj == f14447r) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14448k instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f14448k != null);
    }

    public void k() {
    }

    public final void l(@q0 Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(t());
        }
    }

    @q0
    public String m() {
        Object obj = this.f14448k;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f14467l) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void n() {
        i iVar;
        do {
            iVar = this.f14450m;
        } while (!f14446q.c(this, iVar, i.f14468c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f14470b;
        }
    }

    public final void o(i iVar) {
        iVar.f14469a = null;
        while (true) {
            i iVar2 = this.f14450m;
            if (iVar2 == i.f14468c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f14470b;
                if (iVar2.f14469a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f14470b = iVar4;
                    if (iVar3.f14469a == null) {
                        break;
                    }
                } else if (!f14446q.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    public boolean p(@q0 V v6) {
        if (v6 == null) {
            v6 = (V) f14447r;
        }
        if (f14446q.b(this, null, v6)) {
            f(this);
            return true;
        }
        return false;
    }

    public boolean q(Throwable th) {
        if (f14446q.b(this, null, new d((Throwable) d(th)))) {
            f(this);
            return true;
        }
        return false;
    }

    public boolean r(ListenableFuture<? extends V> listenableFuture) {
        d dVar;
        d(listenableFuture);
        Object obj = this.f14448k;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (f14446q.b(this, null, i(listenableFuture))) {
                    f(this);
                    return true;
                }
                return false;
            }
            g gVar = new g(this, listenableFuture);
            if (f14446q.b(this, null, gVar)) {
                try {
                    listenableFuture.addListener(gVar, p.d.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f14455b;
                    }
                    f14446q.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f14448k;
        }
        if (obj instanceof c) {
            listenableFuture.cancel(((c) obj).f14453a);
        }
        return false;
    }

    public final String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean t() {
        Object obj = this.f14448k;
        return (obj instanceof c) && ((c) obj).f14453a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = m();
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f14448k;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f14450m;
            if (iVar != i.f14468c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f14446q.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f14448k;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f14450m;
                } while (iVar != i.f14468c);
            }
            return h(this.f14448k);
        }
        throw new InterruptedException();
    }
}