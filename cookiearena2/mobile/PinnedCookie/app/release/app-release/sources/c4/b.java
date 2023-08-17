package c4;

import k4.f;
import n6.e;
import s4.h;
import u4.l0;
import u4.r1;
import v3.m2;
@h(name = "ThreadsKt")
@r1({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends Thread {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t4.a<m2> f7969k;

        public a(t4.a<m2> aVar) {
            this.f7969k = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f7969k.n();
        }
    }

    @f
    public static final <T> T a(ThreadLocal<T> threadLocal, t4.a<? extends T> aVar) {
        l0.p(threadLocal, "<this>");
        l0.p(aVar, "default");
        T t6 = threadLocal.get();
        if (t6 == null) {
            T n7 = aVar.n();
            threadLocal.set(n7);
            return n7;
        }
        return t6;
    }

    @n6.d
    public static final Thread b(boolean z6, boolean z7, @e ClassLoader classLoader, @e String str, int i7, @n6.d t4.a<m2> aVar) {
        l0.p(aVar, "block");
        a aVar2 = new a(aVar);
        if (z7) {
            aVar2.setDaemon(true);
        }
        if (i7 > 0) {
            aVar2.setPriority(i7);
        }
        if (str != null) {
            aVar2.setName(str);
        }
        if (classLoader != null) {
            aVar2.setContextClassLoader(classLoader);
        }
        if (z6) {
            aVar2.start();
        }
        return aVar2;
    }

    public static /* synthetic */ Thread c(boolean z6, boolean z7, ClassLoader classLoader, String str, int i7, t4.a aVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z6 = true;
        }
        boolean z8 = z6;
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        boolean z9 = z7;
        ClassLoader classLoader2 = (i8 & 4) != 0 ? null : classLoader;
        String str2 = (i8 & 8) != 0 ? null : str;
        if ((i8 & 16) != 0) {
            i7 = -1;
        }
        return b(z8, z9, classLoader2, str2, i7, aVar);
    }
}
