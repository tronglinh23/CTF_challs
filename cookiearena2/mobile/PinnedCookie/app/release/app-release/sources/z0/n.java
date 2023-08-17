package z0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    public static class a implements Executor {

        /* renamed from: k  reason: collision with root package name */
        public final Handler f19023k;

        public a(@d.o0 Handler handler) {
            this.f19023k = (Handler) g1.s.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@d.o0 Runnable runnable) {
            if (this.f19023k.post((Runnable) g1.s.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f19023k + " is shutting down");
        }
    }

    @d.o0
    public static Executor a(@d.o0 Handler handler) {
        return new a(handler);
    }
}
