package androidx.transition;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f5657a = "ViewGroupUtilsApi14";

    /* renamed from: b  reason: collision with root package name */
    public static final int f5658b = 4;

    /* renamed from: c  reason: collision with root package name */
    public static LayoutTransition f5659c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f5660d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f5661e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f5662f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f5663g;

    /* loaded from: classes.dex */
    public class a extends LayoutTransition {
        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(LayoutTransition layoutTransition) {
        if (!f5663g) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f5662f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i(f5657a, "Failed to access cancel method by reflection");
            }
            f5663g = true;
        }
        Method method = f5662f;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i(f5657a, "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i(f5657a, "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(@d.o0 android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = androidx.transition.a1.f5659c
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L28
            androidx.transition.a1$a r0 = new androidx.transition.a1$a
            r0.<init>()
            androidx.transition.a1.f5659c = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = androidx.transition.a1.f5659c
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = androidx.transition.a1.f5659c
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = androidx.transition.a1.f5659c
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = androidx.transition.a1.f5659c
            r4 = 4
            r0.setAnimator(r4, r3)
        L28:
            if (r6 == 0) goto L48
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L42
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L39
            a(r6)
        L39:
            android.animation.LayoutTransition r0 = androidx.transition.a1.f5659c
            if (r6 == r0) goto L42
            int r0 = androidx.transition.d0.g.S1
            r5.setTag(r0, r6)
        L42:
            android.animation.LayoutTransition r6 = androidx.transition.a1.f5659c
            r5.setLayoutTransition(r6)
            goto L96
        L48:
            r5.setLayoutTransition(r3)
            boolean r6 = androidx.transition.a1.f5661e
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L66
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L5f
            androidx.transition.a1.f5660d = r6     // Catch: java.lang.NoSuchFieldException -> L5f
            r6.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L5f
            goto L64
        L5f:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L64:
            androidx.transition.a1.f5661e = r1
        L66:
            java.lang.reflect.Field r6 = androidx.transition.a1.f5660d
            if (r6 == 0) goto L7f
            boolean r6 = r6.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L7a
            if (r6 == 0) goto L78
            java.lang.reflect.Field r1 = androidx.transition.a1.f5660d     // Catch: java.lang.IllegalAccessException -> L76
            r1.setBoolean(r5, r2)     // Catch: java.lang.IllegalAccessException -> L76
            goto L78
        L76:
            r2 = r6
            goto L7a
        L78:
            r2 = r6
            goto L7f
        L7a:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L7f:
            if (r2 == 0) goto L84
            r5.requestLayout()
        L84:
            int r6 = androidx.transition.d0.g.S1
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto L96
            int r0 = androidx.transition.d0.g.S1
            r5.setTag(r0, r3)
            r5.setLayoutTransition(r6)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.a1.b(android.view.ViewGroup, boolean):void");
    }
}
