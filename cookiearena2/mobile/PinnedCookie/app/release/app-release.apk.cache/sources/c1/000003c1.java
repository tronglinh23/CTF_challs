package androidx.core.view;

import android.view.ScaleGestureDetector;

/* loaded from: classes.dex */
public final class p1 {

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static boolean a(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @d.u
        public static void b(ScaleGestureDetector scaleGestureDetector, boolean z6) {
            scaleGestureDetector.setQuickScaleEnabled(z6);
        }
    }

    public static boolean a(@d.o0 ScaleGestureDetector scaleGestureDetector) {
        return a.a(scaleGestureDetector);
    }

    @Deprecated
    public static boolean b(Object obj) {
        return a((ScaleGestureDetector) obj);
    }

    public static void c(@d.o0 ScaleGestureDetector scaleGestureDetector, boolean z6) {
        a.b(scaleGestureDetector, z6);
    }

    @Deprecated
    public static void d(Object obj, boolean z6) {
        c((ScaleGestureDetector) obj, z6);
    }
}