package k1;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import d.o0;
import d.q0;
import d.w0;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final EdgeEffect f11588a;

    @w0(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @d.u
        public static void a(EdgeEffect edgeEffect, float f7, float f8) {
            edgeEffect.onPull(f7, f8);
        }
    }

    @w0(31)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @d.u
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                n.a();
                return m.a(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @d.u
        public static float b(EdgeEffect edgeEffect) {
            float distance;
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @d.u
        public static float c(EdgeEffect edgeEffect, float f7, float f8) {
            float onPullDistance;
            try {
                onPullDistance = edgeEffect.onPullDistance(f7, f8);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f7, f8);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public j(Context context) {
        this.f11588a = new EdgeEffect(context);
    }

    @o0
    public static EdgeEffect a(@o0 Context context, @q0 AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
    }

    public static float d(@o0 EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void g(@o0 EdgeEffect edgeEffect, float f7, float f8) {
        a.a(edgeEffect, f7, f8);
    }

    public static float j(@o0 EdgeEffect edgeEffect, float f7, float f8) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f7, f8);
        }
        g(edgeEffect, f7, f8);
        return f7;
    }

    @Deprecated
    public boolean b(Canvas canvas) {
        return this.f11588a.draw(canvas);
    }

    @Deprecated
    public void c() {
        this.f11588a.finish();
    }

    @Deprecated
    public boolean e() {
        return this.f11588a.isFinished();
    }

    @Deprecated
    public boolean f(int i7) {
        this.f11588a.onAbsorb(i7);
        return true;
    }

    @Deprecated
    public boolean h(float f7) {
        this.f11588a.onPull(f7);
        return true;
    }

    @Deprecated
    public boolean i(float f7, float f8) {
        g(this.f11588a, f7, f8);
        return true;
    }

    @Deprecated
    public boolean k() {
        this.f11588a.onRelease();
        return this.f11588a.isFinished();
    }

    @Deprecated
    public void l(int i7, int i8) {
        this.f11588a.setSize(i7, i8);
    }
}
