package k0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import d.l1;
import j0.a;
import j0.b;

/* loaded from: classes.dex */
public class a1 implements ServiceConnection {
    @d.o0

    /* renamed from: b  reason: collision with root package name */
    public p.e<Integer> f11432b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f11433c;
    @d.q0
    @l1

    /* renamed from: a  reason: collision with root package name */
    public j0.b f11431a = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11434d = false;

    /* loaded from: classes.dex */
    public class a extends a.b {
        public a() {
        }

        @Override // j0.a
        public void a(boolean z6, boolean z7) throws RemoteException {
            if (!z6) {
                a1.this.f11432b.p(0);
                Log.e(u0.f11515a, "Unable to retrieve the permission revocation setting from the backport");
            } else if (z7) {
                a1.this.f11432b.p(3);
            } else {
                a1.this.f11432b.p(2);
            }
        }
    }

    public a1(@d.o0 Context context) {
        this.f11433c = context;
    }

    public void a(@d.o0 p.e<Integer> eVar) {
        if (this.f11434d) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.f11434d = true;
        this.f11432b = eVar;
        this.f11433c.bindService(new Intent(z0.f11528c).setPackage(u0.b(this.f11433c.getPackageManager())), this, 1);
    }

    public void b() {
        if (!this.f11434d) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.f11434d = false;
        this.f11433c.unbindService(this);
    }

    public final j0.a c() {
        return new a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j0.b c7 = b.AbstractBinderC0133b.c(iBinder);
        this.f11431a = c7;
        try {
            c7.b(c());
        } catch (RemoteException unused) {
            this.f11432b.p(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f11431a = null;
    }
}