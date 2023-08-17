package q0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d.u0;
import u4.l0;
import u4.r1;
@r1({"SMAP\nDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,118:1\n38#2:119\n49#2:120\n60#2:121\n71#2:122\n*S KotlinDebug\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n*L\n66#1:119\n66#1:120\n66#1:121\n66#1:122\n*E\n"})
/* loaded from: classes.dex */
public final class d {
    @n6.d
    public static final Bitmap a(@n6.d Drawable drawable, @u0 int i7, @u0 int i8, @n6.e Bitmap.Config config) {
        l0.p(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                if (i7 == bitmapDrawable.getBitmap().getWidth() && i8 == bitmapDrawable.getBitmap().getHeight()) {
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    l0.o(bitmap, "bitmap");
                    return bitmap;
                }
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i7, i8, true);
                l0.o(createScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
                return createScaledBitmap;
            }
        }
        Rect bounds = drawable.getBounds();
        l0.o(bounds, "bounds");
        int i9 = bounds.left;
        int i10 = bounds.top;
        int i11 = bounds.right;
        int i12 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i7, i8, config);
        drawable.setBounds(0, 0, i7, i8);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i9, i10, i11, i12);
        l0.o(createBitmap, "bitmap");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap b(Drawable drawable, int i7, int i8, Bitmap.Config config, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = drawable.getIntrinsicWidth();
        }
        if ((i9 & 2) != 0) {
            i8 = drawable.getIntrinsicHeight();
        }
        if ((i9 & 4) != 0) {
            config = null;
        }
        return a(drawable, i7, i8, config);
    }

    @n6.e
    public static final Bitmap c(@n6.d Drawable drawable, @u0 int i7, @u0 int i8, @n6.e Bitmap.Config config) {
        l0.p(drawable, "<this>");
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return a(drawable, i7, i8, config);
    }

    public static /* synthetic */ Bitmap d(Drawable drawable, int i7, int i8, Bitmap.Config config, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = drawable.getIntrinsicWidth();
        }
        if ((i9 & 2) != 0) {
            i8 = drawable.getIntrinsicHeight();
        }
        if ((i9 & 4) != 0) {
            config = null;
        }
        return c(drawable, i7, i8, config);
    }

    public static final void e(@n6.d Drawable drawable, @u0 int i7, @u0 int i8, @u0 int i9, @u0 int i10) {
        l0.p(drawable, "<this>");
        drawable.setBounds(i7, i8, i9, i10);
    }

    public static /* synthetic */ void f(Drawable drawable, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = drawable.getBounds().left;
        }
        if ((i11 & 2) != 0) {
            i8 = drawable.getBounds().top;
        }
        if ((i11 & 4) != 0) {
            i9 = drawable.getBounds().right;
        }
        if ((i11 & 8) != 0) {
            i10 = drawable.getBounds().bottom;
        }
        e(drawable, i7, i8, i9, i10);
    }
}
