package k1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CheckedTextView;
import d.o0;
import d.q0;
import d.w0;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11570a = "CheckedTextViewCompat";

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f11571a;

        /* renamed from: b  reason: collision with root package name */
        public static boolean f11572b;

        @q0
        public static Drawable a(@o0 CheckedTextView checkedTextView) {
            if (!f11572b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f11571a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e7) {
                    Log.i(c.f11570a, "Failed to retrieve mCheckMarkDrawable field", e7);
                }
                f11572b = true;
            }
            Field field = f11571a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException e8) {
                    Log.i(c.f11570a, "Failed to get check mark drawable via reflection", e8);
                    f11571a = null;
                }
            }
            return null;
        }
    }

    @w0(16)
    /* loaded from: classes.dex */
    public static class b {
        @q0
        public static Drawable a(@o0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    @w0(21)
    /* renamed from: k1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0138c {
        @q0
        public static ColorStateList a(@o0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @q0
        public static PorterDuff.Mode b(@o0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        public static void c(@o0 CheckedTextView checkedTextView, @q0 ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        public static void d(@o0 CheckedTextView checkedTextView, @q0 PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @q0
    public static Drawable a(@o0 CheckedTextView checkedTextView) {
        return b.a(checkedTextView);
    }

    @q0
    public static ColorStateList b(@o0 CheckedTextView checkedTextView) {
        return C0138c.a(checkedTextView);
    }

    @q0
    public static PorterDuff.Mode c(@o0 CheckedTextView checkedTextView) {
        return C0138c.b(checkedTextView);
    }

    public static void d(@o0 CheckedTextView checkedTextView, @q0 ColorStateList colorStateList) {
        C0138c.c(checkedTextView, colorStateList);
    }

    public static void e(@o0 CheckedTextView checkedTextView, @q0 PorterDuff.Mode mode) {
        C0138c.d(checkedTextView, mode);
    }
}