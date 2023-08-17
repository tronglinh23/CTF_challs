package i0;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;
/* loaded from: classes.dex */
public abstract class p2 extends Service {

    /* loaded from: classes.dex */
    public class a extends INotificationSideChannel.Stub {
        public a() {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(String str, int i7, String str2) throws RemoteException {
            p2.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                p2.this.a(str, i7, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(String str) {
            p2.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                p2.this.b(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(String str, int i7, String str2, Notification notification) throws RemoteException {
            p2.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                p2.this.d(str, i7, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public abstract void a(String str, int i7, String str2);

    public abstract void b(String str);

    public void c(int i7, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i7)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i7 + " is not authorized for package " + str);
    }

    public abstract void d(String str, int i7, String str2, Notification notification);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getAction().equals(q2.f10799g);
        return null;
    }
}
