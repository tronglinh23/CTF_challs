package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final int f3792a = 3840;

    /* renamed from: b  reason: collision with root package name */
    public static final int f3793b = 2160;

    @d.w0(17)
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class b {
        @d.o0
        public static c a(@d.o0 Context context, @d.o0 Display display) {
            Display.Mode mode = display.getMode();
            Point a7 = u.a(context, display);
            return (a7 == null || d(mode, a7)) ? new c(mode, true) : new c(mode, a7);
        }

        @SuppressLint({"ArrayReturn"})
        @d.o0
        public static c[] b(@d.o0 Context context, @d.o0 Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            c[] cVarArr = new c[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point a7 = u.a(context, display);
            if (a7 == null || d(mode, a7)) {
                for (int i7 = 0; i7 < supportedModes.length; i7++) {
                    cVarArr[i7] = new c(supportedModes[i7], e(supportedModes[i7], mode));
                }
            } else {
                for (int i8 = 0; i8 < supportedModes.length; i8++) {
                    cVarArr[i8] = e(supportedModes[i8], mode) ? new c(supportedModes[i8], a7) : new c(supportedModes[i8], false);
                }
            }
            return cVarArr;
        }

        public static boolean c(@d.o0 Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        public static boolean d(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        public static boolean e(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    public static Point a(@d.o0 Context context, @d.o0 Display display) {
        Point j7 = Build.VERSION.SDK_INT < 28 ? j("sys.display-size", display) : j("vendor.display-size", display);
        if (j7 != null) {
            return j7;
        }
        if (g(context) && f(display)) {
            return new Point(f3792a, f3793b);
        }
        return null;
    }

    @d.o0
    public static Point b(@d.o0 Context context, @d.o0 Display display) {
        Point a7 = a(context, display);
        if (a7 != null) {
            return a7;
        }
        Point point = new Point();
        a.a(display, point);
        return point;
    }

    @d.o0
    public static c c(@d.o0 Context context, @d.o0 Display display) {
        return b.a(context, display);
    }

    @SuppressLint({"ArrayReturn"})
    @d.o0
    public static c[] d(@d.o0 Context context, @d.o0 Display display) {
        return b.b(context, display);
    }

    @d.q0
    public static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean f(@d.o0 Display display) {
        return b.c(display);
    }

    public static boolean g(@d.o0 Context context) {
        return h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    public static boolean h(@d.o0 Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Point i(@d.o0 String str) throws NumberFormatException {
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    @d.q0
    public static Point j(@d.o0 String str, @d.o0 Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String e7 = e(str);
        if (!TextUtils.isEmpty(e7) && e7 != null) {
            try {
                return i(e7);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Display.Mode f3794a;

        /* renamed from: b  reason: collision with root package name */
        public final Point f3795b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3796c;

        @d.w0(23)
        /* loaded from: classes.dex */
        public static class a {
            @d.u
            public static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @d.u
            public static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        public c(@d.o0 Point point) {
            g1.s.m(point, "physicalSize == null");
            this.f3795b = point;
            this.f3794a = null;
            this.f3796c = true;
        }

        public int a() {
            return this.f3795b.y;
        }

        public int b() {
            return this.f3795b.x;
        }

        @Deprecated
        public boolean c() {
            return this.f3796c;
        }

        @d.q0
        @d.w0(23)
        public Display.Mode d() {
            return this.f3794a;
        }

        @d.w0(23)
        public c(@d.o0 Display.Mode mode, boolean z6) {
            g1.s.m(mode, "mode == null, can't wrap a null reference");
            this.f3795b = new Point(a.b(mode), a.a(mode));
            this.f3794a = mode;
            this.f3796c = z6;
        }

        @d.w0(23)
        public c(@d.o0 Display.Mode mode, @d.o0 Point point) {
            g1.s.m(mode, "mode == null, can't wrap a null reference");
            g1.s.m(point, "physicalSize == null");
            this.f3795b = point;
            this.f3794a = mode;
            this.f3796c = true;
        }
    }
}
