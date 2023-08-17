package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import d.g1;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
final class ThemeUtils {
    private ThemeUtils() {
    }

    public static void applyThemeOverlay(@o0 Context context, @g1 int i7) {
        Resources.Theme windowDecorViewTheme;
        context.getTheme().applyStyle(i7, true);
        if (!(context instanceof Activity) || (windowDecorViewTheme = getWindowDecorViewTheme((Activity) context)) == null) {
            return;
        }
        windowDecorViewTheme.applyStyle(i7, true);
    }

    @q0
    private static Resources.Theme getWindowDecorViewTheme(@o0 Activity activity) {
        View peekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (peekDecorView = window.peekDecorView()) == null || (context = peekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}
