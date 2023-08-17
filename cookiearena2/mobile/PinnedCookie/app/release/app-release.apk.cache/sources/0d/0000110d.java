package i0;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public final class k {

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(AlarmManager alarmManager, int i7, long j7, PendingIntent pendingIntent) {
            alarmManager.setExact(i7, j7, pendingIntent);
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static AlarmManager.AlarmClockInfo a(long j7, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j7, pendingIntent);
        }

        @d.u
        public static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static void a(AlarmManager alarmManager, int i7, long j7, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i7, j7, pendingIntent);
        }

        @d.u
        public static void b(AlarmManager alarmManager, int i7, long j7, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i7, j7, pendingIntent);
        }
    }

    @SuppressLint({"MissingPermission"})
    public static void a(@d.o0 AlarmManager alarmManager, long j7, @d.o0 PendingIntent pendingIntent, @d.o0 PendingIntent pendingIntent2) {
        b.b(alarmManager, b.a(j7, pendingIntent), pendingIntent2);
    }

    public static void b(@d.o0 AlarmManager alarmManager, int i7, long j7, @d.o0 PendingIntent pendingIntent) {
        c.a(alarmManager, i7, j7, pendingIntent);
    }

    public static void c(@d.o0 AlarmManager alarmManager, int i7, long j7, @d.o0 PendingIntent pendingIntent) {
        a.a(alarmManager, i7, j7, pendingIntent);
    }

    public static void d(@d.o0 AlarmManager alarmManager, int i7, long j7, @d.o0 PendingIntent pendingIntent) {
        c.b(alarmManager, i7, j7, pendingIntent);
    }
}