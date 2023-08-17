package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import d.o0;
import d.q0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class DrawableAlphaProperty extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> DRAWABLE_ALPHA_COMPAT = new DrawableAlphaProperty();
    private final WeakHashMap<Drawable, Integer> alphaCache;

    private DrawableAlphaProperty() {
        super(Integer.class, "drawableAlphaCompat");
        this.alphaCache = new WeakHashMap<>();
    }

    @Override // android.util.Property
    @q0
    public Integer get(@o0 Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public void set(@o0 Drawable drawable, @o0 Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
