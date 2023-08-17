package k1;

import android.view.View;
import android.widget.PopupWindow;
import d.o0;
import d.w0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11589a = "PopupWindowCompatApi21";

    /* renamed from: b  reason: collision with root package name */
    public static Method f11590b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f11591c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f11592d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f11593e;

    /* renamed from: f  reason: collision with root package name */
    public static Field f11594f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f11595g;

    @w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(PopupWindow popupWindow, View view, int i7, int i8, int i9) {
            popupWindow.showAsDropDown(view, i7, i8, i9);
        }
    }

    @w0(23)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @d.u
        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @d.u
        public static void c(PopupWindow popupWindow, boolean z6) {
            popupWindow.setOverlapAnchor(z6);
        }

        @d.u
        public static void d(PopupWindow popupWindow, int i7) {
            popupWindow.setWindowLayoutType(i7);
        }
    }

    public static boolean a(@o0 PopupWindow popupWindow) {
        return b.a(popupWindow);
    }

    public static int b(@o0 PopupWindow popupWindow) {
        return b.b(popupWindow);
    }

    public static void c(@o0 PopupWindow popupWindow, boolean z6) {
        b.c(popupWindow, z6);
    }

    public static void d(@o0 PopupWindow popupWindow, int i7) {
        b.d(popupWindow, i7);
    }

    public static void e(@o0 PopupWindow popupWindow, @o0 View view, int i7, int i8, int i9) {
        a.a(popupWindow, view, i7, i8, i9);
    }
}