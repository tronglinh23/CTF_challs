package z0;

import android.os.Handler;
import u4.r1;
import v3.m2;
/* loaded from: classes.dex */
public final class s {

    @r1({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postAtTime$runnable$1\n*L\n1#1,69:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.a<m2> f19026k;

        public a(t4.a<m2> aVar) {
            this.f19026k = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f19026k.n();
        }
    }

    @r1({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postDelayed$runnable$1\n*L\n1#1,69:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.a<m2> f19027k;

        public b(t4.a<m2> aVar) {
            this.f19027k = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f19027k.n();
        }
    }

    @n6.d
    public static final Runnable a(@n6.d Handler handler, long j7, @n6.e Object obj, @n6.d t4.a<m2> aVar) {
        u4.l0.p(handler, "<this>");
        u4.l0.p(aVar, s2.t0.f16450f);
        a aVar2 = new a(aVar);
        handler.postAtTime(aVar2, obj, j7);
        return aVar2;
    }

    public static /* synthetic */ Runnable b(Handler handler, long j7, Object obj, t4.a aVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            obj = null;
        }
        u4.l0.p(handler, "<this>");
        u4.l0.p(aVar, s2.t0.f16450f);
        a aVar2 = new a(aVar);
        handler.postAtTime(aVar2, obj, j7);
        return aVar2;
    }

    @n6.d
    public static final Runnable c(@n6.d Handler handler, long j7, @n6.e Object obj, @n6.d t4.a<m2> aVar) {
        u4.l0.p(handler, "<this>");
        u4.l0.p(aVar, s2.t0.f16450f);
        b bVar = new b(aVar);
        if (obj == null) {
            handler.postDelayed(bVar, j7);
        } else {
            q.d(handler, bVar, obj, j7);
        }
        return bVar;
    }

    public static /* synthetic */ Runnable d(Handler handler, long j7, Object obj, t4.a aVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            obj = null;
        }
        u4.l0.p(handler, "<this>");
        u4.l0.p(aVar, s2.t0.f16450f);
        b bVar = new b(aVar);
        if (obj == null) {
            handler.postDelayed(bVar, j7);
        } else {
            q.d(handler, bVar, obj, j7);
        }
        return bVar;
    }
}
