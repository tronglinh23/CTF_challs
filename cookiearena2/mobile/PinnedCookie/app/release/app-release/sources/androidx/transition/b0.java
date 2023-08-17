package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class b0 extends z {

    /* renamed from: a  reason: collision with root package name */
    public Path f5673a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f5674b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f5675c;

    public b0() {
        Path path = new Path();
        this.f5674b = path;
        this.f5675c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f5673a = path;
    }

    public static float a(float f7, float f8) {
        return (float) Math.sqrt((f7 * f7) + (f8 * f8));
    }

    public Path b() {
        return this.f5673a;
    }

    public void c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f7 = fArr[0];
        float f8 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f9 = fArr[0];
        float f10 = fArr[1];
        if (f9 == f7 && f10 == f8) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f5675c.setTranslate(-f9, -f10);
        float f11 = f7 - f9;
        float f12 = f8 - f10;
        float a7 = 1.0f / a(f11, f12);
        this.f5675c.postScale(a7, a7);
        this.f5675c.postRotate((float) Math.toDegrees(-Math.atan2(f12, f11)));
        path.transform(this.f5675c, this.f5674b);
        this.f5673a = path;
    }

    @Override // androidx.transition.z
    @d.o0
    public Path getPath(float f7, float f8, float f9, float f10) {
        float f11 = f9 - f7;
        float f12 = f10 - f8;
        float a7 = a(f11, f12);
        double atan2 = Math.atan2(f12, f11);
        this.f5675c.setScale(a7, a7);
        this.f5675c.postRotate((float) Math.toDegrees(atan2));
        this.f5675c.postTranslate(f7, f8);
        Path path = new Path();
        this.f5674b.transform(this.f5675c, path);
        return path;
    }

    @SuppressLint({"RestrictedApi"})
    public b0(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        this.f5674b = new Path();
        this.f5675c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f6611k);
        try {
            String m7 = m0.p.m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m7 != null) {
                c(p0.a1.e(m7));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public b0(Path path) {
        this.f5674b = new Path();
        this.f5675c = new Matrix();
        c(path);
    }
}
