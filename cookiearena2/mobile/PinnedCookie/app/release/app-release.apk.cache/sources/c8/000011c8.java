package i0;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class w2 {

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        @d.o0
        public static PendingIntent a(@d.o0 Context context, int i7, @SuppressLint({"ArrayReturn"}) @d.o0 Intent[] intentArr, int i8, @d.o0 Bundle bundle) {
            return PendingIntent.getActivities(context, i7, intentArr, i8, bundle);
        }

        @d.u
        @d.o0
        public static PendingIntent b(@d.o0 Context context, int i7, @d.o0 Intent intent, int i8, @d.o0 Bundle bundle) {
            return PendingIntent.getActivity(context, i7, intent, i8, bundle);
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static PendingIntent a(Context context, int i7, Intent intent, int i8) {
            return PendingIntent.getForegroundService(context, i7, intent, i8);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public static int a(boolean z6, int i7) {
        int i8;
        if (!z6) {
            i8 = 67108864;
        } else if (Build.VERSION.SDK_INT < 31) {
            return i7;
        } else {
            i8 = 33554432;
        }
        return i7 | i8;
    }

    @d.o0
    public static PendingIntent b(@d.o0 Context context, int i7, @SuppressLint({"ArrayReturn"}) @d.o0 Intent[] intentArr, int i8, @d.o0 Bundle bundle, boolean z6) {
        return a.a(context, i7, intentArr, a(z6, i8), bundle);
    }

    @d.o0
    public static PendingIntent c(@d.o0 Context context, int i7, @SuppressLint({"ArrayReturn"}) @d.o0 Intent[] intentArr, int i8, boolean z6) {
        return PendingIntent.getActivities(context, i7, intentArr, a(z6, i8));
    }

    @d.o0
    public static PendingIntent d(@d.o0 Context context, int i7, @d.o0 Intent intent, int i8, @d.o0 Bundle bundle, boolean z6) {
        return a.b(context, i7, intent, a(z6, i8), bundle);
    }

    @d.o0
    public static PendingIntent e(@d.o0 Context context, int i7, @d.o0 Intent intent, int i8, boolean z6) {
        return PendingIntent.getActivity(context, i7, intent, a(z6, i8));
    }

    @d.o0
    public static PendingIntent f(@d.o0 Context context, int i7, @d.o0 Intent intent, int i8, boolean z6) {
        return PendingIntent.getBroadcast(context, i7, intent, a(z6, i8));
    }

    @d.o0
    @d.w0(26)
    public static PendingIntent g(@d.o0 Context context, int i7, @d.o0 Intent intent, int i8, boolean z6) {
        return b.a(context, i7, intent, a(z6, i8));
    }

    @d.o0
    public static PendingIntent h(@d.o0 Context context, int i7, @d.o0 Intent intent, int i8, boolean z6) {
        return PendingIntent.getService(context, i7, intent, a(z6, i8));
    }
}