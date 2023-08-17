package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import d.b1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1747a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1748b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f1749c = new Rect();

    @d.w0(18)
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f1750a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f1751b;

        /* renamed from: c  reason: collision with root package name */
        public static final Field f1752c;

        /* renamed from: d  reason: collision with root package name */
        public static final Field f1753d;

        /* renamed from: e  reason: collision with root package name */
        public static final Field f1754e;

        /* renamed from: f  reason: collision with root package name */
        public static final Field f1755f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L35 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L39
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L47
                r8 = r0
                goto L49
            L2d:
                r7 = r1
                goto L47
            L2f:
                r6 = r1
                goto L46
            L31:
                r6 = r1
                goto L46
            L33:
                r6 = r1
                goto L46
            L35:
                r5 = r1
                goto L3d
            L37:
                r5 = r1
                goto L41
            L39:
                r5 = r1
                goto L45
            L3b:
                r4 = r1
                r5 = r4
            L3d:
                r6 = r5
                goto L46
            L3f:
                r4 = r1
                r5 = r4
            L41:
                r6 = r5
                goto L46
            L43:
                r4 = r1
                r5 = r4
            L45:
                r6 = r5
            L46:
                r7 = r6
            L47:
                r3 = r1
                r8 = r2
            L49:
                if (r8 == 0) goto L58
                androidx.appcompat.widget.q0.a.f1751b = r4
                androidx.appcompat.widget.q0.a.f1752c = r5
                androidx.appcompat.widget.q0.a.f1753d = r6
                androidx.appcompat.widget.q0.a.f1754e = r7
                androidx.appcompat.widget.q0.a.f1755f = r3
                androidx.appcompat.widget.q0.a.f1750a = r0
                goto L64
            L58:
                androidx.appcompat.widget.q0.a.f1751b = r1
                androidx.appcompat.widget.q0.a.f1752c = r1
                androidx.appcompat.widget.q0.a.f1753d = r1
                androidx.appcompat.widget.q0.a.f1754e = r1
                androidx.appcompat.widget.q0.a.f1755f = r1
                androidx.appcompat.widget.q0.a.f1750a = r2
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q0.a.<clinit>():void");
        }

        @d.o0
        public static Rect a(@d.o0 Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f1750a) {
                try {
                    Object invoke = f1751b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f1752c.getInt(invoke), f1753d.getInt(invoke), f1754e.getInt(invoke), f1755f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return q0.f1749c;
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static Insets a(Drawable drawable) {
            Insets opticalInsets;
            opticalInsets = drawable.getOpticalInsets();
            return opticalInsets;
        }
    }

    public static boolean a(@d.o0 Drawable drawable) {
        return true;
    }

    public static void b(@d.o0 Drawable drawable) {
        String name = drawable.getClass().getName();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 29 || i7 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1747a);
        } else {
            drawable.setState(f1748b);
        }
        drawable.setState(state);
    }

    @d.o0
    public static Rect d(@d.o0 Drawable drawable) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets a7 = b.a(drawable);
            i7 = a7.left;
            i8 = a7.top;
            i9 = a7.right;
            i10 = a7.bottom;
            return new Rect(i7, i8, i9, i10);
        }
        return a.a(q0.c.q(drawable));
    }

    public static PorterDuff.Mode e(int i7, PorterDuff.Mode mode) {
        if (i7 != 3) {
            if (i7 != 5) {
                if (i7 != 9) {
                    switch (i7) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}