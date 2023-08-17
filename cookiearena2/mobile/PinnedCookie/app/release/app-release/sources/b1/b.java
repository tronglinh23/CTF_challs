package b1;

import android.os.Build;
import android.telephony.SubscriptionManager;
import d.u;
import d.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@w0(22)
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static Method f7162a;

    @w0(29)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static int a(int i7) {
            int slotIndex;
            slotIndex = SubscriptionManager.getSlotIndex(i7);
            return slotIndex;
        }
    }

    public static int a(int i7) {
        if (i7 == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a(i7);
        }
        try {
            if (f7162a == null) {
                Method declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                f7162a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f7162a.invoke(null, Integer.valueOf(i7));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
