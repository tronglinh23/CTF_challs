package a1;

import android.os.Handler;
import android.os.Looper;
import d.o0;

/* loaded from: classes.dex */
public class b {
    @o0
    public static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}