package androidx.emoji2.text;

import a1.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.emoji2.text.f;
import androidx.emoji2.text.l;
import d.b0;
import d.b1;
import d.m1;
import d.o0;
import d.q0;
import d.w0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p0.n2;
/* loaded from: classes.dex */
public class l extends f.d {

    /* renamed from: j  reason: collision with root package name */
    public static final b f4121j = new b();

    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public final long f4122a;

        /* renamed from: b  reason: collision with root package name */
        public long f4123b;

        public a(long j7) {
            this.f4122a = j7;
        }

        @Override // androidx.emoji2.text.l.d
        public long a() {
            if (this.f4123b == 0) {
                this.f4123b = SystemClock.uptimeMillis();
                return 0L;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f4123b;
            if (uptimeMillis > this.f4122a) {
                return -1L;
            }
            return Math.min(Math.max(uptimeMillis, 1000L), this.f4122a - uptimeMillis);
        }
    }

    @b1({b1.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class b {
        @q0
        public Typeface a(@o0 Context context, @o0 h.c cVar) throws PackageManager.NameNotFoundException {
            return a1.h.a(context, null, new h.c[]{cVar});
        }

        @o0
        public h.b b(@o0 Context context, @o0 a1.f fVar) throws PackageManager.NameNotFoundException {
            return a1.h.b(context, null, fVar);
        }

        public void c(@o0 Context context, @o0 Uri uri, @o0 ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void d(@o0 Context context, @o0 ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements f.i {

        /* renamed from: l  reason: collision with root package name */
        public static final String f4124l = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final Context f4125a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final a1.f f4126b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final b f4127c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public final Object f4128d = new Object();
        @q0
        @b0("mLock")

        /* renamed from: e  reason: collision with root package name */
        public Handler f4129e;
        @q0
        @b0("mLock")

        /* renamed from: f  reason: collision with root package name */
        public Executor f4130f;
        @q0
        @b0("mLock")

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f4131g;
        @q0
        @b0("mLock")

        /* renamed from: h  reason: collision with root package name */
        public d f4132h;
        @q0
        @b0("mLock")

        /* renamed from: i  reason: collision with root package name */
        public f.j f4133i;
        @q0
        @b0("mLock")

        /* renamed from: j  reason: collision with root package name */
        public ContentObserver f4134j;
        @q0
        @b0("mLock")

        /* renamed from: k  reason: collision with root package name */
        public Runnable f4135k;

        /* loaded from: classes.dex */
        public class a extends ContentObserver {
            public a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z6, Uri uri) {
                c.this.d();
            }
        }

        public c(@o0 Context context, @o0 a1.f fVar, @o0 b bVar) {
            g1.s.m(context, "Context cannot be null");
            g1.s.m(fVar, "FontRequest cannot be null");
            this.f4125a = context.getApplicationContext();
            this.f4126b = fVar;
            this.f4127c = bVar;
        }

        @Override // androidx.emoji2.text.f.i
        @w0(19)
        public void a(@o0 f.j jVar) {
            g1.s.m(jVar, "LoaderCallback cannot be null");
            synchronized (this.f4128d) {
                this.f4133i = jVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f4128d) {
                this.f4133i = null;
                ContentObserver contentObserver = this.f4134j;
                if (contentObserver != null) {
                    this.f4127c.d(this.f4125a, contentObserver);
                    this.f4134j = null;
                }
                Handler handler = this.f4129e;
                if (handler != null) {
                    handler.removeCallbacks(this.f4135k);
                }
                this.f4129e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4131g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4130f = null;
                this.f4131g = null;
            }
        }

        @m1
        @w0(19)
        public void c() {
            synchronized (this.f4128d) {
                if (this.f4133i == null) {
                    return;
                }
                try {
                    h.c e7 = e();
                    int b7 = e7.b();
                    if (b7 == 2) {
                        synchronized (this.f4128d) {
                            d dVar = this.f4132h;
                            if (dVar != null) {
                                long a7 = dVar.a();
                                if (a7 >= 0) {
                                    f(e7.d(), a7);
                                    return;
                                }
                            }
                        }
                    }
                    if (b7 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + b7 + ")");
                    }
                    z0.w0.b(f4124l);
                    Typeface a8 = this.f4127c.a(this.f4125a, e7);
                    ByteBuffer f7 = n2.f(this.f4125a, null, e7.d());
                    if (f7 == null || a8 == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    p e8 = p.e(a8, f7);
                    z0.w0.d();
                    synchronized (this.f4128d) {
                        f.j jVar = this.f4133i;
                        if (jVar != null) {
                            jVar.b(e8);
                        }
                    }
                    b();
                } catch (Throwable th) {
                    synchronized (this.f4128d) {
                        f.j jVar2 = this.f4133i;
                        if (jVar2 != null) {
                            jVar2.a(th);
                        }
                        b();
                    }
                }
            }
        }

        @w0(19)
        public void d() {
            synchronized (this.f4128d) {
                if (this.f4133i == null) {
                    return;
                }
                if (this.f4130f == null) {
                    ThreadPoolExecutor c7 = androidx.emoji2.text.c.c("emojiCompat");
                    this.f4131g = c7;
                    this.f4130f = c7;
                }
                this.f4130f.execute(new Runnable() { // from class: androidx.emoji2.text.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.c.this.c();
                    }
                });
            }
        }

        @m1
        public final h.c e() {
            try {
                h.b b7 = this.f4127c.b(this.f4125a, this.f4126b);
                if (b7.c() == 0) {
                    h.c[] b8 = b7.b();
                    if (b8 == null || b8.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return b8[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b7.c() + ")");
            } catch (PackageManager.NameNotFoundException e7) {
                throw new RuntimeException("provider not found", e7);
            }
        }

        @m1
        @w0(19)
        public final void f(Uri uri, long j7) {
            synchronized (this.f4128d) {
                Handler handler = this.f4129e;
                if (handler == null) {
                    handler = androidx.emoji2.text.c.e();
                    this.f4129e = handler;
                }
                if (this.f4134j == null) {
                    a aVar = new a(handler);
                    this.f4134j = aVar;
                    this.f4127c.c(this.f4125a, uri, aVar);
                }
                if (this.f4135k == null) {
                    this.f4135k = new Runnable() { // from class: androidx.emoji2.text.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            l.c.this.d();
                        }
                    };
                }
                handler.postDelayed(this.f4135k, j7);
            }
        }

        public void g(@o0 Executor executor) {
            synchronized (this.f4128d) {
                this.f4130f = executor;
            }
        }

        public void h(@q0 d dVar) {
            synchronized (this.f4128d) {
                this.f4132h = dVar;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract long a();
    }

    public l(@o0 Context context, @o0 a1.f fVar) {
        super(new c(context, fVar, f4121j));
    }

    @o0
    @Deprecated
    public l k(@q0 Handler handler) {
        if (handler == null) {
            return this;
        }
        l(androidx.emoji2.text.c.b(handler));
        return this;
    }

    @o0
    public l l(@o0 Executor executor) {
        ((c) a()).g(executor);
        return this;
    }

    @o0
    public l m(@q0 d dVar) {
        ((c) a()).h(dVar);
        return this;
    }

    @b1({b1.a.LIBRARY})
    public l(@o0 Context context, @o0 a1.f fVar, @o0 b bVar) {
        super(new c(context, fVar, bVar));
    }
}
