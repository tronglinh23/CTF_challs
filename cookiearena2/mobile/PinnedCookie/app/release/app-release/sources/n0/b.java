package n0;

import android.database.CursorWindow;
import android.os.Build;
import d.o0;
import d.q0;
import d.u;
import d.w0;
/* loaded from: classes.dex */
public final class b {

    @w0(15)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static CursorWindow a(String str) {
            return new CursorWindow(str);
        }
    }

    @w0(28)
    /* renamed from: n0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0185b {
        @u
        public static CursorWindow a(String str, long j7) {
            d.a();
            return c.a(str, j7);
        }
    }

    @o0
    public static CursorWindow a(@q0 String str, long j7) {
        return Build.VERSION.SDK_INT >= 28 ? C0185b.a(str, j7) : a.a(str);
    }
}
