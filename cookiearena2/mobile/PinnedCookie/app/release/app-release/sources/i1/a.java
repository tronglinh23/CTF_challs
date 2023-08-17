package i1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
/* loaded from: classes.dex */
public class a implements Interpolator {

    /* renamed from: c  reason: collision with root package name */
    public static final float f11000c = 0.002f;

    /* renamed from: a  reason: collision with root package name */
    public final float[] f11001a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f11002b;

    public a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i7 = ((int) (length / 0.002f)) + 1;
        this.f11001a = new float[i7];
        this.f11002b = new float[i7];
        float[] fArr = new float[2];
        for (int i8 = 0; i8 < i7; i8++) {
            pathMeasure.getPosTan((i8 * length) / ((float) (i7 - 1)), fArr, null);
            this.f11001a[i8] = fArr[0];
            this.f11002b[i8] = fArr[1];
        }
    }

    public static Path a(float f7, float f8, float f9, float f10) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f7, f8, f9, f10, 1.0f, 1.0f);
        return path;
    }

    public static Path b(float f7, float f8) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f7, f8, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f7) {
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f11001a.length - 1;
        int i7 = 0;
        while (length - i7 > 1) {
            int i8 = (i7 + length) / 2;
            if (f7 < this.f11001a[i8]) {
                length = i8;
            } else {
                i7 = i8;
            }
        }
        float[] fArr = this.f11001a;
        float f8 = fArr[length];
        float f9 = fArr[i7];
        float f10 = f8 - f9;
        if (f10 == 0.0f) {
            return this.f11002b[i7];
        }
        float f11 = (f7 - f9) / f10;
        float[] fArr2 = this.f11002b;
        float f12 = fArr2[i7];
        return f12 + (f11 * (fArr2[length] - f12));
    }

    public a(float f7, float f8) {
        this(b(f7, f8));
    }

    public a(float f7, float f8, float f9, float f10) {
        this(a(f7, f8, f9, f10));
    }
}
