package p0;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;

/* loaded from: classes.dex */
public final class o0 {
    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float A(long j7) {
        return Color.luminance(j7);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float B(long j7) {
        return Color.red(j7);
    }

    public static final int C(@d.l int i7) {
        return (i7 >> 16) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final boolean D(long j7) {
        return Color.isSrgb(j7);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final boolean E(long j7) {
        return Color.isWideGamut(j7);
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final Color F(@n6.d Color color, @n6.d Color color2) {
        u4.l0.p(color, "<this>");
        u4.l0.p(color2, "c");
        Color u6 = p0.u(color2, color);
        u4.l0.o(u6, "compositeColors(c, this)");
        return u6;
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final Color G(@d.l int i7) {
        Color valueOf = Color.valueOf(i7);
        u4.l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final Color H(long j7) {
        Color valueOf = Color.valueOf(j7);
        u4.l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.l
    @d.w0(26)
    public static final int I(long j7) {
        return Color.toArgb(j7);
    }

    @d.l
    public static final int J(@n6.d String str) {
        u4.l0.p(str, "<this>");
        return Color.parseColor(str);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final long K(@d.l int i7) {
        return Color.pack(i7);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float a(long j7) {
        return Color.red(j7);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float b(@n6.d Color color) {
        u4.l0.p(color, "<this>");
        return color.getComponent(0);
    }

    public static final int c(@d.l int i7) {
        return (i7 >> 24) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float d(long j7) {
        return Color.green(j7);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float e(@n6.d Color color) {
        u4.l0.p(color, "<this>");
        return color.getComponent(1);
    }

    public static final int f(@d.l int i7) {
        return (i7 >> 16) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float g(long j7) {
        return Color.blue(j7);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float h(@n6.d Color color) {
        u4.l0.p(color, "<this>");
        return color.getComponent(2);
    }

    public static final int i(@d.l int i7) {
        return (i7 >> 8) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float j(long j7) {
        return Color.alpha(j7);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float k(@n6.d Color color) {
        u4.l0.p(color, "<this>");
        return color.getComponent(3);
    }

    public static final int l(@d.l int i7) {
        return i7 & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final long m(@d.l int i7, @n6.d ColorSpace.Named named) {
        u4.l0.p(named, "colorSpace");
        return Color.convert(i7, ColorSpace.get(named));
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final long n(@d.l int i7, @n6.d ColorSpace colorSpace) {
        u4.l0.p(colorSpace, "colorSpace");
        return Color.convert(i7, colorSpace);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final long o(long j7, @n6.d ColorSpace.Named named) {
        u4.l0.p(named, "colorSpace");
        return Color.convert(j7, ColorSpace.get(named));
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final long p(long j7, @n6.d ColorSpace colorSpace) {
        u4.l0.p(colorSpace, "colorSpace");
        return Color.convert(j7, colorSpace);
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final Color q(@n6.d Color color, @n6.d ColorSpace.Named named) {
        u4.l0.p(color, "<this>");
        u4.l0.p(named, "colorSpace");
        Color convert = color.convert(ColorSpace.get(named));
        u4.l0.o(convert, "convert(ColorSpace.get(colorSpace))");
        return convert;
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final Color r(@n6.d Color color, @n6.d ColorSpace colorSpace) {
        u4.l0.p(color, "<this>");
        u4.l0.p(colorSpace, "colorSpace");
        Color convert = color.convert(colorSpace);
        u4.l0.o(convert, "convert(colorSpace)");
        return convert;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float s(long j7) {
        return Color.alpha(j7);
    }

    public static final int t(@d.l int i7) {
        return (i7 >> 24) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float u(long j7) {
        return Color.blue(j7);
    }

    public static final int v(@d.l int i7) {
        return i7 & 255;
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final ColorSpace w(long j7) {
        ColorSpace colorSpace = Color.colorSpace(j7);
        u4.l0.o(colorSpace, "colorSpace(this)");
        return colorSpace;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float x(long j7) {
        return Color.green(j7);
    }

    public static final int y(@d.l int i7) {
        return (i7 >> 8) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(26)
    public static final float z(@d.l int i7) {
        return Color.luminance(i7);
    }
}