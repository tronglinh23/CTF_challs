package p0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class e {
    @n6.d
    public static final Bitmap a(@n6.d Bitmap bitmap, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(bitmap, "<this>");
        u4.l0.p(lVar, "block");
        lVar.O(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean b(@n6.d Bitmap bitmap, @n6.d Point point) {
        int i7;
        u4.l0.p(bitmap, "<this>");
        u4.l0.p(point, "p");
        int width = bitmap.getWidth();
        int i8 = point.x;
        return (i8 >= 0 && i8 < width) && (i7 = point.y) >= 0 && i7 < bitmap.getHeight();
    }

    public static final boolean c(@n6.d Bitmap bitmap, @n6.d PointF pointF) {
        u4.l0.p(bitmap, "<this>");
        u4.l0.p(pointF, "p");
        float f7 = pointF.x;
        if (f7 >= 0.0f && f7 < bitmap.getWidth()) {
            float f8 = pointF.y;
            if (f8 >= 0.0f && f8 < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final Bitmap d(int i7, int i8, @n6.d Bitmap.Config config) {
        u4.l0.p(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i7, i8, config);
        u4.l0.o(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final Bitmap e(int i7, int i8, @n6.d Bitmap.Config config, boolean z6, @n6.d ColorSpace colorSpace) {
        u4.l0.p(config, "config");
        u4.l0.p(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i7, i8, config, z6, colorSpace);
        u4.l0.o(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap f(int i7, int i8, Bitmap.Config config, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        u4.l0.p(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i7, i8, config);
        u4.l0.o(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap g(int i7, int i8, Bitmap.Config config, boolean z6, ColorSpace colorSpace, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i9 & 8) != 0) {
            z6 = true;
        }
        if ((i9 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            u4.l0.o(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        u4.l0.p(config, "config");
        u4.l0.p(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i7, i8, config, z6, colorSpace);
        u4.l0.o(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static final int h(@n6.d Bitmap bitmap, int i7, int i8) {
        u4.l0.p(bitmap, "<this>");
        return bitmap.getPixel(i7, i8);
    }

    @n6.d
    public static final Bitmap i(@n6.d Bitmap bitmap, int i7, int i8, boolean z6) {
        u4.l0.p(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i7, i8, z6);
        u4.l0.o(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap j(Bitmap bitmap, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            z6 = true;
        }
        u4.l0.p(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i7, i8, z6);
        u4.l0.o(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static final void k(@n6.d Bitmap bitmap, int i7, int i8, @d.l int i9) {
        u4.l0.p(bitmap, "<this>");
        bitmap.setPixel(i7, i8, i9);
    }
}