package com.google.android.material.color;

import android.content.Context;
import android.os.Build;
import d.b1;
import d.o0;
import d.q0;
import java.util.Map;

@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface ColorResourcesOverride {
    @q0
    static ColorResourcesOverride getInstance() {
        int i7 = Build.VERSION.SDK_INT;
        if ((30 > i7 || i7 > 33) && !z0.a.l()) {
            return null;
        }
        return ResourcesLoaderColorResourcesOverride.getInstance();
    }

    boolean applyIfPossible(@o0 Context context, @o0 Map<Integer, Integer> map);

    @o0
    Context wrapContextIfPossible(@o0 Context context, @o0 Map<Integer, Integer> map);
}