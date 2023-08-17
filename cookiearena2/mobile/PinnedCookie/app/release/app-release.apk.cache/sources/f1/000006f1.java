package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class b extends z {

    /* renamed from: g  reason: collision with root package name */
    public static final float f5664g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public static final float f5665h = 70.0f;

    /* renamed from: i  reason: collision with root package name */
    public static final float f5666i = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a  reason: collision with root package name */
    public float f5667a;

    /* renamed from: b  reason: collision with root package name */
    public float f5668b;

    /* renamed from: c  reason: collision with root package name */
    public float f5669c;

    /* renamed from: d  reason: collision with root package name */
    public float f5670d;

    /* renamed from: e  reason: collision with root package name */
    public float f5671e;

    /* renamed from: f  reason: collision with root package name */
    public float f5672f;

    public b() {
        this.f5667a = 0.0f;
        this.f5668b = 0.0f;
        this.f5669c = 70.0f;
        this.f5670d = 0.0f;
        this.f5671e = 0.0f;
        this.f5672f = f5666i;
    }

    public static float g(float f7) {
        if (f7 < 0.0f || f7 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f7 / 2.0f));
    }

    public float a() {
        return this.f5669c;
    }

    public float b() {
        return this.f5667a;
    }

    public float c() {
        return this.f5668b;
    }

    public void d(float f7) {
        this.f5669c = f7;
        this.f5672f = g(f7);
    }

    public void e(float f7) {
        this.f5667a = f7;
        this.f5670d = g(f7);
    }

    public void f(float f7) {
        this.f5668b = f7;
        this.f5671e = g(f7);
    }

    @Override // androidx.transition.z
    @d.o0
    public Path getPath(float f7, float f8, float f9, float f10) {
        float f11;
        float f12;
        float f13;
        Path path = new Path();
        path.moveTo(f7, f8);
        float f14 = f9 - f7;
        float f15 = f10 - f8;
        float f16 = (f14 * f14) + (f15 * f15);
        float f17 = (f7 + f9) / 2.0f;
        float f18 = (f8 + f10) / 2.0f;
        float f19 = 0.25f * f16;
        boolean z6 = f8 > f10;
        if (Math.abs(f14) < Math.abs(f15)) {
            float abs = Math.abs(f16 / (f15 * 2.0f));
            if (z6) {
                f12 = abs + f10;
                f11 = f9;
            } else {
                f12 = abs + f8;
                f11 = f7;
            }
            f13 = this.f5671e;
        } else {
            float f20 = f16 / (f14 * 2.0f);
            if (z6) {
                f12 = f8;
                f11 = f20 + f7;
            } else {
                f11 = f9 - f20;
                f12 = f10;
            }
            f13 = this.f5670d;
        }
        float f21 = f19 * f13 * f13;
        float f22 = f17 - f11;
        float f23 = f18 - f12;
        float f24 = (f22 * f22) + (f23 * f23);
        float f25 = this.f5672f;
        float f26 = f19 * f25 * f25;
        if (f24 >= f21) {
            f21 = f24 > f26 ? f26 : 0.0f;
        }
        if (f21 != 0.0f) {
            float sqrt = (float) Math.sqrt(f21 / f24);
            f11 = ((f11 - f17) * sqrt) + f17;
            f12 = f18 + (sqrt * (f12 - f18));
        }
        path.cubicTo((f7 + f11) / 2.0f, (f8 + f12) / 2.0f, (f11 + f9) / 2.0f, (f12 + f10) / 2.0f, f9, f10);
        return path;
    }

    @SuppressLint({"RestrictedApi"})
    public b(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5667a = 0.0f;
        this.f5668b = 0.0f;
        this.f5669c = 70.0f;
        this.f5670d = 0.0f;
        this.f5671e = 0.0f;
        this.f5672f = f5666i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f6610j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        f(m0.p.j(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        e(m0.p.j(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        d(m0.p.j(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }
}