package p2;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import d.b1;
import d.o0;
import d.q0;
import g1.i0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import z0.z;

/* loaded from: classes.dex */
public abstract class a<D> extends c<D> {

    /* renamed from: p  reason: collision with root package name */
    public static final String f14592p = "AsyncTaskLoader";

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f14593q = false;

    /* renamed from: j  reason: collision with root package name */
    public final Executor f14594j;

    /* renamed from: k  reason: collision with root package name */
    public volatile a<D>.RunnableC0205a f14595k;

    /* renamed from: l  reason: collision with root package name */
    public volatile a<D>.RunnableC0205a f14596l;

    /* renamed from: m  reason: collision with root package name */
    public long f14597m;

    /* renamed from: n  reason: collision with root package name */
    public long f14598n;

    /* renamed from: o  reason: collision with root package name */
    public Handler f14599o;

    /* renamed from: p2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0205a extends d<Void, Void, D> implements Runnable {
        public final CountDownLatch A = new CountDownLatch(1);
        public boolean B;

        public RunnableC0205a() {
        }

        @Override // p2.d
        public void m(D d7) {
            try {
                a.this.E(this, d7);
            } finally {
                this.A.countDown();
            }
        }

        @Override // p2.d
        public void n(D d7) {
            try {
                a.this.F(this, d7);
            } finally {
                this.A.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B = false;
            a.this.G();
        }

        @Override // p2.d
        /* renamed from: u  reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.K();
            } catch (z e7) {
                if (k()) {
                    return null;
                }
                throw e7;
            }
        }

        public void v() {
            try {
                this.A.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public a(@o0 Context context) {
        this(context, d.f14624v);
    }

    public void D() {
    }

    public void E(a<D>.RunnableC0205a runnableC0205a, D d7) {
        J(d7);
        if (this.f14596l == runnableC0205a) {
            x();
            this.f14598n = SystemClock.uptimeMillis();
            this.f14596l = null;
            e();
            G();
        }
    }

    public void F(a<D>.RunnableC0205a runnableC0205a, D d7) {
        if (this.f14595k != runnableC0205a) {
            E(runnableC0205a, d7);
        } else if (k()) {
            J(d7);
        } else {
            c();
            this.f14598n = SystemClock.uptimeMillis();
            this.f14595k = null;
            f(d7);
        }
    }

    public void G() {
        if (this.f14596l != null || this.f14595k == null) {
            return;
        }
        if (this.f14595k.B) {
            this.f14595k.B = false;
            this.f14599o.removeCallbacks(this.f14595k);
        }
        if (this.f14597m <= 0 || SystemClock.uptimeMillis() >= this.f14598n + this.f14597m) {
            this.f14595k.e(this.f14594j, null);
            return;
        }
        this.f14595k.B = true;
        this.f14599o.postAtTime(this.f14595k, this.f14598n + this.f14597m);
    }

    public boolean H() {
        return this.f14596l != null;
    }

    @q0
    public abstract D I();

    public void J(@q0 D d7) {
    }

    @q0
    public D K() {
        return I();
    }

    public void L(long j7) {
        this.f14597m = j7;
        if (j7 != 0) {
            this.f14599o = new Handler();
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void M() {
        a<D>.RunnableC0205a runnableC0205a = this.f14595k;
        if (runnableC0205a != null) {
            runnableC0205a.v();
        }
    }

    @Override // p2.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f14595k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f14595k);
            printWriter.print(" waiting=");
            printWriter.println(this.f14595k.B);
        }
        if (this.f14596l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f14596l);
            printWriter.print(" waiting=");
            printWriter.println(this.f14596l.B);
        }
        if (this.f14597m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            i0.c(this.f14597m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            i0.b(this.f14598n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // p2.c
    public boolean o() {
        if (this.f14595k != null) {
            if (!this.f14612e) {
                this.f14615h = true;
            }
            if (this.f14596l != null) {
                if (this.f14595k.B) {
                    this.f14595k.B = false;
                    this.f14599o.removeCallbacks(this.f14595k);
                }
                this.f14595k = null;
                return false;
            } else if (this.f14595k.B) {
                this.f14595k.B = false;
                this.f14599o.removeCallbacks(this.f14595k);
                this.f14595k = null;
                return false;
            } else {
                boolean a7 = this.f14595k.a(false);
                if (a7) {
                    this.f14596l = this.f14595k;
                    D();
                }
                this.f14595k = null;
                return a7;
            }
        }
        return false;
    }

    @Override // p2.c
    public void q() {
        super.q();
        b();
        this.f14595k = new RunnableC0205a();
        G();
    }

    public a(@o0 Context context, @o0 Executor executor) {
        super(context);
        this.f14598n = -10000L;
        this.f14594j = executor;
    }
}