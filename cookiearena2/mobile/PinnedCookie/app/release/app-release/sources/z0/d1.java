package z0;

import android.content.Context;
import android.os.UserManager;
/* loaded from: classes.dex */
public class d1 {

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(@d.o0 Context context) {
        return a.a(context);
    }
}
