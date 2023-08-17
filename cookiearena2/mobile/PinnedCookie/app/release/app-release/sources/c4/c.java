package c4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import k4.f;
import n6.e;
import s2.t0;
import s4.h;
import t4.l;
import u4.l0;
import u4.r1;
import v3.a1;
import v3.m2;
@h(name = "TimersKt")
/* loaded from: classes.dex */
public final class c {

    @r1({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a extends TimerTask {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ l<TimerTask, m2> f7970k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super TimerTask, m2> lVar) {
            this.f7970k = lVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f7970k.O(this);
        }
    }

    @f
    public static final Timer a(String str, boolean z6, long j7, long j8, l<? super TimerTask, m2> lVar) {
        l0.p(lVar, t0.f16450f);
        Timer k7 = k(str, z6);
        k7.scheduleAtFixedRate(new a(lVar), j7, j8);
        return k7;
    }

    @f
    public static final Timer b(String str, boolean z6, Date date, long j7, l<? super TimerTask, m2> lVar) {
        l0.p(date, "startAt");
        l0.p(lVar, t0.f16450f);
        Timer k7 = k(str, z6);
        k7.scheduleAtFixedRate(new a(lVar), date, j7);
        return k7;
    }

    public static /* synthetic */ Timer c(String str, boolean z6, long j7, long j8, l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if ((i7 & 4) != 0) {
            j7 = 0;
        }
        l0.p(lVar, t0.f16450f);
        Timer k7 = k(str, z6);
        k7.scheduleAtFixedRate(new a(lVar), j7, j8);
        return k7;
    }

    public static /* synthetic */ Timer d(String str, boolean z6, Date date, long j7, l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        l0.p(date, "startAt");
        l0.p(lVar, t0.f16450f);
        Timer k7 = k(str, z6);
        k7.scheduleAtFixedRate(new a(lVar), date, j7);
        return k7;
    }

    @f
    public static final TimerTask e(Timer timer, long j7, long j8, l<? super TimerTask, m2> lVar) {
        l0.p(timer, "<this>");
        l0.p(lVar, t0.f16450f);
        a aVar = new a(lVar);
        timer.schedule(aVar, j7, j8);
        return aVar;
    }

    @f
    public static final TimerTask f(Timer timer, long j7, l<? super TimerTask, m2> lVar) {
        l0.p(timer, "<this>");
        l0.p(lVar, t0.f16450f);
        a aVar = new a(lVar);
        timer.schedule(aVar, j7);
        return aVar;
    }

    @f
    public static final TimerTask g(Timer timer, Date date, long j7, l<? super TimerTask, m2> lVar) {
        l0.p(timer, "<this>");
        l0.p(date, "time");
        l0.p(lVar, t0.f16450f);
        a aVar = new a(lVar);
        timer.schedule(aVar, date, j7);
        return aVar;
    }

    @f
    public static final TimerTask h(Timer timer, Date date, l<? super TimerTask, m2> lVar) {
        l0.p(timer, "<this>");
        l0.p(date, "time");
        l0.p(lVar, t0.f16450f);
        a aVar = new a(lVar);
        timer.schedule(aVar, date);
        return aVar;
    }

    @f
    public static final TimerTask i(Timer timer, long j7, long j8, l<? super TimerTask, m2> lVar) {
        l0.p(timer, "<this>");
        l0.p(lVar, t0.f16450f);
        a aVar = new a(lVar);
        timer.scheduleAtFixedRate(aVar, j7, j8);
        return aVar;
    }

    @f
    public static final TimerTask j(Timer timer, Date date, long j7, l<? super TimerTask, m2> lVar) {
        l0.p(timer, "<this>");
        l0.p(date, "time");
        l0.p(lVar, t0.f16450f);
        a aVar = new a(lVar);
        timer.scheduleAtFixedRate(aVar, date, j7);
        return aVar;
    }

    @n6.d
    @a1
    public static final Timer k(@e String str, boolean z6) {
        return str == null ? new Timer(z6) : new Timer(str, z6);
    }

    @f
    public static final Timer l(String str, boolean z6, long j7, long j8, l<? super TimerTask, m2> lVar) {
        l0.p(lVar, t0.f16450f);
        Timer k7 = k(str, z6);
        k7.schedule(new a(lVar), j7, j8);
        return k7;
    }

    @f
    public static final Timer m(String str, boolean z6, Date date, long j7, l<? super TimerTask, m2> lVar) {
        l0.p(date, "startAt");
        l0.p(lVar, t0.f16450f);
        Timer k7 = k(str, z6);
        k7.schedule(new a(lVar), date, j7);
        return k7;
    }

    public static /* synthetic */ Timer n(String str, boolean z6, long j7, long j8, l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if ((i7 & 4) != 0) {
            j7 = 0;
        }
        l0.p(lVar, t0.f16450f);
        Timer k7 = k(str, z6);
        k7.schedule(new a(lVar), j7, j8);
        return k7;
    }

    public static /* synthetic */ Timer o(String str, boolean z6, Date date, long j7, l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        l0.p(date, "startAt");
        l0.p(lVar, t0.f16450f);
        Timer k7 = k(str, z6);
        k7.schedule(new a(lVar), date, j7);
        return k7;
    }

    @f
    public static final TimerTask p(l<? super TimerTask, m2> lVar) {
        l0.p(lVar, t0.f16450f);
        return new a(lVar);
    }
}
