package z0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f19045a = "TraceCompat";

    /* renamed from: b  reason: collision with root package name */
    public static long f19046b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f19047c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f19048d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f19049e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f19050f;

    @d.w0(18)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(String str) {
            Trace.beginSection(str);
        }

        @d.u
        public static void b() {
            Trace.endSection();
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static void a(String str, int i7) {
            Trace.beginAsyncSection(str, i7);
        }

        @d.u
        public static void b(String str, int i7) {
            Trace.endAsyncSection(str, i7);
        }

        @d.u
        public static boolean c() {
            boolean isEnabled;
            isEnabled = Trace.isEnabled();
            return isEnabled;
        }

        @d.u
        public static void d(String str, long j7) {
            Trace.setCounter(str, j7);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f19046b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f19047c = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f19048d = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f19049e = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f19050f = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e7) {
                Log.i(f19045a, "Unable to initialize via reflection.", e7);
            }
        }
    }

    public static void a(@d.o0 String str, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(str, i7);
            return;
        }
        try {
            f19048d.invoke(null, Long.valueOf(f19046b), str, Integer.valueOf(i7));
        } catch (Exception unused) {
        }
    }

    public static void b(@d.o0 String str) {
        a.a(str);
    }

    public static void c(@d.o0 String str, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.b(str, i7);
            return;
        }
        try {
            f19049e.invoke(null, Long.valueOf(f19046b), str, Integer.valueOf(i7));
        } catch (Exception unused) {
        }
    }

    public static void d() {
        a.b();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.c();
        }
        try {
            return ((Boolean) f19047c.invoke(null, Long.valueOf(f19046b))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void f(@d.o0 String str, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.d(str, i7);
            return;
        }
        try {
            f19050f.invoke(null, Long.valueOf(f19046b), str, Integer.valueOf(i7));
        } catch (Exception unused) {
        }
    }
}