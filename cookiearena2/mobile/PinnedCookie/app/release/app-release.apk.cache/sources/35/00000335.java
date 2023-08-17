package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import d1.a;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f3558a = 8;

    /* renamed from: b  reason: collision with root package name */
    public static final int f3559b = 9;

    /* renamed from: c  reason: collision with root package name */
    public static final int f3560c = 10;

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(@d.o0 Window window, boolean z6) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | a.b.f8291f);
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static <T> T a(Window window, int i7) {
            View requireViewById;
            requireViewById = window.requireViewById(i7);
            return (T) requireViewById;
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static void a(@d.o0 Window window, boolean z6) {
            window.setDecorFitsSystemWindows(z6);
        }
    }

    @d.o0
    public static o5 a(@d.o0 Window window, @d.o0 View view) {
        return new o5(window, view);
    }

    @d.o0
    public static <T extends View> T b(@d.o0 Window window, @d.d0 int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) b.a(window, i7);
        }
        T t6 = (T) window.findViewById(i7);
        if (t6 != null) {
            return t6;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void c(@d.o0 Window window, boolean z6) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(window, z6);
        } else {
            a.a(window, z6);
        }
    }
}