package q0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f15118a = "DrawableCompat";

    /* renamed from: b  reason: collision with root package name */
    public static Method f15119b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f15120c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f15121d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f15122e;

    @w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        @u
        public static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i7) {
            return drawableContainerState.getChild(i7);
        }

        @u
        public static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @u
        public static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @u
        public static void e(Drawable drawable, boolean z6) {
            drawable.setAutoMirrored(z6);
        }
    }

    @w0(21)
    /* loaded from: classes.dex */
    public static class b {
        @u
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @u
        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @u
        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @u
        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @u
        public static void e(Drawable drawable, float f7, float f8) {
            drawable.setHotspot(f7, f8);
        }

        @u
        public static void f(Drawable drawable, int i7, int i8, int i9, int i10) {
            drawable.setHotspotBounds(i7, i8, i9, i10);
        }

        @u
        public static void g(Drawable drawable, int i7) {
            drawable.setTint(i7);
        }

        @u
        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @u
        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @w0(23)
    /* renamed from: q0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0220c {
        @u
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @u
        public static boolean b(Drawable drawable, int i7) {
            return drawable.setLayoutDirection(i7);
        }
    }

    public static void a(@o0 Drawable drawable, @o0 Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean b(@o0 Drawable drawable) {
        return b.b(drawable);
    }

    public static void c(@o0 Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int d(@o0 Drawable drawable) {
        return a.a(drawable);
    }

    @q0
    public static ColorFilter e(@o0 Drawable drawable) {
        return b.c(drawable);
    }

    public static int f(@o0 Drawable drawable) {
        return C0220c.a(drawable);
    }

    public static void g(@o0 Drawable drawable, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(@o0 Drawable drawable) {
        return a.d(drawable);
    }

    @Deprecated
    public static void i(@o0 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(@o0 Drawable drawable, boolean z6) {
        a.e(drawable, z6);
    }

    public static void k(@o0 Drawable drawable, float f7, float f8) {
        b.e(drawable, f7, f8);
    }

    public static void l(@o0 Drawable drawable, int i7, int i8, int i9, int i10) {
        b.f(drawable, i7, i8, i9, i10);
    }

    public static boolean m(@o0 Drawable drawable, int i7) {
        return C0220c.b(drawable, i7);
    }

    public static void n(@o0 Drawable drawable, @d.l int i7) {
        b.g(drawable, i7);
    }

    public static void o(@o0 Drawable drawable, @q0 ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void p(@o0 Drawable drawable, @q0 PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@o0 Drawable drawable) {
        return drawable instanceof o ? (T) ((o) drawable).b() : drawable;
    }

    @o0
    public static Drawable r(@o0 Drawable drawable) {
        return drawable;
    }
}