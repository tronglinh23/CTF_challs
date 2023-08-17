package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
/* loaded from: classes.dex */
public class a0<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    public final Property<T, PointF> f5651a;

    /* renamed from: b  reason: collision with root package name */
    public final PathMeasure f5652b;

    /* renamed from: c  reason: collision with root package name */
    public final float f5653c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f5654d;

    /* renamed from: e  reason: collision with root package name */
    public final PointF f5655e;

    /* renamed from: f  reason: collision with root package name */
    public float f5656f;

    public a0(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f5654d = new float[2];
        this.f5655e = new PointF();
        this.f5651a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f5652b = pathMeasure;
        this.f5653c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public Float get(T t6) {
        return Float.valueOf(this.f5656f);
    }

    @Override // android.util.Property
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public void set(T t6, Float f7) {
        this.f5656f = f7.floatValue();
        this.f5652b.getPosTan(this.f5653c * f7.floatValue(), this.f5654d, null);
        PointF pointF = this.f5655e;
        float[] fArr = this.f5654d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f5651a.set(t6, pointF);
    }
}
