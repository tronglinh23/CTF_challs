package p;

import com.google.common.util.concurrent.ListenableFuture;
import d.o0;
import d.q0;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public Object f14471a;

        /* renamed from: b  reason: collision with root package name */
        public d<T> f14472b;

        /* renamed from: c  reason: collision with root package name */
        public e<Void> f14473c = e.u();

        /* renamed from: d  reason: collision with root package name */
        public boolean f14474d;

        public void a(@o0 Runnable runnable, @o0 Executor executor) {
            e<Void> eVar = this.f14473c;
            if (eVar != null) {
                eVar.addListener(runnable, executor);
            }
        }

        public void b() {
            this.f14471a = null;
            this.f14472b = null;
            this.f14473c.p(null);
        }

        public boolean c(T t6) {
            this.f14474d = true;
            d<T> dVar = this.f14472b;
            boolean z6 = dVar != null && dVar.b(t6);
            if (z6) {
                e();
            }
            return z6;
        }

        public boolean d() {
            this.f14474d = true;
            d<T> dVar = this.f14472b;
            boolean z6 = dVar != null && dVar.a(true);
            if (z6) {
                e();
            }
            return z6;
        }

        public final void e() {
            this.f14471a = null;
            this.f14472b = null;
            this.f14473c = null;
        }

        public boolean f(@o0 Throwable th) {
            this.f14474d = true;
            d<T> dVar = this.f14472b;
            boolean z6 = dVar != null && dVar.c(th);
            if (z6) {
                e();
            }
            return z6;
        }

        public void finalize() {
            e<Void> eVar;
            d<T> dVar = this.f14472b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f14471a));
            }
            if (this.f14474d || (eVar = this.f14473c) == null) {
                return;
            }
            eVar.p(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: p.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0203c<T> {
        @q0
        Object a(@o0 a<T> aVar) throws Exception;
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements ListenableFuture<T> {

        /* renamed from: k  reason: collision with root package name */
        public final WeakReference<a<T>> f14475k;

        /* renamed from: l  reason: collision with root package name */
        public final p.a<T> f14476l = new a();

        /* loaded from: classes.dex */
        public class a extends p.a<T> {
            public a() {
            }

            @Override // p.a
            public String m() {
                a<T> aVar = d.this.f14475k.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f14471a + "]";
            }
        }

        public d(a<T> aVar) {
            this.f14475k = new WeakReference<>(aVar);
        }

        public boolean a(boolean z6) {
            return this.f14476l.cancel(z6);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(@o0 Runnable runnable, @o0 Executor executor) {
            this.f14476l.addListener(runnable, executor);
        }

        public boolean b(T t6) {
            return this.f14476l.p(t6);
        }

        public boolean c(Throwable th) {
            return this.f14476l.q(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z6) {
            a<T> aVar = this.f14475k.get();
            boolean cancel = this.f14476l.cancel(z6);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.f14476l.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f14476l.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f14476l.isDone();
        }

        public String toString() {
            return this.f14476l.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j7, @o0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f14476l.get(j7, timeUnit);
        }
    }

    @o0
    public static <T> ListenableFuture<T> a(@o0 InterfaceC0203c<T> interfaceC0203c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f14472b = dVar;
        aVar.f14471a = interfaceC0203c.getClass();
        try {
            Object a7 = interfaceC0203c.a(aVar);
            if (a7 != null) {
                aVar.f14471a = a7;
            }
        } catch (Exception e7) {
            dVar.c(e7);
        }
        return dVar;
    }
}