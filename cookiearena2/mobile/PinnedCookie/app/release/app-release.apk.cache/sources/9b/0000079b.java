package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import d.b1;
import m0.p;
import org.xmlpull.v1.XmlPullParser;
import p0.a1;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g implements Interpolator {

    /* renamed from: c  reason: collision with root package name */
    public static final float f6906c = 0.002f;

    /* renamed from: d  reason: collision with root package name */
    public static final int f6907d = 3000;

    /* renamed from: e  reason: collision with root package name */
    public static final double f6908e = 1.0E-5d;

    /* renamed from: a  reason: collision with root package name */
    public float[] f6909a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f6910b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public final void a(float f7, float f8, float f9, float f10) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f7, f8, f9, f10, 1.0f, 1.0f);
        b(path);
    }

    public final void b(Path path) {
        int i7 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min((int) f6907d, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f6909a = new float[min];
        this.f6910b = new float[min];
        float[] fArr = new float[2];
        for (int i8 = 0; i8 < min; i8++) {
            pathMeasure.getPosTan((i8 * length) / ((float) (min - 1)), fArr, null);
            this.f6909a[i8] = fArr[0];
            this.f6910b[i8] = fArr[1];
        }
        if (Math.abs(this.f6909a[0]) <= 1.0E-5d && Math.abs(this.f6910b[0]) <= 1.0E-5d) {
            int i9 = min - 1;
            if (Math.abs(this.f6909a[i9] - 1.0f) <= 1.0E-5d && Math.abs(this.f6910b[i9] - 1.0f) <= 1.0E-5d) {
                float f7 = 0.0f;
                int i10 = 0;
                while (i7 < min) {
                    float[] fArr2 = this.f6909a;
                    int i11 = i10 + 1;
                    float f8 = fArr2[i10];
                    if (f8 < f7) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f8);
                    }
                    fArr2[i7] = f8;
                    i7++;
                    f7 = f8;
                    i10 = i11;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f6909a[0]);
        sb.append(",");
        sb.append(this.f6910b[0]);
        sb.append(" end:");
        int i12 = min - 1;
        sb.append(this.f6909a[i12]);
        sb.append(",");
        sb.append(this.f6910b[i12]);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void c(float f7, float f8) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f7, f8, 1.0f, 1.0f);
        b(path);
    }

    public final void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (p.r(xmlPullParser, "pathData")) {
            String m7 = p.m(typedArray, xmlPullParser, "pathData", 4);
            Path e7 = a1.e(m7);
            if (e7 != null) {
                b(e7);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m7);
        } else if (!p.r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else {
            if (!p.r(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float j7 = p.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float j8 = p.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean r6 = p.r(xmlPullParser, "controlX2");
            if (r6 != p.r(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (r6) {
                a(j7, j8, p.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), p.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            } else {
                c(j7, j8);
            }
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f7) {
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f6909a.length - 1;
        int i7 = 0;
        while (length - i7 > 1) {
            int i8 = (i7 + length) / 2;
            if (f7 < this.f6909a[i8]) {
                length = i8;
            } else {
                i7 = i8;
            }
        }
        float[] fArr = this.f6909a;
        float f8 = fArr[length];
        float f9 = fArr[i7];
        float f10 = f8 - f9;
        if (f10 == 0.0f) {
            return this.f6910b[i7];
        }
        float f11 = (f7 - f9) / f10;
        float[] fArr2 = this.f6910b;
        float f12 = fArr2[i7];
        return f12 + (f11 * (fArr2[length] - f12));
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s6 = p.s(resources, theme, attributeSet, a.f6858r0);
        d(s6, xmlPullParser);
        s6.recycle();
    }
}