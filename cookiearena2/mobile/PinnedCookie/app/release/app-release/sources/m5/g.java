package m5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import d.l1;
import e4.i;
import h4.h;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.q;
import kotlinx.coroutines.r;
import u.v;
import u4.l0;
import v3.d1;
import v3.e1;
import v3.k;
import v3.m;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final long f13557a = 4611686018427387903L;
    @s4.e
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public static final e f13558b;
    @n6.e
    private static volatile Choreographer choreographer;

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ q f13559k;

        public a(q qVar) {
            this.f13559k = qVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.l(this.f13559k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, u4.w] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    static {
        Object b7;
        try {
            d1.a aVar = d1.f17778l;
            b7 = d1.b(new d(d(Looper.getMainLooper(), true), r0, 2, r0));
        } catch (Throwable th) {
            d1.a aVar2 = d1.f17778l;
            b7 = d1.b(e1.a(th));
        }
        f13558b = (e) (d1.i(b7) ? 0 : b7);
    }

    @n6.d
    @l1
    public static final Handler d(@n6.d Looper looper, boolean z6) {
        if (z6) {
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                    return new Handler(looper);
                }
            }
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        return new Handler(looper);
    }

    @n6.e
    public static final Object e(@n6.d e4.d<? super Long> dVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            r rVar = new r(g4.c.d(dVar), 1);
            rVar.x();
            j(choreographer2, rVar);
            Object A = rVar.A();
            if (A == g4.d.h()) {
                h.c(dVar);
            }
            return A;
        }
        r rVar2 = new r(g4.c.d(dVar), 1);
        rVar2.x();
        m1.e().V0(i.f8770k, new a(rVar2));
        Object A2 = rVar2.A();
        if (A2 == g4.d.h()) {
            h.c(dVar);
        }
        return A2;
    }

    @s4.h(name = v.h.f17254c)
    @n6.d
    @s4.i
    public static final e f(@n6.d Handler handler) {
        return h(handler, null, 1, null);
    }

    @s4.h(name = v.h.f17254c)
    @n6.d
    @s4.i
    public static final e g(@n6.d Handler handler, @n6.e String str) {
        return new d(handler, str);
    }

    public static /* synthetic */ e h(Handler handler, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        return g(handler, str);
    }

    @k(level = m.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void i() {
    }

    public static final void j(Choreographer choreographer2, final q<? super Long> qVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: m5.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j7) {
                g.k(q.this, j7);
            }
        });
    }

    public static final void k(q qVar, long j7) {
        qVar.r(m1.e(), Long.valueOf(j7));
    }

    public static final void l(q<? super Long> qVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            l0.m(choreographer2);
            choreographer = choreographer2;
        }
        j(choreographer2, qVar);
    }
}
