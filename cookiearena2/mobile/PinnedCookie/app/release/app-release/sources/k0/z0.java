package k0;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import j0.b;
/* loaded from: classes.dex */
public abstract class z0 extends Service {
    @SuppressLint({"ActionValue"})

    /* renamed from: c  reason: collision with root package name */
    public static final String f11528c = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* renamed from: b  reason: collision with root package name */
    public b.AbstractBinderC0133b f11529b = new a();

    /* loaded from: classes.dex */
    public class a extends b.AbstractBinderC0133b {
        public a() {
        }

        @Override // j0.b
        public void b(@d.q0 j0.a aVar) throws RemoteException {
            if (aVar == null) {
                return;
            }
            z0.this.a(new y0(aVar));
        }
    }

    public abstract void a(@d.o0 y0 y0Var);

    @Override // android.app.Service
    @d.q0
    public IBinder onBind(@d.q0 Intent intent) {
        return this.f11529b;
    }
}
