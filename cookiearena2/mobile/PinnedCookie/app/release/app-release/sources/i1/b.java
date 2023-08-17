package i1;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import d.o0;
import d.u;
import d.w0;
/* loaded from: classes.dex */
public final class b {

    @w0(21)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static PathInterpolator a(float f7, float f8) {
            return new PathInterpolator(f7, f8);
        }

        @u
        public static PathInterpolator b(float f7, float f8, float f9, float f10) {
            return new PathInterpolator(f7, f8, f9, f10);
        }

        @u
        public static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    @o0
    public static Interpolator a(float f7, float f8) {
        return a.a(f7, f8);
    }

    @o0
    public static Interpolator b(float f7, float f8, float f9, float f10) {
        return a.b(f7, f8, f9, f10);
    }

    @o0
    public static Interpolator c(@o0 Path path) {
        return a.c(path);
    }
}
