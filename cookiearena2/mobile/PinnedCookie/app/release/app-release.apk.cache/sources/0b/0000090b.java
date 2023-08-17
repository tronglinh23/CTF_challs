package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.R;
import d.o0;

/* loaded from: classes.dex */
public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> CHILDREN_ALPHA = new ChildrenAlphaProperty("childrenAlpha");

    private ChildrenAlphaProperty(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @o0
    public Float get(@o0 ViewGroup viewGroup) {
        Float f7 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f7 != null ? f7 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(@o0 ViewGroup viewGroup, @o0 Float f7) {
        float floatValue = f7.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            viewGroup.getChildAt(i7).setAlpha(floatValue);
        }
    }
}