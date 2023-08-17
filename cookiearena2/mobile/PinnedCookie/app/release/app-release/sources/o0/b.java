package o0;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import d.o0;
import d.u;
import d.w0;
/* loaded from: classes.dex */
public final class b {

    @w0(28)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static void a(SQLiteCursor sQLiteCursor, boolean z6) {
            sQLiteCursor.setFillWindowForwardOnly(z6);
        }
    }

    public static void a(@o0 SQLiteCursor sQLiteCursor, boolean z6) {
        if (Build.VERSION.SDK_INT >= 28) {
            a.a(sQLiteCursor, z6);
        }
    }
}
