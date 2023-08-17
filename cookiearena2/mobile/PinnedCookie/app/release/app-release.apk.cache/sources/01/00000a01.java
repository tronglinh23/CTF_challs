package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import d.o0;
import d.w0;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@w0(api = 30)
/* loaded from: classes.dex */
public class ResourcesLoaderColorResourcesOverride implements ColorResourcesOverride {

    /* loaded from: classes.dex */
    public static class ResourcesLoaderColorResourcesOverrideSingleton {
        private static final ResourcesLoaderColorResourcesOverride INSTANCE = new ResourcesLoaderColorResourcesOverride();

        private ResourcesLoaderColorResourcesOverrideSingleton() {
        }
    }

    public static ColorResourcesOverride getInstance() {
        return ResourcesLoaderColorResourcesOverrideSingleton.INSTANCE;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(Context context, Map<Integer, Integer> map) {
        if (ResourcesLoaderUtils.addResourcesLoaderToContext(context, map)) {
            ThemeUtils.applyThemeOverlay(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    @o0
    public Context wrapContextIfPossible(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return ResourcesLoaderUtils.addResourcesLoaderToContext(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    private ResourcesLoaderColorResourcesOverride() {
    }
}