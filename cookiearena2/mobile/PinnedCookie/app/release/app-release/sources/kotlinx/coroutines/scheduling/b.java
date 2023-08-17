package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.scheduling.a;
/* loaded from: classes.dex */
public final class b {
    @s4.h(name = "isSchedulerWorker")
    public static final boolean a(@n6.d Thread thread) {
        return thread instanceof a.c;
    }

    @s4.h(name = "mayNotBlock")
    public static final boolean b(@n6.d Thread thread) {
        return (thread instanceof a.c) && ((a.c) thread).f12966l == a.d.CPU_ACQUIRED;
    }
}
