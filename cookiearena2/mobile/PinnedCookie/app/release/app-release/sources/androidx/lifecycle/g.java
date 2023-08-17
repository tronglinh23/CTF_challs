package androidx.lifecycle;

import d.b1;
import d.l1;
import d.m1;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class g<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4743a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<T> f4744b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<T> f4745c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f4746d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f4747e;
    @n6.d
    @s4.e

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f4748f;
    @n6.d
    @s4.e

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f4749g;

    /* loaded from: classes.dex */
    public static final class a extends LiveData<T> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ g<T> f4750m;

        public a(g<T> gVar) {
            this.f4750m = gVar;
        }

        @Override // androidx.lifecycle.LiveData
        public void m() {
            this.f4750m.e().execute(this.f4750m.f4748f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.Executor, u4.w] */
    @s4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.g.<init>():void");
    }

    @l1
    public static /* synthetic */ void g() {
    }

    @l1
    public static /* synthetic */ void i() {
    }

    public static final void k(g gVar) {
        u4.l0.p(gVar, "this$0");
        boolean h7 = gVar.h().h();
        if (gVar.f4746d.compareAndSet(false, true) && h7) {
            gVar.f4743a.execute(gVar.f4748f);
        }
    }

    public static final void l(g gVar) {
        u4.l0.p(gVar, "this$0");
        do {
            boolean z6 = false;
            if (gVar.f4747e.compareAndSet(false, true)) {
                T t6 = null;
                boolean z7 = false;
                while (gVar.f4746d.compareAndSet(true, false)) {
                    try {
                        t6 = (T) gVar.c();
                        z7 = true;
                    } catch (Throwable th) {
                        gVar.f4747e.set(false);
                        throw th;
                    }
                }
                if (z7) {
                    gVar.h().o(t6);
                }
                gVar.f4747e.set(false);
                z6 = z7;
            }
            if (!z6) {
                return;
            }
        } while (gVar.f4746d.get());
    }

    @m1
    public abstract T c();

    @n6.d
    public final AtomicBoolean d() {
        return this.f4747e;
    }

    @n6.d
    public final Executor e() {
        return this.f4743a;
    }

    @n6.d
    public final AtomicBoolean f() {
        return this.f4746d;
    }

    @n6.d
    public LiveData<T> h() {
        return this.f4745c;
    }

    public void j() {
        l.c.h().b(this.f4749g);
    }

    @s4.i
    public g(@n6.d Executor executor) {
        u4.l0.p(executor, "executor");
        this.f4743a = executor;
        a aVar = new a(this);
        this.f4744b = aVar;
        this.f4745c = aVar;
        this.f4746d = new AtomicBoolean(true);
        this.f4747e = new AtomicBoolean(false);
        this.f4748f = new Runnable() { // from class: androidx.lifecycle.e
            @Override // java.lang.Runnable
            public final void run() {
                g.l(g.this);
            }
        };
        this.f4749g = new Runnable() { // from class: androidx.lifecycle.f
            @Override // java.lang.Runnable
            public final void run() {
                g.k(g.this);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ g(java.util.concurrent.Executor r1, int r2, u4.w r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.Executor r1 = l.c.g()
            java.lang.String r2 = "getIOThreadExecutor()"
            u4.l0.o(r1, r2)
        Ld:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.g.<init>(java.util.concurrent.Executor, int, u4.w):void");
    }
}
