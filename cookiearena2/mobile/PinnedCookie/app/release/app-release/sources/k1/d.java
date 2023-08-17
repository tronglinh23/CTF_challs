package k1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import d.o0;
import d.q0;
import d.w0;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11573a = "CompoundButtonCompat";

    /* renamed from: b  reason: collision with root package name */
    public static Field f11574b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f11575c;

    @w0(21)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @d.u
        public static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @d.u
        public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @d.u
        public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    @w0(23)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    @q0
    public static Drawable a(@o0 CompoundButton compoundButton) {
        return b.a(compoundButton);
    }

    @q0
    public static ColorStateList b(@o0 CompoundButton compoundButton) {
        return a.a(compoundButton);
    }

    @q0
    public static PorterDuff.Mode c(@o0 CompoundButton compoundButton) {
        return a.b(compoundButton);
    }

    public static void d(@o0 CompoundButton compoundButton, @q0 ColorStateList colorStateList) {
        a.c(compoundButton, colorStateList);
    }

    public static void e(@o0 CompoundButton compoundButton, @q0 PorterDuff.Mode mode) {
        a.d(compoundButton, mode);
    }
}
