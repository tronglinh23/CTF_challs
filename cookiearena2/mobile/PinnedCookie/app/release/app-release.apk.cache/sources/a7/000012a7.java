package j3;

import android.annotation.SuppressLint;
import android.os.Trace;
import d.o0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11419a = "Trace";

    /* renamed from: b  reason: collision with root package name */
    public static long f11420b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f11421c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f11422d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f11423e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f11424f;

    @SuppressLint({"NewApi"})
    public static void a(@o0 String str, int i7) {
        try {
            if (f11422d == null) {
                d.a(str, i7);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i7);
    }

    public static void b(@o0 String str, int i7) {
        try {
            if (f11422d == null) {
                f11422d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f11422d.invoke(null, Long.valueOf(f11420b), str, Integer.valueOf(i7));
        } catch (Exception e7) {
            g("asyncTraceBegin", e7);
        }
    }

    public static void c(@o0 String str) {
        c.a(str);
    }

    @SuppressLint({"NewApi"})
    public static void d(@o0 String str, int i7) {
        try {
            if (f11423e == null) {
                d.b(str, i7);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i7);
    }

    public static void e(@o0 String str, int i7) {
        try {
            if (f11423e == null) {
                f11423e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f11423e.invoke(null, Long.valueOf(f11420b), str, Integer.valueOf(i7));
        } catch (Exception e7) {
            g("asyncTraceEnd", e7);
        }
    }

    public static void f() {
        c.b();
    }

    public static void g(@o0 String str, @o0 Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        boolean isEnabled;
        try {
            if (f11421c == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    public static boolean i() {
        try {
            if (f11421c == null) {
                f11420b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f11421c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f11421c.invoke(null, Long.valueOf(f11420b))).booleanValue();
        } catch (Exception e7) {
            g("isTagEnabled", e7);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void j(@o0 String str, int i7) {
        try {
            if (f11424f == null) {
                d.c(str, i7);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        k(str, i7);
    }

    public static void k(@o0 String str, int i7) {
        try {
            if (f11424f == null) {
                f11424f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f11424f.invoke(null, Long.valueOf(f11420b), str, Integer.valueOf(i7));
        } catch (Exception e7) {
            g("traceCounter", e7);
        }
    }
}