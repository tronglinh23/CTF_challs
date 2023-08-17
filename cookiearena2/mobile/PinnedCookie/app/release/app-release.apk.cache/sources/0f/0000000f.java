package a1;

import a1.g;
import a1.h;
import android.graphics.Typeface;
import android.os.Handler;
import d.o0;

/* loaded from: classes.dex */
public class a {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final h.d f67a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final Handler f68b;

    /* renamed from: a1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0002a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ h.d f69k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Typeface f70l;

        public RunnableC0002a(h.d dVar, Typeface typeface) {
            this.f69k = dVar;
            this.f70l = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f69k.b(this.f70l);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ h.d f72k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f73l;

        public b(h.d dVar, int i7) {
            this.f72k = dVar;
            this.f73l = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f72k.a(this.f73l);
        }
    }

    public a(@o0 h.d dVar, @o0 Handler handler) {
        this.f67a = dVar;
        this.f68b = handler;
    }

    public final void a(int i7) {
        this.f68b.post(new b(this.f67a, i7));
    }

    public void b(@o0 g.e eVar) {
        if (eVar.a()) {
            c(eVar.f98a);
        } else {
            a(eVar.f99b);
        }
    }

    public final void c(@o0 Typeface typeface) {
        this.f68b.post(new RunnableC0002a(this.f67a, typeface));
    }

    public a(@o0 h.d dVar) {
        this.f67a = dVar;
        this.f68b = a1.b.a();
    }
}