package androidx.core.view;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class r0 {

    @d.w0(17)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @d.u
        public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @d.u
        public static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        @d.u
        public static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        @d.u
        public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
            marginLayoutParams.resolveLayoutDirection(i7);
        }

        @d.u
        public static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
            marginLayoutParams.setLayoutDirection(i7);
        }

        @d.u
        public static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
            marginLayoutParams.setMarginEnd(i7);
        }

        @d.u
        public static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
            marginLayoutParams.setMarginStart(i7);
        }
    }

    public static int a(@d.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        int a7 = a.a(marginLayoutParams);
        if (a7 == 0 || a7 == 1) {
            return a7;
        }
        return 0;
    }

    public static int b(@d.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int c(@d.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static boolean d(@d.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.d(marginLayoutParams);
    }

    public static void e(@d.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        a.e(marginLayoutParams, i7);
    }

    public static void f(@d.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        a.f(marginLayoutParams, i7);
    }

    public static void g(@d.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        a.g(marginLayoutParams, i7);
    }

    public static void h(@d.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        a.h(marginLayoutParams, i7);
    }
}