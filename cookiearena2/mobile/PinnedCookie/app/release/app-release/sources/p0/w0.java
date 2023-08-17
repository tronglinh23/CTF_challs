package p0;

import android.graphics.Matrix;
@u4.r1({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* loaded from: classes.dex */
public final class w0 {
    @n6.d
    public static final Matrix a(float f7, float f8, float f9) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f7, f8, f9);
        return matrix;
    }

    public static /* synthetic */ Matrix b(float f7, float f8, float f9, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            f8 = 0.0f;
        }
        if ((i7 & 4) != 0) {
            f9 = 0.0f;
        }
        return a(f7, f8, f9);
    }

    @n6.d
    public static final Matrix c(float f7, float f8) {
        Matrix matrix = new Matrix();
        matrix.setScale(f7, f8);
        return matrix;
    }

    public static /* synthetic */ Matrix d(float f7, float f8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = 1.0f;
        }
        if ((i7 & 2) != 0) {
            f8 = 1.0f;
        }
        return c(f7, f8);
    }

    @n6.d
    public static final Matrix e(@n6.d Matrix matrix, @n6.d Matrix matrix2) {
        u4.l0.p(matrix, "<this>");
        u4.l0.p(matrix2, x0.f14590b);
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    @n6.d
    public static final Matrix f(float f7, float f8) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f7, f8);
        return matrix;
    }

    public static /* synthetic */ Matrix g(float f7, float f8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = 0.0f;
        }
        if ((i7 & 2) != 0) {
            f8 = 0.0f;
        }
        return f(f7, f8);
    }

    @n6.d
    public static final float[] h(@n6.d Matrix matrix) {
        u4.l0.p(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
