package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import d.k;
import d.l;
import d.o0;
import d.q0;
import d.w0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class HarmonizedColors {
    private static final String TAG = "HarmonizedColors";

    private HarmonizedColors() {
    }

    @w0(api = 30)
    private static void addHarmonizedColorAttributesToReplacementMap(@o0 Map<Integer, Integer> map, @o0 TypedArray typedArray, @q0 TypedArray typedArray2, @l int i7) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i8 = 0; i8 < typedArray.getIndexCount(); i8++) {
            int resourceId = typedArray2.getResourceId(i8, 0);
            if (resourceId != 0 && typedArray.hasValue(i8) && ResourcesLoaderUtils.isColorResource(typedArray.getType(i8))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(MaterialColors.harmonize(typedArray.getColor(i8, 0), i7)));
            }
        }
    }

    @o0
    public static void applyToContextIfAvailable(@o0 Context context, @o0 HarmonizedColorsOptions harmonizedColorsOptions) {
        if (isHarmonizedColorAvailable()) {
            Map<Integer, Integer> createHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
            int themeOverlayResourceId = harmonizedColorsOptions.getThemeOverlayResourceId(0);
            if (!ResourcesLoaderUtils.addResourcesLoaderToContext(context, createHarmonizedColorReplacementMap) || themeOverlayResourceId == 0) {
                return;
            }
            ThemeUtils.applyThemeOverlay(context, themeOverlayResourceId);
        }
    }

    @w0(api = 30)
    private static Map<Integer, Integer> createHarmonizedColorReplacementMap(Context context, HarmonizedColorsOptions harmonizedColorsOptions) {
        HashMap hashMap = new HashMap();
        int color = MaterialColors.getColor(context, harmonizedColorsOptions.getColorAttributeToHarmonizeWith(), TAG);
        for (int i7 : harmonizedColorsOptions.getColorResourceIds()) {
            hashMap.put(Integer.valueOf(i7), Integer.valueOf(MaterialColors.harmonize(k0.d.f(context, i7), color)));
        }
        HarmonizedColorAttributes colorAttributes = harmonizedColorsOptions.getColorAttributes();
        if (colorAttributes != null) {
            int[] attributes = colorAttributes.getAttributes();
            if (attributes.length > 0) {
                int themeOverlay = colorAttributes.getThemeOverlay();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributes);
                TypedArray obtainStyledAttributes2 = themeOverlay != 0 ? new ContextThemeWrapper(context, themeOverlay).obtainStyledAttributes(attributes) : null;
                addHarmonizedColorAttributesToReplacementMap(hashMap, obtainStyledAttributes, obtainStyledAttributes2, color);
                obtainStyledAttributes.recycle();
                if (obtainStyledAttributes2 != null) {
                    obtainStyledAttributes2.recycle();
                }
            }
        }
        return hashMap;
    }

    @k(api = 30)
    public static boolean isHarmonizedColorAvailable() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @o0
    public static Context wrapContextIfAvailable(@o0 Context context, @o0 HarmonizedColorsOptions harmonizedColorsOptions) {
        if (isHarmonizedColorAvailable()) {
            Map<Integer, Integer> createHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, harmonizedColorsOptions.getThemeOverlayResourceId(R.style.ThemeOverlay_Material3_HarmonizedColors_Empty));
            contextThemeWrapper.applyOverrideConfiguration(new Configuration());
            return ResourcesLoaderUtils.addResourcesLoaderToContext(contextThemeWrapper, createHarmonizedColorReplacementMap) ? contextThemeWrapper : context;
        }
        return context;
    }
}