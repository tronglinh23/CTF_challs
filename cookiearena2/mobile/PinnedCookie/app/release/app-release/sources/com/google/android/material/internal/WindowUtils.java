package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import d.b1;
import d.o0;
import d.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class WindowUtils {
    private static final String TAG = "WindowUtils";

    /* loaded from: classes.dex */
    public static class Api14Impl {
        private Api14Impl() {
        }

        @o0
        public static Rect getCurrentWindowBounds(@o0 WindowManager windowManager) {
            int i7;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point realSizeForDisplay = getRealSizeForDisplay(defaultDisplay);
            Rect rect = new Rect();
            int i8 = realSizeForDisplay.x;
            if (i8 == 0 || (i7 = realSizeForDisplay.y) == 0) {
                defaultDisplay.getRectSize(rect);
            } else {
                rect.right = i8;
                rect.bottom = i7;
            }
            return rect;
        }

        private static Point getRealSizeForDisplay(Display display) {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
            } catch (IllegalAccessException e7) {
                Log.w(WindowUtils.TAG, e7);
            } catch (NoSuchMethodException e8) {
                Log.w(WindowUtils.TAG, e8);
            } catch (InvocationTargetException e9) {
                Log.w(WindowUtils.TAG, e9);
            }
            return point;
        }
    }

    @w0(api = 17)
    /* loaded from: classes.dex */
    public static class Api17Impl {
        private Api17Impl() {
        }

        @o0
        public static Rect getCurrentWindowBounds(@o0 WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    @w0(api = 30)
    /* loaded from: classes.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        @o0
        public static Rect getCurrentWindowBounds(@o0 WindowManager windowManager) {
            WindowMetrics currentWindowMetrics;
            Rect bounds;
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds;
        }
    }

    private WindowUtils() {
    }

    @o0
    public static Rect getCurrentWindowBounds(@o0 Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.getCurrentWindowBounds(windowManager) : Api17Impl.getCurrentWindowBounds(windowManager);
    }
}
