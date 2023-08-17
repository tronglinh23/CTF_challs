package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import d.o0;
import d.w0;
/* loaded from: classes.dex */
public final class r extends Service {

    @w0(24)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static int a() {
            return 512;
        }
    }

    @o0
    public static ServiceInfo a(@o0 Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, r.class), a.a() | 128);
    }

    @Override // android.app.Service
    @o0
    public IBinder onBind(@o0 Intent intent) {
        throw new UnsupportedOperationException();
    }
}
