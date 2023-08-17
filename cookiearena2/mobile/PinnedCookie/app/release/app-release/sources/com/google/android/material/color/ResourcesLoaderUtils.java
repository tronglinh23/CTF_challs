package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import d.w0;
import java.util.Map;
@w0(api = 30)
/* loaded from: classes.dex */
final class ResourcesLoaderUtils {
    private ResourcesLoaderUtils() {
    }

    public static boolean addResourcesLoaderToContext(Context context, Map<Integer, Integer> map) {
        ResourcesLoader create = ColorResourcesLoaderCreator.create(context, map);
        if (create != null) {
            context.getResources().addLoaders(create);
            return true;
        }
        return false;
    }

    public static boolean isColorResource(int i7) {
        return 28 <= i7 && i7 <= 31;
    }
}
