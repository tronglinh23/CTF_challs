package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3870a = "ViewParentCompat";

    /* renamed from: b  reason: collision with root package name */
    public static int[] f3871b;

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(ViewParent viewParent, View view, View view2, int i7) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i7);
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static boolean a(ViewParent viewParent, View view, float f7, float f8, boolean z6) {
            return viewParent.onNestedFling(view, f7, f8, z6);
        }

        @d.u
        public static boolean b(ViewParent viewParent, View view, float f7, float f8) {
            return viewParent.onNestedPreFling(view, f7, f8);
        }

        @d.u
        public static void c(ViewParent viewParent, View view, int i7, int i8, int[] iArr) {
            viewParent.onNestedPreScroll(view, i7, i8, iArr);
        }

        @d.u
        public static void d(ViewParent viewParent, View view, int i7, int i8, int i9, int i10) {
            viewParent.onNestedScroll(view, i7, i8, i9, i10);
        }

        @d.u
        public static void e(ViewParent viewParent, View view, View view2, int i7) {
            viewParent.onNestedScrollAccepted(view, view2, i7);
        }

        @d.u
        public static boolean f(ViewParent viewParent, View view, View view2, int i7) {
            return viewParent.onStartNestedScroll(view, view2, i7);
        }

        @d.u
        public static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static int[] a() {
        int[] iArr = f3871b;
        if (iArr == null) {
            f3871b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f3871b;
    }

    public static void b(@d.o0 ViewParent viewParent, @d.o0 View view, @d.o0 View view2, int i7) {
        a.a(viewParent, view, view2, i7);
    }

    public static boolean c(@d.o0 ViewParent viewParent, @d.o0 View view, float f7, float f8, boolean z6) {
        try {
            return b.a(viewParent, view, f7, f8, z6);
        } catch (AbstractMethodError e7) {
            Log.e(f3870a, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e7);
            return false;
        }
    }

    public static boolean d(@d.o0 ViewParent viewParent, @d.o0 View view, float f7, float f8) {
        try {
            return b.b(viewParent, view, f7, f8);
        } catch (AbstractMethodError e7) {
            Log.e(f3870a, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e7);
            return false;
        }
    }

    public static void e(@d.o0 ViewParent viewParent, @d.o0 View view, int i7, int i8, @d.o0 int[] iArr) {
        f(viewParent, view, i7, i8, iArr, 0);
    }

    public static void f(@d.o0 ViewParent viewParent, @d.o0 View view, int i7, int i8, @d.o0 int[] iArr, int i9) {
        if (viewParent instanceof g1) {
            ((g1) viewParent).onNestedPreScroll(view, i7, i8, iArr, i9);
        } else if (i9 == 0) {
            try {
                b.c(viewParent, view, i7, i8, iArr);
            } catch (AbstractMethodError e7) {
                Log.e(f3870a, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e7);
            }
        }
    }

    public static void g(@d.o0 ViewParent viewParent, @d.o0 View view, int i7, int i8, int i9, int i10) {
        i(viewParent, view, i7, i8, i9, i10, 0, a());
    }

    public static void h(@d.o0 ViewParent viewParent, @d.o0 View view, int i7, int i8, int i9, int i10, int i11) {
        i(viewParent, view, i7, i8, i9, i10, i11, a());
    }

    public static void i(@d.o0 ViewParent viewParent, @d.o0 View view, int i7, int i8, int i9, int i10, int i11, @d.o0 int[] iArr) {
        if (viewParent instanceof h1) {
            ((h1) viewParent).onNestedScroll(view, i7, i8, i9, i10, i11, iArr);
            return;
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (viewParent instanceof g1) {
            ((g1) viewParent).onNestedScroll(view, i7, i8, i9, i10, i11);
        } else if (i11 == 0) {
            try {
                b.d(viewParent, view, i7, i8, i9, i10);
            } catch (AbstractMethodError e7) {
                Log.e(f3870a, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e7);
            }
        }
    }

    public static void j(@d.o0 ViewParent viewParent, @d.o0 View view, @d.o0 View view2, int i7) {
        k(viewParent, view, view2, i7, 0);
    }

    public static void k(@d.o0 ViewParent viewParent, @d.o0 View view, @d.o0 View view2, int i7, int i8) {
        if (viewParent instanceof g1) {
            ((g1) viewParent).onNestedScrollAccepted(view, view2, i7, i8);
        } else if (i8 == 0) {
            try {
                b.e(viewParent, view, view2, i7);
            } catch (AbstractMethodError e7) {
                Log.e(f3870a, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e7);
            }
        }
    }

    public static boolean l(@d.o0 ViewParent viewParent, @d.o0 View view, @d.o0 View view2, int i7) {
        return m(viewParent, view, view2, i7, 0);
    }

    public static boolean m(@d.o0 ViewParent viewParent, @d.o0 View view, @d.o0 View view2, int i7, int i8) {
        if (viewParent instanceof g1) {
            return ((g1) viewParent).onStartNestedScroll(view, view2, i7, i8);
        }
        if (i8 == 0) {
            try {
                return b.f(viewParent, view, view2, i7);
            } catch (AbstractMethodError e7) {
                Log.e(f3870a, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e7);
                return false;
            }
        }
        return false;
    }

    public static void n(@d.o0 ViewParent viewParent, @d.o0 View view) {
        o(viewParent, view, 0);
    }

    public static void o(@d.o0 ViewParent viewParent, @d.o0 View view, int i7) {
        if (viewParent instanceof g1) {
            ((g1) viewParent).onStopNestedScroll(view, i7);
        } else if (i7 == 0) {
            try {
                b.g(viewParent, view);
            } catch (AbstractMethodError e7) {
                Log.e(f3870a, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e7);
            }
        }
    }

    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
