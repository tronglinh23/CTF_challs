package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import d.l1;
import d.w0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u4.l0;
/* loaded from: classes.dex */
public final class b0 implements y {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final b0 f7050b = new b0();
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final String f7051c;

    static {
        String simpleName = b0.class.getSimpleName();
        l0.o(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f7051c = simpleName;
    }

    @Override // androidx.window.layout.y
    @n6.d
    public x c(@n6.d Activity activity) {
        Rect rect;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        if (Build.VERSION.SDK_INT >= 30) {
            rect = d.f7052a.b(activity);
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            l0.o(defaultDisplay, "display");
            Point l7 = l(defaultDisplay);
            rect = new Rect(0, 0, l7.x, l7.y);
        }
        return new x(rect);
    }

    @Override // androidx.window.layout.y
    @n6.d
    public x e(@n6.d Activity activity) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        int i7 = Build.VERSION.SDK_INT;
        return new x(i7 >= 30 ? d.f7052a.a(activity) : i7 >= 29 ? i(activity) : i7 >= 28 ? h(activity) : g(activity));
    }

    @n6.d
    @w0(14)
    public final Rect f(@n6.d Activity activity) {
        int i7;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        l0.o(defaultDisplay, "defaultDisplay");
        Point l7 = l(defaultDisplay);
        Rect rect = new Rect();
        int i8 = l7.x;
        if (i8 == 0 || (i7 = l7.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i8;
            rect.bottom = i7;
        }
        return rect;
    }

    @n6.d
    @w0(24)
    public final Rect g(@n6.d Activity activity) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!a.f7049a.a(activity)) {
            l0.o(defaultDisplay, "defaultDisplay");
            Point l7 = l(defaultDisplay);
            int k7 = k(activity);
            int i7 = rect.bottom;
            if (i7 + k7 == l7.y) {
                rect.bottom = i7 + k7;
            } else {
                int i8 = rect.right;
                if (i8 + k7 == l7.x) {
                    rect.right = i8 + k7;
                }
            }
        }
        return rect;
    }

    @n6.d
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @w0(28)
    public final Rect h(@n6.d Activity activity) {
        DisplayCutout j7;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (a.f7049a.a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e7) {
            Log.w(f7051c, e7);
            m(activity, rect);
        } catch (NoSuchFieldException e8) {
            Log.w(f7051c, e8);
            m(activity, rect);
        } catch (NoSuchMethodException e9) {
            Log.w(f7051c, e9);
            m(activity, rect);
        } catch (InvocationTargetException e10) {
            Log.w(f7051c, e10);
            m(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        e eVar = e.f7053a;
        l0.o(defaultDisplay, "currentDisplay");
        eVar.a(defaultDisplay, point);
        a aVar = a.f7049a;
        if (!aVar.a(activity)) {
            int k7 = k(activity);
            int i7 = rect.bottom;
            if (i7 + k7 == point.y) {
                rect.bottom = i7 + k7;
            } else {
                int i8 = rect.right;
                if (i8 + k7 == point.x) {
                    rect.right = i8 + k7;
                } else if (rect.left == k7) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity) && (j7 = j(defaultDisplay)) != null) {
            int i9 = rect.left;
            f fVar = f.f7054a;
            if (i9 == fVar.b(j7)) {
                rect.left = 0;
            }
            if (point.x - rect.right == fVar.c(j7)) {
                rect.right += fVar.c(j7);
            }
            if (rect.top == fVar.d(j7)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == fVar.a(j7)) {
                rect.bottom += fVar.a(j7);
            }
        }
        return rect;
    }

    @n6.d
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @w0(29)
    public final Rect i(@n6.d Activity activity) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e7) {
            Log.w(f7051c, e7);
            return h(activity);
        } catch (NoSuchFieldException e8) {
            Log.w(f7051c, e8);
            return h(activity);
        } catch (NoSuchMethodException e9) {
            Log.w(f7051c, e9);
            return h(activity);
        } catch (InvocationTargetException e10) {
            Log.w(f7051c, e10);
            return h(activity);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    @w0(28)
    public final DisplayCutout j(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (z.a(obj)) {
                return a0.a(obj);
            }
        } catch (ClassNotFoundException e7) {
            Log.w(f7051c, e7);
        } catch (IllegalAccessException e8) {
            Log.w(f7051c, e8);
        } catch (InstantiationException e9) {
            Log.w(f7051c, e9);
        } catch (NoSuchFieldException e10) {
            Log.w(f7051c, e10);
        } catch (NoSuchMethodException e11) {
            Log.w(f7051c, e11);
        } catch (InvocationTargetException e12) {
            Log.w(f7051c, e12);
        }
        return null;
    }

    public final int k(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @n6.d
    @l1
    @w0(14)
    public final Point l(@n6.d Display display) {
        l0.p(display, "display");
        Point point = new Point();
        e.f7053a.a(display, point);
        return point;
    }

    public final void m(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
