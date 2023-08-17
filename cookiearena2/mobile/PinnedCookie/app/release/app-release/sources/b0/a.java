package b0;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7136a = "CustomSupport";

    /* renamed from: b0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0075a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7137a;

        static {
            int[] iArr = new int[a.b.values().length];
            f7137a = iArr;
            try {
                iArr[a.b.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7137a[a.b.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7137a[a.b.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7137a[a.b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7137a[a.b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7137a[a.b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7137a[a.b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static int a(int c7) {
        int i7 = (c7 & (~(c7 >> 31))) - 255;
        return (i7 & (i7 >> 31)) + 255;
    }

    public static void b(androidx.constraintlayout.widget.a att, View view, float[] value) {
        Class<?> cls = view.getClass();
        String str = "set" + att.h();
        try {
            boolean z6 = true;
            switch (C0075a.f7137a[att.j().ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) value[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(value[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int a7 = (a((int) (((float) Math.pow(value[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (value[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(value[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(value[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(a7);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(value[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (value[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(value[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(value[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + att.h());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (value[0] <= 0.5f) {
                        z6 = false;
                    }
                    objArr[0] = Boolean.valueOf(z6);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(value[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e7) {
            Log.e(f7136a, "cannot access method " + str + " on View \"" + c0.c.k(view) + "\"");
            e7.printStackTrace();
        } catch (NoSuchMethodException e8) {
            Log.e(f7136a, "no method " + str + " on View \"" + c0.c.k(view) + "\"");
            e8.printStackTrace();
        } catch (InvocationTargetException e9) {
            e9.printStackTrace();
        }
    }
}
