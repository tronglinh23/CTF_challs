package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import d.o0;
import d.u;
import d.w0;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements i3.b<c> {

    /* renamed from: a  reason: collision with root package name */
    public static final int f4941a = 5000;

    @w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static void c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: b3.k
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j7) {
                    runnable.run();
                }
            });
        }
    }

    @w0(28)
    /* loaded from: classes.dex */
    public static class b {
        @u
        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    public static void l(@o0 final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: b3.j
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.c.l(context);
            }
        });
    }

    @Override // i3.b
    @o0
    public List<Class<? extends i3.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // i3.b
    @o0
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public c b(@o0 Context context) {
        g(context.getApplicationContext());
        return new c();
    }

    @w0(16)
    public void g(@o0 final Context context) {
        a.c(new Runnable() { // from class: b3.i
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.i(context);
            }
        });
    }

    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public void i(@o0 final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: b3.h
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.l(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + f4941a);
    }
}
