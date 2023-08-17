package h1;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import d.b1;
import d.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public final class b {
    public static final int A = 128;
    public static final int B = 256;
    public static final int C = 512;
    public static final int D = -1;
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f10138a = 128;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final int f10139b = 256;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f10140c = 512;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final int f10141d = 1024;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final int f10142e = 2048;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public static final int f10143f = 4096;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public static final int f10144g = 8192;

    /* renamed from: h  reason: collision with root package name */
    public static final int f10145h = 16384;

    /* renamed from: i  reason: collision with root package name */
    public static final int f10146i = 32768;

    /* renamed from: j  reason: collision with root package name */
    public static final int f10147j = 65536;

    /* renamed from: k  reason: collision with root package name */
    public static final int f10148k = 131072;

    /* renamed from: l  reason: collision with root package name */
    public static final int f10149l = 262144;

    /* renamed from: m  reason: collision with root package name */
    public static final int f10150m = 524288;

    /* renamed from: n  reason: collision with root package name */
    public static final int f10151n = 1048576;

    /* renamed from: o  reason: collision with root package name */
    public static final int f10152o = 2097152;

    /* renamed from: p  reason: collision with root package name */
    public static final int f10153p = 4194304;

    /* renamed from: q  reason: collision with root package name */
    public static final int f10154q = 8388608;

    /* renamed from: r  reason: collision with root package name */
    public static final int f10155r = 16777216;

    /* renamed from: s  reason: collision with root package name */
    public static final int f10156s = 0;

    /* renamed from: t  reason: collision with root package name */
    public static final int f10157t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f10158u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final int f10159v = 4;

    /* renamed from: w  reason: collision with root package name */
    public static final int f10160w = 8;

    /* renamed from: x  reason: collision with root package name */
    public static final int f10161x = 16;

    /* renamed from: y  reason: collision with root package name */
    public static final int f10162y = 32;

    /* renamed from: z  reason: collision with root package name */
    public static final int f10163z = 64;

    @w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @d.u
        public static int b(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @d.u
        public static void c(AccessibilityEvent accessibilityEvent, int i7) {
            accessibilityEvent.setAction(i7);
        }

        @d.u
        public static void d(AccessibilityEvent accessibilityEvent, int i7) {
            accessibilityEvent.setMovementGranularity(i7);
        }
    }

    @w0(19)
    /* renamed from: h1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0115b {
        @d.u
        public static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @d.u
        public static void b(AccessibilityEvent accessibilityEvent, int i7) {
            accessibilityEvent.setContentChangeTypes(i7);
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, p0 p0Var) {
        accessibilityEvent.appendRecord((AccessibilityRecord) p0Var.g());
    }

    @Deprecated
    public static p0 b(AccessibilityEvent accessibilityEvent) {
        return new p0(accessibilityEvent);
    }

    public static int c(@d.o0 AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static int d(@d.o0 AccessibilityEvent accessibilityEvent) {
        return C0115b.a(accessibilityEvent);
    }

    public static int e(@d.o0 AccessibilityEvent accessibilityEvent) {
        return a.b(accessibilityEvent);
    }

    @Deprecated
    public static p0 f(AccessibilityEvent accessibilityEvent, int i7) {
        return new p0(accessibilityEvent.getRecord(i7));
    }

    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static void h(@d.o0 AccessibilityEvent accessibilityEvent, int i7) {
        a.c(accessibilityEvent, i7);
    }

    public static void i(@d.o0 AccessibilityEvent accessibilityEvent, int i7) {
        C0115b.b(accessibilityEvent, i7);
    }

    public static void j(@d.o0 AccessibilityEvent accessibilityEvent, int i7) {
        a.d(accessibilityEvent, i7);
    }
}
