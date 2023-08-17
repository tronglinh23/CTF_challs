package p0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.os.Build;
/* loaded from: classes.dex */
public final class a {

    @d.w0(17)
    /* renamed from: p0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0204a {
        @d.u
        public static boolean a(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @d.u
        public static void b(Bitmap bitmap, boolean z6) {
            bitmap.setHasMipMap(z6);
        }
    }

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static int a(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    @d.w0(27)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static Bitmap a(Bitmap bitmap) {
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = e.a(bitmap);
                }
                return bitmap.copy(config, true);
            }
            return bitmap;
        }

        @d.u
        public static Bitmap b(int i7, int i8, Bitmap bitmap, boolean z6) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z6 && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = e.a(bitmap);
                }
            }
            return Bitmap.createBitmap(i7, i8, config, bitmap.hasAlpha(), colorSpace);
        }

        @d.u
        public static boolean c(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static void a(Paint paint) {
            BlendMode blendMode;
            blendMode = BlendMode.SRC;
            paint.setBlendMode(blendMode);
        }
    }

    @d.w0(31)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static Bitmap.Config a(Bitmap bitmap) {
            HardwareBuffer hardwareBuffer;
            hardwareBuffer = bitmap.getHardwareBuffer();
            return hardwareBuffer.getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a6, code lost:
        if (p0.a.c.c(r11) == false) goto L122;
     */
    @d.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(@d.o0 android.graphics.Bitmap r21, int r22, int r23, @d.q0 android.graphics.Rect r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.a(android.graphics.Bitmap, int, int, android.graphics.Rect, boolean):android.graphics.Bitmap");
    }

    public static int b(@d.o0 Bitmap bitmap) {
        return b.a(bitmap);
    }

    public static boolean c(@d.o0 Bitmap bitmap) {
        return C0204a.a(bitmap);
    }

    public static void d(@d.o0 Bitmap bitmap, boolean z6) {
        C0204a.b(bitmap, z6);
    }

    @d.l1
    public static int e(int i7, int i8, int i9, int i10) {
        return i9 == 0 ? i8 : i9 > 0 ? i7 * (1 << (i10 - i9)) : i8 << ((-i9) - 1);
    }
}
