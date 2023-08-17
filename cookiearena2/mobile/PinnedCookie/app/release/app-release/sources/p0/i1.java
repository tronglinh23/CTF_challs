package p0;

import android.graphics.Matrix;
import android.graphics.Shader;
/* loaded from: classes.dex */
public final class i1 {
    public static final void a(@n6.d Shader shader, @n6.d t4.l<? super Matrix, v3.m2> lVar) {
        u4.l0.p(shader, "<this>");
        u4.l0.p(lVar, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.O(matrix);
        shader.setLocalMatrix(matrix);
    }
}
