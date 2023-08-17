package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import d.o0;
import d.w0;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public static final String f908a = "ResourcesFlusher";

    /* renamed from: b  reason: collision with root package name */
    public static Field f909b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f910c;

    /* renamed from: d  reason: collision with root package name */
    public static Class<?> f911d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f912e;

    /* renamed from: f  reason: collision with root package name */
    public static Field f913f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f914g;

    /* renamed from: h  reason: collision with root package name */
    public static Field f915h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f916i;

    @w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void a(@o0 Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        d(resources);
    }

    @w0(21)
    public static void b(@o0 Resources resources) {
        Map map;
        if (!f910c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f909b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                Log.e(f908a, "Could not retrieve Resources#mDrawableCache field", e7);
            }
            f910c = true;
        }
        Field field = f909b;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e8) {
                Log.e(f908a, "Could not retrieve value from Resources#mDrawableCache", e8);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    @d.w0(23)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(@d.o0 android.content.res.Resources r4) {
        /*
            boolean r0 = androidx.appcompat.app.x.f910c
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            androidx.appcompat.app.x.f909b = r2     // Catch: java.lang.NoSuchFieldException -> L15
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1b:
            androidx.appcompat.app.x.f910c = r0
        L1d:
            java.lang.reflect.Field r0 = androidx.appcompat.app.x.f909b
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L26
            goto L2d
        L26:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
        L2c:
            r4 = 0
        L2d:
            if (r4 != 0) goto L30
            return
        L30:
            e(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.x.c(android.content.res.Resources):void");
    }

    @w0(24)
    public static void d(@o0 Resources resources) {
        Object obj;
        if (!f916i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f915h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                Log.e(f908a, "Could not retrieve Resources#mResourcesImpl field", e7);
            }
            f916i = true;
        }
        Field field = f915h;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e8) {
            Log.e(f908a, "Could not retrieve value from Resources#mResourcesImpl", e8);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f910c) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f909b = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                Log.e(f908a, "Could not retrieve ResourcesImpl#mDrawableCache field", e9);
            }
            f910c = true;
        }
        Field field2 = f909b;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e10) {
                Log.e(f908a, "Could not retrieve value from ResourcesImpl#mDrawableCache", e10);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    @w0(16)
    public static void e(@o0 Object obj) {
        LongSparseArray longSparseArray;
        if (!f912e) {
            try {
                f911d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                Log.e(f908a, "Could not find ThemedResourceCache class", e7);
            }
            f912e = true;
        }
        Class<?> cls = f911d;
        if (cls == null) {
            return;
        }
        if (!f914g) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f913f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e(f908a, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e8);
            }
            f914g = true;
        }
        Field field = f913f;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e9) {
            Log.e(f908a, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e9);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}