package z0;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19016a;

    /* renamed from: b  reason: collision with root package name */
    public b f19017b;

    /* renamed from: c  reason: collision with root package name */
    public Object f19018c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19019d;

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        @d.u
        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            if (this.f19016a) {
                return;
            }
            this.f19016a = true;
            this.f19019d = true;
            b bVar = this.f19017b;
            Object obj = this.f19018c;
            if (bVar != null) {
                try {
                    bVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f19019d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                a.a(obj);
            }
            synchronized (this) {
                this.f19019d = false;
                notifyAll();
            }
        }
    }

    @d.q0
    public Object b() {
        Object obj;
        synchronized (this) {
            if (this.f19018c == null) {
                CancellationSignal b7 = a.b();
                this.f19018c = b7;
                if (this.f19016a) {
                    a.a(b7);
                }
            }
            obj = this.f19018c;
        }
        return obj;
    }

    public boolean c() {
        boolean z6;
        synchronized (this) {
            z6 = this.f19016a;
        }
        return z6;
    }

    public void d(@d.q0 b bVar) {
        synchronized (this) {
            f();
            if (this.f19017b == bVar) {
                return;
            }
            this.f19017b = bVar;
            if (this.f19016a && bVar != null) {
                bVar.onCancel();
            }
        }
    }

    public void e() {
        if (c()) {
            throw new z();
        }
    }

    public final void f() {
        while (this.f19019d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}