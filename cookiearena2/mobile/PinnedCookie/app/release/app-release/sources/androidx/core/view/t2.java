package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f3790a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f3791b = 1;

    @d.w0(18)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static int a(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @d.u
        public static void b(ViewGroup viewGroup, int i7) {
            viewGroup.setLayoutMode(i7);
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @d.u
        public static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @d.u
        public static void c(ViewGroup viewGroup, boolean z6) {
            viewGroup.setTransitionGroup(z6);
        }
    }

    public static int a(@d.o0 ViewGroup viewGroup) {
        return a.a(viewGroup);
    }

    public static int b(@d.o0 ViewGroup viewGroup) {
        return b.a(viewGroup);
    }

    public static boolean c(@d.o0 ViewGroup viewGroup) {
        return b.b(viewGroup);
    }

    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void e(@d.o0 ViewGroup viewGroup, int i7) {
        a.b(viewGroup, i7);
    }

    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z6) {
        viewGroup.setMotionEventSplittingEnabled(z6);
    }

    public static void g(@d.o0 ViewGroup viewGroup, boolean z6) {
        b.c(viewGroup, z6);
    }
}
