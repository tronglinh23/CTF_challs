package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import d.b1;
import d.o0;

@b1({b1.a.f8134l})
/* loaded from: classes.dex */
public class RectEvaluator implements TypeEvaluator<Rect> {
    private final Rect rect;

    public RectEvaluator(@o0 Rect rect) {
        this.rect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f7, @o0 Rect rect, @o0 Rect rect2) {
        this.rect.set(rect.left + ((int) ((rect2.left - r0) * f7)), rect.top + ((int) ((rect2.top - r1) * f7)), rect.right + ((int) ((rect2.right - r2) * f7)), rect.bottom + ((int) ((rect2.bottom - r6) * f7)));
        return this.rect;
    }
}