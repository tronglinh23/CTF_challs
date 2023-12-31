package com.google.android.material.elevation;

import android.content.Context;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import d.l;
import d.o0;
import d.q;
import d.r;

/* loaded from: classes.dex */
public enum SurfaceColors {
    SURFACE_0(R.dimen.m3_sys_elevation_level0),
    SURFACE_1(R.dimen.m3_sys_elevation_level1),
    SURFACE_2(R.dimen.m3_sys_elevation_level2),
    SURFACE_3(R.dimen.m3_sys_elevation_level3),
    SURFACE_4(R.dimen.m3_sys_elevation_level4),
    SURFACE_5(R.dimen.m3_sys_elevation_level5);
    
    private final int elevationResId;

    SurfaceColors(@q int i7) {
        this.elevationResId = i7;
    }

    @l
    public static int getColorForElevation(@o0 Context context, @r float f7) {
        return new ElevationOverlayProvider(context).compositeOverlay(MaterialColors.getColor(context, R.attr.colorSurface, 0), f7);
    }

    @l
    public int getColor(@o0 Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}