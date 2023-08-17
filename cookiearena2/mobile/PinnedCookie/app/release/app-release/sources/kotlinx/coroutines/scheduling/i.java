package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.z1;
import u4.w;
/* loaded from: classes.dex */
public class i extends z1 {

    /* renamed from: n  reason: collision with root package name */
    public final int f12993n;

    /* renamed from: o  reason: collision with root package name */
    public final int f12994o;

    /* renamed from: p  reason: collision with root package name */
    public final long f12995p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public final String f12996q;
    @n6.d

    /* renamed from: r  reason: collision with root package name */
    public a f12997r;

    public i() {
        this(0, 0, 0L, null, 15, null);
    }

    @Override // kotlinx.coroutines.o0
    public void V0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        a.p(this.f12997r, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.o0
    public void W0(@n6.d e4.g gVar, @n6.d Runnable runnable) {
        a.p(this.f12997r, runnable, null, true, 2, null);
    }

    @Override // kotlinx.coroutines.z1
    @n6.d
    public Executor a1() {
        return this.f12997r;
    }

    public final a b1() {
        return new a(this.f12993n, this.f12994o, this.f12995p, this.f12996q);
    }

    public final void c1(@n6.d Runnable runnable, @n6.d l lVar, boolean z6) {
        this.f12997r.m(runnable, lVar, z6);
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12997r.close();
    }

    public final void d1() {
        f1();
    }

    public final synchronized void e1(long j7) {
        this.f12997r.X(j7);
    }

    public final synchronized void f1() {
        this.f12997r.X(1000L);
        this.f12997r = b1();
    }

    public /* synthetic */ i(int i7, int i8, long j7, String str, int i9, w wVar) {
        this((i9 & 1) != 0 ? o.f13004c : i7, (i9 & 2) != 0 ? o.f13005d : i8, (i9 & 4) != 0 ? o.f13006e : j7, (i9 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public i(int i7, int i8, long j7, @n6.d String str) {
        this.f12993n = i7;
        this.f12994o = i8;
        this.f12995p = j7;
        this.f12996q = str;
        this.f12997r = b1();
    }
}
