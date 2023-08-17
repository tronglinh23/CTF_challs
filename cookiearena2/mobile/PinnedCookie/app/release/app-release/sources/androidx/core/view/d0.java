package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f3557a;

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            c0.a();
            return b0.a(rect, list);
        }

        @d.u
        public static List<Rect> b(DisplayCutout displayCutout) {
            List<Rect> boundingRects;
            boundingRects = displayCutout.getBoundingRects();
            return boundingRects;
        }

        @d.u
        public static int c(DisplayCutout displayCutout) {
            int safeInsetBottom;
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            return safeInsetBottom;
        }

        @d.u
        public static int d(DisplayCutout displayCutout) {
            int safeInsetLeft;
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            return safeInsetLeft;
        }

        @d.u
        public static int e(DisplayCutout displayCutout) {
            int safeInsetRight;
            safeInsetRight = displayCutout.getSafeInsetRight();
            return safeInsetRight;
        }

        @d.u
        public static int f(DisplayCutout displayCutout) {
            int safeInsetTop;
            safeInsetTop = displayCutout.getSafeInsetTop();
            return safeInsetTop;
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            c0.a();
            return e0.a(insets, rect, rect2, rect3, rect4);
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            c0.a();
            return g0.a(insets, rect, rect2, rect3, rect4, insets2);
        }

        @d.u
        public static Insets b(DisplayCutout displayCutout) {
            Insets waterfallInsets;
            waterfallInsets = displayCutout.getWaterfallInsets();
            return waterfallInsets;
        }
    }

    public d0(@d.q0 Rect rect, @d.q0 List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? a.a(rect, list) : null);
    }

    public static DisplayCutout a(@d.o0 p0.v0 v0Var, @d.q0 Rect rect, @d.q0 Rect rect2, @d.q0 Rect rect3, @d.q0 Rect rect4, @d.o0 p0.v0 v0Var2) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            return c.a(v0Var.h(), rect, rect2, rect3, rect4, v0Var2.h());
        }
        if (i7 >= 29) {
            return b.a(v0Var.h(), rect, rect2, rect3, rect4);
        }
        if (i7 >= 28) {
            Rect rect5 = new Rect(v0Var.f14585a, v0Var.f14586b, v0Var.f14587c, v0Var.f14588d);
            ArrayList arrayList = new ArrayList();
            if (rect != null) {
                arrayList.add(rect);
            }
            if (rect2 != null) {
                arrayList.add(rect2);
            }
            if (rect3 != null) {
                arrayList.add(rect3);
            }
            if (rect4 != null) {
                arrayList.add(rect4);
            }
            return a.a(rect5, arrayList);
        }
        return null;
    }

    public static d0 i(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new d0(displayCutout);
    }

    @d.o0
    public List<Rect> b() {
        return Build.VERSION.SDK_INT >= 28 ? a.b(this.f3557a) : Collections.emptyList();
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f3557a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f3557a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f3557a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        return g1.n.a(this.f3557a, ((d0) obj).f3557a);
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f3557a);
        }
        return 0;
    }

    @d.o0
    public p0.v0 g() {
        return Build.VERSION.SDK_INT >= 30 ? p0.v0.g(c.b(this.f3557a)) : p0.v0.f14584e;
    }

    @d.w0(28)
    public DisplayCutout h() {
        return this.f3557a;
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f3557a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    @d.o0
    public String toString() {
        return "DisplayCutoutCompat{" + this.f3557a + "}";
    }

    public d0(@d.o0 p0.v0 v0Var, @d.q0 Rect rect, @d.q0 Rect rect2, @d.q0 Rect rect3, @d.q0 Rect rect4, @d.o0 p0.v0 v0Var2) {
        this(a(v0Var, rect, rect2, rect3, rect4, v0Var2));
    }

    public d0(DisplayCutout displayCutout) {
        this.f3557a = displayCutout;
    }
}
