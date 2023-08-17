package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.z;
import d.m1;
import d.o0;
import d.q0;
import d.w0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements i3.b<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final long f4026a = 500;

    /* renamed from: b  reason: collision with root package name */
    public static final String f4027b = "EmojiCompatInitializer";

    @w0(19)
    /* loaded from: classes.dex */
    public static class a extends f.d {
        public a(Context context) {
            super(new b(context));
            f(1);
        }
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static class b implements f.i {

        /* renamed from: a  reason: collision with root package name */
        public final Context f4030a;

        /* loaded from: classes.dex */
        public class a extends f.j {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f.j f4031a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ThreadPoolExecutor f4032b;

            public a(f.j jVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f4031a = jVar;
                this.f4032b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.j
            public void a(@q0 Throwable th) {
                try {
                    this.f4031a.a(th);
                } finally {
                    this.f4032b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.j
            public void b(@o0 p pVar) {
                try {
                    this.f4031a.b(pVar);
                } finally {
                    this.f4032b.shutdown();
                }
            }
        }

        public b(Context context) {
            this.f4030a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.i
        public void a(@o0 final f.j jVar) {
            final ThreadPoolExecutor c7 = androidx.emoji2.text.c.c(EmojiCompatInitializer.f4027b);
            c7.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(jVar, c7);
                }
            });
        }

        @m1
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public void d(@o0 f.j jVar, @o0 ThreadPoolExecutor threadPoolExecutor) {
            try {
                l a7 = d.a(this.f4030a);
                if (a7 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a7.l(threadPoolExecutor);
                a7.a().a(new a(jVar, threadPoolExecutor));
            } catch (Throwable th) {
                jVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                z0.w0.b("EmojiCompat.EmojiCompatInitializer.run");
                if (f.n()) {
                    f.b().q();
                }
            } finally {
                z0.w0.d();
            }
        }
    }

    @Override // i3.b
    @o0
    public List<Class<? extends i3.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // i3.b
    @o0
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public Boolean b(@o0 Context context) {
        f.m(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    @w0(19)
    public void d(@o0 Context context) {
        final androidx.lifecycle.p lifecycle = ((z) i3.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new androidx.lifecycle.h() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.h
            public void a(@o0 z zVar) {
                EmojiCompatInitializer.this.e();
                lifecycle.d(this);
            }
        });
    }

    @w0(19)
    public void e() {
        androidx.emoji2.text.c.e().postDelayed(new c(), 500L);
    }
}
