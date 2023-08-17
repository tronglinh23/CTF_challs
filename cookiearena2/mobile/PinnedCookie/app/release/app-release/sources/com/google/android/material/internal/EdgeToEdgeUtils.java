package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.d3;
import androidx.core.view.u1;
import com.google.android.material.color.MaterialColors;
import d.b1;
import d.l;
import d.o0;
import d.q0;
import p0.p0;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(@o0 Window window, boolean z6) {
        applyEdgeToEdge(window, z6, null, null);
    }

    @TargetApi(21)
    private static int getNavigationBarColor(Context context, boolean z6) {
        if (!z6 || Build.VERSION.SDK_INT >= 27) {
            if (z6) {
                return 0;
            }
            return MaterialColors.getColor(context, 16843858, (int) u1.f3816t);
        }
        return p0.B(MaterialColors.getColor(context, 16843858, (int) u1.f3816t), 128);
    }

    @TargetApi(21)
    private static int getStatusBarColor(Context context, boolean z6) {
        if (z6) {
            return 0;
        }
        return MaterialColors.getColor(context, 16843857, (int) u1.f3816t);
    }

    private static boolean isUsingLightSystemBar(int i7, boolean z6) {
        return MaterialColors.isColorLight(i7) || (i7 == 0 && z6);
    }

    public static void setLightNavigationBar(@o0 Window window, boolean z6) {
        d3.a(window, window.getDecorView()).h(z6);
    }

    public static void setLightStatusBar(@o0 Window window, boolean z6) {
        d3.a(window, window.getDecorView()).i(z6);
    }

    public static void applyEdgeToEdge(@o0 Window window, boolean z6, @q0 @l Integer num, @q0 @l Integer num2) {
        boolean z7 = num == null || num.intValue() == 0;
        boolean z8 = num2 == null || num2.intValue() == 0;
        if (z7 || z8) {
            int color = MaterialColors.getColor(window.getContext(), 16842801, (int) u1.f3816t);
            if (z7) {
                num = Integer.valueOf(color);
            }
            if (z8) {
                num2 = Integer.valueOf(color);
            }
        }
        d3.c(window, !z6);
        int statusBarColor = getStatusBarColor(window.getContext(), z6);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z6);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }
}
