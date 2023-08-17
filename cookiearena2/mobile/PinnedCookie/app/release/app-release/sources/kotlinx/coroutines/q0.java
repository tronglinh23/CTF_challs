package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import v3.d1;
/* loaded from: classes.dex */
public final class q0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final List<p0> f12930a = f5.u.c3(f5.s.e(ServiceLoader.load(p0.class, p0.class.getClassLoader()).iterator()));

    public static final void a(@n6.d e4.g gVar, @n6.d Throwable th) {
        Iterator<p0> it = f12930a.iterator();
        while (it.hasNext()) {
            try {
                it.next().I0(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, r0.c(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            d1.a aVar = v3.d1.f17778l;
            v3.p.a(th, new h1(gVar));
            v3.d1.b(v3.m2.f17815a);
        } catch (Throwable th3) {
            d1.a aVar2 = v3.d1.f17778l;
            v3.d1.b(v3.e1.a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
