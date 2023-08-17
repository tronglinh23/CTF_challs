package k1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import d.o0;
import d.q0;
import d.w0;

/* loaded from: classes.dex */
public class o {

    @w0(21)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @d.u
        public static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @d.u
        public static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @d.u
        public static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    @q0
    public static ColorStateList a(@o0 ImageView imageView) {
        return a.a(imageView);
    }

    @q0
    public static PorterDuff.Mode b(@o0 ImageView imageView) {
        return a.b(imageView);
    }

    public static void c(@o0 ImageView imageView, @q0 ColorStateList colorStateList) {
        a.c(imageView, colorStateList);
    }

    public static void d(@o0 ImageView imageView, @q0 PorterDuff.Mode mode) {
        a.d(imageView, mode);
    }
}