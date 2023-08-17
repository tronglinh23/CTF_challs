package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import d.b1;
import d.o0;
import d.q0;

@b1({b1.a.f8134l})
/* loaded from: classes.dex */
public class CanvasCompat {

    /* loaded from: classes.dex */
    public interface CanvasOperation {
        void run(@o0 Canvas canvas);
    }

    private CanvasCompat() {
    }

    public static int saveLayerAlpha(@o0 Canvas canvas, @q0 RectF rectF, int i7) {
        return canvas.saveLayerAlpha(rectF, i7);
    }

    public static int saveLayerAlpha(@o0 Canvas canvas, float f7, float f8, float f9, float f10, int i7) {
        return canvas.saveLayerAlpha(f7, f8, f9, f10, i7);
    }
}