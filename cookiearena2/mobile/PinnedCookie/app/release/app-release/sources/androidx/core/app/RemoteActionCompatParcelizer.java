package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import d.b1;
import m3.e;
@b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(e eVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3488a = (IconCompat) eVar.h0(remoteActionCompat.f3488a, 1);
        remoteActionCompat.f3489b = eVar.w(remoteActionCompat.f3489b, 2);
        remoteActionCompat.f3490c = eVar.w(remoteActionCompat.f3490c, 3);
        remoteActionCompat.f3491d = (PendingIntent) eVar.W(remoteActionCompat.f3491d, 4);
        remoteActionCompat.f3492e = eVar.m(remoteActionCompat.f3492e, 5);
        remoteActionCompat.f3493f = eVar.m(remoteActionCompat.f3493f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, e eVar) {
        eVar.j0(false, false);
        eVar.m1(remoteActionCompat.f3488a, 1);
        eVar.z0(remoteActionCompat.f3489b, 2);
        eVar.z0(remoteActionCompat.f3490c, 3);
        eVar.X0(remoteActionCompat.f3491d, 4);
        eVar.n0(remoteActionCompat.f3492e, 5);
        eVar.n0(remoteActionCompat.f3493f, 6);
    }
}
