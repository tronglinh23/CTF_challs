package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import d.o0;
/* loaded from: classes.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {
    private final float[] tempStartValues = new float[9];
    private final float[] tempEndValues = new float[9];
    private final Matrix tempMatrix = new Matrix();

    @Override // android.animation.TypeEvaluator
    @o0
    public Matrix evaluate(float f7, @o0 Matrix matrix, @o0 Matrix matrix2) {
        matrix.getValues(this.tempStartValues);
        matrix2.getValues(this.tempEndValues);
        for (int i7 = 0; i7 < 9; i7++) {
            float[] fArr = this.tempEndValues;
            float f8 = fArr[i7];
            float f9 = this.tempStartValues[i7];
            fArr[i7] = f9 + ((f8 - f9) * f7);
        }
        this.tempMatrix.setValues(this.tempEndValues);
        return this.tempMatrix;
    }
}
