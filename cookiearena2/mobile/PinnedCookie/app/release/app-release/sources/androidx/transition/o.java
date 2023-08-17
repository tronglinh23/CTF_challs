package androidx.transition;

import android.animation.TypeEvaluator;
/* loaded from: classes.dex */
public class o implements TypeEvaluator<float[]> {

    /* renamed from: a  reason: collision with root package name */
    public float[] f6713a;

    public o(float[] fArr) {
        this.f6713a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f7, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f6713a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i7 = 0; i7 < fArr3.length; i7++) {
            float f8 = fArr[i7];
            fArr3[i7] = f8 + ((fArr2[i7] - f8) * f7);
        }
        return fArr3;
    }
}
