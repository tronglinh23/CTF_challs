package h1;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import d.w0;
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f10248b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10249c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f10250d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f10251e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f10252f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f10253g = 5;

    /* renamed from: a  reason: collision with root package name */
    public final Object f10254a;

    @w0(21)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @d.u
        public static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo, int i7) {
            return accessibilityWindowInfo.getChild(i7);
        }

        @d.u
        public static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @d.u
        public static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @d.u
        public static int e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @d.u
        public static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @d.u
        public static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @d.u
        public static int h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @d.u
        public static boolean i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @d.u
        public static boolean j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @d.u
        public static boolean k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @d.u
        public static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        @d.u
        public static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    @w0(24)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @d.u
        public static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    @w0(33)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static int a(AccessibilityWindowInfo accessibilityWindowInfo) {
            int displayId;
            displayId = accessibilityWindowInfo.getDisplayId();
            return displayId;
        }

        @d.u
        public static void b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @d.u
        public static boolean c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    public r0(Object obj) {
        this.f10254a = obj;
    }

    @d.q0
    public static r0 q() {
        return v(a.l());
    }

    @d.q0
    public static r0 r(@d.q0 r0 r0Var) {
        if (r0Var == null) {
            return null;
        }
        return v(a.m((AccessibilityWindowInfo) r0Var.f10254a));
    }

    public static String t(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    public static r0 v(Object obj) {
        if (obj != null) {
            return new r0(obj);
        }
        return null;
    }

    @d.q0
    public f0 a() {
        return f0.h2(b.a((AccessibilityWindowInfo) this.f10254a));
    }

    public void b(@d.o0 Rect rect) {
        a.a((AccessibilityWindowInfo) this.f10254a, rect);
    }

    @d.q0
    public r0 c(int i7) {
        return v(a.b((AccessibilityWindowInfo) this.f10254a, i7));
    }

    public int d() {
        return a.c((AccessibilityWindowInfo) this.f10254a);
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.a((AccessibilityWindowInfo) this.f10254a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof r0)) {
            r0 r0Var = (r0) obj;
            Object obj2 = this.f10254a;
            return obj2 == null ? r0Var.f10254a == null : obj2.equals(r0Var.f10254a);
        }
        return false;
    }

    public int f() {
        return a.d((AccessibilityWindowInfo) this.f10254a);
    }

    public int g() {
        return a.e((AccessibilityWindowInfo) this.f10254a);
    }

    @d.q0
    public r0 h() {
        return v(a.f((AccessibilityWindowInfo) this.f10254a));
    }

    public int hashCode() {
        Object obj = this.f10254a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public void i(@d.o0 Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b((AccessibilityWindowInfo) this.f10254a, region);
            return;
        }
        Rect rect = new Rect();
        a.a((AccessibilityWindowInfo) this.f10254a, rect);
        region.set(rect);
    }

    @d.q0
    public f0 j() {
        return f0.h2(a.g((AccessibilityWindowInfo) this.f10254a));
    }

    @d.q0
    public CharSequence k() {
        return b.b((AccessibilityWindowInfo) this.f10254a);
    }

    public int l() {
        return a.h((AccessibilityWindowInfo) this.f10254a);
    }

    public boolean m() {
        return a.i((AccessibilityWindowInfo) this.f10254a);
    }

    public boolean n() {
        return a.j((AccessibilityWindowInfo) this.f10254a);
    }

    public boolean o() {
        return a.k((AccessibilityWindowInfo) this.f10254a);
    }

    public boolean p() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.c((AccessibilityWindowInfo) this.f10254a);
        }
        return false;
    }

    @Deprecated
    public void s() {
    }

    @d.o0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        b(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(f());
        sb.append(", type=");
        sb.append(t(l()));
        sb.append(", layer=");
        sb.append(g());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(o());
        sb.append(", active=");
        sb.append(n());
        sb.append(", hasParent=");
        sb.append(h() != null);
        sb.append(", hasChildren=");
        sb.append(d() > 0);
        sb.append(']');
        return sb.toString();
    }

    @d.q0
    public AccessibilityWindowInfo u() {
        return (AccessibilityWindowInfo) this.f10254a;
    }
}
