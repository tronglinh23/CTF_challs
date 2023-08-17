package p0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
/* loaded from: classes.dex */
public final class n0 {
    public static final void a(@n6.d Canvas canvas, float f7, float f8, float f9, float f10, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(canvas, "<this>");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(f7, f8, f9, f10);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static final void b(@n6.d Canvas canvas, int i7, int i8, int i9, int i10, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(canvas, "<this>");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(i7, i8, i9, i10);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static final void c(@n6.d Canvas canvas, @n6.d Path path, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(canvas, "<this>");
        u4.l0.p(path, "clipPath");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static final void d(@n6.d Canvas canvas, @n6.d Rect rect, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(canvas, "<this>");
        u4.l0.p(rect, "clipRect");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static final void e(@n6.d Canvas canvas, @n6.d RectF rectF, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(canvas, "<this>");
        u4.l0.p(rectF, "clipRect");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static final void f(@n6.d Canvas canvas, @n6.d Matrix matrix, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(canvas, "<this>");
        u4.l0.p(matrix, "matrix");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static /* synthetic */ void g(Canvas canvas, Matrix matrix, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            matrix = new Matrix();
        }
        u4.l0.p(canvas, "<this>");
        u4.l0.p(matrix, "matrix");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static final void h(@n6.d Canvas canvas, float f7, float f8, float f9, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(canvas, "<this>");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.rotate(f7, f8, f9);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static /* synthetic */ void i(Canvas canvas, float f7, float f8, float f9, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = 0.0f;
        }
        if ((i7 & 2) != 0) {
            f8 = 0.0f;
        }
        if ((i7 & 4) != 0) {
            f9 = 0.0f;
        }
        u4.l0.p(canvas, "<this>");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.rotate(f7, f8, f9);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static final void j(@n6.d Canvas canvas, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(canvas, "<this>");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static final void k(@n6.d Canvas canvas, float f7, float f8, float f9, float f10, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(canvas, "<this>");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.scale(f7, f8, f9, f10);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static /* synthetic */ void l(Canvas canvas, float f7, float f8, float f9, float f10, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = 1.0f;
        }
        if ((i7 & 2) != 0) {
            f8 = 1.0f;
        }
        if ((i7 & 4) != 0) {
            f9 = 0.0f;
        }
        if ((i7 & 8) != 0) {
            f10 = 0.0f;
        }
        u4.l0.p(canvas, "<this>");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.scale(f7, f8, f9, f10);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static final void m(@n6.d Canvas canvas, float f7, float f8, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(canvas, "<this>");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.skew(f7, f8);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static /* synthetic */ void n(Canvas canvas, float f7, float f8, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = 0.0f;
        }
        if ((i7 & 2) != 0) {
            f8 = 0.0f;
        }
        u4.l0.p(canvas, "<this>");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.skew(f7, f8);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static final void o(@n6.d Canvas canvas, float f7, float f8, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(canvas, "<this>");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.translate(f7, f8);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }

    public static /* synthetic */ void p(Canvas canvas, float f7, float f8, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = 0.0f;
        }
        if ((i7 & 2) != 0) {
            f8 = 0.0f;
        }
        u4.l0.p(canvas, "<this>");
        u4.l0.p(lVar, "block");
        int save = canvas.save();
        canvas.translate(f7, f8);
        try {
            lVar.O(canvas);
        } finally {
            u4.i0.d(1);
            canvas.restoreToCount(save);
            u4.i0.c(1);
        }
    }
}
