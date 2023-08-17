package com.google.android.material.theme.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R;
import d.f;
import d.g1;
import d.o0;
import d.q0;
import j.d;

/* loaded from: classes.dex */
public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = {16842752, R.attr.theme};
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = {R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    @g1
    private static int obtainAndroidThemeOverlayId(@o0 Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_THEME_OVERLAY_ATTRS);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @g1
    private static int obtainMaterialThemeOverlayId(@o0 Context context, @q0 AttributeSet attributeSet, @f int i7, @g1 int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MATERIAL_THEME_OVERLAY_ATTR, i7, i8);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @o0
    public static Context wrap(@o0 Context context, @q0 AttributeSet attributeSet, @f int i7, @g1 int i8) {
        int obtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i7, i8);
        boolean z6 = (context instanceof d) && ((d) context).c() == obtainMaterialThemeOverlayId;
        if (obtainMaterialThemeOverlayId == 0 || z6) {
            return context;
        }
        d dVar = new d(context, obtainMaterialThemeOverlayId);
        int obtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
        if (obtainAndroidThemeOverlayId != 0) {
            dVar.getTheme().applyStyle(obtainAndroidThemeOverlayId, true);
        }
        return dVar;
    }
}